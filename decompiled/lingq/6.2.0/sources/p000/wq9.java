package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class wq9 {

    /* JADX INFO: renamed from: a */
    public final String f67189a;

    /* JADX INFO: renamed from: b */
    public final String f67190b;

    /* JADX INFO: renamed from: c */
    public final String f67191c;

    /* JADX INFO: renamed from: d */
    public final List f67192d;

    /* JADX INFO: renamed from: e */
    public final List f67193e;

    public wq9(String str, String str2, String str3, List list, List list2) {
        ux5.m22974A(str, str2, str3);
        this.f67189a = str;
        this.f67190b = str2;
        this.f67191c = str3;
        this.f67192d = list;
        this.f67193e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wq9)) {
            return false;
        }
        wq9 wq9Var = (wq9) obj;
        if (fa4.m11650l(this.f67189a, wq9Var.f67189a) && fa4.m11650l(this.f67190b, wq9Var.f67190b) && fa4.m11650l(this.f67191c, wq9Var.f67191c) && this.f67192d.equals(wq9Var.f67192d)) {
            return this.f67193e.equals(wq9Var.f67193e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f67193e.hashCode() + ux5.m22979b(ux5.m22980c(ux5.m22980c(this.f67189a.hashCode() * 31, this.f67190b, 31), this.f67191c, 31), 31, this.f67192d);
    }

    public final String toString() {
        return wk9.m24028K(wk9.m24030M("\n            |ForeignKey {\n            |   referenceTable = '" + this.f67189a + "',\n            |   onDelete = '" + this.f67190b + "',\n            |   onUpdate = '" + this.f67191c + "',\n            |   columnNames = {" + e6d.m10899d(u91.m22613e1(this.f67192d)) + "\n            |   referenceColumnNames = {" + e6d.m10898c(u91.m22613e1(this.f67193e)) + "\n            |}\n        "), "    ");
    }
}
