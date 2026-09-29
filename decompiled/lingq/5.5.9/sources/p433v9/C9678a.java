package p433v9;

import java.io.EOFException;
import java.io.IOException;
import p261m9.C7504e;
import p261m9.C7521v;
import p261m9.InterfaceC7520u;
import p479xa.C10129a;
import p479xa.C10134c0;

/* JADX INFO: renamed from: v9.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9678a implements InterfaceC9683f {

    /* JADX INFO: renamed from: a */
    public final C9682e f49542a;

    /* JADX INFO: renamed from: b */
    public final long f49543b;

    /* JADX INFO: renamed from: c */
    public final long f49544c;

    /* JADX INFO: renamed from: d */
    public final AbstractC9685h f49545d;

    /* JADX INFO: renamed from: e */
    public int f49546e;

    /* JADX INFO: renamed from: f */
    public long f49547f;

    /* JADX INFO: renamed from: g */
    public long f49548g;

    /* JADX INFO: renamed from: h */
    public long f49549h;

    /* JADX INFO: renamed from: i */
    public long f49550i;

    /* JADX INFO: renamed from: j */
    public long f49551j;

    /* JADX INFO: renamed from: k */
    public long f49552k;

    /* JADX INFO: renamed from: l */
    public long f49553l;

    /* JADX INFO: renamed from: v9.a$a */
    public final class a implements InterfaceC7520u {
        public a() {
        }

        @Override // p261m9.InterfaceC7520u
        /* JADX INFO: renamed from: b */
        public final boolean mo14982b() {
            return true;
        }

        @Override // p261m9.InterfaceC7520u
        /* JADX INFO: renamed from: h */
        public final InterfaceC7520u.a mo14983h(long j10) {
            C9678a c9678a = C9678a.this;
            long j11 = (((long) c9678a.f49545d.f49587i) * j10) / 1000000;
            long j12 = c9678a.f49543b;
            long j13 = c9678a.f49544c;
            C7521v c7521v = new C7521v(j10, C10134c0.m19042i(((((j13 - j12) * j11) / c9678a.f49547f) + j12) - 30000, j12, j13 - 1));
            return new InterfaceC7520u.a(c7521v, c7521v);
        }

        @Override // p261m9.InterfaceC7520u
        /* JADX INFO: renamed from: i */
        public final long mo14984i() {
            C9678a c9678a = C9678a.this;
            return (c9678a.f49547f * 1000000) / ((long) c9678a.f49545d.f49587i);
        }
    }

    public C9678a(AbstractC9685h abstractC9685h, long j10, long j11, long j12, long j13, boolean z10) {
        C10129a.m18990b(j10 >= 0 && j11 > j10);
        this.f49545d = abstractC9685h;
        this.f49543b = j10;
        this.f49544c = j11;
        if (j12 == j11 - j10 || z10) {
            this.f49547f = j13;
            this.f49546e = 4;
        } else {
            this.f49546e = 0;
        }
        this.f49542a = new C9682e();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0069  */
    @Override // p433v9.InterfaceC9683f
    /* JADX INFO: renamed from: a */
    public final long mo18185a(C7504e c7504e) throws IOException {
        boolean z10;
        long j10;
        long jM19042i;
        int i10 = this.f49546e;
        long j11 = this.f49544c;
        C9682e c9682e = this.f49542a;
        if (i10 == 0) {
            long j12 = c7504e.f41477d;
            this.f49548g = j12;
            this.f49546e = 1;
            long j13 = j11 - 65307;
            if (j13 > j12) {
                return j13;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long j14 = this.f49550i;
                long j15 = this.f49551j;
                if (j14 == j15) {
                    j10 = -1;
                    jM19042i = -1;
                } else {
                    long j16 = c7504e.f41477d;
                    if (c9682e.m18194b(c7504e, j15)) {
                        c9682e.m18193a(c7504e, false);
                        c7504e.f41479f = 0;
                        long j17 = this.f49549h;
                        long j18 = c9682e.f49570b;
                        long j19 = j17 - j18;
                        int i11 = c9682e.f49572d + c9682e.f49573e;
                        if (0 > j19 || j19 >= 72000) {
                            if (j19 < 0) {
                                this.f49551j = j16;
                                this.f49553l = j18;
                            } else {
                                this.f49550i = c7504e.f41477d + ((long) i11);
                                this.f49552k = j18;
                            }
                            long j20 = this.f49551j;
                            long j21 = this.f49550i;
                            if (j20 - j21 < 100000) {
                                this.f49551j = j21;
                                jM19042i = j21;
                            } else {
                                jM19042i = C10134c0.m19042i((((j20 - j21) * j19) / (this.f49553l - this.f49552k)) + (c7504e.f41477d - (((long) i11) * (j19 <= 0 ? 2L : 1L))), j21, j20 - 1);
                            }
                        } else {
                            j10 = -1;
                            jM19042i = -1;
                        }
                    } else {
                        long j22 = this.f49550i;
                        if (j22 == j16) {
                            throw new IOException("No ogg page can be found.");
                        }
                        jM19042i = j22;
                    }
                    j10 = -1;
                }
                if (jM19042i != j10) {
                    return jM19042i;
                }
                this.f49546e = 3;
            } else {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return -1L;
                    }
                    throw new IllegalStateException();
                }
                j10 = -1;
            }
            while (true) {
                c9682e.m18194b(c7504e, j10);
                c9682e.m18193a(c7504e, false);
                if (c9682e.f49570b > this.f49549h) {
                    c7504e.f41479f = 0;
                    this.f49546e = 4;
                    return -(this.f49552k + 2);
                }
                c7504e.mo14998j(c9682e.f49572d + c9682e.f49573e);
                this.f49550i = c7504e.f41477d;
                this.f49552k = c9682e.f49570b;
                j10 = -1;
            }
        }
        c9682e.f49569a = 0;
        c9682e.f49570b = 0L;
        c9682e.f49571c = 0;
        c9682e.f49572d = 0;
        c9682e.f49573e = 0;
        if (!c9682e.m18194b(c7504e, -1L)) {
            throw new EOFException();
        }
        c9682e.m18193a(c7504e, false);
        c7504e.mo14998j(c9682e.f49572d + c9682e.f49573e);
        long j23 = c9682e.f49570b;
        while ((c9682e.f49569a & 4) != 4 && c9682e.m18194b(c7504e, -1L) && c7504e.f41477d < j11 && c9682e.m18193a(c7504e, true)) {
            try {
                c7504e.mo14998j(c9682e.f49572d + c9682e.f49573e);
                z10 = true;
            } catch (EOFException unused) {
                z10 = false;
            }
            if (!z10) {
                break;
            }
            j23 = c9682e.f49570b;
        }
        this.f49547f = j23;
        this.f49546e = 4;
        return this.f49548g;
    }

    @Override // p433v9.InterfaceC9683f
    /* JADX INFO: renamed from: b */
    public final InterfaceC7520u mo18186b() {
        if (this.f49547f != 0) {
            return new a();
        }
        return null;
    }

    @Override // p433v9.InterfaceC9683f
    /* JADX INFO: renamed from: c */
    public final void mo18187c(long j10) {
        this.f49549h = C10134c0.m19042i(j10, 0L, this.f49547f - 1);
        this.f49546e = 2;
        this.f49550i = this.f49543b;
        this.f49551j = this.f49544c;
        this.f49552k = 0L;
        this.f49553l = this.f49547f;
    }
}
