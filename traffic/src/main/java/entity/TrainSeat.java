package entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * ����λ�ż�ʣ������
 * @author tarena
 */
public class TrainSeat {
    private String seatType;     //��λ����
    private int[][][] seatLayout=new int[2][10][5];//ʣ�����,ÿ�ֻ�ÿ�ֳ��ᶼ��2��10��5��  
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
		//seat1.setSeatType("Ӳ��");
		//seat2.setSeatType("Ӳ��");
		//seat3.setSeatType("����");
		seat1.setSeatType("������");
		seat2.setSeatType("һ����");
		seat3.setSeatType("������");
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
