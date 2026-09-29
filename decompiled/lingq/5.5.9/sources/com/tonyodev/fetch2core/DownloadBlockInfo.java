package com.tonyodev.fetch2core;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.TypeCastException;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m13365d2 = {"Lcom/tonyodev/fetch2core/DownloadBlockInfo;", "", "<init>", "()V", "CREATOR", "a", "fetch2core_release"}, m13366k = 1, m13367mv = {1, 4, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class DownloadBlockInfo implements Parcelable, Serializable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a */
    public int f32516a = -1;

    /* JADX INFO: renamed from: b */
    public int f32517b = -1;

    /* JADX INFO: renamed from: c */
    public long f32518c = -1;

    /* JADX INFO: renamed from: d */
    public long f32519d = -1;

    /* JADX INFO: renamed from: e */
    public long f32520e = -1;

    /* JADX INFO: renamed from: com.tonyodev.fetch2core.DownloadBlockInfo$a, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<DownloadBlockInfo> {
        @Override // android.os.Parcelable.Creator
        public final DownloadBlockInfo createFromParcel(Parcel parcel) {
            C5207g.m11112g(parcel, "source");
            DownloadBlockInfo downloadBlockInfo = new DownloadBlockInfo();
            downloadBlockInfo.f32516a = parcel.readInt();
            downloadBlockInfo.f32517b = parcel.readInt();
            downloadBlockInfo.f32518c = parcel.readLong();
            downloadBlockInfo.f32519d = parcel.readLong();
            downloadBlockInfo.f32520e = parcel.readLong();
            return downloadBlockInfo;
        }

        @Override // android.os.Parcelable.Creator
        public final DownloadBlockInfo[] newArray(int i10) {
            return new DownloadBlockInfo[i10];
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10667a(int i10) {
        this.f32517b = i10;
    }

    /* JADX INFO: renamed from: b */
    public final void m10668b(int i10) {
        this.f32516a = i10;
    }

    /* JADX INFO: renamed from: c */
    public final void m10669c(long j10) {
        this.f32520e = j10;
    }

    /* JADX INFO: renamed from: d */
    public final void m10670d(long j10) {
        this.f32519d = j10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m10671e(long j10) {
        this.f32518c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C5207g.m11106a(DownloadBlockInfo.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tonyodev.fetch2core.DownloadBlockInfo");
        }
        DownloadBlockInfo downloadBlockInfo = (DownloadBlockInfo) obj;
        return this.f32516a == downloadBlockInfo.f32516a && this.f32517b == downloadBlockInfo.f32517b && this.f32518c == downloadBlockInfo.f32518c && this.f32519d == downloadBlockInfo.f32519d && this.f32520e == downloadBlockInfo.f32520e;
    }

    public final int hashCode() {
        return Long.valueOf(this.f32520e).hashCode() + ((Long.valueOf(this.f32519d).hashCode() + ((Long.valueOf(this.f32518c).hashCode() + (((this.f32516a * 31) + this.f32517b) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DownloadBlock(downloadId=" + this.f32516a + ", blockPosition=" + this.f32517b + ", startByte=" + this.f32518c + ", endByte=" + this.f32519d + ", downloadedBytes=" + this.f32520e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C5207g.m11112g(parcel, "dest");
        parcel.writeInt(this.f32516a);
        parcel.writeInt(this.f32517b);
        parcel.writeLong(this.f32518c);
        parcel.writeLong(this.f32519d);
        parcel.writeLong(this.f32520e);
    }
}
