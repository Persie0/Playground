package p000;

import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class mod {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f41174a = 0;

    /* JADX INFO: renamed from: b */
    private static final WeakHashMap f41175b = new WeakHashMap();

    /* JADX INFO: renamed from: c */
    private static final WeakHashMap f41176c = new WeakHashMap();

    /* JADX INFO: renamed from: a */
    public static void m16702a(Throwable th) {
        Throwable cause;
        synchronized (f41176c) {
            cause = th;
            while (cause != null) {
                if (f41176c.containsKey(cause)) {
                    break;
                } else {
                    cause = cause.getCause();
                }
            }
            f41176c.put(th, Boolean.valueOf(cause != null));
        }
        if (cause == null && m16703b(th) == null) {
            ArrayList arrayList = new ArrayList();
            for (moq moqVarM16723a = moz.m16723a(); moqVarM16723a != null; moqVarM16723a = moqVarM16723a.mo16670a()) {
                arrayList.add(moqVarM16723a);
            }
            mwn mwnVarM17091f = mws.m17091f(arrayList.size());
            mwn mwnVarM17091f2 = mws.m17091f(arrayList.size());
            for (moq moqVar : mkv.m16503K(arrayList)) {
                mwnVarM17091f2.m17082g(moqVar.mo16671b());
                mwnVarM17091f.m17082g(moqVar.mo16704f());
            }
            mws mwsVarM17081f = mwnVarM17091f2.m17081f();
            mwnVarM17091f.m17081f();
            mos mosVar = new mos(mwsVarM17081f);
            WeakHashMap weakHashMap = f41175b;
            synchronized (weakHashMap) {
                weakHashMap.put(th, mosVar);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static liv m16703b(Throwable th) {
        lku.m15614I(true, "Trace uncaught exception is disabled.");
        synchronized (f41175b) {
            Throwable cause = th;
            while (cause != null) {
                try {
                    if (f41175b.containsKey(cause)) {
                        break;
                    }
                    cause = cause.getCause();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (cause == null) {
                return null;
            }
            WeakHashMap weakHashMap = f41175b;
            mos mosVar = (mos) weakHashMap.get(cause);
            weakHashMap.put(th, mosVar);
            return new liv(mosVar);
        }
    }
}
