package p000;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class h08 implements v76 {
    public static final g08 Companion = new g08();

    /* JADX INFO: renamed from: a */
    public final int f41633a;

    /* JADX INFO: renamed from: b */
    public final LqAnalyticsValues$LessonPath f41634b;

    /* JADX INFO: renamed from: c */
    public final int f41635c;

    /* JADX INFO: renamed from: d */
    public final String f41636d;

    /* JADX INFO: renamed from: e */
    public final boolean f41637e;

    /* JADX INFO: renamed from: f */
    public final String f41638f;

    public h08(int i, LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath, int i2, String str, boolean z, String str2) {
        this.f41633a = i;
        this.f41634b = lqAnalyticsValues$LessonPath;
        this.f41635c = i2;
        this.f41636d = str;
        this.f41637e = z;
        this.f41638f = str2;
    }

    public static final h08 fromBundle(Bundle bundle) {
        String str;
        Companion.getClass();
        bundle.getClass();
        bundle.setClassLoader(h08.class.getClassLoader());
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
            return new h08(i, (LqAnalyticsValues$LessonPath) bundle.get("lessonPath"), i2, str, z, str2);
        }
        C3386nv.m17636w(LqAnalyticsValues$LessonPath.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final Bundle m12992a() {
        Bundle bundle = new Bundle();
        bundle.putInt("lessonId", this.f41633a);
        bundle.putInt("courseId", this.f41635c);
        bundle.putString("courseTitle", this.f41636d);
        bundle.putBoolean("isSentenceMode", this.f41637e);
        bundle.putString("lessonLanguageFromDeeplink", this.f41638f);
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(LqAnalyticsValues$LessonPath.class);
        LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath = this.f41634b;
        if (zIsAssignableFrom) {
            bundle.putParcelable("lessonPath", lqAnalyticsValues$LessonPath);
            return bundle;
        }
        if (Serializable.class.isAssignableFrom(LqAnalyticsValues$LessonPath.class)) {
            bundle.putSerializable("lessonPath", (Serializable) lqAnalyticsValues$LessonPath);
            return bundle;
        }
        C3386nv.m17636w(LqAnalyticsValues$LessonPath.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h08)) {
            return false;
        }
        h08 h08Var = (h08) obj;
        return this.f41633a == h08Var.f41633a && fa4.m11650l(this.f41634b, h08Var.f41634b) && this.f41635c == h08Var.f41635c && fa4.m11650l(this.f41636d, h08Var.f41636d) && this.f41637e == h08Var.f41637e && fa4.m11650l(this.f41638f, h08Var.f41638f);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f41633a) * 31;
        LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath = this.f41634b;
        return this.f41638f.hashCode() + g9a.m12428e(ux5.m22980c(wq1.m24106b(this.f41635c, (iHashCode + (lqAnalyticsValues$LessonPath == null ? 0 : lqAnalyticsValues$LessonPath.hashCode())) * 31, 31), this.f41636d, 31), 31, this.f41637e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReaderVideoComposeFragmentArgs(lessonId=");
        sb.append(this.f41633a);
        sb.append(", lessonPath=");
        sb.append(this.f41634b);
        sb.append(", courseId=");
        hn1.m13361k(this.f41635c, ", courseTitle=", this.f41636d, ", isSentenceMode=", sb);
        sb.append(this.f41637e);
        sb.append(", lessonLanguageFromDeeplink=");
        sb.append(this.f41638f);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ h08(int i, String str, int i2) {
        this(i, null, i2, str, false, "");
    }
}
