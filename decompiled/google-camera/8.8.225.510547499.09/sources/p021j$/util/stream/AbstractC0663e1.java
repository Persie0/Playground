package p021j$.util.stream;

import java.util.Comparator;

/* JADX INFO: renamed from: j$.util.stream.e1 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0663e1 extends AbstractC0637W0 {

    /* JADX INFO: renamed from: b */
    protected final Comparator f33406b;

    /* JADX INFO: renamed from: c */
    protected boolean f33407c;

    AbstractC0663e1(InterfaceC0646Z0 interfaceC0646Z0, Comparator comparator) {
        super(interfaceC0646Z0);
        this.f33406b = comparator;
    }

    @Override // p021j$.util.stream.AbstractC0637W0, p021j$.util.stream.InterfaceC0646Z0
    /* JADX INFO: renamed from: m */
    public final boolean mo12600m() {
        this.f33407c = true;
        return false;
    }
}
