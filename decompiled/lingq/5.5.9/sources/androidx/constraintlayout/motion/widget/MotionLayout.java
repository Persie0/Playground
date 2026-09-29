package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.activity.result.C0204c;
import androidx.constraintlayout.core.widgets.C0730a;
import androidx.constraintlayout.core.widgets.C0738d;
import androidx.constraintlayout.core.widgets.C0739e;
import androidx.constraintlayout.core.widgets.C0740f;
import androidx.constraintlayout.core.widgets.C0742h;
import androidx.constraintlayout.core.widgets.C0743i;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.AbstractC0761a;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.C0762b;
import androidx.constraintlayout.widget.C0763c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p038c2.AbstractC1659b;
import p038c2.C1658a;
import p038c2.C1660c;
import p038c2.C1668k;
import p061d2.C5039b;
import p061d2.C5040c;
import p061d2.InterfaceC5038a;
import p083e2.C5354b;
import p107f2.AbstractC5464c;
import p107f2.AbstractC5465d;
import p107f2.C5463b;
import p128g2.AbstractInterpolatorC5678p;
import p128g2.C5663a;
import p128g2.C5664b;
import p128g2.C5673k;
import p128g2.C5674l;
import p128g2.C5676n;
import p128g2.C5677o;
import p128g2.C5679q;
import p128g2.C5681s;
import p128g2.InterpolatorC5675m;
import p128g2.ViewOnTouchListenerC5680r;
import p143h2.C5878a;
import p143h2.C5881d;
import p143h2.C5883f;
import p290o6.C7967l0;
import p471x2.InterfaceC10056p;

/* JADX INFO: loaded from: classes.dex */
public class MotionLayout extends ConstraintLayout implements InterfaceC10056p {

    /* JADX INFO: renamed from: Z0 */
    public static boolean f5046Z0;

    /* JADX INFO: renamed from: A0 */
    public long f5047A0;

    /* JADX INFO: renamed from: B0 */
    public float f5048B0;

    /* JADX INFO: renamed from: C0 */
    public int f5049C0;

    /* JADX INFO: renamed from: D0 */
    public float f5050D0;

    /* JADX INFO: renamed from: E0 */
    public boolean f5051E0;

    /* JADX INFO: renamed from: F0 */
    public int f5052F0;

    /* JADX INFO: renamed from: G0 */
    public int f5053G0;

    /* JADX INFO: renamed from: H0 */
    public int f5054H0;

    /* JADX INFO: renamed from: I0 */
    public int f5055I0;

    /* JADX INFO: renamed from: J0 */
    public int f5056J0;

    /* JADX INFO: renamed from: K0 */
    public int f5057K0;

    /* JADX INFO: renamed from: L */
    public C0753a f5058L;

    /* JADX INFO: renamed from: L0 */
    public float f5059L0;

    /* JADX INFO: renamed from: M */
    public AbstractInterpolatorC5678p f5060M;

    /* JADX INFO: renamed from: M0 */
    public final C7967l0 f5061M0;

    /* JADX INFO: renamed from: N */
    public Interpolator f5062N;

    /* JADX INFO: renamed from: N0 */
    public boolean f5063N0;

    /* JADX INFO: renamed from: O */
    public float f5064O;

    /* JADX INFO: renamed from: O0 */
    public C0751h f5065O0;

    /* JADX INFO: renamed from: P */
    public int f5066P;

    /* JADX INFO: renamed from: P0 */
    public Runnable f5067P0;

    /* JADX INFO: renamed from: Q */
    public int f5068Q;

    /* JADX INFO: renamed from: Q0 */
    public final Rect f5069Q0;

    /* JADX INFO: renamed from: R */
    public int f5070R;

    /* JADX INFO: renamed from: R0 */
    public boolean f5071R0;

    /* JADX INFO: renamed from: S */
    public int f5072S;

    /* JADX INFO: renamed from: S0 */
    public TransitionState f5073S0;

    /* JADX INFO: renamed from: T */
    public int f5074T;

    /* JADX INFO: renamed from: T0 */
    public final C0749f f5075T0;

    /* JADX INFO: renamed from: U */
    public boolean f5076U;

    /* JADX INFO: renamed from: U0 */
    public boolean f5077U0;

    /* JADX INFO: renamed from: V */
    public final HashMap<View, C5676n> f5078V;

    /* JADX INFO: renamed from: V0 */
    public final RectF f5079V0;

    /* JADX INFO: renamed from: W */
    public long f5080W;

    /* JADX INFO: renamed from: W0 */
    public View f5081W0;

    /* JADX INFO: renamed from: X0 */
    public Matrix f5082X0;

    /* JADX INFO: renamed from: Y0 */
    public final ArrayList<Integer> f5083Y0;

    /* JADX INFO: renamed from: a0 */
    public float f5084a0;

    /* JADX INFO: renamed from: b0 */
    public float f5085b0;

    /* JADX INFO: renamed from: c0 */
    public float f5086c0;

    /* JADX INFO: renamed from: d0 */
    public long f5087d0;

    /* JADX INFO: renamed from: e0 */
    public float f5088e0;

    /* JADX INFO: renamed from: f0 */
    public boolean f5089f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f5090g0;

    /* JADX INFO: renamed from: h0 */
    public InterfaceC0752i f5091h0;

    /* JADX INFO: renamed from: i0 */
    public int f5092i0;

    /* JADX INFO: renamed from: j0 */
    public C0748e f5093j0;

    /* JADX INFO: renamed from: k0 */
    public boolean f5094k0;

    /* JADX INFO: renamed from: l0 */
    public final C5463b f5095l0;

    /* JADX INFO: renamed from: m0 */
    public final C0747d f5096m0;

    /* JADX INFO: renamed from: n0 */
    public C5664b f5097n0;

    /* JADX INFO: renamed from: o0 */
    public int f5098o0;

    /* JADX INFO: renamed from: p0 */
    public int f5099p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f5100q0;

    /* JADX INFO: renamed from: r0 */
    public float f5101r0;

    /* JADX INFO: renamed from: s0 */
    public float f5102s0;

    /* JADX INFO: renamed from: t0 */
    public long f5103t0;

    /* JADX INFO: renamed from: u0 */
    public float f5104u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f5105v0;

    /* JADX INFO: renamed from: w0 */
    public ArrayList<C5677o> f5106w0;

    /* JADX INFO: renamed from: x0 */
    public ArrayList<C5677o> f5107x0;

    /* JADX INFO: renamed from: y0 */
    public CopyOnWriteArrayList<InterfaceC0752i> f5108y0;

    /* JADX INFO: renamed from: z0 */
    public int f5109z0;

    public enum TransitionState {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.MotionLayout$a */
    public class RunnableC0744a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f5110a;

