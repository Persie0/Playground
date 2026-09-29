package com.lingq.entity;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/CourseForImport;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class CourseForImport {

    /* JADX INFO: renamed from: a */
    public final String f16944a;

    /* JADX INFO: renamed from: b */
    public final int f16945b;

    /* JADX INFO: renamed from: c */
    public final String f16946c;

    public CourseForImport(String str, int i10, String str2) {
        C5207g.m11111f(str, "language");
        this.f16944a = str;
        this.f16945b = i10;
        this.f16946c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourseForImport)) {
            return false;
        }
        CourseForImport courseForImport = (CourseForImport) obj;
        return C5207g.m11106a(this.f16944a, courseForImport.f16944a) && this.f16945b == courseForImport.f16945b && C5207g.m11106a(this.f16946c, courseForImport.f16946c);
    }

    public final int hashCode() {
        return this.f16946c.hashCode() + C0009a.m16d(this.f16945b, this.f16944a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CourseForImport(language=");
        sb2.append(this.f16944a);
        sb2.append(", pk=");
        sb2.append(this.f16945b);
        sb2.append(", title=");
        return C0009a.m23l(sb2, this.f16946c, ")");
    }
}
