package p000;

import android.content.Context;
import android.os.SystemClock;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;

/* JADX INFO: renamed from: ll */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0799ll extends C0773km {

    /* JADX INFO: renamed from: c */
    final int f38528c;

    /* JADX INFO: renamed from: d */
    final int f38529d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0795lh f38530e;

    /* JADX INFO: renamed from: f */
    private MenuItem f38531f;

    public C0799ll(Context context, boolean z) {
        super(context, z);
        if (C0798lk.m15549a(context.getResources().getConfiguration()) == 1) {
            this.f38528c = 21;
            this.f38529d = 22;
        } else {
            this.f38528c = 22;
            this.f38529d = 21;
        }
    }

    @Override // p000.C0773km, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0222gt c0222gt;
        int headersCount;
        InterfaceC0795lh interfaceC0795lh;
        InterfaceC0795lh interfaceC0795lh2;
        int iPointToPosition;
        int i;
        if (this.f38530e != null) {
            ListAdapter adapter = getAdapter();
            int i2 = 0;
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                c0222gt = (C0222gt) headerViewListAdapter.getWrappedAdapter();
            } else {
                c0222gt = (C0222gt) adapter;
                headersCount = 0;
            }
            C0227gy item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= c0222gt.getCount()) ? null : c0222gt.getItem(i);
            MenuItem menuItem = this.f38531f;
            if (menuItem != item) {
                C0225gw c0225gw = c0222gt.f26308a;
                if (menuItem != null && (interfaceC0795lh2 = ((C0800lm) this.f38530e).f38641a) != null) {
                    ((C0218gp) interfaceC0795lh2).f25909a.f26031a.removeCallbacksAndMessages(c0225gw);
                }
                this.f38531f = item;
                if (item != null && (interfaceC0795lh = ((C0800lm) this.f38530e).f38641a) != null) {
                    C0218gp c0218gp = (C0218gp) interfaceC0795lh;
                    c0218gp.f25909a.f26031a.removeCallbacksAndMessages(null);
                    int size = c0218gp.f25909a.f26032b.size();
                    while (true) {
                        if (i2 >= size) {
                            i2 = -1;
                            break;
                        }
                        if (c0225gw == ((lqq) c0218gp.f25909a.f26032b.get(i2)).f39003c) {
                            break;
                        }
                        i2++;
                    }
                    if (i2 != -1) {
                        int i3 = i2 + 1;
                        c0218gp.f25909a.f26031a.postAtTime(new apv(c0218gp, i3 < c0218gp.f25909a.f26032b.size() ? (lqq) c0218gp.f25909a.f26032b.get(i3) : null, item, c0225gw, 1, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null), c0225gw, SystemClock.uptimeMillis() + 200);
                    }
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f38528c) {
            if (listMenuItemView.isEnabled() && listMenuItemView.f921a.hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f38529d) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C0222gt) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C0222gt) adapter).f26308a.m9829i(false);
        return true;
    }
}
