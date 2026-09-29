package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.C0101i;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.C0135d;
import androidx.compose.foundation.lazy.layout.C0136e;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.runtime.AbstractC0278f;
import java.util.Arrays;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3047gq;
import p000.C3386nv;
import p000.ct4;
import p000.d32;
import p000.dk1;
import p000.do8;
import p000.dw4;
import p000.e84;
import p000.eu4;
import p000.ew4;
import p000.fa4;
import p000.fs6;
import p000.fw4;
import p000.ii0;
import p000.iu4;
import p000.jc9;
import p000.k54;
import p000.ku4;
import p000.kv4;
import p000.lda;
import p000.ln1;
import p000.lu4;
import p000.m84;
import p000.q60;
import p000.s46;
import p000.sc9;
import p000.t56;
import p000.t66;
import p000.tf4;
import p000.u56;
import p000.u91;
import p000.v56;
import p000.vi3;
import p000.xc9;
import p000.xfa;
import p000.xs4;
import p000.zc2;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0144d implements do8 {

    /* JADX INFO: renamed from: x */
    public static final fs6 f2597x = d32.m10027Y(new ln1(13), new tf4(8));

    /* JADX INFO: renamed from: a */
    public boolean f2598a;

    /* JADX INFO: renamed from: b */
    public dw4 f2599b;

    /* JADX INFO: renamed from: c */
    public final zc2 f2600c;

    /* JADX INFO: renamed from: d */
    public final t66 f2601d = AbstractC0278f.m1259i(ew4.f37987a, s46.f60289d);

    /* JADX INFO: renamed from: e */
    public final C3047gq f2602e = new C3047gq(3);

    /* JADX INFO: renamed from: f */
    public final t66 f2603f;

    /* JADX INFO: renamed from: g */
    public final t66 f2604g;

    /* JADX INFO: renamed from: h */
    public C0357g f2605h;

    /* JADX INFO: renamed from: i */
    public final ct4 f2606i;

    /* JADX INFO: renamed from: j */
    public final q60 f2607j;

    /* JADX INFO: renamed from: k */
    public final ii0 f2608k;

    /* JADX INFO: renamed from: l */
    public final boolean f2609l;

    /* JADX INFO: renamed from: m */
    public final lu4 f2610m;

    /* JADX INFO: renamed from: n */
    public final C0101i f2611n;

    /* JADX INFO: renamed from: o */
    public float f2612o;

    /* JADX INFO: renamed from: p */
    public int f2613p;

    /* JADX INFO: renamed from: q */
    public final t56 f2614q;

    /* JADX INFO: renamed from: r */
    public final v56 f2615r;

    /* JADX INFO: renamed from: s */
    public final iu4 f2616s;

    /* JADX INFO: renamed from: t */
    public final C0135d f2617t;

    /* JADX INFO: renamed from: u */
    public final t66 f2618u;

    /* JADX INFO: renamed from: v */
    public final t66 f2619v;

    /* JADX INFO: renamed from: w */
    public final C0136e f2620w;

    public C0144d(int[] iArr, int[] iArr2) {
        this.f2600c = new zc2(iArr, iArr2, new LazyStaggeredGridState$scrollPosition$1(2, this, C0144d.class, "fillNearestIndices", "fillNearestIndices(II)[I", 0));
        Boolean bool = Boolean.FALSE;
        this.f2603f = AbstractC0278f.m1260j(bool);
        this.f2604g = AbstractC0278f.m1260j(bool);
        this.f2606i = new ct4(this, 2);
        this.f2607j = new q60();
        this.f2608k = new ii0(1);
        this.f2609l = true;
        this.f2610m = new lu4(null);
        this.f2611n = new C0101i(new kv4(this, 3));
        this.f2613p = -1;
        t56 t56Var = e84.f36837a;
        this.f2614q = new t56();
        this.f2615r = new v56();
        this.f2616s = new iu4();
        this.f2617t = new C0135d();
        this.f2618u = fa4.m11655q();
        this.f2619v = fa4.m11655q();
        this.f2620w = new C0136e();
    }

    @Override // p000.do8
    /* JADX INFO: renamed from: a */
    public final boolean mo863a() {
        return this.f2611n.mo863a();
    }

    @Override // p000.do8
    /* JADX INFO: renamed from: b */
    public final boolean mo974b() {
        return ((Boolean) ((xc9) this.f2604g).getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if (r6.f2611n.mo864c(r7, r8, r0) == r1) goto L23;
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
        LazyStaggeredGridState$scroll$1 lazyStaggeredGridState$scroll$1;
        zi3 zi3Var2;
        if (continuationImpl instanceof LazyStaggeredGridState$scroll$1) {
            lazyStaggeredGridState$scroll$1 = (LazyStaggeredGridState$scroll$1) continuationImpl;
            int i = lazyStaggeredGridState$scroll$1.f2585e;
            if ((i & Integer.MIN_VALUE) != 0) {
                lazyStaggeredGridState$scroll$1.f2585e = i - Integer.MIN_VALUE;
            } else {
                lazyStaggeredGridState$scroll$1 = new LazyStaggeredGridState$scroll$1(this, continuationImpl);
            }
        } else {
            lazyStaggeredGridState$scroll$1 = new LazyStaggeredGridState$scroll$1(this, continuationImpl);
        }
        Object obj = lazyStaggeredGridState$scroll$1.f2583c;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = lazyStaggeredGridState$scroll$1.f2585e;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            if (((xc9) this.f2601d).getValue() == ew4.f37987a) {
                lazyStaggeredGridState$scroll$1.f2581a = mutatePriority;
                lazyStaggeredGridState$scroll$1.f2582b = (SuspendLambda) zi3Var;
                lazyStaggeredGridState$scroll$1.f2585e = 1;
                if (this.f2607j.m19677p(lazyStaggeredGridState$scroll$1) != obj2) {
                }
            }
            zi3Var2 = zi3Var;
            zi3Var2 = zi3Var;
            return obj2;
        }
        if (i2 == 1) {
            zi3 zi3Var3 = (zi3) lazyStaggeredGridState$scroll$1.f2582b;
            mutatePriority = lazyStaggeredGridState$scroll$1.f2581a;
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
        lazyStaggeredGridState$scroll$1.f2581a = null;
        lazyStaggeredGridState$scroll$1.f2582b = null;
        lazyStaggeredGridState$scroll$1.f2585e = 2;
    }

    @Override // p000.do8
    /* JADX INFO: renamed from: d */
    public final boolean mo975d() {
        return ((Boolean) ((xc9) this.f2603f).getValue()).booleanValue();
    }

    @Override // p000.do8
    /* JADX INFO: renamed from: e */
    public final float mo865e(float f) {
        return this.f2611n.mo865e(f);
    }

    /* JADX WARN: Code duplicated, block: B:71:0x014b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x014d A[LOOP:1: B:62:0x0111->B:72:0x014d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:95:0x0151 A[EDGE_INSN: B:95:0x0151->B:73:0x0151 BREAK  A[LOOP:1: B:62:0x0111->B:72:0x014d], SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public final void m1022f(dw4 dw4Var, boolean z, boolean z2) {
        Object obj;
        vi3 vi3VarMo3163e;
        zc2 zc2Var = this.f2600c;
        C0136e c0136e = this.f2620w;
        if (!z && this.f2598a) {
            this.f2599b = dw4Var;
            jc9 jc9VarM16139y = lda.m16139y();
            vi3VarMo3163e = jc9VarM16139y != null ? jc9VarM16139y.mo3163e() : null;
            jc9 jc9VarM16106F = lda.m16106F(jc9VarM16139y);
            try {
                if (c0136e.m1015a() && Arrays.equals(dw4Var.f36295a, (int[]) zc2Var.f71350c) && Arrays.equals(dw4Var.f36296b, (int[]) zc2Var.f71352e)) {
                    c0136e.m1016b();
                }
                return;
            } finally {
                lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
            }
        }
        if (z) {
            this.f2598a = true;
        }
        float f = this.f2612o;
        float f2 = dw4Var.f36297c;
        List list = dw4Var.f36307m;
        int[] iArr = dw4Var.f36295a;
        int[] iArr2 = dw4Var.f36296b;
        this.f2612o = f - f2;
        ((xc9) this.f2601d).setValue(dw4Var);
        if (z2) {
            zc2Var.f71352e = iArr2;
            ((sc9) zc2Var.f71353f).m21223i(zc2.m25550b((int[]) zc2Var.f71350c, iArr2));
        } else {
            zc2Var.getClass();
            int iM25549a = zc2.m25549a(iArr);
            List list2 = list;
            int size = list2.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    obj = null;
                    break;
                }
                obj = list.get(i);
                if (((fw4) obj).f39785a == iM25549a) {
                    break;
                } else {
                    i++;
                }
            }
            fw4 fw4Var = (fw4) obj;
            zc2Var.f71354g = fw4Var != null ? fw4Var.f39786b : null;
            ((eu4) zc2Var.f71355h).m11342c(iM25549a);
            if (zc2Var.f71348a || dw4Var.f36306l > 0) {
                zc2Var.f71348a = true;
                jc9 jc9VarM16139y2 = lda.m16139y();
                vi3VarMo3163e = jc9VarM16139y2 != null ? jc9VarM16139y2.mo3163e() : null;
                jc9 jc9VarM16106F2 = lda.m16106F(jc9VarM16139y2);
                try {
                    zc2Var.f71350c = iArr;
                    ((sc9) zc2Var.f71351d).m21223i(zc2.m25549a(iArr));
                    zc2Var.f71352e = iArr2;
                    ((sc9) zc2Var.f71353f).m21223i(zc2.m25550b(iArr, iArr2));
                    lda.m16110J(jc9VarM16139y2, jc9VarM16106F2, vi3VarMo3163e);
                } catch (Throwable th) {
                    lda.m16110J(jc9VarM16139y2, jc9VarM16106F2, vi3VarMo3163e);
                    throw th;
                }
            }
            if (this.f2613p != -1 && !list2.isEmpty()) {
                int i2 = ((fw4) u91.m22589G0(list)).f39785a;
                int i3 = ((fw4) u91.m22597O0(list)).f39785a;
                int i4 = this.f2613p;
                if (i2 > i4 || i4 > i3) {
                    this.f2613p = -1;
                    t56 t56Var = this.f2614q;
                    Object[] objArr = t56Var.f35145c;
                    long[] jArr = t56Var.f35143a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i5 != length) {
                                    break;
                                    break;
                                }
                                i5++;
                            } else {
                                int i6 = 8 - ((~(i5 - length)) >>> 31);
                                for (int i7 = 0; i7 < i6; i7++) {
                                    if ((j & 255) < 128) {
                                        ((ku4) objArr[(i5 << 3) + i7]).cancel();
                                    }
                                    j >>= 8;
                                }
                                if (i6 != 8) {
                                    break;
                                } else if (i5 != length) {
                                    break;
                                } else {
                                    i5++;
                                }
                            }
                        }
                    }
                    t56Var.m21844c();
                }
            }
        }
        ((xc9) this.f2604g).setValue(Boolean.valueOf(iArr[0] != 0 || iArr2[0] > 0));
        ((xc9) this.f2603f).setValue(Boolean.valueOf(dw4Var.f36300f));
        if (z) {
            c0136e.m1017c(dw4Var.f36299e, dw4Var.f36305k, dw4Var.f36314t);
        }
    }

    /* JADX INFO: renamed from: g */
    public final dw4 m1023g() {
        return (dw4) ((xc9) this.f2601d).getValue();
    }

    /* JADX INFO: renamed from: h */
    public final void m1024h(float f, dw4 dw4Var) {
        t56 t56Var;
        int iM12803g;
        int i;
        long jM10430h;
        if (!this.f2609l || dw4Var.f36307m.isEmpty()) {
            return;
        }
        boolean z = f < 0.0f;
        List list = dw4Var.f36307m;
        int i2 = z ? ((fw4) u91.m22597O0(list)).f39785a : ((fw4) u91.m22589G0(list)).f39785a;
        if (i2 == this.f2613p) {
            return;
        }
        this.f2613p = i2;
        int[] iArr = m84.f50750a;
        u56 u56Var = new u56();
        xs4 xs4Var = dw4Var.f36303i;
        int[] iArr2 = xs4Var.f68645b;
        int length = iArr2.length;
        int i3 = 0;
        while (true) {
            t56Var = this.f2614q;
            if (i3 >= length) {
                break;
            }
            C3047gq c3047gq = this.f2602e;
            if (z) {
                iM12803g = i2 + 1;
                int length2 = c3047gq.f41171b + ((int[]) c3047gq.f41172c).length;
                while (true) {
                    if (iM12803g >= length2) {
                        iM12803g = c3047gq.f41171b + ((int[]) c3047gq.f41172c).length;
                        break;
                    } else if (c3047gq.m12800c(iM12803g, i3)) {
                        break;
                    } else {
                        iM12803g++;
                    }
                }
            } else {
                iM12803g = c3047gq.m12803g(i2, i3);
            }
            int i4 = iM12803g;
            if (i4 < 0 || i4 >= dw4Var.f36306l || u56Var.m22476c(i4)) {
                break;
            }
            u56Var.f63437b[u56Var.m22477d(i4)] = i4;
            if (!t56Var.m10151a(i4)) {
                boolean zM4517s = dw4Var.f36304j.m4517s(i4);
                int i5 = zM4517s ? 0 : i3;
                int i6 = zM4517s ? length : 1;
                if (i6 == 1) {
                    i = iArr2[i5];
                } else {
                    int[] iArr3 = xs4Var.f68644a;
                    int i7 = iArr3[i5];
                    int i8 = (i5 + i6) - 1;
                    i = (iArr3[i8] + iArr2[i8]) - i7;
                }
                if (dw4Var.f36315u == Orientation.Vertical) {
                    if (i < 0) {
                        k54.m14852a("width must be >= 0");
                    }
                    jM10430h = dk1.m10430h(i, i, 0, Integer.MAX_VALUE);
                } else {
                    if (i < 0) {
                        k54.m14852a("height must be >= 0");
                    }
                    jM10430h = dk1.m10430h(0, Integer.MAX_VALUE, i, i);
                }
                t56Var.m21850i(i4, this.f2610m.m16545a(i4, jM10430h, true, null));
            }
            i3++;
            i2 = i4;
        }
        long[] jArr = t56Var.f35143a;
        int length3 = jArr.length - 2;
        if (length3 < 0) {
            return;
        }
        int i9 = 0;
        while (true) {
            long j = jArr[i9];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i9 - length3)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j) < 128) {
                        int i12 = (i9 << 3) + i11;
                        int i13 = t56Var.f35144b[i12];
                        ku4 ku4Var = (ku4) t56Var.f35145c[i12];
                        boolean zM22476c = u56Var.m22476c(i13);
                        if (!zM22476c) {
                            ku4Var.cancel();
                        }
                        if (!zM22476c) {
                            t56Var.m21849h(i12);
                        }
                    }
                    j >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i9 == length3) {
                return;
            } else {
                i9++;
            }
        }
    }
}
