package p000;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class tw7 implements v76 {
    public static final sw7 Companion = new sw7();

    /* JADX INFO: renamed from: a */
    public final int f63013a;

    /* JADX INFO: renamed from: b */
    public final LqAnalyticsValues$LessonPath f63014b;

    /* JADX INFO: renamed from: c */
    public final int f63015c;

    /* JADX INFO: renamed from: d */
    public final String f63016d;

    /* JADX INFO: renamed from: e */
    public final boolean f63017e;

    /* JADX INFO: renamed from: f */
    public final String f63018f;

    public tw7(int i, LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath, int i2, String str, boolean z, String str2) {
        this.f63013a = i;
        this.f63014b = lqAnalyticsValues$LessonPath;
        this.f63015c = i2;
        this.f63016d = str;
        this.f63017e = z;
        this.f63018f = str2;
    }

    public static final tw7 fromBundle(Bundle bundle) {
        String str;
        Companion.getClass();
        bundle.getClass();
        bundle.setClassLoader(tw7.class.getClassLoader());
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
            return new tw7(i, (LqAnalyticsValues$LessonPath) bundle.get("lessonPath"), i2, str, z, str2);
        }
        C3386nv.m17636w(LqAnalyticsValues$LessonPath.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw7)) {
            return false;
        }
        tw7 tw7Var = (tw7) obj;
        return this.f63013a == tw7Var.f63013a && fa4.m11650l(this.f63014b, tw7Var.f63014b) && this.f63015c == tw7Var.f63015c && this.f63016d.equals(tw7Var.f63016d) && this.f63017e == tw7Var.f63017e && this.f63018f.equals(tw7Var.f63018f);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f63013a) * 31;
        LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath = this.f63014b;
        return this.f63018f.hashCode() + g9a.m12428e(ux5.m22980c(wq1.m24106b(this.f63015c, (iHashCode + (lqAnalyticsValues$LessonPath == null ? 0 : lqAnalyticsValues$LessonPath.hashCode())) * 31, 31), this.f63016d, 31), 31, this.f63017e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReaderFragmentArgs(lessonId=");
        sb.append(this.f63013a);
        sb.append(", lessonPath=");
        sb.append(this.f63014b);
        sb.append(", courseId=");
        hn1.m13361k(this.f63015c, ", courseTitle=", this.f63016d, ", isSentenceMode=", sb);
        sb.append(this.f63017e);
        sb.append(", lessonLanguageFromDeeplink=");
        sb.append(this.f63018f);
        sb.append(")");
        return sb.toString();
    }
}
