package p021j$.util.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import p021j$.lang.InterfaceC0305a;
import p021j$.util.AbstractC0517U;
import p021j$.util.Spliterator;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.r1 */
/* JADX INFO: loaded from: classes3.dex */
class C0702r1 extends AbstractC0661e implements Consumer, Iterable, InterfaceC0305a {

    /* JADX INFO: renamed from: d */
    protected Object[] f33464d = new Object[16];

    /* JADX INFO: renamed from: e */
    protected Object[][] f33465e;

    C0702r1() {
    }

    public void accept(Object obj) {
        long length;
        int i = this.f33403a;
        Object[] objArr = this.f33464d;
        if (i == objArr.length) {
            if (this.f33465e == null) {
                Object[][] objArr2 = new Object[8][];
                this.f33465e = objArr2;
                this.f33405c = new long[8];
                objArr2[0] = objArr;
            }
            int i2 = this.f33404b;
            int i3 = i2 + 1;
            Object[][] objArr3 = this.f33465e;
            if (i3 >= objArr3.length || objArr3[i3] == null) {
                if (i2 == 0) {
                    length = objArr.length;
                } else {
                    length = ((long) objArr3[i2].length) + this.f33405c[i2];
                }
                m12730z(length + 1);
            }
            this.f33403a = 0;
            int i4 = this.f33404b + 1;
            this.f33404b = i4;
            this.f33464d = this.f33465e[i4];
        }
        Object[] objArr4 = this.f33464d;
        int i5 = this.f33403a;
        this.f33403a = i5 + 1;
        objArr4[i5] = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // p021j$.util.stream.AbstractC0661e
    public final void clear() {
        Object[][] objArr = this.f33465e;
        if (objArr != null) {
            this.f33464d = objArr[0];
            int i = 0;
            while (true) {
                Object[] objArr2 = this.f33464d;
                if (i >= objArr2.length) {
                    break;
                }
                objArr2[i] = null;
                i++;
            }
            this.f33465e = null;
            this.f33405c = null;
        } else {
            for (int i2 = 0; i2 < this.f33403a; i2++) {
                this.f33464d[i2] = null;
            }
        }
        this.f33403a = 0;
        this.f33404b = 0;
    }

    public void forEach(Consumer consumer) {
        for (int i = 0; i < this.f33404b; i++) {
            for (Object obj : this.f33465e[i]) {
                consumer.accept(obj);
            }
        }
        for (int i2 = 0; i2 < this.f33403a; i2++) {
            consumer.accept(this.f33464d[i2]);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return AbstractC0517U.m12519i(spliterator());
    }

    public Spliterator spliterator() {
        return new C0675i1(this, 0, this.f33404b, 0, this.f33403a);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        forEach(new C0648a(7, arrayList));
        return "SpinedBuffer:" + arrayList.toString();
    }

    /* JADX INFO: renamed from: z */
    protected final void m12730z(long j) {
        int i = this.f33404b;
        long length = i == 0 ? this.f33464d.length : this.f33405c[i] + ((long) this.f33465e[i].length);
        if (j <= length) {
            return;
        }
        if (this.f33465e == null) {
            Object[][] objArr = new Object[8][];
            this.f33465e = objArr;
            this.f33405c = new long[8];
            objArr[0] = this.f33464d;
        }
        while (true) {
            i++;
            if (j <= length) {
                return;
            }
            Object[][] objArr2 = this.f33465e;
            if (i >= objArr2.length) {
                int length2 = objArr2.length * 2;
                this.f33465e = (Object[][]) Arrays.copyOf(objArr2, length2);
                this.f33405c = Arrays.copyOf(this.f33405c, length2);
            }
            int iMin = 1 << ((i == 0 || i == 1) ? 4 : Math.min((i + 4) - 1, 30));
            Object[][] objArr3 = this.f33465e;
            objArr3[i] = new Object[iMin];
            long[] jArr = this.f33405c;
            int i2 = i - 1;
            jArr[i] = jArr[i2] + ((long) objArr3[i2].length);
            length += (long) iMin;
        }
    }
}
