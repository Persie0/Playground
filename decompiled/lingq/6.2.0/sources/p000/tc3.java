package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public abstract class tc3 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final float f62137a;

    /* JADX INFO: renamed from: b */
    public final int f62138b;

    /* JADX INFO: renamed from: c */
    public final int f62139c;

    /* JADX INFO: renamed from: d */
    public final View f62140d;

    /* JADX INFO: renamed from: e */
    public sc3 f62141e;

    /* JADX INFO: renamed from: f */
    public sc3 f62142f;

    /* JADX INFO: renamed from: g */
    public boolean f62143g;

    /* JADX INFO: renamed from: h */
    public int f62144h;

    /* JADX INFO: renamed from: i */
    public final int[] f62145i = new int[2];

    public tc3(View view) {
        this.f62140d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f62137a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f62138b = tapTimeout;
        this.f62139c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* JADX INFO: renamed from: a */
    public final void m21947a() {
        sc3 sc3Var = this.f62142f;
        View view = this.f62140d;
        if (sc3Var != null) {
            view.removeCallbacks(sc3Var);
        }
        sc3 sc3Var2 = this.f62141e;
        if (sc3Var2 != null) {
            view.removeCallbacks(sc3Var2);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract k69 mo19446b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo19447c();

    /* JADX INFO: renamed from: d */
    public boolean mo21948d() {
        k69 k69VarMo19446b = mo19446b();
        if (k69VarMo19446b == null || !k69VarMo19446b.mo10357a()) {
            return true;
        }
        k69VarMo19446b.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        nm2 nm2VarMo10364k;
        boolean z2 = this.f62143g;
        View view2 = this.f62140d;
        if (z2) {
            k69 k69VarMo19446b = mo19446b();
            if (k69VarMo19446b != null && k69VarMo19446b.mo10357a() && (nm2VarMo10364k = k69VarMo19446b.mo10364k()) != null && nm2VarMo10364k.isShown()) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f62145i;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                nm2VarMo10364k.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zM17495b = nm2VarMo10364k.m17495b(motionEventObtainNoHistory, this.f62144h);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z3 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zM17495b && z3) {
                    z = true;
                } else if (mo21948d()) {
                    z = false;
                } else {
                    z = true;
                }
            } else if (mo21948d()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.f62144h = motionEvent.getPointerId(0);
                    if (this.f62141e == null) {
                        this.f62141e = new sc3(this, 0);
                    }
                    view2.postDelayed(this.f62141e, this.f62138b);
                    if (this.f62142f == null) {
                        this.f62142f = new sc3(this, 1);
                    }
                    view2.postDelayed(this.f62142f, this.f62139c);
                } else if (actionMasked2 == 1) {
                    m21947a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f62144h);
                    if (iFindPointerIndex >= 0) {
                        float x = motionEvent.getX(iFindPointerIndex);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float f = this.f62137a;
                        float f2 = -f;
                        if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                            m21947a();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            if (mo19447c()) {
                                z = true;
                            }
                        }
                    }
                } else if (actionMasked2 == 3) {
                    m21947a();
                }
                z = false;
            } else {
                z = false;
            }
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f62143g = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f62143g = false;
        this.f62144h = -1;
        sc3 sc3Var = this.f62141e;
        if (sc3Var != null) {
            this.f62140d.removeCallbacks(sc3Var);
        }
    }
}
