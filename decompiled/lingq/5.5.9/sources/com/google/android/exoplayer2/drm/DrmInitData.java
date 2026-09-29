package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;
import p150h9.C5903b;
import p479xa.C10134c0;

/* JADX INFO: loaded from: classes.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new C2396a();

    /* JADX INFO: renamed from: a */
    public final SchemeData[] f12186a;

    /* JADX INFO: renamed from: b */
    public int f12187b;

    /* JADX INFO: renamed from: c */
    public final String f12188c;

    /* JADX INFO: renamed from: d */
    public final int f12189d;

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new C2395a();

        /* JADX INFO: renamed from: a */
        public int f12190a;

        /* JADX INFO: renamed from: b */
        public final UUID f12191b;

        /* JADX INFO: renamed from: c */
        public final String f12192c;

        /* JADX INFO: renamed from: d */
        public final String f12193d;

        /* JADX INFO: renamed from: e */
        public final byte[] f12194e;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.DrmInitData$SchemeData$a */
        public class C2395a implements Parcelable.Creator<SchemeData> {
            @Override // android.os.Parcelable.Creator
            public final SchemeData createFromParcel(Parcel parcel) {
                return new SchemeData(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SchemeData[] newArray(int i10) {
                return new SchemeData[i10];
            }
        }

        public SchemeData() {
            throw null;
        }

        public SchemeData(Parcel parcel) {
            this.f12191b = new UUID(parcel.readLong(), parcel.readLong());
            this.f12192c = parcel.readString();
            String string = parcel.readString();
            int i10 = C10134c0.f51354a;
            this.f12193d = string;
            this.f12194e = parcel.createByteArray();
        }

        public SchemeData(UUID uuid, String str, String str2, byte[] bArr) {
            uuid.getClass();
            this.f12191b = uuid;
            this.f12192c = str;
            str2.getClass();
            this.f12193d = str2;
            this.f12194e = bArr;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m6957a(UUID uuid) {
            UUID uuid2 = C5903b.f35258a;
            UUID uuid3 = this.f12191b;
            if (!uuid2.equals(uuid3) && !uuid.equals(uuid3)) {
                return false;
            }
            return true;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return C10134c0.m19034a(this.f12192c, schemeData.f12192c) && C10134c0.m19034a(this.f12193d, schemeData.f12193d) && C10134c0.m19034a(this.f12191b, schemeData.f12191b) && Arrays.equals(this.f12194e, schemeData.f12194e);
        }

        public final int hashCode() {
            if (this.f12190a == 0) {
                int iHashCode = this.f12191b.hashCode() * 31;
                String str = this.f12192c;
                this.f12190a = Arrays.hashCode(this.f12194e) + C0166e.m758d(this.f12193d, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            }
            return this.f12190a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            UUID uuid = this.f12191b;
            parcel.writeLong(uuid.getMostSignificantBits());
            parcel.writeLong(uuid.getLeastSignificantBits());
            parcel.writeString(this.f12192c);
            parcel.writeString(this.f12193d);
            parcel.writeByteArray(this.f12194e);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.DrmInitData$a */
    public class C2396a implements Parcelable.Creator<DrmInitData> {
        @Override // android.os.Parcelable.Creator
        public final DrmInitData createFromParcel(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DrmInitData[] newArray(int i10) {
            return new DrmInitData[i10];
        }
    }

    public DrmInitData() {
        throw null;
    }

    public DrmInitData(Parcel parcel) {
        this.f12188c = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        int i10 = C10134c0.f51354a;
        this.f12186a = schemeDataArr;
        this.f12189d = schemeDataArr.length;
    }

    public DrmInitData(String str, boolean z10, SchemeData... schemeDataArr) {
        this.f12188c = str;
        schemeDataArr = z10 ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.f12186a = schemeDataArr;
        this.f12189d = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    /* JADX INFO: renamed from: a */
    public final DrmInitData m6956a(String str) {
        return C10134c0.m19034a(this.f12188c, str) ? this : new DrmInitData(str, false, this.f12186a);
    }

    @Override // java.util.Comparator
    public final int compare(SchemeData schemeData, SchemeData schemeData2) {
        SchemeData schemeData3 = schemeData;
        SchemeData schemeData4 = schemeData2;
        UUID uuid = C5903b.f35258a;
        if (uuid.equals(schemeData3.f12191b)) {
            return uuid.equals(schemeData4.f12191b) ? 0 : 1;
        }
        return schemeData3.f12191b.compareTo(schemeData4.f12191b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DrmInitData.class == obj.getClass()) {
            DrmInitData drmInitData = (DrmInitData) obj;
            return C10134c0.m19034a(this.f12188c, drmInitData.f12188c) && Arrays.equals(this.f12186a, drmInitData.f12186a);
        }
        return false;
    }

    public final int hashCode() {
        if (this.f12187b == 0) {
            String str = this.f12188c;
            this.f12187b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f12186a);
        }
        return this.f12187b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12188c);
        parcel.writeTypedArray(this.f12186a, 0);
    }
}
