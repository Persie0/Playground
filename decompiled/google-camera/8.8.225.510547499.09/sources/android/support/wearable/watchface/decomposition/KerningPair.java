package android.support.wearable.watchface.decomposition;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class KerningPair implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: android.support.wearable.watchface.decomposition.KerningPair.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new KerningPair(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new KerningPair[i];
        }
    };

    /* JADX INFO: renamed from: a */
    public final int f1411a;

    /* JADX INFO: renamed from: b */
    public final char f1412b;

    /* JADX INFO: renamed from: c */
    public final char f1413c;

    protected KerningPair(Parcel parcel) {
        this.f1411a = parcel.readInt();
        this.f1412b = (char) parcel.readInt();
        this.f1413c = (char) parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1411a);
        parcel.writeInt(this.f1412b);
        parcel.writeInt(this.f1413c);
    }
}
