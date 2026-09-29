package com.lingq.shared.uimodel.library;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/uimodel/library/CollectionsFilterLessonTag;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class CollectionsFilterLessonTag {

    /* JADX INFO: renamed from: a */
    public final String f21922a;

    /* JADX WARN: Multi-variable type inference failed */
    public CollectionsFilterLessonTag() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public CollectionsFilterLessonTag(String str) {
        this.f21922a = str;
    }

    public /* synthetic */ CollectionsFilterLessonTag(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof CollectionsFilterLessonTag) && C5207g.m11106a(this.f21922a, ((CollectionsFilterLessonTag) obj).f21922a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f21922a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return C0009a.m23l(new StringBuilder("CollectionsFilterLessonTag(title="), this.f21922a, ")");
    }
}
