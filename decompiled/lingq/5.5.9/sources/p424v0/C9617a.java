package p424v0;

import android.graphics.Paint;
import android.support.v4.media.AbstractC0140a;
import androidx.compose.p017ui.unit.LayoutDirection;
import dm.C5207g;
import kotlin.NoWhenBranchMatchedException;
import p338qd.C8584v;
import p375s0.C8939a;
import p375s0.C8941c;
import p375s0.C8944f;
import p387t0.AbstractC9161o;
import p387t0.C9147h;
import p387t0.C9149i;
import p387t0.C9151j;
import p387t0.C9169u;
import p387t0.C9170v;
import p387t0.InterfaceC9138c0;
import p387t0.InterfaceC9165q;
import p387t0.InterfaceC9174z;
import p470x1.C10016d;
import p470x1.InterfaceC10015c;

/* JADX INFO: renamed from: v0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9617a implements InterfaceC9621e {

    /* JADX INFO: renamed from: a */
    public final a f49284a = new a();

    /* JADX INFO: renamed from: b */
    public final b f49285b = new b();

    /* JADX INFO: renamed from: c */
    public C9147h f49286c;

    /* JADX INFO: renamed from: d */
    public C9147h f49287d;

    /* JADX INFO: renamed from: v0.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public InterfaceC10015c f49288a;

        /* JADX INFO: renamed from: b */
        public LayoutDirection f49289b;

        /* JADX INFO: renamed from: c */
        public InterfaceC9165q f49290c;

        /* JADX INFO: renamed from: d */
        public long f49291d;

        public a() {
            C10016d c10016d = C8584v.f46028i;
            LayoutDirection layoutDirection = LayoutDirection.Ltr;
            C9622f c9622f = new C9622f();
            long j10 = C8944f.f46906b;
            this.f49288a = c10016d;
            this.f49289b = layoutDirection;
            this.f49290c = c9622f;
            this.f49291d = j10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C5207g.m11106a(this.f49288a, aVar.f49288a) && this.f49289b == aVar.f49289b && C5207g.m11106a(this.f49290c, aVar.f49290c) && C8944f.m17174a(this.f49291d, aVar.f49291d);
        }

        public final int hashCode() {
            int iHashCode = (this.f49290c.hashCode() + ((this.f49289b.hashCode() + (this.f49288a.hashCode() * 31)) * 31)) * 31;
            long j10 = this.f49291d;
            int i10 = C8944f.f46908d;
            return Long.hashCode(j10) + iHashCode;
        }

        public final String toString() {
            return "DrawParams(density=" + this.f49288a + ", layoutDirection=" + this.f49289b + ", canvas=" + this.f49290c + ", size=" + ((Object) C8944f.m17179f(this.f49291d)) + ')';
        }
    }

    /* JADX INFO: renamed from: v0.a$b */
    public static final class b implements InterfaceC9620d {

        /* JADX INFO: renamed from: a */
        public final C9618b f49292a = new C9618b(this);

        public b() {
        }

        @Override // p424v0.InterfaceC9620d
        /* JADX INFO: renamed from: a */
        public final void mo18079a(long j10) {
            C9617a.this.f49284a.f49291d = j10;
        }

        @Override // p424v0.InterfaceC9620d
        /* JADX INFO: renamed from: b */
        public final InterfaceC9165q mo18080b() {
            return C9617a.this.f49284a.f49290c;
        }

        @Override // p424v0.InterfaceC9620d
        /* JADX INFO: renamed from: d */
        public final long mo18081d() {
            return C9617a.this.f49284a.f49291d;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C9147h m18075a(C9617a c9617a, long j10, AbstractC0140a abstractC0140a, float f3, C9170v c9170v, int i10) {
        C9147h c9147hM18078f = c9617a.m18078f(abstractC0140a);
        if (!(f3 == 1.0f)) {
            j10 = C9169u.m17496b(j10, C9169u.m17498d(j10) * f3);
        }
        if (!C9169u.m17497c(c9147hM18078f.m17441c(), j10)) {
            c9147hM18078f.m17444f(j10);
        }
        if (c9147hM18078f.f47653c != null) {
            c9147hM18078f.m17446h(null);
        }
        if (!C5207g.m11106a(c9147hM18078f.f47654d, c9170v)) {
            c9147hM18078f.m17445g(c9170v);
        }
        if (!(c9147hM18078f.f47652b == i10)) {
            c9147hM18078f.m17443e(i10);
        }
        Paint paint = c9147hM18078f.f47651a;
        C5207g.m11111f(paint, "<this>");
        if (!(paint.isFilterBitmap())) {
            C5207g.m11111f(paint, "$this$setNativeFilterQuality");
            paint.setFilterBitmap(true);
        }
        return c9147hM18078f;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C9147h m18076e(C9617a c9617a, AbstractC9161o abstractC9161o, AbstractC0140a abstractC0140a, float f3, C9170v c9170v, int i10) {
        return c9617a.m18077b(abstractC9161o, abstractC0140a, f3, c9170v, i10, 1);
    }

    @Override // p424v0.InterfaceC9621e
    /* JADX INFO: renamed from: L */
    public final void mo12669L(AbstractC9161o abstractC9161o, long j10, long j11, float f3, AbstractC0140a abstractC0140a, C9170v c9170v, int i10) {
        C5207g.m11111f(abstractC9161o, "brush");
        C5207g.m11111f(abstractC0140a, "style");
        this.f49284a.f49290c.mo17419c(C8941c.m17164c(j10), C8941c.m17165d(j10), C8944f.m17177d(j11) + C8941c.m17164c(j10), C8944f.m17175b(j11) + C8941c.m17165d(j10), m18076e(this, abstractC9161o, abstractC0140a, f3, c9170v, i10));
    }

    @Override // p424v0.InterfaceC9621e
    /* JADX INFO: renamed from: S */
    public final void mo12670S(C9151j c9151j, long j10, float f3, AbstractC0140a abstractC0140a, C9170v c9170v, int i10) {
        C5207g.m11111f(c9151j, "path");
        C5207g.m11111f(abstractC0140a, "style");
        this.f49284a.f49290c.mo17431r(c9151j, m18075a(this, j10, abstractC0140a, f3, c9170v, i10));
    }

    @Override // p424v0.InterfaceC9621e
    /* JADX INFO: renamed from: Y */
    public final void mo12671Y(long j10, long j11, long j12, long j13, AbstractC0140a abstractC0140a, float f3, C9170v c9170v, int i10) {
        this.f49284a.f49290c.mo17422h(C8941c.m17164c(j11), C8941c.m17165d(j11), C8944f.m17177d(j12) + C8941c.m17164c(j11), C8944f.m17175b(j12) + C8941c.m17165d(j11), C8939a.m17157b(j13), C8939a.m17158c(j13), m18075a(this, j10, abstractC0140a, f3, c9170v, i10));
    }

    @Override // p424v0.InterfaceC9621e
    /* JADX INFO: renamed from: a0 */
    public final void mo12673a0(InterfaceC9174z interfaceC9174z, long j10, long j11, long j12, long j13, float f3, AbstractC0140a abstractC0140a, C9170v c9170v, int i10, int i11) {
        C5207g.m11111f(interfaceC9174z, "image");
        C5207g.m11111f(abstractC0140a, "style");
        this.f49284a.f49290c.mo17424k(interfaceC9174z, j10, j11, j12, j13, m18077b(null, abstractC0140a, f3, c9170v, i10, i11));
    }

    /* JADX INFO: renamed from: b */
    public final C9147h m18077b(AbstractC9161o abstractC9161o, AbstractC0140a abstractC0140a, float f3, C9170v c9170v, int i10, int i11) {
        C9147h c9147hM18078f = m18078f(abstractC0140a);
        boolean z10 = false;
        if (abstractC9161o != null) {
            abstractC9161o.mo17468a(f3, mo12674d(), c9147hM18078f);
        } else {
            if (!(c9147hM18078f.m17440b() == f3)) {
                c9147hM18078f.m17442d(f3);
            }
        }
        if (!C5207g.m11106a(c9147hM18078f.f47654d, c9170v)) {
            c9147hM18078f.m17445g(c9170v);
        }
        if (!(c9147hM18078f.f47652b == i10)) {
            c9147hM18078f.m17443e(i10);
        }
        Paint paint = c9147hM18078f.f47651a;
        C5207g.m11111f(paint, "<this>");
        if (!(paint.isFilterBitmap() == i11)) {
            C5207g.m11111f(paint, "$this$setNativeFilterQuality");
            if (i11 == 0) {
                z10 = true;
            }
            paint.setFilterBitmap(!z10);
        }
        return c9147hM18078f;
    }

    @Override // p470x1.InterfaceC10015c
    /* JADX INFO: renamed from: c0 */
    public final float mo1462c0() {
        return this.f49284a.f49288a.mo1462c0();
    }

    @Override // p424v0.InterfaceC9621e
    /* JADX INFO: renamed from: d0 */
    public final void mo12675d0(long j10, long j11, long j12, float f3, AbstractC0140a abstractC0140a, C9170v c9170v, int i10) {
        C5207g.m11111f(abstractC0140a, "style");
        this.f49284a.f49290c.mo17419c(C8941c.m17164c(j11), C8941c.m17165d(j11), C8944f.m17177d(j12) + C8941c.m17164c(j11), C8944f.m17175b(j12) + C8941c.m17165d(j11), m18075a(this, j10, abstractC0140a, f3, c9170v, i10));
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00c5  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public final C9147h m18078f(AbstractC0140a abstractC0140a) {
        int i10;
        if (C5207g.m11106a(abstractC0140a, C9623g.f49295a)) {
            C9147h c9147h = this.f49286c;
            if (c9147h != null) {
                return c9147h;
            }
            C9147h c9147hM17467a = C9149i.m17467a();
            c9147hM17467a.m17449k(0);
            this.f49286c = c9147hM17467a;
            return c9147hM17467a;
        }
        if (!(abstractC0140a instanceof C9624h)) {
            throw new NoWhenBranchMatchedException();
        }
        C9147h c9147hM17467a2 = this.f49287d;
        if (c9147hM17467a2 == null) {
            c9147hM17467a2 = C9149i.m17467a();
            c9147hM17467a2.m17449k(1);
            this.f49287d = c9147hM17467a2;
        }
        Paint paint = c9147hM17467a2.f47651a;
        C5207g.m11111f(paint, "<this>");
        float strokeWidth = paint.getStrokeWidth();
        C9624h c9624h = (C9624h) abstractC0140a;
        float f3 = c9624h.f49296a;
        boolean z10 = strokeWidth == f3;
        Paint paint2 = c9147hM17467a2.f47651a;
        if (!z10) {
            C5207g.m11111f(paint2, "<this>");
            paint2.setStrokeWidth(f3);
        }
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i11 = -1;
        int i12 = strokeCap == null ? -1 : C9149i.a.f47672a[strokeCap.ordinal()];
        int i13 = 2;
        if (i12 != 1) {
            if (i12 != 2) {
                i10 = i12 != 3 ? 0 : 2;
            } else {
                i10 = 1;
            }
        }
        int i14 = c9624h.f49298c;
        if (!(i10 == i14)) {
            c9147hM17467a2.m17447i(i14);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f10 = c9624h.f49297b;
        if (!(strokeMiter == f10)) {
            C5207g.m11111f(paint2, "<this>");
            paint2.setStrokeMiter(f10);
        }
        Paint.Join strokeJoin = paint.getStrokeJoin();
        if (strokeJoin != null) {
            i11 = C9149i.a.f47673b[strokeJoin.ordinal()];
        }
        if (i11 == 1) {
            i13 = 0;
        } else if (i11 != 2) {
            if (i11 != 3) {
                i13 = 0;
            } else {
                i13 = 1;
            }
        }
        int i15 = c9624h.f49299d;
        if (!(i13 == i15)) {
            c9147hM17467a2.m17448j(i15);
        }
        c9147hM17467a2.getClass();
        c9624h.getClass();
        if (!C5207g.m11106a(null, null)) {
            C5207g.m11111f(paint2, "<this>");
            paint2.setPathEffect(null);
            c9147hM17467a2.getClass();
        }
        return c9147hM17467a2;
    }

    @Override // p470x1.InterfaceC10015c
    public final float getDensity() {
        return this.f49284a.f49288a.getDensity();
    }

    @Override // p424v0.InterfaceC9621e
    public final LayoutDirection getLayoutDirection() {
        return this.f49284a.f49289b;
    }

    @Override // p424v0.InterfaceC9621e
    /* JADX INFO: renamed from: l0 */
    public final b mo12676l0() {
        return this.f49285b;
    }

    @Override // p424v0.InterfaceC9621e
    /* JADX INFO: renamed from: p0 */
    public final void mo12677p0(InterfaceC9138c0 interfaceC9138c0, AbstractC9161o abstractC9161o, float f3, AbstractC0140a abstractC0140a, C9170v c9170v, int i10) {
        C5207g.m11111f(interfaceC9138c0, "path");
        C5207g.m11111f(abstractC9161o, "brush");
        C5207g.m11111f(abstractC0140a, "style");
        this.f49284a.f49290c.mo17431r(interfaceC9138c0, m18076e(this, abstractC9161o, abstractC0140a, f3, c9170v, i10));
    }

    @Override // p424v0.InterfaceC9621e
    /* JADX INFO: renamed from: r0 */
    public final void mo12678r0(long j10, float f3, long j11, float f10, AbstractC0140a abstractC0140a, C9170v c9170v, int i10) {
        C5207g.m11111f(abstractC0140a, "style");
        this.f49284a.f49290c.mo17418b(f3, j11, m18075a(this, j10, abstractC0140a, f10, c9170v, i10));
    }

    @Override // p424v0.InterfaceC9621e
    /* JADX INFO: renamed from: w0 */
    public final void mo12679w0(AbstractC9161o abstractC9161o, long j10, long j11, long j12, float f3, AbstractC0140a abstractC0140a, C9170v c9170v, int i10) {
        C5207g.m11111f(abstractC9161o, "brush");
        C5207g.m11111f(abstractC0140a, "style");
        this.f49284a.f49290c.mo17422h(C8941c.m17164c(j10), C8941c.m17165d(j10), C8941c.m17164c(j10) + C8944f.m17177d(j11), C8941c.m17165d(j10) + C8944f.m17175b(j11), C8939a.m17157b(j12), C8939a.m17158c(j12), m18076e(this, abstractC9161o, abstractC0140a, f3, c9170v, i10));
    }
}
