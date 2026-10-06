package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class mgi extends mgl {

    /* JADX INFO: renamed from: a */
    private Runnable f40426a;

    /* JADX INFO: renamed from: b */
    private boolean f40427b;

    /* JADX INFO: renamed from: c */
    private int f40428c;

    /* JADX INFO: renamed from: d */
    OverScroller f40429d;

    /* JADX INFO: renamed from: e */
    private int f40430e;

    /* JADX INFO: renamed from: f */
    private int f40431f;

    /* JADX INFO: renamed from: g */
    private VelocityTracker f40432g;

    public mgi() {
        this.f40428c = -1;
        this.f40431f = -1;
    }

    /* JADX INFO: renamed from: B */
    public boolean mo4761B(View view) {
        throw null;
    }

    /* JADX INFO: renamed from: D */
    public final int m16351D(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return mo4766x(coordinatorLayout, view, mo4765w() - i, i2, i3);
    }

    /* JADX INFO: renamed from: E */
    public final void m16352E(CoordinatorLayout coordinatorLayout, View view, int i) {
        mo4766x(coordinatorLayout, view, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    @Override // p000.aai
    /* JADX INFO: renamed from: d */
    public final boolean mo7d(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f40431f < 0) {
            this.f40431f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f40427b) {
            int i = this.f40428c;
            if (i == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y - this.f40430e) > this.f40431f) {
                this.f40430e = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f40428c = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = mo4761B(view) && coordinatorLayout.m1427k(view, x, y2);
            this.f40427b = z;
            if (z) {
                this.f40430e = y2;
                this.f40428c = motionEvent.getPointerId(0);
                if (this.f40432g == null) {
                    this.f40432g = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f40429d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f40429d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f40432g;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d7 A[ADDED_TO_REGION] */
    @Override // p000.aai
    /* JADX INFO: renamed from: g */
    public final boolean mo10g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        switch (motionEvent.getActionMasked()) {
            case 1:
                VelocityTracker velocityTracker3 = this.f40432g;
                if (velocityTracker3 != null) {
                    velocityTracker3.addMovement(motionEvent);
                    this.f40432g.computeCurrentVelocity(1000);
                    float yVelocity = this.f40432g.getYVelocity(this.f40428c);
                    int i = -mo4764v(view);
                    Runnable runnable = this.f40426a;
                    if (runnable != null) {
                        view.removeCallbacks(runnable);
                        this.f40426a = null;
                    }
                    if (this.f40429d == null) {
                        this.f40429d = new OverScroller(view.getContext());
                    }
                    this.f40429d.fling(0, m16355F(), 0, Math.round(yVelocity), 0, 0, i, 0);
                    if (this.f40429d.computeScrollOffset()) {
                        mgh mghVar = new mgh(this, coordinatorLayout, view);
                        this.f40426a = mghVar;
                        afb.m428i(view, mghVar);
                        z = true;
                    } else {
                        mo4768z(coordinatorLayout, view);
                        z = true;
                    }
                } else {
                    z = false;
                }
                this.f40427b = false;
                this.f40428c = -1;
                velocityTracker = this.f40432g;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f40432g = null;
                }
                velocityTracker2 = this.f40432g;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                return !this.f40427b || z;
            case 2:
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f40428c);
                if (iFindPointerIndex == -1) {
                    return false;
                }
                int y = (int) motionEvent.getY(iFindPointerIndex);
                int i2 = this.f40430e - y;
                this.f40430e = y;
                m16351D(coordinatorLayout, view, i2, mo4763u(view), 0);
                z = false;
                velocityTracker2 = this.f40432g;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (this.f40427b) {
                }
            case 3:
                z = false;
                this.f40427b = false;
                this.f40428c = -1;
                velocityTracker = this.f40432g;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f40432g = null;
                }
                velocityTracker2 = this.f40432g;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (this.f40427b) {
                }
            case 4:
            case 5:
            default:
                z = false;
                velocityTracker2 = this.f40432g;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (this.f40427b) {
                }
            case 6:
                int i3 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                this.f40428c = motionEvent.getPointerId(i3);
                this.f40430e = (int) (motionEvent.getY(i3) + 0.5f);
                z = false;
                velocityTracker2 = this.f40432g;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (this.f40427b) {
                }
        }
    }

    /* JADX INFO: renamed from: u */
    public int mo4763u(View view) {
        throw null;
    }

    /* JADX INFO: renamed from: v */
    public int mo4764v(View view) {
        throw null;
    }

    /* JADX INFO: renamed from: w */
    public int mo4765w() {
        throw null;
    }

    /* JADX INFO: renamed from: x */
    public int mo4766x(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        throw null;
    }

    /* JADX INFO: renamed from: z */
    public void mo4768z(CoordinatorLayout coordinatorLayout, View view) {
        throw null;
    }

    public mgi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40428c = -1;
        this.f40431f = -1;
    }
}
