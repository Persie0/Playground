package p000;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class o43 implements i70 {

    /* JADX INFO: renamed from: a */
    public static final AtomicReference f53820a = new AtomicReference();

    @Override // p000.i70
    /* JADX INFO: renamed from: a */
    public final void mo12374a(boolean z) {
        synchronized (q43.f57250k) {
            try {
                for (q43 q43Var : new ArrayList(q43.f57251l.values())) {
                    if (q43Var.f57256e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = q43Var.f57260i.iterator();
                        while (it.hasNext()) {
                            q43 q43Var2 = ((n43) it.next()).f52314a;
                            if (!z) {
                                ((n62) q43Var2.f57259h.get()).m17248b();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
