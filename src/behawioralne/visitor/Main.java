package behawioralne.visitor;

import behawioralne.visitor.activity.Activity;
import behawioralne.visitor.activity.Squash;
import behawioralne.visitor.activity.Treadmill;
import behawioralne.visitor.activity.Weights;
import behawioralne.visitor.visitor.Visitor;
import behawioralne.visitor.visitor.VisitorImpl;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Visitor visitor = new VisitorImpl();

        Squash squash = new Squash(45);
        Treadmill treadmill = new Treadmill(200);
        Weights weights = new Weights(50, 10);

        List<Activity> activities = Arrays.asList(squash, treadmill, weights);
        activities.forEach(activity -> activity.accept(visitor));
    }
    
}
