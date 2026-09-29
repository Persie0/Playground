package p433v9;

import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;
import java.io.IOException;
import p261m9.C7504e;
import p479xa.C10129a;
import p479xa.C10151t;

/* JADX INFO: renamed from: v9.e */
/* JADX INFO: loaded from: classes.dex */
public final class C9682e {

    /* JADX INFO: renamed from: a */
    public int f49569a;

    /* JADX INFO: renamed from: b */
    public long f49570b;

    /* JADX INFO: renamed from: c */
    public int f49571c;

    /* JADX INFO: renamed from: d */
    public int f49572d;

    /* JADX INFO: renamed from: e */
    public int f49573e;

    /* JADX INFO: renamed from: f */
    public final int[] f49574f = new int[255];

    /* JADX INFO: renamed from: g */
    public final C10151t f49575g = new C10151t(255);

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m18193a(C7504e c7504e, boolean z10) throws IOException {
        boolean zMo14994c;
        boolean zMo14994c2;
        this.f49569a = 0;
        this.f49570b = 0L;
        this.f49571c = 0;
        this.f49572d = 0;
        this.f49573e = 0;
        C10151t c10151t = this.f49575g;
        c10151t.m19121B(27);
        try {
            zMo14994c = c7504e.mo14994c(c10151t.f51438a, 0, 27, z10);
        } catch (EOFException e10) {
            if (!z10) {
                throw e10;
            }
            zMo14994c = false;
        }
        if (zMo14994c && c10151t.m19146u() == 1332176723) {
            if (c10151t.m19145t() != 0) {
                if (z10) {
                    return false;
                }
                throw ParserException.m6772c("unsupported bit stream revision");
            }
            this.f49569a = c10151t.m19145t();
            this.f49570b = c10151t.m19133h();
            c10151t.m19135j();
            c10151t.m19135j();
            c10151t.m19135j();
            int iM19145t = c10151t.m19145t();
            this.f49571c = iM19145t;
            this.f49572d = iM19145t + 27;
            c10151t.m19121B(iM19145t);
            try {
                zMo14994c2 = c7504e.mo14994c(c10151t.f51438a, 0, this.f49571c, z10);
            } catch (EOFException e11) {
                if (!z10) {
                    throw e11;
                }
                zMo14994c2 = false;
            }
            if (!zMo14994c2) {
                return false;
            }
            for (int i10 = 0; i10 < this.f49571c; i10++) {
                int iM19145t2 = c10151t.m19145t();
                this.f49574f[i10] = iM19145t2;
                this.f49573e += iM19145t2;
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m18194b(C7504e c7504e, long j10) throws IOException {
        boolean zMo14994c;
        C10129a.m18990b(c7504e.f41477d == c7504e.mo14995d());
        C10151t c10151t = this.f49575g;
        c10151t.m19121B(4);
        while (true) {
            if (j10 != -1 && c7504e.f41477d + 4 >= j10) {
                break;
            }
            try {
                zMo14994c = c7504e.mo14994c(c10151t.f51438a, 0, 4, true);
            } catch (EOFException unused) {
                zMo14994c = false;
            }
            if (!zMo14994c) {
                break;
            }
            c10151t.m19124E(0);
            if (c10151t.m19146u() == 1332176723) {
                c7504e.f41479f = 0;
                return true;
            }
            c7504e.mo14998j(1);
        }
        do {
            if (j10 != -1 && c7504e.f41477d >= j10) {
                break;
            }
        } while (c7504e.m15005r(1) != -1);
        return false;
    }
}
