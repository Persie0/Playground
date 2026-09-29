package p417ui;

import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import dm.C5207g;
import p040c4.InterfaceC1680e;

/* JADX INFO: renamed from: ui.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C9532c implements InterfaceC1680e {

    /* JADX INFO: renamed from: a */
    public final String f49071a;

    /* JADX INFO: renamed from: b */
    public final boolean f49072b;

    public C9532c(String str, boolean z10) {
        this.f49071a = str;
        this.f49072b = z10;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static final C9532c fromBundle(Bundle bundle) {
        if (!C0166e.m778y(bundle, "bundle", C9532c.class, "collectionType")) {
            throw new IllegalArgumentException("Required argument \"collectionType\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("collectionType");
        if (string != null) {
            return new C9532c(string, bundle.containsKey("canShowAccent") ? bundle.getBoolean("canShowAccent") : true);
        }
        throw new IllegalArgumentException("Argument \"collectionType\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9532c)) {
            return false;
        }
        C9532c c9532c = (C9532c) obj;
        return C5207g.m11106a(this.f49071a, c9532c.f49071a) && this.f49072b == c9532c.f49072b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        int iHashCode = this.f49071a.hashCode() * 31;
        boolean z10 = this.f49072b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    public final String toString() {
        return "CollectionsSearchFilterFragmentArgs(collectionType=" + this.f49071a + ", canShowAccent=" + this.f49072b + ")";
    }
}
