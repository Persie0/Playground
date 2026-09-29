package com.lingq.shared.network.result;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultPlaylistFolder;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ResultPlaylistFolder {

    /* JADX INFO: renamed from: a */
    public final int f18887a;

    /* JADX INFO: renamed from: b */
    public final String f18888b;

    /* JADX INFO: renamed from: c */
    public final boolean f18889c;

    /* JADX INFO: renamed from: d */
    public final boolean f18890d;

    public /* synthetic */ ResultPlaylistFolder(int i10, String str, boolean z10, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 1) != 0 ? 0 : i10, (i11 & 4) != 0 ? false : z10, (i11 & 8) != 0 ? true : z11);
    }

    public ResultPlaylistFolder(String str, int i10, boolean z10, boolean z11) {
        C5207g.m11111f(str, "title");
        this.f18887a = i10;
        this.f18888b = str;
        this.f18889c = z10;
        this.f18890d = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultPlaylistFolder)) {
            return false;
        }
        ResultPlaylistFolder resultPlaylistFolder = (ResultPlaylistFolder) obj;
        return this.f18887a == resultPlaylistFolder.f18887a && C5207g.m11106a(this.f18888b, resultPlaylistFolder.f18888b) && this.f18889c == resultPlaylistFolder.f18889c && this.f18890d == resultPlaylistFolder.f18890d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f18888b, Integer.hashCode(this.f18887a) * 31, 31);
        ?? r10 = 1;
        boolean z10 = this.f18889c;
        ?? r11 = z10;
        if (z10) {
            r11 = 1;
        }
        int i10 = (iM758d + r11) * 31;
        boolean z11 = this.f18890d;
        if (!z11) {
            r10 = z11;
        }
        return i10 + r10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResultPlaylistFolder(pk=");
        sb2.append(this.f18887a);
        sb2.append(", title=");
        sb2.append(this.f18888b);
        sb2.append(", isDefault=");
        sb2.append(this.f18889c);
        sb2.append(", isFeatured=");
        return C0166e.m769p(sb2, this.f18890d, ")");
    }
}
