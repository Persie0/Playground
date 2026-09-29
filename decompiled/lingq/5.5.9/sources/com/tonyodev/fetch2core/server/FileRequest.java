package com.tonyodev.fetch2core.server;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import com.tonyodev.fetch2core.Extras;
import dm.C5207g;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C6753d;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0001\u0004¨\u0006\u0005"}, m13365d2 = {"Lcom/tonyodev/fetch2core/server/FileRequest;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "CREATOR", "a", "fetch2core_release"}, m13366k = 1, m13367mv = {1, 4, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class FileRequest implements Parcelable, Serializable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a */
    public final int f32549a;

    /* JADX INFO: renamed from: b */
    public final String f32550b;

    /* JADX INFO: renamed from: c */
    public final long f32551c;

    /* JADX INFO: renamed from: d */
    public final long f32552d;

    /* JADX INFO: renamed from: e */
    public final String f32553e;

    /* JADX INFO: renamed from: f */
    public final String f32554f;

    /* JADX INFO: renamed from: g */
    public final Extras f32555g;

    /* JADX INFO: renamed from: h */
    public final int f32556h;

    /* JADX INFO: renamed from: i */
    public final int f32557i;

    /* JADX INFO: renamed from: j */
    public final boolean f32558j;

    /* JADX INFO: renamed from: com.tonyodev.fetch2core.server.FileRequest$a, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<FileRequest> {
        @Override // android.os.Parcelable.Creator
        public final FileRequest createFromParcel(Parcel parcel) {
            C5207g.m11112g(parcel, "source");
            int i10 = parcel.readInt();
            String string = parcel.readString();
            String str = string != null ? string : "";
            long j10 = parcel.readLong();
            long j11 = parcel.readLong();
            String string2 = parcel.readString();
            String str2 = string2 != null ? string2 : "";
            String string3 = parcel.readString();
            String str3 = string3 != null ? string3 : "";
            Serializable serializable = parcel.readSerializable();
            if (serializable != null) {
                return new FileRequest(i10, str, j10, j11, str2, str3, new Extras((HashMap) serializable), parcel.readInt(), parcel.readInt(), parcel.readInt() == 1);
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, kotlin.String> /* = java.util.HashMap<kotlin.String, kotlin.String> */");
        }

        @Override // android.os.Parcelable.Creator
        public final FileRequest[] newArray(int i10) {
            return new FileRequest[i10];
        }
    }

    public FileRequest() {
        this(0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FileRequest(int i10) {
        String strValueOf = String.valueOf(-1L);
        Extras.INSTANCE.getClass();
        this(-1, strValueOf, 0L, -1L, "", "", Extras.f32540b, 0, 0, true);
    }

    public FileRequest(int i10, String str, long j10, long j11, String str2, String str3, Extras extras, int i11, int i12, boolean z10) {
        C5207g.m11112g(str, "fileResourceId");
        C5207g.m11112g(str2, "authorization");
        C5207g.m11112g(str3, "client");
        C5207g.m11112g(extras, "extras");
        this.f32549a = i10;
        this.f32550b = str;
        this.f32551c = j10;
        this.f32552d = j11;
        this.f32553e = str2;
        this.f32554f = str3;
        this.f32555g = extras;
        this.f32556h = i11;
        this.f32557i = i12;
        this.f32558j = z10;
    }

    /* JADX INFO: renamed from: a */
    public final String m10688a() {
        StringBuilder sb2 = new StringBuilder("{\"Type\":");
        sb2.append(this.f32549a);
        sb2.append(",\"FileResourceId\":");
        sb2.append("\"" + this.f32550b + '\"');
        sb2.append(",\"Range-Start\":");
        sb2.append(this.f32551c);
        sb2.append(",\"Range-End\":");
        sb2.append(this.f32552d);
        sb2.append(",\"Authorization\":");
        sb2.append("\"" + this.f32553e + '\"');
        sb2.append(",\"Client\":");
        sb2.append("\"" + this.f32554f + '\"');
        sb2.append(",\"Extras\":");
        sb2.append(this.f32555g.m10685a());
        sb2.append(",\"Page\":");
        sb2.append(this.f32556h);
        sb2.append(",\"Size\":");
        sb2.append(this.f32557i);
        sb2.append(",\"Persist-Connection\":");
        sb2.append(this.f32558j);
        sb2.append('}');
        String string = sb2.toString();
        C5207g.m11107b(string, "builder.toString()");
        return string;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FileRequest) {
                FileRequest fileRequest = (FileRequest) obj;
                if (this.f32549a == fileRequest.f32549a && C5207g.m11106a(this.f32550b, fileRequest.f32550b) && this.f32551c == fileRequest.f32551c && this.f32552d == fileRequest.f32552d && C5207g.m11106a(this.f32553e, fileRequest.f32553e) && C5207g.m11106a(this.f32554f, fileRequest.f32554f) && C5207g.m11106a(this.f32555g, fileRequest.f32555g) && this.f32556h == fileRequest.f32556h && this.f32557i == fileRequest.f32557i && this.f32558j == fileRequest.f32558j) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public final int hashCode() {
        int i10 = this.f32549a * 31;
        int iHashCode = 0;
        String str = this.f32550b;
        int iHashCode2 = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        long j10 = this.f32551c;
        int i11 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f32552d;
        int i12 = (i11 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        String str2 = this.f32553e;
        int iHashCode3 = (i12 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f32554f;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Extras extras = this.f32555g;
        if (extras != null) {
            iHashCode = extras.hashCode();
        }
        int i13 = (((((iHashCode4 + iHashCode) * 31) + this.f32556h) * 31) + this.f32557i) * 31;
        boolean z10 = this.f32558j;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return i13 + r10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FileRequest(type=");
        sb2.append(this.f32549a);
        sb2.append(", fileResourceId=");
        sb2.append(this.f32550b);
        sb2.append(", rangeStart=");
        sb2.append(this.f32551c);
        sb2.append(", rangeEnd=");
        sb2.append(this.f32552d);
        sb2.append(", authorization=");
        sb2.append(this.f32553e);
        sb2.append(", client=");
        sb2.append(this.f32554f);
        sb2.append(", extras=");
        sb2.append(this.f32555g);
        sb2.append(", page=");
        sb2.append(this.f32556h);
        sb2.append(", size=");
        sb2.append(this.f32557i);
        sb2.append(", persistConnection=");
        return C0166e.m769p(sb2, this.f32558j, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C5207g.m11112g(parcel, "dest");
        parcel.writeInt(this.f32549a);
        parcel.writeString(this.f32550b);
        parcel.writeLong(this.f32551c);
        parcel.writeLong(this.f32552d);
        parcel.writeString(this.f32553e);
        parcel.writeString(this.f32554f);
        parcel.writeSerializable(new HashMap(C6753d.m13465R0(this.f32555g.f32541a)));
        parcel.writeInt(this.f32556h);
        parcel.writeInt(this.f32557i);
        parcel.writeInt(this.f32558j ? 1 : 0);
    }
}
