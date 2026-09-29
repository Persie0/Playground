package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes.dex */
public final class tn9 {

    /* JADX INFO: renamed from: A */
    public CharSequence f62576A;

    /* JADX INFO: renamed from: B */
    public CharSequence f62577B;

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ un9 f62580E;

    /* JADX INFO: renamed from: a */
    public final Menu f62581a;

    /* JADX INFO: renamed from: h */
    public boolean f62588h;

    /* JADX INFO: renamed from: i */
    public int f62589i;

    /* JADX INFO: renamed from: j */
    public int f62590j;

    /* JADX INFO: renamed from: k */
    public CharSequence f62591k;

    /* JADX INFO: renamed from: l */
    public CharSequence f62592l;

    /* JADX INFO: renamed from: m */
    public int f62593m;

    /* JADX INFO: renamed from: n */
    public char f62594n;

    /* JADX INFO: renamed from: o */
    public int f62595o;

    /* JADX INFO: renamed from: p */
    public char f62596p;

    /* JADX INFO: renamed from: q */
    public int f62597q;

    /* JADX INFO: renamed from: r */
    public int f62598r;

    /* JADX INFO: renamed from: s */
    public boolean f62599s;

    /* JADX INFO: renamed from: t */
    public boolean f62600t;

    /* JADX INFO: renamed from: u */
    public boolean f62601u;

    /* JADX INFO: renamed from: v */
    public int f62602v;

    /* JADX INFO: renamed from: w */
    public int f62603w;

    /* JADX INFO: renamed from: x */
    public String f62604x;

    /* JADX INFO: renamed from: y */
    public String f62605y;

    /* JADX INFO: renamed from: z */
    public nw5 f62606z;

    /* JADX INFO: renamed from: C */
    public ColorStateList f62578C = null;

    /* JADX INFO: renamed from: D */
    public PorterDuff.Mode f62579D = null;

    /* JADX INFO: renamed from: b */
    public int f62582b = 0;

    /* JADX INFO: renamed from: c */
    public int f62583c = 0;

    /* JADX INFO: renamed from: d */
    public int f62584d = 0;

    /* JADX INFO: renamed from: e */
    public int f62585e = 0;

    /* JADX INFO: renamed from: f */
    public boolean f62586f = true;

    /* JADX INFO: renamed from: g */
    public boolean f62587g = true;

    public tn9(un9 un9Var, Menu menu) {
        this.f62580E = un9Var;
        this.f62581a = menu;
    }

    /* JADX INFO: renamed from: a */
    public final Object m22245a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f62580E.f64117c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m22246b(MenuItem menuItem) {
        un9 un9Var = this.f62580E;
        Context context = un9Var.f64117c;
        boolean z = false;
        menuItem.setChecked(this.f62599s).setVisible(this.f62600t).setEnabled(this.f62601u).setCheckable(this.f62598r >= 1).setTitleCondensed(this.f62592l).setIcon(this.f62593m);
        int i = this.f62602v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.f62605y != null) {
            if (context.isRestricted()) {
                C3386nv.m17633t("The android:onClick attribute cannot be used within a restricted context");
                return;
            } else {
                if (un9Var.f64118d == null) {
                    un9Var.f64118d = un9.m22839a(context);
                }
                menuItem.setOnMenuItemClickListener(new sn9(un9Var.f64118d, this.f62605y));
            }
        }
        if (this.f62598r >= 2) {
            if (menuItem instanceof mw5) {
                mw5 mw5Var = (mw5) menuItem;
                mw5Var.f51965x = (mw5Var.f51965x & (-5)) | 4;
            } else if (menuItem instanceof qw5) {
                ((qw5) menuItem).m20190m();
            }
        }
        String str = this.f62604x;
        if (str != null) {
            menuItem.setActionView((View) m22245a(str, un9.f64113e, un9Var.f64115a));
            z = true;
        }
        int i2 = this.f62603w;
        if (i2 > 0) {
            if (z) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        nw5 nw5Var = this.f62606z;
        if (nw5Var != null) {
            if (menuItem instanceof vn9) {
                ((vn9) menuItem).mo17074a(nw5Var);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f62576A;
        boolean z2 = menuItem instanceof vn9;
        if (z2) {
            ((vn9) menuItem).setContentDescription(charSequence);
        } else {
            hpb.m13423b(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f62577B;
        if (z2) {
            ((vn9) menuItem).setTooltipText(charSequence2);
        } else {
            hpb.m13427f(menuItem, charSequence2);
        }
        char c = this.f62594n;
        int i3 = this.f62595o;
        if (z2) {
            ((vn9) menuItem).setAlphabeticShortcut(c, i3);
        } else {
            hpb.m13422a(menuItem, c, i3);
        }
        char c2 = this.f62596p;
        int i4 = this.f62597q;
        if (z2) {
            ((vn9) menuItem).setNumericShortcut(c2, i4);
        } else {
            hpb.m13426e(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.f62579D;
        if (mode != null) {
            if (z2) {
                ((vn9) menuItem).setIconTintMode(mode);
            } else {
                hpb.m13425d(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f62578C;
        if (colorStateList != null) {
            if (z2) {
                ((vn9) menuItem).setIconTintList(colorStateList);
            } else {
                hpb.m13424c(menuItem, colorStateList);
            }
        }
    }
}
