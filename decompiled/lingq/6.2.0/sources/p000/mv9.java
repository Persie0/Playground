package p000;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.AbstractC0278f;

/* JADX INFO: loaded from: classes.dex */
public final class mv9 {

    /* JADX INFO: renamed from: g */
    public static final fs6 f51890g = d32.m10027Y(new am8(28), new wx8(13));

    /* JADX INFO: renamed from: a */
    public final qc9 f51891a;

    /* JADX INFO: renamed from: b */
    public final qc9 f51892b = AbstractC0278f.m1256f(0.0f);

    /* JADX INFO: renamed from: c */
    public final sc9 f51893c = AbstractC0278f.m1257g(0);

    /* JADX INFO: renamed from: d */
    public e28 f51894d = e28.f36619e;

    /* JADX INFO: renamed from: e */
    public long f51895e = cx9.f34692b;

    /* JADX INFO: renamed from: f */
    public final t66 f51896f;

    public mv9(Orientation orientation, float f) {
        this.f51891a = AbstractC0278f.m1256f(f);
        this.f51896f = AbstractC0278f.m1259i(orientation, tr3.f62761g);
    }

    /* JADX INFO: renamed from: a */
    public final void m17057a(Orientation orientation, e28 e28Var, int i, int i2) {
        float f;
        float f2 = i2 - i;
        this.f51892b.m19862i(f2);
        float f3 = e28Var.f36620a;
        float f4 = e28Var.f36621b;
        e28 e28Var2 = this.f51894d;
        float f5 = e28Var2.f36620a;
        qc9 qc9Var = this.f51891a;
        if (f3 != f5 || f4 != e28Var2.f36621b) {
            boolean z = orientation == Orientation.Vertical;
            if (z) {
                f3 = f4;
            }
            float f6 = z ? e28Var.f36623d : e28Var.f36622c;
            float fM19861h = qc9Var.m19861h();
            float f7 = i;
            float f8 = fM19861h + f7;
            if (f6 <= f8 && (f3 >= fM19861h || f6 - f3 <= f7)) {
                f = (f3 >= fM19861h || f6 - f3 > f7) ? 0.0f : f3 - fM19861h;
            } else {
                f = f6 - f8;
            }
            qc9Var.m19862i(qc9Var.m19861h() + f);
            this.f51894d = e28Var;
        }
        qc9Var.m19862i(l70.m15944g(qc9Var.m19861h(), 0.0f, f2));
        this.f51893c.m21223i(i);
    }
}
