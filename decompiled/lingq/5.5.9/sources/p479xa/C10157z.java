package p479xa;

import java.util.Arrays;

/* JADX INFO: renamed from: xa.z */
/* JADX INFO: loaded from: classes.dex */
public final class C10157z<V> {

    /* JADX INFO: renamed from: a */
    public long[] f51456a = new long[10];

    /* JADX INFO: renamed from: b */
    public V[] f51457b = (V[]) new Object[10];

    /* JADX INFO: renamed from: c */
    public int f51458c;

    /* JADX INFO: renamed from: d */
    public int f51459d;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final synchronized void m19165a(long j10, V v10) {
        int i10 = this.f51459d;
        if (i10 > 0) {
            if (j10 <= this.f51456a[((this.f51458c + i10) - 1) % this.f51457b.length]) {
                m19166b();
            }
        }
        m19167c();
        int i11 = this.f51458c;
        int i12 = this.f51459d;
        V[] vArr = this.f51457b;
        int length = (i11 + i12) % vArr.length;
        this.f51456a[length] = j10;
        vArr[length] = v10;
        this.f51459d = i12 + 1;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final synchronized void m19166b() {
        try {
            this.f51458c = 0;
            this.f51459d = 0;
            Arrays.fill(this.f51457b, (Object) null);
        } finally {
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m19167c() {
        int length = this.f51457b.length;
        if (this.f51459d < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        V[] vArr = (V[]) new Object[i10];
        int i11 = this.f51458c;
        int i12 = length - i11;
        System.arraycopy(this.f51456a, i11, jArr, 0, i12);
        System.arraycopy(this.f51457b, this.f51458c, vArr, 0, i12);
        int i13 = this.f51458c;
        if (i13 > 0) {
            System.arraycopy(this.f51456a, 0, jArr, i12, i13);
            System.arraycopy(this.f51457b, 0, vArr, i12, this.f51458c);
        }
        this.f51456a = jArr;
        this.f51457b = vArr;
        this.f51458c = 0;
    }

    /* JADX INFO: renamed from: d */
    public final Object m19168d(boolean z10, long j10) {
        V vM19169e = null;
        long j11 = Long.MAX_VALUE;
        while (this.f51459d > 0) {
            long j12 = j10 - this.f51456a[this.f51458c];
            if (j12 < 0) {
                if (z10) {
                    break;
                }
                if ((-j12) >= j11) {
                }
                return vM19169e;
            }
            vM19169e = m19169e();
            j11 = j12;
        }
        return vM19169e;
    }

    /* JADX INFO: renamed from: e */
    public final V m19169e() {
        C10129a.m18992d(this.f51459d > 0);
        V[] vArr = this.f51457b;
        int i10 = this.f51458c;
        V v10 = vArr[i10];
        vArr[i10] = null;
        this.f51458c = (i10 + 1) % vArr.length;
        this.f51459d--;
        return v10;
    }
}
