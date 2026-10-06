package p000;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class gmn implements gmo {

    /* JADX INFO: renamed from: a */
    public kho f25605a;

    /* JADX INFO: renamed from: b */
    private final jvb f25606b = new jvb();

    /* JADX INFO: renamed from: c */
    private final Set f25607c;

    public gmn(Map map, jwn jwnVar, bkn bknVar, byte[] bArr, byte[] bArr2) {
        kmg kmgVarMo14193c;
        String str;
        HashSet hashSet = new HashSet();
        this.f25607c = hashSet;
        HashMap map2 = new HashMap();
        for (gnf gnfVar : map.keySet()) {
            kho khoVar = (kho) map.get(gnfVar);
            if (gnfVar.equals(gnf.RAW_WIDE_UPPER)) {
                str = dht.f11173a;
            } else if (gnfVar.equals(gnf.RAW_WIDE_ZOOM_UPPER)) {
                str = dht.f11174b;
            } else {
                Iterator it = khoVar.f36067c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        kmgVarMo14193c = null;
                        break;
                    }
                    kgg kggVar = (kgg) it.next();
                    if (kggVar.mo14191a() == 37) {
                        kmgVarMo14193c = kggVar.mo14193c();
                        break;
                    }
                }
                str = kmgVarMo14193c != null ? kmgVarMo14193c.f36540a : null;
            }
            str.getClass();
            map2.put(str, khoVar);
            hashSet.add(khoVar.m14271a());
        }
        this.f25606b.m13537d(jwnVar.mo3830a(new gmm(this, map2), not.INSTANCE));
        for (Map.Entry entry : map2.entrySet()) {
            this.f25606b.m13537d(((kho) entry.getValue()).m14271a().mo3830a(new gmb(bknVar, entry, 2, (byte[]) null, (byte[]) null), not.INSTANCE));
        }
        kho khoVar2 = (kho) map.get(gnf.f25701c);
        khoVar2.getClass();
        this.f25605a = khoVar2;
    }

    @Override // p000.gmo
    /* JADX INFO: renamed from: b */
    public final jwn mo9523b() {
        return jwr.m13636f(this.f25607c);
    }

    /* JADX INFO: renamed from: c */
    public final void m9524c() {
        this.f25606b.close();
    }

    @Override // p000.msi
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final synchronized kho mo6051a() {
        return this.f25605a;
    }
}
