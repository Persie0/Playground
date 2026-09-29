package p000;

import android.view.ViewParent;
import androidx.fragment.app.AbstractC0638f;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class rg1 {

    /* JADX INFO: renamed from: a */
    public long f59228a;

    /* JADX INFO: renamed from: b */
    public Object f59229b;

    /* JADX INFO: renamed from: c */
    public Object f59230c;

    /* JADX INFO: renamed from: d */
    public Object f59231d;

    /* JADX INFO: renamed from: e */
    public Object f59232e;

    /* JADX INFO: renamed from: f */
    public Object f59233f;

    /* JADX INFO: renamed from: a */
    public static ViewPager2 m20657a(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof ViewPager2) {
            return (ViewPager2) parent;
        }
        ij6.m13966x(parent, "Expected ViewPager2 instance. Got: ");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m20658b(boolean z) {
        int currentItem;
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c;
        hy7 hy7Var = (hy7) this.f59233f;
        ck6 ck6Var = hy7Var.f43212j;
        tk5 tk5Var = hy7Var.f43208f;
        AbstractC0638f abstractC0638f = hy7Var.f43207e;
        if (abstractC0638f.m2144Q() || ((ViewPager2) this.f59232e).getScrollState() != 0 || tk5Var.m22178d() || hy7Var.f43215m.size() == 0 || (currentItem = ((ViewPager2) this.f59232e).getCurrentItem()) >= hy7Var.f43215m.size()) {
            return;
        }
        long j = currentItem;
        if ((j != this.f59228a || z) && (abstractComponentCallbacksC0635c = (AbstractComponentCallbacksC0635c) tk5Var.m22176b(j)) != null && abstractComponentCallbacksC0635c.m2115q()) {
            this.f59228a = j;
            abstractC0638f.getClass();
            g70 g70Var = new g70(abstractC0638f);
            ArrayList<List> arrayList = new ArrayList();
            AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c2 = null;
            for (int i = 0; i < tk5Var.m22182h(); i++) {
                long jM22179e = tk5Var.m22179e(i);
                AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c3 = (AbstractComponentCallbacksC0635c) tk5Var.m22183i(i);
                if (abstractComponentCallbacksC0635c3.m2115q()) {
                    if (jM22179e != this.f59228a) {
                        g70Var.m12401k(abstractComponentCallbacksC0635c3, Lifecycle$State.STARTED);
                        ck6Var.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = ((CopyOnWriteArrayList) ck6Var.f10194b).iterator();
                        if (it.hasNext()) {
                            throw wq1.m24110f(it);
                        }
                        arrayList.add(arrayList2);
                    } else {
                        abstractComponentCallbacksC0635c2 = abstractComponentCallbacksC0635c3;
                    }
                    boolean z2 = jM22179e == this.f59228a;
                    if (abstractComponentCallbacksC0635c3.f5686a0 != z2) {
                        abstractComponentCallbacksC0635c3.f5686a0 = z2;
                    }
                }
            }
            if (abstractComponentCallbacksC0635c2 != null) {
                g70Var.m12401k(abstractComponentCallbacksC0635c2, Lifecycle$State.RESUMED);
                ck6Var.getClass();
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = ((CopyOnWriteArrayList) ck6Var.f10194b).iterator();
                if (it2.hasNext()) {
                    throw wq1.m24110f(it2);
                }
                arrayList.add(arrayList3);
            }
            if (g70Var.f40287a.isEmpty()) {
                return;
            }
            if (g70Var.f40293g) {
                C3386nv.m17633t("This transaction is already being added to the back stack");
                return;
            }
            g70Var.f40294h = false;
            g70Var.f40304r.m2133A(g70Var, false);
            Collections.reverse(arrayList);
            for (List list : arrayList) {
                ck6Var.getClass();
                ck6.m4788l(list);
            }
        }
    }
}
