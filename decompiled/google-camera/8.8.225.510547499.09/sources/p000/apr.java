package p000;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class apr {

    /* JADX INFO: renamed from: m */
    private static final String[] f2031m = {"UPDATE", "DELETE", "INSERT"};

    /* JADX INFO: renamed from: a */
    public final apt f2032a;

    /* JADX INFO: renamed from: b */
    public final Map f2033b;

    /* JADX INFO: renamed from: c */
    public final Map f2034c;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f2035d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e */
    public volatile boolean f2036e;

    /* JADX INFO: renamed from: f */
    public final C0943qu f2037f;

    /* JADX INFO: renamed from: g */
    public final Object f2038g;

    /* JADX INFO: renamed from: h */
    public final Runnable f2039h;

    /* JADX INFO: renamed from: i */
    public volatile arf f2040i;

    /* JADX INFO: renamed from: j */
    public adq f2041j;

    /* JADX INFO: renamed from: k */
    public aeh f2042k;

    /* JADX INFO: renamed from: l */
    public final jwl f2043l;

    /* JADX INFO: renamed from: n */
    private final Map f2044n;

    /* JADX INFO: renamed from: o */
    private final String[] f2045o;

    /* JADX INFO: renamed from: p */
    private final Object f2046p;

    public apr(apt aptVar, Map map, Map map2, String... strArr) {
        String lowerCase;
        this.f2032a = aptVar;
        this.f2044n = map;
        this.f2033b = map2;
        int length = strArr.length;
        this.f2043l = new jwl(length);
        Collections.newSetFromMap(new IdentityHashMap()).getClass();
        this.f2037f = new C0943qu();
        this.f2046p = new Object();
        this.f2038g = new Object();
        this.f2034c = new LinkedHashMap();
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase2 = str.toLowerCase(locale);
            lowerCase2.getClass();
            this.f2034c.put(lowerCase2, Integer.valueOf(i));
            String str2 = (String) this.f2044n.get(strArr[i]);
            if (str2 != null) {
                Locale locale2 = Locale.US;
                locale2.getClass();
                lowerCase = str2.toLowerCase(locale2);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i] = lowerCase2;
        }
        this.f2045o = strArr2;
        for (Map.Entry entry : this.f2044n.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale3 = Locale.US;
            locale3.getClass();
            String lowerCase3 = str3.toLowerCase(locale3);
            lowerCase3.getClass();
            if (this.f2034c.containsKey(lowerCase3)) {
                String str4 = (String) entry.getKey();
                Locale locale4 = Locale.US;
                locale4.getClass();
                String lowerCase4 = str4.toLowerCase(locale4);
                lowerCase4.getClass();
                Map map3 = this.f2034c;
                Object obj = map3.get(lowerCase3);
                if (obj == null && !map3.containsKey(lowerCase3)) {
                    throw new NoSuchElementException("Key " + ((Object) lowerCase3) + " is missing in the map.");
                }
                map3.put(lowerCase4, obj);
            }
        }
        this.f2039h = new apq(this);
    }

    /* JADX INFO: renamed from: a */
    public final void m1810a(app appVar) {
        bbo bboVar;
        boolean z;
        synchronized (this.f2037f) {
            bboVar = (bbo) this.f2037f.mo19349b(appVar);
        }
        if (bboVar != null) {
            jwl jwlVar = this.f2043l;
            int[] iArr = (int[]) bboVar.f2909c;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            iArrCopyOf.getClass();
            synchronized (jwlVar) {
                z = false;
                for (int i : iArrCopyOf) {
                    Object obj = jwlVar.f34956c;
                    long j = ((long[]) obj)[i];
                    ((long[]) obj)[i] = (-1) + j;
                    if (j == 1) {
                        z = true;
                        jwlVar.f34954a = true;
                    }
                }
            }
            if (z) {
                m1811b();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1811b() {
        if (this.f2032a.m1831s()) {
            m1812c(this.f2032a.m1818c().mo1802a());
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1812c(aqp aqpVar) {
        int[] iArr;
        int[] iArr2;
        if (aqpVar.mo1870i()) {
            return;
        }
        try {
            Lock lockM1822j = this.f2032a.m1822j();
            lockM1822j.lock();
            try {
                synchronized (this.f2046p) {
                    jwl jwlVar = this.f2043l;
                    synchronized (jwlVar) {
                        if (jwlVar.f34954a) {
                            Object obj = jwlVar.f34956c;
                            int length = ((long[]) obj).length;
                            int i = 0;
                            int i2 = 0;
                            while (i < length) {
                                long j = ((long[]) obj)[i];
                                int i3 = i2 + 1;
                                boolean z = j > 0;
                                Object obj2 = jwlVar.f34955b;
                                if (z != ((boolean[]) obj2)[i2]) {
                                    ((int[]) jwlVar.f34957d)[i2] = j > 0 ? 1 : 2;
                                } else {
                                    ((int[]) jwlVar.f34957d)[i2] = 0;
                                }
                                ((boolean[]) obj2)[i2] = z;
                                i++;
                                i2 = i3;
                            }
                            jwlVar.f34954a = false;
                            iArr = (int[]) jwlVar.f34957d.clone();
                        } else {
                            iArr = null;
                        }
                    }
                    if (iArr == null) {
                        lockM1822j.unlock();
                        return;
                    }
                    if (aqpVar.mo1872k()) {
                        aqpVar.mo1866e();
                    } else {
                        aqpVar.mo1865d();
                    }
                    try {
                        int length2 = iArr.length;
                        int i4 = 0;
                        int i5 = 0;
                        while (i4 < length2) {
                            int i6 = i5 + 1;
                            switch (iArr[i4]) {
                                case 1:
                                    aqpVar.mo1868g("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i5 + ", 0)");
                                    String str = this.f2045o[i5];
                                    String[] strArr = f2031m;
                                    int i7 = 0;
                                    for (int i8 = 3; i7 < i8; i8 = 3) {
                                        String str2 = strArr[i7];
                                        aqpVar.mo1868g("CREATE TEMP TRIGGER IF NOT EXISTS " + aeb.m319c(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i5 + " AND invalidated = 0; END");
                                        i7++;
                                        iArr = iArr;
                                    }
                                    iArr2 = iArr;
                                    break;
                                case 2:
                                    String str3 = this.f2045o[i5];
                                    String[] strArr2 = f2031m;
                                    for (int i9 = 0; i9 < 3; i9++) {
                                        aqpVar.mo1868g("DROP TRIGGER IF EXISTS ".concat(aeb.m319c(str3, strArr2[i9])));
                                    }
                                    iArr2 = iArr;
                                    break;
                                default:
                                    iArr2 = iArr;
                                    break;
                            }
                            i4++;
                            i5 = i6;
                            iArr = iArr2;
                        }
                        aqpVar.mo1869h();
                        aqpVar.mo1867f();
                        lockM1822j.unlock();
                    } catch (Throwable th) {
                        aqpVar.mo1867f();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                lockM1822j.unlock();
                throw th2;
            }
        } catch (SQLiteException e) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
        } catch (IllegalStateException e2) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
        }
    }
}
