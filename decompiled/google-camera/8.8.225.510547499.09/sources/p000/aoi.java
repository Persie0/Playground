package p000;

import android.text.TextUtils;
import androidx.preference.Preference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aoi {

    /* JADX INFO: renamed from: a */
    final int f1890a;

    /* JADX INFO: renamed from: b */
    final int f1891b;

    /* JADX INFO: renamed from: c */
    final String f1892c;

    public aoi(Preference preference) {
        this.f1892c = preference.getClass().getName();
        this.f1890a = preference.f1559A;
        this.f1891b = preference.f1560B;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aoi)) {
            return false;
        }
        aoi aoiVar = (aoi) obj;
        return this.f1890a == aoiVar.f1890a && this.f1891b == aoiVar.f1891b && TextUtils.equals(this.f1892c, aoiVar.f1892c);
    }

    public final int hashCode() {
        return ((((this.f1890a + 527) * 31) + this.f1891b) * 31) + this.f1892c.hashCode();
    }
}
