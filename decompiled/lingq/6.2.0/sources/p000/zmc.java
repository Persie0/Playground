package p000;

import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zmc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f71786a = new C0282a(2117431122, false, new de1(2));

    /* JADX INFO: renamed from: b */
    public static final C0282a f71787b = new C0282a(1017077348, false, new be1(26));

    static {
        new C0282a(-177772736, false, new be1(27));
    }

    /* JADX INFO: renamed from: a */
    public static final void m25701a(C3275kv c3275kv, vi3 vi3Var) {
        c3275kv.getClass();
        C3275kv c3275kv2 = new C3275kv(999);
        int i = c3275kv.f49254c;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            c3275kv2.put(c3275kv.m15974f(i2), c3275kv.m15977i(i2));
            i2++;
            i3++;
            if (i3 == 999) {
                vi3Var.invoke(c3275kv2);
                c3275kv2.clear();
                i3 = 0;
            }
        }
        if (i3 > 0) {
            vi3Var.invoke(c3275kv2);
        }
    }
}
