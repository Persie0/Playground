package com.lingq.shared.uimodel.library;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/uimodel/library/LibraryShelf;", "Landroid/os/Parcelable;", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class LibraryShelf implements Parcelable {
    public static final Parcelable.Creator<LibraryShelf> CREATOR = new C3404a();

    /* JADX INFO: renamed from: a */
    public final boolean f22048a;

    /* JADX INFO: renamed from: b */
    public final List<LibraryTab> f22049b;

    /* JADX INFO: renamed from: c */
    public final String f22050c;

    /* JADX INFO: renamed from: d */
    public final int f22051d;

    /* JADX INFO: renamed from: e */
    public final String f22052e;

    /* JADX INFO: renamed from: f */
    public final int f22053f;

    /* JADX INFO: renamed from: com.lingq.shared.uimodel.library.LibraryShelf$a */
    public static final class C3404a implements Parcelable.Creator<LibraryShelf> {
        @Override // android.os.Parcelable.Creator
        public final LibraryShelf createFromParcel(Parcel parcel) {
            C5207g.m11111f(parcel, "parcel");
            boolean z10 = parcel.readInt() != 0;
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(LibraryTab.CREATOR.createFromParcel(parcel));
            }
            return new LibraryShelf(z10, arrayList, parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final LibraryShelf[] newArray(int i10) {
            return new LibraryShelf[i10];
        }
    }

    public LibraryShelf(boolean z10, List<LibraryTab> list, String str, int i10, String str2, int i11) {
        C5207g.m11111f(list, "tabs");
        C5207g.m11111f(str, "code");
        C5207g.m11111f(str2, "title");
        this.f22048a = z10;
        this.f22049b = list;
        this.f22050c = str;
        this.f22051d = i10;
        this.f22052e = str2;
        this.f22053f = i11;
    }

    public LibraryShelf(boolean z10, List list, String str, int i10, String str2, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? false : z10, (i12 & 2) != 0 ? EmptyList.f38032a : list, str, (i12 & 8) != 0 ? -1 : i10, (i12 & 16) != 0 ? "Search" : str2, (i12 & 32) != 0 ? 0 : i11);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LibraryShelf)) {
            return false;
        }
        LibraryShelf libraryShelf = (LibraryShelf) obj;
        return this.f22048a == libraryShelf.f22048a && C5207g.m11106a(this.f22049b, libraryShelf.f22049b) && C5207g.m11106a(this.f22050c, libraryShelf.f22050c) && this.f22051d == libraryShelf.f22051d && C5207g.m11106a(this.f22052e, libraryShelf.f22052e) && this.f22053f == libraryShelf.f22053f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final int hashCode() {
        boolean z10 = this.f22048a;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return Integer.hashCode(this.f22053f) + C0166e.m758d(this.f22052e, C0009a.m16d(this.f22051d, C0166e.m758d(this.f22050c, C0204c.m848g(this.f22049b, r10 * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryShelf(pinned=");
        sb2.append(this.f22048a);
        sb2.append(", tabs=");
        sb2.append(this.f22049b);
        sb2.append(", code=");
        sb2.append(this.f22050c);
        sb2.append(", id=");
        sb2.append(this.f22051d);
        sb2.append(", title=");
        sb2.append(this.f22052e);
        sb2.append(", order=");
        return C0166e.m768o(sb2, this.f22053f, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C5207g.m11111f(parcel, "out");
        parcel.writeInt(this.f22048a ? 1 : 0);
        List<LibraryTab> list = this.f22049b;
        parcel.writeInt(list.size());
        Iterator<LibraryTab> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i10);
        }
        parcel.writeString(this.f22050c);
        parcel.writeInt(this.f22051d);
        parcel.writeString(this.f22052e);
        parcel.writeInt(this.f22053f);
    }
}
