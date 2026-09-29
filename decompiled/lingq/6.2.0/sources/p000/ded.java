package p000;

import androidx.fragment.app.AbstractC0638f;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import com.lingq.core.token.TokenPopupHostFragment;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ded {
    /* JADX INFO: renamed from: a */
    public static final void m10315a(AbstractC0638f abstractC0638f, boolean z) {
        TokenPopupHostFragment tokenPopupHostFragment = (TokenPopupHostFragment) (abstractC0638f != null ? abstractC0638f.m2137E(TokenPopupHostFragment.class.getName()) : null);
        if (tokenPopupHostFragment != null) {
            if (z) {
                abstractC0638f.m2147T();
                return;
            }
            abstractC0638f.getClass();
            g70 g70Var = new g70(abstractC0638f);
            g70Var.m12400j(tokenPopupHostFragment);
            g70Var.m12396f();
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m10316b(AbstractC0638f abstractC0638f, AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, int i, String str, boolean z) {
        String str2;
        g70 g70Var;
        abstractC0638f.getClass();
        g70 g70Var2 = new g70(abstractC0638f);
        if (i == 0) {
            C3386nv.m17626m("Must use non-zero containerViewId");
            return;
        }
        g70Var2.m12398h(i, abstractComponentCallbacksC0635c, str, 2);
        if (z) {
            if (abstractC0638f.f5743d.size() + (abstractC0638f.f5747h != null ? 1 : 0) > 0) {
                int size = (abstractC0638f.f5743d.size() + (abstractC0638f.f5747h != null ? 1 : 0)) - 1;
                if (size == abstractC0638f.f5743d.size()) {
                    g70Var = abstractC0638f.f5747h;
                    if (g70Var == null) {
                        v63.m23128b();
                        return;
                    }
                } else {
                    g70Var = (g70) abstractC0638f.f5743d.get(size);
                }
                g70Var.getClass();
                str2 = g70Var.f40295i;
            } else {
                str2 = null;
            }
            if (str2 == null || !str2.equals(str)) {
                g70Var2.m12393c(str);
            }
        }
        g70Var2.f40302p = true;
        g70Var2.m12396f();
    }

    /* JADX INFO: renamed from: c */
    public static int m10317c(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }
}
