package p185j;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import bd.AbstractC1358b;
import p326q.C8452h;
import p353r2.InterfaceMenuItemC8725b;
import p353r2.InterfaceSubMenuC8726c;

/* JADX INFO: renamed from: j.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6392b {

    /* JADX INFO: renamed from: a */
    public Object f36836a;

    /* JADX INFO: renamed from: b */
    public Object f36837b;

    /* JADX INFO: renamed from: c */
    public Object f36838c;

    public AbstractC6392b(int i10) {
        this.f36837b = new float[i10 * 2];
        this.f36838c = new int[i10];
    }

    public AbstractC6392b(Context context) {
        this.f36836a = context;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo4945c();

    /* JADX INFO: renamed from: d */
    public final MenuItem m13015d(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC8725b)) {
            return menuItem;
        }
        InterfaceMenuItemC8725b interfaceMenuItemC8725b = (InterfaceMenuItemC8725b) menuItem;
        if (((C8452h) this.f36837b) == null) {
            this.f36837b = new C8452h();
        }
        MenuItem menuItem2 = (MenuItem) ((C8452h) this.f36837b).getOrDefault(interfaceMenuItemC8725b, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC6393c menuItemC6393c = new MenuItemC6393c((Context) this.f36836a, interfaceMenuItemC8725b);
        ((C8452h) this.f36837b).put(interfaceMenuItemC8725b, menuItemC6393c);
        return menuItemC6393c;
    }

    /* JADX INFO: renamed from: e */
    public final SubMenu m13016e(SubMenu subMenu) {
        if (!(subMenu instanceof InterfaceSubMenuC8726c)) {
            return subMenu;
        }
        InterfaceSubMenuC8726c interfaceSubMenuC8726c = (InterfaceSubMenuC8726c) subMenu;
        if (((C8452h) this.f36838c) == null) {
            this.f36838c = new C8452h();
        }
        SubMenu subMenuC6397g = (SubMenu) ((C8452h) this.f36838c).getOrDefault(interfaceSubMenuC8726c, null);
        if (subMenuC6397g == null) {
            subMenuC6397g = new SubMenuC6397g((Context) this.f36836a, interfaceSubMenuC8726c);
            ((C8452h) this.f36838c).put(interfaceSubMenuC8726c, subMenuC6397g);
        }
        return subMenuC6397g;
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo4946f();

    /* JADX INFO: renamed from: g */
    public abstract void mo4947g(AbstractC1358b.c cVar);

    /* JADX INFO: renamed from: h */
    public abstract void mo4948h();

    /* JADX INFO: renamed from: i */
    public abstract void mo4949i();

    /* JADX INFO: renamed from: j */
    public abstract void mo4950j();
}
