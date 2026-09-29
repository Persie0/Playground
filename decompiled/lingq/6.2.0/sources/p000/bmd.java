package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class bmd extends cmd {

    /* JADX INFO: renamed from: e */
    public static final cmd f8701e;

    /* JADX INFO: renamed from: f */
    public static final cmd f8702f;

    static {
        cmd cmdVarM4876b = new bmd(null, new l79(0)).m4876b();
        f8701e = cmdVarM4876b;
        bmd bmdVar = new bmd(cmdVarM4876b, new l79(0));
        boolean z = !bmdVar.f10295c;
        Boolean bool = Boolean.TRUE;
        bna.m3985y("Can't mutate after handing to trace", z);
        bna.m3985y("Key already present", !bmdVar.m4877c());
        bmdVar.f10294b.put(cmd.f10292d, bool);
        f8702f = bmdVar.m4876b();
    }
}
