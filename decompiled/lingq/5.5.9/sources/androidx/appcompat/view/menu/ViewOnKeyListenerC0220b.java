package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
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
import androidx.appcompat.widget.C0314g0;
import androidx.appcompat.widget.C0331n0;
import androidx.appcompat.widget.C0332o;
import androidx.appcompat.widget.InterfaceC0329m0;
import com.linguist.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p185j.AbstractC6394d;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.b */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC0220b extends AbstractC6394d implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: J */
    public View f644J;

    /* JADX INFO: renamed from: K */
    public View f645K;

    /* JADX INFO: renamed from: L */
    public int f646L;

    /* JADX INFO: renamed from: M */
    public boolean f647M;

    /* JADX INFO: renamed from: N */
    public boolean f648N;

    /* JADX INFO: renamed from: O */
    public int f649O;

    /* JADX INFO: renamed from: P */
    public int f650P;

    /* JADX INFO: renamed from: R */
    public boolean f652R;

    /* JADX INFO: renamed from: S */
    public InterfaceC0228j.a f653S;

    /* JADX INFO: renamed from: T */
    public ViewTreeObserver f654T;

    /* JADX INFO: renamed from: U */
    public PopupWindow.OnDismissListener f655U;

    /* JADX INFO: renamed from: V */
    public boolean f656V;

    /* JADX INFO: renamed from: b */
    public final Context f657b;

    /* JADX INFO: renamed from: c */
    public final int f658c;

    /* JADX INFO: renamed from: d */
    public final int f659d;

    /* JADX INFO: renamed from: e */
    public final int f660e;

    /* JADX INFO: renamed from: f */
    public final boolean f661f;

    /* JADX INFO: renamed from: g */
    public final Handler f662g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f663h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public final ArrayList f664i = new ArrayList();

    /* JADX INFO: renamed from: j */
    public final a f665j = new a();

    /* JADX INFO: renamed from: k */
    public final b f666k = new b();

    /* JADX INFO: renamed from: l */
    public final c f667l = new c();

    /* JADX INFO: renamed from: H */
    public int f642H = 0;

    /* JADX INFO: renamed from: I */
    public int f643I = 0;

    /* JADX INFO: renamed from: Q */
    public boolean f651Q = false;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$a */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            ViewOnKeyListenerC0220b viewOnKeyListenerC0220b = ViewOnKeyListenerC0220b.this;
            if (viewOnKeyListenerC0220b.mo893a()) {
                ArrayList arrayList = viewOnKeyListenerC0220b.f664i;
                if (arrayList.size() <= 0 || ((d) arrayList.get(0)).f671a.f1275T) {
                    return;
                }
                View view = viewOnKeyListenerC0220b.f645K;
                if (view == null || !view.isShown()) {
                    viewOnKeyListenerC0220b.dismiss();
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).f671a.mo894b();
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$b */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewOnKeyListenerC0220b viewOnKeyListenerC0220b = ViewOnKeyListenerC0220b.this;
            ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0220b.f654T;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    viewOnKeyListenerC0220b.f654T = view.getViewTreeObserver();
                }
                viewOnKeyListenerC0220b.f654T.removeGlobalOnLayoutListener(viewOnKeyListenerC0220b.f665j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$c */
    public class c implements InterfaceC0329m0 {
        public c() {
        }

        @Override // androidx.appcompat.widget.InterfaceC0329m0
        /* JADX INFO: renamed from: d */
        public final void mo911d(C0224f c0224f, C0226h c0226h) {
            ViewOnKeyListenerC0220b viewOnKeyListenerC0220b = ViewOnKeyListenerC0220b.this;
            viewOnKeyListenerC0220b.f662g.removeCallbacksAndMessages(null);
            ArrayList arrayList = viewOnKeyListenerC0220b.f664i;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (c0224f == ((d) arrayList.get(i10)).f672b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            viewOnKeyListenerC0220b.f662g.postAtTime(new RunnableC0221c(this, i11 < arrayList.size() ? (d) arrayList.get(i11) : null, c0226h, c0224f), c0224f, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.InterfaceC0329m0
        /* JADX INFO: renamed from: g */
        public final void mo912g(C0224f c0224f, MenuItem menuItem) {
            ViewOnKeyListenerC0220b.this.f662g.removeCallbacksAndMessages(c0224f);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public final C0331n0 f671a;

        /* JADX INFO: renamed from: b */
        public final C0224f f672b;

        /* JADX INFO: renamed from: c */
        public final int f673c;

        public d(C0331n0 c0331n0, C0224f c0224f, int i10) {
            this.f671a = c0331n0;
            this.f672b = c0224f;
            this.f673c = i10;
        }
    }

    public ViewOnKeyListenerC0220b(Context context, View view, int i10, int i11, boolean z10) {
        int i12 = 0;
        this.f657b = context;
        this.f644J = view;
        this.f659d = i10;
        this.f660e = i11;
        this.f661f = z10;
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        if (C10029b0.e.m18686d(view) != 1) {
            i12 = 1;
        }
        this.f646L = i12;
        Resources resources = context.getResources();
        this.f658c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f662g = new Handler();
    }

    @Override // p185j.InterfaceC6396f
    /* JADX INFO: renamed from: a */
    public final boolean mo893a() {
        ArrayList arrayList = this.f664i;
        return arrayList.size() > 0 && ((d) arrayList.get(0)).f671a.mo893a();
    }

    @Override // p185j.InterfaceC6396f
    /* JADX INFO: renamed from: b */
    public final void mo894b() {
        if (mo893a()) {
            return;
        }
        ArrayList arrayList = this.f663h;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m910x((C0224f) it.next());
        }
        arrayList.clear();
        View view = this.f644J;
        this.f645K = view;
        if (view != null) {
            boolean z10 = this.f654T == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f654T = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f665j);
            }
            this.f645K.addOnAttachStateChangeListener(this.f666k);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: c */
    public final void mo895c(C0224f c0224f, boolean z10) {
        ArrayList arrayList = this.f664i;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (c0224f == ((d) arrayList.get(i10)).f672b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 < 0) {
            return;
        }
        int i11 = i10 + 1;
        if (i11 < arrayList.size()) {
            ((d) arrayList.get(i11)).f672b.m919c(false);
        }
        d dVar = (d) arrayList.remove(i10);
        dVar.f672b.m934r(this);
        boolean z11 = this.f656V;
        C0331n0 c0331n0 = dVar.f671a;
        if (z11) {
            C0331n0.a.m1251b(c0331n0.f1276U, null);
            c0331n0.f1276U.setAnimationStyle(0);
        }
        c0331n0.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f646L = ((d) arrayList.get(size2 - 1)).f673c;
        } else {
            View view = this.f644J;
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            this.f646L = C10029b0.e.m18686d(view) == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z10) {
                ((d) arrayList.get(0)).f672b.m919c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0228j.a aVar = this.f653S;
        if (aVar != null) {
            aVar.mo942c(c0224f, true);
        }
        ViewTreeObserver viewTreeObserver = this.f654T;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f654T.removeGlobalOnLayoutListener(this.f665j);
            }
            this.f654T = null;
        }
        this.f645K.removeOnAttachStateChangeListener(this.f666k);
        this.f655U.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: d */
    public final void mo896d(boolean z10) {
        Iterator it = this.f664i.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((d) it.next()).f671a.f1279c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0223e) adapter).notifyDataSetChanged();
        }
    }

    @Override // p185j.InterfaceC6396f
    public final void dismiss() {
        ArrayList arrayList = this.f664i;
        int size = arrayList.size();
        if (size <= 0) {
            return;
        }
        d[] dVarArr = (d[]) arrayList.toArray(new d[size]);
        while (true) {
            while (true) {
                size--;
                if (size < 0) {
                    return;
                }
                d dVar = dVarArr[size];
                if (dVar.f671a.mo893a()) {
                    dVar.f671a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: e */
    public final boolean mo897e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: f */
    public final void mo890f(InterfaceC0228j.a aVar) {
        this.f653S = aVar;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: i */
    public final void mo898i(Parcelable parcelable) {
    }

    @Override // p185j.InterfaceC6396f
    /* JADX INFO: renamed from: j */
    public final C0314g0 mo899j() {
        ArrayList arrayList = this.f664i;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((d) arrayList.get(arrayList.size() - 1)).f671a.f1279c;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: k */
    public final boolean mo900k(SubMenuC0231m subMenuC0231m) {
        for (d dVar : this.f664i) {
            if (subMenuC0231m == dVar.f672b) {
                dVar.f671a.f1279c.requestFocus();
                return true;
            }
        }
        if (!subMenuC0231m.hasVisibleItems()) {
            return false;
        }
        mo902n(subMenuC0231m);
        InterfaceC0228j.a aVar = this.f653S;
        if (aVar != null) {
            aVar.mo943d(subMenuC0231m);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228j
    /* JADX INFO: renamed from: l */
    public final Parcelable mo901l() {
        return null;
    }

    @Override // p185j.AbstractC6394d
    /* JADX INFO: renamed from: n */
    public final void mo902n(C0224f c0224f) {
        c0224f.m918b(this, this.f657b);
        if (mo893a()) {
            m910x(c0224f);
        } else {
            this.f663h.add(c0224f);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        d dVar;
        ArrayList arrayList = this.f664i;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) arrayList.get(i10);
            if (!dVar.f671a.mo893a()) {
                break;
            } else {
                i10++;
            }
        }
        if (dVar != null) {
            dVar.f672b.m919c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p185j.AbstractC6394d
    /* JADX INFO: renamed from: p */
    public final void mo903p(View view) {
        if (this.f644J != view) {
            this.f644J = view;
            int i10 = this.f642H;
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            this.f643I = Gravity.getAbsoluteGravity(i10, C10029b0.e.m18686d(view));
        }
    }

    @Override // p185j.AbstractC6394d
    /* JADX INFO: renamed from: q */
    public final void mo904q(boolean z10) {
        this.f651Q = z10;
    }

    @Override // p185j.AbstractC6394d
    /* JADX INFO: renamed from: r */
    public final void mo905r(int i10) {
        if (this.f642H != i10) {
            this.f642H = i10;
            View view = this.f644J;
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            this.f643I = Gravity.getAbsoluteGravity(i10, C10029b0.e.m18686d(view));
        }
    }

    @Override // p185j.AbstractC6394d
    /* JADX INFO: renamed from: s */
    public final void mo906s(int i10) {
        this.f647M = true;
        this.f649O = i10;
    }

    @Override // p185j.AbstractC6394d
    /* JADX INFO: renamed from: t */
    public final void mo907t(PopupWindow.OnDismissListener onDismissListener) {
        this.f655U = onDismissListener;
    }

    @Override // p185j.AbstractC6394d
    /* JADX INFO: renamed from: u */
    public final void mo908u(boolean z10) {
        this.f652R = z10;
    }

    @Override // p185j.AbstractC6394d
    /* JADX INFO: renamed from: v */
    public final void mo909v(int i10) {
        this.f648N = true;
        this.f650P = i10;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0155  */
    /* JADX INFO: renamed from: x */
    public final void m910x(C0224f c0224f) {
        View childAt;
        d dVar;
        int i10;
        int i11;
        int i12;
        MenuItem item;
        C0223e c0223e;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f657b;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        C0223e c0223e2 = new C0223e(c0224f, layoutInflaterFrom, this.f661f, R.layout.abc_cascading_menu_item_layout);
        if (!mo893a() && this.f651Q) {
            c0223e2.f688c = true;
        } else if (mo893a()) {
            c0223e2.f688c = AbstractC6394d.m13026w(c0224f);
        }
        int iM13025o = AbstractC6394d.m13025o(c0223e2, context, this.f658c);
        C0331n0 c0331n0 = new C0331n0(context, this.f659d, this.f660e);
        c0331n0.f1302X = this.f667l;
        c0331n0.f1266K = this;
        C0332o c0332o = c0331n0.f1276U;
        c0332o.setOnDismissListener(this);
        c0331n0.f1265J = this.f644J;
        c0331n0.f1288l = this.f643I;
        c0331n0.f1275T = true;
        c0332o.setFocusable(true);
        c0332o.setInputMethodMode(2);
        c0331n0.mo1009p(c0223e2);
        c0331n0.m1243r(iM13025o);
        c0331n0.f1288l = this.f643I;
        ArrayList arrayList = this.f664i;
        if (arrayList.size() > 0) {
            dVar = (d) arrayList.get(arrayList.size() - 1);
            C0224f c0224f2 = dVar.f672b;
            int size = c0224f2.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size) {
                    item = null;
                    break;
                }
                item = c0224f2.getItem(i13);
                if (item.hasSubMenu() && c0224f == item.getSubMenu()) {
                    break;
                } else {
                    i13++;
                }
            }
            if (item == null) {
                childAt = null;
            } else {
                C0314g0 c0314g0 = dVar.f671a.f1279c;
                ListAdapter adapter = c0314g0.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c0223e = (C0223e) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0223e = (C0223e) adapter;
                    headersCount = 0;
                }
                int count = c0223e.getCount();
                int i14 = 0;
                while (true) {
                    if (i14 >= count) {
                        i14 = -1;
                        break;
                    } else if (item == c0223e.getItem(i14)) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (i14 != -1 && (firstVisiblePosition = (i14 + headersCount) - c0314g0.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c0314g0.getChildCount()) {
                    childAt = c0314g0.getChildAt(firstVisiblePosition);
                } else {
                    childAt = null;
                }
            }
        } else {
            childAt = null;
            dVar = null;
        }
        if (childAt != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = C0331n0.f1301Y;
                if (method != null) {
                    try {
                        method.invoke(c0332o, Boolean.FALSE);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                C0331n0.b.m1252a(c0332o, false);
            }
            C0331n0.a.m1250a(c0332o, null);
            C0314g0 c0314g1 = ((d) arrayList.get(arrayList.size() - 1)).f671a.f1279c;
            int[] iArr = new int[2];
            c0314g1.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.f645K.getWindowVisibleDisplayFrame(rect);
            if (this.f646L == 1) {
                if (c0314g1.getWidth() + iArr[0] + iM13025o > rect.right) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
            } else if (iArr[0] - iM13025o < 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            boolean z10 = i10 == 1;
            this.f646L = i10;
            c0331n0.f1265J = childAt;
            if ((this.f643I & 5) != 5) {
                i11 = 0;
                if (z10) {
                    iM13025o = childAt.getWidth();
                    i12 = iM13025o + i11;
                } else {
                    i12 = 0 - iM13025o;
                }
            } else if (z10) {
                i11 = 0;
                i12 = iM13025o + i11;
            } else {
                i11 = 0;
                iM13025o = childAt.getWidth();
                i12 = 0 - iM13025o;
            }
            c0331n0.f1282f = i12;
            c0331n0.f1287k = true;
            c0331n0.f1286j = true;
            c0331n0.m1240l(i11);
        } else {
            if (this.f647M) {
                c0331n0.f1282f = this.f649O;
            }
            if (this.f648N) {
                c0331n0.m1240l(this.f650P);
            }
            Rect rect2 = this.f36849a;
            c0331n0.f1274S = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new d(c0331n0, c0224f, this.f646L));
        c0331n0.mo894b();
        C0314g0 c0314g2 = c0331n0.f1279c;
        c0314g2.setOnKeyListener(this);
        if (dVar == null && this.f652R && c0224f.f705m != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0314g2, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(c0224f.f705m);
            c0314g2.addHeaderView(frameLayout, null, false);
            c0331n0.mo894b();
        }
    }
}
