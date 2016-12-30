package demo.sigar;

import org.hyperic.sigar.CpuPerc;
import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;

public class SigarDemo {
	public static void main(String[] args) {
		try {
			Sigar sigar = SigarUtil.getInstance();
			CpuPerc cpu = sigar.getCpuPerc();
			System.out.println(String.valueOf(cpu.getCombined()));
		} catch (SigarException e) {
			e.printStackTrace();
		}
	}
}
