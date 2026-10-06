package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import androidx.wear.widget.iZcI.hiCTUJiAxf;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nuk implements jky {

    /* JADX INFO: renamed from: a */
    public final jky f44663a;

    /* JADX INFO: renamed from: b */
    public final nue f44664b;

    /* JADX INFO: renamed from: c */
    public final nuo f44665c;

    /* JADX INFO: renamed from: d */
    public volatile Deque f44666d = null;

    /* JADX INFO: renamed from: e */
    private final Executor f44667e;

    public nuk(Context context, Executor executor, nue nueVar, jky jkyVar) {
        this.f44667e = kxk.m14956B(executor);
        nuf nufVar = nueVar.f44642a;
        nud nudVar = (nufVar == null ? nuf.f44645d : nufVar).f44648b;
        this.f44665c = new nuo(context, nudVar == null ? nud.f44637b : nudVar);
        this.f44664b = nueVar;
        this.f44663a = jkyVar;
    }

    @Override // p000.jky
    /* JADX INFO: renamed from: a */
    public final void mo3981a(final jkx jkxVar) {
        this.f44667e.execute(new Runnable() { // from class: nui
            @Override // java.lang.Runnable
            public final void run() {
                pbp pbpVar;
                int i;
                nuk nukVar = this.f44660a;
                jkx jkxVar2 = jkxVar;
                String[] strArr = null;
                if (nukVar.f44666d != null) {
                    pbpVar = (pbp) nukVar.f44666d.pollFirst();
                } else {
                    try {
                        num.f44669b.m15809h(hiCTUJiAxf.IqUj);
                        char c = 0;
                        int i2 = 0;
                        while (true) {
                            nqf nqfVarM17621g = nqf.m17621g();
                            nukVar.f44663a.mo3981a(new nuj(nqfVarM17621g));
                            try {
                                mrm mrmVar = (mrm) nqfVarM17621g.get();
                                int i3 = 3;
                                if (mrmVar.mo16813g()) {
                                    nuo nuoVar = nukVar.f44665c;
                                    byte[] bArr = (byte[]) mrmVar.mo16809c();
                                    nxq nxqVarM18123Q = nxq.m18123Q(pbp.f47342b, bArr, 0, bArr.length, nxf.f44904a);
                                    nxq.m18132ae(nxqVarM18123Q);
                                    ContentValues contentValues = new ContentValues();
                                    pbs pbsVar = ((pbp) nxqVarM18123Q).f47344a;
                                    if (pbsVar == null) {
                                        pbsVar = pbs.f47350b;
                                    }
                                    for (Map.Entry entry : Collections.unmodifiableMap(pbsVar.f47352a).entrySet()) {
                                        String str = (String) entry.getKey();
                                        if (nuoVar.f44675c.contains(str)) {
                                            pbq pbqVar = (pbq) entry.getValue();
                                            lku.m15607B(!contentValues.containsKey(str), "Column name `%s` already present in the specified contentValues.", str);
                                            int i4 = pbqVar.f47347a;
                                            switch (i4) {
                                                case 0:
                                                    i = 4;
                                                    break;
                                                case 1:
                                                    i = 1;
                                                    break;
                                                case 2:
                                                    i = 2;
                                                    break;
                                                case 3:
                                                    i = 3;
                                                    break;
                                                default:
                                                    i = 0;
                                                    break;
                                            }
                                            if (i == 0) {
                                                throw null;
                                            }
                                            switch (i - 1) {
                                                case 0:
                                                    pbo pboVar = i4 == 1 ? (pbo) pbqVar.f47348b : pbo.f47339b;
                                                    lku.m15672z(pboVar.f47341a.size() == 1, "Expected %s to be scalar, but bytes_list.value count was: %d", pboVar.f47341a.size());
                                                    contentValues.put(str, ((nwr) pboVar.f47341a.get(0)).m17804A());
                                                    i3 = 3;
                                                    break;
                                                case 1:
                                                    pbt pbtVar = i4 == 2 ? (pbt) pbqVar.f47348b : pbt.f47353b;
                                                    lku.m15672z(pbtVar.f47355a.size() == 1, "Expected %s to be scalar, but float_list.value count was: %d", pbtVar.f47355a.size());
                                                    contentValues.put(str, Float.valueOf(pbtVar.f47355a.mo18032d(0)));
                                                    i3 = 3;
                                                    break;
                                                case 2:
                                                    pbu pbuVar = i4 == i3 ? (pbu) pbqVar.f47348b : pbu.f47356b;
                                                    lku.m15672z(pbuVar.f47358a.size() == 1, "Expected %s to be scalar, but int64_list.value count was: %d", pbuVar.f47358a.size());
                                                    contentValues.put(str, Long.valueOf(pbuVar.f47358a.mo18149a(0)));
                                                    i3 = 3;
                                                    break;
                                                default:
                                                    throw new AssertionError();
                                            }
                                        } else {
                                            i3 = 3;
                                        }
                                    }
                                    contentValues.put(nuoVar.f44674b.f44654c, "Outis");
                                    nuoVar.f44673a.getWritableDatabase().insertOrThrow(nuoVar.f44674b.f44652a, null, contentValues);
                                    i2++;
                                    strArr = null;
                                    c = 0;
                                } else {
                                    lpe lpeVar = num.f44669b;
                                    Object[] objArr = new Object[1];
                                    objArr[c] = Integer.valueOf(i2);
                                    lpeVar.m15810i("Read %d input examples into the FedSQL database.", objArr);
                                    nuo nuoVar2 = nukVar.f44665c;
                                    nuf nufVar = nukVar.f44664b.f44642a;
                                    if (nufVar == null) {
                                        nufVar = nuf.f44645d;
                                    }
                                    String str2 = nufVar.f44649c;
                                    lpe lpeVar2 = nuo.f44672d;
                                    Object[] objArr2 = new Object[1];
                                    objArr2[c] = str2;
                                    lpeVar2.m15810i("Executing SQL query: %s", objArr2);
                                    Cursor cursorRawQuery = nuoVar2.f44673a.getReadableDatabase().rawQuery(str2, strArr);
                                    try {
                                        int count = cursorRawQuery.getCount();
                                        lpe lpeVar3 = nuo.f44672d;
                                        Object[] objArr3 = new Object[1];
                                        objArr3[c] = Integer.valueOf(count);
                                        lpeVar3.m15810i("SQL query returned %d rows", objArr3);
                                        ArrayDeque arrayDeque = new ArrayDeque(count);
                                        while (cursorRawQuery.moveToNext()) {
                                            nxl nxlVarM18137O = pbs.f47350b.m18137O();
                                            for (int i5 = 0; i5 < cursorRawQuery.getColumnCount(); i5++) {
                                                nxl nxlVarM18137O2 = pbq.f47345c.m18137O();
                                                switch (cursorRawQuery.getType(i5)) {
                                                    case 1:
                                                        nxl nxlVarM18137O3 = pbu.f47356b.m18137O();
                                                        nxlVarM18137O3.m18066aC(cursorRawQuery.getLong(i5));
                                                        pbu pbuVar2 = (pbu) nxlVarM18137O3.mo18103l();
                                                        if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                                            nxlVarM18137O2.mo18106p();
                                                        }
                                                        pbq pbqVar2 = (pbq) nxlVarM18137O2.f44974b;
                                                        pbuVar2.getClass();
                                                        pbqVar2.f47348b = pbuVar2;
                                                        pbqVar2.f47347a = 3;
                                                        nxlVarM18137O.m18064aA(cursorRawQuery.getColumnName(i5), (pbq) nxlVarM18137O2.mo18103l());
                                                        break;
                                                    case 2:
                                                        nxl nxlVarM18137O4 = pbt.f47353b.m18137O();
                                                        nxlVarM18137O4.m18065aB(cursorRawQuery.getFloat(i5));
                                                        pbt pbtVar2 = (pbt) nxlVarM18137O4.mo18103l();
                                                        if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                                            nxlVarM18137O2.mo18106p();
                                                        }
                                                        pbq pbqVar3 = (pbq) nxlVarM18137O2.f44974b;
                                                        pbtVar2.getClass();
                                                        pbqVar3.f47348b = pbtVar2;
                                                        pbqVar3.f47347a = 2;
                                                        nxlVarM18137O.m18064aA(cursorRawQuery.getColumnName(i5), (pbq) nxlVarM18137O2.mo18103l());
                                                        break;
                                                    case 3:
                                                    case 4:
                                                        nxl nxlVarM18137O5 = pbo.f47339b.m18137O();
                                                        nxlVarM18137O5.m18096az(nwr.m17799u(cursorRawQuery.getBlob(i5)));
                                                        pbo pboVar2 = (pbo) nxlVarM18137O5.mo18103l();
                                                        if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                                            nxlVarM18137O2.mo18106p();
                                                        }
                                                        pbq pbqVar4 = (pbq) nxlVarM18137O2.f44974b;
                                                        pboVar2.getClass();
                                                        pbqVar4.f47348b = pboVar2;
                                                        pbqVar4.f47347a = 1;
                                                        nxlVarM18137O.m18064aA(cursorRawQuery.getColumnName(i5), (pbq) nxlVarM18137O2.mo18103l());
                                                        break;
                                                    default:
                                                        throw new UnsupportedOperationException(String.format("Unsupported column type for column `%s`: %d", cursorRawQuery.getColumnName(i5), Integer.valueOf(cursorRawQuery.getType(i5))));
                                                }
                                            }
                                            nxl nxlVarM18137O6 = pbp.f47342b.m18137O();
                                            pbs pbsVar2 = (pbs) nxlVarM18137O.mo18103l();
                                            if (!nxlVarM18137O6.f44974b.m18142ac()) {
                                                nxlVarM18137O6.mo18106p();
                                            }
                                            pbp pbpVar2 = (pbp) nxlVarM18137O6.f44974b;
                                            pbsVar2.getClass();
                                            pbpVar2.f47344a = pbsVar2;
                                            arrayDeque.add((pbp) nxlVarM18137O6.mo18103l());
                                        }
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        nukVar.f44666d = arrayDeque;
                                        num.f44669b.m15809h("Emitting SQL query results header.");
                                        nxl nxlVarM18137O7 = pbp.f47342b.m18137O();
                                        nxl nxlVarM18137O8 = pbs.f47350b.m18137O();
                                        nxl nxlVarM18137O9 = pbq.f47345c.m18137O();
                                        nxl nxlVarM18137O10 = pbu.f47356b.m18137O();
                                        nxlVarM18137O10.m18066aC(2L);
                                        if (!nxlVarM18137O9.f44974b.m18142ac()) {
                                            nxlVarM18137O9.mo18106p();
                                        }
                                        pbq pbqVar5 = (pbq) nxlVarM18137O9.f44974b;
                                        pbu pbuVar3 = (pbu) nxlVarM18137O10.mo18103l();
                                        pbuVar3.getClass();
                                        pbqVar5.f47348b = pbuVar3;
                                        pbqVar5.f47347a = 3;
                                        nxlVarM18137O8.m18064aA("client_sql_version", (pbq) nxlVarM18137O9.mo18103l());
                                        pbs pbsVar3 = (pbs) nxlVarM18137O8.mo18103l();
                                        if (!nxlVarM18137O7.f44974b.m18142ac()) {
                                            nxlVarM18137O7.mo18106p();
                                        }
                                        pbp pbpVar3 = (pbp) nxlVarM18137O7.f44974b;
                                        pbsVar3.getClass();
                                        pbpVar3.f47344a = pbsVar3;
                                        pbpVar = (pbp) nxlVarM18137O7.mo18103l();
                                    } catch (Throwable th) {
                                        if (cursorRawQuery == null) {
                                            throw th;
                                        }
                                        try {
                                            cursorRawQuery.close();
                                            throw th;
                                        } catch (Throwable th2) {
                                            try {
                                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                                throw th;
                                            } catch (Exception e) {
                                                throw th;
                                            }
                                        }
                                    }
                                }
                            } catch (ExecutionException e2) {
                                Throwable cause = e2.getCause();
                                cause.getClass();
                                nul nulVar = (nul) cause;
                                throw new nul(nulVar.f44668a, nulVar.getMessage(), e2);
                            }
                        }
                    } catch (InterruptedException e3) {
                        e = e3;
                        jkxVar2.mo13325a(8, e.getMessage());
                        return;
                    } catch (nul e4) {
                        jkxVar2.mo13325a(e4.f44668a, e4.getMessage());
                        return;
                    } catch (nyb e5) {
                        e = e5;
                        jkxVar2.mo13325a(8, e.getMessage());
                        return;
                    }
                }
                jkxVar2.mo13326b(pbpVar == null ? null : pbpVar.mo17760J(), null);
            }
        });
    }

    @Override // p000.jky
    /* JADX INFO: renamed from: b */
    public final void mo3982b() {
        num.f44669b.m15809h("request() called");
    }

    @Override // p000.jky, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f44667e.execute(new lmg(this, 17));
    }
}
