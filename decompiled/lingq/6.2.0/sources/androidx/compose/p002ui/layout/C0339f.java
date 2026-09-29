package androidx.compose.p002ui.layout;

import android.view.ViewGroup;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.node.C0360j;
import androidx.compose.p002ui.node.C0361k;
import androidx.compose.p002ui.node.LayoutNode$UsageByParent;
import androidx.compose.p002ui.platform.AbstractC0414z;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.PausedCompositionState;
import androidx.compose.runtime.internal.C0282a;
import java.util.List;
import kotlin.KotlinNothingValueException;
import p000.bb9;
import p000.cf1;
import p000.cfa;
import p000.dy6;
import p000.f66;
import p000.fa4;
import p000.i54;
import p000.i67;
import p000.jc9;
import p000.kf1;
import p000.lda;
import p000.n66;
import p000.nc9;
import p000.o66;
import p000.oe1;
import p000.om8;
import p000.pf1;
import p000.pm8;
import p000.pm9;
import p000.pq4;
import p000.qq4;
import p000.rm9;
import p000.rq4;
import p000.sm9;
import p000.sq4;
import p000.thb;
import p000.tj3;
import p000.ui3;
import p000.uq4;
import p000.ux5;
import p000.v48;
import p000.v63;
import p000.vi3;
import p000.x66;
import p000.xc9;
import p000.xfa;
import p000.xq4;
import p000.ye1;
import p000.yq4;
import p000.ze1;
import p000.zi3;
import p000.zz6;

