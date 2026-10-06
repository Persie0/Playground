package p000;

import java.util.Arrays;
import p021j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lax {

    /* JADX INFO: renamed from: a */
    private final int f37861a;

    /* JADX INFO: renamed from: b */
    private final int[] f37862b;

    /* JADX INFO: renamed from: c */
    private final int[] f37863c = new int[2];

    /* JADX INFO: renamed from: d */
    private final lay f37864d;

    /* JADX INFO: renamed from: e */
    private final boolean f37865e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lax)) {
            return false;
        }
        lax laxVar = (lax) obj;
        return this.f37861a == laxVar.f37861a && this.f37865e == laxVar.f37865e && Arrays.equals(this.f37862b, laxVar.f37862b) && Arrays.equals(this.f37863c, laxVar.f37863c) && Objects.equals(this.f37864d, laxVar.f37864d);
    }

    public final int hashCode() {
        return (((((((this.f37861a * 31) + Arrays.hashCode(this.f37862b)) * 31) + Arrays.hashCode(this.f37863c)) * 31) + this.f37864d.hashCode()) * 31) + (this.f37865e ? 1 : 0);
    }

    public final String toString() {
        return "Channel[Norm8]";
    }

    public lax(lay layVar, int i, int[] iArr) {
        this.f37861a = i;
        this.f37862b = iArr;
        this.f37864d = layVar;
        boolean z = false;
        if ((i & 7) == 0) {
            for (int i2 = 0; i2 < 2; i2++) {
                if (iArr[i2] % 8 == 0) {
                }
            }
            z = true;
        }
        this.f37865e = z;
        Arrays.fill(this.f37863c, 1);
    }
}
