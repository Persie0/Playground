package p433v9;

import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p261m9.C7504e;
import p261m9.C7512m;
import p261m9.C7513n;
import p261m9.C7514o;
import p261m9.C7515p;
import p261m9.InterfaceC7520u;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10151t;

/* JADX INFO: renamed from: v9.b */
/* JADX INFO: loaded from: classes.dex */
public final class C9679b extends AbstractC9685h {

    /* JADX INFO: renamed from: n */
    public C7515p f49555n;

    /* JADX INFO: renamed from: o */
    public a f49556o;

    /* JADX INFO: renamed from: v9.b$a */
    public static final class a implements InterfaceC9683f {

        /* JADX INFO: renamed from: a */
        public final C7515p f49557a;

        /* JADX INFO: renamed from: b */
        public final C7515p.a f49558b;

        /* JADX INFO: renamed from: c */
        public long f49559c = -1;

        /* JADX INFO: renamed from: d */
        public long f49560d = -1;

        public a(C7515p c7515p, C7515p.a aVar) {
            this.f49557a = c7515p;
            this.f49558b = aVar;
        }

        @Override // p433v9.InterfaceC9683f
        /* JADX INFO: renamed from: a */
        public final long mo18185a(C7504e c7504e) {
            long j10 = this.f49560d;
            if (j10 < 0) {
                return -1L;
            }
            long j11 = -(j10 + 2);
            this.f49560d = -1L;
            return j11;
        }

        @Override // p433v9.InterfaceC9683f
        /* JADX INFO: renamed from: b */
        public final InterfaceC7520u mo18186b() {
            C10129a.m18992d(this.f49559c != -1);
            return new C7514o(this.f49557a, this.f49559c);
        }

        @Override // p433v9.InterfaceC9683f
        /* JADX INFO: renamed from: c */
        public final void mo18187c(long j10) {
            long[] jArr = this.f49558b.f41506a;
            this.f49560d = jArr[C10134c0.m19039f(jArr, j10, true)];
        }
    }

    @Override // p433v9.AbstractC9685h
    /* JADX INFO: renamed from: b */
    public final long mo18188b(C10151t c10151t) {
        byte[] bArr = c10151t.f51438a;
        if (!(bArr[0] == -1)) {
            return -1L;
        }
        int i10 = (bArr[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            c10151t.m19125F(4);
            c10151t.m19151z();
        }
        int iM15012b = C7512m.m15012b(i10, c10151t);
        c10151t.m19124E(0);
        return iM15012b;
    }

    @Override // p433v9.AbstractC9685h
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: c */
    public final boolean mo18189c(C10151t c10151t, long j10, AbstractC9685h.a aVar) {
        byte[] bArr = c10151t.f51438a;
        C7515p c7515p = this.f49555n;
        if (c7515p == null) {
            C7515p c7515p2 = new C7515p(bArr, 17);
            this.f49555n = c7515p2;
            aVar.f49592a = c7515p2.m15017c(Arrays.copyOfRange(bArr, 9, c10151t.f51440c), null);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & 127) == 3) {
            C7515p.a aVarM15013a = C7513n.m15013a(c10151t);
            C7515p c7515p3 = new C7515p(c7515p.f41494a, c7515p.f41495b, c7515p.f41496c, c7515p.f41497d, c7515p.f41498e, c7515p.f41500g, c7515p.f41501h, c7515p.f41503j, aVarM15013a, c7515p.f41505l);
            this.f49555n = c7515p3;
            this.f49556o = new a(c7515p3, aVarM15013a);
            return true;
        }
        if (!(b10 == -1)) {
            return true;
        }
        a aVar2 = this.f49556o;
        if (aVar2 != null) {
            aVar2.f49559c = j10;
            aVar.f49593b = aVar2;
        }
        aVar.f49592a.getClass();
        return false;
    }

    @Override // p433v9.AbstractC9685h
    /* JADX INFO: renamed from: d */
    public final void mo18190d(boolean z10) {
        super.mo18190d(z10);
        if (z10) {
            this.f49555n = null;
            this.f49556o = null;
        }
    }
}
