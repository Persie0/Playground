package p324pj;

import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import p040c4.InterfaceC1680e;

/* JADX INFO: renamed from: pj.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C8396b implements InterfaceC1680e {

    /* JADX INFO: renamed from: a */
    public final int f45519a;

    /* JADX INFO: renamed from: b */
    public final boolean f45520b;

    public C8396b(int i10, boolean z10) {
        this.f45519a = i10;
        this.f45520b = z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static final C8396b fromBundle(Bundle bundle) {
        if (!C0166e.m778y(bundle, "bundle", C8396b.class, "lessonId")) {
            throw new IllegalArgumentException("Required argument \"lessonId\" is missing and does not have an android:defaultValue");
        }
        int i10 = bundle.getInt("lessonId");
        if (bundle.containsKey("isCompleting")) {
            return new C8396b(i10, bundle.getBoolean("isCompleting"));
        }
        throw new IllegalArgumentException("Required argument \"isCompleting\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8396b)) {
            return false;
        }
        C8396b c8396b = (C8396b) obj;
        if (this.f45519a == c8396b.f45519a && this.f45520b == c8396b.f45520b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f45519a) * 31;
        boolean z10 = this.f45520b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    public final String toString() {
        return "LessonCompleteFragmentArgs(lessonId=" + this.f45519a + ", isCompleting=" + this.f45520b + ")";
    }
}
