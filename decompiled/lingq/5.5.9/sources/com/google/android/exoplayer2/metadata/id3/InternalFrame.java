package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import p479xa.C10134c0;

/* JADX INFO: loaded from: classes.dex */
public final class InternalFrame extends Id3Frame {
    public static final Parcelable.Creator<InternalFrame> CREATOR = new C2444a();

    /* JADX INFO: renamed from: b */
    public final String f12692b;

    /* JADX INFO: renamed from: c */
    public final String f12693c;

    /* JADX INFO: renamed from: d */
    public final String f12694d;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.id3.InternalFrame$a */
    public class C2444a implements Parcelable.Creator<InternalFrame> {
        @Override // android.os.Parcelable.Creator
        public final InternalFrame createFromParcel(Parcel parcel) {
            return new InternalFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final InternalFrame[] newArray(int i10) {
            return new InternalFrame[i10];
        }
    }

    public InternalFrame(Parcel parcel) {
        super("----");
        String string = parcel.readString();
        int i10 = C10134c0.f51354a;
        this.f12692b = string;
        this.f12693c = parcel.readString();
        this.f12694d = parcel.readString();
    }

    public InternalFrame(String str, String str2, String str3) {
        super("----");
        this.f12692b = str;
        this.f12693c = str2;
        this.f12694d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InternalFrame.class != obj.getClass()) {
            return false;
        }
        InternalFrame internalFrame = (InternalFrame) obj;
        return C10134c0.m19034a(this.f12693c, internalFrame.f12693c) && C10134c0.m19034a(this.f12692b, internalFrame.f12692b) && C10134c0.m19034a(this.f12694d, internalFrame.f12694d);
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f12692b;
        int iHashCode2 = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12693c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12694d;
        if (str3 != null) {
            iHashCode = str3.hashCode();
        }
        return iHashCode3 + iHashCode;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.f12691a + ": domain=" + this.f12692b + ", description=" + this.f12693c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12691a);
        parcel.writeString(this.f12692b);
        parcel.writeString(this.f12694d);
    }
}
