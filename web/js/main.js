
window.addEventListener('load', function(){
    
    document.getElementById('botoniniciar').addEventListener('click', function(){
        
        var usuario = document.getElementById('usuarioLogin').value;
        var pass = document.getElementById('password').value;
        
        var bandera = false;
        
        if(usuario.length > 0  && pass.length > 0){
            
            bandera=true;
            
        }
        if(bandera){
            

            document.getElementById('forminiciar').submit();
            
        }else{
            alert('Ingrese los campos');
        }
    })
})


