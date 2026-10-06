package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class kdu extends kpn {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ kpj f35689a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ kdv f35690b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kdu(kdv kdvVar, kpj kpjVar, kpj kpjVar2) {
        super(kpjVar);
        this.f35690b = kdvVar;
        this.f35689a = kpjVar2;
    }

    @Override // p000.kpn, p000.kpj, p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f35690b.mo13971a();
    }

    public final String toString() {
        return "Virtual Camera ".concat(String.valueOf(this.f35689a.mo14492b()));
    }
}
