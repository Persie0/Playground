package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ejb {

    /* JADX INFO: renamed from: a */
    public final bhb f37367a;

    /* JADX INFO: renamed from: b */
    public final String f37368b;

    /* JADX INFO: renamed from: c */
    public final Object[] f37369c;

    /* JADX INFO: renamed from: d */
    public final int f37370d;

    public ejb(bhb bhbVar, String str, Object[] objArr) {
        this.f37367a = bhbVar;
        this.f37368b = str;
        this.f37369c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f37370d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 55296) {
                this.f37370d = i | (cCharAt2 << i3);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m11198a() {
        int i = this.f37370d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
