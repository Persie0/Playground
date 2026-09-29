package com.lingq.core.domain.model.lesson;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class Translation {
    public static final C1458w Companion = new C1458w();

    /* JADX INFO: renamed from: a */
    public final String f19334a;

    /* JADX INFO: renamed from: b */
    public final String f19335b;

    /* JADX INFO: renamed from: c */
    public final boolean f19336c;

    public /* synthetic */ Translation(String str, int i, String str2, boolean z) {
        if (7 != (i & 7)) {
            n3c.m17204b(i, 7, Translation$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19334a = str;
        this.f19335b = str2;
        this.f19336c = z;
    }

    /* JADX INFO: renamed from: a */
    public final String m8078a() {
        return this.f19335b;
    }

    /* JADX INFO: renamed from: b */
    public final String m8079b() {
        return this.f19334a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m8080c() {
        return this.f19336c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Translation)) {
            return false;
        }
        Translation translation = (Translation) obj;
        return fa4.m11650l(this.f19334a, translation.f19334a) && fa4.m11650l(this.f19335b, translation.f19335b) && this.f19336c == translation.f19336c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19336c) + ux5.m22980c(this.f19334a.hashCode() * 31, this.f19335b, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17740o(ux5.m23000w("Translation(text=", this.f19334a, ", language=", this.f19335b, ", isGoogleTranslated="), this.f19336c, ")");
    }

    public Translation(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f19334a = str;
        this.f19335b = str2;
        this.f19336c = z;
    }
}
