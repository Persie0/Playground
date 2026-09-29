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
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/uimodel/lesson/LessonStudySentence;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class LessonStudySentence {

    /* JADX INFO: renamed from: a */
    public final List<LessonStudyTextToken> f21858a;

    /* JADX INFO: renamed from: b */
    public final String f21859b;

    /* JADX INFO: renamed from: c */
    public final String f21860c;

    /* JADX INFO: renamed from: d */
    public final int f21861d;

    /* JADX INFO: renamed from: e */
    public final List<Float> f21862e;

    /* JADX INFO: renamed from: f */
    public final boolean f21863f;

    public LessonStudySentence(int i10, String str, String str2, List list, List list2, boolean z10) {
        C5207g.m11111f(list, "tokens");
        this.f21858a = list;
        this.f21859b = str;
        this.f21860c = str2;
        this.f21861d = i10;
        this.f21862e = list2;
        this.f21863f = z10;
    }

    public LessonStudySentence(List list, String str, String str2, int i10, List list2, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, str2, (i11 & 1) != 0 ? EmptyList.f38032a : list, (i11 & 16) != 0 ? EmptyList.f38032a : list2, (i11 & 32) != 0 ? false : z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonStudySentence)) {
            return false;
        }
        LessonStudySentence lessonStudySentence = (LessonStudySentence) obj;
        if (C5207g.m11106a(this.f21858a, lessonStudySentence.f21858a) && C5207g.m11106a(this.f21859b, lessonStudySentence.f21859b) && C5207g.m11106a(this.f21860c, lessonStudySentence.f21860c) && this.f21861d == lessonStudySentence.f21861d && C5207g.m11106a(this.f21862e, lessonStudySentence.f21862e) && this.f21863f == lessonStudySentence.f21863f) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public final int hashCode() {
        int iHashCode = this.f21858a.hashCode() * 31;
        int iHashCode2 = 0;
        String str = this.f21859b;
        int iHashCode3 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f21860c;
        int iM16d = C0009a.m16d(this.f21861d, (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        List<Float> list = this.f21862e;
        if (list != null) {
            iHashCode2 = list.hashCode();
        }
        int i10 = (iM16d + iHashCode2) * 31;
        boolean z10 = this.f21863f;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return i10 + r10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LessonStudySentence(tokens=");
        sb2.append(this.f21858a);
        sb2.append(", text=");
        sb2.append(this.f21859b);
        sb2.append(", normalizedText=");
        sb2.append(this.f21860c);
        sb2.append(", index=");
        sb2.append(this.f21861d);
        sb2.append(", timestamp=");
        sb2.append(this.f21862e);
        sb2.append(", startParagraph=");
        return C0166e.m769p(sb2, this.f21863f, ")");
    }
}
