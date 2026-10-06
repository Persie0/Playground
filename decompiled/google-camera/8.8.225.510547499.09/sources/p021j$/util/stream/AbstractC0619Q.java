package p021j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.Q */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0619Q implements InterfaceC0613O {

    /* JADX INFO: renamed from: a */
    protected final InterfaceC0613O f33342a;

    /* JADX INFO: renamed from: b */
    protected final InterfaceC0613O f33343b;

    /* JADX INFO: renamed from: c */
    private final long f33344c;

    AbstractC0619Q(InterfaceC0613O interfaceC0613O, InterfaceC0613O interfaceC0613O2) {
        this.f33342a = interfaceC0613O;
        this.f33343b = interfaceC0613O2;
        this.f33344c = interfaceC0613O.count() + interfaceC0613O2.count();
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: c */
    public /* bridge */ /* synthetic */ InterfaceC0610N mo12597c(int i) {
        return (InterfaceC0610N) mo12597c(i);
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    public final long count() {
        return this.f33344c;
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: u */
    public final int mo12604u() {
        return 2;
    }

    @Override // p021j$.util.stream.InterfaceC0613O
    /* JADX INFO: renamed from: c */
    public final InterfaceC0613O mo12597c(int i) {
        if (i == 0) {
            return this.f33342a;
        }
        if (i == 1) {
            return this.f33343b;
        }
        throw new IndexOutOfBoundsException();
    }
}
