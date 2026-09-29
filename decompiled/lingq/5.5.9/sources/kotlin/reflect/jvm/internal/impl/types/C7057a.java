package kotlin.reflect.jvm.internal.impl.types;

import android.support.v4.media.AbstractC0140a;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import dm.C5207g;
import dm.C5212l;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jo.C6531c;
import jo.C6532d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import p139go.InterfaceC5848b;
import p139go.InterfaceC5851e;
import p139go.InterfaceC5852f;
import p139go.InterfaceC5853g;
import p139go.InterfaceC5854h;
import p139go.InterfaceC5855i;
import p139go.InterfaceC5856j;
import p139go.InterfaceC5857k;
import p139go.InterfaceC5858l;
import p139go.InterfaceC5861o;
import p260m8.C7499b;
import p372rm.InterfaceC8847k0;
import p385sf.C9000b;
import p543do.AbstractC5262v0;
import p543do.AbstractC5265x;
import p543do.C5237j;
import p543do.InterfaceC5240k0;
import p543do.InterfaceC5246n0;
import sl.C9072e;
import tl.C9325m;
import tl.C9327o;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C7057a {

    /* JADX INFO: renamed from: a */
    public static final C7057a f39897a = new C7057a();

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.a$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f39898a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f39899b;

        static {
            int[] iArr = new int[TypeVariance.values().length];
            iArr[TypeVariance.INV.ordinal()] = 1;
            iArr[TypeVariance.OUT.ordinal()] = 2;
            iArr[TypeVariance.IN.ordinal()] = 3;
            f39898a = iArr;
            int[] iArr2 = new int[TypeCheckerState.LowerCapturedTypePolicy.values().length];
            iArr2[TypeCheckerState.LowerCapturedTypePolicy.CHECK_ONLY_LOWER.ordinal()] = 1;
            iArr2[TypeCheckerState.LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
            iArr2[TypeCheckerState.LowerCapturedTypePolicy.SKIP_LOWER.ordinal()] = 3;
            f39899b = iArr2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    /* JADX INFO: renamed from: a */
    public static final boolean m14207a(InterfaceC5858l interfaceC5858l, InterfaceC5853g interfaceC5853g) {
        boolean z10;
        if (interfaceC5858l.mo11054T(interfaceC5853g)) {
            return true;
        }
        if (interfaceC5853g instanceof InterfaceC5848b) {
            InterfaceC5246n0 interfaceC5246n0Mo11084k0 = interfaceC5858l.mo11084k0(interfaceC5858l.mo11040G((InterfaceC5848b) interfaceC5853g));
            if (!interfaceC5858l.mo11078h0(interfaceC5246n0Mo11084k0) && interfaceC5858l.mo11054T(interfaceC5858l.mo11090n0(interfaceC5858l.mo11044K(interfaceC5246n0Mo11084k0)))) {
                z10 = true;
            }
            return z10;
        }
        z10 = false;
        if (z10) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m14208b(InterfaceC5858l interfaceC5858l, TypeCheckerState typeCheckerState, InterfaceC5853g interfaceC5853g, InterfaceC5853g interfaceC5853g2, boolean z10) {
        Set<InterfaceC5852f> setMo11043J = interfaceC5858l.mo11043J(interfaceC5853g);
        if ((setMo11043J instanceof Collection) && setMo11043J.isEmpty()) {
            return false;
        }
        for (InterfaceC5852f interfaceC5852f : setMo11043J) {
            if (C5207g.m11106a(interfaceC5858l.mo11101w(interfaceC5852f), interfaceC5858l.mo11077h(interfaceC5853g2)) || (z10 && m14215i(f39897a, typeCheckerState, interfaceC5853g2, interfaceC5852f))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public static List m14209c(TypeCheckerState typeCheckerState, InterfaceC5853g interfaceC5853g, InterfaceC5856j interfaceC5856j) {
        TypeCheckerState.AbstractC7055b abstractC7055bMo11075g;
        InterfaceC5858l interfaceC5858l = typeCheckerState.f39884c;
        interfaceC5858l.mo11085l(interfaceC5853g, interfaceC5856j);
        if (!interfaceC5858l.mo11094r(interfaceC5856j) && interfaceC5858l.mo11039F(interfaceC5853g)) {
            return EmptyList.f38032a;
        }
        if (interfaceC5858l.mo11096s(interfaceC5856j)) {
            if (!interfaceC5858l.mo11092p0(interfaceC5858l.mo11077h(interfaceC5853g), interfaceC5856j)) {
                return EmptyList.f38032a;
            }
            AbstractC5265x abstractC5265xMo11093q = interfaceC5858l.mo11093q(interfaceC5853g, CaptureStatus.FOR_SUBTYPING);
            if (abstractC5265xMo11093q != null) {
                interfaceC5853g = abstractC5265xMo11093q;
            }
            return C9000b.m17251q(interfaceC5853g);
        }
        C6531c c6531c = new C6531c();
        typeCheckerState.m14192c();
        ArrayDeque<InterfaceC5853g> arrayDeque = typeCheckerState.f39888g;
        C5207g.m11108c(arrayDeque);
        C6532d c6532d = typeCheckerState.f39889h;
        C5207g.m11108c(c6532d);
        arrayDeque.push(interfaceC5853g);
        while (!arrayDeque.isEmpty()) {
            if (c6532d.f37195b > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + interfaceC5853g + ". Supertypes = " + C6752c.m13430X(c6532d, null, null, null, null, 63)).toString());
            }
            InterfaceC5853g interfaceC5853gPop = arrayDeque.pop();
            C5207g.m11110e(interfaceC5853gPop, "current");
            if (c6532d.add(interfaceC5853gPop)) {
                InterfaceC5853g interfaceC5853gMo11093q = interfaceC5858l.mo11093q(interfaceC5853gPop, CaptureStatus.FOR_SUBTYPING);
                if (interfaceC5853gMo11093q == null) {
                    interfaceC5853gMo11093q = interfaceC5853gPop;
                }
                boolean zMo11092p0 = interfaceC5858l.mo11092p0(interfaceC5858l.mo11077h(interfaceC5853gMo11093q), interfaceC5856j);
                InterfaceC5858l interfaceC5858l2 = typeCheckerState.f39884c;
                if (zMo11092p0) {
                    c6531c.add(interfaceC5853gMo11093q);
                    abstractC7055bMo11075g = TypeCheckerState.AbstractC7055b.c.f39892a;
                } else {
                    abstractC7055bMo11075g = interfaceC5858l.mo11046M(interfaceC5853gMo11093q) == 0 ? TypeCheckerState.AbstractC7055b.b.f39891a : interfaceC5858l2.mo11075g(interfaceC5853gMo11093q);
                }
                if (!(!C5207g.m11106a(abstractC7055bMo11075g, TypeCheckerState.AbstractC7055b.c.f39892a))) {
                    abstractC7055bMo11075g = null;
                }
                if (abstractC7055bMo11075g != null) {
                    Iterator<InterfaceC5852f> it = interfaceC5858l2.mo11081i0(interfaceC5858l2.mo11077h(interfaceC5853gPop)).iterator();
                    while (it.hasNext()) {
                        arrayDeque.add(abstractC7055bMo11075g.mo11656a(typeCheckerState, it.next()));
                    }
                }
            }
        }
        typeCheckerState.m14190a();
        return c6531c;
    }

    /* JADX INFO: renamed from: d */
    public static List m14210d(TypeCheckerState typeCheckerState, InterfaceC5853g interfaceC5853g, InterfaceC5856j interfaceC5856j) {
        List listM14209c = m14209c(typeCheckerState, interfaceC5853g, interfaceC5856j);
        if (listM14209c.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            Iterator it = listM14209c.iterator();
            while (true) {
                boolean z10 = true;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                InterfaceC5858l interfaceC5858l = typeCheckerState.f39884c;
                InterfaceC5854h interfaceC5854hMo11097t = interfaceC5858l.mo11097t((InterfaceC5853g) next);
                int iMo11074f0 = interfaceC5858l.mo11074f0(interfaceC5854hMo11097t);
                for (int i10 = 0; i10 < iMo11074f0; i10++) {
                    if (!(interfaceC5858l.mo11037D(interfaceC5858l.mo11044K(interfaceC5858l.mo11076g0(interfaceC5854hMo11097t, i10))) == null)) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    arrayList.add(next);
                }
            }
            if (!arrayList.isEmpty()) {
                listM14209c = arrayList;
            }
        }
        return listM14209c;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m14211e(TypeCheckerState typeCheckerState, InterfaceC5852f interfaceC5852f, InterfaceC5852f interfaceC5852f2) {
        C5207g.m11111f(typeCheckerState, "state");
        C5207g.m11111f(interfaceC5852f, "a");
        C5207g.m11111f(interfaceC5852f2, "b");
        boolean z10 = true;
        if (interfaceC5852f == interfaceC5852f2) {
            return true;
        }
        C7057a c7057a = f39897a;
        InterfaceC5858l interfaceC5858l = typeCheckerState.f39884c;
        if (m14213g(interfaceC5858l, interfaceC5852f) && m14213g(interfaceC5858l, interfaceC5852f2)) {
            AbstractC0140a abstractC0140a = typeCheckerState.f39886e;
            InterfaceC5852f interfaceC5852fM14193d = typeCheckerState.m14193d(abstractC0140a.mo596f0(interfaceC5852f));
            InterfaceC5852f interfaceC5852fM14193d2 = typeCheckerState.m14193d(abstractC0140a.mo596f0(interfaceC5852f2));
            InterfaceC5853g interfaceC5853gMo11071e = interfaceC5858l.mo11071e(interfaceC5852fM14193d);
            if (!interfaceC5858l.mo11092p0(interfaceC5858l.mo11101w(interfaceC5852fM14193d), interfaceC5858l.mo11101w(interfaceC5852fM14193d2))) {
                return false;
            }
            if (interfaceC5858l.mo11046M(interfaceC5853gMo11071e) == 0) {
                if (!interfaceC5858l.mo11042I(interfaceC5852fM14193d)) {
                    z10 = interfaceC5858l.mo11042I(interfaceC5852fM14193d2) || interfaceC5858l.mo11083k(interfaceC5853gMo11071e) == interfaceC5858l.mo11083k(interfaceC5858l.mo11071e(interfaceC5852fM14193d2));
                }
                return z10;
            }
        }
        return m14215i(c7057a, typeCheckerState, interfaceC5852f, interfaceC5852f2) && m14215i(c7057a, typeCheckerState, interfaceC5852f2, interfaceC5852f);
    }

    /* JADX INFO: renamed from: f */
    public static InterfaceC5857k m14212f(InterfaceC5858l interfaceC5858l, InterfaceC5852f interfaceC5852f, InterfaceC5853g interfaceC5853g) {
        int iMo11046M = interfaceC5858l.mo11046M(interfaceC5852f);
        int i10 = 0;
        while (true) {
            if (i10 >= iMo11046M) {
                return null;
            }
            InterfaceC5855i interfaceC5855iMo11061a = interfaceC5858l.mo11061a(interfaceC5852f, i10);
            boolean z10 = true;
            InterfaceC5855i interfaceC5855i = interfaceC5858l.mo11078h0(interfaceC5855iMo11061a) ^ true ? interfaceC5855iMo11061a : null;
            if (interfaceC5855i != null) {
                AbstractC5262v0 abstractC5262v0Mo11044K = interfaceC5858l.mo11044K(interfaceC5855i);
                if (abstractC5262v0Mo11044K != null) {
                    if (!interfaceC5858l.mo11086l0(interfaceC5858l.mo11071e(abstractC5262v0Mo11044K)) || !interfaceC5858l.mo11086l0(interfaceC5858l.mo11071e(interfaceC5853g))) {
                        z10 = false;
                    }
                    if (!C5207g.m11106a(abstractC5262v0Mo11044K, interfaceC5853g) && (!z10 || !C5207g.m11106a(interfaceC5858l.mo11101w(abstractC5262v0Mo11044K), interfaceC5858l.mo11101w(interfaceC5853g)))) {
                        InterfaceC5857k interfaceC5857kM14212f = m14212f(interfaceC5858l, abstractC5262v0Mo11044K, interfaceC5853g);
                        if (interfaceC5857kM14212f != null) {
                            return interfaceC5857kM14212f;
                        }
                    }
                    return interfaceC5858l.mo11059Y(interfaceC5858l.mo11101w(interfaceC5852f), i10);
                }
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m14213g(InterfaceC5858l interfaceC5858l, InterfaceC5852f interfaceC5852f) {
        return (!interfaceC5858l.mo11088m0(interfaceC5858l.mo11101w(interfaceC5852f)) || interfaceC5858l.mo11072e0(interfaceC5852f) || interfaceC5858l.mo11048O(interfaceC5852f) || interfaceC5858l.mo11035B(interfaceC5852f) || !C5207g.m11106a(interfaceC5858l.mo11077h(interfaceC5858l.mo11071e(interfaceC5852f)), interfaceC5858l.mo11077h(interfaceC5858l.mo11090n0(interfaceC5852f)))) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m14214h(TypeCheckerState typeCheckerState, InterfaceC5854h interfaceC5854h, InterfaceC5853g interfaceC5853g) {
        boolean zM14211e;
        C5207g.m11111f(typeCheckerState, "<this>");
        C5207g.m11111f(interfaceC5854h, "capturedSubArguments");
        C5207g.m11111f(interfaceC5853g, "superType");
        InterfaceC5858l interfaceC5858l = typeCheckerState.f39884c;
        InterfaceC5240k0 interfaceC5240k0Mo11077h = interfaceC5858l.mo11077h(interfaceC5853g);
        int iMo11074f0 = interfaceC5858l.mo11074f0(interfaceC5854h);
        int iMo11050Q = interfaceC5858l.mo11050Q(interfaceC5240k0Mo11077h);
        if (iMo11074f0 != iMo11050Q || iMo11074f0 != interfaceC5858l.mo11046M(interfaceC5853g)) {
            return false;
        }
        for (int i10 = 0; i10 < iMo11050Q; i10++) {
            InterfaceC5855i interfaceC5855iMo11061a = interfaceC5858l.mo11061a(interfaceC5853g, i10);
            if (!interfaceC5858l.mo11078h0(interfaceC5855iMo11061a)) {
                AbstractC5262v0 abstractC5262v0Mo11044K = interfaceC5858l.mo11044K(interfaceC5855iMo11061a);
                InterfaceC5855i interfaceC5855iMo11076g0 = interfaceC5858l.mo11076g0(interfaceC5854h, i10);
                interfaceC5858l.mo11038E(interfaceC5855iMo11076g0);
                TypeVariance typeVariance = TypeVariance.INV;
                AbstractC5262v0 abstractC5262v0Mo11044K2 = interfaceC5858l.mo11044K(interfaceC5855iMo11076g0);
                TypeVariance typeVarianceMo11103x = interfaceC5858l.mo11103x(interfaceC5858l.mo11059Y(interfaceC5240k0Mo11077h, i10));
                TypeVariance typeVarianceMo11038E = interfaceC5858l.mo11038E(interfaceC5855iMo11061a);
                C5207g.m11111f(typeVarianceMo11103x, "declared");
                C5207g.m11111f(typeVarianceMo11038E, "useSite");
                if (typeVarianceMo11103x == typeVariance) {
                    typeVarianceMo11103x = typeVarianceMo11038E;
                } else if (typeVarianceMo11038E != typeVariance && typeVarianceMo11103x != typeVarianceMo11038E) {
                    typeVarianceMo11103x = null;
                }
                if (typeVarianceMo11103x == null) {
                    return typeCheckerState.f39882a;
                }
                C7057a c7057a = f39897a;
                if (typeVarianceMo11103x == typeVariance && (m14216j(interfaceC5858l, abstractC5262v0Mo11044K2, abstractC5262v0Mo11044K, interfaceC5240k0Mo11077h) || m14216j(interfaceC5858l, abstractC5262v0Mo11044K, abstractC5262v0Mo11044K2, interfaceC5240k0Mo11077h))) {
                    continue;
                } else {
                    int i11 = typeCheckerState.f39887f;
                    if (i11 > 100) {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + abstractC5262v0Mo11044K2).toString());
                    }
                    typeCheckerState.f39887f = i11 + 1;
                    int i12 = a.f39898a[typeVarianceMo11103x.ordinal()];
                    if (i12 == 1) {
                        zM14211e = m14211e(typeCheckerState, abstractC5262v0Mo11044K2, abstractC5262v0Mo11044K);
                    } else if (i12 == 2) {
                        zM14211e = m14215i(c7057a, typeCheckerState, abstractC5262v0Mo11044K2, abstractC5262v0Mo11044K);
                    } else {
                        if (i12 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zM14211e = m14215i(c7057a, typeCheckerState, abstractC5262v0Mo11044K, abstractC5262v0Mo11044K2);
                    }
                    typeCheckerState.f39887f--;
                    if (!zM14211e) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x016b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0172  */
    /* JADX WARN: Code duplicated, block: B:106:0x017c  */
    /* JADX WARN: Code duplicated, block: B:111:0x018b  */
    /* JADX WARN: Code duplicated, block: B:113:0x0191  */
    /* JADX WARN: Code duplicated, block: B:116:0x019e  */
    /* JADX WARN: Code duplicated, block: B:226:0x0379  */
    /* JADX WARN: Code duplicated, block: B:231:0x0385  */
    /* JADX WARN: Code duplicated, block: B:400:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:401:0x014c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:402:? A[LOOP:11: B:87:0x013a->B:402:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:403:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:404:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:405:? A[LOOP:12: B:104:0x0176->B:405:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0102  */
    /* JADX WARN: Code duplicated, block: B:78:0x0110  */
    /* JADX WARN: Code duplicated, block: B:79:0x011a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0124  */
    /* JADX WARN: Code duplicated, block: B:83:0x012f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0136  */
    /* JADX WARN: Code duplicated, block: B:89:0x0140  */
    /* JADX WARN: Code duplicated, block: B:94:0x0155  */
    /* JADX WARN: Code duplicated, block: B:96:0x015d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0163  */
    /* JADX INFO: renamed from: i */
    public static boolean m14215i(C7057a c7057a, final TypeCheckerState typeCheckerState, InterfaceC5852f interfaceC5852f, InterfaceC5852f interfaceC5852f2) {
        Boolean boolValueOf;
        boolean z10;
        boolean z11;
        Boolean bool;
        boolean z12;
        List<InterfaceC5853g> listM14209c;
        TypeCheckerState.AbstractC7055b abstractC7055b;
        AbstractC5262v0 abstractC5262v0Mo11044K;
        InterfaceC5853g interfaceC5853gMo11034A;
        InterfaceC5240k0 interfaceC5240k0Mo11077h;
        InterfaceC5240k0 interfaceC5240k0Mo11077h2;
        InterfaceC5857k interfaceC5857kM14212f;
        Collection<InterfaceC5852f> collectionMo11081i0;
        Iterator<T> it;
        boolean z13;
        Collection<InterfaceC5852f> collectionMo11081i1;
        Iterator<T> it2;
        boolean z14;
        InterfaceC5852f interfaceC5852fMo11080i;
        int i10;
        InterfaceC5853g interfaceC5853gMo11034A2;
        InterfaceC5853g interfaceC5853gMo11034A3;
        c7057a.getClass();
        C5207g.m11111f(typeCheckerState, "state");
        C5207g.m11111f(interfaceC5852f, "subType");
        C5207g.m11111f(interfaceC5852f2, "superType");
        boolean z15 = true;
        if (interfaceC5852f == interfaceC5852f2) {
            return true;
        }
        if (!typeCheckerState.mo14191b(interfaceC5852f, interfaceC5852f2)) {
            return false;
        }
        AbstractC0140a abstractC0140a = typeCheckerState.f39886e;
        InterfaceC5852f interfaceC5852fM14193d = typeCheckerState.m14193d(abstractC0140a.mo596f0(interfaceC5852f));
        InterfaceC5852f interfaceC5852fM14193d2 = typeCheckerState.m14193d(abstractC0140a.mo596f0(interfaceC5852f2));
        final InterfaceC5858l interfaceC5858l = typeCheckerState.f39884c;
        InterfaceC5853g interfaceC5853gMo11071e = interfaceC5858l.mo11071e(interfaceC5852fM14193d);
        InterfaceC5853g interfaceC5853gMo11090n0 = interfaceC5858l.mo11090n0(interfaceC5852fM14193d2);
        boolean zMo11100v = interfaceC5858l.mo11100v(interfaceC5853gMo11071e);
        C7057a c7057a2 = f39897a;
        if (!zMo11100v && !interfaceC5858l.mo11100v(interfaceC5853gMo11090n0)) {
            boolean zMo11062a0 = interfaceC5858l.mo11062a0(interfaceC5853gMo11071e);
            boolean z16 = typeCheckerState.f39883b;
            if (zMo11062a0 && interfaceC5858l.mo11062a0(interfaceC5853gMo11090n0)) {
                C5237j c5237jMo11082j = interfaceC5858l.mo11082j(interfaceC5853gMo11071e);
                if (c5237jMo11082j == null || (interfaceC5853gMo11034A2 = interfaceC5858l.mo11034A(c5237jMo11082j)) == null) {
                    interfaceC5853gMo11034A2 = interfaceC5853gMo11071e;
                }
                C5237j c5237jMo11082j2 = interfaceC5858l.mo11082j(interfaceC5853gMo11090n0);
                if (c5237jMo11082j2 == null || (interfaceC5853gMo11034A3 = interfaceC5858l.mo11034A(c5237jMo11082j2)) == null) {
                    interfaceC5853gMo11034A3 = interfaceC5853gMo11090n0;
                }
                boolValueOf = Boolean.valueOf((interfaceC5858l.mo11077h(interfaceC5853gMo11034A2) == interfaceC5858l.mo11077h(interfaceC5853gMo11034A3) && ((interfaceC5858l.mo11048O(interfaceC5853gMo11071e) || !interfaceC5858l.mo11048O(interfaceC5853gMo11090n0)) && (!interfaceC5858l.mo11083k(interfaceC5853gMo11071e) || interfaceC5858l.mo11083k(interfaceC5853gMo11090n0)))) || z16);
            } else if (interfaceC5858l.mo11065c(interfaceC5853gMo11071e) || interfaceC5858l.mo11065c(interfaceC5853gMo11090n0)) {
                boolValueOf = Boolean.valueOf(z16);
            } else {
                C5237j c5237jMo11082j3 = interfaceC5858l.mo11082j(interfaceC5853gMo11090n0);
                if (c5237jMo11082j3 == null || (interfaceC5853gMo11034A = interfaceC5858l.mo11034A(c5237jMo11082j3)) == null) {
                    interfaceC5853gMo11034A = interfaceC5853gMo11090n0;
                }
                InterfaceC5848b interfaceC5848bMo11060Z = interfaceC5858l.mo11060Z(interfaceC5853gMo11034A);
                InterfaceC5852f interfaceC5852fMo11051R = interfaceC5848bMo11060Z != null ? interfaceC5858l.mo11051R(interfaceC5848bMo11060Z) : null;
                if (interfaceC5848bMo11060Z == null || interfaceC5852fMo11051R == null) {
                    interfaceC5240k0Mo11077h = interfaceC5858l.mo11077h(interfaceC5853gMo11090n0);
                    if (interfaceC5858l.mo11056V(interfaceC5240k0Mo11077h)) {
                        interfaceC5858l.mo11083k(interfaceC5853gMo11090n0);
                        collectionMo11081i1 = interfaceC5858l.mo11081i0(interfaceC5240k0Mo11077h);
                        if (!(collectionMo11081i1 instanceof Collection) && collectionMo11081i1.isEmpty()) {
                            z14 = true;
                            break;
                        }
                        it2 = collectionMo11081i1.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z14 = true;
                                break;
                            }
                            if (!m14215i(c7057a2, typeCheckerState, interfaceC5853gMo11071e, (InterfaceC5852f) it2.next())) {
                                z14 = false;
                                break;
                            }
                        }
                        boolValueOf = Boolean.valueOf(z14);
                    } else {
                        interfaceC5240k0Mo11077h2 = interfaceC5858l.mo11077h(interfaceC5853gMo11071e);
                        if (interfaceC5853gMo11071e instanceof InterfaceC5848b) {
                            interfaceC5857kM14212f = m14212f(interfaceC5858l, interfaceC5853gMo11090n0, interfaceC5853gMo11071e);
                            if (interfaceC5857kM14212f == null && interfaceC5858l.mo11055U(interfaceC5857kM14212f, interfaceC5858l.mo11077h(interfaceC5853gMo11090n0))) {
                                boolValueOf = Boolean.TRUE;
                            } else {
                                boolValueOf = null;
                            }
                        } else {
                            if (interfaceC5858l.mo11056V(interfaceC5240k0Mo11077h2)) {
                                collectionMo11081i0 = interfaceC5858l.mo11081i0(interfaceC5240k0Mo11077h2);
                                if (!(collectionMo11081i0 instanceof Collection) && collectionMo11081i0.isEmpty()) {
                                    z13 = true;
                                    break;
                                }
                                it = collectionMo11081i0.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z13 = true;
                                        break;
                                    }
                                    if (!(((InterfaceC5852f) it.next()) instanceof InterfaceC5848b)) {
                                        z13 = false;
                                        break;
                                    }
                                }
                                if (z13) {
                                    interfaceC5857kM14212f = m14212f(interfaceC5858l, interfaceC5853gMo11090n0, interfaceC5853gMo11071e);
                                    if (interfaceC5857kM14212f == null) {
                                    }
                                }
                            }
                            boolValueOf = null;
                        }
                    }
                } else {
                    if (interfaceC5858l.mo11083k(interfaceC5853gMo11090n0)) {
                        interfaceC5852fMo11080i = interfaceC5858l.mo11058X(interfaceC5852fMo11051R);
                    } else if (interfaceC5858l.mo11048O(interfaceC5853gMo11090n0)) {
                        interfaceC5852fMo11080i = interfaceC5858l.mo11080i(interfaceC5852fMo11051R);
                    } else {
                        C5207g.m11111f(interfaceC5853gMo11071e, "subType");
                        i10 = a.f39899b[TypeCheckerState.LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER.ordinal()];
                        if (i10 != 1) {
                            boolValueOf = Boolean.valueOf(m14215i(c7057a2, typeCheckerState, interfaceC5853gMo11071e, interfaceC5852fMo11051R));
                        } else if (i10 != 2 && m14215i(c7057a2, typeCheckerState, interfaceC5853gMo11071e, interfaceC5852fMo11051R)) {
                            boolValueOf = Boolean.TRUE;
                        } else {
                            interfaceC5240k0Mo11077h = interfaceC5858l.mo11077h(interfaceC5853gMo11090n0);
                            if (interfaceC5858l.mo11056V(interfaceC5240k0Mo11077h)) {
                                interfaceC5858l.mo11083k(interfaceC5853gMo11090n0);
                                collectionMo11081i1 = interfaceC5858l.mo11081i0(interfaceC5240k0Mo11077h);
                                if (!(collectionMo11081i1 instanceof Collection)) {
                                    it2 = collectionMo11081i1.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            z14 = true;
                                            break;
                                        }
                                        if (!m14215i(c7057a2, typeCheckerState, interfaceC5853gMo11071e, (InterfaceC5852f) it2.next())) {
                                            z14 = false;
                                            break;
                                        }
                                    }
                                } else {
                                    it2 = collectionMo11081i1.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            z14 = true;
                                            break;
                                        }
                                        if (!m14215i(c7057a2, typeCheckerState, interfaceC5853gMo11071e, (InterfaceC5852f) it2.next())) {
                                            z14 = false;
                                            break;
                                        }
                                    }
                                }
                                boolValueOf = Boolean.valueOf(z14);
                            } else {
                                interfaceC5240k0Mo11077h2 = interfaceC5858l.mo11077h(interfaceC5853gMo11071e);
                                if (interfaceC5853gMo11071e instanceof InterfaceC5848b) {
                                    interfaceC5857kM14212f = m14212f(interfaceC5858l, interfaceC5853gMo11090n0, interfaceC5853gMo11071e);
                                    if (interfaceC5857kM14212f == null) {
                                        boolValueOf = null;
                                    } else {
                                        boolValueOf = null;
                                    }
                                } else {
                                    if (interfaceC5858l.mo11056V(interfaceC5240k0Mo11077h2)) {
                                        collectionMo11081i0 = interfaceC5858l.mo11081i0(interfaceC5240k0Mo11077h2);
                                        if (!(collectionMo11081i0 instanceof Collection)) {
                                            it = collectionMo11081i0.iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    z13 = true;
                                                    break;
                                                }
                                                if (!(((InterfaceC5852f) it.next()) instanceof InterfaceC5848b)) {
                                                    z13 = false;
                                                    break;
                                                }
                                            }
                                        } else {
                                            it = collectionMo11081i0.iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    z13 = true;
                                                    break;
                                                }
                                                if (!(((InterfaceC5852f) it.next()) instanceof InterfaceC5848b)) {
                                                    z13 = false;
                                                    break;
                                                }
                                            }
                                        }
                                        if (z13) {
                                            interfaceC5857kM14212f = m14212f(interfaceC5858l, interfaceC5853gMo11090n0, interfaceC5853gMo11071e);
                                            if (interfaceC5857kM14212f == null) {
                                            }
                                        }
                                    }
                                    boolValueOf = null;
                                }
                            }
                        }
                    }
                    interfaceC5852fMo11051R = interfaceC5852fMo11080i;
                    C5207g.m11111f(interfaceC5853gMo11071e, "subType");
                    i10 = a.f39899b[TypeCheckerState.LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER.ordinal()];
                    if (i10 != 1) {
                        boolValueOf = Boolean.valueOf(m14215i(c7057a2, typeCheckerState, interfaceC5853gMo11071e, interfaceC5852fMo11051R));
                    } else if (i10 != 2) {
                        interfaceC5240k0Mo11077h = interfaceC5858l.mo11077h(interfaceC5853gMo11090n0);
                        if (interfaceC5858l.mo11056V(interfaceC5240k0Mo11077h)) {
                            interfaceC5858l.mo11083k(interfaceC5853gMo11090n0);
                            collectionMo11081i1 = interfaceC5858l.mo11081i0(interfaceC5240k0Mo11077h);
                            if (!(collectionMo11081i1 instanceof Collection)) {
                                it2 = collectionMo11081i1.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        z14 = true;
                                        break;
                                    }
                                    if (!m14215i(c7057a2, typeCheckerState, interfaceC5853gMo11071e, (InterfaceC5852f) it2.next())) {
                                        z14 = false;
                                        break;
                                    }
                                }
                            } else {
                                it2 = collectionMo11081i1.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        z14 = true;
                                        break;
                                    }
                                    if (!m14215i(c7057a2, typeCheckerState, interfaceC5853gMo11071e, (InterfaceC5852f) it2.next())) {
                                        z14 = false;
                                        break;
                                    }
                                }
                            }
                            boolValueOf = Boolean.valueOf(z14);
                        } else {
                            interfaceC5240k0Mo11077h2 = interfaceC5858l.mo11077h(interfaceC5853gMo11071e);
                            if (interfaceC5853gMo11071e instanceof InterfaceC5848b) {
                                interfaceC5857kM14212f = m14212f(interfaceC5858l, interfaceC5853gMo11090n0, interfaceC5853gMo11071e);
                                if (interfaceC5857kM14212f == null) {
                                    boolValueOf = null;
                                } else {
                                    boolValueOf = null;
                                }
                            } else {
                                if (interfaceC5858l.mo11056V(interfaceC5240k0Mo11077h2)) {
                                    collectionMo11081i0 = interfaceC5858l.mo11081i0(interfaceC5240k0Mo11077h2);
                                    if (!(collectionMo11081i0 instanceof Collection)) {
                                        it = collectionMo11081i0.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                z13 = true;
                                                break;
                                            }
                                            if (!(((InterfaceC5852f) it.next()) instanceof InterfaceC5848b)) {
                                                z13 = false;
                                                break;
                                            }
                                        }
                                    } else {
                                        it = collectionMo11081i0.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                z13 = true;
                                                break;
                                            }
                                            if (!(((InterfaceC5852f) it.next()) instanceof InterfaceC5848b)) {
                                                z13 = false;
                                                break;
                                            }
                                        }
                                    }
                                    if (z13) {
                                        interfaceC5857kM14212f = m14212f(interfaceC5858l, interfaceC5853gMo11090n0, interfaceC5853gMo11071e);
                                        if (interfaceC5857kM14212f == null) {
                                        }
                                    }
                                }
                                boolValueOf = null;
                            }
                        }
                    } else {
                        boolValueOf = Boolean.TRUE;
                    }
                }
            }
        } else if (typeCheckerState.f39882a) {
            boolValueOf = Boolean.TRUE;
        } else if (!interfaceC5858l.mo11083k(interfaceC5853gMo11071e) || interfaceC5858l.mo11083k(interfaceC5853gMo11090n0)) {
            AbstractC5265x abstractC5265xMo11068d = interfaceC5858l.mo11068d(interfaceC5853gMo11071e, false);
            AbstractC5265x abstractC5265xMo11068d2 = interfaceC5858l.mo11068d(interfaceC5853gMo11090n0, false);
            C5207g.m11111f(abstractC5265xMo11068d, "a");
            C5207g.m11111f(abstractC5265xMo11068d2, "b");
            boolValueOf = Boolean.valueOf(C5212l.m11168m0(interfaceC5858l, abstractC5265xMo11068d, abstractC5265xMo11068d2));
        } else {
            boolValueOf = Boolean.FALSE;
        }
        if (boolValueOf != null) {
            boolean zBooleanValue = boolValueOf.booleanValue();
            C5207g.m11111f(interfaceC5852fM14193d, "subType");
            C5207g.m11111f(interfaceC5852fM14193d2, "superType");
            return zBooleanValue;
        }
        C5207g.m11111f(interfaceC5852fM14193d, "subType");
        C5207g.m11111f(interfaceC5852fM14193d2, "superType");
        InterfaceC5853g interfaceC5853gMo11071e2 = interfaceC5858l.mo11071e(interfaceC5852fM14193d);
        final InterfaceC5853g interfaceC5853gMo11090n1 = interfaceC5858l.mo11090n0(interfaceC5852fM14193d2);
        C5207g.m11111f(interfaceC5853gMo11071e2, "subType");
        C5207g.m11111f(interfaceC5853gMo11090n1, "superType");
        if (interfaceC5858l.mo11083k(interfaceC5853gMo11090n1) || interfaceC5858l.mo11048O(interfaceC5853gMo11071e2) || interfaceC5858l.mo11035B(interfaceC5853gMo11071e2) || (((interfaceC5853gMo11071e2 instanceof InterfaceC5848b) && interfaceC5858l.mo11089n((InterfaceC5848b) interfaceC5853gMo11071e2)) || C7499b.m14920R(typeCheckerState, interfaceC5853gMo11071e2, TypeCheckerState.AbstractC7055b.b.f39891a))) {
            z10 = true;
        } else {
            if (!interfaceC5858l.mo11048O(interfaceC5853gMo11090n1) && !C7499b.m14920R(typeCheckerState, interfaceC5853gMo11090n1, TypeCheckerState.AbstractC7055b.d.f39893a) && !interfaceC5858l.mo11039F(interfaceC5853gMo11071e2)) {
                InterfaceC5240k0 interfaceC5240k0Mo11077h3 = interfaceC5858l.mo11077h(interfaceC5853gMo11090n1);
                C5207g.m11111f(interfaceC5240k0Mo11077h3, "end");
                if (!C7499b.m14924V(typeCheckerState, interfaceC5853gMo11071e2, interfaceC5240k0Mo11077h3)) {
                    typeCheckerState.m14192c();
                    ArrayDeque<InterfaceC5853g> arrayDeque = typeCheckerState.f39888g;
                    C5207g.m11108c(arrayDeque);
                    C6532d c6532d = typeCheckerState.f39889h;
                    C5207g.m11108c(c6532d);
                    arrayDeque.push(interfaceC5853gMo11071e2);
                    while (true) {
                        if (!(!arrayDeque.isEmpty())) {
                            typeCheckerState.m14190a();
                        } else {
                            if (c6532d.f37195b > 1000) {
                                throw new IllegalStateException(("Too many supertypes for type: " + interfaceC5853gMo11071e2 + ". Supertypes = " + C6752c.m13430X(c6532d, null, null, null, null, 63)).toString());
                            }
                            InterfaceC5853g interfaceC5853gPop = arrayDeque.pop();
                            C5207g.m11110e(interfaceC5853gPop, "current");
                            if (c6532d.add(interfaceC5853gPop)) {
                                TypeCheckerState.AbstractC7055b abstractC7055b2 = interfaceC5858l.mo11083k(interfaceC5853gPop) ? TypeCheckerState.AbstractC7055b.c.f39892a : TypeCheckerState.AbstractC7055b.b.f39891a;
                                if (!(!C5207g.m11106a(abstractC7055b2, TypeCheckerState.AbstractC7055b.c.f39892a))) {
                                    abstractC7055b2 = null;
                                }
                                if (abstractC7055b2 == null) {
                                    continue;
                                } else {
                                    Iterator<InterfaceC5852f> it3 = interfaceC5858l.mo11081i0(interfaceC5858l.mo11077h(interfaceC5853gPop)).iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            InterfaceC5853g interfaceC5853gMo11656a = abstractC7055b2.mo11656a(typeCheckerState, it3.next());
                                            if (C7499b.m14924V(typeCheckerState, interfaceC5853gMo11656a, interfaceC5240k0Mo11077h3)) {
                                                typeCheckerState.m14190a();
                                            } else {
                                                arrayDeque.add(interfaceC5853gMo11656a);
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                z10 = true;
            }
            z10 = false;
        }
        if (z10) {
            InterfaceC5853g interfaceC5853gMo11071e3 = interfaceC5858l.mo11071e(interfaceC5853gMo11071e2);
            InterfaceC5853g interfaceC5853gMo11090n2 = interfaceC5858l.mo11090n0(interfaceC5853gMo11090n1);
            if (!interfaceC5858l.mo11054T(interfaceC5853gMo11071e3) && !interfaceC5858l.mo11054T(interfaceC5853gMo11090n2)) {
                bool = null;
            } else if (m14207a(interfaceC5858l, interfaceC5853gMo11071e3) && m14207a(interfaceC5858l, interfaceC5853gMo11090n2)) {
                bool = Boolean.TRUE;
            } else if (interfaceC5858l.mo11054T(interfaceC5853gMo11071e3)) {
                if (m14208b(interfaceC5858l, typeCheckerState, interfaceC5853gMo11071e3, interfaceC5853gMo11090n2, false)) {
                    bool = Boolean.TRUE;
                } else {
                    bool = null;
                }
            } else if (interfaceC5858l.mo11054T(interfaceC5853gMo11090n2)) {
                InterfaceC5240k0 interfaceC5240k0Mo11077h4 = interfaceC5858l.mo11077h(interfaceC5853gMo11071e3);
                if (interfaceC5240k0Mo11077h4 instanceof InterfaceC5851e) {
                    Collection<InterfaceC5852f> collectionMo11081i2 = interfaceC5858l.mo11081i0(interfaceC5240k0Mo11077h4);
                    if (!(collectionMo11081i2 instanceof Collection) || !collectionMo11081i2.isEmpty()) {
                        Iterator<T> it4 = collectionMo11081i2.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                z12 = false;
                                break;
                            }
                            AbstractC5265x abstractC5265xMo11036C = interfaceC5858l.mo11036C((InterfaceC5852f) it4.next());
                            if (abstractC5265xMo11036C != null && interfaceC5858l.mo11054T(abstractC5265xMo11036C)) {
                                z12 = true;
                                break;
                            }
                        }
                    } else {
                        z12 = false;
                        break;
                    }
                    if (z12) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else {
                    z11 = false;
                }
                if (z11 || m14208b(interfaceC5858l, typeCheckerState, interfaceC5853gMo11090n2, interfaceC5853gMo11071e3, true)) {
                    bool = Boolean.TRUE;
                } else {
                    bool = null;
                }
            } else {
                bool = null;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            InterfaceC5240k0 interfaceC5240k0Mo11077h5 = interfaceC5858l.mo11077h(interfaceC5853gMo11090n1);
            if ((!interfaceC5858l.mo11092p0(interfaceC5858l.mo11077h(interfaceC5853gMo11071e2), interfaceC5240k0Mo11077h5) || interfaceC5858l.mo11050Q(interfaceC5240k0Mo11077h5) != 0) && !interfaceC5858l.mo11099u(interfaceC5858l.mo11077h(interfaceC5853gMo11090n1))) {
                C5207g.m11111f(interfaceC5240k0Mo11077h5, "superConstructor");
                if (interfaceC5858l.mo11039F(interfaceC5853gMo11071e2)) {
                    listM14209c = m14210d(typeCheckerState, interfaceC5853gMo11071e2, interfaceC5240k0Mo11077h5);
                } else if (interfaceC5858l.mo11094r(interfaceC5240k0Mo11077h5) || interfaceC5858l.mo11045L(interfaceC5240k0Mo11077h5)) {
                    C6531c<InterfaceC5853g> c6531c = new C6531c();
                    typeCheckerState.m14192c();
                    ArrayDeque<InterfaceC5853g> arrayDeque2 = typeCheckerState.f39888g;
                    C5207g.m11108c(arrayDeque2);
                    C6532d c6532d2 = typeCheckerState.f39889h;
                    C5207g.m11108c(c6532d2);
                    arrayDeque2.push(interfaceC5853gMo11071e2);
                    while (!arrayDeque2.isEmpty()) {
                        if (c6532d2.f37195b > 1000) {
                            throw new IllegalStateException(("Too many supertypes for type: " + interfaceC5853gMo11071e2 + ". Supertypes = " + C6752c.m13430X(c6532d2, null, null, null, null, 63)).toString());
                        }
                        InterfaceC5853g interfaceC5853gPop2 = arrayDeque2.pop();
                        C5207g.m11110e(interfaceC5853gPop2, "current");
                        if (c6532d2.add(interfaceC5853gPop2)) {
                            if (interfaceC5858l.mo11039F(interfaceC5853gPop2)) {
                                c6531c.add(interfaceC5853gPop2);
                                abstractC7055b = TypeCheckerState.AbstractC7055b.c.f39892a;
                            } else {
                                abstractC7055b = TypeCheckerState.AbstractC7055b.b.f39891a;
                            }
                            if (!(!C5207g.m11106a(abstractC7055b, TypeCheckerState.AbstractC7055b.c.f39892a))) {
                                abstractC7055b = null;
                            }
                            if (abstractC7055b != null) {
                                Iterator<InterfaceC5852f> it5 = interfaceC5858l.mo11081i0(interfaceC5858l.mo11077h(interfaceC5853gPop2)).iterator();
                                while (it5.hasNext()) {
                                    arrayDeque2.add(abstractC7055b.mo11656a(typeCheckerState, it5.next()));
                                }
                            }
                        }
                    }
                    typeCheckerState.m14190a();
                    ArrayList arrayList = new ArrayList();
                    for (InterfaceC5853g interfaceC5853g : c6531c) {
                        C5207g.m11110e(interfaceC5853g, "it");
                        C9327o.m17684D(m14210d(typeCheckerState, interfaceC5853g, interfaceC5240k0Mo11077h5), arrayList);
                    }
                    listM14209c = arrayList;
                } else {
                    listM14209c = m14209c(typeCheckerState, interfaceC5853gMo11071e2, interfaceC5240k0Mo11077h5);
                }
                int i11 = 10;
                final ArrayList<InterfaceC5853g> arrayList2 = new ArrayList(C9325m.m17681z(listM14209c, 10));
                for (InterfaceC5853g interfaceC5853g2 : listM14209c) {
                    AbstractC5265x abstractC5265xMo11036C2 = interfaceC5858l.mo11036C(typeCheckerState.m14193d(interfaceC5853g2));
                    if (abstractC5265xMo11036C2 != null) {
                        interfaceC5853g2 = abstractC5265xMo11036C2;
                    }
                    arrayList2.add(interfaceC5853g2);
                }
                int size = arrayList2.size();
                if (size == 0) {
                    InterfaceC5240k0 interfaceC5240k0Mo11077h6 = interfaceC5858l.mo11077h(interfaceC5853gMo11071e2);
                    if (interfaceC5858l.mo11094r(interfaceC5240k0Mo11077h6)) {
                        return interfaceC5858l.mo11057W(interfaceC5240k0Mo11077h6);
                    }
                    if (!interfaceC5858l.mo11057W(interfaceC5858l.mo11077h(interfaceC5853gMo11071e2))) {
                        typeCheckerState.m14192c();
                        ArrayDeque<InterfaceC5853g> arrayDeque3 = typeCheckerState.f39888g;
                        C5207g.m11108c(arrayDeque3);
                        C6532d c6532d3 = typeCheckerState.f39889h;
                        C5207g.m11108c(c6532d3);
                        arrayDeque3.push(interfaceC5853gMo11071e2);
                        while (!arrayDeque3.isEmpty()) {
                            if (c6532d3.f37195b > 1000) {
                                throw new IllegalStateException(("Too many supertypes for type: " + interfaceC5853gMo11071e2 + ". Supertypes = " + C6752c.m13430X(c6532d3, null, null, null, null, 63)).toString());
                            }
                            InterfaceC5853g interfaceC5853gPop3 = arrayDeque3.pop();
                            C5207g.m11110e(interfaceC5853gPop3, "current");
                            if (c6532d3.add(interfaceC5853gPop3)) {
                                TypeCheckerState.AbstractC7055b abstractC7055b3 = interfaceC5858l.mo11039F(interfaceC5853gPop3) ? TypeCheckerState.AbstractC7055b.c.f39892a : TypeCheckerState.AbstractC7055b.b.f39891a;
                                if (!(!C5207g.m11106a(abstractC7055b3, TypeCheckerState.AbstractC7055b.c.f39892a))) {
                                    abstractC7055b3 = null;
                                }
                                if (abstractC7055b3 == null) {
                                    continue;
                                } else {
                                    Iterator<InterfaceC5852f> it6 = interfaceC5858l.mo11081i0(interfaceC5858l.mo11077h(interfaceC5853gPop3)).iterator();
                                    while (it6.hasNext()) {
                                        InterfaceC5853g interfaceC5853gMo11656a2 = abstractC7055b3.mo11656a(typeCheckerState, it6.next());
                                        if (interfaceC5858l.mo11057W(interfaceC5858l.mo11077h(interfaceC5853gMo11656a2))) {
                                            typeCheckerState.m14190a();
                                            return true;
                                        }
                                        arrayDeque3.add(interfaceC5853gMo11656a2);
                                    }
                                }
                            }
                        }
                        typeCheckerState.m14190a();
                    }
                } else {
                    if (size == 1) {
                        return m14214h(typeCheckerState, interfaceC5858l.mo11097t((InterfaceC5853g) C6752c.m13423Q(arrayList2)), interfaceC5853gMo11090n1);
                    }
                    ArgumentList argumentList = new ArgumentList(interfaceC5858l.mo11050Q(interfaceC5240k0Mo11077h5));
                    int iMo11050Q = interfaceC5858l.mo11050Q(interfaceC5240k0Mo11077h5);
                    int i12 = 0;
                    boolean z17 = false;
                    while (i12 < iMo11050Q) {
                        z17 = (z17 || interfaceC5858l.mo11103x(interfaceC5858l.mo11059Y(interfaceC5240k0Mo11077h5, i12)) != TypeVariance.OUT) ? z15 : false;
                        if (!z17) {
                            ArrayList arrayList3 = new ArrayList(C9325m.m17681z(arrayList2, i11));
                            for (InterfaceC5853g interfaceC5853g3 : arrayList2) {
                                InterfaceC5855i interfaceC5855iMo11105z = interfaceC5858l.mo11105z(interfaceC5853g3, i12);
                                if (interfaceC5855iMo11105z != null) {
                                    if (!(interfaceC5858l.mo11038E(interfaceC5855iMo11105z) == TypeVariance.INV)) {
                                        interfaceC5855iMo11105z = null;
                                    }
                                    if (interfaceC5855iMo11105z != null && (abstractC5262v0Mo11044K = interfaceC5858l.mo11044K(interfaceC5855iMo11105z)) != null) {
                                        arrayList3.add(abstractC5262v0Mo11044K);
                                    }
                                }
                                throw new IllegalStateException(("Incorrect type: " + interfaceC5853g3 + ", subType: " + interfaceC5853gMo11071e2 + ", superType: " + interfaceC5853gMo11090n1).toString());
                            }
                            argumentList.add(interfaceC5858l.mo11064b0(interfaceC5858l.mo11049P(arrayList3)));
                        }
                        i12++;
                        z15 = true;
                        i11 = 10;
                    }
                    if (z17 || !m14214h(typeCheckerState, argumentList, interfaceC5853gMo11090n1)) {
                        InterfaceC2052l<TypeCheckerState.InterfaceC7054a, C9072e> interfaceC2052l = new InterfaceC2052l<TypeCheckerState.InterfaceC7054a, C9072e>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker$isSubtypeOfForSingleClassifierType$1$4

                            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker$isSubtypeOfForSingleClassifierType$1$4$1 */
                            final class C70501 extends Lambda implements InterfaceC2041a<Boolean> {

                                /* JADX INFO: renamed from: b */
                                public final /* synthetic */ TypeCheckerState f39851b;

                                /* JADX INFO: renamed from: c */
                                public final /* synthetic */ InterfaceC5858l f39852c;

                                /* JADX INFO: renamed from: d */
                                public final /* synthetic */ InterfaceC5853g f39853d;

                                /* JADX INFO: renamed from: e */
                                public final /* synthetic */ InterfaceC5853g f39854e;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public C70501(TypeCheckerState typeCheckerState, InterfaceC5858l interfaceC5858l, InterfaceC5853g interfaceC5853g, InterfaceC5853g interfaceC5853g2) {
                                    super(0);
                                    this.f39851b = typeCheckerState;
                                    this.f39852c = interfaceC5858l;
                                    this.f39853d = interfaceC5853g;
                                    this.f39854e = interfaceC5853g2;
                                }

                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final Boolean mo807E() {
                                    return Boolean.valueOf(C7057a.m14214h(this.f39851b, this.f39852c.mo11097t(this.f39853d), this.f39854e));
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(TypeCheckerState.InterfaceC7054a interfaceC7054a) {
                                TypeCheckerState.InterfaceC7054a interfaceC7054a2 = interfaceC7054a;
                                C5207g.m11111f(interfaceC7054a2, "$this$runForkingPoint");
                                Iterator<InterfaceC5853g> it7 = arrayList2.iterator();
                                while (it7.hasNext()) {
                                    interfaceC7054a2.mo14194a(new C70501(typeCheckerState, interfaceC5858l, it7.next(), interfaceC5853gMo11090n1));
                                }
                                return C9072e.f47360a;
                            }
                        };
                        TypeCheckerState.InterfaceC7054a.a aVar = new TypeCheckerState.InterfaceC7054a.a();
                        interfaceC2052l.mo528n(aVar);
                        return aVar.f39890a;
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m14216j(InterfaceC5858l interfaceC5858l, InterfaceC5852f interfaceC5852f, InterfaceC5852f interfaceC5852f2, InterfaceC5856j interfaceC5856j) {
        InterfaceC8847k0 interfaceC8847k0Mo11073f;
        InterfaceC5852f interfaceC5852fMo11036C = interfaceC5858l.mo11036C(interfaceC5852f);
        if (!(interfaceC5852fMo11036C instanceof InterfaceC5848b)) {
            return false;
        }
        InterfaceC5848b interfaceC5848b = (InterfaceC5848b) interfaceC5852fMo11036C;
        if (interfaceC5858l.mo11047N(interfaceC5848b) || !interfaceC5858l.mo11078h0(interfaceC5858l.mo11084k0(interfaceC5858l.mo11040G(interfaceC5848b))) || interfaceC5858l.mo11066c0(interfaceC5848b) != CaptureStatus.FOR_SUBTYPING) {
            return false;
        }
        InterfaceC5856j interfaceC5856jMo11101w = interfaceC5858l.mo11101w(interfaceC5852f2);
        InterfaceC5861o interfaceC5861o = interfaceC5856jMo11101w instanceof InterfaceC5861o ? (InterfaceC5861o) interfaceC5856jMo11101w : null;
        return (interfaceC5861o == null || (interfaceC8847k0Mo11073f = interfaceC5858l.mo11073f(interfaceC5861o)) == null || !interfaceC5858l.mo11055U(interfaceC8847k0Mo11073f, interfaceC5856j)) ? false : true;
    }
}
