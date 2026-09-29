package fj;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.commons.p053ui.UserImportDetailType;
import com.linguist.R;
import dm.C5207g;
import java.io.Serializable;
import p040c4.InterfaceC1687l;

/* JADX INFO: renamed from: fj.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C5551l implements InterfaceC1687l {

    /* JADX INFO: renamed from: a */
    public final String f34303a;

    /* JADX INFO: renamed from: b */
    public final boolean f34304b;

    /* JADX INFO: renamed from: c */
    public final UserImportDetailType f34305c;

    /* JADX INFO: renamed from: d */
    public final int f34306d = R.id.actionToText;

    public C5551l(String str, boolean z10, UserImportDetailType userImportDetailType) {
        this.f34303a = str;
        this.f34304b = z10;
        this.f34305c = userImportDetailType;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: d */
    public final Bundle mo482d() {
        Bundle bundle = new Bundle();
        bundle.putString("title", this.f34303a);
        bundle.putBoolean("isUrl", this.f34304b);
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(UserImportDetailType.class);
        Serializable serializable = this.f34305c;
        if (zIsAssignableFrom) {
            C5207g.m11109d(serializable, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("userImportDetailType", (Parcelable) serializable);
        } else {
            if (!Serializable.class.isAssignableFrom(UserImportDetailType.class)) {
                throw new UnsupportedOperationException(UserImportDetailType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            C5207g.m11109d(serializable, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("userImportDetailType", serializable);
        }
        return bundle;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: e */
    public final int mo483e() {
        return this.f34306d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5551l)) {
            return false;
        }
        C5551l c5551l = (C5551l) obj;
        if (C5207g.m11106a(this.f34303a, c5551l.f34303a) && this.f34304b == c5551l.f34304b && this.f34305c == c5551l.f34305c) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public final int hashCode() {
        int iHashCode = this.f34303a.hashCode() * 31;
        boolean z10 = this.f34304b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return this.f34305c.hashCode() + ((iHashCode + r10) * 31);
    }

    public final String toString() {
        return "ActionToText(title=" + this.f34303a + ", isUrl=" + this.f34304b + ", userImportDetailType=" + this.f34305c + ")";
    }
}
