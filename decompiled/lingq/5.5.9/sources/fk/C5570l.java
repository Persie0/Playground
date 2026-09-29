package fk;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import com.lingq.p055ui.token.TokenData;
import dm.C5207g;
import java.io.Serializable;
import p040c4.InterfaceC1680e;

/* JADX INFO: renamed from: fk.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C5570l implements InterfaceC1680e {

    /* JADX INFO: renamed from: a */
    public final TokenData f34370a;

    public C5570l(TokenData tokenData) {
        this.f34370a = tokenData;
    }

    public static final C5570l fromBundle(Bundle bundle) {
        if (!C0166e.m778y(bundle, "bundle", C5570l.class, "tokenData")) {
            throw new IllegalArgumentException("Required argument \"tokenData\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(TokenData.class) && !Serializable.class.isAssignableFrom(TokenData.class)) {
            throw new UnsupportedOperationException(TokenData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        TokenData tokenData = (TokenData) bundle.get("tokenData");
        if (tokenData != null) {
            return new C5570l(tokenData);
        }
        throw new IllegalArgumentException("Argument \"tokenData\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5570l) && C5207g.m11106a(this.f34370a, ((C5570l) obj).f34370a);
    }

    public final int hashCode() {
        return this.f34370a.hashCode();
    }

    public final String toString() {
        return "TokenParentFragmentArgs(tokenData=" + this.f34370a + ")";
    }
}
