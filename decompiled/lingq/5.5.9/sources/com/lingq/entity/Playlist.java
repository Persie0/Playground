package com.lingq.entity;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/Playlist;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class Playlist {

    /* JADX INFO: renamed from: a */
    public final String f17349a;

    /* JADX INFO: renamed from: b */
    public final String f17350b;

    /* JADX INFO: renamed from: c */
    public final String f17351c;

    /* JADX INFO: renamed from: d */
    public final int f17352d;

    /* JADX INFO: renamed from: e */
    public final boolean f17353e;

    /* JADX INFO: renamed from: f */
    public final boolean f17354f;

    /* JADX INFO: renamed from: g */
    public final int f17355g;

    public Playlist(String str, String str2, String str3, int i10, boolean z10, boolean z11, int i11) {
        C5207g.m11111f(str, "nameWithLanguage");
        C5207g.m11111f(str2, "language");
        C5207g.m11111f(str3, "name");
        this.f17349a = str;
        this.f17350b = str2;
        this.f17351c = str3;
        this.f17352d = i10;
        this.f17353e = z10;
        this.f17354f = z11;
        this.f17355g = i11;
    }

    public /* synthetic */ Playlist(String str, String str2, String str3, int i10, boolean z10, boolean z11, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i12 & 8) != 0 ? 0 : i10, (i12 & 16) != 0 ? false : z10, (i12 & 32) != 0 ? true : z11, (i12 & 64) != 0 ? 0 : i11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Playlist)) {
            return false;
        }
        Playlist playlist = (Playlist) obj;
        if (C5207g.m11106a(this.f17349a, playlist.f17349a) && C5207g.m11106a(this.f17350b, playlist.f17350b) && C5207g.m11106a(this.f17351c, playlist.f17351c) && this.f17352d == playlist.f17352d && this.f17353e == playlist.f17353e && this.f17354f == playlist.f17354f && this.f17355g == playlist.f17355g) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    public final int hashCode() {
        int iM16d = C0009a.m16d(this.f17352d, C0166e.m758d(this.f17351c, C0166e.m758d(this.f17350b, this.f17349a.hashCode() * 31, 31), 31), 31);
        boolean z10 = this.f17353e;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iM16d + r10) * 31;
        boolean z11 = this.f17354f;
        return Integer.hashCode(this.f17355g) + ((i10 + (z11 ? 1 : z11)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Playlist(nameWithLanguage=");
        sb2.append(this.f17349a);
        sb2.append(", language=");
        sb2.append(this.f17350b);
        sb2.append(", name=");
        sb2.append(this.f17351c);
        sb2.append(", pk=");
        sb2.append(this.f17352d);
        sb2.append(", isDefault=");
        sb2.append(this.f17353e);
        sb2.append(", isFeatured=");
        sb2.append(this.f17354f);
        sb2.append(", order=");
        return C0166e.m768o(sb2, this.f17355g, ")");
    }
}
