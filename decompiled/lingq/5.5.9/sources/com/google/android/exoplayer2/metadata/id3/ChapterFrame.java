package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p479xa.C10134c0;

/* JADX INFO: loaded from: classes.dex */
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new C2440a();

    /* JADX INFO: renamed from: b */
    public final String f12673b;

    /* JADX INFO: renamed from: c */
    public final int f12674c;

    /* JADX INFO: renamed from: d */
    public final int f12675d;

    /* JADX INFO: renamed from: e */
    public final long f12676e;

    /* JADX INFO: renamed from: f */
    public final long f12677f;

    /* JADX INFO: renamed from: g */
    public final Id3Frame[] f12678g;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.id3.ChapterFrame$a */
    public class C2440a implements Parcelable.Creator<ChapterFrame> {
        @Override // android.os.Parcelable.Creator
        public final ChapterFrame createFromParcel(Parcel parcel) {
            return new ChapterFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ChapterFrame[] newArray(int i10) {
            return new ChapterFrame[i10];
        }
    }

    public ChapterFrame(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i10 = C10134c0.f51354a;
        this.f12673b = string;
        this.f12674c = parcel.readInt();
        this.f12675d = parcel.readInt();
        this.f12676e = parcel.readLong();
        this.f12677f = parcel.readLong();
        int i11 = parcel.readInt();
        this.f12678g = new Id3Frame[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            this.f12678g[i12] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public ChapterFrame(String str, int i10, int i11, long j10, long j11, Id3Frame[] id3FrameArr) {
        super("CHAP");
        this.f12673b = str;
        this.f12674c = i10;
        this.f12675d = i11;
        this.f12676e = j10;
        this.f12677f = j11;
        this.f12678g = id3FrameArr;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterFrame.class != obj.getClass()) {
            return false;
        }
        ChapterFrame chapterFrame = (ChapterFrame) obj;
        return this.f12674c == chapterFrame.f12674c && this.f12675d == chapterFrame.f12675d && this.f12676e == chapterFrame.f12676e && this.f12677f == chapterFrame.f12677f && C10134c0.m19034a(this.f12673b, chapterFrame.f12673b) && Arrays.equals(this.f12678g, chapterFrame.f12678g);
    }

    public final int hashCode() {
        int i10 = (((((((527 + this.f12674c) * 31) + this.f12675d) * 31) + ((int) this.f12676e)) * 31) + ((int) this.f12677f)) * 31;
        String str = this.f12673b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12673b);
        parcel.writeInt(this.f12674c);
        parcel.writeInt(this.f12675d);
        parcel.writeLong(this.f12676e);
        parcel.writeLong(this.f12677f);
        Id3Frame[] id3FrameArr = this.f12678g;
        parcel.writeInt(id3FrameArr.length);
        for (Id3Frame id3Frame : id3FrameArr) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }
}
