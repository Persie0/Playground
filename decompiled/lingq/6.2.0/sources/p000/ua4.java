package p000;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ua4 implements c38 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ za4 f63638a;

    public ua4(za4 za4Var) {
        this.f63638a = za4Var;
    }

    @Override // p000.c38
    /* JADX INFO: renamed from: a */
    public final void mo4301a(MotionEvent motionEvent) {
        za4 za4Var = this.f63638a;
        RunnableC3468pp runnableC3468pp = za4Var.f71278r;
        za4Var.f71283w.onTouchEvent(motionEvent);
        VelocityTracker velocityTracker = za4Var.f71279s;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (za4Var.f71272l == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int iFindPointerIndex = motionEvent.findPointerIndex(za4Var.f71272l);
        if (iFindPointerIndex >= 0 && za4Var.f71263c == null && actionMasked == 2 && za4Var.f71274n != 2) {
            za4Var.f71273m.getClass();
        }
        o38 o38Var = za4Var.f71263c;
        if (o38Var == null) {
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (iFindPointerIndex >= 0) {
                    za4Var.m25527q(motionEvent, za4Var.f71275o, iFindPointerIndex);
                    za4Var.m25525o(o38Var);
                    za4Var.f71277q.removeCallbacks(runnableC3468pp);
                    runnableC3468pp.run();
                    za4Var.f71277q.invalidate();
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                int actionIndex = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex) == za4Var.f71272l) {
                    za4Var.f71272l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    za4Var.m25527q(motionEvent, za4Var.f71275o, actionIndex);
                    return;
                }
                return;
            }
            VelocityTracker velocityTracker2 = za4Var.f71279s;
            if (velocityTracker2 != null) {
                velocityTracker2.clear();
            }
        }
        za4Var.m25526p(null, 0);
        za4Var.f71272l = -1;
    }

    @Override // p000.c38
    /* JADX INFO: renamed from: d */
    public final boolean mo4302d(MotionEvent motionEvent) {
        za4 za4Var = this.f63638a;
        gld gldVar = za4Var.f71273m;
        za4Var.f71283w.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        va4 va4Var = null;
        if (actionMasked == 0) {
            za4Var.f71272l = motionEvent.getPointerId(0);
            za4Var.f71264d = motionEvent.getX();
            za4Var.f71265e = motionEvent.getY();
            VelocityTracker velocityTracker = za4Var.f71279s;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            za4Var.f71279s = VelocityTracker.obtain();
            if (za4Var.f71263c == null) {
                ArrayList arrayList = za4Var.f71276p;
                if (!arrayList.isEmpty()) {
                    View viewM25523l = za4Var.m25523l(motionEvent);
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        va4 va4Var2 = (va4) arrayList.get(size);
                        if (va4Var2.f65126e.f53781a == viewM25523l) {
                            va4Var = va4Var2;
                            break;
                        }
                    }
                }
                if (va4Var != null) {
                    o38 o38Var = va4Var.f65126e;
                    za4Var.f71264d -= va4Var.f65130i;
                    za4Var.f71265e -= va4Var.f65131j;
                    za4Var.m25522k(o38Var, true);
                    if (za4Var.f71261a.remove(o38Var.f53781a)) {
                        gldVar.m12740a(za4Var.f71277q, o38Var);
                    }
                    za4Var.m25526p(o38Var, va4Var.f65127f);
                    za4Var.m25527q(motionEvent, za4Var.f71275o, 0);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            za4Var.f71272l = -1;
            za4Var.m25526p(null, 0);
        } else {
            int i = za4Var.f71272l;
            if (i != -1 && motionEvent.findPointerIndex(i) >= 0 && za4Var.f71263c == null && actionMasked == 2 && za4Var.f71274n != 2) {
                gldVar.getClass();
            }
        }
        VelocityTracker velocityTracker2 = za4Var.f71279s;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return za4Var.f71263c != null;
    }

    @Override // p000.c38
    /* JADX INFO: renamed from: e */
    public final void mo4303e(boolean z) {
        if (z) {
            this.f63638a.m25526p(null, 0);
        }
    }
}
