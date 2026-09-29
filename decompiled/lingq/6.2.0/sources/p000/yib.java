package p000;

import com.google.android.gms.internal.measurement.zzacr;

/* JADX INFO: loaded from: classes2.dex */
public final class yib implements fjb {

    /* JADX INFO: renamed from: a */
    public final bhb f69883a;

    /* JADX INFO: renamed from: b */
    public final iy5 f69884b;

    public yib(iy5 iy5Var, bhb bhbVar) {
        u06 u06Var = qhb.f57797a;
        this.f69884b = iy5Var;
        this.f69883a = bhbVar;
    }

    /* JADX INFO: renamed from: j */
    public static yib m25157j(iy5 iy5Var, bhb bhbVar) {
        u06 u06Var = qhb.f57797a;
        return new yib(iy5Var, bhbVar);
    }

    @Override // p000.fjb
    /* JADX INFO: renamed from: a */
    public final void mo11892a(Object obj) {
        this.f69884b.getClass();
        ojb ojbVar = ((whb) obj).zzc;
        if (ojbVar.f54474e) {
            ojbVar.f54474e = false;
        }
        u06 u06Var = qhb.f57797a;
        throw g9a.m12430g(obj);
    }

    @Override // p000.fjb
    /* JADX INFO: renamed from: b */
    public final void mo11893b(Object obj, Object obj2) {
        gjb.m12690b(obj, obj2);
    }

    @Override // p000.fjb
    /* JADX INFO: renamed from: c */
    public final void mo11894c(Object obj, gw9 gw9Var) {
        throw g9a.m12430g(obj);
    }

    @Override // p000.fjb
    /* JADX INFO: renamed from: d */
    public final int mo11895d(bhb bhbVar) {
        ojb ojbVar = ((whb) bhbVar).zzc;
        int i = ojbVar.f54473d;
        if (i != -1) {
            return i;
        }
        int iM12425b = 0;
        for (int i2 = 0; i2 < ojbVar.f54470a; i2++) {
            int i3 = ojbVar.f54471b[i2] >>> 3;
            zzacr zzacrVar = (zzacr) ojbVar.f54472c[i2];
            int iM17434a = nhb.m17434a(8);
            int iM17434a2 = nhb.m17434a(i3) + nhb.m17434a(16);
            int iM17434a3 = nhb.m17434a(24);
            int iMo5422f = zzacrVar.mo5422f();
            iM12425b += iM17434a + iM17434a + iM17434a2 + g9a.m12425b(iMo5422f, iMo5422f, iM17434a3);
        }
        ojbVar.f54473d = iM12425b;
        return iM12425b;
    }

    @Override // p000.fjb
    /* JADX INFO: renamed from: e */
    public final boolean mo11896e(Object obj) {
        throw g9a.m12430g(obj);
    }

    @Override // p000.fjb
    /* JADX INFO: renamed from: f */
    public final void mo11897f(Object obj, k80 k80Var, phb phbVar) {
        this.f69884b.getClass();
        iy5.m14201t(obj);
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // p000.fjb
    /* JADX INFO: renamed from: g */
    public final void mo11898g(Object obj, byte[] bArr, int i, int i2, ehb ehbVar) {
        whb whbVar = (whb) obj;
        if (whbVar.zzc == ojb.f54469f) {
            whbVar.zzc = ojb.m18048a();
        }
        throw g9a.m12430g(obj);
    }

    @Override // p000.fjb
    /* JADX INFO: renamed from: h */
    public final int mo11899h(whb whbVar) {
        return whbVar.zzc.hashCode();
    }

    @Override // p000.fjb
    /* JADX INFO: renamed from: i */
    public final boolean mo11900i(whb whbVar, whb whbVar2) {
        return whbVar.zzc.equals(whbVar2.zzc);
    }

    @Override // p000.fjb
    public final whb zza() {
        bhb bhbVar = this.f69883a;
        if (bhbVar instanceof whb) {
            return ((whb) bhbVar).m23964h();
        }
        uhb uhbVar = (uhb) ((whb) bhbVar).mo329r(5);
        boolean zM23962f = uhbVar.f63950b.m23962f();
        whb whbVar = uhbVar.f63950b;
        if (!zM23962f) {
            return whbVar;
        }
        whbVar.getClass();
        cjb.f10181c.m4784a(whbVar.getClass()).mo11892a(whbVar);
        whbVar.m23963g();
        return uhbVar.f63950b;
    }
}
