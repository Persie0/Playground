package p000;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class etb implements ewr {

    /* JADX INFO: renamed from: a */
    public final esz f17314a;

    /* JADX INFO: renamed from: b */
    public final oju f17315b;

    /* JADX INFO: renamed from: c */
    public final oju f17316c;

    /* JADX INFO: renamed from: d */
    public final oju f17317d;

    /* JADX INFO: renamed from: e */
    public final oju f17318e;

    /* JADX INFO: renamed from: f */
    public final cwd f17319f;

    /* JADX INFO: renamed from: g */
    private final oju f17320g;

    /* JADX INFO: renamed from: h */
    private final oju f17321h;

    /* JADX INFO: renamed from: i */
    private final oju f17322i;

    /* JADX INFO: renamed from: j */
    private final oju f17323j;

    /* JADX INFO: renamed from: k */
    private final oju f17324k;

    /* JADX INFO: renamed from: l */
    private final oju f17325l;

    /* JADX INFO: renamed from: m */
    private final oju f17326m;

    /* JADX INFO: renamed from: n */
    private final oju f17327n;

    /* JADX INFO: renamed from: o */
    private final oju f17328o;

    /* JADX INFO: renamed from: p */
    private final oju f17329p;

    /* JADX INFO: renamed from: q */
    private final oju f17330q;

    /* JADX INFO: renamed from: r */
    private final oju f17331r;

    /* JADX INFO: renamed from: s */
    private final oju f17332s;

    public etb(esz eszVar, cwd cwdVar, byte[] bArr, byte[] bArr2) {
        this.f17314a = eszVar;
        this.f17319f = cwdVar;
        dws dwsVar = new dws(cwdVar, 6, (byte[]) null, (byte[]) null);
        this.f17320g = dwsVar;
        this.f17315b = new eqn((oju) dwsVar, eszVar.f16353D, eszVar.f16641f, 9, (short[][]) null);
        ern ernVar = new ern(cwdVar, 8, null, null);
        this.f17321h = ernVar;
        ern ernVar2 = new ern(cwdVar, 9, null, null);
        this.f17322i = ernVar2;
        oju ojuVarM18486b = ohh.m18486b(hie.m10336d(ernVar, ernVar2, eszVar.f16959l));
        this.f17323j = ojuVarM18486b;
        oju ojuVarM18486b2 = ohh.m18486b(hqv.m10643a(ojuVarM18486b));
        this.f17324k = ojuVarM18486b2;
        oju ojuVarM18486b3 = ohh.m18486b(hja.m10364a(eszVar.f16959l, ernVar, ernVar2, eszVar.f17277r, eszVar.f16641f, ojuVarM18486b2));
        this.f17325l = ojuVarM18486b3;
        oju ojuVarM18486b4 = ohh.m18486b(iim.m11382a(ojuVarM18486b3));
        this.f17326m = ojuVarM18486b4;
        oju ojuVarM7864c = etl.m7864c(ojuVarM18486b4);
        this.f17327n = ojuVarM7864c;
        this.f17316c = ohh.m18486b(iro.m11656a(ojuVarM7864c, eszVar.f16641f));
        oju ojuVarM18486b5 = ohh.m18486b(hjw.m10395a(dwsVar, ojuVarM18486b3));
        this.f17328o = ojuVarM18486b5;
        oju ojuVarM7864c2 = etl.m7864c(ojuVarM18486b5);
        this.f17329p = ojuVarM7864c2;
        this.f17317d = ohh.m18486b(new hjw(ojuVarM7864c2, eszVar.f16641f, 14, (boolean[]) null));
        oju ojuVarM18492a = ohn.m18492a(goc.m9575c(eszVar.f16588e));
        this.f17330q = ojuVarM18492a;
        oju ojuVarM18486b6 = ohh.m18486b(htn.m10749b(ojuVarM18486b3, ojuVarM18492a));
        this.f17331r = ojuVarM18486b6;
        oju ojuVarM7864c3 = etl.m7864c(ojuVarM18486b6);
        this.f17332s = ojuVarM7864c3;
        this.f17318e = ohh.m18486b(htn.m10748a(ojuVarM7864c3, eszVar.f16641f));
    }

    @Override // p000.ewr
    /* JADX INFO: renamed from: a */
    public final ewq mo7844a() {
        kms kmsVar = (kms) this.f17314a.f16424av.get();
        dhv dhvVar = (dhv) this.f17314a.f16641f.get();
        jww jwwVar = (jww) this.f17314a.f16739gs.get();
        gdc gdcVar = (gdc) this.f17314a.f16500cR.get();
        jvd jvdVar = (jvd) this.f17314a.f16959l.get();
        khb khbVar = (khb) this.f17314a.f16666fY.get();
        hai haiVar = (hai) this.f17314a.f16353D.get();
        AccessibilityManager accessibilityManagerM7817l = this.f17314a.m7817l();
        jww jwwVar2 = (jww) this.f17314a.f16647fF.get();
        mzx mzxVar = mzx.f41874a;
        return new ewq(kmsVar, dhvVar, jwwVar, gdcVar, jvdVar, khbVar, haiVar, accessibilityManagerM7817l, jwwVar2, mzxVar, mzxVar, mzxVar, null);
    }
}
