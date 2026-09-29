package cc;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzli;

/* JADX INFO: renamed from: cc.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1784c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM7609m = SafeParcelReader.m7609m(parcel);
        String strM7599c = null;
        String strM7599c2 = null;
        zzli zzliVar = null;
        String strM7599c3 = null;
        zzaw zzawVar = null;
        zzaw zzawVar2 = null;
        zzaw zzawVar3 = null;
        long jM7606j = 0;
        long jM7606j2 = 0;
        long jM7606j3 = 0;
        boolean zM7603g = false;
        while (parcel.dataPosition() < iM7609m) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 2:
                    strM7599c = SafeParcelReader.m7599c(parcel, i10);
                    break;
                case 3:
                    strM7599c2 = SafeParcelReader.m7599c(parcel, i10);
                    break;
                case 4:
                    zzliVar = (zzli) SafeParcelReader.m7598b(parcel, i10, zzli.CREATOR);
                    break;
                case 5:
                    jM7606j = SafeParcelReader.m7606j(parcel, i10);
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    zM7603g = SafeParcelReader.m7603g(parcel, i10);
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    strM7599c3 = SafeParcelReader.m7599c(parcel, i10);
                    break;
                case '\b':
                    zzawVar = (zzaw) SafeParcelReader.m7598b(parcel, i10, zzaw.CREATOR);
                    break;
                case '\t':
                    jM7606j2 = SafeParcelReader.m7606j(parcel, i10);
                    break;
                case '\n':
                    zzawVar2 = (zzaw) SafeParcelReader.m7598b(parcel, i10, zzaw.CREATOR);
                    break;
                case 11:
                    jM7606j3 = SafeParcelReader.m7606j(parcel, i10);
                    break;
                case '\f':
                    zzawVar3 = (zzaw) SafeParcelReader.m7598b(parcel, i10, zzaw.CREATOR);
                    break;
                default:
                    SafeParcelReader.m7608l(parcel, i10);
                    break;
            }
        }
        SafeParcelReader.m7602f(parcel, iM7609m);
        return new zzac(strM7599c, strM7599c2, zzliVar, jM7606j, zM7603g, strM7599c3, zzawVar, jM7606j2, zzawVar2, jM7606j3, zzawVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzac[i10];
    }
}
