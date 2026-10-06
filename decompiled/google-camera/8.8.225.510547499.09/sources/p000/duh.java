package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p021j$.util.List$EL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class duh {

    /* JADX INFO: renamed from: a */
    private static final nbh f12594a = nbh.m17259h("com/google/android/apps/camera/featurecentral/extraction/FeatureExtractors");

    /* JADX INFO: renamed from: a */
    public static List m6755a(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        List$EL.sort(arrayList, amx.f742f);
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static duc m6756b(dvg dvgVar) {
        return new duc(dvgVar);
    }

    /* JADX INFO: renamed from: c */
    public static void m6757c(String str, Collection collection) {
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            hashSet.add(((dug) it.next()).f12589a.f12641b);
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            dtj dtjVar = ((dug) it2.next()).f12589a.f12641b;
            for (dtj dtjVar2 : dtjVar.m6733c()) {
                if (!hashSet.contains(dtjVar2)) {
                    ((nbe) ((nbe) f12594a.m17252c()).mo17276G(1137)).mo17271B("Extractor (%s) of type %s depends on foreign type %s! Feature values may be calculated out of order!", str, dtjVar, dtjVar2);
                }
            }
        }
    }
}
