package mygame;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import com.jme3.system.AppSettings;

/**
 * This is the Main Class of your Game. You should only do initialization here.
 * Move your Logic into AppStates or Controls
 * @author normenhansen
 * 
 * Se desarrollará la práctica del libro jMe beginners Guide de Ruth Kusterer. En esta práctica se 
 * desarrollara un juego simple de defender la torre. En este tipo de juego el usuario 
 * debera evitar que los oponentes (NPC) lleguen a la torre. Este juego es similar a 
 * Plantas contra zombis.
 * 1: Modifica los settings para especificar una imagen propia del juego y el nombre de 
 * este sera "My Tower Defense Demo"
 * 2: Mantener activo la iteraccion con la "flyCam" es decir no modificar por ahora "settings.useInput()"
 * 3: Crear una caja plana de 33-WU para que sea el piso(floor)
 * 4: Crear un "playerNode", un "towerNode", un "creepNode", y adjuntarlos al "rootNode".
 * 5: Crear las geometrias; una caja acostada amarilla representando la base del jugador, 
 * una caja alta verde que representara una torre, y una cubo pequeño negro que representa un creep.
 * 6: Adjunta las geometrias al playerNode, al towerNode, y al creepNode respectivamente. 
 * 7: Posiciona la gemetria de la base en el origen.Esto permitira orientares.
 * 8: Posiciona una tore a la izquierda y otra a la derecha en frente de la base, y algunos pequeños 
 * cubos creep a lo lejos a lo largo del eje z
 * 9: Agrega el codigo que desactiva el objeto "StatsView"
 * @author cboyain
 */
public class Main extends SimpleApplication {
    
    public static void main(String[] args) {
        AppSettings settings = new AppSettings(true); //Creamos el objeto para controlar las especificaciones
        settings.setTitle("My Tower Defense Demo"); //Cambiamos el nombre de la ventana 
        //Integramos una imagen personal a la pantalla de inicio
        settings.setSettingsDialogImage("Interface/towerSplash.png");
        //modificar la resolucion 
        settings.setResolution(1280, 960);
        //useInput establece si deseamos reaccionar a las entradas del mouse o teclado
        //settings.useInput(false);
        Main app = new Main();
        app.setSettings(settings);//Aplicamos las especificaciones a la app
        
        app.start();
    }

    @Override
    public void simpleInitApp() {
        //El objeto flayCma esta instanciado por defecto, al extender SimpleApplication
        flyCam.setMoveSpeed(1.8f); //Determinamos que la camara se desplace a una mayor velocidad
        
        // Creamos una malla en forma de un cubo (com.jme3.scene.Mesh -> com.jme3.scene.shape.AbstractBox)
        Box box_mesh  = new Box(1, 1, 1);
        //Geomtry es un nodo hoja del scene graph, que mantiene la información del mesh y material
        // com.jme3.scene.Spatial -> com.jme3.scene.Geometry 
        Geometry box01_geom  = new Geometry("Box", box_mesh );

        // Se crea un material simple de color azul/amarillo/etc  que envolverá a la malla
        // com.jme3.material.Material (esencialmente es una lista de los parametros que describen 
        // la forma de renderizar a Geometry)
        Material box01_mat  = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        //Establecemos el parámetro del colora al material antes creado
        box01_mat.setColor("Color", ColorRGBA.Blue);
        // Asignamos el material a la geometría 
        box01_geom.setMaterial(box01_mat);

        //Agregamos la geom al sceen grpah para que aparezca renderizado
        rootNode.attachChild(box01_geom);
    }

    @Override
    public void simpleUpdate(float tpf) {
        //TODO: add update code
    }

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code
    }
}
