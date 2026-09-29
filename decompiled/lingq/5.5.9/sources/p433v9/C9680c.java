package p433v9;

import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.ParserException;
import java.io.IOException;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p261m9.C7504e;
import p261m9.C7519t;
import p261m9.C7525z;
import p261m9.InterfaceC7507h;
import p261m9.InterfaceC7508i;
import p261m9.InterfaceC7509j;
import p261m9.InterfaceC7520u;
import p261m9.InterfaceC7522w;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10151t;

/* JADX INFO: renamed from: v9.c */
/* JADX INFO: loaded from: classes.dex */
public final class C9680c implements InterfaceC7507h {

    /* JADX INFO: renamed from: a */
    public InterfaceC7509j f49561a;

    /* JADX INFO: renamed from: b */
    public AbstractC9685h f49562b;

    /* JADX INFO: renamed from: c */
    public boolean f49563c;

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    /* JADX INFO: renamed from: a */
    public final boolean m18191a(C7504e c7504e) throws IOException {
        boolean zM15033c;
        C9682e c9682e = new C9682e();
        if (c9682e.m18193a(c7504e, true) && (c9682e.f49569a & 2) == 2) {
            int iMin = Math.min(c9682e.f49573e, 8);
            C10151t c10151t = new C10151t(iMin);
            c7504e.mo14994c(c10151t.f51438a, 0, iMin, false);
            c10151t.m19124E(0);
            if (c10151t.f51440c - c10151t.f51439b >= 5 && c10151t.m19145t() == 127 && c10151t.m19146u() == 1179402563) {
                this.f49562b = new C9679b();
            } else {
                c10151t.m19124E(0);
                try {
                    zM15033c = C7525z.m15033c(1, c10151t, true);
                } catch (ParserException unused) {
                    zM15033c = false;
                }
                if (zM15033c) {
                    this.f49562b = new C9686i();
                } else {
                    c10151t.m19124E(0);
                    if (C9684g.m18195e(c10151t, C9684g.f49576o)) {
                        this.f49562b = new C9684g();
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x017f  */
    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: d */
    public final int mo12865d(InterfaceC7508i interfaceC7508i, C7519t c7519t) throws IOException {
        C7504e c7504e;
        C10151t c10151t;
        boolean z10;
        byte[] bArr;
        C10129a.m18993e(this.f49561a);
        if (this.f49562b == null) {
            C7504e c7504e2 = (C7504e) interfaceC7508i;
            if (!m18191a(c7504e2)) {
                throw ParserException.m6770a("Failed to determine bitstream type", null);
            }
            c7504e2.f41479f = 0;
        }
        if (!this.f49563c) {
            InterfaceC7522w interfaceC7522wMo7366q = this.f49561a.mo7366q(0, 1);
            this.f49561a.mo7365i();
            AbstractC9685h abstractC9685h = this.f49562b;
            abstractC9685h.f49581c = this.f49561a;
            abstractC9685h.f49580b = interfaceC7522wMo7366q;
            abstractC9685h.mo18190d(true);
            this.f49563c = true;
        }
        AbstractC9685h abstractC9685h2 = this.f49562b;
        C10129a.m18993e(abstractC9685h2.f49580b);
        int i10 = C10134c0.f51354a;
        int i11 = abstractC9685h2.f49586h;
        C9681d c9681d = abstractC9685h2.f49579a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    C7504e c7504e3 = (C7504e) interfaceC7508i;
                    long jMo18185a = abstractC9685h2.f49582d.mo18185a(c7504e3);
                    if (jMo18185a >= 0) {
                        c7519t.f41516a = jMo18185a;
                        return 1;
                    }
                    if (jMo18185a < -1) {
                        abstractC9685h2.mo18196a(-(jMo18185a + 2));
                    }
                    if (!abstractC9685h2.f49590l) {
                        InterfaceC7520u interfaceC7520uMo18186b = abstractC9685h2.f49582d.mo18186b();
                        C10129a.m18993e(interfaceC7520uMo18186b);
                        abstractC9685h2.f49581c.mo7364c(interfaceC7520uMo18186b);
                        abstractC9685h2.f49590l = true;
                    }
                    if (abstractC9685h2.f49589k > 0 || c9681d.m18192a(c7504e3)) {
                        abstractC9685h2.f49589k = 0L;
                        C10151t c10151t2 = c9681d.f49565b;
                        long jMo18188b = abstractC9685h2.mo18188b(c10151t2);
                        if (jMo18188b >= 0) {
                            long j10 = abstractC9685h2.f49585g;
                            if (j10 + jMo18188b >= abstractC9685h2.f49583e) {
                                long j11 = (j10 * 1000000) / ((long) abstractC9685h2.f49587i);
                                abstractC9685h2.f49580b.m15021c(c10151t2.f51440c, c10151t2);
                                abstractC9685h2.f49580b.mo7387e(j11, 1, c10151t2.f51440c, 0, null);
                                abstractC9685h2.f49583e = -1L;
                            }
                        }
                        abstractC9685h2.f49585g += jMo18188b;
                    } else {
                        abstractC9685h2.f49586h = 3;
                    }
                } else if (i11 != 3) {
                    throw new IllegalStateException();
                }
                return -1;
            }
            ((C7504e) interfaceC7508i).mo14998j((int) abstractC9685h2.f49584f);
            abstractC9685h2.f49586h = 2;
            return 0;
        }
        while (true) {
            c7504e = (C7504e) interfaceC7508i;
            boolean zM18192a = c9681d.m18192a(c7504e);
            c10151t = c9681d.f49565b;
            if (!zM18192a) {
                abstractC9685h2.f49586h = 3;
                z10 = false;
                break;
            }
            long j12 = c7504e.f41477d;
            long j13 = abstractC9685h2.f49584f;
            abstractC9685h2.f49589k = j12 - j13;
            if (!abstractC9685h2.mo18189c(c10151t, j13, abstractC9685h2.f49588j)) {
                z10 = true;
                break;
            }
            abstractC9685h2.f49584f = c7504e.f41477d;
        }
        if (z10) {
            C2416m c2416m = abstractC9685h2.f49588j.f49592a;
            abstractC9685h2.f49587i = c2416m.f12464U;
            if (!abstractC9685h2.f49591m) {
                abstractC9685h2.f49580b.mo7388f(c2416m);
                abstractC9685h2.f49591m = true;
            }
            C9679b.a aVar = abstractC9685h2.f49588j.f49593b;
            if (aVar == null) {
                long j14 = c7504e.f41476c;
                if (j14 == -1) {
                    abstractC9685h2.f49582d = new AbstractC9685h.b();
                } else {
                    C9682e c9682e = c9681d.f49564a;
                    abstractC9685h2.f49582d = new C9678a(abstractC9685h2, abstractC9685h2.f49584f, j14, c9682e.f49572d + c9682e.f49573e, c9682e.f49570b, (c9682e.f49569a & 4) != 0);
                }
                abstractC9685h2.f49586h = 2;
                bArr = c10151t.f51438a;
                if (bArr.length != 65025) {
                    c10151t.m19122C(Arrays.copyOf(bArr, Math.max(65025, c10151t.f51440c)), c10151t.f51440c);
                }
                return 0;
            }
            abstractC9685h2.f49582d = aVar;
            abstractC9685h2.f49586h = 2;
            bArr = c10151t.f51438a;
            if (bArr.length != 65025) {
                c10151t.m19122C(Arrays.copyOf(bArr, Math.max(65025, c10151t.f51440c)), c10151t.f51440c);
            }
            return 0;
        }
        return -1;
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: e */
    public final void mo12866e(long j10, long j11) {
        AbstractC9685h abstractC9685h = this.f49562b;
        if (abstractC9685h != null) {
            C9681d c9681d = abstractC9685h.f49579a;
            C9682e c9682e = c9681d.f49564a;
            c9682e.f49569a = 0;
            c9682e.f49570b = 0L;
            c9682e.f49571c = 0;
            c9682e.f49572d = 0;
            c9682e.f49573e = 0;
            c9681d.f49565b.m19121B(0);
            c9681d.f49566c = -1;
            c9681d.f49568e = false;
            if (j10 == 0) {
                abstractC9685h.mo18190d(!abstractC9685h.f49590l);
            } else if (abstractC9685h.f49586h != 0) {
                long j12 = (((long) abstractC9685h.f49587i) * j11) / 1000000;
                abstractC9685h.f49583e = j12;
                InterfaceC9683f interfaceC9683f = abstractC9685h.f49582d;
                int i10 = C10134c0.f51354a;
                interfaceC9683f.mo18187c(j12);
                abstractC9685h.f49586h = 2;
            }
        }
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: f */
    public final void mo12867f(InterfaceC7509j interfaceC7509j) {
        this.f49561a = interfaceC7509j;
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: g */
    public final boolean mo12868g(InterfaceC7508i interfaceC7508i) throws IOException {
        try {
            return m18191a((C7504e) interfaceC7508i);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // p261m9.InterfaceC7507h
    public final void release() {
    }
}
