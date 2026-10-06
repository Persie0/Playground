package p000;

import android.app.Activity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class emy implements msi {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f14731a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f14732b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f14733c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Activity f14734d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ jfs f14735e;

    public /* synthetic */ emy(boolean z, boolean z2, boolean z3, jfs jfsVar, Activity activity, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f14731a = z;
        this.f14732b = z2;
        this.f14733c = z3;
        this.f14735e = jfsVar;
        this.f14734d = activity;
    }

    @Override // p000.msi
    /* JADX INFO: renamed from: a */
    public final Object mo6051a() {
        boolean z = this.f14731a;
        boolean z2 = this.f14732b;
        boolean z3 = this.f14733c;
        jfs jfsVar = this.f14735e;
        Activity activity = this.f14734d;
        mwt mwtVarM17115i = mwx.m17115i();
        mwtVarM17115i.mo17110e(ikw.PORTRAIT, Boolean.valueOf(z));
        mwtVarM17115i.mo17110e(ikw.LONG_EXPOSURE, Boolean.valueOf(z2));
        mwtVarM17115i.mo17110e(ikw.TIME_LAPSE, Boolean.valueOf(z3));
        mwtVarM17115i.mo17110e(ikw.ORNAMENT, Boolean.valueOf(jfsVar.m13074G(activity.getBaseContext())));
        mwtVarM17115i.mo17110e(ikw.TIARA, Boolean.valueOf(jfs.m13059I(activity.getBaseContext())));
        return mwtVarM17115i.mo17059b();
    }
}
