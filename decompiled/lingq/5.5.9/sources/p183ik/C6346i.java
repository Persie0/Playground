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
import java.util.List;
import p225kk.C6716m;
import p378s3.C8954c;

/* JADX INFO: renamed from: ik.i */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public final class C6346i extends View implements InterfaceC6342e {

    /* JADX INFO: renamed from: a */
    public final Rect f36670a;

    /* JADX INFO: renamed from: b */
    public final Paint f36671b;

    /* JADX INFO: renamed from: c */
    public final Bitmap f36672c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6346i(Context context, Rect rect) {
        super(context);
        C5207g.m11111f(context, "context");
        C5207g.m11111f(rect, "viewRect");
        this.f36670a = rect;
        this.f36671b = new Paint();
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.ic_tooltip_tap);
        C5207g.m11110e(bitmapDecodeResource, "decodeResource(resources….drawable.ic_tooltip_tap)");
        this.f36672c = bitmapDecodeResource;
        setFocusableInTouchMode(false);
        setPivotX(rect.exactCenterX());
        setPivotY(rect.exactCenterY());
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.8f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.8f), PropertyValuesHolder.ofFloat("alpha", 0.1f, 1.0f));
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
            Rect rect = this.f36670a;
            float f3 = rect.left;
            float f10 = (rect.right - f3) / 2;
            Bitmap bitmap = this.f36672c;
            float width = (f10 - (bitmap.getWidth() / 2)) + f3;
            float f11 = rect.bottom;
            List<Integer> list = C6716m.f37937a;
            canvas.drawBitmap(bitmap, width, f11 - C6716m.m13316a(5), this.f36671b);
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
