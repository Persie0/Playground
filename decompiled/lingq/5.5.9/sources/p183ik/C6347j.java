package p183ik;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.linguist.R;
import dm.C5207g;
import p378s3.C8954c;

/* JADX INFO: renamed from: ik.j */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public final class C6347j extends View implements InterfaceC6342e {

    /* JADX INFO: renamed from: a */
    public final Rect f36673a;

    /* JADX INFO: renamed from: b */
    public final Paint f36674b;

    /* JADX INFO: renamed from: c */
    public final Bitmap f36675c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6347j(Context context, Rect rect) {
        super(context);
        C5207g.m11111f(context, "context");
        C5207g.m11111f(rect, "viewRect");
        this.f36673a = rect;
        this.f36674b = new Paint();
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.ic_tooltip_tap);
        C5207g.m11110e(bitmapDecodeResource, "decodeResource(resources….drawable.ic_tooltip_tap)");
        this.f36675c = bitmapDecodeResource;
        setFocusableInTouchMode(false);
        setPivotX(rect.exactCenterX());
        setPivotY(rect.exactCenterY());
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.8f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.8f), PropertyValuesHolder.ofFloat("alpha", 0.2f, 1.0f));
        objectAnimatorOfPropertyValuesHolder.setDuration(700L);
        objectAnimatorOfPropertyValuesHolder.setRepeatMode(2);
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
            Rect rect = this.f36673a;
            int i10 = rect.left;
            float f3 = (rect.right - i10) / 2;
            Bitmap bitmap = this.f36675c;
            canvas.drawBitmap(bitmap, (f3 - (bitmap.getWidth() / 2)) + i10, rect.exactCenterY(), this.f36674b);
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
