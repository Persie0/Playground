package p000;

import android.view.View;
import android.widget.AdapterView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class p41 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public nt2 f55541a;

    /* JADX INFO: renamed from: b */
    public WeakReference f55542b;

    /* JADX INFO: renamed from: c */
    public WeakReference f55543c;

    /* JADX INFO: renamed from: d */
    public AdapterView.OnItemClickListener f55544d;

    /* JADX INFO: renamed from: e */
    public boolean f55545e;

    /* JADX INFO: renamed from: a */
    public final boolean m18881a() {
        return this.f55545e;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        view.getClass();
        AdapterView.OnItemClickListener onItemClickListener = this.f55544d;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(adapterView, view, i, j);
        }
        View view2 = (View) this.f55543c.get();
        AdapterView adapterView2 = (AdapterView) this.f55542b.get();
        if (view2 == null || adapterView2 == null) {
            return;
        }
        q41.m19638l(this.f55541a, view2, adapterView2);
    }
}
