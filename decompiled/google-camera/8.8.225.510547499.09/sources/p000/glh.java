package p000;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class glh implements kbg {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f25480a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f25481b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f25482c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f25483d;

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ int f25484e;

    public /* synthetic */ glh(glj gljVar, Map map, kfk kfkVar, Executor executor, int i) {
        this.f25484e = i;
        this.f25480a = gljVar;
        this.f25481b = map;
        this.f25482c = kfkVar;
        this.f25483d = executor;
    }

    public /* synthetic */ glh(idg idgVar, hai haiVar, jww jwwVar, gfa gfaVar, int i) {
        this.f25484e = i;
        this.f25481b = idgVar;
        this.f25482c = haiVar;
        this.f25483d = jwwVar;
        this.f25480a = gfaVar;
    }

    public /* synthetic */ glh(String str, String str2, jwn jwnVar, jwf jwfVar, int i) {
        this.f25484e = i;
        this.f25481b = str;
        this.f25483d = str2;
        this.f25482c = jwnVar;
        this.f25480a = jwfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [hai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kfk] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v1, types: [gfa, java.lang.Object] */
    @Override // p000.kbg
    /* JADX INFO: renamed from: bf */
    public final void mo3415bf(Object obj) {
        switch (this.f25484e) {
            case 0:
                ((glj) this.f25480a).m9423s(this.f25481b, this.f25482c, this.f25483d, (String) obj);
                break;
            case 1:
                Object obj2 = this.f25481b;
                ?? r1 = this.f25482c;
                ?? r2 = this.f25483d;
                ?? r3 = this.f25480a;
                if (!((dci) obj).m5924b()) {
                    if (!((String) ((jwf) r1.mo10030b(gzy.f27060s)).f34942d).equals("off") && ((Boolean) ((jwf) r1.mo10030b(gzy.f27067z)).f34942d).booleanValue() && ehi.m7322d((ikw) r2.mo3831be()) && r3.mo9106E()) {
                        ((idg) obj2).m11115c();
                        break;
                    }
                } else {
                    ((idg) obj2).m11114b();
                    break;
                }
                break;
            default:
                Object obj3 = this.f25481b;
                Object obj4 = this.f25483d;
                ?? r4 = this.f25482c;
                Object obj5 = this.f25480a;
                List list = (List) obj;
                String str = (String) list.get(0);
                Boolean bool = (Boolean) list.get(1);
                if (bool != null && bool.booleanValue()) {
                    if (((String) obj3).equals(str)) {
                        str = dht.f11173a;
                    } else if (((String) obj4).equals(str)) {
                        str = dht.f11174b;
                    }
                }
                r4.mo3831be();
                ((jwf) obj5).mo3415bf(str);
                break;
        }
    }
}
