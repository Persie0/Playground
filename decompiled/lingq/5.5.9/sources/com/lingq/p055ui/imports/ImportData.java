package com.lingq.p055ui.imports;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/ui/imports/ImportData;", "Landroid/os/Parcelable;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ImportData implements Parcelable {
    public static final Parcelable.Creator<ImportData> CREATOR = new C4084a();

    /* JADX INFO: renamed from: a */
    public final String f26551a;

    /* JADX INFO: renamed from: b */
    public final String f26552b;

    /* JADX INFO: renamed from: c */
    public final String f26553c;

    /* JADX INFO: renamed from: com.lingq.ui.imports.ImportData$a */
    public static final class C4084a implements Parcelable.Creator<ImportData> {
        @Override // android.os.Parcelable.Creator
        public final ImportData createFromParcel(Parcel parcel) {
            C5207g.m11111f(parcel, "parcel");
            return new ImportData(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ImportData[] newArray(int i10) {
            return new ImportData[i10];
        }
    }

    public ImportData() {
        this(null, null, null, 7, null);
    }

    public ImportData(String str, String str2, String str3) {
        this.f26551a = str;
        this.f26552b = str2;
        this.f26553c = str3;
    }

    public /* synthetic */ ImportData(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImportData)) {
            return false;
        }
        ImportData importData = (ImportData) obj;
        return C5207g.m11106a(this.f26551a, importData.f26551a) && C5207g.m11106a(this.f26552b, importData.f26552b) && C5207g.m11106a(this.f26553c, importData.f26553c);
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f26551a;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f26552b;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f26553c;
        if (str3 != null) {
            iHashCode = str3.hashCode();
        }
        return iHashCode3 + iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImportData(title=");
        sb2.append(this.f26551a);
        sb2.append(", url=");
        sb2.append(this.f26552b);
        sb2.append(", imageUri=");
        return C0009a.m23l(sb2, this.f26553c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C5207g.m11111f(parcel, "out");
        parcel.writeString(this.f26551a);
        parcel.writeString(this.f26552b);
        parcel.writeString(this.f26553c);
    }
}
