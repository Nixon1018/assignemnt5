package org.example;

import java.util.logging.Logger;

class Point{
    private static final Logger LOGGER=Logger.getLogger("InfoLogging");
    double x;
    double y;
    Point(double p1,double p2){
        x=p1;
        y=p2;
    }
    String check(double x,double y)
    {
        return ( this.x==x && this.y==y)?"true":"false";

    }
    Point(Point p){
        x=p.x;
        y=p.y;
    }

}