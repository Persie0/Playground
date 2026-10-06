package p000;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.res.Resources;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.focusindicator.FocusIndicatorAccessoryView;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;
import com.google.android.apps.camera.legacy.app.activity.main.CameraActivity;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dqb implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f12281a;

    /* JADX INFO: renamed from: b */
    private final oju f12282b;

    /* JADX INFO: renamed from: c */
    private final oju f12283c;

    /* JADX INFO: renamed from: d */
    private final oju f12284d;

    /* JADX INFO: renamed from: e */
    private final oju f12285e;

    /* JADX INFO: renamed from: f */
    private final oju f12286f;

    /* JADX INFO: renamed from: g */
    private final /* synthetic */ int f12287g;

    public dqb(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i) {
        this.f12287g = i;
        this.f12281a = ojuVar;
        this.f12282b = ojuVar2;
        this.f12283c = ojuVar3;
        this.f12284d = ojuVar4;
        this.f12285e = ojuVar5;
        this.f12286f = ojuVar6;
    }

    public dqb(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, byte[] bArr) {
        this.f12287g = i;
        this.f12281a = ojuVar;
        this.f12284d = ojuVar2;
        this.f12285e = ojuVar3;
        this.f12282b = ojuVar4;
        this.f12286f = ojuVar5;
        this.f12283c = ojuVar6;
    }

    public dqb(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, byte[] bArr, byte[] bArr2) {
        this.f12287g = i;
        this.f12286f = ojuVar;
        this.f12281a = ojuVar2;
        this.f12283c = ojuVar3;
        this.f12284d = ojuVar4;
        this.f12282b = ojuVar5;
        this.f12285e = ojuVar6;
    }

    public dqb(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, char[] cArr) {
        this.f12287g = i;
        this.f12286f = ojuVar;
        this.f12285e = ojuVar2;
        this.f12283c = ojuVar3;
        this.f12281a = ojuVar4;
        this.f12282b = ojuVar5;
        this.f12284d = ojuVar6;
    }

    public dqb(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, char[] cArr, byte[] bArr) {
        this.f12287g = i;
        this.f12283c = ojuVar;
        this.f12281a = ojuVar2;
        this.f12282b = ojuVar3;
        this.f12285e = ojuVar4;
        this.f12284d = ojuVar5;
        this.f12286f = ojuVar6;
    }

    public dqb(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, float[] fArr) {
        this.f12287g = i;
        this.f12283c = ojuVar;
        this.f12284d = ojuVar2;
        this.f12281a = ojuVar3;
        this.f12285e = ojuVar4;
        this.f12282b = ojuVar5;
        this.f12286f = ojuVar6;
    }

    public dqb(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, int[] iArr) {
        this.f12287g = i;
        this.f12285e = ojuVar;
        this.f12281a = ojuVar2;
        this.f12286f = ojuVar3;
        this.f12283c = ojuVar4;
        this.f12282b = ojuVar5;
        this.f12284d = ojuVar6;
    }

    public dqb(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, short[] sArr) {
        this.f12287g = i;
        this.f12284d = ojuVar;
        this.f12281a = ojuVar2;
        this.f12282b = ojuVar3;
        this.f12286f = ojuVar4;
        this.f12283c = ojuVar5;
        this.f12285e = ojuVar6;
    }

    public dqb(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, boolean[] zArr) {
        this.f12287g = i;
        this.f12284d = ojuVar;
        this.f12282b = ojuVar2;
        this.f12285e = ojuVar3;
        this.f12283c = ojuVar4;
        this.f12286f = ojuVar5;
        this.f12281a = ojuVar6;
    }

    public dqb(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, byte[][] bArr) {
        this.f12287g = i;
        this.f12286f = ojuVar;
        this.f12285e = ojuVar2;
        this.f12284d = ojuVar3;
        this.f12281a = ojuVar4;
        this.f12283c = ojuVar5;
        this.f12282b = ojuVar6;
    }

    public dqb(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, char[][] cArr) {
        this.f12287g = i;
        this.f12286f = ojuVar;
        this.f12285e = ojuVar2;
        this.f12284d = ojuVar3;
        this.f12281a = ojuVar4;
        this.f12283c = ojuVar5;
        this.f12282b = ojuVar6;
    }

    public dqb(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, float[][] fArr) {
        this.f12287g = i;
        this.f12283c = ojuVar;
        this.f12286f = ojuVar2;
        this.f12281a = ojuVar3;
        this.f12282b = ojuVar4;
        this.f12285e = ojuVar5;
        this.f12284d = ojuVar6;
    }

    public dqb(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, int[][] iArr) {
        this.f12287g = i;
        this.f12282b = ojuVar;
        this.f12281a = ojuVar2;
        this.f12286f = ojuVar3;
        this.f12285e = ojuVar4;
        this.f12283c = ojuVar5;
        this.f12284d = ojuVar6;
    }

    public dqb(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, short[][] sArr) {
        this.f12287g = i;
        this.f12283c = ojuVar;
        this.f12284d = ojuVar2;
        this.f12281a = ojuVar3;
        this.f12285e = ojuVar4;
        this.f12286f = ojuVar5;
        this.f12282b = ojuVar6;
    }

    public dqb(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, boolean[][] zArr) {
        this.f12287g = i;
        this.f12283c = ojuVar;
        this.f12285e = ojuVar2;
        this.f12281a = ojuVar3;
        this.f12282b = ojuVar4;
        this.f12286f = ojuVar5;
        this.f12284d = ojuVar6;
    }

    public dqb(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, byte[][][] bArr) {
        this.f12287g = i;
        this.f12286f = ojuVar;
        this.f12285e = ojuVar2;
        this.f12283c = ojuVar3;
        this.f12284d = ojuVar4;
        this.f12282b = ojuVar5;
        this.f12281a = ojuVar6;
    }

    public dqb(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, char[][][] cArr) {
        this.f12287g = i;
        this.f12283c = ojuVar;
        this.f12284d = ojuVar2;
        this.f12282b = ojuVar3;
        this.f12285e = ojuVar4;
        this.f12286f = ojuVar5;
        this.f12281a = ojuVar6;
    }

    public dqb(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, float[][][] fArr) {
        this.f12287g = i;
        this.f12285e = ojuVar;
        this.f12281a = ojuVar2;
        this.f12286f = ojuVar3;
        this.f12283c = ojuVar4;
        this.f12282b = ojuVar5;
        this.f12284d = ojuVar6;
    }

    public dqb(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, int[][][] iArr) {
        this.f12287g = i;
        this.f12282b = ojuVar;
        this.f12283c = ojuVar2;
        this.f12285e = ojuVar3;
        this.f12281a = ojuVar4;
        this.f12286f = ojuVar5;
        this.f12284d = ojuVar6;
    }

    public dqb(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, short[][][] sArr) {
        this.f12287g = i;
        this.f12285e = ojuVar;
        this.f12286f = ojuVar2;
        this.f12284d = ojuVar3;
        this.f12283c = ojuVar4;
        this.f12281a = ojuVar5;
        this.f12282b = ojuVar6;
    }

    public dqb(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, boolean[][][] zArr) {
        this.f12287g = i;
        this.f12285e = ojuVar;
        this.f12281a = ojuVar2;
        this.f12282b = ojuVar3;
        this.f12283c = ojuVar4;
        this.f12284d = ojuVar5;
        this.f12286f = ojuVar6;
    }

    /* JADX INFO: renamed from: a */
    public static dqb m6574a(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6) {
        return new dqb(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, 2, (char[]) null);
    }

    /* JADX INFO: renamed from: b */
    public static dqb m6575b(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6) {
        return new dqb(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, 4, (int[]) null);
    }

    /* JADX INFO: renamed from: c */
    public static dqb m6576c(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6) {
        return new dqb(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, 5, (boolean[]) null);
    }

    /* JADX INFO: renamed from: d */
    public static dqb m6577d(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6) {
        return new dqb(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, 11, (boolean[][]) null);
    }

    /* JADX INFO: renamed from: e */
    public static dqb m6578e(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6) {
        return new dqb(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, 14, (char[][][]) null);
    }

    /* JADX INFO: renamed from: f */
    public static dqb m6579f(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6) {
        return new dqb(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, 17, (boolean[][][]) null);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        Object objM17136H;
        switch (this.f12287g) {
            case 0:
                return new dqm((dqv) this.f12282b.get(), (jww) this.f12281a.get(), ((Boolean) this.f12283c.get()).booleanValue(), this.f12284d, ((Boolean) this.f12285e.get()).booleanValue(), this.f12286f, 1);
            case 1:
                final bko bkoVar = (bko) this.f12281a.get();
                final dhv dhvVar = (dhv) this.f12284d.get();
                final CameraActivityTiming cameraActivityTiming = (CameraActivityTiming) this.f12285e.get();
                final mrm mrmVar = (mrm) ((ohj) this.f12282b).f46012a;
                final nps npsVar = (nps) this.f12286f.get();
                final byte[] bArr = null;
                final byte[] bArr2 = null;
                final byte[] bArr3 = null;
                final byte[] bArr4 = null;
                return new ikg(cameraActivityTiming, dhvVar, bkoVar, mrmVar, bArr, bArr2, bArr3, bArr4) { // from class: dlk

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ CameraActivityTiming f11943b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ dhv f11944c;

                    /* JADX INFO: renamed from: d */
                    public final /* synthetic */ mrm f11945d;

                    /* JADX INFO: renamed from: e */
                    public final /* synthetic */ bko f11946e;

                    @Override // p000.ikg
                    /* JADX INFO: renamed from: a */
                    public final void mo6340a() {
                        this.f11942a.mo2282d(new apv(this.f11943b, this.f11944c, this.f11946e, this.f11945d, 4, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null), not.INSTANCE);
                    }
                };
            case 2:
                return new drm((jvb) this.f12286f.get(), (mrm) this.f12285e.get(), (dxx) this.f12283c.get(), (kbz) this.f12281a.get(), (Executor) this.f12282b.get(), (dhv) this.f12284d.get());
            case 3:
                Context contextM6830a = ((dws) this.f12284d).m6830a();
                Resources resourcesM6836a = ((dww) this.f12281a).m6836a();
                glk glkVar = (glk) this.f12282b.get();
                FocusIndicatorView focusIndicatorView = ((dwv) this.f12286f).get();
                dwl dwlVar = ((dwx) this.f12283c).get();
                FocusIndicatorAccessoryView focusIndicatorAccessoryView = ((dwu) this.f12285e).get();
                ValueAnimator valueAnimator = (ValueAnimator) AnimatorInflater.loadAnimator(contextM6830a, C0100R.animator.focus_lock_hold_outer_ring_opacity_fade_in);
                valueAnimator.addUpdateListener(glkVar.m9429f());
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(valueAnimator);
                animatorSet.addListener(new dxe(focusIndicatorView, focusIndicatorAccessoryView, dwlVar, contextM6830a, resourcesM6836a));
                animatorSet.addListener(new ilq());
                return inr.m11538j(animatorSet);
            case 4:
                jvb jvbVar = (jvb) this.f12285e.get();
                oju ojuVar = this.f12281a;
                oju ojuVar2 = this.f12286f;
                oju ojuVar3 = this.f12283c;
                mrm mrmVarM6617a = ((dra) this.f12282b).m6617a();
                boolean zMo16813g = mrmVarM6617a.mo16813g();
                oju ojuVar4 = this.f12284d;
                Object objM17136H2 = (zMo16813g && ((mrm) ojuVar4.get()).mo16813g()) ? mxk.m17136H(new efc(jvbVar, mrmVarM6617a, ojuVar, ojuVar2, ojuVar3, ojuVar4, 1)) : mzx.f41874a;
                objM17136H2.getClass();
                return objM17136H2;
            case 5:
                return new drj((dhv) this.f12284d.get(), (kmd) this.f12282b.get(), (imu) this.f12285e.get(), (end) this.f12283c.get(), this.f12286f, (gdz) this.f12281a.get());
            case 6:
                return new eby((dhv) this.f12283c.get(), (jwn) this.f12284d.get(), (jwn) this.f12281a.get(), (jwn) this.f12285e.get(), (chx) this.f12282b.get(), (jvd) this.f12286f.get());
            case 7:
                oju ojuVar5 = this.f12286f;
                Context contextM6830a2 = ((dws) this.f12284d).m6830a();
                kbz kbzVar = (kbz) this.f12281a.get();
                dhv dhvVar2 = (dhv) this.f12283c.get();
                nps npsVar2 = (nps) this.f12282b.get();
                if (!dhvVar2.mo6184l(did.f11404O)) {
                    return cdw.f5366g;
                }
                String strMo6182j = dhvVar2.mo6182j(did.f11405P);
                return mro.m16832b(strMo6182j) ? cdw.f5366g : jbx.m12869n(new cgg(npsVar2, kbzVar, ojuVar5, contextM6830a2, strMo6182j, 6));
            case 8:
                oju ojuVar6 = this.f12286f;
                Context contextM6830a3 = ((dws) this.f12284d).m6830a();
                kbz kbzVar2 = (kbz) this.f12281a.get();
                dhv dhvVar3 = (dhv) this.f12283c.get();
                nps npsVar3 = (nps) this.f12282b.get();
                if (!dhvVar3.mo6184l(did.f11443av)) {
                    return cdw.f5366g;
                }
                String strMo6182j2 = dhvVar3.mo6182j(did.f11444aw);
                return mro.m16832b(strMo6182j2) ? cdw.f5366g : jbx.m12869n(new cgg(npsVar3, kbzVar2, ojuVar6, contextM6830a3, strMo6182j2, 5));
            case 9:
                return new ecn(this.f12283c, (dhv) this.f12284d.get(), (kbz) this.f12281a.get(), ((crv) this.f12285e).m5442a(), ((etl) this.f12286f).m7866a(), (nps) this.f12282b.get());
            case 10:
                mrm mrmVar2 = (mrm) this.f12282b.get();
                hnv hnvVarM10532a = ((hog) this.f12281a).m10532a();
                hnw hnwVar = (hnw) this.f12286f.get();
                jwf jwfVar = (jwf) this.f12285e.get();
                return mrmVar2.mo16813g() ? jbx.m12869n(new efc(mrmVar2, (chx) this.f12284d.get(), hnwVar, (jvd) this.f12283c.get(), hnvVarM10532a, jwfVar, 0)) : cdw.f5366g;
            case 11:
                return new efi((kfk) this.f12283c.get(), (Map) this.f12285e.get(), (jwn) this.f12281a.get(), (jwn) this.f12282b.get(), (jvb) this.f12286f.get(), (Executor) this.f12284d.get());
            case 12:
                dhv dhvVar4 = (dhv) this.f12283c.get();
                hah hahVar = (hah) this.f12286f.get();
                AmbientModeSupport.AmbientController ambientController = (AmbientModeSupport.AmbientController) this.f12281a.get();
                ((cde) this.f12282b).m3490a().booleanValue();
                ohb ohbVarM18485a = ohh.m18485a(this.f12285e);
                ohh.m18485a(this.f12284d);
                if (dhvVar4.mo6184l(dhi.f11115b) && dhvVar4.mo6184l(dhi.f11119f)) {
                    lja ljaVarM10159a = het.m10159a();
                    ljaVarM10159a.m15518h(mxk.m17136H(ikw.PHOTO));
                    ljaVarM10159a.m15517g(mxk.m17136H(kmq.BACK));
                    ljaVarM10159a.m15519i(hahVar.mo10029a(gzy.f27058q));
                    ljaVarM10159a.f38344c = "Imax";
                    objM17136H = mxk.m17136H(new dft(ambientController, ohbVarM18485a, ljaVarM10159a, 4, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null));
                } else {
                    objM17136H = mzx.f41874a;
                }
                objM17136H.getClass();
                return objM17136H;
            case 13:
                dhv dhvVar5 = (dhv) this.f12286f.get();
                mrm mrmVar3 = (mrm) this.f12285e.get();
                ((err) this.f12284d).get();
                ((erq) this.f12282b).get();
                if (mrmVar3.mo16813g()) {
                    gtf.m9755d(dhvVar5);
                }
                return lku.m15664r(null);
            case 14:
                return new gvr(((ert) this.f12283c).get(), ((ema) this.f12282b).get(), this.f12285e, ((Boolean) this.f12286f.get()).booleanValue(), CameraActivity.class, (KeyguardManager) ((dws) this.f12284d).m6830a().getSystemService("keyguard"), (hah) this.f12281a.get(), null, null);
            case 15:
                return new fdc(((dww) this.f12285e).m6836a(), (fly) this.f12286f.get(), (ScheduledExecutorService) this.f12284d.get(), (eby) this.f12283c.get(), (jfs) this.f12281a.get(), ((cmx) this.f12282b).get(), null, null, null);
            case 16:
                Context contextM6830a4 = ((dws) this.f12282b).m6830a();
                elx elxVar = (elx) this.f12283c.get();
                ffq ffqVar = (ffq) this.f12285e.get();
                jww jwwVar = (jww) this.f12281a.get();
                jwl jwlVar = (jwl) this.f12286f.get();
                return new ljf(contextM6830a4, elxVar, ffqVar, jwwVar, jwlVar, (byte[]) null, (byte[]) null);
            case 17:
                return new fhj((fir) this.f12285e.get(), (fjg) this.f12281a.get(), (mrm) this.f12282b.get(), (jvb) this.f12283c.get(), (dhv) this.f12284d.get(), ((kbm) this.f12286f).get());
            case 18:
                jww jwwVar2 = (jww) this.f12285e.get();
                hnv hnvVarM10532a2 = ((hog) this.f12281a).m10532a();
                return ((dhv) this.f12282b.get()).mo6184l(dii.f11522A) ? jbx.m12869n(new cgg((chx) this.f12284d.get(), (hnw) this.f12286f.get(), (jvd) this.f12283c.get(), hnvVarM10532a2, jwwVar2, 12)) : cdw.f5366g;
            case 19:
                return new fkj((kov) this.f12286f.get(), ((emt) this.f12281a).get(), (inm) this.f12283c.get(), (dvg) this.f12284d.get(), (dvg) this.f12282b.get(), (Executor) this.f12285e.get());
            default:
                return new fna((dhv) this.f12283c.get(), (hah) this.f12281a.get(), ((iig) this.f12282b).get(), (jvd) this.f12285e.get(), (jwn) this.f12284d.get(), ((emf) this.f12286f).m7519a());
        }
    }
}
