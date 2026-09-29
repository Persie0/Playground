package p174i9;

import com.google.android.exoplayer2.AbstractC2382c0;
import com.google.android.exoplayer2.source.InterfaceC2492i;
import java.util.HashMap;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p479xa.C10134c0;

/* JADX INFO: renamed from: i9.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6209b0 {

    /* JADX INFO: renamed from: g */
    public static final C6207a0 f36110g = new C6207a0();

    /* JADX INFO: renamed from: h */
    public static final Random f36111h = new Random();

    /* JADX INFO: renamed from: d */
    public InterfaceC6213d0 f36115d;

    /* JADX INFO: renamed from: f */
    public String f36117f;

    /* JADX INFO: renamed from: a */
    public final AbstractC2382c0.c f36112a = new AbstractC2382c0.c();

    /* JADX INFO: renamed from: b */
    public final AbstractC2382c0.b f36113b = new AbstractC2382c0.b();

    /* JADX INFO: renamed from: c */
    public final HashMap<String, a> f36114c = new HashMap<>();

    /* JADX INFO: renamed from: e */
    public AbstractC2382c0 f36116e = AbstractC2382c0.f12057a;

    /* JADX INFO: renamed from: i9.b0$a */
    public final class a {

        /* JADX INFO: renamed from: a */
        public final String f36118a;

        /* JADX INFO: renamed from: b */
        public int f36119b;

        /* JADX INFO: renamed from: c */
        public long f36120c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC2492i.b f36121d;

        /* JADX INFO: renamed from: e */
        public boolean f36122e;

        /* JADX INFO: renamed from: f */
        public boolean f36123f;

        public a(String str, int i10, InterfaceC2492i.b bVar) {
            this.f36118a = str;
            this.f36119b = i10;
            this.f36120c = bVar == null ? -1L : bVar.f34760d;
            if (bVar == null || !bVar.m12079a()) {
                return;
            }
            this.f36121d = bVar;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m12817a(InterfaceC6208b.a aVar) {
            InterfaceC2492i.b bVar = aVar.f36101d;
            if (bVar == null) {
                return this.f36119b != aVar.f36100c;
            }
            long j10 = this.f36120c;
            if (j10 == -1) {
                return false;
            }
            if (bVar.f34760d > j10) {
                return true;
            }
            InterfaceC2492i.b bVar2 = this.f36121d;
            if (bVar2 == null) {
                return false;
            }
            AbstractC2382c0 abstractC2382c0 = aVar.f36099b;
            int iMo6774b = abstractC2382c0.mo6774b(bVar.f34757a);
            int iMo6774b2 = abstractC2382c0.mo6774b(bVar2.f34757a);
            if (bVar.f34760d < bVar2.f34760d || iMo6774b < iMo6774b2) {
                return false;
            }
            if (iMo6774b > iMo6774b2) {
                return true;
            }
            boolean zM12079a = bVar.m12079a();
            int i10 = bVar2.f34758b;
            if (!zM12079a) {
                int i11 = bVar.f34761e;
                return i11 == -1 || i11 > i10;
            }
            int i12 = bVar.f34758b;
            if (i12 > i10) {
                return true;
            }
            if (i12 == i10) {
                if (bVar.f34759c > bVar2.f34759c) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m12818b(AbstractC2382c0 abstractC2382c0, AbstractC2382c0 abstractC2382c1) {
            int i10 = this.f36119b;
            if (i10 < abstractC2382c0.mo6909o()) {
                C6209b0 c6209b0 = C6209b0.this;
                abstractC2382c0.m6908m(i10, c6209b0.f36112a);
                AbstractC2382c0.c cVar = c6209b0.f36112a;
                int i11 = cVar.f12088J;
                while (true) {
                    if (i11 > cVar.f12089K) {
                        i10 = -1;
                        break;
                    }
                    int iMo6774b = abstractC2382c1.mo6774b(abstractC2382c0.mo6780l(i11));
                    if (iMo6774b != -1) {
                        i10 = abstractC2382c1.mo6777f(iMo6774b, c6209b0.f36113b, false).f12065c;
                        break;
                    }
                    i11++;
                }
            } else if (i10 >= abstractC2382c1.mo6909o()) {
                i10 = -1;
                break;
            }
            this.f36119b = i10;
            if (i10 == -1) {
                return false;
            }
            InterfaceC2492i.b bVar = this.f36121d;
            if (bVar == null) {
                return true;
            }
            return abstractC2382c1.mo6774b(bVar.f34757a) != -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0060  */
    /* JADX WARN: Code duplicated, block: B:30:0x0062  */
    /* JADX INFO: renamed from: a */
    public final a m12814a(int i10, InterfaceC2492i.b bVar) {
        boolean z10;
        HashMap<String, a> map = this.f36114c;
        a aVar = null;
        long j10 = Long.MAX_VALUE;
        for (a aVar2 : map.values()) {
            if (aVar2.f36120c == -1 && i10 == aVar2.f36119b && bVar != null) {
                aVar2.f36120c = bVar.f34760d;
            }
            InterfaceC2492i.b bVar2 = aVar2.f36121d;
            if (bVar != null) {
                long j11 = bVar.f34760d;
                if (bVar2 != null ? !(j11 == bVar2.f34760d && bVar.f34758b == bVar2.f34758b && bVar.f34759c == bVar2.f34759c) : bVar.m12079a() || j11 != aVar2.f36120c) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } else if (i10 == aVar2.f36119b) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                long j12 = aVar2.f36120c;
                if (j12 == -1 || j12 < j10) {
                    aVar = aVar2;
                    j10 = j12;
                } else if (j12 == j10) {
                    int i11 = C10134c0.f51354a;
                    if (aVar.f36121d != null && bVar2 != null) {
                        aVar = aVar2;
                    }
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = (String) f36110g.get();
        a aVar3 = new a(str, i10, bVar);
        map.put(str, aVar3);
        return aVar3;
    }

    @RequiresNonNull({"listener"})
    /* JADX INFO: renamed from: b */
    public final void m12815b(InterfaceC6208b.a aVar) {
        InterfaceC2492i.b bVar;
        if (aVar.f36099b.m6910p()) {
            this.f36117f = null;
            return;
        }
        a aVar2 = this.f36114c.get(this.f36117f);
        int i10 = aVar.f36100c;
        InterfaceC2492i.b bVar2 = aVar.f36101d;
        this.f36117f = m12814a(i10, bVar2).f36118a;
        m12816c(aVar);
        if (bVar2 == null || !bVar2.m12079a()) {
            return;
        }
        long j10 = bVar2.f34760d;
        if (aVar2 != null && aVar2.f36120c == j10 && (bVar = aVar2.f36121d) != null && bVar.f34758b == bVar2.f34758b && bVar.f34759c == bVar2.f34759c) {
            return;
        }
        m12814a(i10, new InterfaceC2492i.b(j10, bVar2.f34757a));
        this.f36115d.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0045  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final synchronized void m12816c(InterfaceC6208b.a aVar) {
        boolean z10;
        try {
            this.f36115d.getClass();
            if (aVar.f36099b.m6910p()) {
                return;
            }
            a aVar2 = this.f36114c.get(this.f36117f);
            InterfaceC2492i.b bVar = aVar.f36101d;
            if (bVar != null && aVar2 != null) {
                long j10 = aVar2.f36120c;
                if (j10 == -1) {
                    if (aVar2.f36119b != aVar.f36100c) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else if (bVar.f34760d < j10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
            }
            a aVarM12814a = m12814a(aVar.f36100c, bVar);
            if (this.f36117f == null) {
                this.f36117f = aVarM12814a.f36118a;
            }
            InterfaceC2492i.b bVar2 = aVar.f36101d;
            if (bVar2 != null && bVar2.m12079a()) {
                InterfaceC2492i.b bVar3 = aVar.f36101d;
                a aVarM12814a2 = m12814a(aVar.f36100c, new InterfaceC2492i.b(bVar3.f34758b, bVar3.f34760d, bVar3.f34757a));
                if (!aVarM12814a2.f36122e) {
                    aVarM12814a2.f36122e = true;
                    aVar.f36099b.mo6778g(aVar.f36101d.f34757a, this.f36113b);
                    Math.max(0L, C10134c0.m19033R(this.f36113b.m6914d(aVar.f36101d.f34758b)) + C10134c0.m19033R(this.f36113b.f12067e));
                    this.f36115d.getClass();
                }
            }
            if (!aVarM12814a.f36122e) {
                aVarM12814a.f36122e = true;
                this.f36115d.getClass();
            }
            if (aVarM12814a.f36118a.equals(this.f36117f) && !aVarM12814a.f36123f) {
                aVarM12814a.f36123f = true;
                ((C6211c0) this.f36115d).m12823Z(aVar, aVarM12814a.f36118a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
