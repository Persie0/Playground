package p183ik;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.linguist.R;
import dm.C5207g;
import java.util.List;
import p225kk.C6716m;
import p378s3.C8954c;

/* JADX INFO: renamed from: ik.o */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public final class C6352o extends View implements InterfaceC6342e {

    /* JADX INFO: renamed from: a */
    public final Paint f36684a;

    /* JADX INFO: renamed from: b */
    public final RectF f36685b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6352o(Context context, Rect rect) {
        super(context);
        C5207g.m11111f(context, "context");
        C5207g.m11111f(rect, "viewRect");
        Paint paint = new Paint();
        this.f36684a = paint;
        RectF rectF = new RectF();
        this.f36685b = rectF;
        rectF.left = rect.left + 0.0f;
        rectF.right = rect.right - 0.0f;
        rectF.top = rect.top + 0.0f;
        rectF.bottom = rect.bottom - 0.0f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(6.0f);
        List<Integer> list = C6716m.f37937a;
        paint.setColor(C6716m.m13333r(R.attr.tooltipColor, context));
        setFocusableInTouchMode(false);
        setPivotX(rect.exactCenterX());
        setPivotY(rect.exactCenterY());
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("scaleX", 0.7f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 0.7f, 1.0f), PropertyValuesHolder.ofFloat("alpha", 0.4f, 0.0f));
        objectAnimatorOfPropertyValuesHolder.setDuration(1000L);
        objectAnimatorOfPropertyValuesHolder.setRepeatMode(1);
        objectAnimatorOfPropertyValuesHolder.setRepeatCount(-1);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new C8954c());
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
        if (canvas != null) {
            canvas.drawRoundRect(this.f36685b, 16.0f, 16.0f, this.f36684a);
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
