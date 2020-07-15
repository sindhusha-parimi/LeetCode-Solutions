class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
		int count=1;
        N = (N - 1) % 14 + 1;
		while(count<=N) {
			cells=rep(cells);
			count++;	
		}
		return cells;
	}

public int[] rep(int[] cells) {
		int[] res=new int[8];
	for(int i=0;i<8;i++) {
		if(i==0||i==7) {
			res[i]=0;	
		}
		else if(cells[i-1]==0&&cells[i+1]==0 ||cells[i-1]==1&&cells[i+1]==1) {
			res[i]=1;
		}
		else res[i]=0;
	}return res;	
	}
    }
