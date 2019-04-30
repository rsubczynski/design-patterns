package behawioralne.visitor.visitor;

import behawioralne.visitor.activity.Squash;
import behawioralne.visitor.activity.Treadmill;
import behawioralne.visitor.activity.Weights;

public interface Visitor {

    void visit(Treadmill treadmill);
    void visit(Weights weights);
    void visit(Squash squash);

}
