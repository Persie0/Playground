package p183ik;

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
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import com.linguist.R;
import dm.C5207g;
import java.util.List;
import p225kk.C6716m;

/* JADX INFO: renamed from: ik.p */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public final class C6353p extends View implements InterfaceC6342e {

    /* JADX INFO: renamed from: a */
    public final Rect f36686a;

    /* JADX INFO: renamed from: b */
    public final Paint f36687b;

    /* JADX INFO: renamed from: c */
    public final Paint f36688c;

    /* JADX INFO: renamed from: d */
    public final float f36689d;

    /* JADX INFO: renamed from: e */
    public AlphaAnimation f36690e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6353p(Context context, Rect rect) {
        super(context);
        C5207g.m11111f(context, "context");
        C5207g.m11111f(rect, "viewRect");
        this.f36686a = rect;
        Paint paint = new Paint();
        this.f36687b = paint;
        Paint paint2 = new Paint();
        this.f36688c = paint2;
        List<Integer> list = C6716m.f37937a;
        this.f36689d = C6716m.m13316a(24);
        paint.setShadowLayer(12.0f, 2.0f, 2.0f, Color.parseColor("#80000000"));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(C6716m.m13333r(R.attr.tooltipColor, context));
        paint.setStrokeWidth(12.0f);
        paint2.setShadowLayer(12.0f, 2.0f, 2.0f, Color.parseColor("#80000000"));
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(C6716m.m13333r(R.attr.tooltipColor, context));
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.5f);
        alphaAnimation.setDuration(1500L);
        alphaAnimation.setRepeatCount(-1);
        alphaAnimation.setRepeatMode(2);
        alphaAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f36690e = alphaAnimation;
        clearAnimation();
        startAnimation(this.f36690e);
    }

    @Override // p183ik.InterfaceC6342e
    /* JADX INFO: renamed from: a */
    public final void mo12967a() {
        AlphaAnimation alphaAnimation = this.f36690e;
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
        super.onDraw(canvas);
        float f3 = this.f36689d;
        Rect rect = this.f36686a;
        if (canvas != null) {
            canvas.drawCircle(rect.centerX(), rect.centerY(), f3, this.f36687b);
        }
        if (canvas != null) {
            canvas.drawCircle(rect.centerX(), rect.centerY(), f3 / 2, this.f36688c);
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
