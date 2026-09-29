package p000;

import com.google.firebase.perf.util.Constants$CounterNames;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f53 extends z67 {

    /* JADX INFO: renamed from: c */
    public static final C3723wi f38430c = C3723wi.m23970d();

    /* JADX INFO: renamed from: b */
    public final e8a f38431b;

    public f53(e8a e8aVar) {
        this.f38431b = e8aVar;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m11539d(e8a e8aVar, int i) {
        if (e8aVar != null) {
            C3723wi c3723wi = f38430c;
            if (i > 1) {
                c3723wi.m23975f("Exceed MAX_SUBTRACE_DEEP:1");
                return false;
            }
            for (Map.Entry entry : e8aVar.m10935D().entrySet()) {
                String str = (String) entry.getKey();
                if (str != null) {
                    String strTrim = str.trim();
                    if (strTrim.isEmpty()) {
                        c3723wi.m23975f("counterId is empty");
                    } else if (strTrim.length() > 100) {
                        c3723wi.m23975f("counterId exceeded max length 100");
                    } else if (((Long) entry.getValue()) == null) {
                        c3723wi.m23975f("invalid CounterValue:" + entry.getValue());
                        return false;
                    }
                }
                c3723wi.m23975f("invalid CounterId:" + ((String) entry.getKey()));
                return false;
            }
            Iterator it = e8aVar.m10940J().iterator();
            while (it.hasNext()) {
                if (!m11539d((e8a) it.next(), i + 1)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m11540e(e8a e8aVar, int i) {
        Long l;
        C3723wi c3723wi = f38430c;
        if (e8aVar == null) {
            c3723wi.m23975f("TraceMetric is null");
            return false;
        }
        if (i > 1) {
            c3723wi.m23975f("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        String strM10938H = e8aVar.m10938H();
        if (strM10938H != null) {
            String strTrim = strM10938H.trim();
            if (!strTrim.isEmpty() && strTrim.length() <= 100) {
                if (e8aVar.m10937G() <= 0) {
                    c3723wi.m23975f("invalid TraceDuration:" + e8aVar.m10937G());
                    return false;
                }
                if (!e8aVar.m10941K()) {
                    c3723wi.m23975f("clientStartTimeUs is null.");
                    return false;
                }
                if (e8aVar.m10938H().startsWith("_st_") && ((l = (Long) e8aVar.m10935D().get(Constants$CounterNames.FRAMES_TOTAL.toString())) == null || l.compareTo((Long) 0L) <= 0)) {
                    c3723wi.m23975f("non-positive totalFrames in screen trace " + e8aVar.m10938H());
                    return false;
                }
                Iterator it = e8aVar.m10940J().iterator();
                while (it.hasNext()) {
                    if (!m11540e((e8a) it.next(), i + 1)) {
                        return false;
                    }
                }
                for (Map.Entry entry : e8aVar.m10936E().entrySet()) {
                    try {
                        z67.m25470b((String) entry.getKey(), (String) entry.getValue());
                    } catch (IllegalArgumentException e) {
                        c3723wi.m23975f(e.getLocalizedMessage());
                        return false;
                    }
                }
                return true;
            }
        }
        c3723wi.m23975f("invalid TraceId:" + e8aVar.m10938H());
        return false;
    }

    @Override // p000.z67
    /* JADX INFO: renamed from: a */
    public final boolean mo3300a() {
        e8a e8aVar = this.f38431b;
        boolean zM11540e = m11540e(e8aVar, 0);
        C3723wi c3723wi = f38430c;
        if (!zM11540e) {
            c3723wi.m23975f("Invalid Trace:" + e8aVar.m10938H());
            return false;
        }
        if (e8aVar.m10934C() <= 0) {
            Iterator it = e8aVar.m10940J().iterator();
            while (it.hasNext()) {
                if (((e8a) it.next()).m10934C() > 0) {
                }
            }
            return true;
        }
        if (m11539d(e8aVar, 0)) {
            return true;
        }
        c3723wi.m23975f("Invalid Counters for Trace:" + e8aVar.m10938H());
        return false;
    }
}
