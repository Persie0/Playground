package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nzh implements nyt {

    /* JADX INFO: renamed from: a */
    public final nyw f45066a;

    /* JADX INFO: renamed from: b */
    public final String f45067b;

    /* JADX INFO: renamed from: c */
    public final Object[] f45068c;

    /* JADX INFO: renamed from: d */
    private final int f45069d;

    public nzh(nyw nywVar, String str, Object[] objArr) {
        this.f45066a = nywVar;
        this.f45067b = str;
        this.f45068c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f45069d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 55296) {
                this.f45069d = i | (cCharAt2 << i3);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            }
        }
    }

    @Override // p000.nyt
    /* JADX INFO: renamed from: a */
    public final nyw mo18194a() {
        return this.f45066a;
    }

    @Override // p000.nyt
    /* JADX INFO: renamed from: b */
    public final boolean mo18195b() {
        return (this.f45069d & 2) == 2;
    }

    @Override // p000.nyt
    /* JADX INFO: renamed from: c */
    public final int mo18196c() {
        return (this.f45069d & 1) == 1 ? 1 : 2;
    }
}
