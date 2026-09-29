package p000;

import android.util.Log;
import com.google.firebase.crashlytics.internal.settings.C1150a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class zq1 {

    /* JADX INFO: renamed from: e */
    public static final Charset f71956e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: f */
    public static final int f71957f = 15;

    /* JADX INFO: renamed from: g */
    public static final yq1 f71958g = new yq1();

    /* JADX INFO: renamed from: h */
    public static final C3835zj f71959h = new C3835zj(3);

    /* JADX INFO: renamed from: i */
    public static final mp1 f71960i = new mp1(2);

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f71961a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b */
    public final t33 f71962b;

    /* JADX INFO: renamed from: c */
    public final C1150a f71963c;

    /* JADX INFO: renamed from: d */
    public final np1 f71964d;

    public zq1(t33 t33Var, C1150a c1150a, np1 np1Var) {
        this.f71962b = t33Var;
        this.f71963c = c1150a;
        this.f71964d = np1Var;
    }

    /* JADX INFO: renamed from: a */
    public static void m25739a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m25740e(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i = fileInputStream.read(bArr);
                if (i <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f71956e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m25741f(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f71956e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList m25742b() {
        ArrayList arrayList = new ArrayList();
        t33 t33Var = this.f71962b;
        arrayList.addAll(t33.m21829e(((File) t33Var.f61791f).listFiles()));
        arrayList.addAll(t33.m21829e(((File) t33Var.f61792g).listFiles()));
        C3835zj c3835zj = f71959h;
        Collections.sort(arrayList, c3835zj);
        List listM21829e = t33.m21829e(((File) t33Var.f61790e).listFiles());
        Collections.sort(listM21829e, c3835zj);
        arrayList.addAll(listM21829e);
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final NavigableSet m25743c() {
        return new TreeSet(t33.m21829e(((File) this.f71962b.f61789d).list())).descendingSet();
    }

    /* JADX INFO: renamed from: d */
    public final void m25744d(rq1 rq1Var, String str, boolean z) {
        t33 t33Var = this.f71962b;
        int i = this.f71963c.m6684b().f43294a.f54464a;
        f71958g.getClass();
        try {
            m25741f(t33Var.m21831b(str, wq1.m24118n("event", String.format(Locale.US, "%010d", Integer.valueOf(this.f71961a.getAndIncrement())), z ? "_" : "")), yq1.f70284a.m4509e(rq1Var));
        } catch (IOException e) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e);
        }
        mp1 mp1Var = new mp1(3);
        t33Var.getClass();
        File file = new File((File) t33Var.f61789d, str);
        file.mkdirs();
        List<File> listM21829e = t33.m21829e(file.listFiles(mp1Var));
        Collections.sort(listM21829e, new C3835zj(4));
        int size = listM21829e.size();
        for (File file2 : listM21829e) {
            if (size <= i) {
                return;
            }
            t33.m21828d(file2);
            size--;
        }
    }
}
