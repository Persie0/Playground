package com.lingq.core.domain.model.library;

import kotlinx.serialization.descriptors.SerialDescriptor;
import p000.ey8;
import p000.fa4;
import p000.l84;
import p000.mk9;
import p000.sk9;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class CollectionsFilterProvider {
    public static final C1461c Companion = new C1461c();

    /* JADX INFO: renamed from: a */
    public final Integer f19342a;

    /* JADX INFO: renamed from: b */
    public final String f19343b;

    public /* synthetic */ CollectionsFilterProvider(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.f19342a = null;
        } else {
            this.f19342a = num;
        }
        if ((i & 2) == 0) {
            this.f19343b = null;
        } else {
            this.f19343b = str;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ void m8083b(CollectionsFilterProvider collectionsFilterProvider, mk9 mk9Var, SerialDescriptor serialDescriptor) {
        String str = collectionsFilterProvider.f19343b;
        Integer num = collectionsFilterProvider.f19342a;
        if (mk9Var.m16872B(serialDescriptor) || num != null) {
            mk9Var.m16880x(serialDescriptor, 0, l84.f49294a, num);
        }
        if (!mk9Var.m16872B(serialDescriptor) && str == null) {
            return;
        }
        mk9Var.m16880x(serialDescriptor, 1, sk9.f60959a, str);
    }

    /* JADX INFO: renamed from: a */
    public final Integer m8084a() {
        return this.f19342a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionsFilterProvider)) {
            return false;
        }
        CollectionsFilterProvider collectionsFilterProvider = (CollectionsFilterProvider) obj;
        return fa4.m11650l(this.f19342a, collectionsFilterProvider.f19342a) && fa4.m11650l(this.f19343b, collectionsFilterProvider.f19343b);
    }

    public final int hashCode() {
        Integer num = this.f19342a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f19343b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "CollectionsFilterProvider(id=" + this.f19342a + ", title=" + this.f19343b + ")";
    }
}
