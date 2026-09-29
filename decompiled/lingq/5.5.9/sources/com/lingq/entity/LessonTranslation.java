package com.lingq.entity;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/LessonTranslation;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class LessonTranslation {

    /* JADX INFO: renamed from: a */
    public final String f17173a;

    /* JADX INFO: renamed from: b */
    public final List<String> f17174b;

    /* JADX WARN: Multi-variable type inference failed */
    public LessonTranslation() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ LessonTranslation(String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 2) != 0 ? null : list, (i10 & 1) != 0 ? null : str);
    }

    public LessonTranslation(List list, String str) {
        this.f17173a = str;
        this.f17174b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonTranslation)) {
            return false;
        }
        LessonTranslation lessonTranslation = (LessonTranslation) obj;
        return C5207g.m11106a(this.f17173a, lessonTranslation.f17173a) && C5207g.m11106a(this.f17174b, lessonTranslation.f17174b);
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f17173a;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.f17174b;
        if (list != null) {
            iHashCode = list.hashCode();
        }
        return iHashCode2 + iHashCode;
    }

    public final String toString() {
        return "LessonTranslation(language=" + this.f17173a + ", sentences=" + this.f17174b + ")";
    }
}
