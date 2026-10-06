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

/* JADX INFO: renamed from: gk */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0213gk implements add {

    /* JADX INFO: renamed from: a */
    private CharSequence f25207a;

    /* JADX INFO: renamed from: b */
    private CharSequence f25208b;

    /* JADX INFO: renamed from: c */
    private Intent f25209c;

    /* JADX INFO: renamed from: d */
    private char f25210d;

    /* JADX INFO: renamed from: f */
    private char f25212f;

    /* JADX INFO: renamed from: h */
    private Drawable f25214h;

    /* JADX INFO: renamed from: i */
    private final Context f25215i;

    /* JADX INFO: renamed from: j */
    private CharSequence f25216j;

    /* JADX INFO: renamed from: k */
    private CharSequence f25217k;

    /* JADX INFO: renamed from: e */
    private int f25211e = 4096;

    /* JADX INFO: renamed from: g */
    private int f25213g = 4096;

    /* JADX INFO: renamed from: l */
    private ColorStateList f25218l = null;

    /* JADX INFO: renamed from: m */
    private PorterDuff.Mode f25219m = null;

    /* JADX INFO: renamed from: n */
    private boolean f25220n = false;

    /* JADX INFO: renamed from: o */
    private boolean f25221o = false;

    /* JADX INFO: renamed from: p */
    private int f25222p = 16;

    public C0213gk(Context context, CharSequence charSequence) {
        this.f25215i = context;
        this.f25207a = charSequence;
    }

    /* JADX INFO: renamed from: e */
    private final void m9351e() {
        Drawable drawable = this.f25214h;
        if (drawable != null) {
            if (this.f25220n || this.f25221o) {
                Drawable drawableMutate = drawable.mutate();
                this.f25214h = drawableMutate;
                if (this.f25220n) {
                    acv.m238g(drawableMutate, this.f25218l);
                }
                if (this.f25221o) {
                    acv.m239h(this.f25214h, this.f25219m);
                }
            }
        }
    }

    @Override // p000.add
    /* JADX INFO: renamed from: a */
    public final aej mo264a() {
        return null;
    }

    @Override // p000.add
    /* JADX INFO: renamed from: b */
    public final void mo265b(CharSequence charSequence) {
        this.f25216j = charSequence;
    }

    @Override // p000.add
    /* JADX INFO: renamed from: c */
    public final void mo266c(aej aejVar) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.add, android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // p000.add
    /* JADX INFO: renamed from: d */
    public final void mo267d(CharSequence charSequence) {
        this.f25217k = charSequence;
    }

    @Override // p000.add, android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.add, android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // p000.add, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f25213g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f25212f;
    }

    @Override // p000.add, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f25216j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f25214h;
    }

    @Override // p000.add, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f25218l;
    }

    @Override // p000.add, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f25219m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f25209c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p000.add, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f25211e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f25210d;
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
        return this.f25207a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f25208b;
        return charSequence != null ? charSequence : this.f25207a;
    }

    @Override // p000.add, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f25217k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // p000.add, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f25222p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f25222p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f25222p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f25222p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.add, android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f25212f = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.f25222p = (z ? 1 : 0) | (this.f25222p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.f25222p = (true != z ? 0 : 2) | (this.f25222p & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        this.f25216j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.f25222p = (true != z ? 0 : 16) | (this.f25222p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f25214h = abt.m154a(this.f25215i, i);
        m9351e();
        return this;
    }

    @Override // p000.add, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f25218l = colorStateList;
        this.f25220n = true;
        m9351e();
        return this;
    }

    @Override // p000.add, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f25219m = mode;
        this.f25221o = true;
        m9351e();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f25209c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.f25210d = c;
        return this;
    }

    @Override // p000.add, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.f25210d = c;
        this.f25211e = KeyEvent.normalizeMetaState(i);
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
    public final MenuItem setShortcut(char c, char c2) {
        this.f25210d = c;
        this.f25212f = Character.toLowerCase(c2);
        return this;
    }

    @Override // p000.add, android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // p000.add, android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f25207a = this.f25215i.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f25207a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f25208b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        this.f25217k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.f25222p = (this.f25222p & 8) | (true == z ? 0 : 8);
        return this;
    }

    @Override // p000.add, android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.add, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f25212f = Character.toLowerCase(c);
        this.f25213g = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // p000.add, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f25210d = c;
        this.f25211e = KeyEvent.normalizeMetaState(i);
        this.f25212f = Character.toLowerCase(c2);
        this.f25213g = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f25214h = drawable;
        m9351e();
        return this;
    }
}
