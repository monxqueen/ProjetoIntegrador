package com.monique.projetointegrador

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class FavoriteMoviesFragment : Fragment() {

    //private lateinit var moviesAdapter: MoviesRvAdapter

    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_favorite_movies, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val txtTest2 = view.findViewById<TextView>(R.id.txtTest2)
        txtTest2.setOnClickListener {
            Toast.makeText(requireActivity(), "Fragment 2", Toast.LENGTH_SHORT).show()
        }
        //val rvMovies = view.findViewById<RecyclerView>(R.id.rvMovies)
        /*rvMovies.adapter = moviesRvAdapter
          rvMovies.layoutManager = LinearLayoutManager(requireActivity(), LinearLayoutManager.HORIZONTAL, false)
         */
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FavoriteMoviesFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}