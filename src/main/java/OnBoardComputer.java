public class OnBoardComputer implements BurnStream {

    @Override
    public int getNextBurn(DescentEvent status) {
        int burn = 0;
        if(status.getAltitude() > 15000){
            burn = 0;
        }
        else if (status.getAltitude() >= 1000 && status.getVelocity() >100){
            burn = 200;
        }   else if(status.getAltitude() > 1000 && status.getVelocity() <= 100){
            burn = 0;
        }
        else if(status.getAltitude() > 200 && status.getVelocity() > 100){
            burn = 200;
        }
        else if(status.getAltitude() > 200 && status.getVelocity() == 100){
            burn = 100;
        }
        else if(status.getAltitude() > 50 && status.getVelocity() > 100){
            burn = 200;
        }
        else if(status.getAltitude() > 50 && status.getVelocity() > 25){
            burn = 175;
        }
        else if(status.getAltitude() > 50 && status.getVelocity() == 25){
            burn = 100;
        }
        else if(status.getAltitude() > 10 && status.getVelocity() > 10){
            burn = 115;
        }
        else if(status.getAltitude() > 10 && status.getVelocity() == 10){
            burn = 100;
        }
        else if(status.getAltitude() <= 10 && status.getVelocity() >= 10){
            burn = 100 + (status.Velocity - 1);
        }
        else if(status.getAltitude() < 10 && status.getVelocity() == 1){
            burn = 100;
        }
        
        System.out.println(burn); /*hack!*/
        return burn;
    }

}
