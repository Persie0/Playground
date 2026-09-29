package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class mj5 implements rj5 {

    /* JADX INFO: renamed from: a */
    public final String f51397a;

    /* JADX INFO: renamed from: b */
    public int f51398b;

    public mj5(String str) {
        this.f51397a = str;
        this.f51398b = 0;
    }

    /* JADX INFO: renamed from: a */
    public int m16857a() {
        int i = this.f51398b;
        this.f51398b = i + 1;
        String str = this.f51397a;
        char cCharAt = str.charAt(i);
        if (cCharAt < 55296) {
            return cCharAt;
        }
        int i2 = cCharAt & 8191;
        int i3 = 13;
        while (true) {
            int i4 = this.f51398b;
            this.f51398b = i4 + 1;
            char cCharAt2 = str.charAt(i4);
            if (cCharAt2 < 55296) {
                return (cCharAt2 << i3) | i2;
            }
            i2 |= (cCharAt2 & 8191) << i3;
            i3 += 13;
        }
    }

    public mj5(int i, String str) {
        this.f51398b = i;
        this.f51397a = str;
    }
}
