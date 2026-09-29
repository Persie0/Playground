package p185j;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p326q.C8452h;
import p353r2.InterfaceMenuC8724a;
import p353r2.InterfaceMenuItemC8725b;

/* JADX INFO: renamed from: j.e */
/* JADX INFO: loaded from: classes.dex */
public class MenuC6395e extends AbstractC6392b implements Menu {

    /* JADX INFO: renamed from: d */
    public final InterfaceMenuC8724a f36850d;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public MenuC6395e(Context context, InterfaceMenuC8724a interfaceMenuC8724a) {
        super(context);
        if (interfaceMenuC8724a == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f36850d = interfaceMenuC8724a;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return m13015d(this.f36850d.add(i10));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return m13015d(this.f36850d.add(i10, i11, i12, i13));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return m13015d(this.f36850d.add(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m13015d(this.f36850d.add(charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f36850d.addIntentOptions(i10, i11, i12, componentName, intentArr, intent, i13, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i14 = 0; i14 < length; i14++) {
                menuItemArr[i14] = m13015d(menuItemArr2[i14]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return m13016e(this.f36850d.addSubMenu(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return m13016e(this.f36850d.addSubMenu(i10, i11, i12, i13));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return m13016e(this.f36850d.addSubMenu(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return m13016e(this.f36850d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public final void clear() {
        C8452h c8452h = (C8452h) this.f36837b;
        if (c8452h != null) {
            c8452h.clear();
        }
        C8452h c8452h2 = (C8452h) this.f36838c;
        if (c8452h2 != null) {
            c8452h2.clear();
        }
        this.f36850d.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f36850d.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        return m13015d(this.f36850d.findItem(i10));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return m13015d(this.f36850d.getItem(i10));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f36850d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return this.f36850d.isShortcutKey(i10, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return this.f36850d.performIdentifierAction(i10, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        return this.f36850d.performShortcut(i10, keyEvent, i11);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        if (((C8452h) this.f36837b) != null) {
            int i11 = 0;
            while (true) {
                C8452h c8452h = (C8452h) this.f36837b;
                if (i11 >= c8452h.f45619c) {
                    break;
                }
                if (((InterfaceMenuItemC8725b) c8452h.m16529h(i11)).getGroupId() == i10) {
                    ((C8452h) this.f36837b).mo14869k(i11);
                    i11--;
                }
                i11++;
            }
        }
        this.f36850d.removeGroup(i10);
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        if (((C8452h) this.f36837b) != null) {
            int i11 = 0;
            while (true) {
                C8452h c8452h = (C8452h) this.f36837b;
                if (i11 >= c8452h.f45619c) {
                    break;
                }
                if (((InterfaceMenuItemC8725b) c8452h.m16529h(i11)).getItemId() == i10) {
                    ((C8452h) this.f36837b).mo14869k(i11);
                    break;
                }
                i11++;
            }
        }
        this.f36850d.removeItem(i10);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z10, boolean z11) {
        this.f36850d.setGroupCheckable(i10, z10, z11);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z10) {
        this.f36850d.setGroupEnabled(i10, z10);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z10) {
        this.f36850d.setGroupVisible(i10, z10);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z10) {
        this.f36850d.setQwertyMode(z10);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f36850d.size();
    }
}
