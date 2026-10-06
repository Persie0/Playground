package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class mwi {

    /* JADX INFO: renamed from: a */
    Object[] f41724a;

    /* JADX INFO: renamed from: b */
    int f41725b;

    /* JADX INFO: renamed from: c */
    boolean f41726c;

    public mwi(int i) {
        lku.m15655i(i, "initialCapacity");
        this.f41724a = new Object[i];
        this.f41725b = 0;
    }

    /* JADX INFO: renamed from: a */
    static int m17068a(int i, int i2) {
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            int iHighestOneBit = Integer.highestOneBit(i2 - 1);
            i3 = iHighestOneBit + iHighestOneBit;
        }
        if (i3 < 0) {
            return Integer.MAX_VALUE;
        }
        return i3;
    }

    /* JADX INFO: renamed from: f */
    private final void m17069f(int i) {
        Object[] objArr = this.f41724a;
        int length = objArr.length;
        if (length < i) {
            this.f41724a = Arrays.copyOf(objArr, m17068a(length, i));
            this.f41726c = false;
        } else if (this.f41726c) {
            this.f41724a = (Object[]) objArr.clone();
            this.f41726c = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m17070b(Object[] objArr, int i) {
        mkv.m16553r(objArr, i);
        m17069f(this.f41725b + i);
        System.arraycopy(objArr, 0, this.f41724a, this.f41725b, i);
        this.f41725b += i;
    }

    /* JADX INFO: renamed from: c */
    public final void m17071c(Object obj) {
        obj.getClass();
        m17069f(this.f41725b + 1);
        Object[] objArr = this.f41724a;
        int i = this.f41725b;
        this.f41725b = i + 1;
        objArr[i] = obj;
    }

    /* JADX INFO: renamed from: d */
    public /* bridge */ /* synthetic */ void mo17072d(Object obj) {
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public final void m17073e(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            m17069f(this.f41725b + collection.size());
            if (collection instanceof mwj) {
                this.f41725b = ((mwj) collection).mo17075x(this.f41724a, this.f41725b);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            mo17072d(it.next());
        }
    }
}
