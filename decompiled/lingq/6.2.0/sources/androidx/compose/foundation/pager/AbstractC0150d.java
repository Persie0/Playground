package androidx.compose.foundation.pager;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.C0101i;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.pager.AbstractC0150d;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.runtime.AbstractC0278f;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.bg9;
import p000.cc4;
import p000.ct4;
import p000.dk1;
import p000.do8;
import p000.eu4;
import p000.fa4;
import p000.fb2;
import p000.fu4;
import p000.gc2;
import p000.gq6;
import p000.h27;
import p000.ii0;
import p000.iu4;
import p000.jc9;
import p000.ku4;
import p000.l54;
import p000.l70;
import p000.lda;
import p000.lt5;
import p000.lu4;
import p000.n27;
import p000.pvc;
import p000.q60;
import p000.qc9;
import p000.ql0;
import p000.s46;
import p000.sc9;
import p000.sq5;
import p000.t56;
import p000.t66;
import p000.tr3;
import p000.tz1;
import p000.v27;
import p000.v56;
import p000.vi3;
import p000.xc9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.foundation.pager.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0150d implements do8 {

    /* JADX INFO: renamed from: A */
    public final iu4 f2664A;

    /* JADX INFO: renamed from: B */
    public final t66 f2665B;

    /* JADX INFO: renamed from: C */
    public final t66 f2666C;

    /* JADX INFO: renamed from: D */
    public final t66 f2667D;

    /* JADX INFO: renamed from: E */
    public final t66 f2668E;

    /* JADX INFO: renamed from: F */
    public final t66 f2669F;

    /* JADX INFO: renamed from: G */
    public final t66 f2670G;

    /* JADX INFO: renamed from: a */
    public boolean f2671a;

    /* JADX INFO: renamed from: b */
    public n27 f2672b;

    /* JADX INFO: renamed from: c */
    public final t66 f2673c;

    /* JADX INFO: renamed from: d */
    public final tz1 f2674d;

    /* JADX INFO: renamed from: e */
    public int f2675e;

    /* JADX INFO: renamed from: f */
    public int f2676f;

    /* JADX INFO: renamed from: g */
    public long f2677g;

    /* JADX INFO: renamed from: h */
    public long f2678h;

    /* JADX INFO: renamed from: i */
    public float f2679i;

    /* JADX INFO: renamed from: j */
    public float f2680j;

    /* JADX INFO: renamed from: k */
    public final C0101i f2681k;

    /* JADX INFO: renamed from: l */
    public final boolean f2682l;

    /* JADX INFO: renamed from: m */
    public final t66 f2683m;

    /* JADX INFO: renamed from: n */
    public fb2 f2684n;

    /* JADX INFO: renamed from: o */
    public int f2685o;

    /* JADX INFO: renamed from: p */
    public final v56 f2686p;

    /* JADX INFO: renamed from: q */
    public final sc9 f2687q;

    /* JADX INFO: renamed from: r */
    public final sc9 f2688r;

    /* JADX INFO: renamed from: s */
    public final gc2 f2689s;

    /* JADX INFO: renamed from: t */
    public final gc2 f2690t;

    /* JADX INFO: renamed from: u */
    public final lu4 f2691u;

    /* JADX INFO: renamed from: v */
    public final h27 f2692v;

    /* JADX INFO: renamed from: w */
    public final ii0 f2693w;

    /* JADX INFO: renamed from: x */
    public final q60 f2694x;

    /* JADX INFO: renamed from: y */
    public final t66 f2695y;

    /* JADX INFO: renamed from: z */
    public final ct4 f2696z;

    public AbstractC0150d(int i, float f) {
        double d = f;
        if (-0.5d > d || d > 0.5d) {
            l54.m15814a("currentPageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        this.f2673c = AbstractC0278f.m1260j(new gq6(0L));
        this.f2674d = new tz1(i, f, this);
        this.f2675e = i;
        this.f2677g = Long.MAX_VALUE;
        final int i2 = 0;
        this.f2681k = new C0101i(new vi3(this) { // from class: s27

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractC0150d f60209b;

            {
                this.f60209b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v7 */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Long] */
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
            @Override // p000.vi3
            public final Object invoke(Object obj) {
                n27 n27Var;
                int i3 = i2;
                n27 n27Var2 = null;
                AbstractC0150d abstractC0150d = this.f60209b;
                switch (i3) {
                    case 0:
                        ?? ValueOf = (Float) obj;
                        float fFloatValue = ValueOf.floatValue();
                        long jM18165u = omd.m18165u(abstractC0150d);
                        float f2 = abstractC0150d.f2679i + fFloatValue;
                        long jM21694U = ss5.m21694U(f2);
                        abstractC0150d.f2679i = f2 - jM21694U;
                        if (Math.abs(fFloatValue) >= 1.0E-4f) {
                            long j = jM18165u + jM21694U;
                            long jM15947j = l70.m15947j(j, abstractC0150d.f2678h, abstractC0150d.f2677g);
                            ?? r0 = j != jM15947j;
                            long j2 = jM15947j - jM18165u;
                            float f3 = j2;
                            abstractC0150d.f2680j = f3;
                            if (Math.abs(j2) != 0) {
                                ((xc9) abstractC0150d.f2669F).setValue(Boolean.valueOf(f3 > 0.0f));
                                ((xc9) abstractC0150d.f2670G).setValue(Boolean.valueOf(f3 < 0.0f));
                            }
                            int i4 = (int) j2;
                            int i5 = -i4;
                            n27 n27VarM17187f = ((n27) ((xc9) abstractC0150d.f2683m).getValue()).m17187f(i5);
                            if (n27VarM17187f == null || (n27Var = abstractC0150d.f2672b) == null) {
                                n27Var2 = n27VarM17187f;
                            } else {
                                n27 n27VarM17187f2 = n27Var.m17187f(i5);
                                if (n27VarM17187f2 != null) {
                                    abstractC0150d.f2672b = n27VarM17187f2;
                                    n27Var2 = n27VarM17187f;
                                }
                            }
                            if (n27Var2 != null) {
                                abstractC0150d.m1033h(n27Var2, abstractC0150d.f2671a, true);
                                fa4.m11663y(abstractC0150d.f2665B);
                            } else {
                                tz1 tz1Var = abstractC0150d.f2674d;
                                AbstractC0150d abstractC0150d2 = (AbstractC0150d) tz1Var.f63123b;
                                qc9 qc9Var = (qc9) tz1Var.f63126e;
                                qc9Var.m19862i(qc9Var.m19861h() + (abstractC0150d2.m1041p() != 0 ? i4 / abstractC0150d2.m1041p() : 0.0f));
                                C0357g c0357g = (C0357g) ((xc9) abstractC0150d.f2695y).getValue();
                                if (c0357g != null) {
                                    c0357g.m1598l();
                                }
                            }
                            if (r0 != false) {
                                ValueOf = Long.valueOf(j2);
                            }
                            fFloatValue = ValueOf.floatValue();
                        }
                        return Float.valueOf(fFloatValue);
                    default:
                        ju4 ju4Var = (ju4) obj;
                        jc9 jc9VarM16139y = lda.m16139y();
                        vi3 vi3VarMo3163e = jc9VarM16139y != null ? jc9VarM16139y.mo3163e() : null;
                        jc9 jc9VarM16106F = lda.m16106F(jc9VarM16139y);
                        try {
                            ju4Var.m14656a(abstractC0150d.f2675e);
                            return xfa.f68157a;
                        } finally {
                            lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                        }
                }
            }
        });
        final int i3 = 1;
        this.f2682l = true;
        this.f2683m = AbstractC0278f.m1259i(v27.f64741b, s46.f60289d);
        this.f2684n = v27.f64740a;
        this.f2686p = new v56();
        this.f2687q = AbstractC0278f.m1257g(-1);
        this.f2688r = AbstractC0278f.m1257g(i);
        tr3 tr3Var = tr3.f62761g;
        this.f2689s = AbstractC0278f.m1255e(new fu4(this, 2), tr3Var);
        this.f2690t = AbstractC0278f.m1255e(new fu4(this, 3), tr3Var);
        lu4 lu4Var = new lu4(new vi3(this) { // from class: s27

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractC0150d f60209b;

            {
                this.f60209b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v7 */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Long] */
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
            @Override // p000.vi3
            public final Object invoke(Object obj) {
                n27 n27Var;
                int i4 = i3;
                n27 n27Var2 = null;
                AbstractC0150d abstractC0150d = this.f60209b;
                switch (i4) {
                    case 0:
                        ?? ValueOf = (Float) obj;
                        float fFloatValue = ValueOf.floatValue();
                        long jM18165u = omd.m18165u(abstractC0150d);
                        float f2 = abstractC0150d.f2679i + fFloatValue;
                        long jM21694U = ss5.m21694U(f2);
                        abstractC0150d.f2679i = f2 - jM21694U;
                        if (Math.abs(fFloatValue) >= 1.0E-4f) {
                            long j = jM18165u + jM21694U;
                            long jM15947j = l70.m15947j(j, abstractC0150d.f2678h, abstractC0150d.f2677g);
                            ?? r0 = j != jM15947j;
                            long j2 = jM15947j - jM18165u;
                            float f3 = j2;
                            abstractC0150d.f2680j = f3;
                            if (Math.abs(j2) != 0) {
                                ((xc9) abstractC0150d.f2669F).setValue(Boolean.valueOf(f3 > 0.0f));
                                ((xc9) abstractC0150d.f2670G).setValue(Boolean.valueOf(f3 < 0.0f));
                            }
                            int i5 = (int) j2;
                            int i6 = -i5;
                            n27 n27VarM17187f = ((n27) ((xc9) abstractC0150d.f2683m).getValue()).m17187f(i6);
                            if (n27VarM17187f == null || (n27Var = abstractC0150d.f2672b) == null) {
                                n27Var2 = n27VarM17187f;
                            } else {
                                n27 n27VarM17187f2 = n27Var.m17187f(i6);
                                if (n27VarM17187f2 != null) {
                                    abstractC0150d.f2672b = n27VarM17187f2;
                                    n27Var2 = n27VarM17187f;
                                }
                            }
                            if (n27Var2 != null) {
                                abstractC0150d.m1033h(n27Var2, abstractC0150d.f2671a, true);
                                fa4.m11663y(abstractC0150d.f2665B);
                            } else {
                                tz1 tz1Var = abstractC0150d.f2674d;
                                AbstractC0150d abstractC0150d2 = (AbstractC0150d) tz1Var.f63123b;
                                qc9 qc9Var = (qc9) tz1Var.f63126e;
                                qc9Var.m19862i(qc9Var.m19861h() + (abstractC0150d2.m1041p() != 0 ? i5 / abstractC0150d2.m1041p() : 0.0f));
                                C0357g c0357g = (C0357g) ((xc9) abstractC0150d.f2695y).getValue();
                                if (c0357g != null) {
                                    c0357g.m1598l();
                                }
                            }
                            if (r0 != false) {
                                ValueOf = Long.valueOf(j2);
                            }
                            fFloatValue = ValueOf.floatValue();
                        }
                        return Float.valueOf(fFloatValue);
                    default:
                        ju4 ju4Var = (ju4) obj;
                        jc9 jc9VarM16139y = lda.m16139y();
                        vi3 vi3VarMo3163e = jc9VarM16139y != null ? jc9VarM16139y.mo3163e() : null;
                        jc9 jc9VarM16106F = lda.m16106F(jc9VarM16139y);
                        try {
                            ju4Var.m14656a(abstractC0150d.f2675e);
                            return xfa.f68157a;
                        } finally {
                            lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                        }
                }
            }
        });
        this.f2691u = lu4Var;
        this.f2692v = new h27(new cc4(this), lu4Var, new fu4(this, 4));
        this.f2693w = new ii0(1);
        this.f2694x = new q60();
        this.f2695y = AbstractC0278f.m1260j(null);
        this.f2696z = new ct4(this, 3);
        dk1.m10424b(0, 0, 0, 0, 15);
        this.f2664A = new iu4();
        this.f2665B = fa4.m11655q();
        this.f2666C = fa4.m11655q();
        Boolean bool = Boolean.FALSE;
        this.f2667D = AbstractC0278f.m1260j(bool);
        this.f2668E = AbstractC0278f.m1260j(bool);
        this.f2669F = AbstractC0278f.m1260j(bool);
        this.f2670G = AbstractC0278f.m1260j(bool);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (r9.mo864c(r7, r8, r0) == r1) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
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
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m1030t(AbstractC0150d abstractC0150d, MutatePriority mutatePriority, zi3 zi3Var, ContinuationImpl continuationImpl) throws Throwable {
        PagerState$scroll$1 pagerState$scroll$1;
        zi3 zi3Var2;
        if (continuationImpl instanceof PagerState$scroll$1) {
            pagerState$scroll$1 = (PagerState$scroll$1) continuationImpl;
            int i = pagerState$scroll$1.f2653f;
            if ((i & Integer.MIN_VALUE) != 0) {
                pagerState$scroll$1.f2653f = i - Integer.MIN_VALUE;
            } else {
                pagerState$scroll$1 = new PagerState$scroll$1(abstractC0150d, continuationImpl);
            }
        } else {
            pagerState$scroll$1 = new PagerState$scroll$1(abstractC0150d, continuationImpl);
        }
        Object obj = pagerState$scroll$1.f2651d;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = pagerState$scroll$1.f2653f;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            pagerState$scroll$1.f2648a = abstractC0150d;
            pagerState$scroll$1.f2649b = mutatePriority;
            pagerState$scroll$1.f2650c = (SuspendLambda) zi3Var;
            pagerState$scroll$1.f2653f = 1;
            if (abstractC0150d.m1034i(pagerState$scroll$1) != obj2) {
            }
            zi3Var2 = zi3Var;
            return obj2;
        }
        if (i2 == 1) {
            zi3 zi3Var3 = (zi3) pagerState$scroll$1.f2650c;
            mutatePriority = pagerState$scroll$1.f2649b;
            abstractC0150d = pagerState$scroll$1.f2648a;
            AbstractC3193b.m15359b(obj);
            zi3Var2 = zi3Var3;
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            abstractC0150d = pagerState$scroll$1.f2648a;
            AbstractC3193b.m15359b(obj);
        }
        abstractC0150d.f2687q.m21223i(-1);
        return xfa.f68157a;
        zi3Var2 = zi3Var;
        if (!abstractC0150d.f2681k.mo863a()) {
            abstractC0150d.f2688r.m21223i(abstractC0150d.m1036k());
        }
        C0101i c0101i = abstractC0150d.f2681k;
        pagerState$scroll$1.f2648a = abstractC0150d;
        pagerState$scroll$1.f2649b = null;
        pagerState$scroll$1.f2650c = null;
        pagerState$scroll$1.f2653f = 2;
    }

    /* JADX INFO: renamed from: u */
    public static Object m1031u(AbstractC0150d abstractC0150d, int i, SuspendLambda suspendLambda) {
        abstractC0150d.getClass();
        Object objMo864c = abstractC0150d.mo864c(MutatePriority.Default, new PagerState$scrollToPage$2(abstractC0150d, i, null), suspendLambda);
        return objMo864c == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo864c : xfa.f68157a;
    }

    @Override // p000.do8
    /* JADX INFO: renamed from: a */
    public final boolean mo863a() {
        return this.f2681k.mo863a();
    }

    @Override // p000.do8
    /* JADX INFO: renamed from: b */
    public final boolean mo974b() {
        return ((Boolean) ((xc9) this.f2668E).getValue()).booleanValue();
    }

    @Override // p000.do8
    /* JADX INFO: renamed from: c */
    public final Object mo864c(MutatePriority mutatePriority, zi3 zi3Var, ContinuationImpl continuationImpl) {
        return m1030t(this, mutatePriority, zi3Var, continuationImpl);
    }

    @Override // p000.do8
    /* JADX INFO: renamed from: d */
    public final boolean mo975d() {
        return ((Boolean) ((xc9) this.f2667D).getValue()).booleanValue();
    }

    @Override // p000.do8
    /* JADX INFO: renamed from: e */
    public final float mo865e(float f) {
        return this.f2681k.mo865e(f);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: f */
    public final Object m1032f(int i, bg9 bg9Var, ContinuationImpl continuationImpl) throws Throwable {
        PagerState$animateScrollToPage$1 pagerState$animateScrollToPage$1;
        int i2;
        bg9 bg9Var2;
        if (continuationImpl instanceof PagerState$animateScrollToPage$1) {
            pagerState$animateScrollToPage$1 = (PagerState$animateScrollToPage$1) continuationImpl;
            int i3 = pagerState$animateScrollToPage$1.f2639e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pagerState$animateScrollToPage$1.f2639e = i3 - Integer.MIN_VALUE;
            } else {
                pagerState$animateScrollToPage$1 = new PagerState$animateScrollToPage$1(this, continuationImpl);
            }
        } else {
            pagerState$animateScrollToPage$1 = new PagerState$animateScrollToPage$1(this, continuationImpl);
        }
        PagerState$animateScrollToPage$1 pagerState$animateScrollToPage$2 = pagerState$animateScrollToPage$1;
        Object obj = pagerState$animateScrollToPage$2.f2637c;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = pagerState$animateScrollToPage$2.f2639e;
        xfa xfaVar = xfa.f68157a;
        if (i4 == 0) {
            AbstractC3193b.m15359b(obj);
            if ((i != m1036k() || m1037l() != 0.0f) && mo1039n() != 0) {
                pagerState$animateScrollToPage$2.f2636b = bg9Var;
                pagerState$animateScrollToPage$2.f2635a = i;
                pagerState$animateScrollToPage$2.f2639e = 1;
                if (m1034i(pagerState$animateScrollToPage$2) != obj2) {
                    i2 = i;
                    bg9Var2 = bg9Var;
                }
            }
        }
        if (i4 != 1) {
            if (i4 == 2) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i2 = pagerState$animateScrollToPage$2.f2635a;
        bg9 bg9Var3 = pagerState$animateScrollToPage$2.f2636b;
        AbstractC3193b.m15359b(obj);
        bg9Var2 = bg9Var3;
        zi3 pagerState$animateScrollToPage$3 = new PagerState$animateScrollToPage$3(this, m1035j(i2), m1041p() * 0.0f, bg9Var2, null);
        pagerState$animateScrollToPage$2.f2636b = null;
        pagerState$animateScrollToPage$2.f2639e = 2;
        return mo864c(MutatePriority.Default, pagerState$animateScrollToPage$3, pagerState$animateScrollToPage$2) == obj2 ? obj2 : xfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:122:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:127:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:130:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:133:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:145:0x030f A[Catch: all -> 0x034b, TryCatch #0 {all -> 0x034b, blocks: (B:137:0x02ed, B:140:0x02f6, B:143:0x0303, B:145:0x030f, B:153:0x0345, B:151:0x033f, B:148:0x0327), top: B:169:0x02ed }] */
    /* JADX WARN: Code duplicated, block: B:147:0x0326  */
    /* JADX WARN: Code duplicated, block: B:148:0x0327 A[Catch: all -> 0x034b, TryCatch #0 {all -> 0x034b, blocks: (B:137:0x02ed, B:140:0x02f6, B:143:0x0303, B:145:0x030f, B:153:0x0345, B:151:0x033f, B:148:0x0327), top: B:169:0x02ed }] */
    /* JADX WARN: Code duplicated, block: B:150:0x033e  */
    /* JADX WARN: Code duplicated, block: B:151:0x033f A[Catch: all -> 0x034b, TryCatch #0 {all -> 0x034b, blocks: (B:137:0x02ed, B:140:0x02f6, B:143:0x0303, B:145:0x030f, B:153:0x0345, B:151:0x033f, B:148:0x0327), top: B:169:0x02ed }] */
    /* JADX WARN: Code duplicated, block: B:159:0x0360  */
    /* JADX WARN: Code duplicated, block: B:161:0x0367  */
    /* JADX WARN: Code duplicated, block: B:164:0x037d  */
    /* JADX WARN: Code duplicated, block: B:169:0x02ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x01e1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r2v15, types: [int] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: h */
    public final void m1033h(n27 n27Var, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        float f;
        int i;
        Object obj;
        boolean z7;
        ?? r2;
        ?? r10;
        ?? r7;
        float f2;
        long jM17188g;
        long jM15945h;
        long j;
        int i2;
        List list = n27Var.f52219a;
        int i3 = n27Var.f52231m;
        lt5 lt5Var = n27Var.f52228j;
        lt5 lt5Var2 = n27Var.f52229k;
        float f3 = n27Var.f52230l;
        this.f2691u.f50143e = list.size();
        this.f2685o = n27Var.f52220b + n27Var.f52221c;
        if (!z && this.f2671a) {
            this.f2672b = n27Var;
            return;
        }
        boolean z8 = true;
        if (z) {
            this.f2671a = true;
        }
        h27 h27Var = this.f2692v;
        boolean z9 = this.f2682l;
        tz1 tz1Var = this.f2674d;
        if (!z2) {
            tz1Var.getClass();
            tz1Var.f63124c = lt5Var2 != null ? lt5Var2.f50104e : null;
            if (tz1Var.f63122a || !list.isEmpty()) {
                tz1Var.f63122a = true;
                int i4 = lt5Var2 != null ? lt5Var2.f50100a : 0;
                ((sc9) tz1Var.f63125d).m21223i(i4);
                ((eu4) tz1Var.f63127f).m11342c(i4);
                ((qc9) tz1Var.f63126e).m19862i(f3);
            }
            if (z9) {
                z3 = z9;
                sq5 sq5Var = h27Var.f41716o;
                t56 t56Var = h27Var.f41706e;
                sq5Var.f61249c = n27Var;
                sq5Var.f61250d = h27Var.f41715n;
                cc4 cc4Var = h27Var.f41702a;
                int i5 = h27Var.f41708g;
                float f4 = 0.0f;
                int i6 = -1;
                if (i5 != -1 && i5 != sq5Var.m21578t()) {
                    h27Var.f41713l = true;
                    if (sq5Var.m21572n()) {
                        int i7 = h27Var.f41709h;
                        if (i7 < 0) {
                            i7 = 0;
                        }
                        h27Var.f41709h = i7;
                        int iM21578t = sq5Var.m21574p().f52219a.isEmpty() ? -1 : sq5Var.m21578t() - 1;
                        if (iM21578t != -1) {
                            int i8 = h27Var.f41710i;
                            if (i8 <= iM21578t) {
                                iM21578t = i8;
                            }
                            h27Var.f41710i = iM21578t;
                        }
                        if (h27Var.f41707f <= 0.0f) {
                            h27Var.m13008f(sq5Var.m21573o(), h27Var.f41714m - 1);
                        } else {
                            h27Var.m13008f(0, sq5Var.m21570l());
                        }
                    }
                }
                h27Var.f41714m = sq5Var.m21578t();
                if (sq5Var.m21572n()) {
                    int size = sq5Var.m21574p().f52237s.size() + sq5Var.m21574p().f52219a.size() + sq5Var.m21574p().f52236r.size();
                    int i9 = 0;
                    while (i9 < size) {
                        int size2 = sq5Var.m21574p().f52236r.size();
                        int size3 = sq5Var.m21574p().f52219a.size();
                        if (i9 < size2) {
                            i = ((lt5) sq5Var.m21574p().f52236r.get(i9)).f50100a;
                            f = f4;
                        } else {
                            f = f4;
                            i = (i9 < size2 || i9 >= size2 + size3) ? i9 >= size2 + size3 ? ((lt5) sq5Var.m21574p().f52237s.get((i9 - size2) - size3)).f50100a : i6 : ((lt5) sq5Var.m21574p().f52219a.get(i9 - size2)).f50100a;
                        }
                        int size4 = sq5Var.m21574p().f52236r.size();
                        int size5 = sq5Var.m21574p().f52219a.size();
                        if (i9 < size4) {
                            obj = ((lt5) sq5Var.m21574p().f52236r.get(i9)).f50104e;
                        } else if (i9 < size4 || i9 >= size4 + size5) {
                            obj = i9 >= size4 + size5 ? ((lt5) sq5Var.m21574p().f52237s.get((i9 - size4) - size5)).f50104e : ql0.f57890c;
                        } else {
                            obj = ((lt5) sq5Var.m21574p().f52219a.get(i9 - size4)).f50104e;
                        }
                        int i10 = sq5Var.m21574p().f52220b;
                        if (i != i6) {
                            if (t56Var.m10151a(i)) {
                                Object objM10152b = t56Var.m10152b(i);
                                objM10152b.getClass();
                                int i11 = ((ql0) objM10152b).f57892b;
                                Object objM10152b2 = t56Var.m10152b(i);
                                objM10152b2.getClass();
                                Object obj2 = ((ql0) objM10152b2).f57891a;
                                if (i11 == i10 && fa4.m11650l(obj2, obj)) {
                                    z7 = true;
                                } else {
                                    z7 = true;
                                    h27Var.f41713l = true;
                                }
                            } else {
                                z7 = true;
                            }
                            ql0 ql0Var = (ql0) t56Var.m10152b(i);
                            if (ql0Var != null) {
                                ql0Var.f57892b = i10;
                                ql0Var.f57891a = obj;
                            } else {
                                ql0Var = new ql0();
                                ql0Var.f57891a = obj;
                                ql0Var.f57892b = i10;
                            }
                            t56Var.m21850i(i, ql0Var);
                            h27Var.f41709h = Math.min(h27Var.f41709h, i);
                            h27Var.f41710i = Math.max(h27Var.f41710i, i);
                            List list2 = (List) h27Var.f41703b.m21848g(i);
                            if (list2 != null) {
                                int size6 = list2.size();
                                for (int i12 = 0; i12 < size6; i12++) {
                                    ((ku4) list2.get(i12)).cancel();
                                }
                            }
                        } else {
                            z7 = true;
                        }
                        i9++;
                        f4 = f;
                        z8 = z7;
                        i6 = -1;
                    }
                    z4 = z8;
                    float f5 = f4;
                    if (h27Var.f41713l) {
                        boolean z10 = h27Var.f41707f <= f5 ? z4 : false;
                        if (sq5Var.m21572n()) {
                            pvc.m19522r(sq5Var.m21574p());
                            z6 = false;
                            h27Var.m13006d(sq5Var, sq5Var.m21570l(), sq5Var.m21573o(), sq5Var.m21574p().f52239u != null ? ((AbstractC0150d) cc4Var.f9881a).f2685o : 0, sq5Var.m21575q(), sq5Var.m21576r(), 0.0f, z10);
                        } else {
                            z6 = false;
                        }
                        h27Var.f41713l = z6;
                        z5 = z6;
                    } else {
                        z3 = z3;
                        z4 = z4;
                        z5 = false;
                    }
                } else {
                    z3 = z3;
                    z4 = true;
                    z5 = false;
                    h27Var.m13009g();
                }
                h27Var.f41708g = sq5Var.m21578t();
                r2 = z5;
            }
            ((xc9) this.f2683m).setValue(n27Var);
            ((xc9) this.f2667D).setValue(Boolean.valueOf(n27Var.f52232n));
            if (lt5Var != null) {
                i2 = lt5Var.f50100a;
            } else {
                r10 = r2;
            }
            if (r10 == 0 || i3 != 0) {
                r10 = i2;
                r7 = z4;
            } else {
                r7 = r2;
            }
            ((xc9) this.f2668E).setValue(Boolean.valueOf((boolean) r7));
            if (lt5Var != null) {
                this.f2675e = lt5Var.f50100a;
            }
            this.f2676f = i3;
            jc9 jc9VarM16139y = lda.m16139y();
            vi3 vi3VarMo3163e = jc9VarM16139y != null ? jc9VarM16139y.mo3163e() : null;
            jc9 jc9VarM16106F = lda.m16106F(jc9VarM16139y);
            if (z3) {
                try {
                    if (n27Var.f52227i < mo1039n() && Math.abs(this.f2680j) > 0.5f) {
                        f2 = this.f2680j;
                        if (m1038m().f52223e == Orientation.Vertical) {
                            if (Math.signum(f2) == Math.signum(-Float.intBitsToFloat((int) (m1043r() & 4294967295L)))) {
                                if (m1044s()) {
                                }
                            }
                        } else if (Math.signum(f2) == Math.signum(-Float.intBitsToFloat((int) (m1043r() >> 32)))) {
                            if (m1044s()) {
                            }
                        }
                        h27Var.m13007e(this.f2680j, n27Var);
                    }
                } catch (Throwable th) {
                    lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                    throw th;
                }
            }
            lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
            this.f2677g = v27.m23065a(n27Var, mo1039n());
            mo1039n();
            if (n27Var.f52223e == Orientation.Horizontal) {
                jM17188g = n27Var.m17188g() >> 32;
            } else {
                jM17188g = n27Var.m17188g() & 4294967295L;
            }
            int i13 = (int) jM17188g;
            n27Var.f52233o.getClass();
            jM15945h = l70.m15945h(r2, r2, i13);
            j = this.f2677g;
            if (jM15945h > j) {
                jM15945h = j;
            }
            this.f2678h = jM15945h;
        }
        ((qc9) tz1Var.f63126e).m19862i(f3);
        z4 = true;
        z3 = z9;
        r2 = 0;
        ((xc9) this.f2683m).setValue(n27Var);
        ((xc9) this.f2667D).setValue(Boolean.valueOf(n27Var.f52232n));
        if (lt5Var != null) {
            i2 = lt5Var.f50100a;
        } else {
            r10 = r2;
        }
        if (r10 == 0) {
            r10 = i2;
            r7 = z4;
        } else {
            r10 = i2;
            r7 = z4;
        }
        ((xc9) this.f2668E).setValue(Boolean.valueOf((boolean) r7));
        if (lt5Var != null) {
            this.f2675e = lt5Var.f50100a;
        }
        this.f2676f = i3;
        jc9 jc9VarM16139y2 = lda.m16139y();
        vi3 vi3VarMo3163e2 = jc9VarM16139y2 != null ? jc9VarM16139y2.mo3163e() : null;
        jc9 jc9VarM16106F2 = lda.m16106F(jc9VarM16139y2);
        if (z3) {
            if (n27Var.f52227i < mo1039n()) {
                f2 = this.f2680j;
                if (m1038m().f52223e == Orientation.Vertical) {
                    if (Math.signum(f2) == Math.signum(-Float.intBitsToFloat((int) (m1043r() & 4294967295L)))) {
                        if (m1044s()) {
                        }
                    }
                } else if (Math.signum(f2) == Math.signum(-Float.intBitsToFloat((int) (m1043r() >> 32)))) {
                    if (m1044s()) {
                    }
                }
                h27Var.m13007e(this.f2680j, n27Var);
            }
        }
        lda.m16110J(jc9VarM16139y2, jc9VarM16106F2, vi3VarMo3163e2);
        this.f2677g = v27.m23065a(n27Var, mo1039n());
        mo1039n();
        if (n27Var.f52223e == Orientation.Horizontal) {
            jM17188g = n27Var.m17188g() >> 32;
        } else {
            jM17188g = n27Var.m17188g() & 4294967295L;
        }
        int i14 = (int) jM17188g;
        n27Var.f52233o.getClass();
        jM15945h = l70.m15945h(r2, r2, i14);
        j = this.f2677g;
        if (jM15945h > j) {
            jM15945h = j;
        }
        this.f2678h = jM15945h;
    }

    /* JADX INFO: renamed from: i */
    public final Object m1034i(ContinuationImpl continuationImpl) {
        Object objM19677p;
        return (((xc9) this.f2683m).getValue() == v27.f64741b && (objM19677p = this.f2694x.m19677p(continuationImpl)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? objM19677p : xfa.f68157a;
    }

    /* JADX INFO: renamed from: j */
    public final int m1035j(int i) {
        if (mo1039n() > 0) {
            return l70.m15945h(i, 0, mo1039n() - 1);
        }
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public final int m1036k() {
        return ((sc9) this.f2674d.f63125d).m21222h();
    }

    /* JADX INFO: renamed from: l */
    public final float m1037l() {
        return ((qc9) this.f2674d.f63126e).m19861h();
    }

    /* JADX INFO: renamed from: m */
    public final n27 m1038m() {
        return (n27) ((xc9) this.f2683m).getValue();
    }

    /* JADX INFO: renamed from: n */
    public abstract int mo1039n();

    /* JADX INFO: renamed from: o */
    public final int m1040o() {
        return ((n27) ((xc9) this.f2683m).getValue()).f52220b;
    }

    /* JADX INFO: renamed from: p */
    public final int m1041p() {
        return ((n27) ((xc9) this.f2683m).getValue()).f52221c + m1040o();
    }

    /* JADX INFO: renamed from: q */
    public final int m1042q() {
        return ((Number) this.f2689s.getValue()).intValue();
    }

    /* JADX INFO: renamed from: r */
    public final long m1043r() {
        return ((gq6) ((xc9) this.f2673c).getValue()).f41189a;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m1044s() {
        return ((int) Float.intBitsToFloat((int) (m1043r() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (m1043r() & 4294967295L))) == 0;
    }

    /* JADX INFO: renamed from: v */
    public final void m1045v(float f, int i, boolean z) {
        tz1 tz1Var = this.f2674d;
        sc9 sc9Var = (sc9) tz1Var.f63125d;
        qc9 qc9Var = (qc9) tz1Var.f63126e;
        if (sc9Var.m21222h() != i || qc9Var.m19861h() != f) {
            this.f2692v.m13009g();
        }
        ((sc9) tz1Var.f63125d).m21223i(i);
        ((eu4) tz1Var.f63127f).m11342c(i);
        qc9Var.m19862i(f);
        tz1Var.f63124c = null;
        if (!z) {
            fa4.m11663y(this.f2666C);
            return;
        }
        C0357g c0357g = (C0357g) ((xc9) this.f2695y).getValue();
        if (c0357g != null) {
            c0357g.m1598l();
        }
    }
}
