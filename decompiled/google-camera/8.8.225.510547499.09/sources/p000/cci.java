package p000;

import android.graphics.Rect;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class cci implements kba {

    /* JADX INFO: renamed from: a */
    private static final long f5133a = TimeUnit.MILLISECONDS.toNanos(500);

    /* JADX INFO: renamed from: b */
    private final Rect f5134b;

    /* JADX INFO: renamed from: c */
    private final mws f5135c;

    /* JADX INFO: renamed from: d */
    private final eat f5136d;

    /* JADX INFO: renamed from: e */
    private final kbo f5137e;

    /* JADX INFO: renamed from: f */
    private final String f5138f;

    /* JADX INFO: renamed from: g */
    private final float f5139g;

    /* JADX INFO: renamed from: h */
    private long f5140h;

    /* JADX INFO: renamed from: i */
    private float f5141i;

    public cci(fvu fvuVar, eat eatVar, kbo kboVar, String str) {
        this(fvuVar, eatVar, kboVar, str, 300.0f);
    }

    /* JADX INFO: renamed from: a */
    public final void m3433a(kpp kppVar) {
        if (this.f5136d.m7020e()) {
            gsr gsrVar = new gsr(kppVar, 0, this.f5134b);
            long j = gsrVar.f26243c;
            if (j - this.f5140h < f5133a) {
                return;
            }
            this.f5140h = j;
            List listM7017b = this.f5136d.m7017b(j, gsrVar);
            float fMax = 0.0f;
            if (listM7017b.isEmpty()) {
                this.f5137e.mo13942d("Motion estimator returned empty homography list. Assuming zero motion.");
                this.f5141i = 0.0f;
                return;
            }
            lbp lbpVar = (lbp) listM7017b.get(0);
            mws mwsVar = this.f5135c;
            int i = ((mzr) mwsVar).f41859c;
            for (int i2 = 0; i2 < i; i2++) {
                float[] fArr = (float[]) mwsVar.get(i2);
                float[] fArrM15149e = lbpVar.m15149e(fArr);
                fMax = Math.max(fMax, (float) Math.hypot(fArrM15149e[0] - fArr[0], fArrM15149e[1] - fArr[1]));
            }
            this.f5141i = fMax;
            this.f5137e.mo13946h("Current motion magnitude = " + fMax);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3434b() {
        this.f5137e.mo13940b("Starting MotionSampler");
        this.f5136d.m7021f(new kbc(this.f5134b.width(), this.f5134b.height()), this.f5138f);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m3435c() {
        return this.f5136d.m7020e() && this.f5141i > this.f5139g;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f5137e.mo13940b("Closing MotionSampler");
        if (this.f5136d.m7020e()) {
            this.f5136d.m7018c();
        }
    }

    public cci(fvu fvuVar, eat eatVar, kbo kboVar, String str, float f) {
        this.f5140h = 0L;
        this.f5141i = 0.0f;
        Rect rectMo14555h = fvuVar.mo14555h();
        this.f5134b = rectMo14555h;
        this.f5135c = mws.m17100o(new float[]{0.0f, 0.0f}, new float[]{0.0f, rectMo14555h.height()}, new float[]{rectMo14555h.width(), 0.0f}, new float[]{rectMo14555h.width(), rectMo14555h.height()});
        this.f5136d = eatVar;
        this.f5137e = kboVar;
        this.f5138f = str;
        this.f5139g = f;
    }
}
