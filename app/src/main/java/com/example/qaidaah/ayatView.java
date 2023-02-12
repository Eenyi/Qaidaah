package com.example.qaidaah;

public class ayatView {
    public String text;
    public String trans;

    public ayatView() {
        this.text = "";
        this.trans = "";
    }

    public ayatView(String text, String trans) {
        this.text = text;
        this.trans = trans;
    }

    public ayatView(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTrans() {
        return trans;
    }

    public void setTrans(String trans) {
        this.trans = trans;
    }
}
