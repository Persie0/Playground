package p000;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fsc implements ftm {

    /* JADX INFO: renamed from: a */
    private final int f23432a;

    /* JADX INFO: renamed from: b */
    private final boolean f23433b;

    /* JADX INFO: renamed from: c */
    private final flc f23434c;

    /* JADX INFO: renamed from: d */
    private final eby f23435d;

    /* JADX INFO: renamed from: e */
    private final hmw f23436e;

    /* JADX INFO: renamed from: f */
    private final AtomicReference f23437f;

    /* JADX INFO: renamed from: g */
    private volatile int f23438g;

    /* JADX INFO: renamed from: h */
    private volatile float f23439h;

    /* JADX INFO: renamed from: i */
    private volatile int f23440i;

    /* JADX INFO: renamed from: j */
    private volatile float f23441j;

    /* JADX INFO: renamed from: k */
    private volatile boolean f23442k;

    /* JADX INFO: renamed from: l */
    private final dhv f23443l;

    /* JADX INFO: renamed from: m */
    private volatile int f23444m;

    /* JADX INFO: renamed from: n */
    private final msa f23445n;

    public fsc(dxx dxxVar, kmd kmdVar, dhv dhvVar, flc flcVar, eby ebyVar, hmw hmwVar, msa msaVar, byte[] bArr) {
        final AtomicReference atomicReference = new AtomicReference();
        this.f23437f = atomicReference;
        boolean z = true;
        this.f23444m = 1;
        this.f23442k = false;
        this.f23432a = ((Integer) kmdVar.mo14560m(CameraCharacteristics.SENSOR_MAX_ANALOG_SENSITIVITY, 0)).intValue();
        if (!dhvVar.mo6184l(dij.f11600x)) {
            dhx dhxVar = dib.f11240a;
            dhvVar.mo6177e();
            z = false;
        }
        this.f23433b = z;
        this.f23434c = flcVar;
        this.f23435d = ebyVar;
        this.f23436e = hmwVar;
        this.f23445n = msaVar;
        this.f23443l = dhvVar;
        dxxVar.m6887c(new dxy() { // from class: fsb
            @Override // p000.dxy
            /* JADX INFO: renamed from: bP */
            public final void mo6891bP(gsr gsrVar) {
                atomicReference.set(gsrVar);
            }
        }, not.INSTANCE);
    }

    /* JADX INFO: renamed from: b */
    private final boolean m8762b(gsr gsrVar, int i) {
        return TimeUnit.NANOSECONDS.toMillis(gsrVar.f26244d) < ((long) i) || gsrVar.f26246f < this.f23432a;
    }

    /* JADX INFO: renamed from: c */
    private static final boolean m8763c(gsr gsrVar, float f) {
        int iWidth = gsrVar.f26260t.width();
        Rect rect = gsrVar.f26255o;
        return ((float) iWidth) / ((float) (rect != null ? rect.width() : iWidth)) < f;
    }

    @Override // p000.ftm
    /* JADX INFO: renamed from: a */
    public final int mo8764a() {
        gsr gsrVar = (gsr) this.f23437f.get();
        if (gsrVar == null) {
            if (!this.f23442k) {
                this.f23442k = true;
            }
            return this.f23444m;
        }
        this.f23442k = false;
        if (this.f23434c.m8543c()) {
            this.f23444m = 3;
            return 3;
        }
        if (((Boolean) this.f23435d.f13316b.mo3831be()).booleanValue() || ((Boolean) this.f23436e.m10476a().mo3831be()).booleanValue() || ((Boolean) this.f23445n.m16852g().mo3831be()).booleanValue()) {
            this.f23444m = 1;
            return 1;
        }
        this.f23438g = true != this.f23443l.mo6184l(did.f11413X) ? 33 : 66;
        this.f23439h = 1.2f;
        if (this.f23433b) {
            this.f23440i = 66;
            this.f23441j = 3.0f;
        } else {
            this.f23440i = this.f23438g;
            this.f23441j = this.f23439h;
        }
        if (m8763c(gsrVar, this.f23439h) && m8762b(gsrVar, this.f23438g)) {
            this.f23444m = 3;
        } else if (m8763c(gsrVar, this.f23441j) && m8762b(gsrVar, this.f23440i)) {
            this.f23444m = 2;
        } else {
            this.f23444m = 1;
        }
        return this.f23444m;
    }
}
