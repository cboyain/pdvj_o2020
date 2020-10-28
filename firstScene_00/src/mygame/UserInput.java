/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;

import com.jme3.app.SimpleApplication;
import com.jme3.input.KeyInput;
import com.jme3.input.MouseInput;
import com.jme3.input.controls.KeyTrigger;
import com.jme3.input.controls.MouseButtonTrigger;
import com.jme3.input.controls.Trigger;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;

/**
 * Este programa sirve de introducción para el manejo de las entradas y las acciones que 
 * estas entradas deben impulsar en el juego.
 * Recuerda que la clase SimpleApplication proporsiona un manejador para las entradas
 * "inputManager"
 * @author boyolu
 */
public class UserInput extends SimpleApplication {
    // Constantes triggers que representan los clicks de la barra y el mouse
    // Los triggers son los objetos que representan las entradas fisicas de los cliks o joystick
    private final static Trigger TRIGGER_COLOR = new KeyTrigger(KeyInput.KEY_SPACE);
    private final static Trigger TRIGGER_ROTATE = new MouseButtonTrigger(MouseInput.BUTTON_LEFT);
    //definimos las constantes que nos ayudaran a identificar las acciones por los triggers
    private final static String MAPPING_COLOR = "Toggle Color";
    private final static String MAPPING_ROTATE = "Rotate";
    
    public static void main (String[] args){
        UserInput app = new UserInput();
        app.start();
                
    }
    
    @Override
    public void simpleInitApp(){
        //para hacer uso de los triggers y mapping se deben registrar en el inputManager
        //** Recuerda asosiar el nombre del trigger con la accion, por si se decide modificar 
        // el imput que lo activa
        inputManager.addMapping(MAPPING_ROTATE, TRIGGER_ROTATE);
        inputManager.addMapping(MAPPING_COLOR, TRIGGER_COLOR);
        
        Box blue01 = new Box(1,1,1);
        Geometry box01_geom = new Geometry("box blue", blue01);
        Material box01_mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        box01_mat.setColor("Color", ColorRGBA.Blue);
        box01_geom.setMaterial(box01_mat);
        
        rootNode.attachChild(box01_geom);
        
    }
    
    @Override
    public void simpleUpdate(float tpf){
        
    }
    
}
