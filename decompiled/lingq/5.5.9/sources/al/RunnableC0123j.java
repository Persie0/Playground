package al;

import com.tonyodev.fetch2.Download;
import com.tonyodev.fetch2.database.DownloadInfo;
import com.tonyodev.fetch2core.Reason;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p122fl.InterfaceC5581d;

/* JADX INFO: renamed from: al.j */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0123j implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f321a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Download f322b;

    public RunnableC0123j(ArrayList arrayList, DownloadInfo downloadInfo) {
        this.f321a = arrayList;
        this.f322b = downloadInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f321a.iterator();
        while (it.hasNext()) {
            ((InterfaceC5581d) it.next()).mo11833b(this.f322b, Reason.OBSERVER_ATTACHED);
        }
    }
}
