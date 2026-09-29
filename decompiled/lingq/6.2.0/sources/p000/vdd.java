package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vdd {
    /* JADX INFO: renamed from: a */
    public static Typeface m23239a(Context context, ArrayList arrayList, int i, boolean z, int i2, Handler handler, hi8 hi8Var) {
        int i3 = 0;
        f78 f78Var = new f78(handler, 0);
        C3156jq c3156jq = new C3156jq(hi8Var, f78Var);
        int i4 = 2;
        int i5 = 1;
        if (!z) {
            String strM17310a = nb3.m17310a(i, arrayList);
            Typeface typeface = (Typeface) nb3.f52561a.m238d(strM17310a);
            if (typeface != null) {
                f78Var.execute(new kj3(i4, hi8Var, typeface));
                return typeface;
            }
            lb3 lb3Var = new lb3(c3156jq, i3);
            synchronized (nb3.f52563c) {
                try {
                    l79 l79Var = nb3.f52564d;
                    ArrayList arrayList2 = (ArrayList) l79Var.get(strM17310a);
                    if (arrayList2 != null) {
                        arrayList2.add(lb3Var);
                        return null;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(lb3Var);
                    l79Var.put(strM17310a, arrayList3);
                    kb3 kb3Var = new kb3(strM17310a, context, arrayList, i, 1);
                    ThreadPoolExecutor threadPoolExecutor = nb3.f52562b;
                    lb3 lb3Var2 = new lb3(strM17310a, i5);
                    Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                    kr3 kr3Var = new kr3();
                    kr3Var.f48360b = kb3Var;
                    kr3Var.f48361c = lb3Var2;
                    kr3Var.f48362d = handler2;
                    threadPoolExecutor.execute(kr3Var);
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (arrayList.size() > 1) {
            C3386nv.m17626m("Fallbacks with blocking fetches are not supported for performance reasons");
            return null;
        }
        hb3 hb3Var = (hb3) arrayList.get(0);
        ab9 ab9Var = nb3.f52561a;
        ArrayList arrayList4 = new ArrayList(1);
        Object obj = new Object[]{hb3Var}[0];
        Objects.requireNonNull(obj);
        arrayList4.add(obj);
        String strM17310a2 = nb3.m17310a(i, Collections.unmodifiableList(arrayList4));
        Typeface typeface2 = (Typeface) nb3.f52561a.m238d(strM17310a2);
        if (typeface2 != null) {
            f78Var.execute(new kj3(i4, hi8Var, typeface2));
            return typeface2;
        }
        if (i2 == -1) {
            ArrayList arrayList5 = new ArrayList(1);
            Object obj2 = new Object[]{hb3Var}[0];
            Objects.requireNonNull(obj2);
            arrayList5.add(obj2);
            mb3 mb3VarM17311b = nb3.m17311b(strM17310a2, context, Collections.unmodifiableList(arrayList5), i);
            c3156jq.m14591E(mb3VarM17311b);
            return mb3VarM17311b.f50878a;
        }
        try {
            try {
                try {
                    try {
                        mb3 mb3Var = (mb3) nb3.f52562b.submit(new kb3(strM17310a2, context, hb3Var, i, 0)).get(i2, TimeUnit.MILLISECONDS);
                        c3156jq.m14591E(mb3Var);
                        return mb3Var.f50878a;
                    } catch (TimeoutException unused) {
                        throw new InterruptedException("timeout");
                    }
                } catch (InterruptedException e) {
                    throw e;
                }
            } catch (ExecutionException e2) {
                throw new RuntimeException(e2);
            }
        } catch (InterruptedException unused2) {
            ((f78) c3156jq.f45991b).execute(new ea0((hi8) c3156jq.f45990a, -3, i5));
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static kmb m23240b(Object obj) {
        if (obj == null) {
            return kmb.f47524z;
        }
        if (obj instanceof String) {
            return new xmb((String) obj);
        }
        if (obj instanceof Double) {
            return new bkb((Double) obj);
        }
        if (obj instanceof Long) {
            return new bkb(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new bkb(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new sib((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                C3386nv.m17626m("Invalid value type");
                return null;
            }
            cib cibVar = new cib();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                cibVar.m4746r(cibVar.m4744n(), m23240b(it.next()));
            }
            return cibVar;
        }
        bmb bmbVar = new bmb();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            kmb kmbVarM23240b = m23240b(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                bmbVar.mo3881i((String) string, kmbVarM23240b);
            }
        }
        return bmbVar;
    }

    /* JADX INFO: renamed from: c */
    public static kmb m23241c(koc kocVar) {
        if (kocVar == null) {
            return kmb.f47523y;
        }
        int iM15346A = kocVar.m15346A() - 1;
        if (iM15346A == 1) {
            return kocVar.m15349u() ? new xmb(kocVar.m15350v()) : kmb.f47522F;
        }
        if (iM15346A == 2) {
            return kocVar.m15353y() ? new bkb(Double.valueOf(kocVar.m15354z())) : new bkb(null);
        }
        if (iM15346A == 3) {
            return kocVar.m15351w() ? new sib(Boolean.valueOf(kocVar.m15352x())) : new sib(null);
        }
        if (iM15346A != 4) {
            C3386nv.m17626m("Unknown type found. Cannot convert entity");
            return null;
        }
        List listM15347s = kocVar.m15347s();
        ArrayList arrayList = new ArrayList();
        Iterator it = listM15347s.iterator();
        while (it.hasNext()) {
            arrayList.add(m23241c((koc) it.next()));
        }
        return new rmb(kocVar.m15348t(), arrayList);
    }
}
