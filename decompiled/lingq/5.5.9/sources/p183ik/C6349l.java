package p183ik;

import android.animation.AnimatorSet;
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
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import com.linguist.R;
import dm.C5207g;

/* JADX INFO: renamed from: ik.l */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public final class C6349l extends View implements InterfaceC6342e {

    /* JADX INFO: renamed from: a */
    public final Rect f36677a;

    /* JADX INFO: renamed from: b */
    public final Paint f36678b;

    /* JADX INFO: renamed from: c */
    public final Bitmap f36679c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6349l(Context context, Rect rect) {
        super(context);
        C5207g.m11111f(context, "context");
        C5207g.m11111f(rect, "viewRect");
        this.f36677a = rect;
        this.f36678b = new Paint();
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.ic_tooltip_tap);
        C5207g.m11110e(bitmapDecodeResource, "decodeResource(resources….drawable.ic_tooltip_tap)");
        this.f36679c = bitmapDecodeResource;
        setFocusableInTouchMode(false);
        setPivotX(rect.exactCenterX());
        setPivotY(rect.exactCenterY());
        setAlpha(0.0f);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f));
        objectAnimatorOfPropertyValuesHolder.setDuration(800L);
        objectAnimatorOfPropertyValuesHolder.setStartDelay(200L);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
        ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.8f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.8f), PropertyValuesHolder.ofFloat("alpha", 1.0f, 0.8f));
        objectAnimatorOfPropertyValuesHolder2.setDuration(600L);
        objectAnimatorOfPropertyValuesHolder2.setInterpolator(new OvershootInterpolator());
        ObjectAnimator objectAnimatorOfPropertyValuesHolder3 = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("translationX", 0.0f, -120.0f));
        objectAnimatorOfPropertyValuesHolder3.setDuration(700L);
        objectAnimatorOfPropertyValuesHolder3.setInterpolator(new AccelerateDecelerateInterpolator());
        ObjectAnimator objectAnimatorOfPropertyValuesHolder4 = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("scaleX", 0.8f, 1.1f), PropertyValuesHolder.ofFloat("scaleY", 0.8f, 1.1f), PropertyValuesHolder.ofFloat("alpha", 0.8f, 0.0f), PropertyValuesHolder.ofFloat("translationX", -120.0f, -50.0f));
        objectAnimatorOfPropertyValuesHolder4.setDuration(600L);
        objectAnimatorOfPropertyValuesHolder4.setInterpolator(new LinearInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(objectAnimatorOfPropertyValuesHolder, objectAnimatorOfPropertyValuesHolder2, objectAnimatorOfPropertyValuesHolder3, objectAnimatorOfPropertyValuesHolder4);
        animatorSet.addListener(new C6348k(animatorSet));
        animatorSet.start();
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
            Rect rect = this.f36677a;
            int i10 = rect.left;
            float f3 = (rect.right - i10) / 2;
            Bitmap bitmap = this.f36679c;
            canvas.drawBitmap(bitmap, (f3 - (bitmap.getWidth() / 2)) + i10, rect.exactCenterY(), this.f36678b);
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
