package p000;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;

/* JADX INFO: loaded from: classes.dex */
public final class mc2 extends yl2 {

    /* JADX INFO: renamed from: S */
    public static final lc2 f51057S = new lc2(14);

    /* JADX INFO: renamed from: I */
    public final dm2 f51058I;

    /* JADX INFO: renamed from: J */
    public final yf9 f51059J;

    /* JADX INFO: renamed from: K */
    public final bm2 f51060K;

    /* JADX INFO: renamed from: L */
    public float f51061L;

    /* JADX INFO: renamed from: M */
    public boolean f51062M;

    /* JADX INFO: renamed from: N */
    public final ValueAnimator f51063N;

    /* JADX INFO: renamed from: O */
    public ValueAnimator f51064O;

    /* JADX INFO: renamed from: P */
    public TimeInterpolator f51065P;

    /* JADX INFO: renamed from: Q */
    public TimeInterpolator f51066Q;

    /* JADX INFO: renamed from: R */
    public TimeInterpolator f51067R;

    public mc2(Context context, final x90 x90Var, dm2 dm2Var) {
        super(context, x90Var);
        this.f51062M = false;
        this.f51058I = dm2Var;
        bm2 bm2Var = new bm2();
        this.f51060K = bm2Var;
        bm2Var.f8678h = true;
        yf9 yf9Var = new yf9(this, f51057S);
        this.f51059J = yf9Var;
        zf9 zf9Var = new zf9();
        zf9Var.m25593a(1.0f);
        zf9Var.m25594b(50.0f);
        yf9Var.f69795m = zf9Var;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f51063N = valueAnimator;
        valueAnimator.setDuration(1000L);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: kc2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                x90 x90Var2 = x90Var;
                if (!x90Var2.m24412b(true) || x90Var2.f67956m == 0) {
                    return;
                }
                mc2 mc2Var = this.f47021a;
                if (mc2Var.isVisible()) {
                    mc2Var.invalidateSelf();
                }
            }
        });
        if (x90Var.m24412b(true) && x90Var.f67956m != 0) {
            valueAnimator.start();
        }
        if (this.f69981i != 1.0f) {
            this.f69981i = 1.0f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.f69984l)) {
            canvas.save();
            Rect bounds = getBounds();
            float fM25182b = m25182b();
            ObjectAnimator objectAnimator = this.f69976d;
            boolean z = objectAnimator != null && objectAnimator.isRunning();
            ObjectAnimator objectAnimator2 = this.f69977e;
            boolean z2 = objectAnimator2 != null && objectAnimator2.isRunning();
            dm2 dm2Var = this.f51058I;
            dm2Var.f35817a.mo11063d();
            dm2Var.mo10465a(canvas, bounds, fM25182b, z, z2);
            float fM25183c = m25183c();
            bm2 bm2Var = this.f51060K;
            bm2Var.f8676f = fM25183c;
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.f69982j;
            paint.setStyle(style);
            paint.setAntiAlias(true);
            x90 x90Var = this.f69974b;
            bm2Var.f8673c = x90Var.f67948e[0];
            int iM21644w = x90Var.f67952i;
            dm2 dm2Var2 = this.f51058I;
            if (iM21644w > 0) {
                if (!(dm2Var2 instanceof vc5)) {
                    iM21644w = (int) ((AbstractC3584sr.m21644w(bm2Var.f8672b, 0.0f, 0.01f) * iM21644w) / 0.01f);
                }
                this.f51058I.mo10468d(canvas, paint, bm2Var.f8672b, 1.0f, x90Var.f67949f, this.f69983k, iM21644w);
            } else {
                dm2Var2.mo10468d(canvas, paint, 0.0f, 1.0f, x90Var.f67949f, this.f69983k, 0);
            }
            int i = this.f69983k;
            dm2 dm2Var3 = this.f51058I;
            dm2Var3.mo10467c(canvas, paint, bm2Var, i);
            dm2Var3.mo10466b(x90Var.f67948e[0], this.f69983k, canvas, paint);
            canvas.restore();
        }
    }

    @Override // p000.yl2
    /* JADX INFO: renamed from: e */
    public final boolean mo16760e(boolean z, boolean z2, boolean z3) {
        boolean zMo16760e = super.mo16760e(z, z2, z3);
        C3153jn c3153jn = this.f69975c;
        ContentResolver contentResolver = this.f69973a.getContentResolver();
        c3153jn.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f == 0.0f) {
            this.f51062M = true;
            return zMo16760e;
        }
        this.f51062M = false;
        this.f51059J.f69795m.m25594b(50.0f / f);
        return zMo16760e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f51058I.mo10469e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f51058I.mo10470f();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f51059J.m25120e();
        this.f51060K.f8672b = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        float f = i;
        x90 x90Var = this.f69974b;
        float f2 = (f < x90Var.f67958o * 10000.0f || f > x90Var.f67959p * 10000.0f) ? 0.0f : 1.0f;
        boolean z = this.f51062M;
        bm2 bm2Var = this.f51060K;
        yf9 yf9Var = this.f51059J;
        if (z) {
            yf9Var.m25120e();
            bm2Var.f8672b = f / 10000.0f;
            invalidateSelf();
            bm2Var.f8675e = f2;
            invalidateSelf();
        } else {
            int iWidth = getBounds().width();
            int iHeight = getBounds().height();
            if (iWidth > 0 && iHeight > 0) {
                if (this.f51058I instanceof vc5) {
                    yf9Var.m25118c(10000.0f / iWidth);
                } else {
                    yf9Var.m25118c((float) (10000.0d / (((double) Math.min(iHeight, iWidth)) * 3.141592653589793d)));
                }
            }
            yf9Var.f69784b = bm2Var.f8672b * 10000.0f;
            yf9Var.f69785c = true;
            yf9Var.m25117a(f);
        }
        return true;
    }
}
