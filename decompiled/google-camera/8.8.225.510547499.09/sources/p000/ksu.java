package p000;

import android.content.Context;
import android.content.res.Resources;
import android.util.LruCache;
import com.google.p020vr.vrcore.controller.api.DJK.rmwTRjObXLGH;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ksu {

    /* JADX INFO: renamed from: c */
    private static final int f37132c = ntw.m17709R("DEFAULT");

    /* JADX INFO: renamed from: a */
    public final LruCache f37133a;

    /* JADX INFO: renamed from: b */
    public pch f37134b;

    /* JADX INFO: renamed from: d */
    private final LruCache f37135d;

    /* JADX INFO: renamed from: e */
    private final Context f37136e;

    /* JADX INFO: renamed from: f */
    private final Integer f37137f;

    public ksu(Context context, int i, LruCache lruCache, LruCache lruCache2) {
        this.f37136e = context;
        this.f37137f = Integer.valueOf(i);
        this.f37135d = lruCache;
        this.f37133a = lruCache2;
    }

    /* JADX INFO: renamed from: e */
    private static Map m14821e(List list, mws mwsVar) throws kst {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() >= mwsVar.size()) {
                throw new kst(String.format("CollectionBasisHolder index(%d) exceeds list size(%d)", num, Integer.valueOf(mwsVar.size())));
            }
            pcb pcbVar = (pcb) mwsVar.get(num.intValue());
            Integer numValueOf = Integer.valueOf((pcbVar.f47388a & 2) != 0 ? pcbVar.f47390c : f37132c);
            nxl nxlVar = (nxl) pcbVar.m18143ad(5);
            nxlVar.m18108s(pcbVar);
            if (!nxlVar.f44974b.m18142ac()) {
                nxlVar.mo18106p();
            }
            pcb pcbVar2 = (pcb) nxlVar.f44974b;
            pcbVar2.f47388a &= -3;
            pcbVar2.f47390c = 0;
            map.put(numValueOf, (pcb) nxlVar.mo18103l());
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    public final pce m14822a(int i) {
        LruCache lruCache = this.f37135d;
        Integer numValueOf = Integer.valueOf(i);
        pce pceVar = (pce) lruCache.get(numValueOf);
        if (pceVar == null) {
            if (this.f37134b == null) {
                this.f37134b = m14824c();
            }
            pceVar = (pce) Collections.unmodifiableMap(this.f37134b.f47406a).get(numValueOf);
            if (pceVar != null) {
                this.f37135d.put(numValueOf, pceVar);
                return pceVar;
            }
        }
        return pceVar;
    }

    /* JADX INFO: renamed from: b */
    public final pce m14823b(int i) {
        pce pceVarM14822a = m14822a(i);
        if (pceVarM14822a != null) {
            return pceVarM14822a;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: c */
    public final pch m14824c() throws IOException {
        pca pcaVar;
        Context context = this.f37136e;
        if (context == null) {
            throw new IOException("No context to load resource from");
        }
        try {
            InputStream inputStreamOpenRawResource = context.getResources().openRawResource(this.f37137f.intValue());
            try {
                nww nwwVarM17876I = nww.m17876I(inputStreamOpenRawResource);
                nxl nxlVarM18137O = pch.f47404f.m18137O();
                nxlVarM18137O.mo17754f(nwwVarM17876I, nxf.f44904a);
                pch pchVar = (pch) nxlVarM18137O.mo18103l();
                nxy nxyVar = pchVar.f47408c;
                nxw nxwVar = pchVar.f47409d;
                if (nxyVar.size() != nxwVar.size()) {
                    throw new kst(String.format(rmwTRjObXLGH.HBgIL, Integer.valueOf(nxwVar.size()), Integer.valueOf(nxyVar.size())));
                }
                HashMap map = new HashMap();
                mws mwsVarM17095j = mws.m17095j(pchVar.f47410e);
                Iterator it = nxwVar.iterator();
                Iterator it2 = nxyVar.iterator();
                while (it.hasNext() && it2.hasNext()) {
                    Integer num = (Integer) it.next();
                    pce pceVar = (pce) it2.next();
                    Map mapM14821e = m14821e(pceVar.f47399e, mwsVarM17095j);
                    nxw nxwVar2 = pceVar.f47400f;
                    nxx nxxVar = pceVar.f47401g;
                    if (nxwVar2.size() != nxxVar.size()) {
                        throw new kst(String.format("TagNumbersList[%d] and CollectionBasisFieldList[%d] must have same size", Integer.valueOf(nxxVar.size()), Integer.valueOf(nxwVar2.size())));
                    }
                    HashMap map2 = new HashMap();
                    Iterator it3 = nxwVar2.iterator();
                    Iterator it4 = nxxVar.iterator();
                    while (it4.hasNext() && it3.hasNext()) {
                        Long l = (Long) it4.next();
                        Map mapM14821e2 = m14821e(mws.m17097l((Integer) it3.next()), mwsVarM17095j);
                        nxl nxlVarM18137O2 = pca.f47380e.m18137O();
                        nxlVarM18137O2.m18067aD(mapM14821e2);
                        map2.put(l, (pca) nxlVarM18137O2.mo18103l());
                    }
                    nxy nxyVar2 = pceVar.f47397c;
                    nxx nxxVar2 = pceVar.f47398d;
                    if (nxyVar2.size() != nxxVar2.size()) {
                        throw new kst(String.format("TagNumbersList[%d] and CollectionBasisFieldList[%d] must have same size", Integer.valueOf(nxxVar2.size()), Integer.valueOf(nxyVar2.size())));
                    }
                    Iterator it5 = nxxVar2.iterator();
                    Iterator it6 = nxyVar2.iterator();
                    while (it5.hasNext() && it6.hasNext()) {
                        Long l2 = (Long) it5.next();
                        pca pcaVar2 = (pca) it6.next();
                        Map mapM14821e3 = m14821e(pcaVar2.f47385d, mwsVarM17095j);
                        if (map2.containsKey(l2)) {
                            nxl nxlVar = (nxl) pcaVar2.m18143ad(5);
                            nxlVar.m18108s(pcaVar2);
                            nxlVar.m18108s((pca) map2.get(l2));
                            pcaVar = (pca) nxlVar.mo18103l();
                        } else {
                            nxl nxlVar2 = (nxl) pcaVar2.m18143ad(5);
                            nxlVar2.m18108s(pcaVar2);
                            nxlVar2.m18067aD(mapM14821e3);
                            if (!nxlVar2.f44974b.m18142ac()) {
                                nxlVar2.mo18106p();
                            }
                            ((pca) nxlVar2.f44974b).f47385d = nxr.f44982b;
                            pcaVar = (pca) nxlVar2.mo18103l();
                        }
                        map2.put(l2, pcaVar);
                    }
                    nxl nxlVar3 = (nxl) pceVar.m18143ad(5);
                    nxlVar3.m18108s(pceVar);
                    if (!nxlVar3.f44974b.m18142ac()) {
                        nxlVar3.mo18106p();
                    }
                    pce pceVar2 = (pce) nxlVar3.f44974b;
                    nyr nyrVar = pceVar2.f47395a;
                    if (!nyrVar.f45034b) {
                        pceVar2.f47395a = nyrVar.m18191a();
                    }
                    pceVar2.f47395a.putAll(mapM14821e);
                    if (!nxlVar3.f44974b.m18142ac()) {
                        nxlVar3.mo18106p();
                    }
                    ((pce) nxlVar3.f44974b).f47399e = nxr.f44982b;
                    if (!nxlVar3.f44974b.m18142ac()) {
                        nxlVar3.mo18106p();
                    }
                    pce pceVar3 = (pce) nxlVar3.f44974b;
                    nyr nyrVar2 = pceVar3.f47396b;
                    if (!nyrVar2.f45034b) {
                        pceVar3.f47396b = nyrVar2.m18191a();
                    }
                    pceVar3.f47396b.putAll(map2);
                    if (!nxlVar3.f44974b.m18142ac()) {
                        nxlVar3.mo18106p();
                    }
                    ((pce) nxlVar3.f44974b).f47398d = nyn.f45025b;
                    if (!nxlVar3.f44974b.m18142ac()) {
                        nxlVar3.mo18106p();
                    }
                    ((pce) nxlVar3.f44974b).f47397c = nzg.f45063b;
                    if (!nxlVar3.f44974b.m18142ac()) {
                        nxlVar3.mo18106p();
                    }
                    nxq nxqVar = nxlVar3.f44974b;
                    ((pce) nxqVar).f47400f = nxr.f44982b;
                    if (!nxqVar.m18142ac()) {
                        nxlVar3.mo18106p();
                    }
                    ((pce) nxlVar3.f44974b).f47401g = nyn.f45025b;
                    map.put(num, (pce) nxlVar3.mo18103l());
                }
                nxl nxlVarM18137O3 = pch.f47404f.m18137O();
                if (!nxlVarM18137O3.f44974b.m18142ac()) {
                    nxlVarM18137O3.mo18106p();
                }
                pch pchVar2 = (pch) nxlVarM18137O3.f44974b;
                nyr nyrVar3 = pchVar2.f47406a;
                if (!nyrVar3.f45034b) {
                    pchVar2.f47406a = nyrVar3.m18191a();
                }
                pchVar2.f47406a.putAll(map);
                Map mapUnmodifiableMap = Collections.unmodifiableMap(pchVar.f47407b);
                if (!nxlVarM18137O3.f44974b.m18142ac()) {
                    nxlVarM18137O3.mo18106p();
                }
                pch pchVar3 = (pch) nxlVarM18137O3.f44974b;
                nyr nyrVar4 = pchVar3.f47407b;
                if (!nyrVar4.f45034b) {
                    pchVar3.f47407b = nyrVar4.m18191a();
                }
                pchVar3.f47407b.putAll(mapUnmodifiableMap);
                pch pchVar4 = (pch) nxlVarM18137O3.mo18103l();
                if (inputStreamOpenRawResource != null) {
                    inputStreamOpenRawResource.close();
                }
                return pchVar4;
            } catch (Throwable th) {
                if (inputStreamOpenRawResource == null) {
                    throw th;
                }
                try {
                    inputStreamOpenRawResource.close();
                    throw th;
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        throw th;
                    } catch (Exception e) {
                        throw th;
                    }
                }
            }
        } catch (Resources.NotFoundException e2) {
            throw new IOException(e2);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m14825d(int i) {
        return m14822a(i) != null;
    }
}
