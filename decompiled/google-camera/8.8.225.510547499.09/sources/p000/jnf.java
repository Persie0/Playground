package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jnf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM13245G = jiy.m13245G(parcel);
        WorkSource workSource = new WorkSource();
        String strM13250L = null;
        jms jmsVar = null;
        long jM13246H = -1;
        long jM13246H2 = Long.MAX_VALUE;
        long jM13246H3 = Long.MAX_VALUE;
        long jM13246H4 = 0;
        long jM13246H5 = 600000;
        long jM13246H6 = 3600000;
        int iM13243E = 102;
        int iM13243E2 = Integer.MAX_VALUE;
        float f = 0.0f;
        boolean zM13257S = false;
        int iM13243E3 = 0;
        int iM13243E4 = 0;
        boolean zM13257S2 = false;
        while (parcel.dataPosition() < iM13245G) {
            int i = parcel.readInt();
            switch (jiy.m13241C(i)) {
                case 1:
                    iM13243E = jiy.m13243E(parcel, i);
                    break;
                case 2:
                    jM13246H6 = jiy.m13246H(parcel, i);
                    break;
                case 3:
                    jM13246H5 = jiy.m13246H(parcel, i);
                    break;
                case 4:
                default:
                    jiy.m13256R(parcel, i);
                    break;
                case 5:
                    jM13246H2 = jiy.m13246H(parcel, i);
                    break;
                case 6:
                    iM13243E2 = jiy.m13243E(parcel, i);
                    break;
                case 7:
                    jiy.m13255Q(parcel, i, 4);
                    f = parcel.readFloat();
                    break;
                case 8:
                    jM13246H4 = jiy.m13246H(parcel, i);
                    break;
                case 9:
                    zM13257S = jiy.m13257S(parcel, i);
                    break;
                case 10:
                    jM13246H3 = jiy.m13246H(parcel, i);
                    break;
                case 11:
                    jM13246H = jiy.m13246H(parcel, i);
                    break;
                case 12:
                    iM13243E3 = jiy.m13243E(parcel, i);
                    break;
                case 13:
                    iM13243E4 = jiy.m13243E(parcel, i);
                    break;
                case 14:
                    strM13250L = jiy.m13250L(parcel, i);
                    break;
                case 15:
                    zM13257S2 = jiy.m13257S(parcel, i);
                    break;
                case 16:
                    workSource = (WorkSource) jiy.m13249K(parcel, i, WorkSource.CREATOR);
                    break;
                case 17:
                    jmsVar = (jms) jiy.m13249K(parcel, i, jms.CREATOR);
                    break;
            }
        }
        jiy.m13254P(parcel, iM13245G);
        return new LocationRequest(iM13243E, jM13246H6, jM13246H5, jM13246H4, jM13246H2, jM13246H3, iM13243E2, f, zM13257S, jM13246H, iM13243E3, iM13243E4, strM13250L, zM13257S2, workSource, jmsVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationRequest[i];
    }
}
