package com.lingq.core.network.api.result;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultFreeAiTts {
    public static final C1692m1 Companion = new C1692m1();

    /* JADX INFO: renamed from: a */
    public final String f20859a;

    /* JADX INFO: renamed from: b */
    public final String f20860b;

    /* JADX INFO: renamed from: c */
    public final String f20861c;

    public /* synthetic */ ResultFreeAiTts(String str, int i, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f20859a = null;
        } else {
            this.f20859a = str;
        }
        if ((i & 2) == 0) {
            this.f20860b = null;
        } else {
            this.f20860b = str2;
        }
        if ((i & 4) == 0) {
            this.f20861c = null;
        } else {
            this.f20861c = str3;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m8359a() {
        return this.f20859a;
    }

    /* JADX INFO: renamed from: b */
    public final String m8360b() {
        return this.f20860b;
    }

    /* JADX INFO: renamed from: c */
    public final String m8361c() {
        return this.f20861c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultFreeAiTts)) {
            return false;
        }
        ResultFreeAiTts resultFreeAiTts = (ResultFreeAiTts) obj;
        return fa4.m11650l(this.f20859a, resultFreeAiTts.f20859a) && fa4.m11650l(this.f20860b, resultFreeAiTts.f20860b) && fa4.m11650l(this.f20861c, resultFreeAiTts.f20861c);
    }

    public final int hashCode() {
        String str = this.f20859a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f20860b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20861c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m23000w("ResultFreeAiTts(audioUrl=", this.f20859a, ", standardAudioUrl=", this.f20860b, ", text="), this.f20861c, ")");
    }
}
