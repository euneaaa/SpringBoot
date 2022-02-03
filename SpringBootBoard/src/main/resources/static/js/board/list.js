
 (function(){
        'use strict'
     const recordCount = 10;//레코드 수
     let maxPage = 1;
     let currentPage = 1;

        const boardListElem = document.querySelector('#board_list');
        const dataElem = document.querySelector('#data');
        const pageContainerElem = document.querySelector('#page_container');
        const searchParams = new URL(window.location.href).searchParams;
        const icategory = searchParams.get('icategory');

        //글 리스트 정보 가져오기
        const getList = () => {
            myFetch.get(`/ajax/board/${icategory}`, list => {
                console.log(list);
                makeRecodeList(list);
            }, {currentPage, recordCount});
        }

        //마지막 페이지 값
        const getMaxPageVal = () =>{
            myFetch.get(`/ajax/board/maxpage`, data =>{
                console.log(data.result);
                maxPage = data.result;
                makePaging();
            }, {
                // 'icategory': 0,
                // 'recordCount' : 0
                icategory, recordCount
            });
        }
        getMaxPageVal();

        const makePaging = () => {
            const ulElem = pageContainerElem.querySelector('nav >ul');

            for(let i=1; i<maxPage; i++){
                const liElem = document.createElement('li');
                liElem.className = 'page-item page-link pointer';
                liElem.innerText = i;
                ulElem.appendChild(liElem);

                liElem.addEventListener('click', e=>{
                    currentPage = i;
                    getList();
                });


            }
        }

    const makeRecodeList = list => {
        const tbodyElem = boardListElem.querySelector('table tbody');
        tbodyElem.innerHTML = null;

        list.forEach(item => {
            const trElem = document.createElement('tr');
            tbodyElem.appendChild(trElem);

            // 리터럴 템플릿
            trElem.innerHTML = `
                <td>${item.iboard}</td>
                <td>${item.title}</td>
                <td>${item.username}</td>
                <td>${item.hits}</td>
                <td>${item.rdt}</td>
            `;
        });
    }
    getList();

})();