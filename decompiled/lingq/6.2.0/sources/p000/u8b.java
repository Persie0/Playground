package p000;

import androidx.room.AbstractC0746d;
import androidx.room.util.AbstractC0758a;
import androidx.work.WorkInfo$State;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u8b {

    /* JADX INFO: renamed from: a */
    public final AbstractC0746d f63598a;

    /* JADX INFO: renamed from: b */
    public final q85 f63599b = new q85(20);

    /* JADX INFO: renamed from: c */
    public final p85 f63600c = new p85(21);

    public u8b(AbstractC0746d abstractC0746d) {
        this.f63598a = abstractC0746d;
    }

    /* JADX INFO: renamed from: a */
    public final void m22565a(bk8 bk8Var, C3275kv c3275kv) {
        C3089hv c3089hv = (C3089hv) c3275kv.keySet();
        C3275kv c3275kv2 = c3089hv.f42963a;
        if (c3275kv2.isEmpty()) {
            return;
        }
        if (c3275kv.f49254c > 999) {
            zmc.m25701a(c3275kv, new t8b(this, bk8Var, 0));
            return;
        }
        StringBuilder sbM22997t = ux5.m22997t("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        d32.m10005B(c3275kv2.f49254c, sbM22997t);
        sbM22997t.append(")");
        ik8 ik8VarMo2873e0 = bk8Var.mo2873e0(sbM22997t.toString());
        Iterator it = c3089hv.iterator();
        int i = 1;
        while (true) {
            C3052gv c3052gv = (C3052gv) it;
            if (!c3052gv.hasNext()) {
                try {
                    break;
                } catch (Throwable th) {
                    ik8VarMo2873e0.close();
                    throw th;
                }
            }
            ik8VarMo2873e0.mo2874C(i, (String) c3052gv.next());
            i++;
        }
        ik8VarMo2873e0.getClass();
        int iM14095i = AbstractC3122is.m14095i(ik8VarMo2873e0, "work_spec_id");
        if (iM14095i == -1) {
            ik8VarMo2873e0.close();
            return;
        }
        while (ik8VarMo2873e0.mo2876a0()) {
            List list = (List) c3275kv.get(ik8VarMo2873e0.mo2875L(iM14095i));
            if (list != null) {
                byte[] blob = ik8VarMo2873e0.getBlob(0);
                sz1 sz1Var = sz1.f61645b;
                list.add(jad.m14366a(blob));
            }
        }
        ik8VarMo2873e0.close();
    }

    /* JADX INFO: renamed from: b */
    public final void m22566b(bk8 bk8Var, C3275kv c3275kv) {
        C3089hv c3089hv = (C3089hv) c3275kv.keySet();
        C3275kv c3275kv2 = c3089hv.f42963a;
        if (c3275kv2.isEmpty()) {
            return;
        }
        if (c3275kv.f49254c > 999) {
            zmc.m25701a(c3275kv, new t8b(this, bk8Var, 1));
            return;
        }
        StringBuilder sbM22997t = ux5.m22997t("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        d32.m10005B(c3275kv2.f49254c, sbM22997t);
        sbM22997t.append(")");
        ik8 ik8VarMo2873e0 = bk8Var.mo2873e0(sbM22997t.toString());
        Iterator it = c3089hv.iterator();
        int i = 1;
        while (true) {
            C3052gv c3052gv = (C3052gv) it;
            if (!c3052gv.hasNext()) {
                try {
                    break;
                } catch (Throwable th) {
                    ik8VarMo2873e0.close();
                    throw th;
                }
            }
            ik8VarMo2873e0.mo2874C(i, (String) c3052gv.next());
            i++;
        }
        ik8VarMo2873e0.getClass();
        int iM14095i = AbstractC3122is.m14095i(ik8VarMo2873e0, "work_spec_id");
        if (iM14095i == -1) {
            ik8VarMo2873e0.close();
            return;
        }
        while (ik8VarMo2873e0.mo2876a0()) {
            List list = (List) c3275kv.get(ik8VarMo2873e0.mo2875L(iM14095i));
            if (list != null) {
                list.add(ik8VarMo2873e0.mo2875L(0));
            }
        }
        ik8VarMo2873e0.close();
    }

    /* JADX INFO: renamed from: c */
    public final void m22567c(String str) {
        str.getClass();
        AbstractC0758a.m2859b(this.f63598a, false, true, new xca(str, 16));
    }

    /* JADX INFO: renamed from: d */
    public final WorkInfo$State m22568d(String str) {
        str.getClass();
        return (WorkInfo$State) AbstractC0758a.m2859b(this.f63598a, true, false, new xca(str, 9));
    }

    /* JADX INFO: renamed from: e */
    public final p8b m22569e(String str) {
        str.getClass();
        return (p8b) AbstractC0758a.m2859b(this.f63598a, true, false, new xca(str, 8));
    }

    /* JADX INFO: renamed from: f */
    public final List m22570f(String str) {
        str.getClass();
        return (List) AbstractC0758a.m2859b(this.f63598a, true, false, new xca(str, 17));
    }

    /* JADX INFO: renamed from: g */
    public final void m22571g(String str, long j) {
        str.getClass();
        ((Number) AbstractC0758a.m2859b(this.f63598a, false, true, new q8b(str, 0, j))).intValue();
    }

    /* JADX INFO: renamed from: h */
    public final void m22572h(int i, String str) {
        str.getClass();
        AbstractC0758a.m2859b(this.f63598a, false, true, new hd7(str, i, 4));
    }

    /* JADX INFO: renamed from: i */
    public final void m22573i(String str, long j) {
        str.getClass();
        AbstractC0758a.m2859b(this.f63598a, false, true, new q8b(str, 1, j));
    }

    /* JADX INFO: renamed from: j */
    public final void m22574j(WorkInfo$State workInfo$State, String str) {
        workInfo$State.getClass();
        str.getClass();
        ((Number) AbstractC0758a.m2859b(this.f63598a, false, true, new r3a(19, workInfo$State, str))).intValue();
    }

    /* JADX INFO: renamed from: k */
    public final void m22575k(int i, String str) {
        str.getClass();
        AbstractC0758a.m2859b(this.f63598a, false, true, new hd7(i, str, 5));
    }
}
