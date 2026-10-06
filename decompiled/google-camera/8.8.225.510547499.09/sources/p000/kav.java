package p000;

import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kav {

    /* JADX INFO: renamed from: a */
    private final ArrayDeque f35495a = new ArrayDeque();

    /* JADX INFO: renamed from: b */
    private float f35496b = 0.0f;

    /* JADX INFO: renamed from: a */
    public final synchronized void m13887a(kau kauVar) {
        lku.m15670x(true, "Sample cannot be null");
        this.f35496b += kauVar.f35494b;
        this.f35495a.add(kauVar);
        Iterator it = this.f35495a.iterator();
        while (it.hasNext()) {
            kau kauVar2 = (kau) it.next();
            if (kauVar2.f35493a + 1000000 >= kauVar.f35493a) {
                break;
            }
            it.remove();
            this.f35496b -= kauVar2.f35494b;
        }
    }
}
