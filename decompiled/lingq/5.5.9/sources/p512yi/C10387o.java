package p512yi;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import com.lingq.shared.util.LessonPath;
import dm.C5207g;
import java.io.Serializable;
import p003a2.C0009a;
import p040c4.InterfaceC1680e;

/* JADX INFO: renamed from: yi.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C10387o implements InterfaceC1680e {

    /* JADX INFO: renamed from: a */
    public final String f52175a;

    /* JADX INFO: renamed from: b */
    public final String f52176b;

    /* JADX INFO: renamed from: c */
    public final int f52177c;

    /* JADX INFO: renamed from: d */
    public final LessonPath f52178d;

    public C10387o(int i10, LessonPath lessonPath, String str, String str2) {
        this.f52175a = str;
        this.f52176b = str2;
        this.f52177c = i10;
        this.f52178d = lessonPath;
    }

    /* JADX WARN: Unreachable blocks removed: 5, instructions: 5 */
    public static final C10387o fromBundle(Bundle bundle) {
        LessonPath lessonPath;
        if (!C0166e.m778y(bundle, "bundle", C10387o.class, "source")) {
            throw new IllegalArgumentException("Required argument \"source\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("source");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"source\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("url")) {
            throw new IllegalArgumentException("Required argument \"url\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("url");
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"url\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("lessonId")) {
            throw new IllegalArgumentException("Required argument \"lessonId\" is missing and does not have an android:defaultValue");
        }
        int i10 = bundle.getInt("lessonId");
        if (!bundle.containsKey("lessonPath")) {
            lessonPath = null;
        } else {
            if (!Parcelable.class.isAssignableFrom(LessonPath.class) && !Serializable.class.isAssignableFrom(LessonPath.class)) {
                throw new UnsupportedOperationException(LessonPath.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            lessonPath = (LessonPath) bundle.get("lessonPath");
        }
        return new C10387o(i10, lessonPath, string, string2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10387o)) {
            return false;
        }
        C10387o c10387o = (C10387o) obj;
        return C5207g.m11106a(this.f52175a, c10387o.f52175a) && C5207g.m11106a(this.f52176b, c10387o.f52176b) && this.f52177c == c10387o.f52177c && C5207g.m11106a(this.f52178d, c10387o.f52178d);
    }

    public final int hashCode() {
        int iM16d = C0009a.m16d(this.f52177c, C0166e.m758d(this.f52176b, this.f52175a.hashCode() * 31, 31), 31);
        LessonPath lessonPath = this.f52178d;
        return iM16d + (lessonPath == null ? 0 : lessonPath.hashCode());
    }

    public final String toString() {
        return "LessonPreviewFragmentArgs(source=" + this.f52175a + ", url=" + this.f52176b + ", lessonId=" + this.f52177c + ", lessonPath=" + this.f52178d + ")";
    }
}
