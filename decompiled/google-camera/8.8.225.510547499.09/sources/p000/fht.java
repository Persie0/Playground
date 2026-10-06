package p000;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import android.util.SizeF;
import com.google.android.material.snackbar.VMX.rgoX;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fht implements fhq {

    /* JADX INFO: renamed from: a */
    public static final nbh f22045a = nbh.m17259h("com/google/android/apps/camera/microvideo/encoder/EisFrameFeederImpl");

    /* JADX INFO: renamed from: c */
    public final boolean f22051c;

    /* JADX INFO: renamed from: e */
    public jay f22053e;

    /* JADX INFO: renamed from: f */
    private final dxx f22054f;

    /* JADX INFO: renamed from: g */
    private final imu f22055g;

    /* JADX INFO: renamed from: h */
    private final kbc f22056h;

    /* JADX INFO: renamed from: l */
    private final kni f22060l;

    /* JADX INFO: renamed from: m */
    private final kbz f22061m;

    /* JADX INFO: renamed from: n */
    private final boolean f22062n;

    /* JADX INFO: renamed from: o */
    private final jwn f22063o;

    /* JADX INFO: renamed from: p */
    private final int f22064p;

    /* JADX INFO: renamed from: q */
    private final dhv f22065q;

    /* JADX INFO: renamed from: s */
    private final kpb f22067s;

    /* JADX INFO: renamed from: t */
    private final Map f22068t;

    /* JADX INFO: renamed from: v */
    private int f22070v;

    /* JADX INFO: renamed from: w */
    private knh f22071w;

    /* JADX INFO: renamed from: i */
    private final Set f22057i = new HashSet();

    /* JADX INFO: renamed from: j */
    private final List f22058j = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final AtomicLong f22050b = new AtomicLong();

    /* JADX INFO: renamed from: k */
    private final AtomicLong f22059k = new AtomicLong();

    /* JADX INFO: renamed from: r */
    private final Map f22066r = new HashMap();

    /* JADX INFO: renamed from: d */
    public final Object f22052d = new Object();

    /* JADX INFO: renamed from: u */
    private final Deque f22069u = new ArrayDeque();

    /* JADX INFO: renamed from: x */
    private boolean f22072x = false;

    /* JADX INFO: renamed from: y */
    private gsr f22073y = null;

    /* JADX INFO: renamed from: z */
    private long f22074z = 0;

    /* JADX INFO: renamed from: A */
    private long f22046A = 0;

    /* JADX INFO: renamed from: B */
    private long f22047B = -1;

    /* JADX INFO: renamed from: C */
    private long f22048C = -1;

    /* JADX INFO: renamed from: D */
    private long f22049D = -1;

    public fht(kbc kbcVar, imu imuVar, dxx dxxVar, kmd kmdVar, kni kniVar, dhv dhvVar, kpb kpbVar, kbz kbzVar, Map map, jwn jwnVar) {
        this.f22056h = kbcVar;
        this.f22054f = dxxVar;
        this.f22055g = imuVar;
        this.f22060l = kniVar;
        this.f22067s = kpbVar;
        this.f22051c = kmdVar.mo14558k() == kmq.f36557a;
        dhx dhxVar = dii.f11525a;
        dhvVar.mo6175c();
        this.f22061m = kbzVar;
        this.f22068t = map;
        this.f22062n = dhvVar.mo6184l(dib.f11318bY);
        this.f22063o = jwnVar;
        this.f22064p = kmdVar.mo14553f();
        this.f22065q = dhvVar;
    }

    /* JADX INFO: renamed from: g */
    private final int m8451g(String str) {
        if (m8453i(str, gnf.RAW_ULTRAWIDE)) {
            return 3;
        }
        if (m8453i(str, gnf.RAW_TELE) || m8453i(str, gnf.RAW_TELE_ZOOM)) {
            return this.f22067s.m14666f() ? 3 : 4;
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    private final void m8452h(long j) {
        Iterator it = this.f22057i.iterator();
        while (it.hasNext()) {
            ((fhp) it.next()).mo8443a(j);
        }
    }

    /* JADX INFO: renamed from: i */
    private final boolean m8453i(String str, gnf gnfVar) {
        kmg kmgVar = (kmg) this.f22068t.get(gnfVar);
        return (kmgVar == null || str == null || !str.equals(kmgVar.f36540a)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x01d8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [float] */
    /* JADX WARN: Type inference failed for: r3v4, types: [float] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX INFO: renamed from: j */
    private final void m8454j(gsr gsrVar) throws Throwable {
        float[] fArr;
        long jM12819j;
        lbp lbpVarM15145a;
        long j = gsrVar.f26243c;
        long j2 = gsrVar.f26244d;
        long j3 = gsrVar.f26245e;
        String str = gsrVar.f26242b;
        boolean z = m8453i(str, gnf.RAW_WIDE_ZOOM) || m8453i(str, gnf.RAW_TELE_ZOOM);
        Rect rect = gsrVar.f26255o;
        if (rect == null) {
            rect = new Rect(gsrVar.f26260t);
        }
        if (z) {
            rect = new Rect(rect.left / 2, rect.top / 2, rect.right / 2, rect.bottom / 2);
        }
        long jHeight = gsrVar.f26260t.height();
        long jHeight2 = (((long) rect.height()) * j3) / jHeight;
        long j4 = ((j3 * ((long) rect.top)) / jHeight) + j + (j2 / 2);
        this.f22066r.put(Long.valueOf(j4), Long.valueOf(j));
        float fWidth = rect.width();
        float fWidth2 = gsrVar.f26260t.width();
        SizeF sizeF = (SizeF) this.f22055g.m11486a(gsrVar.f26242b).mo14559l(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        sizeF.getClass();
        if (z) {
            float width = sizeF.getWidth();
            float height = sizeF.getHeight();
            sizeF = new SizeF(width + width, height + height);
        }
        float f = fWidth / fWidth2;
        ?? width2 = sizeF.getWidth() / gsrVar.f26248h;
        float[] fArr2 = new float[this.f22070v * 9];
        Object obj = this.f22052d;
        synchronized (obj) {
            try {
                try {
                    jay jayVar = this.f22053e;
                    if (jayVar != null) {
                        jayVar.m12816g(gsrVar.f26260t.width(), gsrVar.f26260t.height());
                        this.f22053e.m12817h(rect.width(), rect.height());
                        jay jayVar2 = this.f22053e;
                        kbc kbcVar = this.f22056h;
                        ?? r18 = f * width2;
                        fArr = fArr2;
                        jM12819j = jayVar2.m12819j(null, kbcVar.f35517a, kbcVar.f35518b, j4, j4, j2, jHeight2, r18, 1.0f, r18, null, null, fArr, m8451g(str), z);
                    } else {
                        fArr = fArr2;
                        ((nbe) ((nbe) f22045a.m17251b()).mo17276G(2292)).mo17290o("processCameraMetadata called with a null eisNativeWrapper.");
                        jM12819j = -1;
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                width2 = obj;
                throw th;
            }
        }
        if (jM12819j == -1) {
            this.f22048C++;
            return;
        }
        if (jM12819j < -1) {
            long j5 = -jM12819j;
            Long l = (Long) this.f22066r.get(Long.valueOf(j5));
            if (l == null) {
                ((nbe) ((nbe) f22045a.m17251b()).mo17276G(2296)).mo17292q("eis timestamp does not exist: %d", j5);
                return;
            }
            this.f22049D++;
            ((nbe) ((nbe) f22045a.m17251b()).mo17276G(2295)).mo17300y("processFrame failed and dropped stabilization for t=%d (cnt=%d)", l, this.f22049D);
            m8452h(l.longValue());
            return;
        }
        Long l2 = (Long) this.f22066r.get(Long.valueOf(jM12819j));
        if (l2 == null) {
            ((nbe) ((nbe) f22045a.m17251b()).mo17276G(2294)).mo17292q("processFrame returned unexpected EIS timestamp %d", jM12819j);
            return;
        }
        long jLongValue = l2.longValue();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f22070v; i++) {
            if (this.f22062n) {
                String str2 = gsrVar.f26242b;
                Rect rect2 = gsrVar.f26255o;
                if (rect2 == null) {
                    rect2 = gsrVar.f26260t;
                }
                if (!m8453i(str2, gnf.RAW_TELE_ZOOM) ? !m8453i(str2, gnf.RAW_TELE) || rect2.width() > 1613 : rect2.width() > 3226) {
                    lbpVarM15145a = lbp.m15145a(Arrays.copyOfRange(fArr, i * 9, (i + 1) * 9));
                } else {
                    lbpVarM15145a = lbp.m15146b();
                }
            } else {
                lbpVarM15145a = lbp.m15145a(Arrays.copyOfRange(fArr, i * 9, (i + 1) * 9));
            }
            arrayList.add(lbpVarM15145a);
        }
        Iterator it = this.f22057i.iterator();
        while (it.hasNext()) {
            ((fhp) it.next()).mo8444b(jLongValue, arrayList);
        }
        this.f22046A++;
        long j6 = this.f22047B;
        if (j6 == 0 || jLongValue < j6 || jLongValue - j6 >= 15000000000L) {
            this.f22066r.size();
            this.f22047B = jLongValue;
        }
    }

    @Override // p000.fhq
    /* JADX INFO: renamed from: a */
    public final synchronized void mo8445a(fhp fhpVar) {
        this.f22057i.add(fhpVar);
    }

    @Override // p000.fhq
    /* JADX INFO: renamed from: b */
    public final synchronized void mo8446b(long j) {
        if (this.f22072x && j >= this.f22074z) {
            this.f22074z = j;
            final int iIntValue = this.f22065q.mo6184l(dib.f11315bV) ? ((Integer) this.f22063o.mo3831be()).intValue() : this.f22064p;
            knh knhVar = this.f22071w;
            if (knhVar != null) {
                knhVar.mo6999b(this.f22050b.get() + 1, j, new kng() { // from class: fhr
                    @Override // p000.kng
                    /* JADX INFO: renamed from: a */
                    public final void mo6759a(List list) {
                        jay jayVar;
                        Pair pair;
                        fht fhtVar = this.f22040a;
                        int i = iIntValue;
                        synchronized (fhtVar.f22052d) {
                            jayVar = fhtVar.f22053e;
                        }
                        if (jayVar == null) {
                            ((nbe) ((nbe) fht.f22045a.m17251b()).mo17276G((char) 2298)).mo17290o("processGyroSamples called with a null eisNativeWrapper");
                            return;
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            knj knjVar = (knj) it.next();
                            float f = knjVar.f36608f;
                            float f2 = knjVar.f36609g;
                            boolean z = fhtVar.f22051c;
                            if (!(z && i == 90) && (z || i != 270)) {
                                pair = (z && i == 0) ? new Pair(Float.valueOf(f2), Float.valueOf(-f)) : new Pair(Float.valueOf(f), Float.valueOf(f2));
                            } else {
                                pair = new Pair(Float.valueOf(-f), Float.valueOf(-f2));
                            }
                            jayVar.m12820k(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue(), knjVar.f36610h, knjVar.f36607e);
                            fhtVar.f22050b.set(knjVar.f36607e);
                        }
                    }
                });
            }
            long j2 = (-1) + j;
            long j3 = 0;
            this.f22050b.compareAndSet(0L, j2);
            this.f22059k.compareAndSet(0L, j2);
            gsr gsrVarM6886b = this.f22054f.m6886b();
            if (gsrVarM6886b != null) {
                j3 = gsrVarM6886b.f26243c;
            }
            this.f22058j.add(Long.valueOf(j));
            long j4 = this.f22050b.get() + 1000000000;
            long j5 = this.f22059k.get() + 1000000000;
            while (this.f22058j.size() > 1) {
                long jLongValue = ((Long) this.f22058j.get(1)).longValue();
                long j6 = this.f22050b.get();
                if (j < j4 && j6 < jLongValue) {
                    break;
                }
                long j7 = this.f22059k.get();
                if ((j < j5 && j7 < jLongValue) || (j < j3 + 1000000000 && j3 < jLongValue)) {
                    break;
                }
                long jLongValue2 = ((Long) this.f22058j.remove(0)).longValue();
                gsr gsrVarM6885a = this.f22054f.m6885a(jLongValue2);
                if (gsrVarM6885a != null) {
                    m8454j(gsrVarM6885a);
                    this.f22073y = gsrVarM6885a;
                } else {
                    m8452h(jLongValue2);
                }
            }
        }
    }

    @Override // p000.fhq
    /* JADX INFO: renamed from: c */
    public final synchronized void mo8447c(long j, float f, float f2, String str) {
        int iM8451g = m8451g(str);
        synchronized (this.f22052d) {
            jay jayVar = this.f22053e;
            if (jayVar != null) {
                jayVar.m12821l(f, f2, j, iM8451g);
            } else if (this.f22069u.isEmpty() || ((fhs) this.f22069u.getFirst()).f22042a - j < 5000000000L) {
                this.f22069u.addLast(new fhs(j, f, f2));
            } else {
                ((nbe) ((nbe) f22045a.m17252c()).mo17276G(2303)).mo17292q("Dropping lens offset at %d; should we be listening to this?", j);
            }
        }
        this.f22059k.set(j);
    }

    @Override // p000.fhq
    /* JADX INFO: renamed from: d */
    public final synchronized void mo8448d(fhp fhpVar) {
        this.f22057i.remove(fhpVar);
    }

    @Override // p000.fhq
    /* JADX INFO: renamed from: e */
    public final synchronized void mo8449e() {
        enb enbVar;
        enb enbVar2;
        String str;
        String str2;
        synchronized (this.f22052d) {
            kpb kpbVar = this.f22067s;
            if (kpbVar.m14663c()) {
                enbVar = enb.f14738a;
            } else if (kpbVar.m14664d()) {
                enbVar = enb.f14739b;
            } else if (kpbVar.m14665e()) {
                enbVar = enb.f14740c;
            } else if (kpbVar.m14666f()) {
                enbVar = enb.f14743f;
            } else if (kpbVar.m14668h()) {
                enbVar = enb.f14745h;
            } else {
                if (kpbVar.m14667g()) {
                    enbVar2 = enb.f14741d;
                } else if (kpbVar.f36770c) {
                    enbVar2 = enb.f14744g;
                } else if (kpbVar.f36773f) {
                    enbVar2 = enb.f14745h;
                } else {
                    if (!kpbVar.m14669i() && !kpbVar.m14662b() && !kpbVar.f36777j && !kpbVar.f36776i && !kpbVar.m14670j() && !kpbVar.f36781n && !kpbVar.f36782o) {
                        throw new RuntimeException("EisFrameFeeder stabilization does not recognize this device. Aborting.");
                    }
                    enbVar = enb.f14746i;
                }
                enbVar = enbVar2;
            }
            kbc kbcVar = this.f22056h;
            int i = kbcVar.f35517a;
            int i2 = kbcVar.f35518b;
            boolean z = this.f22051c;
            kpb kpbVar2 = this.f22067s;
            if (kpbVar2.f36774g) {
                str2 = "lib_cpi/multi_cam_calibration.combined.proto.oriole";
            } else {
                if (kpbVar2.f36775h) {
                    str = "lib_cpi/multi_cam_calibration.combined.proto.raven";
                } else if (kpbVar2.f36777j) {
                    str = "lib_cpi/multi_cam_calibration.combined.proto.bluejay";
                } else if (kpbVar2.f36780m) {
                    str = "lib_cpi/multi_cam_calibration.combined.proto.panther";
                } else if (kpbVar2.f36779l) {
                    str = "lib_cpi/multi_cam_calibration.combined.proto.cheetah";
                } else if (kpbVar2.f36776i) {
                    str = "lib_cpi/multi_cam_calibration.combined.proto.raven";
                } else if (kpbVar2.f36781n) {
                    str = "lib_cpi/multi_cam_calibration.combined.proto.1";
                } else {
                    str = kpbVar2.f36782o ? "lib_cpi/multi_cam_calibration.combined.proto.2" : "";
                }
                str2 = str;
            }
            jay jayVarM9596i = goy.m9596i(enbVar, i, i2, 0.5f, z, str2);
            this.f22053e = jayVarM9596i;
            this.f22070v = jayVarM9596i.m12814e();
            jayVarM9596i.m12822m();
            if (!this.f22069u.isEmpty()) {
                long j = ((fhs) this.f22069u.getLast()).f22042a - ((fhs) this.f22069u.getFirst()).f22042a;
                this.f22069u.size();
                TimeUnit.NANOSECONDS.toMillis(j);
                while (!this.f22069u.isEmpty()) {
                    fhs fhsVar = (fhs) this.f22069u.removeFirst();
                    jayVarM9596i.m12821l(fhsVar.f22043b, fhsVar.f22044c, fhsVar.f22042a, 0);
                }
            }
        }
        this.f22071w = this.f22060l.mo7000a("mv-eis");
        this.f22072x = true;
        this.f22046A = 0L;
        this.f22048C = 0L;
        this.f22049D = 0L;
    }

    @Override // p000.fhq
    /* JADX INFO: renamed from: f */
    public final synchronized void mo8450f() {
        this.f22061m.mo13961e("EisFrameFeeder#stop");
        this.f22061m.mo13961e(rgoX.Mbkv);
        while (!this.f22058j.isEmpty()) {
            gsr gsrVarM6885a = this.f22054f.m6885a(((Long) this.f22058j.remove(0)).longValue());
            if (gsrVarM6885a != null) {
                this.f22073y = gsrVarM6885a;
            }
            if (gsrVarM6885a == null) {
                gsrVarM6885a = this.f22073y;
            }
            if (gsrVarM6885a != null) {
                m8454j(gsrVarM6885a);
            }
        }
        Iterator it = this.f22066r.values().iterator();
        while (it.hasNext()) {
            m8452h(((Long) it.next()).longValue());
        }
        this.f22066r.clear();
        this.f22061m.mo13962f();
        knh knhVar = this.f22071w;
        if (knhVar != null) {
            knhVar.close();
            this.f22071w = null;
        }
        synchronized (this.f22052d) {
            jay jayVar = this.f22053e;
            if (jayVar != null) {
                jayVar.m12815f();
                this.f22053e = null;
            } else {
                ((nbe) ((nbe) f22045a.m17251b()).mo17276G(2301)).mo17290o("stop called with a null eisNativeWrapper");
            }
        }
        this.f22072x = false;
        this.f22061m.mo13962f();
    }
}
