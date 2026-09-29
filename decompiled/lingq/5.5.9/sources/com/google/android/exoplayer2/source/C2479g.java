package com.google.android.exoplayer2.source;

import android.util.Pair;
import com.google.android.exoplayer2.AbstractC2382c0;
import com.google.android.exoplayer2.C2466p;
import com.google.android.exoplayer2.source.ads.C2473a;
import ga.AbstractC5724g;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p454wa.InterfaceC9877b;
import p479xa.C10129a;
import p479xa.C10134c0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2479g extends AbstractC2503t {

    /* JADX INFO: renamed from: e */
    public final boolean f13110e;

    /* JADX INFO: renamed from: f */
    public final AbstractC2382c0.c f13111f;

    /* JADX INFO: renamed from: g */
    public final AbstractC2382c0.b f13112g;

    /* JADX INFO: renamed from: h */
    public a f13113h;

    /* JADX INFO: renamed from: i */
    public C2478f f13114i;

    /* JADX INFO: renamed from: j */
    public boolean f13115j;

    /* JADX INFO: renamed from: k */
    public boolean f13116k;

    /* JADX INFO: renamed from: l */
    public boolean f13117l;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.g$a */
    public static final class a extends AbstractC5724g {

        /* JADX INFO: renamed from: e */
        public static final Object f13118e = new Object();

        /* JADX INFO: renamed from: c */
        public final Object f13119c;

        /* JADX INFO: renamed from: d */
        public final Object f13120d;

        public a(AbstractC2382c0 abstractC2382c0, Object obj, Object obj2) {
            super(abstractC2382c0);
            this.f13119c = obj;
            this.f13120d = obj2;
        }

        @Override // ga.AbstractC5724g, com.google.android.exoplayer2.AbstractC2382c0
        /* JADX INFO: renamed from: b */
        public final int mo6774b(Object obj) {
            Object obj2;
            if (f13118e.equals(obj) && (obj2 = this.f13120d) != null) {
                obj = obj2;
            }
            return this.f34747b.mo6774b(obj);
        }

        @Override // ga.AbstractC5724g, com.google.android.exoplayer2.AbstractC2382c0
        /* JADX INFO: renamed from: f */
        public final AbstractC2382c0.b mo6777f(int i10, AbstractC2382c0.b bVar, boolean z10) {
            this.f34747b.mo6777f(i10, bVar, z10);
            if (C10134c0.m19034a(bVar.f12064b, this.f13120d) && z10) {
                bVar.f12064b = f13118e;
            }
            return bVar;
        }

        @Override // ga.AbstractC5724g, com.google.android.exoplayer2.AbstractC2382c0
        /* JADX INFO: renamed from: l */
        public final Object mo6780l(int i10) {
            Object objMo6780l = this.f34747b.mo6780l(i10);
            if (C10134c0.m19034a(objMo6780l, this.f13120d)) {
                objMo6780l = f13118e;
            }
            return objMo6780l;
        }

        @Override // ga.AbstractC5724g, com.google.android.exoplayer2.AbstractC2382c0
        /* JADX INFO: renamed from: n */
        public final AbstractC2382c0.c mo6781n(int i10, AbstractC2382c0.c cVar, long j10) {
            this.f34747b.mo6781n(i10, cVar, j10);
            if (C10134c0.m19034a(cVar.f12091a, this.f13119c)) {
                cVar.f12091a = AbstractC2382c0.c.f12070M;
            }
            return cVar;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.g$b */
    public static final class b extends AbstractC2382c0 {

        /* JADX INFO: renamed from: b */
        public final C2466p f13121b;

        public b(C2466p c2466p) {
            this.f13121b = c2466p;
        }

        @Override // com.google.android.exoplayer2.AbstractC2382c0
        /* JADX INFO: renamed from: b */
        public final int mo6774b(Object obj) {
            return obj == a.f13118e ? 0 : -1;
        }

        @Override // com.google.android.exoplayer2.AbstractC2382c0
        /* JADX INFO: renamed from: f */
        public final AbstractC2382c0.b mo6777f(int i10, AbstractC2382c0.b bVar, boolean z10) {
            Object obj = null;
            Integer num = z10 ? 0 : null;
            if (z10) {
                obj = a.f13118e;
            }
            bVar.m6918h(num, obj, 0, -9223372036854775807L, 0L, C2473a.f13034g, true);
            return bVar;
        }

        @Override // com.google.android.exoplayer2.AbstractC2382c0
        /* JADX INFO: renamed from: h */
        public final int mo6905h() {
            return 1;
        }

        @Override // com.google.android.exoplayer2.AbstractC2382c0
        /* JADX INFO: renamed from: l */
        public final Object mo6780l(int i10) {
            return a.f13118e;
        }

        @Override // com.google.android.exoplayer2.AbstractC2382c0
        /* JADX INFO: renamed from: n */
        public final AbstractC2382c0.c mo6781n(int i10, AbstractC2382c0.c cVar, long j10) {
            cVar.m6920b(AbstractC2382c0.c.f12070M, this.f13121b, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            cVar.f12102l = true;
            return cVar;
        }

        @Override // com.google.android.exoplayer2.AbstractC2382c0
        /* JADX INFO: renamed from: o */
        public final int mo6909o() {
            return 1;
        }
    }

    public C2479g(InterfaceC2492i interfaceC2492i, boolean z10) {
        super(interfaceC2492i);
        this.f13110e = z10 && interfaceC2492i.isSingleWindow();
        this.f13111f = new AbstractC2382c0.c();
        this.f13112g = new AbstractC2382c0.b();
        AbstractC2382c0 initialTimeline = interfaceC2492i.getInitialTimeline();
        if (initialTimeline == null) {
            this.f13113h = new a(new b(interfaceC2492i.getMediaItem()), AbstractC2382c0.c.f12070M, a.f13118e);
        } else {
            this.f13113h = new a(initialTimeline, null, null);
            this.f13117l = true;
        }
    }

    @Override // com.google.android.exoplayer2.source.AbstractC2503t
    /* JADX INFO: renamed from: f */
    public final InterfaceC2492i.b mo7279f(InterfaceC2492i.b bVar) {
        Object obj = bVar.f34757a;
        Object obj2 = this.f13113h.f13120d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = a.f13118e;
        }
        return bVar.m7324b(obj);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006d  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.exoplayer2.source.AbstractC2503t
    /* JADX INFO: renamed from: g */
    public final void mo7244g(AbstractC2382c0 abstractC2382c0) {
        long j10;
        a aVar;
        InterfaceC2492i.b bVarM7324b;
        a aVar2;
        if (this.f13116k) {
            a aVar3 = this.f13113h;
            this.f13113h = new a(abstractC2382c0, aVar3.f13119c, aVar3.f13120d);
            C2478f c2478f = this.f13114i;
            if (c2478f != null) {
                m7282j(c2478f.f13109g);
            }
        } else {
            if (!abstractC2382c0.m6910p()) {
                AbstractC2382c0.c cVar = this.f13111f;
                abstractC2382c0.m6908m(0, cVar);
                long j11 = cVar.f12086H;
                Object obj = cVar.f12091a;
                C2478f c2478f2 = this.f13114i;
                if (c2478f2 != null) {
                    a aVar4 = this.f13113h;
                    Object obj2 = c2478f2.f13103a.f34757a;
                    AbstractC2382c0.b bVar = this.f13112g;
                    aVar4.mo6778g(obj2, bVar);
                    long j12 = bVar.f12067e + c2478f2.f13104b;
                    if (j12 != this.f13113h.m6908m(0, cVar).f12086H) {
                        j10 = j12;
                    } else {
                        j10 = j11;
                    }
                } else {
                    j10 = j11;
                }
                Pair<Object, Long> pairM6906i = abstractC2382c0.m6906i(this.f13111f, this.f13112g, 0, j10);
                Object obj3 = pairM6906i.first;
                long jLongValue = ((Long) pairM6906i.second).longValue();
                if (this.f13117l) {
                    a aVar5 = this.f13113h;
                    aVar = new a(abstractC2382c0, aVar5.f13119c, aVar5.f13120d);
                } else {
                    aVar = new a(abstractC2382c0, obj, obj3);
                }
                this.f13113h = aVar;
                C2478f c2478f3 = this.f13114i;
                if (c2478f3 != null) {
                    m7282j(jLongValue);
                    InterfaceC2492i.b bVar2 = c2478f3.f13103a;
                    Object obj4 = bVar2.f34757a;
                    if (this.f13113h.f13120d != null && obj4.equals(a.f13118e)) {
                        obj4 = this.f13113h.f13120d;
                    }
                    bVarM7324b = bVar2.m7324b(obj4);
                }
                this.f13117l = true;
                this.f13116k = true;
                refreshSourceInfo(this.f13113h);
                if (bVarM7324b != null) {
                    C2478f c2478f4 = this.f13114i;
                    c2478f4.getClass();
                    c2478f4.m7277c(bVarM7324b);
                }
            }
            if (this.f13117l) {
                a aVar6 = this.f13113h;
                aVar2 = new a(abstractC2382c0, aVar6.f13119c, aVar6.f13120d);
            } else {
                aVar2 = new a(abstractC2382c0, AbstractC2382c0.c.f12070M, a.f13118e);
            }
            this.f13113h = aVar2;
        }
        bVarM7324b = null;
        this.f13117l = true;
        this.f13116k = true;
        refreshSourceInfo(this.f13113h);
        if (bVarM7324b != null) {
            C2478f c2478f5 = this.f13114i;
            c2478f5.getClass();
            c2478f5.m7277c(bVarM7324b);
        }
    }

    @Override // com.google.android.exoplayer2.source.AbstractC2503t
    /* JADX INFO: renamed from: h */
    public final void mo7280h() {
        if (this.f13110e) {
            return;
        }
        this.f13115j = true;
        m7265e(null, this.f13469d);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2492i
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final C2478f createPeriod(InterfaceC2492i.b bVar, InterfaceC9877b interfaceC9877b, long j10) {
        C2478f c2478f = new C2478f(bVar, interfaceC9877b, j10);
        C10129a.m18992d(c2478f.f13106d == null);
        InterfaceC2492i interfaceC2492i = this.f13469d;
        c2478f.f13106d = interfaceC2492i;
        if (this.f13116k) {
            Object obj = this.f13113h.f13120d;
            Object obj2 = bVar.f34757a;
            if (obj != null && obj2.equals(a.f13118e)) {
                obj2 = this.f13113h.f13120d;
            }
            c2478f.m7277c(bVar.m7324b(obj2));
        } else {
            this.f13114i = c2478f;
            if (!this.f13115j) {
                this.f13115j = true;
                m7265e(null, interfaceC2492i);
            }
        }
        return c2478f;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    /* JADX INFO: renamed from: j */
    public final void m7282j(long j10) {
        C2478f c2478f = this.f13114i;
        int iMo6774b = this.f13113h.mo6774b(c2478f.f13103a.f34757a);
        if (iMo6774b == -1) {
            return;
        }
        a aVar = this.f13113h;
        AbstractC2382c0.b bVar = this.f13112g;
        aVar.mo6777f(iMo6774b, bVar, false);
        long j11 = bVar.f12066d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        c2478f.f13109g = j10;
    }

    @Override // com.google.android.exoplayer2.source.AbstractC2475c, com.google.android.exoplayer2.source.InterfaceC2492i
    public final void maybeThrowSourceInfoRefreshError() {
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2492i
    public final void releasePeriod(InterfaceC2480h interfaceC2480h) {
        ((C2478f) interfaceC2480h).m7278e();
        if (interfaceC2480h == this.f13114i) {
            this.f13114i = null;
        }
    }

    @Override // com.google.android.exoplayer2.source.AbstractC2475c, com.google.android.exoplayer2.source.AbstractC2471a
    public final void releaseSourceInternal() {
        this.f13116k = false;
        this.f13115j = false;
        super.releaseSourceInternal();
    }
}
