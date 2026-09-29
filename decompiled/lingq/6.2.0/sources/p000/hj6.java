package p000;

import android.view.Menu;
import android.view.MenuItem;
import com.google.android.material.navigation.AbstractC1067d;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class hj6 implements e86 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ WeakReference f42491a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ud6 f42492b;

    public hj6(WeakReference weakReference, ud6 ud6Var) {
        this.f42491a = weakReference;
        this.f42492b = ud6Var;
    }

    @Override // p000.e86
    /* JADX INFO: renamed from: a */
    public final void mo10921a(ud6 ud6Var, r86 r86Var) {
        r86Var.getClass();
        AbstractC1067d abstractC1067d = (AbstractC1067d) this.f42491a.get();
        if (abstractC1067d == null) {
            ud6 ud6Var2 = this.f42492b;
            ud6Var2.getClass();
            h86 h86Var = ud6Var2.f63760b;
            h86Var.getClass();
            h86Var.f41960o.remove(this);
            return;
        }
        if (r86Var instanceof de2) {
            return;
        }
        Menu menu = abstractC1067d.getMenu();
        menu.getClass();
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menu.getItem(i);
            if (AbstractC3184kh.m15197D(item.getItemId(), r86Var)) {
                item.setChecked(true);
            }
        }
    }
}
