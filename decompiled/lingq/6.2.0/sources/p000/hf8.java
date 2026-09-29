package p000;

import com.lingq.core.settings.ViewKeys;

/* JADX INFO: loaded from: classes2.dex */
public final class hf8 extends if8 {

    /* JADX INFO: renamed from: a */
    public final ViewKeys f42307a;

    /* JADX INFO: renamed from: b */
    public final String f42308b;

    public hf8(ViewKeys viewKeys, String str) {
        viewKeys.getClass();
        str.getClass();
        this.f42307a = viewKeys;
        this.f42308b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf8)) {
            return false;
        }
        hf8 hf8Var = (hf8) obj;
        return this.f42307a == hf8Var.f42307a && fa4.m11650l(this.f42308b, hf8Var.f42308b);
    }

    public final int hashCode() {
        return this.f42308b.hashCode() + (this.f42307a.hashCode() * 31);
    }

    public final String toString() {
        return "OnTransliterationSelected(key=" + this.f42307a + ", value=" + this.f42308b + ")";
    }
}
