package model;

/**
 * Created by eugeny on 04.11.2015.
 */
public class Figure {

    private double[] x = {300,300,100,100,300,300,500,500,700,700,500,500,   300,300,100,100,300,300,500,500,700,700,500,500};
    private double[] y = {800,600,600,400,400,200,200,400,400,600,600,800,   800,800,600,400,400,200,200,400,400,600,600,800};
    private double[] z = {200,200,200,200,200,200,200,200,200,200,200,200,   100,100,100,100,100,100,100,100,100,100,100,100};
    private int[][] p =  {
            {0,1,10,11},
            {1,2,3,4},
            {4,5,6,7},
            {7,8,9,10},
            ////3d
            {0,12,13,1},
            {1,13,14,2},
            {2,14,15,3},
            {3,15,16,4},
            {4,16,17,5},
            {5,17,18,6},
            {6,18,19,7},
            {7,19,20,8},
            {8,20,21,9},//+
            {9,21,22,10},//
            {10,22,23,11},
            {0,12,23,11}


    };



    public int getFacesCount() {
        return p.length;
    }

    public Polygon3D getFace(int i) {
        if (i<0 || i>=p.length) {
            throw new IndexOutOfBoundsException("face num must be in[0..."+(p.length-1)+"], but was:" + i);
        }
        Point3D[] p3d = new Point3D[p[i].length];
        for (int j = 0; j < p[i].length; j++) {
            p3d[j] = new Point3D(x[p[i][j]], y[p[i][j]], z[p[i][j]]);
        }
        return new Polygon3D(p3d);
    }
}




/*
*
*
*  private double[] x = {300,300,100,100,300,300,500,500,700,700,500,500,   300,300,100,100,300,300,500,500,700,700,500,500};
    private double[] y = {800,800,600,400,400,200,200,400,400,600,600,800,   800,800,600,400,400,200,200,400,400,600,600,800};
    private double[] z = {100,100,100,100,100,100,100,100,100,100,100,100,   200,200,200,200,200,200,200,200,200,200,200,200};
    private int[][] p =  {
            {0,1,10,11},
            {1,2,3,4},
            {4,5,6,8},
            {7,8,9,10}


    };*/