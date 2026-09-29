package p000;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class gba implements fba {

    /* JADX INFO: renamed from: a */
    public final Set f40506a;

    /* JADX INFO: renamed from: b */
    public final q50 f40507b;

    /* JADX INFO: renamed from: c */
    public final nba f40508c;

    public gba(Set set, q50 q50Var, nba nbaVar) {
        this.f40506a = set;
        this.f40507b = q50Var;
        this.f40508c = nbaVar;
    }

    /* JADX INFO: renamed from: a */
    public final hba m12466a(String str, bs2 bs2Var, o9a o9aVar) {
        Set set = this.f40506a;
        if (set.contains(bs2Var)) {
            return new hba(this.f40507b, str, bs2Var, o9aVar, this.f40508c);
        }
        uk9.m22783r("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{bs2Var, set});
        return null;
    }
}
