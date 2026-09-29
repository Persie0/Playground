package p433v9;

import com.google.android.exoplayer2.C2416m;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p261m9.C7504e;
import p261m9.InterfaceC7509j;
import p261m9.InterfaceC7520u;
import p261m9.InterfaceC7522w;
import p479xa.C10151t;

/* JADX INFO: renamed from: v9.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9685h {

    /* JADX INFO: renamed from: b */
    public InterfaceC7522w f49580b;

    /* JADX INFO: renamed from: c */
    public InterfaceC7509j f49581c;

    /* JADX INFO: renamed from: d */
    public InterfaceC9683f f49582d;

    /* JADX INFO: renamed from: e */
    public long f49583e;

    /* JADX INFO: renamed from: f */
    public long f49584f;

    /* JADX INFO: renamed from: g */
    public long f49585g;

    /* JADX INFO: renamed from: h */
    public int f49586h;

    /* JADX INFO: renamed from: i */
    public int f49587i;

    /* JADX INFO: renamed from: k */
    public long f49589k;

    /* JADX INFO: renamed from: l */
    public boolean f49590l;

    /* JADX INFO: renamed from: m */
    public boolean f49591m;

    /* JADX INFO: renamed from: a */
    public final C9681d f49579a = new C9681d();

    /* JADX INFO: renamed from: j */
    public a f49588j = new a();

    /* JADX INFO: renamed from: v9.h$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public C2416m f49592a;

        /* JADX INFO: renamed from: b */
        public C9679b.a f49593b;
    }

    /* JADX INFO: renamed from: v9.h$b */
    public static final class b implements InterfaceC9683f {
        @Override // p433v9.InterfaceC9683f
        /* JADX INFO: renamed from: a */
        public final long mo18185a(C7504e c7504e) {
            return -1L;
        }

        @Override // p433v9.InterfaceC9683f
        /* JADX INFO: renamed from: b */
        public final InterfaceC7520u mo18186b() {
            return new InterfaceC7520u.b(-9223372036854775807L);
        }

        @Override // p433v9.InterfaceC9683f
        /* JADX INFO: renamed from: c */
        public final void mo18187c(long j10) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo18196a(long j10) {
        this.f49585g = j10;
    }

    /* JADX INFO: renamed from: b */
    public abstract long mo18188b(C10151t c10151t);

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: c */
    public abstract boolean mo18189c(C10151t c10151t, long j10, a aVar) throws IOException;

    /* JADX INFO: renamed from: d */
    public void mo18190d(boolean z10) {
        if (z10) {
            this.f49588j = new a();
            this.f49584f = 0L;
            this.f49586h = 0;
        } else {
            this.f49586h = 1;
        }
        this.f49583e = -1L;
        this.f49585g = 0L;
    }
}
