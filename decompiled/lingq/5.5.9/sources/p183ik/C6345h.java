package p183ik;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.OvershootInterpolator;
import com.linguist.R;
import dm.C5207g;
import java.util.List;
import p225kk.C6716m;

/* JADX INFO: renamed from: ik.h */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public final class C6345h extends View implements InterfaceC6342e {

    /* JADX INFO: renamed from: a */
    public final Rect f36666a;

    /* JADX INFO: renamed from: b */
    public final Paint f36667b;

    /* JADX INFO: renamed from: c */
    public final Paint f36668c;

    /* JADX INFO: renamed from: d */
    public final float f36669d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6345h(Context context, Rect rect) {
        super(context);
        C5207g.m11111f(context, "context");
        C5207g.m11111f(rect, "viewRect");
        this.f36666a = rect;
        Paint paint = new Paint();
        this.f36667b = paint;
        Paint paint2 = new Paint();
        this.f36668c = paint2;
        List<Integer> list = C6716m.f37937a;
        this.f36669d = C6716m.m13316a(24);
        paint.setShadowLayer(12.0f, 2.0f, 2.0f, Color.parseColor("#80000000"));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(C6716m.m13333r(R.attr.tooltipColor, context));
        paint.setStrokeWidth(12.0f);
        paint2.setShadowLayer(12.0f, 2.0f, 2.0f, Color.parseColor("#80000000"));
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(C6716m.m13333r(R.attr.tooltipColor, context));
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

    @Override // p183ik.InterfaceC6342e
    /* JADX INFO: renamed from: a */
    public final void mo12967a() {
        clearAnimation();
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f3 = this.f36669d;
        Rect rect = this.f36666a;
        if (canvas != null) {
            canvas.drawCircle(rect.centerX(), rect.centerY(), f3, this.f36667b);
        }
        if (canvas != null) {
            canvas.drawCircle(rect.centerX(), rect.centerY(), f3 / 2, this.f36668c);
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
