package com.lingq.core.domain.model.token;

import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class TokenForumTopic {
    public static final C1491g Companion = new C1491g();

    /* JADX INFO: renamed from: a */
    public final String f19590a;

    /* JADX INFO: renamed from: b */
    public final String f19591b;

    public /* synthetic */ TokenForumTopic(String str, int i, String str2) {
        if ((i & 1) == 0) {
            this.f19590a = "";
        } else {
            this.f19590a = str;
        }
        if ((i & 2) == 0) {
            this.f19591b = "";
        } else {
            this.f19591b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenForumTopic)) {
            return false;
        }
        TokenForumTopic tokenForumTopic = (TokenForumTopic) obj;
        return fa4.m11650l(this.f19590a, tokenForumTopic.f19590a) && fa4.m11650l(this.f19591b, tokenForumTopic.f19591b);
    }

    public final int hashCode() {
        return this.f19591b.hashCode() + (this.f19590a.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("TokenForumTopic(url=", this.f19590a, ", title=", this.f19591b, ")");
    }
}
