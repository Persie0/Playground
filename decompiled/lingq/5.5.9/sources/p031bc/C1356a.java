package p031bc;

import android.os.BadParcelableException;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import cc.InterfaceC1799d5;
import com.google.android.gms.internal.measurement.BinderC2805q1;
import com.google.android.gms.internal.measurement.C2654f1;
import com.google.android.gms.internal.measurement.C2870v1;

/* JADX INFO: renamed from: bc.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1356a {

    /* JADX INFO: renamed from: a */
    public final C2870v1 f8191a;

    /* JADX INFO: renamed from: bc.a$a */
    public interface a extends InterfaceC1799d5 {
    }

    public C1356a(C2870v1 c2870v1) {
        this.f8191a = c2870v1;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final void m4931a(a aVar) {
        C2870v1 c2870v1 = this.f8191a;
        c2870v1.getClass();
        synchronized (c2870v1.f14470e) {
            for (int i10 = 0; i10 < c2870v1.f14470e.size(); i10++) {
                if (aVar.equals(((Pair) c2870v1.f14470e.get(i10)).first)) {
                    Log.w(c2870v1.f14466a, "OnEventListener already registered.");
                    return;
                }
            }
            BinderC2805q1 binderC2805q1 = new BinderC2805q1(aVar);
            c2870v1.f14470e.add(new Pair(aVar, binderC2805q1));
            if (c2870v1.f14473h != null) {
                try {
                    c2870v1.f14473h.registerOnMeasurementEventListener(binderC2805q1);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(c2870v1.f14466a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            c2870v1.m8300b(new C2654f1(c2870v1, binderC2805q1, 2));
        }
    }
}
