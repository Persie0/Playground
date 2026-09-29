package com.lingq.shared.uimodel.lesson;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/uimodel/lesson/LessonStudyTransliteration;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class LessonStudyTransliteration {

    /* JADX INFO: renamed from: a */
    public final String f21907a;

    /* JADX INFO: renamed from: b */
    public final String f21908b;

    /* JADX INFO: renamed from: c */
    public final String f21909c;

    /* JADX INFO: renamed from: d */
    public final String f21910d;

    /* JADX INFO: renamed from: e */
    public final String f21911e;

    /* JADX INFO: renamed from: f */
    public final String f21912f;

    public LessonStudyTransliteration() {
        this(null, null, null, null, null, null, 63, null);
    }

    public LessonStudyTransliteration(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f21907a = str;
        this.f21908b = str2;
        this.f21909c = str3;
        this.f21910d = str4;
        this.f21911e = str5;
        this.f21912f = str6;
    }

    public /* synthetic */ LessonStudyTransliteration(String str, String str2, String str3, String str4, String str5, String str6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonStudyTransliteration)) {
            return false;
        }
        LessonStudyTransliteration lessonStudyTransliteration = (LessonStudyTransliteration) obj;
        return C5207g.m11106a(this.f21907a, lessonStudyTransliteration.f21907a) && C5207g.m11106a(this.f21908b, lessonStudyTransliteration.f21908b) && C5207g.m11106a(this.f21909c, lessonStudyTransliteration.f21909c) && C5207g.m11106a(this.f21910d, lessonStudyTransliteration.f21910d) && C5207g.m11106a(this.f21911e, lessonStudyTransliteration.f21911e) && C5207g.m11106a(this.f21912f, lessonStudyTransliteration.f21912f);
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f21907a;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f21908b;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f21909c;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f21910d;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f21911e;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f21912f;
        if (str6 != null) {
            iHashCode = str6.hashCode();
        }
        return iHashCode6 + iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LessonStudyTransliteration(hiragana=");
        sb2.append(this.f21907a);
        sb2.append(", romaji=");
        sb2.append(this.f21908b);
        sb2.append(", pinyin=");
        sb2.append(this.f21909c);
        sb2.append(", hant=");
        sb2.append(this.f21910d);
        sb2.append(", hans=");
        sb2.append(this.f21911e);
        sb2.append(", jyutping=");
        return C0009a.m23l(sb2, this.f21912f, ")");
    }
}
