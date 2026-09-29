package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class swb extends mvb {
    @Override // p000.mvb
    /* JADX INFO: renamed from: a */
    public final void mo17059a(Object obj, long j) {
        ((jnb) ((utb) b5c.m3320k(obj, j))).f45884a = false;
    }

    @Override // p000.mvb
    /* JADX INFO: renamed from: b */
    public final void mo17060b(Object obj, long j, Object obj2) {
        utb utbVarMo5294N = (utb) b5c.m3320k(obj, j);
        utb utbVar = (utb) b5c.m3320k(obj2, j);
        int size = utbVarMo5294N.size();
        int size2 = utbVar.size();
        if (size > 0 && size2 > 0) {
            if (!((jnb) utbVarMo5294N).f45884a) {
                utbVarMo5294N = utbVarMo5294N.mo5294N(size2 + size);
            }
            utbVarMo5294N.addAll(utbVar);
        }
        if (size > 0) {
            utbVar = utbVarMo5294N;
        }
        b5c.m3313d(obj, j, utbVar);
    }
}
