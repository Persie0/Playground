package p000;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: cy */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0119cy {

    /* JADX INFO: renamed from: a */
    static final AbstractC0127df f10019a = new C0126de();

    /* JADX INFO: renamed from: b */
    static final AbstractC0127df f10020b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f10021c = 0;

    static {
        AbstractC0127df abstractC0127df;
        try {
            abstractC0127df = (AbstractC0127df) Class.forName("asa").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            abstractC0127df = null;
        }
        f10020b = abstractC0127df;
    }

    /* JADX INFO: renamed from: a */
    static void m5728a(ComponentCallbacksC0077bw componentCallbacksC0077bw, ComponentCallbacksC0077bw componentCallbacksC0077bw2, boolean z, C1109wy c1109wy, boolean z2) {
        if ((z ? componentCallbacksC0077bw2.m3129x() : componentCallbacksC0077bw.m3129x()) != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i = c1109wy.f48004d;
            for (int i2 = 0; i2 < i; i2++) {
                arrayList2.add((String) c1109wy.m19559d(i2));
                arrayList.add((View) c1109wy.m19560g(i2));
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    static void m5729b(ArrayList arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((View) arrayList.get(size)).setVisibility(i);
        }
    }
}
