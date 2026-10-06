package p000;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: renamed from: hp */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnKeyListenerC0245hp extends AbstractC0235hf implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, View.OnKeyListener, InterfaceC0239hj {

    /* JADX INFO: renamed from: a */
    final C0800lm f28707a;

    /* JADX INFO: renamed from: c */
    View f28709c;

    /* JADX INFO: renamed from: d */
    ViewTreeObserver f28710d;

    /* JADX INFO: renamed from: e */
    private final Context f28711e;

    /* JADX INFO: renamed from: f */
    private final C0225gw f28712f;

    /* JADX INFO: renamed from: h */
    private final C0222gt f28713h;

    /* JADX INFO: renamed from: i */
    private final boolean f28714i;

    /* JADX INFO: renamed from: j */
    private final int f28715j;

    /* JADX INFO: renamed from: k */
    private final int f28716k;

    /* JADX INFO: renamed from: m */
    private PopupWindow.OnDismissListener f28718m;

    /* JADX INFO: renamed from: n */
    private View f28719n;

    /* JADX INFO: renamed from: o */
    private InterfaceC0238hi f28720o;

    /* JADX INFO: renamed from: p */
    private boolean f28721p;

    /* JADX INFO: renamed from: q */
    private boolean f28722q;

    /* JADX INFO: renamed from: r */
    private int f28723r;

    /* JADX INFO: renamed from: t */
    private boolean f28725t;

    /* JADX INFO: renamed from: b */
    final ViewTreeObserver.OnGlobalLayoutListener f28708b = new ViewTreeObserverOnGlobalLayoutListenerC0244ho(this, 0);

    /* JADX INFO: renamed from: l */
    private final View.OnAttachStateChangeListener f28717l = new ViewOnAttachStateChangeListenerC0217go(this, 2);

    /* JADX INFO: renamed from: s */
    private int f28724s = 0;

    public ViewOnKeyListenerC0245hp(Context context, C0225gw c0225gw, View view, int i, boolean z) {
        this.f28711e = context;
        this.f28712f = c0225gw;
        this.f28714i = z;
        this.f28713h = new C0222gt(c0225gw, LayoutInflater.from(context), z, C0100R.layout.abc_popup_menu_item_layout);
        this.f28716k = i;
        Resources resources = context.getResources();
        this.f28715j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0100R.dimen.abc_config_prefDialogWidth));
        this.f28719n = view;
        this.f28707a = new C0800lm(context, i);
        c0225gw.m9828h(this, context);
    }

    @Override // p000.InterfaceC0243hn
    /* JADX INFO: renamed from: aP */
    public final ListView mo9624aP() {
        return this.f28707a.f38176e;
    }

    @Override // p000.InterfaceC0239hj
    /* JADX INFO: renamed from: c */
    public final void mo9485c(C0225gw c0225gw, boolean z) {
        if (c0225gw != this.f28712f) {
            return;
        }
        mo9626k();
        InterfaceC0238hi interfaceC0238hi = this.f28720o;
        if (interfaceC0238hi != null) {
            interfaceC0238hi.mo8114a(c0225gw, z);
        }
    }

    @Override // p000.InterfaceC0239hj
    /* JADX INFO: renamed from: d */
    public final void mo9486d(InterfaceC0238hi interfaceC0238hi) {
        this.f28720o = interfaceC0238hi;
    }

    @Override // p000.InterfaceC0239hj
    /* JADX INFO: renamed from: e */
    public final boolean mo9487e() {
        return false;
    }

    @Override // p000.InterfaceC0239hj
    /* JADX INFO: renamed from: f */
    public final boolean mo9488f(SubMenuC0246hq subMenuC0246hq) {
        if (subMenuC0246hq.hasVisibleItems()) {
            C0237hh c0237hh = new C0237hh(this.f28711e, subMenuC0246hq, this.f28709c, this.f28714i, this.f28716k);
            c0237hh.m10278e(this.f28720o);
            c0237hh.m10277d(AbstractC0235hf.m10176w(subMenuC0246hq));
            c0237hh.f27773c = this.f28718m;
            this.f28718m = null;
            this.f28712f.m9829i(false);
            C0800lm c0800lm = this.f28707a;
            int width = c0800lm.f38178g;
            int iM15298b = c0800lm.m15298b();
            if ((Gravity.getAbsoluteGravity(this.f28724s, afc.m442c(this.f28719n)) & 7) == 5) {
                width += this.f28719n.getWidth();
            }
            if (!c0237hh.m10280g()) {
                if (c0237hh.f27771a != null) {
                    c0237hh.m10279f(width, iM15298b, true, true);
                }
            }
            InterfaceC0238hi interfaceC0238hi = this.f28720o;
            if (interfaceC0238hi != null) {
                interfaceC0238hi.mo8115b(subMenuC0246hq);
            }
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC0239hj
    /* JADX INFO: renamed from: i */
    public final void mo9491i() {
        this.f28722q = false;
        C0222gt c0222gt = this.f28713h;
        if (c0222gt != null) {
            c0222gt.notifyDataSetChanged();
        }
    }

    @Override // p000.AbstractC0235hf
    /* JADX INFO: renamed from: j */
    public final void mo9625j(C0225gw c0225gw) {
    }

    @Override // p000.InterfaceC0243hn
    /* JADX INFO: renamed from: k */
    public final void mo9626k() {
        if (mo9636u()) {
            this.f28707a.mo9626k();
        }
    }

    @Override // p000.AbstractC0235hf
    /* JADX INFO: renamed from: l */
    public final void mo9627l(View view) {
        this.f28719n = view;
    }

    @Override // p000.AbstractC0235hf
    /* JADX INFO: renamed from: m */
    public final void mo9628m(boolean z) {
        this.f28713h.f26309b = z;
    }

    @Override // p000.AbstractC0235hf
    /* JADX INFO: renamed from: n */
    public final void mo9629n(int i) {
        this.f28724s = i;
    }

    @Override // p000.AbstractC0235hf
    /* JADX INFO: renamed from: o */
    public final void mo9630o(int i) {
        this.f28707a.f38178g = i;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f28721p = true;
        this.f28712f.close();
        ViewTreeObserver viewTreeObserver = this.f28710d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f28710d = this.f28709c.getViewTreeObserver();
            }
            this.f28710d.removeGlobalOnLayoutListener(this.f28708b);
            this.f28710d = null;
        }
        this.f28709c.removeOnAttachStateChangeListener(this.f28717l);
        PopupWindow.OnDismissListener onDismissListener = this.f28718m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.f28718m = onDismissListener;
    }

    @Override // p000.AbstractC0235hf
    /* JADX INFO: renamed from: q */
    public final void mo9632q(boolean z) {
        this.f28725t = z;
    }

    @Override // p000.AbstractC0235hf
    /* JADX INFO: renamed from: r */
    public final void mo9633r(int i) {
        this.f28707a.m15302j(i);
    }

    @Override // p000.InterfaceC0243hn
    /* JADX INFO: renamed from: s */
    public final void mo9634s() {
        View view;
        if (mo9636u()) {
            return;
        }
        if (this.f28721p || (view = this.f28719n) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f28709c = view;
        this.f28707a.m15308v(this);
        C0800lm c0800lm = this.f28707a;
        c0800lm.f38184m = this;
        c0800lm.m15311y();
        View view2 = this.f28709c;
        ViewTreeObserver viewTreeObserver = this.f28710d;
        ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
        this.f28710d = viewTreeObserver2;
        if (viewTreeObserver == null) {
            viewTreeObserver2.addOnGlobalLayoutListener(this.f28708b);
        }
        view2.addOnAttachStateChangeListener(this.f28717l);
        C0800lm c0800lm2 = this.f28707a;
        c0800lm2.f38183l = view2;
        c0800lm2.f38181j = this.f28724s;
        if (!this.f28722q) {
            this.f28723r = m10177x(this.f28713h, this.f28711e, this.f28715j);
            this.f28722q = true;
        }
        this.f28707a.m15306r(this.f28723r);
        this.f28707a.m15310x();
        this.f28707a.m15307t(this.f27531g);
        this.f28707a.mo9634s();
        C0773km c0773km = this.f28707a.f38176e;
        c0773km.setOnKeyListener(this);
        if (this.f28725t && this.f28712f.f26551e != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f28711e).inflate(C0100R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0773km, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f28712f.f26551e);
            }
            frameLayout.setEnabled(false);
            c0773km.addHeaderView(frameLayout, null, false);
        }
        this.f28707a.mo12909e(this.f28713h);
        this.f28707a.mo9634s();
    }

    @Override // p000.InterfaceC0243hn
    /* JADX INFO: renamed from: u */
    public final boolean mo9636u() {
        return !this.f28721p && this.f28707a.mo9636u();
    }
}
