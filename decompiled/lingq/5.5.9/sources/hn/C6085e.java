package hn;

import dm.C5207g;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;

/* JADX INFO: renamed from: hn.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C6085e {

    /* JADX INFO: renamed from: a */
    public final NullabilityQualifier f35825a;

    /* JADX INFO: renamed from: b */
    public final boolean f35826b;

    public C6085e(NullabilityQualifier nullabilityQualifier, boolean z10) {
        C5207g.m11111f(nullabilityQualifier, "qualifier");
        this.f35825a = nullabilityQualifier;
        this.f35826b = z10;
    }

    /* JADX INFO: renamed from: a */
    public static C6085e m12518a(C6085e c6085e, NullabilityQualifier nullabilityQualifier, boolean z10, int i10) {
        if ((i10 & 1) != 0) {
            nullabilityQualifier = c6085e.f35825a;
        }
        if ((i10 & 2) != 0) {
            z10 = c6085e.f35826b;
        }
        c6085e.getClass();
        C5207g.m11111f(nullabilityQualifier, "qualifier");
        return new C6085e(nullabilityQualifier, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6085e)) {
            return false;
        }
        C6085e c6085e = (C6085e) obj;
        return this.f35825a == c6085e.f35825a && this.f35826b == c6085e.f35826b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        int iHashCode = this.f35825a.hashCode() * 31;
        boolean z10 = this.f35826b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    public final String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f35825a + ", isForWarningOnly=" + this.f35826b + ')';
    }
}
