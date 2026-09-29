package com.lingq.shared.network.result;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/result/ValidationMessage;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ValidationMessage {

    /* JADX INFO: renamed from: a */
    public final List<String> f19142a;

    /* JADX INFO: renamed from: b */
    @InterfaceC9303g(name = "is_valid")
    public final boolean f19143b;

    public ValidationMessage(List<String> list, boolean z10) {
        this.f19142a = list;
        this.f19143b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidationMessage)) {
            return false;
        }
        ValidationMessage validationMessage = (ValidationMessage) obj;
        return C5207g.m11106a(this.f19142a, validationMessage.f19142a) && this.f19143b == validationMessage.f19143b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        int iHashCode = this.f19142a.hashCode() * 31;
        boolean z10 = this.f19143b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    public final String toString() {
        return "ValidationMessage(message=" + this.f19142a + ", isValid=" + this.f19143b + ")";
    }
}
