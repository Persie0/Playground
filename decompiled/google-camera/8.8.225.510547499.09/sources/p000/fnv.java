package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fnv implements kao {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f22808a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ eyb f22809b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ fya f22810c;

    public fnv(fya fyaVar, String str, eyb eybVar, byte[] bArr) {
        this.f22810c = fyaVar;
        this.f22808a = str;
        this.f22809b = eybVar;
    }

    @Override // p000.kao
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo3483a(Object obj) {
        synchronized (((foc) this.f22810c.f23857a).f22826E) {
            ((foc) this.f22810c.f23857a).f22826E.remove(this.f22808a);
        }
        this.f22809b.mo7367e(this);
    }
}
