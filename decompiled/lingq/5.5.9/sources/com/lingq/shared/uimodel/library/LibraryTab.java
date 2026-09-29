package com.lingq.shared.uimodel.library;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/uimodel/library/LibraryTab;", "Landroid/os/Parcelable;", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class LibraryTab implements Parcelable {
    public static final Parcelable.Creator<LibraryTab> CREATOR = new C3405a();

    /* JADX INFO: renamed from: a */
    public final String f22060a;

    /* JADX INFO: renamed from: b */
    public final String f22061b;

    /* JADX INFO: renamed from: c */
    public final String f22062c;

    /* JADX INFO: renamed from: d */
    public final Boolean f22063d;

    /* JADX INFO: renamed from: e */
    public final Integer f22064e;

    /* JADX INFO: renamed from: f */
    public final String f22065f;

    /* JADX INFO: renamed from: com.lingq.shared.uimodel.library.LibraryTab$a */
    public static final class C3405a implements Parcelable.Creator<LibraryTab> {
        @Override // android.os.Parcelable.Creator
        public final LibraryTab createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            C5207g.m11111f(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new LibraryTab(boolValueOf, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), string, string2, string3, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LibraryTab[] newArray(int i10) {
            return new LibraryTab[i10];
        }
    }

    public LibraryTab(Boolean bool, Integer num, String str, String str2, String str3, String str4) {
        C5207g.m11111f(str2, "display");
        C5207g.m11111f(str4, "apiUrl");
        this.f22060a = str;
        this.f22061b = str2;
        this.f22062c = str3;
        this.f22063d = bool;
        this.f22064e = num;
        this.f22065f = str4;
    }

    public /* synthetic */ LibraryTab(String str, String str2, String str3, Boolean bool, Integer num, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 8) != 0 ? null : bool, (i10 & 16) != 0 ? null : num, (i10 & 1) != 0 ? null : str, str2, (i10 & 4) != 0 ? null : str3, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LibraryTab)) {
            return false;
        }
        LibraryTab libraryTab = (LibraryTab) obj;
        return C5207g.m11106a(this.f22060a, libraryTab.f22060a) && C5207g.m11106a(this.f22061b, libraryTab.f22061b) && C5207g.m11106a(this.f22062c, libraryTab.f22062c) && C5207g.m11106a(this.f22063d, libraryTab.f22063d) && C5207g.m11106a(this.f22064e, libraryTab.f22064e) && C5207g.m11106a(this.f22065f, libraryTab.f22065f);
    }

    public final int hashCode() {
        String str = this.f22060a;
        int iM758d = C0166e.m758d(this.f22061b, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.f22062c;
        int iHashCode = (iM758d + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f22063d;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.f22064e;
        return this.f22065f.hashCode() + ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryTab(preview=");
        sb2.append(this.f22060a);
        sb2.append(", display=");
        sb2.append(this.f22061b);
        sb2.append(", title=");
        sb2.append(this.f22062c);
        sb2.append(", selected=");
        sb2.append(this.f22063d);
        sb2.append(", level=");
        sb2.append(this.f22064e);
        sb2.append(", apiUrl=");
        return C0009a.m23l(sb2, this.f22065f, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C5207g.m11111f(parcel, "out");
        parcel.writeString(this.f22060a);
        parcel.writeString(this.f22061b);
        parcel.writeString(this.f22062c);
        int iIntValue = 0;
        Boolean bool = this.f22063d;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num = this.f22064e;
        if (num != null) {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.f22065f);
    }
}
