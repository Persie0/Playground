package p000;

import androidx.compose.foundation.gestures.C0097e;
import kotlin.Pair;

/* JADX INFO: renamed from: ag */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0018ag implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f593a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0097e f594b;

    public /* synthetic */ C0018ag(C0097e c0097e, int i) {
        this.f593a = i;
        this.f594b = c0097e;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005f  */
    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        float fM852f;
        int i = this.f593a;
        C0097e c0097e = this.f594b;
        switch (i) {
            case 0:
                Object value = ((xc9) c0097e.f2243l).getValue();
                if (value != null) {
                    return value;
                }
                float fM19861h = c0097e.f2241j.m19861h();
                t66 t66Var = c0097e.f2238g;
                if (Float.isNaN(fM19861h)) {
                    return ((xc9) t66Var).getValue();
                }
                xc9 xc9Var = (xc9) t66Var;
                float fM133f = c0097e.m849c().m133f(xc9Var.getValue());
                if (Float.isNaN(fM133f) || fM19861h == fM133f) {
                    return xc9Var.getValue();
                }
                Object objM128a = c0097e.m849c().m128a(fM19861h);
                return objM128a == null ? xc9Var.getValue() : objM128a;
            case 1:
                float fM133f2 = c0097e.m849c().m133f(((xc9) c0097e.f2239h).getValue());
                float fM133f3 = c0097e.m849c().m133f(c0097e.f2240i.getValue()) - fM133f2;
                float fAbs = Math.abs(fM133f3);
                if (Float.isNaN(fAbs) || fAbs <= 1.0E-6f) {
                    fM852f = 1.0f;
                } else {
                    fM852f = (c0097e.m852f() - fM133f2) / fM133f3;
                    if (fM852f < 1.0E-6f) {
                        fM852f = 0.0f;
                    } else if (fM852f > 0.999999f) {
                        fM852f = 1.0f;
                    }
                }
                return Float.valueOf(fM852f);
            case 2:
                return c0097e.m849c();
            default:
                return new Pair(c0097e.m849c(), c0097e.f2240i.getValue());
        }
    }
}
