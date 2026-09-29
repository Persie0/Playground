package p000;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import com.lingq.core.designsystem.R$attr;
import com.lingq.p020ui.MainActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class b7a extends View implements z5a {

    /* JADX INFO: renamed from: a */
    public final Rect f8065a;

    /* JADX INFO: renamed from: b */
    public final Paint f8066b;

    /* JADX INFO: renamed from: c */
    public final Paint f8067c;

    /* JADX INFO: renamed from: d */
    public final float f8068d;

    /* JADX INFO: renamed from: e */
    public final AlphaAnimation f8069e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7a(MainActivity mainActivity, Rect rect) {
        super(mainActivity);
        rect.getClass();
        this.f8065a = rect;
        Paint paint = new Paint();
        this.f8066b = paint;
        Paint paint2 = new Paint();
        this.f8067c = paint2;
        this.f8068d = jfa.m14419b(mainActivity, 24);
        paint.setShadowLayer(12.0f, 2.0f, 2.0f, Color.parseColor("#80000000"));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(jfa.m14431n(mainActivity, R$attr.tooltipColor));
        paint.setStrokeWidth(12.0f);
        paint2.setShadowLayer(12.0f, 2.0f, 2.0f, Color.parseColor("#80000000"));
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(jfa.m14431n(mainActivity, R$attr.tooltipColor));
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.5f);
        alphaAnimation.setDuration(1500L);
        alphaAnimation.setRepeatCount(-1);
        alphaAnimation.setRepeatMode(2);
        alphaAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f8069e = alphaAnimation;
        clearAnimation();
        startAnimation(this.f8069e);
    }

    @Override // p000.z5a
    /* JADX INFO: renamed from: a */
    public final void mo164a() {
        AlphaAnimation alphaAnimation = this.f8069e;
        if (alphaAnimation != null) {
            alphaAnimation.cancel();
        }
        clearAnimation();
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        Rect rect = this.f8065a;
        float fCenterX = rect.centerX();
        float fCenterY = rect.centerY();
        Paint paint = this.f8066b;
        float f = this.f8068d;
        canvas.drawCircle(fCenterX, fCenterY, f, paint);
        canvas.drawCircle(rect.centerX(), rect.centerY(), f / 2.0f, this.f8067c);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
