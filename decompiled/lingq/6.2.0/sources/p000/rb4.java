package p000;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class rb4 {

    /* JADX INFO: renamed from: a */
    public final up2 f59022a;

    /* JADX INFO: renamed from: b */
    public final t33 f59023b;

    /* JADX INFO: renamed from: c */
    public final JSONObject f59024c;

    public rb4(up2 up2Var, t33 t33Var, JSONObject jSONObject) {
        this.f59022a = up2Var;
        this.f59023b = t33Var;
        this.f59024c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rb4) {
            rb4 rb4Var = (rb4) obj;
            if (this.f59022a == rb4Var.f59022a && fa4.m11650l(this.f59023b, rb4Var.f59023b) && fa4.m11650l(this.f59024c, rb4Var.f59024c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f59022a.hashCode() * 31;
        t33 t33Var = this.f59023b;
        int iHashCode2 = (iHashCode + (t33Var == null ? 0 : t33Var.hashCode())) * 31;
        JSONObject jSONObject = this.f59024c;
        return iHashCode2 + (jSONObject != null ? jSONObject.hashCode() : 0);
    }

    public final String toString() {
        return "IterableEmbeddedMessage(metadata=" + this.f59022a + ", elements=" + this.f59023b + ", payload=" + this.f59024c + ")";
    }
}
