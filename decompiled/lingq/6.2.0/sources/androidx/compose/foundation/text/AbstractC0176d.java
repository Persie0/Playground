package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.C0205f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.p002ui.text.style.ResolvedTextDirection;
import androidx.compose.runtime.internal.C0282a;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.AbstractC3122is;
import p000.AbstractC3584sr;
import p000.AbstractC3685vh;
import p000.C3186kj;
import p000.C3419on;
import p000.C3611th;
import p000.aq4;
import p000.b16;
import p000.bb0;
import p000.bl2;
import p000.cx9;
import p000.di0;
import p000.e16;
import p000.e28;
import p000.fa4;
import p000.fb2;
import p000.fw9;
import p000.h97;
import p000.ht5;
import p000.hw9;
import p000.jc9;
import p000.l70;
import p000.l77;
import p000.lda;
import p000.mo9;
import p000.mq6;
import p000.nj0;
import p000.nv8;
import p000.nv9;
import p000.og7;
import p000.oha;
import p000.oq6;
import p000.p84;
import p000.pb1;
import p000.qh0;
import p000.rm1;
import p000.rw9;
import p000.se1;
import p000.sm1;
import p000.sw9;
import p000.t66;
import p000.tj3;
import p000.ui3;
import p000.vi3;
import p000.vv9;
import p000.vz1;
import p000.w04;
import p000.we1;
import p000.x18;
import p000.xc9;
import p000.xfa;
import p000.xt9;
import p000.ye1;
import p000.ym1;
import p000.yw4;

