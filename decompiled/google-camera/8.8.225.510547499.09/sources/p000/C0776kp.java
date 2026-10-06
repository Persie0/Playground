package p000;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

/* JADX INFO: renamed from: kp */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0776kp extends C0166er implements InterfaceC0816mb {

    /* JADX INFO: renamed from: r */
    private static final int[] f36726r = {R.attr.state_pressed};

    /* JADX INFO: renamed from: s */
    private static final int[] f36727s = new int[0];

    /* JADX INFO: renamed from: D */
    private final Runnable f36731D;

    /* JADX INFO: renamed from: E */
    private final C0167es f36732E;

    /* JADX INFO: renamed from: a */
    public final int f36733a;

    /* JADX INFO: renamed from: b */
    public final StateListDrawable f36734b;

    /* JADX INFO: renamed from: c */
    public final Drawable f36735c;

    /* JADX INFO: renamed from: d */
    int f36736d;

    /* JADX INFO: renamed from: e */
    int f36737e;

    /* JADX INFO: renamed from: f */
    float f36738f;

    /* JADX INFO: renamed from: g */
    int f36739g;

    /* JADX INFO: renamed from: h */
    int f36740h;

    /* JADX INFO: renamed from: i */
    float f36741i;

    /* JADX INFO: renamed from: l */
    public RecyclerView f36744l;

    /* JADX INFO: renamed from: p */
    public final ValueAnimator f36748p;

    /* JADX INFO: renamed from: q */
    public int f36749q;

    /* JADX INFO: renamed from: t */
    private final int f36750t;

    /* JADX INFO: renamed from: u */
    private final int f36751u;

    /* JADX INFO: renamed from: v */
    private final int f36752v;

    /* JADX INFO: renamed from: w */
    private final StateListDrawable f36753w;

    /* JADX INFO: renamed from: x */
    private final Drawable f36754x;

    /* JADX INFO: renamed from: y */
    private final int f36755y;

    /* JADX INFO: renamed from: z */
    private final int f36756z;

    /* JADX INFO: renamed from: j */
    public int f36742j = 0;

    /* JADX INFO: renamed from: k */
    public int f36743k = 0;

    /* JADX INFO: renamed from: m */
    public boolean f36745m = false;

    /* JADX INFO: renamed from: n */
    public boolean f36746n = false;

    /* JADX INFO: renamed from: o */
    public int f36747o = 0;

    /* JADX INFO: renamed from: A */
    private int f36728A = 0;

    /* JADX INFO: renamed from: B */
    private final int[] f36729B = new int[2];

    /* JADX INFO: renamed from: C */
    private final int[] f36730C = new int[2];

    public C0776kp(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f36748p = valueAnimatorOfFloat;
        this.f36749q = 0;
        this.f36731D = new RunnableC0059be(this, 14);
        C0774kn c0774kn = new C0774kn(this);
        this.f36732E = c0774kn;
        this.f36734b = stateListDrawable;
        this.f36735c = drawable;
        this.f36753w = stateListDrawable2;
        this.f36754x = drawable2;
        this.f36751u = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f36752v = Math.max(i, drawable.getIntrinsicWidth());
        this.f36755y = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f36756z = Math.max(i, drawable2.getIntrinsicWidth());
        this.f36733a = i2;
        this.f36750t = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new C0775ko(this));
        valueAnimatorOfFloat.addUpdateListener(new afx(this, 1));
        RecyclerView recyclerView2 = this.f36744l;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            AbstractC0812ly abstractC0812ly = recyclerView2.f1124n;
            if (abstractC0812ly != null) {
                abstractC0812ly.mo1154N("Cannot remove item decoration during a scroll  or layout");
            }
            recyclerView2.f1126p.remove(this);
            if (recyclerView2.f1126p.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.m1211J();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f36744l;
            recyclerView3.f1127q.remove(this);
            if (recyclerView3.f1128r == this) {
                recyclerView3.f1128r = null;
            }
            this.f36744l.m1249ay(c0774kn);
            m14650B();
        }
        this.f36744l = recyclerView;
        if (recyclerView != null) {
            recyclerView.m1246av(this);
            this.f36744l.m1259p(this);
            this.f36744l.m1247aw(c0774kn);
        }
    }

    /* JADX INFO: renamed from: B */
    private final void m14650B() {
        this.f36744l.removeCallbacks(this.f36731D);
    }

    /* JADX INFO: renamed from: C */
    private final void m14651C(int i) {
        m14650B();
        this.f36744l.postDelayed(this.f36731D, i);
    }

    /* JADX INFO: renamed from: D */
    private final boolean m14652D() {
        return afc.m442c(this.f36744l) == 1;
    }

    /* JADX INFO: renamed from: E */
    private static final int m14653E(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    @Override // p000.InterfaceC0816mb
    /* JADX INFO: renamed from: A */
    public final void mo11897A(MotionEvent motionEvent) {
        if (this.f36747o == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zM14658x = m14658x(motionEvent.getX(), motionEvent.getY());
            boolean zM14657w = m14657w(motionEvent.getX(), motionEvent.getY());
            if (zM14658x) {
                if (!zM14657w) {
                    this.f36728A = 2;
                    this.f36738f = (int) motionEvent.getY();
                }
                m14655u(2);
                return;
            }
            if (!zM14657w) {
                return;
            }
            this.f36728A = 1;
            this.f36741i = (int) motionEvent.getX();
            m14655u(2);
            return;
        }
        if (motionEvent.getAction() == 1 && this.f36747o == 2) {
            this.f36738f = 0.0f;
            this.f36741i = 0.0f;
            m14655u(1);
            this.f36728A = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f36747o == 2) {
            m14656v();
            if (this.f36728A == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.f36730C;
                int i = this.f36750t;
                iArr[0] = i;
                int i2 = this.f36742j - i;
                iArr[1] = i2;
                float fMax = Math.max(i, Math.min(i2, x));
                if (Math.abs(this.f36740h - fMax) >= 2.0f) {
                    int iM14653E = m14653E(this.f36741i, fMax, iArr, this.f36744l.computeHorizontalScrollRange(), this.f36744l.computeHorizontalScrollOffset(), this.f36742j);
                    if (iM14653E != 0) {
                        this.f36744l.scrollBy(iM14653E, 0);
                    }
                    this.f36741i = fMax;
                }
            }
            if (this.f36728A == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.f36729B;
                int i3 = this.f36750t;
                iArr2[0] = i3;
                int i4 = this.f36743k - i3;
                iArr2[1] = i4;
                float fMax2 = Math.max(i3, Math.min(i4, y));
                if (Math.abs(this.f36737e - fMax2) >= 2.0f) {
                    int iM14653E2 = m14653E(this.f36738f, fMax2, iArr2, this.f36744l.computeVerticalScrollRange(), this.f36744l.computeVerticalScrollOffset(), this.f36743k);
                    if (iM14653E2 != 0) {
                        this.f36744l.scrollBy(0, iM14653E2);
                    }
                    this.f36738f = fMax2;
                }
            }
        }
    }

    @Override // p000.C0166er
    /* JADX INFO: renamed from: g */
    public final void mo1750g(Canvas canvas, RecyclerView recyclerView) {
        if (this.f36742j != this.f36744l.getWidth() || this.f36743k != this.f36744l.getHeight()) {
            this.f36742j = this.f36744l.getWidth();
            this.f36743k = this.f36744l.getHeight();
            m14655u(0);
            return;
        }
        if (this.f36749q != 0) {
            if (this.f36745m) {
                int i = this.f36742j;
                int i2 = this.f36751u;
                int i3 = i - i2;
                int i4 = this.f36737e;
                int i5 = this.f36736d;
                int i6 = i4 - (i5 / 2);
                this.f36734b.setBounds(0, 0, i2, i5);
                this.f36735c.setBounds(0, 0, this.f36752v, this.f36743k);
                if (m14652D()) {
                    this.f36735c.draw(canvas);
                    canvas.translate(this.f36751u, i6);
                    canvas.scale(-1.0f, 1.0f);
                    this.f36734b.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-this.f36751u, -i6);
                } else {
                    canvas.translate(i3, 0.0f);
                    this.f36735c.draw(canvas);
                    canvas.translate(0.0f, i6);
                    this.f36734b.draw(canvas);
                    canvas.translate(-i3, -i6);
                }
            }
            if (this.f36746n) {
                int i7 = this.f36743k;
                int i8 = this.f36755y;
                int i9 = i7 - i8;
                int i10 = this.f36740h;
                int i11 = this.f36739g;
                int i12 = i10 - (i11 / 2);
                this.f36753w.setBounds(0, 0, i11, i8);
                this.f36754x.setBounds(0, 0, this.f36742j, this.f36756z);
                canvas.translate(0.0f, i9);
                this.f36754x.draw(canvas);
                canvas.translate(i12, 0.0f);
                this.f36753w.draw(canvas);
                canvas.translate(-i12, -i9);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m14654t() {
        this.f36744l.invalidate();
    }

    /* JADX INFO: renamed from: u */
    final void m14655u(int i) {
        if (i == 2 && this.f36747o != 2) {
            this.f36734b.setState(f36726r);
            m14650B();
        }
        if (i == 0) {
            m14654t();
        } else {
            m14656v();
        }
        if (this.f36747o == 2 && i != 2) {
            this.f36734b.setState(f36727s);
            m14651C(1200);
        } else if (i == 1) {
            m14651C(1500);
        }
        this.f36747o = i;
    }

    /* JADX INFO: renamed from: v */
    public final void m14656v() {
        switch (this.f36749q) {
            case 0:
                break;
            case 3:
                this.f36748p.cancel();
                break;
            default:
                return;
        }
        this.f36749q = 1;
        ValueAnimator valueAnimator = this.f36748p;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f36748p.setDuration(500L);
        this.f36748p.setStartDelay(0L);
        this.f36748p.start();
    }

    /* JADX INFO: renamed from: w */
    final boolean m14657w(float f, float f2) {
        if (f2 < this.f36743k - this.f36755y) {
            return false;
        }
        int i = this.f36740h;
        int i2 = this.f36739g / 2;
        return f >= ((float) (i - i2)) && f <= ((float) (i + i2));
    }

    /* JADX INFO: renamed from: x */
    final boolean m14658x(float f, float f2) {
        if (m14652D()) {
            if (f > this.f36751u) {
                return false;
            }
        } else if (f < this.f36742j - this.f36751u) {
            return false;
        }
        int i = this.f36737e;
        int i2 = this.f36736d / 2;
        return f2 >= ((float) (i - i2)) && f2 <= ((float) (i + i2));
    }

    @Override // p000.InterfaceC0816mb
    /* JADX INFO: renamed from: y */
    public final boolean mo11898y(MotionEvent motionEvent) {
        int i = this.f36747o;
        if (i != 1) {
            return i == 2;
        }
        boolean zM14658x = m14658x(motionEvent.getX(), motionEvent.getY());
        boolean zM14657w = m14657w(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (zM14658x) {
            if (!zM14657w) {
                this.f36728A = 2;
                this.f36738f = (int) motionEvent.getY();
            }
            m14655u(2);
            return true;
        }
        if (!zM14657w) {
            return false;
        }
        this.f36728A = 1;
        this.f36741i = (int) motionEvent.getX();
        m14655u(2);
        return true;
    }

    @Override // p000.InterfaceC0816mb
    /* JADX INFO: renamed from: z */
    public final void mo11899z() {
    }
}
