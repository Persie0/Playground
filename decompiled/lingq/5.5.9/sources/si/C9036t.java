package si;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import com.lingq.shared.uimodel.notification.UserNotice;
import dm.C5207g;
import java.io.Serializable;
import java.util.Arrays;
import p040c4.InterfaceC1680e;

/* JADX INFO: renamed from: si.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C9036t implements InterfaceC1680e {

    /* JADX INFO: renamed from: a */
    public final UserNotice f47275a;

    /* JADX INFO: renamed from: b */
    public final String[] f47276b;

    public C9036t(UserNotice userNotice, String[] strArr) {
        this.f47275a = userNotice;
        this.f47276b = strArr;
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    public static final C9036t fromBundle(Bundle bundle) {
        if (!C0166e.m778y(bundle, "bundle", C9036t.class, "userNotice")) {
            throw new IllegalArgumentException("Required argument \"userNotice\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(UserNotice.class) && !Serializable.class.isAssignableFrom(UserNotice.class)) {
            throw new UnsupportedOperationException(UserNotice.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        UserNotice userNotice = (UserNotice) bundle.get("userNotice");
        if (userNotice == null) {
            throw new IllegalArgumentException("Argument \"userNotice\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("images")) {
            throw new IllegalArgumentException("Required argument \"images\" is missing and does not have an android:defaultValue");
        }
        String[] stringArray = bundle.getStringArray("images");
        if (stringArray != null) {
            return new C9036t(userNotice, stringArray);
        }
        throw new IllegalArgumentException("Argument \"images\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9036t)) {
            return false;
        }
        C9036t c9036t = (C9036t) obj;
        return C5207g.m11106a(this.f47275a, c9036t.f47275a) && C5207g.m11106a(this.f47276b, c9036t.f47276b);
    }

    public final int hashCode() {
        return (this.f47275a.hashCode() * 31) + Arrays.hashCode(this.f47276b);
    }

    public final String toString() {
        return "ChallengesMonthlyPromptFragmentArgs(userNotice=" + this.f47275a + ", images=" + Arrays.toString(this.f47276b) + ")";
    }
}
