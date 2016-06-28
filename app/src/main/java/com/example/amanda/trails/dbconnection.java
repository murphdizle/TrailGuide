// Copyright (c) 2016 Amanda Murphy & Randy Perrone
// This code is available under the "MIT License".
// Please see the file COPYING in this distribution
// for license terms.

package com.example.amanda.trails;

/**
 * Created by Amanda on 7/3/2016.
**/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class dbconnection {
    public static TrailList getTrailsByRegion(String region) {
        TrailList list = new TrailList();
        if (region.equals("Lake Oswego Area")) {
            list.addTrail(new Trail("George Rogers Park Hike",
                    "View a historic iron furnace, then a river beach, and afterwards stroll above the Willamette",
                    3.4,
                    "Easy",
                    150,
                    false,
                    45.4106,
                    -122.6608
            ));
            list.addTrail(new Trail("Springbrook-Iron Mountain Loop Hike",
                    "Walk two forested parks and connect with Lake Oswego's iron mining history",
                    3.4,
                    "Easy",
                    355,
                    false,
                    45.42285,
                    -122.70483
            ));
            list.addTrail(new Trail("Bryant Woods-Canal Acres Loop Hike",
                    "Double loop through natural areas near the historic Oswego Canal",
                    1.7,
                    "Easy",
                    40,
                    false,
                    45.38646,
                    -122.72092
            ));
            list.addTrail(new Trail("Luscher Farm-Cooks Butte Loop Hike",
                    "Connect to a variety of semi-rural public spaces on trails and streets",
                    4.4,
                    "Easy",
                    315,
                    false,
                    45.39622,
                    -122.68729
            ));
           /* list.addTrail(new Trail("",
                    "",
                    ,
                    "",
                    ,
                    false,
                    ,

                    ));*/
        }
        if (region.equals("Dog Mountain Area")) {
            list.addTrail(new Trail("Wind Mountain Hike",
                    "Easy climb to historic vision quest site",
                    3.0,
                    "Moderate",
                    1000,
                    false,
                    45.71342,
                    -121.75183
            ));
            list.addTrail(new Trail("Dog Mountain Hike",
                    "Popular and tough hike to 360 summit. Abundant May/June wildflowers",
                    6.9,
                    "Difficult",
                    2800,
                    false,
                    45.69927,
                    -121.70542
            ));
            list.addTrail(new Trail("Dog Mountain Loop Hike",
                    "Longer hike to the top of Dog Mountain. Abundant May/June wildflowers",
                    7.4,
                    "Difficult",
                    2800,
                    false,
                    45.69927,
                    -121.70542
            ));
            list.addTrail(new Trail("Augspurger Mountain Hike",
                    "Adventurous hike on little used trail to great Gorge viewpoint",
                    12.6,
                    "Difficult",
                    4770,
                    false,
                    45.69927,
                    -121.70542
            ));
            list.addTrail(new Trail("Cook Hill Loop Hike",
                    "Hike unofficial trails and old logging roads to the summit of Cook Hill",
                    8.8,
                    "Moderate",
                    2930,
                    false,
                    45.7120,
                    -121.6535
            ));
        }
        if (region.equals("Portland(North/Northeast) Area")) {
            list.addTrail(new Trail("Kelley Point Loop Hike",
                    "Deciduous woodland and beaches at the confluence of the Willamette and Columbia Rivers",
                    1.7,
                    "Easy",
                    45,
                    false,
                    45.64358,
                    -122.76527
            ));
            list.addTrail(new Trail("Smith and Bybee Lakes Hike",
                    "Urban wetland with large numbers of waterbirds",
                    2.1,
                    "Easy",
                    10,
                    false,
                    45.61665,
                    -122.71880
            ));
            list.addTrail(new Trail("Peninsula Crossing-Columbia Slough Hike",
                    "Paved trails between the Willamette and the Columbia Rivers and along the Columbia Slough",
                    10.2,
                    "Moderate",
                    150,
                    false,
                    45.5830,
                    -122.7387
            ));
            list.addTrail(new Trail("Hayden Bay Loop Hike",
                    "Hike a paved path on the Columbia and then visit historic Lotus Isle Park",
                    2.5,
                    "Easy",
                    10,
                    false,
                    45.6117,
                    -122.6762
            ));
            list.addTrail(new Trail("Columbia Children's Arboretum Loop Hike",
                    "Quiet loop in North Portland to see the state trees",
                    1.0,
                    "Easy",
                    5,
                    false,
                    45.5961,
                    -122.6618
                    ));
            list.addTrail(new Trail("Whitaker Ponds Loop Hike",
                    "Quiet nature park on a slough in the industrial northeast",
                    0.5,
                    "Easy",
                    10,
                    false,
                    45.57391,
                    -122.61391
            ));
            list.addTrail(new Trail("Rocky Butte Hike",
                    "Hike below cliff faces to a park with expansive views",
                    3.2,
                    "Easy",
                    480,
                    false,
                    45.55325,
                    -122.57468
            ));
        }
        if (region.equals("Portland(Powell Butte) Area")) {
            list.addTrail(new Trail("Mount Hood Trail Loop Hike",
                    "Climb through timber to the open summit meadow",
                    2.0,
                    "Easy",
                    340,
                    false,
                    45.48189,
                    -122.51442
            ));
            list.addTrail(new Trail("Old Holgate Hike",
                    "Walk an long-forgotten road up a timbered ridge",
                    2.5,
                    "Easy",
                    310,
                    false,
                    45.48963,
                    -122.51760
            ));
            list.addTrail(new Trail("Powell Butte Perimeter Loop Hike",
                    "The longest loop on Powell Butte",
                    3.3,
                    "Easy",
                    500,
                    false,
                    45.49052,
                    -122.49717
            ));
            list.addTrail(new Trail("Powell Butte Summit Loop Hike",
                    "Dirt trails to the summit orchard",
                    2.0,
                    "Easy",
                    220,
                    false,
                    45.49052,
                    -122.49717
            ));
            list.addTrail(new Trail("Powell Butte Universal Access Hike",
                    "Paved path to the summit orchard ",
                    1.6,
                    "Easy",
                    200,
                    false,
                    45.49052,
                    -122.49717
            ));
        }
        if (region.equals("Portland(West Hills) Area")) {
            list.addTrail(new Trail("Audubon Sanctuaries Loop Hike",
                    "Two short loops and an optional diversion to the Willamette Stone",
                    3.0,
                    "Easy",
                    740,
                    false,
                    45.52676,
                    -122.73013
            ));
            list.addTrail(new Trail("Pittock Mansion Hike",
                    "Hike up a forested creek bed to a stately mansion",
                    5.0,
                    "Moderate",
                    900,
                    false,
                    45.53611,
                    -122.71248
            ));
            list.addTrail(new Trail("Hoyt Arboretum Loop Hike",
                    "Explore a network of trails to view 1,100 species of trees",
                    4.7,
                    "Easy",
                    425,
                    false,
                    45.51275,
                    -122.71661
            ));
            list.addTrail(new Trail("Washington Park Loop Hike",
                    "Hike to several of Portland's most notable attractions",
                    3.9,
                    "Easy",
                    585,
                    false,
                    45.52147,
                    -122.70228
            ));
            list.addTrail(new Trail("Council Crest Hike",
                    "Climb to a summit with great views, just minutes from downtown",
                    3.3,
                    "Moderate",
                    820,
                    false,
                    45.50287,
                    -122.69169
            ));
            list.addTrail(new Trail("Marquam Trail to Council Crest Hike",
                    "An excellent hike on a section of the 40-Mile Loop",
                    6.4,
                    "Moderate",
                    1100,
                    false,
                    45.49107,
                    -122.68712
            ));
            list.addTrail(new Trail("Marquam Nature Park Loop Hike",
                    "Forested loop with spurs using Marquam Gulch and the slopes of Sentinel Hill",
                    6.3,
                    "Moderate",
                    1075,
                    false,
                    45.49107,
                    -122.68712
            ));
        }
        if (region.equals("Portland(Southwest) Area")) {
            list.addTrail(new Trail("Woods Park Loop Hike",
                    "A pocket of native forest in Southwest Portland",
                    2.1,
                    "Easy",
                    210,
                    false,
                    45.45751,
                    -122.72630
            ));
            list.addTrail(new Trail("Marshall Park Hike",
                    "A walk along Tryon Creek that ends at the state park ",
                    1.4,
                    "Easy",
                    80,
                    false,
                    45.45521,
                    -122.693
            ));
            list.addTrail(new Trail("Tryon Creek Inner Loop Hike",
                    "A short loop through the popular state park",
                    1.9,
                    "Easy",
                    200,
                    false,
                    45.44133,
                    -122.67559
            ));
            list.addTrail(new Trail("Tryon Creek Outer Loop Hike",
                    "Longer loop around the perimeter of Tryon Creek State Natural Area",
                    5.7,
                    "Moderate",
                    630,
                    false,
                    45.44133,
                    -122.67559
            ));
        }
        if (region.equals("Portland(Southeast) Area")) {
            list.addTrail(new Trail("Oaks Bottom Loop Hike",
                    "Walk around a wetland, enjoy a stunning mural, and look for a variety of birds ",
                    2.3,
                    "Easy",
                    125,
                    false,
                    45.46949,
                    -122.65931
            ));
            list.addTrail(new Trail("Crystal Springs-Reed Canyon Hike",
                    "Enjoy a botanical garden and walk around a small lake below gushing springs",
                    2.4,
                    "Easy",
                    145,
                    false,
                    45.48013,
                    -122.63543
                    ));
            list.addTrail(new Trail("Mount Tabor Hike",
                    "Explore a volcano in town",
                    2.0,
                    "Easy",
                    400,
                    false,
                    45.508084,
                    -122.593485
                    ));
        }
        if (region.equals("Portland(Forest Park) Area")) {
            list.addTrail(new Trail("Dogwood-Wild Cherry Loop Hike",
                    "Hike down and then up on thickly wooded trails in Forest Park",
                    2.6,
                    "Easy",
                    880,
                    false,
                    45.53838,
                    -122.73407
            ));
            list.addTrail(new Trail("Maple-Wildwood Loop Hike",
                    "Pleasant loop, mostly on foot trails, to visit big trees in the center of Forest Park",
                    8.4,
                    "Moderate",
                    1080,
                    false,
                    45.56633,
                    -122.75342
            ));
            list.addTrail(new Trail("Firelane 7-Springville Road Loop Hike",
                    "Hike down and up ridges and, in between, the gullies of the Wildwood Trail",
                    4.9,
                    "Easy",
                    1120,
                    false,
                    45.57450,
                    -122.78920
            ));
            list.addTrail(new Trail("Tolinda-Ridge Trail Loop Hike",
                    "Loop in central Forest Park using some less frequented trails",
                    5.9,
                    "Moderate",
                    1685,
                    false,
                    45.58832,
                    -122.77881
            ));
            list.addTrail(new Trail("Linnton Loop Hike",
                    "Loop hike from Highway 30 into the heart of Forest Park",
                    5.2,
                    "Moderate",
                    930,
                    false,
                    45.59628,
                    -122.78428
            ));
            list.addTrail(new Trail("BPA Road-Newton Road Loop Hike",
                    "Varied loop hike with spurs at the north end of Forest Park",
                    8.1,
                    "Moderate",
                    2600,
                    false,
                    45.61162,
                    -122.79745
            ));
            list.addTrail(new Trail("Firelane 15 Hike",
                    "Quiet loop hike on the northwest edge of Forest Park",
                    4.0,
                    "Moderate",
                    800,
                    false,
                    45.59581,
                    -122.82419
            ));
            list.addTrail(new Trail("Newton Road to Newberry Road Hike",
                    "Hike the Wildwood to Forest Park's northern reaches",
                    9.4,
                    "Moderate",
                    2190,
                    false,
                    45.59156,
                    -122.80218
                    ));
        }
        if (region.equals("Clackamas/Milwaukie Area")) {
            list.addTrail(new Trail("Elk Rock Island Hike",
                    "Rock hop a Willamette River channel to an ancient volcano",
                    1.3,
                    "Easy",
                    130,
                    false,
                    45.4345,
                    -122.6440
            ));
            list.addTrail(new Trail(
                    "Mount Talbert Summit Loop Hike",
                    "Loop to the summit of Mt Talbert",
                    1.9,
                    "Easy",
                    490,
                    false,
                    45.42029,
                    -122.55234
            ));
            list.addTrail(new Trail(
                    "Mount Talbert West Loop Hike",
                    "Forested Loop",
                    1.9,
                    "Easy",
                    410,
                    false,
                    45.42029,
                    -122.55234
            ));
            list.addTrail(new Trail(
                    "Mount Talbert from Sunnyside Road Hike",
                    "Climb Mt Talbert from the backside ",
                    2.6,
                    "Easy",
                    450,
                    false,
                    45.43151,
                    -122.54440));
            return list;
        }
        if (region.equals("West Linn Area")) {
            list.addTrail(new Trail("Mary S. Young State Park Loop Hike",
                    "Hike through mixed native forest and along the Willamette River shore",
                    3.7,
                    "Easy",
                    300,
                    false,
                    45.38053,
                    -122.62804
            ));
            list.addTrail(new Trail("Burnside Park-Maddax Woods Hike",
                    "Short walk along a forested stretch of the Willamette River",
                    1.1,
                    "Easy",
                    115,
                    false,
                    45.3733,
                    -122.6203
            ));
            list.addTrail(new Trail("Palomino Loop Hike",
                    "Walk on narrow trails down Trillium Creek under old growth trees and loop back past a viewpoint",
                    1.9,
                    "Easy",
                    495,
                    false,
                    45.37673,
                    -122.64419
            ));
            list.addTrail(new Trail("Wilderness Park Loop Hike",
                    "Two loops in a stand of native forest; trails connect to Camassia Natural Area",
                    2.2,
                    "Easy",
                    390,
                    false,
                    45.36680,
                    -122.62388
            ));
            list.addTrail(new Trail("Camassia Natural Area Loop Hike",
                    "Pleasant loop through flower meadows",
                    1.4,
                    "Easy",
                    160,
                    false,
                    45.35922,
                    -122.61824
            ));
            list.addTrail(new Trail("Fields Bridge Hike",
                    "Tualatin River walk including glacial erratics and the story of the Willamette Meteorite",
                    1.5,
                    "Easy",
                    195,
                    false,
                    45.34655,
                    -122.67174
            ));
        }
        if (region.equals("Oregon City Area")) {
            list.addTrail(new Trail("Clackamette Loop Hike",
                    "Loop in Oregon City and Gladstone at the mouth of the Clackamas River",
                    4.3,
                    "Easy",
                    90,
                    false,
                    45.3717,
                    -122.6026
            ));
            list.addTrail(new Trail("McLoughlin Promenade Hike",
                    "Historic walk above Willamette Falls and to the McLoughlin House",
                    2.3,
                    "Easy",
                    275,
                    false,
                    45.35709,
                    -122.60811
            ));
            list.addTrail(new Trail("Canemah Bluff Loop Hike",
                    "Walk to clifftop viewpoints over the Willamette and a historic cemetery",
                    2.4,
                    "Easy",
                    290,
                    false,
                    45.34487,
                    -122.62571
            ));
        }
        if (region.equals("Multnomah Falls Area")) {
            list.addTrail(new Trail("Larch Mountain Crater Hike",
                    "Explore meadows in the crater of an extinct volcano",
                    5.9,
                    "Moderate",
                    1310,
                    false,
                    45.52929,
                    -122.088
            ));
            list.addTrail(new Trail("Sherrard Point Hike",
                    "Brief stair climb to a spectacular viewpoint",
                    0.6,
                    "Easy",
                    170,
                    false,
                    45.52929,
                    -122.088
            ));
            list.addTrail(new Trail("Mist Falls Hike",
                    "Very rough use path to the base of Oregon's second highest waterfall",
                    0.6,
                    "Moderate",
                    300,
                    false,
                    45.57551,
                    -122.13286
            ));
            list.addTrail(new Trail("Devil's Rest via Wahkeena Hike",
                    "Hike up pretty creek to a Gorge summit",
                    7.5,
                    "Moderate",
                    2550,
                    false,
                    45.57528,
                    -122.12801
            ));
            list.addTrail(new Trail("Fairy Falls Hike",
                    "Uphill trail to an intimate waterfall",
                    2.0,
                    "Moderate",
                    800,
                    false,
                    45.57528,
                    -122.12801
            ));
            list.addTrail(new Trail("Wahkeena Falls Hike",
                    "A paved trail past the falls to a viewpoint",
                    1.4,
                    "Moderate",
                    600,
                    false,
                    45.57528,
                    -122.12801
            ));
            list.addTrail(new Trail("Cougar Rock via Elevator Shaft Hike",
                    "Lost trail up talus slope to unique outcrop",
                    6.7,
                    "Difficult",
                    1860,
                    false,
                    45.57758,
                    -122.117
            ));
            list.addTrail(new Trail("Larch Mountain Hike",
                    "Trail of many falls to majestic 360 degree viewpoint ",
                    14.4,
                    "Difficult",
                    4010,
                    false,
                    45.57758,
                    -122.117
            ));
            list.addTrail(new Trail("Multnomah Falls Hike",
                    "Paved switchbacks to top of state's highest falls",
                    2.6,
                    "Moderate",
                    700,
                    false,
                    45.57758,
                    -122.117
            ));
            list.addTrail(new Trail("Multnomah-Wahkeena Loop Hike",
                    "A classic loop with 10 waterfalls",
                    4.9,
                    "Moderate",
                    1600,
                    false,
                    45.57758,
                    -122.117
            ));
            list.addTrail(new Trail("Bell Creek Loop Hike",
                    "Lessor used trail through varied forests, creeks",
                    14.5,
                    "Difficult",
                    3330,
                    false,
                    45.58849,
                    -122.07849
            ));
            list.addTrail(new Trail("Larch Mountain via Oneonta Trail Hike",
                    "Longer, quieter option to the top of Larch Mountain ",
                    17.2,
                    "Difficult",
                    4400,
                    false,
                    45.58849,
                    -122.07849
            ));
            list.addTrail(new Trail("Triple Falls Hike",
                    "Lush forest hike to a beautiful unique falls",
                    3.2,
                    "Moderate",
                    610,
                    false,
                    45.58849,
                    -122.07849
            ));
            list.addTrail(new Trail("Oneonta Gorge Hike",
                    "Wade up creek to spectacular hidden waterfall",
                    1.0,
                    "Moderate",
                    0,
                    false,
                    45.58948,
                    -122.07531
            ));
            list.addTrail(new Trail("Horsetail Falls Loop Hike",
                    "Nice lower elevation loop for beginners ",
                    2.6,
                    "Easy",
                    610,
                    false,
                    45.59044,
                    -122.06857
            ));
            list.addTrail(new Trail("Ponytail Falls Hike",
                    "Short steep hike to a walk-behind waterfall",
                    0.8,
                    "Easy",
                    360,
                    false,
                    45.59044,
                    -122.06857
            ));
            list.addTrail(new Trail("Rock of Ages Loop Hike",
                    "Scramble up an unmaintained trail past unique rock features",
                    10.0,
                    "Difficult",
                    3000,
                    false,
                    45.59044,
                    -122.06857
            ));
            list.addTrail(new Trail("Ainsworth Loop Hike",
                    "Easy nature loop for kids over 8",
                    0.4,
                    "Easy",
                    150,
                    false,
                    45.59232,
                    -122.0584
            ));
            list.addTrail(new Trail("Elowah Falls Hike",
                    "Easy hike to an impressive falls",
                    1.4,
                    "Easy",
                    280,
                    false,
                    45.6124,
                    -122.00428
            ));
            list.addTrail(new Trail("Munra Point from Yeon Trailhead Hike",
                    "Fun, difficult scramble to a 360 viewpoint",
                    7.4,
                    "Moderate",
                    2270,
                    false,
                    45.6124,
                    -122.00428
            ));
            list.addTrail(new Trail("Upper McCord Creek Falls Hike",
                    "Moderate hike to a viewpoints and waterfall",
                    2.0,
                    "Easy",
                    400,
                    false,
                    45.6124,
                    -122.00428
            ));
            list.addTrail(new Trail("Nesmith Point Hike",
                    "Classic conditioner hike through beautiful box canyon",
                    10.6,
                    "Difficult",
                    3800,
                    false,
                    45.6124,
                    -122.00428
            ));
            list.addTrail(new Trail("Nesmith-Oneonta Traverse Hike",
                    "Lesser used one-way shuttle over Yeon Mt",
                    14.1,
                    "Difficult",
                    3800,
                    false,
                    45.6124,
                    -122.00428
            ));
            list.addTrail(new Trail("Nesmith-Tanner Traverse Hike",
                    "One-way shuttle hike to Tooth Rock Trailhead",
                    16.7,
                    "Difficult",
                    4350,
                    false,
                    45.6124,
                    -122.00428
            ));
            list.addTrail(new Trail("Wauneka Point Hike",
                    "Long in and out to the viewpoint and ancient workings at Wauneka Point",
                    17.4,
                    "Difficult",
                    5680,
                    false,
                    45.6124,
                    -122.00428
            ));
        }

        if (region.equals("Cape Horn Area")) {
            list.addTrail(new Trail("Cape Horn Loop Hike",
                    "Trail loop in the western Gorge with spectacular clifftop views and a waterfall",
                    7.1,
                    "Moderate",
                    1350,
                    false,
                    45.58852,
                    -122.17874
            ));
            list.addTrail(new Trail("St. Cloud Loop Hike",
                    "A universal access trail through an old apple orchard and to the Columbia shore",
                    1.0,
                    "Easy",
                    25,
                    false,
                    45.6004,
                    -122.1117
            ));
            list.addTrail(new Trail("Sams Walker Loop Hike",
                    "A stroll around an old farm meadow on the banks of the Columbia",
                    1.1,
                    "Easy",
                    15,
                    false,
                    45.6118,
                    -122.0520
            ));
        }


        return list;
    }

    public static List<String> getStates()
    {
        /*List<String> list = new ArrayList<String>(Arrays.asList("Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut",
                "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas",
                "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota",
                "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey",
                "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon",
                "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas",
                "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"));*/
        List<String> list = new ArrayList<String>();
        list.add("Oregon");
        list.add("Washington");
        return list;
    }
    //public static List<String> getCities() { return getItems("cities", "city");}
    public static List<String> getRegions(String state)
    {
        List<String> list = new ArrayList<String>();
        if (state.equals("Oregon")) {
            list.add("Clackamas/Milwaukie Area");
            list.add("Lake Oswego Area");
            list.add("Multnomah Falls Area");
            list.add("Oregon City Area");
            list.add("Portland(Forest Park) Area");
            list.add("Portland(Powell Butte) Area");
            list.add("Portland(Southeast) Area");
            list.add("Portland(Southwest) Area");
            list.add("Portland(West Hills) Area");
            list.add("West Linn Area");

            //list.add("Crown Point Area");
            //list.add("Eagle Creek Area");
            //list.add("Starvation Creek Area");
            //list.add("Waucoma Ridge Area");
            return list;
        }
        if(state.equals("Washington")) {
            //list.add("Beacon Rock Area");
            list.add("Cape Horn Area");
            //list.add("Catherine Creek Area");
            list.add("Dog Mountain Area");
            return list;
        }
        return list;
    }

}
