package p417ui;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.commons.p053ui.FilterType;
import com.linguist.R;
import dm.C5207g;
import java.io.Serializable;
import p040c4.InterfaceC1687l;

/* JADX INFO: renamed from: ui.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C9533d implements InterfaceC1687l {

    /* JADX INFO: renamed from: a */
    public final FilterType f49073a;

    /* JADX INFO: renamed from: b */
    public final String f49074b;

    /* JADX INFO: renamed from: c */
    public final int f49075c = R.id.actionToSelection;

    public C9533d(FilterType filterType, String str) {
        this.f49073a = filterType;
        this.f49074b = str;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: d */
    public final Bundle mo482d() {
        Bundle bundle = new Bundle();
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(FilterType.class);
        Serializable serializable = this.f49073a;
        if (zIsAssignableFrom) {
            C5207g.m11109d(serializable, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("filterType", (Parcelable) serializable);
        } else {
            if (!Serializable.class.isAssignableFrom(FilterType.class)) {
                throw new UnsupportedOperationException(FilterType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            C5207g.m11109d(serializable, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("filterType", serializable);
        }
        bundle.putString("collectionType", this.f49074b);
        return bundle;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: e */
    public final int mo483e() {
        return this.f49075c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9533d)) {
            return false;
        }
        C9533d c9533d = (C9533d) obj;
        return this.f49073a == c9533d.f49073a && C5207g.m11106a(this.f49074b, c9533d.f49074b);
    }

    public final int hashCode() {
        return this.f49074b.hashCode() + (this.f49073a.hashCode() * 31);
    }

    public final String toString() {
        return "ActionToSelection(filterType=" + this.f49073a + ", collectionType=" + this.f49074b + ")";
    }
}
