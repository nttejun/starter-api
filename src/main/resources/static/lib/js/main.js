var main = {
    init: function () {
        var _this = this;
        $("#btn-save").on('click', function () {
            _this.createBoard();
        })
    },

    createBoard: function () {
        var data = {
            no: dom.id("no").value,
            title: dom.id("title").value,
            bcategory: dom.id("bcategory").value,
            mcategory: dom.id("mcategory").value,
            content: dom.id("content").value,
            reg: dom.id("reg").value,
        };

        $.ajax({
            type: 'POST',
            url: '/board/create',
            dataType: 'json',
            contentType: 'application/json; charset=utf-8',
            data: JSON.stringify(data),
            success: function () {
                alert('게시글이 등록되었습니다.');
            },
            error: function (xhr, status, error) {
                alert(error);
                alert("게시물 등록을 잠시 후 이용해주세요.");
            }
        });
    }

};

main.init();