package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: na */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class C0842na implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0050aw(18);

    /* JADX INFO: renamed from: a */
    public int f41884a;

    /* JADX INFO: renamed from: b */
    int f41885b;

    /* JADX INFO: renamed from: c */
    int[] f41886c;

    /* JADX INFO: renamed from: d */
    boolean f41887d;

    C0842na() {
    }

    public C0842na(Parcel parcel) {
        this.f41884a = parcel.readInt();
        this.f41885b = parcel.readInt();
        this.f41887d = parcel.readInt() == 1;
        int i = parcel.readInt();
        if (i > 0) {
            int[] iArr = new int[i];
            this.f41886c = iArr;
            parcel.readIntArray(iArr);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f41884a + ", mGapDir=" + this.f41885b + ", mHasUnwantedGapAfter=" + this.f41887d + ", mGapPerSpan=" + Arrays.toString(this.f41886c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f41884a);
        parcel.writeInt(this.f41885b);
        parcel.writeInt(this.f41887d ? 1 : 0);
        int[] iArr = this.f41886c;
        if (iArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f41886c);
        }
    }
}
