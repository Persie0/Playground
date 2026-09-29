package p000;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public final class h04 {

    /* JADX INFO: renamed from: a */
    public final String f41605a;

    /* JADX INFO: renamed from: b */
    public final String f41606b;

    /* JADX INFO: renamed from: c */
    public final String f41607c;

    /* JADX INFO: renamed from: d */
    public final Bitmap f41608d;

    /* JADX INFO: renamed from: e */
    public final zj8 f41609e;

    public h04(String str, String str2, String str3, Bitmap bitmap, zj8 zj8Var) {
        str.getClass();
        str2.getClass();
        this.f41605a = str;
        this.f41606b = str2;
        this.f41607c = str3;
        this.f41608d = bitmap;
        this.f41609e = zj8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h04) {
            h04 h04Var = (h04) obj;
            return fa4.m11650l(this.f41605a, h04Var.f41605a) && fa4.m11650l(this.f41606b, h04Var.f41606b) && this.f41607c.equals(h04Var.f41607c) && fa4.m11650l(this.f41608d, h04Var.f41608d) && this.f41609e == h04Var.f41609e;
        }
        return false;
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(ux5.m22980c(this.f41605a.hashCode() * 31, this.f41606b, 31), this.f41607c, 31);
        Bitmap bitmap = this.f41608d;
        return this.f41609e.hashCode() + ((iM22980c + (bitmap == null ? 0 : bitmap.hashCode())) * 29791);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("ImageTextListItemData(key=", this.f41605a, ", title=", this.f41606b, ", supportingText=");
        sbM23000w.append(this.f41607c);
        sbM23000w.append(", supportingImageBitmap=");
        sbM23000w.append(this.f41608d);
        sbM23000w.append(", trailingIconButton=null, trailingIconButtonContentDescription=null, action=");
        sbM23000w.append(this.f41609e);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}
