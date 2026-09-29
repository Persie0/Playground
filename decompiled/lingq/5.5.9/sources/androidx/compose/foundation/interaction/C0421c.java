package androidx.compose.foundation.interaction;

import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import dm.C5207g;
import p081e0.C5333r;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5312g0;
import p081e0.InterfaceC5336s0;
import p338qd.C8573r0;
import p423v.InterfaceC9611i;
import sl.C9072e;

/* JADX INFO: renamed from: androidx.compose.foundation.interaction.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0421c {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC5312g0 m1495a(InterfaceC9611i interfaceC9611i, InterfaceC0476a interfaceC0476a, int i10) {
        C5207g.m11111f(interfaceC9611i, "<this>");
        interfaceC0476a.mo1622c(-1692965168);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        interfaceC0476a.mo1622c(-492369756);
        Object objMo1624d = interfaceC0476a.mo1624d();
        Object obj = InterfaceC0476a.a.f3122a;
        if (objMo1624d == obj) {
            objMo1624d = C8573r0.m16684L0(Boolean.FALSE);
            interfaceC0476a.mo1655t(objMo1624d);
        }
        interfaceC0476a.mo1661w();
        InterfaceC5312g0 interfaceC5312g0 = (InterfaceC5312g0) objMo1624d;
        interfaceC0476a.mo1622c(511388516);
        boolean zMo1665y = interfaceC0476a.mo1665y(interfaceC9611i) | interfaceC0476a.mo1665y(interfaceC5312g0);
        Object objMo1624d2 = interfaceC0476a.mo1624d();
        if (zMo1665y || objMo1624d2 == obj) {
            objMo1624d2 = new PressInteractionKt$collectIsPressedAsState$1$1(interfaceC9611i, interfaceC5312g0, null);
            interfaceC0476a.mo1655t(objMo1624d2);
        }
        interfaceC0476a.mo1661w();
        C5333r.m11460b(interfaceC9611i, (InterfaceC2056p) objMo1624d2, interfaceC0476a);
        interfaceC0476a.mo1661w();
        return interfaceC5312g0;
    }
}
