package p000;

import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class i32 {

    /* JADX INFO: renamed from: a */
    public final BitmapDrawable f43397a;

    /* JADX INFO: renamed from: b */
    public final boolean f43398b;

    public i32(BitmapDrawable bitmapDrawable, boolean z) {
        this.f43397a = bitmapDrawable;
        this.f43398b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i32)) {
            return false;
        }
        i32 i32Var = (i32) obj;
        return this.f43397a.equals(i32Var.f43397a) && this.f43398b == i32Var.f43398b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f43398b) + (this.f43397a.hashCode() * 31);
    }
}
