package p478x9;

import com.google.android.exoplayer2.ParserException;
import java.io.IOException;
import p261m9.C7504e;
import p479xa.C10145n;
import p479xa.C10151t;

/* JADX INFO: renamed from: x9.c */
/* JADX INFO: loaded from: classes.dex */
public final class C10127c {

    /* JADX INFO: renamed from: x9.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f51342a;

        /* JADX INFO: renamed from: b */
        public final long f51343b;

        public a(int i10, long j10) {
            this.f51342a = i10;
            this.f51343b = j10;
        }

        /* JADX INFO: renamed from: a */
        public static a m18987a(C7504e c7504e, C10151t c10151t) throws IOException {
            c7504e.mo14994c(c10151t.f51438a, 0, 8, false);
            c10151t.m19124E(0);
            return new a(c10151t.m19129d(), c10151t.m19135j());
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m18985a(C7504e c7504e) throws IOException {
        C10151t c10151t = new C10151t(8);
        int i10 = a.m18987a(c7504e, c10151t).f51342a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        c7504e.mo14994c(c10151t.f51438a, 0, 4, false);
        c10151t.m19124E(0);
        int iM19129d = c10151t.m19129d();
        if (iM19129d == 1463899717) {
            return true;
        }
        C10145n.m19095c("WavHeaderReader", "Unsupported form type: " + iM19129d);
        return false;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static a m18986b(int i10, C7504e c7504e, C10151t c10151t) throws IOException {
        a aVarM18987a = a.m18987a(c7504e, c10151t);
        while (aVarM18987a.f51342a != i10) {
            StringBuilder sb2 = new StringBuilder("Ignoring unknown WAV chunk: ");
            int i11 = aVarM18987a.f51342a;
            sb2.append(i11);
            C10145n.m19099g("WavHeaderReader", sb2.toString());
            long j10 = aVarM18987a.f51343b + 8;
            if (j10 > 2147483647L) {
                throw ParserException.m6772c("Chunk is too large (~2GB+) to skip; id: " + i11);
            }
            c7504e.mo14998j((int) j10);
            aVarM18987a = a.m18987a(c7504e, c10151t);
        }
        return aVarM18987a;
    }
}
