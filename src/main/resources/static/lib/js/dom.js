
var domModule = function(){

    return {

        getIdAttr: function (id, attr) {
            return document.getElementById(id).getAttribute(attr);
        },

        setIdAttr: function (id, attr, val) {
            return document.getElementById(id).setAttribute(attr, val);
        },

        id: function (id){
            return document.getElementById(id);
        },

        tagNm: function (tagName){
            return document.getElementsByTagName(tagName);
        },

    }

};
