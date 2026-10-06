package p000;

import android.database.Cursor;
import com.google.android.apps.camera.camerafatalerror.CameraFatalErrorTrackerDatabase;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dct implements kdq, fbp, faq, far {

    /* JADX INFO: renamed from: a */
    public static final nbh f10527a = nbh.m17259h("com/google/android/apps/camera/camerafatalerror/CameraFatalErrorTrackerImpl");

    /* JADX INFO: renamed from: b */
    public final CameraFatalErrorTrackerDatabase f10528b;

    /* JADX INFO: renamed from: c */
    public final fcp f10529c;

    /* JADX INFO: renamed from: d */
    public final msi f10530d;

    /* JADX INFO: renamed from: e */
    public final djm f10531e;

    /* JADX INFO: renamed from: f */
    private final Executor f10532f;

    /* JADX INFO: renamed from: g */
    private final jvd f10533g;

    /* JADX INFO: renamed from: h */
    private final AtomicBoolean f10534h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i */
    private final Map f10535i = new HashMap();

    public dct(CameraFatalErrorTrackerDatabase cameraFatalErrorTrackerDatabase, Executor executor, fcp fcpVar, jvd jvdVar, dhv dhvVar, djm djmVar, byte[] bArr) {
        this.f10528b = cameraFatalErrorTrackerDatabase;
        this.f10532f = executor;
        this.f10529c = fcpVar;
        this.f10533g = jvdVar;
        this.f10530d = new dfg(dhvVar, 1);
        this.f10531e = djmVar;
    }

    /* JADX INFO: renamed from: a */
    public static long m5927a(long j, long j2) {
        return TimeUnit.MILLISECONDS.toDays(j - j2);
    }

    @Override // p000.faq
    /* JADX INFO: renamed from: b */
    public final void mo5928b() {
        this.f10534h.set(false);
    }

    @Override // p000.far
    /* JADX INFO: renamed from: c */
    public final void mo5929c() {
        this.f10534h.set(true);
    }

    /* JADX INFO: renamed from: d */
    final void m5930d(String str, boolean z) {
        this.f10533g.m13541c(new bnp(z, str, 7));
    }

    @Override // p000.kdq
    /* JADX INFO: renamed from: e */
    public final void mo5931e(kcl kclVar) {
        if (!kcl.m13981d(kclVar)) {
            m5930d("Fatal error", this.f10534h.get());
        } else {
            this.f10532f.execute(new dcr(this, kclVar, System.currentTimeMillis(), 0));
        }
    }

    @Override // p000.kdq
    /* JADX INFO: renamed from: f */
    public final synchronized void mo5932f(final kmg kmgVar, kcl kclVar, final boolean z) {
        if (!kcl.m13982e(kclVar)) {
            m5930d("Fatal error", this.f10534h.get());
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        long jLongValue = ((Long) p021j$.util.Map.EL.getOrDefault(this.f10535i, kmgVar, 0L)).longValue();
        final long j = jLongValue != 0 ? jCurrentTimeMillis - jLongValue : 0L;
        this.f10535i.put(kmgVar, 0L);
        this.f10532f.execute(new Runnable() { // from class: dcs
            @Override // java.lang.Runnable
            public final void run() {
                ddc ddcVar;
                dct dctVar = this.f10522a;
                kmg kmgVar2 = kmgVar;
                long j2 = jCurrentTimeMillis;
                boolean z2 = z;
                long j3 = j;
                dctVar.f10531e.m6228b();
                ddd dddVarMo4084x = dctVar.f10528b.mo4084x();
                String str = kmgVar2.f36540a;
                ddi ddiVar = (ddi) dddVarMo4084x;
                ddiVar.f10557a.m1825m();
                try {
                    ddc ddcVar2 = new ddc(str);
                    ((ddi) dddVarMo4084x).f10557a.m1824l();
                    ((ddi) dddVarMo4084x).f10557a.m1825m();
                    try {
                        ((ddi) dddVarMo4084x).f10558b.m1806a(ddcVar2);
                        ((ddi) dddVarMo4084x).f10557a.m1829q();
                        ((ddi) dddVarMo4084x).f10557a.m1827o();
                        apy apyVarM1841a = apy.m1841a("SELECT * FROM FatalErrorCounts WHERE cameraId = ?", 1);
                        if (str == null) {
                            apyVarM1841a.mo1846f(1);
                        } else {
                            apyVarM1841a.mo1847g(1, str);
                        }
                        ((ddi) dddVarMo4084x).f10557a.m1824l();
                        Cursor cursorM409e = aey.m409e(((ddi) dddVarMo4084x).f10557a, apyVarM1841a, false);
                        try {
                            int iM379o = aeq.m379o(cursorM409e, "cameraId");
                            int iM379o2 = aeq.m379o(cursorM409e, "failuresBeforeRebootDuringOpen");
                            int iM379o3 = aeq.m379o(cursorM409e, "failuresAfterRebootDuringOpen");
                            int iM379o4 = aeq.m379o(cursorM409e, "failuresBeforeRebootDuringSession");
                            int iM379o5 = aeq.m379o(cursorM409e, "failuresAfterRebootDuringSession");
                            int iM379o6 = aeq.m379o(cursorM409e, "lastFatalErrorTimestamp");
                            int iM379o7 = aeq.m379o(cursorM409e, "rebootCount");
                            if (cursorM409e.moveToFirst()) {
                                ddcVar = new ddc(cursorM409e.isNull(iM379o) ? null : cursorM409e.getString(iM379o));
                                ddcVar.f10551b = cursorM409e.getInt(iM379o2);
                                ddcVar.f10552c = cursorM409e.getInt(iM379o3);
                                ddcVar.f10553d = cursorM409e.getInt(iM379o4);
                                ddcVar.f10554e = cursorM409e.getInt(iM379o5);
                                ddcVar.f10555f = cursorM409e.getLong(iM379o6);
                                ddcVar.f10556g = cursorM409e.getInt(iM379o7);
                            } else {
                                ddcVar = null;
                            }
                            cursorM409e.close();
                            apyVarM1841a.m1850j();
                            ((ddi) dddVarMo4084x).f10557a.m1829q();
                            ddiVar.f10557a.m1827o();
                            if (dct.m5927a(j2, ddcVar.f10555f) >= ((Integer) dctVar.f10530d.mo6051a()).intValue()) {
                                ddcVar = new ddc(kmgVar2.f36540a);
                            }
                            if (z2 == 0 && ddcVar.f10556g == 0) {
                                ddcVar.f10551b++;
                            } else if (z2 == 0 && ddcVar.f10556g > 0) {
                                ddcVar.f10552c++;
                            } else if (z2 != 0 && ddcVar.f10556g == 0) {
                                ddcVar.f10553d++;
                            } else if (z2 && ddcVar.f10556g > 0) {
                                ddcVar.f10554e++;
                            }
                            ddcVar.f10555f = j2;
                            dctVar.f10528b.mo4084x().mo5938a(ddcVar);
                            String str2 = ddcVar.f10550a;
                            int i = ddcVar.f10551b;
                            int i2 = ddcVar.f10552c;
                            int i3 = ddcVar.f10553d;
                            int i4 = ddcVar.f10554e;
                            long j4 = ddcVar.f10555f;
                            dctVar.f10529c.mo8185e(str2, i, i2, i3, i4, ddcVar.f10556g, j3);
                            dctVar.m5930d("Suspected camera device error", true);
                        } catch (Throwable th) {
                            cursorM409e.close();
                            apyVarM1841a.m1850j();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        ((ddi) dddVarMo4084x).f10557a.m1827o();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    ddiVar.f10557a.m1827o();
                    throw th3;
                }
            }
        });
    }

    @Override // p000.kdq
    /* JADX INFO: renamed from: g */
    public final synchronized void mo5933g(kmg kmgVar) {
        this.f10535i.put(kmgVar, Long.valueOf(System.currentTimeMillis()));
        this.f10532f.execute(new cuq(this, kmgVar, 7));
    }

    @Override // p000.kdq
    /* JADX INFO: renamed from: h */
    public final synchronized void mo5934h(kmg kmgVar) {
        this.f10535i.put(kmgVar, 0L);
        this.f10532f.execute(new cuq(this, kmgVar, 6));
    }

    @Override // p000.kdq
    /* JADX INFO: renamed from: i */
    public final void mo5935i() {
        this.f10532f.execute(new czx(this, 8));
    }
}
