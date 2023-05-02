

public class Lattice{

static int countLattice(int	r){
	if(r <= 0 )	return	0;

	int	counting	=	4; // Since (r, 0)(0, r)(-r, 0)(0, -r) apply
	
	for(int x = 1; x < r; x++){
		int	ySquare	=	r*r - x*x;
		int	y =	(int) Math.sqrt(ySquare);
		
		if(y*y == ySquare){
			counting += 4 ;			
		}
	}
	
	return	counting;

}

public static void main(String[] args){
	System.out.println("Number of lattice : " + countLattice(0));
	
}


}
