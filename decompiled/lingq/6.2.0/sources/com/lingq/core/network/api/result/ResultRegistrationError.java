package com.lingq.core.network.api.result;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.g98;
import p000.x88;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultRegistrationError {
    public static final C1700n3 Companion = new C1700n3();

    /* JADX INFO: renamed from: c */
    public static final cs4[] f21479c;

    /* JADX INFO: renamed from: a */
    public List f21480a;

    /* JADX INFO: renamed from: b */
    public List f21481b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f21479c = new cs4[]{AbstractC3192a.m15357b(lazyThreadSafetyMode, new x88(29)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new g98(0))};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultRegistrationError)) {
            return false;
        }
        ResultRegistrationError resultRegistrationError = (ResultRegistrationError) obj;
        return fa4.m11650l(this.f21480a, resultRegistrationError.f21480a) && fa4.m11650l(this.f21481b, resultRegistrationError.f21481b);
    }

    public final int hashCode() {
        return this.f21481b.hashCode() + (this.f21480a.hashCode() * 31);
    }

    public final String toString() {
        return "ResponseRegistrationError{emailError=" + this.f21480a + ", usernameError=" + this.f21481b + "}";
    }
}
