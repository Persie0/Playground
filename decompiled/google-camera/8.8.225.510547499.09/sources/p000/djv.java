package p000;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class djv implements chn {

    /* JADX INFO: renamed from: a */
    public final ConcurrentLinkedQueue f11824a = new ConcurrentLinkedQueue();

    @Override // p000.chn
    /* JADX INFO: renamed from: a */
    public final void mo3727a() {
        Iterator it = this.f11824a.iterator();
        while (it.hasNext()) {
            ((chn) it.next()).mo3727a();
        }
    }
}
