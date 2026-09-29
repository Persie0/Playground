package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2657f4 extends ContentObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2671g4 f14190a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2657f4(C2671g4 c2671g4) {
        super(null);
        this.f14190a = c2671g4;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        C2671g4 c2671g4 = this.f14190a;
        synchronized (c2671g4.f14212e) {
            try {
                c2671g4.f14213f = null;
                c2671g4.f14210c.run();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (c2671g4) {
            Iterator it = c2671g4.f14214g.iterator();
            while (it.hasNext()) {
                ((InterfaceC2685h4) it.next()).zza();
            }
        }
    }
}
