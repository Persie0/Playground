package p347qm;

import android.support.v4.media.session.C0166e;
import dm.C5206f;
import dm.C5207g;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.name.C6979a;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.C7076b;
import mn.C7645b;
import mn.C7646c;
import mn.C7647d;
import mn.C7648e;
import mn.C7650g;
import mn.C7651h;
import mo.C7660h;
import om.C8085b;
import p385sf.C9000b;

/* JADX INFO: renamed from: qm.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C8646c {

    /* JADX INFO: renamed from: a */
    public static final String f46201a;

    /* JADX INFO: renamed from: b */
    public static final String f46202b;

    /* JADX INFO: renamed from: c */
    public static final String f46203c;

    /* JADX INFO: renamed from: d */
    public static final String f46204d;

    /* JADX INFO: renamed from: e */
    public static final C7645b f46205e;

    /* JADX INFO: renamed from: f */
    public static final C7646c f46206f;

    /* JADX INFO: renamed from: g */
    public static final C7645b f46207g;

    /* JADX INFO: renamed from: h */
    public static final HashMap<C7647d, C7645b> f46208h;

    /* JADX INFO: renamed from: i */
    public static final HashMap<C7647d, C7645b> f46209i;

    /* JADX INFO: renamed from: j */
    public static final HashMap<C7647d, C7646c> f46210j;

    /* JADX INFO: renamed from: k */
    public static final HashMap<C7647d, C7646c> f46211k;

    /* JADX INFO: renamed from: l */
    public static final HashMap<C7645b, C7645b> f46212l;

    /* JADX INFO: renamed from: m */
    public static final HashMap<C7645b, C7645b> f46213m;

    /* JADX INFO: renamed from: n */
    public static final List<a> f46214n;

    /* JADX INFO: renamed from: qm.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final C7645b f46215a;

        /* JADX INFO: renamed from: b */
        public final C7645b f46216b;

        /* JADX INFO: renamed from: c */
        public final C7645b f46217c;

        public a(C7645b c7645b, C7645b c7645b2, C7645b c7645b3) {
            this.f46215a = c7645b;
            this.f46216b = c7645b2;
            this.f46217c = c7645b3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C5207g.m11106a(this.f46215a, aVar.f46215a) && C5207g.m11106a(this.f46216b, aVar.f46216b) && C5207g.m11106a(this.f46217c, aVar.f46217c);
        }

        public final int hashCode() {
            return this.f46217c.hashCode() + ((this.f46216b.hashCode() + (this.f46215a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.f46215a + ", kotlinReadOnly=" + this.f46216b + ", kotlinMutable=" + this.f46217c + ')';
        }
    }

    static {
        StringBuilder sb2 = new StringBuilder();
        FunctionClassKind functionClassKind = FunctionClassKind.Function;
        sb2.append(functionClassKind.getPackageFqName().toString());
        sb2.append('.');
        sb2.append(functionClassKind.getClassNamePrefix());
        f46201a = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        FunctionClassKind functionClassKind2 = FunctionClassKind.KFunction;
        sb3.append(functionClassKind2.getPackageFqName().toString());
        sb3.append('.');
        sb3.append(functionClassKind2.getClassNamePrefix());
        f46202b = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        FunctionClassKind functionClassKind3 = FunctionClassKind.SuspendFunction;
        sb4.append(functionClassKind3.getPackageFqName().toString());
        sb4.append('.');
        sb4.append(functionClassKind3.getClassNamePrefix());
        f46203c = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        FunctionClassKind functionClassKind4 = FunctionClassKind.KSuspendFunction;
        sb5.append(functionClassKind4.getPackageFqName().toString());
        sb5.append('.');
        sb5.append(functionClassKind4.getClassNamePrefix());
        f46204d = sb5.toString();
        C7645b c7645bM15203l = C7645b.m15203l(new C7646c("kotlin.jvm.functions.FunctionN"));
        f46205e = c7645bM15203l;
        C7646c c7646cM15204b = c7645bM15203l.m15204b();
        C5207g.m11110e(c7646cM15204b, "FUNCTION_N_CLASS_ID.asSingleFqName()");
        f46206f = c7646cM15204b;
        f46207g = C7651h.f42109n;
        m16866d(Class.class);
        f46208h = new HashMap<>();
        f46209i = new HashMap<>();
        f46210j = new HashMap<>();
        f46211k = new HashMap<>();
        f46212l = new HashMap<>();
        f46213m = new HashMap<>();
        C7645b c7645bM15203l2 = C7645b.m15203l(C6797e.a.f38349A);
        C7646c c7646c = C6797e.a.f38357I;
        C7646c c7646cM15208h = c7645bM15203l2.m15208h();
        C7646c c7646cM15208h2 = c7645bM15203l2.m15208h();
        C5207g.m11110e(c7646cM15208h2, "kotlinReadOnly.packageFqName");
        C7646c c7646cM13892b = C6979a.m13892b(c7646c, c7646cM15208h2);
        C7645b c7645b = new C7645b(c7646cM15208h, c7646cM13892b, false);
        C7645b c7645bM15203l3 = C7645b.m15203l(C6797e.a.f38403z);
        C7646c c7646c2 = C6797e.a.f38356H;
        C7646c c7646cM15208h3 = c7645bM15203l3.m15208h();
        C7646c c7646cM15208h4 = c7645bM15203l3.m15208h();
        C5207g.m11110e(c7646cM15208h4, "kotlinReadOnly.packageFqName");
        C7645b c7645b2 = new C7645b(c7646cM15208h3, C6979a.m13892b(c7646c2, c7646cM15208h4), false);
        C7645b c7645bM15203l4 = C7645b.m15203l(C6797e.a.f38350B);
        C7646c c7646c3 = C6797e.a.f38358J;
        C7646c c7646cM15208h5 = c7645bM15203l4.m15208h();
        C7646c c7646cM15208h6 = c7645bM15203l4.m15208h();
        C5207g.m11110e(c7646cM15208h6, "kotlinReadOnly.packageFqName");
        C7645b c7645b3 = new C7645b(c7646cM15208h5, C6979a.m13892b(c7646c3, c7646cM15208h6), false);
        C7645b c7645bM15203l5 = C7645b.m15203l(C6797e.a.f38351C);
        C7646c c7646c4 = C6797e.a.f38359K;
        C7646c c7646cM15208h7 = c7645bM15203l5.m15208h();
        C7646c c7646cM15208h8 = c7645bM15203l5.m15208h();
        C5207g.m11110e(c7646cM15208h8, "kotlinReadOnly.packageFqName");
        C7645b c7645b4 = new C7645b(c7646cM15208h7, C6979a.m13892b(c7646c4, c7646cM15208h8), false);
        C7645b c7645bM15203l6 = C7645b.m15203l(C6797e.a.f38353E);
        C7646c c7646c5 = C6797e.a.f38361M;
        C7646c c7646cM15208h9 = c7645bM15203l6.m15208h();
        C7646c c7646cM15208h10 = c7645bM15203l6.m15208h();
        C5207g.m11110e(c7646cM15208h10, "kotlinReadOnly.packageFqName");
        C7645b c7645b5 = new C7645b(c7646cM15208h9, C6979a.m13892b(c7646c5, c7646cM15208h10), false);
        C7645b c7645bM15203l7 = C7645b.m15203l(C6797e.a.f38352D);
        C7646c c7646c6 = C6797e.a.f38360L;
        C7646c c7646cM15208h11 = c7645bM15203l7.m15208h();
        C7646c c7646cM15208h12 = c7645bM15203l7.m15208h();
        C5207g.m11110e(c7646cM15208h12, "kotlinReadOnly.packageFqName");
        C7645b c7645b6 = new C7645b(c7646cM15208h11, C6979a.m13892b(c7646c6, c7646cM15208h12), false);
        C7646c c7646c7 = C6797e.a.f38354F;
        C7645b c7645bM15203l8 = C7645b.m15203l(c7646c7);
        C7646c c7646c8 = C6797e.a.f38362N;
        C7646c c7646cM15208h13 = c7645bM15203l8.m15208h();
        C7646c c7646cM15208h14 = c7645bM15203l8.m15208h();
        C5207g.m11110e(c7646cM15208h14, "kotlinReadOnly.packageFqName");
        C7645b c7645b7 = new C7645b(c7646cM15208h13, C6979a.m13892b(c7646c8, c7646cM15208h14), false);
        C7645b c7645bM15206d = C7645b.m15203l(c7646c7).m15206d(C6797e.a.f38355G.m15218f());
        C7646c c7646c9 = C6797e.a.f38363O;
        C7646c c7646cM15208h15 = c7645bM15206d.m15208h();
        C7646c c7646cM15208h16 = c7645bM15206d.m15208h();
        C5207g.m11110e(c7646cM15208h16, "kotlinReadOnly.packageFqName");
        List<a> listM17252r = C9000b.m17252r(new a(m16866d(Iterable.class), c7645bM15203l2, c7645b), new a(m16866d(Iterator.class), c7645bM15203l3, c7645b2), new a(m16866d(Collection.class), c7645bM15203l4, c7645b3), new a(m16866d(List.class), c7645bM15203l5, c7645b4), new a(m16866d(Set.class), c7645bM15203l6, c7645b5), new a(m16866d(ListIterator.class), c7645bM15203l7, c7645b6), new a(m16866d(Map.class), c7645bM15203l8, c7645b7), new a(m16866d(Map.Entry.class), c7645bM15206d, new C7645b(c7646cM15208h15, C6979a.m13892b(c7646c9, c7646cM15208h16), false)));
        f46214n = listM17252r;
        m16865c(Object.class, C6797e.a.f38375a);
        m16865c(String.class, C6797e.a.f38383f);
        m16865c(CharSequence.class, C6797e.a.f38382e);
        m16863a(m16866d(Throwable.class), C7645b.m15203l(C6797e.a.f38388k));
        m16865c(Cloneable.class, C6797e.a.f38379c);
        m16865c(Number.class, C6797e.a.f38386i);
        m16863a(m16866d(Comparable.class), C7645b.m15203l(C6797e.a.f38389l));
        m16865c(Enum.class, C6797e.a.f38387j);
        m16863a(m16866d(Annotation.class), C7645b.m15203l(C6797e.a.f38396s));
        for (a aVar : listM17252r) {
            C7645b c7645b8 = aVar.f46215a;
            C7645b c7645b9 = aVar.f46216b;
            m16863a(c7645b8, c7645b9);
            C7645b c7645b10 = aVar.f46217c;
            C7646c c7646cM15204b2 = c7645b10.m15204b();
            C5207g.m11110e(c7646cM15204b2, "mutableClassId.asSingleFqName()");
            m16864b(c7646cM15204b2, c7645b8);
            f46212l.put(c7645b10, c7645b9);
            f46213m.put(c7645b9, c7645b10);
            C7646c c7646cM15204b3 = c7645b9.m15204b();
            C5207g.m11110e(c7646cM15204b3, "readOnlyClassId.asSingleFqName()");
            C7646c c7646cM15204b4 = c7645b10.m15204b();
            C5207g.m11110e(c7646cM15204b4, "mutableClassId.asSingleFqName()");
            C7647d c7647dM15221i = c7645b10.m15204b().m15221i();
            C5207g.m11110e(c7647dM15221i, "mutableClassId.asSingleFqName().toUnsafe()");
            f46210j.put(c7647dM15221i, c7646cM15204b3);
            C7647d c7647dM15221i2 = c7646cM15204b3.m15221i();
            C5207g.m11110e(c7647dM15221i2, "readOnlyFqName.toUnsafe()");
            f46211k.put(c7647dM15221i2, c7646cM15204b4);
        }
        for (JvmPrimitiveType jvmPrimitiveType : JvmPrimitiveType.values()) {
            C7645b c7645bM15203l9 = C7645b.m15203l(jvmPrimitiveType.getWrapperFqName());
            PrimitiveType primitiveType = jvmPrimitiveType.getPrimitiveType();
            C5207g.m11110e(primitiveType, "jvmType.primitiveType");
            m16863a(c7645bM15203l9, C7645b.m15203l(C6797e.f38344j.m15215c(primitiveType.getTypeName())));
        }
        for (C7645b c7645b11 : C8085b.f43903a) {
            m16863a(C7645b.m15203l(new C7646c("kotlin.jvm.internal." + c7645b11.m15210j().m15235f() + "CompanionObject")), c7645b11.m15206d(C7650g.f42090b));
        }
        for (int i10 = 0; i10 < 23; i10++) {
            m16863a(C7645b.m15203l(new C7646c(C0166e.m761g("kotlin.jvm.functions.Function", i10))), new C7645b(C6797e.f38344j, C7648e.m15232l("Function" + i10)));
            m16864b(new C7646c(f46202b + i10), f46207g);
        }
        for (int i11 = 0; i11 < 22; i11++) {
            FunctionClassKind functionClassKind5 = FunctionClassKind.KSuspendFunction;
            m16864b(new C7646c((functionClassKind5.getPackageFqName().toString() + '.' + functionClassKind5.getClassNamePrefix()) + i11), f46207g);
        }
        C7646c c7646cM15229h = C6797e.a.f38377b.m15229h();
        C5207g.m11110e(c7646cM15229h, "nothing.toSafe()");
        m16864b(c7646cM15229h, m16866d(Void.class));
    }

    /* JADX INFO: renamed from: a */
    public static void m16863a(C7645b c7645b, C7645b c7645b2) {
        C7647d c7647dM15221i = c7645b.m15204b().m15221i();
        C5207g.m11110e(c7647dM15221i, "javaClassId.asSingleFqName().toUnsafe()");
        f46208h.put(c7647dM15221i, c7645b2);
        C7646c c7646cM15204b = c7645b2.m15204b();
        C5207g.m11110e(c7646cM15204b, "kotlinClassId.asSingleFqName()");
        m16864b(c7646cM15204b, c7645b);
    }

    /* JADX INFO: renamed from: b */
    public static void m16864b(C7646c c7646c, C7645b c7645b) {
        C7647d c7647dM15221i = c7646c.m15221i();
        C5207g.m11110e(c7647dM15221i, "kotlinFqNameUnsafe.toUnsafe()");
        f46209i.put(c7647dM15221i, c7645b);
    }

    /* JADX INFO: renamed from: c */
    public static void m16865c(Class cls, C7647d c7647d) {
        C7646c c7646cM15229h = c7647d.m15229h();
        C5207g.m11110e(c7646cM15229h, "kotlinFqName.toSafe()");
        m16863a(m16866d(cls), C7645b.m15203l(c7646cM15229h));
    }

    /* JADX INFO: renamed from: d */
    public static C7645b m16866d(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        return declaringClass == null ? C7645b.m15203l(new C7646c(cls.getCanonicalName())) : m16866d(declaringClass).m15206d(C7648e.m15232l(cls.getSimpleName()));
    }

    /* JADX INFO: renamed from: e */
    public static boolean m16867e(C7647d c7647d, String str) {
        String str2 = c7647d.f42082a;
        if (str2 == null) {
            C7647d.m15222a(4);
            throw null;
        }
        String strM14302v3 = C7076b.m14302v3(str2, str, "");
        if (strM14302v3.length() > 0) {
            if (!(strM14302v3.length() > 0 && C5206f.m10985F0(strM14302v3.charAt(0), '0', false))) {
                Integer numM15246L2 = C7660h.m15246L2(strM14302v3);
                return numM15246L2 != null && numM15246L2.intValue() >= 23;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static C7645b m16868f(C7646c c7646c) {
        return f46208h.get(c7646c.m15221i());
    }

    /* JADX INFO: renamed from: g */
    public static C7645b m16869g(C7647d c7647d) {
        if (!m16867e(c7647d, f46201a) && !m16867e(c7647d, f46203c)) {
            return (m16867e(c7647d, f46202b) || m16867e(c7647d, f46204d)) ? f46207g : f46209i.get(c7647d);
        }
        return f46205e;
    }
}
