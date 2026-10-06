package p000;

import android.os.Handler;
import android.util.Size;
import androidx.wear.ambient.AmbientDelegate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kib implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f36125a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f36126b;

    public kib(oju ojuVar, int i) {
        this.f36126b = i;
        this.f36125a = ojuVar;
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        byte[] bArr = null;
        switch (this.f36126b) {
            case 0:
                return new kia(this.f36125a);
            case 1:
                return AmbientDelegate.m1572ad((knx) this.f36125a.get());
            case 2:
                return new juy((Handler) this.f36125a.get());
            case 3:
                ((khc) this.f36125a).get();
                return mqu.f41450a;
            case 4:
                kfn kfnVar = ((khc) this.f36125a).get();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                mws mwsVar = kfnVar.f35843g;
                int i = ((mzr) mwsVar).f41859c;
                for (int i2 = 0; i2 < i; i2++) {
                    kgi kgiVar = (kgi) mwsVar.get(i2);
                    kgiVar.getClass();
                    kbc kbcVar = kgiVar.f35902d;
                    linkedHashMap.put(kgiVar, C0236hg.m10229b(new Size(kbcVar.f35517a, kbcVar.f35518b), kgiVar.f35903e));
                }
                return linkedHashMap;
            case 5:
                return new kot((kfl) this.f36125a.get());
            case 6:
                return kfi.m14108c(new ijp((kot) this.f36125a.get(), 19, bArr));
            case 7:
                return new knn(((emt) this.f36125a).get());
            case 8:
                return new koo(((koj) this.f36125a).get());
            case 9:
                return new lhz(((hlz) this.f36125a).get());
            case 10:
                Set set = ((ohm) this.f36125a).get();
                axu axuVar = new axu();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    axuVar.f2693a.add((ayl) it.next());
                }
                return axuVar;
            case 11:
                return new lpe((kvt) ((ohj) this.f36125a).f46012a, kdz.m14011b(), (byte[]) null, (byte[]) null);
            case 12:
                lki lkiVar = (lki) ((oju) ((mrm) ((ohj) this.f36125a).f46012a).mo16811e(kof.f36686g)).get();
                lkiVar.getClass();
                return lkiVar;
            case 13:
                ljl ljlVar = (ljl) ((oju) ((mrm) ((ohj) this.f36125a).f46012a).mo16811e(kof.f36690k)).get();
                ljlVar.getClass();
                return ljlVar;
            case 14:
                ljq ljqVar = (ljq) ((oju) ((etl) this.f36125a).m7866a().mo16811e(kof.f36682c)).get();
                ljqVar.getClass();
                return ljqVar;
            case 15:
                lld lldVar = (lld) ((oju) ((mrm) ((ohj) this.f36125a).f46012a).mo16811e(kof.f36685f)).get();
                lldVar.getClass();
                return lldVar;
            case 16:
                lmw lmwVar = (lmw) ((oju) ((etl) this.f36125a).m7866a().mo16811e(kof.f36684e)).get();
                lmwVar.getClass();
                return lmwVar;
            case 17:
                return (lgy) ((etl) this.f36125a).m7866a().mo16811e(lgy.m15327a().m15706c());
            case 18:
                lne lneVar = (lne) ((oju) ((mrm) ((ohj) this.f36125a).f46012a).mo16811e(kof.f36691l)).get();
                lneVar.getClass();
                return lneVar;
            case 19:
                lnb lnbVar = (lnb) ((oju) ((etl) this.f36125a).m7866a().mo16811e(kof.f36689j)).get();
                lnbVar.getClass();
                return lnbVar;
            default:
                lnh lnhVar = (lnh) ((oju) ((mrm) ((ohj) this.f36125a).f46012a).mo16811e(kof.f36688i)).get();
                lnhVar.getClass();
                return lnhVar;
        }
    }
}
