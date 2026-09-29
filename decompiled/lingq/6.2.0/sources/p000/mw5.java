package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class mw5 implements vn9 {

    /* JADX INFO: renamed from: A */
    public nw5 f51939A;

    /* JADX INFO: renamed from: B */
    public MenuItem.OnActionExpandListener f51940B;

    /* JADX INFO: renamed from: a */
    public final int f51942a;

    /* JADX INFO: renamed from: b */
    public final int f51943b;

    /* JADX INFO: renamed from: c */
    public final int f51944c;

    /* JADX INFO: renamed from: d */
    public final int f51945d;

    /* JADX INFO: renamed from: e */
    public CharSequence f51946e;

    /* JADX INFO: renamed from: f */
    public CharSequence f51947f;

    /* JADX INFO: renamed from: g */
    public Intent f51948g;

    /* JADX INFO: renamed from: h */
    public char f51949h;

    /* JADX INFO: renamed from: j */
    public char f51951j;

    /* JADX INFO: renamed from: l */
    public Drawable f51953l;

    /* JADX INFO: renamed from: n */
    public final hw5 f51955n;

    /* JADX INFO: renamed from: o */
    public om9 f51956o;

    /* JADX INFO: renamed from: p */
    public MenuItem.OnMenuItemClickListener f51957p;

    /* JADX INFO: renamed from: q */
    public CharSequence f51958q;

    /* JADX INFO: renamed from: r */
    public CharSequence f51959r;

    /* JADX INFO: renamed from: y */
    public int f51966y;

    /* JADX INFO: renamed from: z */
    public View f51967z;

    /* JADX INFO: renamed from: i */
    public int f51950i = 4096;

    /* JADX INFO: renamed from: k */
    public int f51952k = 4096;

    /* JADX INFO: renamed from: m */
    public int f51954m = 0;

    /* JADX INFO: renamed from: s */
    public ColorStateList f51960s = null;

    /* JADX INFO: renamed from: t */
    public PorterDuff.Mode f51961t = null;

    /* JADX INFO: renamed from: u */
    public boolean f51962u = false;

    /* JADX INFO: renamed from: v */
    public boolean f51963v = false;

    /* JADX INFO: renamed from: w */
    public boolean f51964w = false;

    /* JADX INFO: renamed from: x */
    public int f51965x = 16;

    /* JADX INFO: renamed from: C */
    public boolean f51941C = false;

    public mw5(hw5 hw5Var, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f51955n = hw5Var;
        this.f51942a = i2;
        this.f51943b = i;
        this.f51944c = i3;
        this.f51945d = i4;
        this.f51946e = charSequence;
        this.f51966y = i5;
    }

    /* JADX INFO: renamed from: c */
    public static void m17073c(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // p000.vn9
    /* JADX INFO: renamed from: a */
    public final vn9 mo17074a(nw5 nw5Var) {
        this.f51967z = null;
        this.f51939A = nw5Var;
        this.f51955n.m13533p(true);
        nw5 nw5Var2 = this.f51939A;
        if (nw5Var2 != null) {
            nw5Var2.m17662g(new web(this));
        }
        return this;
    }

    @Override // p000.vn9
    /* JADX INFO: renamed from: b */
    public final nw5 mo17075b() {
        return this.f51939A;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f51966y & 8) == 0) {
            return false;
        }
        if (this.f51967z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f51940B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f51955n.mo13521d(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final Drawable m17076d(Drawable drawable) {
        if (drawable != null && this.f51964w && (this.f51962u || this.f51963v)) {
            drawable = drawable.mutate();
            if (this.f51962u) {
                drawable.setTintList(this.f51960s);
            }
            if (this.f51963v) {
                drawable.setTintMode(this.f51961t);
            }
            this.f51964w = false;
        }
        return drawable;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m17077e() {
        nw5 nw5Var;
        if ((this.f51966y & 8) == 0) {
            return false;
        }
        if (this.f51967z == null && (nw5Var = this.f51939A) != null) {
            this.f51967z = nw5Var.m17658c(this);
        }
        return this.f51967z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!m17077e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f51940B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f51955n.mo13523f(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m17078f(boolean z) {
        int i = this.f51965x;
        if (z) {
            this.f51965x = i | 32;
        } else {
            this.f51965x = i & (-33);
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f51967z;
        if (view != null) {
            return view;
        }
        nw5 nw5Var = this.f51939A;
        if (nw5Var == null) {
            return null;
        }
        View viewM17658c = nw5Var.m17658c(this);
        this.f51967z = viewM17658c;
        return viewM17658c;
    }

    @Override // p000.vn9, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f51952k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f51951j;
    }

    @Override // p000.vn9, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f51958q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f51943b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f51953l;
        if (drawable != null) {
            return m17076d(drawable);
        }
        int i = this.f51954m;
        if (i == 0) {
            return null;
        }
        Drawable drawableM3932U = bna.m3932U(this.f51955n.f43037a, i);
        this.f51954m = 0;
        this.f51953l = drawableM3932U;
        return m17076d(drawableM3932U);
    }

    @Override // p000.vn9, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f51960s;
    }

    @Override // p000.vn9, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f51961t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f51948g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f51942a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p000.vn9, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f51950i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f51949h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f51944c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f51956o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f51946e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f51947f;
        return charSequence != null ? charSequence : this.f51946e;
    }

    @Override // p000.vn9, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f51959r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f51956o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f51941C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f51965x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f51965x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f51965x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        nw5 nw5Var = this.f51939A;
        if (nw5Var == null || !nw5Var.m17661f()) {
            return (this.f51965x & 8) == 0;
        }
        return (this.f51965x & 8) == 0 && this.f51939A.m17657b();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        hw5 hw5Var = this.f51955n;
        Context context = hw5Var.f43037a;
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f51967z = viewInflate;
        this.f51939A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i2 = this.f51942a) > 0) {
            viewInflate.setId(i2);
        }
        hw5Var.f43047k = true;
        hw5Var.m13533p(true);
        return this;
    }

    @Override // p000.vn9, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f51951j == c && this.f51952k == i) {
            return this;
        }
        this.f51951j = Character.toLowerCase(c);
        this.f51952k = KeyEvent.normalizeMetaState(i);
        this.f51955n.m13533p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.f51965x;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f51965x = i2;
        if (i != i2) {
            this.f51955n.m13533p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i = this.f51965x;
        int i2 = i & 4;
        hw5 hw5Var = this.f51955n;
        if (i2 == 0) {
            int i3 = (i & (-3)) | (z ? 2 : 0);
            this.f51965x = i3;
            if (i != i3) {
                hw5Var.m13533p(false);
            }
            return this;
        }
        ArrayList arrayList = hw5Var.f43042f;
        int size = arrayList.size();
        hw5Var.m13540w();
        for (int i4 = 0; i4 < size; i4++) {
            mw5 mw5Var = (mw5) arrayList.get(i4);
            if (mw5Var.f51943b == this.f51943b && (mw5Var.f51965x & 4) != 0 && mw5Var.isCheckable()) {
                boolean z2 = mw5Var == this;
                int i5 = mw5Var.f51965x;
                int i6 = (z2 ? 2 : 0) | (i5 & (-3));
                mw5Var.f51965x = i6;
                if (i5 != i6) {
                    mw5Var.f51955n.m13533p(false);
                }
            }
        }
        hw5Var.m13539v();
        return this;
    }

    @Override // p000.vn9, android.view.MenuItem
    public final vn9 setContentDescription(CharSequence charSequence) {
        this.f51958q = charSequence;
        this.f51955n.m13533p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        int i = this.f51965x;
        if (z) {
            this.f51965x = i | 16;
        } else {
            this.f51965x = i & (-17);
        }
        this.f51955n.m13533p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f51953l = null;
        this.f51954m = i;
        this.f51964w = true;
        this.f51955n.m13533p(false);
        return this;
    }

    @Override // p000.vn9, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f51960s = colorStateList;
        this.f51962u = true;
        this.f51964w = true;
        this.f51955n.m13533p(false);
        return this;
    }

    @Override // p000.vn9, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f51961t = mode;
        this.f51963v = true;
        this.f51964w = true;
        this.f51955n.m13533p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f51948g = intent;
        return this;
    }

    @Override // p000.vn9, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f51949h == c && this.f51950i == i) {
            return this;
        }
        this.f51949h = c;
        this.f51950i = KeyEvent.normalizeMetaState(i);
        this.f51955n.m13533p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f51940B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f51957p = onMenuItemClickListener;
        return this;
    }

    @Override // p000.vn9, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f51949h = c;
        this.f51950i = KeyEvent.normalizeMetaState(i);
        this.f51951j = Character.toLowerCase(c2);
        this.f51952k = KeyEvent.normalizeMetaState(i2);
        this.f51955n.m13533p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            C3386nv.m17626m("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
            return;
        }
        this.f51966y = i;
        hw5 hw5Var = this.f51955n;
        hw5Var.f43047k = true;
        hw5Var.m13533p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f51946e = charSequence;
        this.f51955n.m13533p(false);
        om9 om9Var = this.f51956o;
        if (om9Var != null) {
            om9Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f51947f = charSequence;
        this.f51955n.m13533p(false);
        return this;
    }

    @Override // p000.vn9, android.view.MenuItem
    public final vn9 setTooltipText(CharSequence charSequence) {
        this.f51959r = charSequence;
        this.f51955n.m13533p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i = this.f51965x;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.f51965x = i2;
        if (i != i2) {
            hw5 hw5Var = this.f51955n;
            hw5Var.f43044h = true;
            hw5Var.m13533p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f51946e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f51954m = 0;
        this.f51953l = drawable;
        this.f51964w = true;
        this.f51955n.m13533p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f51955n.f43037a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f51949h == c) {
            return this;
        }
        this.f51949h = c;
        this.f51955n.m13533p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f51949h = c;
        this.f51951j = Character.toLowerCase(c2);
        this.f51955n.m13533p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f51951j == c) {
            return this;
        }
        this.f51951j = Character.toLowerCase(c);
        this.f51955n.m13533p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f51967z = view;
        this.f51939A = null;
        if (view != null && view.getId() == -1 && (i = this.f51942a) > 0) {
            view.setId(i);
        }
        hw5 hw5Var = this.f51955n;
        hw5Var.f43047k = true;
        hw5Var.m13533p(true);
        return this;
    }
}
