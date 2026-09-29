package com.lingq.entity;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import com.android.installreferrer.api.InstallReferrerClient;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/LibraryCounter;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class LibraryCounter {

    /* JADX INFO: renamed from: a */
    public final int f17200a;

    /* JADX INFO: renamed from: b */
    public final String f17201b;

    /* JADX INFO: renamed from: c */
    public boolean f17202c;

    /* JADX INFO: renamed from: d */
    public final Float f17203d;

    /* JADX INFO: renamed from: e */
    public Double f17204e;

    /* JADX INFO: renamed from: f */
    public Double f17205f;

    /* JADX INFO: renamed from: g */
    public boolean f17206g;

    /* JADX INFO: renamed from: h */
    public final float f17207h;

    /* JADX INFO: renamed from: i */
    public int f17208i;

    /* JADX INFO: renamed from: j */
    public final int f17209j;

    /* JADX INFO: renamed from: k */
    public final int f17210k;

    /* JADX INFO: renamed from: l */
    public final int f17211l;

    /* JADX INFO: renamed from: m */
    public final int f17212m;

    /* JADX INFO: renamed from: n */
    public boolean f17213n;

    public LibraryCounter(int i10, String str, boolean z10, Float f3, Double d10, Double d11, boolean z11, float f10, int i11, int i12, int i13, int i14, int i15, boolean z12) {
        C5207g.m11111f(str, "type");
        this.f17200a = i10;
        this.f17201b = str;
        this.f17202c = z10;
        this.f17203d = f3;
        this.f17204e = d10;
        this.f17205f = d11;
        this.f17206g = z11;
        this.f17207h = f10;
        this.f17208i = i11;
        this.f17209j = i12;
        this.f17210k = i13;
        this.f17211l = i14;
        this.f17212m = i15;
        this.f17213n = z12;
    }

    public /* synthetic */ LibraryCounter(int i10, String str, boolean z10, Float f3, Double d10, Double d11, boolean z11, float f10, int i11, int i12, int i13, int i14, int i15, boolean z12, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, (i16 & 4) != 0 ? false : z10, (i16 & 8) != 0 ? Float.valueOf(0.0f) : f3, (i16 & 16) != 0 ? Double.valueOf(0.0d) : d10, (i16 & 32) != 0 ? Double.valueOf(0.0d) : d11, (i16 & 64) != 0 ? false : z11, (i16 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? 0.0f : f10, (i16 & 256) != 0 ? 0 : i11, (i16 & 512) != 0 ? 0 : i12, (i16 & 1024) != 0 ? 0 : i13, (i16 & 2048) != 0 ? 0 : i14, (i16 & 4096) != 0 ? 0 : i15, (i16 & 8192) != 0 ? false : z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LibraryCounter)) {
            return false;
        }
        LibraryCounter libraryCounter = (LibraryCounter) obj;
        return this.f17200a == libraryCounter.f17200a && C5207g.m11106a(this.f17201b, libraryCounter.f17201b) && this.f17202c == libraryCounter.f17202c && C5207g.m11106a(this.f17203d, libraryCounter.f17203d) && C5207g.m11106a(this.f17204e, libraryCounter.f17204e) && C5207g.m11106a(this.f17205f, libraryCounter.f17205f) && this.f17206g == libraryCounter.f17206g && Float.compare(this.f17207h, libraryCounter.f17207h) == 0 && this.f17208i == libraryCounter.f17208i && this.f17209j == libraryCounter.f17209j && this.f17210k == libraryCounter.f17210k && this.f17211l == libraryCounter.f17211l && this.f17212m == libraryCounter.f17212m && this.f17213n == libraryCounter.f17213n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r0v20, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f17201b, Integer.hashCode(this.f17200a) * 31, 31);
        boolean z10 = this.f17202c;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iM758d + r10) * 31;
        Float f3 = this.f17203d;
        int iHashCode = (i10 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Double d10 = this.f17204e;
        int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.f17205f;
        int iHashCode3 = (iHashCode2 + (d11 != null ? d11.hashCode() : 0)) * 31;
        boolean z11 = this.f17206g;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int iM16d = C0009a.m16d(this.f17212m, C0009a.m16d(this.f17211l, C0009a.m16d(this.f17210k, C0009a.m16d(this.f17209j, C0009a.m16d(this.f17208i, C0204c.m846e(this.f17207h, (iHashCode3 + r11) * 31, 31), 31), 31), 31), 31), 31);
        boolean z12 = this.f17213n;
        return iM16d + (z12 ? 1 : z12);
    }

    public final String toString() {
        return "LibraryCounter(id=" + this.f17200a + ", type=" + this.f17201b + ", roseGiven=" + this.f17202c + ", progress=" + this.f17203d + ", listenTimes=" + this.f17204e + ", readTimes=" + this.f17205f + ", isTaken=" + this.f17206g + ", difficulty=" + this.f17207h + ", rosesCount=" + this.f17208i + ", newWordsCount=" + this.f17209j + ", knownWordsCount=" + this.f17210k + ", cardsCount=" + this.f17211l + ", lessonsCount=" + this.f17212m + ", isCompletelyTaken=" + this.f17213n + ")";
    }
}
