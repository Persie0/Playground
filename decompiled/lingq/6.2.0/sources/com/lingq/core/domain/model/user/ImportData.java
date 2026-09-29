package com.lingq.core.domain.model.user;

import p000.ey8;
import p000.fa4;
import p000.ux5;
import p000.vk9;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class ImportData {
    public static final C1503e Companion = new C1503e();

    /* JADX INFO: renamed from: a */
    public final String f19637a;

    /* JADX INFO: renamed from: b */
    public final String f19638b;

    /* JADX INFO: renamed from: c */
    public final String f19639c;

    /* JADX INFO: renamed from: d */
    public final String f19640d;

    /* JADX INFO: renamed from: e */
    public final boolean f19641e;

    public /* synthetic */ ImportData(int i, String str, String str2, String str3, String str4, boolean z) {
        String str5;
        String str6;
        if ((i & 1) == 0) {
            this.f19637a = null;
        } else {
            this.f19637a = str;
        }
        if ((i & 2) == 0) {
            this.f19638b = null;
        } else {
            this.f19638b = str2;
        }
        if ((i & 4) == 0) {
            this.f19639c = null;
        } else {
            this.f19639c = str3;
        }
        if ((i & 8) == 0) {
            this.f19640d = null;
        } else {
            this.f19640d = str4;
        }
        if ((i & 16) != 0) {
            this.f19641e = z;
            return;
        }
        String str7 = this.f19638b;
        boolean z2 = true;
        if ((str7 == null || !(!vk9.m23391n0(str7))) && (((str5 = this.f19639c) == null || !(!vk9.m23391n0(str5))) && ((str6 = this.f19640d) == null || !(!vk9.m23391n0(str6))))) {
            z2 = false;
        }
        this.f19641e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImportData)) {
            return false;
        }
        ImportData importData = (ImportData) obj;
        return fa4.m11650l(this.f19637a, importData.f19637a) && fa4.m11650l(this.f19638b, importData.f19638b) && fa4.m11650l(this.f19639c, importData.f19639c) && fa4.m11650l(this.f19640d, importData.f19640d);
    }

    public final int hashCode() {
        String str = this.f19637a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f19638b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f19639c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f19640d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return wq1.m24125u(ux5.m23000w("ImportData(title=", this.f19637a, ", url=", this.f19638b, ", imageUri="), this.f19639c, ", fileUri=", this.f19640d, ")");
    }

    public ImportData(String str, String str2, String str3, String str4) {
        this.f19637a = str;
        this.f19638b = str2;
        this.f19639c = str3;
        this.f19640d = str4;
        boolean z = true;
        if ((str2 == null || !(!vk9.m23391n0(str2))) && ((str3 == null || !(!vk9.m23391n0(str3))) && (str4 == null || !(!vk9.m23391n0(str4))))) {
            z = false;
        }
        this.f19641e = z;
    }
}
