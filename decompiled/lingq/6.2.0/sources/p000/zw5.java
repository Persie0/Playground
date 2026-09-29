package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: loaded from: classes2.dex */
public final class zw5 extends nm2 {

    /* JADX INFO: renamed from: H */
    public final int f72310H;

    /* JADX INFO: renamed from: I */
    public final int f72311I;

    /* JADX INFO: renamed from: J */
    public lw5 f72312J;

    /* JADX INFO: renamed from: K */
    public mw5 f72313K;

    public zw5(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f72310H = 21;
            this.f72311I = 22;
        } else {
            this.f72310H = 22;
            this.f72311I = 21;
        }
    }

    @Override // p000.nm2, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        ew5 ew5Var;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.f72312J != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                ew5Var = (ew5) headerViewListAdapter.getWrappedAdapter();
            } else {
                ew5Var = (ew5) adapter;
                headersCount = 0;
            }
            mw5 mw5VarM11368b = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= ew5Var.getCount()) ? null : ew5Var.getItem(i);
            mw5 mw5Var = this.f72313K;
            if (mw5Var != mw5VarM11368b) {
                hw5 hw5Var = ew5Var.f37988a;
                if (mw5Var != null) {
                    this.f72312J.mo3112c(hw5Var, mw5Var);
                }
                this.f72313K = mw5VarM11368b;
                if (mw5VarM11368b != null) {
                    this.f72312J.mo3113m(hw5Var, mw5VarM11368b);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f72310H) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f72311I) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (ew5) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (ew5) adapter).f37988a.m13520c(false);
        return true;
    }

    public void setHoverListener(lw5 lw5Var) {
        this.f72312J = lw5Var;
    }

    @Override // p000.nm2, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
