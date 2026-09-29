package com.lingq.shared.network.result;

import android.support.v4.media.C0141b;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultStreak;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ResultStreak {

    /* JADX INFO: renamed from: a */
    public final int f18961a;

    /* JADX INFO: renamed from: b */
    public final double f18962b;

    /* JADX INFO: renamed from: c */
    public final int f18963c;

    /* JADX INFO: renamed from: d */
    public final boolean f18964d;

    /* JADX INFO: renamed from: e */
    public final String f18965e;

    public ResultStreak() {
        this(0, 0.0d, 0, false, null, 31, null);
    }

    public ResultStreak(int i10, double d10, int i11, boolean z10, String str) {
        this.f18961a = i10;
        this.f18962b = d10;
        this.f18963c = i11;
        this.f18964d = z10;
        this.f18965e = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ResultStreak(int i10, double d10, int i11, boolean z10, String str, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z11 = false;
        int i13 = (i12 & 1) != 0 ? 0 : i10;
        double d11 = (i12 & 2) != 0 ? 0.0d : d10;
        int i14 = (i12 & 4) != 0 ? 0 : i11;
        if ((i12 & 8) == 0) {
            z11 = z10;
        }
        this(i13, d11, i14, z11, (i12 & 16) != 0 ? null : str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultStreak)) {
            return false;
        }
        ResultStreak resultStreak = (ResultStreak) obj;
        if (this.f18961a == resultStreak.f18961a && Double.compare(this.f18962b, resultStreak.f18962b) == 0 && this.f18963c == resultStreak.f18963c && this.f18964d == resultStreak.f18964d && C5207g.m11106a(this.f18965e, resultStreak.f18965e)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final int hashCode() {
        int iM16d = C0009a.m16d(this.f18963c, C0141b.m609e(this.f18962b, Integer.hashCode(this.f18961a) * 31, 31), 31);
        boolean z10 = this.f18964d;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iM16d + r10) * 31;
        String str = this.f18965e;
        return i10 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ResultStreak(streakDays=" + this.f18961a + ", coins=" + this.f18962b + ", latestStreakDays=" + this.f18963c + ", isStreakBroken=" + this.f18964d + ", error=" + this.f18965e + ")";
    }
}
