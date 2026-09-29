package com.lingq.shared.download;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/download/DownloadItem;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class DownloadItem {

    /* JADX INFO: renamed from: a */
    public final String f17865a;

    /* JADX INFO: renamed from: b */
    public final int f17866b;

    /* JADX INFO: renamed from: c */
    public final String f17867c;

    /* JADX INFO: renamed from: d */
    public final boolean f17868d;

    public DownloadItem(String str, int i10, String str2, boolean z10) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "audioUrl");
        this.f17865a = str;
        this.f17866b = i10;
        this.f17867c = str2;
        this.f17868d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadItem)) {
            return false;
        }
        DownloadItem downloadItem = (DownloadItem) obj;
        return C5207g.m11106a(this.f17865a, downloadItem.f17865a) && this.f17866b == downloadItem.f17866b && C5207g.m11106a(this.f17867c, downloadItem.f17867c) && this.f17868d == downloadItem.f17868d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f17867c, C0009a.m16d(this.f17866b, this.f17865a.hashCode() * 31, 31), 31);
        boolean z10 = this.f17868d;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iM758d + r10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DownloadItem(language=");
        sb2.append(this.f17865a);
        sb2.append(", lessonId=");
        sb2.append(this.f17866b);
        sb2.append(", audioUrl=");
        sb2.append(this.f17867c);
        sb2.append(", isDownloaded=");
        return C0166e.m769p(sb2, this.f17868d, ")");
    }
}
