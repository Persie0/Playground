package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jlk implements jky {

    /* JADX INFO: renamed from: b */
    public final AtomicReference f34307b;

    /* JADX INFO: renamed from: d */
    private final String f34309d;

    /* JADX INFO: renamed from: e */
    private final jln f34310e;

    /* JADX INFO: renamed from: f */
    private final ExecutorService f34311f;

    /* JADX INFO: renamed from: g */
    private final nuq f34312g;

    /* JADX INFO: renamed from: a */
    public final Deque f34306a = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    public final AtomicInteger f34308c = new AtomicInteger();

    public jlk(jln jlnVar, String str, nuq nuqVar, nup nupVar, ExecutorService executorService) {
        this.f34311f = executorService;
        this.f34310e = jlnVar;
        this.f34309d = str;
        this.f34312g = nuqVar;
        this.f34307b = new AtomicReference(nupVar);
    }

    @Override // p000.jky
    /* JADX INFO: renamed from: a */
    public final void mo3981a(jkx jkxVar) {
        nps npsVarM17553i;
        synchronized (this.f34306a) {
            if (this.f34306a.isEmpty()) {
                final jln jlnVar = this.f34310e;
                final String str = this.f34309d;
                final nuq nuqVar = this.f34312g;
                final nup nupVar = (nup) this.f34307b.get();
                int i = this.f34312g.f44688g;
                final int iMin = i > 0 ? Math.min(100, i - this.f34308c.get()) : 100;
                npsVarM17553i = nod.m17553i(kxk.m14970P(new nol() { // from class: jlm
                    @Override // p000.nol
                    /* JADX INFO: renamed from: a */
                    public final nps mo3988a() throws IllegalAccessException, InvocationTargetException {
                        long jLongValue;
                        long millis;
                        long millis2;
                        jln jlnVar2 = jlnVar;
                        String str2 = str;
                        nuq nuqVar2 = nuqVar;
                        nup nupVar2 = nupVar;
                        int i2 = iMin;
                        SQLiteDatabase readableDatabase = jlnVar2.f34320a.getReadableDatabase();
                        try {
                            ArrayList arrayList = new ArrayList();
                            StringBuilder sb = new StringBuilder();
                            sb.append("collection_name = ?");
                            arrayList.add(str2);
                            int i3 = nuqVar2.f44685d;
                            int iM17710S = ntw.m17710S(i3);
                            if (iM17710S == 0) {
                                iM17710S = 1;
                            }
                            String str3 = iM17710S != 2 ? "id" : "selection_key";
                            int iM17710S2 = ntw.m17710S(i3);
                            if (iM17710S2 != 0 && iM17710S2 == 2) {
                                jLongValue = nupVar2.f44678a == 2 ? ((Long) nupVar2.f44679b).longValue() : 0L;
                            } else {
                                jLongValue = nupVar2.f44678a == 1 ? ((Long) nupVar2.f44679b).longValue() : 0L;
                            }
                            sb.append(" AND ");
                            sb.append(str3);
                            int iM17710S3 = ntw.m17710S(nuqVar2.f44685d);
                            if (iM17710S3 != 0 && iM17710S3 == 4 && jLongValue > 0) {
                                sb.append(" < ?");
                            } else {
                                sb.append(" > ?");
                            }
                            arrayList.add(Long.toString(jLongValue));
                            if (nuqVar2.f44682a > 0) {
                                sb.append(" AND ((selection_key % ?) BETWEEN CAST(? as INTEGER) AND CAST(? as INTEGER))");
                                arrayList.add(String.valueOf(nuqVar2.f44682a));
                                arrayList.add(String.valueOf(nuqVar2.f44683b));
                                arrayList.add(String.valueOf(nuqVar2.f44684c));
                            }
                            nzw nzwVar = nuqVar2.f44686e;
                            if (nzwVar == null) {
                                nzwVar = nzw.f45101c;
                            }
                            String str4 = "selection_key";
                            long j = nzwVar.f45103a;
                            nzw nzwVar2 = nuqVar2.f44687f;
                            if (nzwVar2 == null) {
                                nzwVar2 = nzw.f45101c;
                            }
                            long j2 = nzwVar2.f45103a;
                            if (j == 0) {
                                millis = 0;
                            } else {
                                long millis3 = TimeUnit.SECONDS.toMillis(j);
                                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                                nzw nzwVar3 = nuqVar2.f44686e;
                                if (nzwVar3 == null) {
                                    nzwVar3 = nzw.f45101c;
                                }
                                millis = millis3 + timeUnit.toMillis(nzwVar3.f45104b);
                            }
                            if (j2 == 0) {
                                millis2 = Long.MAX_VALUE;
                            } else {
                                long millis4 = TimeUnit.SECONDS.toMillis(j2);
                                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                                nzw nzwVar4 = nuqVar2.f44687f;
                                if (nzwVar4 == null) {
                                    nzwVar4 = nzw.f45101c;
                                }
                                millis2 = millis4 + timeUnit2.toMillis(nzwVar4.f45104b);
                            }
                            sb.append(" AND (time BETWEEN CAST(? as INTEGER) AND CAST(? as INTEGER))");
                            arrayList.add(String.valueOf(millis));
                            arrayList.add(String.valueOf(millis2));
                            sb.append(" ORDER BY ");
                            sb.append(str3);
                            sb.append(" ");
                            int iM17710S4 = ntw.m17710S(nuqVar2.f44685d);
                            if (iM17710S4 == 0) {
                                iM17710S4 = 1;
                            }
                            String str5 = "ASC";
                            if (iM17710S4 == 4) {
                                str5 = "DESC";
                            }
                            sb.append(str5);
                            sb.append(" LIMIT ?");
                            arrayList.add(String.valueOf(i2));
                            String str6 = String.format("%s WHERE %s", "SELECT id, time, selection_key, value FROM collections", sb);
                            Arrays.toString(jmv.m13376c(arrayList));
                            Cursor cursorRawQuery = readableDatabase.rawQuery(str6, jmv.m13376c(arrayList));
                            try {
                                ArrayList arrayList2 = new ArrayList();
                                while (cursorRawQuery.moveToNext()) {
                                    nxl nxlVarM18137O = nup.f44676c.m18137O();
                                    int iM17710S5 = ntw.m17710S(nuqVar2.f44685d);
                                    if (iM17710S5 != 0 && iM17710S5 == 2) {
                                        str4 = str4;
                                        long j3 = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex(str4));
                                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                                            nxlVarM18137O.mo18106p();
                                        }
                                        nup nupVar3 = (nup) nxlVarM18137O.f44974b;
                                        nupVar3.f44678a = 2;
                                        nupVar3.f44679b = Long.valueOf(j3);
                                    } else {
                                        long j4 = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("id"));
                                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                                            nxlVarM18137O.mo18106p();
                                        }
                                        nup nupVar4 = (nup) nxlVarM18137O.f44974b;
                                        nupVar4.f44678a = 1;
                                        nupVar4.f44679b = Long.valueOf(j4);
                                    }
                                    arrayList2.add(mrn.m16830a((nup) nxlVarM18137O.mo18103l(), cursorRawQuery.getBlob(cursorRawQuery.getColumnIndex("value"))));
                                    str4 = str4;
                                }
                                arrayList2.size();
                                nps npsVarM14965K = kxk.m14965K(arrayList2);
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
                }, jlnVar.f34323d), new hgv(this, 7), this.f34311f);
            } else {
                npsVarM17553i = kxk.m14965K(null);
            }
        }
        kxk.m14975U(npsVarM17553i, new jlj(this, jkxVar, 0), this.f34311f);
    }

    @Override // p000.jky
    /* JADX INFO: renamed from: b */
    public final void mo3982b() {
    }

    @Override // p000.jky, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
