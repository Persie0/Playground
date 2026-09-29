package com.lingq.core.network.api.result;

import com.lingq.core.domain.model.LearningLevel;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class ResultLibraryTab {
    public static final C1705o2 Companion = new C1705o2();

    /* JADX INFO: renamed from: a */
    public final String f21302a;

    /* JADX INFO: renamed from: b */
    public final String f21303b;

    /* JADX INFO: renamed from: c */
    public final int f21304c;

    /* JADX INFO: renamed from: d */
    public final boolean f21305d;

    /* JADX INFO: renamed from: e */
    public final int f21306e;

    /* JADX INFO: renamed from: f */
    public final String f21307f;

    public /* synthetic */ ResultLibraryTab(int i, String str, String str2, int i2, boolean z, int i3, String str3) {
        this.f21302a = (i & 1) == 0 ? "Lessons" : str;
        if ((i & 2) == 0) {
            this.f21303b = "";
        } else {
            this.f21303b = str2;
        }
        if ((i & 4) == 0) {
            this.f21304c = LearningLevel.Beginner1.ordinal();
        } else {
            this.f21304c = i2;
        }
        if ((i & 8) == 0) {
            this.f21305d = false;
        } else {
            this.f21305d = z;
        }
        if ((i & 16) == 0) {
            this.f21306e = 0;
        } else {
            this.f21306e = i3;
        }
        if ((i & 32) == 0) {
            this.f21307f = "";
        } else {
            this.f21307f = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultLibraryTab)) {
            return false;
        }
        ResultLibraryTab resultLibraryTab = (ResultLibraryTab) obj;
        return fa4.m11650l(this.f21302a, resultLibraryTab.f21302a) && fa4.m11650l(this.f21303b, resultLibraryTab.f21303b) && this.f21304c == resultLibraryTab.f21304c && this.f21305d == resultLibraryTab.f21305d && this.f21306e == resultLibraryTab.f21306e && fa4.m11650l(this.f21307f, resultLibraryTab.f21307f);
    }

    public final int hashCode() {
        return this.f21307f.hashCode() + wq1.m24106b(this.f21306e, g9a.m12428e(wq1.m24106b(this.f21304c, ux5.m22980c(this.f21302a.hashCode() * 31, this.f21303b, 31), 31), 31, this.f21305d), 31);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("ResultLibraryTab(title=", this.f21302a, ", display=", this.f21303b, ", level=");
        hn1.m13368r(sbM23000w, this.f21304c, ", selected=", this.f21305d, ", index=");
        sbM23000w.append(this.f21306e);
        sbM23000w.append(", apiUrl=");
        sbM23000w.append(this.f21307f);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}
