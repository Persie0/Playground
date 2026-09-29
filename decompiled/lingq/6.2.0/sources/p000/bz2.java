package p000;

import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes3.dex */
public final class bz2 {

    /* JADX INFO: renamed from: a */
    public final Object f9196a;

    /* JADX INFO: renamed from: b */
    public final C0282a f9197b;

    public bz2(sb9 sb9Var, C0282a c0282a) {
        this.f9196a = sb9Var;
        this.f9197b = c0282a;
    }

    /* JADX INFO: renamed from: a */
    public final Object m4235a() {
        return this.f9196a;
    }

    /* JADX INFO: renamed from: b */
    public final aj3 m4236b() {
        return this.f9197b;
    }

    /* JADX INFO: renamed from: c */
    public final Object m4237c() {
        return this.f9196a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bz2) {
            bz2 bz2Var = (bz2) obj;
            return fa4.m11650l(this.f9196a, bz2Var.f9196a) && this.f9197b == bz2Var.f9197b;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f9196a;
        return this.f9197b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f9196a + ", transition=" + this.f9197b + ')';
    }
}
