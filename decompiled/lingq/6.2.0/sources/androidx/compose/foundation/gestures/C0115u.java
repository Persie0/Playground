package androidx.compose.foundation.gestures;

import android.os.Build;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.EdgeEffect;
import androidx.compose.foundation.C0077c;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.relocation.C0155b;
import androidx.compose.p002ui.focus.C0302d;
import androidx.compose.p002ui.input.nestedscroll.C0317a;
import androidx.compose.p002ui.input.nestedscroll.C0320d;
import androidx.compose.p002ui.input.pointer.PointerEventPass;
import androidx.compose.p002ui.semantics.AbstractC0421a;
import androidx.compose.p002ui.semantics.AbstractC0426f;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.AbstractC0818bo;
import p000.C3024g3;
import p000.ahd;
import p000.bh4;
import p000.bq1;
import p000.chd;
import p000.co8;
import p000.do8;
import p000.f32;
import p000.fa4;
import p000.fb2;
import p000.fg7;
import p000.gi4;
import p000.jl3;
import p000.kg7;
import p000.lo2;
import p000.m58;
import p000.ni0;
import p000.or3;
import p000.ov8;
import p000.rg7;
import p000.rh4;
import p000.rk2;
import p000.te1;
import p000.thb;
import p000.tv8;
import p000.un1;
import p000.v56;
import p000.wfb;
import p000.x63;
import p000.xfa;
import p000.zgd;
import p000.zi3;
import p000.zl8;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0115u extends AbstractC0103k implements gi4, ov8 {

    /* JADX INFO: renamed from: e0 */
    public C0077c f2348e0;

    /* JADX INFO: renamed from: f0 */
    public x63 f2349f0;

    /* JADX INFO: renamed from: g0 */
    public final C0317a f2350g0;

    /* JADX INFO: renamed from: h0 */
    public final C0100h f2351h0;

    /* JADX INFO: renamed from: i0 */
    public final C0116v f2352i0;

    /* JADX INFO: renamed from: j0 */
    public final C0111s f2353j0;

    /* JADX INFO: renamed from: k0 */
    public final C0302d f2354k0;

    /* JADX INFO: renamed from: l0 */
    public final C0098f f2355l0;

    /* JADX INFO: renamed from: m0 */
    public C0114t f2356m0;

    /* JADX INFO: renamed from: n0 */
    public zi3 f2357n0;

    /* JADX INFO: renamed from: o0 */
    public C0106n f2358o0;

    /* JADX INFO: renamed from: p0 */
    public C0118x f2359p0;

    public C0115u(ni0 ni0Var, x63 x63Var, v56 v56Var, do8 do8Var, C0077c c0077c, Orientation orientation, boolean z, boolean z2) {
        super(AbstractC0110r.f2310a, z, v56Var, orientation);
        this.f2348e0 = c0077c;
        this.f2349f0 = x63Var;
        C0317a c0317a = new C0317a();
        this.f2350g0 = c0317a;
        C0100h c0100h = new C0100h(new f32(new or3((fb2) AbstractC0110r.f2313d)));
        this.f2351h0 = c0100h;
        C0077c c0077c2 = this.f2348e0;
        x63 x63Var2 = this.f2349f0;
        C0116v c0116v = new C0116v(do8Var, c0077c2, x63Var2 == null ? c0100h : x63Var2, orientation, z2, c0317a, this, new co8(this, 0));
        this.f2352i0 = c0116v;
        C0111s c0111s = new C0111s(c0116v, z);
        this.f2353j0 = c0111s;
        C0302d c0302d = new C0302d(2, null, 10);
        m11624Z0(c0302d);
        this.f2354k0 = c0302d;
        C0098f c0098f = new C0098f(orientation, c0116v, z2, ni0Var, new co8(this, 1));
        m11624Z0(c0098f);
        this.f2355l0 = c0098f;
        m11624Z0(new C0320d(c0111s, c0317a));
        C0155b c0155b = new C0155b();
        c0155b.f2722J = c0098f;
        m11624Z0(c0155b);
    }

    @Override // androidx.compose.foundation.gestures.AbstractC0103k, p000.ng7
    /* JADX INFO: renamed from: D */
    public final void mo786D(fg7 fg7Var, PointerEventPass pointerEventPass, long j) {
        int i;
        List list = fg7Var.f39071a;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((Boolean) this.f2268M.invoke(new rg7(((kg7) list.get(i2)).f47243i))).booleanValue()) {
                super.mo786D(fg7Var, pointerEventPass, j);
                break;
            }
        }
        if (this.f2269N) {
            if (this.f2277V == null) {
                jl3 jl3Var = new jl3(this);
                m11624Z0(jl3Var);
                this.f2277V = jl3Var;
            }
            PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
            C0116v c0116v = this.f2352i0;
            int i3 = 6;
            if (pointerEventPass == pointerEventPass2 && fg7Var.f39076f == 6) {
                if (this.f2358o0 == null) {
                    this.f2358o0 = new C0106n(c0116v, new m58(ViewConfiguration.get(bq1.m4067t0(this).getContext()), i3), new ScrollableNode$ensureMouseWheelScrollingLogicInitialized$1(2, this, C0115u.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4), te1.m21979L(this).f4327T);
                }
                C0106n c0106n = this.f2358o0;
                if (c0106n != null) {
                    un1 un1VarM9971N0 = m9971N0();
                    if (c0106n.f2295h == null) {
                        c0106n.f2295h = wfb.m23926u(un1VarM9971N0, null, null, new MouseWheelScrollingLogic$startReceivingEvents$1(c0106n, null), 3);
                    }
                }
            }
            C0106n c0106n2 = this.f2358o0;
            if (c0106n2 != null && fg7Var.f39076f == 6) {
                int size2 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size2) {
                        if (pointerEventPass == PointerEventPass.Initial && c0106n2.f2299d) {
                            c0106n2.m898f(fg7Var);
                            AbstractC0107o.m899a(fg7Var);
                        }
                        if (pointerEventPass != PointerEventPass.Main || c0106n2.f2299d || !c0106n2.m898f(fg7Var)) {
                            break;
                            break;
                            break;
                        } else {
                            AbstractC0107o.m899a(fg7Var);
                            break;
                        }
                    }
                    if (((kg7) list.get(i4)).m15191c()) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            if (pointerEventPass == PointerEventPass.Initial && ((i = fg7Var.f39076f) == 10 || i == 11 || i == 12)) {
                if (this.f2359p0 == null) {
                    this.f2359p0 = new C0118x(c0116v, new ScrollableNode$ensureTrackpadScrollingLogicInitialized$1(2, this, C0115u.class, "onTrackpadScrollStopped", "onTrackpadScrollStopped-TH1AsA0(J)V", 4), te1.m21979L(this).f4327T);
                }
                C0118x c0118x = this.f2359p0;
                if (c0118x != null) {
                    un1 un1VarM9971N1 = m9971N0();
                    if (c0118x.f2375g == null) {
                        c0118x.f2375g = wfb.m23926u(un1VarM9971N1, null, null, new TrackpadScrollingLogic$startReceivingEvents$1(c0118x, null), 3);
                    }
                }
            }
            C0118x c0118x2 = this.f2359p0;
            if (c0118x2 != null) {
                int i5 = fg7Var.f39076f;
                if (i5 == 10 || i5 == 11 || i5 == 12) {
                    int size3 = list.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        if (((kg7) list.get(i6)).m15191c()) {
                            return;
                        }
                    }
                    if (pointerEventPass == PointerEventPass.Initial && c0118x2.f2299d) {
                        c0118x2.m950d(fg7Var);
                        AbstractC0107o.m899a(fg7Var);
                    }
                    if (pointerEventPass == PointerEventPass.Main && !c0118x2.f2299d && c0118x2.m950d(fg7Var)) {
                        AbstractC0107o.m899a(fg7Var);
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.compose.foundation.gestures.t] */
    @Override // p000.ov8
    /* JADX INFO: renamed from: H0 */
    public final void mo787H0(tv8 tv8Var) {
        if (this.f2269N && (this.f2356m0 == null || this.f2357n0 == null)) {
            this.f2356m0 = new zi3() { // from class: androidx.compose.foundation.gestures.t
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    float fFloatValue = ((Float) obj).floatValue();
                    float fFloatValue2 = ((Float) obj2).floatValue();
                    C0115u c0115u = this.f2347a;
                    wfb.m23926u(c0115u.m9971N0(), null, null, new ScrollableNode$setScrollSemanticsActions$1$1(c0115u, fFloatValue, fFloatValue2, null), 3);
                    return Boolean.TRUE;
                }
            };
            this.f2357n0 = new ScrollableNode$setScrollSemanticsActions$2(this, null);
        }
        C0114t c0114t = this.f2356m0;
        if (c0114t != null) {
            bh4[] bh4VarArr = AbstractC0426f.f5022a;
            tv8Var.mo3709d(AbstractC0421a.f4948d, new C3024g3(null, c0114t));
        }
        zi3 zi3Var = this.f2357n0;
        if (zi3Var != null) {
            bh4[] bh4VarArr2 = AbstractC0426f.f5022a;
            tv8Var.mo3709d(AbstractC0421a.f4949e, zi3Var);
        }
    }

    @Override // p000.gi4
    /* JADX INFO: renamed from: I */
    public final boolean mo788I(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        if (this.f2269N) {
            long jM4667a = chd.m4667a(keyEvent);
            int i = rh4.f59280O;
            if ((rh4.m20661a(jM4667a, zgd.m25621F()) || rh4.m20661a(chd.m4667a(keyEvent), zgd.m25622G())) && ahd.m421a(chd.m4668b(keyEvent), 2) && !chd.m4671e(keyEvent)) {
                boolean z = this.f2352i0.f2363d == Orientation.Vertical;
                C0098f c0098f = this.f2355l0;
                if (z) {
                    int iM857a1 = (int) (c0098f.m857a1() & 4294967295L);
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(rh4.m20661a(chd.m4667a(keyEvent), zgd.m25622G()) ? iM857a1 : -iM857a1)));
                } else {
                    int iM857a2 = (int) (c0098f.m857a1() >> 32);
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(rh4.m20661a(chd.m4667a(keyEvent), zgd.m25622G()) ? iM857a2 : -iM857a2)) << 32);
                }
                wfb.m23926u(m9971N0(), null, null, new ScrollableNode$onKeyEvent$1(this, jFloatToRawIntBits, null), 3);
                return true;
            }
        }
        return false;
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: O0 */
    public final boolean mo574O0() {
        return false;
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: R0 */
    public final void mo36R0() {
        if (this.f34836I) {
            fb2 fb2Var = te1.m21979L(this).f4327T;
            C0100h c0100h = this.f2351h0;
            c0100h.getClass();
            c0100h.f2258a = new f32(new or3(fb2Var));
        }
        C0106n c0106n = this.f2358o0;
        if (c0106n != null) {
            c0106n.f2298c = te1.m21979L(this).f4327T;
        }
        C0118x c0118x = this.f2359p0;
        if (c0118x != null) {
            c0118x.f2298c = te1.m21979L(this).f4327T;
        }
    }

    @Override // p000.ea2, p000.ng7
    /* JADX INFO: renamed from: g */
    public final void mo840g() {
        mo818K();
        if (this.f34836I) {
            fb2 fb2Var = te1.m21979L(this).f4327T;
            C0100h c0100h = this.f2351h0;
            c0100h.getClass();
            c0100h.f2258a = new f32(new or3(fb2Var));
        }
        C0106n c0106n = this.f2358o0;
        if (c0106n != null) {
            c0106n.f2298c = te1.m21979L(this).f4327T;
        }
        C0118x c0118x = this.f2359p0;
        if (c0118x != null) {
            c0118x.f2298c = te1.m21979L(this).f4327T;
        }
    }

    @Override // androidx.compose.foundation.gestures.AbstractC0103k
    /* JADX INFO: renamed from: g1 */
    public final Object mo841g1(zi3 zi3Var, Continuation continuation) {
        MutatePriority mutatePriority = MutatePriority.UserInput;
        C0116v c0116v = this.f2352i0;
        Object objM934f = c0116v.m934f(mutatePriority, new ScrollableNode$drag$2$1(zi3Var, c0116v, null), (ContinuationImpl) continuation);
        return objM934f == CoroutineSingletons.COROUTINE_SUSPENDED ? objM934f : xfa.f68157a;
    }

    @Override // androidx.compose.foundation.gestures.AbstractC0103k
    /* JADX INFO: renamed from: l1 */
    public final void mo842l1(long j) {
    }

    @Override // androidx.compose.foundation.gestures.AbstractC0103k
    /* JADX INFO: renamed from: m1 */
    public final void mo843m1(rk2 rk2Var) {
        wfb.m23926u(this.f2350g0.m1449c(), null, null, new ScrollableNode$onDragStopped$1(rk2Var, this, null), 3);
    }

    @Override // p000.gi4
    /* JADX INFO: renamed from: n */
    public final boolean mo801n(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.foundation.gestures.AbstractC0103k
    /* JADX INFO: renamed from: r1 */
    public final boolean mo844r1() {
        C0116v c0116v = this.f2352i0;
        if (c0116v.f2360a.mo863a()) {
            return true;
        }
        C0077c c0077c = c0116v.f2361b;
        if (c0077c == null) {
            return false;
        }
        lo2 lo2Var = c0077c.f1740c;
        EdgeEffect edgeEffect = lo2Var.f49924d;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? AbstractC0818bo.m3991b(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = lo2Var.f49925e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? AbstractC0818bo.m3991b(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = lo2Var.f49926f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? AbstractC0818bo.m3991b(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = lo2Var.f49927g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? AbstractC0818bo.m3991b(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    /* JADX INFO: renamed from: u1 */
    public final void m928u1(ni0 ni0Var, x63 x63Var, v56 v56Var, do8 do8Var, C0077c c0077c, Orientation orientation, boolean z, boolean z2) {
        boolean z3;
        boolean z4 = true;
        boolean z5 = false;
        if (this.f2269N != z) {
            this.f2353j0.f2315b = z;
            z3 = true;
        } else {
            z3 = false;
        }
        x63 x63Var2 = x63Var == null ? this.f2351h0 : x63Var;
        C0116v c0116v = this.f2352i0;
        if (!fa4.m11650l(c0116v.f2360a, do8Var)) {
            c0116v.f2360a = do8Var;
            z5 = true;
        }
        c0116v.f2361b = c0077c;
        if (c0116v.f2363d != orientation) {
            c0116v.f2363d = orientation;
            z5 = true;
        }
        if (c0116v.f2364e != z2) {
            c0116v.f2364e = z2;
        } else {
            z4 = z5;
        }
        c0116v.f2362c = x63Var2;
        c0116v.f2365f = this.f2350g0;
        C0098f c0098f = this.f2355l0;
        c0098f.f2246J = orientation;
        c0098f.f2248L = z2;
        c0098f.f2249M = ni0Var;
        this.f2348e0 = c0077c;
        this.f2349f0 = x63Var;
        zl8 zl8Var = AbstractC0110r.f2310a;
        Orientation orientation2 = c0116v.f2363d;
        Orientation orientation3 = Orientation.Vertical;
        if (orientation2 != orientation3) {
            orientation3 = Orientation.Horizontal;
        }
        m890t1(zl8Var, z, v56Var, orientation3, z4);
        if (z3) {
            this.f2356m0 = null;
            this.f2357n0 = null;
            thb.m22062u(this);
        }
    }
}
