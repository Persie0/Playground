package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import p479xa.C10134c0;

/* JADX INFO: loaded from: classes.dex */
public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new C2448a();

    /* JADX INFO: renamed from: b */
    public final String f12704b;

    /* JADX INFO: renamed from: c */
    public final String f12705c;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.id3.UrlLinkFrame$a */
    public class C2448a implements Parcelable.Creator<UrlLinkFrame> {
        @Override // android.os.Parcelable.Creator
        public final UrlLinkFrame createFromParcel(Parcel parcel) {
            return new UrlLinkFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final UrlLinkFrame[] newArray(int i10) {
            return new UrlLinkFrame[i10];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UrlLinkFrame(Parcel parcel) {
        String string = parcel.readString();
        int i10 = C10134c0.f51354a;
        super(string);
        this.f12704b = parcel.readString();
        this.f12705c = parcel.readString();
    }

    public UrlLinkFrame(String str, String str2, String str3) {
        super(str);
        this.f12704b = str2;
        this.f12705c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && UrlLinkFrame.class == obj.getClass()) {
            UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
            return this.f12691a.equals(urlLinkFrame.f12691a) && C10134c0.m19034a(this.f12704b, urlLinkFrame.f12704b) && C10134c0.m19034a(this.f12705c, urlLinkFrame.f12705c);
        }
        return false;
    }

    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f12691a, 527, 31);
        int iHashCode = 0;
        String str = this.f12704b;
        int iHashCode2 = (iM758d + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12705c;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return iHashCode2 + iHashCode;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.f12691a + ": url=" + this.f12705c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12691a);
        parcel.writeString(this.f12704b);
        parcel.writeString(this.f12705c);
    }
}
