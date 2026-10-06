package p000;

import android.os.SystemClock;
import com.google.android.apps.camera.imax.cyclops.capture.TrackerStats;
import com.google.android.libraries.vision.opengl.Texture;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class eiw implements ekp {

    /* JADX INFO: renamed from: A */
    private final Map f14189A;

    /* JADX INFO: renamed from: a */
    public final eks f14190a;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f14194e;

    /* JADX INFO: renamed from: j */
    public final ksa f14199j;

    /* JADX INFO: renamed from: r */
    public float f14207r;

    /* JADX INFO: renamed from: s */
    public eiu f14208s;

    /* JADX INFO: renamed from: t */
    private final ekt f14209t;

    /* JADX INFO: renamed from: u */
    private final kpb f14210u;

    /* JADX INFO: renamed from: b */
    public final ehz f14191b = new ehz();

    /* JADX INFO: renamed from: c */
    public double f14192c = 0.0d;

    /* JADX INFO: renamed from: v */
    private double f14211v = 0.0d;

    /* JADX INFO: renamed from: w */
    private final TrackerStats f14212w = new TrackerStats();

    /* JADX INFO: renamed from: d */
    public float f14193d = 0.0f;

    /* JADX INFO: renamed from: x */
    private double f14213x = 0.0d;

    /* JADX INFO: renamed from: f */
    public double f14195f = 0.0d;

    /* JADX INFO: renamed from: g */
    public double f14196g = 0.0d;

    /* JADX INFO: renamed from: h */
    public final float[] f14197h = new float[9];

    /* JADX INFO: renamed from: i */
    public boolean f14198i = false;

    /* JADX INFO: renamed from: k */
    public double f14200k = 0.0d;

    /* JADX INFO: renamed from: l */
    public final imw f14201l = new imw(10);

    /* JADX INFO: renamed from: m */
    public long f14202m = 0;

    /* JADX INFO: renamed from: n */
    public int f14203n = 0;

    /* JADX INFO: renamed from: o */
    public int f14204o = 0;

    /* JADX INFO: renamed from: p */
    public double f14205p = 0.0d;

    /* JADX INFO: renamed from: y */
    private double f14214y = 0.0d;

    /* JADX INFO: renamed from: z */
    private double f14215z = 0.0d;

    /* JADX INFO: renamed from: q */
    public final Object f14206q = new Object();

    public eiw(ekt ektVar, eks eksVar, ksa ksaVar, kpb kpbVar) {
        EnumMap enumMap = new EnumMap(eiv.class);
        this.f14189A = enumMap;
        this.f14209t = ektVar;
        this.f14190a = eksVar;
        this.f14210u = kpbVar;
        this.f14199j = ksaVar;
        this.f14194e = new AtomicBoolean(false);
        enumMap.put(eiv.WHITE, Float.valueOf(25.0f));
        enumMap.put(eiv.RED, Float.valueOf(35.0f));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    @Override // p000.ekp
    /* JADX INFO: renamed from: a */
    public final void mo7345a(float[] fArr, long j) {
        float f;
        if (this.f14194e.get()) {
            this.f14190a.f14495d.getTrackerStats(this.f14212w);
            m7374i(this.f14198i);
            float captureProgress = this.f14190a.f14495d.getCaptureProgress();
            float f2 = this.f14193d;
            if (captureProgress < 0.0f) {
                if (captureProgress < f2) {
                    this.f14193d = captureProgress;
                    f = captureProgress;
                } else {
                    f = f2;
                }
            } else if (captureProgress > f2) {
                this.f14193d = captureProgress;
                f = captureProgress;
            } else {
                f = f2;
            }
            if ((f2 >= 0.0f && f < 0.0f) || (f2 < 0.0f && f >= 0.0f)) {
                this.f14211v = this.f14192c;
            }
            eiu eiuVar = this.f14208s;
            if (eiuVar == null) {
                return;
            }
            if (f >= 1.0f || f <= -1.0f) {
                eja ejaVar = (eja) eiuVar;
                ejaVar.f14253g.execute(new efd(ejaVar, 13));
                return;
            }
            lku.m15662p(eiuVar);
            double d = this.f14214y - this.f14213x;
            this.f14195f = d;
            int i = 3;
            if (Math.abs(d) > 25.0d || Math.abs(this.f14214y) > 60.0d) {
                eiuVar.mo7370a(3);
                this.f14194e.set(false);
                return;
            }
            double dM7340a = this.f14191b.m7340a(this.f14215z);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = jElapsedRealtime - this.f14202m;
            if (j2 != 0) {
                double d2 = dM7340a - this.f14200k;
                double d3 = j2;
                this.f14202m = jElapsedRealtime;
                this.f14200k = dM7340a;
                imw imwVar = this.f14201l;
                Double.isNaN(d3);
                imwVar.m11498a((float) ((d2 / d3) * 1000.0d));
            }
            double dAbs = Math.abs(dM7340a - this.f14192c);
            double dAbs2 = Math.abs(this.f14211v - this.f14192c);
            if (dAbs > dAbs2) {
                this.f14211v = dM7340a;
            } else {
                dAbs = dAbs2;
            }
            double dAbs3 = Math.abs(dM7340a - this.f14211v);
            this.f14196g = dAbs3;
            if (dAbs > 30.0d && dAbs3 > 30.0d) {
                eiuVar.mo7370a(5);
                this.f14194e.set(false);
                return;
            }
            if (Math.abs(this.f14201l.f31556a) >= 140.0f) {
                eiuVar.mo7370a(6);
                this.f14194e.set(false);
                return;
            }
            if (Math.abs(this.f14205p) > 18.0d) {
                eiuVar.mo7370a(4);
                this.f14194e.set(false);
                return;
            }
            m7373h(this.f14189A);
            Float f3 = (Float) this.f14189A.get(eiv.RED);
            if (Math.abs(m7371f()) >= (f3 != null ? f3.floatValue() : 35.0f)) {
                i = 6;
            } else if (Math.abs(this.f14205p) >= 10.0d) {
                i = 4;
            } else if (Math.abs(this.f14195f) < 10.0d && Math.abs(this.f14214y) <= 50.0d) {
                i = 1;
                if (dAbs > 30.0d && this.f14196g > 10.0d) {
                    i = 5;
                }
            }
            switch (i - 1) {
                case 2:
                    eja ejaVar2 = (eja) eiuVar;
                    ejaVar2.m7386e(ejaVar2.f14252f.m7376k() ? ejaVar2.f14271y : ejaVar2.f14270x);
                    break;
                case 3:
                    eja ejaVar3 = (eja) eiuVar;
                    ejaVar3.m7386e(ejaVar3.f14269w);
                    break;
                case 4:
                    eja ejaVar4 = (eja) eiuVar;
                    ejaVar4.m7386e(ejaVar4.f14268v);
                    break;
                case 5:
                    eja ejaVar5 = (eja) eiuVar;
                    ejaVar5.m7386e(ejaVar5.f14267u);
                    break;
            }
            ((eja) eiuVar).f14262p = captureProgress;
        }
    }

    @Override // p000.ekp
    /* JADX INFO: renamed from: b */
    public final void mo7346b(int i, int i2) {
    }

    @Override // p000.ekp
    /* JADX INFO: renamed from: c */
    public final void mo7347c(Texture texture, eko ekoVar) {
    }

    @Override // p000.ekp
    /* JADX INFO: renamed from: d */
    public final void mo7348d() {
    }

    @Override // p000.ekp
    /* JADX INFO: renamed from: e */
    public final void mo7349e(eig eigVar) {
    }

    /* JADX INFO: renamed from: f */
    public final float m7371f() {
        return this.f14201l.f31556a;
    }

    /* JADX INFO: renamed from: g */
    public final float m7372g() {
        if (this.f14194e.get()) {
            return this.f14193d;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: h */
    public final void m7373h(Map map) {
        float f;
        synchronized (this.f14206q) {
            f = this.f14207r;
        }
        float fMax = Math.max(8.0f, 25.0f - f);
        float fMax2 = Math.max(20.0f, 35.0f - f);
        map.put(eiv.WHITE, Float.valueOf(fMax));
        map.put(eiv.RED, Float.valueOf(fMax2));
    }

    /* JADX INFO: renamed from: i */
    public final void m7374i(boolean z) {
        synchronized (this.f14197h) {
            this.f14209t.m7423e(this.f14197h);
            this.f14214y = this.f14209t.m7421c();
            this.f14215z = this.f14209t.m7419a();
            this.f14205p = this.f14209t.m7420b();
            if (this.f14203n == 180 || (this.f14210u.m14670j() && this.f14204o == 0)) {
                this.f14205p = -this.f14205p;
            }
            if (z) {
                this.f14198i = false;
                double dM7340a = this.f14191b.m7340a(this.f14215z);
                this.f14192c = dM7340a;
                this.f14200k = dM7340a;
                this.f14211v = dM7340a;
                this.f14213x = this.f14214y;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m7375j() {
        return this.f14194e.get();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m7376k() {
        return this.f14203n % 180 == 0;
    }
}
