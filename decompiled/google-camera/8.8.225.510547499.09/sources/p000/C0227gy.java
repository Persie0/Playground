package p000;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.wear.ambient.AmbientMode;

/* JADX INFO: renamed from: gy */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0227gy implements add {

    /* JADX INFO: renamed from: B */
    private View f26785B;

    /* JADX INFO: renamed from: C */
    private MenuItem.OnActionExpandListener f26786C;

    /* JADX INFO: renamed from: a */
    public final int f26787a;

    /* JADX INFO: renamed from: b */
    public final int f26788b;

    /* JADX INFO: renamed from: c */
    public final int f26789c;

    /* JADX INFO: renamed from: d */
    public CharSequence f26790d;

    /* JADX INFO: renamed from: e */
    public Intent f26791e;

    /* JADX INFO: renamed from: f */
    public char f26792f;

    /* JADX INFO: renamed from: h */
    public char f26794h;

    /* JADX INFO: renamed from: j */
    public final C0225gw f26796j;

    /* JADX INFO: renamed from: k */
    public SubMenuC0246hq f26797k;

    /* JADX INFO: renamed from: l */
    public CharSequence f26798l;

    /* JADX INFO: renamed from: m */
    public CharSequence f26799m;

    /* JADX INFO: renamed from: n */
    public int f26800n;

    /* JADX INFO: renamed from: o */
    public aej f26801o;

    /* JADX INFO: renamed from: q */
    private final int f26803q;

    /* JADX INFO: renamed from: r */
    private CharSequence f26804r;

    /* JADX INFO: renamed from: s */
    private Drawable f26805s;

    /* JADX INFO: renamed from: u */
    private MenuItem.OnMenuItemClickListener f26807u;

    /* JADX INFO: renamed from: g */
    public int f26793g = 4096;

    /* JADX INFO: renamed from: i */
    public int f26795i = 4096;

    /* JADX INFO: renamed from: t */
    private int f26806t = 0;

    /* JADX INFO: renamed from: v */
    private ColorStateList f26808v = null;

    /* JADX INFO: renamed from: w */
    private PorterDuff.Mode f26809w = null;

    /* JADX INFO: renamed from: x */
    private boolean f26810x = false;

    /* JADX INFO: renamed from: y */
    private boolean f26811y = false;

    /* JADX INFO: renamed from: z */
    private boolean f26812z = false;

    /* JADX INFO: renamed from: A */
    private int f26784A = 16;

    /* JADX INFO: renamed from: p */
    public boolean f26802p = false;

    public C0227gy(C0225gw c0225gw, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f26796j = c0225gw;
        this.f26787a = i2;
        this.f26788b = i;
        this.f26803q = i3;
        this.f26789c = i4;
        this.f26790d = charSequence;
        this.f26800n = i5;
    }

    /* JADX INFO: renamed from: g */
    public static void m9947g(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    /* JADX INFO: renamed from: v */
    private final Drawable m9948v(Drawable drawable) {
        if (drawable != null && this.f26812z && (this.f26810x || this.f26811y)) {
            drawable = drawable.mutate();
            if (this.f26810x) {
                acv.m238g(drawable, this.f26808v);
            }
            if (this.f26811y) {
                acv.m239h(drawable, this.f26809w);
            }
            this.f26812z = false;
        }
        return drawable;
    }

    @Override // p000.add
    /* JADX INFO: renamed from: a */
    public final aej mo264a() {
        return this.f26801o;
    }

    @Override // p000.add
    /* JADX INFO: renamed from: b */
    public final void mo265b(CharSequence charSequence) {
        this.f26798l = charSequence;
        this.f26796j.m9832l(false);
    }

    @Override // p000.add
    /* JADX INFO: renamed from: c */
    public final void mo266c(aej aejVar) {
        aej aejVar2 = this.f26801o;
        if (aejVar2 != null) {
            aejVar2.f256b = null;
        }
        this.f26785B = null;
        this.f26801o = aejVar;
        this.f26796j.m9832l(true);
        aej aejVar3 = this.f26801o;
        if (aejVar3 != null) {
            aejVar3.mo341h(new AmbientMode.AmbientController(this));
        }
    }

    @Override // p000.add, android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f26800n & 8) == 0) {
            return false;
        }
        if (this.f26785B == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f26786C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f26796j.mo9840t(this);
        }
        return false;
    }

    @Override // p000.add
    /* JADX INFO: renamed from: d */
    public final void mo267d(CharSequence charSequence) {
        this.f26799m = charSequence;
        this.f26796j.m9832l(false);
    }

    /* JADX INFO: renamed from: e */
    public final char m9949e() {
        return this.f26796j.mo9844x() ? this.f26794h : this.f26792f;
    }

    @Override // p000.add, android.view.MenuItem
    public final boolean expandActionView() {
        if (!m9956m()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f26786C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f26796j.mo9842v(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final CharSequence m9950f(InterfaceC0240hk interfaceC0240hk) {
        return (interfaceC0240hk == null || !interfaceC0240hk.mo1034e()) ? this.f26790d : getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // p000.add, android.view.MenuItem
    public final View getActionView() {
        View view = this.f26785B;
        if (view != null) {
            return view;
        }
        aej aejVar = this.f26801o;
        if (aejVar == null) {
            return null;
        }
        View viewMo338e = aejVar.mo338e(this);
        this.f26785B = viewMo338e;
        return viewMo338e;
    }

    @Override // p000.add, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f26795i;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f26794h;
    }

    @Override // p000.add, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f26798l;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f26788b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f26805s;
        if (drawable != null) {
            return m9948v(drawable);
        }
        int i = this.f26806t;
        if (i == 0) {
            return null;
        }
        Drawable drawableM8752a = C0194fs.m8752a(this.f26796j.f26547a, i);
        this.f26806t = 0;
        this.f26805s = drawableM8752a;
        return m9948v(drawableM8752a);
    }

    @Override // p000.add, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f26808v;
    }

    @Override // p000.add, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f26809w;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f26791e;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.f26787a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p000.add, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f26793g;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f26792f;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f26803q;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f26797k;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f26790d;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f26804r;
        return charSequence != null ? charSequence : this.f26790d;
    }

    @Override // p000.add, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f26799m;
    }

    /* JADX INFO: renamed from: h */
    public final void m9951h(boolean z) {
        this.f26802p = z;
        this.f26796j.m9832l(false);
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f26797k != null;
    }

    /* JADX INFO: renamed from: i */
    final void m9952i(boolean z) {
        int i = this.f26784A;
        int i2 = (true != z ? 0 : 2) | (i & (-3));
        this.f26784A = i2;
        if (i != i2) {
            this.f26796j.m9832l(false);
        }
    }

    @Override // p000.add, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f26802p;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f26784A & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f26784A & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f26784A & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        aej aejVar = this.f26801o;
        if (aejVar == null || !aejVar.mo340g()) {
            return (this.f26784A & 8) == 0;
        }
        return (this.f26784A & 8) == 0 && this.f26801o.mo339f();
    }

    /* JADX INFO: renamed from: j */
    public final void m9953j(boolean z) {
        this.f26784A = (true != z ? 0 : 4) | (this.f26784A & (-5));
    }

    /* JADX INFO: renamed from: k */
    public final void m9954k(boolean z) {
        this.f26784A = z ? this.f26784A | 32 : this.f26784A & (-33);
    }

    /* JADX INFO: renamed from: l */
    public final void m9955l(SubMenuC0246hq subMenuC0246hq) {
        this.f26797k = subMenuC0246hq;
        subMenuC0246hq.setHeaderTitle(this.f26790d);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m9956m() {
        aej aejVar;
        if ((this.f26800n & 8) != 0) {
            if (this.f26785B == null && (aejVar = this.f26801o) != null) {
                this.f26785B = aejVar.mo338e(this);
            }
            if (this.f26785B != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m9957n() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f26807u;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0225gw c0225gw = this.f26796j;
        if (c0225gw.mo9841u(c0225gw, this)) {
            return true;
        }
        Intent intent = this.f26791e;
        if (intent != null) {
            try {
                this.f26796j.f26547a.startActivity(intent);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        aej aejVar = this.f26801o;
        return aejVar != null && aejVar.mo337d();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m9958o() {
        return (this.f26784A & 32) == 32;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m9959p() {
        return (this.f26784A & 4) != 0;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m9960q() {
        return (this.f26800n & 1) == 1;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m9961r() {
        return (this.f26800n & 2) == 2;
    }

    /* JADX INFO: renamed from: s */
    final boolean m9962s(boolean z) {
        int i = this.f26784A;
        int i2 = (true != z ? 8 : 0) | (i & (-9));
        this.f26784A = i2;
        return i != i2;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // p000.add, android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setActionView(int i) {
        Context context = this.f26796j.f26547a;
        m9964u(LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f26794h == c) {
            return this;
        }
        this.f26794h = Character.toLowerCase(c);
        this.f26796j.m9832l(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.f26784A;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f26784A = i2;
        if (i != i2) {
            this.f26796j.m9832l(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        if ((this.f26784A & 4) != 0) {
            C0225gw c0225gw = this.f26796j;
            int i = this.f26788b;
            int size = c0225gw.f26549c.size();
            c0225gw.m9839s();
            for (int i2 = 0; i2 < size; i2++) {
                C0227gy c0227gy = (C0227gy) c0225gw.f26549c.get(i2);
                if (c0227gy.f26788b == i && c0227gy.m9959p() && c0227gy.isCheckable()) {
                    c0227gy.m9952i(c0227gy == this);
                }
            }
            c0225gw.m9838r();
        } else {
            m9952i(z);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        mo265b(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.f26784A = z ? this.f26784A | 16 : this.f26784A & (-17);
        this.f26796j.m9832l(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f26805s = null;
        this.f26806t = i;
        this.f26812z = true;
        this.f26796j.m9832l(false);
        return this;
    }

    @Override // p000.add, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f26808v = colorStateList;
        this.f26810x = true;
        this.f26812z = true;
        this.f26796j.m9832l(false);
        return this;
    }

    @Override // p000.add, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f26809w = mode;
        this.f26811y = true;
        this.f26812z = true;
        this.f26796j.m9832l(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f26791e = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f26792f == c) {
            return this;
        }
        this.f26792f = c;
        this.f26796j.m9832l(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f26786C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f26807u = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f26792f = c;
        this.f26794h = Character.toLowerCase(c2);
        this.f26796j.m9832l(false);
        return this;
    }

    @Override // p000.add, android.view.MenuItem
    public final /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f26796j.f26547a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f26804r = charSequence;
        this.f26796j.m9832l(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        mo267d(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        if (m9962s(z)) {
            this.f26796j.m9819C();
        }
        return this;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m9963t() {
        return this.f26796j.mo9845y() && m9949e() != 0;
    }

    public final String toString() {
        CharSequence charSequence = this.f26790d;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public final void m9964u(View view) {
        int i;
        this.f26785B = view;
        this.f26801o = null;
        if (view != null && view.getId() == -1 && (i = this.f26787a) > 0) {
            view.setId(i);
        }
        this.f26796j.m9818B();
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f26806t = 0;
        this.f26805s = drawable;
        this.f26812z = true;
        this.f26796j.m9832l(false);
        return this;
    }

    @Override // p000.add, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f26792f == c && this.f26793g == i) {
            return this;
        }
        this.f26792f = c;
        this.f26793g = KeyEvent.normalizeMetaState(i);
        this.f26796j.m9832l(false);
        return this;
    }

    @Override // p000.add, android.view.MenuItem
    public final void setShowAsAction(int i) {
        switch (i & 3) {
            case 0:
            case 1:
            case 2:
                this.f26800n = i;
                this.f26796j.m9818B();
                return;
            default:
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f26790d = charSequence;
        this.f26796j.m9832l(false);
        SubMenuC0246hq subMenuC0246hq = this.f26797k;
        if (subMenuC0246hq != null) {
            subMenuC0246hq.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // p000.add, android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        m9964u(view);
        return this;
    }

    @Override // p000.add, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f26794h == c && this.f26795i == i) {
            return this;
        }
        this.f26794h = Character.toLowerCase(c);
        this.f26795i = KeyEvent.normalizeMetaState(i);
        this.f26796j.m9832l(false);
        return this;
    }

    @Override // p000.add, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f26792f = c;
        this.f26793g = KeyEvent.normalizeMetaState(i);
        this.f26794h = Character.toLowerCase(c2);
        this.f26795i = KeyEvent.normalizeMetaState(i2);
        this.f26796j.m9832l(false);
        return this;
    }
}
