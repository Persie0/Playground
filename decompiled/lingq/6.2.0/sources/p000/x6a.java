package p000;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.OvershootInterpolator;
import com.lingq.core.designsystem.R$attr;
import com.lingq.p020ui.MainActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class x6a extends View implements z5a {

    /* JADX INFO: renamed from: a */
    public final Rect f67838a;

    /* JADX INFO: renamed from: b */
    public final Paint f67839b;

    /* JADX INFO: renamed from: c */
    public final Paint f67840c;

    /* JADX INFO: renamed from: d */
    public final float f67841d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6a(MainActivity mainActivity, Rect rect) {
        super(mainActivity);
        rect.getClass();
        this.f67838a = rect;
        Paint paint = new Paint();
        this.f67839b = paint;
        Paint paint2 = new Paint();
        this.f67840c = paint2;
        this.f67841d = jfa.m14419b(mainActivity, 24);
        paint.setShadowLayer(12.0f, 2.0f, 2.0f, Color.parseColor("#80000000"));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(jfa.m14431n(mainActivity, R$attr.tooltipColor));
        paint.setStrokeWidth(12.0f);
        paint2.setShadowLayer(12.0f, 2.0f, 2.0f, Color.parseColor("#80000000"));
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(jfa.m14431n(mainActivity, R$attr.tooltipColor));
        setFocusableInTouchMode(false);
        setPivotX(rect.exactCenterX());
        setPivotY(rect.exactCenterY());
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("scaleX", 0.6f, 1.2f), PropertyValuesHolder.ofFloat("scaleY", 0.6f, 1.2f), PropertyValuesHolder.ofFloat("alpha", 0.1f, 1.0f));
        objectAnimatorOfPropertyValuesHolder.setDuration(1000L);
        objectAnimatorOfPropertyValuesHolder.setRepeatMode(2);
        objectAnimatorOfPropertyValuesHolder.setRepeatCount(-1);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new OvershootInterpolator());
        objectAnimatorOfPropertyValuesHolder.start();
    }

    @Override // p000.z5a
    /* JADX INFO: renamed from: a */
    public final void mo164a() {
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
        Rect rect = this.f67838a;
        float fCenterX = rect.centerX();
        float fCenterY = rect.centerY();
        Paint paint = this.f67839b;
        float f = this.f67841d;
        canvas.drawCircle(fCenterX, fCenterY, f, paint);
        canvas.drawCircle(rect.centerX(), rect.centerY(), f / 2.0f, this.f67840c);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
