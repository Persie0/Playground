package p000;

import android.content.Context;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ktq implements kts {

    /* JADX INFO: renamed from: a */
    private final jcb f37181a;

    /* JADX INFO: renamed from: b */
    private final mrm f37182b;

    /* JADX INFO: renamed from: c */
    private final Context f37183c;

    public ktq(jcb jcbVar, mrm mrmVar, Context context) {
        this.f37181a = jcbVar;
        this.f37182b = mrmVar;
        this.f37183c = context;
    }

    @Override // p000.kts
    /* JADX INFO: renamed from: a */
    public final void mo14842a(obf obfVar, mrm mrmVar) {
        if (obfVar != null) {
            oie.m18542b();
            oie.m18542b();
            if (this.f37182b.mo16813g()) {
                nxl nxlVarM18137O = nqt.f44080e.m18137O();
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nqt nqtVar = (nqt) nxlVarM18137O.f44974b;
                nqtVar.f44083b = 1;
                nqtVar.f44082a |= 1;
                nxl nxlVarM18137O2 = nqr.f44071d.m18137O();
                nxl nxlVarM18137O3 = nqs.f44076c.m18137O();
                String packageName = this.f37183c.getPackageName();
                if (!nxlVarM18137O3.f44974b.m18142ac()) {
                    nxlVarM18137O3.mo18106p();
                }
                nqs nqsVar = (nqs) nxlVarM18137O3.f44974b;
                packageName.getClass();
                nqsVar.f44078a |= 2;
                nqsVar.f44079b = packageName;
                nqs nqsVar2 = (nqs) nxlVarM18137O3.mo18103l();
                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                nqr nqrVar = (nqr) nxlVarM18137O2.f44974b;
                nqsVar2.getClass();
                nqrVar.f44074b = nqsVar2;
                nqrVar.f44073a |= 1;
                nxl nxlVarM18137O4 = nqu.f44087c.m18137O();
                if (!nxlVarM18137O4.f44974b.m18142ac()) {
                    nxlVarM18137O4.mo18106p();
                }
                nqu nquVar = (nqu) nxlVarM18137O4.f44974b;
                nquVar.f44090b = 0;
                nquVar.f44089a |= 1;
                nqu nquVar2 = (nqu) nxlVarM18137O4.mo18103l();
                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                nqr nqrVar2 = (nqr) nxlVarM18137O2.f44974b;
                nquVar2.getClass();
                nqrVar2.f44075c = nquVar2;
                nqrVar2.f44073a |= 2;
                nqr nqrVar3 = (nqr) nxlVarM18137O2.mo18103l();
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nqt nqtVar2 = (nqt) nxlVarM18137O.f44974b;
                nqrVar3.getClass();
                nqtVar2.f44084c = nqrVar3;
                nqtVar2.f44082a |= 16;
                nxl nxlVarM18137O5 = nmq.f43874g.m18137O();
                String name = Thread.currentThread().getName();
                if (!nxlVarM18137O5.f44974b.m18142ac()) {
                    nxlVarM18137O5.mo18106p();
                }
                nmq nmqVar = (nmq) nxlVarM18137O5.f44974b;
                name.getClass();
                nmqVar.f43876a |= 2;
                nmqVar.f43878c = name;
                String name2 = getClass().getName();
                if (!nxlVarM18137O5.f44974b.m18142ac()) {
                    nxlVarM18137O5.mo18106p();
                }
                nmq nmqVar2 = (nmq) nxlVarM18137O5.f44974b;
                name2.getClass();
                nmqVar2.f43876a |= 8;
                nmqVar2.f43880e = name2;
                Throwable cause = (Throwable) ((mrq) mrmVar).f41482a;
                nxl nxlVarM18137O6 = nmv.f43910f.m18137O();
                nxl nxlVarM15001as = kxk.m15001as(cause, false);
                if (!nxlVarM18137O6.f44974b.m18142ac()) {
                    nxlVarM18137O6.mo18106p();
                }
                nmv nmvVar = (nmv) nxlVarM18137O6.f44974b;
                nms nmsVar = (nms) nxlVarM15001as.mo18103l();
                nmsVar.getClass();
                nmvVar.f43915d = nmsVar;
                nmvVar.f43912a |= 1;
                while (true) {
                    cause = cause.getCause();
                    if (cause == null) {
                        break;
                    }
                    nxl nxlVarM15001as2 = kxk.m15001as(cause, false);
                    if (!nxlVarM18137O6.f44974b.m18142ac()) {
                        nxlVarM18137O6.mo18106p();
                    }
                    nmv nmvVar2 = (nmv) nxlVarM18137O6.f44974b;
                    nms nmsVar2 = (nms) nxlVarM15001as2.mo18103l();
                    nmsVar2.getClass();
                    nmvVar2.m17512b();
                    nmvVar2.f43916e.add(nmsVar2);
                }
                nmv nmvVar3 = (nmv) nxlVarM18137O6.mo18103l();
                if (!nxlVarM18137O5.f44974b.m18142ac()) {
                    nxlVarM18137O5.mo18106p();
                }
                nmq nmqVar3 = (nmq) nxlVarM18137O5.f44974b;
                nmvVar3.getClass();
                nmqVar3.f43881f = nmvVar3;
                nmqVar3.f43876a |= 1024;
                nxl nxlVarM18137O7 = nmp.f43867e.m18137O();
                if (!nxlVarM18137O7.f44974b.m18142ac()) {
                    nxlVarM18137O7.mo18106p();
                }
                nxq nxqVar = nxlVarM18137O7.f44974b;
                nmp nmpVar = (nmp) nxqVar;
                nmpVar.f43869a |= 1;
                nmpVar.f43870b = 0L;
                if (!nxqVar.m18142ac()) {
                    nxlVarM18137O7.mo18106p();
                }
                nxq nxqVar2 = nxlVarM18137O7.f44974b;
                nmp nmpVar2 = (nmp) nxqVar2;
                nmpVar2.f43869a |= 2;
                nmpVar2.f43871c = 0;
                if (!nxqVar2.m18142ac()) {
                    nxlVarM18137O7.mo18106p();
                }
                nmp nmpVar3 = (nmp) nxlVarM18137O7.f44974b;
                nmpVar3.f43869a |= 4;
                nmpVar3.f43872d = 0;
                nmp nmpVar4 = (nmp) nxlVarM18137O7.mo18103l();
                if (!nxlVarM18137O5.f44974b.m18142ac()) {
                    nxlVarM18137O5.mo18106p();
                }
                nmq nmqVar4 = (nmq) nxlVarM18137O5.f44974b;
                nmpVar4.getClass();
                nmqVar4.f43877b = nmpVar4;
                nmqVar4.f43876a |= 1;
                int iIntValue = Level.WARNING.intValue();
                if (!nxlVarM18137O5.f44974b.m18142ac()) {
                    nxlVarM18137O5.mo18106p();
                }
                nmq nmqVar5 = (nmq) nxlVarM18137O5.f44974b;
                nmqVar5.f43876a |= 4;
                nmqVar5.f43879d = iIntValue;
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nqt nqtVar3 = (nqt) nxlVarM18137O.f44974b;
                nmq nmqVar6 = (nmq) nxlVarM18137O5.mo18103l();
                nmqVar6.getClass();
                nqtVar3.f44085d = nmqVar6;
                nqtVar3.f44082a |= 32;
                ((jcb) this.f37182b.mo16809c()).m12888e((nqt) nxlVarM18137O.mo18103l()).m12882a();
            }
            jbz jbzVarM12888e = this.f37181a.m12888e(obfVar);
            nxn nxnVar = jbzVarM12888e.f33698i;
            if (!nxnVar.f44974b.m18142ac()) {
                nxnVar.mo18106p();
            }
            ogy ogyVar = (ogy) nxnVar.f44974b;
            ogy ogyVar2 = ogy.f45974i;
            ogyVar.f45976a |= 32;
            ogyVar.f45979d = 1;
            jbzVarM12888e.m12882a();
        }
    }
}
