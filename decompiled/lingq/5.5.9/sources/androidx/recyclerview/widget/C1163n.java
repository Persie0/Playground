package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: renamed from: androidx.recyclerview.widget.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1163n extends RecyclerView.AbstractC1119l implements RecyclerView.InterfaceC1124q {

    /* JADX INFO: renamed from: C */
    public static final int[] f7351C = {R.attr.state_pressed};

    /* JADX INFO: renamed from: D */
    public static final int[] f7352D = new int[0];

    /* JADX INFO: renamed from: A */
    public int f7353A;

    /* JADX INFO: renamed from: B */
    public final a f7354B;

    /* JADX INFO: renamed from: a */
    public final int f7355a;

    /* JADX INFO: renamed from: b */
    public final int f7356b;

    /* JADX INFO: renamed from: c */
    public final StateListDrawable f7357c;

    /* JADX INFO: renamed from: d */
    public final Drawable f7358d;

    /* JADX INFO: renamed from: e */
    public final int f7359e;

    /* JADX INFO: renamed from: f */
    public final int f7360f;

    /* JADX INFO: renamed from: g */
    public final StateListDrawable f7361g;

    /* JADX INFO: renamed from: h */
    public final Drawable f7362h;

    /* JADX INFO: renamed from: i */
    public final int f7363i;

    /* JADX INFO: renamed from: j */
    public final int f7364j;

    /* JADX INFO: renamed from: k */
    public int f7365k;

    /* JADX INFO: renamed from: l */
    public int f7366l;

    /* JADX INFO: renamed from: m */
    public float f7367m;

    /* JADX INFO: renamed from: n */
    public int f7368n;

    /* JADX INFO: renamed from: o */
    public int f7369o;

    /* JADX INFO: renamed from: p */
    public float f7370p;

    /* JADX INFO: renamed from: s */
    public RecyclerView f7373s;

    /* JADX INFO: renamed from: z */
    public final ValueAnimator f7380z;

    /* JADX INFO: renamed from: q */
    public int f7371q = 0;

    /* JADX INFO: renamed from: r */
    public int f7372r = 0;

    /* JADX INFO: renamed from: t */
    public boolean f7374t = false;

    /* JADX INFO: renamed from: u */
    public boolean f7375u = false;

    /* JADX INFO: renamed from: v */
    public int f7376v = 0;

    /* JADX INFO: renamed from: w */
    public int f7377w = 0;

    /* JADX INFO: renamed from: x */
    public final int[] f7378x = new int[2];

    /* JADX INFO: renamed from: y */
    public final int[] f7379y = new int[2];

    /* JADX INFO: renamed from: androidx.recyclerview.widget.n$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1163n c1163n = C1163n.this;
            int i10 = c1163n.f7353A;
            ValueAnimator valueAnimator = c1163n.f7380z;
            if (i10 == 1) {
                valueAnimator.cancel();
            } else if (i10 != 2) {
                return;
            }
            c1163n.f7353A = 3;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
            valueAnimator.setDuration(500);
            valueAnimator.start();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.n$b */
    public class b extends RecyclerView.AbstractC1125r {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1125r
        /* JADX INFO: renamed from: b */
        public final void mo4340b(RecyclerView recyclerView, int i10, int i11) {
            int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            C1163n c1163n = C1163n.this;
            int iComputeVerticalScrollRange = c1163n.f7373s.computeVerticalScrollRange();
            int i12 = c1163n.f7372r;
            int i13 = iComputeVerticalScrollRange - i12;
            int i14 = c1163n.f7355a;
            c1163n.f7374t = i13 > 0 && i12 >= i14;
            int iComputeHorizontalScrollRange = c1163n.f7373s.computeHorizontalScrollRange();
            int i15 = c1163n.f7371q;
            boolean z10 = iComputeHorizontalScrollRange - i15 > 0 && i15 >= i14;
            c1163n.f7375u = z10;
            boolean z11 = c1163n.f7374t;
            if (!z11 && !z10) {
                if (c1163n.f7376v != 0) {
                    c1163n.m4500k(0);
                    return;
                }
                return;
            }
            if (z11) {
                float f3 = i12;
                c1163n.f7366l = (int) ((((f3 / 2.0f) + iComputeVerticalScrollOffset) * f3) / iComputeVerticalScrollRange);
                c1163n.f7365k = Math.min(i12, (i12 * i12) / iComputeVerticalScrollRange);
            }
            if (c1163n.f7375u) {
                float f10 = i15;
                c1163n.f7369o = (int) ((((f10 / 2.0f) + iComputeHorizontalScrollOffset) * f10) / iComputeHorizontalScrollRange);
                c1163n.f7368n = Math.min(i15, (i15 * i15) / iComputeHorizontalScrollRange);
            }
            int i16 = c1163n.f7376v;
            if (i16 != 0 && i16 != 1) {
                return;
            }
            c1163n.m4500k(1);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.n$c */
    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public boolean f7383a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f7383a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f7383a) {
                this.f7383a = false;
                return;
            }
            C1163n c1163n = C1163n.this;
            if (((Float) c1163n.f7380z.getAnimatedValue()).floatValue() == 0.0f) {
                c1163n.f7353A = 0;
                c1163n.m4500k(0);
            } else {
                c1163n.f7353A = 2;
                c1163n.f7373s.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.n$d */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C1163n c1163n = C1163n.this;
            c1163n.f7357c.setAlpha(iFloatValue);
            c1163n.f7358d.setAlpha(iFloatValue);
            c1163n.f7373s.invalidate();
        }
    }

    public C1163n(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f7380z = valueAnimatorOfFloat;
        this.f7353A = 0;
        a aVar = new a();
        this.f7354B = aVar;
        b bVar = new b();
        this.f7357c = stateListDrawable;
        this.f7358d = drawable;
        this.f7361g = stateListDrawable2;
        this.f7362h = drawable2;
        this.f7359e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f7360f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f7363i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f7364j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f7355a = i11;
        this.f7356b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new d());
        RecyclerView recyclerView2 = this.f7373s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.m4192a0(this);
            RecyclerView recyclerView3 = this.f7373s;
            recyclerView3.f6981M.remove(this);
            if (recyclerView3.f6983N == this) {
                recyclerView3.f6983N = null;
            }
            ArrayList arrayList = this.f7373s.f6969F0;
            if (arrayList != null) {
                arrayList.remove(bVar);
            }
            this.f7373s.removeCallbacks(aVar);
        }
        this.f7373s = recyclerView;
        if (recyclerView != null) {
            recyclerView.m4199g(this);
            this.f7373s.f6981M.add(this);
            this.f7373s.m4203i(bVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:48:0x013e  */
    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1124q
    /* JADX INFO: renamed from: a */
    public final void mo4336a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10;
        int i11;
        if (this.f7376v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zM4499j = m4499j(motionEvent.getX(), motionEvent.getY());
            boolean zM4498i = m4498i(motionEvent.getX(), motionEvent.getY());
            if (zM4499j || zM4498i) {
                if (zM4498i) {
                    this.f7377w = 1;
                    this.f7370p = (int) motionEvent.getX();
                } else if (zM4499j) {
                    this.f7377w = 2;
                    this.f7367m = (int) motionEvent.getY();
                }
                m4500k(2);
            }
        } else {
            if (motionEvent.getAction() == 1 && this.f7376v == 2) {
                this.f7367m = 0.0f;
                this.f7370p = 0.0f;
                m4500k(1);
                this.f7377w = 0;
                return;
            }
            if (motionEvent.getAction() == 2 && this.f7376v == 2) {
                m4501l();
                int i12 = this.f7377w;
                int i13 = this.f7356b;
                if (i12 == 1) {
                    float x10 = motionEvent.getX();
                    int[] iArr = this.f7379y;
                    iArr[0] = i13;
                    int i14 = this.f7371q - i13;
                    iArr[1] = i14;
                    float fMax = Math.max(i13, Math.min(i14, x10));
                    if (Math.abs(this.f7369o - fMax) >= 2.0f) {
                        float f3 = this.f7370p;
                        int iComputeHorizontalScrollRange = this.f7373s.computeHorizontalScrollRange();
                        int iComputeHorizontalScrollOffset = this.f7373s.computeHorizontalScrollOffset();
                        int i15 = this.f7371q;
                        int i16 = iArr[1] - iArr[0];
                        if (i16 == 0) {
                            i11 = 0;
                        } else {
                            int i17 = iComputeHorizontalScrollRange - i15;
                            i11 = (int) (((fMax - f3) / i16) * i17);
                            int i18 = iComputeHorizontalScrollOffset + i11;
                            if (i18 >= i17 || i18 < 0) {
                                i11 = 0;
                            }
                        }
                        if (i11 != 0) {
                            this.f7373s.scrollBy(i11, 0);
                        }
                        this.f7370p = fMax;
                    }
                }
                if (this.f7377w == 2) {
                    float y10 = motionEvent.getY();
                    int[] iArr2 = this.f7378x;
                    iArr2[0] = i13;
                    int i19 = this.f7372r - i13;
                    iArr2[1] = i19;
                    float fMax2 = Math.max(i13, Math.min(i19, y10));
                    if (Math.abs(this.f7366l - fMax2) < 2.0f) {
                        return;
                    }
                    float f10 = this.f7367m;
                    int iComputeVerticalScrollRange = this.f7373s.computeVerticalScrollRange();
                    int iComputeVerticalScrollOffset = this.f7373s.computeVerticalScrollOffset();
                    int i20 = this.f7372r;
                    int i21 = iArr2[1] - iArr2[0];
                    if (i21 == 0) {
                        i10 = 0;
                    } else {
                        int i22 = iComputeVerticalScrollRange - i20;
                        i10 = (int) (((fMax2 - f10) / i21) * i22);
                        int i23 = iComputeVerticalScrollOffset + i10;
                        if (i23 >= i22 || i23 < 0) {
                            i10 = 0;
                        }
                    }
                    if (i10 != 0) {
                        this.f7373s.scrollBy(0, i10);
                    }
                    this.f7367m = fMax2;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1124q
    /* JADX INFO: renamed from: c */
    public final boolean mo4337c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10 = this.f7376v;
        if (i10 == 1) {
            boolean zM4499j = m4499j(motionEvent.getX(), motionEvent.getY());
            boolean zM4498i = m4498i(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (zM4499j || zM4498i)) {
                if (zM4498i) {
                    this.f7377w = 1;
                    this.f7370p = (int) motionEvent.getX();
                } else if (zM4499j) {
                    this.f7377w = 2;
                    this.f7367m = (int) motionEvent.getY();
                }
                m4500k(2);
                return true;
            }
        } else if (i10 == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1124q
    /* JADX INFO: renamed from: e */
    public final void mo4338e(boolean z10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1119l
    /* JADX INFO: renamed from: h */
    public final void mo4284h(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1131x c1131x) {
        if (this.f7371q == this.f7373s.getWidth() && this.f7372r == this.f7373s.getHeight()) {
            if (this.f7353A != 0) {
                if (this.f7374t) {
                    int i10 = this.f7371q;
                    int i11 = this.f7359e;
                    int i12 = i10 - i11;
                    int i13 = this.f7366l;
                    int i14 = this.f7365k;
                    int i15 = i13 - (i14 / 2);
                    StateListDrawable stateListDrawable = this.f7357c;
                    stateListDrawable.setBounds(0, 0, i11, i14);
                    int i16 = this.f7372r;
                    int i17 = this.f7360f;
                    Drawable drawable = this.f7358d;
                    drawable.setBounds(0, 0, i17, i16);
                    RecyclerView recyclerView2 = this.f7373s;
                    WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                    boolean z10 = true;
                    if (C10029b0.e.m18686d(recyclerView2) != 1) {
                        z10 = false;
                    }
                    if (z10) {
                        drawable.draw(canvas);
                        canvas.translate(i11, i15);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(-1.0f, 1.0f);
                        canvas.translate(-i11, -i15);
                    } else {
                        canvas.translate(i12, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i15);
                        stateListDrawable.draw(canvas);
                        canvas.translate(-i12, -i15);
                    }
                }
                if (this.f7375u) {
                    int i18 = this.f7372r;
                    int i19 = this.f7363i;
                    int i20 = i18 - i19;
                    int i21 = this.f7369o;
                    int i22 = this.f7368n;
                    int i23 = i21 - (i22 / 2);
                    StateListDrawable stateListDrawable2 = this.f7361g;
                    stateListDrawable2.setBounds(0, 0, i22, i19);
                    int i24 = this.f7371q;
                    int i25 = this.f7364j;
                    Drawable drawable2 = this.f7362h;
                    drawable2.setBounds(0, 0, i24, i25);
                    canvas.translate(0.0f, i20);
                    drawable2.draw(canvas);
                    canvas.translate(i23, 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-i23, -i20);
                    return;
                }
                return;
            }
            return;
        }
        this.f7371q = this.f7373s.getWidth();
        this.f7372r = this.f7373s.getHeight();
        m4500k(0);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m4498i(float f3, float f10) {
        if (f10 >= this.f7372r - this.f7363i) {
            int i10 = this.f7369o;
            int i11 = this.f7368n;
            if (f3 >= i10 - (i11 / 2) && f3 <= (i11 / 2) + i10) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m4499j(float f3, float f10) {
        RecyclerView recyclerView = this.f7373s;
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        boolean z10 = C10029b0.e.m18686d(recyclerView) == 1;
        int i10 = this.f7359e;
        if (z10) {
            if (f3 > i10) {
                return false;
            }
        } else if (f3 < this.f7371q - i10) {
            return false;
        }
        int i11 = this.f7366l;
        int i12 = this.f7365k / 2;
        return f10 >= ((float) (i11 - i12)) && f10 <= ((float) (i12 + i11));
    }

    /* JADX INFO: renamed from: k */
    public final void m4500k(int i10) {
        a aVar = this.f7354B;
        StateListDrawable stateListDrawable = this.f7357c;
        if (i10 == 2 && this.f7376v != 2) {
            stateListDrawable.setState(f7351C);
            this.f7373s.removeCallbacks(aVar);
        }
        if (i10 == 0) {
            this.f7373s.invalidate();
        } else {
            m4501l();
        }
        if (this.f7376v == 2 && i10 != 2) {
            stateListDrawable.setState(f7352D);
            this.f7373s.removeCallbacks(aVar);
            this.f7373s.postDelayed(aVar, 1200);
        } else if (i10 == 1) {
            this.f7373s.removeCallbacks(aVar);
            this.f7373s.postDelayed(aVar, 1500);
        }
        this.f7376v = i10;
    }

    /* JADX INFO: renamed from: l */
    public final void m4501l() {
        int i10 = this.f7353A;
        ValueAnimator valueAnimator = this.f7380z;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f7353A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
