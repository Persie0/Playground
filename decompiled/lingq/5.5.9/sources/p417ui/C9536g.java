package p417ui;

import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import dm.C5207g;
import p040c4.InterfaceC1680e;

/* JADX INFO: renamed from: ui.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C9536g implements InterfaceC1680e {

    /* JADX INFO: renamed from: a */
    public final String f49076a;

    /* JADX INFO: renamed from: b */
    public final boolean f49077b;

    public C9536g(String str, boolean z10) {
        this.f49076a = str;
        this.f49077b = z10;
    }

    public static final C9536g fromBundle(Bundle bundle) {
        if (!C0166e.m778y(bundle, "bundle", C9536g.class, "collectionType")) {
            throw new IllegalArgumentException("Required argument \"collectionType\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("collectionType");
        if (string != null) {
            return new C9536g(string, bundle.containsKey("canShowAccent") ? bundle.getBoolean("canShowAccent") : true);
        }
        throw new IllegalArgumentException("Argument \"collectionType\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9536g)) {
            return false;
        }
        C9536g c9536g = (C9536g) obj;
        return C5207g.m11106a(this.f49076a, c9536g.f49076a) && this.f49077b == c9536g.f49077b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        int iHashCode = this.f49076a.hashCode() * 31;
        boolean z10 = this.f49077b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    public final String toString() {
        return "CollectionsSearchParentFilterFragmentArgs(collectionType=" + this.f49076a + ", canShowAccent=" + this.f49077b + ")";
    }
}
