package androidx.compose.p017ui.text.font;

import cm.InterfaceC2052l;
import dm.C5207g;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import no.C7814a0;
import p260m8.C7499b;
import p311p1.C8167a;
import p311p1.C8168b;
import p328q1.InterfaceC8468e;
import p328q1.InterfaceC8479p;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0695a {

    /* JADX INFO: renamed from: a */
    public final C8167a<b, a> f4622a = new C8167a<>();

    /* JADX INFO: renamed from: b */
    public final C8168b<b, a> f4623b = new C8168b<>(0);

    /* JADX INFO: renamed from: c */
    public final C7814a0 f4624c = new C7814a0();

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Object f4625a;

        public /* synthetic */ a(Object obj) {
            this.f4625a = obj;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return C5207g.m11106a(this.f4625a, ((a) obj).f4625a);
            }
            return false;
        }

        public final int hashCode() {
            Object obj = this.f4625a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final String toString() {
            return "AsyncTypefaceResult(result=" + this.f4625a + ')';
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.a$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final InterfaceC8468e f4626a;

        /* JADX INFO: renamed from: b */
        public final Object f4627b;

        public b(InterfaceC8468e interfaceC8468e, Object obj) {
            C5207g.m11111f(interfaceC8468e, "font");
            this.f4626a = interfaceC8468e;
            this.f4627b = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C5207g.m11106a(this.f4626a, bVar.f4626a) && C5207g.m11106a(this.f4627b, bVar.f4627b);
        }

        public final int hashCode() {
            int iHashCode = this.f4626a.hashCode() * 31;
            Object obj = this.f4627b;
            return iHashCode + (obj == null ? 0 : obj.hashCode());
        }

        public final String toString() {
            return "Key(font=" + this.f4626a + ", loaderKey=" + this.f4627b + ')';
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2593a(C0695a c0695a, InterfaceC8468e interfaceC8468e, InterfaceC8479p interfaceC8479p, Object obj) {
        interfaceC8479p.mo2590c();
        Object obj2 = null;
        b bVar = new b(interfaceC8468e, null);
        synchronized (c0695a.f4624c) {
            try {
                if (obj == null) {
                } else {
                    c0695a.f4622a.m16202b(bVar, new a(obj));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final Object m2594b(InterfaceC8468e interfaceC8468e, InterfaceC8479p interfaceC8479p, InterfaceC2052l interfaceC2052l, InterfaceC9968c interfaceC9968c) throws Throwable {
        AsyncTypefaceCache$runCached$1 asyncTypefaceCache$runCached$1;
        boolean z10;
        C0695a c0695a;
        b bVar;
        if (interfaceC9968c instanceof AsyncTypefaceCache$runCached$1) {
            asyncTypefaceCache$runCached$1 = (AsyncTypefaceCache$runCached$1) interfaceC9968c;
            int i10 = asyncTypefaceCache$runCached$1.f4613i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                asyncTypefaceCache$runCached$1.f4613i = i10 - Integer.MIN_VALUE;
            } else {
                asyncTypefaceCache$runCached$1 = new AsyncTypefaceCache$runCached$1(this, interfaceC9968c);
            }
        } else {
            asyncTypefaceCache$runCached$1 = new AsyncTypefaceCache$runCached$1(this, interfaceC9968c);
        }
        Object obj = asyncTypefaceCache$runCached$1.f4611g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = asyncTypefaceCache$runCached$1.f4613i;
        Object obj2 = null;
        if (i11 == 0) {
            C7499b.m14977z0(obj);
            interfaceC8479p.mo2590c();
            b bVar2 = new b(interfaceC8468e, null);
            synchronized (this.f4624c) {
                a aVarM16201a = this.f4622a.m16201a(bVar2);
                if (aVarM16201a == null) {
                    aVarM16201a = this.f4623b.m16205a(bVar2);
                }
                if (aVarM16201a != null) {
                    return aVarM16201a.f4625a;
                }
                C9072e c9072e = C9072e.f47360a;
                asyncTypefaceCache$runCached$1.f4608d = this;
                asyncTypefaceCache$runCached$1.f4609e = bVar2;
                z10 = false;
                asyncTypefaceCache$runCached$1.f4610f = false;
                asyncTypefaceCache$runCached$1.f4613i = 1;
                Object objMo528n = ((AsyncFontListLoader$load$2$typeface$1) interfaceC2052l).mo528n(asyncTypefaceCache$runCached$1);
                if (objMo528n == coroutineSingletons) {
                    return coroutineSingletons;
                }
                c0695a = this;
                obj = objMo528n;
                bVar = bVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = asyncTypefaceCache$runCached$1.f4610f;
            bVar = asyncTypefaceCache$runCached$1.f4609e;
            c0695a = asyncTypefaceCache$runCached$1.f4608d;
            C7499b.m14977z0(obj);
        }
        synchronized (c0695a.f4624c) {
            try {
                if (obj == null) {
                    c0695a.f4623b.m16208d(bVar, new a(obj2));
                } else if (z10) {
                    c0695a.f4623b.m16208d(bVar, new a(obj));
                } else {
                    c0695a.f4622a.m16202b(bVar, new a(obj));
                }
                C9072e c9072e2 = C9072e.f47360a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
