package p000;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
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
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: gq */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC0219gq extends AbstractC0235hf implements View.OnKeyListener, PopupWindow.OnDismissListener, InterfaceC0239hj {

    /* JADX INFO: renamed from: a */
    public final Handler f26031a;

    /* JADX INFO: renamed from: d */
    View f26034d;

    /* JADX INFO: renamed from: e */
    ViewTreeObserver f26035e;

    /* JADX INFO: renamed from: f */
    public boolean f26036f;

    /* JADX INFO: renamed from: h */
    private final Context f26037h;

    /* JADX INFO: renamed from: i */
    private final int f26038i;

    /* JADX INFO: renamed from: j */
    private final int f26039j;

    /* JADX INFO: renamed from: k */
    private final boolean f26040k;

    /* JADX INFO: renamed from: q */
    private View f26046q;

    /* JADX INFO: renamed from: s */
    private boolean f26048s;

    /* JADX INFO: renamed from: t */
    private boolean f26049t;

    /* JADX INFO: renamed from: u */
    private int f26050u;

    /* JADX INFO: renamed from: v */
    private int f26051v;

    /* JADX INFO: renamed from: x */
    private boolean f26053x;

    /* JADX INFO: renamed from: y */
    private InterfaceC0238hi f26054y;

    /* JADX INFO: renamed from: z */
    private PopupWindow.OnDismissListener f26055z;

    /* JADX INFO: renamed from: l */
    private final List f26041l = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final List f26032b = new ArrayList();

    /* JADX INFO: renamed from: c */
    final ViewTreeObserver.OnGlobalLayoutListener f26033c = new ViewTreeObserverOnGlobalLayoutListenerC0244ho(this, 1);

    /* JADX INFO: renamed from: m */
    private final View.OnAttachStateChangeListener f26042m = new ViewOnAttachStateChangeListenerC0217go(this, 0);

    /* JADX INFO: renamed from: n */
    private final InterfaceC0795lh f26043n = new C0218gp(this);

    /* JADX INFO: renamed from: o */
    private int f26044o = 0;

    /* JADX INFO: renamed from: p */
    private int f26045p = 0;

    /* JADX INFO: renamed from: w */
    private boolean f26052w = false;

    /* JADX INFO: renamed from: r */
    private int f26047r = m9622y();

    public ViewOnKeyListenerC0219gq(Context context, View view, int i, boolean z) {
        this.f26037h = context;
        this.f26046q = view;
        this.f26039j = i;
        this.f26040k = z;
        Resources resources = context.getResources();
        this.f26038i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0100R.dimen.abc_config_prefDialogWidth));
        this.f26031a = new Handler();
    }

    /* JADX INFO: renamed from: y */
    private final int m9622y() {
        return afc.m442c(this.f26046q) == 1 ? 0 : 1;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x012e  */
    /* JADX INFO: renamed from: z */
    private final void m9623z(C0225gw c0225gw) {
        lqq lqqVar;
        View childAt;
        int i;
        MenuItem item;
        C0222gt c0222gt;
        int headersCount;
        int firstVisiblePosition;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f26037h);
        C0222gt c0222gt2 = new C0222gt(c0225gw, layoutInflaterFrom, this.f26040k, C0100R.layout.abc_cascading_menu_item_layout);
        if (!mo9636u() && this.f26052w) {
            c0222gt2.f26309b = true;
        } else if (mo9636u()) {
            c0222gt2.f26309b = AbstractC0235hf.m10176w(c0225gw);
        }
        int iX = m10177x(c0222gt2, this.f26037h, this.f26038i);
        C0800lm c0800lm = new C0800lm(this.f26037h, this.f26039j);
        c0800lm.f38641a = this.f26043n;
        c0800lm.f38184m = this;
        c0800lm.m15308v(this);
        c0800lm.f38183l = this.f26046q;
        c0800lm.f38181j = this.f26045p;
        c0800lm.m15311y();
        c0800lm.m15310x();
        c0800lm.mo12909e(c0222gt2);
        c0800lm.m15306r(iX);
        c0800lm.f38181j = this.f26045p;
        if (this.f26032b.size() > 0) {
            List list = this.f26032b;
            lqqVar = (lqq) list.get(list.size() - 1);
            C0225gw c0225gw2 = (C0225gw) lqqVar.f39003c;
            int size = c0225gw2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    item = null;
                    break;
                }
                item = c0225gw2.getItem(i2);
                if (item.hasSubMenu() && c0225gw == item.getSubMenu()) {
                    break;
                } else {
                    i2++;
                }
            }
            if (item == null) {
                childAt = null;
            } else {
                ListView listViewM15894g = lqqVar.m15894g();
                ListAdapter adapter = listViewM15894g.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c0222gt = (C0222gt) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0222gt = (C0222gt) adapter;
                    headersCount = 0;
                }
                int count = c0222gt.getCount();
                int i3 = 0;
                while (true) {
                    if (i3 >= count) {
                        i3 = -1;
                        break;
                    } else if (item == c0222gt.getItem(i3)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                childAt = (i3 != -1 && (firstVisiblePosition = (i3 + headersCount) - listViewM15894g.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewM15894g.getChildCount()) ? listViewM15894g.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            lqqVar = null;
            childAt = null;
        }
        if (childAt != null) {
            C0797lj.m15509a(c0800lm.f38188q, false);
            C0796li.m15371a(c0800lm.f38188q, null);
            List list2 = this.f26032b;
            ListView listViewM15894g2 = ((lqq) list2.get(list2.size() - 1)).m15894g();
            int[] iArr = new int[2];
            listViewM15894g2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.f26034d.getWindowVisibleDisplayFrame(rect);
            if (this.f26047r == 1) {
                if (iArr[0] + listViewM15894g2.getWidth() + iX > rect.right) {
                    i = 0;
                } else {
                    i = 1;
                }
            } else if (iArr[0] - iX < 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f26047r = i;
            c0800lm.f38183l = childAt;
            if ((this.f26045p & 5) != 5) {
                iX = i != 0 ? childAt.getWidth() : -iX;
            } else if (i == 0) {
                iX = -childAt.getWidth();
            }
            c0800lm.f38178g = iX;
            c0800lm.f38180i = true;
            c0800lm.f38179h = true;
            c0800lm.m15302j(0);
        } else {
            if (this.f26048s) {
                c0800lm.f38178g = this.f26050u;
            }
            if (this.f26049t) {
                c0800lm.m15302j(this.f26051v);
            }
            c0800lm.m15307t(this.f27531g);
        }
        this.f26032b.add(new lqq(c0800lm, c0225gw, this.f26047r));
        c0800lm.mo9634s();
        C0773km c0773km = c0800lm.f38176e;
        c0773km.setOnKeyListener(this);
        if (lqqVar == null && this.f26053x && c0225gw.f26551e != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(C0100R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0773km, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(c0225gw.f26551e);
            c0773km.addHeaderView(frameLayout, null, false);
            c0800lm.mo9634s();
        }
    }

    @Override // p000.InterfaceC0243hn
    /* JADX INFO: renamed from: aP */
    public final ListView mo9624aP() {
        if (this.f26032b.isEmpty()) {
            return null;
        }
        List list = this.f26032b;
        return ((lqq) list.get(list.size() - 1)).m15894g();
    }

    @Override // p000.InterfaceC0239hj
    /* JADX INFO: renamed from: c */
    public final void mo9485c(C0225gw c0225gw, boolean z) {
        int size = this.f26032b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (c0225gw == ((lqq) this.f26032b.get(i)).f39003c) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < this.f26032b.size()) {
            ((C0225gw) ((lqq) this.f26032b.get(i2)).f39003c).m9829i(false);
        }
        lqq lqqVar = (lqq) this.f26032b.remove(i);
        ((C0225gw) lqqVar.f39003c).m9833m(this);
        if (this.f26036f) {
            C0796li.m15372b(((C0800lm) lqqVar.f39002b).f38188q, null);
            ((C0794lg) lqqVar.f39002b).f38188q.setAnimationStyle(0);
        }
        ((C0794lg) lqqVar.f39002b).mo9626k();
        int size2 = this.f26032b.size();
        if (size2 > 0) {
            this.f26047r = ((lqq) this.f26032b.get(size2 - 1)).f39001a;
        } else {
            this.f26047r = m9622y();
        }
        if (size2 != 0) {
            if (z) {
                ((C0225gw) ((lqq) this.f26032b.get(0)).f39003c).m9829i(false);
                return;
            }
            return;
        }
        mo9626k();
        InterfaceC0238hi interfaceC0238hi = this.f26054y;
        if (interfaceC0238hi != null) {
            interfaceC0238hi.mo8114a(c0225gw, true);
        }
        ViewTreeObserver viewTreeObserver = this.f26035e;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f26035e.removeGlobalOnLayoutListener(this.f26033c);
            }
            this.f26035e = null;
        }
        this.f26034d.removeOnAttachStateChangeListener(this.f26042m);
        this.f26055z.onDismiss();
    }

    @Override // p000.InterfaceC0239hj
    /* JADX INFO: renamed from: d */
    public final void mo9486d(InterfaceC0238hi interfaceC0238hi) {
        this.f26054y = interfaceC0238hi;
    }

    @Override // p000.InterfaceC0239hj
    /* JADX INFO: renamed from: e */
    public final boolean mo9487e() {
        return false;
    }

    @Override // p000.InterfaceC0239hj
    /* JADX INFO: renamed from: f */
    public final boolean mo9488f(SubMenuC0246hq subMenuC0246hq) {
        for (lqq lqqVar : this.f26032b) {
            if (subMenuC0246hq == lqqVar.f39003c) {
                lqqVar.m15894g().requestFocus();
                return true;
            }
        }
        if (!subMenuC0246hq.hasVisibleItems()) {
            return false;
        }
        mo9625j(subMenuC0246hq);
        InterfaceC0238hi interfaceC0238hi = this.f26054y;
        if (interfaceC0238hi != null) {
            interfaceC0238hi.mo8115b(subMenuC0246hq);
        }
        return true;
    }

    @Override // p000.InterfaceC0239hj
    /* JADX INFO: renamed from: i */
    public final void mo9491i() {
        Iterator it = this.f26032b.iterator();
        while (it.hasNext()) {
            m10175v(((lqq) it.next()).m15894g().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // p000.AbstractC0235hf
    /* JADX INFO: renamed from: j */
    public final void mo9625j(C0225gw c0225gw) {
        c0225gw.m9828h(this, this.f26037h);
        if (mo9636u()) {
            m9623z(c0225gw);
        } else {
            this.f26041l.add(c0225gw);
        }
    }

    @Override // p000.InterfaceC0243hn
    /* JADX INFO: renamed from: k */
    public final void mo9626k() {
        int size = this.f26032b.size();
        if (size > 0) {
            lqq[] lqqVarArr = (lqq[]) this.f26032b.toArray(new lqq[size]);
            for (int i = size - 1; i >= 0; i--) {
                lqq lqqVar = lqqVarArr[i];
                if (((C0794lg) lqqVar.f39002b).mo9636u()) {
                    ((C0794lg) lqqVar.f39002b).mo9626k();
                }
            }
        }
    }

    @Override // p000.AbstractC0235hf
    /* JADX INFO: renamed from: l */
    public final void mo9627l(View view) {
        if (this.f26046q != view) {
            this.f26046q = view;
            this.f26045p = Gravity.getAbsoluteGravity(this.f26044o, afc.m442c(view));
        }
    }

    @Override // p000.AbstractC0235hf
    /* JADX INFO: renamed from: m */
    public final void mo9628m(boolean z) {
        this.f26052w = z;
    }

    @Override // p000.AbstractC0235hf
    /* JADX INFO: renamed from: n */
    public final void mo9629n(int i) {
        if (this.f26044o != i) {
            this.f26044o = i;
            this.f26045p = Gravity.getAbsoluteGravity(i, afc.m442c(this.f26046q));
        }
    }

    @Override // p000.AbstractC0235hf
    /* JADX INFO: renamed from: o */
    public final void mo9630o(int i) {
        this.f26048s = true;
        this.f26050u = i;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        lqq lqqVar;
        int size = this.f26032b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                lqqVar = null;
                break;
            }
            lqqVar = (lqq) this.f26032b.get(i);
            if (!((C0794lg) lqqVar.f39002b).mo9636u()) {
                break;
            } else {
                i++;
            }
        }
        if (lqqVar != null) {
            ((C0225gw) lqqVar.f39003c).m9829i(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        mo9626k();
        return true;
    }

    @Override // p000.AbstractC0235hf
    /* JADX INFO: renamed from: p */
    public final void mo9631p(PopupWindow.OnDismissListener onDismissListener) {
        this.f26055z = onDismissListener;
    }

    @Override // p000.AbstractC0235hf
    /* JADX INFO: renamed from: q */
    public final void mo9632q(boolean z) {
        this.f26053x = z;
    }

    @Override // p000.AbstractC0235hf
    /* JADX INFO: renamed from: r */
    public final void mo9633r(int i) {
        this.f26049t = true;
        this.f26051v = i;
    }

    @Override // p000.InterfaceC0243hn
    /* JADX INFO: renamed from: s */
    public final void mo9634s() {
        if (mo9636u()) {
            return;
        }
        Iterator it = this.f26041l.iterator();
        while (it.hasNext()) {
            m9623z((C0225gw) it.next());
        }
        this.f26041l.clear();
        View view = this.f26046q;
        this.f26034d = view;
        if (view != null) {
            ViewTreeObserver viewTreeObserver = this.f26035e;
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            this.f26035e = viewTreeObserver2;
            if (viewTreeObserver == null) {
                viewTreeObserver2.addOnGlobalLayoutListener(this.f26033c);
            }
            this.f26034d.addOnAttachStateChangeListener(this.f26042m);
        }
    }

    @Override // p000.AbstractC0235hf
    /* JADX INFO: renamed from: t */
    protected final boolean mo9635t() {
        return false;
    }

    @Override // p000.InterfaceC0243hn
    /* JADX INFO: renamed from: u */
    public final boolean mo9636u() {
        return this.f26032b.size() > 0 && ((C0794lg) ((lqq) this.f26032b.get(0)).f39002b).mo9636u();
    }
}
