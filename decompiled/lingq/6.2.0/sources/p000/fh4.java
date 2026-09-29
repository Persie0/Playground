package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class fh4 implements v76 {
    public static final eh4 Companion = new eh4();

    /* JADX INFO: renamed from: a */
    public final int f39104a;

    /* JADX INFO: renamed from: b */
    public final boolean f39105b;

    /* JADX INFO: renamed from: c */
    public final boolean f39106c;

    public fh4(int i, boolean z, boolean z2) {
        this.f39104a = i;
        this.f39105b = z;
        this.f39106c = z2;
    }

    public static final fh4 fromBundle(Bundle bundle) {
        Companion.getClass();
        bundle.getClass();
        bundle.setClassLoader(fh4.class.getClassLoader());
        if (bundle.containsKey("lessonId")) {
            return new fh4(bundle.getInt("lessonId"), bundle.containsKey("fromLesson") ? bundle.getBoolean("fromLesson") : true, bundle.containsKey("video") ? bundle.getBoolean("video") : false);
        }
        C3386nv.m17626m("Required argument \"lessonId\" is missing and does not have an android:defaultValue");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fh4)) {
            return false;
        }
        fh4 fh4Var = (fh4) obj;
        return this.f39104a == fh4Var.f39104a && this.f39105b == fh4Var.f39105b && this.f39106c == fh4Var.f39106c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f39106c) + g9a.m12428e(Integer.hashCode(this.f39104a) * 31, 31, this.f39105b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KaraokeFragmentArgs(lessonId=");
        sb.append(this.f39104a);
        sb.append(", fromLesson=");
        sb.append(this.f39105b);
        sb.append(", video=");
        return AbstractC3393o1.m17740o(sb, this.f39106c, ")");
    }
}
