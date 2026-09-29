package p060d1;

import dm.C5207g;
import java.util.Map;
import p105f0.C5458f;
import p127g1.InterfaceC5647k;
import p166i1.C6148h0;

/* JADX INFO: renamed from: d1.j */
/* JADX INFO: loaded from: classes.dex */
public class C5023j {

    /* JADX INFO: renamed from: a */
    public final C5458f<C5022i> f32831a = new C5458f<>(new C5022i[16]);

    /* JADX INFO: renamed from: a */
    public boolean mo10705a(Map<C5027n, C5028o> map, InterfaceC5647k interfaceC5647k, C5019f c5019f, boolean z10) {
        C5207g.m11111f(map, "changes");
        C5207g.m11111f(interfaceC5647k, "parentCoordinates");
        C5458f<C5022i> c5458f = this.f32831a;
        int i10 = c5458f.f34019c;
        boolean z11 = false;
        if (i10 > 0) {
            C5022i[] c5022iArr = c5458f.f34017a;
            int i11 = 0;
            boolean z12 = false;
            do {
                z12 = c5022iArr[i11].mo10705a(map, interfaceC5647k, c5019f, z10) || z12;
                i11++;
            } while (i11 < i10);
            z11 = z12;
        }
        return z11;
    }

    /* JADX INFO: renamed from: b */
    public void mo10706b(C5019f c5019f) {
        C5458f<C5022i> c5458f = this.f32831a;
        for (int i10 = c5458f.f34019c - 1; -1 < i10; i10--) {
            if (c5458f.f34017a[i10].f32824c.m11694k()) {
                c5458f.m11697n(i10);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void mo10707c() {
        C5458f<C5022i> c5458f = this.f32831a;
        int i10 = c5458f.f34019c;
        if (i10 > 0) {
            C5022i[] c5022iArr = c5458f.f34017a;
            int i11 = 0;
            do {
                c5022iArr[i11].mo10707c();
                i11++;
            } while (i11 < i10);
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean mo10708d(C5019f c5019f) {
        C5458f<C5022i> c5458f = this.f32831a;
        int i10 = c5458f.f34019c;
        boolean z10 = false;
        if (i10 > 0) {
            C5022i[] c5022iArr = c5458f.f34017a;
            int i11 = 0;
            boolean z11 = false;
            do {
                z11 = c5022iArr[i11].mo10708d(c5019f) || z11;
                i11++;
            } while (i11 < i10);
            z10 = z11;
        }
        mo10706b(c5019f);
        return z10;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo10709e(Map<C5027n, C5028o> map, InterfaceC5647k interfaceC5647k, C5019f c5019f, boolean z10) {
        C5207g.m11111f(map, "changes");
        C5207g.m11111f(interfaceC5647k, "parentCoordinates");
        C5458f<C5022i> c5458f = this.f32831a;
        int i10 = c5458f.f34019c;
        if (i10 <= 0) {
            return false;
        }
        C5022i[] c5022iArr = c5458f.f34017a;
        int i11 = 0;
        boolean z11 = false;
        do {
            z11 = c5022iArr[i11].mo10709e(map, interfaceC5647k, c5019f, z10) || z11;
            i11++;
        } while (i11 < i10);
        return z11;
    }

    /* JADX INFO: renamed from: f */
    public final void m10710f() {
        int i10 = 0;
        while (true) {
            C5458f<C5022i> c5458f = this.f32831a;
            if (i10 >= c5458f.f34019c) {
                return;
            }
            C5022i c5022i = c5458f.f34017a[i10];
            if (C6148h0.m12655a(c5022i.f32823b)) {
                i10++;
                c5022i.m10710f();
            } else {
                c5458f.m11697n(i10);
                c5022i.mo10707c();
            }
        }
    }
}
