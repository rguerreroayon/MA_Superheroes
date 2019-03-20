package rguerrero.examen

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.view_heroe.view.*

class MainActivity : AppCompatActivity() {

    var listaSuperhero = ArrayList<Superhero>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        crearSuperhero()
    }




    fun crearSuperhero(){
        var superman = Superhero(nombre = "Clark Kent",ciudad = "Metropolis",correo = "supermanc@gmail.com",
            telefono = "1111111111",imagen = R.drawable.superman)

        var aquaman = Superhero(nombre = "Arthur Curry",ciudad = "Atlantis",correo = "aquamanc@gmail.com",
            telefono = "2222222222",imagen = R.drawable.aquaman)

        var flash = Superhero(nombre = "Barry Allen",ciudad = "Central City",correo = "flash@gmail.com",
            telefono = "3333333333",imagen = R.drawable.superman)

        var wonderwoman = Superhero(nombre = "Diana Prince",ciudad = "Themyscira",correo = "wonderwoman@gmail.com",
            telefono = "4444444444",imagen = R.drawable.superman)

        var batman = Superhero(nombre = "Bruce Wayne",ciudad = "Gotham City",correo = "gmail@batman.com",
            telefono = "5555555555",imagen = R.drawable.superman)

        listaSuperhero.add(superman)
        listaSuperhero.add(aquaman)
        listaSuperhero.add(flash)
        listaSuperhero.add(wonderwoman)
        listaSuperhero.add(batman)


    }

    private class AdaptadorSH: BaseAdapter {
        var context: Context? = null
        var heroes: ArrayList<Superhero>? = null

        constructor(context: Context, heroes: ArrayList<Superhero>) {
            this.context = context
            this.heroes = heroes
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var layout = LayoutInflater.from(context)
            var vista = layout?.inflate(R.layout.view_heroe, null)!!
            var heroe = heroes!![position]
            if(vista != null){
                vista.nombre.text = heroe.nombre
                vista.imageView.setImageResource(heroe.imagen)

            }


            vista.setOnClickListener() {



            }

            return vista
        }


        override fun getItem(position: Int): Any {
            return heroes?.get(position) ?: "Error"
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getCount(): Int {
            return heroes?.size ?: 0
        }

    }







}
