package p185j;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0223e;
import androidx.appcompat.view.menu.C0224f;
import androidx.appcompat.view.menu.C0226h;
import androidx.appcompat.view.menu.InterfaceC0228j;
import androidx.appcompat.view.menu.ViewOnKeyListenerC0220b;

/* JADX INFO: renamed from: j.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6394d implements InterfaceC6396f, InterfaceC0228j, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public Rect f36849a;

    /* JADX INFO: renamed from: o */
    public static int m13025o(C0223e c0223e, Context context, int i10) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = c0223e.getCount();
        int i11 = 0;
        int i12 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = c0223e.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = c0223e.getView(i13, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i10) {
                return i10;
            }
            if (measuredWidth > i11) {
                i11 = measuredWidth;
            }
        }
        return i11;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m13026w(C0224f c0224f) {
        int size = c0224f.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = c0224f.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: g */
    public final boolean mo891g(C0226h c0226h) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    public final int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: h */
    public final void mo913h(Context context, C0224f c0224f) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: m */
    public final boolean mo892m(C0226h c0226h) {
        return false;
    }

    /* JADX INFO: renamed from: n */
    public abstract void mo902n(C0224f c0224f);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C0223e) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0223e) listAdapter).f686a.m933q((MenuItem) listAdapter.getItem(i10), this, (this instanceof ViewOnKeyListenerC0220b) ^ true ? 0 : 4);
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo903p(View view);

    /* JADX INFO: renamed from: q */
    public abstract void mo904q(boolean z10);

    /* JADX INFO: renamed from: r */
    public abstract void mo905r(int i10);

    /* JADX INFO: renamed from: s */
    public abstract void mo906s(int i10);

    /* JADX INFO: renamed from: t */
    public abstract void mo907t(PopupWindow.OnDismissListener onDismissListener);

    /* JADX INFO: renamed from: u */
    public abstract void mo908u(boolean z10);

    /* JADX INFO: renamed from: v */
    public abstract void mo909v(int i10);
}
