package p000;

import com.lingq.core.settings.ViewKeys;

/* JADX INFO: loaded from: classes2.dex */
public final class c19 extends g19 {

    /* JADX INFO: renamed from: a */
    public final ViewKeys f9312a;

    /* JADX INFO: renamed from: b */
    public final boolean f9313b;

    public c19(ViewKeys viewKeys, boolean z) {
        viewKeys.getClass();
        this.f9312a = viewKeys;
        this.f9313b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c19)) {
            return false;
        }
        c19 c19Var = (c19) obj;
        return this.f9312a == c19Var.f9312a && this.f9313b == c19Var.f9313b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9313b) + (this.f9312a.hashCode() * 31);
    }

    public final String toString() {
        return "OnSwitchChanged(key=" + this.f9312a + ", isOn=" + this.f9313b + ")";
    }
}
