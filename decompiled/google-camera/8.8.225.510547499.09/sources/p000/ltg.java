package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ltg implements nol {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ nyw f39151a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f39152b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f39153c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f39154d;

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ int f39155e;

    public /* synthetic */ ltg(cnr cnrVar, cny cnyVar, cnw cnwVar, int i, int i2) {
        this.f39155e = i2;
        this.f39153c = cnrVar;
        this.f39154d = cnyVar;
        this.f39151a = cnwVar;
        this.f39152b = i;
    }

    public /* synthetic */ ltg(lth lthVar, nyw nywVar, int i, List list, int i2) {
        this.f39155e = i2;
        this.f39153c = lthVar;
        this.f39151a = nywVar;
        this.f39152b = i;
        this.f39154d = list;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // p000.nol
    /* JADX INFO: renamed from: a */
    public final nps mo3988a() throws IllegalAccessException, InvocationTargetException {
        switch (this.f39155e) {
            case 0:
                Object obj = this.f39153c;
                nyw nywVar = this.f39151a;
                int i = this.f39152b;
                ?? r3 = this.f39154d;
                nps npsVarM14965K = kxk.m14965K(nywVar);
                for (int i2 = 0; i2 < i; i2++) {
                    if (((Boolean) kxk.m14973S((Future) r3.get(i2))).booleanValue()) {
                        npsVarM14965K = nod.m17554j(npsVarM14965K, mov.m16716b(new cnc((lte) ((lth) obj).f39156a.get(i2), 14)), not.INSTANCE);
                    }
                }
                return npsVarM14965K;
            default:
                Object obj2 = this.f39153c;
                Object obj3 = this.f39154d;
                nyw nywVar2 = this.f39151a;
                int i3 = this.f39152b;
                SQLiteDatabase readableDatabase = ((cnr) obj2).f6370b.getReadableDatabase();
                try {
                    dsx dsxVar = new dsx((cny) obj3, (cnw) nywVar2, i3);
                    mpw.m16775n(new ceu(dsxVar, 4, null, null, null));
                    mpw.m16775n(new ceu(dsxVar, 5, null, null, null));
                    Cursor cursorRawQuery = readableDatabase.rawQuery((String) dsxVar.f12521a, dsxVar.m6702q());
                    try {
                        ArrayList arrayList = new ArrayList();
                        while (cursorRawQuery.moveToNext()) {
                            nxl nxlVarM18137O = cnw.f6395c.m18137O();
                            long j = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("session_id"));
                            if (!nxlVarM18137O.f44974b.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            cnw cnwVar = (cnw) nxlVarM18137O.f44974b;
                            cnwVar.f6397a = 1;
                            cnwVar.f6398b = Long.valueOf(j);
                            arrayList.add(mrn.m16830a((cnw) nxlVarM18137O.mo18103l(), cursorRawQuery.getBlob(cursorRawQuery.getColumnIndex("value"))));
                        }
                        arrayList.size();
                        nps npsVarM14965K2 = kxk.m14965K(arrayList);
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        if (readableDatabase != null) {
                            readableDatabase.close();
                        }
                        return npsVarM14965K2;
                    } catch (Throwable th) {
                        if (cursorRawQuery != null) {
                            try {
                                cursorRawQuery.close();
                            } catch (Throwable th2) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            }
                            break;
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    if (readableDatabase != null) {
                        try {
                            readableDatabase.close();
                        } catch (Throwable th4) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                        }
                        break;
                    }
                    throw th3;
                }
        }
    }
}
