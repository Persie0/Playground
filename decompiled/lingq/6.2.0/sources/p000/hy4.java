package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class hy4 implements v76 {
    public static final gy4 Companion = new gy4();

    /* JADX INFO: renamed from: a */
    public final int f43203a;

    public hy4(int i) {
        this.f43203a = i;
    }

    public static final hy4 fromBundle(Bundle bundle) {
        Companion.getClass();
        bundle.getClass();
        bundle.setClassLoader(hy4.class.getClassLoader());
        if (bundle.containsKey("lessonId")) {
            return new hy4(bundle.getInt("lessonId"));
        }
        C3386nv.m17626m("Required argument \"lessonId\" is missing and does not have an android:defaultValue");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hy4) && this.f43203a == ((hy4) obj).f43203a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43203a);
    }

    public final String toString() {
        return ux5.m22989l("LessonCompleteAllWordsFragmentArgs(lessonId=", this.f43203a, ")");
    }
}
