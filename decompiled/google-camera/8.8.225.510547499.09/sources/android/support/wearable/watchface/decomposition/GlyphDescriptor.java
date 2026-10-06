package android.support.wearable.watchface.decomposition;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class GlyphDescriptor implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: android.support.wearable.watchface.decomposition.GlyphDescriptor.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new GlyphDescriptor(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new GlyphDescriptor[i];
        }
    };

    /* JADX INFO: renamed from: a */
    public final short f1409a;

    /* JADX INFO: renamed from: b */
    public final char f1410b;

    protected GlyphDescriptor(Parcel parcel) {
        this.f1409a = (short) parcel.readInt();
        this.f1410b = (char) parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1409a);
        parcel.writeInt(this.f1410b);
    }
}
