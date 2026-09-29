package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;

/* JADX INFO: loaded from: classes.dex */
public final class SmtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<SmtaMetadataEntry> CREATOR = new C2453a();

    /* JADX INFO: renamed from: a */
    public final float f12719a;

    /* JADX INFO: renamed from: b */
    public final int f12720b;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry$a */
    public class C2453a implements Parcelable.Creator<SmtaMetadataEntry> {
        @Override // android.os.Parcelable.Creator
        public final SmtaMetadataEntry createFromParcel(Parcel parcel) {
            return new SmtaMetadataEntry(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SmtaMetadataEntry[] newArray(int i10) {
            return new SmtaMetadataEntry[i10];
        }
    }

    public SmtaMetadataEntry(int i10, float f3) {
        this.f12719a = f3;
        this.f12720b = i10;
    }

    public SmtaMetadataEntry(Parcel parcel) {
        this.f12719a = parcel.readFloat();
        this.f12720b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SmtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) obj;
        return this.f12719a == smtaMetadataEntry.f12719a && this.f12720b == smtaMetadataEntry.f12720b;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f12719a).hashCode() + 527) * 31) + this.f12720b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f12719a + ", svcTemporalLayerCount=" + this.f12720b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f12719a);
        parcel.writeInt(this.f12720b);
    }
}
