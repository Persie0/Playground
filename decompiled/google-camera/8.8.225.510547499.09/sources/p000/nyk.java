package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nyk extends nym {

    /* JADX INFO: renamed from: c */
    private static final Class f45022c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX INFO: renamed from: a */
    static List m18179a(Object obj, long j) {
        return (List) oag.m18360h(obj, j);
    }

    /* JADX INFO: renamed from: e */
    private static List m18180e(Object obj, long j, int i) {
        List listMo17775e;
        List listM18179a = m18179a(obj, j);
        if (listM18179a.isEmpty()) {
            if (listM18179a instanceof nyj) {
                listMo17775e = new nyi(i);
            } else {
                listMo17775e = ((listM18179a instanceof nze) && (listM18179a instanceof nxy)) ? ((nxy) listM18179a).mo17775e(i) : new ArrayList(i);
            }
            oag.m18373u(obj, j, listMo17775e);
            return listMo17775e;
        }
        if (f45022c.isAssignableFrom(listM18179a.getClass())) {
            ArrayList arrayList = new ArrayList(listM18179a.size() + i);
            arrayList.addAll(listM18179a);
            oag.m18373u(obj, j, arrayList);
            return arrayList;
        }
        if (listM18179a instanceof oab) {
            nyi nyiVar = new nyi(listM18179a.size() + i);
            nyiVar.addAll((oab) listM18179a);
            oag.m18373u(obj, j, nyiVar);
            return nyiVar;
        }
        if (!(listM18179a instanceof nze) || !(listM18179a instanceof nxy)) {
            return listM18179a;
        }
        nxy nxyVar = (nxy) listM18179a;
        if (nxyVar.mo17770c()) {
            return listM18179a;
        }
        nxy nxyVarMo17775e = nxyVar.mo17775e(listM18179a.size() + i);
        oag.m18373u(obj, j, nxyVarMo17775e);
        return nxyVarMo17775e;
    }

    @Override // p000.nym
    /* JADX INFO: renamed from: b */
    public final List mo18181b(Object obj, long j) {
        return m18180e(obj, j, 10);
    }

    @Override // p000.nym
    /* JADX INFO: renamed from: c */
    public final void mo18182c(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) oag.m18360h(obj, j);
        if (list instanceof nyj) {
            objUnmodifiableList = ((nyj) list).mo18174d();
        } else {
            if (f45022c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof nze) && (list instanceof nxy)) {
                nxy nxyVar = (nxy) list;
                if (nxyVar.mo17770c()) {
                    nxyVar.mo17769b();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        oag.m18373u(obj, j, objUnmodifiableList);
    }

    @Override // p000.nym
    /* JADX INFO: renamed from: d */
    public final void mo18183d(Object obj, Object obj2, long j) {
        List listM18179a = m18179a(obj2, j);
        List listM18180e = m18180e(obj, j, listM18179a.size());
        int size = listM18180e.size();
        int size2 = listM18179a.size();
        if (size > 0 && size2 > 0) {
            listM18180e.addAll(listM18179a);
        }
        if (size > 0) {
            listM18179a = listM18180e;
        }
        oag.m18373u(obj, j, listM18179a);
    }
}
