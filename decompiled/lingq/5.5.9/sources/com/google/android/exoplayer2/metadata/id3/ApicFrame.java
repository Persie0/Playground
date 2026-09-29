package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.C2467q;
import java.util.Arrays;
import p479xa.C10134c0;

/* JADX INFO: loaded from: classes.dex */
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new C2438a();

    /* JADX INFO: renamed from: b */
    public final String f12668b;

    /* JADX INFO: renamed from: c */
    public final String f12669c;

    /* JADX INFO: renamed from: d */
    public final int f12670d;

    /* JADX INFO: renamed from: e */
    public final byte[] f12671e;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.id3.ApicFrame$a */
    public class C2438a implements Parcelable.Creator<ApicFrame> {
        @Override // android.os.Parcelable.Creator
        public final ApicFrame createFromParcel(Parcel parcel) {
            return new ApicFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ApicFrame[] newArray(int i10) {
            return new ApicFrame[i10];
        }
    }

    public ApicFrame(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i10 = C10134c0.f51354a;
        this.f12668b = string;
        this.f12669c = parcel.readString();
        this.f12670d = parcel.readInt();
        this.f12671e = parcel.createByteArray();
    }

    public ApicFrame(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f12668b = str;
        this.f12669c = str2;
        this.f12670d = i10;
        this.f12671e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ApicFrame.class == obj.getClass()) {
            ApicFrame apicFrame = (ApicFrame) obj;
            return this.f12670d == apicFrame.f12670d && C10134c0.m19034a(this.f12668b, apicFrame.f12668b) && C10134c0.m19034a(this.f12669c, apicFrame.f12669c) && Arrays.equals(this.f12671e, apicFrame.f12671e);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (527 + this.f12670d) * 31;
        String str = this.f12668b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12669c;
        return Arrays.hashCode(this.f12671e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    /* JADX INFO: renamed from: s */
    public final void mo7206s(C2467q.a aVar) {
        aVar.m7214a(this.f12671e, this.f12670d);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.f12691a + ": mimeType=" + this.f12668b + ", description=" + this.f12669c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12668b);
        parcel.writeString(this.f12669c);
        parcel.writeInt(this.f12670d);
        parcel.writeByteArray(this.f12671e);
    }
}
