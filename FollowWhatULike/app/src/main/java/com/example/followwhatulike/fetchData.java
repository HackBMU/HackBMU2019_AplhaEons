package com.example.followwhatulike;

import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class fetchData extends AsyncTask<Void, Void, Void> {
    String data=" ";
    String dataParsed="";
    String singleParsed="";
    @Override
    protected Void doInBackground(Void... voids) {
        try {
            URL url=new URL("https://api.myjson.com/bins/rntfi");
            HttpURLConnection httpURLConnection=(HttpURLConnection) url.openConnection();
            InputStream inputStream=httpURLConnection.getInputStream();
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream));
            String line="";
            while(line!=null){
                line=bufferedReader.readLine();
                data=data+line;
            }

            JSONArray JA=new JSONArray(data);
            for(int i=0;i<JA.length();i++)
            {
                JSONObject JO=(JSONObject) JA.get(i);
                singleParsed="COURSE:"+ JO.get("course")+"\n"+
                        "TOTAL USERS VOTED:"+ JO.get("total_Users_Voted")+"\n"+
                        "RATING:"+ JO.get("Rating")+"\n"+
                        "CERTIFICATION:"+ JO.get("Certification")+"\n"+
                        "FEES:"+ JO.get("Fees")+"\n"+
                        "DURATION:"+ JO.get("Duration")+"\n";

                dataParsed=dataParsed+singleParsed+"\n";

            }
        }
        catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);

        Course_recommendation.data.setText(this.dataParsed);
        //MainActivity.data.setText(this.dataParsed);
    }
}
