package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fru extends frs {

    /* JADX INFO: renamed from: c */
    final gyu f23355c;

    /* JADX INFO: renamed from: d */
    public final long f23356d;

    /* JADX INFO: renamed from: e */
    final npk f23357e;

    public fru(long j, npk npkVar, gyu gyuVar, byte[] bArr, byte[] bArr2) {
        this.f23356d = j;
        this.f23355c = gyuVar;
        this.f23357e = npkVar;
    }

    @Override // p000.frs
    /* JADX INFO: renamed from: c */
    public final mzj mo8722c() {
        return mzj.m17175e(Long.valueOf(this.f23356d - 150000000), Long.valueOf(this.f23356d + 150000000));
    }

    @Override // p000.frs
    /* JADX INFO: renamed from: e */
    public final boolean mo8724e() {
        return false;
    }
}
