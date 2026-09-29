package p137gj;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import com.lingq.p055ui.info.LessonInfoParent;
import dm.C5207g;
import java.io.Serializable;
import p040c4.InterfaceC1680e;

/* JADX INFO: renamed from: gj.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C5808d implements InterfaceC1680e {

    /* JADX INFO: renamed from: a */
    public final int f35086a;

    /* JADX INFO: renamed from: b */
    public final String f35087b;

    /* JADX INFO: renamed from: c */
    public final String f35088c;

    /* JADX INFO: renamed from: d */
    public final String f35089d;

    /* JADX INFO: renamed from: e */
    public final String f35090e;

    /* JADX INFO: renamed from: f */
    public final LessonInfoParent f35091f;

    public C5808d(int i10, String str, String str2, String str3, String str4, LessonInfoParent lessonInfoParent) {
        this.f35086a = i10;
        this.f35087b = str;
        this.f35088c = str2;
        this.f35089d = str3;
        this.f35090e = str4;
        this.f35091f = lessonInfoParent;
    }

    /* JADX WARN: Unreachable blocks removed: 5, instructions: 5 */
    public static final C5808d fromBundle(Bundle bundle) {
        if (!C0166e.m778y(bundle, "bundle", C5808d.class, "lessonId")) {
            throw new IllegalArgumentException("Required argument \"lessonId\" is missing and does not have an android:defaultValue");
        }
        int i10 = bundle.getInt("lessonId");
        if (!bundle.containsKey("title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("title");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("imageURL")) {
            throw new IllegalArgumentException("Required argument \"imageURL\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("imageURL");
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"imageURL\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("originalImageUrl")) {
            throw new IllegalArgumentException("Required argument \"originalImageUrl\" is missing and does not have an android:defaultValue");
        }
        String string3 = bundle.getString("originalImageUrl");
        if (!bundle.containsKey("description")) {
            throw new IllegalArgumentException("Required argument \"description\" is missing and does not have an android:defaultValue");
        }
        String string4 = bundle.getString("description");
        if (string4 == null) {
            throw new IllegalArgumentException("Argument \"description\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("from")) {
            throw new IllegalArgumentException("Required argument \"from\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(LessonInfoParent.class) && !Serializable.class.isAssignableFrom(LessonInfoParent.class)) {
            throw new UnsupportedOperationException(LessonInfoParent.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        LessonInfoParent lessonInfoParent = (LessonInfoParent) bundle.get("from");
        if (lessonInfoParent != null) {
            return new C5808d(i10, string, string2, string3, string4, lessonInfoParent);
        }
        throw new IllegalArgumentException("Argument \"from\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5808d)) {
            return false;
        }
        C5808d c5808d = (C5808d) obj;
        if (this.f35086a == c5808d.f35086a && C5207g.m11106a(this.f35087b, c5808d.f35087b) && C5207g.m11106a(this.f35088c, c5808d.f35088c) && C5207g.m11106a(this.f35089d, c5808d.f35089d) && C5207g.m11106a(this.f35090e, c5808d.f35090e) && this.f35091f == c5808d.f35091f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f35088c, C0166e.m758d(this.f35087b, Integer.hashCode(this.f35086a) * 31, 31), 31);
        String str = this.f35089d;
        return this.f35091f.hashCode() + C0166e.m758d(this.f35090e, (iM758d + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "LessonInfoFragmentArgs(lessonId=" + this.f35086a + ", title=" + this.f35087b + ", imageURL=" + this.f35088c + ", originalImageUrl=" + this.f35089d + ", description=" + this.f35090e + ", from=" + this.f35091f + ")";
    }
}
