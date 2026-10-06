package p000;

import androidx.cardview.widget.CardView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aid {

    /* JADX INFO: renamed from: a */
    public Object f424a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f425b;

    public aid(aif aifVar) {
        this.f425b = aifVar;
    }

    public aid(CardView cardView) {
        this.f425b = cardView;
    }

    /* JADX INFO: renamed from: a */
    public final void m753a(int i, int i2, int i3, int i4) {
        ((CardView) this.f425b).f1441d.set(i, i2, i3, i4);
        CardView cardView = (CardView) this.f425b;
        super/*android.widget.FrameLayout*/.setPadding(i + cardView.f1440c.left, i2 + ((CardView) this.f425b).f1440c.top, i3 + ((CardView) this.f425b).f1440c.right, i4 + ((CardView) this.f425b).f1440c.bottom);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m754b() {
        return ((CardView) this.f425b).f1439b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m755c() {
        return ((CardView) this.f425b).f1438a;
    }
}
