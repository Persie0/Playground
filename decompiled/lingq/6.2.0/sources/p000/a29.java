package p000;

import com.lingq.core.settings.ViewKeys;

/* JADX INFO: loaded from: classes2.dex */
public final class a29 extends h29 {

    /* JADX INFO: renamed from: a */
    public final int f129a;

    /* JADX INFO: renamed from: b */
    public final boolean f130b;

    /* JADX INFO: renamed from: c */
    public final ViewKeys f131c;

    /* JADX INFO: renamed from: d */
    public final String f132d;

    public a29(int i, boolean z, ViewKeys viewKeys, String str) {
        viewKeys.getClass();
        this.f129a = i;
        this.f130b = z;
        this.f131c = viewKeys;
        this.f132d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a29)) {
            return false;
        }
        a29 a29Var = (a29) obj;
        return this.f129a == a29Var.f129a && this.f130b == a29Var.f130b && this.f131c == a29Var.f131c && fa4.m11650l(this.f132d, a29Var.f132d);
    }

    public final int hashCode() {
        return this.f132d.hashCode() + ((this.f131c.hashCode() + g9a.m12428e(Integer.hashCode(this.f129a) * 961, 31, this.f130b)) * 31);
    }

    public final String toString() {
        return "SwitchSelection(title=" + this.f129a + ", description=null, switchState=" + this.f130b + ", key=" + this.f131c + ", dynamicDescription=" + this.f132d + ")";
    }

    public /* synthetic */ a29(int i, ViewKeys viewKeys, boolean z) {
        this(i, z, viewKeys, "");
    }
}
