package com.lingq.shared.uimodel.playlist;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/uimodel/playlist/UserPlaylist;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class UserPlaylist {

    /* JADX INFO: renamed from: a */
    public final String f22077a;

    /* JADX INFO: renamed from: b */
    public final String f22078b;

    /* JADX INFO: renamed from: c */
    public final String f22079c;

    /* JADX INFO: renamed from: d */
    public final int f22080d;

    /* JADX INFO: renamed from: e */
    public final boolean f22081e;

    /* JADX INFO: renamed from: f */
    public final boolean f22082f;

    public UserPlaylist() {
        this(null, null, null, 0, false, false, 63, null);
    }

    public UserPlaylist(String str, String str2, String str3, int i10, boolean z10, boolean z11) {
        C5207g.m11111f(str, "nameWithLanguage");
        C5207g.m11111f(str2, "language");
        C5207g.m11111f(str3, "name");
        this.f22077a = str;
        this.f22078b = str2;
        this.f22079c = str3;
        this.f22080d = i10;
        this.f22081e = z10;
        this.f22082f = z11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ UserPlaylist(String str, String str2, String str3, int i10, boolean z10, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        String str4 = "";
        String str5 = (i11 & 1) != 0 ? str4 : str;
        String str6 = (i11 & 2) != 0 ? str4 : str2;
        if ((i11 & 4) == 0) {
            str4 = str3;
        }
        this(str5, str6, str4, (i11 & 8) != 0 ? 0 : i10, (i11 & 16) != 0 ? false : z10, (i11 & 32) != 0 ? true : z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserPlaylist)) {
            return false;
        }
        UserPlaylist userPlaylist = (UserPlaylist) obj;
        return C5207g.m11106a(this.f22077a, userPlaylist.f22077a) && C5207g.m11106a(this.f22078b, userPlaylist.f22078b) && C5207g.m11106a(this.f22079c, userPlaylist.f22079c) && this.f22080d == userPlaylist.f22080d && this.f22081e == userPlaylist.f22081e && this.f22082f == userPlaylist.f22082f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    public final int hashCode() {
        int iM16d = C0009a.m16d(this.f22080d, C0166e.m758d(this.f22079c, C0166e.m758d(this.f22078b, this.f22077a.hashCode() * 31, 31), 31), 31);
        ?? r10 = 1;
        boolean z10 = this.f22081e;
        ?? r11 = z10;
        if (z10) {
            r11 = 1;
        }
        int i10 = (iM16d + r11) * 31;
        boolean z11 = this.f22082f;
        if (!z11) {
            r10 = z11;
        }
        return i10 + r10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserPlaylist(nameWithLanguage=");
        sb2.append(this.f22077a);
        sb2.append(", language=");
        sb2.append(this.f22078b);
        sb2.append(", name=");
        sb2.append(this.f22079c);
        sb2.append(", pk=");
        sb2.append(this.f22080d);
        sb2.append(", isDefault=");
        sb2.append(this.f22081e);
        sb2.append(", isFeatured=");
        return C0166e.m769p(sb2, this.f22082f, ")");
    }
}
