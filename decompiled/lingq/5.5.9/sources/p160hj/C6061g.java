package p160hj;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import com.lingq.shared.util.LessonPath;
import dm.C5207g;
import java.io.Serializable;
import p003a2.C0009a;
import p040c4.InterfaceC1680e;

/* JADX INFO: renamed from: hj.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C6061g implements InterfaceC1680e {

    /* JADX INFO: renamed from: a */
    public final int f35767a;

    /* JADX INFO: renamed from: b */
    public final int f35768b;

    /* JADX INFO: renamed from: c */
    public final String f35769c;

    /* JADX INFO: renamed from: d */
    public final boolean f35770d;

    /* JADX INFO: renamed from: e */
    public final String f35771e;

    /* JADX INFO: renamed from: f */
    public final LessonPath f35772f;

    public C6061g(int i10, int i11, String str, boolean z10, String str2, LessonPath lessonPath) {
        this.f35767a = i10;
        this.f35768b = i11;
        this.f35769c = str;
        this.f35770d = z10;
        this.f35771e = str2;
        this.f35772f = lessonPath;
    }

    public static final C6061g fromBundle(Bundle bundle) {
        String str;
        String str2;
        LessonPath lessonPath;
        if (!C0166e.m778y(bundle, "bundle", C6061g.class, "lessonId")) {
            throw new IllegalArgumentException("Required argument \"lessonId\" is missing and does not have an android:defaultValue");
        }
        int i10 = bundle.getInt("lessonId");
        int i11 = bundle.containsKey("courseId") ? bundle.getInt("courseId") : -1;
        if (bundle.containsKey("courseTitle")) {
            String string = bundle.getString("courseTitle");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"courseTitle\" is marked as non-null but was passed a null value.");
            }
            str = string;
        } else {
            str = "";
        }
        boolean z10 = bundle.containsKey("isSentenceMode") ? bundle.getBoolean("isSentenceMode") : false;
        if (bundle.containsKey("lessonLanguageFromDeeplink")) {
            String string2 = bundle.getString("lessonLanguageFromDeeplink");
            if (string2 == null) {
                throw new IllegalArgumentException("Argument \"lessonLanguageFromDeeplink\" is marked as non-null but was passed a null value.");
            }
            str2 = string2;
        } else {
            str2 = "";
        }
        if (!bundle.containsKey("lessonPath")) {
            lessonPath = null;
        } else {
            if (!Parcelable.class.isAssignableFrom(LessonPath.class) && !Serializable.class.isAssignableFrom(LessonPath.class)) {
                throw new UnsupportedOperationException(LessonPath.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            lessonPath = (LessonPath) bundle.get("lessonPath");
        }
        return new C6061g(i10, i11, str, z10, str2, lessonPath);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6061g)) {
            return false;
        }
        C6061g c6061g = (C6061g) obj;
        return this.f35767a == c6061g.f35767a && this.f35768b == c6061g.f35768b && C5207g.m11106a(this.f35769c, c6061g.f35769c) && this.f35770d == c6061g.f35770d && C5207g.m11106a(this.f35771e, c6061g.f35771e) && C5207g.m11106a(this.f35772f, c6061g.f35772f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f35769c, C0009a.m16d(this.f35768b, Integer.hashCode(this.f35767a) * 31, 31), 31);
        boolean z10 = this.f35770d;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int iM758d2 = C0166e.m758d(this.f35771e, (iM758d + r10) * 31, 31);
        LessonPath lessonPath = this.f35772f;
        return iM758d2 + (lessonPath == null ? 0 : lessonPath.hashCode());
    }

    public final String toString() {
        return "LessonFragmentArgs(lessonId=" + this.f35767a + ", courseId=" + this.f35768b + ", courseTitle=" + this.f35769c + ", isSentenceMode=" + this.f35770d + ", lessonLanguageFromDeeplink=" + this.f35771e + ", lessonPath=" + this.f35772f + ")";
    }
}
