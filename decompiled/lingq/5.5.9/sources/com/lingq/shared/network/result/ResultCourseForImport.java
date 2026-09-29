package com.lingq.shared.network.result;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultCourseForImport;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ResultCourseForImport {

    /* JADX INFO: renamed from: a */
    public final int f18381a;

    /* JADX INFO: renamed from: b */
    public final String f18382b;

    /* JADX WARN: Multi-variable type inference failed */
    public ResultCourseForImport() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ResultCourseForImport(int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 2) != 0 ? null : str, (i11 & 1) != 0 ? 0 : i10);
    }

    public ResultCourseForImport(String str, int i10) {
        this.f18381a = i10;
        this.f18382b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultCourseForImport)) {
            return false;
        }
        ResultCourseForImport resultCourseForImport = (ResultCourseForImport) obj;
        if (this.f18381a == resultCourseForImport.f18381a && C5207g.m11106a(this.f18382b, resultCourseForImport.f18382b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f18381a) * 31;
        String str = this.f18382b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ResultCourseForImport(id=" + this.f18381a + ", title=" + this.f18382b + ")";
    }
}
