package vi;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import com.lingq.shared.util.LessonPath;
import dm.C5207g;
import java.io.Serializable;
import p040c4.InterfaceC1680e;

/* JADX INFO: renamed from: vi.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C9730e implements InterfaceC1680e {

    /* JADX INFO: renamed from: a */
    public final int f49749a;

    /* JADX INFO: renamed from: b */
    public final LessonPath f49750b;

    public C9730e(int i10, LessonPath lessonPath) {
        this.f49749a = i10;
        this.f49750b = lessonPath;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static final C9730e fromBundle(Bundle bundle) {
        LessonPath lessonPath;
        if (!C0166e.m778y(bundle, "bundle", C9730e.class, "courseId")) {
            throw new IllegalArgumentException("Required argument \"courseId\" is missing and does not have an android:defaultValue");
        }
        int i10 = bundle.getInt("courseId");
        if (!bundle.containsKey("lessonPath")) {
            lessonPath = null;
        } else {
            if (!Parcelable.class.isAssignableFrom(LessonPath.class) && !Serializable.class.isAssignableFrom(LessonPath.class)) {
                throw new UnsupportedOperationException(LessonPath.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            lessonPath = (LessonPath) bundle.get("lessonPath");
        }
        return new C9730e(i10, lessonPath);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9730e)) {
            return false;
        }
        C9730e c9730e = (C9730e) obj;
        return this.f49749a == c9730e.f49749a && C5207g.m11106a(this.f49750b, c9730e.f49750b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f49749a) * 31;
        LessonPath lessonPath = this.f49750b;
        return iHashCode + (lessonPath == null ? 0 : lessonPath.hashCode());
    }

    public final String toString() {
        return "CourseFragmentArgs(courseId=" + this.f49749a + ", lessonPath=" + this.f49750b + ")";
    }
}
