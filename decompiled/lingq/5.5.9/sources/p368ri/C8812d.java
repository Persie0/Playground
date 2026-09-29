package p368ri;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import com.lingq.p055ui.imports.ImportData;
import dm.C5207g;
import java.io.Serializable;
import p040c4.InterfaceC1680e;

/* JADX INFO: renamed from: ri.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C8812d implements InterfaceC1680e {

    /* JADX INFO: renamed from: a */
    public final ImportData f46699a;

    /* JADX INFO: renamed from: b */
    public final int f46700b;

    public C8812d() {
        this(null, 0);
    }

    public C8812d(ImportData importData, int i10) {
        this.f46699a = importData;
        this.f46700b = i10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static final C8812d fromBundle(Bundle bundle) {
        ImportData importData;
        if (!C0166e.m778y(bundle, "bundle", C8812d.class, "shareData")) {
            importData = null;
        } else {
            if (!Parcelable.class.isAssignableFrom(ImportData.class) && !Serializable.class.isAssignableFrom(ImportData.class)) {
                throw new UnsupportedOperationException(ImportData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            importData = (ImportData) bundle.get("shareData");
        }
        return new C8812d(importData, bundle.containsKey("currentTrack") ? bundle.getInt("currentTrack") : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8812d)) {
            return false;
        }
        C8812d c8812d = (C8812d) obj;
        return C5207g.m11106a(this.f46699a, c8812d.f46699a) && this.f46700b == c8812d.f46700b;
    }

    public final int hashCode() {
        ImportData importData = this.f46699a;
        return Integer.hashCode(this.f46700b) + ((importData == null ? 0 : importData.hashCode()) * 31);
    }

    public final String toString() {
        return "HomeFragmentArgs(shareData=" + this.f46699a + ", currentTrack=" + this.f46700b + ")";
    }
}
