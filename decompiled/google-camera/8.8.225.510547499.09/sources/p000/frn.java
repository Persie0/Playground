package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p021j$.time.Instant;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class frn implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f23334a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f23335b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f23336c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f23337d;

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ int f23338e;

    public /* synthetic */ frn(dlx dlxVar, long j, Instant instant, String str, int i) {
        this.f23338e = i;
        this.f23335b = dlxVar;
        this.f23334a = j;
        this.f23337d = instant;
        this.f23336c = str;
    }

    public /* synthetic */ frn(frx frxVar, gyu gyuVar, npk npkVar, long j, int i, byte[] bArr, byte[] bArr2) {
        this.f23338e = i;
        this.f23335b = frxVar;
        this.f23336c = gyuVar;
        this.f23337d = npkVar;
        this.f23334a = j;
    }

    public /* synthetic */ frn(gln glnVar, Set set, kpp kppVar, long j, int i) {
        this.f23338e = i;
        this.f23335b = glnVar;
        this.f23336c = set;
        this.f23337d = kppVar;
        this.f23334a = j;
    }

    public frn(Runnable runnable, npv npvVar, long j, TimeUnit timeUnit, int i) {
        this.f23338e = i;
        this.f23337d = runnable;
        this.f23335b = npvVar;
        this.f23334a = j;
        this.f23336c = timeUnit;
    }

    public /* synthetic */ frn(kkw kkwVar, kgg kggVar, long j, List list, int i) {
        this.f23338e = i;
        this.f23337d = kkwVar;
        this.f23335b = kggVar;
        this.f23334a = j;
        this.f23336c = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, npv] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kpp] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    @Override // java.lang.Runnable
    public final void run() {
        kfd kfdVarMo14460c;
        switch (this.f23338e) {
            case 0:
                ((frx) this.f23335b).m8744n((gyu) this.f23336c, (npk) this.f23337d, this.f23334a);
                return;
            case 1:
                ((dlx) this.f23335b).m6379l(this.f23334a, (Instant) this.f23337d, (String) this.f23336c);
                return;
            case 2:
                Object obj = this.f23335b;
                ?? r1 = this.f23336c;
                ?? r2 = this.f23337d;
                long j = this.f23334a;
                int size = r1.size();
                int i = ((mzw) r2.mo9520g()).f41872c;
                String strE = r2.mo9518e();
                if (strE == null) {
                    int i2 = mws.f41739d;
                    ((gln) obj).m9432p(mzr.f41857a);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                boolean z = false;
                for (Map.Entry entry : ((mwx) r2.mo9520g()).entrySet()) {
                    String strMo9518e = ((kpl) entry.getValue()).mo9518e();
                    if (strMo9518e == null) {
                        int i3 = mws.f41739d;
                        ((gln) obj).m9432p(mzr.f41857a);
                        return;
                    }
                    glm glmVar = new glm(strE, strMo9518e, (Boolean) ((kpl) entry.getValue()).mo9517d(ivw.f32417c));
                    if (!r1.isEmpty()) {
                        if (size != i) {
                            z = true;
                        } else if (!r1.contains(glmVar)) {
                            z = true;
                        }
                    }
                    arrayList.add(glmVar);
                }
                if (z) {
                    ((gln) obj).m9431o(strE, r1, j);
                }
                ((gln) obj).m9432p(arrayList);
                return;
            case 3:
                Object obj2 = this.f23337d;
                Object obj3 = this.f23335b;
                long j2 = this.f23334a;
                ?? r4 = this.f23336c;
                synchronized (obj2) {
                    Iterator it = ((kkw) obj2).f36423h.iterator();
                    while (it.hasNext()) {
                        klc klcVar = (klc) it.next();
                        if (klcVar.mo14461d() == obj3 && (kfdVarMo14460c = klcVar.mo14460c()) != null && kfdVarMo14460c.f35812c == j2) {
                            r4.add(klcVar);
                            it.remove();
                        }
                    }
                    break;
                }
                if (!r4.isEmpty()) {
                    Iterator it2 = r4.iterator();
                    while (it2.hasNext()) {
                        ((klc) it2.next()).mo14465k(null);
                    }
                    return;
                }
                ((kkw) obj2).f36421f.mo13947i("Received onBufferLost from " + String.valueOf(obj3) + " for frame " + j2 + " but was unable to find a matching request to abort.");
                return;
            default:
                this.f23337d.run();
                lqi.m15856a(this.f23335b.schedule(this, this.f23334a, (TimeUnit) this.f23336c));
                return;
        }
    }
}
