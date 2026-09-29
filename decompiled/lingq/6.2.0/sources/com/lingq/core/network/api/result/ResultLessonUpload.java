package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultLessonUpload {
    public static final C1669i2 Companion = new C1669i2();

    /* JADX INFO: renamed from: a */
    public final String f21201a;

    /* JADX INFO: renamed from: b */
    public final String f21202b;

    /* JADX INFO: renamed from: c */
    public final Integer f21203c;

    /* JADX INFO: renamed from: d */
    public final String f21204d;

    public /* synthetic */ ResultLessonUpload(int i, Integer num, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f21201a = null;
        } else {
            this.f21201a = str;
        }
        if ((i & 2) == 0) {
            this.f21202b = "";
        } else {
            this.f21202b = str2;
        }
        if ((i & 4) == 0) {
            this.f21203c = null;
        } else {
            this.f21203c = num;
        }
        if ((i & 8) == 0) {
            this.f21204d = null;
        } else {
            this.f21204d = str3;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m8367a() {
        return this.f21202b;
    }

    /* JADX INFO: renamed from: b */
    public final Integer m8368b() {
        return this.f21203c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultLessonUpload)) {
            return false;
        }
        ResultLessonUpload resultLessonUpload = (ResultLessonUpload) obj;
        return fa4.m11650l(this.f21201a, resultLessonUpload.f21201a) && fa4.m11650l(this.f21202b, resultLessonUpload.f21202b) && fa4.m11650l(this.f21203c, resultLessonUpload.f21203c) && fa4.m11650l(this.f21204d, resultLessonUpload.f21204d);
    }

    public final int hashCode() {
        String str = this.f21201a;
        int iM22980c = ux5.m22980c((str == null ? 0 : str.hashCode()) * 31, this.f21202b, 31);
        Integer num = this.f21203c;
        int iHashCode = (iM22980c + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f21204d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("ResultLessonUpload(accent=", this.f21201a, ", audio=", this.f21202b, ", duration=");
        sbM23000w.append(this.f21203c);
        sbM23000w.append(", externalAudio=");
        sbM23000w.append(this.f21204d);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}
