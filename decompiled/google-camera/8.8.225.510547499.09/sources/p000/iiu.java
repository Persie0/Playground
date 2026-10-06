package p000;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iiu extends View {

    /* JADX INFO: renamed from: A */
    private final boolean f31121A;

    /* JADX INFO: renamed from: B */
    private int f31122B;

    /* JADX INFO: renamed from: C */
    private int f31123C;

    /* JADX INFO: renamed from: D */
    private int f31124D;

    /* JADX INFO: renamed from: E */
    private float f31125E;

    /* JADX INFO: renamed from: F */
    private float f31126F;

    /* JADX INFO: renamed from: G */
    private final RectF f31127G;

    /* JADX INFO: renamed from: H */
    private AnimatorSet f31128H;

    /* JADX INFO: renamed from: a */
    public final Paint f31129a;

    /* JADX INFO: renamed from: b */
    public final Paint f31130b;

    /* JADX INFO: renamed from: c */
    public final Paint f31131c;

    /* JADX INFO: renamed from: d */
    public int f31132d;

    /* JADX INFO: renamed from: e */
    public float f31133e;

    /* JADX INFO: renamed from: f */
    public int f31134f;

    /* JADX INFO: renamed from: g */
    public int f31135g;

    /* JADX INFO: renamed from: h */
    public long f31136h;

    /* JADX INFO: renamed from: i */
    public int f31137i;

    /* JADX INFO: renamed from: j */
    public boolean f31138j;

    /* JADX INFO: renamed from: k */
    public boolean f31139k;

    /* JADX INFO: renamed from: l */
    public String f31140l;

    /* JADX INFO: renamed from: m */
    public AnimatorSet f31141m;

    /* JADX INFO: renamed from: n */
    public int f31142n;

    /* JADX INFO: renamed from: o */
    private final int f31143o;

    /* JADX INFO: renamed from: p */
    private final Paint f31144p;

    /* JADX INFO: renamed from: q */
    private final Interpolator f31145q;

    /* JADX INFO: renamed from: r */
    private final Interpolator f31146r;

    /* JADX INFO: renamed from: s */
    private final String f31147s;

    /* JADX INFO: renamed from: t */
    private final float f31148t;

    /* JADX INFO: renamed from: u */
    private final float f31149u;

    /* JADX INFO: renamed from: v */
    private final float f31150v;

    /* JADX INFO: renamed from: w */
    private final float f31151w;

    /* JADX INFO: renamed from: x */
    private final float f31152x;

    /* JADX INFO: renamed from: y */
    private final float f31153y;

    /* JADX INFO: renamed from: z */
    private final float f31154z;

    public iiu(Context context) {
        super(context);
        this.f31142n = 1;
        this.f31122B = 0;
        this.f31127G = new RectF();
        this.f31136h = -1L;
        this.f31137i = -1;
        this.f31138j = false;
        this.f31139k = true;
        this.f31140l = "";
        this.f31141m = null;
        this.f31128H = null;
        setVisibility(4);
        this.f31143o = context.getResources().getDimensionPixelSize(C0100R.dimen.pie_progress_radius_max);
        this.f31134f = context.getResources().getDimensionPixelSize(C0100R.dimen.pie_progress_radius);
        this.f31135g = context.getResources().getDimensionPixelSize(C0100R.dimen.pie_progress_width);
        context.getResources().getDimensionPixelSize(C0100R.dimen.pie_progress_width_large);
        this.f31145q = new LinearInterpolator();
        this.f31146r = AnimationUtils.loadInterpolator(getContext(), R.interpolator.fast_out_slow_in);
        Paint paint = new Paint();
        this.f31129a = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setAlpha(51);
        Paint paint2 = new Paint(paint);
        this.f31144p = paint2;
        paint2.setAlpha(255);
        Paint paint3 = new Paint();
        this.f31130b = paint3;
        paint3.setAntiAlias(true);
        paint3.setTextAlign(Paint.Align.CENTER);
        paint3.setColor(-1);
        paint3.setTextSize(context.getResources().getDimensionPixelSize(C0100R.dimen.cuttleface_countdown_text_size));
        paint3.setAlpha(165);
        Paint paint4 = new Paint(paint3);
        this.f31131c = paint4;
        paint4.setTextSize(context.getResources().getDimensionPixelSize(C0100R.dimen.cuttleface_countdown_hint_text_size));
        paint4.setAlpha(255);
        String string = context.getResources().getString(C0100R.string.cuttleface_capturing_first);
        this.f31147s = string;
        acn.m206a(context, C0100R.font.google_sans_compat, new iir(this));
        float fAbs = Math.abs((paint3.descent() + paint3.ascent()) / 2.0f);
        this.f31148t = fAbs;
        float fMeasureText = paint3.measureText("0:00");
        float fMeasureText2 = paint3.measureText(":");
        float fMeasureText3 = paint3.measureText("0");
        this.f31149u = fMeasureText3;
        this.f31150v = fMeasureText / 2.0f;
        this.f31151w = fMeasureText2 / 2.0f;
        this.f31152x = fMeasureText3 / 2.0f;
        float fAbs2 = Math.abs((paint4.descent() + paint4.ascent()) / 2.0f);
        this.f31153y = fAbs2;
        float dimensionPixelSize = context.getResources().getDimensionPixelSize(C0100R.dimen.countdown_hint_padding);
        this.f31154z = dimensionPixelSize;
        Math.max(context.getResources().getDimensionPixelSize(C0100R.dimen.pie_progress_radius_large), Math.hypot(fAbs + fAbs2 + dimensionPixelSize + paint4.getFontMetrics().bottom, paint4.measureText(string) / 2.0f));
        this.f31121A = context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: e */
    private final void m11386e(ValueAnimator valueAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        valueAnimator.setInterpolator(this.f31146r);
        valueAnimator.setDuration(167L);
        valueAnimator.addUpdateListener(animatorUpdateListener);
    }

    /* JADX INFO: renamed from: f */
    private final void m11387f(ValueAnimator valueAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        valueAnimator.setInterpolator(this.f31145q);
        valueAnimator.setDuration(133L);
        valueAnimator.addUpdateListener(animatorUpdateListener);
    }

    /* JADX INFO: renamed from: a */
    public final void m11388a() {
        AnimatorSet animatorSet = this.f31128H;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f31128H.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f31135g, 0.0f);
        m11387f(valueAnimatorOfFloat, new ibw(this, 16));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        m11387f(valueAnimatorOfFloat2, new ibw(this, 17));
        ArrayList arrayList = new ArrayList();
        arrayList.add(valueAnimatorOfFloat);
        if (this.f31138j) {
            arrayList.add(valueAnimatorOfFloat2);
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f31128H = animatorSet2;
        animatorSet2.playTogether(arrayList);
        this.f31128H.addListener(new iit(this));
        this.f31128H.start();
    }

    /* JADX INFO: renamed from: b */
    public final void m11389b(int i) {
        int iMin = Math.min(100, Math.max(i, 0));
        if (iMin != 0) {
            AnimatorSet animatorSet = this.f31141m;
            if (animatorSet != null && animatorSet.isRunning()) {
                this.f31141m.cancel();
            }
            this.f31142n = 4;
            this.f31122B = (int) (iMin * 3.6f);
            invalidate();
            if (iMin == 100) {
                m11388a();
                return;
            }
            return;
        }
        AnimatorSet animatorSet2 = this.f31128H;
        if (animatorSet2 != null && animatorSet2.isRunning()) {
            this.f31128H.cancel();
        }
        this.f31122B = 0;
        AnimatorSet animatorSet3 = this.f31141m;
        if (animatorSet3 != null && animatorSet3.isRunning()) {
            this.f31141m.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f31143o, this.f31134f);
        m11386e(valueAnimatorOfInt, new ibw(this, 13));
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.f31135g);
        m11386e(valueAnimatorOfFloat, new ibw(this, 14));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        m11386e(valueAnimatorOfFloat2, new ibw(this, 15));
        ArrayList arrayList = new ArrayList();
        arrayList.add(valueAnimatorOfInt);
        arrayList.add(valueAnimatorOfFloat);
        if (this.f31138j) {
            arrayList.add(valueAnimatorOfFloat2);
        }
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f31141m = animatorSet4;
        animatorSet4.playTogether(arrayList);
        this.f31141m.addListener(new iis(this));
        this.f31141m.start();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f31142n == 1) {
            return;
        }
        if (this.f31139k) {
            canvas.drawCircle(this.f31123C, this.f31124D, this.f31132d, this.f31129a);
        }
        if (this.f31136h != -1 && this.f31140l.length() == 4) {
            canvas.drawText(this.f31147s, this.f31123C, this.f31124D + this.f31148t + this.f31153y + this.f31154z, this.f31131c);
            if (this.f31121A) {
                canvas.drawText(this.f31140l.substring(3, 4), this.f31125E + this.f31152x, this.f31124D, this.f31130b);
                canvas.drawText(this.f31140l.substring(2, 3), this.f31125E + this.f31149u + this.f31152x, this.f31124D, this.f31130b);
                canvas.drawText(":", (this.f31126F - this.f31149u) - this.f31151w, this.f31124D, this.f31130b);
                canvas.drawText(this.f31140l.substring(0, 1), this.f31126F - this.f31152x, this.f31124D, this.f31130b);
            } else {
                canvas.drawText(this.f31140l.substring(0, 1), this.f31125E + this.f31152x, this.f31124D, this.f31130b);
                canvas.drawText(":", this.f31125E + this.f31149u + this.f31151w, this.f31124D, this.f31130b);
                canvas.drawText(this.f31140l.substring(2, 3), (this.f31126F - this.f31149u) - this.f31152x, this.f31124D, this.f31130b);
                canvas.drawText(this.f31140l.substring(3, 4), this.f31126F - this.f31152x, this.f31124D, this.f31130b);
            }
        } else if (this.f31137i != -1) {
            canvas.drawText(this.f31147s, this.f31123C, this.f31124D + this.f31148t + this.f31153y + this.f31154z, this.f31131c);
            canvas.drawText(String.valueOf(this.f31137i), this.f31123C, this.f31124D, this.f31130b);
        } else if (this.f31138j) {
            canvas.drawText(this.f31147s, this.f31123C, this.f31124D + this.f31153y, this.f31131c);
            announceForAccessibility(this.f31147s);
        }
        int i = this.f31142n;
        if (i == 4 || i == 3) {
            this.f31129a.setStrokeWidth(this.f31133e);
            this.f31144p.setStrokeWidth(this.f31133e);
            RectF rectF = this.f31127G;
            int i2 = this.f31123C;
            int i3 = this.f31132d;
            int i4 = this.f31124D;
            rectF.set(i2 - i3, i4 - i3, i2 + i3, i4 + i3);
            canvas.drawArc(this.f31127G, -90.0f, this.f31122B, false, this.f31144p);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int i5 = (i3 - i) / 2;
            this.f31123C = i5;
            this.f31124D = (i4 - i2) / 2;
            float f = this.f31150v;
            float f2 = i5;
            this.f31125E = f2 - f;
            this.f31126F = f2 + f;
        }
    }
}
