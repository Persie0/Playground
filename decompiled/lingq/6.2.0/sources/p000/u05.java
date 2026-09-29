package p000;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class u05 implements v76 {
    public static final t05 Companion = new t05();

    /* JADX INFO: renamed from: a */
    public final int f63168a;

    /* JADX INFO: renamed from: b */
    public final int f63169b;

    /* JADX INFO: renamed from: c */
    public final String[] f63170c;

    public u05(int i, int i2, String[] strArr) {
        this.f63168a = i;
        this.f63169b = i2;
        this.f63170c = strArr;
    }

    public static final u05 fromBundle(Bundle bundle) {
        Companion.getClass();
        bundle.getClass();
        bundle.setClassLoader(u05.class.getClassLoader());
        if (!bundle.containsKey("lessonId")) {
            C3386nv.m17626m("Required argument \"lessonId\" is missing and does not have an android:defaultValue");
            return null;
        }
        int i = bundle.getInt("lessonId");
        if (!bundle.containsKey("page")) {
            C3386nv.m17626m("Required argument \"page\" is missing and does not have an android:defaultValue");
            return null;
        }
        int i2 = bundle.getInt("page");
        if (!bundle.containsKey("words")) {
            C3386nv.m17626m("Required argument \"words\" is missing and does not have an android:defaultValue");
            return null;
        }
        String[] stringArray = bundle.getStringArray("words");
        if (stringArray != null) {
            return new u05(i, i2, stringArray);
        }
        C3386nv.m17626m("Argument \"words\" is marked as non-null but was passed a null value.");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u05)) {
            return false;
        }
        u05 u05Var = (u05) obj;
        return this.f63168a == u05Var.f63168a && this.f63169b == u05Var.f63169b && this.f63170c.equals(u05Var.f63170c);
    }

    public final int hashCode() {
        return wq1.m24106b(this.f63169b, Integer.hashCode(this.f63168a) * 31, 31) + Arrays.hashCode(this.f63170c);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m22994q(this.f63168a, this.f63169b, "LessonDealWithWordsFragmentArgs(lessonId=", ", page=", ", words="), Arrays.toString(this.f63170c), ")");
    }
}
