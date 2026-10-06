package p000;

import android.os.SystemClock;
import com.google.android.apps.camera.camerafatalerror.CameraFatalErrorTrackerDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p021j$.util.Collection$EL;
import p021j$.util.DesugarArrays;
import p021j$.util.stream.Collectors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class czx implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f10180a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f10181b;

    public /* synthetic */ czx(czy czyVar, int i) {
        this.f10181b = i;
        this.f10180a = czyVar;
    }

    public /* synthetic */ czx(dav davVar, int i) {
        this.f10181b = i;
        this.f10180a = davVar;
    }

    public /* synthetic */ czx(dbx dbxVar, int i) {
        this.f10181b = i;
        this.f10180a = dbxVar;
    }

    public /* synthetic */ czx(dct dctVar, int i) {
        this.f10181b = i;
        this.f10180a = dctVar;
    }

    public /* synthetic */ czx(ddw ddwVar, int i) {
        this.f10181b = i;
        this.f10180a = ddwVar;
    }

    public /* synthetic */ czx(deb debVar, int i) {
        this.f10181b = i;
        this.f10180a = debVar;
    }

    public /* synthetic */ czx(dep depVar, int i) {
        this.f10181b = i;
        this.f10180a = depVar;
    }

    public /* synthetic */ czx(dex dexVar, int i) {
        this.f10181b = i;
        this.f10180a = dexVar;
    }

    public /* synthetic */ czx(djm djmVar, int i, byte[] bArr) {
        this.f10181b = i;
        this.f10180a = djmVar;
    }

    public /* synthetic */ czx(hsq hsqVar, int i, byte[] bArr) {
        this.f10181b = i;
        this.f10180a = hsqVar;
    }

    public /* synthetic */ czx(jvb jvbVar, int i) {
        this.f10181b = i;
        this.f10180a = jvbVar;
    }

    public /* synthetic */ czx(kvn kvnVar, int i) {
        this.f10181b = i;
        this.f10180a = kvnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object, kvn] */
    /* JADX WARN: Type inference failed for: r3v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.concurrent.ScheduledFuture] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    @Override // java.lang.Runnable
    public final void run() {
        ScheduledFuture scheduledFuture;
        int i = 16;
        ?? r3 = 0;
        r3 = 0;
        switch (this.f10181b) {
            case 0:
                czy czyVar = (czy) this.f10180a;
                czyVar.f10188e = true;
                if (czyVar.f10187d) {
                    czyVar.f10185b.m5756d();
                    czyVar.m5764b();
                    return;
                }
                return;
            case 1:
                czy czyVar2 = (czy) this.f10180a;
                czyVar2.f10184a.execute(new cui(czyVar2, 19));
                return;
            case 2:
                ((dav) this.f10180a).f10313A.m13090Z("washington_tooltip");
                return;
            case 3:
                ((dav) this.f10180a).m5849d();
                return;
            case 4:
                ((dav) ((hsq) this.f10180a).f29435b).f10313A.m13090Z("try_washington_tooltip");
                return;
            case 5:
                ((dav) ((hsq) this.f10180a).f29435b).m5849d();
                return;
            case 6:
                dbx dbxVar = (dbx) this.f10180a;
                dbxVar.f10458a.m5897f(dbxVar.f10460c);
                dbxVar.f10458a.m5899h(dbxVar.f10459b);
                return;
            case 7:
                djm djmVar = (djm) this.f10180a;
                ddd dddVarMo4084x = ((CameraFatalErrorTrackerDatabase) djmVar.f11787a).mo4084x();
                ddi ddiVar = (ddi) dddVarMo4084x;
                ddiVar.f10557a.m1824l();
                arf arfVarM1853e = ddiVar.f10560d.m1853e();
                ddiVar.f10557a.m1825m();
                try {
                    arfVarM1853e.m1883a();
                    ((ddi) dddVarMo4084x).f10557a.m1829q();
                    ddiVar.f10557a.m1827o();
                    ddiVar.f10560d.m1855g(arfVarM1853e);
                    dcw dcwVarMo4083w = ((CameraFatalErrorTrackerDatabase) djmVar.f11787a).mo4083w();
                    ddb ddbVar = (ddb) dcwVarMo4083w;
                    ddbVar.f10545a.m1824l();
                    arf arfVarM1853e2 = ddbVar.f10548d.m1853e();
                    ddbVar.f10545a.m1825m();
                    try {
                        arfVarM1853e2.m1883a();
                        ((ddb) dcwVarMo4083w).f10545a.m1829q();
                        ddbVar.f10545a.m1827o();
                        ddbVar.f10548d.m1855g(arfVarM1853e2);
                        DesugarArrays.stream(ddp.values()).forEach(new dco(djmVar, 2, r3));
                        return;
                    } catch (Throwable th) {
                        ddbVar.f10545a.m1827o();
                        ddbVar.f10548d.m1855g(arfVarM1853e2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    ddiVar.f10557a.m1827o();
                    ddiVar.f10560d.m1855g(arfVarM1853e);
                    throw th2;
                }
            case 8:
                ((dct) this.f10180a).f10528b.mo4083w().mo5937a();
                return;
            case 9:
                ((ddw) this.f10180a).m5959b();
                return;
            case 10:
                ((jvb) this.f10180a).close();
                return;
            case 11:
                dep depVar = (dep) this.f10180a;
                depVar.f10689h = true;
                depVar.f10690i = false;
                depVar.m6013i();
                return;
            case 12:
                dep depVar2 = (dep) this.f10180a;
                if (depVar2.f10687f) {
                    depVar2.f10683b.mo5999e();
                    if (depVar2.f10678G == null) {
                        hnu hnuVarM10522a = hnq.f28522a;
                        if (depVar2.f10673B.m5981c()) {
                            hny hnyVarM10529a = hnz.m10529a();
                            hnyVarM10529a.m10524c(depVar2.f10692k);
                            hnyVarM10529a.m10525d("Lens suggestion");
                            hnyVarM10529a.m10526e(new czx(depVar2, 13));
                            hnyVarM10529a.m10527f(new czx(depVar2, i));
                            hnyVarM10529a.m10528g(depVar2.f10706y);
                            hnuVarM10522a = hnyVarM10529a.m10522a();
                        }
                        depVar2.f10678G = hnuVarM10522a;
                        depVar2.f10682a = depVar2.f10674C.mo10519f(hnuVarM10522a);
                    }
                    ddw ddwVar = depVar2.f10672A;
                    ddwVar.f10608c.execute(new czx(ddwVar, 9));
                    return;
                }
                return;
            case 13:
                dep depVar3 = (dep) this.f10180a;
                depVar3.f10692k.execute(new czx(depVar3, 15));
                return;
            case 14:
                dep depVar4 = (dep) this.f10180a;
                depVar4.f10676E = mrm.m16829i(depVar4.f10704w.schedule(new czx(depVar4, i), 1L, TimeUnit.SECONDS));
                return;
            case 15:
                dep depVar5 = (dep) this.f10180a;
                if (depVar5.f10687f) {
                    depVar5.f10683b.mo6003i();
                    depVar5.f10683b.mo6001g();
                    return;
                }
                return;
            case 16:
                dep depVar6 = (dep) this.f10180a;
                depVar6.f10692k.execute(new czx(depVar6, 12));
                return;
            case 17:
                dep depVar7 = (dep) this.f10180a;
                depVar7.f10690i = true;
                depVar7.m6012h();
                return;
            case 18:
                long j = ((deb) this.f10180a).f10631a;
                return;
            case 19:
                this.f10180a.mo14931b();
                return;
            default:
                Object obj = this.f10180a;
                ArrayList arrayList = new ArrayList();
                synchronized (obj) {
                    arrayList.addAll((Collection) Collection$EL.stream(((dex) obj).f10753b.entrySet()).filter(new dll(SystemClock.elapsedRealtime(), 1)).map(cqk.f8921h).collect(Collectors.toList()));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((dex) obj).f10753b.remove((Long) it.next());
                    }
                    if (((dex) obj).f10753b.isEmpty() && (scheduledFuture = ((dex) obj).f10755d) != null) {
                        ((dex) obj).f10755d = null;
                        r3 = scheduledFuture;
                    }
                    break;
                }
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((dex) obj).f10754c.mo6027a((Long) arrayList.get(i2));
                }
                dex.m6028b(r3);
                return;
        }
    }
}
