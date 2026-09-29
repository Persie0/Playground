package p000;

import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class tx8 extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public sx8 f63061a;

    /* JADX INFO: renamed from: b */
    public kw8 f63062b;

    public final sx8 getSentenceWord() {
        sx8 sx8Var = this.f63061a;
        if (sx8Var != null) {
            return sx8Var;
        }
        fa4.m11636J("sentenceWord");
        throw null;
    }

    public final void setListener(kw8 kw8Var) {
        kw8Var.getClass();
        this.f63062b = kw8Var;
    }

    public final void setSentenceWord(sx8 sx8Var) {
        sx8Var.getClass();
        this.f63061a = sx8Var;
    }
}
