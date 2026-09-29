package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i8 */
/* JADX INFO: loaded from: classes.dex */
public final class C2703i8 extends AbstractC2675g8 {
    @Override // com.google.android.gms.internal.measurement.AbstractC2675g8
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int mo7851a(Object obj) {
        return ((C2689h8) obj).m7872a();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2675g8
    /* JADX INFO: renamed from: b */
    public final int mo7852b(Object obj) {
        C2689h8 c2689h8 = (C2689h8) obj;
        int i10 = c2689h8.f14238d;
        if (i10 != -1) {
            return i10;
        }
        int iM8334N1 = 0;
        for (int i11 = 0; i11 < c2689h8.f14235a; i11++) {
            int i12 = c2689h8.f14236b[i11] >>> 3;
            zzka zzkaVar = (zzka) c2689h8.f14237c[i11];
            Logger logger = AbstractC2887w5.f14492Q;
            int iMo8492q = zzkaVar.mo8492q();
            int iM8334N2 = AbstractC2887w5.m8334N1(iMo8492q) + iMo8492q;
            int iM8334N3 = AbstractC2887w5.m8334N1(16);
            int iM8334N4 = AbstractC2887w5.m8334N1(i12);
            int iM8334N5 = AbstractC2887w5.m8334N1(8);
            iM8334N1 += AbstractC2887w5.m8334N1(24) + iM8334N2 + iM8334N3 + iM8334N4 + iM8334N5 + iM8334N5;
        }
        c2689h8.f14238d = iM8334N1;
        return iM8334N1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2675g8
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ C2689h8 mo7853c(Object obj) {
        AbstractC2771n6 abstractC2771n6 = (AbstractC2771n6) obj;
        C2689h8 c2689h8M7871b = abstractC2771n6.zzc;
        if (c2689h8M7871b == C2689h8.f14234f) {
            c2689h8M7871b = C2689h8.m7871b();
            abstractC2771n6.zzc = c2689h8M7871b;
        }
        return c2689h8M7871b;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2675g8
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2689h8 mo7854d(Object obj) {
        return ((AbstractC2771n6) obj).zzc;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2675g8
    /* JADX INFO: renamed from: e */
    public final Object mo7855e(Object obj, Object obj2) {
        C2689h8 c2689h8 = C2689h8.f14234f;
        if (c2689h8.equals(obj2)) {
            return obj;
        }
        if (c2689h8.equals(obj)) {
            C2689h8 c2689h9 = (C2689h8) obj2;
            C2689h8 c2689h10 = (C2689h8) obj;
            int i10 = c2689h10.f14235a + c2689h9.f14235a;
            int[] iArrCopyOf = Arrays.copyOf(c2689h10.f14236b, i10);
            System.arraycopy(c2689h9.f14236b, 0, iArrCopyOf, c2689h10.f14235a, c2689h9.f14235a);
            Object[] objArrCopyOf = Arrays.copyOf(c2689h10.f14237c, i10);
            System.arraycopy(c2689h9.f14237c, 0, objArrCopyOf, c2689h10.f14235a, c2689h9.f14235a);
            return new C2689h8(i10, iArrCopyOf, objArrCopyOf, true);
        }
        C2689h8 c2689h11 = (C2689h8) obj2;
        C2689h8 c2689h12 = (C2689h8) obj;
        c2689h12.getClass();
        if (c2689h11.equals(c2689h8)) {
            return obj;
        }
        if (!c2689h12.f14239e) {
            throw new UnsupportedOperationException();
        }
        int i11 = c2689h12.f14235a + c2689h11.f14235a;
        c2689h12.m7875e(i11);
        System.arraycopy(c2689h11.f14236b, 0, c2689h12.f14236b, c2689h12.f14235a, c2689h11.f14235a);
        System.arraycopy(c2689h11.f14237c, 0, c2689h12.f14237c, c2689h12.f14235a, c2689h11.f14235a);
        c2689h12.f14235a = i11;
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2675g8
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ void mo7856f(int i10, long j10, Object obj) {
        ((C2689h8) obj).m7873c(i10 << 3, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2675g8
    /* JADX INFO: renamed from: g */
    public final void mo7857g(Object obj) {
        C2689h8 c2689h8 = ((AbstractC2771n6) obj).zzc;
        if (c2689h8.f14239e) {
            c2689h8.f14239e = false;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2675g8
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void mo7858h(Object obj, Object obj2) {
        ((AbstractC2771n6) obj).zzc = (C2689h8) obj2;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2675g8
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void mo7859i(Object obj, C2900x5 c2900x5) throws IOException {
        ((C2689h8) obj).m7874d(c2900x5);
    }
}
