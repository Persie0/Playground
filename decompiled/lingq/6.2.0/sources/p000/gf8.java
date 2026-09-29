package p000;

import com.lingq.core.settings.ViewKeys;

/* JADX INFO: loaded from: classes2.dex */
public final class gf8 extends if8 {

    /* JADX INFO: renamed from: a */
    public final ViewKeys f40738a;

    /* JADX INFO: renamed from: b */
    public final boolean f40739b;

    public gf8(ViewKeys viewKeys, boolean z) {
        viewKeys.getClass();
        this.f40738a = viewKeys;
        this.f40739b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf8)) {
            return false;
        }
        gf8 gf8Var = (gf8) obj;
        return this.f40738a == gf8Var.f40738a && this.f40739b == gf8Var.f40739b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f40739b) + (this.f40738a.hashCode() * 31);
    }

    public final String toString() {
        return "OnSwitchChanged(key=" + this.f40738a + ", isOn=" + this.f40739b + ")";
    }
}
