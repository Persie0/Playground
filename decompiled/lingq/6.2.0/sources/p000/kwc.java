package p000;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class kwc {

    /* JADX INFO: renamed from: a */
    public final Context f48530a;

    /* JADX INFO: renamed from: b */
    public final on9 f48531b;

    public kwc(Context context, on9 on9Var) {
        this.f48530a = context;
        this.f48531b = on9Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kwc)) {
            return false;
        }
        kwc kwcVar = (kwc) obj;
        if (!this.f48530a.equals(kwcVar.f48530a)) {
            return false;
        }
        on9 on9Var = kwcVar.f48531b;
        on9 on9Var2 = this.f48531b;
        if (on9Var2 == null) {
            return on9Var == null;
        }
        return on9Var2.equals(on9Var);
    }

    public final int hashCode() {
        int iHashCode = this.f48530a.hashCode() ^ 1000003;
        on9 on9Var = this.f48531b;
        return (on9Var == null ? 0 : on9Var.hashCode()) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        String string = this.f48530a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.f48531b);
        StringBuilder sb = new StringBuilder(length + 45 + strValueOf.length() + 1);
        AbstractC3393o1.m17725C(sb, "FlagsContext{context=", string, ", hermeticFileOverrides=", strValueOf);
        sb.append("}");
        return sb.toString();
    }
}
