package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ovs extends owd {

    /* JADX INFO: renamed from: a */
    public long f46683a = -1;

    /* JADX INFO: renamed from: b */
    public ols f46684b;

    @Override // p000.owd
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo19107a(Object obj) {
        ovq ovqVar = (ovq) obj;
        if (this.f46683a >= 0) {
            return false;
        }
        long j = ovqVar.f46676b;
        if (j < ovqVar.f46677c) {
            ovqVar.f46677c = j;
        }
        this.f46683a = j;
        return true;
    }

    @Override // p000.owd
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ ols[] mo19108b(Object obj) {
        boolean z = oqu.f46432a;
        long j = this.f46683a;
        this.f46683a = -1L;
        this.f46684b = null;
        return ((ovq) obj).m19102g(j);
    }
}
