package p386t;

import androidx.compose.foundation.interaction.C0419a;
import androidx.compose.foundation.interaction.C0420b;
import androidx.compose.foundation.interaction.C0421c;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import cm.InterfaceC2057q;
import dm.C5207g;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5301c1;
import p081e0.InterfaceC5312g0;
import p081e0.InterfaceC5336s0;
import p387t0.C9169u;
import p423v.InterfaceC9611i;
import p424v0.InterfaceC9619c;
import p424v0.InterfaceC9621e;
import sl.C9072e;

/* JADX INFO: renamed from: t.h */
/* JADX INFO: loaded from: classes.dex */
public final class C9116h implements InterfaceC9126r {

    /* JADX INFO: renamed from: a */
    public static final C9116h f47618a = new C9116h();

    /* JADX INFO: renamed from: t.h$a */
    public static final class a implements InterfaceC9127s {

        /* JADX INFO: renamed from: a */
        public final InterfaceC5301c1<Boolean> f47619a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC5301c1<Boolean> f47620b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC5301c1<Boolean> f47621c;

        public a(InterfaceC5312g0 interfaceC5312g0, InterfaceC5312g0 interfaceC5312g1, InterfaceC5312g0 interfaceC5312g2) {
            C5207g.m11111f(interfaceC5312g0, "isPressed");
            C5207g.m11111f(interfaceC5312g1, "isHovered");
            C5207g.m11111f(interfaceC5312g2, "isFocused");
            this.f47619a = interfaceC5312g0;
            this.f47620b = interfaceC5312g1;
            this.f47621c = interfaceC5312g2;
        }

        @Override // p386t.InterfaceC9127s
        /* JADX INFO: renamed from: d */
        public final void mo1547d(InterfaceC9619c interfaceC9619c) {
            C5207g.m11111f(interfaceC9619c, "<this>");
            interfaceC9619c.mo12668E0();
            if (this.f47619a.getValue().booleanValue()) {
                InterfaceC9621e.m18090U(interfaceC9619c, C9169u.m17496b(C9169u.f47699b, 0.3f), interfaceC9619c.mo12674d(), 122);
                return;
            }
            if (!this.f47620b.getValue().booleanValue() && !this.f47621c.getValue().booleanValue()) {
                return;
            }
            InterfaceC9621e.m18090U(interfaceC9619c, C9169u.m17496b(C9169u.f47699b, 0.1f), interfaceC9619c.mo12674d(), 122);
        }
    }

    @Override // p386t.InterfaceC9126r
    /* JADX INFO: renamed from: a */
    public final InterfaceC9127s mo1552a(InterfaceC9611i interfaceC9611i, InterfaceC0476a interfaceC0476a) {
        C5207g.m11111f(interfaceC9611i, "interactionSource");
        interfaceC0476a.mo1622c(1683566979);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        InterfaceC5312g0 interfaceC5312g0M1495a = C0421c.m1495a(interfaceC9611i, interfaceC0476a, 0);
        InterfaceC5312g0 interfaceC5312g0M1494a = C0420b.m1494a(interfaceC9611i, interfaceC0476a, 0);
        InterfaceC5312g0 interfaceC5312g0M1493a = C0419a.m1493a(interfaceC9611i, interfaceC0476a, 0);
        interfaceC0476a.mo1622c(1157296644);
        boolean zMo1665y = interfaceC0476a.mo1665y(interfaceC9611i);
        Object objMo1624d = interfaceC0476a.mo1624d();
        if (zMo1665y || objMo1624d == InterfaceC0476a.a.f3122a) {
            objMo1624d = new a(interfaceC5312g0M1495a, interfaceC5312g0M1494a, interfaceC5312g0M1493a);
            interfaceC0476a.mo1655t(objMo1624d);
        }
        interfaceC0476a.mo1661w();
        a aVar = (a) objMo1624d;
        interfaceC0476a.mo1661w();
        return aVar;
    }
}
