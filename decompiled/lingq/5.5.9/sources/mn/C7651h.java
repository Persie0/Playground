package mn;

import dm.C5207g;
import java.util.LinkedHashMap;
import java.util.Set;
import p260m8.C7499b;
import tl.C9325m;
import tl.C9338z;

/* JADX INFO: renamed from: mn.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C7651h {

    /* JADX INFO: renamed from: a */
    public static final C7646c f42096a;

    /* JADX INFO: renamed from: b */
    public static final C7646c f42097b;

    /* JADX INFO: renamed from: c */
    public static final C7646c f42098c;

    /* JADX INFO: renamed from: d */
    public static final C7646c f42099d;

    /* JADX INFO: renamed from: e */
    public static final C7646c f42100e;

    /* JADX INFO: renamed from: f */
    public static final C7646c f42101f;

    /* JADX INFO: renamed from: g */
    public static final Set<C7646c> f42102g;

    /* JADX INFO: renamed from: h */
    public static final C7645b f42103h;

    /* JADX INFO: renamed from: i */
    public static final C7645b f42104i;

    /* JADX INFO: renamed from: j */
    public static final C7645b f42105j;

    /* JADX INFO: renamed from: k */
    public static final C7645b f42106k;

    /* JADX INFO: renamed from: l */
    public static final C7645b f42107l;

    /* JADX INFO: renamed from: m */
    public static final C7645b f42108m;

    /* JADX INFO: renamed from: n */
    public static final C7645b f42109n;

    /* JADX INFO: renamed from: o */
    public static final Set<C7645b> f42110o;

    /* JADX INFO: renamed from: p */
    public static final Set<C7645b> f42111p;

    /* JADX INFO: renamed from: q */
    public static final C7645b f42112q;

    /* JADX INFO: renamed from: r */
    public static final C7645b f42113r;

    /* JADX INFO: renamed from: s */
    public static final C7645b f42114s;

    static {
        C7646c c7646c = new C7646c("kotlin");
        f42096a = c7646c;
        C7646c c7646cM15215c = c7646c.m15215c(C7648e.m15232l("reflect"));
        f42097b = c7646cM15215c;
        C7646c c7646cM15215c2 = c7646c.m15215c(C7648e.m15232l("collections"));
        f42098c = c7646cM15215c2;
        C7646c c7646cM15215c3 = c7646c.m15215c(C7648e.m15232l("ranges"));
        f42099d = c7646cM15215c3;
        c7646c.m15215c(C7648e.m15232l("jvm")).m15215c(C7648e.m15232l("internal"));
        C7646c c7646cM15215c4 = c7646c.m15215c(C7648e.m15232l("annotation"));
        f42100e = c7646cM15215c4;
        C7646c c7646cM15215c5 = c7646c.m15215c(C7648e.m15232l("internal"));
        c7646cM15215c5.m15215c(C7648e.m15232l("ir"));
        C7646c c7646cM15215c6 = c7646c.m15215c(C7648e.m15232l("coroutines"));
        f42101f = c7646cM15215c6;
        f42102g = C7499b.m14973x0(c7646c, c7646cM15215c2, c7646cM15215c3, c7646cM15215c4, c7646cM15215c, c7646cM15215c5, c7646cM15215c6);
        C7652i.m15237a("Nothing");
        C7652i.m15237a("Unit");
        C7652i.m15237a("Any");
        C7652i.m15237a("Enum");
        C7652i.m15237a("Annotation");
        f42103h = C7652i.m15237a("Array");
        C7645b c7645bM15237a = C7652i.m15237a("Boolean");
        C7645b c7645bM15237a2 = C7652i.m15237a("Char");
        C7645b c7645bM15237a3 = C7652i.m15237a("Byte");
        C7645b c7645bM15237a4 = C7652i.m15237a("Short");
        C7645b c7645bM15237a5 = C7652i.m15237a("Int");
        C7645b c7645bM15237a6 = C7652i.m15237a("Long");
        C7645b c7645bM15237a7 = C7652i.m15237a("Float");
        C7645b c7645bM15237a8 = C7652i.m15237a("Double");
        f42104i = C7652i.m15243g(c7645bM15237a3);
        f42105j = C7652i.m15243g(c7645bM15237a4);
        f42106k = C7652i.m15243g(c7645bM15237a5);
        f42107l = C7652i.m15243g(c7645bM15237a6);
        f42108m = C7652i.m15237a("String");
        C7652i.m15237a("Throwable");
        C7652i.m15237a("Cloneable");
        C7652i.m15242f("KProperty");
        C7652i.m15242f("KMutableProperty");
        C7652i.m15242f("KProperty0");
        C7652i.m15242f("KMutableProperty0");
        C7652i.m15242f("KProperty1");
        C7652i.m15242f("KMutableProperty1");
        C7652i.m15242f("KProperty2");
        C7652i.m15242f("KMutableProperty2");
        f42109n = C7652i.m15242f("KFunction");
        C7652i.m15242f("KClass");
        C7652i.m15242f("KCallable");
        C7652i.m15237a("Comparable");
        C7652i.m15237a("Number");
        C7652i.m15237a("Function");
        Set<C7645b> setM14973x0 = C7499b.m14973x0(c7645bM15237a, c7645bM15237a2, c7645bM15237a3, c7645bM15237a4, c7645bM15237a5, c7645bM15237a6, c7645bM15237a7, c7645bM15237a8);
        f42110o = setM14973x0;
        int iM14941g0 = C7499b.m14941g0(C9325m.m17681z(setM14973x0, 10));
        if (iM14941g0 < 16) {
            iM14941g0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM14941g0);
        for (Object obj : setM14973x0) {
            C7648e c7648eM15210j = ((C7645b) obj).m15210j();
            C5207g.m11110e(c7648eM15210j, "id.shortClassName");
            linkedHashMap.put(obj, C7652i.m15240d(c7648eM15210j));
        }
        C7652i.m15239c(linkedHashMap);
        Set<C7645b> setM14973x1 = C7499b.m14973x0(f42104i, f42105j, f42106k, f42107l);
        f42111p = setM14973x1;
        int iM14941g1 = C7499b.m14941g0(C9325m.m17681z(setM14973x1, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM14941g1 >= 16 ? iM14941g1 : 16);
        for (Object obj2 : setM14973x1) {
            C7648e c7648eM15210j2 = ((C7645b) obj2).m15210j();
            C5207g.m11110e(c7648eM15210j2, "id.shortClassName");
            linkedHashMap2.put(obj2, C7652i.m15240d(c7648eM15210j2));
        }
        C7652i.m15239c(linkedHashMap2);
        C9338z.m17690M0(C9338z.m17691N0(f42110o, f42111p), f42108m);
        C7646c c7646c2 = f42101f;
        C7648e c7648eM15232l = C7648e.m15232l("Continuation");
        if (c7646c2 == null) {
            C7645b.m15200a(3);
            throw null;
        }
        C7646c.m15213j(c7648eM15232l);
        C7652i.m15238b("Iterator");
        C7652i.m15238b("Iterable");
        C7652i.m15238b("Collection");
        C7652i.m15238b("List");
        C7652i.m15238b("ListIterator");
        C7652i.m15238b("Set");
        C7645b c7645bM15238b = C7652i.m15238b("Map");
        C7652i.m15238b("MutableIterator");
        C7652i.m15238b("MutableIterable");
        C7652i.m15238b("MutableCollection");
        f42112q = C7652i.m15238b("MutableList");
        C7652i.m15238b("MutableListIterator");
        f42113r = C7652i.m15238b("MutableSet");
        C7645b c7645bM15238b2 = C7652i.m15238b("MutableMap");
        f42114s = c7645bM15238b2;
        c7645bM15238b.m15206d(C7648e.m15232l("Entry"));
        c7645bM15238b2.m15206d(C7648e.m15232l("MutableEntry"));
        C7652i.m15237a("Result");
        C7652i.m15241e("IntRange");
        C7652i.m15241e("LongRange");
        C7652i.m15241e("CharRange");
        C7646c c7646c3 = f42100e;
        C7648e c7648eM15232l2 = C7648e.m15232l("AnnotationRetention");
        if (c7646c3 == null) {
            C7645b.m15200a(3);
            throw null;
        }
        C7646c.m15213j(c7648eM15232l2);
        C7646c.m15213j(C7648e.m15232l("AnnotationTarget"));
    }
}
