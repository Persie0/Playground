package p000;

import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import android.view.MotionEvent;
import android.view.WindowManager;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fgs implements ifg {

    /* JADX INFO: renamed from: a */
    public final jww f21934a;

    /* JADX INFO: renamed from: g */
    private final ScheduledExecutorService f21940g;

    /* JADX INFO: renamed from: i */
    private final iuj f21942i;

    /* JADX INFO: renamed from: j */
    private final msi f21943j;

    /* JADX INFO: renamed from: k */
    private final WindowManager f21944k;

    /* JADX INFO: renamed from: f */
    public final npa f21939f = new npa();

    /* JADX INFO: renamed from: h */
    private final AtomicBoolean f21941h = new AtomicBoolean();

    /* JADX INFO: renamed from: b */
    public volatile Optional f21935b = Optional.empty();

    /* JADX INFO: renamed from: c */
    public volatile float f21936c = 0.0f;

    /* JADX INFO: renamed from: d */
    public volatile float f21937d = 0.0f;

    /* JADX INFO: renamed from: l */
    private volatile float f21945l = 0.0f;

    /* JADX INFO: renamed from: e */
    public volatile float f21938e = 0.0f;

    public fgs(jww jwwVar, iuj iujVar, ScheduledExecutorService scheduledExecutorService, msi msiVar, WindowManager windowManager) {
        this.f21934a = jwwVar;
        this.f21942i = iujVar;
        this.f21940g = scheduledExecutorService;
        this.f21943j = msiVar;
        this.f21944k = windowManager;
    }

    /* JADX INFO: renamed from: d */
    private static float m8398d(float f, Range range) {
        float fFloatValue = ((Float) range.getLower()).floatValue();
        return (f - fFloatValue) / (((Float) range.getUpper()).floatValue() - fFloatValue);
    }

    /* JADX INFO: renamed from: e */
    private static float m8399e(float f, Range range) {
        return (f * (((Float) range.getUpper()).floatValue() - ((Float) range.getLower()).floatValue())) + ((Float) range.getLower()).floatValue();
    }

    /* JADX INFO: renamed from: f */
    private static Range m8400f(float f, float f2) {
        return Range.create(Float.valueOf(f), Float.valueOf(Math.max(f, f2)));
    }

    /* JADX INFO: renamed from: g */
    private final synchronized void m8401g(Range range) {
        if (this.f21941h.getAndSet(true)) {
            return;
        }
        this.f21940g.schedule(new ewo(this, range, 11), 33L, TimeUnit.MILLISECONDS);
    }

    @Override // p000.ifg
    /* JADX INFO: renamed from: a */
    public final void mo8351a(MotionEvent motionEvent, MotionEvent motionEvent2, Rect rect, boolean z) {
        this.f21939f.m17587j(motionEvent);
        float fMo11754e = this.f21942i.mo11754e();
        float fMo11753d = this.f21942i.mo11753d();
        Range rangeCreate = fMo11754e < fMo11753d ? Range.create(Float.valueOf(fMo11754e), Float.valueOf(fMo11753d)) : Range.create(Float.valueOf(1.0f), Float.valueOf(8.0f));
        if (this.f21936c <= 0.0f) {
            this.f21936c = ((Float) this.f21934a.mo3831be()).floatValue();
            this.f21937d = this.f21936c;
        }
        if (this.f21935b.isEmpty()) {
            this.f21935b = Optional.m12505of((Float) this.f21934a.mo3831be());
        }
        int height = hzk.m10913a(this.f21944k).getHeight();
        float rawY = motionEvent2.getRawY();
        float rawY2 = motionEvent.getRawY();
        float fMin = Math.min(rawY, rect.top);
        float fMax = Math.max(rawY, rect.bottom);
        boolean z2 = false;
        if (rect.top < rawY2 && rawY2 < rect.bottom) {
            z2 = true;
        }
        if (rawY < rawY2) {
            float f = height;
            if (fMax < f) {
                Range rangeCreate2 = Range.create(Float.valueOf(fMax), Float.valueOf(f));
                Range rangeCreate3 = Range.create(Float.valueOf(0.0f), Float.valueOf(0.1f));
                if (z2) {
                    m8402b();
                    return;
                }
                float fFloatValue = ((Float) rangeCreate2.clamp(Float.valueOf(rawY2))).floatValue();
                float fFloatValue2 = ((Float) rangeCreate2.getLower()).floatValue();
                float fFloatValue3 = ((Float) rangeCreate2.getUpper()).floatValue();
                float fFloatValue4 = ((Float) rangeCreate3.getLower()).floatValue();
                this.f21945l = (((fFloatValue - fFloatValue2) / (fFloatValue3 - fFloatValue2)) * (((Float) rangeCreate3.getUpper()).floatValue() - fFloatValue4)) + fFloatValue4;
                m8401g(rangeCreate);
                return;
            }
            return;
        }
        m8402b();
        if (z2) {
            return;
        }
        Range rangeM8400f = m8400f(this.f21936c, ((Float) rangeCreate.getUpper()).floatValue());
        float f2 = -fMin;
        hzj hzjVar = ((hzp) this.f21943j.mo6051a()).f30074a.f30073i;
        Size sizeM10913a = hzk.m10913a(this.f21944k);
        int height2 = sizeM10913a.getHeight();
        int width = sizeM10913a.getWidth();
        hzj hzjVar2 = hzj.TABLET_LAYOUT;
        float f3 = 0.9f;
        switch (hzjVar.ordinal()) {
            case 0:
                if (height2 >= width) {
                    f3 = 0.67f;
                }
                break;
            case 3:
                f3 = 0.45f;
                break;
            default:
                if (height2 >= width) {
                    f3 = 0.5f;
                }
                break;
        }
        float fMax2 = Math.max(0.0f, Math.min(1.0f, m8398d(-rawY2, m8400f(f2, (-(1.0f - f3)) * height))));
        this.f21938e = Math.max(fMax2, this.f21938e);
        float fM8399e = m8399e(fMax2, rangeM8400f);
        if (this.f21939f.m17586i() > 0.0f) {
            this.f21936c = Math.min(this.f21936c, m8399e(Math.max(0.0f, m8398d(this.f21937d, rangeCreate) - Math.max(this.f21938e - fMax2, 0.0f)), rangeCreate));
            fM8399e = m8399e(fMax2, m8400f(this.f21936c, ((Float) rangeCreate.getUpper()).floatValue()));
        }
        this.f21934a.mo3415bf(Float.valueOf(((Float) rangeCreate.clamp(Float.valueOf(fM8399e))).floatValue()));
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m8402b() {
        this.f21945l = 0.0f;
        this.f21941h.set(false);
    }

    /* JADX INFO: renamed from: c */
    public final void m8403c(Range range) {
        if (this.f21941h.get()) {
            float fFloatValue = ((Float) this.f21934a.mo3831be()).floatValue();
            float fMax = Math.max(((Float) range.getLower()).floatValue(), fFloatValue - this.f21945l);
            if (fFloatValue <= fMax) {
                return;
            }
            float fFloatValue2 = ((Float) range.clamp(Float.valueOf(fMax))).floatValue();
            this.f21934a.mo3415bf(Float.valueOf(fFloatValue2));
            this.f21936c = fFloatValue2;
            this.f21937d = fFloatValue2;
            this.f21940g.schedule(new ewo(this, range, 10), 33L, TimeUnit.MILLISECONDS);
        }
    }
}
