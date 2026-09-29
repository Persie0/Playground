package com.lingq.shared.uimodel.lesson;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/uimodel/lesson/LessonStudyBookmark;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class LessonStudyBookmark {

    /* JADX INFO: renamed from: a */
    public final Integer f21841a;

    /* JADX INFO: renamed from: b */
    public final String f21842b;

    /* JADX INFO: renamed from: c */
    public final String f21843c;

    /* JADX INFO: renamed from: d */
    public final String f21844d;

    public LessonStudyBookmark(String str, String str2, Integer num, String str3) {
        this.f21841a = num;
        this.f21842b = str;
        this.f21843c = str2;
        this.f21844d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonStudyBookmark)) {
            return false;
        }
        LessonStudyBookmark lessonStudyBookmark = (LessonStudyBookmark) obj;
        if (C5207g.m11106a(this.f21841a, lessonStudyBookmark.f21841a) && C5207g.m11106a(this.f21842b, lessonStudyBookmark.f21842b) && C5207g.m11106a(this.f21843c, lessonStudyBookmark.f21843c) && C5207g.m11106a(this.f21844d, lessonStudyBookmark.f21844d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        Integer num = this.f21841a;
        int iHashCode2 = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f21842b;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f21843c;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f21844d;
        if (str3 != null) {
            iHashCode = str3.hashCode();
        }
        return iHashCode4 + iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LessonStudyBookmark(wordIndex=");
        sb2.append(this.f21841a);
        sb2.append(", client=");
        sb2.append(this.f21842b);
        sb2.append(", timestamp=");
        sb2.append(this.f21843c);
        sb2.append(", languageTimestamp=");
        return C0009a.m23l(sb2, this.f21844d, ")");
    }
}
