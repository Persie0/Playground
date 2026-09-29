package dj;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.p055ui.token.TokenData;
import com.linguist.R;
import dm.C5207g;
import java.io.Serializable;
import p040c4.InterfaceC1687l;

/* JADX INFO: renamed from: dj.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C5192j implements InterfaceC1687l {

    /* JADX INFO: renamed from: a */
    public final TokenData f33232a;

    /* JADX INFO: renamed from: b */
    public final int f33233b = R.id.actionToTokenParent;

    public C5192j(TokenData tokenData) {
        this.f33232a = tokenData;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: d */
    public final Bundle mo482d() {
        Bundle bundle = new Bundle();
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(TokenData.class);
        Parcelable parcelable = this.f33232a;
        if (zIsAssignableFrom) {
            C5207g.m11109d(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("tokenData", parcelable);
        } else {
            if (!Serializable.class.isAssignableFrom(TokenData.class)) {
                throw new UnsupportedOperationException(TokenData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            C5207g.m11109d(parcelable, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("tokenData", (Serializable) parcelable);
        }
        return bundle;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: e */
    public final int mo483e() {
        return this.f33233b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5192j) && C5207g.m11106a(this.f33232a, ((C5192j) obj).f33232a);
    }

    public final int hashCode() {
        return this.f33232a.hashCode();
    }

    public final String toString() {
        return "ActionToTokenParent(tokenData=" + this.f33232a + ")";
    }
}
