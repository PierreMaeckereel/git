package senCity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class TreeTraces extends AbstractTraces {
	protected Node node;
	protected static int taille;
	
	public TreeTraces() {
		super();
		taille = 0;
	}
	
	public void initialiser() {
		node = new Node();
	}

	
	public int taille() {
		return taille;
	}

	public void ajouter(Trace t) {
		node.ajouter(t,0);
		taille++;
	}

	public Traces extract(String ssid) {
		boolean trouve = false;
		int lengthSSID = ssid.length();
		int i = 0;
		Node n = this.node;
		while(!trouve && n.getLettre() != '\u0000') {
			char charSSID = ssid.charAt(i);
			if(n.getLettre() == charSSID) {
				if(lengthSSID-1 == i) {
					trouve = true;
				}
				else {
					n = n.getFils(); 
				}
			}
			else {
				n = n.getFrere();
			}
			i++;
		}
		if(trouve) {
			return n.getTraces();
		}
		else {
			return null;
		}
	}

	
	public String toString() {
		
		return null;
	}
	
	public static void main(String args[]) throws IOException {
		TreeTraces tt = new TreeTraces();
		tt.load("capture_wifi_2.csv","capture_gps_2.csv",30);
		//tt.save("treeTracesSave");
		System.out.println(tt.taille());
	}

}
