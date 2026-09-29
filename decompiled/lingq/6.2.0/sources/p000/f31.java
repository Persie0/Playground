package p000;

/* JADX INFO: loaded from: classes.dex */
public final class f31 extends ai8 {

    /* JADX INFO: renamed from: a */
    public final gr7 f38333a;

    public f31(gr7 gr7Var) {
        gr7Var.getClass();
        this.f38333a = gr7Var;
    }

    @Override // p000.ai8
    /* JADX INFO: renamed from: a */
    public final void mo443a(xg3 xg3Var) {
        xg3Var.getClass();
        xg3Var.m24494a();
        try {
            StringBuilder sb = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
            this.f38333a.getClass();
            sb.append(System.currentTimeMillis() - 86400000);
            sb.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            xg3Var.m24498n(sb.toString());
            xg3Var.m24502u();
        } finally {
            xg3Var.m24497e();
        }
    }
}
