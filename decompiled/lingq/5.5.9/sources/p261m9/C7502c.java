package p261m9;

import java.util.Arrays;
import p479xa.C10134c0;

/* JADX INFO: renamed from: m9.c */
/* JADX INFO: loaded from: classes.dex */
public final class C7502c implements InterfaceC7520u {

    /* JADX INFO: renamed from: a */
    public final int f41461a;

    /* JADX INFO: renamed from: b */
    public final int[] f41462b;

    /* JADX INFO: renamed from: c */
    public final long[] f41463c;

    /* JADX INFO: renamed from: d */
    public final long[] f41464d;

    /* JADX INFO: renamed from: e */
    public final long[] f41465e;

    /* JADX INFO: renamed from: f */
    public final long f41466f;

    public C7502c(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f41462b = iArr;
        this.f41463c = jArr;
        this.f41464d = jArr2;
        this.f41465e = jArr3;
        int length = iArr.length;
        this.f41461a = length;
        if (length > 0) {
            this.f41466f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f41466f = 0L;
        }
    }

    @Override // p261m9.InterfaceC7520u
    /* JADX INFO: renamed from: b */
    public final boolean mo14982b() {
        return true;
    }

    @Override // p261m9.InterfaceC7520u
    /* JADX INFO: renamed from: h */
    public final InterfaceC7520u.a mo14983h(long j10) {
        long[] jArr = this.f41465e;
        int iM19039f = C10134c0.m19039f(jArr, j10, true);
        long j11 = jArr[iM19039f];
        long[] jArr2 = this.f41463c;
        C7521v c7521v = new C7521v(j11, jArr2[iM19039f]);
        if (j11 >= j10 || iM19039f == this.f41461a - 1) {
            return new InterfaceC7520u.a(c7521v, c7521v);
        }
        int i10 = iM19039f + 1;
        return new InterfaceC7520u.a(c7521v, new C7521v(jArr[i10], jArr2[i10]));
    }

    @Override // p261m9.InterfaceC7520u
    /* JADX INFO: renamed from: i */
    public final long mo14984i() {
        return this.f41466f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f41461a + ", sizes=" + Arrays.toString(this.f41462b) + ", offsets=" + Arrays.toString(this.f41463c) + ", timeUs=" + Arrays.toString(this.f41465e) + ", durationsUs=" + Arrays.toString(this.f41464d) + ")";
    }
}
