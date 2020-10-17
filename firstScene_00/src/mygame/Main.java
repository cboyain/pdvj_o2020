package mygame;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;

/**
 * This is the Main Class of your Game. You should only do initialization here.
 * Move your Logic into AppStates or Controls
 * @author normenhansen
 * 
 * El presente programa sirve de inicio para el aprendizaje del desarrollo de videojuegos
 * El desarrollo de videojuegos es una tarea muy demandante, por lo que debes cuidar definir
 * y seguir una nomenclatura para todos los objetos que conformaran tu videojuego. 
 * @author cboyain

 */
public class Main extends SimpleApplication {

    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    @Override
    public void simpleInitApp() {
                // Creamos una malla en forma de un cubo (com.jme3.scene.Mesh -> com.jme3.scene.shape.AbstractBox)
        Box box_mesh  = new Box(1, 1, 1);
        //Geomtry es un nodo hoja del scene graph, que mantiene la información del mesh y material
        // com.jme3.scene.Spatial -> com.jme3.scene.Geometry 
        Geometry box01_geom  = new Geometry("Box", box_mesh );

        //Se crea un material simple de color azul/amarillo/etc  que envolverá a la malla
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
