package p097ej;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.commons.p053ui.FilterType;
import com.linguist.R;
import dm.C5207g;
import java.io.Serializable;
import p040c4.InterfaceC1687l;

/* JADX INFO: renamed from: ej.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C5417h implements InterfaceC1687l {

    /* JADX INFO: renamed from: a */
    public final FilterType f33857a;

    /* JADX INFO: renamed from: b */
    public final int f33858b = R.id.actionToSelection;

    public C5417h(FilterType filterType) {
        this.f33857a = filterType;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: d */
    public final Bundle mo482d() {
        Bundle bundle = new Bundle();
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(FilterType.class);
        Serializable serializable = this.f33857a;
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
        return bundle;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: e */
    public final int mo483e() {
        return this.f33858b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5417h) && this.f33857a == ((C5417h) obj).f33857a;
    }

    public final int hashCode() {
        return this.f33857a.hashCode();
    }

    public final String toString() {
        return "ActionToSelection(filterType=" + this.f33857a + ")";
    }
}
