package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class awc {

    /* JADX INFO: renamed from: a */
    public final gfc f7631a;

    /* JADX INFO: renamed from: b */
    public final String f7632b;

    /* JADX INFO: renamed from: c */
    public final Object[] f7633c;

    /* JADX INFO: renamed from: d */
    public final int f7634d;

    public awc(gfc gfcVar, String str, Object[] objArr) {
        this.f7631a = gfcVar;
        this.f7632b = str;
        this.f7633c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f7634d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f7634d = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }
}
