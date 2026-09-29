package kh;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.p055ui.token.TokenEditData;
import com.linguist.R;
import dm.C5207g;
import java.io.Serializable;
import p040c4.InterfaceC1687l;

/* JADX INFO: renamed from: kh.r */
/* JADX INFO: loaded from: classes.dex */
public final class C6691r implements InterfaceC1687l {

    /* JADX INFO: renamed from: a */
    public final TokenEditData f37835a;

    /* JADX INFO: renamed from: b */
    public final int f37836b = R.id.actionToTokenEdit;

    public C6691r(TokenEditData tokenEditData) {
        this.f37835a = tokenEditData;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: d */
    public final Bundle mo482d() {
        Bundle bundle = new Bundle();
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(TokenEditData.class);
        Parcelable parcelable = this.f37835a;
        if (zIsAssignableFrom) {
            C5207g.m11109d(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("tokenEditData", parcelable);
        } else {
            if (!Serializable.class.isAssignableFrom(TokenEditData.class)) {
                throw new UnsupportedOperationException(TokenEditData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            C5207g.m11109d(parcelable, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("tokenEditData", (Serializable) parcelable);
        }
        return bundle;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: e */
    public final int mo483e() {
        return this.f37836b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6691r) && C5207g.m11106a(this.f37835a, ((C6691r) obj).f37835a);
    }

    public final int hashCode() {
        return this.f37835a.hashCode();
    }

    public final String toString() {
        return "ActionToTokenEdit(tokenEditData=" + this.f37835a + ")";
    }
}
