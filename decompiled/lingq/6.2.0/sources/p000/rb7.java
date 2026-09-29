package p000;

import com.lingq.core.player.C1807a;

/* JADX INFO: loaded from: classes.dex */
public final class rb7 {

    /* JADX INFO: renamed from: a */
    public final hm5 f59025a;

    /* JADX INFO: renamed from: b */
    public final C1807a f59026b;

    public rb7(hm5 hm5Var, y15 y15Var, nr9 nr9Var, un1 un1Var) {
        hm5Var.getClass();
        y15Var.getClass();
        un1Var.getClass();
        this.f59025a = hm5Var;
        this.f59026b = new C1807a(y15Var, nr9Var, un1Var, "PLAYER_LISTEN");
    }

    /* JADX INFO: renamed from: a */
    public static v45 m20570a(tb7 tb7Var) {
        return new v45(tb7Var.m21942j().name() + ":" + tb7Var.m21939g() + ":" + tb7Var.m21933a().hashCode(), tb7Var.m21939g(), tb7Var.m21938f());
    }
}
