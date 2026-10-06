package p000;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lqo implements mrf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f38994a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f38995b;

    public /* synthetic */ lqo(String str, int i) {
        this.f38995b = i;
        this.f38994a = str;
    }

    public /* synthetic */ lqo(lol lolVar, int i) {
        this.f38995b = i;
        this.f38994a = lolVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.mrf
    public final Object apply(Object obj) {
        boolean z = true;
        switch (this.f38995b) {
            case 0:
                Object obj2 = this.f38994a;
                lpw lpwVar = lqp.f38996a;
                lqe lqeVar = lqe.f38950d;
                nyr nyrVar = ((lqg) obj).f38958a;
                if (nyrVar.containsKey(obj2)) {
                    lqeVar = (lqe) nyrVar.get(obj2);
                }
                return lqeVar.f38953b;
            case 1:
                Object obj3 = this.f38994a;
                jql jqlVar = (jql) ((nax) obj).f41919a;
                jib.m13205j(jqlVar.f34597a);
                int i = jqlVar.f34597a.f34591a;
                if (i != 1 && i != 3) {
                    z = false;
                }
                AtomicReference atomicReference = ((lol) obj3).f38806b;
                Boolean boolValueOf = Boolean.valueOf(z);
                atomicReference.set(boolValueOf);
                return boolValueOf;
            case 2:
                Object obj4 = this.f38994a;
                lpw lpwVar2 = lqp.f38996a;
                lqe lqeVar2 = lqe.f38950d;
                obj4.getClass();
                nyr nyrVar2 = ((lqg) obj).f38958a;
                if (nyrVar2.containsKey(obj4)) {
                    lqeVar2 = (lqe) nyrVar2.get(obj4);
                }
                return lqeVar2.f38954c;
            default:
                Object obj5 = this.f38994a;
                lpw lpwVar3 = lqp.f38996a;
                nxl nxlVarM18137O = lqg.f38956b.m18137O();
                for (Map.Entry entry : Collections.unmodifiableMap(((lqg) obj).f38958a).entrySet()) {
                    lqe lqeVar3 = (lqe) entry.getValue();
                    nxl nxlVarM18137O2 = lqe.f38950d.m18137O();
                    if (!lqeVar3.f38954c.equals(obj5)) {
                        String str = lqeVar3.f38954c;
                        if (!nxlVarM18137O2.f44974b.m18142ac()) {
                            nxlVarM18137O2.mo18106p();
                        }
                        lqe lqeVar4 = (lqe) nxlVarM18137O2.f44974b;
                        str.getClass();
                        lqeVar4.f38952a |= 1;
                        lqeVar4.f38954c = str;
                    }
                    for (String str2 : lqeVar3.f38953b) {
                        if (!str2.equals(obj5)) {
                            nxlVarM18137O2.m18111v(str2);
                        }
                    }
                    nxlVarM18137O.m18112w((String) entry.getKey(), (lqe) nxlVarM18137O2.mo18103l());
                }
                return (lqg) nxlVarM18137O.mo18103l();
        }
    }
}
