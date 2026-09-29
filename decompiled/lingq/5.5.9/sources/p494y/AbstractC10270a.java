package p494y;

import androidx.compose.p017ui.unit.LayoutDirection;
import dm.C5207g;
import p375s0.C8944f;
import p387t0.AbstractC9134a0;
import p387t0.InterfaceC9154k0;
import p470x1.InterfaceC10015c;

/* JADX INFO: renamed from: y.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10270a implements InterfaceC9154k0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC10271b f51713a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC10271b f51714b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC10271b f51715c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC10271b f51716d;

    public AbstractC10270a(InterfaceC10271b interfaceC10271b, InterfaceC10271b interfaceC10271b2, InterfaceC10271b interfaceC10271b3, InterfaceC10271b interfaceC10271b4) {
        C5207g.m11111f(interfaceC10271b, "topStart");
        C5207g.m11111f(interfaceC10271b2, "topEnd");
        C5207g.m11111f(interfaceC10271b3, "bottomEnd");
        C5207g.m11111f(interfaceC10271b4, "bottomStart");
        this.f51713a = interfaceC10271b;
        this.f51714b = interfaceC10271b2;
        this.f51715c = interfaceC10271b3;
        this.f51716d = interfaceC10271b4;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ AbstractC10270a m19240c(AbstractC10270a abstractC10270a, C10272c c10272c, C10272c c10272c2, C10272c c10272c3, int i10) {
        InterfaceC10271b interfaceC10271b = c10272c;
        if ((i10 & 1) != 0) {
            interfaceC10271b = abstractC10270a.f51713a;
        }
        InterfaceC10271b interfaceC10271b2 = (i10 & 2) != 0 ? abstractC10270a.f51714b : null;
        InterfaceC10271b interfaceC10271b3 = c10272c2;
        if ((i10 & 4) != 0) {
            interfaceC10271b3 = abstractC10270a.f51715c;
        }
        InterfaceC10271b interfaceC10271b4 = c10272c3;
        if ((i10 & 8) != 0) {
            interfaceC10271b4 = abstractC10270a.f51716d;
        }
        return abstractC10270a.mo19241b(interfaceC10271b, interfaceC10271b2, interfaceC10271b3, interfaceC10271b4);
    }

    @Override // p387t0.InterfaceC9154k0
    /* JADX INFO: renamed from: a */
    public final AbstractC9134a0 mo17359a(long j10, LayoutDirection layoutDirection, InterfaceC10015c interfaceC10015c) {
        C5207g.m11111f(layoutDirection, "layoutDirection");
        C5207g.m11111f(interfaceC10015c, "density");
        float fMo19243a = this.f51713a.mo19243a(j10, interfaceC10015c);
        float fMo19243a2 = this.f51714b.mo19243a(j10, interfaceC10015c);
        float fMo19243a3 = this.f51715c.mo19243a(j10, interfaceC10015c);
        float fMo19243a4 = this.f51716d.mo19243a(j10, interfaceC10015c);
        float fM17176c = C8944f.m17176c(j10);
        float f3 = fMo19243a + fMo19243a4;
        if (f3 > fM17176c) {
            float f10 = fM17176c / f3;
            fMo19243a *= f10;
            fMo19243a4 *= f10;
        }
        float f11 = fMo19243a4;
        float f12 = fMo19243a2 + fMo19243a3;
        if (f12 > fM17176c) {
            float f13 = fM17176c / f12;
            fMo19243a2 *= f13;
            fMo19243a3 *= f13;
        }
        if (fMo19243a >= 0.0f && fMo19243a2 >= 0.0f && fMo19243a3 >= 0.0f && f11 >= 0.0f) {
            return mo19242d(j10, fMo19243a, fMo19243a2, fMo19243a3, f11, layoutDirection);
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + fMo19243a + ", topEnd = " + fMo19243a2 + ", bottomEnd = " + fMo19243a3 + ", bottomStart = " + f11 + ")!").toString());
    }

    /* JADX INFO: renamed from: b */
    public abstract C10274e mo19241b(InterfaceC10271b interfaceC10271b, InterfaceC10271b interfaceC10271b2, InterfaceC10271b interfaceC10271b3, InterfaceC10271b interfaceC10271b4);

    /* JADX INFO: renamed from: d */
    public abstract AbstractC9134a0 mo19242d(long j10, float f3, float f10, float f11, float f12, LayoutDirection layoutDirection);
}
