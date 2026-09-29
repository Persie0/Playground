package p000;

import com.google.protobuf.AbstractC1180a;
import com.google.protobuf.ProtoSyntax;

/* JADX INFO: loaded from: classes.dex */
public final class er7 {

    /* JADX INFO: renamed from: a */
    public final AbstractC1180a f37754a;

    /* JADX INFO: renamed from: b */
    public final String f37755b;

    /* JADX INFO: renamed from: c */
    public final Object[] f37756c;

    /* JADX INFO: renamed from: d */
    public final int f37757d;

    public er7(AbstractC1180a abstractC1180a, String str, Object[] objArr) {
        this.f37754a = abstractC1180a;
        this.f37755b = str;
        this.f37756c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f37757d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f37757d = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final ProtoSyntax m11323a() {
        int i = this.f37757d;
        if ((i & 1) != 0) {
            return ProtoSyntax.PROTO2;
        }
        return (i & 4) == 4 ? ProtoSyntax.EDITIONS : ProtoSyntax.PROTO3;
    }
}
