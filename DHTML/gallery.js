var photos = new Array("Desert.jpg","Hydrangeas.jpg","Lighthouse.jpg","Tulips.jpg");
    var idx = 0;
    
    function previous() {    
        image = document.getElementById("myImg");
        idx --;
        if(idx == -1)
            idx = photos.length - 1;
        image.src = photos[idx];
    }
        
    function next() {
        image = document.getElementById("myImg");
        idx ++;
        if(idx == photos.length)
            idx = 0;
        image.src = photos[idx];
    }
    