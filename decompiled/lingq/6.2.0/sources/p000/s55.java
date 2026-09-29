package p000;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class s55 implements v76 {
    public static final r55 Companion = new r55();

    /* JADX INFO: renamed from: a */
    public final String f60373a;

    /* JADX INFO: renamed from: b */
    public final String f60374b;

    /* JADX INFO: renamed from: c */
    public final String f60375c;

    /* JADX INFO: renamed from: d */
    public final int f60376d;

    /* JADX INFO: renamed from: e */
    public final LqAnalyticsValues$LessonPath f60377e;

    /* JADX INFO: renamed from: f */
    public final boolean f60378f;

    /* JADX INFO: renamed from: g */
    public final boolean f60379g;

    /* JADX INFO: renamed from: h */
    public final int f60380h;

    public s55(String str, String str2, String str3, int i, LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath, boolean z, boolean z2, int i2) {
        this.f60373a = str;
        this.f60374b = str2;
        this.f60375c = str3;
        this.f60376d = i;
        this.f60377e = lqAnalyticsValues$LessonPath;
        this.f60378f = z;
        this.f60379g = z2;
        this.f60380h = i2;
    }

    public static final s55 fromBundle(Bundle bundle) {
        Companion.getClass();
        bundle.getClass();
        bundle.setClassLoader(s55.class.getClassLoader());
        if (!bundle.containsKey("source")) {
            C3386nv.m17626m("Required argument \"source\" is missing and does not have an android:defaultValue");
            return null;
        }
        String string = bundle.getString("source");
        if (string == null) {
            C3386nv.m17626m("Argument \"source\" is marked as non-null but was passed a null value.");
            return null;
        }
        if (!bundle.containsKey("url")) {
            C3386nv.m17626m("Required argument \"url\" is missing and does not have an android:defaultValue");
            return null;
        }
        String string2 = bundle.getString("url");
        if (string2 == null) {
            C3386nv.m17626m("Argument \"url\" is marked as non-null but was passed a null value.");
            return null;
        }
        if (!bundle.containsKey("shelfCode")) {
            C3386nv.m17626m("Required argument \"shelfCode\" is missing and does not have an android:defaultValue");
            return null;
        }
        String string3 = bundle.getString("shelfCode");
        if (string3 == null) {
            C3386nv.m17626m("Argument \"shelfCode\" is marked as non-null but was passed a null value.");
            return null;
        }
        if (!bundle.containsKey("lessonId")) {
            C3386nv.m17626m("Required argument \"lessonId\" is missing and does not have an android:defaultValue");
            return null;
        }
        int i = bundle.getInt("lessonId");
        if (!bundle.containsKey("lessonPath")) {
            C3386nv.m17626m("Required argument \"lessonPath\" is missing and does not have an android:defaultValue");
            return null;
        }
        if (Parcelable.class.isAssignableFrom(LqAnalyticsValues$LessonPath.class) || Serializable.class.isAssignableFrom(LqAnalyticsValues$LessonPath.class)) {
            return new s55(string, string2, string3, i, (LqAnalyticsValues$LessonPath) bundle.get("lessonPath"), bundle.containsKey("isVirtual") ? bundle.getBoolean("isVirtual") : false, bundle.containsKey("hasAudio") ? bundle.getBoolean("hasAudio") : false, bundle.containsKey("duration") ? bundle.getInt("duration") : 0);
        }
        C3386nv.m17636w(LqAnalyticsValues$LessonPath.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s55)) {
            return false;
        }
        s55 s55Var = (s55) obj;
        return this.f60373a.equals(s55Var.f60373a) && this.f60374b.equals(s55Var.f60374b) && this.f60375c.equals(s55Var.f60375c) && this.f60376d == s55Var.f60376d && fa4.m11650l(this.f60377e, s55Var.f60377e) && this.f60378f == s55Var.f60378f && this.f60379g == s55Var.f60379g && this.f60380h == s55Var.f60380h;
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f60376d, ux5.m22980c(ux5.m22980c(this.f60373a.hashCode() * 31, this.f60374b, 31), this.f60375c, 31), 31);
        LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath = this.f60377e;
        return Integer.hashCode(this.f60380h) + g9a.m12428e(g9a.m12428e((iM24106b + (lqAnalyticsValues$LessonPath == null ? 0 : lqAnalyticsValues$LessonPath.hashCode())) * 31, 31, this.f60378f), 31, this.f60379g);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("LessonPreviewFragmentArgs(source=", this.f60373a, ", url=", this.f60374b, ", shelfCode=");
        AbstractC3393o1.m17748w(this.f60376d, this.f60375c, ", lessonId=", ", lessonPath=", sbM23000w);
        sbM23000w.append(this.f60377e);
        sbM23000w.append(", isVirtual=");
        sbM23000w.append(this.f60378f);
        sbM23000w.append(", hasAudio=");
        sbM23000w.append(this.f60379g);
        sbM23000w.append(", duration=");
        sbM23000w.append(this.f60380h);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}
