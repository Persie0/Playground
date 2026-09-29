package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2863u7 implements InterfaceC2702i7 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2730k7 f14453a;

    /* JADX INFO: renamed from: b */
    public final String f14454b;

    /* JADX INFO: renamed from: c */
    public final Object[] f14455c;

    /* JADX INFO: renamed from: d */
    public final int f14456d;

    public C2863u7(AbstractC2771n6 abstractC2771n6, String str, Object[] objArr) {
        this.f14453a = abstractC2771n6;
        this.f14454b = str;
        this.f14455c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f14456d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f14456d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m8293a() {
        return this.f14454b;
    }

    /* JADX INFO: renamed from: b */
    public final Object[] m8294b() {
        return this.f14455c;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2702i7
    /* JADX INFO: renamed from: c */
    public final boolean mo7828c() {
        return (this.f14456d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2702i7
    /* JADX INFO: renamed from: d */
    public final int mo7829d() {
        return (this.f14456d & 1) == 1 ? 1 : 2;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2702i7
    public final InterfaceC2730k7 zza() {
        return this.f14453a;
    }
}
