package intro.multiecras.ryanreynolds;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);





        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        InicioFragment inicioFragment = new InicioFragment();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction()
                .setCustomAnimations(R.anim.anim_slide_in_esquerda, R.anim.anim_slide_out_esquerda)
                .replace(R.id.relative_layout_para_o_fragment, inicioFragment, inicioFragment.getTag()).commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Expande o menu; isto adiciona itens para a barra de ação se estiver presente.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.mostra_inicio) {
            InicioFragment inicioFragment = new InicioFragment();
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction()
                    .replace(R.id.relative_layout_para_o_fragment, inicioFragment, inicioFragment.getTag()).commit();

        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Para clicar nos botões da barra de navegação
        int id = item.getItemId();

        if (id == R.id.nav_bibliografia) {
            Toast.makeText(this, "Bibliografia", Toast.LENGTH_SHORT).show();
            BibliografiaFragment bibliografiaFragment = new BibliografiaFragment();
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction()
                    .replace(R.id.relative_layout_para_o_fragment, bibliografiaFragment, bibliografiaFragment.getTag()).commit();


        } else if (id == R.id.nav_filmes) {
            Toast.makeText(this, "Filmes", Toast.LENGTH_SHORT).show();
            FilmesFragment filmesFragment = new FilmesFragment();
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction()
                    .replace(R.id.relative_layout_para_o_fragment, filmesFragment, filmesFragment.getTag()).commit();

        } else if (id == R.id.nav_premios) {
            Toast.makeText(this, "Prémios", Toast.LENGTH_SHORT).show();
            PremiosFragment premiosFragment = new PremiosFragment();
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction()
                    .replace(R.id.relative_layout_para_o_fragment, premiosFragment, premiosFragment.getTag()).commit();

        } else if (id == R.id.nav_terminar) {
            Toast.makeText(this, "Terminar", Toast.LENGTH_SHORT).show();
            finish();

        } else if (id == R.id.nav_curiosidades) {
            Toast.makeText(this, "Curiosidades", Toast.LENGTH_SHORT).show();
            CuriosidadesFragment curiosidadesFragment = new CuriosidadesFragment();
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction()
                    .replace(R.id.relative_layout_para_o_fragment, curiosidadesFragment, curiosidadesFragment.getTag()).commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
