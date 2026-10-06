package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import com.google.android.apps.camera.bottombar.BottomBarController;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fws {

    /* JADX INFO: renamed from: a */
    public final Object f23764a;

    /* JADX INFO: renamed from: b */
    public final Object f23765b;

    /* JADX INFO: renamed from: c */
    public final Object f23766c;

    /* JADX INFO: renamed from: d */
    public final Object f23767d;

    /* JADX INFO: renamed from: e */
    public final Object f23768e;

    /* JADX INFO: renamed from: f */
    public final Object f23769f;

    /* JADX INFO: renamed from: g */
    public final Object f23770g;

    /* JADX INFO: renamed from: h */
    public final Object f23771h;

    /* JADX INFO: renamed from: i */
    public final Object f23772i;

    /* JADX INFO: renamed from: j */
    public final Object f23773j;

    /* JADX INFO: renamed from: k */
    public final Object f23774k;

    /* JADX INFO: renamed from: l */
    public final Object f23775l;

    /* JADX INFO: renamed from: m */
    public final Object f23776m;

    public fws(dbr dbrVar, fve fveVar, kms kmsVar, dhv dhvVar, dnn dnnVar, cwt cwtVar, czl czlVar, bko bkoVar, ContentResolver contentResolver, Context context, cvt cvtVar, drj drjVar, cpl cplVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f23772i = dbrVar;
        this.f23769f = fveVar;
        this.f23771h = kmsVar;
        this.f23775l = dhvVar;
        this.f23765b = dnnVar;
        this.f23770g = cwtVar;
        this.f23768e = bkoVar;
        this.f23766c = contentResolver;
        this.f23774k = context;
        this.f23764a = cvtVar;
        this.f23773j = czlVar;
        this.f23776m = drjVar;
        this.f23767d = cplVar;
    }

    public fws(eio eioVar, eju ejuVar, jvb jvbVar, igb igbVar, eja ejaVar, BottomBarController bottomBarController, eoq eoqVar, eim eimVar, kbg kbgVar, dhv dhvVar, jfs jfsVar, ekd ekdVar, byte[] bArr) {
        this.f23764a = eioVar;
        this.f23770g = ejuVar;
        this.f23769f = jvbVar;
        this.f23775l = igbVar;
        this.f23766c = bottomBarController;
        this.f23772i = eoqVar;
        this.f23767d = eimVar;
        this.f23768e = dhvVar;
        this.f23771h = kbgVar;
        this.f23776m = ekdVar;
        this.f23774k = new eiq(ejaVar);
        this.f23773j = new fnz(this, 1, null);
        this.f23765b = new eir(jfsVar, ejaVar, dhvVar, null);
    }

    public fws(flz flzVar, nps npsVar, DisplayMetrics displayMetrics, gwp gwpVar, lqc lqcVar, ikw ikwVar, jwn jwnVar, dbr dbrVar, mrm mrmVar, mrm mrmVar2, cgu cguVar, nps npsVar2, fve fveVar, byte[] bArr) {
        this.f23764a = flzVar;
        this.f23765b = npsVar;
        this.f23766c = displayMetrics;
        this.f23767d = gwpVar;
        this.f23768e = lqcVar;
        this.f23769f = ikwVar;
        this.f23770g = jwnVar;
        this.f23771h = dbrVar;
        this.f23772i = mrmVar;
        this.f23773j = mrmVar2;
        this.f23774k = cguVar;
        this.f23775l = npsVar2;
        this.f23776m = fveVar;
    }

    /* JADX INFO: renamed from: a */
    public final ikw m8908a() {
        return ((cvt) this.f23764a).mo5395a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kme] */
    /* JADX WARN: Type inference failed for: r3v0, types: [dhv, java.lang.Object] */
    /* JADX INFO: renamed from: b */
    public final kmg m8909b() {
        kmq kmqVarMo5895d = ((dbr) this.f23772i).mo5895d();
        return ((dnn) this.f23765b).m6439b(this.f23771h, this.f23775l, kmqVarMo5895d);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [fve, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [dhv, java.lang.Object] */
    /* JADX INFO: renamed from: c */
    public final kmg m8910c() {
        kmg kmgVarM8909b = m8909b();
        if (kmgVarM8909b == null) {
            return null;
        }
        kmd kmdVarMo13854a = ((kms) this.f23771h).mo13854a(kmgVarM8909b);
        if (kmdVarMo13854a.mo14558k() == kmq.f36557a) {
            if (this.f23775l.mo6184l(dib.f11358cl)) {
                return this.f23769f.mo8823a();
            }
            if (this.f23775l.mo6184l(dhh.f11083ai)) {
                Rect rect = new Rect(0, 0, 0, 0);
                kmc kmcVar = (kmc) kmdVarMo13854a;
                kmg kmgVar = kmcVar.f36525a;
                for (kmg kmgVar2 : kmcVar.f36526b) {
                    kmd kmdVarMo13854a2 = ((kms) this.f23771h).mo13854a(kmgVar2);
                    if (kmdVarMo13854a2.mo14555h().right > rect.right) {
                        rect = kmdVarMo13854a2.mo14555h();
                        kmgVar = kmgVar2;
                    }
                }
                return kmgVar;
            }
        }
        return kmgVarM8909b;
    }
}
