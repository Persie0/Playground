package p317p7;

import android.content.Context;
import android.os.Bundle;
import dm.C5207g;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.Regex;
import p067d8.C5086z;
import p080e.RunnableC5286r;
import p173i8.C6205a;
import p260m8.C7499b;
import p291o7.C7993c0;
import p291o7.C8004n;

/* JADX INFO: renamed from: p7.k */
/* JADX INFO: loaded from: classes.dex */
public final class C8204k {

    /* JADX INFO: renamed from: a */
    public final C8201h f44402a;

    /* JADX INFO: renamed from: p7.k$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static void m16341a(HashMap map) {
            String[] strArr;
            C8206m c8206m = C8206m.f44408a;
            if (C6205a.m12742b(C8206m.class)) {
                return;
            }
            try {
                boolean z10 = C8206m.f44411d.get();
                C8206m c8206m2 = C8206m.f44408a;
                if (!z10) {
                    c8206m2.m16348b();
                }
                Iterator it = map.entrySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    ConcurrentHashMap<String, String> concurrentHashMap = C8206m.f44413f;
                    if (!zHasNext) {
                        String str = "com.facebook.appevents.UserDataStore.internalUserData";
                        String strM10808G = C5086z.m10808G(concurrentHashMap);
                        c8206m2.getClass();
                        if (C6205a.m12742b(c8206m2)) {
                            return;
                        }
                        try {
                            C8004n.m15873c().execute(new RunnableC5286r(str, 7, strM10808G));
                            return;
                        } catch (Throwable th2) {
                            C6205a.m12741a(c8206m2, th2);
                            return;
                        }
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    String str2 = (String) entry.getKey();
                    String str3 = (String) entry.getValue();
                    C5086z c5086z = C5086z.f33015a;
                    int i10 = 1;
                    int length = str3.length() - 1;
                    int i11 = 0;
                    boolean z11 = false;
                    while (i11 <= length) {
                        boolean z12 = C5207g.m11113h(str3.charAt(!z11 ? i11 : length), 32) <= 0;
                        if (z11) {
                            if (!z12) {
                                break;
                            } else {
                                length--;
                            }
                        } else if (z12) {
                            i11++;
                        } else {
                            z11 = true;
                        }
                    }
                    String strM10814M = C5086z.m10814M(c8206m2.m16349c(str2, str3.subSequence(i11, length + 1).toString()));
                    if (concurrentHashMap.containsKey(str2)) {
                        String str4 = concurrentHashMap.get(str2);
                        if (str4 == null) {
                            strArr = null;
                        } else {
                            Object[] array = new Regex(",").m14273d(str4).toArray(new String[0]);
                            if (array == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                            }
                            strArr = (String[]) array;
                        }
                        if (strArr == null) {
                            strArr = new String[0];
                        }
                        Set setM14946j0 = C7499b.m14946j0(Arrays.copyOf(strArr, strArr.length));
                        if (setM14946j0.contains(strM10814M)) {
                            return;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        if (strArr.length == 0) {
                            sb2.append(strM10814M);
                        } else if (strArr.length < 5) {
                            sb2.append(str4);
                            sb2.append(",");
                            sb2.append(strM10814M);
                        } else {
                            while (true) {
                                int i12 = i10 + 1;
                                sb2.append(strArr[i10]);
                                sb2.append(",");
                                if (i12 >= 5) {
                                    break;
                                } else {
                                    i10 = i12;
                                }
                            }
                            sb2.append(strM10814M);
                            setM14946j0.remove(strArr[0]);
                        }
                        concurrentHashMap.put(str2, sb2.toString());
                    } else {
                        concurrentHashMap.put(str2, strM10814M);
                    }
                }
            } catch (Throwable th3) {
                C6205a.m12741a(C8206m.class, th3);
            }
        }
    }

    public C8204k(Context context) {
        this.f44402a = new C8201h(context, (String) null);
    }

    public C8204k(Context context, String str) {
        this.f44402a = new C8201h(context, str);
    }

    /* JADX INFO: renamed from: a */
    public final void m16340a(Bundle bundle, String str) {
        C8004n c8004n = C8004n.f43550a;
        if (C7993c0.m15849b()) {
            this.f44402a.m16334f(str, bundle);
        }
    }
}
