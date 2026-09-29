package p127g1;

import p338qd.C8573r0;
import p375s0.C8944f;

/* JADX INFO: renamed from: g1.c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5639c {

    /* JADX INFO: renamed from: g1.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final C10633a f34486a = new C10633a();

        /* JADX INFO: renamed from: g1.c$a$a, reason: collision with other inner class name */
        public static final class C10633a implements InterfaceC5639c {
            @Override // p127g1.InterfaceC5639c
            /* JADX INFO: renamed from: a */
            public final long mo12012a(long j10, long j11) {
                float fMin = Math.min(C8944f.m17177d(j11) / C8944f.m17177d(j10), C8944f.m17175b(j11) / C8944f.m17175b(j10));
                return C8573r0.m16761u(fMin, fMin);
            }
        }

        /* JADX INFO: renamed from: g1.c$a$b */
        public static final class b implements InterfaceC5639c {
            @Override // p127g1.InterfaceC5639c
            /* JADX INFO: renamed from: a */
            public final long mo12012a(long j10, long j11) {
                if (C8944f.m17177d(j10) <= C8944f.m17177d(j11) && C8944f.m17175b(j10) <= C8944f.m17175b(j11)) {
                    return C8573r0.m16761u(1.0f, 1.0f);
                }
                float fMin = Math.min(C8944f.m17177d(j11) / C8944f.m17177d(j10), C8944f.m17175b(j11) / C8944f.m17175b(j10));
                return C8573r0.m16761u(fMin, fMin);
            }
        }

        static {
            new b();
        }
    }

    /* JADX INFO: renamed from: a */
    long mo12012a(long j10, long j11);
}
