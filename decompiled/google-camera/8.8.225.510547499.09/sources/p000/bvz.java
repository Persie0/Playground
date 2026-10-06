package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bvz implements bvl {

    /* JADX INFO: renamed from: a */
    public static final bqq f4570a = bqq.m2926c("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* JADX INFO: renamed from: b */
    private final bko f4571b;

    public bvz() {
        this(null, null, null, null);
    }

    public bvz(bko bkoVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f4571b = bkoVar;
    }

    @Override // p000.bvl
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo3083a(Object obj) {
        return true;
    }

    @Override // p000.bvl
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ C1058va mo3084b(Object obj, int i, int i2, bqr bqrVar) {
        bvc bvcVar = (bvc) obj;
        bko bkoVar = this.f4571b;
        bvk bvkVarM3096b = bvk.m3096b(bvcVar);
        Object objM3372f = ((cbe) bkoVar.f3652a).m3372f(bvkVarM3096b);
        bvkVarM3096b.m3097a();
        bvc bvcVar2 = (bvc) objM3372f;
        if (bvcVar2 == null) {
            bko bkoVar2 = this.f4571b;
            ((cbe) bkoVar2.f3652a).m3373g(bvk.m3096b(bvcVar), bvcVar);
        } else {
            bvcVar = bvcVar2;
        }
        return new C1058va(bvcVar, new brj(bvcVar, ((Integer) bqrVar.m2927b(f4570a)).intValue()));
    }
}
