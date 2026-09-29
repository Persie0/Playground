package com.lingq.core.network.api.result;

import kotlinx.serialization.descriptors.SerialDescriptor;
import p000.ey8;
import p000.fa4;
import p000.mk9;
import p000.sk9;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LessonSourceBlacklist {
    public static final C1678k Companion = new C1678k();

    /* JADX INFO: renamed from: a */
    public final String f20556a;

    public /* synthetic */ LessonSourceBlacklist(int i, String str) {
        if ((i & 1) == 0) {
            this.f20556a = null;
        } else {
            this.f20556a = str;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ void m8304b(LessonSourceBlacklist lessonSourceBlacklist, mk9 mk9Var, SerialDescriptor serialDescriptor) {
        String str = lessonSourceBlacklist.f20556a;
        if (!mk9Var.m16872B(serialDescriptor) && str == null) {
            return;
        }
        mk9Var.m16880x(serialDescriptor, 0, sk9.f60959a, str);
    }

    /* JADX INFO: renamed from: a */
    public final String m8305a() {
        return this.f20556a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LessonSourceBlacklist) && fa4.m11650l(this.f20556a, ((LessonSourceBlacklist) obj).f20556a);
    }

    public final int hashCode() {
        String str = this.f20556a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("LessonSourceBlacklist(name=", this.f20556a, ")");
    }
}
