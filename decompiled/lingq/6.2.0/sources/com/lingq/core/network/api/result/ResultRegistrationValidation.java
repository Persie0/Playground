package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultRegistrationValidation {
    public static final C1706o3 Companion = new C1706o3();

    /* JADX INFO: renamed from: a */
    public final ValidationMessage f21482a;

    /* JADX INFO: renamed from: b */
    public final ValidationMessage f21483b;

    public /* synthetic */ ResultRegistrationValidation(int i, ValidationMessage validationMessage, ValidationMessage validationMessage2) {
        if ((i & 1) == 0) {
            this.f21482a = null;
        } else {
            this.f21482a = validationMessage;
        }
        if ((i & 2) == 0) {
            this.f21483b = null;
        } else {
            this.f21483b = validationMessage2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final ValidationMessage m8387a() {
        return this.f21482a;
    }

    /* JADX INFO: renamed from: b */
    public final ValidationMessage m8388b() {
        return this.f21483b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultRegistrationValidation)) {
            return false;
        }
        ResultRegistrationValidation resultRegistrationValidation = (ResultRegistrationValidation) obj;
        return fa4.m11650l(this.f21482a, resultRegistrationValidation.f21482a) && fa4.m11650l(this.f21483b, resultRegistrationValidation.f21483b);
    }

    public final int hashCode() {
        ValidationMessage validationMessage = this.f21482a;
        int iHashCode = (validationMessage == null ? 0 : validationMessage.hashCode()) * 31;
        ValidationMessage validationMessage2 = this.f21483b;
        return iHashCode + (validationMessage2 != null ? validationMessage2.hashCode() : 0);
    }

    public final String toString() {
        return "ResultRegistrationValidation(email=" + this.f21482a + ", username=" + this.f21483b + ")";
    }
}
