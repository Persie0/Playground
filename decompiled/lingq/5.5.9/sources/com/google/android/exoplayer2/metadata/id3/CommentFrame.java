package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import p479xa.C10134c0;

/* JADX INFO: loaded from: classes.dex */
public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator<CommentFrame> CREATOR = new C2442a();

    /* JADX INFO: renamed from: b */
    public final String f12684b;

    /* JADX INFO: renamed from: c */
    public final String f12685c;

    /* JADX INFO: renamed from: d */
    public final String f12686d;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.id3.CommentFrame$a */
    public class C2442a implements Parcelable.Creator<CommentFrame> {
        @Override // android.os.Parcelable.Creator
        public final CommentFrame createFromParcel(Parcel parcel) {
            return new CommentFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CommentFrame[] newArray(int i10) {
            return new CommentFrame[i10];
        }
    }

    public CommentFrame(Parcel parcel) {
        super("COMM");
        String string = parcel.readString();
        int i10 = C10134c0.f51354a;
        this.f12684b = string;
        this.f12685c = parcel.readString();
        this.f12686d = parcel.readString();
    }

    public CommentFrame(String str, String str2, String str3) {
        super("COMM");
        this.f12684b = str;
        this.f12685c = str2;
        this.f12686d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CommentFrame.class == obj.getClass()) {
            CommentFrame commentFrame = (CommentFrame) obj;
            return C10134c0.m19034a(this.f12685c, commentFrame.f12685c) && C10134c0.m19034a(this.f12684b, commentFrame.f12684b) && C10134c0.m19034a(this.f12686d, commentFrame.f12686d);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f12684b;
        int iHashCode2 = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12685c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12686d;
        if (str3 != null) {
            iHashCode = str3.hashCode();
        }
        return iHashCode3 + iHashCode;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.f12691a + ": language=" + this.f12684b + ", description=" + this.f12685c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12691a);
        parcel.writeString(this.f12684b);
        parcel.writeString(this.f12686d);
    }
}
