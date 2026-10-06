package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: renamed from: hm */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class MenuC0242hm extends C0216gn implements Menu {

    /* JADX INFO: renamed from: c */
    private final adc f28292c;

    public MenuC0242hm(Context context, adc adcVar) {
        super(context);
        this.f28292c = adcVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m9544a(this.f28292c.add(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f28292c.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            for (int i5 = 0; i5 < menuItemArr2.length; i5++) {
                menuItemArr[i5] = m9544a(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return this.f28292c.addSubMenu(i);
    }

    @Override // android.view.Menu
    public final void clear() {
        C1117xf c1117xf = this.f25668b;
        if (c1117xf != null) {
            c1117xf.clear();
        }
        this.f28292c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f28292c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return m9544a(this.f28292c.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return m9544a(this.f28292c.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f28292c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f28292c.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return this.f28292c.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f28292c.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (this.f25668b != null) {
            int i2 = 0;
            while (true) {
                C1117xf c1117xf = this.f25668b;
                if (i2 >= c1117xf.f48004d) {
                    break;
                }
                if (((add) c1117xf.m19559d(i2)).getGroupId() == i) {
                    this.f25668b.mo3366e(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.f28292c.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (this.f25668b != null) {
            int i2 = 0;
            while (true) {
                C1117xf c1117xf = this.f25668b;
                if (i2 >= c1117xf.f48004d) {
                    break;
                }
                if (((add) c1117xf.m19559d(i2)).getItemId() == i) {
                    this.f25668b.mo3366e(i2);
                    break;
                }
                i2++;
            }
        }
        this.f28292c.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f28292c.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        this.f28292c.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        this.f28292c.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f28292c.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f28292c.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m9544a(this.f28292c.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return this.f28292c.addSubMenu(i, i2, i3, i4);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m9544a(((C0225gw) this.f28292c).m9823c(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return this.f28292c.addSubMenu(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f28292c.addSubMenu(charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m9544a(this.f28292c.add(charSequence));
    }
}
