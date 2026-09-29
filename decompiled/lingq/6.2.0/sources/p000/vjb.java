package p000;

import com.google.common.collect.ImmutableSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class vjb {

    /* JADX INFO: renamed from: a */
    public static final x6d f65514a;

    /* JADX INFO: renamed from: b */
    public static volatile String f65515b;

    /* JADX INFO: renamed from: c */
    public static final nr9 f65516c;

    static {
        u7d u7dVar = new u7d(ujb.f63992b, true, ImmutableSet.m6310s());
        pl1 pl1Var = new pl1();
        pl1Var.f56397a = u7dVar;
        f65516c = new nr9(pl1Var);
        f65514a = new x6d("__phenotype_server_token", pl1Var, "");
        f65515b = null;
    }

    /* JADX INFO: renamed from: a */
    public static String m23354a() {
        return (String) f65514a.get();
    }
}
