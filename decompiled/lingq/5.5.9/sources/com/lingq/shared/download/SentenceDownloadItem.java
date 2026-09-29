package com.lingq.shared.download;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/download/SentenceDownloadItem;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class SentenceDownloadItem {

    /* JADX INFO: renamed from: a */
    public final String f17982a;

    /* JADX INFO: renamed from: b */
    public final int f17983b;

    /* JADX INFO: renamed from: c */
    public final String f17984c;

    /* JADX INFO: renamed from: d */
    public final int f17985d;

    /* JADX INFO: renamed from: e */
    public final int f17986e;

    /* JADX INFO: renamed from: f */
    public final int f17987f;

    /* JADX INFO: renamed from: g */
    public final boolean f17988g;

    /* JADX INFO: renamed from: h */
    public double f17989h;

    public SentenceDownloadItem(String str, int i10, String str2, int i11, int i12, int i13, boolean z10, double d10) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "audioUrl");
        this.f17982a = str;
        this.f17983b = i10;
        this.f17984c = str2;
        this.f17985d = i11;
        this.f17986e = i12;
        this.f17987f = i13;
        this.f17988g = z10;
        this.f17989h = d10;
    }

    public /* synthetic */ SentenceDownloadItem(String str, int i10, String str2, int i11, int i12, int i13, boolean z10, double d10, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, str2, i11, i12, i13, z10, (i14 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? 0.0d : d10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SentenceDownloadItem)) {
            return false;
        }
        SentenceDownloadItem sentenceDownloadItem = (SentenceDownloadItem) obj;
        return C5207g.m11106a(this.f17982a, sentenceDownloadItem.f17982a) && this.f17983b == sentenceDownloadItem.f17983b && C5207g.m11106a(this.f17984c, sentenceDownloadItem.f17984c) && this.f17985d == sentenceDownloadItem.f17985d && this.f17986e == sentenceDownloadItem.f17986e && this.f17987f == sentenceDownloadItem.f17987f && this.f17988g == sentenceDownloadItem.f17988g && Double.compare(this.f17989h, sentenceDownloadItem.f17989h) == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    public final int hashCode() {
        int iM16d = C0009a.m16d(this.f17987f, C0009a.m16d(this.f17986e, C0009a.m16d(this.f17985d, C0166e.m758d(this.f17984c, C0009a.m16d(this.f17983b, this.f17982a.hashCode() * 31, 31), 31), 31), 31), 31);
        boolean z10 = this.f17988g;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return Double.hashCode(this.f17989h) + ((iM16d + r10) * 31);
    }

    public final String toString() {
        return "SentenceDownloadItem(language=" + this.f17982a + ", lessonId=" + this.f17983b + ", audioUrl=" + this.f17984c + ", sentenceIndex=" + this.f17985d + ", currentIndex=" + this.f17986e + ", lastIndex=" + this.f17987f + ", shouldAutoPlay=" + this.f17988g + ", audioDuration=" + this.f17989h + ")";
    }
}
