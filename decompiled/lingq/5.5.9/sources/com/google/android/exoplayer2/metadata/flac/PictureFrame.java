package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import com.google.android.exoplayer2.C2467q;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import p479xa.C10134c0;
import p479xa.C10151t;
import p482xd.C10170b;

/* JADX INFO: loaded from: classes.dex */
public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new C2434a();

    /* JADX INFO: renamed from: a */
    public final int f12649a;

    /* JADX INFO: renamed from: b */
    public final String f12650b;

    /* JADX INFO: renamed from: c */
    public final String f12651c;

    /* JADX INFO: renamed from: d */
    public final int f12652d;

    /* JADX INFO: renamed from: e */
    public final int f12653e;

    /* JADX INFO: renamed from: f */
    public final int f12654f;

    /* JADX INFO: renamed from: g */
    public final int f12655g;

    /* JADX INFO: renamed from: h */
    public final byte[] f12656h;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.flac.PictureFrame$a */
    public class C2434a implements Parcelable.Creator<PictureFrame> {
        @Override // android.os.Parcelable.Creator
        public final PictureFrame createFromParcel(Parcel parcel) {
            return new PictureFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PictureFrame[] newArray(int i10) {
            return new PictureFrame[i10];
        }
    }

    public PictureFrame(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f12649a = i10;
        this.f12650b = str;
        this.f12651c = str2;
        this.f12652d = i11;
        this.f12653e = i12;
        this.f12654f = i13;
        this.f12655g = i14;
        this.f12656h = bArr;
    }

    public PictureFrame(Parcel parcel) {
        this.f12649a = parcel.readInt();
        String string = parcel.readString();
        int i10 = C10134c0.f51354a;
        this.f12650b = string;
        this.f12651c = parcel.readString();
        this.f12652d = parcel.readInt();
        this.f12653e = parcel.readInt();
        this.f12654f = parcel.readInt();
        this.f12655g = parcel.readInt();
        this.f12656h = parcel.createByteArray();
    }

    /* JADX INFO: renamed from: a */
    public static PictureFrame m7209a(C10151t c10151t) {
        int iM19129d = c10151t.m19129d();
        String strM19143r = c10151t.m19143r(c10151t.m19129d(), C10170b.f51475a);
        String strM19142q = c10151t.m19142q(c10151t.m19129d());
        int iM19129d2 = c10151t.m19129d();
        int iM19129d3 = c10151t.m19129d();
        int iM19129d4 = c10151t.m19129d();
        int iM19129d5 = c10151t.m19129d();
        int iM19129d6 = c10151t.m19129d();
        byte[] bArr = new byte[iM19129d6];
        c10151t.m19127b(bArr, 0, iM19129d6);
        return new PictureFrame(iM19129d, strM19143r, strM19142q, iM19129d2, iM19129d3, iM19129d4, iM19129d5, bArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PictureFrame.class == obj.getClass()) {
            PictureFrame pictureFrame = (PictureFrame) obj;
            return this.f12649a == pictureFrame.f12649a && this.f12650b.equals(pictureFrame.f12650b) && this.f12651c.equals(pictureFrame.f12651c) && this.f12652d == pictureFrame.f12652d && this.f12653e == pictureFrame.f12653e && this.f12654f == pictureFrame.f12654f && this.f12655g == pictureFrame.f12655g && Arrays.equals(this.f12656h, pictureFrame.f12656h);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12656h) + ((((((((C0166e.m758d(this.f12651c, C0166e.m758d(this.f12650b, (this.f12649a + 527) * 31, 31), 31) + this.f12652d) * 31) + this.f12653e) * 31) + this.f12654f) * 31) + this.f12655g) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    /* JADX INFO: renamed from: s */
    public final void mo7206s(C2467q.a aVar) {
        aVar.m7214a(this.f12656h, this.f12649a);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f12650b + ", description=" + this.f12651c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f12649a);
        parcel.writeString(this.f12650b);
        parcel.writeString(this.f12651c);
        parcel.writeInt(this.f12652d);
        parcel.writeInt(this.f12653e);
        parcel.writeInt(this.f12654f);
        parcel.writeInt(this.f12655g);
        parcel.writeByteArray(this.f12656h);
    }
}
