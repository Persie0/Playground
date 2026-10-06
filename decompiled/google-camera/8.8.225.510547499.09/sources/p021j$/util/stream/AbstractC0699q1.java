package p021j$.util.stream;

import java.util.Arrays;
import p021j$.lang.InterfaceC0305a;

/* JADX INFO: renamed from: j$.util.stream.q1 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0699q1 extends AbstractC0661e implements Iterable, InterfaceC0305a {

    /* JADX INFO: renamed from: d */
    Object f33461d = mo12721e(16);

    /* JADX INFO: renamed from: e */
    Object[] f33462e;

    AbstractC0699q1() {
    }

    /* JADX INFO: renamed from: A */
    protected abstract int mo12719A(Object obj);

    /* JADX INFO: renamed from: B */
    protected final int m12727B(long j) {
        if (this.f33404b == 0) {
            if (j < this.f33403a) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        if (j >= count()) {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        for (int i = 0; i <= this.f33404b; i++) {
            if (j < this.f33405c[i] + ((long) mo12719A(this.f33462e[i]))) {
                return i;
            }
        }
        throw new IndexOutOfBoundsException(Long.toString(j));
    }

    /* JADX INFO: renamed from: C */
    protected final void m12728C(long j) {
        long jMo12719A;
        int i = this.f33404b;
        if (i == 0) {
            jMo12719A = mo12719A(this.f33461d);
        } else {
            jMo12719A = ((long) mo12719A(this.f33462e[i])) + this.f33405c[i];
        }
        if (j <= jMo12719A) {
            return;
        }
        if (this.f33462e == null) {
            Object[] objArrMo12720D = mo12720D();
            this.f33462e = objArrMo12720D;
            this.f33405c = new long[8];
            objArrMo12720D[0] = this.f33461d;
        }
        int i2 = this.f33404b;
        while (true) {
            i2++;
            if (j <= jMo12719A) {
                return;
            }
            Object[] objArr = this.f33462e;
            if (i2 >= objArr.length) {
                int length = objArr.length * 2;
                this.f33462e = Arrays.copyOf(objArr, length);
                this.f33405c = Arrays.copyOf(this.f33405c, length);
            }
            int iMin = 1 << ((i2 == 0 || i2 == 1) ? 4 : Math.min((i2 + 4) - 1, 30));
            this.f33462e[i2] = mo12721e(iMin);
            long[] jArr = this.f33405c;
            int i3 = i2 - 1;
            jArr[i2] = jArr[i3] + ((long) mo12719A(this.f33462e[i3]));
            jMo12719A += (long) iMin;
        }
    }

    /* JADX INFO: renamed from: D */
    protected abstract Object[] mo12720D();

    /* JADX INFO: renamed from: E */
    protected final void m12729E() {
        long jMo12719A;
        if (this.f33403a == mo12719A(this.f33461d)) {
            if (this.f33462e == null) {
                Object[] objArrMo12720D = mo12720D();
                this.f33462e = objArrMo12720D;
                this.f33405c = new long[8];
                objArrMo12720D[0] = this.f33461d;
            }
            int i = this.f33404b;
            int i2 = i + 1;
            Object[] objArr = this.f33462e;
            if (i2 >= objArr.length || objArr[i2] == null) {
                if (i == 0) {
                    jMo12719A = mo12719A(this.f33461d);
                } else {
                    jMo12719A = ((long) mo12719A(objArr[i])) + this.f33405c[i];
                }
                m12728C(jMo12719A + 1);
            }
            this.f33403a = 0;
            int i3 = this.f33404b + 1;
            this.f33404b = i3;
            this.f33461d = this.f33462e[i3];
        }
    }

    @Override // p021j$.util.stream.AbstractC0661e
    public final void clear() {
        Object[] objArr = this.f33462e;
        if (objArr != null) {
            this.f33461d = objArr[0];
            this.f33462e = null;
            this.f33405c = null;
        }
        this.f33403a = 0;
        this.f33404b = 0;
    }

    /* JADX INFO: renamed from: e */
    public abstract Object mo12721e(int i);

    /* JADX INFO: renamed from: i */
    public Object mo12671i() {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object objMo12721e = mo12721e((int) jCount);
        mo12673y(0, objMo12721e);
        return objMo12721e;
    }

    /* JADX INFO: renamed from: k */
    public void mo12672k(Object obj) {
        for (int i = 0; i < this.f33404b; i++) {
            Object obj2 = this.f33462e[i];
            mo12722z(obj2, 0, mo12719A(obj2), obj);
        }
        mo12722z(this.f33461d, 0, this.f33403a, obj);
    }

    /* JADX INFO: renamed from: y */
    public void mo12673y(int i, Object obj) {
        long j = i;
        long jCount = count() + j;
        if (jCount > mo12719A(obj) || jCount < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f33404b == 0) {
            System.arraycopy(this.f33461d, 0, obj, i, this.f33403a);
            return;
        }
        for (int i2 = 0; i2 < this.f33404b; i2++) {
            Object obj2 = this.f33462e[i2];
            System.arraycopy(obj2, 0, obj, i, mo12719A(obj2));
            i += mo12719A(this.f33462e[i2]);
        }
        int i3 = this.f33403a;
        if (i3 > 0) {
            System.arraycopy(this.f33461d, 0, obj, i, i3);
        }
    }

    /* JADX INFO: renamed from: z */
    protected abstract void mo12722z(Object obj, int i, int i2, Object obj2);
}
