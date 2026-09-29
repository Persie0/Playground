package p359r8;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.activity.result.C0204c;
import com.facebook.shimmer.C2338a;

/* JADX INFO: renamed from: r8.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8747b extends Drawable {

    /* JADX INFO: renamed from: a */
    public final a f46375a = new a();

    /* JADX INFO: renamed from: b */
    public final Paint f46376b;

    /* JADX INFO: renamed from: c */
    public final Rect f46377c;

    /* JADX INFO: renamed from: d */
    public final Matrix f46378d;

    /* JADX INFO: renamed from: e */
    public ValueAnimator f46379e;

    /* JADX INFO: renamed from: f */
    public C2338a f46380f;

    /* JADX INFO: renamed from: r8.b$a */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C8747b.this.invalidateSelf();
        }
    }

    public C8747b() {
        Paint paint = new Paint();
        this.f46376b = paint;
        this.f46377c = new Rect();
        this.f46378d = new Matrix();
        paint.setAntiAlias(true);
    }

    /* JADX INFO: renamed from: a */
    public final void m16983a() {
        C2338a c2338a;
        ValueAnimator valueAnimator = this.f46379e;
        if (valueAnimator != null && !valueAnimator.isStarted() && (c2338a = this.f46380f) != null && c2338a.f11726o && getCallback() != null) {
            this.f46379e.start();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m16984b() {
        C2338a c2338a;
        Shader radialGradient;
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        if (iWidth == 0 || iHeight == 0 || (c2338a = this.f46380f) == null) {
            return;
        }
        int iRound = c2338a.f11718g;
        if (iRound <= 0) {
            iRound = Math.round(c2338a.f11720i * iWidth);
        }
        C2338a c2338a2 = this.f46380f;
        int iRound2 = c2338a2.f11719h;
        if (iRound2 <= 0) {
            iRound2 = Math.round(c2338a2.f11721j * iHeight);
        }
        C2338a c2338a3 = this.f46380f;
        boolean z10 = true;
        if (c2338a3.f11717f != 1) {
            int i10 = c2338a3.f11714c;
            if (i10 != 1 && i10 != 3) {
                z10 = false;
            }
            if (z10) {
                iRound = 0;
            }
            if (!z10) {
                iRound2 = 0;
            }
            C2338a c2338a4 = this.f46380f;
            radialGradient = new LinearGradient(0.0f, 0.0f, iRound, iRound2, c2338a4.f11713b, c2338a4.f11712a, Shader.TileMode.CLAMP);
        } else {
            float f3 = iRound2 / 2.0f;
            float fMax = (float) (((double) Math.max(iRound, iRound2)) / Math.sqrt(2.0d));
            C2338a c2338a5 = this.f46380f;
            radialGradient = new RadialGradient(iRound / 2.0f, f3, fMax, c2338a5.f11713b, c2338a5.f11712a, Shader.TileMode.CLAMP);
        }
        this.f46376b.setShader(radialGradient);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fM845d;
        float fM845d2;
        if (this.f46380f != null) {
            Paint paint = this.f46376b;
            if (paint.getShader() == null) {
                return;
            }
            float fTan = (float) Math.tan(Math.toRadians(this.f46380f.f11724m));
            Rect rect = this.f46377c;
            float fWidth = (rect.width() * fTan) + rect.height();
            float fHeight = (fTan * rect.height()) + rect.width();
            ValueAnimator valueAnimator = this.f46379e;
            float f3 = 0.0f;
            float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
            int i10 = this.f46380f.f11714c;
            if (i10 != 1) {
                if (i10 == 2) {
                    fM845d2 = C0204c.m845d(-fHeight, fHeight, animatedFraction, fHeight);
                } else if (i10 != 3) {
                    float f10 = -fHeight;
                    fM845d2 = C0204c.m845d(fHeight, f10, animatedFraction, f10);
                } else {
                    fM845d = C0204c.m845d(-fWidth, fWidth, animatedFraction, fWidth);
                }
                f3 = fM845d2;
                fM845d = 0.0f;
            } else {
                float f11 = -fWidth;
                fM845d = C0204c.m845d(fWidth, f11, animatedFraction, f11);
            }
            Matrix matrix = this.f46378d;
            matrix.reset();
            matrix.setRotate(this.f46380f.f11724m, rect.width() / 2.0f, rect.height() / 2.0f);
            matrix.postTranslate(f3, fM845d);
            paint.getShader().setLocalMatrix(matrix);
            canvas.drawRect(rect, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        C2338a c2338a = this.f46380f;
        if (c2338a == null || (!c2338a.f11725n && !c2338a.f11727p)) {
            return -1;
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f46377c.set(0, 0, rect.width(), rect.height());
        m16984b();
        m16983a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
