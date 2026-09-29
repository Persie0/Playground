package p369rj;

import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import p040c4.InterfaceC1680e;

/* JADX INFO: renamed from: rj.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C8818c implements InterfaceC1680e {

    /* JADX INFO: renamed from: a */
    public final int f46713a;

    /* JADX INFO: renamed from: b */
    public final boolean f46714b;

    public C8818c(int i10, boolean z10) {
        this.f46713a = i10;
        this.f46714b = z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static final C8818c fromBundle(Bundle bundle) {
        if (C0166e.m778y(bundle, "bundle", C8818c.class, "lessonId")) {
            return new C8818c(bundle.getInt("lessonId"), bundle.containsKey("isDocked") ? bundle.getBoolean("isDocked") : false);
        }
        throw new IllegalArgumentException("Required argument \"lessonId\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8818c)) {
            return false;
        }
        C8818c c8818c = (C8818c) obj;
        if (this.f46713a == c8818c.f46713a && this.f46714b == c8818c.f46714b) {
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
        int iHashCode = Integer.hashCode(this.f46713a) * 31;
        boolean z10 = this.f46714b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    public final String toString() {
        return "LessonVocabularyFragmentArgs(lessonId=" + this.f46713a + ", isDocked=" + this.f46714b + ")";
    }
}
