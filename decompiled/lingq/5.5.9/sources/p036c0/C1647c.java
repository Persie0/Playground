package p036c0;

import androidx.activity.result.C0204c;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import cm.InterfaceC2057q;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5312g0;
import p081e0.InterfaceC5336s0;
import p338qd.C8573r0;
import p387t0.C9169u;
import sl.C9072e;

/* JADX INFO: renamed from: c0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1647c {

    /* JADX INFO: renamed from: a */
    public final long f9209a;

    /* JADX INFO: renamed from: b */
    public final long f9210b;

    /* JADX INFO: renamed from: c */
    public final long f9211c;

    /* JADX INFO: renamed from: d */
    public final long f9212d;

    public C1647c(long j10, long j11, long j12, long j13) {
        this.f9209a = j10;
        this.f9210b = j11;
        this.f9211c = j12;
        this.f9212d = j13;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC5312g0 m5340a(boolean z10, InterfaceC0476a interfaceC0476a) {
        interfaceC0476a.mo1622c(-2116091914);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        InterfaceC5312g0 interfaceC5312g0M16704V0 = C8573r0.m16704V0(new C9169u(z10 ? this.f9209a : this.f9211c), interfaceC0476a);
        interfaceC0476a.mo1661w();
        return interfaceC5312g0M16704V0;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC5312g0 m5341b(boolean z10, InterfaceC0476a interfaceC0476a) {
        interfaceC0476a.mo1622c(1779883118);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        InterfaceC5312g0 interfaceC5312g0M16704V0 = C8573r0.m16704V0(new C9169u(z10 ? this.f9210b : this.f9212d), interfaceC0476a);
        interfaceC0476a.mo1661w();
        return interfaceC5312g0M16704V0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C1647c)) {
            C1647c c1647c = (C1647c) obj;
            if (C9169u.m17497c(this.f9209a, c1647c.f9209a) && C9169u.m17497c(this.f9210b, c1647c.f9210b) && C9169u.m17497c(this.f9211c, c1647c.f9211c) && C9169u.m17497c(this.f9212d, c1647c.f9212d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = C9169u.f47704g;
        return Long.hashCode(this.f9212d) + C0204c.m847f(this.f9211c, C0204c.m847f(this.f9210b, Long.hashCode(this.f9209a) * 31, 31), 31);
    }
}
