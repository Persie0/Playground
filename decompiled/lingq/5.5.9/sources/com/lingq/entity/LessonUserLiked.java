package com.lingq.entity;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/LessonUserLiked;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class LessonUserLiked {

    /* JADX INFO: renamed from: a */
    public final String f17194a;

    /* JADX INFO: renamed from: b */
    public final Date f17195b;

    /* JADX WARN: Multi-variable type inference failed */
    public LessonUserLiked() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public LessonUserLiked(String str, Date date) {
        this.f17194a = str;
        this.f17195b = date;
    }

    public /* synthetic */ LessonUserLiked(String str, Date date, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : date);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonUserLiked)) {
            return false;
        }
        LessonUserLiked lessonUserLiked = (LessonUserLiked) obj;
        return C5207g.m11106a(this.f17194a, lessonUserLiked.f17194a) && C5207g.m11106a(this.f17195b, lessonUserLiked.f17195b);
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f17194a;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) * 31;
        Date date = this.f17195b;
        if (date != null) {
            iHashCode = date.hashCode();
        }
        return iHashCode2 + iHashCode;
    }

    public final String toString() {
        return "LessonUserLiked(username=" + this.f17194a + ", liked=" + this.f17195b + ")";
    }
}
