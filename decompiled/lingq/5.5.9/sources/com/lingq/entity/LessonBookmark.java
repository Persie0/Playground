package com.lingq.entity;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/LessonBookmark;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class LessonBookmark {

    /* JADX INFO: renamed from: a */
    public final int f17143a;

    /* JADX INFO: renamed from: b */
    public final Integer f17144b;

    /* JADX INFO: renamed from: c */
    public final String f17145c;

    /* JADX INFO: renamed from: d */
    public final String f17146d;

    /* JADX INFO: renamed from: e */
    public final String f17147e;

    public LessonBookmark(int i10, Integer num, String str, String str2, String str3) {
        this.f17143a = i10;
        this.f17144b = num;
        this.f17145c = str;
        this.f17146d = str2;
        this.f17147e = str3;
    }

    public /* synthetic */ LessonBookmark(int i10, Integer num, String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonBookmark)) {
            return false;
        }
        LessonBookmark lessonBookmark = (LessonBookmark) obj;
        if (this.f17143a == lessonBookmark.f17143a && C5207g.m11106a(this.f17144b, lessonBookmark.f17144b) && C5207g.m11106a(this.f17145c, lessonBookmark.f17145c) && C5207g.m11106a(this.f17146d, lessonBookmark.f17146d) && C5207g.m11106a(this.f17147e, lessonBookmark.f17147e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f17143a) * 31;
        int iHashCode2 = 0;
        Integer num = this.f17144b;
        int iHashCode3 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f17145c;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f17146d;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f17147e;
        if (str3 != null) {
            iHashCode2 = str3.hashCode();
        }
        return iHashCode5 + iHashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LessonBookmark(contentId=");
        sb2.append(this.f17143a);
        sb2.append(", wordIndex=");
        sb2.append(this.f17144b);
        sb2.append(", client=");
        sb2.append(this.f17145c);
        sb2.append(", timestamp=");
        sb2.append(this.f17146d);
        sb2.append(", languageTimestamp=");
        return C0009a.m23l(sb2, this.f17147e, ")");
    }
}
