package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class c75 implements v76 {
    public static final b75 Companion = new b75();

    /* JADX INFO: renamed from: a */
    public final int f9661a;

    /* JADX INFO: renamed from: b */
    public final boolean f9662b;

    public c75(int i, boolean z) {
        this.f9661a = i;
        this.f9662b = z;
    }

    public static final c75 fromBundle(Bundle bundle) {
        Companion.getClass();
        bundle.getClass();
        bundle.setClassLoader(c75.class.getClassLoader());
        if (bundle.containsKey("lessonId")) {
            return new c75(bundle.getInt("lessonId"), bundle.containsKey("isDocked") ? bundle.getBoolean("isDocked") : false);
        }
        C3386nv.m17626m("Required argument \"lessonId\" is missing and does not have an android:defaultValue");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c75)) {
            return false;
        }
        c75 c75Var = (c75) obj;
        return this.f9661a == c75Var.f9661a && this.f9662b == c75Var.f9662b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9662b) + (Integer.hashCode(this.f9661a) * 31);
    }

    public final String toString() {
        return "LessonVocabularyFragmentArgs(lessonId=" + this.f9661a + ", isDocked=" + this.f9662b + ")";
    }
}
