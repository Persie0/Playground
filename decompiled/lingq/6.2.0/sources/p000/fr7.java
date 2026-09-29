package p000;

import androidx.glance.appwidget.protobuf.AbstractC0667a;
import androidx.glance.appwidget.protobuf.ProtoSyntax;

/* JADX INFO: loaded from: classes2.dex */
public final class fr7 {

    /* JADX INFO: renamed from: a */
    public final AbstractC0667a f39529a;

    /* JADX INFO: renamed from: b */
    public final String f39530b;

    /* JADX INFO: renamed from: c */
    public final Object[] f39531c;

    /* JADX INFO: renamed from: d */
    public final int f39532d;

    public fr7(AbstractC0667a abstractC0667a, String str, Object[] objArr) {
        this.f39529a = abstractC0667a;
        this.f39530b = str;
        this.f39531c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f39532d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f39532d = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final ProtoSyntax m12030a() {
        int i = this.f39532d;
        if ((i & 1) != 0) {
            return ProtoSyntax.PROTO2;
        }
        return (i & 4) == 4 ? ProtoSyntax.EDITIONS : ProtoSyntax.PROTO3;
    }
}
