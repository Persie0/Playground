package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC1126a;

/* JADX INFO: loaded from: classes.dex */
public final class dr7 {

    /* JADX INFO: renamed from: a */
    public final AbstractC1126a f36111a;

    /* JADX INFO: renamed from: b */
    public final String f36112b;

    /* JADX INFO: renamed from: c */
    public final Object[] f36113c;

    /* JADX INFO: renamed from: d */
    public final int f36114d;

    public dr7(AbstractC1126a abstractC1126a, String str, Object[] objArr) {
        this.f36111a = abstractC1126a;
        this.f36112b = str;
        this.f36113c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f36114d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f36114d = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }
}
