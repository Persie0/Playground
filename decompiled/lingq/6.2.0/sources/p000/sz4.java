package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class sz4 implements v76 {
    public static final rz4 Companion = new rz4();

    /* JADX INFO: renamed from: a */
    public final int f61657a;

    public sz4(int i) {
        this.f61657a = i;
    }

    public static final sz4 fromBundle(Bundle bundle) {
        Companion.getClass();
        bundle.getClass();
        bundle.setClassLoader(sz4.class.getClassLoader());
        if (bundle.containsKey("lessonId")) {
            return new sz4(bundle.getInt("lessonId"));
        }
        C3386nv.m17626m("Required argument \"lessonId\" is missing and does not have an android:defaultValue");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sz4) && this.f61657a == ((sz4) obj).f61657a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f61657a);
    }

    public final String toString() {
        return ux5.m22989l("LessonCompleteVocabularyFragmentArgs(lessonId=", this.f61657a, ")");
    }
}
