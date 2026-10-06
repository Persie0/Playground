package p000;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: lp */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0803lp {

    /* JADX INFO: renamed from: a */
    protected final AbstractC0812ly f38877a;

    /* JADX INFO: renamed from: b */
    public int f38878b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c */
    final Rect f38879c = new Rect();

    public AbstractC0803lp(AbstractC0812ly abstractC0812ly) {
        this.f38877a = abstractC0812ly;
    }

    /* JADX INFO: renamed from: p */
    public static AbstractC0803lp m15796p(AbstractC0812ly abstractC0812ly) {
        return new C0801ln(abstractC0812ly);
    }

    /* JADX INFO: renamed from: q */
    public static AbstractC0803lp m15797q(AbstractC0812ly abstractC0812ly, int i) {
        switch (i) {
            case 0:
                return m15796p(abstractC0812ly);
            default:
                return m15798r(abstractC0812ly);
        }
    }

    /* JADX INFO: renamed from: r */
    public static AbstractC0803lp m15798r(AbstractC0812ly abstractC0812ly) {
        return new C0802lo(abstractC0812ly);
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo15746a(View view);

    /* JADX INFO: renamed from: b */
    public abstract int mo15747b(View view);

    /* JADX INFO: renamed from: c */
    public abstract int mo15748c(View view);

    /* JADX INFO: renamed from: d */
    public abstract int mo15749d(View view);

    /* JADX INFO: renamed from: e */
    public abstract int mo15750e();

    /* JADX INFO: renamed from: f */
    public abstract int mo15751f();

    /* JADX INFO: renamed from: g */
    public abstract int mo15752g();

    /* JADX INFO: renamed from: h */
    public abstract int mo15753h();

    /* JADX INFO: renamed from: i */
    public abstract int mo15754i();

    /* JADX INFO: renamed from: j */
    public abstract int mo15755j();

    /* JADX INFO: renamed from: k */
    public abstract int mo15756k();

    /* JADX INFO: renamed from: l */
    public abstract int mo15757l(View view);

    /* JADX INFO: renamed from: m */
    public abstract int mo15758m(View view);

    /* JADX INFO: renamed from: n */
    public abstract void mo15759n(int i);

    /* JADX INFO: renamed from: o */
    public final int m15799o() {
        if (this.f38878b == Integer.MIN_VALUE) {
            return 0;
        }
        return mo15756k() - this.f38878b;
    }
}
