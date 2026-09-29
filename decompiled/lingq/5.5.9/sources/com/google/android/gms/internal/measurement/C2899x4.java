package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import p326q.AbstractC8451g;
import p326q.C8446b;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2899x4 {

    /* JADX INFO: renamed from: a */
    public static final C8446b f14505a = new C8446b();

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static synchronized void m8411a() {
        try {
            C8446b c8446b = f14505a;
            Iterator it = ((AbstractC8451g.e) c8446b.values()).iterator();
            if (it.hasNext()) {
                ((C2899x4) it.next()).getClass();
                throw null;
            }
            c8446b.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
