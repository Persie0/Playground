package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bvp implements bvl {

    /* JADX INFO: renamed from: a */
    public static final bvp f4548a = new bvp(2, null);

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f4549b;

    public bvp(int i) {
        this.f4549b = i;
    }

    @Deprecated
    public bvp(int i, byte[] bArr) {
        this.f4549b = i;
    }

    @Override // p000.bvl
    /* JADX INFO: renamed from: a */
    public final boolean mo3083a(Object obj) {
        switch (this.f4549b) {
            case 0:
                return false;
            case 1:
                return obj.toString().startsWith("data:image");
            default:
                return true;
        }
    }

    @Override // p000.bvl
    /* JADX INFO: renamed from: b */
    public final C1058va mo3084b(Object obj, int i, int i2, bqr bqrVar) {
        switch (this.f4549b) {
            case 0:
                return null;
            case 1:
                return new C1058va(new cat(obj), new bus(obj.toString()));
            default:
                return new C1058va(new cat(obj), new bvt(obj, 0));
        }
    }
}
