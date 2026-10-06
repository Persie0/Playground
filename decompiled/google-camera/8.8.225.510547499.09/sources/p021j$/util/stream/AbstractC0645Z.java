package p021j$.util.stream;

import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.Z */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0645Z extends AbstractC0619Q implements InterfaceC0610N {
    AbstractC0645Z(InterfaceC0610N interfaceC0610N, InterfaceC0610N interfaceC0610N2) {
        super(interfaceC0610N, interfaceC0610N2);
    }

    @Override // p021j$.util.stream.InterfaceC0610N
    /* JADX INFO: renamed from: i */
    public final Object mo12671i() {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object objMo12670e = mo12670e((int) jCount);
        mo12673y(0, objMo12670e);
        return objMo12670e;
    }

    @Override // p021j$.util.stream.InterfaceC0610N
    /* JADX INFO: renamed from: k */
    public final void mo12672k(Object obj) {
        ((InterfaceC0610N) this.f33342a).mo12672k(obj);
        ((InterfaceC0610N) this.f33343b).mo12672k(obj);
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object[] mo12601n(IntFunction intFunction) {
        return AbstractC0586F.m12646h(this, intFunction);
    }

    public final String toString() {
        return count() < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.f33342a, this.f33343b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(count()));
    }

    @Override // p021j$.util.stream.InterfaceC0610N
    /* JADX INFO: renamed from: y */
    public final void mo12673y(int i, Object obj) {
        InterfaceC0613O interfaceC0613O = this.f33342a;
        ((InterfaceC0610N) interfaceC0613O).mo12673y(i, obj);
        ((InterfaceC0610N) this.f33343b).mo12673y(i + ((int) ((InterfaceC0610N) interfaceC0613O).count()), obj);
    }
}
