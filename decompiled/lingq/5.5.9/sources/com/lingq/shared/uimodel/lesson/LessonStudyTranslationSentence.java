package com.lingq.shared.uimodel.lesson;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/uimodel/lesson/LessonStudyTranslationSentence;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class LessonStudyTranslationSentence {

    /* JADX INFO: renamed from: a */
    public final int f21895a;

    /* JADX INFO: renamed from: b */
    public final int f21896b;

    /* JADX INFO: renamed from: c */
    public final Double f21897c;

    /* JADX INFO: renamed from: d */
    public final Double f21898d;

    /* JADX INFO: renamed from: e */
    public final String f21899e;

    /* JADX INFO: renamed from: f */
    public final List<TranslationStudy> f21900f;

    public LessonStudyTranslationSentence(int i10, int i11, Double d10, Double d11, String str, List<TranslationStudy> list) {
        C5207g.m11111f(str, "text");
        C5207g.m11111f(list, "translations");
        this.f21895a = i10;
        this.f21896b = i11;
        this.f21897c = d10;
        this.f21898d = d11;
        this.f21899e = str;
        this.f21900f = list;
    }

    public LessonStudyTranslationSentence(int i10, int i11, Double d10, Double d11, String str, List list, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, d10, d11, (i12 & 16) != 0 ? "" : str, (i12 & 32) != 0 ? EmptyList.f38032a : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonStudyTranslationSentence)) {
            return false;
        }
        LessonStudyTranslationSentence lessonStudyTranslationSentence = (LessonStudyTranslationSentence) obj;
        return this.f21895a == lessonStudyTranslationSentence.f21895a && this.f21896b == lessonStudyTranslationSentence.f21896b && C5207g.m11106a(this.f21897c, lessonStudyTranslationSentence.f21897c) && C5207g.m11106a(this.f21898d, lessonStudyTranslationSentence.f21898d) && C5207g.m11106a(this.f21899e, lessonStudyTranslationSentence.f21899e) && C5207g.m11106a(this.f21900f, lessonStudyTranslationSentence.f21900f);
    }

    public final int hashCode() {
        int iM16d = C0009a.m16d(this.f21896b, Integer.hashCode(this.f21895a) * 31, 31);
        Double d10 = this.f21897c;
        int iHashCode = (iM16d + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.f21898d;
        return this.f21900f.hashCode() + C0166e.m758d(this.f21899e, (iHashCode + (d11 != null ? d11.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LessonStudyTranslationSentence(index=");
        sb2.append(this.f21895a);
        sb2.append(", lessonId=");
        sb2.append(this.f21896b);
        sb2.append(", audio=");
        sb2.append(this.f21897c);
        sb2.append(", audioEnd=");
        sb2.append(this.f21898d);
        sb2.append(", text=");
        sb2.append(this.f21899e);
        sb2.append(", translations=");
        return C0009a.m24m(sb2, this.f21900f, ")");
    }
}
