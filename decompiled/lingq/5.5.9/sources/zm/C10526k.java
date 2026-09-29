package zm;

import dm.C5207g;
import hn.C6085e;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;

/* JADX INFO: renamed from: zm.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C10526k {

    /* JADX INFO: renamed from: a */
    public final C6085e f52517a;

    /* JADX INFO: renamed from: b */
    public final Collection<AnnotationQualifierApplicabilityType> f52518b;

    /* JADX INFO: renamed from: c */
    public final boolean f52519c;

    public C10526k(C6085e c6085e, Collection collection) {
        this(c6085e, collection, c6085e.f35825a == NullabilityQualifier.NOT_NULL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10526k(C6085e c6085e, Collection<? extends AnnotationQualifierApplicabilityType> collection, boolean z10) {
        C5207g.m11111f(collection, "qualifierApplicabilityTypes");
        this.f52517a = c6085e;
        this.f52518b = collection;
        this.f52519c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10526k)) {
            return false;
        }
        C10526k c10526k = (C10526k) obj;
        if (C5207g.m11106a(this.f52517a, c10526k.f52517a) && C5207g.m11106a(this.f52518b, c10526k.f52518b) && this.f52519c == c10526k.f52519c) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    public final int hashCode() {
        int iHashCode = (this.f52518b.hashCode() + (this.f52517a.hashCode() * 31)) * 31;
        boolean z10 = this.f52519c;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    public final String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f52517a + ", qualifierApplicabilityTypes=" + this.f52518b + ", definitelyNotNull=" + this.f52519c + ')';
    }
}
