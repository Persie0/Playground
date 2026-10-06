package p000;

import android.content.Context;
import android.view.MenuItem;

/* JADX INFO: renamed from: gn */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class C0216gn {

    /* JADX INFO: renamed from: a */
    final Context f25667a;

    /* JADX INFO: renamed from: b */
    public C1117xf f25668b;

    public C0216gn(Context context) {
        this.f25667a = context;
    }

    /* JADX INFO: renamed from: a */
    final MenuItem m9544a(MenuItem menuItem) {
        if (!(menuItem instanceof add)) {
            return menuItem;
        }
        add addVar = (add) menuItem;
        if (this.f25668b == null) {
            this.f25668b = new C1117xf();
        }
        MenuItem menuItem2 = (MenuItem) this.f25668b.get(addVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC0234he menuItemC0234he = new MenuItemC0234he(this.f25667a, addVar);
        this.f25668b.put(addVar, menuItemC0234he);
        return menuItemC0234he;
    }
}
