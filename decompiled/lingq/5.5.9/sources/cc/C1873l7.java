package cc;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.C0987y;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.measurement.internal.zzli;

/* JADX INFO: renamed from: cc.l7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1873l7 implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    public static void m5744a(zzli zzliVar, Parcel parcel) {
        int iM3836r = C0987y.m3836r(parcel, 20293);
        C0987y.m3829k(parcel, 1, zzliVar.f14617a);
        C0987y.m3832n(parcel, 2, zzliVar.f14618b);
        C0987y.m3830l(parcel, 3, zzliVar.f14619c);
        Long l10 = zzliVar.f14620d;
        if (l10 != null) {
            parcel.writeInt(524292);
            parcel.writeLong(l10.longValue());
        }
        C0987y.m3832n(parcel, 6, zzliVar.f14621e);
        C0987y.m3832n(parcel, 7, zzliVar.f14622f);
        Double d10 = zzliVar.f14623g;
        if (d10 != null) {
            parcel.writeInt(524296);
            parcel.writeDouble(d10.doubleValue());
        }
        C0987y.m3839u(parcel, iM3836r);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM7609m = SafeParcelReader.m7609m(parcel);
        String strM7599c = null;
        Long lValueOf = null;
        Float fValueOf = null;
        String strM7599c2 = null;
        String strM7599c3 = null;
        Double dValueOf = null;
        long jM7606j = 0;
        int iM7605i = 0;
        while (parcel.dataPosition() < iM7609m) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    iM7605i = SafeParcelReader.m7605i(parcel, i10);
                    break;
                case 2:
                    strM7599c = SafeParcelReader.m7599c(parcel, i10);
                    break;
                case 3:
                    jM7606j = SafeParcelReader.m7606j(parcel, i10);
                    break;
                case 4:
                    int iM7607k = SafeParcelReader.m7607k(parcel, i10);
                    if (iM7607k != 0) {
                        SafeParcelReader.m7610n(parcel, iM7607k, 8);
                        lValueOf = Long.valueOf(parcel.readLong());
                    } else {
                        lValueOf = null;
                    }
                    break;
                case 5:
                    int iM7607k2 = SafeParcelReader.m7607k(parcel, i10);
                    if (iM7607k2 != 0) {
                        SafeParcelReader.m7610n(parcel, iM7607k2, 4);
                        fValueOf = Float.valueOf(parcel.readFloat());
                    } else {
                        fValueOf = null;
                    }
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    strM7599c2 = SafeParcelReader.m7599c(parcel, i10);
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    strM7599c3 = SafeParcelReader.m7599c(parcel, i10);
                    break;
                case '\b':
                    int iM7607k3 = SafeParcelReader.m7607k(parcel, i10);
                    if (iM7607k3 != 0) {
                        SafeParcelReader.m7610n(parcel, iM7607k3, 8);
                        dValueOf = Double.valueOf(parcel.readDouble());
                    } else {
                        dValueOf = null;
                    }
                    break;
                default:
                    SafeParcelReader.m7608l(parcel, i10);
                    break;
            }
        }
        SafeParcelReader.m7602f(parcel, iM7609m);
        return new zzli(iM7605i, strM7599c, jM7606j, lValueOf, fValueOf, strM7599c2, strM7599c3, dValueOf);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzli[i10];
    }
}
