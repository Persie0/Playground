package p021b0;

import dm.C5207g;
import p260m8.C7499b;
import p375s0.C8941c;
import p375s0.C8944f;
import p470x1.InterfaceC10015c;

/* JADX INFO: renamed from: b0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1279d {

    /* JADX INFO: renamed from: a */
    public static final float f7961a = 10;

    /* JADX INFO: renamed from: a */
    public static final float m4782a(InterfaceC10015c interfaceC10015c, boolean z10, long j10) {
        C5207g.m11111f(interfaceC10015c, "$this$getRippleEndRadius");
        float fM17163b = C8941c.m17163b(C7499b.m14932c(C8944f.m17177d(j10), C8944f.m17175b(j10))) / 2.0f;
        if (z10) {
            fM17163b += interfaceC10015c.mo1463i0(f7961a);
        }
        return fM17163b;
    }
}
