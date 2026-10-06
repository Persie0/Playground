package p000;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: hf */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0235hf implements AdapterView.OnItemClickListener, InterfaceC0243hn, InterfaceC0239hj {

    /* JADX INFO: renamed from: g */
    public Rect f27531g;

    /* JADX INFO: renamed from: v */
    protected static C0222gt m10175v(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C0222gt) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0222gt) listAdapter;
    }

    /* JADX INFO: renamed from: w */
    protected static boolean m10176w(C0225gw c0225gw) {
        int size = c0225gw.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c0225gw.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x */
    protected static int m10177x(ListAdapter listAdapter, Context context, int i) {
        int i2 = 0;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        FrameLayout frameLayout = null;
        View view = null;
        int i3 = 0;
        int i4 = 0;
        while (i2 < count) {
            int itemViewType = listAdapter.getItemViewType(i2);
            int i5 = itemViewType != i4 ? itemViewType : i4;
            if (itemViewType != i4) {
                view = null;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i2, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i3) {
                i3 = measuredWidth;
            }
            i2++;
            i4 = i5;
        }
        return i3;
    }

    @Override // p000.InterfaceC0239hj
    /* JADX INFO: renamed from: b */
    public final void mo9484b(Context context, C0225gw c0225gw) {
    }

    @Override // p000.InterfaceC0239hj
    /* JADX INFO: renamed from: g */
    public final boolean mo9489g(C0227gy c0227gy) {
        return false;
    }

    @Override // p000.InterfaceC0239hj
    /* JADX INFO: renamed from: h */
    public final boolean mo9490h(C0227gy c0227gy) {
        return false;
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo9625j(C0225gw c0225gw);

    /* JADX INFO: renamed from: l */
    public abstract void mo9627l(View view);

    /* JADX INFO: renamed from: m */
    public abstract void mo9628m(boolean z);

    /* JADX INFO: renamed from: n */
    public abstract void mo9629n(int i);

    /* JADX INFO: renamed from: o */
    public abstract void mo9630o(int i);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m10175v(listAdapter).f26308a.m9817A((MenuItem) listAdapter.getItem(i), this, true != mo9635t() ? 4 : 0);
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo9631p(PopupWindow.OnDismissListener onDismissListener);

    /* JADX INFO: renamed from: q */
    public abstract void mo9632q(boolean z);

    /* JADX INFO: renamed from: r */
    public abstract void mo9633r(int i);

    /* JADX INFO: renamed from: t */
    protected boolean mo9635t() {
        return true;
    }
}
