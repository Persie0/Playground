package p387t0;

import dm.C5207g;
import p338qd.C8573r0;
import p375s0.C8939a;
import p375s0.C8942d;
import p375s0.C8943e;

/* JADX INFO: renamed from: t0.a0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9134a0 {

    /* JADX INFO: renamed from: t0.a0$a */
    public static final class a extends AbstractC9134a0 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return C5207g.m11106a(null, null);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public final int hashCode() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: t0.a0$b */
    public static final class b extends AbstractC9134a0 {

        /* JADX INFO: renamed from: a */
        public final C8942d f47641a;

        public b(C8942d c8942d) {
            this.f47641a = c8942d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return C5207g.m11106a(this.f47641a, ((b) obj).f47641a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f47641a.hashCode();
        }
    }

    /* JADX INFO: renamed from: t0.a0$c */
    public static final class c extends AbstractC9134a0 {

        /* JADX INFO: renamed from: a */
        public final C8943e f47642a;

        /* JADX INFO: renamed from: b */
        public final C9151j f47643b;

        /* JADX WARN: Code duplicated, block: B:19:0x0050  */
        /* JADX WARN: Code duplicated, block: B:36:0x008d  */
        public c(C8943e c8943e) {
            boolean z10;
            boolean z11;
            C9151j c9151jM16758t;
            this.f47642a = c8943e;
            long j10 = c8943e.f46905h;
            float fM17157b = C8939a.m17157b(j10);
            long j11 = c8943e.f46904g;
            boolean z12 = true;
            boolean z13 = fM17157b == C8939a.m17157b(j11);
            long j12 = c8943e.f46902e;
            long j13 = c8943e.f46903f;
            if (z13) {
                if (C8939a.m17157b(j11) == C8939a.m17157b(j13)) {
                    if (C8939a.m17157b(j13) == C8939a.m17157b(j12)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (C8939a.m17158c(j10) == C8939a.m17158c(j11)) {
                if (C8939a.m17158c(j11) == C8939a.m17158c(j13)) {
                    if (C8939a.m17158c(j13) == C8939a.m17158c(j12)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            if (!z10 || !z11) {
                z12 = false;
            }
            if (z12) {
                c9151jM16758t = null;
            } else {
                c9151jM16758t = C8573r0.m16758t();
                c9151jM16758t.mo17414j(c8943e);
            }
            this.f47643b = c9151jM16758t;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return C5207g.m11106a(this.f47642a, ((c) obj).f47642a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f47642a.hashCode();
        }
    }
}
