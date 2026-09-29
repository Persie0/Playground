package p000;

import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class r76 {

    /* JADX INFO: renamed from: a */
    public TreeSet f58856a;

    /* JADX WARN: Code duplicated, block: B:11:0x0010 A[Catch: all -> 0x000e, TRY_LEAVE, TryCatch #1 {all -> 0x000e, blocks: (B:4:0x0003, B:6:0x0007, B:20:0x0029, B:22:0x002d, B:24:0x0033, B:11:0x0010, B:19:0x0027, B:18:0x0024, B:15:0x001e), top: B:31:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x001e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final synchronized void m20434a(boolean z) {
        s76 s76Var;
        TreeSet treeSetM21145f;
        if (z) {
            s76Var = s76.f60467a;
            treeSetM21145f = null;
            if (!lp1.f49971a.contains(s76.class)) {
                treeSetM21145f = s76Var.m21145f(this);
            }
            this.f58856a = treeSetM21145f;
        } else {
            try {
                TreeSet treeSet = this.f58856a;
                if (treeSet == null || treeSet.isEmpty()) {
                    s76Var = s76.f60467a;
                    treeSetM21145f = null;
                    if (!lp1.f49971a.contains(s76.class)) {
                        try {
                            treeSetM21145f = s76Var.m21145f(this);
                        } catch (Throwable th) {
                            lp1.m16420a(s76.class, th);
                        }
                    }
                    this.f58856a = treeSetM21145f;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        TreeSet treeSet2 = this.f58856a;
        if (treeSet2 == null || treeSet2.isEmpty()) {
            mo18935e();
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract String mo18933b();

    /* JADX INFO: renamed from: c */
    public abstract String mo18934c();

    /* JADX INFO: renamed from: d */
    public String mo19702d() {
        return "id_token,token,signed_request,graph_domain";
    }

    /* JADX INFO: renamed from: e */
    public void mo18935e() {
    }
}
