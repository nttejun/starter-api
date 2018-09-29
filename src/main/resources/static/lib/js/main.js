var dom = domModule();

var main = {
    init: function () {
        var _this = this;
        $('#btn-save').on('click', function () {
            _this.createBoard();
        })
    },

    createBoard: function () {
        var data = {
            bcategory: dom.id("bcategory").value,
            content: dom.id("content").value,
            mcategory: dom.id("mcategory").value,
            reg: dom.id("reg").value,
            title: dom.id("title").value
        };

        $.ajax({
            type: 'POST',
            url: '/board/create',
            dataType: 'json',
            contentType: 'application/json; charset=utf-8',
            data: JSON.stringify(data),
            success: function () {
                alert('글이 등록되었습니다.');
                location.reload();
            },
            error: function () {
                alert("게시물 등록을 잠시 후 이용해주세요.");
            }
        });
    }

};

main.init();