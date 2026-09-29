package jp;

import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import java.io.IOException;
import java.util.ArrayList;
import p124fp.AbstractC5612i;
import p124fp.C5608e;
import p124fp.C5617n;
import p124fp.C5622s;
import p124fp.InterfaceC5610g;
import p467wo.C9990e;
import retrofit2.C8778b;
import so.AbstractC9105w;
import so.AbstractC9107y;
import so.C9094l;
import so.C9095m;
import so.C9096n;
import so.C9098p;
import so.C9099q;
import so.C9101s;
import so.C9104v;
import so.C9106x;
import so.C9108z;
import so.InterfaceC9086d;
import so.InterfaceC9087e;
import to.C9347b;

/* JADX INFO: renamed from: jp.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C6545m<T> implements InterfaceC6534b<T> {

    /* JADX INFO: renamed from: a */
    public final C6552t f37224a;

    /* JADX INFO: renamed from: b */
    public final Object[] f37225b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC9086d.a f37226c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC6538f<AbstractC9107y, T> f37227d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f37228e;

    /* JADX INFO: renamed from: f */
    public InterfaceC9086d f37229f;

    /* JADX INFO: renamed from: g */
    public Throwable f37230g;

    /* JADX INFO: renamed from: h */
    public boolean f37231h;

    /* JADX INFO: renamed from: jp.m$a */
    public class a implements InterfaceC9087e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC6536d f37232a;

        public a(InterfaceC6536d interfaceC6536d) {
            this.f37232a = interfaceC6536d;
        }

        /* JADX INFO: renamed from: a */
        public final void m13134a(Throwable th2) {
            try {
                this.f37232a.mo13129a(C6545m.this, th2);
            } catch (Throwable th3) {
                C8778b.m17035m(th3);
                th3.printStackTrace();
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m13135b(C9106x c9106x) {
            C6545m c6545m = C6545m.this;
            try {
                try {
                    this.f37232a.mo13130b(c6545m, c6545m.m13133d(c9106x));
                } catch (Throwable th2) {
                    C8778b.m17035m(th2);
                    th2.printStackTrace();
                }
            } catch (Throwable th3) {
                C8778b.m17035m(th3);
                m13134a(th3);
            }
        }
    }

    /* JADX INFO: renamed from: jp.m$b */
    public static final class b extends AbstractC9107y {

        /* JADX INFO: renamed from: b */
        public final AbstractC9107y f37234b;

        /* JADX INFO: renamed from: c */
        public final C5622s f37235c;

        /* JADX INFO: renamed from: d */
        public IOException f37236d;

        /* JADX INFO: renamed from: jp.m$b$a */
        public class a extends AbstractC5612i {
            public a(InterfaceC5610g interfaceC5610g) {
                super(interfaceC5610g);
            }

            @Override // p124fp.AbstractC5612i, p124fp.InterfaceC5627x
            /* JADX INFO: renamed from: j0 */
            public final long mo11924j0(C5608e c5608e, long j10) throws IOException {
                try {
                    return super.mo11924j0(c5608e, j10);
                } catch (IOException e10) {
                    b.this.f37236d = e10;
                    throw e10;
                }
            }
        }

        public b(AbstractC9107y abstractC9107y) {
            this.f37234b = abstractC9107y;
            this.f37235c = C5617n.m11991c(new a(abstractC9107y.mo13138q()));
        }

        @Override // so.AbstractC9107y
        /* JADX INFO: renamed from: b */
        public final long mo13136b() {
            return this.f37234b.mo13136b();
        }

        @Override // so.AbstractC9107y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f37234b.close();
        }

        @Override // so.AbstractC9107y
        /* JADX INFO: renamed from: l */
        public final C9098p mo13137l() {
            return this.f37234b.mo13137l();
        }

        @Override // so.AbstractC9107y
        /* JADX INFO: renamed from: q */
        public final InterfaceC5610g mo13138q() {
            return this.f37235c;
        }
    }

    /* JADX INFO: renamed from: jp.m$c */
    public static final class c extends AbstractC9107y {

        /* JADX INFO: renamed from: b */
        public final C9098p f37238b;

        /* JADX INFO: renamed from: c */
        public final long f37239c;

        public c(C9098p c9098p, long j10) {
            this.f37238b = c9098p;
            this.f37239c = j10;
        }

        @Override // so.AbstractC9107y
        /* JADX INFO: renamed from: b */
        public final long mo13136b() {
            return this.f37239c;
        }

        @Override // so.AbstractC9107y
        /* JADX INFO: renamed from: l */
        public final C9098p mo13137l() {
            return this.f37238b;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // so.AbstractC9107y
        /* JADX INFO: renamed from: q */
        public final InterfaceC5610g mo13138q() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public C6545m(C6552t c6552t, Object[] objArr, InterfaceC9086d.a aVar, InterfaceC6538f<AbstractC9107y, T> interfaceC6538f) {
        this.f37224a = c6552t;
        this.f37225b = objArr;
        this.f37226c = aVar;
        this.f37227d = interfaceC6538f;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // jp.InterfaceC6534b
    /* JADX INFO: renamed from: C */
    public final void mo13123C(InterfaceC6536d<T> interfaceC6536d) {
        InterfaceC9086d interfaceC9086d;
        Throwable th2;
        synchronized (this) {
            if (this.f37231h) {
                throw new IllegalStateException("Already executed.");
            }
            this.f37231h = true;
            interfaceC9086d = this.f37229f;
            th2 = this.f37230g;
            if (interfaceC9086d == null && th2 == null) {
                try {
                    InterfaceC9086d interfaceC9086dM13131b = m13131b();
                    this.f37229f = interfaceC9086dM13131b;
                    interfaceC9086d = interfaceC9086dM13131b;
                } catch (Throwable th3) {
                    th2 = th3;
                    C8778b.m17035m(th2);
                    this.f37230g = th2;
                }
            }
        }
        if (th2 != null) {
            interfaceC6536d.mo13129a(this, th2);
            return;
        }
        if (this.f37228e) {
            interfaceC9086d.cancel();
        }
        interfaceC9086d.mo17287U(new a(interfaceC6536d));
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: b */
    public final InterfaceC9086d m13131b() throws IOException {
        C9096n c9096nM17326g;
        C6552t c6552t = this.f37224a;
        c6552t.getClass();
        Object[] objArr = this.f37225b;
        int length = objArr.length;
        AbstractC6549q<?>[] abstractC6549qArr = c6552t.f37311j;
        if (length != abstractC6549qArr.length) {
            throw new IllegalArgumentException(C0166e.m768o(C0141b.m614j("Argument count (", length, ") doesn't match expected count ("), abstractC6549qArr.length, ")"));
        }
        C6551s c6551s = new C6551s(c6552t.f37304c, c6552t.f37303b, c6552t.f37305d, c6552t.f37306e, c6552t.f37307f, c6552t.f37308g, c6552t.f37309h, c6552t.f37310i);
        if (c6552t.f37312k) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(objArr[i10]);
            abstractC6549qArr[i10].mo13139a(c6551s, objArr[i10]);
        }
        C9096n.a aVar = c6551s.f37292d;
        if (aVar != null) {
            c9096nM17326g = aVar.m17328a();
        } else {
            String str = c6551s.f37291c;
            C9096n c9096n = c6551s.f37290b;
            c9096nM17326g = c9096n.m17326g(str);
            if (c9096nM17326g == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + c9096n + ", Relative: " + c6551s.f37291c);
            }
        }
        AbstractC9105w aVar2 = c6551s.f37299k;
        if (aVar2 == null) {
            C9094l.a aVar3 = c6551s.f37298j;
            if (aVar3 != null) {
                aVar2 = new C9094l(aVar3.f47450b, aVar3.f47451c);
            } else {
                C9099q.a aVar4 = c6551s.f37297i;
                if (aVar4 != null) {
                    ArrayList arrayList2 = aVar4.f47489c;
                    if (!(!arrayList2.isEmpty())) {
                        throw new IllegalStateException("Multipart body must have at least one part.".toString());
                    }
                    aVar2 = new C9099q(aVar4.f47487a, aVar4.f47488b, C9347b.m17717x(arrayList2));
                } else if (c6551s.f37296h) {
                    long j10 = 0;
                    C9347b.m17696c(j10, j10, j10);
                    aVar2 = new C9104v(null, new byte[0], 0, 0);
                }
            }
        }
        C9098p c9098p = c6551s.f37295g;
        C9095m.a aVar5 = c6551s.f37294f;
        if (c9098p != null) {
            if (aVar2 != null) {
                aVar2 = new C6551s.a(aVar2, c9098p);
            } else {
                aVar5.m17311a("Content-Type", c9098p.f47475a);
            }
        }
        C9101s.a aVar6 = c6551s.f37293e;
        aVar6.getClass();
        aVar6.f47548a = c9096nM17326g;
        aVar6.f47550c = aVar5.m17314d().m17307g();
        aVar6.m17346d(c6551s.f37289a, aVar2);
        aVar6.m17347e(C6541i.class, new C6541i(c6552t.f37302a, arrayList));
        C9990e c9990eMo17290b = this.f37226c.mo17290b(aVar6.m17344b());
        if (c9990eMo17290b != null) {
            return c9990eMo17290b;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final InterfaceC9086d m13132c() throws IOException {
        InterfaceC9086d interfaceC9086d = this.f37229f;
        if (interfaceC9086d != null) {
            return interfaceC9086d;
        }
        Throwable th2 = this.f37230g;
        if (th2 != null) {
            if (th2 instanceof IOException) {
                throw ((IOException) th2);
            }
            if (th2 instanceof RuntimeException) {
                throw ((RuntimeException) th2);
            }
            throw ((Error) th2);
        }
        try {
            InterfaceC9086d interfaceC9086dM13131b = m13131b();
            this.f37229f = interfaceC9086dM13131b;
            return interfaceC9086dM13131b;
        } catch (IOException | Error | RuntimeException e10) {
            C8778b.m17035m(e10);
            this.f37230g = e10;
            throw e10;
        }
    }

    @Override // jp.InterfaceC6534b
    public final void cancel() {
        InterfaceC9086d interfaceC9086d;
        this.f37228e = true;
        synchronized (this) {
            try {
                interfaceC9086d = this.f37229f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (interfaceC9086d != null) {
            interfaceC9086d.cancel();
        }
    }

    public final Object clone() throws CloneNotSupportedException {
        return new C6545m(this.f37224a, this.f37225b, this.f37226c, this.f37227d);
    }

    @Override // jp.InterfaceC6534b
    /* JADX INFO: renamed from: clone */
    public final InterfaceC6534b mo19591clone() {
        return new C6545m(this.f37224a, this.f37225b, this.f37226c, this.f37227d);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: d */
    public final C6553u<T> m13133d(C9106x c9106x) throws IOException {
        C9106x.a aVar = new C9106x.a(c9106x);
        AbstractC9107y abstractC9107y = c9106x.f47569g;
        aVar.f47581g = new c(abstractC9107y.mo13137l(), abstractC9107y.mo13136b());
        C9106x c9106xM17352a = aVar.m17352a();
        int i10 = c9106xM17352a.f47566d;
        if (i10 < 200 || i10 >= 300) {
            try {
                C5608e c5608e = new C5608e();
                abstractC9107y.mo13138q().mo11948X(c5608e);
                C9108z c9108z = new C9108z(abstractC9107y.mo13137l(), abstractC9107y.mo13136b(), c5608e);
                if (c9106xM17352a.m17350l()) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                C6553u<T> c6553u = new C6553u<>(c9106xM17352a, null, c9108z);
                abstractC9107y.close();
                return c6553u;
            } catch (Throwable th2) {
                abstractC9107y.close();
                throw th2;
            }
        }
        if (i10 == 204 || i10 == 205) {
            abstractC9107y.close();
            if (c9106xM17352a.m17350l()) {
                return new C6553u<>(c9106xM17352a, null, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        b bVar = new b(abstractC9107y);
        try {
            T tMo13122a = this.f37227d.mo13122a(bVar);
            if (c9106xM17352a.m17350l()) {
                return new C6553u<>(c9106xM17352a, tMo13122a, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } catch (RuntimeException e10) {
            IOException iOException = bVar.f37236d;
            if (iOException == null) {
                throw e10;
            }
            throw iOException;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // jp.InterfaceC6534b
    /* JADX INFO: renamed from: l */
    public final boolean mo13124l() {
        boolean z10 = true;
        if (this.f37228e) {
            return true;
        }
        synchronized (this) {
            InterfaceC9086d interfaceC9086d = this.f37229f;
            if (interfaceC9086d == null || !interfaceC9086d.mo17288l()) {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // jp.InterfaceC6534b
    /* JADX INFO: renamed from: q */
    public final synchronized C9101s mo13125q() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create request.", e10);
        }
        return m13132c().mo17289q();
    }
}
