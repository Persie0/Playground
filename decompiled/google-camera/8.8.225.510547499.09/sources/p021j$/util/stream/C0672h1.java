package p021j$.util.stream;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: j$.util.stream.h1 */
/* JADX INFO: loaded from: classes3.dex */
final class C0672h1 extends AbstractC0663e1 {

    /* JADX INFO: renamed from: d */
    private Object[] f33425d;

    /* JADX INFO: renamed from: e */
    private int f33426e;

    C0672h1(InterfaceC0646Z0 interfaceC0646Z0, Comparator comparator) {
        super(interfaceC0646Z0, comparator);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.f33425d;
        int i = this.f33426e;
        this.f33426e = i + 1;
        objArr[i] = obj;
    }

    @Override // p021j$.util.stream.AbstractC0637W0, p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: f */
    public final void mo12598f() {
        int i = 0;
        Arrays.sort(this.f33425d, 0, this.f33426e, this.f33406b);
        long j = this.f33426e;
        InterfaceC0646Z0 interfaceC0646Z0 = this.f33366a;
        interfaceC0646Z0.mo12599h(j);
        if (this.f33407c) {
            while (i < this.f33426e && !interfaceC0646Z0.mo12600m()) {
                interfaceC0646Z0.accept(this.f33425d[i]);
                i++;
            }
        } else {
            while (i < this.f33426e) {
                interfaceC0646Z0.accept(this.f33425d[i]);
                i++;
            }
        }
        interfaceC0646Z0.mo12598f();
        this.f33425d = null;
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: h */
    public final void mo12599h(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f33425d = new Object[(int) j];
    }
}
