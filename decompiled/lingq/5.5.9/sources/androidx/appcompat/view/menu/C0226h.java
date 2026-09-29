package androidx.appcompat.view.menu;

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
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import p104f.C5452a;
import p329q2.C8488a;
import p353r2.InterfaceMenuItemC8725b;
import p471x2.AbstractC10028b;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0226h implements InterfaceMenuItemC8725b {

    /* JADX INFO: renamed from: A */
    public AbstractC10028b f720A;

    /* JADX INFO: renamed from: B */
    public MenuItem.OnActionExpandListener f721B;

    /* JADX INFO: renamed from: a */
    public final int f723a;

    /* JADX INFO: renamed from: b */
    public final int f724b;

    /* JADX INFO: renamed from: c */
    public final int f725c;

    /* JADX INFO: renamed from: d */
    public final int f726d;

    /* JADX INFO: renamed from: e */
    public CharSequence f727e;

    /* JADX INFO: renamed from: f */
    public CharSequence f728f;

    /* JADX INFO: renamed from: g */
    public Intent f729g;

    /* JADX INFO: renamed from: h */
    public char f730h;

    /* JADX INFO: renamed from: j */
    public char f732j;

    /* JADX INFO: renamed from: l */
    public Drawable f734l;

    /* JADX INFO: renamed from: n */
    public final C0224f f736n;

    /* JADX INFO: renamed from: o */
    public SubMenuC0231m f737o;

    /* JADX INFO: renamed from: p */
    public MenuItem.OnMenuItemClickListener f738p;

    /* JADX INFO: renamed from: q */
    public CharSequence f739q;

    /* JADX INFO: renamed from: r */
    public CharSequence f740r;

    /* JADX INFO: renamed from: y */
    public int f747y;

    /* JADX INFO: renamed from: z */
    public View f748z;

    /* JADX INFO: renamed from: i */
    public int f731i = 4096;

    /* JADX INFO: renamed from: k */
    public int f733k = 4096;

    /* JADX INFO: renamed from: m */
    public int f735m = 0;

    /* JADX INFO: renamed from: s */
    public ColorStateList f741s = null;

    /* JADX INFO: renamed from: t */
    public PorterDuff.Mode f742t = null;

    /* JADX INFO: renamed from: u */
    public boolean f743u = false;

    /* JADX INFO: renamed from: v */
    public boolean f744v = false;

    /* JADX INFO: renamed from: w */
    public boolean f745w = false;

    /* JADX INFO: renamed from: x */
    public int f746x = 16;

    /* JADX INFO: renamed from: C */
    public boolean f722C = false;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.h$a */
    public class a implements AbstractC10028b.a {
        public a() {
        }
    }

    public C0226h(C0224f c0224f, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f736n = c0224f;
        this.f723a = i11;
        this.f724b = i10;
        this.f725c = i12;
        this.f726d = i13;
        this.f727e = charSequence;
        this.f747y = i14;
    }

    /* JADX INFO: renamed from: c */
    public static void m944c(int i10, int i11, String str, StringBuilder sb2) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    @Override // p353r2.InterfaceMenuItemC8725b
    /* JADX INFO: renamed from: a */
    public final AbstractC10028b mo945a() {
        return this.f720A;
    }

    @Override // p353r2.InterfaceMenuItemC8725b
    /* JADX INFO: renamed from: b */
    public final InterfaceMenuItemC8725b mo946b(AbstractC10028b abstractC10028b) {
        AbstractC10028b abstractC10028b2 = this.f720A;
        if (abstractC10028b2 != null) {
            abstractC10028b2.f50992a = null;
        }
        this.f748z = null;
        this.f720A = abstractC10028b;
        this.f736n.m932p(true);
        AbstractC10028b abstractC10028b3 = this.f720A;
        if (abstractC10028b3 != null) {
            abstractC10028b3.mo13024h(new a());
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f747y & 8) == 0) {
            return false;
        }
        if (this.f748z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f721B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f736n.mo920d(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final Drawable m947d(Drawable drawable) {
        if (drawable != null && this.f745w && (this.f743u || this.f744v)) {
            drawable = drawable.mutate();
            if (this.f743u) {
                C8488a.b.m16570h(drawable, this.f741s);
            }
            if (this.f744v) {
                C8488a.b.m16571i(drawable, this.f742t);
            }
            this.f745w = false;
        }
        return drawable;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m948e() {
        AbstractC10028b abstractC10028b;
        if ((this.f747y & 8) == 0) {
            return false;
        }
        if (this.f748z == null && (abstractC10028b = this.f720A) != null) {
            this.f748z = abstractC10028b.mo13022d(this);
        }
        return this.f748z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!m948e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f721B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f736n.mo922f(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m949f(boolean z10) {
        if (z10) {
            this.f746x |= 32;
        } else {
            this.f746x &= -33;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f748z;
        if (view != null) {
            return view;
        }
        AbstractC10028b abstractC10028b = this.f720A;
        if (abstractC10028b == null) {
            return null;
        }
        View viewMo13022d = abstractC10028b.mo13022d(this);
        this.f748z = viewMo13022d;
        return viewMo13022d;
    }

    @Override // p353r2.InterfaceMenuItemC8725b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f733k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f732j;
    }

    @Override // p353r2.InterfaceMenuItemC8725b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f739q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f724b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f734l;
        if (drawable != null) {
            return m947d(drawable);
        }
        int i10 = this.f735m;
        if (i10 == 0) {
            return null;
        }
        Drawable drawableM11672a = C5452a.m11672a(this.f736n.f693a, i10);
        this.f735m = 0;
        this.f734l = drawableM11672a;
        return m947d(drawableM11672a);
    }

    @Override // p353r2.InterfaceMenuItemC8725b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f741s;
    }

    @Override // p353r2.InterfaceMenuItemC8725b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f742t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f729g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.f723a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p353r2.InterfaceMenuItemC8725b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f731i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f730h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f725c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f737o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f727e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f728f;
        return charSequence != null ? charSequence : this.f727e;
    }

    @Override // p353r2.InterfaceMenuItemC8725b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f740r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f737o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f722C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f746x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f746x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f746x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        AbstractC10028b abstractC10028b = this.f720A;
        if (abstractC10028b == null || !abstractC10028b.mo13023g()) {
            return (this.f746x & 8) == 0;
        }
        return (this.f746x & 8) == 0 && this.f720A.mo13021b();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        int i11;
        C0224f c0224f = this.f736n;
        Context context = c0224f.f693a;
        View viewInflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.f748z = viewInflate;
        this.f720A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i11 = this.f723a) > 0) {
            viewInflate.setId(i11);
        }
        c0224f.f703k = true;
        c0224f.m932p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i10;
        this.f748z = view;
        this.f720A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f723a) > 0) {
            view.setId(i10);
        }
        C0224f c0224f = this.f736n;
        c0224f.f703k = true;
        c0224f.m932p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f732j == c10) {
            return this;
        }
        this.f732j = Character.toLowerCase(c10);
        this.f736n.m932p(false);
        return this;
    }

    @Override // p353r2.InterfaceMenuItemC8725b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f732j == c10 && this.f733k == i10) {
            return this;
        }
        this.f732j = Character.toLowerCase(c10);
        this.f733k = KeyEvent.normalizeMetaState(i10);
        this.f736n.m932p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        int i10 = this.f746x;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f746x = i11;
        if (i10 != i11) {
            this.f736n.m932p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        int i10 = this.f746x;
        int i11 = i10 & 4;
        C0224f c0224f = this.f736n;
        if (i11 != 0) {
            c0224f.getClass();
            ArrayList<C0226h> arrayList = c0224f.f698f;
            int size = arrayList.size();
            c0224f.m939w();
            for (int i12 = 0; i12 < size; i12++) {
                C0226h c0226h = arrayList.get(i12);
                if (c0226h.f724b == this.f724b) {
                    boolean z11 = true;
                    if (((c0226h.f746x & 4) != 0) && c0226h.isCheckable()) {
                        if (c0226h != this) {
                            z11 = false;
                        }
                        int i13 = c0226h.f746x;
                        int i14 = (z11 ? 2 : 0) | (i13 & (-3));
                        c0226h.f746x = i14;
                        if (i13 != i14) {
                            c0226h.f736n.m932p(false);
                        }
                    }
                }
            }
            c0224f.m938v();
        } else {
            int i15 = i10 & (-3);
            int i16 = (z10 ? 2 : 0) | i15;
            this.f746x = i16;
            if (i10 != i16) {
                c0224f.m932p(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // p353r2.InterfaceMenuItemC8725b, android.view.MenuItem
    public final InterfaceMenuItemC8725b setContentDescription(CharSequence charSequence) {
        this.f739q = charSequence;
        this.f736n.m932p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f746x |= 16;
        } else {
            this.f746x &= -17;
        }
        this.f736n.m932p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.f734l = null;
        this.f735m = i10;
        this.f745w = true;
        this.f736n.m932p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f735m = 0;
        this.f734l = drawable;
        this.f745w = true;
        this.f736n.m932p(false);
        return this;
    }

    @Override // p353r2.InterfaceMenuItemC8725b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f741s = colorStateList;
        this.f743u = true;
        this.f745w = true;
        this.f736n.m932p(false);
        return this;
    }

    @Override // p353r2.InterfaceMenuItemC8725b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f742t = mode;
        this.f744v = true;
        this.f745w = true;
        this.f736n.m932p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f729g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        if (this.f730h == c10) {
            return this;
        }
        this.f730h = c10;
        this.f736n.m932p(false);
        return this;
    }

    @Override // p353r2.InterfaceMenuItemC8725b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f730h == c10 && this.f731i == i10) {
            return this;
        }
        this.f730h = c10;
        this.f731i = KeyEvent.normalizeMetaState(i10);
        this.f736n.m932p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f721B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f738p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f730h = c10;
        this.f732j = Character.toLowerCase(c11);
        this.f736n.m932p(false);
        return this;
    }

    @Override // p353r2.InterfaceMenuItemC8725b, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f730h = c10;
        this.f731i = KeyEvent.normalizeMetaState(i10);
        this.f732j = Character.toLowerCase(c11);
        this.f733k = KeyEvent.normalizeMetaState(i11);
        this.f736n.m932p(false);
        return this;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1) {
            if (i11 != 2) {
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
            }
        }
        this.f747y = i10;
        C0224f c0224f = this.f736n;
        c0224f.f703k = true;
        c0224f.m932p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        setTitle(this.f736n.f693a.getString(i10));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f727e = charSequence;
        this.f736n.m932p(false);
        SubMenuC0231m subMenuC0231m = this.f737o;
        if (subMenuC0231m != null) {
            subMenuC0231m.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f728f = charSequence;
        this.f736n.m932p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // p353r2.InterfaceMenuItemC8725b, android.view.MenuItem
    public final InterfaceMenuItemC8725b setTooltipText(CharSequence charSequence) {
        this.f740r = charSequence;
        this.f736n.m932p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        int i10 = this.f746x;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f746x = i11;
        if (i10 != i11) {
            C0224f c0224f = this.f736n;
            c0224f.f700h = true;
            c0224f.m932p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f727e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
}
