package p000;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class so2 extends ro2 {
    @Override // p000.qo2, p000.oo2
    /* JADX INFO: renamed from: b */
    public void mo18183b(kp9 kp9Var, kp9 kp9Var2, Window window, View view, boolean z, boolean z2) {
        bca h6bVar;
        kp9Var.getClass();
        kp9Var2.getClass();
        window.getClass();
        view.getClass();
        kaa.m15044f(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            int i = 0;
            while (true) {
                if (!(i < viewGroup.getChildCount())) {
                    break;
                }
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (childAt == null) {
                    v63.m23128b();
                    return;
                }
                Object tag = childAt.getTag();
                if (tag instanceof List) {
                    List list = (List) tag;
                    if (list.size() == 4 && (list.get(0) instanceof na1)) {
                        Iterator it = ((Iterable) tag).iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                        break;
                    }
                }
                i = i2;
            }
        }
        window.setNavigationBarContrastEnforced(true);
        cc4 cc4Var = new cc4(view);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 35) {
            h6bVar = new j6b(window, cc4Var);
        } else {
            h6bVar = i3 >= 30 ? new h6b(window, cc4Var) : new g6b(window, cc4Var);
        }
        h6bVar.mo3618i(!z);
        h6bVar.mo3617h(!z2);
    }
}
