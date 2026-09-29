package com.lingq.entity;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/LessonUserCompleted;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class LessonUserCompleted {

    /* JADX INFO: renamed from: a */
    public final String f17188a;

    /* JADX INFO: renamed from: b */
    public final Date f17189b;

    /* JADX WARN: Multi-variable type inference failed */
    public LessonUserCompleted() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public LessonUserCompleted(String str, Date date) {
        this.f17188a = str;
        this.f17189b = date;
    }

    public /* synthetic */ LessonUserCompleted(String str, Date date, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : date);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonUserCompleted)) {
            return false;
        }
        LessonUserCompleted lessonUserCompleted = (LessonUserCompleted) obj;
        return C5207g.m11106a(this.f17188a, lessonUserCompleted.f17188a) && C5207g.m11106a(this.f17189b, lessonUserCompleted.f17189b);
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f17188a;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) * 31;
        Date date = this.f17189b;
        if (date != null) {
            iHashCode = date.hashCode();
        }
        return iHashCode2 + iHashCode;
    }

    public final String toString() {
        return "LessonUserCompleted(username=" + this.f17188a + ", completed=" + this.f17189b + ")";
    }
}
