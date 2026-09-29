package p341qg;

import com.kochava.tracker.privacy.internal.ConsentState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: qg.i */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8623i implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f46141a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ConsentState f46142b;

    public RunnableC8623i(ArrayList arrayList, ConsentState consentState) {
        this.f46141a = arrayList;
        this.f46142b = consentState;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f46141a.iterator();
        while (it.hasNext()) {
            ((InterfaceC8616b) it.next()).mo16831c(this.f46142b);
        }
    }
}
