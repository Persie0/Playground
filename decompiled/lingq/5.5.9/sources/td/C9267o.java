package td;

import com.google.android.play.core.assetpacks.C3113d;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: td.o */
/* JADX INFO: loaded from: classes.dex */
public final class C9267o extends AbstractC9266n {

    /* JADX INFO: renamed from: a */
    public final AbstractC9266n f47967a;

    /* JADX INFO: renamed from: b */
    public final long f47968b;

    /* JADX INFO: renamed from: c */
    public final long f47969c;

    public C9267o(C3113d c3113d, long j10, long j11) {
        this.f47967a = c3113d;
        long jM17629l = m17629l(j10);
        this.f47968b = jM17629l;
        this.f47969c = m17629l(jM17629l + j11);
    }

    @Override // td.AbstractC9266n
    /* JADX INFO: renamed from: a */
    public final long mo8979a() {
        return this.f47969c - this.f47968b;
    }

    @Override // td.AbstractC9266n
    /* JADX INFO: renamed from: b */
    public final InputStream mo8980b(long j10, long j11) throws IOException {
        long jM17629l = m17629l(this.f47968b);
        return this.f47967a.mo8980b(jM17629l, m17629l(j11 + jM17629l) - jM17629l);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    /* JADX INFO: renamed from: l */
    public final long m17629l(long j10) {
        if (j10 < 0) {
            return 0L;
        }
        AbstractC9266n abstractC9266n = this.f47967a;
        return j10 > abstractC9266n.mo8979a() ? abstractC9266n.mo8979a() : j10;
    }
}
