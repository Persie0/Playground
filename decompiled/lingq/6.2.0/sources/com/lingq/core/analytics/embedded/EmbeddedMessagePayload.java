package com.lingq.core.analytics.embedded;

import p000.ey8;
import p000.fa4;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class EmbeddedMessagePayload {
    public static final C1256f Companion = new C1256f();

    /* JADX INFO: renamed from: a */
    public final String f14337a;

    /* JADX INFO: renamed from: b */
    public final String f14338b;

    /* JADX INFO: renamed from: c */
    public final String f14339c;

    /* JADX INFO: renamed from: d */
    public final String f14340d;

    public /* synthetic */ EmbeddedMessagePayload(int i, String str, String str2, String str3, String str4) {
        if ((i & 1) == 0) {
            this.f14337a = "";
        } else {
            this.f14337a = str;
        }
        if ((i & 2) == 0) {
            this.f14338b = "";
        } else {
            this.f14338b = str2;
        }
        if ((i & 4) == 0) {
            this.f14339c = "";
        } else {
            this.f14339c = str3;
        }
        if ((i & 8) == 0) {
            this.f14340d = "";
        } else {
            this.f14340d = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmbeddedMessagePayload)) {
            return false;
        }
        EmbeddedMessagePayload embeddedMessagePayload = (EmbeddedMessagePayload) obj;
        return fa4.m11650l(this.f14337a, embeddedMessagePayload.f14337a) && fa4.m11650l(this.f14338b, embeddedMessagePayload.f14338b) && fa4.m11650l(this.f14339c, embeddedMessagePayload.f14339c) && fa4.m11650l(this.f14340d, embeddedMessagePayload.f14340d);
    }

    public final int hashCode() {
        return this.f14340d.hashCode() + ux5.m22980c(ux5.m22980c(this.f14337a.hashCode() * 31, this.f14338b, 31), this.f14339c, 31);
    }

    public final String toString() {
        return wq1.m24125u(ux5.m23000w("EmbeddedMessagePayload(layout=", this.f14337a, ", narrowImage=", this.f14338b, ", wideImage="), this.f14339c, ", textColor=", this.f14340d, ")");
    }

    public EmbeddedMessagePayload() {
        this.f14337a = "";
        this.f14338b = "";
        this.f14339c = "";
        this.f14340d = "";
    }
}
