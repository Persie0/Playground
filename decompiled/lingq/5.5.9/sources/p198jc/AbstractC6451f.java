package p198jc;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import p338qd.C8573r0;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: renamed from: jc.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6451f<V extends View> extends C6453h<V> {

    /* JADX INFO: renamed from: c */
    public a f37005c;

    /* JADX INFO: renamed from: d */
    public OverScroller f37006d;

    /* JADX INFO: renamed from: e */
    public boolean f37007e;

    /* JADX INFO: renamed from: f */
    public int f37008f;

    /* JADX INFO: renamed from: g */
    public int f37009g;

    /* JADX INFO: renamed from: h */
    public int f37010h;

    /* JADX INFO: renamed from: i */
    public VelocityTracker f37011i;

    /* JADX INFO: renamed from: jc.f$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final CoordinatorLayout f37012a;

        /* JADX INFO: renamed from: b */
        public final V f37013b;

        public a(CoordinatorLayout coordinatorLayout, V v10) {
            this.f37012a = coordinatorLayout;
            this.f37013b = v10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AbstractC6451f abstractC6451f;
            OverScroller overScroller;
            V v10 = this.f37013b;
            if (v10 == null || (overScroller = (abstractC6451f = AbstractC6451f.this).f37006d) == null) {
                return;
            }
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            CoordinatorLayout coordinatorLayout = this.f37012a;
            if (!zComputeScrollOffset) {
                abstractC6451f.mo8562y(v10, coordinatorLayout);
                return;
            }
            abstractC6451f.m13069A(coordinatorLayout, v10, abstractC6451f.f37006d.getCurrY());
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.d.m18676m(v10, this);
        }
    }

    public AbstractC6451f() {
        this.f37008f = -1;
        this.f37010h = -1;
    }

    public AbstractC6451f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37008f = -1;
        this.f37010h = -1;
    }

    /* JADX INFO: renamed from: A */
    public final void m13069A(CoordinatorLayout coordinatorLayout, View view, int i10) {
        mo8563z(coordinatorLayout, view, i10, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
    /* JADX INFO: renamed from: g */
    public final boolean mo2941g(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f37010h < 0) {
            this.f37010h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f37007e) {
            int i10 = this.f37008f;
            if (i10 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i10)) != -1) {
                int y10 = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y10 - this.f37009g) > this.f37010h) {
                    this.f37009g = y10;
                    return true;
                }
            }
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f37008f = -1;
            int x10 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            boolean z10 = mo8559v(v10) && coordinatorLayout.m2926j(v10, x10, y11);
            this.f37007e = z10;
            if (z10) {
                this.f37009g = y11;
                this.f37008f = motionEvent.getPointerId(0);
                if (this.f37011i == null) {
                    this.f37011i = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f37006d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f37006d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f37011i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:47:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
    /* JADX INFO: renamed from: r */
    public final boolean mo2952r(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z10;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f37008f);
                if (iFindPointerIndex == -1) {
                    return false;
                }
                int y10 = (int) motionEvent.getY(iFindPointerIndex);
                int i10 = this.f37009g - y10;
                this.f37009g = y10;
                mo8563z(coordinatorLayout, v10, mo8558t() - i10, mo8560w(v10), 0);
            } else if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i11 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.f37008f = motionEvent.getPointerId(i11);
                    this.f37009g = (int) (motionEvent.getY(i11) + 0.5f);
                }
            }
            z10 = false;
            velocityTracker2 = this.f37011i;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return !this.f37007e || z10;
        }
        VelocityTracker velocityTracker3 = this.f37011i;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.f37011i.computeCurrentVelocity(1000);
            float yVelocity = this.f37011i.getYVelocity(this.f37008f);
            int i12 = -mo8561x(v10);
            a aVar = this.f37005c;
            if (aVar != null) {
                v10.removeCallbacks(aVar);
                this.f37005c = null;
            }
            if (this.f37006d == null) {
                this.f37006d = new OverScroller(v10.getContext());
            }
            this.f37006d.fling(0, m13071s(), 0, Math.round(yVelocity), 0, 0, i12, 0);
            if (this.f37006d.computeScrollOffset()) {
                a aVar2 = new a(coordinatorLayout, v10);
                this.f37005c = aVar2;
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                C10029b0.d.m18676m(v10, aVar2);
            } else {
                mo8562y(v10, coordinatorLayout);
            }
            z10 = true;
        }
        this.f37007e = false;
        this.f37008f = -1;
        velocityTracker = this.f37011i;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f37011i = null;
        }
        velocityTracker2 = this.f37011i;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.f37007e) {
            return true;
        }
        z10 = false;
        this.f37007e = false;
        this.f37008f = -1;
        velocityTracker = this.f37011i;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f37011i = null;
        }
        velocityTracker2 = this.f37011i;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.f37007e) {
            return true;
        }
    }

    /* JADX INFO: renamed from: v */
    public boolean mo8559v(V v10) {
        return false;
    }

    /* JADX INFO: renamed from: w */
    public int mo8560w(V v10) {
        return -v10.getHeight();
    }

    /* JADX INFO: renamed from: x */
    public int mo8561x(V v10) {
        return v10.getHeight();
    }

    /* JADX INFO: renamed from: y */
    public void mo8562y(View view, CoordinatorLayout coordinatorLayout) {
    }

    /* JADX INFO: renamed from: z */
    public int mo8563z(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12) {
        int iM16699T;
        int iM13071s = m13071s();
        if (i11 == 0 || iM13071s < i11 || iM13071s > i12 || iM13071s == (iM16699T = C8573r0.m16699T(i10, i11, i12))) {
            return 0;
        }
        C6454i c6454i = this.f37019a;
        if (c6454i == null) {
            this.f37020b = iM16699T;
        } else if (c6454i.f37024d != iM16699T) {
            c6454i.f37024d = iM16699T;
            c6454i.m13072a();
        }
        return iM13071s - iM16699T;
    }
}
