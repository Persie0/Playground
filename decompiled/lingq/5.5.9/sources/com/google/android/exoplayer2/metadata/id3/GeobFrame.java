package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p479xa.C10134c0;

/* JADX INFO: loaded from: classes.dex */
public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new C2443a();

    /* JADX INFO: renamed from: b */
    public final String f12687b;

    /* JADX INFO: renamed from: c */
    public final String f12688c;

    /* JADX INFO: renamed from: d */
    public final String f12689d;

    /* JADX INFO: renamed from: e */
    public final byte[] f12690e;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.id3.GeobFrame$a */
    public class C2443a implements Parcelable.Creator<GeobFrame> {
        @Override // android.os.Parcelable.Creator
        public final GeobFrame createFromParcel(Parcel parcel) {
            return new GeobFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final GeobFrame[] newArray(int i10) {
            return new GeobFrame[i10];
        }
    }

    public GeobFrame(Parcel parcel) {
        super("GEOB");
        String string = parcel.readString();
        int i10 = C10134c0.f51354a;
        this.f12687b = string;
        this.f12688c = parcel.readString();
        this.f12689d = parcel.readString();
        this.f12690e = parcel.createByteArray();
    }

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f12687b = str;
        this.f12688c = str2;
        this.f12689d = str3;
        this.f12690e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GeobFrame.class != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        return C10134c0.m19034a(this.f12687b, geobFrame.f12687b) && C10134c0.m19034a(this.f12688c, geobFrame.f12688c) && C10134c0.m19034a(this.f12689d, geobFrame.f12689d) && Arrays.equals(this.f12690e, geobFrame.f12690e);
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f12687b;
        int iHashCode2 = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12688c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12689d;
        if (str3 != null) {
            iHashCode = str3.hashCode();
        }
        return Arrays.hashCode(this.f12690e) + ((iHashCode3 + iHashCode) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.f12691a + ": mimeType=" + this.f12687b + ", filename=" + this.f12688c + ", description=" + this.f12689d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12687b);
        parcel.writeString(this.f12688c);
        parcel.writeString(this.f12689d);
        parcel.writeByteArray(this.f12690e);
    }
}
