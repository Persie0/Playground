package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: loaded from: classes2.dex */
public class jx5 extends AbstractC3284l3 implements Menu {

    /* JADX INFO: renamed from: c */
    public final hw5 f46348c;

    public jx5(Context context, hw5 hw5Var) {
        super(context);
        if (hw5Var != null) {
            this.f46348c = hw5Var;
        } else {
            C3386nv.m17626m("Wrapped Object can not be null.");
            throw null;
        }
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m15761f(this.f46348c.mo13518a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f46348c.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m15761f(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f46348c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        l79 l79Var = (l79) this.f48951b;
        if (l79Var != null) {
            l79Var.clear();
        }
        this.f46348c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f46348c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return m15761f(this.f46348c.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return m15761f(this.f46348c.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f46348c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f46348c.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return this.f46348c.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f46348c.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (((l79) this.f48951b) != null) {
            int i2 = 0;
            while (true) {
                l79 l79Var = (l79) this.f48951b;
                if (i2 >= l79Var.f49254c) {
                    break;
                }
                if (((vn9) l79Var.m15974f(i2)).getGroupId() == i) {
                    ((l79) this.f48951b).m15975g(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.f46348c.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (((l79) this.f48951b) != null) {
            int i2 = 0;
            while (true) {
                l79 l79Var = (l79) this.f48951b;
                if (i2 >= l79Var.f49254c) {
                    break;
                }
                if (((vn9) l79Var.m15974f(i2)).getItemId() == i) {
                    ((l79) this.f48951b).m15975g(i2);
                    break;
                }
                i2++;
            }
        }
        this.f46348c.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f46348c.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        this.f46348c.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        this.f46348c.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f46348c.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f46348c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return this.f46348c.addSubMenu(i);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return this.f46348c.addSubMenu(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return this.f46348c.addSubMenu(i, i2, i3, i4);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m15761f(this.f46348c.add(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m15761f(this.f46348c.mo13518a(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m15761f(this.f46348c.add(i, i2, i3, i4));
    }
}
