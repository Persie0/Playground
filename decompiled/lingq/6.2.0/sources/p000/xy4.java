package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class xy4 implements v76 {
    public static final wy4 Companion = new wy4();

    /* JADX INFO: renamed from: a */
    public final int f68959a;

    public xy4(int i) {
        this.f68959a = i;
    }

    public static final xy4 fromBundle(Bundle bundle) {
        Companion.getClass();
        bundle.getClass();
        bundle.setClassLoader(xy4.class.getClassLoader());
        if (bundle.containsKey("lessonId")) {
            return new xy4(bundle.getInt("lessonId"));
        }
        C3386nv.m17626m("Required argument \"lessonId\" is missing and does not have an android:defaultValue");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xy4) && this.f68959a == ((xy4) obj).f68959a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f68959a);
    }

    public final String toString() {
        return ux5.m22989l("LessonCompleteDealBlueFragmentArgs(lessonId=", this.f68959a, ")");
    }
}
