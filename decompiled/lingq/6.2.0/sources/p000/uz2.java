package p000;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class uz2 extends w28 implements c38 {

    /* JADX INFO: renamed from: C */
    public static final int[] f64560C = {R.attr.state_pressed};

    /* JADX INFO: renamed from: D */
    public static final int[] f64561D = new int[0];

    /* JADX INFO: renamed from: A */
    public int f64562A;

    /* JADX INFO: renamed from: B */
    public final RunnableC3468pp f64563B;

    /* JADX INFO: renamed from: a */
    public final int f64564a;

    /* JADX INFO: renamed from: b */
    public final int f64565b;

    /* JADX INFO: renamed from: c */
    public final StateListDrawable f64566c;

    /* JADX INFO: renamed from: d */
    public final Drawable f64567d;

    /* JADX INFO: renamed from: e */
    public final int f64568e;

    /* JADX INFO: renamed from: f */
    public final int f64569f;

    /* JADX INFO: renamed from: g */
    public final StateListDrawable f64570g;

    /* JADX INFO: renamed from: h */
    public final Drawable f64571h;

    /* JADX INFO: renamed from: i */
    public final int f64572i;

    /* JADX INFO: renamed from: j */
    public final int f64573j;

    /* JADX INFO: renamed from: k */
    public int f64574k;

    /* JADX INFO: renamed from: l */
    public int f64575l;

    /* JADX INFO: renamed from: m */
    public float f64576m;

    /* JADX INFO: renamed from: n */
    public int f64577n;

    /* JADX INFO: renamed from: o */
    public int f64578o;

    /* JADX INFO: renamed from: p */
    public float f64579p;

    /* JADX INFO: renamed from: s */
    public final RecyclerView f64582s;

    /* JADX INFO: renamed from: z */
    public final ValueAnimator f64589z;

    /* JADX INFO: renamed from: q */
    public int f64580q = 0;

    /* JADX INFO: renamed from: r */
    public int f64581r = 0;

    /* JADX INFO: renamed from: t */
    public boolean f64583t = false;

    /* JADX INFO: renamed from: u */
    public boolean f64584u = false;

    /* JADX INFO: renamed from: v */
    public int f64585v = 0;

    /* JADX INFO: renamed from: w */
    public int f64586w = 0;

    /* JADX INFO: renamed from: x */
    public final int[] f64587x = new int[2];

    /* JADX INFO: renamed from: y */
    public final int[] f64588y = new int[2];

    public uz2(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f64589z = valueAnimatorOfFloat;
        this.f64562A = 0;
        RunnableC3468pp runnableC3468pp = new RunnableC3468pp(this, 6);
        this.f64563B = runnableC3468pp;
        sz2 sz2Var = new sz2(this);
        this.f64566c = stateListDrawable;
        this.f64567d = drawable;
        this.f64570g = stateListDrawable2;
        this.f64571h = drawable2;
        this.f64568e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f64569f = Math.max(i, drawable.getIntrinsicWidth());
        this.f64572i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f64573j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f64564a = i2;
        this.f64565b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new tz2(this));
        valueAnimatorOfFloat.addUpdateListener(new gg0(this, 1));
        RecyclerView recyclerView2 = this.f64582s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.m2736e0(this);
            RecyclerView recyclerView3 = this.f64582s;
            recyclerView3.f6619L.remove(this);
            if (recyclerView3.f6621M == this) {
                recyclerView3.f6621M = null;
            }
            ArrayList arrayList = this.f64582s.f6608E0;
            if (arrayList != null) {
                arrayList.remove(sz2Var);
            }
            this.f64582s.removeCallbacks(runnableC3468pp);
        }
        this.f64582s = recyclerView;
        recyclerView.m2741i(this);
        this.f64582s.f6619L.add(this);
        this.f64582s.m2743j(sz2Var);
    }

    /* JADX INFO: renamed from: k */
    public static int m23016k(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 != 0) {
            int i5 = i - i3;
            int i6 = (int) (((f2 - f) / i4) * i5);
            int i7 = i2 + i6;
            if (i7 < i5 && i7 >= 0) {
                return i6;
            }
        }
        return 0;
    }

    @Override // p000.c38
    /* JADX INFO: renamed from: a */
    public final void mo4301a(MotionEvent motionEvent) {
        if (this.f64585v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zM23018j = m23018j(motionEvent.getX(), motionEvent.getY());
            boolean zM23017i = m23017i(motionEvent.getX(), motionEvent.getY());
            if (zM23018j || zM23017i) {
                if (zM23017i) {
                    this.f64586w = 1;
                    this.f64579p = (int) motionEvent.getX();
                } else if (zM23018j) {
                    this.f64586w = 2;
                    this.f64576m = (int) motionEvent.getY();
                }
                m23019l(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f64585v == 2) {
            this.f64576m = 0.0f;
            this.f64579p = 0.0f;
            m23019l(1);
            this.f64586w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f64585v == 2) {
            m23020m();
            int i = this.f64586w;
            RecyclerView recyclerView = this.f64582s;
            int i2 = this.f64565b;
            if (i == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.f64588y;
                iArr[0] = i2;
                int i3 = this.f64580q - i2;
                iArr[1] = i3;
                float fMax = Math.max(i2, Math.min(i3, x));
                if (Math.abs(this.f64578o - fMax) >= 2.0f) {
                    int iM23016k = m23016k(this.f64579p, fMax, iArr, recyclerView.computeHorizontalScrollRange(), recyclerView.computeHorizontalScrollOffset(), this.f64580q);
                    if (iM23016k != 0) {
                        recyclerView.scrollBy(iM23016k, 0);
                    }
                    this.f64579p = fMax;
                }
            }
            if (this.f64586w == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.f64587x;
                iArr2[0] = i2;
                int i4 = this.f64581r - i2;
                iArr2[1] = i4;
                float fMax2 = Math.max(i2, Math.min(i4, y));
                if (Math.abs(this.f64575l - fMax2) < 2.0f) {
                    return;
                }
                int iM23016k2 = m23016k(this.f64576m, fMax2, iArr2, recyclerView.computeVerticalScrollRange(), recyclerView.computeVerticalScrollOffset(), this.f64581r);
                if (iM23016k2 != 0) {
                    recyclerView.scrollBy(0, iM23016k2);
                }
                this.f64576m = fMax2;
            }
        }
    }

    @Override // p000.c38
    /* JADX INFO: renamed from: d */
    public final boolean mo4302d(MotionEvent motionEvent) {
        int i = this.f64585v;
        if (i != 1) {
            return i == 2;
        }
        boolean zM23018j = m23018j(motionEvent.getX(), motionEvent.getY());
        boolean zM23017i = m23017i(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!zM23018j && !zM23017i) {
            return false;
        }
        if (zM23017i) {
            this.f64586w = 1;
            this.f64579p = (int) motionEvent.getX();
        } else if (zM23018j) {
            this.f64586w = 2;
            this.f64576m = (int) motionEvent.getY();
        }
        m23019l(2);
        return true;
    }

    @Override // p000.c38
    /* JADX INFO: renamed from: e */
    public final void mo4303e(boolean z) {
    }

    @Override // p000.w28
    /* JADX INFO: renamed from: h */
    public final void mo12779h(Canvas canvas, RecyclerView recyclerView, k38 k38Var) {
        int i = this.f64580q;
        RecyclerView recyclerView2 = this.f64582s;
        if (i != recyclerView2.getWidth() || this.f64581r != recyclerView2.getHeight()) {
            this.f64580q = recyclerView2.getWidth();
            this.f64581r = recyclerView2.getHeight();
            m23019l(0);
            return;
        }
        if (this.f64562A != 0) {
            if (this.f64583t) {
                int i2 = this.f64580q;
                int i3 = this.f64568e;
                int i4 = i2 - i3;
                int i5 = this.f64575l;
                int i6 = this.f64574k;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.f64566c;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.f64569f;
                int i9 = this.f64581r;
                Drawable drawable = this.f64567d;
                drawable.setBounds(0, 0, i8, i9);
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i3, i7);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i3, -i7);
                } else {
                    canvas.translate(i4, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i7);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i4, -i7);
                }
            }
            if (this.f64584u) {
                int i10 = this.f64581r;
                int i11 = this.f64572i;
                int i12 = i10 - i11;
                int i13 = this.f64578o;
                int i14 = this.f64577n;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.f64570g;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.f64580q;
                int i17 = this.f64573j;
                Drawable drawable2 = this.f64571h;
                drawable2.setBounds(0, 0, i16, i17);
                canvas.translate(0.0f, i12);
                drawable2.draw(canvas);
                canvas.translate(i15, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i15, -i12);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m23017i(float f, float f2) {
        if (f2 < this.f64581r - this.f64572i) {
            return false;
        }
        int i = this.f64578o;
        int i2 = this.f64577n;
        return f >= ((float) (i - (i2 / 2))) && f <= ((float) ((i2 / 2) + i));
    }

    /* JADX INFO: renamed from: j */
    public final boolean m23018j(float f, float f2) {
        int layoutDirection = this.f64582s.getLayoutDirection();
        int i = this.f64568e;
        if (layoutDirection == 1) {
            if (f > i) {
                return false;
            }
        } else if (f < this.f64580q - i) {
            return false;
        }
        int i2 = this.f64575l;
        int i3 = this.f64574k / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i3 + i2));
    }

    /* JADX INFO: renamed from: l */
    public final void m23019l(int i) {
        RecyclerView recyclerView = this.f64582s;
        RunnableC3468pp runnableC3468pp = this.f64563B;
        StateListDrawable stateListDrawable = this.f64566c;
        if (i == 2 && this.f64585v != 2) {
            stateListDrawable.setState(f64560C);
            recyclerView.removeCallbacks(runnableC3468pp);
        }
        if (i == 0) {
            recyclerView.invalidate();
        } else {
            m23020m();
        }
        if (this.f64585v == 2 && i != 2) {
            stateListDrawable.setState(f64561D);
            recyclerView.removeCallbacks(runnableC3468pp);
            recyclerView.postDelayed(runnableC3468pp, 1200L);
        } else if (i == 1) {
            recyclerView.removeCallbacks(runnableC3468pp);
            recyclerView.postDelayed(runnableC3468pp, 1500L);
        }
        this.f64585v = i;
    }

    /* JADX INFO: renamed from: m */
    public final void m23020m() {
        int i = this.f64562A;
        ValueAnimator valueAnimator = this.f64589z;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f64562A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
