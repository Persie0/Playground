package p000;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class yt5 {

    /* JADX INFO: renamed from: a */
    public final String f70442a;

    /* JADX INFO: renamed from: b */
    public final boolean f70443b;

    /* JADX INFO: renamed from: c */
    public final boolean f70444c;

    public yt5(String str, boolean z, boolean z2) {
        this.f70442a = str;
        this.f70443b = z;
        this.f70444c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == yt5.class) {
            yt5 yt5Var = (yt5) obj;
            if (TextUtils.equals(this.f70442a, yt5Var.f70442a) && this.f70443b == yt5Var.f70443b && this.f70444c == yt5Var.f70444c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((ux5.m22980c(31, this.f70442a, 31) + (this.f70443b ? 1231 : 1237)) * 31) + (this.f70444c ? 1231 : 1237);
    }
}
