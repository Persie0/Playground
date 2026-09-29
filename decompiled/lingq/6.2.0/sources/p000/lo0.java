package p000;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.R$dimen;
import androidx.appcompat.R$layout;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class lo0 extends uw5 implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: W */
    public static final int f49880W = R$layout.abc_cascading_menu_item_layout;

    /* JADX INFO: renamed from: J */
    public View f49883J;

    /* JADX INFO: renamed from: K */
    public View f49884K;

    /* JADX INFO: renamed from: L */
    public int f49885L;

    /* JADX INFO: renamed from: M */
    public boolean f49886M;

    /* JADX INFO: renamed from: N */
    public boolean f49887N;

    /* JADX INFO: renamed from: O */
    public int f49888O;

    /* JADX INFO: renamed from: P */
    public int f49889P;

    /* JADX INFO: renamed from: R */
    public boolean f49891R;

    /* JADX INFO: renamed from: S */
    public dx5 f49892S;

    /* JADX INFO: renamed from: T */
    public ViewTreeObserver f49893T;

    /* JADX INFO: renamed from: U */
    public PopupWindow.OnDismissListener f49894U;

    /* JADX INFO: renamed from: V */
    public boolean f49895V;

    /* JADX INFO: renamed from: b */
    public final Context f49896b;

    /* JADX INFO: renamed from: c */
    public final int f49897c;

    /* JADX INFO: renamed from: d */
    public final int f49898d;

    /* JADX INFO: renamed from: e */
    public final int f49899e;

    /* JADX INFO: renamed from: f */
    public final boolean f49900f;

    /* JADX INFO: renamed from: g */
    public final Handler f49901g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f49902h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public final ArrayList f49903i = new ArrayList();

    /* JADX INFO: renamed from: j */
    public final ViewTreeObserverOnGlobalLayoutListenerC3507qq f49904j = new ViewTreeObserverOnGlobalLayoutListenerC3507qq(this, 2);

    /* JADX INFO: renamed from: k */
    public final io0 f49905k = new io0(this, 0);

    /* JADX INFO: renamed from: l */
    public final hi8 f49906l = new hi8(this, 6);

    /* JADX INFO: renamed from: H */
    public int f49881H = 0;

    /* JADX INFO: renamed from: I */
    public int f49882I = 0;

    /* JADX INFO: renamed from: Q */
    public boolean f49890Q = false;

    public lo0(Context context, View view, int i, int i2, boolean z) {
        this.f49896b = context;
        this.f49883J = view;
        this.f49898d = i;
        this.f49899e = i2;
        this.f49900f = z;
        this.f49885L = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f49897c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R$dimen.abc_config_prefDialogWidth));
        this.f49901g = new Handler();
    }

    @Override // p000.k69
    /* JADX INFO: renamed from: a */
    public final boolean mo10357a() {
        ArrayList arrayList = this.f49903i;
        return arrayList.size() > 0 && ((ko0) arrayList.get(0)).f47593a.f35607U.isShowing();
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: b */
    public final void mo702b(hw5 hw5Var, boolean z) {
        ArrayList arrayList = this.f49903i;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (hw5Var == ((ko0) arrayList.get(i)).f47594b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((ko0) arrayList.get(i2)).f47594b.m13520c(false);
        }
        ko0 ko0Var = (ko0) arrayList.remove(i);
        hw5 hw5Var2 = ko0Var.f47594b;
        ax5 ax5Var = ko0Var.f47593a;
        C3120iq c3120iq = ax5Var.f35607U;
        hw5Var2.m13535r(this);
        if (this.f49895V) {
            xw5.m24727b(c3120iq, null);
            c3120iq.setAnimationStyle(0);
        }
        ax5Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f49885L = ((ko0) arrayList.get(size2 - 1)).f47595c;
        } else {
            this.f49885L = this.f49883J.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((ko0) arrayList.get(0)).f47594b.m13520c(false);
                return;
            }
            return;
        }
        dismiss();
        dx5 dx5Var = this.f49892S;
        if (dx5Var != null) {
            dx5Var.mo10740b(hw5Var, true);
        }
        ViewTreeObserver viewTreeObserver = this.f49893T;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f49893T.removeGlobalOnLayoutListener(this.f49904j);
            }
            this.f49893T = null;
        }
        this.f49884K.removeOnAttachStateChangeListener(this.f49905k);
        this.f49894U.onDismiss();
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: c */
    public final void mo703c(boolean z) {
        Iterator it = this.f49903i.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((ko0) it.next()).f47593a.f35610c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((ew5) adapter).notifyDataSetChanged();
        }
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: d */
    public final boolean mo704d(om9 om9Var) {
        for (ko0 ko0Var : this.f49903i) {
            if (om9Var == ko0Var.f47594b) {
                ko0Var.f47593a.f35610c.requestFocus();
                return true;
            }
        }
        if (!om9Var.hasVisibleItems()) {
            return false;
        }
        mo16399n(om9Var);
        dx5 dx5Var = this.f49892S;
        if (dx5Var != null) {
            dx5Var.mo10741j(om9Var);
        }
        return true;
    }

    @Override // p000.k69
    public final void dismiss() {
        ArrayList arrayList = this.f49903i;
        int size = arrayList.size();
        if (size > 0) {
            ko0[] ko0VarArr = (ko0[]) arrayList.toArray(new ko0[size]);
            for (int i = size - 1; i >= 0; i--) {
                ko0 ko0Var = ko0VarArr[i];
                if (ko0Var.f47593a.f35607U.isShowing()) {
                    ko0Var.f47593a.dismiss();
                }
            }
        }
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: e */
    public final boolean mo705e() {
        return false;
    }

    @Override // p000.k69
    /* JADX INFO: renamed from: f */
    public final void mo10360f() {
        if (mo10357a()) {
            return;
        }
        ArrayList arrayList = this.f49902h;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m16407w((hw5) it.next());
        }
        arrayList.clear();
        View view = this.f49883J;
        this.f49884K = view;
        if (view != null) {
            boolean z = this.f49893T == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f49893T = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f49904j);
            }
            this.f49884K.addOnAttachStateChangeListener(this.f49905k);
        }
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: h */
    public final void mo708h(Parcelable parcelable) {
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: i */
    public final void mo709i(dx5 dx5Var) {
        this.f49892S = dx5Var;
    }

    @Override // p000.k69
    /* JADX INFO: renamed from: k */
    public final nm2 mo10364k() {
        ArrayList arrayList = this.f49903i;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((ko0) AbstractC3393o1.m17731f(1, arrayList)).f47593a.f35610c;
    }

    @Override // p000.ex5
    /* JADX INFO: renamed from: m */
    public final Parcelable mo713m() {
        return null;
    }

    @Override // p000.uw5
    /* JADX INFO: renamed from: n */
    public final void mo16399n(hw5 hw5Var) {
        hw5Var.m13519b(this, this.f49896b);
        if (mo10357a()) {
            m16407w(hw5Var);
        } else {
            this.f49902h.add(hw5Var);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ko0 ko0Var;
        ArrayList arrayList = this.f49903i;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                ko0Var = null;
                break;
            }
            ko0Var = (ko0) arrayList.get(i);
            if (!ko0Var.f47593a.f35607U.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (ko0Var != null) {
            ko0Var.f47594b.m13520c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p000.uw5
    /* JADX INFO: renamed from: p */
    public final void mo16400p(View view) {
        if (this.f49883J != view) {
            this.f49883J = view;
            this.f49882I = Gravity.getAbsoluteGravity(this.f49881H, view.getLayoutDirection());
        }
    }

    @Override // p000.uw5
    /* JADX INFO: renamed from: q */
    public final void mo16401q(boolean z) {
        this.f49890Q = z;
    }

    @Override // p000.uw5
    /* JADX INFO: renamed from: r */
    public final void mo16402r(int i) {
        if (this.f49881H != i) {
            this.f49881H = i;
            this.f49882I = Gravity.getAbsoluteGravity(i, this.f49883J.getLayoutDirection());
        }
    }

    @Override // p000.uw5
    /* JADX INFO: renamed from: s */
    public final void mo16403s(int i) {
        this.f49886M = true;
        this.f49888O = i;
    }

    @Override // p000.uw5
    /* JADX INFO: renamed from: t */
    public final void mo16404t(PopupWindow.OnDismissListener onDismissListener) {
        this.f49894U = onDismissListener;
    }

    @Override // p000.uw5
    /* JADX INFO: renamed from: u */
    public final void mo16405u(boolean z) {
        this.f49891R = z;
    }

    @Override // p000.uw5
    /* JADX INFO: renamed from: v */
    public final void mo16406v(int i) {
        this.f49887N = true;
        this.f49889P = i;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0145  */
    /* JADX INFO: renamed from: w */
    public final void m16407w(hw5 hw5Var) {
        boolean z;
        int i;
        View childAt;
        ko0 ko0Var;
        int i2;
        int i3;
        MenuItem item;
        ew5 ew5Var;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f49896b;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        ew5 ew5Var2 = new ew5(hw5Var, layoutInflaterFrom, this.f49900f, f49880W);
        int i4 = 1;
        if (!mo10357a() && this.f49890Q) {
            ew5Var2.f37990c = true;
        } else if (mo10357a()) {
            int size = hw5Var.f43042f.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    z = false;
                    break;
                }
                MenuItem item2 = hw5Var.getItem(i5);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z = true;
                    break;
                }
                i5++;
            }
            ew5Var2.f37990c = z;
        }
        int iM22968o = uw5.m22968o(ew5Var2, context, this.f49897c);
        ax5 ax5Var = new ax5(context, null, this.f49898d, this.f49899e);
        ax5Var.f7641V = this.f49906l;
        ax5Var.f35597K = this;
        C3120iq c3120iq = ax5Var.f35607U;
        c3120iq.setOnDismissListener(this);
        ax5Var.f35596J = this.f49883J;
        ax5Var.f35619l = this.f49882I;
        ax5Var.f35606T = true;
        c3120iq.setFocusable(true);
        c3120iq.setInputMethodMode(2);
        ax5Var.mo10366p(ew5Var2);
        ax5Var.m10367r(iM22968o);
        ax5Var.f35619l = this.f49882I;
        ArrayList arrayList = this.f49903i;
        if (arrayList.size() > 0) {
            ko0Var = (ko0) AbstractC3393o1.m17731f(1, arrayList);
            hw5 hw5Var2 = ko0Var.f47594b;
            int size2 = hw5Var2.f43042f.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size2) {
                    i = i4;
                    item = null;
                    break;
                }
                item = hw5Var2.getItem(i6);
                if (item.hasSubMenu()) {
                    i = i4;
                    if (hw5Var == item.getSubMenu()) {
                        break;
                    }
                } else {
                    i = i4;
                }
                i6++;
                i4 = i;
            }
            if (item == null) {
                childAt = null;
            } else {
                nm2 nm2Var = ko0Var.f47593a.f35610c;
                ListAdapter adapter = nm2Var.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    ew5Var = (ew5) headerViewListAdapter.getWrappedAdapter();
                } else {
                    ew5Var = (ew5) adapter;
                    headersCount = 0;
                }
                int count = ew5Var.getCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= count) {
                        i7 = -1;
                        break;
                    } else if (item == ew5Var.getItem(i7)) {
                        break;
                    } else {
                        i7++;
                    }
                }
                childAt = (i7 != -1 && (firstVisiblePosition = (i7 + headersCount) - nm2Var.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < nm2Var.getChildCount()) ? nm2Var.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            i = 1;
            childAt = null;
            ko0Var = null;
        }
        if (childAt != null) {
            yw5.m25366a(c3120iq, false);
            xw5.m24726a(c3120iq, null);
            nm2 nm2Var2 = ((ko0) arrayList.get(arrayList.size() - 1)).f47593a.f35610c;
            int[] iArr = new int[2];
            nm2Var2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.f49884K.getWindowVisibleDisplayFrame(rect);
            if (this.f49885L == i) {
                if (nm2Var2.getWidth() + iArr[0] + iM22968o > rect.right) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
            } else if (iArr[0] - iM22968o < 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            boolean z2 = i2 == 1;
            this.f49885L = i2;
            ax5Var.f35596J = childAt;
            if ((this.f49882I & 5) != 5) {
                i3 = 0;
                iM22968o = z2 ? childAt.getWidth() : 0 - iM22968o;
            } else if (z2) {
                i3 = 0;
            } else {
                i3 = 0;
                iM22968o = 0 - childAt.getWidth();
            }
            ax5Var.f35613f = iM22968o;
            ax5Var.f35618k = true;
            ax5Var.f35617j = true;
            ax5Var.m10363j(i3);
        } else {
            if (this.f49886M) {
                ax5Var.f35613f = this.f49888O;
            }
            if (this.f49887N) {
                ax5Var.m10363j(this.f49889P);
            }
            Rect rect2 = this.f64467a;
            ax5Var.f35605S = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new ko0(ax5Var, hw5Var, this.f49885L));
        ax5Var.mo10360f();
        nm2 nm2Var3 = ax5Var.f35610c;
        nm2Var3.setOnKeyListener(this);
        if (ko0Var == null && this.f49891R && hw5Var.f43049m != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R$layout.abc_popup_menu_header_item_layout, (ViewGroup) nm2Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(hw5Var.f43049m);
            nm2Var3.addHeaderView(frameLayout, null, false);
            ax5Var.mo10360f();
        }
    }
}
