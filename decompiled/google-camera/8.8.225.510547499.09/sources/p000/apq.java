package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class apq implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ apr f2030a;

    public apq(apr aprVar) {
        this.f2030a = aprVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, otq] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.Collection] */
    @Override // java.lang.Runnable
    public final void run() {
        Set setM18717v;
        ?? r5;
        Lock lockM1822j = this.f2030a.f2032a.m1822j();
        lockM1822j.lock();
        try {
            try {
                apr aprVar = this.f2030a;
                if (aprVar.f2032a.m1831s()) {
                    if (!aprVar.f2036e) {
                        aprVar.f2032a.m1818c().mo1802a();
                    }
                    if (!aprVar.f2036e) {
                        Log.e("ROOM", "database is not initialized even though it is open");
                    } else if (this.f2030a.f2035d.compareAndSet(true, false) && !this.f2030a.f2032a.m1830r()) {
                        aqp aqpVarMo1802a = this.f2030a.f2032a.m1818c().mo1802a();
                        aqpVarMo1802a.mo1866e();
                        try {
                            apr aprVar2 = this.f2030a;
                            setM18717v = omn.m18717v();
                            Cursor cursorM1833u = aprVar2.f2032a.m1833u(new aqo("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
                            while (cursorM1833u.moveToNext()) {
                                try {
                                    setM18717v.add(Integer.valueOf(cursorM1833u.getInt(0)));
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        omn.m18709n(cursorM1833u, th);
                                        throw th2;
                                    }
                                }
                            }
                            omn.m18709n(cursorM1833u, null);
                            omn.m18720y(setM18717v);
                            if (!setM18717v.isEmpty()) {
                                if (this.f2030a.f2040i == null) {
                                    throw new IllegalStateException("Required value was null.");
                                }
                                arf arfVar = this.f2030a.f2040i;
                                if (arfVar == null) {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                arfVar.m1883a();
                            }
                            aqpVarMo1802a.mo1869h();
                            aqpVarMo1802a.mo1867f();
                            lockM1822j.unlock();
                            if (setM18717v.isEmpty()) {
                                return;
                            }
                            apr aprVar3 = this.f2030a;
                            synchronized (aprVar3.f2037f) {
                                Iterator it = aprVar3.f2037f.iterator();
                                while (it.hasNext()) {
                                    bbo bboVar = (bbo) ((Map.Entry) it.next()).getValue();
                                    Object obj = bboVar.f2909c;
                                    switch (((int[]) obj).length) {
                                        case 1:
                                            if (setM18717v.contains(Integer.valueOf(((int[]) obj)[0]))) {
                                                r5 = bboVar.f2908b;
                                                break;
                                            }
                                        case 0:
                                            r5 = okx.f46217a;
                                            break;
                                        default:
                                            Set setM18717v2 = omn.m18717v();
                                            Object obj2 = bboVar.f2909c;
                                            int length = ((int[]) obj2).length;
                                            int i = 0;
                                            int i2 = 0;
                                            while (i < length) {
                                                int i3 = i2 + 1;
                                                if (setM18717v.contains(Integer.valueOf(((int[]) obj2)[i]))) {
                                                    setM18717v2.add(((String[]) bboVar.f2910d)[i2]);
                                                }
                                                i++;
                                                i2 = i3;
                                            }
                                            omn.m18720y(setM18717v2);
                                            r5 = setM18717v2;
                                            break;
                                    }
                                    if (!r5.isEmpty()) {
                                        ((app) bboVar.f2907a).f2029b.mo19057s(oki.f46196a);
                                    }
                                }
                            }
                            return;
                        } catch (Throwable th3) {
                            aqpVarMo1802a.mo1867f();
                            throw th3;
                        }
                    }
                }
                lockM1822j.unlock();
            } catch (SQLiteException e) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                setM18717v = okx.f46217a;
            } catch (IllegalStateException e2) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
                setM18717v = okx.f46217a;
            }
        } catch (Throwable th4) {
            lockM1822j.unlock();
            throw th4;
        }
    }
}