/* JADX INFO: renamed from: androidx.compose.ui.layout.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0339f implements oe1 {

    /* JADX INFO: renamed from: H */
    public final x66 f4189H;

    /* JADX INFO: renamed from: I */
    public int f4190I;

    /* JADX INFO: renamed from: J */
    public int f4191J;

    /* JADX INFO: renamed from: K */
    public final String f4192K;

    /* JADX INFO: renamed from: a */
    public final C0357g f4193a;

    /* JADX INFO: renamed from: b */
    public kf1 f4194b;

    /* JADX INFO: renamed from: c */
    public sm9 f4195c;

    /* JADX INFO: renamed from: d */
    public int f4196d;

    /* JADX INFO: renamed from: e */
    public int f4197e;

    /* JADX INFO: renamed from: f */
    public final n66 f4198f;

    /* JADX INFO: renamed from: g */
    public final n66 f4199g;

    /* JADX INFO: renamed from: h */
    public final uq4 f4200h;

    /* JADX INFO: renamed from: i */
    public final rq4 f4201i;

    /* JADX INFO: renamed from: j */
    public final n66 f4202j;

    /* JADX INFO: renamed from: k */
    public final rm9 f4203k;

    /* JADX INFO: renamed from: l */
    public final n66 f4204l;

    public C0339f(C0357g c0357g, sm9 sm9Var) {
        this.f4193a = c0357g;
        this.f4195c = sm9Var;
        long[] jArr = om8.f54590a;
        this.f4198f = new n66();
        this.f4199g = new n66();
        this.f4200h = new uq4(this);
        this.f4201i = new rq4(this);
        this.f4202j = new n66();
        this.f4203k = new rm9();
        this.f4204l = new n66();
        this.f4189H = new x66(new Object[16]);
        this.f4192K = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    /* JADX INFO: renamed from: c */
    public static final void m1494c(C0339f c0339f, Object obj) {
        C0357g c0357g = c0339f.f4193a;
        c0339f.m1501h();
        C0357g c0357g2 = (C0357g) c0339f.f4202j.m17259k(obj);
        if (c0357g2 != null) {
            if (c0339f.f4191J <= 0) {
                i54.m13663b("No pre-composed items to dispose");
            }
            int iM24312j = ((x66) ((f66) c0357g.m1603p()).f38520b).m24312j(c0357g2);
            if (iM24312j < ((x66) ((f66) c0357g.m1603p()).f38520b).f67832c - c0339f.f4191J) {
                i54.m13663b("Item is not in pre-composed item range");
            }
            c0339f.f4190I++;
            c0339f.f4191J--;
            sq4 sq4Var = (sq4) c0339f.f4198f.m17255g(c0357g2);
            if (sq4Var != null) {
                m1495e(sq4Var);
            }
            int i = (((x66) ((f66) c0357g.m1603p()).f38520b).f67832c - c0339f.f4191J) - c0339f.f4190I;
            c0339f.m1504k(iM24312j, i);
            c0339f.m1500g(i);
        }
        if (c0339f.f4189H.m24311i(obj)) {
            C0357g.m1555b0(c0357g, true, 6);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m1495e(sq4 sq4Var) {
        o66 o66Var;
        i67 i67Var = sq4Var.f61242f;
        if (i67Var != null) {
            i67Var.f43601h.set(PausedCompositionState.Cancelled);
            v48 v48Var = i67Var.f43604k;
            if (((o66) v48Var.f64851h).m725c()) {
                o66Var = (o66) v48Var.f64851h;
                o66 o66Var2 = pm8.f56484a;
                v48Var.f64851h = new o66();
                ((x66) v48Var.f64847d).m24310h();
            } else {
                o66Var = null;
            }
            v48Var.m23101d();
            pf1 pf1Var = i67Var.f43594a;
            pf1Var.f56031L = null;
            if (o66Var != null) {
                pf1Var.f56035P.f64854k = o66Var;
                pf1Var.f56037R = 2;
            }
            sq4Var.f61242f = null;
            pf1 pf1Var2 = sq4Var.f61239c;
            if (pf1Var2 != null) {
                pf1Var2.mo1823a();
            }
            sq4Var.f61239c = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x004f A[LOOP:0: B:5:0x0014->B:17:0x004f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[EDGE_INSN: B:21:0x0052->B:18:0x0052 BREAK  A[LOOP:0: B:5:0x0014->B:17:0x004f], SYNTHETIC] */
    @Override // p000.oe1
    /* JADX INFO: renamed from: a */
    public final void mo1496a() {
        pf1 pf1Var;
        C0357g c0357g = this.f4193a;
        c0357g.f4319L = true;
        n66 n66Var = this.f4198f;
        Object[] objArr = n66Var.f52401c;
        long[] jArr = n66Var.f52399a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (pf1Var = ((sq4) objArr[(i << 3) + i3]).f61239c) != null) {
                            pf1Var.mo1823a();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        c0357g.m1578V();
        c0357g.f4319L = false;
        n66Var.m17249a();
        this.f4199g.m17249a();
        this.f4191J = 0;
        this.f4190I = 0;
        this.f4202j.m17249a();
        m1501h();
    }

    @Override // p000.oe1
    /* JADX INFO: renamed from: b */
    public final void mo1497b() {
        m1503j(true);
    }

    /* JADX INFO: renamed from: d */
    public final void m1498d(sq4 sq4Var, boolean z) {
        i67 i67Var = sq4Var.f61242f;
        if (i67Var != null) {
            jc9 jc9VarM16139y = lda.m16139y();
            vi3 vi3VarMo3163e = jc9VarM16139y != null ? jc9VarM16139y.mo3163e() : null;
            jc9 jc9VarM16106F = lda.m16106F(jc9VarM16139y);
            try {
                C0357g c0357g = this.f4193a;
                c0357g.f4319L = true;
                if (z) {
                    while (!i67Var.m13699c()) {
                        try {
                            i67Var.m13701e(new v63(20));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                i67Var.m13697a();
                sq4Var.f61242f = null;
                c0357g.f4319L = false;
                lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
            } catch (Throwable th2) {
                lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final pm9 m1499f(Object obj) {
        return !this.f4193a.m1569L() ? new xq4() : new yq4(this, obj);
    }

    /* JADX INFO: renamed from: g */
    public final void m1500g(int i) {
        boolean z;
        boolean z2 = false;
        this.f4190I = 0;
        List listM1603p = this.f4193a.m1603p();
        f66 f66Var = (f66) listM1603p;
        int i2 = (((x66) f66Var.f38520b).f67832c - this.f4191J) - 1;
        if (i <= i2) {
            this.f4203k.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    Object objM17255g = this.f4198f.m17255g((C0357g) f66Var.get(i3));
                    objM17255g.getClass();
                    this.f4203k.f59554a.m13689b(((sq4) objM17255g).f61237a);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.f4195c.mo3848d(this.f4203k);
            jc9 jc9VarM16139y = lda.m16139y();
            vi3 vi3VarMo3163e = jc9VarM16139y != null ? jc9VarM16139y.mo3163e() : null;
            jc9 jc9VarM16106F = lda.m16106F(jc9VarM16139y);
            z = false;
            while (i2 >= i) {
                try {
                    C0357g c0357g = (C0357g) ((f66) listM1603p).get(i2);
                    Object objM17255g2 = this.f4198f.m17255g(c0357g);
                    objM17255g2.getClass();
                    sq4 sq4Var = (sq4) objM17255g2;
                    Object obj = sq4Var.f61237a;
                    if (this.f4203k.f59554a.m722a(obj)) {
                        this.f4190I++;
                        if (((Boolean) ((xc9) sq4Var.f61243g).getValue()).booleanValue()) {
                            qq4 qq4Var = c0357g.f4337b0;
                            C0361k c0361k = qq4Var.f58070p;
                            LayoutNode$UsageByParent layoutNode$UsageByParent = LayoutNode$UsageByParent.NotUsed;
                            c0361k.f4426l = layoutNode$UsageByParent;
                            C0360j c0360j = qq4Var.f58071q;
                            if (c0360j != null) {
                                c0360j.f4390j = layoutNode$UsageByParent;
                            }
                            m1506m(sq4Var, false);
                            if (sq4Var.f61244h) {
                                z = true;
                            }
                        }
                    } else {
                        C0357g c0357g2 = this.f4193a;
                        c0357g2.f4319L = true;
                        this.f4198f.m17259k(c0357g);
                        pf1 pf1Var = sq4Var.f61239c;
                        if (pf1Var != null) {
                            pf1Var.mo1823a();
                        }
                        this.f4193a.m1579W(i2, 1);
                        c0357g2.f4319L = false;
                    }
                    this.f4199g.m17259k(obj);
                    i2--;
                } catch (Throwable th) {
                    lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                    throw th;
                }
            }
            lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
        } else {
            z = false;
        }
        if (z) {
            synchronized (nc9.f52602c) {
                o66 o66Var = nc9.f52609j.f60422h;
                if (o66Var != null && o66Var.m725c()) {
                    z2 = true;
                }
            }
            if (z2) {
                nc9.m17349a();
            }
        }
        m1501h();
    }

    /* JADX INFO: renamed from: h */
    public final void m1501h() {
        int i = ((x66) ((f66) this.f4193a.m1603p()).f38520b).f67832c;
        n66 n66Var = this.f4198f;
        if (n66Var.f52403e != i) {
            i54.m13662a("Inconsistency between the count of nodes tracked by the state (" + n66Var.f52403e + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i - this.f4190I) - this.f4191J < 0) {
            StringBuilder sbM22998u = ux5.m22998u("Incorrect state. Total children ", i, ". Reusable children ");
            sbM22998u.append(this.f4190I);
            sbM22998u.append(". Precomposed children ");
            sbM22998u.append(this.f4191J);
            i54.m13662a(sbM22998u.toString());
        }
        n66 n66Var2 = this.f4202j;
        if (n66Var2.f52403e == this.f4191J) {
            return;
        }
        i54.m13662a("Incorrect state. Precomposed children " + this.f4191J + ". Map size " + n66Var2.f52403e);
    }

    @Override // p000.oe1
    /* JADX INFO: renamed from: i */
    public final void mo1502i() {
        m1503j(false);
    }

    /* JADX INFO: renamed from: j */
    public final void m1503j(boolean z) {
        this.f4191J = 0;
        this.f4202j.m17249a();
        List listM1603p = this.f4193a.m1603p();
        int i = ((x66) ((f66) listM1603p).f38520b).f67832c;
        if (this.f4190I != i) {
            this.f4190I = i;
            jc9 jc9VarM16139y = lda.m16139y();
            vi3 vi3VarMo3163e = jc9VarM16139y != null ? jc9VarM16139y.mo3163e() : null;
            jc9 jc9VarM16106F = lda.m16106F(jc9VarM16139y);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    C0357g c0357g = (C0357g) ((f66) listM1603p).get(i2);
                    sq4 sq4Var = (sq4) this.f4198f.m17255g(c0357g);
                    if (sq4Var != null && ((Boolean) ((xc9) sq4Var.f61243g).getValue()).booleanValue()) {
                        qq4 qq4Var = c0357g.f4337b0;
                        C0361k c0361k = qq4Var.f58070p;
                        LayoutNode$UsageByParent layoutNode$UsageByParent = LayoutNode$UsageByParent.NotUsed;
                        c0361k.f4426l = layoutNode$UsageByParent;
                        C0360j c0360j = qq4Var.f58071q;
                        if (c0360j != null) {
                            c0360j.f4390j = layoutNode$UsageByParent;
                        }
                        m1506m(sq4Var, z);
                        sq4Var.f61237a = AbstractC0337d.f4187a;
                    }
                } catch (Throwable th) {
                    lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                    throw th;
                }
            }
            lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
            this.f4199g.m17249a();
        }
        m1501h();
    }

    /* JADX INFO: renamed from: k */
    public final void m1504k(int i, int i2) {
        C0357g c0357g = this.f4193a;
        c0357g.f4319L = true;
        c0357g.m1573P(i, i2, 1);
        c0357g.f4319L = false;
    }

    /* JADX INFO: renamed from: l */
    public final void m1505l(Object obj, zi3 zi3Var, boolean z) {
        C0357g c0357g = this.f4193a;
        if (c0357g.m1569L()) {
            m1501h();
            if (this.f4199g.m17251c(obj)) {
                return;
            }
            this.f4204l.m17259k(obj);
            n66 n66Var = this.f4202j;
            Object objM17255g = n66Var.m17255g(obj);
            if (objM17255g == null) {
                objM17255g = m1508o(obj);
                if (objM17255g != null) {
                    m1504k(((x66) ((f66) c0357g.m1603p()).f38520b).m24312j(objM17255g), ((x66) ((f66) c0357g.m1603p()).f38520b).f67832c);
                    this.f4191J++;
                } else {
                    int i = ((x66) ((f66) c0357g.m1603p()).f38520b).f67832c;
                    C0357g c0357g2 = new C0357g(2);
                    c0357g.f4319L = true;
                    c0357g.m1561D(i, c0357g2);
                    c0357g.f4319L = false;
                    this.f4191J++;
                    objM17255g = c0357g2;
                }
                n66Var.m17261m(obj, objM17255g);
            }
            m1507n((C0357g) objM17255g, obj, z, zi3Var);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m1506m(final sq4 sq4Var, boolean z) {
        pf1 pf1Var;
        if (z || !sq4Var.f61244h) {
            sq4Var.f61243g = AbstractC0278f.m1260j(Boolean.FALSE);
        } else {
            ((xc9) sq4Var.f61243g).setValue(Boolean.FALSE);
        }
        if (sq4Var.f61242f != null) {
            m1495e(sq4Var);
            return;
        }
        if (z) {
            pf1 pf1Var2 = sq4Var.f61239c;
            if (pf1Var2 != null) {
                pf1Var2.m19097m();
                return;
            }
            return;
        }
        zz6 zz6VarM25913getOutOfFrameExecutor = ((ViewTreeObserverOnGlobalLayoutListenerC0391c) pq4.m19457a(this.f4193a)).m25913getOutOfFrameExecutor();
        if (zz6VarM25913getOutOfFrameExecutor != null) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0391c) zz6VarM25913getOutOfFrameExecutor).m1736L(new ui3() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$deactivateOutOfFrame$1
                {
                    super(0);
                }

                @Override // p000.ui3
                /* JADX INFO: renamed from: a */
                public final Object mo0a() {
                    pf1 pf1Var3;
                    sq4 sq4Var2 = sq4Var;
                    if (!((Boolean) ((xc9) sq4Var2.f61243g).getValue()).booleanValue() && (pf1Var3 = sq4Var2.f61239c) != null) {
                        pf1Var3.m19097m();
                    }
                    return xfa.f68157a;
                }
            });
        } else {
            if (sq4Var.f61244h || (pf1Var = sq4Var.f61239c) == null) {
                return;
            }
            pf1Var.m19097m();
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0092 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bf, B:64:0x00d3, B:66:0x00d7, B:72:0x010b, B:67:0x00e4, B:68:0x00ef, B:70:0x00f3, B:71:0x0108, B:62:0x00c2, B:56:0x0092, B:58:0x00a0, B:75:0x0115, B:76:0x011f), top: B:79:0x0076 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bf, B:64:0x00d3, B:66:0x00d7, B:72:0x010b, B:67:0x00e4, B:68:0x00ef, B:70:0x00f3, B:71:0x0108, B:62:0x00c2, B:56:0x0092, B:58:0x00a0, B:75:0x0115, B:76:0x011f), top: B:79:0x0076 }] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: n */
    public final void m1507n(C0357g c0357g, Object obj, boolean z, zi3 zi3Var) {
        boolean z2;
        pf1 pf1Var;
        n66 n66Var = this.f4198f;
        Object objM17255g = n66Var.m17255g(c0357g);
        Object obj2 = objM17255g;
        if (objM17255g == null) {
            C0282a c0282a = AbstractC0335b.f4181a;
            sq4 sq4Var = new sq4();
            sq4Var.f61237a = obj;
            sq4Var.f61238b = c0282a;
            sq4Var.f61239c = null;
            sq4Var.f61243g = AbstractC0278f.m1260j(Boolean.TRUE);
            n66Var.m17261m(c0357g, sq4Var);
            obj2 = sq4Var;
        }
        final sq4 sq4Var2 = (sq4) obj2;
        boolean z3 = sq4Var2.f61238b != zi3Var;
        if (sq4Var2.f61242f != null) {
            if (z3) {
                m1495e(sq4Var2);
            } else if (z) {
                return;
            } else {
                m1498d(sq4Var2, true);
            }
        }
        pf1 pf1Var2 = sq4Var2.f61239c;
        if (pf1Var2 != null) {
            synchronized (pf1Var2.f56041d) {
                z2 = pf1Var2.f56028I.f52403e > 0;
            }
        } else {
            z2 = true;
        }
        if (z3 || z2 || sq4Var2.f61240d) {
            sq4Var2.f61238b = zi3Var;
            if (sq4Var2.f61242f != null) {
                i54.m13662a("new subcompose call while paused composition is still active");
            }
            jc9 jc9VarM16139y = lda.m16139y();
            vi3 vi3VarMo3163e = jc9VarM16139y != null ? jc9VarM16139y.mo3163e() : null;
            jc9 jc9VarM16106F = lda.m16106F(jc9VarM16139y);
            try {
                C0357g c0357g2 = this.f4193a;
                c0357g2.f4319L = true;
                pf1 pf1Var3 = sq4Var2.f61239c;
                kf1 kf1Var = this.f4194b;
                if (kf1Var == null) {
                    i54.m13664c("parent composition reference not set");
                    throw new KotlinNothingValueException();
                }
                if (pf1Var3 == null) {
                    if (z) {
                        ViewGroup.LayoutParams layoutParams = AbstractC0414z.f4878a;
                        pf1Var = new pf1(kf1Var, new cfa(c0357g));
                    } else {
                        ViewGroup.LayoutParams layoutParams2 = AbstractC0414z.f4878a;
                        pf1Var = new pf1(kf1Var, new cfa(c0357g));
                    }
                    pf1Var3 = pf1Var;
                } else {
                    if (pf1Var3.f56037R == 3) {
                        if (z) {
                            ViewGroup.LayoutParams layoutParams3 = AbstractC0414z.f4878a;
                            pf1Var = new pf1(kf1Var, new cfa(c0357g));
                        } else {
                            ViewGroup.LayoutParams layoutParams4 = AbstractC0414z.f4878a;
                            pf1Var = new pf1(kf1Var, new cfa(c0357g));
                        }
                        pf1Var3 = pf1Var;
                    }
                }
                sq4Var2.f61239c = pf1Var3;
                final zi3 c0282a2 = sq4Var2.f61238b;
                if (((ViewTreeObserverOnGlobalLayoutListenerC0391c) pq4.m19457a(this.f4193a)).m25913getOutOfFrameExecutor() != null) {
                    sq4Var2.f61244h = false;
                } else {
                    sq4Var2.f61244h = true;
                    c0282a2 = new C0282a(1524156494, true, new zi3() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$subcompose$4$1$composable$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // p000.zi3
                        public final Object invoke(Object obj3, Object obj4) {
                            ye1 ye1Var = (ye1) obj3;
                            int iIntValue = ((Number) obj4).intValue();
                            tj3 tj3Var = (tj3) ye1Var;
                            if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                Boolean bool = (Boolean) ((xc9) sq4Var2.f61243g).getValue();
                                boolean zBooleanValue = bool.booleanValue();
                                tj3Var.m22117e0(bool);
                                boolean zM22122h = tj3Var.m22122h(zBooleanValue);
                                if (zBooleanValue) {
                                    c0282a2.invoke(tj3Var, 0);
                                } else {
                                    if (tj3Var.f62398l != 0) {
                                        cf1.m4605a("No nodes can be emitted before calling deactivateToEndGroup");
                                    }
                                    if (!tj3Var.f62384S) {
                                        if (zM22122h) {
                                            bb9 bb9Var = tj3Var.f62372G;
                                            int i = bb9Var.f8288g;
                                            int i2 = bb9Var.f8289h;
                                            ze1 ze1Var = tj3Var.f62378M;
                                            ze1Var.getClass();
                                            ze1Var.m25567d(false);
                                            ze1Var.f71431b.f62837p.m15737V(dy6.f36424c);
                                            thb.m22045d(i, i2, tj3Var.f62405s);
                                            tj3Var.f62372G.m3576t();
                                        } else {
                                            tj3Var.m22101T();
                                        }
                                    }
                                }
                                if (tj3Var.f62411y && tj3Var.f62372G.f8290i == tj3Var.f62412z) {
                                    tj3Var.f62412z = -1;
                                    tj3Var.f62411y = false;
                                }
                                tj3Var.m22139q(false);
                            } else {
                                tj3Var.m22102U();
                            }
                            return xfa.f68157a;
                        }
                    });
                }
                if (z) {
                    if (sq4Var2.f61241e) {
                        pf1Var3.m19094j();
                        pf1Var3.m19101q();
                        sq4Var2.f61242f = pf1Var3.m19096l(true, c0282a2);
                    } else {
                        sq4Var2.f61242f = pf1Var3.m19096l(pf1Var3.m19094j(), c0282a2);
                    }
                } else if (sq4Var2.f61241e) {
                    pf1Var3.m19094j();
                    pf1Var3.m19101q();
                    tj3 tj3Var = pf1Var3.f56036Q;
                    tj3Var.f62412z = 0;
                    tj3Var.f62411y = true;
                    pf1Var3.f56038a.mo1222a(pf1Var3, c0282a2);
                    tj3Var.m22144v();
                } else {
                    pf1Var3.m19085A(c0282a2);
                }
                sq4Var2.f61241e = false;
                c0357g2.f4319L = false;
                lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                sq4Var2.f61240d = false;
            } catch (Throwable th) {
                lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final C0357g m1508o(Object obj) {
        n66 n66Var;
        int i;
        if (this.f4190I == 0) {
            return null;
        }
        f66 f66Var = (f66) this.f4193a.m1603p();
        int i2 = ((x66) f66Var.f38520b).f67832c - this.f4191J;
        int i3 = i2 - this.f4190I;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            n66Var = this.f4198f;
            if (i5 < i3) {
                i = -1;
                break;
            }
            Object objM17255g = n66Var.m17255g((C0357g) f66Var.get(i5));
            objM17255g.getClass();
            if (fa4.m11650l(((sq4) objM17255g).f61237a, obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (true) {
                if (i4 < i3) {
                    i5 = i4;
                    break;
                }
                Object objM17255g2 = n66Var.m17255g((C0357g) f66Var.get(i4));
                objM17255g2.getClass();
                sq4 sq4Var = (sq4) objM17255g2;
                Object obj2 = sq4Var.f61237a;
                if (obj2 == AbstractC0337d.f4187a || this.f4195c.mo3852h(obj, obj2)) {
                    sq4Var.f61237a = obj;
                    i5 = i4;
                    i = i5;
                    break;
                }
                i4--;
            }
        }
        if (i == -1) {
            return null;
        }
        if (i5 != i3) {
            m1504k(i5, i3);
        }
        this.f4190I--;
        C0357g c0357g = (C0357g) f66Var.get(i3);
        Object objM17255g3 = n66Var.m17255g(c0357g);
        objM17255g3.getClass();
        sq4 sq4Var2 = (sq4) objM17255g3;
        sq4Var2.f61243g = AbstractC0278f.m1260j(Boolean.TRUE);
        sq4Var2.f61241e = true;
        sq4Var2.f61240d = true;
        return c0357g;
    }
}
