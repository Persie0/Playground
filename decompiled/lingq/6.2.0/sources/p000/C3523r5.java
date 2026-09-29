package p000;

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

/* JADX INFO: renamed from: r5 */
/* JADX INFO: loaded from: classes.dex */
public final class C3523r5 implements vn9 {

    /* JADX INFO: renamed from: a */
    public CharSequence f58717a;

    /* JADX INFO: renamed from: b */
    public CharSequence f58718b;

    /* JADX INFO: renamed from: c */
    public Intent f58719c;

    /* JADX INFO: renamed from: d */
    public char f58720d;

    /* JADX INFO: renamed from: e */
    public int f58721e;

    /* JADX INFO: renamed from: f */
    public char f58722f;

    /* JADX INFO: renamed from: g */
    public int f58723g;

    /* JADX INFO: renamed from: h */
    public Drawable f58724h;

    /* JADX INFO: renamed from: i */
    public Context f58725i;

    /* JADX INFO: renamed from: j */
    public CharSequence f58726j;

    /* JADX INFO: renamed from: k */
    public CharSequence f58727k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f58728l;

    /* JADX INFO: renamed from: m */
    public PorterDuff.Mode f58729m;

    /* JADX INFO: renamed from: n */
    public boolean f58730n;

    /* JADX INFO: renamed from: o */
    public boolean f58731o;

    /* JADX INFO: renamed from: p */
    public int f58732p;

    @Override // p000.vn9
    /* JADX INFO: renamed from: a */
    public final vn9 mo17074a(nw5 nw5Var) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.vn9
    /* JADX INFO: renamed from: b */
    public final nw5 mo17075b() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m20404c() {
        Drawable drawable = this.f58724h;
        if (drawable != null) {
            if (this.f58730n || this.f58731o) {
                this.f58724h = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f58724h = drawableMutate;
                if (this.f58730n) {
                    drawableMutate.setTintList(this.f58728l);
                }
                if (this.f58731o) {
                    this.f58724h.setTintMode(this.f58729m);
                }
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

    @Override // p000.vn9, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f58723g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f58722f;
    }

    @Override // p000.vn9, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f58726j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f58724h;
    }

    @Override // p000.vn9, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f58728l;
    }

    @Override // p000.vn9, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f58729m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f58719c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p000.vn9, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f58721e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f58720d;
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
        return this.f58717a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f58718b;
        return charSequence != null ? charSequence : this.f58717a;
    }

    @Override // p000.vn9, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f58727k;
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
        return (this.f58732p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f58732p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f58732p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f58732p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.vn9, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f58722f = Character.toLowerCase(c);
        this.f58723g = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.f58732p = (z ? 1 : 0) | (this.f58732p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.f58732p = (z ? 2 : 0) | (this.f58732p & (-3));
        return this;
    }

    @Override // p000.vn9, android.view.MenuItem
    public final vn9 setContentDescription(CharSequence charSequence) {
        this.f58726j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.f58732p = (z ? 16 : 0) | (this.f58732p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f58724h = this.f58725i.getDrawable(i);
        m20404c();
        return this;
    }

    @Override // p000.vn9, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f58728l = colorStateList;
        this.f58730n = true;
        m20404c();
        return this;
    }

    @Override // p000.vn9, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f58729m = mode;
        this.f58731o = true;
        m20404c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f58719c = intent;
        return this;
    }

    @Override // p000.vn9, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.f58720d = c;
        this.f58721e = KeyEvent.normalizeMetaState(i);
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

    @Override // p000.vn9, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f58720d = c;
        this.f58721e = KeyEvent.normalizeMetaState(i);
        this.f58722f = Character.toLowerCase(c2);
        this.f58723g = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f58717a = this.f58725i.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f58718b = charSequence;
        return this;
    }

    @Override // p000.vn9, android.view.MenuItem
    public final vn9 setTooltipText(CharSequence charSequence) {
        this.f58727k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.f58732p = (this.f58732p & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f58726j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f58727k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.f58720d = c;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f58724h = drawable;
        m20404c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f58722f = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f58717a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f58720d = c;
        this.f58722f = Character.toLowerCase(c2);
        return this;
    }
}
