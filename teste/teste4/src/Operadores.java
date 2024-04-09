public class Operadores {
    public float adicao (float v1, float v2){
        return v1+v2;
    }
    
    public float subtracao (float v1, float v2){
        return v1-v2;
    }

    public float multiplicacao (float v1, float v2){
        return v1*v2;
    }

    public float divisao (float v1, float v2){
        return v1/v2;
    }


    public float atb_soma (float v1, float v2){
        return v1+=v2; //v1 = v1 + v2
    }

    public float atb_subtracao (float v1, float v2){
        return v1-=v2; //v1 = v1 - v2
    }

    public float atb_multiplicacao (float v1, float v2){
        return v1*=v2; //v1 = v1 * v2
    }

    public float atb_divisao (float v1, float v2){
        return v1/=v2; //v1 = v1 / v2
    }


    public boolean igual (float v1, float v2){
        return v1 == v2;
    }

    public boolean maior (float v1, float v2){
        return v1 > v2;
    }

    public boolean menor (float v1, float v2){
        return v1 < v2;
    }

    public boolean diferente (float v1, float v2){
        return v1 != v2;
    }
    

    public boolean op_and (float v1, float v2){
        return v1 != v2 && v1 > v2;
    }

    public boolean op_or (float v1, float v2){
        return v1 >= v2 && v1 <= v2;
    }
}
