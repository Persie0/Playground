package com.lingq.core.network.api.requests;

import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class RequestPlaylistLessonAction {
    public static final C1591o0 Companion = new C1591o0();

    /* JADX INFO: renamed from: a */
    public String f20417a;

    /* JADX INFO: renamed from: b */
    public String f20418b;

    /* JADX INFO: renamed from: c */
    public Integer f20419c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestPlaylistLessonAction)) {
            return false;
        }
        RequestPlaylistLessonAction requestPlaylistLessonAction = (RequestPlaylistLessonAction) obj;
        return fa4.m11650l(this.f20417a, requestPlaylistLessonAction.f20417a) && fa4.m11650l(this.f20418b, requestPlaylistLessonAction.f20418b) && fa4.m11650l(this.f20419c, requestPlaylistLessonAction.f20419c);
    }

    public final int hashCode() {
        String str = this.f20417a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f20418b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f20419c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f20417a;
        String str2 = this.f20418b;
        Integer num = this.f20419c;
        StringBuilder sbM23000w = ux5.m23000w("RequestPlaylistLessonAction(lessonURL=", str, ", action=", str2, ", position=");
        sbM23000w.append(num);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}
