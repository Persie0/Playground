package p000;

/* JADX INFO: renamed from: s */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0976s extends AbstractC0814m {
    private static final long serialVersionUID = 1405488568664762222L;

    public C0976s(InterfaceC0841n interfaceC0841n, InterfaceC0841n interfaceC0841n2) {
        super(interfaceC0841n, interfaceC0841n2);
    }

    @Override // p000.InterfaceC0841n
    /* JADX INFO: renamed from: a */
    public final boolean mo13853a(C0895p c0895p) {
        return this.f39690a.mo13853a(c0895p) || this.f39691b.mo13853a(c0895p);
    }

    public final String toString() {
        return this.f39690a.toString() + " or " + this.f39691b.toString();
    }
}
