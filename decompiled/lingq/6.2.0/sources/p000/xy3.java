package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class xy3 implements dy5 {

    /* JADX INFO: renamed from: a */
    public final byte[] f68956a;

    /* JADX INFO: renamed from: b */
    public final String f68957b;

    /* JADX INFO: renamed from: c */
    public final String f68958c;

    public xy3(String str, String str2, byte[] bArr) {
        this.f68956a = bArr;
        this.f68957b = str;
        this.f68958c = str2;
    }

    @Override // p000.dy5
    /* JADX INFO: renamed from: b */
    public final void mo4207b(su5 su5Var) {
        String str = this.f68957b;
        if (str != null) {
            su5Var.f61418a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xy3.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f68956a, ((xy3) obj).f68956a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f68956a);
    }

    public final String toString() {
        return wq1.m24123s(ux5.m23000w("ICY: title=\"", this.f68957b, "\", url=\"", this.f68958c, "\", rawMetadata.length=\""), this.f68956a.length, "\"");
    }
}
