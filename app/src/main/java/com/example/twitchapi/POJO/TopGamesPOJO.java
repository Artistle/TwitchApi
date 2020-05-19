package com.example.twitchapi.POJO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class TopGamesPOJO {
        @SerializedName("data")
        @Expose
        private ArrayList<Data> dataArrayList = new ArrayList<>();


        public ArrayList<Data> getDataArrayList() {
            return dataArrayList;
        }

        public void setDataArrayList(ArrayList<Data> dataArrayList) {
            this.dataArrayList = dataArrayList;
        }



    public class Data{

        @SerializedName("name")
        @Expose
        private String name;

        @SerializedName("box_art_url")
        @Expose
        private String box_art_url;

        @SerializedName("id")
        @Expose
        private long id;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getBox_art_url() {
            return box_art_url;
        }

        public void setBox_art_url(String box_art_url) {
            this.box_art_url = box_art_url;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }
    }
}
