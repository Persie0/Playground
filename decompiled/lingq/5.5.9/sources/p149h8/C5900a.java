package p149h8;

import ae.C0062b;
import com.facebook.internal.instrument.InstrumentData;
import dm.C5206f;
import dm.C5207g;
import dm.C5212l;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import jm.C6525h;
import kotlin.collections.C6752c;
import org.json.JSONArray;
import p067d8.C5086z;
import p112f8.C5476a;
import p253m1.C7461h;
import p291o7.C8006p;

/* JADX INFO: renamed from: h8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5900a implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: b */
    public static final a f35244b = new a();

    /* JADX INFO: renamed from: c */
    public static C5900a f35245c;

    /* JADX INFO: renamed from: a */
    public final Thread.UncaughtExceptionHandler f35246a;

    /* JADX INFO: renamed from: h8.a$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static void m12320a() {
            File[] fileArrListFiles;
            if (C5086z.m10840y()) {
                return;
            }
            File fileM10997S0 = C5206f.m10997S0();
            if (fileM10997S0 == null) {
                fileArrListFiles = new File[0];
            } else {
                fileArrListFiles = fileM10997S0.listFiles(new C5476a(0));
                if (fileArrListFiles == null) {
                    fileArrListFiles = new File[0];
                }
            }
            ArrayList arrayList = new ArrayList(fileArrListFiles.length);
            for (File file : fileArrListFiles) {
                C5207g.m11111f(file, "file");
                arrayList.add(new InstrumentData(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((InstrumentData) obj).m6679b()) {
                    arrayList2.add(obj);
                }
            }
            int i10 = 1;
            List listM13447o0 = C6752c.m13447o0(arrayList2, new C7461h(1));
            JSONArray jSONArray = new JSONArray();
            C6525h it = C0062b.m411w2(0, Math.min(listM13447o0.size(), 5)).iterator();
            while (it.f37168c) {
                jSONArray.put(listM13447o0.get(it.mo13105a()));
            }
            C5206f.m11019q1("crash_reports", jSONArray, new C8006p(i10, listM13447o0));
        }
    }

    public C5900a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f35246a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        int i10;
        C5207g.m11111f(thread, "t");
        C5207g.m11111f(th2, "e");
        Throwable th3 = null;
        Throwable cause = th2;
        loop0: while (true) {
            i10 = 0;
            if (cause == null || cause == th3) {
                break;
            }
            StackTraceElement[] stackTrace = cause.getStackTrace();
            C5207g.m11110e(stackTrace, "t.stackTrace");
            int length = stackTrace.length;
            while (i10 < length) {
                StackTraceElement stackTraceElement = stackTrace[i10];
                i10++;
                C5207g.m11110e(stackTraceElement, "element");
                if (C5206f.m11006b1(stackTraceElement)) {
                    i10 = 1;
                    break loop0;
                }
            }
            th3 = cause;
            cause = cause.getCause();
        }
        if (i10 != 0) {
            C5212l.m11141N(th2);
            InstrumentData.Type type = InstrumentData.Type.CrashReport;
            C5207g.m11111f(type, "t");
            new InstrumentData(th2, type).m6680c();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f35246a;
        if (uncaughtExceptionHandler == null) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th2);
    }
}
