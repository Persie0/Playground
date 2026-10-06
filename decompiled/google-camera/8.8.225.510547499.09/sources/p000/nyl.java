package p000;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nyl extends nym {
    /* JADX INFO: renamed from: a */
    static nxy m18184a(Object obj, long j) {
        return (nxy) oag.m18360h(obj, j);
    }

    @Override // p000.nym
    /* JADX INFO: renamed from: b */
    public final List mo18181b(Object obj, long j) {
        nxy nxyVarM18184a = m18184a(obj, j);
        if (nxyVarM18184a.mo17770c()) {
            return nxyVarM18184a;
        }
        int size = nxyVarM18184a.size();
        nxy nxyVarMo17775e = nxyVarM18184a.mo17775e(size == 0 ? 10 : size + size);
        oag.m18373u(obj, j, nxyVarMo17775e);
        return nxyVarMo17775e;
    }

    @Override // p000.nym
    /* JADX INFO: renamed from: c */
    public final void mo18182c(Object obj, long j) {
        m18184a(obj, j).mo17769b();
    }

    @Override // p000.nym
    /* JADX INFO: renamed from: d */
    public final void mo18183d(Object obj, Object obj2, long j) {
        nxy nxyVarM18184a = m18184a(obj, j);
        nxy nxyVarM18184a2 = m18184a(obj2, j);
        int size = nxyVarM18184a.size();
        int size2 = nxyVarM18184a2.size();
        if (size > 0 && size2 > 0) {
            if (!nxyVarM18184a.mo17770c()) {
                nxyVarM18184a = nxyVarM18184a.mo17775e(size2 + size);
            }
            nxyVarM18184a.addAll(nxyVarM18184a2);
        }
        if (size > 0) {
            nxyVarM18184a2 = nxyVarM18184a;
        }
        oag.m18373u(obj, j, nxyVarM18184a2);
    }
}
