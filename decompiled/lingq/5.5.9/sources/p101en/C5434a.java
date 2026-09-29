package p101en;

import dm.C5207g;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility;
import p372rm.InterfaceC8847k0;
import p543do.AbstractC5265x;

/* JADX INFO: renamed from: en.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C5434a {

    /* JADX INFO: renamed from: a */
    public final TypeUsage f33974a;

    /* JADX INFO: renamed from: b */
    public final JavaTypeFlexibility f33975b;

    /* JADX INFO: renamed from: c */
    public final boolean f33976c;

    /* JADX INFO: renamed from: d */
    public final Set<InterfaceC8847k0> f33977d;

    /* JADX INFO: renamed from: e */
    public final AbstractC5265x f33978e;

    /* JADX WARN: Multi-variable type inference failed */
    public C5434a(TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z10, Set<? extends InterfaceC8847k0> set, AbstractC5265x abstractC5265x) {
        C5207g.m11111f(typeUsage, "howThisTypeIsUsed");
        C5207g.m11111f(javaTypeFlexibility, "flexibility");
        this.f33974a = typeUsage;
        this.f33975b = javaTypeFlexibility;
        this.f33976c = z10;
        this.f33977d = set;
        this.f33978e = abstractC5265x;
    }

    public /* synthetic */ C5434a(TypeUsage typeUsage, boolean z10, Set set, int i10) {
        this(typeUsage, (i10 & 2) != 0 ? JavaTypeFlexibility.INFLEXIBLE : null, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? null : set, null);
    }

    /* JADX INFO: renamed from: a */
    public static C5434a m11583a(C5434a c5434a, JavaTypeFlexibility javaTypeFlexibility, Set set, AbstractC5265x abstractC5265x, int i10) {
        TypeUsage typeUsage = (i10 & 1) != 0 ? c5434a.f33974a : null;
        if ((i10 & 2) != 0) {
            javaTypeFlexibility = c5434a.f33975b;
        }
        JavaTypeFlexibility javaTypeFlexibility2 = javaTypeFlexibility;
        boolean z10 = (i10 & 4) != 0 ? c5434a.f33976c : false;
        if ((i10 & 8) != 0) {
            set = c5434a.f33977d;
        }
        Set set2 = set;
        if ((i10 & 16) != 0) {
            abstractC5265x = c5434a.f33978e;
        }
        c5434a.getClass();
        C5207g.m11111f(typeUsage, "howThisTypeIsUsed");
        C5207g.m11111f(javaTypeFlexibility2, "flexibility");
        return new C5434a(typeUsage, javaTypeFlexibility2, z10, set2, abstractC5265x);
    }

    /* JADX INFO: renamed from: b */
    public final C5434a m11584b(JavaTypeFlexibility javaTypeFlexibility) {
        C5207g.m11111f(javaTypeFlexibility, "flexibility");
        return m11583a(this, javaTypeFlexibility, null, null, 29);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5434a)) {
            return false;
        }
        C5434a c5434a = (C5434a) obj;
        if (this.f33974a == c5434a.f33974a && this.f33975b == c5434a.f33975b && this.f33976c == c5434a.f33976c && C5207g.m11106a(this.f33977d, c5434a.f33977d) && C5207g.m11106a(this.f33978e, c5434a.f33978e)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    public final int hashCode() {
        int iHashCode = (this.f33975b.hashCode() + (this.f33974a.hashCode() * 31)) * 31;
        boolean z10 = this.f33976c;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iHashCode + r10) * 31;
        int iHashCode2 = 0;
        Set<InterfaceC8847k0> set = this.f33977d;
        int iHashCode3 = (i10 + (set == null ? 0 : set.hashCode())) * 31;
        AbstractC5265x abstractC5265x = this.f33978e;
        if (abstractC5265x != null) {
            iHashCode2 = abstractC5265x.hashCode();
        }
        return iHashCode3 + iHashCode2;
    }

    public final String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f33974a + ", flexibility=" + this.f33975b + ", isForAnnotationParameter=" + this.f33976c + ", visitedTypeParameters=" + this.f33977d + ", defaultType=" + this.f33978e + ')';
    }
}
