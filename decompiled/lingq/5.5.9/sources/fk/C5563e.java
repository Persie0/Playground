package fk;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import com.lingq.p055ui.token.TokenEditData;
import dm.C5207g;
import java.io.Serializable;
import p040c4.InterfaceC1680e;

/* JADX INFO: renamed from: fk.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C5563e implements InterfaceC1680e {

    /* JADX INFO: renamed from: a */
    public final TokenEditData f34360a;

    public C5563e(TokenEditData tokenEditData) {
        this.f34360a = tokenEditData;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static final C5563e fromBundle(Bundle bundle) {
        if (!C0166e.m778y(bundle, "bundle", C5563e.class, "tokenEditData")) {
            throw new IllegalArgumentException("Required argument \"tokenEditData\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(TokenEditData.class) && !Serializable.class.isAssignableFrom(TokenEditData.class)) {
            throw new UnsupportedOperationException(TokenEditData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        TokenEditData tokenEditData = (TokenEditData) bundle.get("tokenEditData");
        if (tokenEditData != null) {
            return new C5563e(tokenEditData);
        }
        throw new IllegalArgumentException("Argument \"tokenEditData\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C5563e) && C5207g.m11106a(this.f34360a, ((C5563e) obj).f34360a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f34360a.hashCode();
    }

    public final String toString() {
        return "TokenEditFragmentArgs(tokenEditData=" + this.f34360a + ")";
    }
}
