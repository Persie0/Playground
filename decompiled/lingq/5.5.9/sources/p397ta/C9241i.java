package p397ta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p166i1.C6161p;
import p219ka.C6640a;
import p219ka.InterfaceC6646g;
import p479xa.C10129a;
import p479xa.C10134c0;

/* JADX INFO: renamed from: ta.i */
/* JADX INFO: loaded from: classes.dex */
public final class C9241i implements InterfaceC6646g {

    /* JADX INFO: renamed from: a */
    public final List<C9237e> f47928a;

    /* JADX INFO: renamed from: b */
    public final long[] f47929b;

    /* JADX INFO: renamed from: c */
    public final long[] f47930c;

    public C9241i(ArrayList arrayList) {
        this.f47928a = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f47929b = new long[arrayList.size() * 2];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            C9237e c9237e = (C9237e) arrayList.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f47929b;
            jArr[i11] = c9237e.f47899b;
            jArr[i11 + 1] = c9237e.f47900c;
        }
        long[] jArr2 = this.f47929b;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f47930c = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // p219ka.InterfaceC6646g
    /* JADX INFO: renamed from: a */
    public final int mo11452a(long j10) {
        long[] jArr = this.f47930c;
        int iM19035b = C10134c0.m19035b(jArr, j10, false);
        if (iM19035b < jArr.length) {
            return iM19035b;
        }
        return -1;
    }

    @Override // p219ka.InterfaceC6646g
    /* JADX INFO: renamed from: f */
    public final long mo11455f(int i10) {
        boolean z10 = true;
        C10129a.m18990b(i10 >= 0);
        long[] jArr = this.f47930c;
        if (i10 >= jArr.length) {
            z10 = false;
        }
        C10129a.m18990b(z10);
        return jArr[i10];
    }

    @Override // p219ka.InterfaceC6646g
    /* JADX INFO: renamed from: g */
    public final List<C6640a> mo11456g(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (true) {
            List<C9237e> list = this.f47928a;
            if (i10 >= list.size()) {
                break;
            }
            int i11 = i10 * 2;
            long[] jArr = this.f47929b;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                C9237e c9237e = list.get(i10);
                C6640a c6640a = c9237e.f47898a;
                if (c6640a.f37663e == -3.4028235E38f) {
                    arrayList2.add(c9237e);
                } else {
                    arrayList.add(c6640a);
                }
            }
            i10++;
        }
        Collections.sort(arrayList2, new C6161p(1));
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            C6640a c6640a2 = ((C9237e) arrayList2.get(i12)).f47898a;
            c6640a2.getClass();
            arrayList.add(new C6640a(c6640a2.f37659a, c6640a2.f37660b, c6640a2.f37661c, c6640a2.f37662d, (-1) - i12, 1, c6640a2.f37665g, c6640a2.f37666h, c6640a2.f37667i, c6640a2.f37655I, c6640a2.f37656J, c6640a2.f37668j, c6640a2.f37669k, c6640a2.f37670l, c6640a2.f37654H, c6640a2.f37657K, c6640a2.f37658L));
        }
        return arrayList;
    }

    @Override // p219ka.InterfaceC6646g
    /* JADX INFO: renamed from: i */
    public final int mo11457i() {
        return this.f47930c.length;
    }
}
