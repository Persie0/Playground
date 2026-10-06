package p000;

import com.google.android.libraries.lens.lenslite.dynamicloading.QSK.hIAHJKEnGsNbz;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ohu implements oht {

    /* JADX INFO: renamed from: a */
    public static final lpv f46036a;

    /* JADX INFO: renamed from: b */
    public static final lpv f46037b;

    /* JADX INFO: renamed from: c */
    public static final lpv f46038c;

    /* JADX INFO: renamed from: d */
    public static final lpv f46039d;

    /* JADX INFO: renamed from: e */
    public static final lpv f46040e;

    static {
        lpt lptVarM15833b = new lpt(lph.m15821a("com.google.android.apps.camera")).m15834c().m15832a().m15833b();
        f46036a = lptVarM15833b.m15836e(hIAHJKEnGsNbz.JKRHZgupBEraM, 0L);
        f46037b = lptVarM15833b.m15838g("InAppUpdate__chip_dismissable", true);
        f46038c = lptVarM15833b.m15836e("InAppUpdate__chip_dismissal_limit", 2L);
        f46039d = lptVarM15833b.m15836e("InAppUpdate__chip_min_staleness_days", 0L);
        f46040e = lptVarM15833b.m15836e("InAppUpdate__chip_timeout_seconds", 10L);
    }

    @Override // p000.oht
    /* JADX INFO: renamed from: a */
    public final long mo18501a() {
        return ((Long) f46036a.m15845e()).longValue();
    }

    @Override // p000.oht
    /* JADX INFO: renamed from: b */
    public final long mo18502b() {
        return ((Long) f46038c.m15845e()).longValue();
    }

    @Override // p000.oht
    /* JADX INFO: renamed from: c */
    public final long mo18503c() {
        return ((Long) f46039d.m15845e()).longValue();
    }

    @Override // p000.oht
    /* JADX INFO: renamed from: d */
    public final long mo18504d() {
        return ((Long) f46040e.m15845e()).longValue();
    }

    @Override // p000.oht
    /* JADX INFO: renamed from: e */
    public final boolean mo18505e() {
        return ((Boolean) f46037b.m15845e()).booleanValue();
    }
}
