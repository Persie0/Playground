package p000;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.core.p012ui.LessonInfoSource;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class i35 implements v76 {
    public static final h35 Companion = new h35();

    /* JADX INFO: renamed from: a */
    public final int f43400a;

    /* JADX INFO: renamed from: b */
    public final String f43401b;

    /* JADX INFO: renamed from: c */
    public final String f43402c;

    /* JADX INFO: renamed from: d */
    public final String f43403d;

    /* JADX INFO: renamed from: e */
    public final String f43404e;

    /* JADX INFO: renamed from: f */
    public final LessonInfoSource f43405f;

    /* JADX INFO: renamed from: g */
    public final String f43406g;

    public i35(int i, String str, String str2, String str3, String str4, LessonInfoSource lessonInfoSource, String str5) {
        this.f43400a = i;
        this.f43401b = str;
        this.f43402c = str2;
        this.f43403d = str3;
        this.f43404e = str4;
        this.f43405f = lessonInfoSource;
        this.f43406g = str5;
    }

    public static final i35 fromBundle(Bundle bundle) {
        Companion.getClass();
        bundle.getClass();
        bundle.setClassLoader(i35.class.getClassLoader());
        if (!bundle.containsKey("lessonId")) {
            C3386nv.m17626m("Required argument \"lessonId\" is missing and does not have an android:defaultValue");
            return null;
        }
        int i = bundle.getInt("lessonId");
        if (!bundle.containsKey("title")) {
            C3386nv.m17626m("Required argument \"title\" is missing and does not have an android:defaultValue");
            return null;
        }
        String string = bundle.getString("title");
        if (string == null) {
            C3386nv.m17626m("Argument \"title\" is marked as non-null but was passed a null value.");
            return null;
        }
        if (!bundle.containsKey("imageURL")) {
            C3386nv.m17626m("Required argument \"imageURL\" is missing and does not have an android:defaultValue");
            return null;
        }
        String string2 = bundle.getString("imageURL");
        if (string2 == null) {
            C3386nv.m17626m("Argument \"imageURL\" is marked as non-null but was passed a null value.");
            return null;
        }
        if (!bundle.containsKey("originalImageUrl")) {
            C3386nv.m17626m("Required argument \"originalImageUrl\" is missing and does not have an android:defaultValue");
            return null;
        }
        String string3 = bundle.getString("originalImageUrl");
        if (!bundle.containsKey("description")) {
            C3386nv.m17626m("Required argument \"description\" is missing and does not have an android:defaultValue");
            return null;
        }
        String string4 = bundle.getString("description");
        if (string4 == null) {
            C3386nv.m17626m("Argument \"description\" is marked as non-null but was passed a null value.");
            return null;
        }
        if (!bundle.containsKey("from")) {
            C3386nv.m17626m("Required argument \"from\" is missing and does not have an android:defaultValue");
            return null;
        }
        if (!Parcelable.class.isAssignableFrom(LessonInfoSource.class) && !Serializable.class.isAssignableFrom(LessonInfoSource.class)) {
            C3386nv.m17636w(LessonInfoSource.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            return null;
        }
        LessonInfoSource lessonInfoSource = (LessonInfoSource) bundle.get("from");
        if (lessonInfoSource == null) {
            C3386nv.m17626m("Argument \"from\" is marked as non-null but was passed a null value.");
            return null;
        }
        if (!bundle.containsKey("shelfCode")) {
            C3386nv.m17626m("Required argument \"shelfCode\" is missing and does not have an android:defaultValue");
            return null;
        }
        String string5 = bundle.getString("shelfCode");
        if (string5 != null) {
            return new i35(i, string, string2, string3, string4, lessonInfoSource, string5);
        }
        C3386nv.m17626m("Argument \"shelfCode\" is marked as non-null but was passed a null value.");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i35)) {
            return false;
        }
        i35 i35Var = (i35) obj;
        return this.f43400a == i35Var.f43400a && this.f43401b.equals(i35Var.f43401b) && this.f43402c.equals(i35Var.f43402c) && fa4.m11650l(this.f43403d, i35Var.f43403d) && this.f43404e.equals(i35Var.f43404e) && this.f43405f == i35Var.f43405f && this.f43406g.equals(i35Var.f43406g);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(ux5.m22980c(Integer.hashCode(this.f43400a) * 31, this.f43401b, 31), this.f43402c, 31);
        String str = this.f43403d;
        return this.f43406g.hashCode() + ((this.f43405f.hashCode() + ux5.m22980c((iM22980c + (str == null ? 0 : str.hashCode())) * 31, this.f43404e, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f43400a, "LessonInfoFragmentArgs(lessonId=", ", title=", this.f43401b, ", imageURL=");
        AbstractC3393o1.m17725C(sbM22995r, this.f43402c, ", originalImageUrl=", this.f43403d, ", description=");
        sbM22995r.append(this.f43404e);
        sbM22995r.append(", from=");
        sbM22995r.append(this.f43405f);
        sbM22995r.append(", shelfCode=");
        return AbstractC3393o1.m17738m(sbM22995r, this.f43406g, ")");
    }
}
