package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kdr {

    /* JADX INFO: renamed from: a */
    private final kpj f35667a;

    /* JADX INFO: renamed from: b */
    private final kbo f35668b;

    public kdr(kpj kpjVar, kbo kboVar) {
        this.f35667a = kpjVar;
        this.f35668b = kboVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m14003a(int i) {
        int i2;
        if (i == 0) {
            throw null;
        }
        switch (i - 1) {
            case 0:
                i2 = 0;
                break;
            case 1:
                i2 = 1;
                break;
            default:
                i2 = 3;
                break;
        }
        try {
            if (this.f35667a.mo14491a() != i2) {
                this.f35667a.mo14497g(i2);
            }
        } catch (kec e) {
            this.f35668b.mo13947i("Failed to set audio restriction for camera ".concat(String.valueOf(this.f35667a.mo14492b())));
        }
    }
}
