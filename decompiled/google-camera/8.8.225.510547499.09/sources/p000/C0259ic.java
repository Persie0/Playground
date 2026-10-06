package p000;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.widget.ActionMenuView;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.ArrayList;

/* JADX INFO: renamed from: ic */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0259ic extends C0215gm {

    /* JADX INFO: renamed from: g */
    C0257ia f30282g;

    /* JADX INFO: renamed from: h */
    public int f30283h;

    /* JADX INFO: renamed from: i */
    public C0258ib f30284i;

    /* JADX INFO: renamed from: j */
    public C0254hy f30285j;

    /* JADX INFO: renamed from: k */
    public fvx f30286k;

    /* JADX INFO: renamed from: l */
    final C0178fc f30287l;

    /* JADX INFO: renamed from: m */
    private boolean f30288m;

    /* JADX INFO: renamed from: n */
    private boolean f30289n;

    /* JADX INFO: renamed from: o */
    private int f30290o;

    /* JADX INFO: renamed from: p */
    private int f30291p;

    /* JADX INFO: renamed from: q */
    private boolean f30292q;

    /* JADX INFO: renamed from: r */
    private final SparseBooleanArray f30293r;

    /* JADX INFO: renamed from: s */
    private AmbientMode.AmbientController f30294s;

    public C0259ic(Context context) {
        super(context);
        this.f30293r = new SparseBooleanArray();
        this.f30287l = new C0178fc(this, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.C0215gm
    /* JADX INFO: renamed from: a */
    public final View mo9483a(C0227gy c0227gy, View view, ViewGroup viewGroup) {
        View actionView = c0227gy.getActionView();
        if (actionView == null || c0227gy.m9956m()) {
            InterfaceC0240hk interfaceC0240hk = view instanceof InterfaceC0240hk ? (InterfaceC0240hk) view : (InterfaceC0240hk) this.f25574d.inflate(C0100R.layout.abc_action_menu_item_layout, viewGroup, false);
            interfaceC0240hk.mo1035f(c0227gy);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) interfaceC0240hk;
            actionMenuItemView.f910b = (ActionMenuView) this.f25576f;
            if (this.f30294s == null) {
                this.f30294s = new AmbientMode.AmbientController(this);
            }
            actionMenuItemView.f911c = this.f30294s;
            actionView = (View) interfaceC0240hk;
        }
        actionView.setVisibility(true == c0227gy.f26802p ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!(layoutParams instanceof C0262if)) {
            actionView.setLayoutParams(ActionMenuView.m1069o(layoutParams));
        }
        return actionView;
    }

    @Override // p000.C0215gm, p000.InterfaceC0239hj
    /* JADX INFO: renamed from: b */
    public final void mo9484b(Context context, C0225gw c0225gw) {
        this.f25572b = context;
        LayoutInflater.from(this.f25572b);
        this.f25573c = c0225gw;
        Resources resources = context.getResources();
        if (!this.f30289n) {
            this.f30288m = true;
        }
        this.f30290o = context.getResources().getDisplayMetrics().widthPixels / 2;
        this.f30283h = C0138dq.m6567c(context);
        int measuredWidth = this.f30290o;
        if (this.f30288m) {
            if (this.f30282g == null) {
                this.f30282g = new C0257ia(this, this.f25571a);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f30282g.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f30282g.getMeasuredWidth();
        } else {
            this.f30282g = null;
        }
        this.f30291p = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // p000.C0215gm, p000.InterfaceC0239hj
    /* JADX INFO: renamed from: c */
    public final void mo9485c(C0225gw c0225gw, boolean z) {
        m11039n();
        InterfaceC0238hi interfaceC0238hi = this.f25575e;
        if (interfaceC0238hi != null) {
            interfaceC0238hi.mo8114a(c0225gw, z);
        }
    }

    @Override // p000.C0215gm, p000.InterfaceC0239hj
    /* JADX INFO: renamed from: e */
    public final boolean mo9487e() {
        ArrayList arrayListM9826f;
        int size;
        boolean z;
        boolean z2;
        C0225gw c0225gw = this.f25573c;
        View view = null;
        if (c0225gw != null) {
            arrayListM9826f = c0225gw.m9826f();
            size = arrayListM9826f.size();
        } else {
            arrayListM9826f = null;
            size = 0;
        }
        int i = this.f30283h;
        int i2 = this.f30291p;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f25576f;
        int i3 = 0;
        boolean z3 = false;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            z = true;
            if (i3 >= size) {
                break;
            }
            C0227gy c0227gy = (C0227gy) arrayListM9826f.get(i3);
            if (c0227gy.m9961r()) {
                i4++;
            } else if (c0227gy.m9960q()) {
                i5++;
            } else {
                z3 = true;
            }
            if (this.f30292q && c0227gy.f26802p) {
                i = 0;
            }
            i3++;
        }
        if (this.f30288m && (z3 || i5 + i4 > i)) {
            i--;
        }
        int i6 = i - i4;
        SparseBooleanArray sparseBooleanArray = this.f30293r;
        sparseBooleanArray.clear();
        int i7 = 0;
        int i8 = 0;
        while (i7 < size) {
            C0227gy c0227gy2 = (C0227gy) arrayListM9826f.get(i7);
            if (c0227gy2.m9961r()) {
                View viewMo9483a = mo9483a(c0227gy2, view, viewGroup);
                viewMo9483a.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewMo9483a.getMeasuredWidth();
                i2 -= measuredWidth;
                if (i8 == 0) {
                    i8 = measuredWidth;
                }
                int i9 = c0227gy2.f26788b;
                if (i9 != 0) {
                    sparseBooleanArray.put(i9, z);
                }
                c0227gy2.m9954k(z);
            } else if (c0227gy2.m9960q()) {
                int i10 = c0227gy2.f26788b;
                boolean z4 = sparseBooleanArray.get(i10);
                boolean z5 = (i6 > 0 || z4) && i2 > 0;
                if (z5) {
                    View viewMo9483a2 = mo9483a(c0227gy2, view, viewGroup);
                    viewMo9483a2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewMo9483a2.getMeasuredWidth();
                    i2 -= measuredWidth2;
                    if (i8 == 0) {
                        i8 = measuredWidth2;
                    }
                    z2 = i2 + i8 > 0;
                } else {
                    z2 = z5;
                }
                if (z2 && i10 != 0) {
                    sparseBooleanArray.put(i10, z);
                } else if (z4) {
                    sparseBooleanArray.put(i10, false);
                    for (int i11 = 0; i11 < i7; i11++) {
                        C0227gy c0227gy3 = (C0227gy) arrayListM9826f.get(i11);
                        if (c0227gy3.f26788b == i10) {
                            if (c0227gy3.m9958o()) {
                                i6++;
                            }
                            c0227gy3.m9954k(false);
                        }
                    }
                }
                if (z2) {
                    i6--;
                }
                c0227gy2.m9954k(z2);
            } else {
                c0227gy2.m9954k(false);
            }
            i7++;
            view = null;
            z = true;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.C0215gm, p000.InterfaceC0239hj
    /* JADX INFO: renamed from: f */
    public final boolean mo9488f(SubMenuC0246hq subMenuC0246hq) {
        C0225gw c0225gw;
        boolean z = false;
        if (!subMenuC0246hq.hasVisibleItems()) {
            return false;
        }
        SubMenuC0246hq subMenuC0246hq2 = subMenuC0246hq;
        while (true) {
            C0225gw c0225gw2 = subMenuC0246hq2.f29024j;
            if (c0225gw2 == this.f25573c) {
                break;
            }
            subMenuC0246hq2 = (SubMenuC0246hq) c0225gw2;
        }
        C0227gy c0227gy = subMenuC0246hq2.f29025k;
        ViewGroup viewGroup = (ViewGroup) this.f25576f;
        ?? r3 = 0;
        r3 = 0;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                KeyEvent.Callback childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof InterfaceC0240hk) && ((InterfaceC0240hk) childAt).mo1030a() == c0227gy) {
                    r3 = childAt;
                    break;
                }
            }
        }
        if (r3 == 0) {
            return false;
        }
        C0227gy c0227gy2 = subMenuC0246hq.f29025k;
        int size = subMenuC0246hq.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = subMenuC0246hq.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
        }
        C0254hy c0254hy = new C0254hy(this, this.f25572b, subMenuC0246hq, r3);
        this.f30285j = c0254hy;
        c0254hy.m10277d(z);
        if (!this.f30285j.m10281h()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
        InterfaceC0238hi interfaceC0238hi = this.f25575e;
        if (interfaceC0238hi != null) {
            if (subMenuC0246hq == null) {
                c0225gw = this.f25573c;
            }
            interfaceC0238hi.mo8115b(c0225gw);
        }
        c0225gw = subMenuC0246hq;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fc  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.C0215gm, p000.InterfaceC0239hj
    /* JADX INFO: renamed from: i */
    public final void mo9491i() {
        C0257ia c0257ia;
        Object parent;
        Object obj;
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f25576f;
        boolean z = false;
        if (viewGroup != null) {
            C0225gw c0225gw = this.f25573c;
            if (c0225gw != null) {
                c0225gw.m9831k();
                ArrayList arrayListM9826f = this.f25573c.m9826f();
                int size = arrayListM9826f.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C0227gy c0227gy = (C0227gy) arrayListM9826f.get(i2);
                    if (c0227gy.m9958o()) {
                        View childAt = viewGroup.getChildAt(i);
                        C0227gy c0227gyMo1030a = childAt instanceof InterfaceC0240hk ? ((InterfaceC0240hk) childAt).mo1030a() : null;
                        View viewMo9483a = mo9483a(c0227gy, childAt, viewGroup);
                        if (c0227gy != c0227gyMo1030a) {
                            viewMo9483a.setPressed(false);
                            viewMo9483a.jumpDrawablesToCurrentState();
                        }
                        if (viewMo9483a != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewMo9483a.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewMo9483a);
                            }
                            ((ViewGroup) this.f25576f).addView(viewMo9483a, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f30282g) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f25576f).requestLayout();
        C0225gw c0225gw2 = this.f25573c;
        if (c0225gw2 != null) {
            c0225gw2.m9831k();
            ArrayList arrayList = c0225gw2.f26550d;
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                aej aejVar = ((C0227gy) arrayList.get(i3)).f26801o;
            }
        }
        C0225gw c0225gw3 = this.f25573c;
        ArrayList arrayListM9825e = c0225gw3 != null ? c0225gw3.m9825e() : null;
        if (!this.f30288m || arrayListM9825e == null) {
            c0257ia = this.f30282g;
            if (c0257ia != null) {
                parent = c0257ia.getParent();
                obj = this.f25576f;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f30282g);
                }
            }
        } else {
            int size3 = arrayListM9825e.size();
            if (size3 == 1) {
                z = !((C0227gy) arrayListM9825e.get(0)).f26802p;
            } else if (size3 > 0) {
                z = true;
            }
            if (z) {
                if (this.f30282g == null) {
                    this.f30282g = new C0257ia(this, this.f25571a);
                }
                ViewGroup viewGroup3 = (ViewGroup) this.f30282g.getParent();
                if (viewGroup3 != this.f25576f) {
                    if (viewGroup3 != null) {
                        viewGroup3.removeView(this.f30282g);
                    }
                    ActionMenuView actionMenuView = (ActionMenuView) this.f25576f;
                    C0257ia c0257ia2 = this.f30282g;
                    C0262if c0262ifM1068n = ActionMenuView.m1068n();
                    c0262ifM1068n.f30586a = true;
                    actionMenuView.addView(c0257ia2, c0262ifM1068n);
                }
            } else {
                c0257ia = this.f30282g;
                if (c0257ia != null) {
                    parent = c0257ia.getParent();
                    obj = this.f25576f;
                    if (parent == obj) {
                        ((ViewGroup) obj).removeView(this.f30282g);
                    }
                }
            }
        }
        ((ActionMenuView) this.f25576f).f988b = this.f30288m;
    }

    /* JADX INFO: renamed from: j */
    public final void m11035j(ActionMenuView actionMenuView) {
        this.f25576f = actionMenuView;
        actionMenuView.f987a = this.f25573c;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m11036k() {
        Object obj;
        fvx fvxVar = this.f30286k;
        if (fvxVar != null && (obj = this.f25576f) != null) {
            ((View) obj).removeCallbacks(fvxVar);
            this.f30286k = null;
            return true;
        }
        C0258ib c0258ib = this.f30284i;
        if (c0258ib == null) {
            return false;
        }
        c0258ib.m10275b();
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m11037l() {
        C0258ib c0258ib = this.f30284i;
        return c0258ib != null && c0258ib.m10280g();
    }

    /* JADX INFO: renamed from: m */
    public final boolean m11038m() {
        C0225gw c0225gw;
        if (!this.f30288m || m11037l() || (c0225gw = this.f25573c) == null || this.f25576f == null || this.f30286k != null || c0225gw.m9825e().isEmpty()) {
            return false;
        }
        this.f30286k = new fvx(this, new C0258ib(this, this.f25572b, this.f25573c, this.f30282g), 1);
        ((View) this.f25576f).post(this.f30286k);
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final void m11039n() {
        m11036k();
        m11042q();
    }

    /* JADX INFO: renamed from: o */
    public final void m11040o() {
        this.f30292q = true;
    }

    /* JADX INFO: renamed from: p */
    public final void m11041p() {
        this.f30288m = true;
        this.f30289n = true;
    }

    /* JADX INFO: renamed from: q */
    public final void m11042q() {
        C0254hy c0254hy = this.f30285j;
        if (c0254hy != null) {
            c0254hy.m10275b();
        }
    }
}
