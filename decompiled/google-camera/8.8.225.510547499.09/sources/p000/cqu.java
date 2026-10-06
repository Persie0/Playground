package p000;

import android.content.Context;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.camerafatalerror.CameraFatalErrorTrackerDatabase;
import com.google.android.apps.camera.hdrplus.deblurfusion.DeblurFusionControllerImpl;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class cqu implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f9035a;

    /* JADX INFO: renamed from: b */
    private final oju f9036b;

    /* JADX INFO: renamed from: c */
    private final oju f9037c;

    /* JADX INFO: renamed from: d */
    private final oju f9038d;

    /* JADX INFO: renamed from: e */
    private final oju f9039e;

    /* JADX INFO: renamed from: f */
    private final oju f9040f;

    /* JADX INFO: renamed from: g */
    private final oju f9041g;

    /* JADX INFO: renamed from: h */
    private final /* synthetic */ int f9042h;

    public cqu(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i) {
        this.f9042h = i;
        this.f9035a = ojuVar;
        this.f9036b = ojuVar2;
        this.f9037c = ojuVar3;
        this.f9038d = ojuVar4;
        this.f9039e = ojuVar5;
        this.f9040f = ojuVar6;
        this.f9041g = ojuVar7;
    }

    public cqu(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, byte[] bArr) {
        this.f9042h = i;
        this.f9035a = ojuVar;
        this.f9039e = ojuVar2;
        this.f9041g = ojuVar3;
        this.f9037c = ojuVar4;
        this.f9038d = ojuVar5;
        this.f9040f = ojuVar6;
        this.f9036b = ojuVar7;
    }

    public cqu(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, byte[] bArr, byte[] bArr2) {
        this.f9042h = i;
        this.f9041g = ojuVar;
        this.f9037c = ojuVar2;
        this.f9036b = ojuVar3;
        this.f9038d = ojuVar4;
        this.f9039e = ojuVar5;
        this.f9040f = ojuVar6;
        this.f9035a = ojuVar7;
    }

    public cqu(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, char[] cArr) {
        this.f9042h = i;
        this.f9040f = ojuVar;
        this.f9036b = ojuVar2;
        this.f9035a = ojuVar3;
        this.f9039e = ojuVar4;
        this.f9037c = ojuVar5;
        this.f9038d = ojuVar6;
        this.f9041g = ojuVar7;
    }

    public cqu(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, char[] cArr, byte[] bArr) {
        this.f9042h = i;
        this.f9039e = ojuVar;
        this.f9041g = ojuVar2;
        this.f9037c = ojuVar3;
        this.f9036b = ojuVar4;
        this.f9040f = ojuVar5;
        this.f9038d = ojuVar6;
        this.f9035a = ojuVar7;
    }

    public cqu(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, float[] fArr) {
        this.f9042h = i;
        this.f9035a = ojuVar;
        this.f9040f = ojuVar2;
        this.f9038d = ojuVar3;
        this.f9039e = ojuVar4;
        this.f9036b = ojuVar5;
        this.f9041g = ojuVar6;
        this.f9037c = ojuVar7;
    }

    public cqu(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, int[] iArr) {
        this.f9042h = i;
        this.f9036b = ojuVar;
        this.f9037c = ojuVar2;
        this.f9041g = ojuVar3;
        this.f9035a = ojuVar4;
        this.f9039e = ojuVar5;
        this.f9040f = ojuVar6;
        this.f9038d = ojuVar7;
    }

    public cqu(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, short[] sArr) {
        this.f9042h = i;
        this.f9038d = ojuVar;
        this.f9039e = ojuVar2;
        this.f9035a = ojuVar3;
        this.f9040f = ojuVar4;
        this.f9037c = ojuVar5;
        this.f9041g = ojuVar6;
        this.f9036b = ojuVar7;
    }

    public cqu(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, boolean[] zArr) {
        this.f9042h = i;
        this.f9039e = ojuVar;
        this.f9038d = ojuVar2;
        this.f9040f = ojuVar3;
        this.f9037c = ojuVar4;
        this.f9036b = ojuVar5;
        this.f9035a = ojuVar6;
        this.f9041g = ojuVar7;
    }

    public cqu(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, byte[][] bArr) {
        this.f9042h = i;
        this.f9039e = ojuVar;
        this.f9037c = ojuVar2;
        this.f9035a = ojuVar3;
        this.f9040f = ojuVar4;
        this.f9036b = ojuVar5;
        this.f9041g = ojuVar6;
        this.f9038d = ojuVar7;
    }

    public cqu(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, char[][] cArr) {
        this.f9042h = i;
        this.f9038d = ojuVar;
        this.f9041g = ojuVar2;
        this.f9040f = ojuVar3;
        this.f9039e = ojuVar4;
        this.f9036b = ojuVar5;
        this.f9037c = ojuVar6;
        this.f9035a = ojuVar7;
    }

    public cqu(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, float[][] fArr) {
        this.f9042h = i;
        this.f9035a = ojuVar;
        this.f9037c = ojuVar2;
        this.f9039e = ojuVar3;
        this.f9038d = ojuVar4;
        this.f9040f = ojuVar5;
        this.f9041g = ojuVar6;
        this.f9036b = ojuVar7;
    }

    public cqu(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, int[][] iArr) {
        this.f9042h = i;
        this.f9039e = ojuVar;
        this.f9037c = ojuVar2;
        this.f9041g = ojuVar3;
        this.f9035a = ojuVar4;
        this.f9036b = ojuVar5;
        this.f9040f = ojuVar6;
        this.f9038d = ojuVar7;
    }

    public cqu(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, short[][] sArr) {
        this.f9042h = i;
        this.f9038d = ojuVar;
        this.f9040f = ojuVar2;
        this.f9036b = ojuVar3;
        this.f9035a = ojuVar4;
        this.f9041g = ojuVar5;
        this.f9037c = ojuVar6;
        this.f9039e = ojuVar7;
    }

    public cqu(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, boolean[][] zArr) {
        this.f9042h = i;
        this.f9038d = ojuVar;
        this.f9039e = ojuVar2;
        this.f9037c = ojuVar3;
        this.f9035a = ojuVar4;
        this.f9040f = ojuVar5;
        this.f9036b = ojuVar6;
        this.f9041g = ojuVar7;
    }

    public cqu(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, byte[][][] bArr) {
        this.f9042h = i;
        this.f9037c = ojuVar;
        this.f9035a = ojuVar2;
        this.f9038d = ojuVar3;
        this.f9039e = ojuVar4;
        this.f9040f = ojuVar5;
        this.f9041g = ojuVar6;
        this.f9036b = ojuVar7;
    }

    public cqu(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, char[][][] cArr) {
        this.f9042h = i;
        this.f9041g = ojuVar;
        this.f9035a = ojuVar2;
        this.f9039e = ojuVar3;
        this.f9036b = ojuVar4;
        this.f9040f = ojuVar5;
        this.f9037c = ojuVar6;
        this.f9038d = ojuVar7;
    }

    public cqu(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, float[][][] fArr) {
        this.f9042h = i;
        this.f9037c = ojuVar;
        this.f9039e = ojuVar2;
        this.f9036b = ojuVar3;
        this.f9040f = ojuVar4;
        this.f9038d = ojuVar5;
        this.f9035a = ojuVar6;
        this.f9041g = ojuVar7;
    }

    public cqu(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, int[][][] iArr) {
        this.f9042h = i;
        this.f9038d = ojuVar;
        this.f9041g = ojuVar2;
        this.f9036b = ojuVar3;
        this.f9037c = ojuVar4;
        this.f9040f = ojuVar5;
        this.f9035a = ojuVar6;
        this.f9039e = ojuVar7;
    }

    public cqu(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, short[][][] sArr) {
        this.f9042h = i;
        this.f9038d = ojuVar;
        this.f9035a = ojuVar2;
        this.f9036b = ojuVar3;
        this.f9040f = ojuVar4;
        this.f9041g = ojuVar5;
        this.f9039e = ojuVar6;
        this.f9037c = ojuVar7;
    }

    public cqu(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, int i, boolean[][][] zArr) {
        this.f9042h = i;
        this.f9041g = ojuVar;
        this.f9035a = ojuVar2;
        this.f9039e = ojuVar3;
        this.f9036b = ojuVar4;
        this.f9040f = ojuVar5;
        this.f9037c = ojuVar6;
        this.f9038d = ojuVar7;
    }

    /* JADX INFO: renamed from: a */
    public static cqu m5378a(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7) {
        return new cqu(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, 8, (char[][]) null);
    }

    /* JADX INFO: renamed from: b */
    public static cqu m5379b(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7) {
        return new cqu(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, 12, (float[][]) null);
    }

    /* JADX INFO: renamed from: c */
    public static cqu m5380c(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7) {
        return new cqu(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, 13, (byte[][][]) null);
    }

    /* JADX INFO: renamed from: d */
    public static cqu m5381d(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7) {
        return new cqu(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, 15, (short[][][]) null);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        mxi mxiVar;
        mxk mxkVarMo17127f;
        Object objM17136H;
        switch (this.f9042h) {
            case 0:
                return new ljf(this.f9035a, this.f9036b, this.f9037c, this.f9038d, this.f9039e, this.f9040f, this.f9041g, (byte[]) null, (byte[]) null, (byte[]) null);
            case 1:
                return new cgj((mwx) this.f9035a.get(), ((gll) this.f9039e).get(), ((fwt) this.f9041g).get(), (gva) this.f9037c.get(), (Executor) this.f9038d.get(), (dhv) this.f9040f.get(), (mrm) this.f9036b.get(), null);
            case 2:
                return new ljf(this.f9040f, this.f9036b, this.f9035a, this.f9039e, this.f9037c, this.f9038d, this.f9041g, (char[]) null, (byte[]) null);
            case 3:
                return new cta(((erq) this.f9038d).get(), (fws) this.f9039e.get(), (cuh) this.f9035a.get(), (kpb) this.f9040f.get(), ((csw) this.f9037c).get(), (jvd) this.f9041g.get(), ((ina) this.f9036b).get(), null, null, null);
            case 4:
                return new cxj(((ity) this.f9036b).get(), (cwd) this.f9037c.get(), (jww) this.f9041g.get(), (dhv) this.f9035a.get(), (htb) this.f9039e.get(), ((crv) this.f9040f).m5442a(), (dbr) this.f9038d.get(), null, null, null, null);
            case 5:
                Context contextM6830a = ((dws) this.f9039e).m6830a();
                kmd kmdVarM8604a = ((fne) this.f9038d).m8604a();
                dhv dhvVar = (dhv) this.f9040f.get();
                Executor executor = (Executor) this.f9037c.get();
                kbz kbzVar = (kbz) this.f9036b.get();
                jvb jvbVar = (jvb) this.f9041g.get();
                kcf kcfVar = new kcf(executor, kbzVar, "SmartCaptureFQS");
                mqu mquVar = mqu.f41450a;
                gtw gtwVarM9769a = gtw.m9769a(contextM6830a, dhvVar, kmdVarM8604a, kcfVar, kbzVar, false, mquVar, mquVar);
                jvbVar.m13537d(gtwVarM9769a);
                return gtwVarM9769a;
            case 6:
                return new czp(((cwb) this.f9035a).get(), ((cen) this.f9040f).get(), ((cvz) this.f9038d).get(), (gtc) this.f9039e.get(), (gtl) this.f9036b.get(), (imu) this.f9041g.get(), (jvb) this.f9037c.get());
            case 7:
                return new dar((gyz) this.f9039e.get(), (jwn) this.f9037c.get(), (dal) this.f9035a.get(), (elx) this.f9040f.get(), (jfs) this.f9036b.get(), (jvd) this.f9041g.get(), ((ema) this.f9038d).get(), null, null, null);
            case 8:
                return new dbv((dck) this.f9038d.get(), (jvd) this.f9041g.get(), (ddq) this.f9040f.get(), ((dce) this.f9039e).get(), (fcp) this.f9036b.get(), ((kbm) this.f9037c).get(), (dcf) this.f9035a.get(), null, null, null);
            case 9:
                CameraFatalErrorTrackerDatabase cameraFatalErrorTrackerDatabase = (CameraFatalErrorTrackerDatabase) this.f9038d.get();
                Executor executorM3838a = ((ckl) this.f9040f).m3838a();
                fcp fcpVar = (fcp) this.f9036b.get();
                return new dct(cameraFatalErrorTrackerDatabase, executorM3838a, fcpVar, (jvd) this.f9041g.get(), (dhv) this.f9037c.get(), ((dcp) this.f9039e).get(), null);
            case 10:
                dhv dhvVar2 = (dhv) this.f9039e.get();
                hah hahVar = (hah) this.f9037c.get();
                AmbientModeSupport.AmbientController ambientController = (AmbientModeSupport.AmbientController) this.f9041g.get();
                ohb ohbVarM18485a = ohh.m18485a(this.f9035a);
                ohb ohbVarM18485a2 = ohh.m18485a(this.f9036b);
                ohb ohbVarM18485a3 = ohh.m18485a(this.f9040f);
                ohb ohbVarM18485a4 = ohh.m18485a(this.f9038d);
                mxi mxiVarM17132D = mxk.m17132D();
                if (dhvVar2.mo6184l(dhi.f11115b)) {
                    jwn jwnVarMo10029a = hahVar.mo10029a(gzy.f27058q);
                    HashSet hashSet = new HashSet();
                    hashSet.add(ikw.PHOTO);
                    if (dhvVar2.mo6184l(dhi.f11127n)) {
                        hashSet.add(ikw.LONG_EXPOSURE);
                    }
                    if (dhvVar2.mo6184l(dhi.f11128o)) {
                        hashSet.add(ikw.MOTION_BLUR);
                    }
                    if (dhvVar2.mo6184l(dhi.f11116c)) {
                        mxiVar = mxiVarM17132D;
                        mxiVar.mo17072d(new dfs(ambientController, ohbVarM18485a, hashSet, dhvVar2, jwnVarMo10029a, 1, null, null, null, null));
                    } else {
                        mxiVar = mxiVarM17132D;
                    }
                    if (dhvVar2.mo6184l(dhi.f11123j)) {
                        mxiVar.mo17072d(new dfs(ambientController, ohbVarM18485a2, hashSet, dhvVar2, jwnVarMo10029a, 0, null, null, null, null));
                    }
                    if (dhvVar2.mo6184l(dhi.f11121h)) {
                        mxiVar.mo17072d(new dft(ambientController, ohbVarM18485a3, jwnVarMo10029a, 0, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null));
                    }
                    if (dhvVar2.mo6184l(dhi.f11130q)) {
                        mxiVar.mo17072d(new dft(ambientController, ohbVarM18485a4, jwnVarMo10029a, 2, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null));
                    }
                    mxkVarMo17127f = mxiVar.mo17127f();
                } else {
                    mxkVarMo17127f = mxiVarM17132D.mo17127f();
                }
                mxkVarMo17127f.getClass();
                return mxkVarMo17127f;
            case 11:
                return new ljf(((djo) this.f9038d).get(), ((dws) this.f9039e).m6830a(), ((dze) this.f9037c).get(), ((djk) this.f9035a).get(), ((dzy) this.f9040f).get(), ((dzf) this.f9036b).get(), (kbz) this.f9041g.get(), null, null, null, null);
            case 12:
                dhv dhvVar3 = (dhv) this.f9035a.get();
                mrm mrmVar = (mrm) this.f9037c.get();
                final oju ojuVar = this.f9039e;
                final kmd kmdVar = (kmd) this.f9038d.get();
                final cem cemVar = ((cen) this.f9040f).get();
                final jvb jvbVar2 = (jvb) this.f9041g.get();
                final kbz kbzVar2 = (kbz) this.f9036b.get();
                Object objM17136H2 = (dhvVar3.mo6184l(dhr.f11161a) && mrmVar.mo16813g()) ? mxk.m17136H(new ciw() { // from class: dtd
                    @Override // p000.ciw
                    /* JADX INFO: renamed from: bd */
                    public final nps mo3538bd() {
                        kbz kbzVar3 = kbzVar2;
                        oju ojuVar2 = ojuVar;
                        kmd kmdVar2 = kmdVar;
                        cem cemVar2 = cemVar;
                        jvb jvbVar3 = jvbVar2;
                        kbzVar3.mo13961e("FCFrameConsumer.Startup");
                        dtc dtcVar = (dtc) ojuVar2.get();
                        dtcVar.m6716a(kmdVar2, cemVar2);
                        dtcVar.getClass();
                        jvbVar3.m13537d(new dev(dtcVar, 17));
                        kbzVar3.mo13962f();
                        return kxk.m14965K(true);
                    }

                    @Override // p000.ciw
                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ String mo3539c() {
                        return dez.m6039i(this);
                    }
                }) : mzx.f41874a;
                objM17136H2.getClass();
                return objM17136H2;
            case 13:
                oju ojuVar2 = this.f9037c;
                oju ojuVar3 = this.f9035a;
                dsx dsxVar = ((dms) this.f9038d).get();
                dhv dhvVar4 = (dhv) this.f9039e.get();
                lqc lqcVar = ((fxb) this.f9040f).get();
                ckp ckpVar = (ckp) this.f9041g.get();
                kbz kbzVar3 = (kbz) this.f9036b.get();
                dxu.m6872h(dsxVar, dhvVar4, lqcVar);
                return mxk.m17136H(new dxt(ojuVar3, ckpVar, kbzVar3, ojuVar2, 0));
            case 14:
                return new DeblurFusionControllerImpl((gpx) this.f9041g.get(), (Executor) this.f9035a.get(), (jwf) this.f9039e.get(), (kbz) this.f9036b.get(), this.f9040f, (dhv) this.f9037c.get(), ((dws) this.f9038d).m6830a());
            case 15:
                boolean zBooleanValue = ((egx) this.f9038d).m7318b().booleanValue();
                boolean zBooleanValue2 = ((egx) this.f9035a).m7318b().booleanValue();
                oju ojuVar4 = this.f9036b;
                dhv dhvVar5 = (dhv) this.f9040f.get();
                Map map = (Map) this.f9041g.get();
                ((glg) this.f9039e).get();
                if (zBooleanValue2 && map.containsKey(gnf.RAW_WIDE_ZOOM_UPPER)) {
                    String str = dht.f11173a;
                    dhvVar5.mo6177e();
                }
                Object objM17136H3 = (zBooleanValue || zBooleanValue2) ? mxk.m17136H((ech) ojuVar4.get()) : mzx.f41874a;
                objM17136H3.getClass();
                return objM17136H3;
            case 16:
                final mrm mrmVar2 = (mrm) this.f9038d.get();
                final jwf jwfVar = (jwf) this.f9041g.get();
                final hnv hnvVarM10532a = ((hog) this.f9036b).m10532a();
                final hnw hnwVar = (hnw) this.f9037c.get();
                final jvd jvdVar = (jvd) this.f9040f.get();
                final chx chxVar = (chx) this.f9035a.get();
                final dhv dhvVar6 = (dhv) this.f9039e.get();
                return mrmVar2.mo16813g() ? jbx.m12869n(new Runnable() { // from class: egp
                    @Override // java.lang.Runnable
                    public final void run() {
                        mrm mrmVar3 = mrmVar2;
                        dhv dhvVar7 = dhvVar6;
                        chx chxVar2 = chxVar;
                        hnw hnwVar2 = hnwVar;
                        jvd jvdVar2 = jvdVar;
                        hnv hnvVar = hnvVarM10532a;
                        jwf jwfVar2 = jwfVar;
                        ((egk) mrmVar3.mo16809c()).mo4171c();
                        String str2 = dht.f11173a;
                        dhvVar7.mo6175c();
                        jvb jvbVar3 = chxVar2.f5767b;
                        hny hnyVarM10529a = hnz.m10529a();
                        hnyVarM10529a.m10525d("FusionZoom");
                        hnyVarM10529a.m10524c(jvdVar2);
                        hnyVarM10529a.m10528g(hnvVar);
                        hnyVarM10529a.m10527f(new efd(jwfVar2, 5));
                        hnyVarM10529a.m10526e(new efd(jwfVar2, 6));
                        jvbVar3.m13537d(hnwVar2.mo10519f(hnyVarM10529a.m10522a()));
                    }
                }) : cdw.f5366g;
            case 17:
                return new egt((gpx) this.f9041g.get(), (Executor) this.f9035a.get(), (jwf) this.f9039e.get(), (kbz) this.f9036b.get(), ((fjp) this.f9040f).m8495b(), (dhv) this.f9037c.get(), ((dws) this.f9038d).m6830a());
            case 18:
                return new eim((khy) this.f9037c.get(), ((kbm) this.f9039e).get(), (kbz) this.f9036b.get(), (eka) this.f9040f.get(), (ekd) this.f9038d.get(), (jvd) this.f9035a.get(), (cgb) this.f9041g.get());
            case 19:
                return new eoi(((ebo) this.f9041g).get(), (eby) this.f9037c.get(), (bko) this.f9036b.get(), (eoc) this.f9038d.get(), ((eoj) this.f9039e).get(), (dhv) this.f9040f.get(), (Executor) this.f9035a.get(), null, null, null, null, null);
            default:
                final AmbientModeSupport.AmbientController ambientController2 = (AmbientModeSupport.AmbientController) this.f9041g.get();
                final ezi eziVar = (ezi) this.f9037c.get();
                final jww jwwVarM7558a = eng.m7558a();
                final hnw hnwVar2 = (hnw) this.f9036b.get();
                final eyv eyvVar = ((eyw) this.f9040f).get();
                final cdu cduVar = ((err) this.f9038d).get();
                boolean zBooleanValue3 = ((egx) this.f9035a).m7318b().booleanValue();
                jww jwwVar = eza.f21026a;
                if (zBooleanValue3) {
                    final byte[] bArr = null;
                    final byte[] bArr2 = null;
                    final byte[] bArr3 = null;
                    final byte[] bArr4 = null;
                    objM17136H = mxk.m17136H(new hjk(hnwVar2, eyvVar, ambientController2, eziVar, jwwVarM7558a, bArr, bArr2, bArr3, bArr4) { // from class: eyz

                        /* JADX INFO: renamed from: a */
                        public final /* synthetic */ hnw f21018a;

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ eyv f21019b;

                        /* JADX INFO: renamed from: c */
                        public final /* synthetic */ ezi f21020c;

                        /* JADX INFO: renamed from: d */
                        public final /* synthetic */ jww f21021d;

                        /* JADX INFO: renamed from: f */
                        public final /* synthetic */ AmbientModeSupport.AmbientController f21023f;

                        @Override // java.lang.Runnable
                        public final void run() {
                            cdu cduVar2 = this.f21022e;
                            hnw hnwVar3 = this.f21018a;
                            eyv eyvVar2 = this.f21019b;
                            AmbientModeSupport.AmbientController ambientController3 = this.f21023f;
                            ezi eziVar2 = this.f21020c;
                            jww jwwVar2 = this.f21021d;
                            jww jwwVar3 = eza.f21026a;
                            cduVar2.m3529i().m13537d(hnwVar3.mo10519f(eyvVar2));
                            lja ljaVarM10159a = het.m10159a();
                            ljaVarM10159a.f38344c = "LensLite";
                            ljaVarM10159a.m15517g(mxk.m17136H(kmq.BACK));
                            ljaVarM10159a.m15518h(mxk.m17136H(ikw.PHOTO));
                            ljaVarM10159a.m15519i(jwwVar2);
                            ambientController3.m1661k(eziVar2, ljaVarM10159a.m15516f());
                        }
                    });
                } else {
                    objM17136H = mzx.f41874a;
                }
                objM17136H.getClass();
                return objM17136H;
        }
    }
}
