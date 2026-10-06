package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nns extends nnk {
    @Override // p000.nnk
    /* JADX INFO: renamed from: a */
    public final nno mo17525a(nnz nnzVar, nno nnoVar) {
        nno nnoVar2;
        synchronized (nnzVar) {
            nnoVar2 = nnzVar.listeners;
            if (nnoVar2 != nnoVar) {
                nnzVar.listeners = nnoVar;
            }
        }
        return nnoVar2;
    }

    @Override // p000.nnk
    /* JADX INFO: renamed from: b */
    public final nny mo17526b(nnz nnzVar, nny nnyVar) {
        nny nnyVar2;
        synchronized (nnzVar) {
            nnyVar2 = nnzVar.waiters;
            if (nnyVar2 != nnyVar) {
                nnzVar.waiters = nnyVar;
            }
        }
        return nnyVar2;
    }

    @Override // p000.nnk
    /* JADX INFO: renamed from: c */
    public final void mo17527c(nny nnyVar, nny nnyVar2) {
        nnyVar.next = nnyVar2;
    }

    @Override // p000.nnk
    /* JADX INFO: renamed from: d */
    public final void mo17528d(nny nnyVar, Thread thread) {
        nnyVar.thread = thread;
    }

    @Override // p000.nnk
    /* JADX INFO: renamed from: e */
    public final boolean mo17529e(nnz nnzVar, nno nnoVar, nno nnoVar2) {
        synchronized (nnzVar) {
            if (nnzVar.listeners != nnoVar) {
                return false;
            }
            nnzVar.listeners = nnoVar2;
            return true;
        }
    }

    @Override // p000.nnk
    /* JADX INFO: renamed from: f */
    public final boolean mo17530f(nnz nnzVar, Object obj, Object obj2) {
        synchronized (nnzVar) {
            if (nnzVar.value != obj) {
                return false;
            }
            nnzVar.value = obj2;
            return true;
        }
    }

    @Override // p000.nnk
    /* JADX INFO: renamed from: g */
    public final boolean mo17531g(nnz nnzVar, nny nnyVar, nny nnyVar2) {
        synchronized (nnzVar) {
            if (nnzVar.waiters != nnyVar) {
                return false;
            }
            nnzVar.waiters = nnyVar2;
            return true;
        }
    }
}
