package td;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: td.v */
/* JADX INFO: loaded from: classes.dex */
public final class C9274v {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f47976a = 0;

    static {
        C9274v.class.getClassLoader();
    }

    /* JADX INFO: renamed from: a */
    public static Parcelable m17634a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