/* JADX INFO: renamed from: androidx.compose.foundation.text.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0176d {
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v28 nw4
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.ModVisitor.anonymousCallArgMod(ModVisitor.java:535)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.ModVisitor.processAnonymousConstructor(ModVisitor.java:528)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:111)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    /* JADX INFO: renamed from: a */
    public static final void m1068a(final p000.vv9 r65, p000.vi3 r66, p000.e16 r67, final p000.vx9 r68, final p000.kwa r69, p000.vi3 r70, final p000.v56 r71, final p000.pd9 r72, final boolean r73, final int r74, final int r75, p000.w04 r76, p000.gj4 r77, final boolean r78, final androidx.compose.runtime.internal.C0282a r79, p000.ye1 r80, int r81, int r82) {
        /*
            Method dump skipped, instruction units count: 2542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.AbstractC0176d.m1068a(vv9, vi3, e16, vx9, kwa, vi3, v56, pd9, boolean, int, int, w04, gj4, boolean, androidx.compose.runtime.internal.a, ye1, int, int):void");
    }

    /* JADX INFO: renamed from: b */
    public static final void m1069b(e16 e16Var, C0205f c0205f, C0282a c0282a, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(2036174316);
        int i2 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i | (tj3Var.m22124i(c0205f) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, true);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16Var);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            AbstractC3122is.m14087a(c0205f, c0282a, tj3Var, (i2 >> 3) & 126);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new di0(i, 3, e16Var, c0205f, c0282a);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m1070c(C0205f c0205f, boolean z, ye1 ye1Var, int i) {
        sw9 sw9VarM25363d;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(626339208);
        int i2 = (tj3Var.m22124i(c0205f) ? 4 : 2) | i | (tj3Var.m22122h(z) ? 32 : 16);
        if (!tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            tj3Var.m22102U();
        } else if (z) {
            tj3Var.m22111b0(1530097388);
            yw4 yw4Var = c0205f.f3079d;
            rw9 rw9Var = null;
            if (yw4Var != null && (sw9VarM25363d = yw4Var.m25363d()) != null) {
                rw9 rw9Var2 = sw9VarM25363d.f61519a;
                yw4 yw4Var2 = c0205f.f3079d;
                if (!(yw4Var2 != null ? yw4Var2.f70584p : true)) {
                    rw9Var = rw9Var2;
                }
            }
            if (rw9Var == null) {
                tj3Var.m22111b0(1530097387);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(1530097388);
                if (cx9.m9921c(c0205f.m1114o().f65991b)) {
                    tj3Var.m22111b0(2110860558);
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(2109807302);
                    int iMo13411t = c0205f.f3077b.mo13411t((int) (c0205f.m1114o().f65991b >> 32));
                    int iMo13411t2 = c0205f.f3077b.mo13411t((int) (c0205f.m1114o().f65991b & 4294967295L));
                    ResolvedTextDirection resolvedTextDirectionM20954a = rw9Var.m20954a(iMo13411t);
                    ResolvedTextDirection resolvedTextDirectionM20954a2 = rw9Var.m20954a(Math.max(iMo13411t2 - 1, 0));
                    yw4 yw4Var3 = c0205f.f3079d;
                    if (yw4Var3 == null || !((Boolean) ((xc9) yw4Var3.f70581m).getValue()).booleanValue()) {
                        tj3Var.m22111b0(2110490542);
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(2110225306);
                        AbstractC3584sr.m21635m(true, resolvedTextDirectionM20954a, c0205f, tj3Var, ((i2 << 6) & 896) | 6);
                        tj3Var.m22139q(false);
                    }
                    yw4 yw4Var4 = c0205f.f3079d;
                    if (yw4Var4 == null || !((Boolean) ((xc9) yw4Var4.f70582n).getValue()).booleanValue()) {
                        tj3Var.m22111b0(2110838734);
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(2110574459);
                        AbstractC3584sr.m21635m(false, resolvedTextDirectionM20954a2, c0205f, tj3Var, ((i2 << 6) & 896) | 6);
                        tj3Var.m22139q(false);
                    }
                    tj3Var.m22139q(false);
                }
                yw4 yw4Var5 = c0205f.f3079d;
                if (yw4Var5 != null) {
                    t66 t66Var = yw4Var5.f70580l;
                    if (!fa4.m11650l(c0205f.f3096u.f65990a.f54604b, c0205f.m1114o().f65990a.f54604b)) {
                        ((xc9) t66Var).setValue(Boolean.FALSE);
                    }
                    if (yw4Var5.m25361b()) {
                        if (((Boolean) ((xc9) t66Var).getValue()).booleanValue()) {
                            c0205f.m1118s();
                        } else {
                            c0205f.m1115p();
                        }
                    }
                }
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(false);
        } else {
            tj3Var.m22111b0(1989076778);
            tj3Var.m22139q(false);
            c0205f.m1115p();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new rm1(c0205f, z, i);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m1071d(C0205f c0205f, ye1 ye1Var, int i) {
        C3419on c3419onM1113n;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1436003720);
        int i2 = (tj3Var.m22124i(c0205f) ? 4 : 2) | i;
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            yw4 yw4Var = c0205f.f3079d;
            if (yw4Var == null || !((Boolean) ((xc9) yw4Var.f70583o).getValue()).booleanValue() || (c3419onM1113n = c0205f.m1113n()) == null || c3419onM1113n.f54604b.length() <= 0) {
                tj3Var.m22111b0(-2111042550);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-2112351432);
                boolean zM22120g = tj3Var.m22120g(c0205f);
                Object objM22097O = tj3Var.m22097O();
                p84 p84Var = we1.f66679a;
                if (zM22120g || objM22097O == p84Var) {
                    objM22097O = new nv9(c0205f);
                    tj3Var.m22131l0(objM22097O);
                }
                xt9 xt9Var = (xt9) objM22097O;
                fb2 fb2Var = (fb2) tj3Var.m22128k(AbstractC0402n.f4816h);
                mq6 mq6Var = c0205f.f3077b;
                long j = c0205f.m1114o().f65991b;
                int i3 = cx9.f34693c;
                int iMo13411t = mq6Var.mo13411t((int) (j >> 32));
                yw4 yw4Var2 = c0205f.f3079d;
                sw9 sw9VarM25363d = yw4Var2 != null ? yw4Var2.m25363d() : null;
                sw9VarM25363d.getClass();
                rw9 rw9Var = sw9VarM25363d.f61519a;
                e28 e28VarM20956c = rw9Var.m20956c(l70.m15945h(iMo13411t, 0, rw9Var.f59975a.f58295a.f54604b.length()));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((fb2Var.mo912g0(2.0f) / 2.0f) + e28VarM20956c.f36620a)) << 32) | (((long) Float.floatToRawIntBits(e28VarM20956c.f36623d)) & 4294967295L);
                boolean zM22118f = tj3Var.m22118f(jFloatToRawIntBits);
                Object objM22097O2 = tj3Var.m22097O();
                if (zM22118f || objM22097O2 == p84Var) {
                    objM22097O2 = new ym1(jFloatToRawIntBits);
                    tj3Var.m22131l0(objM22097O2);
                }
                oq6 oq6Var = (oq6) objM22097O2;
                boolean zM22124i = tj3Var.m22124i(xt9Var) | tj3Var.m22124i(c0205f);
                Object objM22097O3 = tj3Var.m22097O();
                if (zM22124i || objM22097O3 == p84Var) {
                    objM22097O3 = new C0167c(xt9Var, c0205f);
                    tj3Var.m22131l0(objM22097O3);
                }
                e16 e16VarM16957a = mo9.m16957a(b16.f7762a, xt9Var, (PointerInputEventHandler) objM22097O3);
                boolean zM22118f2 = tj3Var.m22118f(jFloatToRawIntBits);
                Object objM22097O4 = tj3Var.m22097O();
                if (zM22118f2 || objM22097O4 == p84Var) {
                    objM22097O4 = new C3611th(2, jFloatToRawIntBits);
                    tj3Var.m22131l0(objM22097O4);
                }
                AbstractC3685vh.m23281a(oq6Var, nv8.m17643c(e16VarM16957a, false, (vi3) objM22097O4), 0L, tj3Var, 0);
                tj3Var.m22139q(false);
            }
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3186kj(c0205f, i, 3);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final Object m1072e(og7 og7Var, xt9 xt9Var, Continuation continuation) {
        Object objM23649s = vz1.m23649s(new C0162x3c48fd5d(og7Var, xt9Var, null), continuation);
        return objM23649s == CoroutineSingletons.COROUTINE_SUSPENDED ? objM23649s : xfa.f68157a;
    }

    /* JADX INFO: renamed from: f */
    public static final void m1073f(yw4 yw4Var) {
        hw9 hw9Var = yw4Var.f70573e;
        if (hw9Var != null) {
            yw4Var.f70590v.invoke(vv9.m23560a((vv9) yw4Var.f70572d.f8655a, null, 0L, 3));
            fw9 fw9Var = hw9Var.f43078a;
            AtomicReference atomicReference = fw9Var.f39815b;
            while (!atomicReference.compareAndSet(hw9Var, null)) {
                if (atomicReference.get() != hw9Var) {
                }
            }
            fw9Var.f39814a.mo1081c();
        }
        yw4Var.f70573e = null;
    }

    /* JADX INFO: renamed from: g */
    public static final void m1074g(yw4 yw4Var, vv9 vv9Var, mq6 mq6Var) {
        jc9 jc9VarM16139y = lda.m16139y();
        vi3 vi3VarMo3163e = jc9VarM16139y != null ? jc9VarM16139y.mo3163e() : null;
        jc9 jc9VarM16106F = lda.m16106F(jc9VarM16139y);
        try {
            sw9 sw9VarM25363d = yw4Var.m25363d();
            if (sw9VarM25363d == null) {
                return;
            }
            hw9 hw9Var = yw4Var.f70573e;
            if (hw9Var == null) {
                return;
            }
            aq4 aq4VarM25362c = yw4Var.m25362c();
            if (aq4VarM25362c == null) {
                return;
            }
            pb1.m19023K(vv9Var, yw4Var.f70569a, sw9VarM25363d.f61519a, aq4VarM25362c, hw9Var, yw4Var.m25361b(), mq6Var);
        } finally {
            lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m1075h(fw9 fw9Var, yw4 yw4Var, vv9 vv9Var, w04 w04Var, mq6 mq6Var) {
        bl2 bl2Var = yw4Var.f70572d;
        sm1 sm1Var = yw4Var.f70590v;
        sm1 sm1Var2 = yw4Var.f70591w;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        bb0 bb0Var = new bb0(17, sm1Var, bl2Var, ref$ObjectRef);
        h97 h97Var = fw9Var.f39814a;
        h97Var.mo1085g(vv9Var, w04Var, bb0Var, sm1Var2);
        hw9 hw9Var = new hw9(fw9Var, h97Var);
        fw9Var.f39815b.set(hw9Var);
        ref$ObjectRef.f47718a = hw9Var;
        yw4Var.f70573e = hw9Var;
        m1074g(yw4Var, vv9Var, mq6Var);
    }
}
