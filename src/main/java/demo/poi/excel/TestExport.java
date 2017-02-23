package demo.poi.excel;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestExport {

	public static void main(String[] args) throws Exception {

    String title = "manifestIExportTitle";
	String[] rowsName = new String[]{"序号","货物运输批次号","提运单号","状态","录入人","录入时间"};
	List<Object[]>  dataList = new ArrayList<Object[]>();
	Object[] objs = null;
	for (int i = 0; i <9; i++) {
		objs = new Object[rowsName.length];
		objs[0] = 1;
		objs[1] = 2;
		objs[2] = 3;
		objs[3] = 4;
		objs[4] = 5;
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = df.format(new Date());
		objs[5] = date;
		dataList.add(objs);
	}
	ExportExcel ex = new ExportExcel(title, rowsName, dataList);
	ex.export("D:\\export2.xls");
	}

}
