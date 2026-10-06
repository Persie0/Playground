package p000;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cpq implements kba {

    /* JADX INFO: renamed from: a */
    public static final kbc f8650a = new kbc(1600, 2136);

    /* JADX INFO: renamed from: b */
    public final csf f8651b;

    /* JADX INFO: renamed from: c */
    public final dhv f8652c;

    /* JADX INFO: renamed from: d */
    public final jwn f8653d;

    /* JADX INFO: renamed from: e */
    public final cxo f8654e;

    /* JADX INFO: renamed from: f */
    public final fmz f8655f;

    /* JADX INFO: renamed from: g */
    public final kpb f8656g;

    /* JADX INFO: renamed from: h */
    public csn f8657h;

    /* JADX INFO: renamed from: i */
    public final Object f8658i = new Object();

    /* JADX INFO: renamed from: j */
    public final cwd f8659j;

    /* JADX INFO: renamed from: k */
    public final djm f8660k;

    /* JADX INFO: renamed from: l */
    public final djm f8661l;

    /* JADX INFO: renamed from: m */
    public final djm f8662m;

    /* JADX INFO: renamed from: n */
    public final ihk f8663n;

    /* JADX INFO: renamed from: o */
    private final Context f8664o;

    public cpq(Context context, djm djmVar, cwd cwdVar, csf csfVar, dhv dhvVar, djm djmVar2, djm djmVar3, jwn jwnVar, ihk ihkVar, cxo cxoVar, fmz fmzVar, kpb kpbVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f8664o = context;
        this.f8661l = djmVar;
        this.f8659j = cwdVar;
        this.f8651b = csfVar;
        this.f8652c = dhvVar;
        this.f8662m = djmVar2;
        this.f8660k = djmVar3;
        this.f8653d = jwnVar;
        this.f8663n = ihkVar;
        this.f8654e = cxoVar;
        this.f8655f = fmzVar;
        this.f8656g = kpbVar;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m5255c(Intent intent) {
        return intent != null && intent.hasExtra("android.intent.extra.videoQuality") && intent.getIntExtra("android.intent.extra.videoQuality", 0) == 0;
    }

    /* JADX INFO: renamed from: a */
    public final jxp m5256a() {
        return this.f8655f.m8598b() ? jxp.RES_1080P_3X4 : jxp.RES_1080P;
    }

    /* JADX INFO: renamed from: b */
    public final mws m5257b(jxn jxnVar, jxp jxpVar, kmq kmqVar, cxk cxkVar) {
        mwn mwnVar = new mwn();
        if (jxnVar.m13657e() || !this.f8661l.m6238m(this.f8664o, kmqVar) || cxkVar.equals(cxk.ACTIVE) || (cxkVar.equals(cxk.CINEMATIC) && !this.f8652c.mo6184l(dhh.f11054G))) {
            mwnVar.m17082g(jxpVar);
            return mwnVar.m17081f();
        }
        mwnVar.m17082g(jxp.RES_1080P);
        mwnVar.m17082g(jxp.RES_2160P);
        return mwnVar.m17081f();
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f8658i) {
            this.f8657h = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final mws m5258d(dsx dsxVar, jxn jxnVar, jxp jxpVar, cxk cxkVar) {
        mwn mwnVar = new mwn();
        if (jxnVar.m13657e()) {
            return mwnVar.m17081f();
        }
        if (cxkVar.equals(cxk.ACTIVE)) {
            mwnVar.m17082g(jxn.FPS_30);
            return mwnVar.m17081f();
        }
        if (jxnVar.m13656d()) {
            mwnVar.m17082g(jxn.f35054f);
            dhv dhvVar = this.f8652c;
            dhx dhxVar = dhh.f11074a;
            dhvVar.mo6177e();
            return mwnVar.m17081f();
        }
        if (this.f8652c.mo6183k(dib.f11239Z) && dsxVar.m6701p(jxn.FPS_AUTO, jxpVar) && (!jxpVar.m13663d() || (this.f8652c.mo6184l(dhh.f11054G) && this.f8652c.mo6184l(dhh.f11055H)))) {
            mwnVar.m17082g(jxn.FPS_AUTO);
        }
        mwnVar.m17082g(jxn.FPS_30);
        if (this.f8652c.mo6183k(dib.f11320ba) && dsxVar.m6701p(jxn.FPS_60, jxpVar) && (!jxpVar.m13663d() || this.f8652c.mo6184l(dhh.f11054G))) {
            mwnVar.m17082g(jxn.FPS_60);
        }
        dhv dhvVar2 = this.f8652c;
        dhx dhxVar2 = dhh.f11074a;
        dhvVar2.mo6177e();
        return mwnVar.m17081f();
    }
}
