package com.lingq.shared.uimodel.language;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/UserCourseForImport;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class UserCourseForImport {

    /* JADX INFO: renamed from: a */
    public final String f21697a;

    /* JADX INFO: renamed from: b */
    public final int f21698b;

    /* JADX INFO: renamed from: c */
    public final String f21699c;

    public UserCourseForImport(String str, int i10, String str2) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "title");
        this.f21697a = str;
        this.f21698b = i10;
        this.f21699c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserCourseForImport)) {
            return false;
        }
        UserCourseForImport userCourseForImport = (UserCourseForImport) obj;
        if (C5207g.m11106a(this.f21697a, userCourseForImport.f21697a) && this.f21698b == userCourseForImport.f21698b && C5207g.m11106a(this.f21699c, userCourseForImport.f21699c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f21699c.hashCode() + C0009a.m16d(this.f21698b, this.f21697a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserCourseForImport(language=");
        sb2.append(this.f21697a);
        sb2.append(", pk=");
        sb2.append(this.f21698b);
        sb2.append(", title=");
        return C0009a.m23l(sb2, this.f21699c, ")");
    }
}
