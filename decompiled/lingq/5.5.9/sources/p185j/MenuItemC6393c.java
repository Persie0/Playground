package p185j;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0224f;
import androidx.appcompat.view.menu.C0226h;
import androidx.appcompat.view.menu.SubMenuC0231m;
import java.lang.reflect.Method;
import p164i.InterfaceC6101b;
import p353r2.InterfaceMenuItemC8725b;
import p471x2.AbstractC10028b;

/* JADX INFO: renamed from: j.c */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemC6393c extends AbstractC6392b implements MenuItem {

    /* JADX INFO: renamed from: d */
    public final InterfaceMenuItemC8725b f36839d;

    /* JADX INFO: renamed from: e */
    public Method f36840e;

    /* JADX INFO: renamed from: j.c$a */
    public class a extends AbstractC10028b {

        /* JADX INFO: renamed from: b */
        public final ActionProvider f36841b;

        public a(ActionProvider actionProvider) {
            this.f36841b = actionProvider;
        }

        @Override // p471x2.AbstractC10028b
        /* JADX INFO: renamed from: a */
        public final boolean mo13017a() {
            return this.f36841b.hasSubMenu();
        }

        @Override // p471x2.AbstractC10028b
        /* JADX INFO: renamed from: c */
        public final View mo13018c() {
            return this.f36841b.onCreateActionView();
        }

        @Override // p471x2.AbstractC10028b
        /* JADX INFO: renamed from: e */
        public final boolean mo13019e() {
            return this.f36841b.onPerformDefaultAction();
        }

        @Override // p471x2.AbstractC10028b
        /* JADX INFO: renamed from: f */
        public final void mo13020f(SubMenuC0231m subMenuC0231m) {
            this.f36841b.onPrepareSubMenu(MenuItemC6393c.this.m13016e(subMenuC0231m));
        }
    }

    /* JADX INFO: renamed from: j.c$b */
    public class b extends a implements ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: d */
        public AbstractC10028b.a f36843d;

        public b(MenuItemC6393c menuItemC6393c, ActionProvider actionProvider) {
            super(actionProvider);
        }

        @Override // p471x2.AbstractC10028b
        /* JADX INFO: renamed from: b */
        public final boolean mo13021b() {
            return this.f36841b.isVisible();
        }

        @Override // p471x2.AbstractC10028b
        /* JADX INFO: renamed from: d */
        public final View mo13022d(MenuItem menuItem) {
            return this.f36841b.onCreateActionView(menuItem);
        }

        @Override // p471x2.AbstractC10028b
        /* JADX INFO: renamed from: g */
        public final boolean mo13023g() {
            return this.f36841b.overridesItemVisibility();
        }

        @Override // p471x2.AbstractC10028b
        /* JADX INFO: renamed from: h */
        public final void mo13024h(C0226h.a aVar) {
            this.f36843d = aVar;
            this.f36841b.setVisibilityListener(this);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public final void onActionProviderVisibilityChanged(boolean z10) {
            AbstractC10028b.a aVar = this.f36843d;
            if (aVar != null) {
                C0224f c0224f = C0226h.this.f736n;
                c0224f.f700h = true;
                c0224f.m932p(true);
            }
        }
    }

    /* JADX INFO: renamed from: j.c$c */
    public static class c extends FrameLayout implements InterfaceC6101b {

        /* JADX INFO: renamed from: a */
        public final CollapsibleActionView f36844a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(View view) {
            super(view.getContext());
            this.f36844a = (CollapsibleActionView) view;
            addView(view);
        }

        @Override // p164i.InterfaceC6101b
        /* JADX INFO: renamed from: c */
        public final void mo1021c() {
            this.f36844a.onActionViewExpanded();
        }

        @Override // p164i.InterfaceC6101b
        /* JADX INFO: renamed from: e */
        public final void mo1022e() {
            this.f36844a.onActionViewCollapsed();
        }
    }

    /* JADX INFO: renamed from: j.c$d */
    public class d implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a */
        public final MenuItem.OnActionExpandListener f36845a;

        public d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f36845a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f36845a.onMenuItemActionCollapse(MenuItemC6393c.this.m13015d(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f36845a.onMenuItemActionExpand(MenuItemC6393c.this.m13015d(menuItem));
        }
    }

    /* JADX INFO: renamed from: j.c$e */
    public class e implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a */
        public final MenuItem.OnMenuItemClickListener f36847a;

        public e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f36847a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            return this.f36847a.onMenuItemClick(MenuItemC6393c.this.m13015d(menuItem));
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public MenuItemC6393c(Context context, InterfaceMenuItemC8725b interfaceMenuItemC8725b) {
        super(context);
        if (interfaceMenuItemC8725b == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f36839d = interfaceMenuItemC8725b;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.f36839d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.f36839d.expandActionView();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        AbstractC10028b abstractC10028bMo945a = this.f36839d.mo945a();
        if (abstractC10028bMo945a instanceof a) {
            return ((a) abstractC10028bMo945a).f36841b;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = this.f36839d.getActionView();
        return actionView instanceof c ? (View) ((c) actionView).f36844a : actionView;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f36839d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f36839d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f36839d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f36839d.getGroupId();
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f36839d.getIcon();
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f36839d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f36839d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f36839d.getIntent();
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f36839d.getItemId();
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f36839d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f36839d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f36839d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f36839d.getOrder();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return m13016e(this.f36839d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f36839d.getTitle();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.f36839d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f36839d.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f36839d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f36839d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.f36839d.isCheckable();
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.f36839d.isChecked();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.f36839d.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.f36839d.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this, actionProvider);
        if (actionProvider == null) {
            bVar = null;
        }
        this.f36839d.mo946b(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        InterfaceMenuItemC8725b interfaceMenuItemC8725b = this.f36839d;
        interfaceMenuItemC8725b.setActionView(i10);
        View actionView = interfaceMenuItemC8725b.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            interfaceMenuItemC8725b.setActionView(new c(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new c(view);
        }
        this.f36839d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f36839d.setAlphabeticShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f36839d.setAlphabeticShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        this.f36839d.setCheckable(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        this.f36839d.setChecked(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f36839d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        this.f36839d.setEnabled(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.f36839d.setIcon(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f36839d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f36839d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f36839d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f36839d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        this.f36839d.setNumericShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i10) {
        this.f36839d.setNumericShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f36839d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f36839d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f36839d.setShortcut(c10, c11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f36839d.setShortcut(c10, c11, i10, i11);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
        this.f36839d.setShowAsAction(i10);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        this.f36839d.setShowAsActionFlags(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        this.f36839d.setTitle(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f36839d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f36839d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f36839d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        return this.f36839d.setVisible(z10);
    }
}
