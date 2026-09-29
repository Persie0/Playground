package p204jj;

import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import p040c4.InterfaceC1680e;

/* JADX INFO: renamed from: jj.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C6486g implements InterfaceC1680e {

    /* JADX INFO: renamed from: a */
    public final int f37087a;

    /* JADX INFO: renamed from: b */
    public final boolean f37088b;

    /* JADX INFO: renamed from: c */
    public final int f37089c;

    public C6486g(int i10, int i11, boolean z10) {
        this.f37087a = i10;
        this.f37088b = z10;
        this.f37089c = i11;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static final C6486g fromBundle(Bundle bundle) {
        if (!C0166e.m778y(bundle, "bundle", C6486g.class, "lessonId")) {
            throw new IllegalArgumentException("Required argument \"lessonId\" is missing and does not have an android:defaultValue");
        }
        int i10 = bundle.getInt("lessonId");
        int i11 = bundle.containsKey("sentenceIndex") ? bundle.getInt("sentenceIndex") : 0;
        if (bundle.containsKey("hasAudio")) {
            return new C6486g(i10, i11, bundle.getBoolean("hasAudio"));
        }
        throw new IllegalArgumentException("Required argument \"hasAudio\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6486g)) {
            return false;
        }
        C6486g c6486g = (C6486g) obj;
        return this.f37087a == c6486g.f37087a && this.f37088b == c6486g.f37088b && this.f37089c == c6486g.f37089c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f37087a) * 31;
        boolean z10 = this.f37088b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return Integer.hashCode(this.f37089c) + ((iHashCode + r10) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LessonEditParentFragmentArgs(lessonId=");
        sb2.append(this.f37087a);
        sb2.append(", hasAudio=");
        sb2.append(this.f37088b);
        sb2.append(", sentenceIndex=");
        return C0166e.m768o(sb2, this.f37089c, ")");
    }
}
