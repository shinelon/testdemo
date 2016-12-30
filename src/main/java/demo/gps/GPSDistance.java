package demo.gps;

public class GPSDistance {	
	
	private static double EARTH_RADIUS = 6378.137;
	private static double rad(double d)
	{
	    return d * Math.PI / 180.0;
	}
	public static double GetDistance(double lat1, double lng1, double lat2, double lng2)
	{
	    double radLat1 = rad(lat1);
	    double radLat2 = rad(lat2);
	    double a = radLat1 - radLat2;
	    double b = rad(lng1) - rad(lng2);
	    double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a/2),2) + 
	     Math.cos(radLat1)*Math.cos(radLat2)*Math.pow(Math.sin(b/2),2)));
	    s = s * EARTH_RADIUS;
	    s = Math.round(s * 10000) / 10000;
	    return s;
	}
	public static void main(String[] args) {
		double lat1=39.9118680000;
		double lng1=116.4063820000;
		
		double lat2=39.9129750000;
		double lng2=116.4983680000;
		System.out.println(GetDistance(lat1, lng1, lat2, lng2));	
		
	}
}

