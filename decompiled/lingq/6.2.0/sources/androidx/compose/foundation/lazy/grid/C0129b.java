package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.C0101i;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.C0135d;
import androidx.compose.foundation.lazy.layout.C0136e;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.runtime.AbstractC0278f;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C0011a9;
import p000.C3386nv;
import p000.b72;
import p000.bt4;
import p000.ct4;
import p000.d32;
import p000.do8;
import p000.et4;
import p000.fa4;
import p000.fs6;
import p000.ii0;
import p000.iu4;
import p000.jc9;
import p000.ku4;
import p000.l54;
import p000.lda;
import p000.ln1;
import p000.lu4;
import p000.or3;
import p000.q60;
import p000.r46;
import p000.s46;
import p000.ss4;
import p000.t66;
import p000.tf4;
import p000.ts4;
import p000.u91;
import p000.us4;
import p000.v56;
import p000.vi3;
import p000.ws4;
import p000.x66;
import p000.xc9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0129b implements do8 {

    /* JADX INFO: renamed from: w */
    public static final fs6 f2467w = d32.m10027Y(new ln1(10), new tf4(2));

    /* JADX INFO: renamed from: a */
    public final b72 f2468a;

    /* JADX INFO: renamed from: b */
    public boolean f2469b;

    /* JADX INFO: renamed from: c */
    public ss4 f2470c;

    /* JADX INFO: renamed from: d */
    public final ws4 f2471d;

    /* JADX INFO: renamed from: e */
    public final t66 f2472e;

    /* JADX INFO: renamed from: f */
    public final v56 f2473f;

    /* JADX INFO: renamed from: g */
    public float f2474g;

    /* JADX INFO: renamed from: h */
    public final C0101i f2475h;

    /* JADX INFO: renamed from: i */
    public final boolean f2476i;

    /* JADX INFO: renamed from: j */
    public C0357g f2477j;

    /* JADX INFO: renamed from: k */
    public final ct4 f2478k;

    /* JADX INFO: renamed from: l */
    public final q60 f2479l;

    /* JADX INFO: renamed from: m */
    public final C0135d f2480m;

    /* JADX INFO: renamed from: n */
    public final ii0 f2481n;

    /* JADX INFO: renamed from: o */
    public final lu4 f2482o;

    /* JADX INFO: renamed from: p */
    public final or3 f2483p;

    /* JADX INFO: renamed from: q */
    public final iu4 f2484q;

    /* JADX INFO: renamed from: r */
    public final t66 f2485r;

    /* JADX INFO: renamed from: s */
    public final t66 f2486s;

    /* JADX INFO: renamed from: t */
    public final t66 f2487t;

    /* JADX INFO: renamed from: u */
    public final t66 f2488u;

    /* JADX INFO: renamed from: v */
    public final C0136e f2489v;

    public C0129b(int i, int i2) {
        b72 b72Var = new b72();
        b72Var.f8040a = -1;
        b72Var.f8044e = new x66(new ku4[16]);
        b72Var.f8042c = -1;
        this.f2468a = b72Var;
        this.f2471d = new ws4(i, i2, 0);
        this.f2472e = AbstractC0278f.m1259i(et4.f37825a, s46.f60289d);
        this.f2473f = new v56();
        this.f2475h = new C0101i(new C0011a9(this, 24));
        this.f2476i = true;
        this.f2478k = new ct4(this, 0);
        this.f2479l = new q60();
        this.f2480m = new C0135d();
        this.f2481n = new ii0(1);
        this.f2482o = new lu4(new bt4(this, i, 0));
        this.f2483p = new or3(this);
        this.f2484q = new iu4();
        this.f2485r = fa4.m11655q();
        this.f2486s = fa4.m11655q();
        Boolean bool = Boolean.FALSE;
        this.f2487t = AbstractC0278f.m1260j(bool);
        this.f2488u = AbstractC0278f.m1260j(bool);
        this.f2489v = new C0136e();
    }

    @Override // p000.do8
    /* JADX INFO: renamed from: a */
    public final boolean mo863a() {
        return this.f2475h.mo863a();
    }

    @Override // p000.do8
    /* JADX INFO: renamed from: b */
    public final boolean mo974b() {
        return ((Boolean) ((xc9) this.f2488u).getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if (r6.f2475h.mo864c(r7, r8, r0) == r1) goto L23;
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
        LazyGridState$scroll$1 lazyGridState$scroll$1;
        zi3 zi3Var2;
        if (continuationImpl instanceof LazyGridState$scroll$1) {
            lazyGridState$scroll$1 = (LazyGridState$scroll$1) continuationImpl;
            int i = lazyGridState$scroll$1.f2464e;
            if ((i & Integer.MIN_VALUE) != 0) {
                lazyGridState$scroll$1.f2464e = i - Integer.MIN_VALUE;
            } else {
                lazyGridState$scroll$1 = new LazyGridState$scroll$1(this, continuationImpl);
            }
        } else {
            lazyGridState$scroll$1 = new LazyGridState$scroll$1(this, continuationImpl);
        }
        Object obj = lazyGridState$scroll$1.f2462c;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = lazyGridState$scroll$1.f2464e;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            if (((xc9) this.f2472e).getValue() == et4.f37825a) {
                lazyGridState$scroll$1.f2460a = mutatePriority;
                lazyGridState$scroll$1.f2461b = (SuspendLambda) zi3Var;
                lazyGridState$scroll$1.f2464e = 1;
                if (this.f2479l.m19677p(lazyGridState$scroll$1) != obj2) {
                }
            }
            zi3Var2 = zi3Var;
            zi3Var2 = zi3Var;
            return obj2;
        }
        if (i2 == 1) {
            zi3 zi3Var3 = (zi3) lazyGridState$scroll$1.f2461b;
            mutatePriority = lazyGridState$scroll$1.f2460a;
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
        lazyGridState$scroll$1.f2460a = null;
        lazyGridState$scroll$1.f2461b = null;
        lazyGridState$scroll$1.f2464e = 2;
    }

    @Override // p000.do8
    /* JADX INFO: renamed from: d */
    public final boolean mo975d() {
        return ((Boolean) ((xc9) this.f2487t).getValue()).booleanValue();
    }

    @Override // p000.do8
    /* JADX INFO: renamed from: e */
    public final float mo865e(float f) {
        return this.f2475h.mo865e(f);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00fa  */
    /* JADX INFO: renamed from: f */
    public final void m984f(ss4 ss4Var, boolean z, boolean z2) {
        Object obj;
        int i;
        List list = ss4Var.f61346m;
        int i2 = ss4Var.f61349p;
        us4 us4Var = ss4Var.f61334a;
        int i3 = ss4Var.f61335b;
        this.f2482o.f50143e = list.size();
        ts4 ts4Var = null;
        ws4 ws4Var = this.f2471d;
        C0136e c0136e = this.f2489v;
        if (!z && this.f2469b) {
            this.f2470c = ss4Var;
            jc9 jc9VarM16139y = lda.m16139y();
            vi3 vi3VarMo3163e = jc9VarM16139y != null ? jc9VarM16139y.mo3163e() : null;
            jc9 jc9VarM16106F = lda.m16106F(jc9VarM16139y);
            try {
                if (c0136e.m1015a() && i3 == ws4Var.f67246c.m21222h() && us4Var != null) {
                    ts4[] ts4VarArr = us4Var.f64288b;
                    if (ts4VarArr.length != 0) {
                        ts4Var = ts4VarArr[0];
                    }
                    if (ts4Var != null && ts4Var.f62798a == ws4Var.f67245b.m21222h()) {
                        c0136e.m1016b();
                    }
                }
                return;
            } finally {
                lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
            }
        }
        if (z) {
            this.f2469b = true;
        }
        this.f2474g -= ss4Var.f61337d;
        ((xc9) this.f2472e).setValue(ss4Var);
        ((xc9) this.f2488u).setValue(Boolean.valueOf(((us4Var != null ? us4Var.f64287a : 0) == 0 && i3 == 0) ? false : true));
        ((xc9) this.f2487t).setValue(Boolean.valueOf(ss4Var.f61336c));
        if (z2) {
            ws4Var.getClass();
            if (i3 < 0.0f) {
                l54.m15816c("scrollOffset should be non-negative");
            }
            ws4Var.f67246c.m21223i(i3);
        } else {
            ws4Var.getClass();
            if (us4Var != null) {
                ts4[] ts4VarArr2 = us4Var.f64288b;
                ts4 ts4Var2 = ts4VarArr2.length == 0 ? null : ts4VarArr2[0];
                if (ts4Var2 != null) {
                    obj = ts4Var2.f62799b;
                } else {
                    obj = null;
                }
            } else {
                obj = null;
            }
            ws4Var.f67248e = obj;
            if (ws4Var.f67247d || i2 > 0) {
                ws4Var.f67247d = true;
                if (i3 < 0.0f) {
                    l54.m15816c("scrollOffset should be non-negative (" + i3 + ')');
                }
                if (us4Var != null) {
                    ts4[] ts4VarArr3 = us4Var.f64288b;
                    ts4Var = ts4VarArr3.length != 0 ? ts4VarArr3[0] : null;
                    if (ts4Var != null) {
                        i = ts4Var.f62798a;
                    } else {
                        i = 0;
                    }
                } else {
                    i = 0;
                }
                ws4Var.m24141a(i, i3);
            }
            if (this.f2476i) {
                b72 b72Var = this.f2468a;
                x66 x66Var = (x66) b72Var.f8044e;
                int i4 = b72Var.f8040a;
                boolean z3 = b72Var.f8041b;
                if (i4 != -1 && !list.isEmpty() && i4 != b72.m3394b(ss4Var, z3)) {
                    b72Var.f8040a = -1;
                    Object[] objArr = x66Var.f67830a;
                    int i5 = x66Var.f67832c;
                    for (int i6 = 0; i6 < i5; i6++) {
                        ((ku4) objArr[i6]).cancel();
                    }
                    x66Var.m24310h();
                }
                int i7 = b72Var.f8042c;
                if (i7 != -1 && b72Var.f8043d != 0.0f && i7 != i2 && !list.isEmpty()) {
                    int iM3394b = b72.m3394b(ss4Var, b72Var.f8043d < 0.0f);
                    int i8 = b72Var.f8043d < 0.0f ? ((ts4) u91.m22597O0(list)).f62798a + 1 : ((ts4) u91.m22589G0(list)).f62798a - 1;
                    if (i8 >= 0 && i8 < i2 && iM3394b != b72Var.f8040a && iM3394b >= 0) {
                        b72Var.f8040a = iM3394b;
                        x66Var.m24310h();
                        x66Var.m24307e(x66Var.f67832c, this.f2483p.m18302O(iM3394b));
                    }
                }
                b72Var.f8042c = i2;
            }
        }
        if (z) {
            c0136e.m1017c(ss4Var.f61339f, ss4Var.f61342i, ss4Var.f61341h);
        }
    }

    /* JADX INFO: renamed from: g */
    public final ss4 m985g() {
        return (ss4) ((xc9) this.f2472e).getValue();
    }

    /* JADX INFO: renamed from: h */
    public final void m986h(float f, ss4 ss4Var) {
        if (this.f2476i) {
            b72 b72Var = this.f2468a;
            x66 x66Var = (x66) b72Var.f8044e;
            List list = ss4Var.f61346m;
            List list2 = ss4Var.f61346m;
            Orientation orientation = ss4Var.f61350q;
            if (!list.isEmpty()) {
                int i = 0;
                boolean z = f < 0.0f;
                int iM3394b = b72.m3394b(ss4Var, z);
                int i2 = z ? ((ts4) u91.m22597O0(list2)).f62798a + 1 : ((ts4) u91.m22589G0(list2)).f62798a - 1;
                if (i2 >= 0 && i2 < ss4Var.f61349p) {
                    if (iM3394b != b72Var.f8040a && iM3394b >= 0) {
                        if (b72Var.f8041b != z) {
                            Object[] objArr = x66Var.f67830a;
                            int i3 = x66Var.f67832c;
                            for (int i4 = 0; i4 < i3; i4++) {
                                ((ku4) objArr[i4]).cancel();
                            }
                        }
                        b72Var.f8041b = z;
                        b72Var.f8040a = iM3394b;
                        x66Var.m24310h();
                        x66Var.m24307e(x66Var.f67832c, this.f2483p.m18302O(iM3394b));
                    }
                    if (z) {
                        ts4 ts4Var = (ts4) u91.m22597O0(list2);
                        if (((r46.m20363F(ts4Var, orientation) + ((int) (orientation == Orientation.Vertical ? ts4Var.f62819v & 4294967295L : ts4Var.f62819v >> 32))) + ss4Var.f61352s) - ss4Var.f61348o < (-f)) {
                            Object[] objArr2 = x66Var.f67830a;
                            int i5 = x66Var.f67832c;
                            while (i < i5) {
                                ((ku4) objArr2[i]).mo3885a();
                                i++;
                            }
                        }
                    } else if (ss4Var.f61347n - r46.m20363F((ts4) u91.m22589G0(list2), orientation) < f) {
                        Object[] objArr3 = x66Var.f67830a;
                        int i6 = x66Var.f67832c;
                        while (i < i6) {
                            ((ku4) objArr3[i]).mo3885a();
                            i++;
                        }
                    }
                }
            }
            b72Var.f8043d = f;
        }
    }
}
