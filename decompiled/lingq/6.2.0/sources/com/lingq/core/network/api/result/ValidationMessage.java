package com.lingq.core.network.api.result;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.cs4;
import p000.e5a;
import p000.ey8;
import p000.fa4;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ValidationMessage {
    public static final C1641d5 Companion = new C1641d5();

    /* JADX INFO: renamed from: c */
    public static final cs4[] f21744c = {AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new e5a(13)), null};

    /* JADX INFO: renamed from: a */
    public final List f21745a;

    /* JADX INFO: renamed from: b */
    public final boolean f21746b;

    public /* synthetic */ ValidationMessage(int i, List list, boolean z) {
        this.f21745a = (i & 1) == 0 ? EmptyList.f47638a : list;
        if ((i & 2) == 0) {
            this.f21746b = false;
        } else {
            this.f21746b = z;
        }
    }

    /* JADX INFO: renamed from: a */
    public final List m8406a() {
        return this.f21745a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidationMessage)) {
            return false;
        }
        ValidationMessage validationMessage = (ValidationMessage) obj;
        return fa4.m11650l(this.f21745a, validationMessage.f21745a) && this.f21746b == validationMessage.f21746b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21746b) + (this.f21745a.hashCode() * 31);
    }

    public final String toString() {
        return "ValidationMessage(message=" + this.f21745a + ", isValid=" + this.f21746b + ")";
    }
}
