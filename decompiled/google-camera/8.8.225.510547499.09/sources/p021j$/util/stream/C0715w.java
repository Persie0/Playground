package p021j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.w */
/* JADX INFO: loaded from: classes3.dex */
final class C0715w extends AbstractC0628T0 {

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int f33512m;

    /* JADX INFO: renamed from: n */
    final /* synthetic */ Object f33513n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0715w(AbstractC0655c abstractC0655c, int i, Object obj, int i2) {
        super(abstractC0655c, i);
        this.f33512m = i2;
        this.f33513n = obj;
    }

    @Override // p021j$.util.stream.AbstractC0655c
    /* JADX INFO: renamed from: P */
    final InterfaceC0646Z0 mo12675P(int i, InterfaceC0646Z0 interfaceC0646Z0) {
        switch (this.f33512m) {
            case 0:
                return new C0712v(this, interfaceC0646Z0);
            case 1:
                return new C0679k(this, interfaceC0646Z0, 1);
            default:
                return new C0679k(this, interfaceC0646Z0, 2);
        }
    }
}
