package com.lingq.entity;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import com.android.installreferrer.api.InstallReferrerClient;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/Word;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class Word {

    /* JADX INFO: renamed from: a */
    public final String f17576a;

    /* JADX INFO: renamed from: b */
    public final String f17577b;

    /* JADX INFO: renamed from: c */
    public final int f17578c;

    /* JADX INFO: renamed from: d */
    public String f17579d;

    /* JADX INFO: renamed from: e */
    public final int f17580e;

    /* JADX INFO: renamed from: f */
    public final boolean f17581f;

    /* JADX INFO: renamed from: g */
    public final List<Meaning> f17582g;

    /* JADX INFO: renamed from: h */
    public final List<String> f17583h;

    /* JADX INFO: renamed from: i */
    public final List<String> f17584i;

    /* JADX INFO: renamed from: j */
    public final Readings f17585j;

    /* JADX INFO: renamed from: k */
    public final int f17586k;

    public Word(String str, String str2, int i10, String str3, int i11, boolean z10, List<Meaning> list, List<String> list2, List<String> list3, Readings readings, int i12) {
        C5207g.m11111f(str, "termWithLanguage");
        C5207g.m11111f(str2, "term");
        C5207g.m11111f(list, "meanings");
        C5207g.m11111f(list2, "tags");
        C5207g.m11111f(list3, "gTags");
        this.f17576a = str;
        this.f17577b = str2;
        this.f17578c = i10;
        this.f17579d = str3;
        this.f17580e = i11;
        this.f17581f = z10;
        this.f17582g = list;
        this.f17583h = list2;
        this.f17584i = list3;
        this.f17585j = readings;
        this.f17586k = i12;
    }

    public Word(String str, String str2, int i10, String str3, int i11, boolean z10, List list, List list2, List list3, Readings readings, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? 0 : i10, str3, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? false : z10, (i13 & 64) != 0 ? EmptyList.f38032a : list, (i13 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? EmptyList.f38032a : list2, (i13 & 256) != 0 ? EmptyList.f38032a : list3, (i13 & 512) != 0 ? null : readings, (i13 & 1024) != 0 ? 0 : i12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Word)) {
            return false;
        }
        Word word = (Word) obj;
        return C5207g.m11106a(this.f17576a, word.f17576a) && C5207g.m11106a(this.f17577b, word.f17577b) && this.f17578c == word.f17578c && C5207g.m11106a(this.f17579d, word.f17579d) && this.f17580e == word.f17580e && this.f17581f == word.f17581f && C5207g.m11106a(this.f17582g, word.f17582g) && C5207g.m11106a(this.f17583h, word.f17583h) && C5207g.m11106a(this.f17584i, word.f17584i) && C5207g.m11106a(this.f17585j, word.f17585j) && this.f17586k == word.f17586k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    public final int hashCode() {
        int iM16d = C0009a.m16d(this.f17578c, C0166e.m758d(this.f17577b, this.f17576a.hashCode() * 31, 31), 31);
        String str = this.f17579d;
        int iHashCode = 0;
        int iM16d2 = C0009a.m16d(this.f17580e, (iM16d + (str == null ? 0 : str.hashCode())) * 31, 31);
        boolean z10 = this.f17581f;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int iM848g = C0204c.m848g(this.f17584i, C0204c.m848g(this.f17583h, C0204c.m848g(this.f17582g, (iM16d2 + r10) * 31, 31), 31), 31);
        Readings readings = this.f17585j;
        if (readings != null) {
            iHashCode = readings.hashCode();
        }
        return Integer.hashCode(this.f17586k) + ((iM848g + iHashCode) * 31);
    }

    public final String toString() {
        String str = this.f17579d;
        StringBuilder sb2 = new StringBuilder("Word(termWithLanguage=");
        sb2.append(this.f17576a);
        sb2.append(", term=");
        sb2.append(this.f17577b);
        sb2.append(", id=");
        sb2.append(this.f17578c);
        sb2.append(", status=");
        sb2.append(str);
        sb2.append(", importance=");
        sb2.append(this.f17580e);
        sb2.append(", isPhrase=");
        sb2.append(this.f17581f);
        sb2.append(", meanings=");
        sb2.append(this.f17582g);
        sb2.append(", tags=");
        sb2.append(this.f17583h);
        sb2.append(", gTags=");
        sb2.append(this.f17584i);
        sb2.append(", readings=");
        sb2.append(this.f17585j);
        sb2.append(", cardId=");
        return C0166e.m768o(sb2, this.f17586k, ")");
    }
}
