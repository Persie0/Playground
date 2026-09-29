package p000;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.lingq.core.designsystem.R$attr;
import com.lingq.p020ui.MainActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class a7a extends View implements z5a {

    /* JADX INFO: renamed from: a */
    public final Paint f330a;

    /* JADX INFO: renamed from: b */
    public final RectF f331b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7a(MainActivity mainActivity, Rect rect) {
        super(mainActivity);
        rect.getClass();
        Paint paint = new Paint();
        this.f330a = paint;
        RectF rectF = new RectF();
        this.f331b = rectF;
        rectF.left = rect.left + 0.0f;
        rectF.right = rect.right - 0.0f;
        rectF.top = rect.top + 0.0f;
        rectF.bottom = rect.bottom - 0.0f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(6.0f);
        paint.setColor(jfa.m14431n(mainActivity, R$attr.tooltipColor));
        setFocusableInTouchMode(false);
        setPivotX(rect.exactCenterX());
        setPivotY(rect.exactCenterY());
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("scaleX", 0.7f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 0.7f, 1.0f), PropertyValuesHolder.ofFloat("alpha", 0.4f, 0.0f));
        objectAnimatorOfPropertyValuesHolder.setDuration(1000L);
        objectAnimatorOfPropertyValuesHolder.setRepeatMode(1);
        objectAnimatorOfPropertyValuesHolder.setRepeatCount(-1);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new qz2(2));
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
        canvas.drawRoundRect(this.f331b, 16.0f, 16.0f, this.f330a);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
