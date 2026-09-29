package com.lingq.entity;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/LessonTag;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class LessonTag {

    /* JADX INFO: renamed from: a */
    public final String f17170a;

    public LessonTag(String str) {
        this.f17170a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LessonTag) && C5207g.m11106a(this.f17170a, ((LessonTag) obj).f17170a);
    }

    public final int hashCode() {
        return this.f17170a.hashCode();
    }

    public final String toString() {
        return C0009a.m23l(new StringBuilder("LessonTag(title="), this.f17170a, ")");
    }
}
