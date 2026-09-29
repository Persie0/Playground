package com.tonyodev.fetch2core.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.io.Serializable;
import java.util.Date;
import kotlin.Metadata;
import p003a2.C0009a;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0001\u0004¨\u0006\u0005"}, m13365d2 = {"Lcom/tonyodev/fetch2core/server/FileResponse;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "CREATOR", "a", "fetch2core_release"}, m13366k = 1, m13367mv = {1, 4, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class FileResponse implements Parcelable, Serializable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a */
    public final int f32559a;

    /* JADX INFO: renamed from: b */
    public final int f32560b;

    /* JADX INFO: renamed from: c */
    public final int f32561c;

    /* JADX INFO: renamed from: d */
    public final long f32562d;

    /* JADX INFO: renamed from: e */
    public final long f32563e;

    /* JADX INFO: renamed from: f */
    public final String f32564f;

    /* JADX INFO: renamed from: g */
    public final String f32565g;

    /* JADX INFO: renamed from: com.tonyodev.fetch2core.server.FileResponse$a, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<FileResponse> {
        @Override // android.os.Parcelable.Creator
        public final FileResponse createFromParcel(Parcel parcel) {
            C5207g.m11112g(parcel, "source");
            int i10 = parcel.readInt();
            int i11 = parcel.readInt();
            int i12 = parcel.readInt();
            long j10 = parcel.readLong();
            long j11 = parcel.readLong();
            String string = parcel.readString();
            String str = string != null ? string : "";
            String string2 = parcel.readString();
            if (string2 == null) {
                string2 = "";
            }
            return new FileResponse(i10, i11, i12, j10, j11, str, string2);
        }

        @Override // android.os.Parcelable.Creator
        public final FileResponse[] newArray(int i10) {
            return new FileResponse[i10];
        }
    }

    public FileResponse() {
        this(415, -1, 0, new Date().getTime(), 0L, "", "");
    }

    public FileResponse(int i10, int i11, int i12, long j10, long j11, String str, String str2) {
        C5207g.m11112g(str, "md5");
        C5207g.m11112g(str2, "sessionId");
        this.f32559a = i10;
        this.f32560b = i11;
        this.f32561c = i12;
        this.f32562d = j10;
        this.f32563e = j11;
        this.f32564f = str;
        this.f32565g = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m10689a() {
        StringBuilder sb2 = new StringBuilder("{\"Status\":");
        sb2.append(this.f32559a);
        sb2.append(",\"Md5\":");
        sb2.append("\"" + this.f32564f + '\"');
        sb2.append(",\"Connection\":");
        sb2.append(this.f32561c);
        sb2.append(",\"Date\":");
        sb2.append(this.f32562d);
        sb2.append(",\"Content-Length\":");
        sb2.append(this.f32563e);
        sb2.append(",\"Type\":");
        sb2.append(this.f32560b);
        sb2.append(",\"SessionId\":");
        sb2.append(this.f32565g);
        sb2.append('}');
        String string = sb2.toString();
        C5207g.m11107b(string, "builder.toString()");
        return string;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        if (dm.C5207g.m11106a(r5.f32565g, r6.f32565g) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FileResponse) {
                FileResponse fileResponse = (FileResponse) obj;
                if (this.f32559a == fileResponse.f32559a) {
                    if (this.f32560b == fileResponse.f32560b) {
                        if (this.f32561c == fileResponse.f32561c) {
                            if (this.f32562d == fileResponse.f32562d) {
                                if (this.f32563e == fileResponse.f32563e) {
                                    if (C5207g.m11106a(this.f32564f, fileResponse.f32564f)) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10 = ((((this.f32559a * 31) + this.f32560b) * 31) + this.f32561c) * 31;
        long j10 = this.f32562d;
        int i11 = (i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f32563e;
        int i12 = (i11 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        int iHashCode = 0;
        String str = this.f32564f;
        int iHashCode2 = (i12 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f32565g;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return iHashCode2 + iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FileResponse(status=");
        sb2.append(this.f32559a);
        sb2.append(", type=");
        sb2.append(this.f32560b);
        sb2.append(", connection=");
        sb2.append(this.f32561c);
        sb2.append(", date=");
        sb2.append(this.f32562d);
        sb2.append(", contentLength=");
        sb2.append(this.f32563e);
        sb2.append(", md5=");
        sb2.append(this.f32564f);
        sb2.append(", sessionId=");
        return C0009a.m23l(sb2, this.f32565g, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C5207g.m11112g(parcel, "dest");
        parcel.writeInt(this.f32559a);
        parcel.writeInt(this.f32560b);
        parcel.writeInt(this.f32561c);
        parcel.writeLong(this.f32562d);
        parcel.writeLong(this.f32563e);
        parcel.writeString(this.f32564f);
        parcel.writeString(this.f32565g);
    }
}
