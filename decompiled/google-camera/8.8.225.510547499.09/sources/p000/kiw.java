package p000;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kiw implements kiy {

    /* JADX INFO: renamed from: a */
    private final CopyOnWriteArraySet f36224a = new CopyOnWriteArraySet();

    @Override // p000.kiy
    /* JADX INFO: renamed from: a */
    public final void mo14324a() {
        Iterator it = this.f36224a.iterator();
        while (it.hasNext()) {
            ((kiy) it.next()).mo14324a();
        }
    }

    @Override // p000.kiy
    /* JADX INFO: renamed from: b */
    public final void mo14325b() {
        Iterator it = this.f36224a.iterator();
        while (it.hasNext()) {
            ((kiy) it.next()).mo14325b();
        }
    }
}
