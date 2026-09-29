package androidx.compose.animation.core;

import androidx.compose.runtime.AbstractC0278f;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3081hn;
import p000.AbstractC3489q9;
import p000.C0817bn;
import p000.C2934dn;
import p000.C2970en;
import p000.C3007fn;
import p000.InterfaceC0025an;
import p000.bg9;
import p000.fa4;
import p000.jda;
import p000.l70;
import p000.or9;
import p000.t66;
import p000.vi3;
import p000.xc9;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.animation.core.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0059a {

    /* JADX INFO: renamed from: a */
    public final jda f1538a;

    /* JADX INFO: renamed from: b */
    public final Object f1539b;

    /* JADX INFO: renamed from: c */
    public final C0817bn f1540c;

    /* JADX INFO: renamed from: d */
    public final t66 f1541d;

    /* JADX INFO: renamed from: e */
    public final t66 f1542e;

    /* JADX INFO: renamed from: f */
    public final C0062d f1543f;

    /* JADX INFO: renamed from: g */
    public final bg9 f1544g;

    /* JADX INFO: renamed from: h */
    public final AbstractC3081hn f1545h;

    /* JADX INFO: renamed from: i */
    public final AbstractC3081hn f1546i;

    /* JADX INFO: renamed from: j */
    public final AbstractC3081hn f1547j;

    /* JADX INFO: renamed from: k */
    public final AbstractC3081hn f1548k;

    public C0059a(Object obj, jda jdaVar, Object obj2) {
        this.f1538a = jdaVar;
        this.f1539b = obj2;
        C0817bn c0817bn = new C0817bn(jdaVar, obj, null, 60);
        this.f1540c = c0817bn;
        this.f1541d = AbstractC0278f.m1260j(Boolean.FALSE);
        this.f1542e = AbstractC0278f.m1260j(obj);
        this.f1543f = new C0062d();
        this.f1544g = new bg9(obj2);
        AbstractC3081hn abstractC3081hn = c0817bn.f8705c;
        boolean z = abstractC3081hn instanceof C2934dn;
        AbstractC3081hn abstractC3081hn2 = z ? AbstractC3489q9.f57411f : abstractC3081hn instanceof C2970en ? AbstractC3489q9.f57412g : abstractC3081hn instanceof C3007fn ? AbstractC3489q9.f57413h : AbstractC3489q9.f57414i;
        this.f1545h = abstractC3081hn2;
        AbstractC3081hn abstractC3081hn3 = z ? AbstractC3489q9.f57407b : abstractC3081hn instanceof C2970en ? AbstractC3489q9.f57408c : abstractC3081hn instanceof C3007fn ? AbstractC3489q9.f57409d : AbstractC3489q9.f57410e;
        this.f1546i = abstractC3081hn3;
        this.f1547j = abstractC3081hn2;
        this.f1548k = abstractC3081hn3;
    }

    /* JADX INFO: renamed from: a */
    public static final Object m742a(C0059a c0059a, Object obj) {
        jda jdaVar = c0059a.f1538a;
        AbstractC3081hn abstractC3081hn = c0059a.f1548k;
        AbstractC3081hn abstractC3081hn2 = c0059a.f1547j;
        if (!fa4.m11650l(abstractC3081hn2, c0059a.f1545h) || !fa4.m11650l(abstractC3081hn, c0059a.f1546i)) {
            AbstractC3081hn abstractC3081hn3 = (AbstractC3081hn) jdaVar.f45442a.invoke(obj);
            int iMo10484b = abstractC3081hn3.mo10484b();
            boolean z = false;
            for (int i = 0; i < iMo10484b; i++) {
                if (abstractC3081hn3.mo10483a(i) < abstractC3081hn2.mo10483a(i) || abstractC3081hn3.mo10483a(i) > abstractC3081hn.mo10483a(i)) {
                    abstractC3081hn3.mo10487e(i, l70.m15944g(abstractC3081hn3.mo10483a(i), abstractC3081hn2.mo10483a(i), abstractC3081hn.mo10483a(i)));
                    z = true;
                }
            }
            if (z) {
                return jdaVar.f45443b.invoke(abstractC3081hn3);
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: b */
    public static final void m743b(C0059a c0059a) {
        C0817bn c0817bn = c0059a.f1540c;
        c0817bn.f8705c.mo10486d();
        c0817bn.f8706d = Long.MIN_VALUE;
        ((xc9) c0059a.f1541d).setValue(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: c */
    public static Object m744c(C0059a c0059a, Object obj, InterfaceC0025an interfaceC0025an, vi3 vi3Var, Continuation continuation, int i) {
        if ((i & 2) != 0) {
            interfaceC0025an = c0059a.f1544g;
        }
        InterfaceC0025an interfaceC0025an2 = interfaceC0025an;
        Object objInvoke = c0059a.f1538a.f45443b.invoke(c0059a.f1540c.f8705c);
        if ((i & 8) != 0) {
            vi3Var = null;
        }
        vi3 vi3Var2 = vi3Var;
        Object objM745d = c0059a.m745d();
        jda jdaVar = c0059a.f1538a;
        return C0062d.m753a(c0059a.f1543f, new Animatable$runAnimation$2(c0059a, objInvoke, new or9(interfaceC0025an2, jdaVar, objM745d, obj, (AbstractC3081hn) jdaVar.f45442a.invoke(objInvoke)), c0059a.f1540c.f8706d, vi3Var2, null), continuation);
    }

    /* JADX INFO: renamed from: d */
    public final Object m745d() {
        return ((xc9) this.f1540c.f8704b).getValue();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m746e() {
        return ((Boolean) ((xc9) this.f1541d).getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: f */
    public final Object m747f(Object obj, Continuation continuation) {
        Object objM753a = C0062d.m753a(this.f1543f, new Animatable$snapTo$2(this, obj, null), continuation);
        return objM753a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM753a : xfa.f68157a;
    }

    /* JADX INFO: renamed from: g */
    public final Object m748g(SuspendLambda suspendLambda) {
        Object objM753a = C0062d.m753a(this.f1543f, new Animatable$stop$2(this, null), suspendLambda);
        return objM753a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM753a : xfa.f68157a;
    }

    public /* synthetic */ C0059a(Object obj, jda jdaVar, Object obj2, int i) {
        this(obj, jdaVar, (i & 4) != 0 ? null : obj2);
    }
}
