package org.openhab.habdroid.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.qfdqc.views.seattable.SeatTable;

import org.openhab.habdroid.R;

public class LightSelect extends AppCompatActivity {
    public SeatTable seatTableView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.seat_select_activity);

        seatTableView = (SeatTable) findViewById(R.id.seatView);
        seatTableView.setScreenName("讲台");//设置屏幕名称
        seatTableView.setLightSelect(1);
        seatTableView.setMaxSelected(90);//设置最多选中

        seatTableView.setSeatChecker(new SeatTable.SeatChecker() {

            @Override
            public boolean isValidSeat(int row, int column) {
                if (row==0) {
                    return column==3||column==7;
                }
                if(column==2||column==5||column==8) {
                    return (row%2)==0;
                }
                return false;
            }

            @Override
            public boolean isSold(int row, int column) {
                return false;
            }

            @Override
            public void checked(int row, int column) {

            }

            @Override
            public void unCheck(int row, int column) {

            }

            @Override
            public String[] checkedSeatTxt(int row, int column) {
                return null;
            }

        });
        seatTableView.setData(10,11);

    }

}
