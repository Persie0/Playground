package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p479xa.C10134c0;

/* JADX INFO: loaded from: classes.dex */
public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new C2441a();

    /* JADX INFO: renamed from: b */
    public final String f12679b;

    /* JADX INFO: renamed from: c */
    public final boolean f12680c;

    /* JADX INFO: renamed from: d */
    public final boolean f12681d;

    /* JADX INFO: renamed from: e */
    public final String[] f12682e;

    /* JADX INFO: renamed from: f */
    public final Id3Frame[] f12683f;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.id3.ChapterTocFrame$a */
    public class C2441a implements Parcelable.Creator<ChapterTocFrame> {
        @Override // android.os.Parcelable.Creator
        public final ChapterTocFrame createFromParcel(Parcel parcel) {
            return new ChapterTocFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ChapterTocFrame[] newArray(int i10) {
            return new ChapterTocFrame[i10];
        }
    }

    public ChapterTocFrame(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i10 = C10134c0.f51354a;
        this.f12679b = string;
        boolean z10 = true;
        this.f12680c = parcel.readByte() != 0;
        if (parcel.readByte() == 0) {
            z10 = false;
        }
        this.f12681d = z10;
        this.f12682e = parcel.createStringArray();
        int i11 = parcel.readInt();
        this.f12683f = new Id3Frame[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            this.f12683f[i12] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public ChapterTocFrame(String str, boolean z10, boolean z11, String[] strArr, Id3Frame[] id3FrameArr) {
        super("CTOC");
        this.f12679b = str;
        this.f12680c = z10;
        this.f12681d = z11;
        this.f12682e = strArr;
        this.f12683f = id3FrameArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterTocFrame.class != obj.getClass()) {
            return false;
        }
        ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
        return this.f12680c == chapterTocFrame.f12680c && this.f12681d == chapterTocFrame.f12681d && C10134c0.m19034a(this.f12679b, chapterTocFrame.f12679b) && Arrays.equals(this.f12682e, chapterTocFrame.f12682e) && Arrays.equals(this.f12683f, chapterTocFrame.f12683f);
    }

    public final int hashCode() {
        int i10 = (((527 + (this.f12680c ? 1 : 0)) * 31) + (this.f12681d ? 1 : 0)) * 31;
        String str = this.f12679b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12679b);
        parcel.writeByte(this.f12680c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12681d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f12682e);
        Id3Frame[] id3FrameArr = this.f12683f;
        parcel.writeInt(id3FrameArr.length);
        for (Id3Frame id3Frame : id3FrameArr) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }
}
