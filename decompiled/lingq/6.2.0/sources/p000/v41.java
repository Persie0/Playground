package p000;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v41 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {

    /* JADX INFO: renamed from: a */
    public final WeakReference f64827a;

    /* JADX INFO: renamed from: b */
    public ArrayList f64828b;

    /* JADX INFO: renamed from: c */
    public final HashSet f64829c;

    /* JADX INFO: renamed from: d */
    public final String f64830d;

    public v41(View view, Handler handler, HashSet hashSet, String str) {
        handler.getClass();
        hashSet.getClass();
        this.f64827a = new WeakReference(view);
        this.f64829c = hashSet;
        this.f64830d = str;
        handler.postDelayed(this, 200L);
    }

    /* JADX INFO: renamed from: a */
    public final void m23095a() {
        AdapterView adapterView;
        ArrayList arrayList = this.f64828b;
        if (arrayList != null) {
            WeakReference weakReference = this.f64827a;
            if (weakReference.get() != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    nt2 nt2Var = (nt2) arrayList.get(i);
                    View view = (View) weakReference.get();
                    if (nt2Var != null && view != null) {
                        int length = nt2Var.m17613a().length();
                        String str = this.f64830d;
                        if (length == 0 || nt2Var.m17613a().equals(str)) {
                            List listM17615c = nt2Var.m17615c();
                            if (listM17615c.size() <= 25) {
                                for (u41 u41Var : AbstractC3695vr.m23498i(view, listM17615c, 0, -1, str)) {
                                    try {
                                        View viewM22444a = u41Var.m22444a();
                                        if (viewM22444a != null) {
                                            View viewM17034a = mta.m17034a(viewM22444a);
                                            boolean z = true;
                                            HashSet hashSet = this.f64829c;
                                            if (viewM17034a != null && mta.f51832a.m17047m(viewM22444a, viewM17034a)) {
                                                View viewM22444a2 = u41Var.m22444a();
                                                if (viewM22444a2 != null) {
                                                    String strM22445b = u41Var.m22445b();
                                                    View.OnTouchListener onTouchListenerM17039g = mta.m17039g(viewM22444a2);
                                                    if (!(onTouchListenerM17039g instanceof cq7) || !((cq7) onTouchListenerM17039g).m9849a()) {
                                                        z = false;
                                                    }
                                                    if (!hashSet.contains(strM22445b) && !z) {
                                                        viewM22444a2.setOnTouchListener(dq7.m10584a(nt2Var, view, viewM22444a2));
                                                        hashSet.add(strM22445b);
                                                    }
                                                }
                                            } else if (!cl9.m4842Y(viewM22444a.getClass().getName(), "com.facebook.react", false)) {
                                                if (!(viewM22444a instanceof AdapterView)) {
                                                    View viewM22444a3 = u41Var.m22444a();
                                                    if (viewM22444a3 != null) {
                                                        String strM22445b2 = u41Var.m22445b();
                                                        View.OnClickListener onClickListenerM17038f = mta.m17038f(viewM22444a3);
                                                        if (!(onClickListenerM17038f instanceof o41) || !((o41) onClickListenerM17038f).m17799a()) {
                                                            z = false;
                                                        }
                                                        if (!hashSet.contains(strM22445b2) && !z) {
                                                            viewM22444a3.setOnClickListener(q41.m19636j(nt2Var, view, viewM22444a3));
                                                            hashSet.add(strM22445b2);
                                                        }
                                                    }
                                                } else if ((viewM22444a instanceof ListView) && (adapterView = (AdapterView) u41Var.m22444a()) != null) {
                                                    String strM22445b3 = u41Var.m22445b();
                                                    AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
                                                    if (!(onItemClickListener instanceof p41) || !((p41) onItemClickListener).m18881a()) {
                                                        z = false;
                                                    }
                                                    if (!hashSet.contains(strM22445b3) && !z) {
                                                        adapterView.setOnItemClickListener(q41.m19637k(nt2Var, view, adapterView));
                                                        hashSet.add(strM22445b3);
                                                    }
                                                }
                                            }
                                        }
                                    } catch (Exception unused) {
                                        lp1.f49971a.contains(w41.class);
                                        sy2 sy2Var = sy2.f61585a;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        m23095a();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        m23095a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            w23 w23VarM24854b = y23.m24854b(sy2.m21767b());
            if (w23VarM24854b != null && w23VarM24854b.f66258g) {
                this.f64828b = ocd.m17928b(w23VarM24854b.f66259h);
                View view = (View) this.f64827a.get();
                if (view == null) {
                    return;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnGlobalLayoutListener(this);
                    viewTreeObserver.addOnScrollChangedListener(this);
                }
                m23095a();
            }
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }
}
