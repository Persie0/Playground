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

/* JADX INFO: loaded from: classes2.dex */
public abstract class uw5 implements k69, ex5, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public Rect f64467a;

    /* JADX INFO: renamed from: o */
    public static int m22968o(ListAdapter listAdapter, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: g */
    public final boolean mo707g(mw5 mw5Var) {
        return false;
    }

    @Override // p000.ex5
    public final int getId() {
        return 0;
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: j */
    public final boolean mo710j(mw5 mw5Var) {
        return false;
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: l */
    public final void mo712l(Context context, hw5 hw5Var) {
    }

    /* JADX INFO: renamed from: n */
    public abstract void mo16399n(hw5 hw5Var);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (ew5) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (ew5) listAdapter).f37988a.m13534q((MenuItem) listAdapter.getItem(i), this, !(this instanceof lo0) ? 0 : 4);
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo16400p(View view);

    /* JADX INFO: renamed from: q */
    public abstract void mo16401q(boolean z);

    /* JADX INFO: renamed from: r */
    public abstract void mo16402r(int i);

    /* JADX INFO: renamed from: s */
    public abstract void mo16403s(int i);

    /* JADX INFO: renamed from: t */
    public abstract void mo16404t(PopupWindow.OnDismissListener onDismissListener);

    /* JADX INFO: renamed from: u */
    public abstract void mo16405u(boolean z);

    /* JADX INFO: renamed from: v */
    public abstract void mo16406v(int i);
}
