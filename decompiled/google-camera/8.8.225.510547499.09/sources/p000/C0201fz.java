package p000;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

/* JADX INFO: renamed from: fz */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0201fz implements InterfaceC0198fw {

    /* JADX INFO: renamed from: a */
    public final ActionMode.Callback f23953a;

    /* JADX INFO: renamed from: b */
    public final Context f23954b;

    /* JADX INFO: renamed from: c */
    final ArrayList f23955c = new ArrayList();

    /* JADX INFO: renamed from: d */
    final C1117xf f23956d = new C1117xf();

    public C0201fz(Context context, ActionMode.Callback callback) {
        this.f23954b = context;
        this.f23953a = callback;
    }

    @Override // p000.InterfaceC0198fw
    /* JADX INFO: renamed from: a */
    public final void mo7669a(AbstractC0199fx abstractC0199fx) {
        throw null;
    }

    @Override // p000.InterfaceC0198fw
    /* JADX INFO: renamed from: b */
    public final boolean mo7670b(AbstractC0199fx abstractC0199fx, MenuItem menuItem) {
        throw null;
    }

    @Override // p000.InterfaceC0198fw
    /* JADX INFO: renamed from: c */
    public final boolean mo7671c(AbstractC0199fx abstractC0199fx, Menu menu) {
        throw null;
    }

    @Override // p000.InterfaceC0198fw
    /* JADX INFO: renamed from: d */
    public final void mo7672d(AbstractC0199fx abstractC0199fx, Menu menu) {
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public final ActionMode m8962e(AbstractC0199fx abstractC0199fx) {
        int size = this.f23955c.size();
        for (int i = 0; i < size; i++) {
            C0203ga c0203ga = (C0203ga) this.f23955c.get(i);
            if (c0203ga != null && c0203ga.f24012b == abstractC0199fx) {
                return c0203ga;
            }
        }
        C0203ga c0203ga2 = new C0203ga(this.f23954b, abstractC0199fx);
        this.f23955c.add(c0203ga2);
        return c0203ga2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public final Menu m8963f(Menu menu) {
        Menu menu2 = (Menu) this.f23956d.get(menu);
        if (menu2 != null) {
            return menu2;
        }
        MenuC0242hm menuC0242hm = new MenuC0242hm(this.f23954b, menu);
        this.f23956d.put(menu, menuC0242hm);
        return menuC0242hm;
    }
}
