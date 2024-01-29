package com.example.gallerystaggered;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public class MainActivity2 extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout_recycler);

        String img1 = "https://img.freepik.com/free-photo/monstera-leaves-rays-sunlight-stripes-shadow-from-blinds-bright-red-background-closeup-selective-focus-wallpaper-ideas_166373-2157.jpg?w=900&t=st=1706514295~exp=1706514895~hmac=6c2ebb867663c447ecbe99fffdb9e27c0186123a55313eccac3cc7573364ff65";
        String img2 = "https://img.freepik.com/free-photo/front-view-woman-with-delicious-pizza_23-2150347912.jpg?w=900&t=st=1706514462~exp=1706515062~hmac=7257e1392fafadc01c89c6e277a7397af805a7bead16d2a8f32adbf1c4dbb9f4";
        String img3 = "https://img.freepik.com/premium-photo/full-length-man-running-beach_1048944-16644661.jpg?t=st=1706503646~exp=1706504246~hmac=92d43dbcbb87f9a9bd593b230eaad980542f6ef3a6b78dde936f1652c1b2bedf";
        String img4 = "https://img.freepik.com/premium-photo/trees-growing-forest_1048944-30368869.jpg?t=st=1706509214~exp=1706509814~hmac=0d12ddbc7ba0fa0197ae8055530ad013a9f12659ae2c20d1ec34c7a437719014";
        String img5 = "https://img.freepik.com/free-photo/young-female-inventor-creating-her-workshop_23-2149067224.jpg?t=st=1706509886~exp=1706510486~hmac=aec4ef015268ef0128ed9b7295859798405cedf08398ac0032f54cea65c33a6a";
        String img6 = "https://img.freepik.com/free-photo/three-donuts-with-different-toppings-purple-background-3d-rendering_1142-50665.jpg?size=626&ext=jpg&ga=GA1.1.464864005.1703865873&semt=sph";
        String img7 = "https://img.freepik.com/free-photo/majestic-big-cats-wild-stare-generated-by-ai_188544-35619.jpg?size=626&ext=jpg&ga=GA1.1.464864005.1703865873&semt=sph";
        String img8 = "https://img.freepik.com/free-photo/still-life-crochet-plushies_23-2151091238.jpg?size=626&ext=jpg&ga=GA1.1.464864005.1703865873&semt=ais";
        String img9 = "https://img.freepik.com/free-photo/tall-lighthouse-north-sea-cloudy-sky_181624-49637.jpg?w=900&t=st=1706514652~exp=1706515252~hmac=75298cdcbeb3f7785180959dea6df57430afef9395110f263a8ba04ae4eaf5cc";
        String img10 = "https://img.freepik.com/free-photo/front-view-woman-eating-delicious-pizza_23-2150280228.jpg?w=900&t=st=1706514501~exp=1706515101~hmac=ec894a76201f895b2dd4053b5ef48102122905ad07086e75852730cd80d4cf5b";
        String img11 = "https://img.freepik.com/free-photo/beautiful-shot-small-lake-with-wooden-rowboat-focus-breathtaking-clouds-sky_181624-2490.jpg?size=626&ext=jpg&ga=GA1.1.464864005.1703865873";
        String img12 = "https://img.freepik.com/free-photo/unfinished-jug_1098-13687.jpg?size=626&ext=jpg&ga=GA1.1.464864005.1703865873&semt=sph";
        String img13 = "https://img.freepik.com/free-photo/female-representation-devil-entity_23-2151010014.jpg?t=st=1706516322~exp=1706519922~hmac=c37d27046c95403a85add91db6369cefeea21f6099f6c2f5de77a85f0a5ac542&w=360";
        String img14 = "https://img.freepik.com/free-photo/color-year-illustrated_23-2151106279.jpg?t=st=1706508659~exp=1706512259~hmac=8dea375680155d04adce116a08f4ac109e3896a919507f74dba92cf1a7f39b50&w=360";
        String img15 = "https://img.freepik.com/free-photo/close-up-blurry-woman-holding-clay-leaf_23-2148878444.jpg?size=626&ext=jpg&ga=GA1.1.464864005.1703865873&semt=ais";
        String img16 = "https://img.freepik.com/free-photo/growing-plants-home-concept_23-2148928466.jpg?size=626&ext=jpg&ga=GA1.1.464864005.1703865873&semt=ais";
        String img17 = "https://img.freepik.com/free-photo/equality-inequality-concept-top-view_23-2148419607.jpg?size=626&ext=jpg&ga=GA1.1.464864005.1703865873&semt=sph";
        String img18 = "https://img.freepik.com/free-photo/group-colorful-birds-are-flying-formation-with-one-being-flown-by-another_188544-8130.jpg?size=626&ext=jpg&ga=GA1.1.464864005.1703865873&semt=sph";
        String img19 = "https://img.freepik.com/free-photo/beautiful-aerial-shot-forest-enveloped-creepy-mist-fog_181624-2659.jpg?size=626&ext=jpg";
        String img20 = "https://ak.picdn.net/shutterstock/videos/1100691403/preview/stock-footage-save-the-planet-earth-day-low-co-emission-aerial-forest-tree-nature-view-with-big-data-global.mp4";
        String img21 = "https://img.freepik.com/free-photo/high-angle-shot-lens-headphones-gimbal-phone_181624-43878.jpg?size=626&ext=jpg&ga=GA1.1.464864005.1703865873&semt=sph";
        String img22 = "https://img.freepik.com/free-photo/mumbai-skyline-skyscrapers-construction_469504-21.jpg?size=626&ext=jpg&ga=GA1.1.464864005.1703865873&semt=sph";
        String img23 = "https://img.freepik.com/free-photo/wood-pedestal-podium-with-leaf-background-3d-illustration-empty-display-scene-presentation-product-placement_56104-1851.jpg?size=626&ext=jpg&ga=GA1.1.464864005.1703865873&semt=sph";
        String img24 = "https://img.freepik.com/free-photo/armchair-green-living-room-with-copy-space_43614-910.jpg?size=626&ext=jpg&ga=GA1.1.464864005.1703865873&semt=ais";
        String img25 = "https://img.freepik.com/free-photo/majestic-mountains-with-snow-water-scene-generative-ai_188544-12459.jpg?size=626&ext=jpg&ga=GA1.1.464864005.1703865873&semt=sph";
        String img26 = "https://img.freepik.com/free-photo/pink-diamonds-with-ice-cream-cone_52683-93422.jpg?w=740&t=st=1706514563~exp=1706515163~hmac=456264a933287cbe1c9c0b96e4f4ed24c91af35f592e5a5e371bfba551d75adc";
        String img27 = "https://img.freepik.com/free-photo/person-washing-carrots-kitchen_23-2150316427.jpg?t=st=1706503646~exp=1706504246~hmac=714df75d410538f83a02434da23bf8e9543a6107b0ad29af5157fcddab908eb6";
        String img28 = "https://img.freepik.com/free-photo/beautiful-red-roses_181624-3693.jpg?size=626&ext=jpg&ga=GA1.1.464864005.1703865873&semt=sph";
        String img29 = "https://img.freepik.com/free-photo/long-exposures-sand-beach-sea-twilight_1150-11030.jpg?size=626&ext=jpg&ga=GA1.1.464864005.1703865873&semt=ais";
        String img30 = "https://img.freepik.com/free-photo/young-woman-embodies-glamour-sensuality-generative-ai_188544-9751.jpg?size=626&ext=jpg&ga=GA1.1.464864005.1703865873&semt=sph";
        String img31 = "https://img.freepik.com/free-photo/decorative-items-cozy-interior-room-vase-with-dried-flowers-light-wooden-table_169016-4252.jpg?size=626&ext=jpg&ga=GA1.1.464864005.1703865873&semt=ais";
        String img32 = "https://img.freepik.com/free-photo/buddhist-sculpture-tranquil-scene-ancient-architecture-meditation-generative-ai_188544-12807.jpg?size=626&ext=jpg&ga=GA1.1.464864005.1703865873&semt=sph";
        String img33 = "https://img.freepik.com/free-photo/international-day-education-futuristic-style-with-students-headgear_23-2150998712.jpg?size=626&ext=jpg&ga=GA1.1.464864005.1703865873&semt=sph";
        String img34 = "https://img.freepik.com/free-photo/beautiful-portrait-teenager-woman_23-2149453395.jpg?size=626&ext=jpg";
        String img35 = "https://img.freepik.com/free-photo/weather-effects-with-dessert-trees_23-2149667413.jpg?size=626&ext=jpg&ga=GA1.1.464864005.1703865873&semt=ais";
        String img36 = "https://img.freepik.com/free-photo/flying-pink-donut-decorated-with-colorful-sprinkles-blue_573717-6.jpg?size=626&ext=jpg&ga=GA1.1.464864005.1703865873&semt=sph";
        String img37 = "https://img.freepik.com/free-photo/elegant-modern-vase-design_23-2150529772.jpg?size=626&ext=jpg&ga=GA1.1.464864005.1703865873&semt=sph";
        String img38 = "https://img.freepik.com/free-photo/top-view-delicious-eggplant-dish_23-2150410432.jpg?size=626&ext=jpg&ga=GA1.1.464864005.1703865873";
        String img39 = "https://img.freepik.com/free-photo/mexican-tacos-with-beef-tomato-sauce-salsa_2829-14218.jpg?size=626&ext=jpg&ga=GA1.1.464864005.1703865873&semt=ais";
        String img40 = "https://img.freepik.com/free-photo/one-woman-elegance-colorful-autumn-nature-generative-ai_188544-9733.jpg?size=626&ext=jpg&ga=GA1.1.464864005.1703865873&semt=sph";
        String img41 = "https://img.freepik.com/free-photo/boy-are-stand-holding-seedlings-are-dry-land-warming-world_1150-16324.jpg?size=626&ext=jpg&ga=GA1.1.464864005.1703865873&semt=sph";
        String img42 = "https://img.freepik.com/free-photo/spiritual-awakening-concept_23-2150771605.jpg?size=626&ext=jpg&ga=GA1.1.464864005.1703865873&semt=sph";
        String img43 = "https://img.freepik.com/premium-photo/girl-riding-her-yellow-bike-dirt-road-summer_1048944-16415372.jpg?t=st=1706503646~exp=1706504246~hmac=a52cfe18ca2b96bfccfa45a5a6c3f2b7d69a7c63b72ce7b86a61aebd868e7a6c";
        String img44 = "https://img.freepik.com/free-photo/high-angle-hand-holding-ice-cream-cup_23-2149681943.jpg?w=360&t=st=1706514601~exp=1706515201~hmac=7295e7b5ab968a45c3a53c6b28784d098b607bee962b41f7429b6244a0a2780f";
        String img45 = "https://img.freepik.com/free-photo/silhouette-birds-flying_181624-8532.jpg?size=626&ext=jpg&ga=GA1.1.464864005.1703865873&semt=sph";
        String img46 = "https://img.freepik.com/free-photo/smiling-young-pretty-woman-standing-isolated_171337-1998.jpg?size=626&ext=jpg&ga=GA1.1.464864005.1703865873&semt=ais";
        String img47 = "https://img.freepik.com/free-photo/young-woman-embodies-glamour-sensuality-generative-ai_188544-9751.jpg?size=626&ext=jpg&ga=GA1.1.464864005.1703865873&semt=sph";
        String img48 = "https://img.freepik.com/free-photo/hands-creating-design-with-needle-sewing-thread_23-2148355031.jpg?w=900&t=st=1706516649~exp=1706517249~hmac=b4ce4758cb23d7203113aa032c0ab54374b4f455de5cff44a59959e21484b289";
        String img49 = "https://img.freepik.com/free-photo/hands-holding-blooming-white-roses_23-2148380900.jpg?size=626&ext=jpg&ga=GA1.1.464864005.1703865873&semt=sph";
        String img50 = "https://img.freepik.com/free-photo/woman-painting-clay-pot-close-up_23-2148944906.jpg?size=626&ext=jpg&ga=GA1.1.464864005.1703865873&semt=sph";

        ArrayList<String> images = new ArrayList<String>();
        images.add(img1);
        images.add(img2);
        images.add(img3);
        images.add(img4);
        images.add(img5);
        images.add(img6);
        images.add(img7);
        images.add(img8);
        images.add(img9);
        images.add(img10);
        images.add(img11);
        images.add(img12);
        images.add(img13);
        images.add(img14);
        images.add(img15);
        images.add(img16);
        images.add(img17);
        images.add(img18);
        images.add(img19);
        images.add(img20);
        images.add(img21);
        images.add(img22);
        images.add(img23);
        images.add(img24);
        images.add(img25);
        images.add(img26);
        images.add(img27);
        images.add(img28);
        images.add(img29);
        images.add(img30);
        images.add(img31);
        images.add(img32);
        images.add(img33);
        images.add(img34);
        images.add(img35);
        images.add(img36);
        images.add(img37);
        images.add(img38);
        images.add(img39);
        images.add(img40);
        images.add(img41);
        images.add(img42);
        images.add(img43);
        images.add(img44);
        images.add(img45);
        images.add(img46);
        images.add(img47);
        images.add(img48);
        images.add(img49);
        images.add(img50);


        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerAdapter adapter = new RecyclerAdapter(images);
        recyclerView.setAdapter(adapter);

        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);

    }
}
