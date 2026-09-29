package p386t;

import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.unit.LayoutDirection;
import dm.C5207g;
import p338qd.C8573r0;
import p375s0.C8942d;
import p375s0.C8944f;
import p387t0.AbstractC9134a0;
import p387t0.InterfaceC9154k0;
import p470x1.InterfaceC10015c;

/* JADX INFO: renamed from: t.g */
/* JADX INFO: loaded from: classes.dex */
public final class C9115g {

    /* JADX INFO: renamed from: a */
    public static final float f47615a = 30;

    /* JADX INFO: renamed from: b */
    public static final InterfaceC0500b f47616b;

    /* JADX INFO: renamed from: c */
    public static final InterfaceC0500b f47617c;

    /* JADX INFO: renamed from: t.g$a */
    public static final class a implements InterfaceC9154k0 {
        @Override // p387t0.InterfaceC9154k0
        /* JADX INFO: renamed from: a */
        public final AbstractC9134a0 mo17359a(long j10, LayoutDirection layoutDirection, InterfaceC10015c interfaceC10015c) {
            C5207g.m11111f(layoutDirection, "layoutDirection");
            C5207g.m11111f(interfaceC10015c, "density");
            float fMo1464s0 = interfaceC10015c.mo1464s0(C9115g.f47615a);
            return new AbstractC9134a0.b(new C8942d(0.0f, -fMo1464s0, C8944f.m17177d(j10), C8944f.m17175b(j10) + fMo1464s0));
        }
    }

    /* JADX INFO: renamed from: t.g$b */
    public static final class b implements InterfaceC9154k0 {
        @Override // p387t0.InterfaceC9154k0
        /* JADX INFO: renamed from: a */
        public final AbstractC9134a0 mo17359a(long j10, LayoutDirection layoutDirection, InterfaceC10015c interfaceC10015c) {
            C5207g.m11111f(layoutDirection, "layoutDirection");
            C5207g.m11111f(interfaceC10015c, "density");
            float fMo1464s0 = interfaceC10015c.mo1464s0(C9115g.f47615a);
            return new AbstractC9134a0.b(new C8942d(-fMo1464s0, 0.0f, C8944f.m17177d(j10) + fMo1464s0, C8944f.m17175b(j10)));
        }
    }

    static {
        int i10 = InterfaceC0500b.f3324m;
        InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
        f47616b = C8573r0.m16701U(aVar, new a());
        f47617c = C8573r0.m16701U(aVar, new b());
    }
}
