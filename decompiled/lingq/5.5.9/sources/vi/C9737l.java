package vi;

import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import dm.C5207g;
import p040c4.InterfaceC1680e;

/* JADX INFO: renamed from: vi.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C9737l implements InterfaceC1680e {

    /* JADX INFO: renamed from: a */
    public final int f49762a;

    /* JADX INFO: renamed from: b */
    public final String f49763b;

    public C9737l(String str, int i10) {
        this.f49762a = i10;
        this.f49763b = str;
    }

    public static final C9737l fromBundle(Bundle bundle) {
        if (!C0166e.m778y(bundle, "bundle", C9737l.class, "courseId")) {
            throw new IllegalArgumentException("Required argument \"courseId\" is missing and does not have an android:defaultValue");
        }
        int i10 = bundle.getInt("courseId");
        if (!bundle.containsKey("courseTitle")) {
            throw new IllegalArgumentException("Required argument \"courseTitle\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("courseTitle");
        if (string != null) {
            return new C9737l(string, i10);
        }
        throw new IllegalArgumentException("Argument \"courseTitle\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9737l)) {
            return false;
        }
        C9737l c9737l = (C9737l) obj;
        return this.f49762a == c9737l.f49762a && C5207g.m11106a(this.f49763b, c9737l.f49763b);
    }

    public final int hashCode() {
        return this.f49763b.hashCode() + (Integer.hashCode(this.f49762a) * 31);
    }

    public final String toString() {
        return "CoursePlaylistFragmentArgs(courseId=" + this.f49762a + ", courseTitle=" + this.f49763b + ")";
    }
}
