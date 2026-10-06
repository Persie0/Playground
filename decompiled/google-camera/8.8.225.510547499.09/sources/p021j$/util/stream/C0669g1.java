package p021j$.util.stream;

import java.util.ArrayList;
import java.util.Comparator;
import p021j$.util.Collection$EL;
import p021j$.util.List$EL;

/* JADX INFO: renamed from: j$.util.stream.g1 */
/* JADX INFO: loaded from: classes3.dex */
final class C0669g1 extends AbstractC0663e1 {

    /* JADX INFO: renamed from: d */
    private ArrayList f33419d;

    C0669g1(InterfaceC0646Z0 interfaceC0646Z0, Comparator comparator) {
        super(interfaceC0646Z0, comparator);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f33419d.add(obj);
    }

    @Override // p021j$.util.stream.AbstractC0637W0, p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: f */
    public final void mo12598f() {
        List$EL.sort(this.f33419d, this.f33406b);
        long size = this.f33419d.size();
        InterfaceC0646Z0 interfaceC0646Z0 = this.f33366a;
        interfaceC0646Z0.mo12599h(size);
        if (this.f33407c) {
            for (Object obj : this.f33419d) {
                if (interfaceC0646Z0.mo12600m()) {
                    break;
                } else {
                    interfaceC0646Z0.accept(obj);
                }
            }
        } else {
            ArrayList arrayList = this.f33419d;
            interfaceC0646Z0.getClass();
            Collection$EL.forEach(arrayList, new C0648a(3, interfaceC0646Z0));
        }
        interfaceC0646Z0.mo12598f();
        this.f33419d = null;
    }

    @Override // p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: h */
    public final void mo12599h(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f33419d = j >= 0 ? new ArrayList((int) j) : new ArrayList();
    }
}
