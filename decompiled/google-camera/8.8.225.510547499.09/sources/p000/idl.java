package p000;

import android.content.Context;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import p021j$.util.Collection$EL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class idl {

    /* JADX INFO: renamed from: c */
    private static final nbh f30468c = nbh.m17259h("com/google/android/apps/camera/ui/notificationchip/helper/VideoNotificationHelper");

    /* JADX INFO: renamed from: a */
    final Map f30469a;

    /* JADX INFO: renamed from: b */
    final Map f30470b;

    /* JADX INFO: renamed from: d */
    private final elx f30471d;

    /* JADX INFO: renamed from: e */
    private final Map f30472e = new EnumMap(idk.class);

    public idl(Context context, elx elxVar) {
        Context context2 = context;
        this.f30471d = elxVar;
        EnumMap enumMap = new EnumMap(idj.class);
        for (idj idjVar : idj.values()) {
            enumMap.put(idjVar, jpd.m13426g(false, 5000, null, null, context2.getString(idjVar.f30459i), context, false, -1, 12));
        }
        this.f30469a = enumMap;
        final Map map = this.f30472e;
        EnumMap enumMap2 = new EnumMap(idk.class);
        idk[] idkVarArrValues = idk.values();
        int length = idkVarArrValues.length;
        int i = 0;
        while (i < length) {
            final idk idkVar = idkVarArrValues[i];
            enumMap2.put(idkVar, jpd.m13426g(idkVar.f30467g, 3000, null, new ida() { // from class: idh
                @Override // p000.ida
                /* JADX INFO: renamed from: a */
                public final void mo11107a(long j) {
                    map.remove(idkVar);
                }
            }, context2.getString(idkVar.f30466f), context, false, -1, 12));
            i++;
            context2 = context;
        }
        this.f30470b = enumMap2;
    }

    /* JADX INFO: renamed from: a */
    public final void m11116a(idk idkVar) {
        if (this.f30472e.containsKey(idkVar)) {
            ((kba) this.f30472e.get(idkVar)).close();
            this.f30472e.remove(idkVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11117b() {
        Iterator it = this.f30472e.values().iterator();
        while (it.hasNext()) {
            ((kba) it.next()).close();
        }
        this.f30472e.clear();
    }

    /* JADX INFO: renamed from: c */
    public final void m11118c(idj idjVar) {
        idb idbVar = (idb) this.f30469a.get(idjVar);
        if (idbVar != null) {
            this.f30471d.mo7482d(idbVar);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m11119d(idk idkVar) {
        idb idbVar = (idb) this.f30470b.get(idkVar);
        if (idbVar == null) {
            ((nbe) ((nbe) f30468c.m17252c()).mo17276G((char) 4184)).mo17293r("No chip found for thermal type: %s", idkVar);
            return;
        }
        Collection$EL.stream(this.f30472e.entrySet()).filter(new gfw(idkVar, 15)).map(hgq.f27724r).forEach(new idi(this, 0));
        if (this.f30472e.isEmpty()) {
            this.f30472e.put(idkVar, this.f30471d.mo7482d(idbVar));
        }
    }
}
