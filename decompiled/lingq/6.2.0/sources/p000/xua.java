package p000;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class xua {

    /* JADX INFO: renamed from: a */
    public final WeakReference f68829a;

    public xua(View view) {
        this.f68829a = new WeakReference(view);
    }

    /* JADX INFO: renamed from: a */
    public final void m24703a(float f) {
        View view = (View) this.f68829a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m24704b() {
        View view = (View) this.f68829a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m24705c(long j) {
        View view = (View) this.f68829a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m24706d(zua zuaVar) {
        View view = (View) this.f68829a.get();
        if (view != null) {
            if (zuaVar != null) {
                view.animate().setListener(new ss3(2, view, zuaVar));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m24707e(float f) {
        View view = (View) this.f68829a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
