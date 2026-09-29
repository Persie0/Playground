package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;
import p000.ez5;
import p000.hfb;
import p000.uma;
import p000.ux5;
import p000.zk0;

/* JADX INFO: loaded from: classes2.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new hfb(10);

    /* JADX INFO: renamed from: a */
    public final SchemeData[] f6362a;

    /* JADX INFO: renamed from: b */
    public int f6363b;

    /* JADX INFO: renamed from: c */
    public final String f6364c;

    /* JADX INFO: renamed from: d */
    public final int f6365d;

    public DrmInitData(Parcel parcel) {
        this.f6364c = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        String str = uma.f64080a;
        this.f6362a = schemeDataArr;
        this.f6365d = schemeDataArr.length;
    }

    /* JADX INFO: renamed from: a */
    public final DrmInitData m2514a(String str) {
        return Objects.equals(this.f6364c, str) ? this : new DrmInitData(str, false, this.f6362a);
    }

    /* JADX INFO: renamed from: b */
    public final SchemeData m2515b(int i) {
        return this.f6362a[i];
    }

    @Override // java.util.Comparator
    public final int compare(SchemeData schemeData, SchemeData schemeData2) {
        SchemeData schemeData3 = schemeData;
        SchemeData schemeData4 = schemeData2;
        UUID uuid = zk0.f71668a;
        if (uuid.equals(schemeData3.f6367b)) {
            return uuid.equals(schemeData4.f6367b) ? 0 : 1;
        }
        return schemeData3.f6367b.compareTo(schemeData4.f6367b);
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
            if (Objects.equals(this.f6364c, drmInitData.f6364c) && Arrays.equals(this.f6362a, drmInitData.f6362a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f6363b == 0) {
            String str = this.f6364c;
            this.f6363b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f6362a);
        }
        return this.f6363b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6364c);
        parcel.writeTypedArray(this.f6362a, 0);
    }

    public DrmInitData(String str, boolean z, SchemeData... schemeDataArr) {
        this.f6364c = str;
        schemeDataArr = z ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.f6362a = schemeDataArr;
        this.f6365d = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new C0712a();

        /* JADX INFO: renamed from: a */
        public int f6366a;

        /* JADX INFO: renamed from: b */
        public final UUID f6367b;

        /* JADX INFO: renamed from: c */
        public final String f6368c;

        /* JADX INFO: renamed from: d */
        public final String f6369d;

        /* JADX INFO: renamed from: e */
        public final byte[] f6370e;

        public SchemeData(Parcel parcel) {
            this.f6367b = new UUID(parcel.readLong(), parcel.readLong());
            this.f6368c = parcel.readString();
            String string = parcel.readString();
            String str = uma.f64080a;
            this.f6369d = string;
            this.f6370e = parcel.createByteArray();
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
            return Objects.equals(this.f6368c, schemeData.f6368c) && Objects.equals(this.f6369d, schemeData.f6369d) && Objects.equals(this.f6367b, schemeData.f6367b) && Arrays.equals(this.f6370e, schemeData.f6370e);
        }

        public final int hashCode() {
            if (this.f6366a == 0) {
                int iHashCode = this.f6367b.hashCode() * 31;
                String str = this.f6368c;
                this.f6366a = Arrays.hashCode(this.f6370e) + ux5.m22980c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, this.f6369d, 31);
            }
            return this.f6366a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            UUID uuid = this.f6367b;
            parcel.writeLong(uuid.getMostSignificantBits());
            parcel.writeLong(uuid.getLeastSignificantBits());
            parcel.writeString(this.f6368c);
            parcel.writeString(this.f6369d);
            parcel.writeByteArray(this.f6370e);
        }

        public SchemeData(UUID uuid, String str, String str2, byte[] bArr) {
            uuid.getClass();
            this.f6367b = uuid;
            this.f6368c = str;
            str2.getClass();
            this.f6369d = ez5.m11402l(str2);
            this.f6370e = bArr;
        }
    }
}
