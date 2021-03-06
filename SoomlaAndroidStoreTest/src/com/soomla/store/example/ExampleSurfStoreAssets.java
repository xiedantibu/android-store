package com.soomla.store.example;

import com.soomla.store.IStoreAssets;
import com.soomla.store.SoomlaPrefs;
import com.soomla.store.domain.data.VirtualCurrency;
import com.soomla.store.domain.ui.StoreBuyMoreElement;
import com.soomla.store.domain.ui.StoreTemplate;
import com.soomla.store.domain.data.VirtualCurrencyPack;
import com.soomla.store.domain.data.VirtualGood;
import com.soomla.store.domain.ui.StoreTemplateElements;
import com.soomla.store.domain.ui.StoreTemplateProperties;
import com.soomla.store.domain.ui.StoreTitleElement;

import java.lang.String;
import java.util.Arrays;
import java.util.List;

public class ExampleSurfStoreAssets implements IStoreAssets {

    @Override
    public StoreTemplate getStoreTemplate(){
        return new StoreTemplate(
            "basic",
            new StoreTemplateElements(
                    new StoreTitleElement("Surf Store"),
                    new StoreBuyMoreElement("Get more clams", "img/examples/surf/clam.png")
            ),
            new StoreTemplateProperties(3)
        );
    }

    @Override
    public String getStoreBackground() {
        return "img/theme-lime-bubbles.jpg";
    }

    @Override
    public VirtualCurrency getVirtualCurrency(){
        return  new VirtualCurrency(
                "clams",
                "",
                "img/examples/surf/clam.png",
                SoomlaPrefs.CURRENCY_ITEM_ID
        );
    }

    @Override
    public List<VirtualGood> getVirtualGoods(){
        return Arrays.asList(
                    RipCurlShortBoard, BillanbogVintageLongboard,
                    KeelFish, PicassoPeeler, ReefShredder,
                    SixtiesGun, TraditionalFish
                );
    }

    @Override
    public List<VirtualCurrencyPack> getVirtualCurrencyPacks(){
        return Arrays.asList(
                    SuperSaverPack, MalibuMediumPack, PipelinePumpinPack
               );
    }


    /** Private members **/

    /** Virtual Goods **/
    private final VirtualGood RipCurlShortBoard = new VirtualGood(
            "Rip Curl Shortboard",                          // name
            "Shred small waves with this super-fast board", // description
            "img/examples/surf/blue-surfboard.png",         // image file path
            100,                                            // currency value
            "blue_surfboard"                                // item id
    );

    private final VirtualGood BillanbogVintageLongboard = new VirtualGood(
            "Billanbog Vintage Longboard",                  // name
            "Slowly hang five through low power surf",      // description
            "img/examples/surf/girl-surfboard-th.png",      // image file path
            150,                                            // currency value
            "girl_surfboard_th"                             // item id
    );

    private final VirtualGood KeelFish = new VirtualGood(
            "Keel Fish",                                    // name
            "Carve slow waves with this ever-riding board", // description
            "img/examples/surf/keelfish.png",               // image file path
            200,                                            // currency value
            "keelfish"                                      // item id
    );

    private final VirtualGood PicassoPeeler = new VirtualGood(
            "Picasso Peeler",                               // name
            "The master of surreal off-the-lip maneuvers",  // description
            "img/examples/surf/picasso-peeler.png",         // image file path
            300,                                            // currency value
            "picasso_peeler"                                // item id
    );

    private final VirtualGood ReefShredder = new VirtualGood(
            "Reef Shredder",                                // name
            "A mean paddling machine for the deep reefs",   // description
            "img/examples/surf/reef-shredder.png",          // image file path
            300,                                            // currency value
            "reef_shredder"                                // item id
    );

    private final VirtualGood SixtiesGun = new VirtualGood(
            "Sixties Gun",                                  // name
            "Ride Venice-style with this time machine",     // description
            "img/examples/surf/sixties-gun.png",            // image file path
            400,                                            // currency value
            "sixties_gun"                                   // item id
    );

    private final VirtualGood TraditionalFish = new VirtualGood(
            "Traditional Fish",                             // name
            "The all around conditions board of choice",    // description
            "img/examples/surf/traditional-fish.png",       // image file path
            450,                                            // currency value
            "traditional_fish"                              // item id
    );


    /** Virtual Currency Packs **/

    private final VirtualCurrencyPack SuperSaverPack = new VirtualCurrencyPack(
            "Super Saver Pack",                             // name
            "For you cheap skates...",                      // description
            "coin.jpg",                                     // image file path
            "super_saver_pack",                             // item id
            "super_saver_pack",                             // product id in Google Market
            0.99,                                           // actual price in $$
            200,                                            // number of currencies in the pack
            false                                           // consumable
    );

    private final VirtualCurrencyPack MalibuMediumPack = new VirtualCurrencyPack(
            "Malibu Medium Pack",                           // name
            "For you cheap skates...",                      // description
            "coin.jpg",                                     // image file path
            "malibu_medium_pack",                           // item id
            "android.test.purchased",                       // product id in Google Market
            1.99,                                           // actual price in $$
            500,                                            // number of currencies in the pack
            false                                           // consumable
    );

    private final VirtualCurrencyPack PipelinePumpinPack = new VirtualCurrencyPack(
            "Pipeline Pumpin' Pack",                        // name
            "The holy grail for ya spendin' surfers",       // description
            "coin.jpg",                                     // image file path
            "pipeline_pumpin_pack",                         // item id
            "pipeline_pumpin_pack",                         // product id in Google Market
            5.99,                                           // actual price in $$
            1500,                                           // number of currencies in the pack
            false                                           // consumable
    );
}
