package p000;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
public final class e62 {

    /* JADX INFO: renamed from: a */
    public final byte[] f36747a = new byte[8];

    /* JADX INFO: renamed from: b */
    public final ArrayDeque f36748b = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    public final doa f36749c = new doa();

    /* JADX INFO: renamed from: d */
    public vqb f36750d;

    /* JADX INFO: renamed from: e */
    public int f36751e;

    /* JADX INFO: renamed from: f */
    public int f36752f;

    /* JADX INFO: renamed from: g */
    public long f36753g;

    /* JADX INFO: renamed from: a */
    public final long m10864a(iy2 iy2Var, int i) {
        byte[] bArr = this.f36747a;
        iy2Var.readFully(bArr, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        return j;
    }
}
