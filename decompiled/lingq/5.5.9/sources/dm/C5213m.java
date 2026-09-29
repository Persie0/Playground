package dm;

import cm.InterfaceC2041a;
import cm.InterfaceC2042b;
import cm.InterfaceC2043c;
import cm.InterfaceC2044d;
import cm.InterfaceC2045e;
import cm.InterfaceC2046f;
import cm.InterfaceC2047g;
import cm.InterfaceC2048h;
import cm.InterfaceC2049i;
import cm.InterfaceC2050j;
import cm.InterfaceC2051k;
import cm.InterfaceC2052l;
import cm.InterfaceC2053m;
import cm.InterfaceC2054n;
import cm.InterfaceC2055o;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import cm.InterfaceC2058r;
import cm.InterfaceC2059s;
import cm.InterfaceC2060t;
import cm.InterfaceC2061u;
import cm.InterfaceC2062v;
import cm.InterfaceC2063w;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p003a2.C0009a;
import p100em.InterfaceC5429a;
import p100em.InterfaceC5430b;
import p100em.InterfaceC5431c;
import p100em.InterfaceC5432d;
import p100em.InterfaceC5433e;
import sl.InterfaceC9068a;

/* JADX INFO: renamed from: dm.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C5213m {
    /* JADX INFO: renamed from: a */
    public static Collection m11196a(Collection collection) {
        if ((collection instanceof InterfaceC5429a) && !(collection instanceof InterfaceC5430b)) {
            m11201f(collection, "kotlin.collections.MutableCollection");
            throw null;
        }
        return collection;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static List m11197b(List list) {
        if ((list instanceof InterfaceC5429a) && !(list instanceof InterfaceC5431c)) {
            m11201f(list, "kotlin.collections.MutableList");
            throw null;
        }
        return list;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public static Map m11198c(Map map) {
        if ((map instanceof InterfaceC5429a) && !(map instanceof InterfaceC5432d)) {
            m11201f(map, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return map;
        } catch (ClassCastException e10) {
            C5207g.m11115j(C5213m.class.getName(), e10);
            throw e10;
        }
    }

    /* JADX INFO: renamed from: d */
    public static Set m11199d(Object obj) {
        if ((obj instanceof InterfaceC5429a) && !(obj instanceof InterfaceC5433e)) {
            m11201f(obj, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            return (Set) obj;
        } catch (ClassCastException e10) {
            C5207g.m11115j(C5213m.class.getName(), e10);
            throw e10;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m11200e(int i10, Object obj) {
        int iMo10978J;
        if (obj != null) {
            boolean z10 = false;
            if (obj instanceof InterfaceC9068a) {
                if (obj instanceof InterfaceC5205e) {
                    iMo10978J = ((InterfaceC5205e) obj).mo10978J();
                } else if (obj instanceof InterfaceC2041a) {
                    iMo10978J = 0;
                } else if (obj instanceof InterfaceC2052l) {
                    iMo10978J = 1;
                } else if (obj instanceof InterfaceC2056p) {
                    iMo10978J = 2;
                } else if (obj instanceof InterfaceC2057q) {
                    iMo10978J = 3;
                } else if (obj instanceof InterfaceC2058r) {
                    iMo10978J = 4;
                } else if (obj instanceof InterfaceC2059s) {
                    iMo10978J = 5;
                } else if (obj instanceof InterfaceC2060t) {
                    iMo10978J = 6;
                } else if (obj instanceof InterfaceC2061u) {
                    iMo10978J = 7;
                } else if (obj instanceof InterfaceC2062v) {
                    iMo10978J = 8;
                } else if (obj instanceof InterfaceC2063w) {
                    iMo10978J = 9;
                } else if (obj instanceof InterfaceC2042b) {
                    iMo10978J = 10;
                } else if (obj instanceof InterfaceC2043c) {
                    iMo10978J = 11;
                } else if (obj instanceof InterfaceC2044d) {
                    iMo10978J = 12;
                } else if (obj instanceof InterfaceC2045e) {
                    iMo10978J = 13;
                } else if (obj instanceof InterfaceC2046f) {
                    iMo10978J = 14;
                } else if (obj instanceof InterfaceC2047g) {
                    iMo10978J = 15;
                } else if (obj instanceof InterfaceC2048h) {
                    iMo10978J = 16;
                } else if (obj instanceof InterfaceC2049i) {
                    iMo10978J = 17;
                } else if (obj instanceof InterfaceC2050j) {
                    iMo10978J = 18;
                } else if (obj instanceof InterfaceC2051k) {
                    iMo10978J = 19;
                } else if (obj instanceof InterfaceC2053m) {
                    iMo10978J = 20;
                } else if (obj instanceof InterfaceC2054n) {
                    iMo10978J = 21;
                } else {
                    iMo10978J = obj instanceof InterfaceC2055o ? 22 : -1;
                }
                if (iMo10978J == i10) {
                    z10 = true;
                }
            }
            if (z10) {
                return;
            }
            m11201f(obj, "kotlin.jvm.functions.Function" + i10);
            throw null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m11201f(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(C0009a.m21i(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        C5207g.m11115j(C5213m.class.getName(), classCastException);
        throw classCastException;
    }
}
