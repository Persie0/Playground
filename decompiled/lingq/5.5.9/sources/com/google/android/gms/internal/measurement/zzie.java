package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class zzie extends zzii {

    /* JADX INFO: renamed from: a */
    public static final zzie f14537a = new zzie();

    private zzie() {
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.measurement.zzii
    /* JADX INFO: renamed from: a */
    public final Object mo8476a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.android.gms.internal.measurement.zzii
    /* JADX INFO: renamed from: b */
    public final boolean mo8477b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
