package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class osj extends oxl implements oru {
    /* JADX INFO: renamed from: c */
    public final String m19020c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        Object objM19138k = m19138k();
        objM19138k.getClass();
        boolean z = true;
        for (oxp oxpVarM19139l = (oxp) objM19138k; !ooc.m18737c(oxpVarM19139l, this); oxpVarM19139l = oxpVarM19139l.m19139l()) {
            if (oxpVarM19139l instanceof osc) {
                osc oscVar = (osc) oxpVarM19139l;
                if (!z) {
                    sb.append(", ");
                }
                sb.append(oscVar);
                z = false;
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // p000.oru
    /* JADX INFO: renamed from: cE */
    public final osj mo18948cE() {
        return this;
    }

    @Override // p000.oru
    /* JADX INFO: renamed from: cG */
    public final boolean mo18949cG() {
        return true;
    }

    @Override // p000.oxp
    public final String toString() {
        return oqu.f46432a ? m19020c("Active") : super.toString();
    }
}
