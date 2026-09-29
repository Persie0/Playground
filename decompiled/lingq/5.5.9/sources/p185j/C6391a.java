package p185j;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p254m2.C7472a;
import p329q2.C8488a;
import p353r2.InterfaceMenuItemC8725b;
import p471x2.AbstractC10028b;

/* JADX INFO: renamed from: j.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6391a implements InterfaceMenuItemC8725b {

    /* JADX INFO: renamed from: a */
    public CharSequence f36820a;

    /* JADX INFO: renamed from: b */
    public CharSequence f36821b;

    /* JADX INFO: renamed from: c */
    public Intent f36822c;

    /* JADX INFO: renamed from: d */
    public char f36823d;

    /* JADX INFO: renamed from: f */
    public char f36825f;

    /* JADX INFO: renamed from: h */
    public Drawable f36827h;

    /* JADX INFO: renamed from: i */
    public final Context f36828i;

    /* JADX INFO: renamed from: j */
    public CharSequence f36829j;

    /* JADX INFO: renamed from: k */
    public CharSequence f36830k;

    /* JADX INFO: renamed from: e */
    public int f36824e = 4096;

    /* JADX INFO: renamed from: g */
    public int f36826g = 4096;

    /* JADX INFO: renamed from: l */
    public ColorStateList f36831l = null;

    /* JADX INFO: renamed from: m */
    public PorterDuff.Mode f36832m = null;

    /* JADX INFO: renamed from: n */
    public boolean f36833n = false;

    /* JADX INFO: renamed from: o */
    public boolean f36834o = false;

    /* JADX INFO: renamed from: p */
    public int f36835p = 16;

    public C6391a(Context context, CharSequence charSequence) {
        this.f36828i = context;
        this.f36820a = charSequence;
    }

    @Override // p353r2.InterfaceMenuItemC8725b
    /* JADX INFO: renamed from: a */
    public final AbstractC10028b mo945a() {
        return null;
    }

    @Override // p353r2.InterfaceMenuItemC8725b
    /* JADX INFO: renamed from: b */
    public final InterfaceMenuItemC8725b mo946b(AbstractC10028b abstractC10028b) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: c */
    public final void m13014c() {
        Drawable drawable = this.f36827h;
        if (drawable != null && (this.f36833n || this.f36834o)) {
            this.f36827h = drawable;
            Drawable drawableMutate = drawable.mutate();
            this.f36827h = drawableMutate;
            if (this.f36833n) {
                C8488a.b.m16570h(drawableMutate, this.f36831l);
            }
            if (this.f36834o) {
                C8488a.b.m16571i(this.f36827h, this.f36832m);
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // p353r2.InterfaceMenuItemC8725b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f36826g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f36825f;
    }

    @Override // p353r2.InterfaceMenuItemC8725b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f36829j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f36827h;
    }

    @Override // p353r2.InterfaceMenuItemC8725b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f36831l;
    }

    @Override // p353r2.InterfaceMenuItemC8725b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f36832m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f36822c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p353r2.InterfaceMenuItemC8725b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f36824e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f36823d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f36820a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f36821b;
        return charSequence != null ? charSequence : this.f36820a;
    }

    @Override // p353r2.InterfaceMenuItemC8725b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f36830k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f36835p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f36835p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f36835p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f36835p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f36825f = Character.toLowerCase(c10);
        return this;
    }

    @Override // p353r2.InterfaceMenuItemC8725b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f36825f = Character.toLowerCase(c10);
        this.f36826g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        this.f36835p = (z10 ? 1 : 0) | (this.f36835p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        this.f36835p = (z10 ? 2 : 0) | (this.f36835p & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f36829j = charSequence;
        return this;
    }

    @Override // p353r2.InterfaceMenuItemC8725b, android.view.MenuItem
    public final InterfaceMenuItemC8725b setContentDescription(CharSequence charSequence) {
        this.f36829j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        this.f36835p = (z10 ? 16 : 0) | (this.f36835p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        Object obj = C7472a.f41322a;
        this.f36827h = C7472a.c.m14849b(this.f36828i, i10);
        m13014c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f36827h = drawable;
        m13014c();
        return this;
    }

    @Override // p353r2.InterfaceMenuItemC8725b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f36831l = colorStateList;
        this.f36833n = true;
        m13014c();
        return this;
    }

    @Override // p353r2.InterfaceMenuItemC8725b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f36832m = mode;
        this.f36834o = true;
        m13014c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f36822c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        this.f36823d = c10;
        return this;
    }

    @Override // p353r2.InterfaceMenuItemC8725b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i10) {
        this.f36823d = c10;
        this.f36824e = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f36823d = c10;
        this.f36825f = Character.toLowerCase(c11);
        return this;
    }

    @Override // p353r2.InterfaceMenuItemC8725b, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f36823d = c10;
        this.f36824e = KeyEvent.normalizeMetaState(i10);
        this.f36825f = Character.toLowerCase(c11);
        this.f36826g = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        this.f36820a = this.f36828i.getResources().getString(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f36820a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f36821b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f36830k = charSequence;
        return this;
    }

    @Override // p353r2.InterfaceMenuItemC8725b, android.view.MenuItem
    public final InterfaceMenuItemC8725b setTooltipText(CharSequence charSequence) {
        this.f36830k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        int i10 = 8;
        int i11 = this.f36835p & 8;
        if (z10) {
            i10 = 0;
        }
        this.f36835p = i11 | i10;
        return this;
    }
}
