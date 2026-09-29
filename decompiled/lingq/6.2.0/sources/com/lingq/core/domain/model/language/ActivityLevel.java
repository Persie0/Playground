package com.lingq.core.domain.model.language;

import p000.ey8;
import p000.ux5;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class ActivityLevel {
    public static final C1421a Companion = new C1421a();

    /* JADX INFO: renamed from: a */
    public final int f19003a;

    /* JADX INFO: renamed from: b */
    public final int f19004b;

    public /* synthetic */ ActivityLevel(int i, int i2, int i3) {
        if ((i & 1) == 0) {
            this.f19003a = 0;
        } else {
            this.f19003a = i2;
        }
        if ((i & 2) == 0) {
            this.f19004b = 0;
        } else {
            this.f19004b = i3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityLevel)) {
            return false;
        }
        ActivityLevel activityLevel = (ActivityLevel) obj;
        return this.f19003a == activityLevel.f19003a && this.f19004b == activityLevel.f19004b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19004b) + (Integer.hashCode(this.f19003a) * 31);
    }

    public final String toString() {
        return ux5.m22987j(this.f19003a, this.f19004b, "ActivityLevel(id=", ", score=", ")");
    }

    public ActivityLevel(int i, int i2) {
        this.f19003a = i;
        this.f19004b = i2;
    }
}