        public RunnableC0744a(View view) {
            this.f5110a = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f5110a.setNestedScrollingEnabled(true);
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.MotionLayout$b */
    public class RunnableC0745b implements Runnable {
        public RunnableC0745b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            MotionLayout.this.f5065O0.m2824a();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.MotionLayout$c */
    public static /* synthetic */ class C0746c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5112a;

        static {
            int[] iArr = new int[TransitionState.values().length];
            f5112a = iArr;
            try {
                iArr[TransitionState.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5112a[TransitionState.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5112a[TransitionState.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5112a[TransitionState.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.MotionLayout$d */
    public class C0747d extends AbstractInterpolatorC5678p {

        /* JADX INFO: renamed from: a */
        public float f5113a = 0.0f;

        /* JADX INFO: renamed from: b */
        public float f5114b = 0.0f;

        /* JADX INFO: renamed from: c */
        public float f5115c;

        public C0747d() {
        }

        @Override // p128g2.AbstractInterpolatorC5678p
        /* JADX INFO: renamed from: a */
        public final float mo2810a() {
            return MotionLayout.this.f5064O;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f3) {
            float f10 = this.f5113a;
            MotionLayout motionLayout = MotionLayout.this;
            if (f10 > 0.0f) {
                float f11 = this.f5115c;
                if (f10 / f11 < f3) {
                    f3 = f10 / f11;
                }
                motionLayout.f5064O = f10 - (f11 * f3);
                return ((f10 * f3) - (((f11 * f3) * f3) / 2.0f)) + this.f5114b;
            }
            float f12 = this.f5115c;
            if ((-f10) / f12 < f3) {
                f3 = (-f10) / f12;
            }
            motionLayout.f5064O = (f12 * f3) + f10;
            return (((f12 * f3) * f3) / 2.0f) + (f10 * f3) + this.f5114b;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.MotionLayout$e */
    public class C0748e {

        /* JADX INFO: renamed from: a */
        public float[] f5117a;

        /* JADX INFO: renamed from: b */
        public final int[] f5118b;

        /* JADX INFO: renamed from: c */
        public final float[] f5119c;

        /* JADX INFO: renamed from: d */
        public Path f5120d;

        /* JADX INFO: renamed from: e */
        public final Paint f5121e;

        /* JADX INFO: renamed from: f */
        public final Paint f5122f;

        /* JADX INFO: renamed from: g */
        public final Paint f5123g;

        /* JADX INFO: renamed from: h */
        public final Paint f5124h;

        /* JADX INFO: renamed from: i */
        public final Paint f5125i;

        /* JADX INFO: renamed from: j */
        public final float[] f5126j;

        /* JADX INFO: renamed from: k */
        public int f5127k;

        /* JADX INFO: renamed from: l */
        public final Rect f5128l = new Rect();

        /* JADX INFO: renamed from: m */
        public final int f5129m = 1;

        public C0748e() {
            Paint paint = new Paint();
            this.f5121e = paint;
            paint.setAntiAlias(true);
            paint.setColor(-21965);
            paint.setStrokeWidth(2.0f);
            paint.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.f5122f = paint2;
            paint2.setAntiAlias(true);
            paint2.setColor(-2067046);
            paint2.setStrokeWidth(2.0f);
            paint2.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.f5123g = paint3;
            paint3.setAntiAlias(true);
            paint3.setColor(-13391360);
            paint3.setStrokeWidth(2.0f);
            paint3.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.f5124h = paint4;
            paint4.setAntiAlias(true);
            paint4.setColor(-13391360);
            paint4.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f5126j = new float[8];
            Paint paint5 = new Paint();
            this.f5125i = paint5;
            paint5.setAntiAlias(true);
            paint3.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f));
            this.f5119c = new float[100];
            this.f5118b = new int[50];
        }

        /* JADX INFO: renamed from: a */
        public final void m2811a(Canvas canvas, int i10, int i11, C5676n c5676n) {
            int width;
            int height;
            Paint paint = this.f5123g;
            int[] iArr = this.f5118b;
            int i12 = 4;
            if (i10 == 4) {
                boolean z10 = false;
                boolean z11 = false;
                for (int i13 = 0; i13 < this.f5127k; i13++) {
                    int i14 = iArr[i13];
                    if (i14 == 1) {
                        z10 = true;
                    }
                    if (i14 == 0) {
                        z11 = true;
                    }
                }
                if (z10) {
                    float[] fArr = this.f5117a;
                    canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], paint);
                }
                if (z11) {
                    m2812b(canvas);
                }
            }
            if (i10 == 2) {
                float[] fArr2 = this.f5117a;
                canvas.drawLine(fArr2[0], fArr2[1], fArr2[fArr2.length - 2], fArr2[fArr2.length - 1], paint);
            }
            if (i10 == 3) {
                m2812b(canvas);
            }
            canvas.drawLines(this.f5117a, this.f5121e);
            View view = c5676n.f34616b;
            if (view != null) {
                width = view.getWidth();
                height = c5676n.f34616b.getHeight();
            } else {
                width = 0;
                height = 0;
            }
            int i15 = 1;
            while (i15 < i11 - 1) {
                if (i10 == i12 && iArr[i15 - 1] == 0) {
                    i15 = i15;
                } else {
                    int i16 = i15 * 2;
                    float[] fArr3 = this.f5119c;
                    float f3 = fArr3[i16];
                    float f10 = fArr3[i16 + 1];
                    this.f5120d.reset();
                    this.f5120d.moveTo(f3, f10 + 10.0f);
                    this.f5120d.lineTo(f3 + 10.0f, f10);
                    this.f5120d.lineTo(f3, f10 - 10.0f);
                    this.f5120d.lineTo(f3 - 10.0f, f10);
                    this.f5120d.close();
                    int i17 = i15 - 1;
                    c5676n.f34635u.get(i17);
                    Paint paint2 = this.f5125i;
                    if (i10 == i12) {
                        int i18 = iArr[i17];
                        if (i18 == 1) {
                            m2814d(canvas, f3 - 0.0f, f10 - 0.0f);
                        } else if (i18 == 0) {
                            m2813c(canvas, f3 - 0.0f, f10 - 0.0f);
                        } else {
                            if (i18 == 2) {
                                m2815e(canvas, f3 - 0.0f, f10 - 0.0f, width, height);
                            }
                            canvas.drawPath(this.f5120d, paint2);
                        }
                        canvas.drawPath(this.f5120d, paint2);
                    } else {
                        paint2 = paint2;
                        f10 = f10;
                        f3 = f3;
                        i15 = i15;
                    }
                    if (i10 == 2) {
                        m2814d(canvas, f3 - 0.0f, f10 - 0.0f);
                    }
                    if (i10 == 3) {
                        m2813c(canvas, f3 - 0.0f, f10 - 0.0f);
                    }
                    if (i10 == 6) {
                        m2815e(canvas, f3 - 0.0f, f10 - 0.0f, width, height);
                    }
                    canvas.drawPath(this.f5120d, paint2);
                }
                i15++;
                i12 = 4;
            }
            float[] fArr4 = this.f5117a;
            if (fArr4.length > 1) {
                float f11 = fArr4[0];
                float f12 = fArr4[1];
                Paint paint3 = this.f5122f;
                canvas.drawCircle(f11, f12, 8.0f, paint3);
                float[] fArr5 = this.f5117a;
                canvas.drawCircle(fArr5[fArr5.length - 2], fArr5[fArr5.length - 1], 8.0f, paint3);
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m2812b(Canvas canvas) {
            float[] fArr = this.f5117a;
            float f3 = fArr[0];
            float f10 = fArr[1];
            float f11 = fArr[fArr.length - 2];
            float f12 = fArr[fArr.length - 1];
            float fMin = Math.min(f3, f11);
            float fMax = Math.max(f10, f12);
            float fMax2 = Math.max(f3, f11);
            float fMax3 = Math.max(f10, f12);
            Paint paint = this.f5123g;
            canvas.drawLine(fMin, fMax, fMax2, fMax3, paint);
            canvas.drawLine(Math.min(f3, f11), Math.min(f10, f12), Math.min(f3, f11), Math.max(f10, f12), paint);
        }

        /* JADX INFO: renamed from: c */
        public final void m2813c(Canvas canvas, float f3, float f10) {
            float[] fArr = this.f5117a;
            float f11 = fArr[0];
            float f12 = fArr[1];
            float f13 = fArr[fArr.length - 2];
            float f14 = fArr[fArr.length - 1];
            float fMin = Math.min(f11, f13);
            float fMax = Math.max(f12, f14);
            float fMin2 = f3 - Math.min(f11, f13);
            float fMax2 = Math.max(f12, f14) - f10;
            String str = "" + (((int) (((double) ((fMin2 * 100.0f) / Math.abs(f13 - f11))) + 0.5d)) / 100.0f);
            Paint paint = this.f5124h;
            m2816f(paint, str);
            Rect rect = this.f5128l;
            canvas.drawText(str, ((fMin2 / 2.0f) - (rect.width() / 2)) + fMin, f10 - 20.0f, paint);
            float fMin3 = Math.min(f11, f13);
            Paint paint2 = this.f5123g;
            canvas.drawLine(f3, f10, fMin3, f10, paint2);
            String str2 = "" + (((int) (((double) ((fMax2 * 100.0f) / Math.abs(f14 - f12))) + 0.5d)) / 100.0f);
            m2816f(paint, str2);
            canvas.drawText(str2, f3 + 5.0f, fMax - ((fMax2 / 2.0f) - (rect.height() / 2)), paint);
            canvas.drawLine(f3, f10, f3, Math.max(f12, f14), paint2);
        }

        /* JADX INFO: renamed from: d */
        public final void m2814d(Canvas canvas, float f3, float f10) {
            float[] fArr = this.f5117a;
            float f11 = fArr[0];
            float f12 = fArr[1];
            float f13 = fArr[fArr.length - 2];
            float f14 = fArr[fArr.length - 1];
            float fHypot = (float) Math.hypot(f11 - f13, f12 - f14);
            float f15 = f13 - f11;
            float f16 = f14 - f12;
            float f17 = (((f10 - f12) * f16) + ((f3 - f11) * f15)) / (fHypot * fHypot);
            float f18 = f11 + (f15 * f17);
            float f19 = f12 + (f17 * f16);
            Path path = new Path();
            path.moveTo(f3, f10);
            path.lineTo(f18, f19);
            float fHypot2 = (float) Math.hypot(f18 - f3, f19 - f10);
            String str = "" + (((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
            Paint paint = this.f5124h;
            m2816f(paint, str);
            canvas.drawTextOnPath(str, path, (fHypot2 / 2.0f) - (this.f5128l.width() / 2), -20.0f, paint);
            canvas.drawLine(f3, f10, f18, f19, this.f5123g);
        }

        /* JADX INFO: renamed from: e */
        public final void m2815e(Canvas canvas, float f3, float f10, int i10, int i11) {
            StringBuilder sb2 = new StringBuilder("");
            MotionLayout motionLayout = MotionLayout.this;
            sb2.append(((int) (((double) (((f3 - (i10 / 2)) * 100.0f) / (motionLayout.getWidth() - i10))) + 0.5d)) / 100.0f);
            String string = sb2.toString();
            Paint paint = this.f5124h;
            m2816f(paint, string);
            Rect rect = this.f5128l;
            canvas.drawText(string, ((f3 / 2.0f) - (rect.width() / 2)) + 0.0f, f10 - 20.0f, paint);
            float fMin = Math.min(0.0f, 1.0f);
            Paint paint2 = this.f5123g;
            canvas.drawLine(f3, f10, fMin, f10, paint2);
            String str = "" + (((int) (((double) (((f10 - (i11 / 2)) * 100.0f) / (motionLayout.getHeight() - i11))) + 0.5d)) / 100.0f);
            m2816f(paint, str);
            canvas.drawText(str, f3 + 5.0f, 0.0f - ((f10 / 2.0f) - (rect.height() / 2)), paint);
            canvas.drawLine(f3, f10, f3, Math.max(0.0f, 1.0f), paint2);
        }

        /* JADX INFO: renamed from: f */
        public final void m2816f(Paint paint, String str) {
            paint.getTextBounds(str, 0, str.length(), this.f5128l);
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.MotionLayout$f */
    public class C0749f {

        /* JADX INFO: renamed from: a */
        public C0738d f5131a = new C0738d();

        /* JADX INFO: renamed from: b */
        public C0738d f5132b = new C0738d();

        /* JADX INFO: renamed from: c */
        public C0762b f5133c = null;

        /* JADX INFO: renamed from: d */
        public C0762b f5134d = null;

        /* JADX INFO: renamed from: e */
        public int f5135e;

        /* JADX INFO: renamed from: f */
        public int f5136f;

        public C0749f() {
        }

        /* JADX INFO: renamed from: c */
        public static void m2817c(C0738d c0738d, C0738d c0738d2) {
            ConstraintWidget c5039b;
            ArrayList<ConstraintWidget> arrayList = c0738d.f32872w0;
            HashMap<ConstraintWidget, ConstraintWidget> map = new HashMap<>();
            map.put(c0738d, c0738d2);
            c0738d2.f32872w0.clear();
            c0738d2.mo2726j(c0738d, map);
            for (ConstraintWidget constraintWidget : arrayList) {
                if (constraintWidget instanceof C0730a) {
                    c5039b = new C0730a();
                } else if (constraintWidget instanceof C0740f) {
                    c5039b = new C0740f();
                } else if (constraintWidget instanceof C0739e) {
                    c5039b = new C0739e();
                } else if (constraintWidget instanceof C0742h) {
                    c5039b = new C0742h();
                } else {
                    c5039b = constraintWidget instanceof InterfaceC5038a ? new C5039b() : new ConstraintWidget();
                }
                c0738d2.f32872w0.add(c5039b);
                ConstraintWidget constraintWidget2 = c5039b.f4858W;
                if (constraintWidget2 != null) {
                    ((C5040c) constraintWidget2).f32872w0.remove(c5039b);
                    c5039b.mo2708G();
                }
                c5039b.f4858W = c0738d2;
                map.put(constraintWidget, c5039b);
            }
            for (ConstraintWidget constraintWidget3 : arrayList) {
                map.get(constraintWidget3).mo2726j(constraintWidget3, map);
            }
        }

        /* JADX INFO: renamed from: d */
        public static ConstraintWidget m2818d(C0738d c0738d, View view) {
            if (c0738d.f4879i0 == view) {
                return c0738d;
            }
            ArrayList<ConstraintWidget> arrayList = c0738d.f32872w0;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ConstraintWidget constraintWidget = arrayList.get(i10);
                if (constraintWidget.f4879i0 == view) {
                    return constraintWidget;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: a */
        public final void m2819a() {
            int i10;
            HashMap<View, C5676n> map;
            SparseArray sparseArray;
            int[] iArr;
            int i11;
            Rect rect;
            Rect rect2;
            Interpolator interpolatorLoadInterpolator;
            MotionLayout motionLayout = MotionLayout.this;
            int childCount = motionLayout.getChildCount();
            HashMap<View, C5676n> map2 = motionLayout.f5078V;
            map2.clear();
            SparseArray sparseArray2 = new SparseArray();
            int[] iArr2 = new int[childCount];
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = motionLayout.getChildAt(i12);
                C5676n c5676n = new C5676n(childAt);
                int id2 = childAt.getId();
                iArr2[i12] = id2;
                sparseArray2.put(id2, c5676n);
                map2.put(childAt, c5676n);
            }
            int i13 = 0;
            while (i13 < childCount) {
                View childAt2 = motionLayout.getChildAt(i13);
                C5676n c5676n2 = map2.get(childAt2);
                if (c5676n2 == null) {
                    i10 = childCount;
                    map = map2;
                    sparseArray = sparseArray2;
                    iArr = iArr2;
                    i11 = i13;
                } else {
                    C0762b c0762b = this.f5133c;
                    Rect rect3 = c5676n2.f34615a;
                    if (c0762b != null) {
                        ConstraintWidget constraintWidgetM2818d = m2818d(this.f5131a, childAt2);
                        if (constraintWidgetM2818d != null) {
                            Rect rectM2788s = MotionLayout.m2788s(motionLayout, constraintWidgetM2818d);
                            C0762b c0762b2 = this.f5133c;
                            map = map2;
                            int width = motionLayout.getWidth();
                            sparseArray = sparseArray2;
                            int height = motionLayout.getHeight();
                            iArr = iArr2;
                            int i14 = c0762b2.f5379c;
                            if (i14 != 0) {
                                C5676n.m12039e(i14, width, height, rectM2788s, rect3);
                            }
                            C5679q c5679q = c5676n2.f34620f;
                            c5679q.f34653c = 0.0f;
                            c5679q.f34654d = 0.0f;
                            c5676n2.m12043d(c5679q);
                            i10 = childCount;
                            i11 = i13;
                            rect = rect3;
                            c5679q.m12049i(rectM2788s.left, rectM2788s.top, rectM2788s.width(), rectM2788s.height());
                            C0762b.a aVarM2895i = c0762b2.m2895i(c5676n2.f34617c);
                            c5679q.m12047a(aVarM2895i);
                            C0762b.c cVar = aVarM2895i.f5386d;
                            c5676n2.f34626l = cVar.f5479g;
                            c5676n2.f34622h.m12038i(rectM2788s, c0762b2, i14, c5676n2.f34617c);
                            c5676n2.f34609C = aVarM2895i.f5388f.f5500i;
                            c5676n2.f34611E = cVar.f5482j;
                            c5676n2.f34612F = cVar.f5481i;
                            Context context = c5676n2.f34616b.getContext();
                            int i15 = cVar.f5484l;
                            String str = cVar.f5483k;
                            int i16 = cVar.f5485m;
                            if (i15 == -2) {
                                interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, i16);
                            } else if (i15 == -1) {
                                interpolatorLoadInterpolator = new InterpolatorC5675m(C1660c.m5383c(str));
                            } else if (i15 == 0) {
                                interpolatorLoadInterpolator = new AccelerateDecelerateInterpolator();
                            } else if (i15 == 1) {
                                interpolatorLoadInterpolator = new AccelerateInterpolator();
                            } else if (i15 == 2) {
                                interpolatorLoadInterpolator = new DecelerateInterpolator();
                            } else if (i15 != 4) {
                                interpolatorLoadInterpolator = i15 != 5 ? null : new OvershootInterpolator();
                            } else {
                                interpolatorLoadInterpolator = new BounceInterpolator();
                            }
                            c5676n2.f34613G = interpolatorLoadInterpolator;
                        } else {
                            i10 = childCount;
                            map = map2;
                            sparseArray = sparseArray2;
                            iArr = iArr2;
                            i11 = i13;
                            rect = rect3;
                            if (motionLayout.f5092i0 != 0) {
                                Log.e("MotionLayout", C5663a.m12019b() + "no widget for  " + C5663a.m12021d(childAt2) + " (" + childAt2.getClass().getName() + ")");
                            }
                        }
                    } else {
                        i10 = childCount;
                        map = map2;
                        sparseArray = sparseArray2;
                        iArr = iArr2;
                        i11 = i13;
                        rect = rect3;
                    }
                    if (this.f5134d != null) {
                        ConstraintWidget constraintWidgetM2818d2 = m2818d(this.f5132b, childAt2);
                        if (constraintWidgetM2818d2 != null) {
                            Rect rectM2788s2 = MotionLayout.m2788s(motionLayout, constraintWidgetM2818d2);
                            C0762b c0762b3 = this.f5134d;
                            int width2 = motionLayout.getWidth();
                            int height2 = motionLayout.getHeight();
                            int i17 = c0762b3.f5379c;
                            if (i17 != 0) {
                                Rect rect4 = rect;
                                C5676n.m12039e(i17, width2, height2, rectM2788s2, rect4);
                                rect2 = rect4;
                            } else {
                                rect2 = rectM2788s2;
                            }
                            C5679q c5679q2 = c5676n2.f34621g;
                            c5679q2.f34653c = 1.0f;
                            c5679q2.f34654d = 1.0f;
                            c5676n2.m12043d(c5679q2);
                            c5679q2.m12049i(rect2.left, rect2.top, rect2.width(), rect2.height());
                            c5679q2.m12047a(c0762b3.m2895i(c5676n2.f34617c));
                            c5676n2.f34623i.m12038i(rect2, c0762b3, i17, c5676n2.f34617c);
                        } else if (motionLayout.f5092i0 != 0) {
                            Log.e("MotionLayout", C5663a.m12019b() + "no widget for  " + C5663a.m12021d(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                }
                i13 = i11 + 1;
                map2 = map;
                sparseArray2 = sparseArray;
                iArr2 = iArr;
                childCount = i10;
            }
            SparseArray sparseArray3 = sparseArray2;
            int[] iArr3 = iArr2;
            int i18 = childCount;
            int i19 = 0;
            while (i19 < i18) {
                SparseArray sparseArray4 = sparseArray3;
                C5676n c5676n3 = (C5676n) sparseArray4.get(iArr3[i19]);
                int i20 = c5676n3.f34620f.f34661k;
                if (i20 != -1) {
                    C5676n c5676n4 = (C5676n) sparseArray4.get(i20);
                    c5676n3.f34620f.m12050m(c5676n4, c5676n4.f34620f);
                    c5676n3.f34621g.m12050m(c5676n4, c5676n4.f34621g);
                }
                i19++;
                sparseArray3 = sparseArray4;
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m2820b(int i10, int i11) {
            MotionLayout motionLayout = MotionLayout.this;
            int optimizationLevel = motionLayout.getOptimizationLevel();
            if (motionLayout.f5068Q == motionLayout.getStartState()) {
                C0738d c0738d = this.f5132b;
                C0762b c0762b = this.f5134d;
                motionLayout.m2868p(c0738d, optimizationLevel, (c0762b == null || c0762b.f5379c == 0) ? i10 : i11, (c0762b == null || c0762b.f5379c == 0) ? i11 : i10);
                C0762b c0762b2 = this.f5133c;
                if (c0762b2 != null) {
                    C0738d c0738d2 = this.f5131a;
                    int i12 = c0762b2.f5379c;
                    int i13 = i12 == 0 ? i10 : i11;
                    if (i12 == 0) {
                        i10 = i11;
                    }
                    motionLayout.m2868p(c0738d2, optimizationLevel, i13, i10);
                    return;
                }
                return;
            }
            C0762b c0762b3 = this.f5133c;
            if (c0762b3 != null) {
                C0738d c0738d3 = this.f5131a;
                int i14 = c0762b3.f5379c;
                motionLayout.m2868p(c0738d3, optimizationLevel, i14 == 0 ? i10 : i11, i14 == 0 ? i11 : i10);
            }
            C0738d c0738d4 = this.f5132b;
            C0762b c0762b4 = this.f5134d;
            int i15 = (c0762b4 == null || c0762b4.f5379c == 0) ? i10 : i11;
            if (c0762b4 == null || c0762b4.f5379c == 0) {
                i10 = i11;
            }
            motionLayout.m2868p(c0738d4, optimizationLevel, i15, i10);
        }

        /* JADX INFO: renamed from: e */
        public final void m2821e(C0762b c0762b, C0762b c0762b2) {
            this.f5133c = c0762b;
            this.f5134d = c0762b2;
            this.f5131a = new C0738d();
            C0738d c0738d = new C0738d();
            this.f5132b = c0738d;
            C0738d c0738d2 = this.f5131a;
            MotionLayout motionLayout = MotionLayout.this;
            C0738d c0738d3 = motionLayout.f5276c;
            C5354b.b bVar = c0738d3.f4962A0;
            c0738d2.f4962A0 = bVar;
            c0738d2.f4981y0.f33678f = bVar;
            C5354b.b bVar2 = c0738d3.f4962A0;
            c0738d.f4962A0 = bVar2;
            c0738d.f4981y0.f33678f = bVar2;
            c0738d2.f32872w0.clear();
            this.f5132b.f32872w0.clear();
            C0738d c0738d4 = this.f5131a;
            C0738d c0738d5 = motionLayout.f5276c;
            m2817c(c0738d5, c0738d4);
            m2817c(c0738d5, this.f5132b);
            if (motionLayout.f5086c0 > 0.5d) {
                if (c0762b != null) {
                    m2823g(this.f5131a, c0762b);
                }
                m2823g(this.f5132b, c0762b2);
            } else {
                m2823g(this.f5132b, c0762b2);
                if (c0762b != null) {
                    m2823g(this.f5131a, c0762b);
                }
            }
            this.f5131a.f4963B0 = motionLayout.m2866h();
            C0738d c0738d6 = this.f5131a;
            c0738d6.f4980x0.m11479c(c0738d6);
            this.f5132b.f4963B0 = motionLayout.m2866h();
            C0738d c0738d7 = this.f5132b;
            c0738d7.f4980x0.m11479c(c0738d7);
            ViewGroup.LayoutParams layoutParams = motionLayout.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    C0738d c0738d8 = this.f5131a;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    c0738d8.m2715P(dimensionBehaviour);
                    this.f5132b.m2715P(dimensionBehaviour);
                }
                if (layoutParams.height == -2) {
                    C0738d c0738d9 = this.f5131a;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    c0738d9.m2716Q(dimensionBehaviour2);
                    this.f5132b.m2716Q(dimensionBehaviour2);
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public final void m2822f() {
            HashMap<View, C5676n> map;
            MotionLayout motionLayout = MotionLayout.this;
            int i10 = motionLayout.f5072S;
            int i11 = motionLayout.f5074T;
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            motionLayout.f5056J0 = mode;
            motionLayout.f5057K0 = mode2;
            motionLayout.getOptimizationLevel();
            m2820b(i10, i11);
            int i12 = 0;
            boolean z10 = true;
            if (((motionLayout.getParent() instanceof MotionLayout) && mode == 1073741824 && mode2 == 1073741824) ? false : true) {
                m2820b(i10, i11);
                motionLayout.f5052F0 = this.f5131a.m2735u();
                motionLayout.f5053G0 = this.f5131a.m2731o();
                motionLayout.f5054H0 = this.f5132b.m2735u();
                int iM2731o = this.f5132b.m2731o();
                motionLayout.f5055I0 = iM2731o;
                motionLayout.f5051E0 = (motionLayout.f5052F0 == motionLayout.f5054H0 && motionLayout.f5053G0 == iM2731o) ? false : true;
            }
            int i13 = motionLayout.f5052F0;
            int i14 = motionLayout.f5053G0;
            int i15 = motionLayout.f5056J0;
            if (i15 == Integer.MIN_VALUE || i15 == 0) {
                i13 = (int) ((motionLayout.f5059L0 * (motionLayout.f5054H0 - i13)) + i13);
            }
            int i16 = i13;
            int i17 = motionLayout.f5057K0;
            int i18 = (i17 == Integer.MIN_VALUE || i17 == 0) ? (int) ((motionLayout.f5059L0 * (motionLayout.f5055I0 - i14)) + i14) : i14;
            C0738d c0738d = this.f5131a;
            motionLayout.m2867j(i10, i11, i16, i18, c0738d.f4972K0 || this.f5132b.f4972K0, c0738d.f4973L0 || this.f5132b.f4973L0);
            int childCount = motionLayout.getChildCount();
            motionLayout.f5075T0.m2819a();
            motionLayout.f5090g0 = true;
            SparseArray sparseArray = new SparseArray();
            int i19 = 0;
            while (true) {
                map = motionLayout.f5078V;
                if (i19 >= childCount) {
                    break;
                }
                View childAt = motionLayout.getChildAt(i19);
                sparseArray.put(childAt.getId(), map.get(childAt));
                i19++;
            }
            int width = motionLayout.getWidth();
            int height = motionLayout.getHeight();
            C0753a.b bVar = motionLayout.f5058L.f5147c;
            int i20 = bVar != null ? bVar.f5180p : -1;
            if (i20 != -1) {
                for (int i21 = 0; i21 < childCount; i21++) {
                    C5676n c5676n = map.get(motionLayout.getChildAt(i21));
                    if (c5676n != null) {
                        c5676n.f34608B = i20;
                    }
                }
            }
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = new int[map.size()];
            int i22 = 0;
            for (int i23 = 0; i23 < childCount; i23++) {
                C5676n c5676n2 = map.get(motionLayout.getChildAt(i23));
                int i24 = c5676n2.f34620f.f34661k;
                if (i24 != -1) {
                    sparseBooleanArray.put(i24, true);
                    iArr[i22] = c5676n2.f34620f.f34661k;
                    i22++;
                }
            }
            for (int i25 = 0; i25 < i22; i25++) {
                C5676n c5676n3 = map.get(motionLayout.findViewById(iArr[i25]));
                if (c5676n3 != null) {
                    motionLayout.f5058L.m2833e(c5676n3);
                    c5676n3.m12044f(width, height, motionLayout.getNanoTime());
                }
            }
            for (int i26 = 0; i26 < childCount; i26++) {
                View childAt2 = motionLayout.getChildAt(i26);
                C5676n c5676n4 = map.get(childAt2);
                if (!sparseBooleanArray.get(childAt2.getId())) {
                    if (c5676n4 != null) {
                        motionLayout.f5058L.m2833e(c5676n4);
                        c5676n4.m12044f(width, height, motionLayout.getNanoTime());
                    }
                }
            }
            C0753a.b bVar2 = motionLayout.f5058L.f5147c;
            float f3 = bVar2 != null ? bVar2.f5173i : 0.0f;
            if (f3 != 0.0f) {
                boolean z11 = ((double) f3) < 0.0d;
                float fAbs = Math.abs(f3);
                float fMax = -3.4028235E38f;
                float fMin = Float.MAX_VALUE;
                float fMax2 = -3.4028235E38f;
                float fMin2 = Float.MAX_VALUE;
                int i27 = 0;
                while (true) {
                    if (i27 >= childCount) {
                        z10 = false;
                        break;
                    }
                    C5676n c5676n5 = map.get(motionLayout.getChildAt(i27));
                    if (!Float.isNaN(c5676n5.f34626l)) {
                        break;
                    }
                    C5679q c5679q = c5676n5.f34621g;
                    float f10 = c5679q.f34655e;
                    float f11 = c5679q.f34656f;
                    float f12 = z11 ? f11 - f10 : f11 + f10;
                    fMin2 = Math.min(fMin2, f12);
                    fMax2 = Math.max(fMax2, f12);
                    i27++;
                }
                if (!z10) {
                    while (i12 < childCount) {
                        C5676n c5676n6 = map.get(motionLayout.getChildAt(i12));
                        C5679q c5679q2 = c5676n6.f34621g;
                        float f13 = c5679q2.f34655e;
                        float f14 = c5679q2.f34656f;
                        float f15 = z11 ? f14 - f13 : f14 + f13;
                        c5676n6.f34628n = 1.0f / (1.0f - fAbs);
                        c5676n6.f34627m = fAbs - (((f15 - fMin2) * fAbs) / (fMax2 - fMin2));
                        i12++;
                    }
                    return;
                }
                for (int i28 = 0; i28 < childCount; i28++) {
                    C5676n c5676n7 = map.get(motionLayout.getChildAt(i28));
                    if (!Float.isNaN(c5676n7.f34626l)) {
                        fMin = Math.min(fMin, c5676n7.f34626l);
                        fMax = Math.max(fMax, c5676n7.f34626l);
                    }
                }
                while (i12 < childCount) {
                    C5676n c5676n8 = map.get(motionLayout.getChildAt(i12));
                    if (!Float.isNaN(c5676n8.f34626l)) {
                        c5676n8.f34628n = 1.0f / (1.0f - fAbs);
                        if (z11) {
                            c5676n8.f34627m = fAbs - (((fMax - c5676n8.f34626l) / (fMax - fMin)) * fAbs);
                        } else {
                            c5676n8.f34627m = fAbs - (((c5676n8.f34626l - fMin) * fAbs) / (fMax - fMin));
                        }
                    }
                    i12++;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: g */
        public final void m2823g(C0738d c0738d, C0762b c0762b) {
            C0762b.a aVar;
            C0762b.a aVar2;
            SparseArray<ConstraintWidget> sparseArray = new SparseArray<>();
            C0763c.a aVar3 = new C0763c.a();
            sparseArray.clear();
            sparseArray.put(0, c0738d);
            MotionLayout motionLayout = MotionLayout.this;
            sparseArray.put(motionLayout.getId(), c0738d);
            if (c0762b != null && c0762b.f5379c != 0) {
                motionLayout.m2868p(this.f5132b, motionLayout.getOptimizationLevel(), View.MeasureSpec.makeMeasureSpec(motionLayout.getHeight(), 1073741824), View.MeasureSpec.makeMeasureSpec(motionLayout.getWidth(), 1073741824));
            }
            for (ConstraintWidget constraintWidget : c0738d.f32872w0) {
                constraintWidget.f4883k0 = true;
                sparseArray.put(((View) constraintWidget.f4879i0).getId(), constraintWidget);
            }
            for (ConstraintWidget constraintWidget2 : c0738d.f32872w0) {
                View view = (View) constraintWidget2.f4879i0;
                int id2 = view.getId();
                HashMap<Integer, C0762b.a> map = c0762b.f5382f;
                if (map.containsKey(Integer.valueOf(id2)) && (aVar2 = map.get(Integer.valueOf(id2))) != null) {
                    aVar2.m2900a(aVar3);
                }
                constraintWidget2.m2717R(c0762b.m2895i(view.getId()).f5387e.f5434c);
                constraintWidget2.m2714O(c0762b.m2895i(view.getId()).f5387e.f5436d);
                if (view instanceof AbstractC0761a) {
                    AbstractC0761a abstractC0761a = (AbstractC0761a) view;
                    int id3 = abstractC0761a.getId();
                    HashMap<Integer, C0762b.a> map2 = c0762b.f5382f;
                    if (map2.containsKey(Integer.valueOf(id3)) && (aVar = map2.get(Integer.valueOf(id3))) != null && (constraintWidget2 instanceof C5039b)) {
                        abstractC0761a.mo2785m(aVar, (C5039b) constraintWidget2, aVar3, sparseArray);
                    }
                    if (view instanceof Barrier) {
                        ((Barrier) view).m2881o();
                    }
                }
                aVar3.resolveLayoutDirection(motionLayout.getLayoutDirection());
                MotionLayout.this.m2862c(false, view, constraintWidget2, aVar3, sparseArray);
                if (c0762b.m2895i(view.getId()).f5385c.f5488c == 1) {
                    constraintWidget2.f4881j0 = view.getVisibility();
                } else {
                    constraintWidget2.f4881j0 = c0762b.m2895i(view.getId()).f5385c.f5487b;
                }
            }
            for (ConstraintWidget constraintWidget3 : c0738d.f32872w0) {
                if (constraintWidget3 instanceof C0743i) {
                    AbstractC0761a abstractC0761a2 = (AbstractC0761a) constraintWidget3.f4879i0;
                    InterfaceC5038a interfaceC5038a = (InterfaceC5038a) constraintWidget3;
                    abstractC0761a2.getClass();
                    interfaceC5038a.mo10719a();
                    for (int i10 = 0; i10 < abstractC0761a2.f5367b; i10++) {
                        interfaceC5038a.mo10720b(sparseArray.get(abstractC0761a2.f5366a[i10]));
                    }
                    C0743i c0743i = (C0743i) interfaceC5038a;
                    for (int i11 = 0; i11 < c0743i.f32871x0; i11++) {
                        ConstraintWidget constraintWidget4 = c0743i.f32870w0[i11];
                        if (constraintWidget4 != null) {
                            constraintWidget4.f4843H = true;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.MotionLayout$g */
    public static class C0750g {

        /* JADX INFO: renamed from: b */
        public static final C0750g f5138b = new C0750g();

        /* JADX INFO: renamed from: a */
        public VelocityTracker f5139a;
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.MotionLayout$h */
    public class C0751h {

        /* JADX INFO: renamed from: a */
        public float f5140a = Float.NaN;

        /* JADX INFO: renamed from: b */
        public float f5141b = Float.NaN;

        /* JADX INFO: renamed from: c */
        public int f5142c = -1;

        /* JADX INFO: renamed from: d */
        public int f5143d = -1;

        public C0751h() {
        }

        /* JADX INFO: renamed from: a */
        public final void m2824a() {
            int i10 = this.f5142c;
            MotionLayout motionLayout = MotionLayout.this;
            if (i10 != -1 || this.f5143d != -1) {
                if (i10 == -1) {
                    motionLayout.m2799K(this.f5143d);
                } else {
                    int i11 = this.f5143d;
                    if (i11 == -1) {
                        motionLayout.m2795G(i10);
                    } else {
                        motionLayout.m2796H(i10, i11);
                    }
                }
                motionLayout.setState(TransitionState.SETUP);
            }
            if (Float.isNaN(this.f5141b)) {
                if (Float.isNaN(this.f5140a)) {
                    return;
                }
                motionLayout.setProgress(this.f5140a);
                return;
            }
            float f3 = this.f5140a;
            float f10 = this.f5141b;
            if (motionLayout.isAttachedToWindow()) {
                motionLayout.setProgress(f3);
                motionLayout.setState(TransitionState.MOVING);
                motionLayout.f5064O = f10;
                if (f10 != 0.0f) {
                    motionLayout.m2803t(f10 > 0.0f ? 1.0f : 0.0f);
                } else if (f3 != 0.0f && f3 != 1.0f) {
                    motionLayout.m2803t(f3 > 0.5f ? 1.0f : 0.0f);
                }
            } else {
                if (motionLayout.f5065O0 == null) {
                    motionLayout.f5065O0 = motionLayout.new C0751h();
                }
                C0751h c0751h = motionLayout.f5065O0;
                c0751h.f5140a = f3;
                c0751h.f5141b = f10;
            }
            this.f5140a = Float.NaN;
            this.f5141b = Float.NaN;
            this.f5142c = -1;
            this.f5143d = -1;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.MotionLayout$i */
    public interface InterfaceC0752i {
        /* JADX INFO: renamed from: a */
        void mo2825a(int i10);

        /* JADX INFO: renamed from: b */
        void mo2826b();

        /* JADX INFO: renamed from: c */
        void mo2827c(int i10);

        /* JADX INFO: renamed from: d */
        void mo2828d(int i10, int i11, float f3);
    }

    public MotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5062N = null;
        this.f5064O = 0.0f;
        this.f5066P = -1;
        this.f5068Q = -1;
        this.f5070R = -1;
        this.f5072S = 0;
        this.f5074T = 0;
        this.f5076U = true;
        this.f5078V = new HashMap<>();
        this.f5080W = 0L;
        this.f5084a0 = 1.0f;
        this.f5085b0 = 0.0f;
        this.f5086c0 = 0.0f;
        this.f5088e0 = 0.0f;
        this.f5090g0 = false;
        this.f5092i0 = 0;
        this.f5094k0 = false;
        this.f5095l0 = new C5463b();
        this.f5096m0 = new C0747d();
        this.f5100q0 = false;
        this.f5105v0 = false;
        this.f5106w0 = null;
        this.f5107x0 = null;
        this.f5108y0 = null;
        this.f5109z0 = 0;
        this.f5047A0 = -1L;
        this.f5048B0 = 0.0f;
        this.f5049C0 = 0;
        this.f5050D0 = 0.0f;
        this.f5051E0 = false;
        this.f5061M0 = new C7967l0(1);
        this.f5063N0 = false;
        this.f5067P0 = null;
        new HashMap();
        this.f5069Q0 = new Rect();
        this.f5071R0 = false;
        this.f5073S0 = TransitionState.UNDEFINED;
        this.f5075T0 = new C0749f();
        this.f5077U0 = false;
        this.f5079V0 = new RectF();
        this.f5081W0 = null;
        this.f5082X0 = null;
        this.f5083Y0 = new ArrayList<>();
        m2791C(attributeSet);
    }

    public MotionLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f5062N = null;
        this.f5064O = 0.0f;
        this.f5066P = -1;
        this.f5068Q = -1;
        this.f5070R = -1;
        this.f5072S = 0;
        this.f5074T = 0;
        this.f5076U = true;
        this.f5078V = new HashMap<>();
        this.f5080W = 0L;
        this.f5084a0 = 1.0f;
        this.f5085b0 = 0.0f;
        this.f5086c0 = 0.0f;
        this.f5088e0 = 0.0f;
        this.f5090g0 = false;
        this.f5092i0 = 0;
        this.f5094k0 = false;
        this.f5095l0 = new C5463b();
        this.f5096m0 = new C0747d();
        this.f5100q0 = false;
        this.f5105v0 = false;
        this.f5106w0 = null;
        this.f5107x0 = null;
        this.f5108y0 = null;
        this.f5109z0 = 0;
        this.f5047A0 = -1L;
        this.f5048B0 = 0.0f;
        this.f5049C0 = 0;
        this.f5050D0 = 0.0f;
        this.f5051E0 = false;
        this.f5061M0 = new C7967l0(1);
        this.f5063N0 = false;
        this.f5067P0 = null;
        new HashMap();
        this.f5069Q0 = new Rect();
        this.f5071R0 = false;
        this.f5073S0 = TransitionState.UNDEFINED;
        this.f5075T0 = new C0749f();
        this.f5077U0 = false;
        this.f5079V0 = new RectF();
        this.f5081W0 = null;
        this.f5082X0 = null;
        this.f5083Y0 = new ArrayList<>();
        m2791C(attributeSet);
    }

    /* JADX INFO: renamed from: s */
    public static Rect m2788s(MotionLayout motionLayout, ConstraintWidget constraintWidget) {
        motionLayout.getClass();
        int iM2737w = constraintWidget.m2737w();
        Rect rect = motionLayout.f5069Q0;
        rect.top = iM2737w;
        rect.left = constraintWidget.m2736v();
        rect.right = constraintWidget.m2735u() + rect.left;
        rect.bottom = constraintWidget.m2731o() + rect.top;
        return rect;
    }

    /* JADX INFO: renamed from: A */
    public final C0753a.b m2789A(int i10) {
        for (C0753a.b bVar : this.f5058L.f5148d) {
            if (bVar.f5165a == i10) {
                return bVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m2790B(float f3, float f10, MotionEvent motionEvent, View view) {
        boolean z10;
        boolean zOnTouchEvent;
        if (!(view instanceof ViewGroup)) {
            z10 = false;
            break;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                z10 = false;
                break;
            }
            View childAt = viewGroup.getChildAt(childCount);
            if (m2790B((childAt.getLeft() + f3) - view.getScrollX(), (childAt.getTop() + f10) - view.getScrollY(), motionEvent, childAt)) {
                z10 = true;
                break;
            }
            childCount--;
        }
        if (!z10) {
            float right = (view.getRight() + f3) - view.getLeft();
            float bottom = (view.getBottom() + f10) - view.getTop();
            RectF rectF = this.f5079V0;
            rectF.set(f3, f10, right, bottom);
            if (motionEvent.getAction() != 0 || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                float f11 = -f3;
                float f12 = -f10;
                Matrix matrix = view.getMatrix();
                if (matrix.isIdentity()) {
                    motionEvent.offsetLocation(f11, f12);
                    zOnTouchEvent = view.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(-f11, -f12);
                } else {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(f11, f12);
                    if (this.f5082X0 == null) {
                        this.f5082X0 = new Matrix();
                    }
                    matrix.invert(this.f5082X0);
                    motionEventObtain.transform(this.f5082X0);
                    zOnTouchEvent = view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zOnTouchEvent) {
                    return true;
                }
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: C */
    public final void m2791C(AttributeSet attributeSet) {
        C0753a c0753a;
        f5046Z0 = isInEditMode();
        int i10 = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C5881d.f35180n);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z10 = true;
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == 2) {
                    this.f5058L = new C0753a(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == 1) {
                    this.f5068Q = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == 4) {
                    this.f5088e0 = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                    this.f5090g0 = true;
                } else if (index == 0) {
                    z10 = typedArrayObtainStyledAttributes.getBoolean(index, z10);
                } else if (index == 5) {
                    if (this.f5092i0 == 0) {
                        this.f5092i0 = typedArrayObtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == 3) {
                    this.f5092i0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (this.f5058L == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z10) {
                this.f5058L = null;
            }
        }
        if (this.f5092i0 != 0) {
            C0753a c0753a2 = this.f5058L;
            if (c0753a2 == null) {
                Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            } else {
                int iM2835g = c0753a2.m2835g();
                C0753a c0753a3 = this.f5058L;
                C0762b c0762bM2830b = c0753a3.m2830b(c0753a3.m2835g());
                String strM12020c = C5663a.m12020c(iM2835g, getContext());
                int childCount = getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    int id2 = childAt.getId();
                    if (id2 == -1) {
                        StringBuilder sbM854m = C0204c.m854m("CHECK: ", strM12020c, " ALL VIEWS SHOULD HAVE ID's ");
                        sbM854m.append(childAt.getClass().getName());
                        sbM854m.append(" does not!");
                        Log.w("MotionLayout", sbM854m.toString());
                    }
                    if (c0762bM2830b.m2896j(id2) == null) {
                        StringBuilder sbM854m2 = C0204c.m854m("CHECK: ", strM12020c, " NO CONSTRAINTS for ");
                        sbM854m2.append(C5663a.m12021d(childAt));
                        Log.w("MotionLayout", sbM854m2.toString());
                    }
                }
                Integer[] numArr = (Integer[]) c0762bM2830b.f5382f.keySet().toArray(new Integer[0]);
                int length = numArr.length;
                int[] iArr = new int[length];
                for (int i13 = 0; i13 < length; i13++) {
                    iArr[i13] = numArr[i13].intValue();
                }
                for (int i14 = 0; i14 < length; i14++) {
                    int i15 = iArr[i14];
                    String strM12020c2 = C5663a.m12020c(i15, getContext());
                    if (findViewById(iArr[i14]) == null) {
                        Log.w("MotionLayout", "CHECK: " + strM12020c + " NO View matches id " + strM12020c2);
                    }
                    if (c0762bM2830b.m2895i(i15).f5387e.f5436d == -1) {
                        Log.w("MotionLayout", C0166e.m766l("CHECK: ", strM12020c, "(", strM12020c2, ") no LAYOUT_HEIGHT"));
                    }
                    if (c0762bM2830b.m2895i(i15).f5387e.f5434c == -1) {
                        Log.w("MotionLayout", C0166e.m766l("CHECK: ", strM12020c, "(", strM12020c2, ") no LAYOUT_HEIGHT"));
                    }
                }
                SparseIntArray sparseIntArray = new SparseIntArray();
                SparseIntArray sparseIntArray2 = new SparseIntArray();
                for (C0753a.b bVar : this.f5058L.f5148d) {
                    if (bVar == this.f5058L.f5147c) {
                        Log.v("MotionLayout", "CHECK: CURRENT");
                    }
                    if (bVar.f5168d == bVar.f5167c) {
                        Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
                    }
                    int i16 = bVar.f5168d;
                    int i17 = bVar.f5167c;
                    String strM12020c3 = C5663a.m12020c(i16, getContext());
                    String strM12020c4 = C5663a.m12020c(i17, getContext());
                    if (sparseIntArray.get(i16) == i17) {
                        Log.e("MotionLayout", "CHECK: two transitions with the same start and end " + strM12020c3 + "->" + strM12020c4);
                    }
                    if (sparseIntArray2.get(i17) == i16) {
                        Log.e("MotionLayout", "CHECK: you can't have reverse transitions" + strM12020c3 + "->" + strM12020c4);
                    }
                    sparseIntArray.put(i16, i17);
                    sparseIntArray2.put(i17, i16);
                    if (this.f5058L.m2830b(i16) == null) {
                        Log.e("MotionLayout", " no such constraintSetStart " + strM12020c3);
                    }
                    if (this.f5058L.m2830b(i17) == null) {
                        Log.e("MotionLayout", " no such constraintSetEnd " + strM12020c3);
                    }
                }
            }
        }
        if (this.f5068Q == -1 && (c0753a = this.f5058L) != null) {
            this.f5068Q = c0753a.m2835g();
            this.f5066P = this.f5058L.m2835g();
            C0753a.b bVar2 = this.f5058L.f5147c;
            if (bVar2 != null) {
                i10 = bVar2.f5167c;
            }
            this.f5070R = i10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0151  */
    /* JADX INFO: renamed from: D */
    public final void m2792D() {
        C0753a.b bVar;
        C0754b c0754b;
        View viewFindViewById;
        C0753a c0753a = this.f5058L;
        if (c0753a == null) {
            return;
        }
        if (c0753a.m2829a(this.f5068Q, this)) {
            requestLayout();
            return;
        }
        int i10 = this.f5068Q;
        if (i10 != -1) {
            C0753a c0753a2 = this.f5058L;
            ArrayList<C0753a.b> arrayList = c0753a2.f5148d;
            for (C0753a.b bVar2 : arrayList) {
                if (bVar2.f5177m.size() > 0) {
                    Iterator<C0753a.b.a> it = bVar2.f5177m.iterator();
                    while (it.hasNext()) {
                        it.next().m2844b(this);
                    }
                }
            }
            ArrayList<C0753a.b> arrayList2 = c0753a2.f5150f;
            for (C0753a.b bVar3 : arrayList2) {
                if (bVar3.f5177m.size() > 0) {
                    Iterator<C0753a.b.a> it2 = bVar3.f5177m.iterator();
                    while (it2.hasNext()) {
                        it2.next().m2844b(this);
                    }
                }
            }
            for (C0753a.b bVar4 : arrayList) {
                if (bVar4.f5177m.size() > 0) {
                    Iterator<C0753a.b.a> it3 = bVar4.f5177m.iterator();
                    while (it3.hasNext()) {
                        it3.next().m2843a(this, i10, bVar4);
                    }
                }
            }
            for (C0753a.b bVar5 : arrayList2) {
                if (bVar5.f5177m.size() > 0) {
                    Iterator<C0753a.b.a> it4 = bVar5.f5177m.iterator();
                    while (it4.hasNext()) {
                        it4.next().m2843a(this, i10, bVar5);
                    }
                }
            }
        }
        if (this.f5058L.m2842n() && (bVar = this.f5058L.f5147c) != null && (c0754b = bVar.f5176l) != null) {
            int i11 = c0754b.f5195d;
            if (i11 != -1) {
                MotionLayout motionLayout = c0754b.f5209r;
                viewFindViewById = motionLayout.findViewById(i11);
                if (viewFindViewById == null) {
                    Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + C5663a.m12020c(c0754b.f5195d, motionLayout.getContext()));
                }
                if (viewFindViewById instanceof NestedScrollView) {
                    NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById;
                    nestedScrollView.setOnTouchListener(new ViewOnTouchListenerC5680r());
                    nestedScrollView.setOnScrollChangeListener(new C5681s());
                }
            } else {
                viewFindViewById = null;
            }
            if (viewFindViewById instanceof NestedScrollView) {
                NestedScrollView nestedScrollView2 = (NestedScrollView) viewFindViewById;
                nestedScrollView2.setOnTouchListener(new ViewOnTouchListenerC5680r());
                nestedScrollView2.setOnScrollChangeListener(new C5681s());
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m2793E() {
        CopyOnWriteArrayList<InterfaceC0752i> copyOnWriteArrayList;
        if (this.f5091h0 != null || ((copyOnWriteArrayList = this.f5108y0) != null && !copyOnWriteArrayList.isEmpty())) {
            ArrayList<Integer> arrayList = this.f5083Y0;
            for (Integer num : arrayList) {
                InterfaceC0752i interfaceC0752i = this.f5091h0;
                if (interfaceC0752i != null) {
                    interfaceC0752i.mo2825a(num.intValue());
                }
                CopyOnWriteArrayList<InterfaceC0752i> copyOnWriteArrayList2 = this.f5108y0;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<InterfaceC0752i> it = copyOnWriteArrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().mo2825a(num.intValue());
                    }
                }
            }
            arrayList.clear();
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m2794F() {
        this.f5075T0.m2822f();
        invalidate();
    }

    /* JADX INFO: renamed from: G */
    public final void m2795G(int i10) {
        setState(TransitionState.SETUP);
        this.f5068Q = i10;
        this.f5066P = -1;
        this.f5070R = -1;
        C5878a c5878a = this.f5284k;
        if (c5878a == null) {
            C0753a c0753a = this.f5058L;
            if (c0753a != null) {
                c0753a.m2830b(i10).m2891b(this);
                return;
            }
            return;
        }
        float f3 = -1;
        int i11 = c5878a.f35153b;
        SparseArray<C5878a.a> sparseArray = c5878a.f35155d;
        int i12 = 0;
        ConstraintLayout constraintLayout = c5878a.f35152a;
        if (i11 != i10) {
            c5878a.f35153b = i10;
            C5878a.a aVar = sparseArray.get(i10);
            while (true) {
                ArrayList<C5878a.b> arrayList = aVar.f35158b;
                if (i12 >= arrayList.size()) {
                    i12 = -1;
                    break;
                } else if (arrayList.get(i12).m12310a(f3, f3)) {
                    break;
                } else {
                    i12++;
                }
            }
            ArrayList<C5878a.b> arrayList2 = aVar.f35158b;
            C0762b c0762b = i12 == -1 ? aVar.f35160d : arrayList2.get(i12).f35166f;
            if (i12 != -1) {
                int i13 = arrayList2.get(i12).f35165e;
            }
            if (c0762b != null) {
                c5878a.f35154c = i12;
                c0762b.m2891b(constraintLayout);
                return;
            } else {
                Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i10 + ", dim =-1.0, -1.0");
                return;
            }
        }
        C5878a.a aVarValueAt = i10 == -1 ? sparseArray.valueAt(0) : sparseArray.get(i11);
        int i14 = c5878a.f35154c;
        if (i14 == -1 || !aVarValueAt.f35158b.get(i14).m12310a(f3, f3)) {
            while (true) {
                ArrayList<C5878a.b> arrayList3 = aVarValueAt.f35158b;
                if (i12 >= arrayList3.size()) {
                    i12 = -1;
                    break;
                } else if (arrayList3.get(i12).m12310a(f3, f3)) {
                    break;
                } else {
                    i12++;
                }
            }
            if (c5878a.f35154c == i12) {
                return;
            }
            ArrayList<C5878a.b> arrayList4 = aVarValueAt.f35158b;
            C0762b c0762b2 = i12 == -1 ? null : arrayList4.get(i12).f35166f;
            if (i12 != -1) {
                int i15 = arrayList4.get(i12).f35165e;
            }
            if (c0762b2 == null) {
                return;
            }
            c5878a.f35154c = i12;
            c0762b2.m2891b(constraintLayout);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m2796H(int i10, int i11) {
        if (!isAttachedToWindow()) {
            if (this.f5065O0 == null) {
                this.f5065O0 = new C0751h();
            }
            C0751h c0751h = this.f5065O0;
            c0751h.f5142c = i10;
            c0751h.f5143d = i11;
            return;
        }
        C0753a c0753a = this.f5058L;
        if (c0753a != null) {
            this.f5066P = i10;
            this.f5070R = i11;
            c0753a.m2841m(i10, i11);
            this.f5075T0.m2821e(this.f5058L.m2830b(i10), this.f5058L.m2830b(i11));
            m2794F();
            this.f5086c0 = 0.0f;
            m2803t(0.0f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:62:0x0103  */
    /* JADX WARN: Code duplicated, block: B:67:0x010e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0118  */
    /* JADX WARN: Code duplicated, block: B:77:0x0122  */
    /* JADX WARN: Code duplicated, block: B:82:0x012c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0136  */
    /* JADX WARN: Code duplicated, block: B:90:0x013b  */
    /* JADX INFO: renamed from: I */
    public final void m2797I(float f3, float f10, int i10) {
        int i11;
        float f11;
        float f12;
        float f13;
        float f14;
        int i12;
        C0754b c0754b;
        C0754b c0754b2;
        C0754b c0754b3;
        C0754b c0754b4;
        C0754b c0754b5;
        C0753a.b bVar;
        C0754b c0754b6;
        C0754b c0754b7;
        C0754b c0754b8;
        float f15 = f3;
        if (this.f5058L == null || this.f5086c0 == f15) {
            return;
        }
        boolean z10 = true;
        this.f5094k0 = true;
        this.f5080W = getNanoTime();
        C0753a c0753a = this.f5058L;
        C0753a.b bVar2 = c0753a.f5147c;
        float f16 = (bVar2 != null ? bVar2.f5172h : c0753a.f5154j) / 1000.0f;
        this.f5084a0 = f16;
        this.f5088e0 = f15;
        this.f5090g0 = true;
        C5463b c5463b = this.f5095l0;
        float f17 = 0.0f;
        if (i10 == 0 || i10 == 1 || i10 == 2) {
            if (i10 != 1 || i10 == 7) {
                f15 = 0.0f;
            } else if (i10 == 2 || i10 == 6) {
                f15 = 1.0f;
            }
            if (bVar2 != null || (c0754b7 = bVar2.f5176l) == null) {
                i11 = 0;
            } else {
                i11 = c0754b7.f5191D;
            }
            if (i11 == 0) {
                float f18 = this.f5086c0;
                float fM2834f = c0753a.m2834f();
                bVar = this.f5058L.f5147c;
                if (bVar != null && (c0754b6 = bVar.f5176l) != null) {
                    f17 = c0754b6.f5210s;
                }
                c5463b.m11703b(f18, f15, f10, f16, fM2834f, f17);
            } else {
                float f19 = this.f5086c0;
                if (bVar2 != null || (c0754b5 = bVar2.f5176l) == null) {
                    f11 = 0.0f;
                } else {
                    f11 = c0754b5.f5217z;
                }
                if (bVar2 != null || (c0754b4 = bVar2.f5176l) == null) {
                    f12 = 0.0f;
                } else {
                    f12 = c0754b4.f5188A;
                }
                if (bVar2 != null || (c0754b3 = bVar2.f5176l) == null) {
                    f13 = 0.0f;
                } else {
                    f13 = c0754b3.f5216y;
                }
                if (bVar2 != null || (c0754b2 = bVar2.f5176l) == null) {
                    f14 = 0.0f;
                } else {
                    f14 = c0754b2.f5189B;
                }
                if (bVar2 != null || (c0754b = bVar2.f5176l) == null) {
                    i12 = 0;
                } else {
                    i12 = c0754b.f5190C;
                }
                if (c5463b.f34033b == null) {
                    c5463b.f34033b = new C1668k();
                }
                C1668k c1668k = c5463b.f34033b;
                c5463b.f34034c = c1668k;
                c1668k.f9349c = f15;
                c1668k.f9347a = f13;
                c1668k.f9351e = f19;
                c1668k.f9348b = f12;
                c1668k.f9353g = f11;
                c1668k.f9354h = f14;
                c1668k.f9355i = i12;
                c1668k.f9350d = 0.0f;
            }
            int i13 = this.f5068Q;
            this.f5088e0 = f15;
            this.f5068Q = i13;
            this.f5060M = c5463b;
        } else {
            C0747d c0747d = this.f5096m0;
            if (i10 == 4) {
                float f20 = this.f5086c0;
                float fM2834f2 = c0753a.m2834f();
                c0747d.f5113a = f10;
                c0747d.f5114b = f20;
                c0747d.f5115c = fM2834f2;
                this.f5060M = c0747d;
            } else if (i10 == 5) {
                float f21 = this.f5086c0;
                float fM2834f3 = c0753a.m2834f();
                if (f10 > 0.0f) {
                    float f22 = f10 / fM2834f3;
                    if (((f10 * f22) - (((fM2834f3 * f22) * f22) / 2.0f)) + f21 <= 1.0f) {
                        z10 = false;
                    }
                } else {
                    float f23 = (-f10) / fM2834f3;
                    if ((((fM2834f3 * f23) * f23) / 2.0f) + (f10 * f23) + f21 >= 0.0f) {
                        z10 = false;
                    }
                }
                if (z10) {
                    float f24 = this.f5086c0;
                    float fM2834f4 = this.f5058L.m2834f();
                    c0747d.f5113a = f10;
                    c0747d.f5114b = f24;
                    c0747d.f5115c = fM2834f4;
                    this.f5060M = c0747d;
                } else {
                    C5463b c5463b2 = this.f5095l0;
                    float f25 = this.f5086c0;
                    float f26 = this.f5084a0;
                    float fM2834f5 = this.f5058L.m2834f();
                    C0753a.b bVar3 = this.f5058L.f5147c;
                    c5463b2.m11703b(f25, f3, f10, f26, fM2834f5, (bVar3 == null || (c0754b8 = bVar3.f5176l) == null) ? 0.0f : c0754b8.f5210s);
                    this.f5064O = 0.0f;
                    int i14 = this.f5068Q;
                    this.f5088e0 = f15;
                    this.f5068Q = i14;
                    this.f5060M = c5463b;
                }
            } else if (i10 == 6 || i10 == 7) {
                if (i10 != 1) {
                    f15 = 0.0f;
                } else {
                    f15 = 0.0f;
                }
                if (bVar2 != null) {
                    i11 = 0;
                } else {
                    i11 = 0;
                }
                if (i11 == 0) {
                    float f110 = this.f5086c0;
                    float fM2834f6 = c0753a.m2834f();
                    bVar = this.f5058L.f5147c;
                    if (bVar != null) {
                        f17 = c0754b6.f5210s;
                    }
                    c5463b.m11703b(f110, f15, f10, f16, fM2834f6, f17);
                } else {
                    float f111 = this.f5086c0;
                    if (bVar2 != null) {
                        f11 = 0.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    if (bVar2 != null) {
                        f12 = 0.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    if (bVar2 != null) {
                        f13 = 0.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    if (bVar2 != null) {
                        f14 = 0.0f;
                    } else {
                        f14 = 0.0f;
                    }
                    if (bVar2 != null) {
                        i12 = 0;
                    } else {
                        i12 = 0;
                    }
                    if (c5463b.f34033b == null) {
                        c5463b.f34033b = new C1668k();
                    }
                    C1668k c1668k2 = c5463b.f34033b;
                    c5463b.f34034c = c1668k2;
                    c1668k2.f9349c = f15;
                    c1668k2.f9347a = f13;
                    c1668k2.f9351e = f111;
                    c1668k2.f9348b = f12;
                    c1668k2.f9353g = f11;
                    c1668k2.f9354h = f14;
                    c1668k2.f9355i = i12;
                    c1668k2.f9350d = 0.0f;
                }
                int i15 = this.f5068Q;
                this.f5088e0 = f15;
                this.f5068Q = i15;
                this.f5060M = c5463b;
            }
        }
        this.f5089f0 = false;
        this.f5080W = getNanoTime();
        invalidate();
    }

    /* JADX INFO: renamed from: J */
    public final void m2798J() {
        m2803t(1.0f);
        this.f5067P0 = null;
    }

    /* JADX INFO: renamed from: K */
    public final void m2799K(int i10) {
        C5883f c5883f;
        if (!isAttachedToWindow()) {
            if (this.f5065O0 == null) {
                this.f5065O0 = new C0751h();
            }
            this.f5065O0.f5143d = i10;
            return;
        }
        C0753a c0753a = this.f5058L;
        if (c0753a != null && (c5883f = c0753a.f5146b) != null) {
            int i11 = this.f5068Q;
            float f3 = -1;
            C5883f.a aVar = c5883f.f35194b.get(i10);
            if (aVar != null) {
                ArrayList<C5883f.b> arrayList = aVar.f35196b;
                int i12 = aVar.f35197c;
                if (f3 != -1.0f && f3 != -1.0f) {
                    Iterator<C5883f.b> it = arrayList.iterator();
                    C5883f.b bVar = null;
                    while (true) {
                        if (!it.hasNext()) {
                            if (bVar != null) {
                                i11 = bVar.f35202e;
                                break;
                            } else {
                                i11 = i12;
                                break;
                            }
                        }
                        C5883f.b next = it.next();
                        if (next.m12312a(f3, f3)) {
                            if (i11 == next.f35202e) {
                                break;
                            } else {
                                bVar = next;
                            }
                        }
                    }
                } else if (i12 != i11) {
                    Iterator<C5883f.b> it2 = arrayList.iterator();
                    do {
                        if (!it2.hasNext()) {
                            i11 = i12;
                            break;
                        }
                    } while (i11 != it2.next().f35202e);
                }
            } else {
                i11 = i10;
            }
            if (i11 != -1) {
                i10 = i11;
            }
        }
        int i13 = this.f5068Q;
        if (i13 == i10) {
            return;
        }
        if (this.f5066P == i10) {
            m2803t(0.0f);
            return;
        }
        if (this.f5070R == i10) {
            m2803t(1.0f);
            return;
        }
        this.f5070R = i10;
        if (i13 != -1) {
            m2796H(i13, i10);
            m2803t(1.0f);
            this.f5086c0 = 0.0f;
            m2798J();
            return;
        }
        this.f5094k0 = false;
        this.f5088e0 = 1.0f;
        this.f5085b0 = 0.0f;
        this.f5086c0 = 0.0f;
        this.f5087d0 = getNanoTime();
        this.f5080W = getNanoTime();
        this.f5089f0 = false;
        this.f5060M = null;
        C0753a c0753a2 = this.f5058L;
        C0753a.b bVar2 = c0753a2.f5147c;
        this.f5084a0 = (bVar2 != null ? bVar2.f5172h : c0753a2.f5154j) / 1000.0f;
        this.f5066P = -1;
        c0753a2.m2841m(-1, this.f5070R);
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        HashMap<View, C5676n> map = this.f5078V;
        map.clear();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            map.put(childAt, new C5676n(childAt));
            sparseArray.put(childAt.getId(), map.get(childAt));
        }
        this.f5090g0 = true;
        C0762b c0762bM2830b = this.f5058L.m2830b(i10);
        C0749f c0749f = this.f5075T0;
        c0749f.m2821e(null, c0762bM2830b);
        m2794F();
        c0749f.m2819a();
        int childCount2 = getChildCount();
        for (int i15 = 0; i15 < childCount2; i15++) {
            View childAt2 = getChildAt(i15);
            C5676n c5676n = map.get(childAt2);
            if (c5676n != null) {
                C5679q c5679q = c5676n.f34620f;
                c5679q.f34653c = 0.0f;
                c5679q.f34654d = 0.0f;
                c5679q.m12049i(childAt2.getX(), childAt2.getY(), childAt2.getWidth(), childAt2.getHeight());
                C5674l c5674l = c5676n.f34622h;
                c5674l.getClass();
                childAt2.getX();
                childAt2.getY();
                childAt2.getWidth();
                childAt2.getHeight();
                c5674l.m12037f(childAt2);
            }
        }
        int width = getWidth();
        int height = getHeight();
        for (int i16 = 0; i16 < childCount; i16++) {
            C5676n c5676n2 = map.get(getChildAt(i16));
            if (c5676n2 != null) {
                this.f5058L.m2833e(c5676n2);
                c5676n2.m12044f(width, height, getNanoTime());
            }
        }
        C0753a.b bVar3 = this.f5058L.f5147c;
        float f10 = bVar3 != null ? bVar3.f5173i : 0.0f;
        if (f10 != 0.0f) {
            float fMin = Float.MAX_VALUE;
            float fMax = -3.4028235E38f;
            for (int i17 = 0; i17 < childCount; i17++) {
                C5679q c5679q2 = map.get(getChildAt(i17)).f34621g;
                float f11 = c5679q2.f34656f + c5679q2.f34655e;
                fMin = Math.min(fMin, f11);
                fMax = Math.max(fMax, f11);
            }
            for (int i18 = 0; i18 < childCount; i18++) {
                C5676n c5676n3 = map.get(getChildAt(i18));
                C5679q c5679q3 = c5676n3.f34621g;
                float f12 = c5679q3.f34655e;
                float f13 = c5679q3.f34656f;
                c5676n3.f34628n = 1.0f / (1.0f - f10);
                c5676n3.f34627m = f10 - ((((f12 + f13) - fMin) * f10) / (fMax - fMin));
            }
        }
        this.f5085b0 = 0.0f;
        this.f5086c0 = 0.0f;
        this.f5090g0 = true;
        invalidate();
    }

    /* JADX INFO: renamed from: L */
    public final void m2800L(int i10, C0762b c0762b) {
        C0753a c0753a = this.f5058L;
        if (c0753a != null) {
            c0753a.f5151g.put(i10, c0762b);
        }
        this.f5075T0.m2821e(this.f5058L.m2830b(this.f5066P), this.f5058L.m2830b(this.f5070R));
        m2794F();
        if (this.f5068Q == i10) {
            c0762b.m2891b(this);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m2801M(int i10, View... viewArr) {
        String str;
        C0753a c0753a = this.f5058L;
        if (c0753a != null) {
            C0756d c0756d = c0753a.f5161q;
            c0756d.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator<C0755c> it = c0756d.f5253b.iterator();
            C0755c c0755c = null;
            while (true) {
                boolean zHasNext = it.hasNext();
                str = c0756d.f5255d;
                if (!zHasNext) {
                    break;
                }
                C0755c next = it.next();
                if (next.f5218a == i10) {
                    for (View view : viewArr) {
                        if (next.m2849b(view)) {
                            arrayList.add(view);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        View[] viewArr2 = (View[]) arrayList.toArray(new View[0]);
                        MotionLayout motionLayout = c0756d.f5252a;
                        int currentState = motionLayout.getCurrentState();
                        if (next.f5222e == 2) {
                            next.m2848a(c0756d, c0756d.f5252a, currentState, null, viewArr2);
                        } else if (currentState == -1) {
                            Log.w(str, "No support for ViewTransition within transition yet. Currently: " + motionLayout.toString());
                        } else {
                            C0762b c0762bM2809z = motionLayout.m2809z(currentState);
                            if (c0762bM2809z != null) {
                                next.m2848a(c0756d, c0756d.f5252a, currentState, c0762bM2809z, viewArr2);
                            }
                        }
                        arrayList.clear();
                    }
                    c0755c = next;
                }
            }
            if (c0755c == null) {
                Log.e(str, " Could not find ViewTransition");
            }
        } else {
            Log.e("MotionLayout", " no motionScene");
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Iterator<C5676n> it;
        int i10;
        Paint paint;
        ArrayList<C5679q> arrayList;
        int i11;
        Canvas canvas2;
        Paint paint2;
        C5679q c5679q;
        int i12;
        int i13;
        C5679q c5679q2;
        int i14;
        AbstractC5465d abstractC5465d;
        double dMo5384a;
        C0756d c0756d;
        ArrayList<C0755c.a> arrayList2;
        Canvas canvas3 = canvas;
        int i15 = 0;
        m2805v(false);
        C0753a c0753a = this.f5058L;
        if (c0753a != null && (c0756d = c0753a.f5161q) != null && (arrayList2 = c0756d.f5256e) != null) {
            Iterator<C0755c.a> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().m2852a();
            }
            ArrayList<C0755c.a> arrayList3 = c0756d.f5256e;
            ArrayList<C0755c.a> arrayList4 = c0756d.f5257f;
            arrayList3.removeAll(arrayList4);
            arrayList4.clear();
            if (c0756d.f5256e.isEmpty()) {
                c0756d.f5256e = null;
            }
        }
        super.dispatchDraw(canvas);
        if (this.f5058L == null) {
            return;
        }
        int i16 = 1;
        if ((this.f5092i0 & 1) == 1 && !isInEditMode()) {
            this.f5109z0++;
            long nanoTime = getNanoTime();
            long j10 = this.f5047A0;
            if (j10 != -1) {
                long j11 = nanoTime - j10;
                if (j11 > 200000000) {
                    this.f5048B0 = ((int) ((this.f5109z0 / (j11 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.f5109z0 = 0;
                    this.f5047A0 = nanoTime;
                }
            } else {
                this.f5047A0 = nanoTime;
            }
            Paint paint3 = new Paint();
            paint3.setTextSize(42.0f);
            float progress = ((int) (getProgress() * 1000.0f)) / 10.0f;
            StringBuilder sbM771r = C0166e.m771r(this.f5048B0 + " fps " + C5663a.m12022e(this.f5066P, this) + " -> ");
            sbM771r.append(C5663a.m12022e(this.f5070R, this));
            sbM771r.append(" (progress: ");
            sbM771r.append(progress);
            sbM771r.append(" ) state=");
            int i17 = this.f5068Q;
            sbM771r.append(i17 == -1 ? "undefined" : C5663a.m12022e(i17, this));
            String string = sbM771r.toString();
            paint3.setColor(-16777216);
            canvas3.drawText(string, 11.0f, getHeight() - 29, paint3);
            paint3.setColor(-7864184);
            canvas3.drawText(string, 10.0f, getHeight() - 30, paint3);
        }
        if (this.f5092i0 > 1) {
            if (this.f5093j0 == null) {
                this.f5093j0 = new C0748e();
            }
            C0748e c0748e = this.f5093j0;
            HashMap<View, C5676n> map = this.f5078V;
            C0753a c0753a2 = this.f5058L;
            C0753a.b bVar = c0753a2.f5147c;
            int i18 = bVar != null ? bVar.f5172h : c0753a2.f5154j;
            int i19 = this.f5092i0;
            c0748e.getClass();
            if (map == null || map.size() == 0) {
                return;
            }
            canvas.save();
            MotionLayout motionLayout = MotionLayout.this;
            boolean zIsInEditMode = motionLayout.isInEditMode();
            Paint paint4 = c0748e.f5121e;
            if (!zIsInEditMode && (i19 & 1) == 2) {
                String str = motionLayout.getContext().getResources().getResourceName(motionLayout.f5070R) + ":" + motionLayout.getProgress();
                canvas3.drawText(str, 10.0f, motionLayout.getHeight() - 30, c0748e.f5124h);
                canvas3.drawText(str, 11.0f, motionLayout.getHeight() - 29, paint4);
            }
            Iterator<C5676n> it3 = map.values().iterator();
            Canvas canvas4 = canvas3;
            C0748e c0748e2 = c0748e;
            while (it3.hasNext()) {
                C5676n next = it3.next();
                int iMax = next.f34620f.f34652b;
                ArrayList<C5679q> arrayList5 = next.f34635u;
                Iterator<C5679q> it4 = arrayList5.iterator();
                while (it4.hasNext()) {
                    iMax = Math.max(iMax, it4.next().f34652b);
                }
                int iMax2 = Math.max(iMax, next.f34621g.f34652b);
                if (i19 > 0 && iMax2 == 0) {
                    iMax2 = i16;
                }
                if (iMax2 != 0) {
                    float[] fArr = c0748e2.f5119c;
                    if (fArr != null) {
                        int[] iArr = c0748e2.f5118b;
                        if (iArr != null) {
                            Iterator<C5679q> it5 = arrayList5.iterator();
                            while (it5.hasNext()) {
                                iArr[i15] = it5.next().f34648J;
                                i15++;
                            }
                        }
                        int i20 = 0;
                        int i21 = 0;
                        for (double[] dArrMo5374f = next.f34624j[i15].mo5374f(); i20 < dArrMo5374f.length; dArrMo5374f = dArrMo5374f) {
                            next.f34624j[0].mo5371c(dArrMo5374f[i20], next.f34630p);
                            next.f34620f.m12048g(dArrMo5374f[i20], next.f34629o, next.f34630p, fArr, i21);
                            i21 += 2;
                            i20++;
                            paint4 = paint4;
                            arrayList5 = arrayList5;
                            it3 = it3;
                            i19 = i19;
                        }
                        it = it3;
                        i10 = i19;
                        paint = paint4;
                        arrayList = arrayList5;
                        i11 = i21 / 2;
                    } else {
                        it = it3;
                        i10 = i19;
                        paint = paint4;
                        arrayList = arrayList5;
                        i11 = 0;
                    }
                    c0748e2.f5127k = i11;
                    int i22 = 1;
                    if (iMax2 >= 1) {
                        int i23 = i18 / 16;
                        float[] fArr2 = c0748e2.f5117a;
                        if (fArr2 == null || fArr2.length != i23 * 2) {
                            c0748e2.f5117a = new float[i23 * 2];
                            c0748e2.f5120d = new Path();
                        }
                        int i24 = c0748e2.f5129m;
                        float f3 = i24;
                        canvas4.translate(f3, f3);
                        paint2 = paint;
                        paint2.setColor(1996488704);
                        Paint paint5 = c0748e2.f5125i;
                        paint5.setColor(1996488704);
                        Paint paint6 = c0748e2.f5122f;
                        paint6.setColor(1996488704);
                        Paint paint7 = c0748e2.f5123g;
                        paint7.setColor(1996488704);
                        float[] fArr3 = c0748e2.f5117a;
                        float f10 = 1.0f / (i23 - 1);
                        HashMap<String, AbstractC5465d> map2 = next.f34639y;
                        AbstractC5465d abstractC5465d2 = map2 == null ? null : map2.get("translationX");
                        HashMap<String, AbstractC5465d> map3 = next.f34639y;
                        AbstractC5465d abstractC5465d3 = map3 == null ? null : map3.get("translationY");
                        HashMap<String, AbstractC5464c> map4 = next.f34640z;
                        AbstractC5464c abstractC5464c = map4 == null ? null : map4.get("translationX");
                        HashMap<String, AbstractC5464c> map5 = next.f34640z;
                        AbstractC5464c abstractC5464c2 = map5 == null ? null : map5.get("translationY");
                        int i25 = 0;
                        while (true) {
                            float f11 = Float.NaN;
                            AbstractC5464c abstractC5464c3 = abstractC5464c;
                            c5679q = next.f34620f;
                            if (i25 >= i23) {
                                break;
                            }
                            int i26 = i23;
                            float fMin = i25 * f10;
                            float f12 = f10;
                            float f13 = next.f34628n;
                            if (f13 != 1.0f) {
                                abstractC5465d = abstractC5465d2;
                                float f14 = next.f34627m;
                                if (fMin < f14) {
                                    fMin = 0.0f;
                                }
                                if (fMin > f14) {
                                    i14 = i24;
                                    if (fMin < 1.0d) {
                                        fMin = Math.min((fMin - f14) * f13, 1.0f);
                                    }
                                } else {
                                    i14 = i24;
                                }
                            } else {
                                i14 = i24;
                                abstractC5465d = abstractC5465d2;
                            }
                            double d10 = fMin;
                            C1660c c1660c = c5679q.f34651a;
                            float f15 = 0.0f;
                            for (C5679q c5679q3 : arrayList) {
                                double d11 = d10;
                                C1660c c1660c2 = c5679q3.f34651a;
                                if (c1660c2 != null) {
                                    float f16 = c5679q3.f34653c;
                                    if (f16 < fMin) {
                                        f15 = f16;
                                        c1660c = c1660c2;
                                    } else if (Float.isNaN(f11)) {
                                        f11 = c5679q3.f34653c;
                                    }
                                }
                                d10 = d11;
                            }
                            double d12 = d10;
                            if (c1660c != null) {
                                if (Float.isNaN(f11)) {
                                    f11 = 1.0f;
                                }
                                float f17 = f11 - f15;
                                dMo5384a = (((float) c1660c.mo5384a((fMin - f15) / f17)) * f17) + f15;
                            } else {
                                dMo5384a = d12;
                            }
                            next.f34624j[0].mo5371c(dMo5384a, next.f34630p);
                            C1658a c1658a = next.f34625k;
                            if (c1658a != null) {
                                double[] dArr = next.f34630p;
                                if (dArr.length > 0) {
                                    c1658a.mo5371c(dMo5384a, dArr);
                                }
                            }
                            int i27 = i25 * 2;
                            Paint paint8 = paint7;
                            int i28 = i25;
                            AbstractC5465d abstractC5465d4 = abstractC5465d3;
                            Paint paint9 = paint5;
                            AbstractC5465d abstractC5465d5 = abstractC5465d;
                            next.f34620f.m12048g(dMo5384a, next.f34629o, next.f34630p, fArr3, i27);
                            if (abstractC5464c3 != null) {
                                fArr3[i27] = abstractC5464c3.m5388a(fMin) + fArr3[i27];
                            } else if (abstractC5465d5 != null) {
                                fArr3[i27] = abstractC5465d5.m5396a(fMin) + fArr3[i27];
                            }
                            if (abstractC5464c2 != null) {
                                int i29 = i27 + 1;
                                fArr3[i29] = abstractC5464c2.m5388a(fMin) + fArr3[i29];
                            } else if (abstractC5465d4 != null) {
                                int i30 = i27 + 1;
                                fArr3[i30] = abstractC5465d4.m5396a(fMin) + fArr3[i30];
                            }
                            i25 = i28 + 1;
                            abstractC5464c = abstractC5464c3;
                            abstractC5465d2 = abstractC5465d5;
                            abstractC5465d3 = abstractC5465d4;
                            i23 = i26;
                            f10 = f12;
                            i24 = i14;
                            paint7 = paint8;
                            paint5 = paint9;
                        }
                        c0748e.m2811a(canvas, iMax2, c0748e.f5127k, next);
                        paint2.setColor(-21965);
                        paint6.setColor(-2067046);
                        paint5.setColor(-2067046);
                        paint7.setColor(-13391360);
                        float f18 = -i24;
                        canvas.translate(f18, f18);
                        c0748e.m2811a(canvas, iMax2, c0748e.f5127k, next);
                        if (iMax2 == 5) {
                            c0748e.f5120d.reset();
                            int i31 = 0;
                            while (i31 <= 50) {
                                next.f34624j[0].mo5371c(next.m12040a(i31 / 50, null), next.f34630p);
                                int[] iArr2 = next.f34629o;
                                double[] dArr2 = next.f34630p;
                                float f19 = c5679q.f34655e;
                                float fCos = c5679q.f34656f;
                                float f20 = c5679q.f34657g;
                                float f21 = c5679q.f34658h;
                                for (int i32 = 0; i32 < iArr2.length; i32++) {
                                    float f22 = (float) dArr2[i32];
                                    int i33 = iArr2[i32];
                                    if (i33 == 1) {
                                        f19 = f22;
                                    } else if (i33 == 2) {
                                        fCos = f22;
                                    } else if (i33 == 3) {
                                        f20 = f22;
                                    } else if (i33 == 4) {
                                        f21 = f22;
                                    }
                                }
                                if (c5679q.f34646H != null) {
                                    double d13 = 0.0f;
                                    double d14 = f19;
                                    double d15 = fCos;
                                    c5679q2 = c5679q;
                                    float fSin = (float) (((Math.sin(d15) * d14) + d13) - ((double) (f20 / 2.0f)));
                                    fCos = (float) ((d13 - (Math.cos(d15) * d14)) - ((double) (f21 / 2.0f)));
                                    f19 = fSin;
                                } else {
                                    c5679q2 = c5679q;
                                }
                                float f23 = f20 + f19;
                                float f24 = f21 + fCos;
                                Float.isNaN(Float.NaN);
                                Float.isNaN(Float.NaN);
                                float f25 = f19 + 0.0f;
                                float f26 = fCos + 0.0f;
                                float f27 = f23 + 0.0f;
                                float f28 = f24 + 0.0f;
                                float[] fArr4 = c0748e.f5126j;
                                fArr4[0] = f25;
                                fArr4[1] = f26;
                                fArr4[2] = f27;
                                fArr4[3] = f26;
                                fArr4[4] = f27;
                                fArr4[5] = f28;
                                fArr4[6] = f25;
                                fArr4[7] = f28;
                                c0748e.f5120d.moveTo(f25, f26);
                                c0748e.f5120d.lineTo(fArr4[2], fArr4[3]);
                                c0748e.f5120d.lineTo(fArr4[4], fArr4[5]);
                                c0748e.f5120d.lineTo(fArr4[6], fArr4[7]);
                                c0748e.f5120d.close();
                                i31++;
                                c5679q = c5679q2;
                            }
                            i12 = 0;
                            i13 = 1;
                            paint2.setColor(1140850688);
                            canvas2 = canvas;
                            canvas2.translate(2.0f, 2.0f);
                            canvas2.drawPath(c0748e.f5120d, paint2);
                            canvas2.translate(-2.0f, -2.0f);
                            paint2.setColor(-65536);
                            canvas2.drawPath(c0748e.f5120d, paint2);
                        } else {
                            canvas2 = canvas;
                            i12 = 0;
                            i13 = 1;
                        }
                        i15 = i12;
                        i22 = i13;
                        c0748e2 = c0748e;
                        canvas4 = canvas2;
                    } else {
                        canvas2 = canvas3;
                        paint2 = paint;
                        i15 = 0;
                    }
                    canvas3 = canvas2;
                    paint4 = paint2;
                    i18 = i18;
                    it3 = it;
                    i19 = i10;
                    i16 = i22;
                }
            }
            canvas.restore();
        }
    }

    @Override // p471x2.InterfaceC10056p
    /* JADX INFO: renamed from: e */
    public final void mo964e(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (this.f5100q0 || i10 != 0 || i11 != 0) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
        }
        this.f5100q0 = false;
    }

    public int[] getConstraintSetIds() {
        C0753a c0753a = this.f5058L;
        if (c0753a == null) {
            return null;
        }
        SparseArray<C0762b> sparseArray = c0753a.f5151g;
        int size = sparseArray.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = sparseArray.keyAt(i10);
        }
        return iArr;
    }

    public int getCurrentState() {
        return this.f5068Q;
    }

    public ArrayList<C0753a.b> getDefinedTransitions() {
        C0753a c0753a = this.f5058L;
        if (c0753a == null) {
            return null;
        }
        return c0753a.f5148d;
    }

    public C5664b getDesignTool() {
        if (this.f5097n0 == null) {
            this.f5097n0 = new C5664b();
        }
        return this.f5097n0;
    }

    public int getEndState() {
        return this.f5070R;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f5086c0;
    }

    public C0753a getScene() {
        return this.f5058L;
    }

    public int getStartState() {
        return this.f5066P;
    }

    public float getTargetPosition() {
        return this.f5088e0;
    }

    public Bundle getTransitionState() {
        if (this.f5065O0 == null) {
            this.f5065O0 = new C0751h();
        }
        C0751h c0751h = this.f5065O0;
        MotionLayout motionLayout = MotionLayout.this;
        c0751h.f5143d = motionLayout.f5070R;
        c0751h.f5142c = motionLayout.f5066P;
        c0751h.f5141b = motionLayout.getVelocity();
        c0751h.f5140a = motionLayout.getProgress();
        C0751h c0751h2 = this.f5065O0;
        c0751h2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", c0751h2.f5140a);
        bundle.putFloat("motion.velocity", c0751h2.f5141b);
        bundle.putInt("motion.StartState", c0751h2.f5142c);
        bundle.putInt("motion.EndState", c0751h2.f5143d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        C0753a c0753a = this.f5058L;
        if (c0753a != null) {
            C0753a.b bVar = c0753a.f5147c;
            this.f5084a0 = (bVar != null ? bVar.f5172h : c0753a.f5154j) / 1000.0f;
        }
        return (long) (this.f5084a0 * 1000.0f);
    }

    public float getVelocity() {
        return this.f5064O;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    /* JADX INFO: renamed from: i */
    public final void mo2802i(int i10) {
        this.f5284k = null;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    @Override // p471x2.InterfaceC10054o
    /* JADX INFO: renamed from: k */
    public final void mo970k(View view, int i10, int i11, int i12, int i13, int i14) {
    }

    @Override // p471x2.InterfaceC10054o
    /* JADX INFO: renamed from: l */
    public final boolean mo971l(View view, View view2, int i10, int i11) {
        C0753a.b bVar;
        C0754b c0754b;
        C0753a c0753a = this.f5058L;
        if (c0753a != null && (bVar = c0753a.f5147c) != null && (c0754b = bVar.f5176l) != null) {
            if ((c0754b.f5214w & 2) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // p471x2.InterfaceC10054o
    /* JADX INFO: renamed from: m */
    public final void mo972m(View view, View view2, int i10, int i11) {
        this.f5103t0 = getNanoTime();
        this.f5104u0 = 0.0f;
        this.f5101r0 = 0.0f;
        this.f5102s0 = 0.0f;
    }

    @Override // p471x2.InterfaceC10054o
    /* JADX INFO: renamed from: n */
    public final void mo973n(View view, int i10) {
        C0754b c0754b;
        C0753a c0753a = this.f5058L;
        if (c0753a != null) {
            float f3 = this.f5104u0;
            float f10 = 0.0f;
            if (f3 == 0.0f) {
                return;
            }
            float f11 = this.f5101r0 / f3;
            float f12 = this.f5102s0 / f3;
            C0753a.b bVar = c0753a.f5147c;
            if (bVar != null && (c0754b = bVar.f5176l) != null) {
                c0754b.f5204m = false;
                MotionLayout motionLayout = c0754b.f5209r;
                float progress = motionLayout.getProgress();
                c0754b.f5209r.m2808y(c0754b.f5195d, progress, c0754b.f5199h, c0754b.f5198g, c0754b.f5205n);
                float f13 = c0754b.f5202k;
                float[] fArr = c0754b.f5205n;
                float f14 = f13 != 0.0f ? (f11 * f13) / fArr[0] : (f12 * c0754b.f5203l) / fArr[1];
                if (!Float.isNaN(f14)) {
                    progress += f14 / 3.0f;
                }
                if (progress != 0.0f) {
                    boolean z10 = progress != 1.0f;
                    int i11 = c0754b.f5194c;
                    if ((i11 != 3) & z10) {
                        if (progress >= 0.5d) {
                            f10 = 1.0f;
                        }
                        motionLayout.m2797I(f10, f14, i11);
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // p471x2.InterfaceC10054o
    /* JADX INFO: renamed from: o */
    public final void mo974o(View view, int i10, int i11, int[] iArr, int i12) {
        C0753a.b bVar;
        boolean z10;
        ?? r10;
        C0754b c0754b;
        float f3;
        C0754b c0754b2;
        C0754b c0754b3;
        C0754b c0754b4;
        int i13;
        C0753a c0753a = this.f5058L;
        if (c0753a == null || (bVar = c0753a.f5147c) == null || !((z10 = !bVar.f5179o))) {
            return;
        }
        int i14 = -1;
        if (!z10 || (c0754b4 = bVar.f5176l) == null || (i13 = c0754b4.f5196e) == -1 || view.getId() == i13) {
            C0753a.b bVar2 = c0753a.f5147c;
            if ((bVar2 == null || (c0754b3 = bVar2.f5176l) == null) ? false : c0754b3.f5212u) {
                C0754b c0754b5 = bVar.f5176l;
                if (c0754b5 != null && (c0754b5.f5214w & 4) != 0) {
                    i14 = i11;
                }
                float f10 = this.f5085b0;
                if ((f10 == 1.0f || f10 == 0.0f) && view.canScrollVertically(i14)) {
                    return;
                }
            }
            C0754b c0754b6 = bVar.f5176l;
            if (c0754b6 != null && (c0754b6.f5214w & 1) != 0) {
                float f11 = i10;
                float f12 = i11;
                C0753a.b bVar3 = c0753a.f5147c;
                if (bVar3 == null || (c0754b2 = bVar3.f5176l) == null) {
                    f3 = 0.0f;
                } else {
                    c0754b2.f5209r.m2808y(c0754b2.f5195d, c0754b2.f5209r.getProgress(), c0754b2.f5199h, c0754b2.f5198g, c0754b2.f5205n);
                    float f13 = c0754b2.f5202k;
                    float[] fArr = c0754b2.f5205n;
                    if (f13 != 0.0f) {
                        if (fArr[0] == 0.0f) {
                            fArr[0] = 1.0E-7f;
                        }
                        f3 = (f11 * f13) / fArr[0];
                    } else {
                        if (fArr[1] == 0.0f) {
                            fArr[1] = 1.0E-7f;
                        }
                        f3 = (f12 * c0754b2.f5203l) / fArr[1];
                    }
                }
                float f14 = this.f5086c0;
                if ((f14 <= 0.0f && f3 < 0.0f) || (f14 >= 1.0f && f3 > 0.0f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new RunnableC0744a(view));
                    return;
                }
            }
            float f15 = this.f5085b0;
            long nanoTime = getNanoTime();
            float f16 = i10;
            this.f5101r0 = f16;
            float f17 = i11;
            this.f5102s0 = f17;
            this.f5104u0 = (float) ((nanoTime - this.f5103t0) * 1.0E-9d);
            this.f5103t0 = nanoTime;
            C0753a.b bVar4 = c0753a.f5147c;
            if (bVar4 != null && (c0754b = bVar4.f5176l) != null) {
                MotionLayout motionLayout = c0754b.f5209r;
                float progress = motionLayout.getProgress();
                if (!c0754b.f5204m) {
                    c0754b.f5204m = true;
                    motionLayout.setProgress(progress);
                }
                c0754b.f5209r.m2808y(c0754b.f5195d, progress, c0754b.f5199h, c0754b.f5198g, c0754b.f5205n);
                float f18 = c0754b.f5202k;
                float[] fArr2 = c0754b.f5205n;
                if (Math.abs((c0754b.f5203l * fArr2[1]) + (f18 * fArr2[0])) < 0.01d) {
                    fArr2[0] = 0.01f;
                    fArr2[1] = 0.01f;
                }
                float f19 = c0754b.f5202k;
                float fMax = Math.max(Math.min(progress + (f19 != 0.0f ? (f16 * f19) / fArr2[0] : (f17 * c0754b.f5203l) / fArr2[1]), 1.0f), 0.0f);
                if (fMax != motionLayout.getProgress()) {
                    motionLayout.setProgress(fMax);
                }
            }
            if (f15 != this.f5085b0) {
                iArr[0] = i10;
                r10 = 1;
                iArr[1] = i11;
            } else {
                r10 = 1;
            }
            m2805v(false);
            if (iArr[0] == 0 && iArr[r10] == 0) {
                return;
            }
            this.f5100q0 = r10;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        C0753a.b bVar;
        int i10;
        boolean z10;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        C0753a c0753a = this.f5058L;
        if (c0753a != null && (i10 = this.f5068Q) != -1) {
            C0762b c0762bM2830b = c0753a.m2830b(i10);
            C0753a c0753a2 = this.f5058L;
            int i11 = 0;
            while (true) {
                SparseArray<C0762b> sparseArray = c0753a2.f5151g;
                if (i11 >= sparseArray.size()) {
                    break;
                }
                int iKeyAt = sparseArray.keyAt(i11);
                SparseIntArray sparseIntArray = c0753a2.f5153i;
                int i12 = sparseIntArray.get(iKeyAt);
                int size = sparseIntArray.size();
                while (true) {
                    if (i12 <= 0) {
                        z10 = false;
                        break;
                    }
                    if (i12 != iKeyAt) {
                        int i13 = size - 1;
                        if (size >= 0) {
                            i12 = sparseIntArray.get(i12);
                            size = i13;
                        }
                    }
                    z10 = true;
                    break;
                }
                if (z10) {
                    Log.e("MotionScene", "Cannot be derived from yourself");
                    break;
                } else {
                    c0753a2.m2840l(iKeyAt, this);
                    i11++;
                }
            }
            if (c0762bM2830b != null) {
                c0762bM2830b.m2891b(this);
            }
            this.f5066P = this.f5068Q;
        }
        m2792D();
        C0751h c0751h = this.f5065O0;
        if (c0751h != null) {
            if (this.f5071R0) {
                post(new RunnableC0745b());
                return;
            } else {
                c0751h.m2824a();
                return;
            }
        }
        C0753a c0753a3 = this.f5058L;
        if (c0753a3 != null && (bVar = c0753a3.f5147c) != null && bVar.f5178n == 4) {
            m2798J();
            setState(TransitionState.SETUP);
            setState(TransitionState.MOVING);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C0754b c0754b;
        int i10;
        RectF rectFM2846b;
        MotionLayout motionLayout;
        int currentState;
        C0753a c0753a = this.f5058L;
        if (c0753a == null || !this.f5076U) {
            return false;
        }
        C0756d c0756d = c0753a.f5161q;
        if (c0756d != null && (currentState = (motionLayout = c0756d.f5252a).getCurrentState()) != -1) {
            HashSet<View> hashSet = c0756d.f5254c;
            ArrayList<C0755c> arrayList = c0756d.f5253b;
            if (hashSet == null) {
                c0756d.f5254c = new HashSet<>();
                for (C0755c c0755c : arrayList) {
                    int childCount = motionLayout.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = motionLayout.getChildAt(i11);
                        if (c0755c.m2850c(childAt)) {
                            childAt.getId();
                            c0756d.f5254c.add(childAt);
                        }
                    }
                }
            }
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            Rect rect = new Rect();
            int action = motionEvent.getAction();
            ArrayList<C0755c.a> arrayList2 = c0756d.f5256e;
            int i12 = 2;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                for (C0755c.a aVar : c0756d.f5256e) {
                    if (action != 1) {
                        if (action != 2) {
                            aVar.getClass();
                        } else {
                            View view = aVar.f5241c.f34616b;
                            Rect rect2 = aVar.f5250l;
                            view.getHitRect(rect2);
                            if (!rect2.contains((int) x10, (int) y10) && !aVar.f5246h) {
                                aVar.m2853b();
                            }
                        }
                    } else if (!aVar.f5246h) {
                        aVar.m2853b();
                    }
                }
            }
            if (action == 0 || action == 1) {
                C0762b c0762bM2809z = motionLayout.m2809z(currentState);
                Iterator<C0755c> it = arrayList.iterator();
                while (it.hasNext()) {
                    C0755c next = it.next();
                    int i13 = next.f5219b;
                    if (i13 != 1 ? !(i13 != i12 ? !(i13 == 3 && action == 0) : action != 1) : action == 0) {
                        for (View view2 : c0756d.f5254c) {
                            if (next.m2850c(view2)) {
                                view2.getHitRect(rect);
                                if (rect.contains((int) x10, (int) y10)) {
                                    next.m2848a(c0756d, c0756d.f5252a, currentState, c0762bM2809z, view2);
                                }
                                next = next;
                                i12 = i12;
                            }
                        }
                    }
                }
            }
        }
        C0753a.b bVar = this.f5058L.f5147c;
        if (bVar == null || !(!bVar.f5179o) || (c0754b = bVar.f5176l) == null) {
            return false;
        }
        if ((motionEvent.getAction() == 0 && (rectFM2846b = c0754b.m2846b(this, new RectF())) != null && !rectFM2846b.contains(motionEvent.getX(), motionEvent.getY())) || (i10 = c0754b.f5196e) == -1) {
            return false;
        }
        View view3 = this.f5081W0;
        if (view3 == null || view3.getId() != i10) {
            this.f5081W0 = findViewById(i10);
        }
        View view4 = this.f5081W0;
        if (view4 == null) {
            return false;
        }
        RectF rectF = this.f5079V0;
        rectF.set(view4.getLeft(), this.f5081W0.getTop(), this.f5081W0.getRight(), this.f5081W0.getBottom());
        if (!rectF.contains(motionEvent.getX(), motionEvent.getY()) || m2790B(this.f5081W0.getLeft(), this.f5081W0.getTop(), motionEvent, this.f5081W0)) {
            return false;
        }
        return onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f5063N0 = true;
        try {
            if (this.f5058L == null) {
                super.onLayout(z10, i10, i11, i12, i13);
                this.f5063N0 = false;
                return;
            }
            int i14 = i12 - i10;
            int i15 = i13 - i11;
            if (this.f5098o0 != i14 || this.f5099p0 != i15) {
                m2794F();
                m2805v(true);
            }
            this.f5098o0 = i14;
            this.f5099p0 = i15;
            this.f5063N0 = false;
        } catch (Throwable th2) {
            this.f5063N0 = false;
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:35:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0078  */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        if (this.f5058L == null) {
            super.onMeasure(i10, i11);
            return;
        }
        boolean z11 = true;
        boolean z12 = (this.f5072S == i10 && this.f5074T == i11) ? false : true;
        if (this.f5077U0) {
            this.f5077U0 = false;
            m2792D();
            m2793E();
            z12 = true;
        }
        if (this.f5281h) {
            z12 = true;
        }
        this.f5072S = i10;
        this.f5074T = i11;
        int iM2835g = this.f5058L.m2835g();
        C0753a.b bVar = this.f5058L.f5147c;
        int i12 = bVar == null ? -1 : bVar.f5167c;
        C0749f c0749f = this.f5075T0;
        if (!z12) {
            if (!((iM2835g == c0749f.f5135e && i12 == c0749f.f5136f) ? false : true)) {
                if (z12) {
                    super.onMeasure(i10, i11);
                }
                z10 = true;
            } else if (this.f5066P != -1) {
                super.onMeasure(i10, i11);
                c0749f.m2821e(this.f5058L.m2830b(iM2835g), this.f5058L.m2830b(i12));
                c0749f.m2822f();
                c0749f.f5135e = iM2835g;
                c0749f.f5136f = i12;
                z10 = false;
            } else {
                if (z12) {
                    super.onMeasure(i10, i11);
                }
                z10 = true;
            }
        } else if (this.f5066P != -1) {
            super.onMeasure(i10, i11);
            c0749f.m2821e(this.f5058L.m2830b(iM2835g), this.f5058L.m2830b(i12));
            c0749f.m2822f();
            c0749f.f5135e = iM2835g;
            c0749f.f5136f = i12;
            z10 = false;
        } else {
            if (z12) {
                super.onMeasure(i10, i11);
            }
            z10 = true;
        }
        if (this.f5051E0 || z10) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingRight = getPaddingRight() + getPaddingLeft();
            C0738d c0738d = this.f5276c;
            int iM2735u = c0738d.m2735u() + paddingRight;
            int iM2731o = c0738d.m2731o() + paddingBottom;
            int i13 = this.f5056J0;
            if (i13 == Integer.MIN_VALUE || i13 == 0) {
                int i14 = this.f5052F0;
                iM2735u = (int) ((this.f5059L0 * (this.f5054H0 - i14)) + i14);
                requestLayout();
            }
            int i15 = this.f5057K0;
            if (i15 == Integer.MIN_VALUE || i15 == 0) {
                int i16 = this.f5053G0;
                iM2731o = (int) ((this.f5059L0 * (this.f5055I0 - i16)) + i16);
                requestLayout();
            }
            setMeasuredDimension(iM2735u, iM2731o);
        }
        float fSignum = Math.signum(this.f5088e0 - this.f5086c0);
        long nanoTime = getNanoTime();
        AbstractInterpolatorC5678p abstractInterpolatorC5678p = this.f5060M;
        float interpolation = this.f5086c0 + (!(abstractInterpolatorC5678p instanceof C5463b) ? (((nanoTime - this.f5087d0) * fSignum) * 1.0E-9f) / this.f5084a0 : 0.0f);
        if (this.f5089f0) {
            interpolation = this.f5088e0;
        }
        if ((fSignum <= 0.0f || interpolation < this.f5088e0) && (fSignum > 0.0f || interpolation > this.f5088e0)) {
            z11 = false;
        } else {
            interpolation = this.f5088e0;
        }
        if (abstractInterpolatorC5678p != null && !z11) {
            interpolation = this.f5094k0 ? abstractInterpolatorC5678p.getInterpolation((nanoTime - this.f5080W) * 1.0E-9f) : abstractInterpolatorC5678p.getInterpolation(interpolation);
        }
        if ((fSignum > 0.0f && interpolation >= this.f5088e0) || (fSignum <= 0.0f && interpolation <= this.f5088e0)) {
            interpolation = this.f5088e0;
        }
        this.f5059L0 = interpolation;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator = this.f5062N;
        if (interpolator != null) {
            interpolation = interpolator.getInterpolation(interpolation);
        }
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            C5676n c5676n = this.f5078V.get(childAt);
            if (c5676n != null) {
                c5676n.m12042c(interpolation, nanoTime2, childAt, this.f5061M0);
            }
        }
        if (this.f5051E0) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f3, float f10, boolean z10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f3, float f10) {
        return false;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        C0754b c0754b;
        C0753a c0753a = this.f5058L;
        if (c0753a != null) {
            boolean zM2866h = m2866h();
            c0753a.f5160p = zM2866h;
            C0753a.b bVar = c0753a.f5147c;
            if (bVar == null || (c0754b = bVar.f5176l) == null) {
                return;
            }
            c0754b.m2847c(zM2866h);
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x023d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0245  */
    /* JADX WARN: Code duplicated, block: B:114:0x0249  */
    /* JADX WARN: Code duplicated, block: B:200:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:201:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:204:0x0511  */
    /* JADX WARN: Code duplicated, block: B:205:0x051f  */
    /* JADX WARN: Code duplicated, block: B:233:0x0580  */
    /* JADX WARN: Code duplicated, block: B:235:0x0586  */
    /* JADX WARN: Code duplicated, block: B:237:0x058c  */
    /* JADX WARN: Code duplicated, block: B:240:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:362:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:371:0x080d  */
    /* JADX WARN: Code duplicated, block: B:70:0x010d A[PHI: r20
      0x010d: PHI (r20v5 java.util.Iterator) = (r20v6 java.util.Iterator), (r20v7 java.util.Iterator) binds: [B:69:0x010b, B:63:0x00f2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0753a.b bVar;
        boolean z10;
        MotionLayout motionLayout;
        C0750g c0750g;
        C0750g c0750g2;
        C0754b c0754b;
        char c10;
        char c11;
        int i10;
        char c12;
        char c13;
        char c14;
        float right;
        float f3;
        int top;
        int bottom;
        int i11;
        float degrees;
        float f10;
        int i12;
        char c15;
        MotionEvent motionEvent2;
        RectF rectF;
        C0753a.b bVar2;
        int iM12311a;
        Iterator it;
        C0754b c0754b2;
        C0753a c0753a = this.f5058L;
        if (c0753a == null || !this.f5076U || !c0753a.m2842n()) {
            return super.onTouchEvent(motionEvent);
        }
        C0753a c0753a2 = this.f5058L;
        C0753a.b bVar3 = c0753a2.f5147c;
        if (bVar3 != null && !(!bVar3.f5179o)) {
            return super.onTouchEvent(motionEvent);
        }
        int currentState = getCurrentState();
        RectF rectF2 = new RectF();
        C0750g c0750g3 = c0753a2.f5159o;
        MotionLayout motionLayout2 = c0753a2.f5145a;
        if (c0750g3 == null) {
            motionLayout2.getClass();
            C0750g c0750g4 = C0750g.f5138b;
            c0750g4.f5139a = VelocityTracker.obtain();
            c0753a2.f5159o = c0750g4;
        }
        VelocityTracker velocityTracker = c0753a2.f5159o.f5139a;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (currentState != -1) {
            int action = motionEvent.getAction();
            if (action == 0) {
                c0753a2.f5162r = motionEvent.getRawX();
                c0753a2.f5163s = motionEvent.getRawY();
                c0753a2.f5156l = motionEvent;
                c0753a2.f5157m = false;
                C0754b c0754b3 = c0753a2.f5147c.f5176l;
                if (c0754b3 != null) {
                    RectF rectFM2845a = c0754b3.m2845a(motionLayout2, rectF2);
                    if (rectFM2845a == null || rectFM2845a.contains(c0753a2.f5156l.getX(), c0753a2.f5156l.getY())) {
                        RectF rectFM2846b = c0753a2.f5147c.f5176l.m2846b(motionLayout2, rectF2);
                        if (rectFM2846b == null || rectFM2846b.contains(c0753a2.f5156l.getX(), c0753a2.f5156l.getY())) {
                            c0753a2.f5158n = false;
                        } else {
                            c0753a2.f5158n = true;
                        }
                        C0754b c0754b4 = c0753a2.f5147c.f5176l;
                        float f11 = c0753a2.f5162r;
                        float f12 = c0753a2.f5163s;
                        c0754b4.f5207p = f11;
                        c0754b4.f5208q = f12;
                    } else {
                        c0753a2.f5156l = null;
                        c0753a2.f5157m = true;
                    }
                }
            } else if (action == 2 && !c0753a2.f5157m) {
                float rawY = motionEvent.getRawY() - c0753a2.f5163s;
                float rawX = motionEvent.getRawX() - c0753a2.f5162r;
                if ((rawX != 0.0d || rawY != 0.0d) && (motionEvent2 = c0753a2.f5156l) != null) {
                    if (currentState != -1) {
                        C5883f c5883f = c0753a2.f5146b;
                        if (c5883f == null || (iM12311a = c5883f.m12311a(currentState)) == -1) {
                            iM12311a = currentState;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (C0753a.b bVar4 : c0753a2.f5148d) {
                            if (bVar4.f5168d == iM12311a || bVar4.f5167c == iM12311a) {
                                arrayList.add(bVar4);
                            }
                        }
                        RectF rectF3 = new RectF();
                        Iterator it2 = arrayList.iterator();
                        float f13 = 0.0f;
                        bVar2 = null;
                        while (it2.hasNext()) {
                            C0753a.b bVar5 = (C0753a.b) it2.next();
                            if (bVar5.f5179o || (c0754b2 = bVar5.f5176l) == null) {
                                rectF3 = rectF3;
                                it = it2;
                                bVar2 = bVar2;
                                rawY = rawY;
                                rawX = rawX;
                                motionEvent2 = motionEvent2;
                                rectF2 = rectF2;
                            } else {
                                c0754b2.m2847c(c0753a2.f5160p);
                                RectF rectFM2846b2 = bVar5.f5176l.m2846b(motionLayout2, rectF3);
                                if (rectFM2846b2 != null) {
                                    it = it2;
                                    if (!rectFM2846b2.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                        rectF3 = rectF3;
                                        rectF2 = rectF2;
                                        bVar2 = bVar2;
                                        rawY = rawY;
                                        rawX = rawX;
                                        motionEvent2 = motionEvent2;
                                    }
                                    rectF2 = rectF2;
                                    rawX = rawX;
                                    it2 = it;
                                    rectF3 = rectF3;
                                    rawY = rawY;
                                    motionEvent2 = motionEvent2;
                                } else {
                                    it = it2;
                                }
                                RectF rectFM2845a2 = bVar5.f5176l.m2845a(motionLayout2, rectF3);
                                if (rectFM2845a2 == null || rectFM2845a2.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                    C0754b c0754b5 = bVar5.f5176l;
                                    float fAtan2 = (c0754b5.f5203l * rawY) + (c0754b5.f5202k * rawX);
                                    if (c0754b5.f5201j) {
                                        float x10 = motionEvent2.getX();
                                        bVar5.f5176l.getClass();
                                        float f14 = x10 - 0.5f;
                                        float y10 = motionEvent2.getY();
                                        bVar5.f5176l.getClass();
                                        float f15 = y10 - 0.5f;
                                        fAtan2 = ((float) (Math.atan2(rawY + f15, rawX + f14) - Math.atan2(f14, f15))) * 10.0f;
                                    }
                                    float f16 = (bVar5.f5167c == currentState ? -1.0f : 1.1f) * fAtan2;
                                    if (f16 > f13) {
                                        f13 = f16;
                                        bVar2 = bVar5;
                                    }
                                    rectF2 = rectF2;
                                    rawX = rawX;
                                    it2 = it;
                                    rectF3 = rectF3;
                                    rawY = rawY;
                                    motionEvent2 = motionEvent2;
                                } else {
                                    rectF3 = rectF3;
                                    rectF2 = rectF2;
                                    bVar2 = bVar2;
                                    rawY = rawY;
                                    rawX = rawX;
                                    motionEvent2 = motionEvent2;
                                }
                            }
                            bVar2 = bVar2;
                            rectF2 = rectF2;
                            rawX = rawX;
                            it2 = it;
                            rectF3 = rectF3;
                            rawY = rawY;
                            motionEvent2 = motionEvent2;
                        }
                        rectF = rectF2;
                    } else {
                        rectF = rectF2;
                        bVar2 = c0753a2.f5147c;
                    }
                    if (bVar2 != null) {
                        setTransition(bVar2);
                        RectF rectFM2846b3 = c0753a2.f5147c.f5176l.m2846b(motionLayout2, rectF);
                        c0753a2.f5158n = (rectFM2846b3 == null || rectFM2846b3.contains(c0753a2.f5156l.getX(), c0753a2.f5156l.getY())) ? false : true;
                        C0754b c0754b6 = c0753a2.f5147c.f5176l;
                        float f17 = c0753a2.f5162r;
                        float f18 = c0753a2.f5163s;
                        c0754b6.f5207p = f17;
                        c0754b6.f5208q = f18;
                        c0754b6.f5204m = false;
                    }
                    if (c0753a2.f5157m) {
                        bVar = c0753a2.f5147c;
                        if (bVar != null) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        c0753a2.f5162r = motionEvent.getRawX();
                        c0753a2.f5163s = motionEvent.getRawY();
                        if (motionEvent.getAction() == 1) {
                            motionLayout = this;
                        } else {
                            motionLayout = this;
                        }
                    }
                }
            } else if (c0753a2.f5157m) {
                bVar = c0753a2.f5147c;
                if (bVar != null) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                c0753a2.f5162r = motionEvent.getRawX();
                c0753a2.f5163s = motionEvent.getRawY();
                if (motionEvent.getAction() == 1) {
                    motionLayout = this;
                } else {
                    motionLayout = this;
                }
            }
            motionLayout = this;
            z10 = false;
        } else if (c0753a2.f5157m) {
            motionLayout = this;
            z10 = false;
        } else {
            bVar = c0753a2.f5147c;
            if (bVar != null || (c0754b = bVar.f5176l) == null || c0753a2.f5158n) {
                z10 = false;
            } else {
                C0750g c0750g5 = c0753a2.f5159o;
                boolean z11 = c0754b.f5201j;
                float[] fArr = c0754b.f5205n;
                MotionLayout motionLayout3 = c0754b.f5209r;
                if (z11) {
                    VelocityTracker velocityTracker2 = c0750g5.f5139a;
                    if (velocityTracker2 != null) {
                        velocityTracker2.addMovement(motionEvent);
                    }
                    int action2 = motionEvent.getAction();
                    if (action2 != 0) {
                        int[] iArr = c0754b.f5206o;
                        if (action2 == 1) {
                            c0754b.f5204m = false;
                            VelocityTracker velocityTracker3 = c0750g5.f5139a;
                            if (velocityTracker3 != null) {
                                velocityTracker3.computeCurrentVelocity(16);
                            }
                            VelocityTracker velocityTracker4 = c0750g5.f5139a;
                            float xVelocity = velocityTracker4 != null ? velocityTracker4.getXVelocity() : 0.0f;
                            VelocityTracker velocityTracker5 = c0750g5.f5139a;
                            float yVelocity = velocityTracker5 != null ? velocityTracker5.getYVelocity() : 0.0f;
                            float progress = motionLayout3.getProgress();
                            float width = motionLayout3.getWidth() / 2.0f;
                            float height = motionLayout3.getHeight() / 2.0f;
                            int i13 = c0754b.f5200i;
                            if (i13 != -1) {
                                View viewFindViewById = motionLayout3.findViewById(i13);
                                motionLayout3.getLocationOnScreen(iArr);
                                right = ((viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f) + iArr[0];
                                f3 = iArr[1];
                                top = viewFindViewById.getTop();
                                bottom = viewFindViewById.getBottom();
                            } else {
                                int i14 = c0754b.f5195d;
                                if (i14 != -1) {
                                    View viewFindViewById2 = motionLayout3.findViewById(motionLayout3.f5078V.get(motionLayout3.findViewById(i14)).f34620f.f34661k);
                                    motionLayout3.getLocationOnScreen(iArr);
                                    right = ((viewFindViewById2.getRight() + viewFindViewById2.getLeft()) / 2.0f) + iArr[0];
                                    f3 = iArr[1];
                                    top = viewFindViewById2.getTop();
                                    bottom = viewFindViewById2.getBottom();
                                } else {
                                    float rawX2 = motionEvent.getRawX() - width;
                                    float rawY2 = motionEvent.getRawY() - height;
                                    double degrees2 = Math.toDegrees(Math.atan2(rawY2, rawX2));
                                    i11 = c0754b.f5195d;
                                    if (i11 != -1) {
                                        c0754b.f5209r.m2808y(i11, progress, c0754b.f5199h, c0754b.f5198g, c0754b.f5205n);
                                        fArr[1] = (float) Math.toDegrees(fArr[1]);
                                    } else {
                                        fArr[1] = 360.0f;
                                    }
                                    degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity + rawY2, xVelocity + rawX2)) - degrees2)) * 62.5f;
                                    if (Float.isNaN(degrees)) {
                                        f10 = progress;
                                    } else {
                                        f10 = (((degrees * 3.0f) * c0754b.f5213v) / fArr[1]) + progress;
                                    }
                                    if (f10 == 0.0f && f10 != 1.0f && (i12 = c0754b.f5194c) != 3) {
                                        float fAbs = (degrees * c0754b.f5213v) / fArr[1];
                                        float f19 = ((double) f10) < 0.5d ? 0.0f : 1.0f;
                                        if (i12 == 6) {
                                            if (progress + fAbs < 0.0f) {
                                                fAbs = Math.abs(fAbs);
                                            }
                                            f19 = 1.0f;
                                        }
                                        if (c0754b.f5194c == 7) {
                                            if (progress + fAbs > 1.0f) {
                                                fAbs = -Math.abs(fAbs);
                                            }
                                            f19 = 0.0f;
                                        }
                                        motionLayout3.m2797I(f19, fAbs * 3.0f, c0754b.f5194c);
                                        if (0.0f >= progress || 1.0f <= progress) {
                                            motionLayout3.setState(TransitionState.FINISHED);
                                        }
                                    } else if (0.0f < f10 || 1.0f <= f10) {
                                        motionLayout3.setState(TransitionState.FINISHED);
                                    }
                                }
                            }
                            height = ((bottom + top) / 2.0f) + f3;
                            width = right;
                            float rawX3 = motionEvent.getRawX() - width;
                            float rawY3 = motionEvent.getRawY() - height;
                            double degrees3 = Math.toDegrees(Math.atan2(rawY3, rawX3));
                            i11 = c0754b.f5195d;
                            if (i11 != -1) {
                                c0754b.f5209r.m2808y(i11, progress, c0754b.f5199h, c0754b.f5198g, c0754b.f5205n);
                                fArr[1] = (float) Math.toDegrees(fArr[1]);
                            } else {
                                fArr[1] = 360.0f;
                            }
                            degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity + rawY3, xVelocity + rawX3)) - degrees3)) * 62.5f;
                            if (Float.isNaN(degrees)) {
                                f10 = (((degrees * 3.0f) * c0754b.f5213v) / fArr[1]) + progress;
                            } else {
                                f10 = progress;
                            }
                            if (f10 == 0.0f) {
                                if (0.0f < f10) {
                                    motionLayout3.setState(TransitionState.FINISHED);
                                } else {
                                    motionLayout3.setState(TransitionState.FINISHED);
                                }
                            } else if (0.0f < f10) {
                                motionLayout3.setState(TransitionState.FINISHED);
                            } else {
                                motionLayout3.setState(TransitionState.FINISHED);
                            }
                        } else if (action2 == 2) {
                            motionEvent.getRawY();
                            motionEvent.getRawX();
                            float width2 = motionLayout3.getWidth() / 2.0f;
                            float height2 = motionLayout3.getHeight() / 2.0f;
                            int i15 = c0754b.f5200i;
                            if (i15 != -1) {
                                View viewFindViewById3 = motionLayout3.findViewById(i15);
                                motionLayout3.getLocationOnScreen(iArr);
                                float right2 = iArr[0] + ((viewFindViewById3.getRight() + viewFindViewById3.getLeft()) / 2.0f);
                                height2 = ((viewFindViewById3.getBottom() + viewFindViewById3.getTop()) / 2.0f) + iArr[1];
                                width2 = right2;
                            } else {
                                int i16 = c0754b.f5195d;
                                if (i16 != -1) {
                                    View viewFindViewById4 = motionLayout3.findViewById(motionLayout3.f5078V.get(motionLayout3.findViewById(i16)).f34620f.f34661k);
                                    if (viewFindViewById4 == null) {
                                        Log.e("TouchResponse", "could not find view to animate to");
                                    } else {
                                        motionLayout3.getLocationOnScreen(iArr);
                                        width2 = iArr[0] + ((viewFindViewById4.getRight() + viewFindViewById4.getLeft()) / 2.0f);
                                        height2 = ((viewFindViewById4.getBottom() + viewFindViewById4.getTop()) / 2.0f) + iArr[1];
                                    }
                                }
                            }
                            float rawX4 = motionEvent.getRawX() - width2;
                            float rawY4 = motionEvent.getRawY() - height2;
                            double dAtan2 = Math.atan2(motionEvent.getRawY() - height2, motionEvent.getRawX() - width2);
                            float fAtan3 = (float) (((dAtan2 - Math.atan2(c0754b.f5208q - height2, c0754b.f5207p - width2)) * 180.0d) / 3.141592653589793d);
                            if (fAtan3 > 330.0f) {
                                fAtan3 -= 360.0f;
                            } else if (fAtan3 < -330.0f) {
                                fAtan3 += 360.0f;
                            }
                            if (Math.abs(fAtan3) > 0.01d || c0754b.f5204m) {
                                float progress2 = motionLayout3.getProgress();
                                if (!c0754b.f5204m) {
                                    c0754b.f5204m = true;
                                    motionLayout3.setProgress(progress2);
                                }
                                int i17 = c0754b.f5195d;
                                if (i17 != -1) {
                                    c0754b.f5209r.m2808y(i17, progress2, c0754b.f5199h, c0754b.f5198g, c0754b.f5205n);
                                    c15 = 1;
                                    fArr[1] = (float) Math.toDegrees(fArr[1]);
                                } else {
                                    c15 = 1;
                                    fArr[1] = 360.0f;
                                }
                                float fMax = Math.max(Math.min(((fAtan3 * c0754b.f5213v) / fArr[c15]) + progress2, 1.0f), 0.0f);
                                float progress3 = motionLayout3.getProgress();
                                if (fMax != progress3) {
                                    if (progress3 == 0.0f || progress3 == 1.0f) {
                                        motionLayout3.m2804u(progress3 == 0.0f);
                                    }
                                    motionLayout3.setProgress(fMax);
                                    VelocityTracker velocityTracker6 = c0750g5.f5139a;
                                    if (velocityTracker6 != null) {
                                        velocityTracker6.computeCurrentVelocity(1000);
                                    }
                                    VelocityTracker velocityTracker7 = c0750g5.f5139a;
                                    float xVelocity2 = velocityTracker7 != null ? velocityTracker7.getXVelocity() : 0.0f;
                                    VelocityTracker velocityTracker8 = c0750g5.f5139a;
                                    double yVelocity2 = velocityTracker8 != null ? velocityTracker8.getYVelocity() : 0.0f;
                                    double d10 = xVelocity2;
                                    motionLayout3.f5064O = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(yVelocity2, d10) - dAtan2) * Math.hypot(yVelocity2, d10)) / Math.hypot(rawX4, rawY4)));
                                } else {
                                    motionLayout3.f5064O = 0.0f;
                                }
                                c0754b.f5207p = motionEvent.getRawX();
                                c0754b.f5208q = motionEvent.getRawY();
                            }
                        }
                    } else {
                        c0754b.f5207p = motionEvent.getRawX();
                        c0754b.f5208q = motionEvent.getRawY();
                        c0754b.f5204m = false;
                    }
                } else {
                    VelocityTracker velocityTracker9 = c0750g5.f5139a;
                    if (velocityTracker9 != null) {
                        velocityTracker9.addMovement(motionEvent);
                    }
                    int action3 = motionEvent.getAction();
                    if (action3 == 0) {
                        c0754b.f5207p = motionEvent.getRawX();
                        c0754b.f5208q = motionEvent.getRawY();
                        z10 = false;
                        c0754b.f5204m = false;
                    } else if (action3 == 1) {
                        c0754b.f5204m = false;
                        VelocityTracker velocityTracker10 = c0750g5.f5139a;
                        if (velocityTracker10 != null) {
                            velocityTracker10.computeCurrentVelocity(1000);
                        }
                        VelocityTracker velocityTracker11 = c0750g5.f5139a;
                        float xVelocity3 = velocityTracker11 != null ? velocityTracker11.getXVelocity() : 0.0f;
                        VelocityTracker velocityTracker12 = c0750g5.f5139a;
                        float yVelocity3 = velocityTracker12 != null ? velocityTracker12.getYVelocity() : 0.0f;
                        float progress4 = motionLayout3.getProgress();
                        int i18 = c0754b.f5195d;
                        if (i18 != -1) {
                            c0754b.f5209r.m2808y(i18, progress4, c0754b.f5199h, c0754b.f5198g, c0754b.f5205n);
                            c11 = 0;
                            c10 = 1;
                        } else {
                            float fMin = Math.min(motionLayout3.getWidth(), motionLayout3.getHeight());
                            c10 = 1;
                            fArr[1] = c0754b.f5203l * fMin;
                            c11 = 0;
                            fArr[0] = fMin * c0754b.f5202k;
                        }
                        float fAbs2 = c0754b.f5202k != 0.0f ? xVelocity3 / fArr[c11] : yVelocity3 / fArr[c10];
                        float f20 = !Float.isNaN(fAbs2) ? (fAbs2 / 3.0f) + progress4 : progress4;
                        if (f20 != 0.0f && f20 != 1.0f && (i10 = c0754b.f5194c) != 3) {
                            float f21 = ((double) f20) < 0.5d ? 0.0f : 1.0f;
                            if (i10 == 6) {
                                if (progress4 + fAbs2 < 0.0f) {
                                    fAbs2 = Math.abs(fAbs2);
                                }
                                f21 = 1.0f;
                            }
                            if (c0754b.f5194c == 7) {
                                if (progress4 + fAbs2 > 1.0f) {
                                    fAbs2 = -Math.abs(fAbs2);
                                }
                                f21 = 0.0f;
                            }
                            motionLayout3.m2797I(f21, fAbs2, c0754b.f5194c);
                            if (0.0f >= progress4 || 1.0f <= progress4) {
                                motionLayout3.setState(TransitionState.FINISHED);
                            }
                        } else if (0.0f >= f20 || 1.0f <= f20) {
                            motionLayout3.setState(TransitionState.FINISHED);
                        }
                    } else if (action3 == 2) {
                        float rawY5 = motionEvent.getRawY() - c0754b.f5208q;
                        float rawX5 = motionEvent.getRawX() - c0754b.f5207p;
                        if (Math.abs((c0754b.f5203l * rawY5) + (c0754b.f5202k * rawX5)) > c0754b.f5215x || c0754b.f5204m) {
                            float progress5 = motionLayout3.getProgress();
                            if (!c0754b.f5204m) {
                                c0754b.f5204m = true;
                                motionLayout3.setProgress(progress5);
                            }
                            int i19 = c0754b.f5195d;
                            if (i19 != -1) {
                                c0754b.f5209r.m2808y(i19, progress5, c0754b.f5199h, c0754b.f5198g, c0754b.f5205n);
                                c13 = 0;
                                c12 = 1;
                            } else {
                                float fMin2 = Math.min(motionLayout3.getWidth(), motionLayout3.getHeight());
                                c12 = 1;
                                fArr[1] = c0754b.f5203l * fMin2;
                                c13 = 0;
                                fArr[0] = fMin2 * c0754b.f5202k;
                            }
                            if (Math.abs(((c0754b.f5203l * fArr[c12]) + (c0754b.f5202k * fArr[c13])) * c0754b.f5213v) < 0.01d) {
                                c14 = 0;
                                fArr[0] = 0.01f;
                                fArr[c12] = 0.01f;
                            } else {
                                c14 = 0;
                            }
                            float fMax2 = Math.max(Math.min(progress5 + (c0754b.f5202k != 0.0f ? rawX5 / fArr[c14] : rawY5 / fArr[c12]), 1.0f), 0.0f);
                            if (c0754b.f5194c == 6) {
                                fMax2 = Math.max(fMax2, 0.01f);
                            }
                            if (c0754b.f5194c == 7) {
                                fMax2 = Math.min(fMax2, 0.99f);
                            }
                            float progress6 = motionLayout3.getProgress();
                            if (fMax2 != progress6) {
                                if (progress6 == 0.0f || progress6 == 1.0f) {
                                    motionLayout3.m2804u(progress6 == 0.0f);
                                }
                                motionLayout3.setProgress(fMax2);
                                VelocityTracker velocityTracker13 = c0750g5.f5139a;
                                if (velocityTracker13 != null) {
                                    velocityTracker13.computeCurrentVelocity(1000);
                                }
                                VelocityTracker velocityTracker14 = c0750g5.f5139a;
                                float xVelocity4 = velocityTracker14 != null ? velocityTracker14.getXVelocity() : 0.0f;
                                VelocityTracker velocityTracker15 = c0750g5.f5139a;
                                motionLayout3.f5064O = c0754b.f5202k != 0.0f ? xVelocity4 / fArr[0] : (velocityTracker15 != null ? velocityTracker15.getYVelocity() : 0.0f) / fArr[1];
                            } else {
                                motionLayout3.f5064O = 0.0f;
                            }
                            c0754b.f5207p = motionEvent.getRawX();
                            c0754b.f5208q = motionEvent.getRawY();
                        }
                    }
                }
                z10 = false;
            }
            c0753a2.f5162r = motionEvent.getRawX();
            c0753a2.f5163s = motionEvent.getRawY();
            if (motionEvent.getAction() == 1 || (c0750g = c0753a2.f5159o) == null) {
                motionLayout = this;
            } else {
                VelocityTracker velocityTracker16 = c0750g.f5139a;
                if (velocityTracker16 != null) {
                    velocityTracker16.recycle();
                    c0750g2 = null;
                    c0750g.f5139a = null;
                } else {
                    c0750g2 = null;
                }
                c0753a2.f5159o = c0750g2;
                motionLayout = this;
                int i20 = motionLayout.f5068Q;
                if (i20 != -1) {
                    c0753a2.m2829a(i20, motionLayout);
                }
            }
        }
        C0753a.b bVar6 = motionLayout.f5058L.f5147c;
        if ((bVar6.f5182r & 4) != 0 ? true : z10) {
            return bVar6.f5176l.f5204m;
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof C5677o) {
            C5677o c5677o = (C5677o) view;
            if (this.f5108y0 == null) {
                this.f5108y0 = new CopyOnWriteArrayList<>();
            }
            this.f5108y0.add(c5677o);
            if (c5677o.f34641i) {
                if (this.f5106w0 == null) {
                    this.f5106w0 = new ArrayList<>();
                }
                this.f5106w0.add(c5677o);
            }
            if (c5677o.f34642j) {
                if (this.f5107x0 == null) {
                    this.f5107x0 = new ArrayList<>();
                }
                this.f5107x0.add(c5677o);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<C5677o> arrayList = this.f5106w0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<C5677o> arrayList2 = this.f5107x0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        C0753a c0753a;
        C0753a.b bVar;
        if (!this.f5051E0 && this.f5068Q == -1 && (c0753a = this.f5058L) != null && (bVar = c0753a.f5147c) != null) {
            int i10 = bVar.f5181q;
            if (i10 == 0) {
                return;
            }
            if (i10 == 2) {
                int childCount = getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    this.f5078V.get(getChildAt(i11)).f34618d = true;
                }
                return;
            }
        }
        super.requestLayout();
    }

    public void setDebugMode(int i10) {
        this.f5092i0 = i10;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z10) {
        this.f5071R0 = z10;
    }

    public void setInteractionEnabled(boolean z10) {
        this.f5076U = z10;
    }

    public void setInterpolatedProgress(float f3) {
        if (this.f5058L != null) {
            setState(TransitionState.MOVING);
            Interpolator interpolatorM2832d = this.f5058L.m2832d();
            if (interpolatorM2832d != null) {
                setProgress(interpolatorM2832d.getInterpolation(f3));
                return;
            }
        }
        setProgress(f3);
    }

    public void setOnHide(float f3) {
        ArrayList<C5677o> arrayList = this.f5107x0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f5107x0.get(i10).setProgress(f3);
            }
        }
    }

    public void setOnShow(float f3) {
        ArrayList<C5677o> arrayList = this.f5106w0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f5106w0.get(i10).setProgress(f3);
            }
        }
    }

    public void setProgress(float f3) {
        if (f3 < 0.0f || f3 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.f5065O0 == null) {
                this.f5065O0 = new C0751h();
            }
            this.f5065O0.f5140a = f3;
            return;
        }
        if (f3 <= 0.0f) {
            if (this.f5086c0 == 1.0f && this.f5068Q == this.f5070R) {
                setState(TransitionState.MOVING);
            }
            this.f5068Q = this.f5066P;
            if (this.f5086c0 == 0.0f) {
                setState(TransitionState.FINISHED);
            }
        } else if (f3 >= 1.0f) {
            if (this.f5086c0 == 0.0f && this.f5068Q == this.f5066P) {
                setState(TransitionState.MOVING);
            }
            this.f5068Q = this.f5070R;
            if (this.f5086c0 == 1.0f) {
                setState(TransitionState.FINISHED);
            }
        } else {
            this.f5068Q = -1;
            setState(TransitionState.MOVING);
        }
        if (this.f5058L == null) {
            return;
        }
        this.f5089f0 = true;
        this.f5088e0 = f3;
        this.f5085b0 = f3;
        this.f5087d0 = -1L;
        this.f5080W = -1L;
        this.f5060M = null;
        this.f5090g0 = true;
        invalidate();
    }

    public void setScene(C0753a c0753a) {
        C0754b c0754b;
        this.f5058L = c0753a;
        boolean zM2866h = m2866h();
        c0753a.f5160p = zM2866h;
        C0753a.b bVar = c0753a.f5147c;
        if (bVar != null && (c0754b = bVar.f5176l) != null) {
            c0754b.m2847c(zM2866h);
        }
        m2794F();
    }

    public void setStartState(int i10) {
        if (isAttachedToWindow()) {
            this.f5068Q = i10;
            return;
        }
        if (this.f5065O0 == null) {
            this.f5065O0 = new C0751h();
        }
        C0751h c0751h = this.f5065O0;
        c0751h.f5142c = i10;
        c0751h.f5143d = i10;
    }

    public void setState(TransitionState transitionState) {
        TransitionState transitionState2 = TransitionState.FINISHED;
        if (transitionState == transitionState2 && this.f5068Q == -1) {
            return;
        }
        TransitionState transitionState3 = this.f5073S0;
        this.f5073S0 = transitionState;
        TransitionState transitionState4 = TransitionState.MOVING;
        if (transitionState3 == transitionState4 && transitionState == transitionState4) {
            m2806w();
        }
        int i10 = C0746c.f5112a[transitionState3.ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3 && transitionState == transitionState2) {
                m2807x();
                return;
            }
            return;
        }
        if (transitionState == transitionState4) {
            m2806w();
        }
        if (transitionState == transitionState2) {
            m2807x();
        }
    }

    public void setTransition(int i10) {
        float f3;
        if (this.f5058L != null) {
            C0753a.b bVarM2789A = m2789A(i10);
            this.f5066P = bVarM2789A.f5168d;
            this.f5070R = bVarM2789A.f5167c;
            if (!isAttachedToWindow()) {
                if (this.f5065O0 == null) {
                    this.f5065O0 = new C0751h();
                }
                C0751h c0751h = this.f5065O0;
                c0751h.f5142c = this.f5066P;
                c0751h.f5143d = this.f5070R;
                return;
            }
            int i11 = this.f5068Q;
            if (i11 == this.f5066P) {
                f3 = 0.0f;
            } else {
                f3 = i11 == this.f5070R ? 1.0f : Float.NaN;
            }
            C0753a c0753a = this.f5058L;
            c0753a.f5147c = bVarM2789A;
            C0754b c0754b = bVarM2789A.f5176l;
            if (c0754b != null) {
                c0754b.m2847c(c0753a.f5160p);
            }
            this.f5075T0.m2821e(this.f5058L.m2830b(this.f5066P), this.f5058L.m2830b(this.f5070R));
            m2794F();
            if (this.f5086c0 != f3) {
                if (f3 == 0.0f) {
                    m2804u(true);
                    this.f5058L.m2830b(this.f5066P).m2891b(this);
                } else if (f3 == 1.0f) {
                    m2804u(false);
                    this.f5058L.m2830b(this.f5070R).m2891b(this);
                }
            }
            this.f5086c0 = Float.isNaN(f3) ? 0.0f : f3;
            if (Float.isNaN(f3)) {
                Log.v("MotionLayout", C5663a.m12019b() + " transitionToStart ");
                m2803t(0.0f);
                return;
            }
            setProgress(f3);
        }
    }

    public void setTransition(C0753a.b bVar) {
        C0754b c0754b;
        C0753a c0753a = this.f5058L;
        c0753a.f5147c = bVar;
        if (bVar != null && (c0754b = bVar.f5176l) != null) {
            c0754b.m2847c(c0753a.f5160p);
        }
        setState(TransitionState.SETUP);
        int i10 = this.f5068Q;
        C0753a.b bVar2 = this.f5058L.f5147c;
        int i11 = -1;
        if (i10 == (bVar2 == null ? -1 : bVar2.f5167c)) {
            this.f5086c0 = 1.0f;
            this.f5085b0 = 1.0f;
            this.f5088e0 = 1.0f;
        } else {
            this.f5086c0 = 0.0f;
            this.f5085b0 = 0.0f;
            this.f5088e0 = 0.0f;
        }
        boolean z10 = true;
        if ((bVar.f5182r & 1) == 0) {
            z10 = false;
        }
        this.f5087d0 = z10 ? -1L : getNanoTime();
        int iM2835g = this.f5058L.m2835g();
        C0753a c0753a2 = this.f5058L;
        C0753a.b bVar3 = c0753a2.f5147c;
        if (bVar3 != null) {
            i11 = bVar3.f5167c;
        }
        if (iM2835g == this.f5066P && i11 == this.f5070R) {
            return;
        }
        this.f5066P = iM2835g;
        this.f5070R = i11;
        c0753a2.m2841m(iM2835g, i11);
        C0762b c0762bM2830b = this.f5058L.m2830b(this.f5066P);
        C0762b c0762bM2830b2 = this.f5058L.m2830b(this.f5070R);
        C0749f c0749f = this.f5075T0;
        c0749f.m2821e(c0762bM2830b, c0762bM2830b2);
        int i12 = this.f5066P;
        int i13 = this.f5070R;
        c0749f.f5135e = i12;
        c0749f.f5136f = i13;
        c0749f.m2822f();
        m2794F();
    }

    public void setTransitionDuration(int i10) {
        C0753a c0753a = this.f5058L;
        if (c0753a == null) {
            Log.e("MotionLayout", "MotionScene not defined");
            return;
        }
        C0753a.b bVar = c0753a.f5147c;
        if (bVar != null) {
            bVar.f5172h = Math.max(i10, 8);
        } else {
            c0753a.f5154j = i10;
        }
    }

    public void setTransitionListener(InterfaceC0752i interfaceC0752i) {
        this.f5091h0 = interfaceC0752i;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f5065O0 == null) {
            this.f5065O0 = new C0751h();
        }
        C0751h c0751h = this.f5065O0;
        c0751h.getClass();
        c0751h.f5140a = bundle.getFloat("motion.progress");
        c0751h.f5141b = bundle.getFloat("motion.velocity");
        c0751h.f5142c = bundle.getInt("motion.StartState");
        c0751h.f5143d = bundle.getInt("motion.EndState");
        if (isAttachedToWindow()) {
            this.f5065O0.m2824a();
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m2803t(float f3) {
        C0753a c0753a = this.f5058L;
        if (c0753a == null) {
            return;
        }
        float f10 = this.f5086c0;
        float f11 = this.f5085b0;
        if (f10 != f11 && this.f5089f0) {
            this.f5086c0 = f11;
        }
        float f12 = this.f5086c0;
        if (f12 == f3) {
            return;
        }
        this.f5094k0 = false;
        this.f5088e0 = f3;
        C0753a.b bVar = c0753a.f5147c;
        this.f5084a0 = (bVar != null ? bVar.f5172h : c0753a.f5154j) / 1000.0f;
        setProgress(f3);
        this.f5060M = null;
        this.f5062N = this.f5058L.m2832d();
        this.f5089f0 = false;
        this.f5080W = getNanoTime();
        this.f5090g0 = true;
        this.f5085b0 = f12;
        this.f5086c0 = f12;
        invalidate();
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return C5663a.m12020c(this.f5066P, context) + "->" + C5663a.m12020c(this.f5070R, context) + " (pos:" + this.f5086c0 + " Dpos/Dt:" + this.f5064O;
    }

    /* JADX INFO: renamed from: u */
    public final void m2804u(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            C5676n c5676n = this.f5078V.get(getChildAt(i10));
            if (c5676n != null && "button".equals(C5663a.m12021d(c5676n.f34616b)) && c5676n.f34607A != null) {
                int i11 = 0;
                while (true) {
                    C5673k[] c5673kArr = c5676n.f34607A;
                    if (i11 < c5673kArr.length) {
                        c5673kArr[i11].m12033g(c5676n.f34616b, z10 ? -100.0f : 100.0f);
                        i11++;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:126:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:128:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:142:0x0220  */
    /* JADX WARN: Code duplicated, block: B:179:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x010e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0115  */
    /* JADX WARN: Code duplicated, block: B:85:0x0135  */
    /* JADX WARN: Code duplicated, block: B:88:0x014c  */
    /* JADX WARN: Code duplicated, block: B:89:0x014e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0156  */
    /* JADX WARN: Code duplicated, block: B:95:0x016d  */
    /* JADX WARN: Code duplicated, block: B:97:0x017d  */
    /* JADX INFO: renamed from: v */
    public final void m2805v(boolean z10) {
        boolean z11;
        char c10;
        float interpolation;
        int childCount;
        long nanoTime;
        Interpolator interpolator;
        float interpolation2;
        Interpolator interpolator2;
        int i10;
        int i11;
        int i12;
        int i13;
        View childAt;
        C5676n c5676n;
        boolean z12;
        if (this.f5087d0 == -1) {
            this.f5087d0 = getNanoTime();
        }
        float f3 = this.f5086c0;
        if (f3 > 0.0f && f3 < 1.0f) {
            this.f5068Q = -1;
        }
        boolean z13 = false;
        if (this.f5105v0 || (this.f5090g0 && (z10 || this.f5088e0 != f3))) {
            float fSignum = Math.signum(this.f5088e0 - f3);
            long nanoTime2 = getNanoTime();
            AbstractInterpolatorC5678p abstractInterpolatorC5678p = this.f5060M;
            float f10 = !(abstractInterpolatorC5678p instanceof AbstractInterpolatorC5678p) ? (((nanoTime2 - this.f5087d0) * fSignum) * 1.0E-9f) / this.f5084a0 : 0.0f;
            float f11 = this.f5086c0 + f10;
            if (this.f5089f0) {
                f11 = this.f5088e0;
            }
            if ((fSignum <= 0.0f || f11 < this.f5088e0) && (fSignum > 0.0f || f11 > this.f5088e0)) {
                z11 = false;
            } else {
                f11 = this.f5088e0;
                this.f5090g0 = false;
                z11 = true;
            }
            this.f5086c0 = f11;
            this.f5085b0 = f11;
            this.f5087d0 = nanoTime2;
            if (abstractInterpolatorC5678p == null || z11) {
                this.f5064O = f10;
            } else {
                if (this.f5094k0) {
                    interpolation = abstractInterpolatorC5678p.getInterpolation((nanoTime2 - this.f5080W) * 1.0E-9f);
                    AbstractInterpolatorC5678p abstractInterpolatorC5678p2 = this.f5060M;
                    C5463b c5463b = this.f5095l0;
                    c10 = abstractInterpolatorC5678p2 == c5463b ? c5463b.f34034c.mo5400i() ? (char) 2 : (char) 1 : (char) 0;
                    this.f5086c0 = interpolation;
                    this.f5087d0 = nanoTime2;
                    AbstractInterpolatorC5678p abstractInterpolatorC5678p3 = this.f5060M;
                    if (abstractInterpolatorC5678p3 instanceof AbstractInterpolatorC5678p) {
                        float fMo2810a = abstractInterpolatorC5678p3.mo2810a();
                        this.f5064O = fMo2810a;
                        if (Math.abs(fMo2810a) * this.f5084a0 <= 1.0E-5f && c10 == 2) {
                            this.f5090g0 = false;
                        }
                        if (fMo2810a > 0.0f && interpolation >= 1.0f) {
                            this.f5086c0 = 1.0f;
                            this.f5090g0 = false;
                            interpolation = 1.0f;
                        }
                        if (fMo2810a < 0.0f && interpolation <= 0.0f) {
                            this.f5086c0 = 0.0f;
                            this.f5090g0 = false;
                            interpolation = 0.0f;
                        }
                    }
                } else {
                    float interpolation3 = abstractInterpolatorC5678p.getInterpolation(f11);
                    AbstractInterpolatorC5678p abstractInterpolatorC5678p4 = this.f5060M;
                    if (abstractInterpolatorC5678p4 instanceof AbstractInterpolatorC5678p) {
                        this.f5064O = abstractInterpolatorC5678p4.mo2810a();
                    } else {
                        this.f5064O = ((abstractInterpolatorC5678p4.getInterpolation(f11 + f10) - interpolation3) * fSignum) / f10;
                    }
                    f11 = interpolation3;
                }
                if (Math.abs(this.f5064O) > 1.0E-5f) {
                    setState(TransitionState.MOVING);
                }
                if (c10 != 1) {
                    if ((fSignum <= 0.0f && interpolation >= this.f5088e0) || (fSignum <= 0.0f && interpolation <= this.f5088e0)) {
                        interpolation = this.f5088e0;
                        this.f5090g0 = false;
                    }
                    if (interpolation < 1.0f || interpolation <= 0.0f) {
                        this.f5090g0 = false;
                        setState(TransitionState.FINISHED);
                    }
                }
                childCount = getChildCount();
                this.f5105v0 = false;
                nanoTime = getNanoTime();
                this.f5059L0 = interpolation;
                interpolator = this.f5062N;
                if (interpolator == null) {
                    interpolation2 = interpolation;
                } else {
                    interpolation2 = interpolator.getInterpolation(interpolation);
                }
                interpolator2 = this.f5062N;
                if (interpolator2 != null) {
                    float interpolation4 = interpolator2.getInterpolation((fSignum / this.f5084a0) + interpolation);
                    this.f5064O = interpolation4;
                    this.f5064O = interpolation4 - this.f5062N.getInterpolation(interpolation);
                }
                for (i10 = 0; i10 < childCount; i10++) {
                    childAt = getChildAt(i10);
                    c5676n = this.f5078V.get(childAt);
                    if (c5676n != null) {
                        this.f5105v0 = c5676n.m12042c(interpolation2, nanoTime, childAt, this.f5061M0) | this.f5105v0;
                    }
                }
                boolean z14 = (fSignum <= 0.0f && interpolation >= this.f5088e0) || (fSignum <= 0.0f && interpolation <= this.f5088e0);
                if (!this.f5105v0 && !this.f5090g0 && z14) {
                    setState(TransitionState.FINISHED);
                }
                if (this.f5051E0) {
                    requestLayout();
                }
                this.f5105v0 = (!z14) | this.f5105v0;
                if (interpolation <= 0.0f && (i13 = this.f5066P) != -1 && this.f5068Q != i13) {
                    this.f5068Q = i13;
                    this.f5058L.m2830b(i13).m2890a(this);
                    setState(TransitionState.FINISHED);
                    z13 = true;
                }
                if (interpolation >= 1.0d) {
                    i11 = this.f5068Q;
                    i12 = this.f5070R;
                    if (i11 != i12) {
                        this.f5068Q = i12;
                        this.f5058L.m2830b(i12).m2890a(this);
                        setState(TransitionState.FINISHED);
                        z13 = true;
                    }
                }
                if (!this.f5105v0 || this.f5090g0) {
                    invalidate();
                } else if ((fSignum > 0.0f && interpolation == 1.0f) || (fSignum < 0.0f && interpolation == 0.0f)) {
                    setState(TransitionState.FINISHED);
                }
                if (!this.f5105v0 && !this.f5090g0 && ((fSignum > 0.0f && interpolation == 1.0f) || (fSignum < 0.0f && interpolation == 0.0f))) {
                    m2792D();
                }
            }
            c10 = 0;
            interpolation = f11;
            if (Math.abs(this.f5064O) > 1.0E-5f) {
                setState(TransitionState.MOVING);
            }
            if (c10 != 1) {
                if (fSignum <= 0.0f) {
                    interpolation = this.f5088e0;
                    this.f5090g0 = false;
                } else {
                    interpolation = this.f5088e0;
                    this.f5090g0 = false;
                }
                if (interpolation < 1.0f) {
                    this.f5090g0 = false;
                    setState(TransitionState.FINISHED);
                } else {
                    this.f5090g0 = false;
                    setState(TransitionState.FINISHED);
                }
            }
            childCount = getChildCount();
            this.f5105v0 = false;
            nanoTime = getNanoTime();
            this.f5059L0 = interpolation;
            interpolator = this.f5062N;
            if (interpolator == null) {
                interpolation2 = interpolation;
            } else {
                interpolation2 = interpolator.getInterpolation(interpolation);
            }
            interpolator2 = this.f5062N;
            if (interpolator2 != null) {
                float interpolation5 = interpolator2.getInterpolation((fSignum / this.f5084a0) + interpolation);
                this.f5064O = interpolation5;
                this.f5064O = interpolation5 - this.f5062N.getInterpolation(interpolation);
            }
            while (i10 < childCount) {
                childAt = getChildAt(i10);
                c5676n = this.f5078V.get(childAt);
                if (c5676n != null) {
                    this.f5105v0 = c5676n.m12042c(interpolation2, nanoTime, childAt, this.f5061M0) | this.f5105v0;
                }
            }
            if (fSignum <= 0.0f) {
            }
            if (!this.f5105v0) {
                setState(TransitionState.FINISHED);
            }
            if (this.f5051E0) {
                requestLayout();
            }
            this.f5105v0 = (!z14) | this.f5105v0;
            if (interpolation <= 0.0f) {
                this.f5068Q = i13;
                this.f5058L.m2830b(i13).m2890a(this);
                setState(TransitionState.FINISHED);
                z13 = true;
            }
            if (interpolation >= 1.0d) {
                i11 = this.f5068Q;
                i12 = this.f5070R;
                if (i11 != i12) {
                    this.f5068Q = i12;
                    this.f5058L.m2830b(i12).m2890a(this);
                    setState(TransitionState.FINISHED);
                    z13 = true;
                }
            }
            if (this.f5105v0) {
                invalidate();
            } else {
                invalidate();
            }
            if (!this.f5105v0) {
                m2792D();
            }
        }
        float f12 = this.f5086c0;
        if (f12 < 1.0f) {
            if (f12 <= 0.0f) {
                int i14 = this.f5068Q;
                int i15 = this.f5066P;
                z12 = i14 == i15 ? z13 : true;
                this.f5068Q = i15;
            }
            this.f5077U0 |= z13;
            if (z13 && !this.f5063N0) {
                requestLayout();
            }
            this.f5085b0 = this.f5086c0;
        }
        int i16 = this.f5068Q;
        int i17 = this.f5070R;
        z12 = i16 == i17 ? z13 : true;
        this.f5068Q = i17;
        z13 = z12;
        this.f5077U0 |= z13;
        if (z13) {
            requestLayout();
        }
        this.f5085b0 = this.f5086c0;
    }

    /* JADX INFO: renamed from: w */
    public final void m2806w() {
        CopyOnWriteArrayList<InterfaceC0752i> copyOnWriteArrayList;
        if (this.f5091h0 == null && ((copyOnWriteArrayList = this.f5108y0) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        if (this.f5050D0 != this.f5085b0) {
            if (this.f5049C0 != -1) {
                InterfaceC0752i interfaceC0752i = this.f5091h0;
                if (interfaceC0752i != null) {
                    interfaceC0752i.mo2827c(this.f5070R);
                }
                CopyOnWriteArrayList<InterfaceC0752i> copyOnWriteArrayList2 = this.f5108y0;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<InterfaceC0752i> it = copyOnWriteArrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().mo2827c(this.f5070R);
                    }
                }
            }
            this.f5049C0 = -1;
            float f3 = this.f5085b0;
            this.f5050D0 = f3;
            InterfaceC0752i interfaceC0752i2 = this.f5091h0;
            if (interfaceC0752i2 != null) {
                interfaceC0752i2.mo2828d(this.f5066P, this.f5070R, f3);
            }
            CopyOnWriteArrayList<InterfaceC0752i> copyOnWriteArrayList3 = this.f5108y0;
            if (copyOnWriteArrayList3 != null) {
                Iterator<InterfaceC0752i> it2 = copyOnWriteArrayList3.iterator();
                while (it2.hasNext()) {
                    it2.next().mo2828d(this.f5066P, this.f5070R, this.f5085b0);
                }
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m2807x() {
        CopyOnWriteArrayList<InterfaceC0752i> copyOnWriteArrayList;
        if ((this.f5091h0 != null || ((copyOnWriteArrayList = this.f5108y0) != null && !copyOnWriteArrayList.isEmpty())) && this.f5049C0 == -1) {
            this.f5049C0 = this.f5068Q;
            ArrayList<Integer> arrayList = this.f5083Y0;
            int iIntValue = !arrayList.isEmpty() ? arrayList.get(arrayList.size() - 1).intValue() : -1;
            int i10 = this.f5068Q;
            if (iIntValue != i10 && i10 != -1) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        m2793E();
        Runnable runnable = this.f5067P0;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m2808y(int i10, float f3, float f10, float f11, float[] fArr) {
        double[] dArr;
        View viewM2863d = m2863d(i10);
        C5676n c5676n = this.f5078V.get(viewM2863d);
        if (c5676n == null) {
            Log.w("MotionLayout", "WARNING could not find view id " + (viewM2863d == null ? C0166e.m761g("", i10) : viewM2863d.getContext().getResources().getResourceName(i10)));
            return;
        }
        float[] fArr2 = c5676n.f34636v;
        float fM12040a = c5676n.m12040a(f3, fArr2);
        AbstractC1659b[] abstractC1659bArr = c5676n.f34624j;
        C5679q c5679q = c5676n.f34620f;
        int i11 = 0;
        if (abstractC1659bArr != null) {
            double d10 = fM12040a;
            abstractC1659bArr[0].mo5373e(d10, c5676n.f34631q);
            c5676n.f34624j[0].mo5371c(d10, c5676n.f34630p);
            float f12 = fArr2[0];
            while (true) {
                dArr = c5676n.f34631q;
                if (i11 >= dArr.length) {
                    break;
                }
                dArr[i11] = dArr[i11] * ((double) f12);
                i11++;
            }
            C1658a c1658a = c5676n.f34625k;
            if (c1658a != null) {
                double[] dArr2 = c5676n.f34630p;
                if (dArr2.length > 0) {
                    c1658a.mo5371c(d10, dArr2);
                    c5676n.f34625k.mo5373e(d10, c5676n.f34631q);
                    int[] iArr = c5676n.f34629o;
                    double[] dArr3 = c5676n.f34631q;
                    double[] dArr4 = c5676n.f34630p;
                    c5679q.getClass();
                    C5679q.m12046l(f10, f11, fArr, iArr, dArr3, dArr4);
                }
            } else {
                int[] iArr2 = c5676n.f34629o;
                double[] dArr5 = c5676n.f34630p;
                c5679q.getClass();
                C5679q.m12046l(f10, f11, fArr, iArr2, dArr, dArr5);
            }
        } else {
            C5679q c5679q2 = c5676n.f34621g;
            float f13 = c5679q2.f34655e - c5679q.f34655e;
            float f14 = c5679q2.f34656f - c5679q.f34656f;
            float f15 = c5679q2.f34657g - c5679q.f34657g;
            float f16 = (c5679q2.f34658h - c5679q.f34658h) + f14;
            fArr[0] = ((f15 + f13) * f10) + ((1.0f - f10) * f13);
            fArr[1] = (f16 * f11) + ((1.0f - f11) * f14);
        }
        viewM2863d.getY();
    }

    /* JADX INFO: renamed from: z */
    public final C0762b m2809z(int i10) {
        C0753a c0753a = this.f5058L;
        if (c0753a == null) {
            return null;
        }
        return c0753a.m2830b(i10);
    }
}
