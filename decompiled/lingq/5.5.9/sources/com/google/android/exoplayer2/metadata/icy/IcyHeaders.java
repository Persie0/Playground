package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.C0141b;
import com.google.android.exoplayer2.C2467q;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.List;
import java.util.Map;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10145n;

/* JADX INFO: loaded from: classes.dex */
public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator<IcyHeaders> CREATOR = new C2436a();

    /* JADX INFO: renamed from: a */
    public final int f12659a;

    /* JADX INFO: renamed from: b */
    public final String f12660b;

    /* JADX INFO: renamed from: c */
    public final String f12661c;

    /* JADX INFO: renamed from: d */
    public final String f12662d;

    /* JADX INFO: renamed from: e */
    public final boolean f12663e;

    /* JADX INFO: renamed from: f */
    public final int f12664f;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.icy.IcyHeaders$a */
    public class C2436a implements Parcelable.Creator<IcyHeaders> {
        @Override // android.os.Parcelable.Creator
        public final IcyHeaders createFromParcel(Parcel parcel) {
            return new IcyHeaders(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final IcyHeaders[] newArray(int i10) {
            return new IcyHeaders[i10];
        }
    }

    public IcyHeaders(int i10, int i11, String str, String str2, String str3, boolean z10) {
        C10129a.m18990b(i11 == -1 || i11 > 0);
        this.f12659a = i10;
        this.f12660b = str;
        this.f12661c = str2;
        this.f12662d = str3;
        this.f12663e = z10;
        this.f12664f = i11;
    }

    public IcyHeaders(Parcel parcel) {
        this.f12659a = parcel.readInt();
        this.f12660b = parcel.readString();
        this.f12661c = parcel.readString();
        this.f12662d = parcel.readString();
        int i10 = C10134c0.f51354a;
        this.f12663e = parcel.readInt() != 0;
        this.f12664f = parcel.readInt();
    }

    /* JADX INFO: renamed from: a */
    public static IcyHeaders m7210a(Map<String, List<String>> map) {
        boolean z10;
        int i10;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i11;
        List<String> list = map.get("icy-br");
        boolean z11 = true;
        int i12 = -1;
        if (list != null) {
            String str4 = list.get(0);
            try {
                i11 = Integer.parseInt(str4) * 1000;
                if (i11 > 0) {
                    z10 = true;
                } else {
                    try {
                        C10145n.m19099g("IcyHeaders", "Invalid bitrate: " + str4);
                        z10 = false;
                        i11 = -1;
                    } catch (NumberFormatException unused) {
                        C0141b.m622r("Invalid bitrate header: ", str4, "IcyHeaders");
                        z10 = false;
                    }
                }
            } catch (NumberFormatException unused2) {
                i11 = -1;
            }
            i10 = i11;
        } else {
            z10 = false;
            i10 = -1;
        }
        List<String> list2 = map.get("icy-genre");
        if (list2 != null) {
            str = list2.get(0);
            z10 = true;
        } else {
            str = null;
        }
        List<String> list3 = map.get("icy-name");
        if (list3 != null) {
            str2 = list3.get(0);
            z10 = true;
        } else {
            str2 = null;
        }
        List<String> list4 = map.get("icy-url");
        if (list4 != null) {
            str3 = list4.get(0);
            z10 = true;
        } else {
            str3 = null;
        }
        List<String> list5 = map.get("icy-pub");
        if (list5 != null) {
            zEquals = list5.get(0).equals("1");
            z10 = true;
        } else {
            zEquals = false;
        }
        List<String> list6 = map.get("icy-metaint");
        if (list6 != null) {
            String str5 = list6.get(0);
            try {
                int i13 = Integer.parseInt(str5);
                if (i13 > 0) {
                    i12 = i13;
                } else {
                    try {
                        C10145n.m19099g("IcyHeaders", "Invalid metadata interval: " + str5);
                        z11 = z10;
                    } catch (NumberFormatException unused3) {
                        i12 = i13;
                        C0141b.m622r("Invalid metadata interval: ", str5, "IcyHeaders");
                    }
                }
                z10 = z11;
            } catch (NumberFormatException unused4) {
            }
        }
        int i14 = i12;
        if (z10) {
            return new IcyHeaders(i10, i14, str, str2, str3, zEquals);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyHeaders.class != obj.getClass()) {
            return false;
        }
        IcyHeaders icyHeaders = (IcyHeaders) obj;
        return this.f12659a == icyHeaders.f12659a && C10134c0.m19034a(this.f12660b, icyHeaders.f12660b) && C10134c0.m19034a(this.f12661c, icyHeaders.f12661c) && C10134c0.m19034a(this.f12662d, icyHeaders.f12662d) && this.f12663e == icyHeaders.f12663e && this.f12664f == icyHeaders.f12664f;
    }

    public final int hashCode() {
        int i10 = (527 + this.f12659a) * 31;
        String str = this.f12660b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12661c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12662d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f12663e ? 1 : 0)) * 31) + this.f12664f;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    /* JADX INFO: renamed from: s */
    public final void mo7206s(C2467q.a aVar) {
        String str = this.f12661c;
        if (str != null) {
            aVar.f12944E = str;
        }
        String str2 = this.f12660b;
        if (str2 != null) {
            aVar.f12942C = str2;
        }
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f12661c + "\", genre=\"" + this.f12660b + "\", bitrate=" + this.f12659a + ", metadataInterval=" + this.f12664f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f12659a);
        parcel.writeString(this.f12660b);
        parcel.writeString(this.f12661c);
        parcel.writeString(this.f12662d);
        int i11 = C10134c0.f51354a;
        parcel.writeInt(this.f12663e ? 1 : 0);
        parcel.writeInt(this.f12664f);
    }
}
