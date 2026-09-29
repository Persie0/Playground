package com.lingq.shared.network.result;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.MediaSource;
import dm.C5207g;
import kotlin.Metadata;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/result/FastSearchResult;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class FastSearchResult {

    /* JADX INFO: renamed from: a */
    public final int f18255a;

    /* JADX INFO: renamed from: b */
    public final String f18256b;

    /* JADX INFO: renamed from: c */
    public final String f18257c;

    /* JADX INFO: renamed from: d */
    public final String f18258d;

    /* JADX INFO: renamed from: e */
    public final Boolean f18259e;

    /* JADX INFO: renamed from: f */
    public final String f18260f;

    /* JADX INFO: renamed from: g */
    public final MediaSource f18261g;

    public FastSearchResult(int i10, String str, String str2, String str3, Boolean bool, String str4, MediaSource mediaSource) {
        this.f18255a = i10;
        this.f18256b = str;
        this.f18257c = str2;
        this.f18258d = str3;
        this.f18259e = bool;
        this.f18260f = str4;
        this.f18261g = mediaSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FastSearchResult)) {
            return false;
        }
        FastSearchResult fastSearchResult = (FastSearchResult) obj;
        if (this.f18255a == fastSearchResult.f18255a && C5207g.m11106a(this.f18256b, fastSearchResult.f18256b) && C5207g.m11106a(this.f18257c, fastSearchResult.f18257c) && C5207g.m11106a(this.f18258d, fastSearchResult.f18258d) && C5207g.m11106a(this.f18259e, fastSearchResult.f18259e) && C5207g.m11106a(this.f18260f, fastSearchResult.f18260f) && C5207g.m11106a(this.f18261g, fastSearchResult.f18261g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f18258d, C0166e.m758d(this.f18257c, C0166e.m758d(this.f18256b, Integer.hashCode(this.f18255a) * 31, 31), 31), 31);
        int iHashCode = 0;
        Boolean bool = this.f18259e;
        int iHashCode2 = (iM758d + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f18260f;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        MediaSource mediaSource = this.f18261g;
        if (mediaSource != null) {
            iHashCode = mediaSource.hashCode();
        }
        return iHashCode3 + iHashCode;
    }

    public final String toString() {
        return "FastSearchResult(id=" + this.f18255a + ", title=" + this.f18256b + ", type=" + this.f18257c + ", imageUrl=" + this.f18258d + ", isTaken=" + this.f18259e + ", status=" + this.f18260f + ", source=" + this.f18261g + ")";
    }
}
