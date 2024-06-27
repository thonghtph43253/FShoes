// function loadPage(page){
//     fetch('thuoctinhsanpham/' + page + '.html')
//         .then(response => response.text())
//         .then(html => {
//             document.querySelector('.content-wrapper').innerHTML = html;
//         })
//         .catch(error => {
//             console.log(error);
//         });
// }
// $(document).ready(function() {
//     $('#pageChatLieuVai').click(function(e) {
//         e.preventDefault();
//         loadPage('/thuoctinhsanpham/chatLieuVai');
//     });
//
//     // $('#sidebar-page2').click(function(e) {
//     //     e.preventDefault();
//     //     loadPage('/sidebar-example/page2');
//     // });
//
//     function loadPage(url) {
//         $.ajax({
//             url: url,
//             type: 'GET',
//             success: function(data) {
//                 $('#content-wrapper').html(data);
//             },
//             error: function() {
//                 $('#content-wrapper').html('<p>Có lỗi xảy ra khi tải dữ liệu</p>');
//             }
//         });
//     }
// });