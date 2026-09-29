package p152hb;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.C2548c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC2544c;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: renamed from: hb.q1 */
/* JADX INFO: loaded from: classes.dex */
public final class C6003q1 extends AbstractDialogInterfaceOnCancelListenerC6018v1 {

    /* JADX INFO: renamed from: f */
    public final SparseArray<C6000p1> f35578f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6003q1(InterfaceC5968f interfaceC5968f) {
        super(interfaceC5968f);
        Object obj = C2548c.f13919c;
        this.f35578f = new SparseArray<>();
        interfaceC5968f.mo12394a("AutoManageHelper", this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: a */
    public final void mo7572a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i10 = 0; i10 < this.f35578f.size(); i10++) {
            C6000p1 c6000p1M12452n = m12452n(i10);
            if (c6000p1M12452n != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(c6000p1M12452n.f35571a);
                printWriter.println(":");
                c6000p1M12452n.f35572b.mo7557e(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: h */
    public final void mo7578h() {
        this.f35614b = true;
        boolean z10 = this.f35614b;
        String strValueOf = String.valueOf(this.f35578f);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 14);
        sb2.append("onStart ");
        sb2.append(z10);
        sb2.append(" ");
        sb2.append(strValueOf);
        Log.d("AutoManageHelper", sb2.toString());
        if (this.f35615c.get() == null) {
            for (int i10 = 0; i10 < this.f35578f.size(); i10++) {
                C6000p1 c6000p1M12452n = m12452n(i10);
                if (c6000p1M12452n != null) {
                    c6000p1M12452n.f35572b.mo7555a();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* JADX INFO: renamed from: i */
    public final void mo7579i() {
        this.f35614b = false;
        for (int i10 = 0; i10 < this.f35578f.size(); i10++) {
            C6000p1 c6000p1M12452n = m12452n(i10);
            if (c6000p1M12452n != null) {
                c6000p1M12452n.f35572b.mo7556d();
            }
        }
    }

    @Override // p152hb.AbstractDialogInterfaceOnCancelListenerC6018v1
    /* JADX INFO: renamed from: j */
    public final void mo12450j(ConnectionResult connectionResult, int i10) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i10 < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        SparseArray<C6000p1> sparseArray = this.f35578f;
        C6000p1 c6000p1 = sparseArray.get(i10);
        if (c6000p1 != null) {
            C6000p1 c6000p2 = sparseArray.get(i10);
            sparseArray.remove(i10);
            if (c6000p2 != null) {
                AbstractC2544c abstractC2544c = c6000p2.f35572b;
                abstractC2544c.mo7560h(c6000p2);
                abstractC2544c.mo7556d();
            }
            AbstractC2544c.b bVar = c6000p1.f35573c;
            if (bVar != null) {
                bVar.mo494j(connectionResult);
            }
        }
    }

    @Override // p152hb.AbstractDialogInterfaceOnCancelListenerC6018v1
    /* JADX INFO: renamed from: k */
    public final void mo12451k() {
        for (int i10 = 0; i10 < this.f35578f.size(); i10++) {
            C6000p1 c6000p1M12452n = m12452n(i10);
            if (c6000p1M12452n != null) {
                c6000p1M12452n.f35572b.mo7555a();
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final C6000p1 m12452n(int i10) {
        SparseArray<C6000p1> sparseArray = this.f35578f;
        if (sparseArray.size() <= i10) {
            return null;
        }
        return sparseArray.get(sparseArray.keyAt(i10));
    }
}
