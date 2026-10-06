package p000;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.HardwareBuffer;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.apps.camera.jni.microvideotonemap.yUpa.qQLA;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import com.google.android.libraries.lens.lenslite.dynamicloading.QSK.hIAHJKEnGsNbz;
import com.google.android.libraries.oliveoil.p018gl.EGLImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cmp implements dgg, fbp, fbn, fbo, her, gyi, cna, hsh, cmr, kos {

    /* JADX INFO: renamed from: a */
    public static final nbh f6238a = nbh.m17259h("com/google/android/apps/camera/brella/BeholderExampleGenerator");

    /* JADX INFO: renamed from: A */
    private gsr f6239A;

    /* JADX INFO: renamed from: B */
    private kmq f6240B;

    /* JADX INFO: renamed from: C */
    private jvb f6241C;

    /* JADX INFO: renamed from: D */
    private Rect f6242D;

    /* JADX INFO: renamed from: L */
    private final jwn f6250L;

    /* JADX INFO: renamed from: M */
    private final jww f6251M;

    /* JADX INFO: renamed from: N */
    private boolean f6252N;

    /* JADX INFO: renamed from: S */
    private final ggm f6257S;

    /* JADX INFO: renamed from: T */
    private final inm f6258T;

    /* JADX INFO: renamed from: U */
    private final jwn f6259U;

    /* JADX INFO: renamed from: b */
    public final dhv f6261b;

    /* JADX INFO: renamed from: c */
    public final gye f6262c;

    /* JADX INFO: renamed from: d */
    public final cof f6263d;

    /* JADX INFO: renamed from: e */
    public final jvd f6264e;

    /* JADX INFO: renamed from: f */
    public final fan f6265f;

    /* JADX INFO: renamed from: g */
    public final cok f6266g;

    /* JADX INFO: renamed from: h */
    public final ExecutorService f6267h;

    /* JADX INFO: renamed from: l */
    private final mrm f6271l;

    /* JADX INFO: renamed from: m */
    private final mrm f6272m;

    /* JADX INFO: renamed from: n */
    private final dtk f6273n;

    /* JADX INFO: renamed from: o */
    private final dtk f6274o;

    /* JADX INFO: renamed from: p */
    private final dtk f6275p;

    /* JADX INFO: renamed from: q */
    private final dtk f6276q;

    /* JADX INFO: renamed from: r */
    private final jqh f6277r;

    /* JADX INFO: renamed from: s */
    private final mvi f6278s;

    /* JADX INFO: renamed from: t */
    private final hah f6279t;

    /* JADX INFO: renamed from: u */
    private final mrm f6280u;

    /* JADX INFO: renamed from: v */
    private final cms f6281v;

    /* JADX INFO: renamed from: w */
    private final CameraActivityTiming f6282w;

    /* JADX INFO: renamed from: x */
    private final ksi f6283x;

    /* JADX INFO: renamed from: y */
    private final int f6284y;

    /* JADX INFO: renamed from: z */
    private final cot f6285z;

    /* JADX INFO: renamed from: i */
    public boolean f6268i = false;

    /* JADX INFO: renamed from: G */
    private final Queue f6245G = mvi.m17027c(1);

    /* JADX INFO: renamed from: H */
    private final List f6246H = new ArrayList();

    /* JADX INFO: renamed from: j */
    public long f6269j = 0;

    /* JADX INFO: renamed from: V */
    private final nax f6260V = new nax((byte[]) null, (char[]) null, (byte[]) null);

    /* JADX INFO: renamed from: E */
    private long f6243E = -1;

    /* JADX INFO: renamed from: F */
    private long f6244F = -1;

    /* JADX INFO: renamed from: I */
    private final AtomicInteger f6247I = new AtomicInteger(0);

    /* JADX INFO: renamed from: J */
    private final AtomicInteger f6248J = new AtomicInteger(0);

    /* JADX INFO: renamed from: K */
    private final AtomicInteger f6249K = new AtomicInteger(0);

    /* JADX INFO: renamed from: k */
    public final AtomicLong f6270k = new AtomicLong(-1);

    /* JADX INFO: renamed from: O */
    private int f6253O = 0;

    /* JADX INFO: renamed from: P */
    private int f6254P = 0;

    /* JADX INFO: renamed from: Q */
    private int f6255Q = 90;

    /* JADX INFO: renamed from: R */
    private int f6256R = kay.CLOCKWISE_0.f35503e;

    public cmp(dhv dhvVar, jvd jvdVar, fan fanVar, gye gyeVar, cof cofVar, jqh jqhVar, hah hahVar, ksi ksiVar, CameraActivityTiming cameraActivityTiming, mrm mrmVar, cms cmsVar, cot cotVar, cok cokVar, ggm ggmVar, jwn jwnVar, jww jwwVar, mrm mrmVar2, mrm mrmVar3, dtk dtkVar, dtk dtkVar2, dtk dtkVar3, dtk dtkVar4, int i, ExecutorService executorService, inm inmVar, jwn jwnVar2) {
        this.f6261b = dhvVar;
        this.f6262c = gyeVar;
        this.f6263d = cofVar;
        this.f6264e = jvdVar;
        this.f6265f = fanVar;
        this.f6271l = mrmVar2;
        this.f6272m = mrmVar3;
        this.f6277r = jqhVar;
        this.f6279t = hahVar;
        this.f6280u = mrmVar;
        this.f6281v = cmsVar;
        this.f6267h = executorService;
        this.f6284y = i;
        this.f6278s = mvi.m17027c(i);
        this.f6283x = ksiVar;
        this.f6282w = cameraActivityTiming;
        this.f6250L = jwnVar;
        this.f6251M = jwwVar;
        this.f6266g = cokVar;
        this.f6273n = dtkVar;
        this.f6274o = dtkVar2;
        this.f6275p = dtkVar3;
        this.f6276q = dtkVar4;
        this.f6285z = cotVar;
        this.f6257S = ggmVar;
        this.f6258T = inmVar;
        this.f6259U = jwnVar2;
    }

    /* JADX INFO: renamed from: A */
    private static void m3943A(nxl nxlVar, String str, Iterable iterable) {
        nxl nxlVarM18137O = pbq.f47345c.m18137O();
        nxl nxlVarM18137O2 = pbt.f47353b.m18137O();
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        pbt pbtVar = (pbt) nxlVarM18137O2.f44974b;
        pbtVar.m19310c();
        nwb.m17749e(iterable, pbtVar.f47355a);
        pbt pbtVar2 = (pbt) nxlVarM18137O2.mo18103l();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        pbq pbqVar = (pbq) nxlVarM18137O.f44974b;
        pbtVar2.getClass();
        pbqVar.f47348b = pbtVar2;
        pbqVar.f47347a = 2;
        nxlVar.m18064aA(str, (pbq) nxlVarM18137O.mo18103l());
    }

    /* JADX INFO: renamed from: B */
    private static void m3944B(nxl nxlVar, String str, float... fArr) {
        nxl nxlVarM18137O = pbt.f47353b.m18137O();
        for (float f : fArr) {
            nxlVarM18137O.m18065aB(f);
        }
        nxl nxlVarM18137O2 = pbq.f47345c.m18137O();
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        pbq pbqVar = (pbq) nxlVarM18137O2.f44974b;
        pbt pbtVar = (pbt) nxlVarM18137O.mo18103l();
        pbtVar.getClass();
        pbqVar.f47348b = pbtVar;
        pbqVar.f47347a = 2;
        nxlVar.m18064aA(str, (pbq) nxlVarM18137O2.mo18103l());
    }

    /* JADX INFO: renamed from: C */
    private static void m3945C(nxl nxlVar, String str, long j) {
        nxl nxlVarM18137O = pbq.f47345c.m18137O();
        nxl nxlVarM18137O2 = pbu.f47356b.m18137O();
        nxlVarM18137O2.m18066aC(j);
        pbu pbuVar = (pbu) nxlVarM18137O2.mo18103l();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        pbq pbqVar = (pbq) nxlVarM18137O.f44974b;
        pbuVar.getClass();
        pbqVar.f47348b = pbuVar;
        pbqVar.f47347a = 3;
        nxlVar.m18064aA(str, (pbq) nxlVarM18137O.mo18103l());
    }

    /* JADX INFO: renamed from: D */
    private final synchronized void m3946D(nxl nxlVar, int i) {
        if (this.f6245G.isEmpty()) {
            return;
        }
        RectF rectF = (RectF) this.f6245G.poll();
        if (rectF == null) {
            return;
        }
        PointF pointFM15726l = lme.m15726l(new PointF(rectF.left, rectF.top), i);
        PointF pointFM15726l2 = lme.m15726l(new PointF(rectF.right, rectF.bottom), i);
        m3944B(nxlVar, "tracking/left", Math.min(pointFM15726l.x, pointFM15726l2.x));
        m3944B(nxlVar, "tracking/top", Math.min(pointFM15726l.y, pointFM15726l2.y));
        m3944B(nxlVar, "tracking/right", Math.max(pointFM15726l.x, pointFM15726l2.x));
        m3944B(nxlVar, "tracking/bottom", Math.max(pointFM15726l.y, pointFM15726l2.y));
    }

    /* JADX INFO: renamed from: E */
    private static final void m3947E(dtk dtkVar, String str, nxl nxlVar) {
        float fM6723a;
        if (dtkVar.mo6738e()) {
            fM6723a = Float.NaN;
        } else {
            dtkVar.mo6737d();
            fM6723a = dtkVar.mo6737d().m6723a();
        }
        if (Float.isNaN(fM6723a)) {
            return;
        }
        m3944B(nxlVar, str, fM6723a);
    }

    /* JADX INFO: renamed from: y */
    private final void m3948y() {
        this.f6278s.clear();
        m3949z();
        this.f6247I.set(0);
        this.f6248J.set(0);
        this.f6249K.set(0);
        this.f6269j = 0L;
        this.f6239A = null;
    }

    /* JADX INFO: renamed from: z */
    private final synchronized void m3949z() {
        this.f6245G.clear();
        this.f6246H.clear();
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: a */
    public final void mo3950a() {
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: b */
    public final void mo3951b(hew hewVar) {
    }

    @Override // p000.fbn
    /* JADX INFO: renamed from: bG */
    public final void mo3524bG() {
        jvb jvbVar = new jvb();
        this.f6262c.m9966a(this);
        jvbVar.m13537d(new cft(this, 9));
        this.f6241C = jvbVar;
        dhv dhvVar = this.f6261b;
        dhx dhxVar = dib.f11240a;
        dhvVar.mo6175c();
        kxk.m14975U(lle.m15695o(this.f6277r.mo12963h()), new cmo(this, 0), not.INSTANCE);
        mrm mrmVar = this.f6280u;
        if (mrmVar.mo16813g()) {
            ((hrx) mrmVar.mo16809c()).mo10659e(this);
        }
        this.f6281v.f6313b = this;
        this.f6257S.mo9217g(this);
        if (this.f6261b.mo6184l(dib.f11294bA)) {
            this.f6266g.m4010c();
        }
        boolean zMo6184l = this.f6261b.mo6184l(dib.f11295bB);
        this.f6252N = zMo6184l;
        if (!zMo6184l || this.f6270k.get() > -1) {
            return;
        }
        kxk.m14975U(this.f6263d.mo3997c(), new cmo(this, 2), this.f6267h);
    }

    @Override // p000.her
    /* JADX INFO: renamed from: c */
    public final void mo3952c(kmd kmdVar) {
        this.f6240B = kmdVar.mo14558k();
        this.f6255Q = kmdVar.mo14553f();
        this.f6242D = (Rect) kmdVar.mo14559l(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        this.f6278s.clear();
    }

    @Override // p000.fbo
    /* JADX INFO: renamed from: e */
    public final void mo3525e() {
        jvb jvbVar = this.f6241C;
        if (jvbVar != null) {
            jvbVar.close();
            this.f6241C = null;
        }
        mrm mrmVar = this.f6280u;
        if (mrmVar.mo16813g()) {
            ((hrx) mrmVar.mo16809c()).mo10661g(this);
        }
        this.f6281v.f6313b = null;
        this.f6257S.mo9218h(this);
        if (this.f6261b.mo6184l(dib.f11294bA)) {
            this.f6266g.close();
        }
        if (this.f6252N) {
            nxl nxlVarM18137O = pbs.f47350b.m18137O();
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() - this.f6243E;
            m3945C(nxlVarM18137O, "session/id", this.f6270k.get());
            m3945C(nxlVarM18137O, "session/duration", jElapsedRealtimeNanos);
            m3945C(nxlVarM18137O, "session/total_image_count", this.f6253O);
            m3945C(nxlVarM18137O, "session/total_other_mode", this.f6254P);
            cof cofVar = this.f6263d;
            long j = this.f6270k.get();
            nxl nxlVarM18137O2 = pbp.f47342b.m18137O();
            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            pbp pbpVar = (pbp) nxlVarM18137O2.f44974b;
            pbs pbsVar = (pbs) nxlVarM18137O.mo18103l();
            pbsVar.getClass();
            pbpVar.f47344a = pbsVar;
            kxk.m14975U(cofVar.mo4003i(j, ((pbp) nxlVarM18137O2.mo18103l()).mo17760J()), new cod(1), this.f6267h);
            this.f6270k.set(-1L);
        }
        this.f6253O = 0;
        this.f6254P = 0;
    }

    @Override // p000.cna
    /* JADX INFO: renamed from: f */
    public final void mo3953f(ikw ikwVar) {
        ikwVar.name();
        gyw gywVar = gyw.UNKNOWN;
        switch (ikwVar.ordinal()) {
            case 3:
                this.f6249K.set(1);
                break;
            case 6:
                this.f6247I.set(1);
                break;
            case 12:
                this.f6248J.set(1);
                break;
        }
    }

    @Override // p000.dgg
    /* JADX INFO: renamed from: g */
    public final void mo3954g(long j, Map map) {
        this.f6260V.f41919a = mrm.m16828h(map);
    }

    @Override // p000.kos
    /* JADX INFO: renamed from: h */
    public final void mo3955h(kay kayVar) {
        this.f6256R = kayVar.f35503e;
    }

    @Override // p000.her
    /* JADX INFO: renamed from: i */
    public final void mo3956i(kpp kppVar) {
        if (this.f6242D == null) {
            return;
        }
        gsr gsrVar = new gsr(kppVar, 0, this.f6242D);
        this.f6239A = gsrVar;
        long j = gsrVar.f26244d;
        this.f6278s.add(Float.valueOf(j * 1.0E-6f * gsrVar.f26247g * gsrVar.f26246f));
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void mo3957j(gyu gyuVar) {
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void mo3958k(gyu gyuVar) {
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void mo3959l(gyu gyuVar) {
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void mo3960m(long j) {
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void mo3961n(Bitmap bitmap) {
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void mo3962o(Bitmap bitmap, int i) {
        jib.m13195D(this, bitmap);
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void mo3963p(gyu gyuVar, kbb kbbVar) {
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: q */
    public final void mo3964q(gyu gyuVar, gyp gypVar, gyx gyxVar) {
        int i;
        fki fkiVar;
        int i2;
        Rect rect;
        Rect rect2;
        final cmp cmpVar = this;
        if (gyxVar == gyx.MARS_STORE) {
            m3948y();
            return;
        }
        cmpVar.f6253O++;
        ikw ikwVar = ikw.UNINITIALIZED;
        gyw gywVar = gyw.UNKNOWN;
        switch (gypVar.f26867c.ordinal()) {
            case 1:
            case 2:
            case 3:
                i = 0;
                break;
            case 5:
            case 11:
                i = 1;
                break;
            case 10:
                i = 3;
                break;
            case 12:
                i = 2;
                break;
            case 16:
                i = 4;
                break;
            default:
                cmpVar.f6254P++;
                i = -1;
                break;
        }
        if (cmpVar.f6268i && i != -1) {
            final int iM3563a = cem.m3563a(cmpVar.f6261b.mo6184l(dib.f11315bV) ? ((Integer) cmpVar.f6259U.mo3831be()).intValue() : cmpVar.f6255Q, cmpVar.f6256R, cmpVar.f6258T, cmpVar.f6240B == kmq.f36557a, cmpVar.f6261b);
            final nxl nxlVarM18137O = pbs.f47350b.m18137O();
            m3945C(nxlVarM18137O, "CAMERA/mode", i);
            m3945C(nxlVarM18137O, "metadata/image_rotation_degrees", iM3563a);
            m3945C(nxlVarM18137O, "smarts/portrait", cmpVar.f6247I.get());
            m3945C(nxlVarM18137O, "smarts/long_exposure", cmpVar.f6248J.get());
            m3945C(nxlVarM18137O, "smarts/imax", cmpVar.f6249K.get());
            nax naxVar = cmpVar.f6260V;
            mrm mrmVarM16828h = !((mrm) naxVar.f41919a).mo16813g() ? mqu.f41450a : mrm.m16828h((List) ((Map) ((mrm) naxVar.f41919a).mo16809c()).get(0L));
            if (mrmVarM16828h.mo16813g()) {
                m3943A(nxlVarM18137O, "ICA/labels", (Iterable) mrmVarM16828h.mo16809c());
            }
            nax naxVar2 = cmpVar.f6260V;
            mrm mrmVarM16828h2 = !((mrm) naxVar2.f41919a).mo16813g() ? mqu.f41450a : mrm.m16828h((List) ((Map) ((mrm) naxVar2.f41919a).mo16809c()).get(1L));
            if (mrmVarM16828h2.mo16813g()) {
                m3943A(nxlVarM18137O, "ICA/embeddings", (Iterable) mrmVarM16828h2.mo16809c());
                ((List) mrmVarM16828h2.mo16809c()).size();
            }
            fkg fkgVarM8506a = !((dtk) ((mrq) cmpVar.f6271l).f41482a).mo6738e() ? fkg.m8506a(((dtk) ((mrq) cmpVar.f6271l).f41482a).mo6737d()) : null;
            kmq kmqVar = cmpVar.f6240B;
            if (kmqVar != null) {
                int i3 = kmqVar == kmq.f36557a ? 1 : 0;
                m3945C(nxlVarM18137O, "CAMERA/front", i3);
                hah hahVar = cmpVar.f6279t;
                if (hahVar != null) {
                    String str = (String) hahVar.mo10031c(gzy.f27060s);
                    if (i3 == 1) {
                        str = (String) cmpVar.f6279t.mo10031c(gzy.f27061t);
                    }
                    m3945C(nxlVarM18137O, "CAMERA/flash", str.equals("on") ? 1L : 0L);
                }
                if (fkgVarM8506a != null) {
                    m3945C(nxlVarM18137O, "CAMERA/to_ground", (fkgVarM8506a.f22371b <= 70.0f || cmpVar.f6240B == kmq.f36557a) ? 0 : 1);
                }
            }
            m3944B(nxlVarM18137O, "CAMERA/zoom", ((Float) cmpVar.f6250L.mo3831be()).floatValue());
            if (!((dtk) ((mrq) cmpVar.f6271l).f41482a).mo6738e()) {
                dtk dtkVar = (dtk) ((mrq) cmpVar.f6271l).f41482a;
                int i4 = cmpVar.f6284y;
                lku.m15669w(i4 >= 0);
                List listMo6739f = dtkVar.mo6739f(dtkVar.mo6735b(), i4);
                int size = listMo6739f.size();
                float[] fArr = new float[size];
                float[] fArr2 = new float[size];
                float[] fArr3 = new float[size];
                int i5 = size - 1;
                for (int i6 = 0; i6 < size; i6++) {
                    fkg fkgVarM8506a2 = fkg.m8506a((dtg) listMo6739f.get(i5));
                    fArr[i6] = fkgVarM8506a2.f22371b;
                    fArr2[i6] = fkgVarM8506a2.f22372c;
                    fArr3[i6] = fkgVarM8506a2.f22370a;
                    i5--;
                }
                m3944B(nxlVarM18137O, "imu/pitch_buffer", fArr);
                m3944B(nxlVarM18137O, "imu/roll_buffer", fArr2);
                m3944B(nxlVarM18137O, "imu/rotation_buffer", fArr3);
                m3945C(nxlVarM18137O, "imu/buffer_size", size);
            }
            if (((dtk) ((mrq) cmpVar.f6272m).f41482a).mo6738e()) {
                fkiVar = null;
            } else {
                ((dtk) ((mrq) cmpVar.f6272m).f41482a).mo6737d();
                fkiVar = new fki(((dtk) ((mrq) cmpVar.f6272m).f41482a).mo6737d().f12554a);
            }
            if (fkiVar != null) {
                Pair pairM6058c = dfm.m6058c(fkiVar);
                m3944B(nxlVarM18137O, "imu/pitch_radius", ((Float) pairM6058c.first).floatValue());
                m3944B(nxlVarM18137O, "imu/yaw_radius", ((Float) pairM6058c.second).floatValue());
            }
            m3947E(cmpVar.f6273n, "frame/topshot_score", nxlVarM18137O);
            m3947E(cmpVar.f6274o, "frame/face_quality", nxlVarM18137O);
            m3947E(cmpVar.f6275p, "frame/aesthetic_score", nxlVarM18137O);
            m3945C(nxlVarM18137O, "CAMERA/timestamp", TimeUnit.HOURS.toMillis(TimeUnit.MILLISECONDS.toHours(cmpVar.f6283x.mo14815a())));
            CameraActivityTiming cameraActivityTiming = cmpVar.f6282w;
            if (cameraActivityTiming != null && !cameraActivityTiming.f6963c) {
                long activityOnCreateStartNs = cameraActivityTiming.getActivityOnCreateStartNs();
                if (activityOnCreateStartNs != -1) {
                    long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    if (cmpVar.f6244F != activityOnCreateStartNs) {
                        cmpVar.f6243E = activityOnCreateStartNs;
                        m3945C(nxlVarM18137O, "CAMERA/first_capture_since_session_start_timing", TimeUnit.NANOSECONDS.toMillis(jElapsedRealtimeNanos - cmpVar.f6243E));
                    } else {
                        m3945C(nxlVarM18137O, "CAMERA/capture_intervals", TimeUnit.NANOSECONDS.toMillis(jElapsedRealtimeNanos - cmpVar.f6243E));
                    }
                    cmpVar.f6244F = activityOnCreateStartNs;
                    cmpVar.f6243E = jElapsedRealtimeNanos;
                }
            }
            cmpVar.m3946D(nxlVarM18137O, iM3563a);
            m3945C(nxlVarM18137O, "tap/count", cmpVar.f6269j);
            if (!cmpVar.f6246H.isEmpty()) {
                int iMin = Math.min(cmpVar.f6246H.size(), 10);
                int size2 = iMin < cmpVar.f6246H.size() ? cmpVar.f6246H.size() - iMin : 0;
                float[] fArr4 = new float[iMin];
                float[] fArr5 = new float[iMin];
                float[] fArr6 = new float[iMin];
                float[] fArr7 = new float[iMin];
                int i7 = 0;
                while (i7 < iMin) {
                    RectF rectF = (RectF) cmpVar.f6246H.get(i7 + size2);
                    PointF pointFM15726l = lme.m15726l(new PointF(rectF.left, rectF.top), iM3563a);
                    int i8 = iMin;
                    PointF pointFM15726l2 = lme.m15726l(new PointF(rectF.right, rectF.bottom), iM3563a);
                    fArr4[i7] = Math.min(pointFM15726l.x, pointFM15726l2.x);
                    fArr5[i7] = Math.min(pointFM15726l.y, pointFM15726l2.y);
                    fArr6[i7] = Math.max(pointFM15726l.x, pointFM15726l2.x);
                    fArr7[i7] = Math.max(pointFM15726l.y, pointFM15726l2.y);
                    float f = rectF.left;
                    float f2 = rectF.top;
                    float f3 = rectF.right;
                    float f4 = rectF.bottom;
                    i7++;
                    iMin = i8;
                }
                m3944B(nxlVarM18137O, "tracking/cancelled/left", fArr4);
                m3944B(nxlVarM18137O, "tracking/cancelled/top", fArr5);
                m3944B(nxlVarM18137O, "tracking/cancelled/right", fArr6);
                m3944B(nxlVarM18137O, "tracking/cancelled/bottom", fArr7);
            }
            gsr gsrVar = cmpVar.f6239A;
            if (gsrVar != null) {
                m3944B(nxlVarM18137O, "metadata/focal_length", gsrVar.f26248h);
                m3944B(nxlVarM18137O, "metadata/focal_distance", gsrVar.f26249i);
                m3944B(nxlVarM18137O, "metadata/fnumber", gsrVar.f26237A);
                m3944B(nxlVarM18137O, "metadata/subject_motion", gsrVar.f26256p);
                m3945C(nxlVarM18137O, "metadata/auto_white_balance_mode", gsrVar.f26264x);
                m3945C(nxlVarM18137O, "metadata/auto_white_balance_lock", true != gsrVar.f26266z ? 0L : 1L);
                m3945C(nxlVarM18137O, "metadata/jpeg_quality", Long.parseLong(Byte.toString(gsrVar.f26238B)));
                MeteringRectangle[] meteringRectangleArr = gsrVar.f26239C;
                if (meteringRectangleArr != null && meteringRectangleArr.length > 0 && (rect2 = cmpVar.f6242D) != null) {
                    MeteringRectangle meteringRectangle = meteringRectangleArr[0];
                    int iWidth = rect2.width();
                    int iHeight = cmpVar.f6242D.height();
                    float width = meteringRectangle.getWidth();
                    float f5 = iWidth;
                    float height = meteringRectangle.getHeight();
                    float f6 = iHeight;
                    float x = meteringRectangle.getX() / f5;
                    float y = meteringRectangle.getY() / f6;
                    PointF pointFM15726l3 = lme.m15726l(new PointF(x, y), iM3563a);
                    float f7 = height / f6;
                    float f8 = width / f5;
                    PointF pointFM15726l4 = lme.m15726l(new PointF(x + f8, y + f7), iM3563a);
                    m3944B(nxlVarM18137O, "AF/left_x", Math.min(pointFM15726l3.x, pointFM15726l4.x));
                    m3944B(nxlVarM18137O, "AF/upper_y", Math.min(pointFM15726l3.y, pointFM15726l4.y));
                    if (iM3563a == 0 || iM3563a == 180) {
                        int i9 = 1;
                        char c = 0;
                        float[] fArr8 = new float[i9];
                        fArr8[c] = f8;
                        m3944B(nxlVarM18137O, "AF/width", fArr8);
                        float[] fArr9 = new float[i9];
                        fArr9[c] = f7;
                        m3944B(nxlVarM18137O, "AF/height", fArr9);
                    } else {
                        m3944B(nxlVarM18137O, "AF/height", f8);
                        m3944B(nxlVarM18137O, "AF/width", f7);
                    }
                }
                m3945C(nxlVarM18137O, "AF/mode", gsrVar.f26263w);
                m3943A(nxlVarM18137O, "EXPOSURE/buffer", cmpVar.f6278s);
                m3945C(nxlVarM18137O, "EXPOSURE/buffer_size", cmpVar.f6278s.size());
                kmq kmqVar2 = cmpVar.f6240B;
                if (kmqVar2 != null) {
                    m3944B(nxlVarM18137O, qQLA.CAIvRmra, ((Float) (kmqVar2 == kmq.f36557a ? cmpVar.f6261b.mo6180h(dih.f11516d) : cmpVar.f6261b.mo6180h(dih.f11517e)).orElse(Float.valueOf(0.0f))).floatValue());
                }
                m3945C(nxlVarM18137O, "AE/mode", gsrVar.f26262v);
                m3945C(nxlVarM18137O, "AE/lock", true != gsrVar.f26265y ? 0L : 1L);
                gsu[] gsuVarArr = gsrVar.f26257q;
                if (gsuVarArr == null || (rect = gsrVar.f26255o) == null) {
                    i2 = i;
                } else {
                    int length = gsuVarArr.length;
                    m3945C(nxlVarM18137O, "FACE/num", length);
                    Arrays.sort(gsuVarArr, amx.f739c);
                    int iMin2 = Math.min(length, 10);
                    float[] fArr10 = new float[iMin2];
                    float[] fArr11 = new float[iMin2];
                    float[] fArr12 = new float[iMin2];
                    float[] fArr13 = new float[iMin2];
                    int i10 = 0;
                    while (i10 < iMin2) {
                        Rect rect3 = gsuVarArr[i10].f26286a;
                        float fWidth = rect3.width();
                        float fWidth2 = rect.width();
                        gsu[] gsuVarArr2 = gsuVarArr;
                        float fHeight = rect3.height();
                        int i11 = i;
                        float fHeight2 = rect.height();
                        int i12 = iMin2;
                        Rect rect4 = rect;
                        PointF pointFM15726l5 = lme.m15726l(new PointF(rect3.centerX() / rect.width(), rect3.centerY() / rect.height()), iM3563a);
                        float f9 = fHeight / fHeight2;
                        float f10 = fWidth / fWidth2;
                        if (iM3563a == 0 || iM3563a == 180) {
                            fArr10[i10] = f10;
                            fArr11[i10] = f9;
                        } else {
                            fArr10[i10] = f9;
                            fArr11[i10] = f10;
                        }
                        fArr12[i10] = pointFM15726l5.x;
                        fArr13[i10] = pointFM15726l5.y;
                        i10++;
                        gsuVarArr = gsuVarArr2;
                        i = i11;
                        iMin2 = i12;
                        rect = rect4;
                    }
                    i2 = i;
                    int i13 = iMin2;
                    m3944B(nxlVarM18137O, hIAHJKEnGsNbz.jDIua, fArr10);
                    m3944B(nxlVarM18137O, "FACE/height", fArr11);
                    m3944B(nxlVarM18137O, "FACE/center_x", fArr12);
                    m3944B(nxlVarM18137O, qQLA.vfcs, fArr13);
                    cmpVar = this;
                    if (((Boolean) cmpVar.f6251M.mo3831be()).booleanValue()) {
                        dtk dtkVar2 = cmpVar.f6276q;
                        if (!dtkVar2.mo6738e()) {
                            dtkVar2.mo6737d();
                            int iMin3 = Math.min(i13, dtkVar2.mo6737d().f12554a.length);
                            float[] fArr14 = new float[iMin3];
                            int i14 = 0;
                            while (true) {
                                if (i14 >= iMin3) {
                                    m3944B(nxlVarM18137O, "FACE/familiarity", fArr14);
                                    m3945C(nxlVarM18137O, "FACE/familiarity/num", iMin3);
                                } else if (!Float.isNaN(dtkVar2.mo6737d().m6724b(i14))) {
                                    fArr14[i14] = dtkVar2.mo6737d().m6724b(i14);
                                    i14++;
                                }
                            }
                        }
                    }
                }
            } else {
                i2 = i;
            }
            if (cmpVar.f6252N) {
                m3945C(nxlVarM18137O, "session/id", cmpVar.f6270k.get());
            }
            final int i15 = i2;
            kxk.m14975U(nod.m17554j(npm.m17611q(cmpVar.f6263d.mo3996b(cmpVar.f6285z.m5213a(gypVar.f26866b).mo16809c().toString(), cmpVar.f6270k.get())), new nom() { // from class: cmn
                @Override // p000.nom
                /* JADX INFO: renamed from: a */
                public final nps mo3942a(Object obj) {
                    final cmp cmpVar2 = this.f6232a;
                    int i16 = i15;
                    final int i17 = iM3563a;
                    nxl nxlVar = nxlVarM18137O;
                    final long jLongValue = ((Long) obj).longValue();
                    nxl nxlVarM18137O2 = pbp.f47342b.m18137O();
                    if (!nxlVarM18137O2.f44974b.m18142ac()) {
                        nxlVarM18137O2.mo18106p();
                    }
                    pbp pbpVar = (pbp) nxlVarM18137O2.f44974b;
                    pbs pbsVar = (pbs) nxlVar.mo18103l();
                    pbsVar.getClass();
                    pbpVar.f47344a = pbsVar;
                    npm npmVarM17611q = npm.m17611q(cmpVar2.f6263d.mo3998d(jLongValue, "metadata", mwx.m17119n("photo_mode", Integer.valueOf(i16)), ((pbp) nxlVarM18137O2.mo18103l()).mo17760J()));
                    return cmpVar2.f6261b.mo6184l(dib.f11294bA) ? nod.m17554j(npmVarM17611q, new nom() { // from class: cml
                        @Override // p000.nom
                        /* JADX INFO: renamed from: a */
                        public final nps mo3942a(Object obj2) {
                            final cmp cmpVar3 = cmpVar2;
                            final long j = jLongValue;
                            final int i18 = i17;
                            final cok cokVar = cmpVar3.f6266g;
                            return nod.m17554j(npm.m17611q(kxk.m14970P(new nol() { // from class: coh
                                @Override // p000.nol
                                /* JADX INFO: renamed from: a */
                                public final nps mo3988a() {
                                    mrm mrmVarM16829i;
                                    float fMo7247c;
                                    int i19;
                                    int i20;
                                    float[] fArr15;
                                    cok cokVar2 = cokVar;
                                    int i21 = i18;
                                    synchronized (cokVar2.f6445g) {
                                        while (true) {
                                            if (cokVar2.f6451m.isEmpty()) {
                                                mrmVarM16829i = mqu.f41450a;
                                                break;
                                            }
                                            coj cojVar = (coj) cokVar2.f6451m.pollLast();
                                            if (cojVar != null) {
                                                try {
                                                    kpw kpwVarMo7043d = cojVar.f6437a.mo7043d(cojVar.f6438b);
                                                    if (kpwVarMo7043d != null) {
                                                        try {
                                                            float fMo7246b = 1.0f;
                                                            if (kpwVarMo7043d.mo7247c() > kpwVarMo7043d.mo7246b()) {
                                                                fMo7246b = kpwVarMo7043d.mo7246b() / kpwVarMo7043d.mo7247c();
                                                                fMo7247c = 1.0f;
                                                            } else {
                                                                fMo7247c = kpwVarMo7043d.mo7247c() / kpwVarMo7043d.mo7246b();
                                                            }
                                                            HardwareBuffer hardwareBufferMo7250f = kpwVarMo7043d.mo7250f();
                                                            if (hardwareBufferMo7250f == null) {
                                                                kpwVarMo7043d.close();
                                                            } else {
                                                                if (i21 == 0 || i21 == 180) {
                                                                    int i22 = (int) (fMo7246b * 512.0f);
                                                                    i19 = (int) (fMo7247c * 512.0f);
                                                                    i20 = i22;
                                                                } else {
                                                                    i20 = (int) (fMo7247c * 512.0f);
                                                                    i19 = (int) (fMo7246b * 512.0f);
                                                                }
                                                                try {
                                                                    synchronized (cokVar2.f6444f) {
                                                                        if (cokVar2.f6450l) {
                                                                            ((nbe) ((nbe) cok.f6443e.m17251b()).mo17276G(353)).mo17290o("glContext is already closed.");
                                                                            mrmVarM16829i = mqu.f41450a;
                                                                        } else {
                                                                            lby lbyVar = cokVar2.f6446h;
                                                                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i19, i20, Bitmap.Config.ARGB_8888);
                                                                            EGLImage eGLImage = new EGLImage(hardwareBufferMo7250f);
                                                                            try {
                                                                                lcy lcyVarM15192b = lcy.m15192b(lbyVar, eGLImage);
                                                                                try {
                                                                                    lfw lfwVarM15293a = lfy.m15293a(bitmapCreateBitmap);
                                                                                    ldx ldxVarM15224n = ldx.m15224n(lbyVar, ((lfx) lfwVarM15293a).f38168a);
                                                                                    try {
                                                                                        lea leaVar = cokVar2.f6448j;
                                                                                        switch (i21) {
                                                                                            case 0:
                                                                                                fArr15 = cok.f6439a;
                                                                                                break;
                                                                                            case 90:
                                                                                                fArr15 = cok.f6440b;
                                                                                                break;
                                                                                            case 180:
                                                                                                fArr15 = cok.f6441c;
                                                                                                break;
                                                                                            case 270:
                                                                                                fArr15 = cok.f6442d;
                                                                                                break;
                                                                                            default:
                                                                                                throw new IllegalArgumentException("Unsupported rotation.");
                                                                                        }
                                                                                        leaVar.m15236f(lcyVarM15192b, ldxVarM15224n, fArr15);
                                                                                        ldxVarM15224n.m15226i(lfwVarM15293a);
                                                                                        lzd.m16234m(lbyVar);
                                                                                        ldxVarM15224n.close();
                                                                                        lcyVarM15192b.close();
                                                                                        eGLImage.close();
                                                                                        mrmVarM16829i = mrm.m16829i(bitmapCreateBitmap);
                                                                                    } catch (Throwable th) {
                                                                                        try {
                                                                                            ldxVarM15224n.close();
                                                                                        } catch (Throwable th2) {
                                                                                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                                                                        }
                                                                                        throw th;
                                                                                    }
                                                                                } catch (Throwable th3) {
                                                                                    try {
                                                                                        lcyVarM15192b.close();
                                                                                    } catch (Throwable th4) {
                                                                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                                                                                    }
                                                                                    throw th3;
                                                                                }
                                                                            } catch (Throwable th5) {
                                                                                try {
                                                                                    eGLImage.close();
                                                                                } catch (Throwable th6) {
                                                                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th5, th6);
                                                                                }
                                                                                throw th5;
                                                                            }
                                                                        }
                                                                    }
                                                                    hardwareBufferMo7250f.close();
                                                                    kpwVarMo7043d.close();
                                                                } catch (Throwable th7) {
                                                                    try {
                                                                        hardwareBufferMo7250f.close();
                                                                    } catch (Throwable th8) {
                                                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th7, th8);
                                                                    }
                                                                    throw th7;
                                                                }
                                                            }
                                                        } catch (Throwable th9) {
                                                            try {
                                                                kpwVarMo7043d.close();
                                                            } catch (Throwable th10) {
                                                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th9, th10);
                                                            }
                                                            throw th9;
                                                        }
                                                    } else {
                                                        continue;
                                                    }
                                                } catch (RuntimeException e) {
                                                    ((nbe) ((nbe) ((nbe) cok.f6443e.m17251b()).mo17283h(e)).mo17276G(354)).mo17290o("Failed to create bitmap.");
                                                }
                                            }
                                        }
                                    }
                                    cokVar2.m4008a();
                                    if (!mrmVarM16829i.mo16813g()) {
                                        return kxk.m14965K(mqu.f41450a);
                                    }
                                    dhv dhvVar = cokVar2.f6449k;
                                    dhx dhxVar = dib.f11240a;
                                    dhvVar.mo6178f();
                                    try {
                                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                        ((Bitmap) mrmVarM16829i.mo16809c()).compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                                        byteArrayOutputStream.close();
                                        return kxk.m14965K(mrm.m16829i(byteArrayOutputStream.toByteArray()));
                                    } catch (IOException e2) {
                                        ((nbe) ((nbe) ((nbe) cok.f6443e.m17251b()).mo17283h(e2)).mo17276G((char) 355)).mo17290o("Error: Unable to compress lossless variant!");
                                        return kxk.m14965K(mqu.f41450a);
                                    }
                                }
                            }, cokVar.f6447i)), new nom() { // from class: cmm
                                @Override // p000.nom
                                /* JADX INFO: renamed from: a */
                                public final nps mo3942a(Object obj3) {
                                    cmp cmpVar4 = cmpVar3;
                                    return cmpVar4.f6263d.mo3998d(j, "pixel_data", mwx.m17119n("on_shutter", 1), (byte[]) ((mrm) obj3).mo16809c());
                                }
                            }, cmpVar3.f6267h);
                        }
                    }, cmpVar2.f6267h) : npmVarM17611q;
                }
            }, cmpVar.f6267h), new cmo(cmpVar, 1), cmpVar.f6267h);
        }
        m3948y();
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void mo3965r(gyu gyuVar) {
    }

    @Override // p000.hsh
    /* JADX INFO: renamed from: s */
    public final void mo3966s() {
    }

    @Override // p000.hsh
    /* JADX INFO: renamed from: t */
    public final synchronized void mo3967t() {
        if (this.f6245G.isEmpty()) {
            return;
        }
        RectF rectF = (RectF) this.f6245G.poll();
        if (rectF == null) {
            return;
        }
        this.f6246H.add(rectF);
        this.f6245G.clear();
    }

    @Override // p000.hsh
    /* JADX INFO: renamed from: u */
    public final synchronized void mo3968u(RectF rectF, float f, hsa hsaVar) {
        this.f6245G.add(rectF);
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: v */
    public final void mo3969v() {
    }

    @Override // p000.hes
    /* JADX INFO: renamed from: w */
    public final void mo3970w() {
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void mo3971x(gyu gyuVar) {
    }
}
