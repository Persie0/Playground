package com.lingq.shared.network.result;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultLessonBookmark;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ResultLessonBookmark {

    /* JADX INFO: renamed from: a */
    public final Integer f18561a;

    /* JADX INFO: renamed from: b */
    public final String f18562b;

    /* JADX INFO: renamed from: c */
    public final String f18563c;

    /* JADX INFO: renamed from: d */
    public final String f18564d;

    public ResultLessonBookmark(String str, String str2, Integer num, String str3) {
        this.f18561a = num;
        this.f18562b = str;
        this.f18563c = str2;
        this.f18564d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultLessonBookmark)) {
            return false;
        }
        ResultLessonBookmark resultLessonBookmark = (ResultLessonBookmark) obj;
        return C5207g.m11106a(this.f18561a, resultLessonBookmark.f18561a) && C5207g.m11106a(this.f18562b, resultLessonBookmark.f18562b) && C5207g.m11106a(this.f18563c, resultLessonBookmark.f18563c) && C5207g.m11106a(this.f18564d, resultLessonBookmark.f18564d);
    }

    public final int hashCode() {
        int iHashCode = 0;
        Integer num = this.f18561a;
        int iHashCode2 = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f18562b;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f18563c;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f18564d;
        if (str3 != null) {
            iHashCode = str3.hashCode();
        }
        return iHashCode4 + iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResultLessonBookmark(wordIndex=");
        sb2.append(this.f18561a);
        sb2.append(", client=");
        sb2.append(this.f18562b);
        sb2.append(", timestamp=");
        sb2.append(this.f18563c);
        sb2.append(", languageTimestamp=");
        return C0009a.m23l(sb2, this.f18564d, ")");
    }
}
