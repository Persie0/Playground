package p000;

import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class g58 implements i70 {

    /* JADX INFO: renamed from: a */
    public static final AtomicReference f40242a = new AtomicReference();

    @Override // p000.i70
    /* JADX INFO: renamed from: a */
    public final void mo12374a(boolean z) {
        Random random = h58.f41804j;
        synchronized (h58.class) {
            Iterator it = h58.f41805k.values().iterator();
            while (it.hasNext()) {
                ((l53) it.next()).m15813c(z);
            }
        }
    }
}
