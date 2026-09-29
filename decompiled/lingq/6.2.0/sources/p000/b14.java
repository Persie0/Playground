package p000;

import com.google.common.collect.ImmutableCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class b14 {

    /* JADX INFO: renamed from: a */
    public Object[] f7758a;

    /* JADX INFO: renamed from: b */
    public int f7759b;

    /* JADX INFO: renamed from: c */
    public boolean f7760c;

    public b14(int i) {
        AbstractC3489q9.m19779i(i, "initialCapacity");
        this.f7758a = new Object[i];
        this.f7759b = 0;
    }

    /* JADX INFO: renamed from: f */
    public static int m3155f(int i, int i2) {
        if (i2 < 0) {
            C3386nv.m17626m("cannot store more than MAX_VALUE elements");
            return 0;
        }
        if (i2 <= i) {
            return i;
        }
        int iHighestOneBit = i + (i >> 1) + 1;
        if (iHighestOneBit < i2) {
            iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    /* JADX INFO: renamed from: a */
    public abstract b14 mo3156a(Object obj);

    /* JADX INFO: renamed from: b */
    public final void m3157b(Object obj) {
        obj.getClass();
        m3160e(1);
        Object[] objArr = this.f7758a;
        int i = this.f7759b;
        this.f7759b = i + 1;
        objArr[i] = obj;
    }

    /* JADX INFO: renamed from: c */
    public final void m3158c(Object... objArr) {
        int length = objArr.length;
        d32.m10011I(objArr, length);
        m3160e(length);
        System.arraycopy(objArr, 0, this.f7758a, this.f7759b, length);
        this.f7759b += length;
    }

    /* JADX INFO: renamed from: d */
    public final void m3159d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            m3160e(collection.size());
            if (collection instanceof ImmutableCollection) {
                this.f7759b = ((ImmutableCollection) collection).mo6274f(this.f7758a, this.f7759b);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            mo3156a(it.next());
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m3160e(int i) {
        Object[] objArr = this.f7758a;
        int iM3155f = m3155f(objArr.length, this.f7759b + i);
        if (iM3155f > objArr.length || this.f7760c) {
            this.f7758a = Arrays.copyOf(this.f7758a, iM3155f);
            this.f7760c = false;
        }
    }
}
