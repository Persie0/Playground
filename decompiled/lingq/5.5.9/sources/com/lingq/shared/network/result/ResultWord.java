package com.lingq.shared.network.result;

import androidx.activity.result.C0204c;
import com.android.installreferrer.api.InstallReferrerClient;
import com.kochava.tracker.BuildConfig;
import com.lingq.entity.Meaning;
import com.lingq.entity.Readings;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultWord;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ResultWord {

    /* JADX INFO: renamed from: a */
    public final String f19116a;

    /* JADX INFO: renamed from: b */
    public int f19117b;

    /* JADX INFO: renamed from: c */
    public final String f19118c;

    /* JADX INFO: renamed from: d */
    public final int f19119d;

    /* JADX INFO: renamed from: e */
    public final boolean f19120e;

    /* JADX INFO: renamed from: f */
    @InterfaceC9303g(name = "hints")
    public final List<Meaning> f19121f;

    /* JADX INFO: renamed from: g */
    public final List<String> f19122g;

    /* JADX INFO: renamed from: h */
    public final int f19123h;

    /* JADX INFO: renamed from: i */
    public final Readings f19124i;

    public ResultWord(String str, int i10, String str2, int i11, boolean z10, List<Meaning> list, List<String> list2, int i12, Readings readings) {
        C5207g.m11111f(list, "meanings");
        C5207g.m11111f(list2, "tags");
        this.f19116a = str;
        this.f19117b = i10;
        this.f19118c = str2;
        this.f19119d = i11;
        this.f19120e = z10;
        this.f19121f = list;
        this.f19122g = list2;
        this.f19123h = i12;
        this.f19124i = readings;
    }

    public ResultWord(String str, int i10, String str2, int i11, boolean z10, List list, List list2, int i12, Readings readings, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? 0 : i10, str2, (i13 & 8) != 0 ? 0 : i11, (i13 & 16) != 0 ? false : z10, (i13 & 32) != 0 ? EmptyList.f38032a : list, (i13 & 64) != 0 ? EmptyList.f38032a : list2, (i13 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? 0 : i12, (i13 & 256) != 0 ? null : readings);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultWord)) {
            return false;
        }
        ResultWord resultWord = (ResultWord) obj;
        return C5207g.m11106a(this.f19116a, resultWord.f19116a) && this.f19117b == resultWord.f19117b && C5207g.m11106a(this.f19118c, resultWord.f19118c) && this.f19119d == resultWord.f19119d && this.f19120e == resultWord.f19120e && C5207g.m11106a(this.f19121f, resultWord.f19121f) && C5207g.m11106a(this.f19122g, resultWord.f19122g) && this.f19123h == resultWord.f19123h && C5207g.m11106a(this.f19124i, resultWord.f19124i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v6, types: [int] */
    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f19116a;
        int iM16d = C0009a.m16d(this.f19117b, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.f19118c;
        int iM16d2 = C0009a.m16d(this.f19119d, (iM16d + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        boolean z10 = this.f19120e;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int iM16d3 = C0009a.m16d(this.f19123h, C0204c.m848g(this.f19122g, C0204c.m848g(this.f19121f, (iM16d2 + r10) * 31, 31), 31), 31);
        Readings readings = this.f19124i;
        if (readings != null) {
            iHashCode = readings.hashCode();
        }
        return iM16d3 + iHashCode;
    }

    public final String toString() {
        return "ResultWord(text=" + this.f19116a + ", id=" + this.f19117b + ", status=" + this.f19118c + ", importance=" + this.f19119d + ", isPhrase=" + this.f19120e + ", meanings=" + this.f19121f + ", tags=" + this.f19122g + ", cardId=" + this.f19123h + ", readings=" + this.f19124i + ")";
    }
}
