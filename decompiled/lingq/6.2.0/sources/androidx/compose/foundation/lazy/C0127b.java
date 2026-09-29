package androidx.compose.foundation.lazy;

import android.os.Trace;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.C0101i;
import androidx.compose.foundation.lazy.layout.C0135d;
import androidx.compose.foundation.lazy.layout.C0136e;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.runtime.AbstractC0278f;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.b72;
import p000.ct4;
import p000.d32;
import p000.do8;
import p000.fa4;
import p000.fs6;
import p000.hv4;
import p000.ii0;
import p000.iu4;
import p000.iv4;
import p000.jc9;
import p000.ku4;
import p000.kv4;
import p000.l54;
import p000.lda;
import p000.ln1;
import p000.lu4;
import p000.mv4;
import p000.or3;
import p000.q60;
import p000.s46;
import p000.t66;
import p000.tf4;
import p000.u91;
import p000.v56;
import p000.vi3;
import p000.ws4;
import p000.xc9;
import p000.xfa;
import p000.y91;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0127b implements do8 {

    /* JADX INFO: renamed from: y */
    public static final fs6 f2435y = d32.m10027Y(new ln1(11), new tf4(6));

    /* JADX INFO: renamed from: a */
    public final b72 f2436a;

    /* JADX INFO: renamed from: b */
    public boolean f2437b;

    /* JADX INFO: renamed from: c */
    public hv4 f2438c;

    /* JADX INFO: renamed from: d */
    public boolean f2439d;

    /* JADX INFO: renamed from: e */
    public final ws4 f2440e;

    /* JADX INFO: renamed from: f */
    public final t66 f2441f;

    /* JADX INFO: renamed from: g */
    public final v56 f2442g;

    /* JADX INFO: renamed from: h */
    public float f2443h;

    /* JADX INFO: renamed from: i */
    public boolean f2444i;

    /* JADX INFO: renamed from: j */
    public final C0101i f2445j;

    /* JADX INFO: renamed from: k */
    public final boolean f2446k;

    /* JADX INFO: renamed from: l */
    public C0357g f2447l;

    /* JADX INFO: renamed from: m */
    public final ct4 f2448m;

    /* JADX INFO: renamed from: n */
    public final q60 f2449n;

    /* JADX INFO: renamed from: o */
    public final C0135d f2450o;

    /* JADX INFO: renamed from: p */
    public final ii0 f2451p;

    /* JADX INFO: renamed from: q */
    public final lu4 f2452q;

    /* JADX INFO: renamed from: r */
    public final or3 f2453r;

    /* JADX INFO: renamed from: s */
    public final iu4 f2454s;

    /* JADX INFO: renamed from: t */
    public final t66 f2455t;

    /* JADX INFO: renamed from: u */
    public final t66 f2456u;

    /* JADX INFO: renamed from: v */
    public final t66 f2457v;

    /* JADX INFO: renamed from: w */
    public final t66 f2458w;

    /* JADX INFO: renamed from: x */
    public final C0136e f2459x;

    public C0127b(int i, int i2) {
        b72 b72Var = new b72();
        b72Var.f8040a = -1;
        b72Var.f8042c = -1;
        this.f2436a = b72Var;
        this.f2440e = new ws4(i, i2, 1);
        this.f2441f = AbstractC0278f.m1259i(mv4.f51883a, s46.f60289d);
        this.f2442g = new v56();
        this.f2445j = new C0101i(new kv4(this, 0));
        this.f2446k = true;
        this.f2448m = new ct4(this, 1);
        this.f2449n = new q60();
        this.f2450o = new C0135d();
        this.f2451p = new ii0(1);
        this.f2452q = new lu4(new y91(this, i));
        this.f2453r = new or3(this);
        this.f2454s = new iu4();
        this.f2455t = fa4.m11655q();
        Boolean bool = Boolean.FALSE;
        this.f2456u = AbstractC0278f.m1260j(bool);
        this.f2457v = AbstractC0278f.m1260j(bool);
        this.f2458w = fa4.m11655q();
        this.f2459x = new C0136e();
    }

    /* JADX INFO: renamed from: l */
    public static Object m973l(C0127b c0127b, int i, ContinuationImpl continuationImpl) throws Throwable {
        c0127b.getClass();
        Object objMo864c = c0127b.mo864c(MutatePriority.Default, new LazyListState$scrollToItem$2(c0127b, i, null), continuationImpl);
        return objMo864c == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo864c : xfa.f68157a;
    }

    @Override // p000.do8
    /* JADX INFO: renamed from: a */
    public final boolean mo863a() {
        return this.f2445j.mo863a();
    }

    @Override // p000.do8
    /* JADX INFO: renamed from: b */
    public final boolean mo974b() {
        return ((Boolean) ((xc9) this.f2457v).getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if (r6.f2445j.mo864c(r7, r8, r0) == r1) goto L23;
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
    @Override // p000.do8
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo864c(MutatePriority mutatePriority, zi3 zi3Var, ContinuationImpl continuationImpl) throws Throwable {
        LazyListState$scroll$1 lazyListState$scroll$1;
        zi3 zi3Var2;
        if (continuationImpl instanceof LazyListState$scroll$1) {
            lazyListState$scroll$1 = (LazyListState$scroll$1) continuationImpl;
            int i = lazyListState$scroll$1.f2432e;
            if ((i & Integer.MIN_VALUE) != 0) {
                lazyListState$scroll$1.f2432e = i - Integer.MIN_VALUE;
            } else {
                lazyListState$scroll$1 = new LazyListState$scroll$1(this, continuationImpl);
            }
        } else {
            lazyListState$scroll$1 = new LazyListState$scroll$1(this, continuationImpl);
        }
        Object obj = lazyListState$scroll$1.f2430c;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = lazyListState$scroll$1.f2432e;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            if (((xc9) this.f2441f).getValue() == mv4.f51883a) {
                lazyListState$scroll$1.f2428a = mutatePriority;
                lazyListState$scroll$1.f2429b = (SuspendLambda) zi3Var;
                lazyListState$scroll$1.f2432e = 1;
                if (this.f2449n.m19677p(lazyListState$scroll$1) != obj2) {
                }
            }
            zi3Var2 = zi3Var;
            zi3Var2 = zi3Var;
            return obj2;
        }
        if (i2 == 1) {
            zi3 zi3Var3 = (zi3) lazyListState$scroll$1.f2429b;
            mutatePriority = lazyListState$scroll$1.f2428a;
            AbstractC3193b.m15359b(obj);
            zi3Var2 = zi3Var3;
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
        zi3Var2 = zi3Var;
        zi3Var2 = zi3Var;
        zi3Var2 = zi3Var;
        lazyListState$scroll$1.f2428a = null;
        lazyListState$scroll$1.f2429b = null;
        lazyListState$scroll$1.f2432e = 2;
    }

    @Override // p000.do8
    /* JADX INFO: renamed from: d */
    public final boolean mo975d() {
        return ((Boolean) ((xc9) this.f2456u).getValue()).booleanValue();
    }

    @Override // p000.do8
    /* JADX INFO: renamed from: e */
    public final float mo865e(float f) {
        return this.f2445j.mo865e(f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, xfa] */
    /* JADX INFO: renamed from: f */
    public final Object m976f(int i, int i2, ContinuationImpl continuationImpl) throws Throwable {
        LazyListState$animateScrollToItem$1 lazyListState$animateScrollToItem$1;
        if (continuationImpl instanceof LazyListState$animateScrollToItem$1) {
            lazyListState$animateScrollToItem$1 = (LazyListState$animateScrollToItem$1) continuationImpl;
            int i3 = lazyListState$animateScrollToItem$1.f2422c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lazyListState$animateScrollToItem$1.f2422c = i3 - Integer.MIN_VALUE;
            } else {
                lazyListState$animateScrollToItem$1 = new LazyListState$animateScrollToItem$1(this, continuationImpl);
            }
        } else {
            lazyListState$animateScrollToItem$1 = new LazyListState$animateScrollToItem$1(this, continuationImpl);
        }
        Object obj = lazyListState$animateScrollToItem$1.f2420a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = lazyListState$animateScrollToItem$1.f2422c;
        try {
            if (i4 == 0) {
                AbstractC3193b.m15359b(obj);
                this.f2444i = true;
                LazyListState$animateScrollToItem$2 lazyListState$animateScrollToItem$2 = new LazyListState$animateScrollToItem$2(this, i, i2, null);
                lazyListState$animateScrollToItem$1.f2422c = 1;
                if (mo864c(MutatePriority.Default, lazyListState$animateScrollToItem$2, lazyListState$animateScrollToItem$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i4 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            this.f2444i = false;
            this = xfa.f68157a;
            return this;
        } catch (Throwable th) {
            this.f2444i = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m977g(hv4 hv4Var, boolean z, boolean z2) {
        List list = hv4Var.f42985k;
        int i = hv4Var.f42988n;
        int i2 = hv4Var.f42976b;
        iv4 iv4Var = hv4Var.f42975a;
        this.f2452q.f50143e = list.size();
        C0136e c0136e = this.f2459x;
        ws4 ws4Var = this.f2440e;
        if (!z && this.f2437b) {
            this.f2438c = hv4Var;
            jc9 jc9VarM16139y = lda.m16139y();
            vi3 vi3VarMo3163e = jc9VarM16139y != null ? jc9VarM16139y.mo3163e() : null;
            jc9 jc9VarM16106F = lda.m16106F(jc9VarM16139y);
            try {
                if (c0136e.m1015a() && iv4Var != null && iv4Var.f44648a == ws4Var.f67245b.m21222h() && i2 == ws4Var.f67246c.m21222h()) {
                    c0136e.m1016b();
                }
                return;
            } finally {
                lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
            }
        }
        if (z) {
            this.f2437b = true;
        }
        ((xc9) this.f2457v).setValue(Boolean.valueOf(((iv4Var != null ? iv4Var.f44648a : 0) == 0 && i2 == 0) ? false : true));
        ((xc9) this.f2456u).setValue(Boolean.valueOf(hv4Var.f42977c));
        this.f2443h -= hv4Var.f42978d;
        ((xc9) this.f2441f).setValue(hv4Var);
        if (z2) {
            ws4Var.getClass();
            if (i2 < 0.0f) {
                l54.m15816c("scrollOffset should be non-negative");
            }
            ws4Var.f67246c.m21223i(i2);
        } else {
            iv4 iv4Var2 = (iv4) u91.m22591I0(list);
            iv4 iv4Var3 = (iv4) u91.m22598P0(list);
            Trace.setCounter("firstVisibleItem:index", iv4Var2 != null ? iv4Var2.f44648a : -1L);
            Trace.setCounter("lastVisibleItem:index", iv4Var3 != null ? iv4Var3.f44648a : -1L);
            ws4Var.getClass();
            ws4Var.f67248e = iv4Var != null ? iv4Var.f44658k : null;
            if (ws4Var.f67247d || i > 0) {
                ws4Var.f67247d = true;
                if (i2 < 0.0f) {
                    l54.m15816c("scrollOffset should be non-negative");
                }
                ws4Var.m24141a(iv4Var != null ? iv4Var.f44648a : 0, i2);
            }
            if (this.f2446k) {
                b72 b72Var = this.f2436a;
                int i3 = b72Var.f8040a;
                boolean z3 = b72Var.f8041b;
                if (i3 != -1 && !list.isEmpty() && i3 != b72.m3393a(hv4Var, z3)) {
                    b72Var.f8040a = -1;
                    ku4 ku4Var = (ku4) b72Var.f8044e;
                    if (ku4Var != null) {
                        ku4Var.cancel();
                    }
                    b72Var.f8044e = null;
                }
                int i4 = b72Var.f8042c;
                if (i4 != -1 && b72Var.f8043d != 0.0f && i4 != i && !list.isEmpty()) {
                    int iM3393a = b72.m3393a(hv4Var, b72Var.f8043d < 0.0f);
                    if (iM3393a >= 0 && iM3393a < i) {
                        b72Var.f8040a = iM3393a;
                        b72Var.f8044e = or3.m18289P(this.f2453r, iM3393a);
                    }
                }
                b72Var.f8042c = i;
            }
        }
        if (z) {
            c0136e.m1017c(hv4Var.f42980f, hv4Var.f42983i, hv4Var.f42982h);
        }
    }

    /* JADX INFO: renamed from: h */
    public final int m978h() {
        return this.f2440e.f67245b.m21222h();
    }

    /* JADX INFO: renamed from: i */
    public final int m979i() {
        return this.f2440e.f67246c.m21222h();
    }

    /* JADX INFO: renamed from: j */
    public final hv4 m980j() {
        return (hv4) ((xc9) this.f2441f).getValue();
    }

    /* JADX INFO: renamed from: k */
    public final void m981k(float f, hv4 hv4Var) {
        ku4 ku4Var;
        ku4 ku4Var2;
        if (this.f2446k) {
            boolean zIsEmpty = hv4Var.f42985k.isEmpty();
            b72 b72Var = this.f2436a;
            if (!zIsEmpty) {
                boolean z = f < 0.0f;
                int iM3393a = b72.m3393a(hv4Var, z);
                if (iM3393a >= 0 && iM3393a < hv4Var.f42988n) {
                    if (iM3393a != b72Var.f8040a) {
                        if (b72Var.f8041b != z) {
                            b72Var.f8040a = -1;
                            ku4 ku4Var3 = (ku4) b72Var.f8044e;
                            if (ku4Var3 != null) {
                                ku4Var3.cancel();
                            }
                            b72Var.f8044e = null;
                        }
                        b72Var.f8041b = z;
                        b72Var.f8040a = iM3393a;
                        b72Var.f8044e = or3.m18289P(this.f2453r, iM3393a);
                    }
                    List list = hv4Var.f42985k;
                    if (z) {
                        iv4 iv4Var = (iv4) u91.m22597O0(list);
                        if (((iv4Var.f44662o + iv4Var.f44663p) + hv4Var.f42991q) - hv4Var.f42987m < (-f) && (ku4Var2 = (ku4) b72Var.f8044e) != null) {
                            ku4Var2.mo3885a();
                        }
                    } else if (hv4Var.f42986l - ((iv4) u91.m22589G0(list)).f44662o < f && (ku4Var = (ku4) b72Var.f8044e) != null) {
                        ku4Var.mo3885a();
                    }
                }
            }
            b72Var.f8043d = f;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m982m(int i, int i2) {
        ws4 ws4Var = this.f2440e;
        if (ws4Var.f67245b.m21222h() != i || ws4Var.f67246c.m21222h() != i2) {
            C0135d c0135d = this.f2450o;
            c0135d.m1012e();
            c0135d.f2555b = null;
            c0135d.f2556c = -1;
        }
        ws4Var.m24141a(i, i2);
        ws4Var.f67248e = null;
        C0357g c0357g = this.f2447l;
        if (c0357g != null) {
            c0357g.m1598l();
        }
    }
}
