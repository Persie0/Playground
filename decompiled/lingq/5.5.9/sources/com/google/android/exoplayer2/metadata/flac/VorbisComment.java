package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import com.google.android.exoplayer2.C2467q;
import com.google.android.exoplayer2.metadata.Metadata;
import p479xa.C10134c0;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new C2435a();

    /* JADX INFO: renamed from: a */
    public final String f12657a;

    /* JADX INFO: renamed from: b */
    public final String f12658b;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.flac.VorbisComment$a */
    public class C2435a implements Parcelable.Creator<VorbisComment> {
        @Override // android.os.Parcelable.Creator
        public final VorbisComment createFromParcel(Parcel parcel) {
            return new VorbisComment(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final VorbisComment[] newArray(int i10) {
            return new VorbisComment[i10];
        }
    }

    public VorbisComment(Parcel parcel) {
        String string = parcel.readString();
        int i10 = C10134c0.f51354a;
        this.f12657a = string;
        this.f12658b = parcel.readString();
    }

    public VorbisComment(String str, String str2) {
        this.f12657a = str;
        this.f12658b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            VorbisComment vorbisComment = (VorbisComment) obj;
            return this.f12657a.equals(vorbisComment.f12657a) && this.f12658b.equals(vorbisComment.f12658b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12658b.hashCode() + C0166e.m758d(this.f12657a, 527, 31);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    /* JADX INFO: renamed from: s */
    public final void mo7206s(C2467q.a aVar) {
        byte b10;
        String str = this.f12657a;
        str.getClass();
        switch (str) {
            case "ALBUM":
                b10 = 0;
                break;
            case "TITLE":
                b10 = 1;
                break;
            case "DESCRIPTION":
                b10 = 2;
                break;
            case "ALBUMARTIST":
                b10 = 3;
                break;
            case "ARTIST":
                b10 = 4;
                break;
            default:
                b10 = -1;
                break;
        }
        String str2 = this.f12658b;
        if (b10 == 0) {
            aVar.f12949c = str2;
            return;
        }
        if (b10 == 1) {
            aVar.f12947a = str2;
            return;
        }
        if (b10 == 2) {
            aVar.f12953g = str2;
        } else if (b10 == 3) {
            aVar.f12950d = str2;
        } else {
            if (b10 != 4) {
                return;
            }
            aVar.f12948b = str2;
        }
    }

    public final String toString() {
        return "VC: " + this.f12657a + "=" + this.f12658b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12657a);
        parcel.writeString(this.f12658b);
    }
}
