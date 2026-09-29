package com.lingq.shared.network.result;

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
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultLibraryCounter;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ResultLibraryCounter {

    /* JADX INFO: renamed from: a */
    public final boolean f18667a;

    /* JADX INFO: renamed from: b */
    public final Float f18668b;

    /* JADX INFO: renamed from: c */
    public final Double f18669c;

    /* JADX INFO: renamed from: d */
    public final Double f18670d;

    /* JADX INFO: renamed from: e */
    public final boolean f18671e;

    /* JADX INFO: renamed from: f */
    public final float f18672f;

    /* JADX INFO: renamed from: g */
    public final int f18673g;

    /* JADX INFO: renamed from: h */
    public final int f18674h;

    /* JADX INFO: renamed from: i */
    public final int f18675i;

    /* JADX INFO: renamed from: j */
    public final int f18676j;

    /* JADX INFO: renamed from: k */
    public final int f18677k;

    /* JADX INFO: renamed from: l */
    public final boolean f18678l;

    public ResultLibraryCounter() {
        this(false, null, null, null, false, 0.0f, 0, 0, 0, 0, 0, false, 4095, null);
    }

    public ResultLibraryCounter(boolean z10, Float f3, Double d10, Double d11, boolean z11, float f10, int i10, int i11, int i12, int i13, int i14, boolean z12) {
        this.f18667a = z10;
        this.f18668b = f3;
        this.f18669c = d10;
        this.f18670d = d11;
        this.f18671e = z11;
        this.f18672f = f10;
        this.f18673g = i10;
        this.f18674h = i11;
        this.f18675i = i12;
        this.f18676j = i13;
        this.f18677k = i14;
        this.f18678l = z12;
    }

    public /* synthetic */ ResultLibraryCounter(boolean z10, Float f3, Double d10, Double d11, boolean z11, float f10, int i10, int i11, int i12, int i13, int i14, boolean z12, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? false : z10, (i15 & 2) != 0 ? Float.valueOf(0.0f) : f3, (i15 & 4) != 0 ? Double.valueOf(0.0d) : d10, (i15 & 8) != 0 ? Double.valueOf(0.0d) : d11, (i15 & 16) != 0 ? false : z11, (i15 & 32) == 0 ? f10 : 0.0f, (i15 & 64) != 0 ? 0 : i10, (i15 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? 0 : i11, (i15 & 256) != 0 ? 0 : i12, (i15 & 512) != 0 ? 0 : i13, (i15 & 1024) != 0 ? 0 : i14, (i15 & 2048) == 0 ? z12 : false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultLibraryCounter)) {
            return false;
        }
        ResultLibraryCounter resultLibraryCounter = (ResultLibraryCounter) obj;
        return this.f18667a == resultLibraryCounter.f18667a && C5207g.m11106a(this.f18668b, resultLibraryCounter.f18668b) && C5207g.m11106a(this.f18669c, resultLibraryCounter.f18669c) && C5207g.m11106a(this.f18670d, resultLibraryCounter.f18670d) && this.f18671e == resultLibraryCounter.f18671e && Float.compare(this.f18672f, resultLibraryCounter.f18672f) == 0 && this.f18673g == resultLibraryCounter.f18673g && this.f18674h == resultLibraryCounter.f18674h && this.f18675i == resultLibraryCounter.f18675i && this.f18676j == resultLibraryCounter.f18676j && this.f18677k == resultLibraryCounter.f18677k && this.f18678l == resultLibraryCounter.f18678l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v17, types: [int] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    public final int hashCode() {
        ?? r10 = 1;
        boolean z10 = this.f18667a;
        ?? r11 = z10;
        if (z10) {
            r11 = 1;
        }
        int i10 = r11 * 31;
        Float f3 = this.f18668b;
        int iHashCode = (i10 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Double d10 = this.f18669c;
        int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.f18670d;
        int iHashCode3 = (iHashCode2 + (d11 != null ? d11.hashCode() : 0)) * 31;
        boolean z11 = this.f18671e;
        ?? r12 = z11;
        if (z11) {
            r12 = 1;
        }
        int iM16d = C0009a.m16d(this.f18677k, C0009a.m16d(this.f18676j, C0009a.m16d(this.f18675i, C0009a.m16d(this.f18674h, C0009a.m16d(this.f18673g, C0204c.m846e(this.f18672f, (iHashCode3 + r12) * 31, 31), 31), 31), 31), 31), 31);
        boolean z12 = this.f18678l;
        if (!z12) {
            r10 = z12;
        }
        return iM16d + r10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResultLibraryCounter(roseGiven=");
        sb2.append(this.f18667a);
        sb2.append(", progress=");
        sb2.append(this.f18668b);
        sb2.append(", listenTimes=");
        sb2.append(this.f18669c);
        sb2.append(", readTimes=");
        sb2.append(this.f18670d);
        sb2.append(", isTaken=");
        sb2.append(this.f18671e);
        sb2.append(", difficulty=");
        sb2.append(this.f18672f);
        sb2.append(", rosesCount=");
        sb2.append(this.f18673g);
        sb2.append(", newWordsCount=");
        sb2.append(this.f18674h);
        sb2.append(", knownWordsCount=");
        sb2.append(this.f18675i);
        sb2.append(", cardsCount=");
        sb2.append(this.f18676j);
        sb2.append(", lessonsCount=");
        sb2.append(this.f18677k);
        sb2.append(", isCompletelyTaken=");
        return C0166e.m769p(sb2, this.f18678l, ")");
    }
}
