var board = {
    init: function () {
        var _this = this;

        $("#btn-save").on('click', function () {
            _this.createBoard();
        });

    },

    createBoard: function () {
        var data = {
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
            done: function () {
                alert('게시글이 등록되었습니다.');
                location.reload();
            },
            fail: function (xhr, status, error) {
                alert("게시물 등록을 잠시 후 이용해주세요.");
                alert("xhr = " + xhr + " / status = " + status + " / error = " + error);
            }
        });
    },
};

board.init();

