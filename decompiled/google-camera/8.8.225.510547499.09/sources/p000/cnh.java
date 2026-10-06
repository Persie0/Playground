package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.apps.camera.util.p015ui.mfv.EArqVBjecl;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cnh implements jky {

    /* JADX INFO: renamed from: a */
    public static final nbh f6338a = nbh.m17259h("com/google/android/apps/camera/brella/examplestore/lib/CamExampleIterator");

    /* JADX INFO: renamed from: c */
    public final AtomicReference f6340c;

    /* JADX INFO: renamed from: e */
    private final cnr f6342e;

    /* JADX INFO: renamed from: f */
    private final ExecutorService f6343f;

    /* JADX INFO: renamed from: g */
    private final cny f6344g;

    /* JADX INFO: renamed from: b */
    public final Deque f6339b = new ArrayDeque();

    /* JADX INFO: renamed from: d */
    public final AtomicInteger f6341d = new AtomicInteger();

    public cnh(cnr cnrVar, cny cnyVar, cnw cnwVar, ExecutorService executorService) {
        this.f6343f = executorService;
        this.f6342e = cnrVar;
        this.f6344g = cnyVar;
        this.f6340c = new AtomicReference(cnwVar);
    }

    @Override // p000.jky
    /* JADX INFO: renamed from: a */
    public final void mo3981a(jkx jkxVar) {
        nps npsVarM17553i;
        synchronized (this.f6339b) {
            if (this.f6339b.isEmpty()) {
                final cnr cnrVar = this.f6342e;
                final cny cnyVar = this.f6344g;
                final cnw cnwVar = (cnw) this.f6340c.get();
                int i = this.f6344g.f6408g;
                final int iMin = i > 0 ? Math.min(100, i - this.f6341d.get()) : 100;
                boolean z = !cnyVar.f6410i || cnyVar.f6409h.size() <= 0;
                lku.m15670x(z, "Cannot get both session and media records.Please select only one.");
                npsVarM17553i = nod.m17553i(cnyVar.f6410i ? kxk.m14970P(new ltg(cnrVar, cnyVar, cnwVar, iMin, 1), cnrVar.f6373e) : kxk.m14970P(new nol() { // from class: cnl
                    @Override // p000.nol
                    /* JADX INFO: renamed from: a */
                    public final nps mo3988a() throws IllegalAccessException, InvocationTargetException {
                        cnr cnrVar2 = cnrVar;
                        cny cnyVar2 = cnyVar;
                        cnw cnwVar2 = cnwVar;
                        int i2 = iMin;
                        SQLiteDatabase readableDatabase = cnrVar2.f6370b.getReadableDatabase();
                        try {
                            cno cnoVar = new cno(cnyVar2, cnwVar2, i2, cnrVar2.f6372d);
                            mpw.m16775n(new ceu(cnoVar, 2));
                            mpw.m16775n(new ceu(cnoVar, 3));
                            Cursor cursorRawQuery = readableDatabase.rawQuery(cnoVar.f6362b, cnoVar.m3990b());
                            try {
                                ArrayList arrayList = new ArrayList();
                                while (cursorRawQuery.moveToNext()) {
                                    nxl nxlVarM18137O = cnw.f6395c.m18137O();
                                    int iM6059d = dfm.m6059d(cnyVar2.f6405d);
                                    if (iM6059d != 0 && iM6059d == 2) {
                                        long j = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("selection_key"));
                                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                                            nxlVarM18137O.mo18106p();
                                        }
                                        cnw cnwVar3 = (cnw) nxlVarM18137O.f44974b;
                                        cnwVar3.f6397a = 2;
                                        cnwVar3.f6398b = Long.valueOf(j);
                                    } else {
                                        long j2 = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("media_id"));
                                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                                            nxlVarM18137O.mo18106p();
                                        }
                                        cnw cnwVar4 = (cnw) nxlVarM18137O.f44974b;
                                        cnwVar4.f6397a = 1;
                                        cnwVar4.f6398b = Long.valueOf(j2);
                                    }
                                    cnw cnwVar5 = (cnw) nxlVarM18137O.mo18103l();
                                    mwx mwxVarM17118m = mwx.m17118m(cnoVar.f6361a);
                                    nxl nxlVarM18137O2 = pbs.f47350b.m18137O();
                                    naz nazVarListIterator = mwxVarM17118m.keySet().listIterator();
                                    while (nazVarListIterator.hasNext()) {
                                        String str = (String) nazVarListIterator.next();
                                        cnf cnfVar = (cnf) cnrVar2.f6374f.get(str);
                                        if (cnfVar == null) {
                                            ((nbe) ((nbe) cnr.f6369a.m17252c()).mo17276G((char) 342)).mo17293r("No table with table name: %s", str);
                                        } else {
                                            byte[] blob = cursorRawQuery.getBlob(cursorRawQuery.getColumnIndex(String.format(EArqVBjecl.VmInKGT, mwxVarM17118m.get(str), "value")));
                                            if (blob != null) {
                                                mrm mrmVarMo3980a = cnfVar.mo3980a(blob);
                                                if (mrmVarMo3980a.mo16813g()) {
                                                    nxlVarM18137O2.m18108s((pbs) mrmVarMo3980a.mo16809c());
                                                }
                                            }
                                        }
                                    }
                                    nxl nxlVarM18137O3 = pbp.f47342b.m18137O();
                                    if (!nxlVarM18137O3.f44974b.m18142ac()) {
                                        nxlVarM18137O3.mo18106p();
                                    }
                                    pbp pbpVar = (pbp) nxlVarM18137O3.f44974b;
                                    pbs pbsVar = (pbs) nxlVarM18137O2.mo18103l();
                                    pbsVar.getClass();
                                    pbpVar.f47344a = pbsVar;
                                    nxlVarM18137O3.mo18103l();
                                    nxl nxlVarM18137O4 = pbp.f47342b.m18137O();
                                    if (!nxlVarM18137O4.f44974b.m18142ac()) {
                                        nxlVarM18137O4.mo18106p();
                                    }
                                    pbp pbpVar2 = (pbp) nxlVarM18137O4.f44974b;
                                    pbs pbsVar2 = (pbs) nxlVarM18137O2.mo18103l();
                                    pbsVar2.getClass();
                                    pbpVar2.f47344a = pbsVar2;
                                    arrayList.add(mrn.m16830a(cnwVar5, ((pbp) nxlVarM18137O4.mo18103l()).mo17760J()));
                                }
                                arrayList.size();
                                nps npsVarM14965K = kxk.m14965K(arrayList);
                                if (cursorRawQuery != null) {
                                    cursorRawQuery.close();
                                }
                                if (readableDatabase != null) {
                                    readableDatabase.close();
                                }
                                return npsVarM14965K;
                            } catch (Throwable th) {
                                if (cursorRawQuery == null) {
                                    throw th;
                                }
                                try {
                                    cursorRawQuery.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            if (readableDatabase == null) {
                                throw th3;
                            }
                            try {
                                readableDatabase.close();
                                throw th3;
                            } catch (Throwable th4) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                                throw th3;
                            }
                        }
                    }
                }, cnrVar.f6373e), new ceg(this, 4), this.f6343f);
            } else {
                npsVarM17553i = npp.f44031a;
            }
        }
        kxk.m14975U(npsVarM17553i, new jlj(this, jkxVar, 1), this.f6343f);
    }

    @Override // p000.jky
    /* JADX INFO: renamed from: b */
    public final void mo3982b() {
    }

    @Override // p000.jky, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
