package p000;

import com.google.android.gms.internal.play_billing.AbstractC0997h;

/* JADX INFO: loaded from: classes.dex */
public final class fgc {

    /* JADX INFO: renamed from: a */
    public final AbstractC0997h f39092a;

    /* JADX INFO: renamed from: b */
    public final String f39093b;

    /* JADX INFO: renamed from: c */
    public final Object[] f39094c;

    /* JADX INFO: renamed from: d */
    public final int f39095d;

    public fgc(AbstractC0997h abstractC0997h, String str, Object[] objArr) {
        this.f39092a = abstractC0997h;
        this.f39093b = str;
        this.f39094c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f39095d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 55296) {
                this.f39095d = i | (cCharAt2 << i3);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m11830a() {
        int i = this.f39095d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
