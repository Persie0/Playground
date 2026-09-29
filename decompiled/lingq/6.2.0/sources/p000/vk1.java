package p000;

/* JADX INFO: loaded from: classes.dex */
public final class vk1 {

    /* JADX INFO: renamed from: a */
    public final ui3 f65528a;

    /* JADX INFO: renamed from: b */
    public final sm0 f65529b;

    public vk1(ui3 ui3Var, sm0 sm0Var) {
        this.f65528a = ui3Var;
        this.f65529b = sm0Var;
    }

    public final String toString() {
        sm0 sm0Var = this.f65529b;
        qn1 qn1Var = (qn1) sm0Var.f61016e.get(qn1.f57957c);
        String str = qn1Var != null ? qn1Var.f57958b : null;
        StringBuilder sb = new StringBuilder("Request@");
        int iHashCode = hashCode();
        ci8.m4727l(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        sb.append(string);
        sb.append(str != null ? wq1.m24118n("[", str, "](") : "(");
        sb.append("currentBounds()=");
        sb.append(this.f65528a.mo0a());
        sb.append(", continuation=");
        sb.append(sm0Var);
        sb.append(')');
        return sb.toString();
    }
}
