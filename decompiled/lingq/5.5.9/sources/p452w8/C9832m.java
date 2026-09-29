package p452w8;

import java.util.Arrays;
import p395t8.C9220b;

/* JADX INFO: renamed from: w8.m */
/* JADX INFO: loaded from: classes.dex */
public final class C9832m {

    /* JADX INFO: renamed from: a */
    public final C9220b f50038a;

    /* JADX INFO: renamed from: b */
    public final byte[] f50039b;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C9832m(C9220b c9220b, byte[] bArr) {
        if (c9220b == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f50038a = c9220b;
        this.f50039b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9832m)) {
            return false;
        }
        C9832m c9832m = (C9832m) obj;
        if (this.f50038a.equals(c9832m.f50038a)) {
            return Arrays.equals(this.f50039b, c9832m.f50039b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f50038a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f50039b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f50038a + ", bytes=[...]}";
    }
}
