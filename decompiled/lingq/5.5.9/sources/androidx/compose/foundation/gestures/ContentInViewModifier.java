package androidx.compose.foundation.gestures;

import androidx.compose.foundation.FocusedBoundsKt;
import androidx.compose.foundation.relocation.BringIntoViewResponderKt;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.node.NodeCoordinator;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import dm.C5206f;
import dm.C5207g;
import java.util.concurrent.CancellationException;
import jm.C6526i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineStart;
import no.C7828f;
import no.C7843k;
import no.InterfaceC7840j;
import no.InterfaceC7882z;
import p105f0.C5458f;
import p127g1.InterfaceC5647k;
import p127g1.InterfaceC5657u;
import p127g1.InterfaceC5658v;
import p260m8.C7499b;
import p338qd.C8584v;
import p349qo.C8656b;
import p375s0.C8941c;
import p375s0.C8942d;
import p375s0.C8944f;
import p385sf.C9000b;
import p401u.InterfaceC9357j;
import p464wl.InterfaceC9968c;
import p468x.InterfaceC9999g;
import p470x1.C10022j;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class ContentInViewModifier implements InterfaceC9999g, InterfaceC5658v, InterfaceC5657u {

    /* JADX INFO: renamed from: H */
    public final InterfaceC0500b f1952H;

    /* JADX INFO: renamed from: a */
    public final InterfaceC7882z f1953a;

    /* JADX INFO: renamed from: b */
    public final Orientation f1954b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC9357j f1955c;

    /* JADX INFO: renamed from: d */
    public final boolean f1956d;

    /* JADX INFO: renamed from: e */
    public final C0412a f1957e;

    /* JADX INFO: renamed from: f */
    public InterfaceC5647k f1958f;

    /* JADX INFO: renamed from: g */
    public InterfaceC5647k f1959g;

    /* JADX INFO: renamed from: h */
    public C8942d f1960h;

    /* JADX INFO: renamed from: i */
    public boolean f1961i;

    /* JADX INFO: renamed from: j */
    public long f1962j;

    /* JADX INFO: renamed from: k */
    public boolean f1963k;

    /* JADX INFO: renamed from: l */
    public final UpdatableAnimationState f1964l;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ContentInViewModifier$a */
    public static final class C0394a {

        /* JADX INFO: renamed from: a */
        public final InterfaceC2041a<C8942d> f1965a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC7840j<C9072e> f1966b;

        public C0394a(InterfaceC2041a interfaceC2041a, C7843k c7843k) {
            this.f1965a = interfaceC2041a;
            this.f1966b = c7843k;
        }

        public final String toString() {
            InterfaceC7840j<C9072e> interfaceC7840j = this.f1966b;
            StringBuilder sb2 = new StringBuilder("Request@");
            int iHashCode = hashCode();
            C5206f.m11029x0(16);
            String string = Integer.toString(iHashCode, 16);
            C5207g.m11110e(string, "toString(this, checkRadix(radix))");
            sb2.append(string);
            sb2.append("(currentBounds()=");
            sb2.append(this.f1965a.mo807E());
            sb2.append(", continuation=");
            sb2.append(interfaceC7840j);
            sb2.append(')');
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ContentInViewModifier$b */
    public /* synthetic */ class C0395b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f1967a;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f1967a = iArr;
        }
    }

    public ContentInViewModifier(InterfaceC7882z interfaceC7882z, Orientation orientation, InterfaceC9357j interfaceC9357j, boolean z10) {
        C5207g.m11111f(interfaceC7882z, "scope");
        C5207g.m11111f(orientation, "orientation");
        C5207g.m11111f(interfaceC9357j, "scrollState");
        this.f1953a = interfaceC7882z;
        this.f1954b = orientation;
        this.f1955c = interfaceC9357j;
        this.f1956d = z10;
        this.f1957e = new C0412a();
        this.f1962j = 0L;
        this.f1964l = new UpdatableAnimationState();
        this.f1952H = BringIntoViewResponderKt.m1527a(FocusedBoundsKt.m1412a(this, new InterfaceC2052l<InterfaceC5647k, C9072e>() { // from class: androidx.compose.foundation.gestures.ContentInViewModifier$modifier$1
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(InterfaceC5647k interfaceC5647k) {
                this.f1979b.f1959g = interfaceC5647k;
                return C9072e.f47360a;
            }
        }), this);
    }

    /* JADX INFO: renamed from: h */
    public static final float m1433h(ContentInViewModifier contentInViewModifier) {
        C8942d c8942d;
        int iCompare;
        if (!C10022j.m18627a(contentInViewModifier.f1962j, 0L)) {
            C5458f<C0394a> c5458f = contentInViewModifier.f1957e.f2285a;
            int i10 = c5458f.f34019c;
            Orientation orientation = contentInViewModifier.f1954b;
            if (i10 > 0) {
                int i11 = i10 - 1;
                C0394a[] c0394aArr = c5458f.f34017a;
                c8942d = null;
                do {
                    C8942d c8942dMo807E = c0394aArr[i11].f1965a.mo807E();
                    if (c8942dMo807E != null) {
                        long jM16788m = C8584v.m16788m(c8942dMo807E.f46896c - c8942dMo807E.f46894a, c8942dMo807E.f46897d - c8942dMo807E.f46895b);
                        long jM17259y = C9000b.m17259y(contentInViewModifier.f1962j);
                        int i12 = C0395b.f1967a[orientation.ordinal()];
                        if (i12 == 1) {
                            iCompare = Float.compare(C8944f.m17175b(jM16788m), C8944f.m17175b(jM17259y));
                        } else {
                            if (i12 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            iCompare = Float.compare(C8944f.m17177d(jM16788m), C8944f.m17177d(jM17259y));
                        }
                        if (iCompare > 0) {
                            break;
                        }
                        c8942d = c8942dMo807E;
                        i11--;
                    } else {
                        i11--;
                    }
                } while (i11 >= 0);
            } else {
                c8942d = null;
            }
            if (c8942d == null) {
                C8942d c8942dM1437i = contentInViewModifier.f1961i ? contentInViewModifier.m1437i() : null;
                if (c8942dM1437i != null) {
                    c8942d = c8942dM1437i;
                }
            }
            long jM17259y2 = C9000b.m17259y(contentInViewModifier.f1962j);
            int i13 = C0395b.f1967a[orientation.ordinal()];
            if (i13 == 1) {
                return m1434l(c8942d.f46895b, c8942d.f46897d, C8944f.m17175b(jM17259y2));
            }
            if (i13 == 2) {
                return m1434l(c8942d.f46894a, c8942d.f46896c, C8944f.m17177d(jM17259y2));
            }
            throw new NoWhenBranchMatchedException();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: l */
    public static float m1434l(float f3, float f10, float f11) {
        if ((f3 < 0.0f || f10 > f11) && (f3 >= 0.0f || f10 <= f11)) {
            float f12 = f10 - f11;
            return Math.abs(f3) < Math.abs(f12) ? f3 : f12;
        }
        return 0.0f;
    }

    @Override // p468x.InterfaceC9999g
    /* JADX INFO: renamed from: c */
    public final C8942d mo1435c(C8942d c8942d) {
        if (!(!C10022j.m18627a(this.f1962j, 0L))) {
            throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
        }
        long jM1440m = m1440m(c8942d, this.f1962j);
        return c8942d.m17173d(C7499b.m14932c(-C8941c.m17164c(jM1440m), -C8941c.m17165d(jM1440m)));
    }

    @Override // p468x.InterfaceC9999g
    /* JADX INFO: renamed from: d */
    public final Object mo1436d(InterfaceC2041a<C8942d> interfaceC2041a, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        C8942d c8942dMo807E = interfaceC2041a.mo807E();
        boolean z10 = false;
        if (!((c8942dMo807E == null || C8941c.m17162a(m1440m(c8942dMo807E, this.f1962j), C8941c.f46888b)) ? false : true)) {
            return C9072e.f47360a;
        }
        C7843k c7843k = new C7843k(1, C8656b.m16874A(interfaceC9968c));
        c7843k.m15594r();
        final C0394a c0394a = new C0394a(interfaceC2041a, c7843k);
        final C0412a c0412a = this.f1957e;
        c0412a.getClass();
        C8942d c8942dMo807E2 = interfaceC2041a.mo807E();
        if (c8942dMo807E2 == null) {
            c7843k.mo2031y(C9072e.f47360a);
        } else {
            c7843k.mo15577R(new InterfaceC2052l<Throwable, C9072e>() { // from class: androidx.compose.foundation.gestures.BringIntoViewRequestPriorityQueue$enqueue$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final C9072e mo528n(Throwable th2) {
                    c0412a.f2285a.m11696m(c0394a);
                    return C9072e.f47360a;
                }
            });
            C5458f<C0394a> c5458f = c0412a.f2285a;
            int i10 = new C6526i(0, c5458f.f34019c - 1).f37164b;
            if (i10 < 0) {
                c5458f.m11686a(0, c0394a);
                break;
            }
            while (true) {
                C8942d c8942dMo807E3 = c5458f.f34017a[i10].f1965a.mo807E();
                if (c8942dMo807E3 != null) {
                    C8942d c8942dM17171b = c8942dMo807E2.m17171b(c8942dMo807E3);
                    if (!C5207g.m11106a(c8942dM17171b, c8942dMo807E2)) {
                        if (!C5207g.m11106a(c8942dM17171b, c8942dMo807E3)) {
                            CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                            int i11 = c5458f.f34019c - 1;
                            if (i11 <= i10) {
                                while (true) {
                                    c5458f.f34017a[i10].f1966b.mo15583t0(cancellationException);
                                    if (i11 == i10) {
                                        break;
                                    }
                                    i11++;
                                }
                            }
                        }
                    } else {
                        c5458f.m11686a(i10 + 1, c0394a);
                        break;
                    }
                }
                if (i10 == 0) {
                    c5458f.m11686a(0, c0394a);
                    break;
                }
                i10--;
            }
            z10 = true;
        }
        if (z10 && !this.f1963k) {
            m1439k();
        }
        Object objM15593p = c7843k.m15593p();
        return objM15593p == CoroutineSingletons.COROUTINE_SUSPENDED ? objM15593p : C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002b  */
    /* JADX INFO: renamed from: i */
    public final C8942d m1437i() {
        InterfaceC5647k interfaceC5647k = this.f1958f;
        if (interfaceC5647k != null) {
            if (!interfaceC5647k.mo2190q()) {
                interfaceC5647k = null;
            }
            if (interfaceC5647k != null) {
                InterfaceC5647k interfaceC5647k2 = this.f1959g;
                if (interfaceC5647k2 != null) {
                    if (!interfaceC5647k2.mo2190q()) {
                        interfaceC5647k2 = null;
                    }
                    if (interfaceC5647k2 != null) {
                        return interfaceC5647k.mo2194t(interfaceC5647k2, false);
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p127g1.InterfaceC5658v
    /* JADX INFO: renamed from: j */
    public final void mo1438j(long j10) {
        int iM11113h;
        C8942d c8942dM1437i;
        long j11 = this.f1962j;
        this.f1962j = j10;
        int i10 = C0395b.f1967a[this.f1954b.ordinal()];
        if (i10 == 1) {
            iM11113h = C5207g.m11113h(C10022j.m18628b(j10), C10022j.m18628b(j11));
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iM11113h = C5207g.m11113h((int) (j10 >> 32), (int) (j11 >> 32));
        }
        if (iM11113h < 0 && (c8942dM1437i = m1437i()) != null) {
            C8942d c8942d = this.f1960h;
            if (c8942d == null) {
                c8942d = c8942dM1437i;
            }
            if (!this.f1963k && !this.f1961i) {
                long jM1440m = m1440m(c8942d, j11);
                long j12 = C8941c.f46888b;
                if (C8941c.m17162a(jM1440m, j12) && !C8941c.m17162a(m1440m(c8942dM1437i, j10), j12)) {
                    this.f1961i = true;
                    m1439k();
                }
            }
            this.f1960h = c8942dM1437i;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m1439k() {
        if (!(!this.f1963k)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        C7828f.m15570d(this.f1953a, null, CoroutineStart.UNDISPATCHED, new ContentInViewModifier$launchAnimation$1(this, null), 1);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: m */
    public final long m1440m(C8942d c8942d, long j10) {
        long jM17259y = C9000b.m17259y(j10);
        int i10 = C0395b.f1967a[this.f1954b.ordinal()];
        if (i10 == 1) {
            float fM17175b = C8944f.m17175b(jM17259y);
            return C7499b.m14932c(0.0f, m1434l(c8942d.f46895b, c8942d.f46897d, fM17175b));
        }
        if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        float fM17177d = C8944f.m17177d(jM17259y);
        return C7499b.m14932c(m1434l(c8942d.f46894a, c8942d.f46896c, fM17177d), 0.0f);
    }

    @Override // p127g1.InterfaceC5657u
    /* JADX INFO: renamed from: q */
    public final void mo1441q(NodeCoordinator nodeCoordinator) {
        C5207g.m11111f(nodeCoordinator, "coordinates");
        this.f1958f = nodeCoordinator;
    }
}
