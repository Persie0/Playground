package p000;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class b71 implements v76 {
    public static final a71 Companion = new a71();

    /* JADX INFO: renamed from: a */
    public final int f8036a;

    /* JADX INFO: renamed from: b */
    public final LqAnalyticsValues$LessonPath f8037b;

    /* JADX INFO: renamed from: c */
    public final String f8038c;

    /* JADX INFO: renamed from: d */
    public final String f8039d;

    public b71(int i, LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath, String str, String str2) {
        this.f8036a = i;
        this.f8037b = lqAnalyticsValues$LessonPath;
        this.f8038c = str;
        this.f8039d = str2;
    }

    public static final b71 fromBundle(Bundle bundle) {
        String string;
        Companion.getClass();
        bundle.getClass();
        bundle.setClassLoader(b71.class.getClassLoader());
        if (!bundle.containsKey("courseId")) {
            C3386nv.m17626m("Required argument \"courseId\" is missing and does not have an android:defaultValue");
            return null;
        }
        int i = bundle.getInt("courseId");
        if (!bundle.containsKey("lessonPath")) {
            C3386nv.m17626m("Required argument \"lessonPath\" is missing and does not have an android:defaultValue");
            return null;
        }
        if (!Parcelable.class.isAssignableFrom(LqAnalyticsValues$LessonPath.class) && !Serializable.class.isAssignableFrom(LqAnalyticsValues$LessonPath.class)) {
            C3386nv.m17636w(LqAnalyticsValues$LessonPath.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            return null;
        }
        LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath = (LqAnalyticsValues$LessonPath) bundle.get("lessonPath");
        if (!bundle.containsKey("shelfCode")) {
            C3386nv.m17626m("Required argument \"shelfCode\" is missing and does not have an android:defaultValue");
            return null;
        }
        String string2 = bundle.getString("shelfCode");
        if (string2 == null) {
            C3386nv.m17626m("Argument \"shelfCode\" is marked as non-null but was passed a null value.");
            return null;
        }
        if (bundle.containsKey("languageFromDeeplink")) {
            string = bundle.getString("languageFromDeeplink");
            if (string == null) {
                C3386nv.m17626m("Argument \"languageFromDeeplink\" is marked as non-null but was passed a null value.");
                return null;
            }
        } else {
            string = "";
        }
        return new b71(i, lqAnalyticsValues$LessonPath, string2, string);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b71)) {
            return false;
        }
        b71 b71Var = (b71) obj;
        return this.f8036a == b71Var.f8036a && fa4.m11650l(this.f8037b, b71Var.f8037b) && this.f8038c.equals(b71Var.f8038c) && this.f8039d.equals(b71Var.f8039d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f8036a) * 31;
        LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath = this.f8037b;
        return this.f8039d.hashCode() + ux5.m22980c((iHashCode + (lqAnalyticsValues$LessonPath == null ? 0 : lqAnalyticsValues$LessonPath.hashCode())) * 31, this.f8038c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionFragmentArgs(courseId=");
        sb.append(this.f8036a);
        sb.append(", lessonPath=");
        sb.append(this.f8037b);
        sb.append(", shelfCode=");
        return wq1.m24125u(sb, this.f8038c, ", languageFromDeeplink=", this.f8039d, ")");
    }
}
