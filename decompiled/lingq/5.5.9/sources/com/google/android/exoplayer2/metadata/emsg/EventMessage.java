package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import p479xa.C10134c0;

/* JADX INFO: loaded from: classes.dex */
public final class EventMessage implements Metadata.Entry {
    public static final Parcelable.Creator<EventMessage> CREATOR;

    /* JADX INFO: renamed from: g */
    public static final C2416m f12641g;

    /* JADX INFO: renamed from: h */
    public static final C2416m f12642h;

    /* JADX INFO: renamed from: a */
    public final String f12643a;

    /* JADX INFO: renamed from: b */
    public final String f12644b;

    /* JADX INFO: renamed from: c */
    public final long f12645c;

    /* JADX INFO: renamed from: d */
    public final long f12646d;

    /* JADX INFO: renamed from: e */
    public final byte[] f12647e;

    /* JADX INFO: renamed from: f */
    public int f12648f;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.emsg.EventMessage$a */
    public class C2433a implements Parcelable.Creator<EventMessage> {
        @Override // android.os.Parcelable.Creator
        public final EventMessage createFromParcel(Parcel parcel) {
            return new EventMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final EventMessage[] newArray(int i10) {
            return new EventMessage[i10];
        }
    }

    static {
        C2416m.a aVar = new C2416m.a();
        aVar.f12501k = "application/id3";
        f12641g = aVar.m7128a();
        C2416m.a aVar2 = new C2416m.a();
        aVar2.f12501k = "application/x-scte35";
        f12642h = aVar2.m7128a();
        CREATOR = new C2433a();
    }

    public EventMessage(Parcel parcel) {
        String string = parcel.readString();
        int i10 = C10134c0.f51354a;
        this.f12643a = string;
        this.f12644b = parcel.readString();
        this.f12645c = parcel.readLong();
        this.f12646d = parcel.readLong();
        this.f12647e = parcel.createByteArray();
    }

    public EventMessage(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f12643a = str;
        this.f12644b = str2;
        this.f12645c = j10;
        this.f12646d = j11;
        this.f12647e = bArr;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    /* JADX INFO: renamed from: G */
    public final C2416m mo7204G() {
        String str = this.f12643a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f12642h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f12641g;
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EventMessage.class != obj.getClass()) {
            return false;
        }
        EventMessage eventMessage = (EventMessage) obj;
        return this.f12645c == eventMessage.f12645c && this.f12646d == eventMessage.f12646d && C10134c0.m19034a(this.f12643a, eventMessage.f12643a) && C10134c0.m19034a(this.f12644b, eventMessage.f12644b) && Arrays.equals(this.f12647e, eventMessage.f12647e);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    /* JADX INFO: renamed from: h0 */
    public final byte[] mo7205h0() {
        if (mo7204G() != null) {
            return this.f12647e;
        }
        return null;
    }

    public final int hashCode() {
        if (this.f12648f == 0) {
            String str = this.f12643a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f12644b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j10 = this.f12645c;
            int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f12646d;
            this.f12648f = Arrays.hashCode(this.f12647e) + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
        }
        return this.f12648f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f12643a + ", id=" + this.f12646d + ", durationMs=" + this.f12645c + ", value=" + this.f12644b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12643a);
        parcel.writeString(this.f12644b);
        parcel.writeLong(this.f12645c);
        parcel.writeLong(this.f12646d);
        parcel.writeByteArray(this.f12647e);
    }
}
