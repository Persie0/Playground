package com.lingq.core.network.api.requests;

import p000.ey8;
import p000.fa4;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class SentenceFragment {
    public static final C1575g1 Companion = new C1575g1();

    /* JADX INFO: renamed from: a */
    public final String f20494a;

    /* JADX INFO: renamed from: b */
    public final boolean f20495b;

    public /* synthetic */ SentenceFragment(String str, int i, boolean z) {
        this.f20494a = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.f20495b = false;
        } else {
            this.f20495b = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SentenceFragment)) {
            return false;
        }
        SentenceFragment sentenceFragment = (SentenceFragment) obj;
        return fa4.m11650l(this.f20494a, sentenceFragment.f20494a) && this.f20495b == sentenceFragment.f20495b;
    }

    public final int hashCode() {
        String str = this.f20494a;
        return Boolean.hashCode(this.f20495b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "SentenceFragment(text=" + this.f20494a + ", isOccurrence=" + this.f20495b + ")";
    }
}
