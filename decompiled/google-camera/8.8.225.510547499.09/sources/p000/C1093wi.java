package p000;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: wi */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1093wi implements InterfaceC0972rw {

    /* JADX INFO: renamed from: a */
    private final CopyOnWriteArrayList f47926a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: l */
    private final void m19525l() {
        for (InterfaceC1094wj interfaceC1094wj : this.f47926a) {
            if (interfaceC1094wj.m19527b()) {
                this.f47926a.remove(interfaceC1094wj);
            }
        }
    }

    @Override // p000.InterfaceC0972rw
    /* JADX INFO: renamed from: a */
    public final void mo14439a(C0973rx c0973rx) {
        c0973rx.getClass();
    }

    @Override // p000.InterfaceC0972rw
    /* JADX INFO: renamed from: b */
    public final void mo14440b(C1013tj c1013tj) {
        c1013tj.getClass();
    }

    @Override // p000.InterfaceC0972rw
    /* JADX INFO: renamed from: c */
    public final void mo14441c(C1013tj c1013tj) {
        c1013tj.getClass();
        Iterator it = this.f47926a.iterator();
        while (it.hasNext()) {
            ((InterfaceC1094wj) it.next()).m19526a();
        }
    }

    @Override // p000.InterfaceC0972rw
    /* JADX INFO: renamed from: d */
    public final void mo14442d(C1013tj c1013tj) {
        c1013tj.getClass();
    }

    @Override // p000.InterfaceC0972rw
    /* JADX INFO: renamed from: e */
    public final void mo14443e(long j, int i) {
    }

    @Override // p000.InterfaceC0972rw
    /* JADX INFO: renamed from: f */
    public final void mo14444f() {
    }

    @Override // p000.InterfaceC0972rw
    /* JADX INFO: renamed from: g */
    public final void mo14445g() {
    }

    @Override // p000.InterfaceC0972rw
    /* JADX INFO: renamed from: h */
    public final void mo14446h(C1013tj c1013tj) {
        c1013tj.getClass();
    }

    @Override // p000.InterfaceC0972rw
    /* JADX INFO: renamed from: i */
    public final void mo14447i(long j, long j2) {
    }

    @Override // p000.InterfaceC0972rw
    /* JADX INFO: renamed from: j */
    public final void mo14448j() {
        m19525l();
    }

    @Override // p000.InterfaceC0972rw
    /* JADX INFO: renamed from: k */
    public final void mo14449k(C1013tj c1013tj) {
        m19525l();
    }
}
