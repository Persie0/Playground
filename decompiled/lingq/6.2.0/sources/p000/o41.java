package p000;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class o41 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public nt2 f53814a;

    /* JADX INFO: renamed from: b */
    public WeakReference f53815b;

    /* JADX INFO: renamed from: c */
    public WeakReference f53816c;

    /* JADX INFO: renamed from: d */
    public View.OnClickListener f53817d;

    /* JADX INFO: renamed from: e */
    public boolean f53818e;

    /* JADX INFO: renamed from: a */
    public final boolean m17799a() {
        return this.f53818e;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            view.getClass();
            View.OnClickListener onClickListener = this.f53817d;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            View view2 = (View) this.f53816c.get();
            View view3 = (View) this.f53815b.get();
            if (view2 == null || view3 == null) {
                return;
            }
            nt2 nt2Var = this.f53814a;
            nt2Var.getClass();
            q41.m19638l(nt2Var, view2, view3);
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }
}
