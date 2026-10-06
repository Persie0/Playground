package p000;

import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fcm implements emj {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ emj f21261a;

    /* JADX INFO: renamed from: n */
    final /* synthetic */ Object f21262n;

    /* JADX INFO: renamed from: o */
    private final /* synthetic */ int f21263o;

    public fcm(emj emjVar, fcp fcpVar, int i) {
        this.f21263o = i;
        this.f21261a = emjVar;
        this.f21262n = fcpVar;
    }

    public fcm(HashMap map, emj emjVar, int i) {
        this.f21263o = i;
        this.f21262n = map;
        this.f21261a = emjVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [fcp, java.lang.Object] */
    @Override // p000.emj
    /* JADX INFO: renamed from: a */
    public final Object mo7509a(lqq lqqVar) {
        switch (this.f21263o) {
            case 0:
                long jCurrentTimeMillis = System.currentTimeMillis();
                Object objMo7509a = this.f21261a.mo7509a(lqqVar);
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                int i = lqqVar.f39001a;
                this.f21262n.mo8171ap(i < 15 ? new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}[i] : 1, objMo7509a != null, (int) jCurrentTimeMillis2);
                return objMo7509a;
            default:
                Object objCast = ((Class) lqqVar.f39002b).cast(((HashMap) this.f21262n).get(lqqVar.f39003c));
                if (objCast == null) {
                    objCast = this.f21261a.mo7509a(lqqVar);
                }
                if (objCast != null) {
                    ((HashMap) this.f21262n).put(lqqVar.f39003c, objCast);
                }
                return objCast;
        }
    }
}
