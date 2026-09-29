package com.lingq.core.database.entity;

import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class MilestoneMetEntity {
    public static final C1329c0 Companion = new C1329c0();

    /* JADX INFO: renamed from: a */
    public final String f17399a;

    /* JADX INFO: renamed from: b */
    public final String f17400b;

    public /* synthetic */ MilestoneMetEntity(String str, int i, String str2) {
        if (3 != (i & 3)) {
            n3c.m17204b(i, 3, MilestoneMetEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17399a = str;
        this.f17400b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m7768a() {
        return this.f17399a;
    }

    /* JADX INFO: renamed from: b */
    public final String m7769b() {
        return this.f17400b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MilestoneMetEntity)) {
            return false;
        }
        MilestoneMetEntity milestoneMetEntity = (MilestoneMetEntity) obj;
        return fa4.m11650l(this.f17399a, milestoneMetEntity.f17399a) && fa4.m11650l(this.f17400b, milestoneMetEntity.f17400b);
    }

    public final int hashCode() {
        return this.f17400b.hashCode() + (this.f17399a.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("MilestoneMetEntity(languageAndSlug=", this.f17399a, ", metAt=", this.f17400b, ")");
    }

    public MilestoneMetEntity(String str, String str2) {
        str2.getClass();
        this.f17399a = str;
        this.f17400b = str2;
    }
}
