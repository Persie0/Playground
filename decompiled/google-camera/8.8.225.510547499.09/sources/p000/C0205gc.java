package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;

/* JADX INFO: renamed from: gc */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0205gc {

    /* JADX INFO: renamed from: A */
    aej f24154A;

    /* JADX INFO: renamed from: B */
    public CharSequence f24155B;

    /* JADX INFO: renamed from: C */
    public CharSequence f24156C;

    /* JADX INFO: renamed from: D */
    public ColorStateList f24157D = null;

    /* JADX INFO: renamed from: E */
    public PorterDuff.Mode f24158E = null;

    /* JADX INFO: renamed from: F */
    final /* synthetic */ C0206gd f24159F;

    /* JADX INFO: renamed from: a */
    public final Menu f24160a;

    /* JADX INFO: renamed from: b */
    public int f24161b;

    /* JADX INFO: renamed from: c */
    public int f24162c;

    /* JADX INFO: renamed from: d */
    public int f24163d;

    /* JADX INFO: renamed from: e */
    public int f24164e;

    /* JADX INFO: renamed from: f */
    public boolean f24165f;

    /* JADX INFO: renamed from: g */
    public boolean f24166g;

    /* JADX INFO: renamed from: h */
    public boolean f24167h;

    /* JADX INFO: renamed from: i */
    public int f24168i;

    /* JADX INFO: renamed from: j */
    public int f24169j;

    /* JADX INFO: renamed from: k */
    public CharSequence f24170k;

    /* JADX INFO: renamed from: l */
    public CharSequence f24171l;

    /* JADX INFO: renamed from: m */
    public int f24172m;

    /* JADX INFO: renamed from: n */
    public char f24173n;

    /* JADX INFO: renamed from: o */
    public int f24174o;

    /* JADX INFO: renamed from: p */
    public char f24175p;

    /* JADX INFO: renamed from: q */
    public int f24176q;

    /* JADX INFO: renamed from: r */
    public int f24177r;

    /* JADX INFO: renamed from: s */
    public boolean f24178s;

    /* JADX INFO: renamed from: t */
    public boolean f24179t;

    /* JADX INFO: renamed from: u */
    public boolean f24180u;

    /* JADX INFO: renamed from: v */
    public int f24181v;

    /* JADX INFO: renamed from: w */
    public int f24182w;

    /* JADX INFO: renamed from: x */
    public String f24183x;

    /* JADX INFO: renamed from: y */
    public String f24184y;

    /* JADX INFO: renamed from: z */
    public String f24185z;

    public C0205gc(C0206gd c0206gd, Menu menu) {
        this.f24159F = c0206gd;
        this.f24160a = menu;
        m9047c();
    }

    /* JADX INFO: renamed from: e */
    public static final char m9044e(String str) {
        if (str == null) {
            return (char) 0;
        }
        return str.charAt(0);
    }

    /* JADX INFO: renamed from: a */
    public final SubMenu m9045a() {
        this.f24167h = true;
        SubMenu subMenuAddSubMenu = this.f24160a.addSubMenu(this.f24161b, this.f24168i, this.f24169j, this.f24170k);
        m9048d(subMenuAddSubMenu.getItem());
        return subMenuAddSubMenu;
    }

    /* JADX INFO: renamed from: b */
    public final Object m9046b(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f24159F.f24258e.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: ".concat(str), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m9047c() {
        this.f24161b = 0;
        this.f24162c = 0;
        this.f24163d = 0;
        this.f24164e = 0;
        this.f24165f = true;
        this.f24166g = true;
    }

    /* JADX INFO: renamed from: d */
    public final void m9048d(MenuItem menuItem) {
        boolean z = false;
        menuItem.setChecked(this.f24178s).setVisible(this.f24179t).setEnabled(this.f24180u).setCheckable(this.f24177r > 0).setTitleCondensed(this.f24171l).setIcon(this.f24172m);
        int i = this.f24181v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.f24185z != null) {
            if (this.f24159F.f24258e.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            C0206gd c0206gd = this.f24159F;
            if (c0206gd.f24259f == null) {
                c0206gd.f24259f = c0206gd.m9068a(c0206gd.f24258e);
            }
            menuItem.setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC0204gb(c0206gd.f24259f, this.f24185z));
        }
        if (this.f24177r >= 2) {
            if (menuItem instanceof C0227gy) {
                ((C0227gy) menuItem).m9953j(true);
            } else if (menuItem instanceof MenuItemC0234he) {
                MenuItemC0234he menuItemC0234he = (MenuItemC0234he) menuItem;
                try {
                    if (menuItemC0234he.f27418d == null) {
                        menuItemC0234he.f27418d = menuItemC0234he.f27417c.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC0234he.f27418d.invoke(menuItemC0234he.f27417c, true);
                } catch (Exception e) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
                }
            }
        }
        String str = this.f24183x;
        if (str != null) {
            menuItem.setActionView((View) m9046b(str, C0206gd.f24254a, this.f24159F.f24256c));
            z = true;
        }
        int i2 = this.f24182w;
        if (i2 > 0) {
            if (z) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        aej aejVar = this.f24154A;
        if (aejVar != null) {
            if (menuItem instanceof add) {
                ((add) menuItem).mo266c(aejVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f24155B;
        boolean z2 = menuItem instanceof add;
        if (z2) {
            ((add) menuItem).mo265b(charSequence);
        } else {
            aeq.m370f(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f24156C;
        if (z2) {
            ((add) menuItem).mo267d(charSequence2);
        } else {
            aeq.m375k(menuItem, charSequence2);
        }
        char c = this.f24173n;
        int i3 = this.f24174o;
        if (z2) {
            ((add) menuItem).setAlphabeticShortcut(c, i3);
        } else {
            aeq.m369e(menuItem, c, i3);
        }
        char c2 = this.f24175p;
        int i4 = this.f24176q;
        if (z2) {
            ((add) menuItem).setNumericShortcut(c2, i4);
        } else {
            aeq.m373i(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.f24158E;
        if (mode != null) {
            if (z2) {
                ((add) menuItem).setIconTintMode(mode);
            } else {
                aeq.m372h(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f24157D;
        if (colorStateList != null) {
            if (z2) {
                ((add) menuItem).setIconTintList(colorStateList);
            } else {
                aeq.m371g(menuItem, colorStateList);
            }
        }
    }
}
