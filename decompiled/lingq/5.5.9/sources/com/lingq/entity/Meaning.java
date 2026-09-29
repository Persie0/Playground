package com.lingq.entity;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/Meaning;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class Meaning {

    /* JADX INFO: renamed from: a */
    public final int f17276a;

    /* JADX INFO: renamed from: b */
    public String f17277b;

    /* JADX INFO: renamed from: c */
    public String f17278c;

    /* JADX INFO: renamed from: d */
    @InterfaceC9303g(name = "term_id")
    public final int f17279d;

    /* JADX INFO: renamed from: e */
    public final int f17280e;

    /* JADX INFO: renamed from: f */
    public final boolean f17281f;

    /* JADX INFO: renamed from: g */
    @InterfaceC9303g(name = "detected_locale")
    public final String f17282g;

    /* JADX INFO: renamed from: h */
    @InterfaceC9303g(name = "creator_id")
    public final Integer f17283h;

    /* JADX INFO: renamed from: i */
    @InterfaceC9303g(name = "is_google_translate")
    public final boolean f17284i;

    /* JADX INFO: renamed from: j */
    @InterfaceC9303g(name = "word_id")
    public final int f17285j;

    public Meaning(int i10, String str, String str2, int i11, int i12, boolean z10, String str3, Integer num, boolean z11, int i13) {
        this.f17276a = i10;
        this.f17277b = str;
        this.f17278c = str2;
        this.f17279d = i11;
        this.f17280e = i12;
        this.f17281f = z10;
        this.f17282g = str3;
        this.f17283h = num;
        this.f17284i = z11;
        this.f17285j = i13;
    }

    public /* synthetic */ Meaning(int i10, String str, String str2, int i11, int i12, boolean z10, String str3, Integer num, boolean z11, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i10, str, str2, (i14 & 8) != 0 ? 0 : i11, (i14 & 16) != 0 ? 0 : i12, z10, str3, num, (i14 & 256) != 0 ? false : z11, (i14 & 512) != 0 ? 0 : i13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Meaning)) {
            return false;
        }
        Meaning meaning = (Meaning) obj;
        return this.f17276a == meaning.f17276a && C5207g.m11106a(this.f17277b, meaning.f17277b) && C5207g.m11106a(this.f17278c, meaning.f17278c) && this.f17279d == meaning.f17279d && this.f17280e == meaning.f17280e && this.f17281f == meaning.f17281f && C5207g.m11106a(this.f17282g, meaning.f17282g) && C5207g.m11106a(this.f17283h, meaning.f17283h) && this.f17284i == meaning.f17284i && this.f17285j == meaning.f17285j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f17276a) * 31;
        String str = this.f17277b;
        int iHashCode2 = 0;
        int iHashCode3 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f17278c;
        int iM16d = C0009a.m16d(this.f17280e, C0009a.m16d(this.f17279d, (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
        boolean z10 = this.f17281f;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iM16d + r10) * 31;
        String str3 = this.f17282g;
        int iHashCode4 = (i10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f17283h;
        if (num != null) {
            iHashCode2 = num.hashCode();
        }
        int i11 = (iHashCode4 + iHashCode2) * 31;
        boolean z11 = this.f17284i;
        return Integer.hashCode(this.f17285j) + ((i11 + (z11 ? 1 : z11)) * 31);
    }

    public final String toString() {
        String str = this.f17277b;
        String str2 = this.f17278c;
        StringBuilder sb2 = new StringBuilder("Meaning(id=");
        sb2.append(this.f17276a);
        sb2.append(", locale=");
        sb2.append(str);
        sb2.append(", text=");
        sb2.append(str2);
        sb2.append(", termId=");
        sb2.append(this.f17279d);
        sb2.append(", popularity=");
        sb2.append(this.f17280e);
        sb2.append(", flagged=");
        sb2.append(this.f17281f);
        sb2.append(", detectedLocale=");
        sb2.append(this.f17282g);
        sb2.append(", creatorId=");
        sb2.append(this.f17283h);
        sb2.append(", isGoogleTranslate=");
        sb2.append(this.f17284i);
        sb2.append(", wordId=");
        return C0166e.m768o(sb2, this.f17285j, ")");
    }
}
