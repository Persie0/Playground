package com.lingq.shared.uimodel.lesson;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/uimodel/lesson/LessonAudio;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class LessonAudio {

    /* JADX INFO: renamed from: a */
    public final int f21807a;

    /* JADX INFO: renamed from: b */
    public final String f21808b;

    /* JADX INFO: renamed from: c */
    public final String f21809c;

    /* JADX INFO: renamed from: d */
    public final String f21810d;

    public LessonAudio() {
        this(0, null, null, null, 15, null);
    }

    public /* synthetic */ LessonAudio(int i10, String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 2) != 0 ? "" : str, (i11 & 1) != 0 ? 0 : i10, (i11 & 4) != 0 ? "" : str2, (i11 & 8) != 0 ? null : str3);
    }

    public LessonAudio(String str, int i10, String str2, String str3) {
        this.f21807a = i10;
        this.f21808b = str;
        this.f21809c = str2;
        this.f21810d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonAudio)) {
            return false;
        }
        LessonAudio lessonAudio = (LessonAudio) obj;
        return this.f21807a == lessonAudio.f21807a && C5207g.m11106a(this.f21808b, lessonAudio.f21808b) && C5207g.m11106a(this.f21809c, lessonAudio.f21809c) && C5207g.m11106a(this.f21810d, lessonAudio.f21810d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f21807a) * 31;
        int iHashCode2 = 0;
        String str = this.f21808b;
        int iHashCode3 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f21809c;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f21810d;
        if (str3 != null) {
            iHashCode2 = str3.hashCode();
        }
        return iHashCode4 + iHashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LessonAudio(id=");
        sb2.append(this.f21807a);
        sb2.append(", audioUrl=");
        sb2.append(this.f21808b);
        sb2.append(", externalAudio=");
        sb2.append(this.f21809c);
        sb2.append(", videoUrl=");
        return C0009a.m23l(sb2, this.f21810d, ")");
    }
}
