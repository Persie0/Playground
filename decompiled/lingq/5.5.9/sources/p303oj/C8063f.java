package p303oj;

import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import p040c4.InterfaceC1680e;

/* JADX INFO: renamed from: oj.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C8063f implements InterfaceC1680e {

    /* JADX INFO: renamed from: a */
    public final int f43761a;

    /* JADX INFO: renamed from: b */
    public final boolean f43762b;

    /* JADX INFO: renamed from: c */
    public final boolean f43763c;

    public C8063f(int i10, boolean z10, boolean z11) {
        this.f43761a = i10;
        this.f43762b = z10;
        this.f43763c = z11;
    }

    public static final C8063f fromBundle(Bundle bundle) {
        if (C0166e.m778y(bundle, "bundle", C8063f.class, "lessonId")) {
            return new C8063f(bundle.getInt("lessonId"), bundle.containsKey("fromLesson") ? bundle.getBoolean("fromLesson") : true, bundle.containsKey("video") ? bundle.getBoolean("video") : false);
        }
        throw new IllegalArgumentException("Required argument \"lessonId\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8063f)) {
            return false;
        }
        C8063f c8063f = (C8063f) obj;
        return this.f43761a == c8063f.f43761a && this.f43762b == c8063f.f43762b && this.f43763c == c8063f.f43763c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f43761a) * 31;
        ?? r10 = 1;
        boolean z10 = this.f43762b;
        ?? r11 = z10;
        if (z10) {
            r11 = 1;
        }
        int i10 = (iHashCode + r11) * 31;
        boolean z11 = this.f43763c;
        if (!z11) {
            r10 = z11;
        }
        return i10 + r10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ListeningModeFragmentArgs(lessonId=");
        sb2.append(this.f43761a);
        sb2.append(", fromLesson=");
        sb2.append(this.f43762b);
        sb2.append(", video=");
        return C0166e.m769p(sb2, this.f43763c, ")");
    }
}
