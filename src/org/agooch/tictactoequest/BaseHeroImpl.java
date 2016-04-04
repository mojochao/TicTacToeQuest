package org.agooch.tictactoequest;

public abstract class BaseHeroImpl implements Hero {
    protected final String name;
    protected final char selector;

    public BaseHeroImpl(String name, char selector) {
        this.name = name;
        this.selector = selector;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPrompt() {
        return String.format("Hero %s: <%c>", name, selector);
    }

    @Override
    public char getSelector() {
        return selector;
    }
}
