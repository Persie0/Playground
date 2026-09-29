package hk;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import com.lingq.shared.uimodel.token.TokenMeaning;
import dm.C5207g;
import java.io.Serializable;
import p040c4.InterfaceC1680e;

/* JADX INFO: renamed from: hk.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C6070a implements InterfaceC1680e {

    /* JADX INFO: renamed from: a */
    public final String f35795a;

    /* JADX INFO: renamed from: b */
    public final TokenMeaning f35796b;

    public C6070a(TokenMeaning tokenMeaning, String str) {
        this.f35795a = str;
        this.f35796b = tokenMeaning;
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    public static final C6070a fromBundle(Bundle bundle) {
        if (!C0166e.m778y(bundle, "bundle", C6070a.class, "term")) {
            throw new IllegalArgumentException("Required argument \"term\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("term");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"term\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("tokenMeaning")) {
            throw new IllegalArgumentException("Required argument \"tokenMeaning\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(TokenMeaning.class) && !Serializable.class.isAssignableFrom(TokenMeaning.class)) {
            throw new UnsupportedOperationException(TokenMeaning.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        TokenMeaning tokenMeaning = (TokenMeaning) bundle.get("tokenMeaning");
        if (tokenMeaning != null) {
            return new C6070a(tokenMeaning, string);
        }
        throw new IllegalArgumentException("Argument \"tokenMeaning\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6070a)) {
            return false;
        }
        C6070a c6070a = (C6070a) obj;
        return C5207g.m11106a(this.f35795a, c6070a.f35795a) && C5207g.m11106a(this.f35796b, c6070a.f35796b);
    }

    public final int hashCode() {
        return this.f35796b.hashCode() + (this.f35795a.hashCode() * 31);
    }

    public final String toString() {
        return "DictionariesLocaleFragmentArgs(term=" + this.f35795a + ", tokenMeaning=" + this.f35796b + ")";
    }
}
