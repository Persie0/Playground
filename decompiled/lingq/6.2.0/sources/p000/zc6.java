package p000;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.core.token.edit.TokenEditData;
import com.lingq.feature.token.R$id;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class zc6 implements t86 {

    /* JADX INFO: renamed from: a */
    public final TokenEditData f71364a;

    /* JADX INFO: renamed from: b */
    public final int f71365b;

    public zc6(TokenEditData tokenEditData) {
        tokenEditData.getClass();
        this.f71364a = tokenEditData;
        this.f71365b = R$id.actionToTokenEdit;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(TokenEditData.class);
        Parcelable parcelable = this.f71364a;
        if (zIsAssignableFrom) {
            parcelable.getClass();
            bundle.putParcelable("tokenEditData", parcelable);
            return bundle;
        }
        if (!Serializable.class.isAssignableFrom(TokenEditData.class)) {
            C3386nv.m17636w(TokenEditData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            return null;
        }
        parcelable.getClass();
        bundle.putSerializable("tokenEditData", (Serializable) parcelable);
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f71365b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zc6) && fa4.m11650l(this.f71364a, ((zc6) obj).f71364a);
    }

    public final int hashCode() {
        return this.f71364a.hashCode();
    }

    public final String toString() {
        return "ActionToTokenEdit(tokenEditData=" + this.f71364a + ")";
    }
}
