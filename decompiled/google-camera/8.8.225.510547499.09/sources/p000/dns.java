package p000;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthUtils;
import com.google.android.apps.camera.filmstrip.transition.FilmstripTransitionLayout;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dns implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f12114a;

    /* JADX INFO: renamed from: b */
    private final oju f12115b;

    /* JADX INFO: renamed from: c */
    private final oju f12116c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f12117d;

    public dns(oju ojuVar, oju ojuVar2, oju ojuVar3, int i) {
        this.f12117d = i;
        this.f12114a = ojuVar;
        this.f12115b = ojuVar2;
        this.f12116c = ojuVar3;
    }

    public dns(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, byte[] bArr) {
        this.f12117d = i;
        this.f12116c = ojuVar;
        this.f12114a = ojuVar2;
        this.f12115b = ojuVar3;
    }

    public dns(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, char[] cArr) {
        this.f12117d = i;
        this.f12116c = ojuVar;
        this.f12114a = ojuVar2;
        this.f12115b = ojuVar3;
    }

    public dns(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, float[] fArr) {
        this.f12117d = i;
        this.f12116c = ojuVar;
        this.f12115b = ojuVar2;
        this.f12114a = ojuVar3;
    }

    public dns(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, int[] iArr) {
        this.f12117d = i;
        this.f12116c = ojuVar;
        this.f12114a = ojuVar2;
        this.f12115b = ojuVar3;
    }

    public dns(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, short[] sArr) {
        this.f12117d = i;
        this.f12116c = ojuVar;
        this.f12115b = ojuVar2;
        this.f12114a = ojuVar3;
    }

    public dns(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, boolean[] zArr) {
        this.f12117d = i;
        this.f12116c = ojuVar;
        this.f12114a = ojuVar2;
        this.f12115b = ojuVar3;
    }

    public dns(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, byte[][] bArr) {
        this.f12117d = i;
        this.f12115b = ojuVar;
        this.f12116c = ojuVar2;
        this.f12114a = ojuVar3;
    }

    public dns(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, char[][] cArr) {
        this.f12117d = i;
        this.f12116c = ojuVar;
        this.f12114a = ojuVar2;
        this.f12115b = ojuVar3;
    }

    public dns(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, float[][] fArr) {
        this.f12117d = i;
        this.f12115b = ojuVar;
        this.f12114a = ojuVar2;
        this.f12116c = ojuVar3;
    }

    public dns(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, int[][] iArr) {
        this.f12117d = i;
        this.f12116c = ojuVar;
        this.f12115b = ojuVar2;
        this.f12114a = ojuVar3;
    }

    public dns(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, short[][] sArr) {
        this.f12117d = i;
        this.f12116c = ojuVar;
        this.f12115b = ojuVar2;
        this.f12114a = ojuVar3;
    }

    public dns(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, boolean[][] zArr) {
        this.f12117d = i;
        this.f12115b = ojuVar;
        this.f12116c = ojuVar2;
        this.f12114a = ojuVar3;
    }

    public dns(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, byte[][][] bArr) {
        this.f12117d = i;
        this.f12116c = ojuVar;
        this.f12115b = ojuVar2;
        this.f12114a = ojuVar3;
    }

    public dns(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, char[][][] cArr) {
        this.f12117d = i;
        this.f12115b = ojuVar;
        this.f12114a = ojuVar2;
        this.f12116c = ojuVar3;
    }

    public dns(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, float[][][] fArr) {
        this.f12117d = i;
        this.f12114a = ojuVar;
        this.f12116c = ojuVar2;
        this.f12115b = ojuVar3;
    }

    public dns(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, int[][][] iArr) {
        this.f12117d = i;
        this.f12114a = ojuVar;
        this.f12116c = ojuVar2;
        this.f12115b = ojuVar3;
    }

    public dns(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, short[][][] sArr) {
        this.f12117d = i;
        this.f12114a = ojuVar;
        this.f12116c = ojuVar2;
        this.f12115b = ojuVar3;
    }

    public dns(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, boolean[][][] zArr) {
        this.f12117d = i;
        this.f12114a = ojuVar;
        this.f12116c = ojuVar2;
        this.f12115b = ojuVar3;
    }

    /* JADX INFO: renamed from: a */
    public static dns m6448a(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new dns(ojuVar, ojuVar2, ojuVar3, 4, (int[]) null);
    }

    /* JADX INFO: renamed from: b */
    public static dns m6449b(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new dns(ojuVar, ojuVar2, ojuVar3, 5, (boolean[]) null);
    }

    /* JADX INFO: renamed from: c */
    public static dns m6450c(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new dns(ojuVar, ojuVar2, ojuVar3, 6, (float[]) null);
    }

    /* JADX INFO: renamed from: d */
    public static dns m6451d(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new dns(ojuVar, ojuVar2, ojuVar3, 7, (byte[][]) null);
    }

    /* JADX INFO: renamed from: e */
    public static dns m6452e(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new dns(ojuVar, ojuVar2, ojuVar3, 11, (short[][]) null);
    }

    /* JADX INFO: renamed from: f */
    public static dns m6453f(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new dns(ojuVar, ojuVar2, ojuVar3, 13, (boolean[][]) null);
    }

    /* JADX INFO: renamed from: g */
    public static dns m6454g(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new dns(ojuVar, ojuVar2, ojuVar3, 14, (float[][]) null);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        Object objM17136H;
        boolean z = false;
        switch (this.f12117d) {
            case 0:
                return new DynamicDepthUtils(((dhv) this.f12114a.get()).mo6184l(dib.f11340bu), ((fjp) this.f12115b).m8495b(), (kpb) this.f12116c.get());
            case 1:
                dhv dhvVar = (dhv) this.f12116c.get();
                ((Boolean) this.f12115b.get()).booleanValue();
                int i = dhn.f11140a;
                dhvVar.mo6177e();
                return jwr.m13637g(false);
            case 2:
                jww jwwVar = (jww) this.f12116c.get();
                ohb ohbVarM18485a = ohh.m18485a(this.f12114a);
                kbz kbzVar = (kbz) this.f12115b.get();
                if (!((Boolean) jwwVar.mo3831be()).booleanValue()) {
                    return cdw.f5364e;
                }
                Runnable runnableMo13959c = kbzVar.mo13959c("ddcWarmup", new dgt(ohbVarM18485a, 12));
                runnableMo13959c.getClass();
                return new dlr(runnableMo13959c, 2);
            case 3:
                boolean zBooleanValue = ((Boolean) this.f12116c.get()).booleanValue();
                boolean zBooleanValue2 = ((Boolean) this.f12115b.get()).booleanValue();
                jww jwwVar2 = (jww) this.f12114a.get();
                if (zBooleanValue && zBooleanValue2) {
                    jww jwwVarM13645b = jwv.m13645b(jwwVar2, ddu.f10588e, ddu.f10589f);
                    cdy cdyVar = cdy.f5386o;
                    gfj gfjVarM9181o = gfk.m9181o();
                    gfjVarM9181o.m9178r(gev.MAKEUP);
                    gfjVarM9181o.m9168h(C0100R.string.makeup_desc);
                    gfjVarM9181o.m9163c(C0100R.string.makeup_desc);
                    gfjVarM9181o.m9174n(gfc.MAKEUP_OFF, gfc.MAKEUP_ON);
                    Integer numValueOf = Integer.valueOf(C0100R.drawable.quantum_gm_ic_palette_white_24);
                    gfjVarM9181o.m9167g(numValueOf, numValueOf);
                    Integer numValueOf2 = Integer.valueOf(C0100R.string.makeup_off_desc);
                    Integer numValueOf3 = Integer.valueOf(C0100R.string.makeup_on_desc);
                    gfjVarM9181o.m9170j(numValueOf2, numValueOf3);
                    gfjVarM9181o.m9165e(numValueOf2, numValueOf3);
                    gfjVarM9181o.f24545a = jwwVarM13645b;
                    gfjVarM9181o.m9179s(cdyVar);
                    objM17136H = mxk.m17136H(gfjVarM9181o.m9161a());
                } else {
                    objM17136H = mzx.f41874a;
                }
                objM17136H.getClass();
                return objM17136H;
            case 4:
                boolean zBooleanValue3 = ((Boolean) this.f12116c.get()).booleanValue();
                jvb jvbVar = (jvb) this.f12114a.get();
                oju ojuVar = this.f12115b;
                if (!zBooleanValue3) {
                    return new dqu();
                }
                dpz dpzVar = ((dqa) ojuVar).get();
                jvbVar.m13537d(dpzVar);
                return dpzVar;
            case 5:
                boolean zBooleanValue4 = ((Boolean) this.f12116c.get()).booleanValue();
                jvb jvbVar2 = (jvb) this.f12114a.get();
                oju ojuVar2 = this.f12115b;
                if (!zBooleanValue4) {
                    return new dqu();
                }
                dqs dqsVar = ((dqt) ojuVar2).get();
                jvbVar2.m13537d(dqsVar);
                return dqsVar;
            case 6:
                return new dql((kbz) this.f12114a.get(), ohh.m18485a(this.f12116c), ohh.m18485a(this.f12115b), 0);
            case 7:
                return dez.m6037g(((kbz) this.f12114a.get()).mo13959c("FaceBeautificationCM.Startup", new dgt(this.f12115b, 16)), (Executor) this.f12116c.get(), "facebtf");
            case 8:
                jwn jwnVarM7271b = ((efm) this.f12114a).m7271b();
                final boolean zBooleanValue5 = ((Boolean) this.f12115b.get()).booleanValue();
                dqv dqvVar = new dqv((Executor) this.f12116c.get());
                dqvVar.m6610g(jwr.m13640j(jwnVarM7271b, new mrf() { // from class: dqw
                    @Override // p000.mrf
                    public final Object apply(Object obj) {
                        gzl gzlVar = (gzl) obj;
                        boolean z2 = false;
                        if (zBooleanValue5 && gzlVar != gzl.OFF) {
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                    }
                }));
                return dqvVar;
            case 9:
                jww jwwVar3 = (jww) this.f12116c.get();
                dhv dhvVar2 = (dhv) this.f12114a.get();
                oju ojuVar3 = this.f12115b;
                if (((Boolean) jwwVar3.mo3831be()).booleanValue()) {
                    z = true;
                } else {
                    dhx dhxVar = dhs.f11163a;
                    dhvVar2.mo6177e();
                }
                return new dry(z ? mrm.m16829i((dyl) ojuVar3.get()) : mqu.f41450a);
            case 10:
                Object objM17136H2 = !((Boolean) this.f12114a.get()).booleanValue() ? mzx.f41874a : mxk.m17136H(ipn.m11594a((ipm) this.f12116c.get(), (jwn) this.f12115b.get(), ipl.FACE_OBFUSCATION));
                objM17136H2.getClass();
                return objM17136H2;
            case 11:
                return new dql((kbz) this.f12114a.get(), ohh.m18485a(this.f12116c), ohh.m18485a(this.f12115b), 2);
            case 12:
                return new msa((dhv) this.f12116c.get(), ((Boolean) this.f12115b.get()).booleanValue(), (hai) this.f12114a.get());
            case 13:
                return new dsx((imu) this.f12116c.get(), ((fwz) this.f12114a).get());
            case 14:
                kfk kfkVar = (kfk) this.f12115b.get();
                mrm mrmVar = (mrm) this.f12114a.get();
                jvb jvbVar3 = (jvb) this.f12116c.get();
                if (!mrmVar.mo16813g()) {
                    return mqu.f41450a;
                }
                kfc kfcVarMo14131r = kfkVar.mo14131r((kho) mrmVar.mo16809c(), 2);
                jvbVar3.m13537d(kfcVarMo14131r);
                return mrm.m16829i(kfcVarMo14131r);
            case 15:
                dtj dtjVar = (dtj) this.f12116c.get();
                dtj dtjVar2 = (dtj) this.f12115b.get();
                dtj dtjVar3 = (dtj) this.f12114a.get();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (!Pattern.matches("feature\\.[a-z0-9\\-]+\\.[a-z0-9\\-]+\\.[a-z0-9\\-]+(:\\d+)?", "feature.acmi.camera.diet-interestingness")) {
                    throw new IllegalArgumentException("Feature with bad type name 'feature.acmi.camera.diet-interestingness'!");
                }
                arrayList.add(dtjVar);
                arrayList.add(dtjVar2);
                arrayList.add(dtjVar3);
                return dti.m6727a("feature.acmi.camera.diet-interestingness", arrayList, arrayList2);
            case 16:
                return dxu.m6867c(new gvi((dtk) this.f12114a.get()), (dvg) this.f12115b.get(), ((dun) this.f12116c).m6758a());
            case 17:
                SensorManager sensorManager = ((emt) this.f12114a).get();
                dth dthVarM6758a = ((dun) this.f12116c).m6758a();
                dvg dvgVar = (dvg) this.f12115b.get();
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                if (defaultSensor == null) {
                    ((nbe) ((nbe) dus.f12614a.m17252c()).mo17276G((char) 1138)).mo17290o("Accelerometer sensor not found! Signal will be missing.");
                    return duh.m6756b(dvgVar).m6749a();
                }
                dvd dvdVar = new dvd(dvgVar, 1);
                duc ducVarM6756b = duh.m6756b(dvgVar);
                ducVarM6756b.f12580c = dthVarM6758a;
                ducVarM6756b.f12581d.add(new dtw(defaultSensor, dvdVar));
                return ducVarM6756b.m6749a();
            case 18:
                kni kniVar = (kni) this.f12114a.get();
                dth dthVarM6758a2 = ((dun) this.f12116c).m6758a();
                dvg dvgVar2 = (dvg) this.f12115b.get();
                dur durVar = new dur(kniVar, dvgVar2);
                duc ducVarM6756b2 = duh.m6756b(dvgVar2);
                ducVarM6756b2.f12580c = dthVarM6758a2;
                ducVarM6756b2.m6750b(durVar);
                ducVarM6756b2.f12578a.add(new dtx(new drs(durVar, 6)));
                ducVarM6756b2.f12578a.add(new dty(new drs(durVar, 7)));
                return ducVarM6756b2.m6749a();
            case 19:
                bkn bknVar = ((gtp) this.f12114a).get();
                dth dthVarM6758a3 = ((dun) this.f12116c).m6758a();
                dvg dvgVar3 = (dvg) this.f12115b.get();
                duc ducVarM6756b3 = duh.m6756b(dvgVar3);
                ducVarM6756b3.f12580c = dthVarM6758a3;
                due dueVar = new due(new fya(bknVar, dvgVar3, null, null), null, null, null);
                ducVarM6756b3.m6750b(dueVar);
                ducVarM6756b3.m6751c(new dua(dueVar, 1));
                return ducVarM6756b3.m6749a();
            default:
                return new dvx((dvv) this.f12114a.get(), (FilmstripTransitionLayout) this.f12116c.get(), (chv) this.f12115b.get());
        }
    }
}
