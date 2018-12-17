public class Solver implements SolverInterface{
    private Configuration c;
    private int ts;
    public Solver(){
        ts = 0;
    }
    public void set(Configuration sokoban){
        c = sokoban;
    }
	public Configuration getConfiguration(){
        return c;
    }
	public boolean stop(){
        int i;
        int j;
        int k,l,m,n,p;
        for(i=0;i<c.getCaisses().size();i++){
            if(!c.estCible(c.getCaisses().get(i).getPosition())){
                for(j=0;j<c.getCaisses().size();j++){
                    k=0;l=0;m=0;n=0;p=0;
                    if(c.getNiveau().get(c.getCaisses().get(j).getPosition().add(Direction.HAUT)).getType()==Type.MUR){
                        k++;
                    }
                    if(c.getNiveau().get(c.getCaisses().get(j).getPosition().add(Direction.BAS)).getType()==Type.MUR){
                        k++;
                    }
                    if(c.getNiveau().get(c.getCaisses().get(j).getPosition().add(Direction.GAUCHE)).getType()==Type.MUR){
                        k++;
                    }
                    if(c.getNiveau().get(c.getCaisses().get(j).getPosition().add(Direction.DROITE)).getType()==Type.MUR){
                        k++;
                    }
                    if(k>1){
                        return true;
                    }
                    if(k==1){
                        if(c.getNiveau().get(c.getCaisses().get(j).getPosition().add(Direction.HAUT)).getType()==Type.CAISSE){
                            if(c.getNiveau().get(c.getCaisses().get(j).getPosition().add(Direction.HAUT)).getType()==Type.MUR){
                                return true;
                            }
                            if(c.getNiveau().get(c.getCaisses().get(j).getPosition().add(Direction.BAS)).getType()==Type.MUR){
                                return true;
                            }
                            if(c.getNiveau().get(c.getCaisses().get(j).getPosition().add(Direction.GAUCHE)).getType()==Type.MUR){
                                return true;
                            }
                            if(c.getNiveau().get(c.getCaisses().get(j).getPosition().add(Direction.DROITE)).getType()==Type.MUR){
                                return true;
                            }
                        }
                        if(c.getNiveau().get(c.getCaisses().get(j).getPosition().add(Direction.BAS)).getType()==Type.CAISSE){
                            if(c.getNiveau().get(c.getCaisses().get(j).getPosition().add(Direction.HAUT)).getType()==Type.MUR){
                                return true;
                            }
                            if(c.getNiveau().get(c.getCaisses().get(j).getPosition().add(Direction.BAS)).getType()==Type.MUR){
                                return true;
                            }
                            if(c.getNiveau().get(c.getCaisses().get(j).getPosition().add(Direction.GAUCHE)).getType()==Type.MUR){
                                return true;
                            }
                            if(c.getNiveau().get(c.getCaisses().get(j).getPosition().add(Direction.DROITE)).getType()==Type.MUR){
                                return true;
                            }
                        }
                        if(c.getNiveau().get(c.getCaisses().get(j).getPosition().add(Direction.GAUCHE)).getType()==Type.CAISSE){
                            if(c.getNiveau().get(c.getCaisses().get(j).getPosition().add(Direction.HAUT)).getType()==Type.MUR){
                                return true;
                            }
                            if(c.getNiveau().get(c.getCaisses().get(j).getPosition().add(Direction.BAS)).getType()==Type.MUR){
                                return true;
                            }
                            if(c.getNiveau().get(c.getCaisses().get(j).getPosition().add(Direction.GAUCHE)).getType()==Type.MUR){
                                return true;
                            }
                            if(c.getNiveau().get(c.getCaisses().get(j).getPosition().add(Direction.DROITE)).getType()==Type.MUR){
                                return true;
                            }
                        }
                        if(c.getNiveau().get(c.getCaisses().get(j).getPosition().add(Direction.DROITE)).getType()==Type.CAISSE){
                            if(c.getNiveau().get(c.getCaisses().get(j).getPosition().add(Direction.HAUT)).getType()==Type.MUR){
                                return true;
                            }
                            if(c.getNiveau().get(c.getCaisses().get(j).getPosition().add(Direction.BAS)).getType()==Type.MUR){
                                return true;
                            }
                            if(c.getNiveau().get(c.getCaisses().get(j).getPosition().add(Direction.GAUCHE)).getType()==Type.MUR){
                                return true;
                            }
                            if(c.getNiveau().get(c.getCaisses().get(j).getPosition().add(Direction.DROITE)).getType()==Type.MUR){
                                return true;
                            }
                        }
                    }
                    
                }
                return false;
            }
		}
        return false;
    }
	public int getTotalSteps(){
        return ts;
    }
	public void step(){
        int i = (int)(Math.random()*4);
        if(i==0){
            c.getJoueur().bougerVers(Direction.HAUT);
        }
        if(i==1){
            c.getJoueur().bougerVers(Direction.BAS);
        }
        if(i==2){
            c.getJoueur().bougerVers(Direction.GAUCHE);
        }
        if(i==3){
            c.getJoueur().bougerVers(Direction.DROITE);
        }
        ts++;
    }
}