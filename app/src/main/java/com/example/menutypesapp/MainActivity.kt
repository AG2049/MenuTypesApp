package com.example.menutypesapp

import android.os.Bundle
import android.util.Log
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.PopupMenu

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Configuración del Menú Popup
        val btnPopup = findViewById<Button>(R.id.btn_popup)
        btnPopup.setOnClickListener {
            val popup = PopupMenu(this, it)
            popup.menuInflater.inflate(R.menu.popup_menu, popup.menu)
            popup.setOnMenuItemClickListener { menuItem ->
                handleMenuItemClick(menuItem)
                true
            }
            popup.show()
        }

        // Configuración del Menú Contextual
        val btnContextual = findViewById<Button>(R.id.btn_contextual)
        registerForContextMenu(btnContextual)
    }

    // Configuración del Menú de Opciones
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.options_menu, menu)
        return true
    }

    // Manejar los clics en el Menú de Opciones
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        handleMenuItemClick(item)
        return true
    }

    // Creación del Menú Contextual
    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.context_menu, menu)
        Toast.makeText(this, "Menú Contextual abierto", Toast.LENGTH_SHORT).show()
    }

    // Manejar los clics en el Menú Contextual
    override fun onContextItemSelected(item: MenuItem): Boolean {
        handleMenuItemClick(item)
        return true
    }

    // Método para manejar los clics en todos los menús
    private fun handleMenuItemClick(item: MenuItem) {
        when (item.itemId) {
            R.id.action_settings -> {
                // Acción para "Configurar"
            }
            R.id.action_edit -> {
                // Acción para "Editar"
            }
            R.id.action_delete -> {
                // Acción para "Borrar"
            }
            R.id.action_share -> {
                // Acción para "Cortar"
            }
            R.id.action_favorite -> {
                // Acción para "Pegar"
            }
        }
    }
}
