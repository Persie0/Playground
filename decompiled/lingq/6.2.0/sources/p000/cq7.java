package p000;

import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class cq7 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final nt2 f34387a;

    /* JADX INFO: renamed from: b */
    public final WeakReference f34388b;

    /* JADX INFO: renamed from: c */
    public final WeakReference f34389c;

    /* JADX INFO: renamed from: d */
    public final View.OnTouchListener f34390d;

    /* JADX INFO: renamed from: e */
    public final boolean f34391e = true;

    public cq7(nt2 nt2Var, View view, View view2) {
        this.f34387a = nt2Var;
        this.f34388b = new WeakReference(view2);
        this.f34389c = new WeakReference(view);
        this.f34390d = mta.m17039g(view2);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m9849a() {
        return this.f34391e;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        view.getClass();
        motionEvent.getClass();
        View view2 = (View) this.f34389c.get();
        View view3 = (View) this.f34388b.get();
        if (view2 != null && view3 != null && motionEvent.getAction() == 1) {
            q41.m19638l(this.f34387a, view2, view3);
        }
        View.OnTouchListener onTouchListener = this.f34390d;
        return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
    }
}
