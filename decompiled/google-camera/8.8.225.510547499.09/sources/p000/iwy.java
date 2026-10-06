package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class iwy extends EdgeEffect {

    /* JADX INFO: renamed from: a */
    float f32512a;

    /* JADX INFO: renamed from: b */
    private final Interpolator f32513b;

    /* JADX INFO: renamed from: c */
    private float f32514c;

    /* JADX INFO: renamed from: d */
    private final Rect f32515d;

    /* JADX INFO: renamed from: e */
    private float f32516e;

    /* JADX INFO: renamed from: f */
    private float f32517f;

    /* JADX INFO: renamed from: g */
    private float f32518g;

    /* JADX INFO: renamed from: h */
    private float f32519h;

    /* JADX INFO: renamed from: i */
    private float f32520i;

    /* JADX INFO: renamed from: j */
    private int f32521j;

    /* JADX INFO: renamed from: k */
    private long f32522k;

    /* JADX INFO: renamed from: l */
    private float f32523l;

    /* JADX INFO: renamed from: m */
    private final iwx f32524m;

    public iwy(Context context, iwx iwxVar) {
        super(context);
        this.f32513b = new DecelerateInterpolator();
        this.f32515d = new Rect();
        this.f32521j = 0;
        this.f32524m = iwxVar;
    }

    @Override // android.widget.EdgeEffect
    public final boolean draw(Canvas canvas) {
        float f;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float interpolation = this.f32513b.getInterpolation(Math.min((jCurrentAnimationTimeMillis - this.f32522k) / this.f32523l, 1.0f));
        float f2 = this.f32519h;
        this.f32518g = f2 + ((this.f32520i - f2) * interpolation);
        float f3 = this.f32516e;
        float f4 = f3 + ((this.f32517f - f3) * interpolation);
        this.f32512a = f4;
        this.f32524m.mo4603aA(f4);
        if (jCurrentAnimationTimeMillis - this.f32522k >= this.f32523l * 0.999f) {
            switch (this.f32521j) {
                case 1:
                    this.f32521j = 4;
                    this.f32522k = jCurrentAnimationTimeMillis;
                    f = 2000.0f;
                    this.f32523l = f;
                    this.f32519h = this.f32518g;
                    this.f32516e = this.f32512a;
                    this.f32520i = 0.0f;
                    this.f32517f = 0.0f;
                    break;
                case 2:
                    this.f32521j = 3;
                    this.f32522k = jCurrentAnimationTimeMillis;
                    f = 600.0f;
                    this.f32523l = f;
                    this.f32519h = this.f32518g;
                    this.f32516e = this.f32512a;
                    this.f32520i = 0.0f;
                    this.f32517f = 0.0f;
                    break;
                case 3:
                    this.f32521j = 0;
                    break;
                case 4:
                    this.f32521j = 3;
                    break;
            }
        }
        return super.draw(canvas);
    }

    @Override // android.widget.EdgeEffect
    public final boolean isFinished() {
        return this.f32521j == 0;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        super.onAbsorb(i);
        this.f32521j = 2;
        int iM12865j = jbx.m12865j(Math.abs(i), 100, 10000);
        this.f32522k = AnimationUtils.currentAnimationTimeMillis();
        float f = iM12865j;
        this.f32523l = (0.02f * f) + 0.15f;
        this.f32519h = 0.09f;
        this.f32516e = Math.max(this.f32512a, 0.0f);
        this.f32517f = Math.min((((f * (f / 100.0f)) * 1.5E-4f) / 2.0f) + 0.025f, 1.0f);
        this.f32520i = Math.max(this.f32519h, Math.min(iM12865j * 6 * 1.0E-5f, 0.15f));
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f) {
        super.onPull(f);
        onPull(f, 0.5f);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        super.onRelease();
        int i = this.f32521j;
        if (i == 1 || i == 4) {
            this.f32514c = 0.0f;
            this.f32521j = 3;
            this.f32519h = this.f32518g;
            this.f32516e = this.f32512a;
            this.f32520i = 0.0f;
            this.f32517f = 0.0f;
            this.f32522k = AnimationUtils.currentAnimationTimeMillis();
            this.f32523l = 600.0f;
        }
    }

    @Override // android.widget.EdgeEffect
    public final void setSize(int i, int i2) {
        super.setSize(i, i2);
        Rect rect = this.f32515d;
        rect.set(rect.left, this.f32515d.top, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004f  */
    /* JADX WARN: Code duplicated, block: B:13:0x0054  */
    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f2) {
        float f3;
        super.onPull(f, f2);
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i = this.f32521j;
        float fMax = 0.0f;
        if (i != 4) {
            if (i != 1) {
            }
            this.f32521j = 1;
            this.f32522k = jCurrentAnimationTimeMillis;
            this.f32523l = 167.0f;
            this.f32514c += f;
            float fMin = Math.min(0.15f, this.f32518g + (Math.abs(f) * 0.8f));
            this.f32518g = fMin;
            this.f32519h = fMin;
            f3 = this.f32514c;
            if (f3 == 0.0f) {
                this.f32512a = 0.0f;
                this.f32516e = 0.0f;
            } else {
                fMax = (float) (Math.max(0.0d, 0.7d - (1.0d / Math.sqrt((Math.abs(f3) * this.f32515d.height()) * this.f32518g))) / 0.7d);
                this.f32512a = fMax;
                this.f32516e = fMax;
            }
            this.f32524m.mo4603aA(fMax);
            this.f32520i = this.f32518g;
            this.f32517f = this.f32512a;
        }
        if (jCurrentAnimationTimeMillis - this.f32522k < this.f32523l) {
            return;
        }
        this.f32512a = Math.max(0.0f, this.f32512a);
        this.f32521j = 1;
        this.f32522k = jCurrentAnimationTimeMillis;
        this.f32523l = 167.0f;
        this.f32514c += f;
        float fMin2 = Math.min(0.15f, this.f32518g + (Math.abs(f) * 0.8f));
        this.f32518g = fMin2;
        this.f32519h = fMin2;
        f3 = this.f32514c;
        if (f3 == 0.0f) {
            this.f32512a = 0.0f;
            this.f32516e = 0.0f;
        } else {
            fMax = (float) (Math.max(0.0d, 0.7d - (1.0d / Math.sqrt((Math.abs(f3) * this.f32515d.height()) * this.f32518g))) / 0.7d);
            this.f32512a = fMax;
            this.f32516e = fMax;
        }
        this.f32524m.mo4603aA(fMax);
        this.f32520i = this.f32518g;
        this.f32517f = this.f32512a;
    }
}
