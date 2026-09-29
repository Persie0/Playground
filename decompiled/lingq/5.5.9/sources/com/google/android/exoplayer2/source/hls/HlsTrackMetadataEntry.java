package com.google.android.exoplayer2.source.hls;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.activity.result.C0204c;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p003a2.C0009a;

/* JADX INFO: loaded from: classes.dex */
public final class HlsTrackMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<HlsTrackMetadataEntry> CREATOR = new C2483a();

    /* JADX INFO: renamed from: a */
    public final String f13133a;

    /* JADX INFO: renamed from: b */
    public final String f13134b;

    /* JADX INFO: renamed from: c */
    public final List<VariantInfo> f13135c;

    public static final class VariantInfo implements Parcelable {
        public static final Parcelable.Creator<VariantInfo> CREATOR = new C2482a();

        /* JADX INFO: renamed from: a */
        public final int f13136a;

        /* JADX INFO: renamed from: b */
        public final int f13137b;

        /* JADX INFO: renamed from: c */
        public final String f13138c;

        /* JADX INFO: renamed from: d */
        public final String f13139d;

        /* JADX INFO: renamed from: e */
        public final String f13140e;

        /* JADX INFO: renamed from: f */
        public final String f13141f;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry$VariantInfo$a */
        public class C2482a implements Parcelable.Creator<VariantInfo> {
            @Override // android.os.Parcelable.Creator
            public final VariantInfo createFromParcel(Parcel parcel) {
                return new VariantInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final VariantInfo[] newArray(int i10) {
                return new VariantInfo[i10];
            }
        }

        public VariantInfo(int i10, int i11, String str, String str2, String str3, String str4) {
            this.f13136a = i10;
            this.f13137b = i11;
            this.f13138c = str;
            this.f13139d = str2;
            this.f13140e = str3;
            this.f13141f = str4;
        }

        public VariantInfo(Parcel parcel) {
            this.f13136a = parcel.readInt();
            this.f13137b = parcel.readInt();
            this.f13138c = parcel.readString();
            this.f13139d = parcel.readString();
            this.f13140e = parcel.readString();
            this.f13141f = parcel.readString();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && VariantInfo.class == obj.getClass()) {
                VariantInfo variantInfo = (VariantInfo) obj;
                return this.f13136a == variantInfo.f13136a && this.f13137b == variantInfo.f13137b && TextUtils.equals(this.f13138c, variantInfo.f13138c) && TextUtils.equals(this.f13139d, variantInfo.f13139d) && TextUtils.equals(this.f13140e, variantInfo.f13140e) && TextUtils.equals(this.f13141f, variantInfo.f13141f);
            }
            return false;
        }

        public final int hashCode() {
            int i10 = ((this.f13136a * 31) + this.f13137b) * 31;
            int iHashCode = 0;
            String str = this.f13138c;
            int iHashCode2 = (i10 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f13139d;
            int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f13140e;
            int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f13141f;
            if (str4 != null) {
                iHashCode = str4.hashCode();
            }
            return iHashCode4 + iHashCode;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f13136a);
            parcel.writeInt(this.f13137b);
            parcel.writeString(this.f13138c);
            parcel.writeString(this.f13139d);
            parcel.writeString(this.f13140e);
            parcel.writeString(this.f13141f);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry$a */
    public class C2483a implements Parcelable.Creator<HlsTrackMetadataEntry> {
        @Override // android.os.Parcelable.Creator
        public final HlsTrackMetadataEntry createFromParcel(Parcel parcel) {
            return new HlsTrackMetadataEntry(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final HlsTrackMetadataEntry[] newArray(int i10) {
            return new HlsTrackMetadataEntry[i10];
        }
    }

    public HlsTrackMetadataEntry(Parcel parcel) {
        this.f13133a = parcel.readString();
        this.f13134b = parcel.readString();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add((VariantInfo) parcel.readParcelable(VariantInfo.class.getClassLoader()));
        }
        this.f13135c = Collections.unmodifiableList(arrayList);
    }

    public HlsTrackMetadataEntry(String str, String str2, List<VariantInfo> list) {
        this.f13133a = str;
        this.f13134b = str2;
        this.f13135c = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && HlsTrackMetadataEntry.class == obj.getClass()) {
            HlsTrackMetadataEntry hlsTrackMetadataEntry = (HlsTrackMetadataEntry) obj;
            return TextUtils.equals(this.f13133a, hlsTrackMetadataEntry.f13133a) && TextUtils.equals(this.f13134b, hlsTrackMetadataEntry.f13134b) && this.f13135c.equals(hlsTrackMetadataEntry.f13135c);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f13133a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f13134b;
        return this.f13135c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HlsTrackMetadataEntry");
        String str = this.f13133a;
        sb2.append(str != null ? C0009a.m23l(C0204c.m854m(" [", str, ", "), this.f13134b, "]") : "");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f13133a);
        parcel.writeString(this.f13134b);
        List<VariantInfo> list = this.f13135c;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeParcelable(list.get(i11), 0);
        }
    }
}
