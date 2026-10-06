package p000;

import android.util.LruCache;
import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;
import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ksx implements ksw {

    /* JADX INFO: renamed from: a */
    public static final int f37140a = ntw.m17709R("com.google.protobuf.Any");

    /* JADX INFO: renamed from: e */
    public static final nax f37141e;

    /* JADX INFO: renamed from: b */
    public final LruCache f37142b = new kta();

    /* JADX INFO: renamed from: c */
    public final LruCache f37143c = new LruCache(100);

    /* JADX INFO: renamed from: d */
    public final ktp f37144d = new ktp();

    static {
        mwt mwtVar = new mwt();
        mwtVar.mo17110e(0, "WIRETYPE_VARINT");
        mwtVar.mo17110e(1, pIeXJQLZLfgIN.HXLLtMC);
        mwtVar.mo17110e(2, "WIRETYPE_LENGTH_DELIMITED");
        mwtVar.mo17110e(3, "WIRETYPE_START_GROUP");
        mwtVar.mo17110e(4, "WIRETYPE_END_GROUP");
        mwtVar.mo17110e(5, "WIRETYPE_FIXED32");
        mwtVar.mo17059b();
        f37141e = new nax();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m14826a(ksr ksrVar, pcb pcbVar, kss kssVar, kuc kucVar, mrm mrmVar) {
        ktf ktnVar;
        int i = 0;
        while (true) {
            if (pcbVar == null || i >= pcbVar.f47389b.size()) {
                break;
            }
            int iM18399a = obe.m18399a(pcbVar.f47389b.mo18146d(i));
            if (iM18399a == 0) {
                iM18399a = 1;
            }
            ktj ktjVar = kssVar.f37131b;
            obd obdVarM5781c = C0121d.m5781c(iM18399a);
            if (obdVarM5781c.f45243a == 1) {
                ktg ktgVar = ((ktk) ktjVar).f37164b;
                int iM18395b = oba.m18395b(((Integer) obdVarM5781c.f45244b).intValue());
                ktnVar = ktgVar.mo14837a(iM18395b != 0 ? iM18395b : 1, ksrVar);
            } else {
                ktnVar = new ktn(((ktk) ktjVar).f37164b, obdVarM5781c, ksrVar);
            }
            if (!ktnVar.mo14833a()) {
                if (kua.m14864c()) {
                    nxn nxnVarM14885b = kucVar.m14885b(3);
                    if (!nxnVarM14885b.f44974b.m18142ac()) {
                        nxnVarM14885b.mo18106p();
                    }
                    obf obfVar = (obf) nxnVarM14885b.f44974b;
                    obf obfVar2 = obf.f45245n;
                    obfVar.f45255i = iM18399a - 1;
                    obfVar.f45247a |= 128;
                    obd obdVarM5781c2 = C0121d.m5781c(iM18399a);
                    if (!nxnVarM14885b.f44974b.m18142ac()) {
                        nxnVarM14885b.mo18106p();
                    }
                    obf obfVar3 = (obf) nxnVarM14885b.f44974b;
                    obdVarM5781c2.getClass();
                    obfVar3.f45256j = obdVarM5781c2;
                    obfVar3.f45247a |= 512;
                    if (mrmVar.mo16813g()) {
                        nxnVarM14885b.m18118aI(((Integer) mrmVar.mo16809c()).intValue());
                    }
                    kucVar.m14884a(nxnVarM14885b);
                }
                return false;
            }
            i++;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m14827b(pcb pcbVar) {
        return (pcbVar == null || pcbVar.f47389b.size() == 0) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m14828c(int i, int i2) {
        return i == f37140a && i2 == 2;
    }

    /* JADX INFO: renamed from: d */
    public static pcb m14829d(pca pcaVar) {
        return (pcb) Collections.unmodifiableMap(pcaVar.f47384c).get(-2032180703);
    }

    /* JADX INFO: renamed from: e */
    public static pcb m14830e(pce pceVar) {
        return (pcb) Collections.unmodifiableMap(pceVar.f47395a).get(-2032180703);
    }
}
