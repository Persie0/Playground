package com.lingq.entity;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/LessonTransliteration;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class LessonTransliteration {

    /* JADX INFO: renamed from: a */
    public final String f17179a;

    /* JADX INFO: renamed from: b */
    public final String f17180b;

    /* JADX INFO: renamed from: c */
    public final String f17181c;

    /* JADX INFO: renamed from: d */
    public final String f17182d;

    /* JADX INFO: renamed from: e */
    public final String f17183e;

    /* JADX INFO: renamed from: f */
    public final String f17184f;

    public LessonTransliteration() {
        this(null, null, null, null, null, null, 63, null);
    }

    public LessonTransliteration(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f17179a = str;
        this.f17180b = str2;
        this.f17181c = str3;
        this.f17182d = str4;
        this.f17183e = str5;
        this.f17184f = str6;
    }

    public /* synthetic */ LessonTransliteration(String str, String str2, String str3, String str4, String str5, String str6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonTransliteration)) {
            return false;
        }
        LessonTransliteration lessonTransliteration = (LessonTransliteration) obj;
        return C5207g.m11106a(this.f17179a, lessonTransliteration.f17179a) && C5207g.m11106a(this.f17180b, lessonTransliteration.f17180b) && C5207g.m11106a(this.f17181c, lessonTransliteration.f17181c) && C5207g.m11106a(this.f17182d, lessonTransliteration.f17182d) && C5207g.m11106a(this.f17183e, lessonTransliteration.f17183e) && C5207g.m11106a(this.f17184f, lessonTransliteration.f17184f);
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f17179a;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f17180b;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f17181c;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f17182d;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f17183e;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f17184f;
        if (str6 != null) {
            iHashCode = str6.hashCode();
        }
        return iHashCode6 + iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LessonTransliteration(hiragana=");
        sb2.append(this.f17179a);
        sb2.append(", romaji=");
        sb2.append(this.f17180b);
        sb2.append(", pinyin=");
        sb2.append(this.f17181c);
        sb2.append(", hant=");
        sb2.append(this.f17182d);
        sb2.append(", hans=");
        sb2.append(this.f17183e);
        sb2.append(", jyutping=");
        return C0009a.m23l(sb2, this.f17184f, ")");
    }
}
