package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u6 */
/* JADX INFO: loaded from: classes.dex */
public class C2862u6 {

    /* JADX INFO: renamed from: a */
    public volatile InterfaceC2730k7 f14451a;

    /* JADX INFO: renamed from: b */
    public volatile zzka f14452b;

    static {
        C2589a6 c2589a6 = C2589a6.f14048b;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final zzka m8291a() {
        if (this.f14452b != null) {
            return this.f14452b;
        }
        synchronized (this) {
            if (this.f14452b != null) {
                return this.f14452b;
            }
            if (this.f14451a == null) {
                this.f14452b = zzka.f14563b;
            } else {
                this.f14452b = this.f14451a.mo7922e();
            }
            return this.f14452b;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m8292b(InterfaceC2730k7 interfaceC2730k7) {
        if (this.f14451a != null) {
            return;
        }
        synchronized (this) {
            if (this.f14451a == null) {
                try {
                    this.f14451a = interfaceC2730k7;
                    this.f14452b = zzka.f14563b;
                } catch (zzll unused) {
                    this.f14451a = interfaceC2730k7;
                    this.f14452b = zzka.f14563b;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2862u6)) {
            return false;
        }
        C2862u6 c2862u6 = (C2862u6) obj;
        InterfaceC2730k7 interfaceC2730k7 = this.f14451a;
        InterfaceC2730k7 interfaceC2730k8 = c2862u6.f14451a;
        if (interfaceC2730k7 == null && interfaceC2730k8 == null) {
            return m8291a().equals(c2862u6.m8291a());
        }
        if (interfaceC2730k7 != null && interfaceC2730k8 != null) {
            return interfaceC2730k7.equals(interfaceC2730k8);
        }
        if (interfaceC2730k7 != null) {
            c2862u6.m8292b(interfaceC2730k7.mo8049c());
            return interfaceC2730k7.equals(c2862u6.f14451a);
        }
        m8292b(interfaceC2730k8.mo8049c());
        return this.f14451a.equals(interfaceC2730k8);
    }

    public final int hashCode() {
        return 1;
    }
}
