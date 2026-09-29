package p000;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
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
import com.lingq.core.tooltips.R$drawable;
import com.lingq.p020ui.MainActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class y6a extends View implements z5a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69383a;

    /* JADX INFO: renamed from: b */
    public final Rect f69384b;

    /* JADX INFO: renamed from: c */
    public final Paint f69385c;

    /* JADX INFO: renamed from: d */
    public final Bitmap f69386d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6a(MainActivity mainActivity, Rect rect, int i) {
        super(mainActivity);
        this.f69383a = i;
        rect.getClass();
        switch (i) {
            case 1:
                super(mainActivity);
                this.f69384b = rect;
                this.f69385c = new Paint();
                Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), R$drawable.ic_tooltip_tap);
                bitmapDecodeResource.getClass();
                this.f69386d = bitmapDecodeResource;
                setFocusableInTouchMode(false);
                setPivotX(rect.exactCenterX());
                setPivotY(rect.exactCenterY());
                ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.8f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.8f), PropertyValuesHolder.ofFloat("alpha", 0.2f, 1.0f));
                objectAnimatorOfPropertyValuesHolder.setDuration(700L);
                objectAnimatorOfPropertyValuesHolder.setRepeatMode(2);
                objectAnimatorOfPropertyValuesHolder.setRepeatCount(-1);
                objectAnimatorOfPropertyValuesHolder.setInterpolator(new qz2(2));
                objectAnimatorOfPropertyValuesHolder.start();
                break;
            case 2:
                super(mainActivity);
                this.f69384b = rect;
                this.f69385c = new Paint();
                Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(getResources(), R$drawable.ic_tooltip_tap);
                bitmapDecodeResource2.getClass();
                this.f69386d = bitmapDecodeResource2;
                setFocusableInTouchMode(false);
                setPivotX(rect.exactCenterX());
                setPivotY(rect.exactCenterY());
                setAlpha(0.0f);
                ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f));
                objectAnimatorOfPropertyValuesHolder2.setDuration(800L);
                objectAnimatorOfPropertyValuesHolder2.setStartDelay(200L);
                objectAnimatorOfPropertyValuesHolder2.setInterpolator(new AccelerateDecelerateInterpolator());
                ObjectAnimator objectAnimatorOfPropertyValuesHolder3 = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.8f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.8f), PropertyValuesHolder.ofFloat("alpha", 1.0f, 0.8f));
                objectAnimatorOfPropertyValuesHolder3.setDuration(600L);
                objectAnimatorOfPropertyValuesHolder3.setInterpolator(new OvershootInterpolator());
                ObjectAnimator objectAnimatorOfPropertyValuesHolder4 = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("translationX", 0.0f, -120.0f));
                objectAnimatorOfPropertyValuesHolder4.setDuration(700L);
                objectAnimatorOfPropertyValuesHolder4.setInterpolator(new AccelerateDecelerateInterpolator());
                ObjectAnimator objectAnimatorOfPropertyValuesHolder5 = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("scaleX", 0.8f, 1.1f), PropertyValuesHolder.ofFloat("scaleY", 0.8f, 1.1f), PropertyValuesHolder.ofFloat("alpha", 0.8f, 0.0f), PropertyValuesHolder.ofFloat("translationX", -120.0f, -50.0f));
                objectAnimatorOfPropertyValuesHolder5.setDuration(600L);
                objectAnimatorOfPropertyValuesHolder5.setInterpolator(new LinearInterpolator());
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(objectAnimatorOfPropertyValuesHolder2, objectAnimatorOfPropertyValuesHolder3, objectAnimatorOfPropertyValuesHolder4, objectAnimatorOfPropertyValuesHolder5);
                animatorSet.addListener(new z6a(animatorSet, 0));
                animatorSet.start();
                break;
            case 3:
                super(mainActivity);
                this.f69384b = rect;
                this.f69385c = new Paint();
                Bitmap bitmapDecodeResource3 = BitmapFactory.decodeResource(getResources(), R$drawable.ic_tooltip_tap);
                bitmapDecodeResource3.getClass();
                this.f69386d = bitmapDecodeResource3;
                setFocusableInTouchMode(false);
                setPivotX(rect.exactCenterX());
                setPivotY(rect.exactCenterY());
                setAlpha(0.0f);
                ObjectAnimator objectAnimatorOfPropertyValuesHolder6 = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f));
                objectAnimatorOfPropertyValuesHolder6.setDuration(800L);
                objectAnimatorOfPropertyValuesHolder6.setStartDelay(200L);
                objectAnimatorOfPropertyValuesHolder6.setInterpolator(new AccelerateDecelerateInterpolator());
                ObjectAnimator objectAnimatorOfPropertyValuesHolder7 = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.8f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.8f), PropertyValuesHolder.ofFloat("alpha", 1.0f, 0.8f));
                objectAnimatorOfPropertyValuesHolder7.setDuration(600L);
                objectAnimatorOfPropertyValuesHolder7.setInterpolator(new OvershootInterpolator());
                ObjectAnimator objectAnimatorOfPropertyValuesHolder8 = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("translationY", 0.0f, -120.0f));
                objectAnimatorOfPropertyValuesHolder8.setDuration(700L);
                objectAnimatorOfPropertyValuesHolder8.setInterpolator(new AccelerateDecelerateInterpolator());
                ObjectAnimator objectAnimatorOfPropertyValuesHolder9 = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("scaleX", 0.8f, 1.1f), PropertyValuesHolder.ofFloat("scaleY", 0.8f, 1.1f), PropertyValuesHolder.ofFloat("alpha", 0.8f, 0.0f), PropertyValuesHolder.ofFloat("translationY", -120.0f, -50.0f));
                objectAnimatorOfPropertyValuesHolder9.setDuration(600L);
                objectAnimatorOfPropertyValuesHolder9.setInterpolator(new LinearInterpolator());
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playSequentially(objectAnimatorOfPropertyValuesHolder6, objectAnimatorOfPropertyValuesHolder7, objectAnimatorOfPropertyValuesHolder8, objectAnimatorOfPropertyValuesHolder9);
                animatorSet2.addListener(new z6a(animatorSet2, 1));
                animatorSet2.start();
                break;
            default:
                this.f69384b = rect;
                this.f69385c = new Paint();
                Bitmap bitmapDecodeResource4 = BitmapFactory.decodeResource(getResources(), R$drawable.ic_tooltip_tap);
                bitmapDecodeResource4.getClass();
                this.f69386d = bitmapDecodeResource4;
                setFocusableInTouchMode(false);
                setPivotX(rect.exactCenterX());
                setPivotY(rect.exactCenterY());
                ObjectAnimator objectAnimatorOfPropertyValuesHolder10 = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.8f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.8f), PropertyValuesHolder.ofFloat("alpha", 0.1f, 1.0f));
                objectAnimatorOfPropertyValuesHolder10.setDuration(700L);
                objectAnimatorOfPropertyValuesHolder10.setRepeatMode(2);
                objectAnimatorOfPropertyValuesHolder10.setRepeatCount(-1);
                objectAnimatorOfPropertyValuesHolder10.setInterpolator(new qz2(2));
                objectAnimatorOfPropertyValuesHolder10.start();
                break;
        }
    }

    @Override // p000.z5a
    /* JADX INFO: renamed from: a */
    public final void mo164a() {
        ViewGroup viewGroup;
        switch (this.f69383a) {
            case 0:
                clearAnimation();
                ViewParent parent = getParent();
                viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(this);
                }
                break;
            case 1:
                clearAnimation();
                ViewParent parent2 = getParent();
                viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                if (viewGroup != null) {
                    viewGroup.removeView(this);
                }
                break;
            case 2:
                clearAnimation();
                ViewParent parent3 = getParent();
                viewGroup = parent3 instanceof ViewGroup ? (ViewGroup) parent3 : null;
                if (viewGroup != null) {
                    viewGroup.removeView(this);
                }
                break;
            default:
                clearAnimation();
                ViewParent parent4 = getParent();
                viewGroup = parent4 instanceof ViewGroup ? (ViewGroup) parent4 : null;
                if (viewGroup != null) {
                    viewGroup.removeView(this);
                }
                break;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i = this.f69383a;
        Paint paint = this.f69385c;
        Rect rect = this.f69384b;
        Bitmap bitmap = this.f69386d;
        canvas.getClass();
        switch (i) {
            case 0:
                super.onDraw(canvas);
                int i2 = rect.left;
                float width = (((rect.right - i2) / 2.0f) - (bitmap.getWidth() / 2)) + i2;
                float f = rect.bottom;
                Context context = getContext();
                context.getClass();
                canvas.drawBitmap(bitmap, width, f - jfa.m14419b(context, 5), paint);
                break;
            case 1:
                super.onDraw(canvas);
                int i3 = rect.left;
                canvas.drawBitmap(bitmap, (((rect.right - i3) / 2.0f) - (bitmap.getWidth() / 2)) + i3, rect.exactCenterY(), paint);
                break;
            case 2:
                super.onDraw(canvas);
                int i4 = rect.left;
                canvas.drawBitmap(bitmap, (((rect.right - i4) / 2.0f) - (bitmap.getWidth() / 2)) + i4, rect.exactCenterY(), paint);
                break;
            default:
                super.onDraw(canvas);
                int i5 = rect.left;
                float width2 = (((rect.right - i5) / 2.0f) - (bitmap.getWidth() / 2)) + i5;
                float fExactCenterY = rect.exactCenterY();
                Context context2 = getContext();
                context2.getClass();
                canvas.drawBitmap(bitmap, width2, fExactCenterY - jfa.m14419b(context2, 15), paint);
                break;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f69383a) {
        }
        return false;
    }
}
