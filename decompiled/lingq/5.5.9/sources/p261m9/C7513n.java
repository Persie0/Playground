package p261m9;

import java.util.Arrays;
import p479xa.C10151t;

/* JADX INFO: renamed from: m9.n */
/* JADX INFO: loaded from: classes.dex */
public final class C7513n {
    /* JADX INFO: renamed from: a */
    public static C7515p.a m15013a(C10151t c10151t) {
        c10151t.m19125F(1);
        int iM19147v = c10151t.m19147v();
        long j10 = ((long) c10151t.f51439b) + ((long) iM19147v);
        int i10 = iM19147v / 18;
        long[] jArrCopyOf = new long[i10];
        long[] jArrCopyOf2 = new long[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            long jM19138m = c10151t.m19138m();
            if (jM19138m == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i11);
                break;
            }
            jArrCopyOf[i11] = jM19138m;
            jArrCopyOf2[i11] = c10151t.m19138m();
            c10151t.m19125F(2);
        }
        c10151t.m19125F((int) (j10 - ((long) c10151t.f51439b)));
        return new C7515p.a(jArrCopyOf, jArrCopyOf2);
    }
}
