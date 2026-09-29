package pa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p219ka.C6640a;
import p219ka.InterfaceC6646g;
import p479xa.C10129a;
import p479xa.C10134c0;

/* JADX INFO: renamed from: pa.d */
/* JADX INFO: loaded from: classes.dex */
public final class C8213d implements InterfaceC6646g {

    /* JADX INFO: renamed from: a */
    public final List<List<C6640a>> f44469a;

    /* JADX INFO: renamed from: b */
    public final List<Long> f44470b;

    public C8213d(ArrayList arrayList, ArrayList arrayList2) {
        this.f44469a = arrayList;
        this.f44470b = arrayList2;
    }

    @Override // p219ka.InterfaceC6646g
    /* JADX INFO: renamed from: a */
    public final int mo11452a(long j10) {
        int i10;
        Long lValueOf = Long.valueOf(j10);
        int i11 = C10134c0.f51354a;
        List<Long> list = this.f44470b;
        int iBinarySearch = Collections.binarySearch(list, lValueOf);
        if (iBinarySearch < 0) {
            i10 = ~iBinarySearch;
        } else {
            int size = list.size();
            do {
                iBinarySearch++;
                if (iBinarySearch >= size) {
                    break;
                }
            } while (list.get(iBinarySearch).compareTo(lValueOf) == 0);
            i10 = iBinarySearch;
        }
        if (i10 < list.size()) {
            return i10;
        }
        return -1;
    }

    @Override // p219ka.InterfaceC6646g
    /* JADX INFO: renamed from: f */
    public final long mo11455f(int i10) {
        boolean z10 = true;
        C10129a.m18990b(i10 >= 0);
        List<Long> list = this.f44470b;
        if (i10 >= list.size()) {
            z10 = false;
        }
        C10129a.m18990b(z10);
        return list.get(i10).longValue();
    }

    @Override // p219ka.InterfaceC6646g
    /* JADX INFO: renamed from: g */
    public final List<C6640a> mo11456g(long j10) {
        int iM19037d = C10134c0.m19037d(this.f44470b, Long.valueOf(j10), false);
        return iM19037d == -1 ? Collections.emptyList() : this.f44469a.get(iM19037d);
    }

    @Override // p219ka.InterfaceC6646g
    /* JADX INFO: renamed from: i */
    public final int mo11457i() {
        return this.f44470b.size();
    }
}
