package entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * 火车座位号及剩余描述
 * @author tarena
 */
public class TrainSeat {
    private String seatType;     //座位类型
    private int[][][] seatLayout=new int[2][10][5];//剩余情况,每种火车每种车厢都是2车10排5列  
    public TrainSeat() {
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<10;j++)
			{
				for(int t=0;t<5;t++)					
				{

					seatLayout[i][j][t]=0;
				}
			}
		}
	}
	public String getSeatType() {
		return seatType;
	}
	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}
	public int[][][] getSeatLayout() {
		return seatLayout;
	}
	public void setSeatLayout(int[][][] seatLayout) {
		this.seatLayout = seatLayout;
	}  
	
	@Override
	public String toString() {
		return "TrainSeat [seatType=" + seatType + ", seatLayout=" + Arrays.toString(seatLayout) + "]";
	}
	public static void main(String[] args) {
		TrainSeat seat1=new TrainSeat();
		TrainSeat seat2=new TrainSeat();
		TrainSeat seat3=new TrainSeat();
		//seat1.setSeatType("硬座");
		//seat2.setSeatType("硬卧");
		//seat3.setSeatType("软卧");
		seat1.setSeatType("商务座");
		seat2.setSeatType("一等座");
		seat3.setSeatType("二等座");
		List<TrainSeat> trainSeats=new ArrayList<TrainSeat>();
		trainSeats.add(seat1);
		trainSeats.add(seat2);
		trainSeats.add(seat3);
		JSONArray jsonArray=JSONArray.fromObject(trainSeats);
		System.out.println(jsonArray.toString());
        //JSONObject jsonObject=JSONObject.fromObject(seat);
        //JSONObject jsonObject2=JSONObject.fromObject(jsonObject);
        //System.out.println(jsonObject);
        //seat=(TrainSeat) JSONObject.toBean(jsonObject2, TrainSeat.class);
        
	}
}
