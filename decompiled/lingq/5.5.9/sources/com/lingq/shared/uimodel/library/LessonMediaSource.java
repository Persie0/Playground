package com.lingq.shared.uimodel.library;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/uimodel/library/LessonMediaSource;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class LessonMediaSource {

    /* JADX INFO: renamed from: a */
    public final String f21999a;

    /* JADX INFO: renamed from: b */
    public final String f22000b;

    /* JADX INFO: renamed from: c */
    public final String f22001c;

    public LessonMediaSource(String str, String str2, String str3) {
        this.f21999a = str;
        this.f22000b = str2;
        this.f22001c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonMediaSource)) {
            return false;
        }
        LessonMediaSource lessonMediaSource = (LessonMediaSource) obj;
        return C5207g.m11106a(this.f21999a, lessonMediaSource.f21999a) && C5207g.m11106a(this.f22000b, lessonMediaSource.f22000b) && C5207g.m11106a(this.f22001c, lessonMediaSource.f22001c);
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f21999a;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f22000b;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f22001c;
        if (str3 != null) {
            iHashCode = str3.hashCode();
        }
        return iHashCode3 + iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LessonMediaSource(type=");
        sb2.append(this.f21999a);
        sb2.append(", name=");
        sb2.append(this.f22000b);
        sb2.append(", url=");
        return C0009a.m23l(sb2, this.f22001c, ")");
    }
}
