package com.lingq.core.navigation.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import p000.C3670v2;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.ux5;
import p000.wq1;
import p000.y52;

/* JADX INFO: loaded from: classes.dex */
public final class LibraryShelfNavArg implements Parcelable {
    public static final Parcelable.Creator<LibraryShelfNavArg> CREATOR = new C3670v2(4);

    /* JADX INFO: renamed from: a */
    public final boolean f20277a;

    /* JADX INFO: renamed from: b */
    public final boolean f20278b;

    /* JADX INFO: renamed from: c */
    public final List f20279c;

    /* JADX INFO: renamed from: d */
    public final String f20280d;

    /* JADX INFO: renamed from: e */
    public final int f20281e;

    /* JADX INFO: renamed from: f */
    public final String f20282f;

    /* JADX INFO: renamed from: g */
    public final int f20283g;

    /* JADX INFO: renamed from: h */
    public final String f20284h;

    public /* synthetic */ LibraryShelfNavArg(boolean z, boolean z2, List list, String str, int i, String str2, int i2, String str3, int i3, y52 y52Var) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? false : z2, (i3 & 4) != 0 ? EmptyList.f47638a : list, str, (i3 & 16) != 0 ? -1 : i, (i3 & 32) != 0 ? "Search" : str2, (i3 & 64) != 0 ? 0 : i2, (i3 & 128) != 0 ? "Search" : str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LibraryShelfNavArg)) {
            return false;
        }
        LibraryShelfNavArg libraryShelfNavArg = (LibraryShelfNavArg) obj;
        return this.f20277a == libraryShelfNavArg.f20277a && this.f20278b == libraryShelfNavArg.f20278b && fa4.m11650l(this.f20279c, libraryShelfNavArg.f20279c) && fa4.m11650l(this.f20280d, libraryShelfNavArg.f20280d) && this.f20281e == libraryShelfNavArg.f20281e && fa4.m11650l(this.f20282f, libraryShelfNavArg.f20282f) && this.f20283g == libraryShelfNavArg.f20283g && fa4.m11650l(this.f20284h, libraryShelfNavArg.f20284h);
    }

    public final int hashCode() {
        return this.f20284h.hashCode() + wq1.m24106b(this.f20283g, ux5.m22980c(wq1.m24106b(this.f20281e, ux5.m22980c(ux5.m22979b(g9a.m12428e(Boolean.hashCode(this.f20277a) * 31, 31, this.f20278b), 31, this.f20279c), this.f20280d, 31), 31), this.f20282f, 31), 31);
    }

    public final String toString() {
        StringBuilder sbM13357g = hn1.m13357g("LibraryShelfNavArg(pinned=", ", pinnedHard=", ", tabs=", this.f20277a, this.f20278b);
        wq1.m24130z(", code=", this.f20280d, ", id=", sbM13357g, this.f20279c);
        hn1.m13361k(this.f20281e, ", title=", this.f20282f, ", order=", sbM13357g);
        sbM13357g.append(this.f20283g);
        sbM13357g.append(", originalTitle=");
        sbM13357g.append(this.f20284h);
        sbM13357g.append(")");
        return sbM13357g.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.f20277a ? 1 : 0);
        parcel.writeInt(this.f20278b ? 1 : 0);
        List list = this.f20279c;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((LibraryTabNavArg) it.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.f20280d);
        parcel.writeInt(this.f20281e);
        parcel.writeString(this.f20282f);
        parcel.writeInt(this.f20283g);
        parcel.writeString(this.f20284h);
    }

    public LibraryShelfNavArg(boolean z, boolean z2, List list, String str, int i, String str2, int i2, String str3) {
        list.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.f20277a = z;
        this.f20278b = z2;
        this.f20279c = list;
        this.f20280d = str;
        this.f20281e = i;
        this.f20282f = str2;
        this.f20283g = i2;
        this.f20284h = str3;
    }
}
