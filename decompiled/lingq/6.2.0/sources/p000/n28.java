package p000;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class n28 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RecyclerView f52241a;

    public /* synthetic */ n28(RecyclerView recyclerView) {
        this.f52241a = recyclerView;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    /* JADX INFO: renamed from: a */
    public void m17189a(o38 o38Var, xp7 xp7Var, xp7 xp7Var2) {
        boolean zM154g;
        o38Var.m17796p(false);
        RecyclerView recyclerView = this.f52241a;
        a72 a72Var = (a72) recyclerView.f6664k0;
        if (xp7Var != null) {
            a72Var.getClass();
            int i = xp7Var.f68498b;
            int i2 = xp7Var2.f68498b;
            if (i == i2 && xp7Var.f68499c == xp7Var2.f68499c) {
                a72Var.m158l(o38Var);
                o38Var.f53781a.setAlpha(0.0f);
                a72Var.f308i.add(o38Var);
                zM154g = true;
            } else {
                zM154g = a72Var.m154g(o38Var, i, xp7Var.f68499c, i2, xp7Var2.f68499c);
            }
        } else {
            a72Var.m158l(o38Var);
            o38Var.f53781a.setAlpha(0.0f);
            a72Var.f308i.add(o38Var);
            zM154g = true;
        }
        if (zM154g) {
            recyclerView.m2729X();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m17190b(o38 o38Var, xp7 xp7Var, xp7 xp7Var2) {
        boolean zM154g;
        RecyclerView recyclerView = this.f52241a;
        recyclerView.f6647c.m12341m(o38Var);
        recyclerView.m2739h(o38Var);
        o38Var.m17796p(false);
        a72 a72Var = (a72) recyclerView.f6664k0;
        a72Var.getClass();
        int i = xp7Var.f68498b;
        int i2 = xp7Var.f68499c;
        View view = o38Var.f53781a;
        int left = xp7Var2 == null ? view.getLeft() : xp7Var2.f68498b;
        int top = xp7Var2 == null ? view.getTop() : xp7Var2.f68499c;
        if (o38Var.m17790j() || (i == left && i2 == top)) {
            a72Var.m158l(o38Var);
            a72Var.f307h.add(o38Var);
            zM154g = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zM154g = a72Var.m154g(o38Var, i, i2, left, top);
        }
        if (zM154g) {
            recyclerView.m2729X();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m17191c(int i) {
        RecyclerView recyclerView = this.f52241a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.m2757r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
