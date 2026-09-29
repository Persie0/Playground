package p360r9;

import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;
import p261m9.C7504e;
import p261m9.C7519t;
import p261m9.InterfaceC7507h;
import p261m9.InterfaceC7508i;
import p261m9.InterfaceC7509j;
import p261m9.InterfaceC7520u;
import p261m9.InterfaceC7522w;
import p411u9.C9484g;
import p479xa.C10145n;
import p479xa.C10151t;

/* JADX INFO: renamed from: r9.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8748a implements InterfaceC7507h {

    /* JADX INFO: renamed from: b */
    public InterfaceC7509j f46383b;

    /* JADX INFO: renamed from: c */
    public int f46384c;

    /* JADX INFO: renamed from: d */
    public int f46385d;

    /* JADX INFO: renamed from: e */
    public int f46386e;

    /* JADX INFO: renamed from: g */
    public MotionPhotoMetadata f46388g;

    /* JADX INFO: renamed from: h */
    public InterfaceC7508i f46389h;

    /* JADX INFO: renamed from: i */
    public C8750c f46390i;

    /* JADX INFO: renamed from: j */
    public C9484g f46391j;

    /* JADX INFO: renamed from: a */
    public final C10151t f46382a = new C10151t(6);

    /* JADX INFO: renamed from: f */
    public long f46387f = -1;

    /* JADX INFO: renamed from: a */
    public final void m16985a() {
        m16986b(new Metadata.Entry[0]);
        InterfaceC7509j interfaceC7509j = this.f46383b;
        interfaceC7509j.getClass();
        interfaceC7509j.mo7365i();
        this.f46383b.mo7364c(new InterfaceC7520u.b(-9223372036854775807L));
        this.f46384c = 6;
    }

    /* JADX INFO: renamed from: b */
    public final void m16986b(Metadata.Entry... entryArr) {
        InterfaceC7509j interfaceC7509j = this.f46383b;
        interfaceC7509j.getClass();
        InterfaceC7522w interfaceC7522wMo7366q = interfaceC7509j.mo7366q(1024, 4);
        C2416m.a aVar = new C2416m.a();
        aVar.f12500j = "image/jpeg";
        aVar.f12499i = new Metadata(entryArr);
        interfaceC7522wMo7366q.mo7388f(new C2416m(aVar));
    }

    /* JADX INFO: renamed from: c */
    public final int m16987c(C7504e c7504e) throws IOException {
        C10151t c10151t = this.f46382a;
        c10151t.m19121B(2);
        c7504e.mo14994c(c10151t.f51438a, 0, 2, false);
        return c10151t.m19150y();
    }

    /* JADX WARN: Code duplicated, block: B:82:0x015d  */
    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: d */
    public final int mo12865d(InterfaceC7508i interfaceC7508i, C7519t c7519t) throws IOException {
        String strM19139n;
        C8749b c8749bM16988a;
        MotionPhotoMetadata motionPhotoMetadata;
        long j10;
        int i10 = this.f46384c;
        C10151t c10151t = this.f46382a;
        if (i10 == 0) {
            c10151t.m19121B(2);
            ((C7504e) interfaceC7508i).mo14993b(c10151t.f51438a, 0, 2, false);
            int iM19150y = c10151t.m19150y();
            this.f46385d = iM19150y;
            if (iM19150y == 65498) {
                if (this.f46387f != -1) {
                    this.f46384c = 4;
                } else {
                    m16985a();
                }
            } else if ((iM19150y < 65488 || iM19150y > 65497) && iM19150y != 65281) {
                this.f46384c = 1;
            }
            return 0;
        }
        if (i10 == 1) {
            c10151t.m19121B(2);
            ((C7504e) interfaceC7508i).mo14993b(c10151t.f51438a, 0, 2, false);
            this.f46386e = c10151t.m19150y() - 2;
            this.f46384c = 2;
            return 0;
        }
        if (i10 != 2) {
            if (i10 != 4) {
                if (i10 != 5) {
                    if (i10 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.f46390i == null || interfaceC7508i != this.f46389h) {
                    this.f46389h = interfaceC7508i;
                    this.f46390i = new C8750c((C7504e) interfaceC7508i, this.f46387f);
                }
                C9484g c9484g = this.f46391j;
                c9484g.getClass();
                int iMo12865d = c9484g.mo12865d(this.f46390i, c7519t);
                if (iMo12865d == 1) {
                    c7519t.f41516a += this.f46387f;
                }
                return iMo12865d;
            }
            C7504e c7504e = (C7504e) interfaceC7508i;
            long j11 = c7504e.f41477d;
            long j12 = this.f46387f;
            if (j11 != j12) {
                c7519t.f41516a = j12;
                return 1;
            }
            if (c7504e.mo14994c(c10151t.f51438a, 0, 1, true)) {
                c7504e.f41479f = 0;
                if (this.f46391j == null) {
                    this.f46391j = new C9484g();
                }
                C8750c c8750c = new C8750c(c7504e, this.f46387f);
                this.f46390i = c8750c;
                if (this.f46391j.mo12868g(c8750c)) {
                    C9484g c9484g2 = this.f46391j;
                    long j13 = this.f46387f;
                    InterfaceC7509j interfaceC7509j = this.f46383b;
                    interfaceC7509j.getClass();
                    c9484g2.f48706r = new C8751d(j13, interfaceC7509j);
                    MotionPhotoMetadata motionPhotoMetadata2 = this.f46388g;
                    motionPhotoMetadata2.getClass();
                    m16986b(motionPhotoMetadata2);
                    this.f46384c = 5;
                } else {
                    m16985a();
                }
            } else {
                m16985a();
            }
            return 0;
        }
        if (this.f46385d == 65505) {
            C10151t c10151t2 = new C10151t(this.f46386e);
            C7504e c7504e2 = (C7504e) interfaceC7508i;
            c7504e2.mo14993b(c10151t2.f51438a, 0, this.f46386e, false);
            if (this.f46388g == null && "http://ns.adobe.com/xap/1.0/".equals(c10151t2.m19139n()) && (strM19139n = c10151t2.m19139n()) != null) {
                long j14 = c7504e2.f41476c;
                if (j14 == -1) {
                    motionPhotoMetadata = null;
                } else {
                    try {
                        c8749bM16988a = C8752e.m16988a(strM19139n);
                    } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
                        C10145n.m19099g("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        c8749bM16988a = null;
                    }
                    if (c8749bM16988a == null) {
                        motionPhotoMetadata = null;
                    } else {
                        List<C8749b.a> list = c8749bM16988a.f46393b;
                        if (list.size() < 2) {
                            motionPhotoMetadata = null;
                        } else {
                            int size = list.size() - 1;
                            long j15 = -1;
                            long j16 = -1;
                            long j17 = -1;
                            long j18 = -1;
                            boolean z10 = false;
                            while (size >= 0) {
                                C8749b.a aVar = list.get(size);
                                boolean zEquals = "video/mp4".equals(aVar.f46394a) | z10;
                                if (size == 0) {
                                    j14 -= aVar.f46396c;
                                    j10 = 0;
                                } else {
                                    j10 = j14 - aVar.f46395b;
                                }
                                long j19 = j14;
                                j14 = j10;
                                if (zEquals && j14 != j19) {
                                    j18 = j19 - j14;
                                    j17 = j14;
                                    zEquals = false;
                                }
                                if (size == 0) {
                                    j15 = j14;
                                    j16 = j19;
                                }
                                size--;
                                z10 = zEquals;
                            }
                            if (j17 == -1 || j18 == -1 || j15 == -1 || j16 == -1) {
                                motionPhotoMetadata = null;
                            } else {
                                motionPhotoMetadata = new MotionPhotoMetadata(j15, j16, c8749bM16988a.f46392a, j17, j18);
                            }
                        }
                    }
                }
                this.f46388g = motionPhotoMetadata;
                if (motionPhotoMetadata != null) {
                    this.f46387f = motionPhotoMetadata.f12713d;
                }
            }
        } else {
            ((C7504e) interfaceC7508i).mo14998j(this.f46386e);
        }
        this.f46384c = 0;
        return 0;
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: e */
    public final void mo12866e(long j10, long j11) {
        if (j10 == 0) {
            this.f46384c = 0;
            this.f46391j = null;
        } else {
            if (this.f46384c == 5) {
                C9484g c9484g = this.f46391j;
                c9484g.getClass();
                c9484g.mo12866e(j10, j11);
            }
        }
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: f */
    public final void mo12867f(InterfaceC7509j interfaceC7509j) {
        this.f46383b = interfaceC7509j;
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: g */
    public final boolean mo12868g(InterfaceC7508i interfaceC7508i) throws IOException {
        C7504e c7504e = (C7504e) interfaceC7508i;
        boolean z10 = false;
        if (m16987c(c7504e) != 65496) {
            return false;
        }
        int iM16987c = m16987c(c7504e);
        this.f46385d = iM16987c;
        C10151t c10151t = this.f46382a;
        if (iM16987c == 65504) {
            c10151t.m19121B(2);
            c7504e.mo14994c(c10151t.f51438a, 0, 2, false);
            c7504e.m15001n(c10151t.m19150y() - 2, false);
            this.f46385d = m16987c(c7504e);
        }
        if (this.f46385d != 65505) {
            return false;
        }
        c7504e.m15001n(2, false);
        c10151t.m19121B(6);
        c7504e.mo14994c(c10151t.f51438a, 0, 6, false);
        if (c10151t.m19146u() == 1165519206 && c10151t.m19150y() == 0) {
            z10 = true;
        }
        return z10;
    }

    @Override // p261m9.InterfaceC7507h
    public final void release() {
        C9484g c9484g = this.f46391j;
        if (c9484g != null) {
            c9484g.getClass();
        }
    }
}
