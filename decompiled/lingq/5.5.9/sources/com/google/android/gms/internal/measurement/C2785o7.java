package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2785o7 implements InterfaceC2876v7 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2730k7 f14366a;

    /* JADX INFO: renamed from: b */
    public final AbstractC2675g8 f14367b;

    /* JADX INFO: renamed from: c */
    public final boolean f14368c;

    /* JADX INFO: renamed from: d */
    public final AbstractC2603b6 f14369d;

    public C2785o7(AbstractC2675g8 abstractC2675g8, AbstractC2603b6 abstractC2603b6, InterfaceC2730k7 interfaceC2730k7) {
        this.f14367b = abstractC2675g8;
        this.f14368c = abstractC2603b6.mo7699c(interfaceC2730k7);
        this.f14369d = abstractC2603b6;
        this.f14366a = interfaceC2730k7;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2876v7
    /* JADX INFO: renamed from: a */
    public final void mo8105a(Object obj) {
        this.f14367b.mo7857g(obj);
        this.f14369d.mo7698b(obj);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2876v7
    /* JADX INFO: renamed from: b */
    public final AbstractC2771n6 mo8106b() {
        InterfaceC2730k7 interfaceC2730k7 = this.f14366a;
        return interfaceC2730k7 instanceof AbstractC2771n6 ? (AbstractC2771n6) ((AbstractC2771n6) interfaceC2730k7).mo7659s(4) : interfaceC2730k7.mo7921d().m7898i();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2876v7
    /* JADX INFO: renamed from: c */
    public final void mo8107c(Object obj, C2900x5 c2900x5) throws IOException {
        this.f14369d.mo7697a(obj);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2876v7
    /* JADX INFO: renamed from: d */
    public final boolean mo8108d(Object obj) {
        this.f14369d.mo7697a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2876v7
    /* JADX INFO: renamed from: e */
    public final int mo8109e(Object obj) {
        int iHashCode = this.f14367b.mo7854d(obj).hashCode();
        if (!this.f14368c) {
            return iHashCode;
        }
        this.f14369d.mo7697a(obj);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2876v7
    /* JADX INFO: renamed from: f */
    public final void mo8110f(Object obj, byte[] bArr, int i10, int i11, C2796p5 c2796p5) throws IOException {
        AbstractC2771n6 abstractC2771n6 = (AbstractC2771n6) obj;
        if (abstractC2771n6.zzc == C2689h8.f14234f) {
            abstractC2771n6.zzc = C2689h8.m7871b();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2876v7
    /* JADX INFO: renamed from: g */
    public final int mo8111g(Object obj) {
        AbstractC2675g8 abstractC2675g8 = this.f14367b;
        int iMo7852b = abstractC2675g8.mo7852b(abstractC2675g8.mo7854d(obj));
        if (!this.f14368c) {
            return iMo7852b;
        }
        this.f14369d.mo7697a(obj);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2876v7
    /* JADX INFO: renamed from: h */
    public final void mo8112h(Object obj, Object obj2) {
        Class cls = C2889w7.f14495a;
        AbstractC2675g8 abstractC2675g8 = this.f14367b;
        abstractC2675g8.mo7858h(obj, abstractC2675g8.mo7855e(abstractC2675g8.mo7854d(obj), abstractC2675g8.mo7854d(obj2)));
        if (this.f14368c) {
            this.f14369d.mo7697a(obj2);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2876v7
    /* JADX INFO: renamed from: i */
    public final boolean mo8113i(Object obj, Object obj2) {
        AbstractC2675g8 abstractC2675g8 = this.f14367b;
        if (!abstractC2675g8.mo7854d(obj).equals(abstractC2675g8.mo7854d(obj2))) {
            return false;
        }
        if (!this.f14368c) {
            return true;
        }
        AbstractC2603b6 abstractC2603b6 = this.f14369d;
        abstractC2603b6.mo7697a(obj);
        abstractC2603b6.mo7697a(obj2);
        throw null;
    }
}
