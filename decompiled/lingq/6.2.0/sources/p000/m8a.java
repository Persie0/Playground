package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class m8a {

    /* JADX INFO: renamed from: a */
    public final int f50764a;

    /* JADX INFO: renamed from: b */
    public final byte[] f50765b;

    /* JADX INFO: renamed from: c */
    public final int f50766c;

    /* JADX INFO: renamed from: d */
    public final int f50767d;

    public m8a(int i, byte[] bArr, int i2, int i3) {
        this.f50764a = i;
        this.f50765b = bArr;
        this.f50766c = i2;
        this.f50767d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m8a.class != obj.getClass()) {
            return false;
        }
        m8a m8aVar = (m8a) obj;
        return this.f50764a == m8aVar.f50764a && this.f50766c == m8aVar.f50766c && this.f50767d == m8aVar.f50767d && Arrays.equals(this.f50765b, m8aVar.f50765b);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f50765b) + (this.f50764a * 31)) * 31) + this.f50766c) * 31) + this.f50767d;
    }
}
