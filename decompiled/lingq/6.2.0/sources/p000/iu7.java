package p000;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class iu7 implements v76 {
    public static final hu7 Companion = new hu7();

    /* JADX INFO: renamed from: a */
    public final int f44584a;

    /* JADX INFO: renamed from: b */
    public final LqAnalyticsValues$LessonPath f44585b;

    /* JADX INFO: renamed from: c */
    public final int f44586c;

    /* JADX INFO: renamed from: d */
    public final String f44587d;

    /* JADX INFO: renamed from: e */
    public final boolean f44588e;

    /* JADX INFO: renamed from: f */
    public final String f44589f;

    public iu7(int i, LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath, int i2, String str, boolean z, String str2) {
        this.f44584a = i;
        this.f44585b = lqAnalyticsValues$LessonPath;
        this.f44586c = i2;
        this.f44587d = str;
        this.f44588e = z;
        this.f44589f = str2;
    }

    public static final iu7 fromBundle(Bundle bundle) {
        String str;
        Companion.getClass();
        bundle.getClass();
        bundle.setClassLoader(iu7.class.getClassLoader());
        if (!bundle.containsKey("lessonId")) {
            C3386nv.m17626m("Required argument \"lessonId\" is missing and does not have an android:defaultValue");
            return null;
        }
        int i = bundle.getInt("lessonId");
        int i2 = bundle.containsKey("courseId") ? bundle.getInt("courseId") : -1;
        String string = "";
        if (bundle.containsKey("courseTitle")) {
            String string2 = bundle.getString("courseTitle");
            if (string2 == null) {
                C3386nv.m17626m("Argument \"courseTitle\" is marked as non-null but was passed a null value.");
                return null;
            }
            str = string2;
        } else {
            str = "";
        }
        boolean z = bundle.containsKey("isSentenceMode") ? bundle.getBoolean("isSentenceMode") : false;
        if (bundle.containsKey("lessonLanguageFromDeeplink") && (string = bundle.getString("lessonLanguageFromDeeplink")) == null) {
            C3386nv.m17626m("Argument \"lessonLanguageFromDeeplink\" is marked as non-null but was passed a null value.");
            return null;
        }
        String str2 = string;
        if (!bundle.containsKey("lessonPath")) {
            C3386nv.m17626m("Required argument \"lessonPath\" is missing and does not have an android:defaultValue");
            return null;
        }
        if (Parcelable.class.isAssignableFrom(LqAnalyticsValues$LessonPath.class) || Serializable.class.isAssignableFrom(LqAnalyticsValues$LessonPath.class)) {
            return new iu7(i, (LqAnalyticsValues$LessonPath) bundle.get("lessonPath"), i2, str, z, str2);
        }
        C3386nv.m17636w(LqAnalyticsValues$LessonPath.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iu7)) {
            return false;
        }
        iu7 iu7Var = (iu7) obj;
        return this.f44584a == iu7Var.f44584a && fa4.m11650l(this.f44585b, iu7Var.f44585b) && this.f44586c == iu7Var.f44586c && this.f44587d.equals(iu7Var.f44587d) && this.f44588e == iu7Var.f44588e && this.f44589f.equals(iu7Var.f44589f);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f44584a) * 31;
        LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath = this.f44585b;
        return this.f44589f.hashCode() + g9a.m12428e(ux5.m22980c(wq1.m24106b(this.f44586c, (iHashCode + (lqAnalyticsValues$LessonPath == null ? 0 : lqAnalyticsValues$LessonPath.hashCode())) * 31, 31), this.f44587d, 31), 31, this.f44588e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReaderComposeFragmentArgs(lessonId=");
        sb.append(this.f44584a);
        sb.append(", lessonPath=");
        sb.append(this.f44585b);
        sb.append(", courseId=");
        hn1.m13361k(this.f44586c, ", courseTitle=", this.f44587d, ", isSentenceMode=", sb);
        sb.append(this.f44588e);
        sb.append(", lessonLanguageFromDeeplink=");
        sb.append(this.f44589f);
        sb.append(")");
        return sb.toString();
    }
}
