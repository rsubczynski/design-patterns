package behawioralne.visitor.activity;

import behawioralne.visitor.visitor.Visitor;

public interface Activity {

    void accept(Visitor visitor);
}
