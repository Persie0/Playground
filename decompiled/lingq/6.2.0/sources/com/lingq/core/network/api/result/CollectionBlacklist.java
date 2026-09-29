package com.lingq.core.network.api.result;

import kotlinx.serialization.descriptors.SerialDescriptor;
import p000.ey8;
import p000.fa4;
import p000.l84;
import p000.mk9;
import p000.sk9;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class CollectionBlacklist {
    public static final C1642e Companion = new C1642e();

    /* JADX INFO: renamed from: a */
    public final Integer f20516a;

    /* JADX INFO: renamed from: b */
    public final String f20517b;

    public /* synthetic */ CollectionBlacklist(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.f20516a = null;
        } else {
            this.f20516a = num;
        }
        if ((i & 2) == 0) {
            this.f20517b = null;
        } else {
            this.f20517b = str;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ void m8280c(CollectionBlacklist collectionBlacklist, mk9 mk9Var, SerialDescriptor serialDescriptor) {
        String str = collectionBlacklist.f20517b;
        Integer num = collectionBlacklist.f20516a;
        if (mk9Var.m16872B(serialDescriptor) || num != null) {
            mk9Var.m16880x(serialDescriptor, 0, l84.f49294a, num);
        }
        if (!mk9Var.m16872B(serialDescriptor) && str == null) {
            return;
        }
        mk9Var.m16880x(serialDescriptor, 1, sk9.f60959a, str);
    }

    /* JADX INFO: renamed from: a */
    public final Integer m8281a() {
        return this.f20516a;
    }

    /* JADX INFO: renamed from: b */
    public final String m8282b() {
        return this.f20517b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionBlacklist)) {
            return false;
        }
        CollectionBlacklist collectionBlacklist = (CollectionBlacklist) obj;
        return fa4.m11650l(this.f20516a, collectionBlacklist.f20516a) && fa4.m11650l(this.f20517b, collectionBlacklist.f20517b);
    }

    public final int hashCode() {
        Integer num = this.f20516a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f20517b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "CollectionBlacklist(id=" + this.f20516a + ", title=" + this.f20517b + ")";
    }
}
