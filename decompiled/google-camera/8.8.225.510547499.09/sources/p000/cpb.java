package p000;

import android.app.DownloadManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.hardware.HardwareBuffer;
import android.net.Uri;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import com.google.android.libraries.social.licenses.GWO.HEePJw;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cpb implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f8515a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f8516b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f8517c;

    public /* synthetic */ cpb(cpd cpdVar, csn csnVar, int i) {
        this.f8517c = i;
        this.f8515a = cpdVar;
        this.f8516b = csnVar;
    }

    public /* synthetic */ cpb(ddr ddrVar, ddp ddpVar, int i) {
        this.f8517c = i;
        this.f8516b = ddrVar;
        this.f8515a = ddpVar;
    }

    public /* synthetic */ cpb(djr djrVar, chp chpVar, int i) {
        this.f8517c = i;
        this.f8516b = djrVar;
        this.f8515a = chpVar;
    }

    public /* synthetic */ cpb(dqr dqrVar, cvy cvyVar, int i, byte[] bArr, byte[] bArr2) {
        this.f8517c = i;
        this.f8515a = dqrVar;
        this.f8516b = cvyVar;
    }

    public /* synthetic */ cpb(dqr dqrVar, drj drjVar, int i, byte[] bArr) {
        this.f8517c = i;
        this.f8516b = dqrVar;
        this.f8515a = drjVar;
    }

    public /* synthetic */ cpb(dsf dsfVar, dsj dsjVar, int i) {
        this.f8517c = i;
        this.f8515a = dsfVar;
        this.f8516b = dsjVar;
    }

    public /* synthetic */ cpb(hth hthVar, Supplier supplier, int i) {
        this.f8517c = i;
        this.f8515a = hthVar;
        this.f8516b = supplier;
    }

    public /* synthetic */ cpb(ihk ihkVar, Uri uri, int i, byte[] bArr, byte[] bArr2) {
        this.f8517c = i;
        this.f8516b = ihkVar;
        this.f8515a = uri;
    }

    public /* synthetic */ cpb(Runnable runnable, Object obj, int i) {
        this.f8517c = i;
        this.f8516b = runnable;
        this.f8515a = obj;
    }

    public cpb(Method method, View view, int i) {
        this.f8517c = i;
        this.f8516b = method;
        this.f8515a = view;
    }

    public /* synthetic */ cpb(kbw kbwVar, Callable callable, int i) {
        this.f8517c = i;
        this.f8515a = kbwVar;
        this.f8516b = callable;
    }

    public /* synthetic */ cpb(kbz kbzVar, ohb ohbVar, int i) {
        this.f8517c = i;
        this.f8515a = kbzVar;
        this.f8516b = ohbVar;
    }

    public /* synthetic */ cpb(lrd lrdVar, lre lreVar, int i) {
        this.f8517c = i;
        this.f8515a = lrdVar;
        this.f8516b = lreVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v12, types: [dsj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, ohb] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, java.util.function.Supplier] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [chp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, nyw] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        HardwareBuffer hardwareBuffer;
        Cursor cursorQuery;
        inf infVar = null;
        switch (this.f8517c) {
            case 0:
                return ((cpd) this.f8515a).f8529g.m5738a(((csn) this.f8516b).f9339d);
            case 1:
                ?? r0 = this.f8516b;
                Object obj = this.f8515a;
                int i = ckf.f5972a;
                r0.run();
                return obj;
            case 2:
                Object obj2 = this.f8516b;
                Object obj3 = this.f8515a;
                try {
                    return ((ddr) obj2).f10578a.mo4085y().mo5939a((ddp) obj3);
                } catch (SQLiteException e) {
                    return new ddj((ddp) obj3);
                }
            case 3:
                djr djrVar = (djr) this.f8516b;
                return Boolean.valueOf(djrVar.f11810p.m2605A(djrVar.f11798d, this.f8515a));
            case 4:
                return ((dqs) ((dqr) this.f8515a).f12350b).m6603c((cvy) this.f8516b);
            case 5:
                return ((drl) ((dqr) this.f8516b).f12349a).m6641b((drj) this.f8515a);
            case 6:
                Object obj4 = this.f8515a;
                ?? r1 = this.f8516b;
                dse dseVar = ((dsf) obj4).f12487e;
                dseVar.getClass();
                dseVar.f12477b.get(dseVar.f12481f.f12486d, TimeUnit.MILLISECONDS);
                synchronized (dseVar.f12479d) {
                    hardwareBuffer = dseVar.f12480e;
                    break;
                }
                r1.mo6659e();
                return r1.mo6656b(hardwareBuffer);
            case 7:
                ?? r2 = this.f8515a;
                ?? r3 = this.f8516b;
                r2.mo13961e("PhotoModeStartup");
                r2.mo13961e("get");
                hjk hjkVar = (hjk) r3.get();
                r2.mo13963g("run");
                hjkVar.run();
                r2.mo13962f();
                r2.mo13962f();
                return Boolean.TRUE;
            case 8:
                Object obj5 = this.f8515a;
                ?? r4 = this.f8516b;
                hth hthVar = (hth) obj5;
                if (hthVar.f29503d.decrementAndGet() > 0) {
                    throw new CancellationException("Found another update in flight.");
                }
                htk htkVar = (htk) r4.get();
                hthVar.f29504e.incrementAndGet();
                return htkVar;
            case 9:
                Object obj6 = this.f8516b;
                Object obj7 = this.f8515a;
                Object obj8 = ((ihk) obj6).f30967b;
                jvd.m13539b();
                ine ineVar = (ine) obj8;
                Long lMo11509a = ineVar.mo11509a((Uri) obj7);
                if (lMo11509a != null) {
                    DownloadManager.Query query = new DownloadManager.Query();
                    query.setFilterById(lMo11509a.longValue());
                    cursorQuery = ineVar.f31582c.query(query);
                    if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                        cursorQuery = null;
                    }
                } else {
                    cursorQuery = null;
                }
                if (cursorQuery != null) {
                    long j = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("bytes_so_far"));
                    long j2 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("total_size"));
                    inf infVar2 = new inf();
                    if (j2 <= 0 || j < 0) {
                        infVar2.f31585b = 0.0f;
                    } else {
                        infVar2.f31585b = j / j2;
                    }
                    infVar2.f31584a = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow(HEePJw.gFbp));
                    infVar2.f31586c = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("local_uri"));
                    cursorQuery.close();
                    infVar = infVar2;
                }
                return mrm.m16828h(infVar);
            case 10:
                ?? r5 = this.f8515a;
                ?? r6 = this.f8516b;
                try {
                    r5.mo13961e("Primes");
                    return r6.call();
                } finally {
                    Trace.endSection();
                }
            case 11:
                Object obj9 = this.f8515a;
                ?? r7 = this.f8516b;
                lsg lsgVar = new lsg();
                try {
                    C1058va c1058vaM15829f = ((lpj) ((lrd) obj9).f39057b).m15829f();
                    Object obj10 = ((lrd) obj9).f39058c;
                    lsv lsvVar = new lsv(r7);
                    lsvVar.f39144a = new lsg[]{lsgVar};
                    break;
                } catch (IOException | RuntimeException e2) {
                    Log.w("SnapshotHandler", "Failed to update snapshot for " + ((String) ((lrd) obj9).f39059d) + " flags may be stale.", e2);
                }
                return null;
            default:
                return ((Method) this.f8516b).invoke(this.f8515a, null);
        }
    }
}
