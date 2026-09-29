package p000;

import com.lingq.core.settings.ViewKeys;

/* JADX INFO: loaded from: classes2.dex */
public final class f29 extends h29 {

    /* JADX INFO: renamed from: a */
    public final String f38312a;

    /* JADX INFO: renamed from: b */
    public final ViewKeys f38313b;

    public f29(ViewKeys viewKeys, String str) {
        str.getClass();
        viewKeys.getClass();
        this.f38312a = str;
        this.f38313b = viewKeys;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f29)) {
            return false;
        }
        f29 f29Var = (f29) obj;
        return fa4.m11650l(this.f38312a, f29Var.f38312a) && this.f38313b == f29Var.f38313b;
    }

    public final int hashCode() {
        return this.f38313b.hashCode() + (this.f38312a.hashCode() * 31);
    }

    public final String toString() {
        return "UserLogout(username=" + this.f38312a + ", key=" + this.f38313b + ")";
    }
}
