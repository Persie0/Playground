package p000;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class goj {

    /* JADX INFO: renamed from: d */
    private static final nbh f25872d = nbh.m17259h("com/google/android/apps/camera/pixelcamerakit/temporalbinning/TemporalBinningUtils");

    /* JADX INFO: renamed from: a */
    public final dhv f25873a;

    /* JADX INFO: renamed from: b */
    public final jvb f25874b;

    /* JADX INFO: renamed from: c */
    public final djm f25875c;

    /* JADX INFO: renamed from: e */
    private final ecq f25876e;

    /* JADX INFO: renamed from: f */
    private final gva f25877f;

    public goj(djm djmVar, ecq ecqVar, gva gvaVar, dhv dhvVar, jvb jvbVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f25875c = djmVar;
        this.f25876e = ecqVar;
        this.f25877f = gvaVar;
        this.f25873a = dhvVar;
        this.f25874b = jvbVar;
    }

    /* JADX INFO: renamed from: c */
    private final Set m9578c(List list) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            key keyVar = (key) it.next();
            kfd kfdVarMo7041b = keyVar.mo7041b();
            if (kfdVarMo7041b != null && !m9580b(keyVar)) {
                hashSet.add(kfdVarMo7041b);
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: a */
    public final Set m9579a(List list) {
        if (!this.f25873a.mo6184l(did.f11413X)) {
            return mzx.f41874a;
        }
        Set setM9578c = m9578c(list);
        if (!list.isEmpty() && setM9578c.size() == list.size()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                key keyVar = (key) it.next();
                kpp kppVarMo7042c = keyVar.mo7042c();
                if (kppVarMo7042c != null) {
                    hashSet.add(Integer.valueOf(this.f25876e.mo7136c(kppVarMo7042c, this.f25877f.m9784a(keyVar).m9492a().mo14193c())));
                }
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                this.f25876e.mo7153t(((Integer) it2.next()).intValue());
            }
            setM9578c = m9578c(list);
            if (setM9578c.size() == list.size()) {
                ((nbe) ((nbe) f25872d.m17251b()).mo17276G((char) 3123)).mo17290o("[live-tb] Binning has claimed all frames. Giving up and sending all frames to Gcam.");
                setM9578c.clear();
                return setM9578c;
            }
        }
        return setM9578c;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m9580b(key keyVar) {
        kpp kppVarMo7042c = keyVar.mo7042c();
        return kppVarMo7042c != null && this.f25876e.mo7159z(kppVarMo7042c, this.f25877f.m9784a(keyVar).m9492a().mo14193c());
    }
}
