package week1.javaObj.domain;

public enum Grade {
    BRONZE{
         double getRatio(){
             return 0.1;
         }
    },
    SILVER{
        double getRatio(){
            return 0.2;
        }
    },
    GOLD{
        double getRatio(){
            return 0.3;
        }
    };

    abstract double getRatio();
}
