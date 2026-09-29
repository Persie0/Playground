package hk;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import com.lingq.p055ui.token.DictionaryData;
import dm.C5207g;
import java.io.Serializable;
import p040c4.InterfaceC1680e;

/* JADX INFO: renamed from: hk.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C6073d implements InterfaceC1680e {

    /* JADX INFO: renamed from: a */
    public final DictionaryData f35797a;

    public C6073d(DictionaryData dictionaryData) {
        this.f35797a = dictionaryData;
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    public static final C6073d fromBundle(Bundle bundle) {
        if (!C0166e.m778y(bundle, "bundle", C6073d.class, "dictionaryData")) {
            throw new IllegalArgumentException("Required argument \"dictionaryData\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(DictionaryData.class) && !Serializable.class.isAssignableFrom(DictionaryData.class)) {
            throw new UnsupportedOperationException(DictionaryData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        DictionaryData dictionaryData = (DictionaryData) bundle.get("dictionaryData");
        if (dictionaryData != null) {
            return new C6073d(dictionaryData);
        }
        throw new IllegalArgumentException("Argument \"dictionaryData\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6073d) && C5207g.m11106a(this.f35797a, ((C6073d) obj).f35797a);
    }

    public final int hashCode() {
        return this.f35797a.hashCode();
    }

    public final String toString() {
        return "DictionaryContentFragmentArgs(dictionaryData=" + this.f35797a + ")";
    }
}
