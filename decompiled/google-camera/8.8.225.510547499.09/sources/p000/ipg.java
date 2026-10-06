package p000;

import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import android.os.SystemClock;
import android.util.Size;
import android.view.Surface;
import androidx.work.impl.diagnostics.p003tK.KMNlNMe;
import com.google.android.libraries.oliveoil.bufferflinger.BufferFlinger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p021j$.time.Duration;
import p021j$.util.Collection$EL;
import p021j$.util.stream.Collectors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ipg implements ipo, kez {

    /* JADX INFO: renamed from: a */
    public static final nbh f31697a = nbh.m17259h("com/google/android/apps/camera/viewfindereffects/ViewfinderEffectsPipelineFrameServerImpl");

    /* JADX INFO: renamed from: b */
    public final Executor f31698b;

    /* JADX INFO: renamed from: c */
    public final lby f31699c;

    /* JADX INFO: renamed from: d */
    public final jwn f31700d;

    /* JADX INFO: renamed from: e */
    public final kbz f31701e;

    /* JADX INFO: renamed from: h */
    public kgg f31704h;

    /* JADX INFO: renamed from: j */
    BufferFlinger f31706j;

    /* JADX INFO: renamed from: k */
    volatile mws f31707k;

    /* JADX INFO: renamed from: l */
    public boolean f31708l;

    /* JADX INFO: renamed from: m */
    private final jwn f31709m;

    /* JADX INFO: renamed from: n */
    private final kce f31710n;

    /* JADX INFO: renamed from: o */
    private final kce f31711o;

    /* JADX INFO: renamed from: p */
    private final boolean f31712p;

    /* JADX INFO: renamed from: t */
    private kfc f31716t;

    /* JADX INFO: renamed from: v */
    private Size f31718v;

    /* JADX INFO: renamed from: w */
    private final Set f31719w;

    /* JADX INFO: renamed from: x */
    private int f31720x;

    /* JADX INFO: renamed from: y */
    private final luc f31721y;

    /* JADX INFO: renamed from: f */
    public final nqf f31702f = nqf.m17621g();

    /* JADX INFO: renamed from: q */
    private final Map f31713q = new HashMap();

    /* JADX INFO: renamed from: g */
    public kmq f31703g = null;

    /* JADX INFO: renamed from: r */
    private Integer f31714r = null;

    /* JADX INFO: renamed from: s */
    private long f31715s = -1;

    /* JADX INFO: renamed from: i */
    public key f31705i = null;

    /* JADX INFO: renamed from: u */
    private final AtomicBoolean f31717u = new AtomicBoolean(true);

    public ipg(Executor executor, lby lbyVar, jwn jwnVar, jwn jwnVar2, kbz kbzVar, boolean z) {
        int i = mws.f41739d;
        this.f31707k = mzr.f41857a;
        this.f31708l = false;
        this.f31719w = mpw.m16752D();
        this.f31720x = 0;
        this.f31698b = executor;
        this.f31699c = lbyVar;
        this.f31709m = jwnVar;
        this.f31700d = jwnVar2;
        this.f31701e = kbzVar;
        this.f31710n = kbzVar.mo13958b("VFE.ImageCount");
        this.f31711o = kbzVar.mo13958b("VFE.IntervalMs");
        this.f31712p = z;
        this.f31721y = new luc((char[]) null);
    }

    /* JADX INFO: renamed from: j */
    private final void m11579j(key keyVar) {
        keyVar.close();
        synchronized (this.f31713q) {
            this.f31713q.remove(keyVar.mo7041b());
        }
    }

    /* JADX INFO: renamed from: k */
    private final void m11580k(key keyVar, String str) {
        ((nbe) ((nbe) f31697a.m17252c()).mo17276G(4368)).mo17272C("[%s, closed=%s](repeat=%d) %s", keyVar, Boolean.valueOf(keyVar.mo7044e()), Integer.valueOf(this.f31720x), str);
        this.f31720x++;
    }

    /* JADX INFO: renamed from: l */
    private static final int m11581l(int i) {
        switch (i) {
            case 0:
                return 0;
            case 180:
                return 3;
            case 270:
                return 7;
            default:
                return 4;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m11582a() {
        if (this.f31714r == null || this.f31703g == null || ((dbr) this.f31709m).mo3831be().m5923a().equals(this.f31703g)) {
            dci dciVarMo3831be = ((dbr) this.f31709m).mo3831be();
            this.f31714r = Integer.valueOf(dciVarMo3831be.f10509a ? ((Integer) dciVarMo3831be.f10510b.mo3831be()).intValue() : dciVarMo3831be.f10511c.mo14553f());
        }
        Integer num = this.f31714r;
        num.getClass();
        return num.intValue();
    }

    @Override // p000.ipo
    /* JADX INFO: renamed from: b */
    public final lby mo11583b() {
        lku.m15614I(!this.f31708l, "Tried to get GL context after ViewfinderEffectsPipeline is closed");
        return this.f31699c;
    }

    @Override // p000.kfb
    /* JADX INFO: renamed from: c */
    public final void mo3625c(kiq kiqVar) {
        key keyVarM14357a = kiqVar.m14357a();
        if (keyVarM14357a == null || keyVarM14357a.mo7041b() == null) {
            return;
        }
        synchronized (this.f31713q) {
            Map map = this.f31713q;
            kfd kfdVarMo7041b = keyVarM14357a.mo7041b();
            kfdVarMo7041b.getClass();
            map.put(kfdVarMo7041b, keyVarM14357a);
        }
        if (keyVarM14357a.mo7044e()) {
            ((nbe) ((nbe) f31697a.m17252c()).mo17276G((char) 4361)).mo17293r("The frame %s should be valid but is closed on arrival.", keyVarM14357a);
        }
        this.f31698b.execute(new ipe(this, keyVarM14357a, 0));
    }

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        ArrayList arrayList;
        kbz kbzVar;
        try {
            this.f31701e.mo13961e("VFEPipeline#close");
            if (this.f31708l) {
                kbzVar = this.f31701e;
            } else {
                this.f31708l = true;
                kfc kfcVar = this.f31716t;
                if (kfcVar != null) {
                    kfcVar.mo9412l(this);
                }
                key keyVar = this.f31705i;
                if (keyVar != null) {
                    m11579j(keyVar);
                }
                synchronized (this.f31713q) {
                    arrayList = new ArrayList(this.f31713q.values());
                    this.f31713q.clear();
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((key) it.next()).close();
                }
                BufferFlinger bufferFlinger = this.f31706j;
                if (bufferFlinger != null) {
                    bufferFlinger.close();
                    this.f31706j = null;
                }
                int i = mws.f41739d;
                mo11588h(mzr.f41857a);
                Iterator it2 = this.f31719w.iterator();
                while (it2.hasNext()) {
                    ((ipk) it2.next()).close();
                }
                this.f31719w.clear();
                this.f31701e.mo13961e("glContext");
                this.f31699c.close();
                this.f31701e.mo13962f();
                kbzVar = this.f31701e;
            }
            kbzVar.mo13962f();
        } catch (Throwable th) {
            this.f31701e.mo13962f();
            throw th;
        }
    }

    @Override // p000.ipj
    /* JADX INFO: renamed from: d */
    public final mrm mo11584d(int i, int i2) {
        throw null;
    }

    @Override // p000.ipo
    /* JADX INFO: renamed from: e */
    public final synchronized void mo11585e(kfc kfcVar, kgg kggVar) {
        kfcVar.getClass();
        kfc kfcVar2 = this.f31716t;
        if (kfcVar2 != kfcVar) {
            if (kfcVar2 != null) {
                kfcVar2.mo9412l(this);
            }
            kfcVar.mo9411k(this);
        }
        this.f31704h = kggVar;
        this.f31716t = kfcVar;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b7 A[Catch: all -> 0x0172, TryCatch #0 {all -> 0x0172, blocks: (B:8:0x0017, B:10:0x001b, B:14:0x0025, B:16:0x0029, B:17:0x002f, B:19:0x003a, B:20:0x0043, B:22:0x004b, B:24:0x0053, B:25:0x0057, B:27:0x0067, B:28:0x0071, B:30:0x007a, B:31:0x0083, B:33:0x0095, B:34:0x0099, B:36:0x009f, B:38:0x00ae, B:39:0x00b3, B:41:0x00b7, B:42:0x00c5, B:44:0x00cf, B:49:0x00f4, B:51:0x011a, B:52:0x012a, B:54:0x0132, B:55:0x013c, B:57:0x0164, B:45:0x00dd, B:47:0x00f1), top: B:72:0x0017, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00cf A[Catch: all -> 0x0172, TryCatch #0 {all -> 0x0172, blocks: (B:8:0x0017, B:10:0x001b, B:14:0x0025, B:16:0x0029, B:17:0x002f, B:19:0x003a, B:20:0x0043, B:22:0x004b, B:24:0x0053, B:25:0x0057, B:27:0x0067, B:28:0x0071, B:30:0x007a, B:31:0x0083, B:33:0x0095, B:34:0x0099, B:36:0x009f, B:38:0x00ae, B:39:0x00b3, B:41:0x00b7, B:42:0x00c5, B:44:0x00cf, B:49:0x00f4, B:51:0x011a, B:52:0x012a, B:54:0x0132, B:55:0x013c, B:57:0x0164, B:45:0x00dd, B:47:0x00f1), top: B:72:0x0017, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00dd A[Catch: all -> 0x0172, TryCatch #0 {all -> 0x0172, blocks: (B:8:0x0017, B:10:0x001b, B:14:0x0025, B:16:0x0029, B:17:0x002f, B:19:0x003a, B:20:0x0043, B:22:0x004b, B:24:0x0053, B:25:0x0057, B:27:0x0067, B:28:0x0071, B:30:0x007a, B:31:0x0083, B:33:0x0095, B:34:0x0099, B:36:0x009f, B:38:0x00ae, B:39:0x00b3, B:41:0x00b7, B:42:0x00c5, B:44:0x00cf, B:49:0x00f4, B:51:0x011a, B:52:0x012a, B:54:0x0132, B:55:0x013c, B:57:0x0164, B:45:0x00dd, B:47:0x00f1), top: B:72:0x0017, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00f1 A[Catch: all -> 0x0172, TryCatch #0 {all -> 0x0172, blocks: (B:8:0x0017, B:10:0x001b, B:14:0x0025, B:16:0x0029, B:17:0x002f, B:19:0x003a, B:20:0x0043, B:22:0x004b, B:24:0x0053, B:25:0x0057, B:27:0x0067, B:28:0x0071, B:30:0x007a, B:31:0x0083, B:33:0x0095, B:34:0x0099, B:36:0x009f, B:38:0x00ae, B:39:0x00b3, B:41:0x00b7, B:42:0x00c5, B:44:0x00cf, B:49:0x00f4, B:51:0x011a, B:52:0x012a, B:54:0x0132, B:55:0x013c, B:57:0x0164, B:45:0x00dd, B:47:0x00f1), top: B:72:0x0017, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x011a A[Catch: all -> 0x0172, TryCatch #0 {all -> 0x0172, blocks: (B:8:0x0017, B:10:0x001b, B:14:0x0025, B:16:0x0029, B:17:0x002f, B:19:0x003a, B:20:0x0043, B:22:0x004b, B:24:0x0053, B:25:0x0057, B:27:0x0067, B:28:0x0071, B:30:0x007a, B:31:0x0083, B:33:0x0095, B:34:0x0099, B:36:0x009f, B:38:0x00ae, B:39:0x00b3, B:41:0x00b7, B:42:0x00c5, B:44:0x00cf, B:49:0x00f4, B:51:0x011a, B:52:0x012a, B:54:0x0132, B:55:0x013c, B:57:0x0164, B:45:0x00dd, B:47:0x00f1), top: B:72:0x0017, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0132 A[Catch: all -> 0x0172, TryCatch #0 {all -> 0x0172, blocks: (B:8:0x0017, B:10:0x001b, B:14:0x0025, B:16:0x0029, B:17:0x002f, B:19:0x003a, B:20:0x0043, B:22:0x004b, B:24:0x0053, B:25:0x0057, B:27:0x0067, B:28:0x0071, B:30:0x007a, B:31:0x0083, B:33:0x0095, B:34:0x0099, B:36:0x009f, B:38:0x00ae, B:39:0x00b3, B:41:0x00b7, B:42:0x00c5, B:44:0x00cf, B:49:0x00f4, B:51:0x011a, B:52:0x012a, B:54:0x0132, B:55:0x013c, B:57:0x0164, B:45:0x00dd, B:47:0x00f1), top: B:72:0x0017, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0164 A[Catch: all -> 0x0172, TRY_LEAVE, TryCatch #0 {all -> 0x0172, blocks: (B:8:0x0017, B:10:0x001b, B:14:0x0025, B:16:0x0029, B:17:0x002f, B:19:0x003a, B:20:0x0043, B:22:0x004b, B:24:0x0053, B:25:0x0057, B:27:0x0067, B:28:0x0071, B:30:0x007a, B:31:0x0083, B:33:0x0095, B:34:0x0099, B:36:0x009f, B:38:0x00ae, B:39:0x00b3, B:41:0x00b7, B:42:0x00c5, B:44:0x00cf, B:49:0x00f4, B:51:0x011a, B:52:0x012a, B:54:0x0132, B:55:0x013c, B:57:0x0164, B:45:0x00dd, B:47:0x00f1), top: B:72:0x0017, outer: #2 }] */
    /* JADX INFO: renamed from: f */
    final synchronized void m11586f(key keyVar) {
        kmq kmqVar;
        int iM11582a;
        int iM11581l;
        int iM11581l2;
        long jElapsedRealtimeNanos;
        long j;
        try {
            key keyVar2 = this.f31705i;
            if (keyVar2 != null) {
                m11579j(keyVar2);
            }
            this.f31705i = keyVar;
            kby kbyVar = new kby(this.f31701e, "VFE.process");
            try {
                BufferFlinger bufferFlinger = this.f31706j;
                if (bufferFlinger == null) {
                    m11580k(keyVar, "BufferFlinger is not available. Aborting display.");
                } else {
                    Size size = this.f31718v;
                    if (size == null) {
                        m11580k(keyVar, "outputSize is not available. Aborting display.");
                    } else {
                        final jvb jvbVar = new jvb();
                        key keyVarMo7040a = keyVar.mo7040a();
                        if (keyVarMo7040a == null) {
                            m11580k(keyVar, "failed to fork() frame. Aborting display.");
                            jvbVar.close();
                        } else {
                            jvbVar.m13537d(keyVarMo7040a);
                            if (this.f31712p && this.f31717u.getAndSet(false)) {
                                jvbVar.close();
                            } else {
                                this.f31721y.f39211a++;
                                kpw kpwVarMo7043d = keyVarMo7040a.mo7043d(this.f31704h);
                                if (kpwVarMo7043d == null) {
                                    m11580k(keyVar, KMNlNMe.Xhrgj);
                                    jvbVar.close();
                                } else {
                                    jvbVar.m13537d(kpwVarMo7043d);
                                    HardwareBuffer hardwareBufferMo7250f = kpwVarMo7043d.mo7250f();
                                    if (hardwareBufferMo7250f == null) {
                                        m11580k(keyVar, "can't display frame as YUV image has no associated HardwareBuffer");
                                        jvbVar.close();
                                    } else {
                                        jvbVar.m13537d(new hcu(hardwareBufferMo7250f, 17));
                                        mws mwsVar = this.f31707k;
                                        if (mwsVar.isEmpty()) {
                                            if (this.f31703g == null) {
                                                this.f31703g = ((dbr) this.f31709m).mo3831be().m5923a();
                                            }
                                            kmqVar = this.f31703g;
                                            iM11582a = m11582a();
                                            if (kmqVar == kmq.f36557a) {
                                                iM11581l2 = (m11581l((360 - iM11582a) % 360) ^ 1) | 8;
                                            } else {
                                                iM11581l = m11581l(iM11582a) | 8;
                                                if (((Boolean) this.f31700d.mo3831be()).booleanValue()) {
                                                    iM11581l |= 2;
                                                }
                                                iM11581l2 = iM11581l;
                                            }
                                            kcc kccVarMo13957a = this.f31701e.mo13957a("VFE.Submit");
                                            kccVarMo13957a.getClass();
                                            jvbVar.m13537d(new hcu(kccVarMo13957a, 18));
                                            this.f31710n.mo13954b();
                                            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                                            j = this.f31715s;
                                            if (j > 0) {
                                                this.f31711o.mo13955c((int) Duration.ofNanos(jElapsedRealtimeNanos - j).toMillis());
                                            }
                                            this.f31715s = jElapsedRealtimeNanos;
                                            if (!m11589i()) {
                                                jvbVar.m13537d(new hcu(this, 19));
                                            }
                                            bufferFlinger.displayBuffer(hardwareBufferMo7250f, new Rect(0, 0, kpwVarMo7043d.mo7247c(), kpwVarMo7043d.mo7246b()), new Rect(0, 0, size.getWidth(), size.getHeight()), iM11581l2, new BufferFlinger.OnBufferReleasedListener() { // from class: ipd
                                                @Override // com.google.android.libraries.oliveoil.bufferflinger.BufferFlinger.OnBufferReleasedListener
                                                public final void onBufferReleased() {
                                                    jvbVar.close();
                                                }
                                            });
                                            if (this.f31720x > 0) {
                                                jvbVar.m13537d(new gog(13));
                                                this.f31720x = 0;
                                            }
                                        } else {
                                            nba it = mwsVar.iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    if (this.f31703g == null) {
                                                        this.f31703g = ((dbr) this.f31709m).mo3831be().m5923a();
                                                    }
                                                    kmqVar = this.f31703g;
                                                    iM11582a = m11582a();
                                                    if (kmqVar == kmq.f36557a) {
                                                        iM11581l2 = (m11581l((360 - iM11582a) % 360) ^ 1) | 8;
                                                    } else {
                                                        iM11581l = m11581l(iM11582a) | 8;
                                                        if (((Boolean) this.f31700d.mo3831be()).booleanValue()) {
                                                            iM11581l |= 2;
                                                        }
                                                        iM11581l2 = iM11581l;
                                                    }
                                                    kcc kccVarMo13957a2 = this.f31701e.mo13957a("VFE.Submit");
                                                    kccVarMo13957a2.getClass();
                                                    jvbVar.m13537d(new hcu(kccVarMo13957a2, 18));
                                                    this.f31710n.mo13954b();
                                                    jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                                                    j = this.f31715s;
                                                    if (j > 0) {
                                                        this.f31711o.mo13955c((int) Duration.ofNanos(jElapsedRealtimeNanos - j).toMillis());
                                                    }
                                                    this.f31715s = jElapsedRealtimeNanos;
                                                    if (!m11589i()) {
                                                        jvbVar.m13537d(new hcu(this, 19));
                                                    }
                                                    bufferFlinger.displayBuffer(hardwareBufferMo7250f, new Rect(0, 0, kpwVarMo7043d.mo7247c(), kpwVarMo7043d.mo7246b()), new Rect(0, 0, size.getWidth(), size.getHeight()), iM11581l2, new BufferFlinger.OnBufferReleasedListener() { // from class: ipd
                                                        @Override // com.google.android.libraries.oliveoil.bufferflinger.BufferFlinger.OnBufferReleasedListener
                                                        public final void onBufferReleased() {
                                                            jvbVar.close();
                                                        }
                                                    });
                                                    if (this.f31720x > 0) {
                                                        jvbVar.m13537d(new gog(13));
                                                        this.f31720x = 0;
                                                    }
                                                } else if (((ipk) it.next()).mo3664m(keyVar, this.f31704h, keyVar) == 3) {
                                                    jvbVar.close();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                kbyVar.close();
            } catch (Throwable th) {
                try {
                    kbyVar.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // p000.ipo
    /* JADX INFO: renamed from: g */
    public final synchronized void mo11587g(Surface surface, Size size) {
        size.getWidth();
        size.getHeight();
        if (this.f31708l) {
            surface.release();
            return;
        }
        BufferFlinger bufferFlinger = this.f31706j;
        if (bufferFlinger != null) {
            bufferFlinger.close();
        }
        this.f31718v = size;
        this.f31706j = new BufferFlinger(surface);
    }

    @Override // p000.ipo
    /* JADX INFO: renamed from: h */
    public final void mo11588h(List list) {
        this.f31719w.addAll(list);
        this.f31707k = mws.m17095j(list);
        Collection$EL.stream(list).map(igl.f30781n).collect(Collectors.joining(","));
    }

    /* JADX INFO: renamed from: i */
    public final boolean m11589i() {
        Boolean bool = (Boolean) jvh.m13560h(this.f31702f);
        return bool != null && bool == Boolean.TRUE;
    }
}
