package com.lingq.core.domain.model.user;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.ux5;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class Login {
    public static final C1505g Companion = new C1505g();

    /* JADX INFO: renamed from: a */
    public String f19646a;

    /* JADX INFO: renamed from: b */
    public String f19647b;

    /* JADX INFO: renamed from: c */
    public String f19648c;

    /* JADX INFO: renamed from: d */
    public boolean f19649d;

    /* JADX INFO: renamed from: e */
    public boolean f19650e;

    public Login(String str, int i, boolean z) {
        str = (i & 2) != 0 ? null : str;
        z = (i & 16) != 0 ? false : z;
        this.f19646a = null;
        this.f19647b = str;
        this.f19648c = null;
        this.f19649d = false;
        this.f19650e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Login)) {
            return false;
        }
        Login login = (Login) obj;
        return fa4.m11650l(this.f19646a, login.f19646a) && fa4.m11650l(this.f19647b, login.f19647b) && fa4.m11650l(this.f19648c, login.f19648c) && this.f19649d == login.f19649d && this.f19650e == login.f19650e;
    }

    public final int hashCode() {
        String str = this.f19646a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f19647b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f19648c;
        return Boolean.hashCode(this.f19650e) + g9a.m12428e((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f19649d);
    }

    public final String toString() {
        String str = this.f19646a;
        String str2 = this.f19647b;
        String str3 = this.f19648c;
        boolean z = this.f19649d;
        boolean z2 = this.f19650e;
        StringBuilder sbM23000w = ux5.m23000w("Login(keyIdentifier=", str, ", token=", str2, ", key=");
        ux5.m22976C(str3, ", isFree=", ", isNewUser=", sbM23000w, z);
        return AbstractC3393o1.m17740o(sbM23000w, z2, ")");
    }
}
