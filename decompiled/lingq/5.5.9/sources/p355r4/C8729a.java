package p355r4;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import androidx.startup.StartupException;
import com.linguist.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p391t4.C9194a;

/* JADX INFO: renamed from: r4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8729a {

    /* JADX INFO: renamed from: d */
    public static volatile C8729a f46319d;

    /* JADX INFO: renamed from: e */
    public static final Object f46320e = new Object();

    /* JADX INFO: renamed from: c */
    public final Context f46323c;

    /* JADX INFO: renamed from: b */
    public final HashSet f46322b = new HashSet();

    /* JADX INFO: renamed from: a */
    public final HashMap f46321a = new HashMap();

    public C8729a(Context context) {
        this.f46323c = context.getApplicationContext();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public static C8729a m16959c(Context context) {
        if (f46319d == null) {
            synchronized (f46320e) {
                if (f46319d == null) {
                    f46319d = new C8729a(context);
                }
            }
        }
        return f46319d;
    }

    /* JADX INFO: renamed from: a */
    public final void m16960a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f46323c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f46322b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC8730b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    m16961b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e10) {
                throw new StartupException(e10);
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final Object m16961b(Class cls, HashSet hashSet) {
        Object objMo3511b;
        if (C9194a.m17534a()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        HashMap map = this.f46321a;
        if (map.containsKey(cls)) {
            objMo3511b = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC8730b interfaceC8730b = (InterfaceC8730b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends InterfaceC8730b<?>>> listMo3510a = interfaceC8730b.mo3510a();
                if (!listMo3510a.isEmpty()) {
                    for (Class<? extends InterfaceC8730b<?>> cls2 : listMo3510a) {
                        if (!map.containsKey(cls2)) {
                            m16961b(cls2, hashSet);
                        }
                    }
                }
                objMo3511b = interfaceC8730b.mo3511b(this.f46323c);
                hashSet.remove(cls);
                map.put(cls, objMo3511b);
            } catch (Throwable th3) {
                throw new StartupException(th3);
            }
        }
        Trace.endSection();
        return objMo3511b;
    }
}
