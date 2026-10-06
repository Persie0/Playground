package p000;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.google.android.apps.camera.legacy.app.activity.main.kuX.PMZiHihxLGEy;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aqq {

    /* JADX INFO: renamed from: a */
    public final int f2147a;

    /* JADX INFO: renamed from: b */
    public apm f2148b;

    /* JADX INFO: renamed from: c */
    public final apx f2149c;

    /* JADX INFO: renamed from: d */
    public final String f2150d;

    /* JADX INFO: renamed from: e */
    public final String f2151e;

    public aqq(int i) {
        this.f2147a = i;
    }

    public aqq(apm apmVar, apx apxVar, String str, String str2) {
        this(apxVar.f2088a);
        this.f2148b = apmVar;
        this.f2149c = apxVar;
        this.f2150d = str;
        this.f2151e = str2;
    }

    /* JADX INFO: renamed from: a */
    public static final void m1875a(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int iM18735a = ooc.m18735a(str.charAt(true != z ? i : length), 32);
            if (z) {
                if (iM18735a > 0) {
                    break;
                } else {
                    length--;
                }
            } else if (iM18735a > 0) {
                z = true;
            } else {
                i++;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
            Log.w("SupportSQLite", "delete failed: ", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1877c(aqp aqpVar) {
        aqpVar.mo1868g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        aqpVar.mo1868g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + this.f2150d + "')");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0023  */
    /* JADX WARN: Code duplicated, block: B:21:0x0034 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0036  */
    /* JADX WARN: Code duplicated, block: B:23:0x003b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:66:0x007d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0032 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:? A[LOOP:1: B:12:0x0019->B:72:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: b */
    public final void m1876b(aqp aqpVar, int i, int i2) {
        Iterable iterable;
        TreeMap treeMap;
        Set setKeySet;
        Iterator it;
        boolean z;
        Integer num;
        int i3;
        int iIntValue;
        int iIntValue2;
        apm apmVar = this.f2148b;
        if (apmVar != null) {
            bkn bknVar = apmVar.f2027n;
            if (i == i2) {
                iterable = okv.f46215a;
            } else {
                boolean z2 = i2 > i;
                ArrayList arrayList = new ArrayList();
                int iIntValue3 = i;
                while (true) {
                    if (z2) {
                        if (iIntValue3 >= i2) {
                            iterable = arrayList;
                            break;
                        }
                        treeMap = (TreeMap) bknVar.f3651a.get(Integer.valueOf(iIntValue3));
                        if (treeMap == null) {
                            iterable = null;
                            break;
                        }
                        if (z2) {
                            setKeySet = treeMap.descendingKeySet();
                        } else {
                            setKeySet = treeMap.keySet();
                        }
                        it = setKeySet.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                z = false;
                                break;
                            }
                            num = (Integer) it.next();
                            if (!z2) {
                                num.getClass();
                                iIntValue2 = num.intValue();
                                if (i2 <= iIntValue2 && iIntValue2 < iIntValue3) {
                                    Object obj = treeMap.get(num);
                                    obj.getClass();
                                    arrayList.add(obj);
                                    iIntValue3 = num.intValue();
                                    z = true;
                                    break;
                                    break;
                                }
                            } else {
                                i3 = iIntValue3 + 1;
                                num.getClass();
                                iIntValue = num.intValue();
                                if (i3 <= iIntValue && iIntValue <= i2) {
                                    Object obj2 = treeMap.get(num);
                                    obj2.getClass();
                                    arrayList.add(obj2);
                                    iIntValue3 = num.intValue();
                                    z = true;
                                    break;
                                }
                            }
                        }
                        if (!z) {
                            iterable = null;
                            break;
                        }
                    } else {
                        if (iIntValue3 <= i2) {
                            iterable = arrayList;
                            break;
                        }
                        treeMap = (TreeMap) bknVar.f3651a.get(Integer.valueOf(iIntValue3));
                        if (treeMap == null) {
                            iterable = null;
                            break;
                        }
                        if (z2) {
                            setKeySet = treeMap.descendingKeySet();
                        } else {
                            setKeySet = treeMap.keySet();
                        }
                        it = setKeySet.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                z = false;
                                break;
                                break;
                            }
                            num = (Integer) it.next();
                            if (!z2) {
                                i3 = iIntValue3 + 1;
                                num.getClass();
                                iIntValue = num.intValue();
                                if (i3 <= iIntValue) {
                                    continue;
                                }
                            } else {
                                num.getClass();
                                iIntValue2 = num.intValue();
                                if (i2 <= iIntValue2) {
                                    continue;
                                }
                            }
                        }
                        if (!z) {
                            iterable = null;
                            break;
                        }
                    }
                }
            }
            if (iterable != null) {
                this.f2149c.mo1838e(aqpVar);
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    ((aqc) it2.next()).mo1857a(aqpVar);
                }
                npk npkVarMo1840g = this.f2149c.mo1840g(aqpVar);
                if (!npkVarMo1840g.f44027a) {
                    throw new IllegalStateException("Migration didn't properly handle: ".concat(String.valueOf(npkVarMo1840g.f44028b)));
                }
                this.f2149c.mo1837d(aqpVar);
                m1877c(aqpVar);
                return;
            }
        }
        apm apmVar2 = this.f2148b;
        if (apmVar2 != null && ((i > i2 && apmVar2.f2022i) || !apmVar2.f2021h || apmVar2.f2023j.contains(Integer.valueOf(i)))) {
            this.f2149c.mo1835b(aqpVar);
            this.f2149c.mo1834a(aqpVar);
            return;
        }
        throw new IllegalStateException(PMZiHihxLGEy.yvgbYrraARVZtp + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }
}
