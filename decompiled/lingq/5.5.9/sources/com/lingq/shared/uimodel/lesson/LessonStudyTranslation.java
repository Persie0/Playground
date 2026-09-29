package com.lingq.shared.uimodel.lesson;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/uimodel/lesson/LessonStudyTranslation;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class LessonStudyTranslation {

    /* JADX INFO: renamed from: a */
    public final String f21890a;

    /* JADX INFO: renamed from: b */
    public final List<String> f21891b;

    public LessonStudyTranslation(List list, String str) {
        this.f21890a = str;
        this.f21891b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonStudyTranslation)) {
            return false;
        }
        LessonStudyTranslation lessonStudyTranslation = (LessonStudyTranslation) obj;
        return C5207g.m11106a(this.f21890a, lessonStudyTranslation.f21890a) && C5207g.m11106a(this.f21891b, lessonStudyTranslation.f21891b);
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f21890a;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.f21891b;
        if (list != null) {
            iHashCode = list.hashCode();
        }
        return iHashCode2 + iHashCode;
    }

    public final String toString() {
        return "LessonStudyTranslation(language=" + this.f21890a + ", sentences=" + this.f21891b + ")";
    }
}
