package com.example.project_androidartist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.project_androidartist.model.Artist;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // เก็บ Artist ทุกอย่างไว้ใน ArrayList<Artist> ชื่อว่า artists
        List<Artist> artists = new ArrayList<Artist>();
        Artist artist1 = new Artist();
        artist1.setArtist_name("Rihanna");
        artist1.setArtist_image("https://charts-static.billboard.com/img/2006/12/rihanna-k0p-artistchart-5wb-180x180.jpg");
        artist1.setArtist_debut(2548);
        artists.add(artist1);

        Artist artist2 = new Artist();
        artist2.setArtist_name("P!nk");
        artist2.setArtist_image("https://charts-static.billboard.com/img/2006/12/pnk-it7-artist-chart-8sk-180x180.jpg");
        artist2.setArtist_debut(2543);
        artists.add(artist2);

        Artist artist3 = new Artist();
        artist3.setArtist_name("Maroon 5");
        artist3.setArtist_image("https://charts-static.billboard.com/img/1840/12/maroon-5-9st-180x180.jpg");
        artist3.setArtist_debut(2545);
        artists.add(artist3);

        Artist artist4 = new Artist();
        artist4.setArtist_name("Katy Perry");
        artist4.setArtist_image("https://charts-static.billboard.com/img/2008/12/katy-perry-l8p-180x180.jpg");
        artist4.setArtist_debut(2544);
        artists.add(artist4);

        Artist artist5 = new Artist();
        artist5.setArtist_name("Justin Timberlake");
        artist5.setArtist_image("https://charts-static.billboard.com/img/2006/12/justin-timberlake-bcj-artist-chart-3lf-180x180.jpg");
        artist5.setArtist_debut(2545);
        artists.add(artist5);

        Artist artist6 = new Artist();
        artist6.setArtist_name("Britney Spears");
        artist6.setArtist_image("https://charts-static.billboard.com/img/2017/02/britney-spears-180x180.jpg");
        artist6.setArtist_debut(2542);
        artists.add(artist6);

        Artist artist7 = new Artist();
        artist7.setArtist_name("Taylor Swift");
        artist7.setArtist_image("https://charts-static.billboard.com/img/2006/12/taylor-swift-824-artistchart-zpe-180x180.jpg");
        artist7.setArtist_debut(2549);
        artists.add(artist7);

        Artist artist8 = new Artist();
        artist8.setArtist_name("kelly Clarkson");
        artist8.setArtist_image("https://charts-static.billboard.com/img/2006/12/kelly-clarkson-w89-artist-chart-zny-180x180.jpg");
        artist8.setArtist_debut(2545);
        artists.add(artist8);

        Artist artist9 = new Artist();
        artist9.setArtist_name("Mariah Carey");
        artist9.setArtist_image("https://charts-static.billboard.com/img/1990/12/mariah-carey-tgq-180x180.jpg");
        artist9.setArtist_debut(2533);
        artists.add(artist9);

        Artist artist10 = new Artist();
        artist10.setArtist_name("Bruno Mars");
        artist10.setArtist_image("https://charts-static.billboard.com/img/2010/12/bruno-mars-va7-180x180.jpg");
        artist10.setArtist_debut(2547);
        artists.add(artist10);

        Artist artist11 = new Artist();
        artist11.setArtist_name("Usher");
        artist11.setArtist_image("https://charts-static.billboard.com/img/2004/12/usher-9xv-artistchart-vmy-180x180.jpg");
        artist11.setArtist_debut(2536);
        artists.add(artist11);

        Artist artist12 = new Artist();
        artist12.setArtist_name("Lady Gaga");
        artist12.setArtist_image("https://charts-static.billboard.com/img/2008/04/lady-gaga-b8x-180x180.jpg");
        artist12.setArtist_debut(2548);
        artists.add(artist12);

        Artist artist13 = new Artist();
        artist13.setArtist_name("The Black Eyed Peas");
        artist13.setArtist_image("https://charts-static.billboard.com/img/2006/12/the-black-eyed-peas-f5s-artist-chart-dnt-180x180.jpg");
        artist13.setArtist_debut(2540);
        artists.add(artist13);

        Artist artist14 = new Artist();
        artist14.setArtist_name("Christina Aguilera");
        artist14.setArtist_image("https://charts-static.billboard.com/img/2006/12/christina-aguilera-l5y-artist-chart-rxj-180x180.jpg");
        artist14.setArtist_debut(2542);
        artists.add(artist14);

        Artist artist15 = new Artist();
        artist15.setArtist_name("Janet Jackson");
        artist15.setArtist_image("https://charts-static.billboard.com/img/1983/12/janet-jackson-dus-180x180.jpg");
        artist15.setArtist_debut(2525);
        artists.add(artist15);

        Artist artist16 = new Artist();
        artist16.setArtist_name("Madonna");
        artist16.setArtist_image("https://charts-static.billboard.com/img/2017/05/madonna-180x180.jpg");
        artist16.setArtist_debut(2526);
        artists.add(artist16);

        // ส่ง artists ไปให้ MyAdapte
        mAdapter = new MyAdapter(artists, this);
        recyclerView.setAdapter(mAdapter);

    }
}