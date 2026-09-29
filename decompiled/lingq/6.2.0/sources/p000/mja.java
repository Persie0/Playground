package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class mja extends az3 {

    /* JADX INFO: renamed from: b */
    public final String f51412b;

    /* JADX INFO: renamed from: c */
    public final String f51413c;

    public mja(String str, String str2, String str3) {
        super(str);
        this.f51412b = str2;
        this.f51413c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mja.class != obj.getClass()) {
            return false;
        }
        mja mjaVar = (mja) obj;
        return this.f7687a.equals(mjaVar.f7687a) && Objects.equals(this.f51412b, mjaVar.f51412b) && this.f51413c.equals(mjaVar.f51413c);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(527, this.f7687a, 31);
        String str = this.f51412b;
        return this.f51413c.hashCode() + ((iM22980c + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // p000.az3
    public final String toString() {
        return this.f7687a + ": url=" + this.f51413c;
    }
}
