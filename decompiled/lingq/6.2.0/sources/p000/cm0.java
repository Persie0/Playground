package p000;

import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public final class cm0 {

    /* JADX INFO: renamed from: a */
    public final int f10257a;

    /* JADX INFO: renamed from: b */
    public final int f10258b;

    /* JADX INFO: renamed from: c */
    public final Intent f10259c;

    public cm0(int i, int i2, Intent intent) {
        this.f10257a = i;
        this.f10258b = i2;
        this.f10259c = intent;
    }

    /* JADX INFO: renamed from: a */
    public final Intent m4848a() {
        return this.f10259c;
    }

    /* JADX INFO: renamed from: b */
    public final int m4849b() {
        return this.f10258b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cm0)) {
            return false;
        }
        cm0 cm0Var = (cm0) obj;
        return this.f10257a == cm0Var.f10257a && this.f10258b == cm0Var.f10258b && fa4.m11650l(this.f10259c, cm0Var.f10259c);
    }

    public final int hashCode() {
        int iM24106b = wq1.m24106b(this.f10258b, Integer.hashCode(this.f10257a) * 31, 31);
        Intent intent = this.f10259c;
        return iM24106b + (intent == null ? 0 : intent.hashCode());
    }

    public final String toString() {
        return "ActivityResultParameters(requestCode=" + this.f10257a + ", resultCode=" + this.f10258b + ", data=" + this.f10259c + ')';
    }
}
