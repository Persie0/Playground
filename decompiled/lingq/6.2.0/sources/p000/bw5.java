package p000;

import android.graphics.Bitmap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bw5 {

    /* JADX INFO: renamed from: a */
    public final Bitmap f9094a;

    /* JADX INFO: renamed from: b */
    public final Map f9095b;

    public bw5(Bitmap bitmap, Map map) {
        this.f9094a = bitmap;
        this.f9095b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw5)) {
            return false;
        }
        bw5 bw5Var = (bw5) obj;
        return this.f9094a.equals(bw5Var.f9094a) && fa4.m11650l(this.f9095b, bw5Var.f9095b);
    }

    public final int hashCode() {
        return this.f9095b.hashCode() + (this.f9094a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(bitmap=" + this.f9094a + ", extras=" + this.f9095b + ')';
    }
}
