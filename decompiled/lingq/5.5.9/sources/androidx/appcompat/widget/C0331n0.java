package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0223e;
import androidx.appcompat.view.menu.C0224f;
import androidx.appcompat.view.menu.C0226h;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.appcompat.widget.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0331n0 extends C0327l0 implements InterfaceC0329m0 {

    /* JADX INFO: renamed from: Y */
    public static final Method f1301Y;

    /* JADX INFO: renamed from: X */
    public InterfaceC0329m0 f1302X;

    /* JADX INFO: renamed from: androidx.appcompat.widget.n0$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static void m1250a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        /* JADX INFO: renamed from: b */
        public static void m1251b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.n0$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static void m1252a(PopupWindow popupWindow, boolean z10) {
            popupWindow.setTouchModal(z10);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.n0$c */
    public static class c extends C0314g0 {

        /* JADX INFO: renamed from: H */
        public final int f1303H;

        /* JADX INFO: renamed from: I */
        public final int f1304I;

        /* JADX INFO: renamed from: J */
        public InterfaceC0329m0 f1305J;

        /* JADX INFO: renamed from: K */
        public C0226h f1306K;

        /* JADX INFO: renamed from: androidx.appcompat.widget.n0$c$a */
        public static class a {
            /* JADX INFO: renamed from: a */
            public static int m1253a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public c(Context context, boolean z10) {
            super(context, z10);
            if (1 == a.m1253a(context.getResources().getConfiguration())) {
                this.f1303H = 21;
                this.f1304I = 22;
            } else {
                this.f1303H = 22;
                this.f1304I = 21;
            }
        }

        @Override // androidx.appcompat.widget.C0314g0, android.view.View
        public final boolean onHoverEvent(MotionEvent motionEvent) {
            C0223e c0223e;
            int headersCount;
            int iPointToPosition;
            int i10;
            if (this.f1305J != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c0223e = (C0223e) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0223e = (C0223e) adapter;
                    headersCount = 0;
                }
                C0226h item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i10 = iPointToPosition - headersCount) < 0 || i10 >= c0223e.getCount()) ? null : c0223e.getItem(i10);
                C0226h c0226h = this.f1306K;
                if (c0226h != item) {
                    C0224f c0224f = c0223e.f686a;
                    if (c0226h != null) {
                        this.f1305J.mo912g(c0224f, c0226h);
                    }
                    this.f1306K = item;
                    if (item != null) {
                        this.f1305J.mo911d(c0224f, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i10 == this.f1303H) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i10 != this.f1304I) {
                return super.onKeyDown(i10, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (C0223e) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C0223e) adapter).f686a.m919c(false);
            return true;
        }

        public void setHoverListener(InterfaceC0329m0 interfaceC0329m0) {
            this.f1305J = interfaceC0329m0;
        }

        @Override // androidx.appcompat.widget.C0314g0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f1301Y = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0331n0(Context context, int i10, int i11) {
        super(context, null, i10, i11);
    }

    @Override // androidx.appcompat.widget.InterfaceC0329m0
    /* JADX INFO: renamed from: d */
    public final void mo911d(C0224f c0224f, C0226h c0226h) {
        InterfaceC0329m0 interfaceC0329m0 = this.f1302X;
        if (interfaceC0329m0 != null) {
            interfaceC0329m0.mo911d(c0224f, c0226h);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0329m0
    /* JADX INFO: renamed from: g */
    public final void mo912g(C0224f c0224f, MenuItem menuItem) {
        InterfaceC0329m0 interfaceC0329m0 = this.f1302X;
        if (interfaceC0329m0 != null) {
            interfaceC0329m0.mo912g(c0224f, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.C0327l0
    /* JADX INFO: renamed from: q */
    public final C0314g0 mo1242q(Context context, boolean z10) {
        c cVar = new c(context, z10);
        cVar.setHoverListener(this);
        return cVar;
    }
}
