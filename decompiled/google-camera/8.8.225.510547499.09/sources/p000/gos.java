package p000;

import android.app.Activity;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class gos implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f25896a;

    /* JADX INFO: renamed from: b */
    private final oju f25897b;

    /* JADX INFO: renamed from: c */
    private final oju f25898c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f25899d;

    public gos(oju ojuVar, oju ojuVar2, oju ojuVar3, int i) {
        this.f25899d = i;
        this.f25896a = ojuVar;
        this.f25897b = ojuVar2;
        this.f25898c = ojuVar3;
    }

    public gos(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, byte[] bArr) {
        this.f25899d = i;
        this.f25897b = ojuVar;
        this.f25896a = ojuVar2;
        this.f25898c = ojuVar3;
    }

    public gos(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, char[] cArr) {
        this.f25899d = i;
        this.f25898c = ojuVar;
        this.f25897b = ojuVar2;
        this.f25896a = ojuVar3;
    }

    public gos(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, float[] fArr) {
        this.f25899d = i;
        this.f25896a = ojuVar;
        this.f25898c = ojuVar2;
        this.f25897b = ojuVar3;
    }

    public gos(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, int[] iArr) {
        this.f25899d = i;
        this.f25898c = ojuVar;
        this.f25896a = ojuVar2;
        this.f25897b = ojuVar3;
    }

    public gos(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, short[] sArr) {
        this.f25899d = i;
        this.f25896a = ojuVar;
        this.f25898c = ojuVar2;
        this.f25897b = ojuVar3;
    }

    public gos(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, boolean[] zArr) {
        this.f25899d = i;
        this.f25896a = ojuVar;
        this.f25898c = ojuVar2;
        this.f25897b = ojuVar3;
    }

    public gos(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, byte[][] bArr) {
        this.f25899d = i;
        this.f25897b = ojuVar;
        this.f25898c = ojuVar2;
        this.f25896a = ojuVar3;
    }

    public gos(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, char[][] cArr) {
        this.f25899d = i;
        this.f25896a = ojuVar;
        this.f25898c = ojuVar2;
        this.f25897b = ojuVar3;
    }

    public gos(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, float[][] fArr) {
        this.f25899d = i;
        this.f25896a = ojuVar;
        this.f25898c = ojuVar2;
        this.f25897b = ojuVar3;
    }

    public gos(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, int[][] iArr) {
        this.f25899d = i;
        this.f25897b = ojuVar;
        this.f25898c = ojuVar2;
        this.f25896a = ojuVar3;
    }

    public gos(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, short[][] sArr) {
        this.f25899d = i;
        this.f25897b = ojuVar;
        this.f25896a = ojuVar2;
        this.f25898c = ojuVar3;
    }

    public gos(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, boolean[][] zArr) {
        this.f25899d = i;
        this.f25897b = ojuVar;
        this.f25896a = ojuVar2;
        this.f25898c = ojuVar3;
    }

    public gos(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, byte[][][] bArr) {
        this.f25899d = i;
        this.f25898c = ojuVar;
        this.f25896a = ojuVar2;
        this.f25897b = ojuVar3;
    }

    public gos(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, char[][][] cArr) {
        this.f25899d = i;
        this.f25896a = ojuVar;
        this.f25898c = ojuVar2;
        this.f25897b = ojuVar3;
    }

    public gos(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, int[][][] iArr) {
        this.f25899d = i;
        this.f25897b = ojuVar;
        this.f25896a = ojuVar2;
        this.f25898c = ojuVar3;
    }

    public gos(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, short[][][] sArr) {
        this.f25899d = i;
        this.f25897b = ojuVar;
        this.f25896a = ojuVar2;
        this.f25898c = ojuVar3;
    }

    public gos(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, boolean[][][] zArr) {
        this.f25899d = i;
        this.f25897b = ojuVar;
        this.f25896a = ojuVar2;
        this.f25898c = ojuVar3;
    }

    /* JADX INFO: renamed from: a */
    public static gos m9587a(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new gos(ojuVar, ojuVar2, ojuVar3, 18, (boolean[][][]) null);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        gzm gzmVar;
        mxk mxkVarMo17127f;
        switch (this.f25899d) {
            case 0:
                return new gor((kfk) this.f25896a.get(), (Map) this.f25897b.get(), (mrm) this.f25898c.get());
            case 1:
                dhv dhvVar = (dhv) this.f25896a.get();
                ((erq) this.f25898c).get();
                goy.m9590c(dhvVar);
                return cdw.f5366g;
            case 2:
                dhv dhvVar2 = (dhv) this.f25897b.get();
                ((cde) this.f25896a).m3490a().booleanValue();
                ohh.m18485a(this.f25898c);
                dhvVar2.mo6184l(dhi.f11115b);
                mzx mzxVar = mzx.f41874a;
                mzxVar.getClass();
                return mzxVar;
            case 3:
                return new gps((elx) this.f25898c.get(), (jvd) this.f25897b.get(), ((dws) this.f25896a).m6830a(), gtd.m9736s());
            case 4:
                Activity activity = ((ema) this.f25896a).get();
                ceb cebVar = (ceb) this.f25898c.get();
                nps npsVar = (nps) this.f25897b.get();
                bek bekVar = new bek(activity, cebVar, 4);
                npsVar.mo2282d(bekVar, not.INSTANCE);
                return bekVar;
            case 5:
                return new gqm((feq) this.f25898c.get(), (lbn) this.f25896a.get(), (gqq) this.f25897b.get(), null);
            case 6:
                return new grc(jzn.m13829q("BckndCritEx", -8), jzn.m13829q("BckndFastEx", 8), jzn.m13829q("BckndAvgEx", 11), jzn.m13829q("BckndSlowEx", 9), new gry(), (gqq) this.f25896a.get(), (kbz) this.f25897b.get(), ((dww) this.f25898c).m6836a().getDimensionPixelSize(C0100R.dimen.rounded_thumbnail_diameter_max));
            case 7:
                return new gvm(((dws) this.f25896a).m6830a(), (cej) this.f25898c.get(), ((dki) this.f25897b).get());
            case 8:
                return new gwd((jvd) this.f25897b.get(), (dhv) this.f25898c.get(), (jww) this.f25896a.get());
            case 9:
                return new djm(this.f25896a, this.f25898c, this.f25897b);
            case 10:
                return new gye((jvd) this.f25897b.get(), (gxa) this.f25896a.get(), ohh.m18485a(this.f25898c));
            case 11:
                return new gxn((jww) this.f25897b.get(), (jww) this.f25898c.get(), (jww) this.f25896a.get(), 5);
            case 12:
                ihk ihkVar = ((haj) this.f25897b).get();
                dhv dhvVar3 = (dhv) this.f25896a.get();
                ohb ohbVarM18485a = ohh.m18485a(this.f25898c);
                HashSet hashSet = new HashSet(Arrays.asList(gzm.values()));
                if (!dhvVar3.mo6183k(dib.f11320ba)) {
                    hashSet.remove(gzm.FPS_60);
                }
                if (!dhvVar3.mo6183k(dib.f11239Z)) {
                    hashSet.remove(gzm.FPS_AUTO);
                }
                dhx dhxVar = dhh.f11074a;
                dhvVar3.mo6177e();
                hashSet.remove(gzm.FPS_24);
                if (hashSet.contains(gzm.FPS_AUTO) && dhvVar3.mo6184l(dib.f11238Y)) {
                    gzmVar = gzm.FPS_AUTO;
                } else {
                    if (!hashSet.contains(gzm.FPS_30)) {
                        ((nbe) ((nbe) hat.f27104a.m17251b()).mo17276G((char) 3400)).mo17290o("30 FPS is not available");
                    }
                    gzmVar = gzm.FPS_30;
                }
                haq haqVar = dhvVar3.mo6184l(dhh.f11108u) ? new haq(ihkVar.m11351s("pref_video_fps_p2018_key", gzmVar.name())) : (haq) ohbVarM18485a.get();
                if (!hashSet.contains(haqVar.mo3831be())) {
                    haqVar.mo3831be();
                    haqVar.mo3415bf(gzmVar);
                }
                haqVar.getClass();
                return haqVar;
            case 13:
                return new djm((haq) this.f25896a.get(), (haq) this.f25898c.get(), (haq) this.f25897b.get());
            case 14:
                return new djm((dhv) this.f25898c.get(), (jww) this.f25896a.get(), (hnw) this.f25897b.get());
            case 15:
                return new hbs(((emn) this.f25896a).get(), (Executor) this.f25898c.get(), (ScheduledExecutorService) this.f25897b.get());
            case 16:
                return new hca((fcp) this.f25897b.get(), kdz.m14010a(), (bko) this.f25896a.get(), (hah) this.f25898c.get(), null, null, null, null);
            case 17:
                Object obj = this.f25897b.get();
                dsx dsxVar = ((dms) this.f25896a).get();
                dhv dhvVar4 = (dhv) this.f25898c.get();
                htb htbVar = (htb) obj;
                dsxVar.m6695j();
                Object objM17136H = dhvVar4.mo6184l(dhi.f11128o) ? mxk.m17136H(new hcr(htbVar, null)) : mzx.f41874a;
                objM17136H.getClass();
                return objM17136H;
            case 18:
                return dez.m6036f(new gxn(((dms) this.f25896a).get(), (htb) this.f25897b.get(), ((fxj) this.f25898c).m8922a(), 7, (byte[]) null, (byte[]) null), "smarts");
            case 19:
                boolean zBooleanValue = ((Boolean) this.f25896a.get()).booleanValue();
                AmbientModeSupport.AmbientController ambientController = (AmbientModeSupport.AmbientController) this.f25897b.get();
                mrm mrmVarM10179a = ((hfb) this.f25898c).m10179a();
                if (zBooleanValue) {
                    mxi mxiVarM17132D = mxk.m17132D();
                    mxiVarM17132D.mo17072d(new ets(ambientController, mrmVarM10179a, 3, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null));
                    mxkVarMo17127f = mxiVarM17132D.mo17127f();
                } else {
                    mxkVarMo17127f = mzx.f41874a;
                }
                mxkVarMo17127f.getClass();
                return mxkVarMo17127f;
            default:
                return new hgm(((emd) this.f25896a).get(), (hhi) this.f25897b.get(), (hfo) this.f25898c.get());
        }
    }
}
