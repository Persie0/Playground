package com.lingq.core.domain.model.library;

import kotlinx.serialization.descriptors.SerialDescriptor;
import p000.ey8;
import p000.fa4;
import p000.mk9;
import p000.sk9;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class CollectionsFilter {
    public static final C1459a Companion = new C1459a();

    /* JADX INFO: renamed from: a */
    public final int f19337a;

    /* JADX INFO: renamed from: b */
    public final String f19338b;

    /* JADX INFO: renamed from: c */
    public final String f19339c;

    /* JADX INFO: renamed from: d */
    public final String f19340d;

    public /* synthetic */ CollectionsFilter(int i, int i2, String str, String str2, String str3) {
        this.f19337a = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.f19338b = "";
        } else {
            this.f19338b = str;
        }
        if ((i & 4) == 0) {
            this.f19339c = "";
        } else {
            this.f19339c = str2;
        }
        if ((i & 8) == 0) {
            this.f19340d = null;
        } else {
            this.f19340d = str3;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ void m8081b(CollectionsFilter collectionsFilter, mk9 mk9Var, SerialDescriptor serialDescriptor) {
        String str = collectionsFilter.f19340d;
        String str2 = collectionsFilter.f19339c;
        String str3 = collectionsFilter.f19338b;
        int i = collectionsFilter.f19337a;
        if (mk9Var.m16872B(serialDescriptor) || i != 0) {
            mk9Var.m16878v(0, i, serialDescriptor);
        }
        if (mk9Var.m16872B(serialDescriptor) || !fa4.m11650l(str3, "")) {
            mk9Var.m16882z(serialDescriptor, 1, str3);
        }
        if (mk9Var.m16872B(serialDescriptor) || !fa4.m11650l(str2, "")) {
            mk9Var.m16882z(serialDescriptor, 2, str2);
        }
        if (!mk9Var.m16872B(serialDescriptor) && str == null) {
            return;
        }
        mk9Var.m16880x(serialDescriptor, 3, sk9.f60959a, str);
    }

    /* JADX INFO: renamed from: a */
    public final int m8082a() {
        return this.f19337a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionsFilter)) {
            return false;
        }
        CollectionsFilter collectionsFilter = (CollectionsFilter) obj;
        return this.f19337a == collectionsFilter.f19337a && fa4.m11650l(this.f19338b, collectionsFilter.f19338b) && fa4.m11650l(this.f19339c, collectionsFilter.f19339c) && fa4.m11650l(this.f19340d, collectionsFilter.f19340d);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(ux5.m22980c(Integer.hashCode(this.f19337a) * 31, this.f19338b, 31), this.f19339c, 31);
        String str = this.f19340d;
        return iM22980c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return wq1.m24125u(ux5.m22995r(this.f19337a, "CollectionsFilter(id=", ", username=", this.f19338b, ", photo="), this.f19339c, ", role=", this.f19340d, ")");
    }

    public CollectionsFilter(String str, int i, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.f19337a = i;
        this.f19338b = str;
        this.f19339c = str2;
        this.f19340d = str3;
    }
}
