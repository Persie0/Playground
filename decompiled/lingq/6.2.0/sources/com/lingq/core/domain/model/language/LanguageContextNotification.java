package com.lingq.core.domain.model.language;

import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class LanguageContextNotification {
    public static final C1426f Companion = new C1426f();

    /* JADX INFO: renamed from: a */
    public final String f19044a;

    /* JADX INFO: renamed from: b */
    public final String f19045b;

    public /* synthetic */ LanguageContextNotification(String str, int i, String str2) {
        if ((i & 1) == 0) {
            this.f19044a = "";
        } else {
            this.f19044a = str;
        }
        if ((i & 2) == 0) {
            this.f19045b = "";
        } else {
            this.f19045b = str2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static LanguageContextNotification m8024a(LanguageContextNotification languageContextNotification, String str) {
        String str2 = languageContextNotification.f19045b;
        str2.getClass();
        return new LanguageContextNotification(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LanguageContextNotification)) {
            return false;
        }
        LanguageContextNotification languageContextNotification = (LanguageContextNotification) obj;
        return fa4.m11650l(this.f19044a, languageContextNotification.f19044a) && fa4.m11650l(this.f19045b, languageContextNotification.f19045b);
    }

    public final int hashCode() {
        return this.f19045b.hashCode() + (this.f19044a.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("LanguageContextNotification(lotd=", this.f19044a, ", weekly=", this.f19045b, ")");
    }

    public LanguageContextNotification(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f19044a = str;
        this.f19045b = str2;
    }
}
