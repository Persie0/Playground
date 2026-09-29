package p000;

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

/* JADX INFO: loaded from: classes2.dex */
public final class f69 extends Drawable {

    /* JADX INFO: renamed from: a */
    public final gg0 f38523a = new gg0(this, 3);

    /* JADX INFO: renamed from: b */
    public final Paint f38524b;

    /* JADX INFO: renamed from: c */
    public final Rect f38525c;

    /* JADX INFO: renamed from: d */
    public final Matrix f38526d;

    /* JADX INFO: renamed from: e */
    public ValueAnimator f38527e;

    /* JADX INFO: renamed from: f */
    public e69 f38528f;

    public f69() {
        Paint paint = new Paint();
        this.f38524b = paint;
        this.f38525c = new Rect();
        this.f38526d = new Matrix();
        paint.setAntiAlias(true);
    }

    /* JADX INFO: renamed from: a */
    public final void m11567a() {
        e69 e69Var;
        ValueAnimator valueAnimator = this.f38527e;
        if (valueAnimator == null || valueAnimator.isStarted() || (e69Var = this.f38528f) == null || !e69Var.f36779o || getCallback() == null) {
            return;
        }
        this.f38527e.start();
    }

    /* JADX INFO: renamed from: b */
    public final void m11568b() {
        e69 e69Var;
        Shader radialGradient;
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        if (iWidth == 0 || iHeight == 0 || (e69Var = this.f38528f) == null) {
            return;
        }
        int iRound = e69Var.f36771g;
        if (iRound <= 0) {
            iRound = Math.round(e69Var.f36773i * iWidth);
        }
        e69 e69Var2 = this.f38528f;
        int iRound2 = e69Var2.f36772h;
        if (iRound2 <= 0) {
            iRound2 = Math.round(e69Var2.f36774j * iHeight);
        }
        e69 e69Var3 = this.f38528f;
        boolean z = true;
        if (e69Var3.f36770f != 1) {
            int i = e69Var3.f36767c;
            if (i != 1 && i != 3) {
                z = false;
            }
            if (z) {
                iRound = 0;
            }
            if (!z) {
                iRound2 = 0;
            }
            e69 e69Var4 = this.f38528f;
            radialGradient = new LinearGradient(0.0f, 0.0f, iRound, iRound2, e69Var4.f36766b, e69Var4.f36765a, Shader.TileMode.CLAMP);
        } else {
            float fMax = (float) (((double) Math.max(iRound, iRound2)) / Math.sqrt(2.0d));
            e69 e69Var5 = this.f38528f;
            radialGradient = new RadialGradient(iRound / 2.0f, iRound2 / 2.0f, fMax, e69Var5.f36766b, e69Var5.f36765a, Shader.TileMode.CLAMP);
        }
        this.f38524b.setShader(radialGradient);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fM17726a;
        float fM17726a2;
        if (this.f38528f != null) {
            Paint paint = this.f38524b;
            if (paint.getShader() == null) {
                return;
            }
            float fTan = (float) Math.tan(Math.toRadians(this.f38528f.f36777m));
            Rect rect = this.f38525c;
            float fWidth = (rect.width() * fTan) + rect.height();
            float fHeight = (fTan * rect.height()) + rect.width();
            ValueAnimator valueAnimator = this.f38527e;
            float f = 0.0f;
            float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
            int i = this.f38528f.f36767c;
            if (i != 1) {
                if (i == 2) {
                    fM17726a2 = AbstractC3393o1.m17726a(-fHeight, fHeight, animatedFraction, fHeight);
                } else if (i != 3) {
                    float f2 = -fHeight;
                    fM17726a2 = AbstractC3393o1.m17726a(fHeight, f2, animatedFraction, f2);
                } else {
                    fM17726a = AbstractC3393o1.m17726a(-fWidth, fWidth, animatedFraction, fWidth);
                }
                f = fM17726a2;
                fM17726a = 0.0f;
            } else {
                float f3 = -fWidth;
                fM17726a = AbstractC3393o1.m17726a(fWidth, f3, animatedFraction, f3);
            }
            Matrix matrix = this.f38526d;
            matrix.reset();
            matrix.setRotate(this.f38528f.f36777m, rect.width() / 2.0f, rect.height() / 2.0f);
            matrix.postTranslate(f, fM17726a);
            paint.getShader().setLocalMatrix(matrix);
            canvas.drawRect(rect, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        e69 e69Var = this.f38528f;
        if (e69Var != null) {
            return (e69Var.f36778n || e69Var.f36780p) ? -3 : -1;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f38525c.set(0, 0, rect.width(), rect.height());
        m11568b();
        m11567a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
