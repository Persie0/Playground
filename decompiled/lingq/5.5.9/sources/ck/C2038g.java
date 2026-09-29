package ck;

import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import p040c4.InterfaceC1680e;

/* JADX INFO: renamed from: ck.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C2038g implements InterfaceC1680e {

    /* JADX INFO: renamed from: a */
    public final boolean f10487a;

    /* JADX INFO: renamed from: b */
    public final int f10488b;

    public C2038g(int i10, boolean z10) {
        this.f10487a = z10;
        this.f10488b = i10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static final C2038g fromBundle(Bundle bundle) {
        if (!C0166e.m778y(bundle, "bundle", C2038g.class, "isSingleSelection")) {
            throw new IllegalArgumentException("Required argument \"isSingleSelection\" is missing and does not have an android:defaultValue");
        }
        boolean z10 = bundle.getBoolean("isSingleSelection");
        if (bundle.containsKey("viewKey")) {
            return new C2038g(bundle.getInt("viewKey"), z10);
        }
        throw new IllegalArgumentException("Required argument \"viewKey\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2038g)) {
            return false;
        }
        C2038g c2038g = (C2038g) obj;
        return this.f10487a == c2038g.f10487a && this.f10488b == c2038g.f10488b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final int hashCode() {
        boolean z10 = this.f10487a;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return Integer.hashCode(this.f10488b) + (r10 * 31);
    }

    public final String toString() {
        return "SettingsSelectionFragmentArgs(isSingleSelection=" + this.f10487a + ", viewKey=" + this.f10488b + ")";
    }
}
