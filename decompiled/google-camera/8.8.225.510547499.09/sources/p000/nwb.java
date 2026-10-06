package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class nwb implements nyv {
    /* JADX INFO: renamed from: e */
    public static void m17749e(Iterable iterable, List list) {
        nxz.m18156e(iterable);
        if (iterable instanceof nyj) {
            List listMo18177h = ((nyj) iterable).mo18177h();
            nyj nyjVar = (nyj) list;
            int size = list.size();
            for (Object obj : listMo18177h) {
                if (obj == null) {
                    String str = "Element at index " + (nyjVar.size() - size) + " is null.";
                    for (int size2 = nyjVar.size() - 1; size2 >= size; size2--) {
                        nyjVar.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof nwr) {
                    nyjVar.mo18178i((nwr) obj);
                } else {
                    nyjVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof nze) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
        }
        int size3 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list.size() - size3) + " is null.";
                for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                    list.remove(size4);
                }
                throw new NullPointerException(str2);
            }
            list.add(obj2);
        }
    }

    @Override // 
    /* JADX INFO: renamed from: a */
    public abstract nwb clone();

    /* JADX INFO: renamed from: b */
    protected abstract nwb mo17751b(nwc nwcVar);

    @Override // p000.nyv
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ nyv mo17752c(nyw nywVar) {
        if (mo18097cx().getClass().isInstance(nywVar)) {
            return mo17751b((nwc) nywVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    @Override // p000.nyv
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ nyv mo17753d(byte[] bArr) {
        return mo17755g(bArr, bArr.length);
    }

    @Override // p000.nyv
    /* JADX INFO: renamed from: f */
    public /* bridge */ /* synthetic */ void mo17754f(nww nwwVar, nxf nxfVar) {
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public nwb mo17755g(byte[] bArr, int i) {
        throw null;
    }
}
