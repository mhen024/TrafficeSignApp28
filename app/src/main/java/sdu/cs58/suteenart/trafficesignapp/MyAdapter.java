package sdu.cs58.suteenart.trafficesignapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

//ทำหน้าที่สร้าง layout เสมือนเพื่อแสดงผลบนหน้า mainactivity
public class MyAdapter extends BaseAdapter{
    //ประกาศตัวแปร
    private Context context;
    //เก็บข้อมูล logo ป้าย
    private int[] ints;
    //เก็บข้อมูลชื่อรายละเอียดป้าย
    private String[] titleStrings, detailStrings;

    public MyAdapter(Context context, int[] ints, String[] titleStrings, String[] detailStrings) {
        this.context = context;
        this.ints = ints;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
    }
//นับจำนวนข้อมูลใน Array
    @Override
    public int getCount() {
        return ints.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {//รับข้อมูลจาก getcount มาแสดง

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.my_listview, viewGroup, false);

        //ผูกตัวแปรบน java กับ Element บน xml ที่หน้า mylistview
        ImageView imageView = view1.findViewById(R.id.imageView);
        TextView titleTextView = view1.findViewById(R.id.txv1);
        TextView detailTextView = view1.findViewById(R.id.txv2);

        //Show data นำข้อมูลไปแสดงผลบนแอบ
        imageView.setImageResource(ints[i]);
        titleTextView.setText(titleStrings[i]);
        detailTextView.setText(detailStrings[i]);
        return view1;
    }
}//End Class
