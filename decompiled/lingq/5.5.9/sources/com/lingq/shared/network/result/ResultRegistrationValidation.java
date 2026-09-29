package com.lingq.shared.network.result;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultRegistrationValidation;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ResultRegistrationValidation {

    /* JADX INFO: renamed from: a */
    public final ValidationMessage f18923a;

    /* JADX INFO: renamed from: b */
    public final ValidationMessage f18924b;

    /* JADX WARN: Multi-variable type inference failed */
    public ResultRegistrationValidation() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public ResultRegistrationValidation(ValidationMessage validationMessage, ValidationMessage validationMessage2) {
        this.f18923a = validationMessage;
        this.f18924b = validationMessage2;
    }

    public /* synthetic */ ResultRegistrationValidation(ValidationMessage validationMessage, ValidationMessage validationMessage2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : validationMessage, (i10 & 2) != 0 ? null : validationMessage2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultRegistrationValidation)) {
            return false;
        }
        ResultRegistrationValidation resultRegistrationValidation = (ResultRegistrationValidation) obj;
        if (C5207g.m11106a(this.f18923a, resultRegistrationValidation.f18923a) && C5207g.m11106a(this.f18924b, resultRegistrationValidation.f18924b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        ValidationMessage validationMessage = this.f18923a;
        int iHashCode2 = (validationMessage == null ? 0 : validationMessage.hashCode()) * 31;
        ValidationMessage validationMessage2 = this.f18924b;
        if (validationMessage2 != null) {
            iHashCode = validationMessage2.hashCode();
        }
        return iHashCode2 + iHashCode;
    }

    public final String toString() {
        return "ResultRegistrationValidation(email=" + this.f18923a + ", username=" + this.f18924b + ")";
    }
}
