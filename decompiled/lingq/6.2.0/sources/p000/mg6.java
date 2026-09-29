package p000;

import android.view.MenuItem;
import android.view.SubMenu;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class mg6 {

    /* JADX INFO: renamed from: a */
    public final hw5 f51286a;

    /* JADX INFO: renamed from: c */
    public int f51288c = 0;

    /* JADX INFO: renamed from: d */
    public int f51289d = 0;

    /* JADX INFO: renamed from: e */
    public int f51290e = 0;

    /* JADX INFO: renamed from: b */
    public final ArrayList f51287b = new ArrayList();

    public mg6(hw5 hw5Var) {
        this.f51286a = hw5Var;
        m16826b();
    }

    /* JADX INFO: renamed from: a */
    public final MenuItem m16825a(int i) {
        return (MenuItem) this.f51287b.get(i);
    }

    /* JADX INFO: renamed from: b */
    public final void m16826b() {
        ArrayList arrayList = this.f51287b;
        arrayList.clear();
        this.f51288c = 0;
        this.f51289d = 0;
        this.f51290e = 0;
        int i = 0;
        while (true) {
            hw5 hw5Var = this.f51286a;
            if (i >= hw5Var.f43042f.size()) {
                break;
            }
            MenuItem item = hw5Var.getItem(i);
            if (item.hasSubMenu()) {
                if (!arrayList.isEmpty() && !(AbstractC3393o1.m17731f(1, arrayList) instanceof ni2) && item.isVisible()) {
                    arrayList.add(new ni2());
                }
                arrayList.add(item);
                SubMenu subMenu = item.getSubMenu();
                for (int i2 = 0; i2 < subMenu.size(); i2++) {
                    MenuItem item2 = subMenu.getItem(i2);
                    if (!item.isVisible()) {
                        item2.setVisible(false);
                    }
                    arrayList.add(item2);
                    this.f51288c++;
                    if (item2.isVisible()) {
                        this.f51289d++;
                    }
                }
                arrayList.add(new ni2());
            } else {
                arrayList.add(item);
                this.f51288c++;
                if (item.isVisible()) {
                    this.f51289d++;
                    this.f51290e++;
                }
            }
            i++;
        }
        if (arrayList.isEmpty() || !(AbstractC3393o1.m17731f(1, arrayList) instanceof ni2)) {
            return;
        }
        arrayList.remove(arrayList.size() - 1);
    }
}
