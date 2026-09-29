package androidx.compose.animation;

import androidx.compose.p002ui.graphics.AbstractC0309d;
import androidx.compose.runtime.AbstractC0278f;
import java.util.LinkedHashMap;
import java.util.Map;
import p000.InterfaceC3571se;
import p000.az2;
import p000.b16;
import p000.bg9;
import p000.ca9;
import p000.e16;
import p000.ec0;
import p000.f84;
import p000.fa4;
import p000.faa;
import p000.fc0;
import p000.fda;
import p000.gaa;
import p000.gc0;
import p000.jda;
import p000.jm8;
import p000.jwa;
import p000.kaa;
import p000.l43;
import p000.n84;
import p000.nj0;
import p000.p84;
import p000.pk9;
import p000.q98;
import p000.qs2;
import p000.qv2;
import p000.ss5;
import p000.t66;
import p000.tj3;
import p000.ui3;
import p000.v9a;
import p000.va1;
import p000.vi3;
import p000.vs2;
import p000.vt0;
import p000.we1;
import p000.xc9;
import p000.xfa;
import p000.ye1;

/* JADX INFO: renamed from: androidx.compose.animation.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0070i {

    /* JADX INFO: renamed from: a */
    public static final jda f1576a = new jda(EnterExitTransitionKt$TransformOriginVectorConverter$1.f1433b, EnterExitTransitionKt$TransformOriginVectorConverter$2.f1434b);

    /* JADX INFO: renamed from: b */
    public static final bg9 f1577b = ss5.m21698Y(0.0f, 400.0f, null, 5);

    /* JADX INFO: renamed from: c */
    public static final bg9 f1578c;

    /* JADX INFO: renamed from: d */
    public static final bg9 f1579d;

    static {
        ss5.m21698Y(0.0f, 400.0f, null, 5);
        Map map = jwa.f46325a;
        f1578c = ss5.m21698Y(0.0f, 400.0f, new f84(4294967297L), 1);
        f1579d = ss5.m21698Y(0.0f, 400.0f, new n84(4294967297L), 1);
    }

    /* JADX INFO: renamed from: a */
    public static final e16 m766a(faa faaVar, vs2 vs2Var, qv2 qv2Var, String str, ye1 ye1Var, int i, int i2) {
        vs2 vs2VarM781p;
        tj3 tj3Var;
        qv2 qv2VarM782q;
        tj3 tj3Var2;
        v9a v9aVar;
        v9a v9aVar2;
        v9a v9aVar3;
        v9a v9aVarM15040b;
        v9a v9aVarM15040b2;
        faa faaVar2;
        tj3 tj3Var3;
        Object qs2Var;
        vs2 vs2Var2;
        qv2 qv2Var2;
        jda jdaVar = pk9.f56369n;
        boolean z = true;
        boolean z2 = (i2 & 4) != 0;
        tj3 tj3Var4 = (tj3) ye1Var;
        Object objM22097O = tj3Var4.m22097O();
        p84 p84Var = we1.f66679a;
        if (objM22097O == p84Var) {
            objM22097O = EnterExitTransitionKt$createModifier$1$1.f1450b;
            tj3Var4.m22131l0(objM22097O);
        }
        final ui3 ui3Var = (ui3) objM22097O;
        if (z2) {
            tj3Var = (tj3) ye1Var;
            tj3Var.m22111b0(-167965831);
            vs2VarM781p = m781p(faaVar, vs2Var, tj3Var, 0);
        } else {
            vs2VarM781p = vs2Var;
            tj3Var = (tj3) ye1Var;
            tj3Var.m22111b0(-167964673);
        }
        tj3Var.m22139q(false);
        vs2 vs2Var3 = vs2VarM781p;
        if (z2) {
            tj3Var2 = (tj3) ye1Var;
            tj3Var2.m22111b0(-167962954);
            qv2VarM782q = m782q(faaVar, qv2Var, tj3Var2, 0);
        } else {
            qv2VarM782q = qv2Var;
            tj3Var2 = (tj3) ye1Var;
            tj3Var2.m22111b0(-167961890);
        }
        tj3Var2.m22139q(false);
        qv2 qv2Var3 = qv2VarM782q;
        gaa gaaVar = vs2Var3.f65844a;
        gaa gaaVar2 = qv2Var3.f58243a;
        boolean z3 = (gaaVar.f40476b == null && gaaVar2.f40476b == null) ? false : true;
        boolean z4 = (gaaVar.f40477c == null && gaaVar2.f40477c == null) ? false : true;
        v9a v9aVarM15040b3 = null;
        if (z3) {
            tj3 tj3Var5 = (tj3) ye1Var;
            tj3Var5.m22111b0(-911488127);
            Object objM22097O2 = tj3Var5.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = str.concat(" slide");
                tj3Var5.m22131l0(objM22097O2);
            }
            v9a v9aVarM15040b4 = kaa.m15040b(faaVar, jdaVar, (String) objM22097O2, tj3Var5, 384, 0);
            tj3Var5.m22139q(false);
            v9aVar = v9aVarM15040b4;
        } else {
            tj3 tj3Var6 = (tj3) ye1Var;
            tj3Var6.m22111b0(-911382324);
            tj3Var6.m22139q(false);
            v9aVar = null;
        }
        if (z4) {
            tj3 tj3Var7 = (tj3) ye1Var;
            tj3Var7.m22111b0(-911290533);
            jda jdaVar2 = pk9.f56370o;
            Object objM22097O3 = tj3Var7.m22097O();
            if (objM22097O3 == p84Var) {
                objM22097O3 = str.concat(" shrink/expand");
                tj3Var7.m22131l0(objM22097O3);
            }
            v9a v9aVarM15040b5 = kaa.m15040b(faaVar, jdaVar2, (String) objM22097O3, tj3Var7, 384, 0);
            tj3Var7.m22139q(false);
            v9aVar2 = v9aVarM15040b5;
        } else {
            tj3 tj3Var8 = (tj3) ye1Var;
            tj3Var8.m22111b0(-911179709);
            tj3Var8.m22139q(false);
            v9aVar2 = null;
        }
        if (z4) {
            tj3 tj3Var9 = (tj3) ye1Var;
            tj3Var9.m22111b0(-911106083);
            Object objM22097O4 = tj3Var9.m22097O();
            if (objM22097O4 == p84Var) {
                objM22097O4 = str.concat(" InterruptionHandlingOffset");
                tj3Var9.m22131l0(objM22097O4);
            }
            v9a v9aVarM15040b6 = kaa.m15040b(faaVar, jdaVar, (String) objM22097O4, tj3Var9, 384, 0);
            tj3Var9.m22139q(false);
            v9aVar3 = v9aVarM15040b6;
        } else {
            tj3 tj3Var10 = (tj3) ye1Var;
            tj3Var10.m22111b0(-910935677);
            tj3Var10.m22139q(false);
            v9aVar3 = null;
        }
        final boolean z5 = !z4;
        float[] fArr = va1.f65096a;
        tj3 tj3Var11 = (tj3) ye1Var;
        tj3Var11.m22111b0(-910130296);
        tj3Var11.m22139q(false);
        gaa gaaVar3 = qv2Var3.f58243a;
        jda jdaVar3 = pk9.f56363h;
        boolean z6 = (gaaVar.f40475a == null && gaaVar3.f40475a == null) ? false : true;
        if (gaaVar.f40478d == null && gaaVar3.f40478d == null) {
            z = false;
        }
        if (z6) {
            tj3Var11.m22111b0(-703879421);
            Object objM22097O5 = tj3Var11.m22097O();
            if (objM22097O5 == p84Var) {
                objM22097O5 = str.concat(" alpha");
                tj3Var11.m22131l0(objM22097O5);
            }
            v9aVarM15040b = kaa.m15040b(faaVar, jdaVar3, (String) objM22097O5, tj3Var11, 384, 0);
            tj3Var11.m22139q(false);
        } else {
            tj3Var11.m22111b0(-703709976);
            tj3Var11.m22139q(false);
            v9aVarM15040b = null;
        }
        if (z) {
            tj3Var11.m22111b0(-703642333);
            Object objM22097O6 = tj3Var11.m22097O();
            if (objM22097O6 == p84Var) {
                objM22097O6 = str.concat(" scale");
                tj3Var11.m22131l0(objM22097O6);
            }
            v9aVarM15040b2 = kaa.m15040b(faaVar, jdaVar3, (String) objM22097O6, tj3Var11, 384, 0);
            tj3Var11.m22139q(false);
        } else {
            tj3Var11.m22111b0(-703472888);
            tj3Var11.m22139q(false);
            v9aVarM15040b2 = null;
        }
        if (z) {
            tj3Var11.m22111b0(-703395232);
            v9aVarM15040b3 = kaa.m15040b(faaVar, f1576a, "TransformOriginInterruptionHandling", tj3Var11, 384, 0);
            faaVar2 = faaVar;
            tj3Var3 = tj3Var11;
            tj3Var3.m22139q(false);
        } else {
            faaVar2 = faaVar;
            tj3Var3 = tj3Var11;
            tj3Var3.m22111b0(-703222904);
            tj3Var3.m22139q(false);
        }
        v9a v9aVar4 = v9aVarM15040b3;
        boolean zM22124i = tj3Var3.m22124i(v9aVarM15040b) | tj3Var3.m22120g(vs2Var3) | tj3Var3.m22120g(qv2Var3) | tj3Var3.m22124i(v9aVarM15040b2) | tj3Var3.m22120g(faaVar2) | tj3Var3.m22124i(v9aVar4);
        Object objM22097O7 = tj3Var3.m22097O();
        if (zM22124i || objM22097O7 == p84Var) {
            vs2Var2 = vs2Var3;
            qv2Var2 = qv2Var3;
            qs2Var = new qs2(v9aVarM15040b, v9aVarM15040b2, faaVar, vs2Var2, qv2Var2, v9aVar4);
            tj3Var3.m22131l0(qs2Var);
        } else {
            qs2Var = objM22097O7;
            vs2Var2 = vs2Var3;
            qv2Var2 = qv2Var3;
        }
        qs2 qs2Var2 = (qs2) qs2Var;
        boolean zM22122h = tj3Var3.m22122h(z5) | tj3Var3.m22120g(ui3Var);
        Object objM22097O8 = tj3Var3.m22097O();
        if (zM22122h || objM22097O8 == p84Var) {
            objM22097O8 = new vi3() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p000.vi3
                public final Object invoke(Object obj) {
                    ((q98) obj).m19816f(!z5 && ((Boolean) ui3Var.mo0a()).booleanValue());
                    return xfa.f68157a;
                }
            };
            tj3Var3.m22131l0(objM22097O8);
        }
        b16 b16Var = b16.f7762a;
        return AbstractC0309d.m1406a(b16Var, (vi3) objM22097O8).mo3161g(new C0069h(faaVar, v9aVar2, v9aVar3, v9aVar, vs2Var2, qv2Var2, ui3Var, qs2Var2)).mo3161g(b16Var);
    }

    /* JADX INFO: renamed from: b */
    public static vs2 m767b(l43 l43Var, ec0 ec0Var, int i) {
        gc0 gc0Var;
        ec0 ec0Var2 = nj0.f52793L;
        if ((i & 1) != 0) {
            Map map = jwa.f46325a;
            l43Var = ss5.m21698Y(0.0f, 400.0f, new n84(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            ec0Var = ec0Var2;
        }
        if (fa4.m11650l(ec0Var, nj0.f52791J)) {
            gc0Var = nj0.f52811f;
        } else {
            gc0Var = fa4.m11650l(ec0Var, ec0Var2) ? nj0.f52813h : nj0.f52812g;
        }
        return m768c(l43Var, gc0Var, new EnterExitTransitionKt$expandHorizontally$2(1));
    }

    /* JADX INFO: renamed from: c */
    public static final vs2 m768c(l43 l43Var, gc0 gc0Var, vi3 vi3Var) {
        return new vs2(new gaa((az2) null, (ca9) null, new vt0(gc0Var, l43Var, vi3Var), (jm8) null, (LinkedHashMap) null, 123));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ vs2 m769d() {
        Map map = jwa.f46325a;
        return m768c(ss5.m21698Y(0.0f, 400.0f, new n84(4294967297L), 1), nj0.f52816k, EnterExitTransitionKt$expandIn$1.f1454b);
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
    /* JADX INFO: renamed from: e */
    public static vs2 m770e(fda fdaVar, int i) {
        gc0 gc0Var;
        l43 l43VarM21698Y = fdaVar;
        if ((i & 1) != 0) {
            Map map = jwa.f46325a;
            l43VarM21698Y = ss5.m21698Y(0.0f, 400.0f, new n84(4294967297L), 1);
        }
        fc0 fc0Var = nj0.f52790I;
        if (fc0Var.equals(nj0.f52817l)) {
            gc0Var = nj0.f52809d;
        } else {
            gc0Var = fc0Var.equals(fc0Var) ? nj0.f52815j : nj0.f52812g;
        }
        return m768c(l43VarM21698Y, gc0Var, new EnterExitTransitionKt$expandVertically$2(1));
    }

    /* JADX INFO: renamed from: f */
    public static final vs2 m771f(float f, l43 l43Var) {
        return new vs2(new gaa(new az2(f, l43Var), (ca9) null, (vt0) null, (jm8) null, (LinkedHashMap) null, 126));
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ vs2 m772g(l43 l43Var, float f, int i) {
        if ((i & 1) != 0) {
            l43Var = ss5.m21698Y(0.0f, 400.0f, null, 5);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return m771f(f, l43Var);
    }

    /* JADX INFO: renamed from: h */
    public static qv2 m773h(l43 l43Var, int i) {
        if ((i & 1) != 0) {
            l43Var = ss5.m21698Y(0.0f, 400.0f, null, 5);
        }
        return new qv2(new gaa(new az2(0.0f, l43Var), (ca9) null, (vt0) null, (jm8) null, (LinkedHashMap) null, 126));
    }

    /* JADX INFO: renamed from: i */
    public static qv2 m774i(l43 l43Var, ec0 ec0Var, int i) {
        gc0 gc0Var;
        ec0 ec0Var2 = nj0.f52793L;
        if ((i & 1) != 0) {
            Map map = jwa.f46325a;
            l43Var = ss5.m21698Y(0.0f, 400.0f, new n84(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            ec0Var = ec0Var2;
        }
        if (fa4.m11650l(ec0Var, nj0.f52791J)) {
            gc0Var = nj0.f52811f;
        } else {
            gc0Var = fa4.m11650l(ec0Var, ec0Var2) ? nj0.f52813h : nj0.f52812g;
        }
        return m775j(gc0Var, l43Var, new EnterExitTransitionKt$shrinkHorizontally$2(1));
    }

    /* JADX INFO: renamed from: j */
    public static final qv2 m775j(InterfaceC3571se interfaceC3571se, l43 l43Var, vi3 vi3Var) {
        return new qv2(new gaa((az2) null, (ca9) null, new vt0(interfaceC3571se, l43Var, vi3Var), (jm8) null, (LinkedHashMap) null, 123));
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
    /* JADX INFO: renamed from: k */
    public static qv2 m776k(fda fdaVar, int i) {
        gc0 gc0Var;
        l43 l43VarM21698Y = fdaVar;
        if ((i & 1) != 0) {
            Map map = jwa.f46325a;
            l43VarM21698Y = ss5.m21698Y(0.0f, 400.0f, new n84(4294967297L), 1);
        }
        fc0 fc0Var = nj0.f52790I;
        if (fc0Var.equals(nj0.f52817l)) {
            gc0Var = nj0.f52809d;
        } else {
            gc0Var = fc0Var.equals(fc0Var) ? nj0.f52815j : nj0.f52812g;
        }
        return m775j(gc0Var, l43VarM21698Y, new EnterExitTransitionKt$shrinkVertically$2(1));
    }

    /* JADX INFO: renamed from: l */
    public static final vs2 m777l(l43 l43Var, final vi3 vi3Var) {
        return new vs2(new gaa((az2) null, new ca9(l43Var, new vi3() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInVertically$2
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                return new f84(((long) ((Number) vi3Var.invoke(Integer.valueOf((int) (((n84) obj).f52482a & 4294967295L)))).intValue()) & 4294967295L);
            }
        }), (vt0) null, (jm8) null, (LinkedHashMap) null, 125));
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ vs2 m778m(vi3 vi3Var, int i) {
        Map map = jwa.f46325a;
        bg9 bg9VarM21698Y = ss5.m21698Y(0.0f, 400.0f, new f84(4294967297L), 1);
        if ((i & 2) != 0) {
            vi3Var = EnterExitTransitionKt$slideInVertically$1.f1459b;
        }
        return m777l(bg9VarM21698Y, vi3Var);
    }

    /* JADX INFO: renamed from: n */
    public static final qv2 m779n(l43 l43Var, final vi3 vi3Var) {
        return new qv2(new gaa((az2) null, new ca9(l43Var, new vi3() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutVertically$2
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                return new f84(((long) ((Number) vi3Var.invoke(Integer.valueOf((int) (((n84) obj).f52482a & 4294967295L)))).intValue()) & 4294967295L);
            }
        }), (vt0) null, (jm8) null, (LinkedHashMap) null, 125));
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ qv2 m780o(vi3 vi3Var, int i) {
        Map map = jwa.f46325a;
        bg9 bg9VarM21698Y = ss5.m21698Y(0.0f, 400.0f, new f84(4294967297L), 1);
        if ((i & 2) != 0) {
            vi3Var = EnterExitTransitionKt$slideOutVertically$1.f1461b;
        }
        return m779n(bg9VarM21698Y, vi3Var);
    }

    /* JADX INFO: renamed from: p */
    public static final vs2 m781p(faa faaVar, vs2 vs2Var, ye1 ye1Var, int i) {
        boolean z = (((i & 14) ^ 6) > 4 && ((tj3) ye1Var).m22120g(faaVar)) || (i & 6) == 4;
        tj3 tj3Var = (tj3) ye1Var;
        Object objM22097O = tj3Var.m22097O();
        if (z || objM22097O == we1.f66679a) {
            objM22097O = AbstractC0278f.m1260j(vs2Var);
            tj3Var.m22131l0(objM22097O);
        }
        t66 t66Var = (t66) objM22097O;
        Object objM11669c = faaVar.m11669c();
        xc9 xc9Var = (xc9) faaVar.f38738d;
        if (objM11669c == xc9Var.getValue() && faaVar.m11669c() == EnterExitState.Visible) {
            if (faaVar.m11673g()) {
                t66Var.setValue(vs2Var);
            } else {
                t66Var.setValue(vs2.f65843b);
            }
        } else if (xc9Var.getValue() == EnterExitState.Visible) {
            t66Var.setValue(((vs2) t66Var.getValue()).m23531a(vs2Var));
        }
        return (vs2) t66Var.getValue();
    }

    /* JADX INFO: renamed from: q */
    public static final qv2 m782q(faa faaVar, qv2 qv2Var, ye1 ye1Var, int i) {
        boolean z = (((i & 14) ^ 6) > 4 && ((tj3) ye1Var).m22120g(faaVar)) || (i & 6) == 4;
        tj3 tj3Var = (tj3) ye1Var;
        Object objM22097O = tj3Var.m22097O();
        if (z || objM22097O == we1.f66679a) {
            objM22097O = AbstractC0278f.m1260j(qv2Var);
            tj3Var.m22131l0(objM22097O);
        }
        t66 t66Var = (t66) objM22097O;
        Object objM11669c = faaVar.m11669c();
        xc9 xc9Var = (xc9) faaVar.f38738d;
        if (objM11669c == xc9Var.getValue() && faaVar.m11669c() == EnterExitState.Visible) {
            if (faaVar.m11673g()) {
                t66Var.setValue(qv2Var);
            } else {
                t66Var.setValue(qv2.f58241b);
            }
        } else if (xc9Var.getValue() != EnterExitState.Visible) {
            t66Var.setValue(((qv2) t66Var.getValue()).m20180a(qv2Var));
        }
        return (qv2) t66Var.getValue();
    }
}
