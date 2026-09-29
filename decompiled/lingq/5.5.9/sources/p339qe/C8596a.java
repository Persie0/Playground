package p339qe;

import android.support.v4.media.C0141b;
import android.util.Log;
import com.google.firebase.crashlytics.internal.settings.C3215a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import ne.C7755l;
import p112f8.C5476a;
import p112f8.C5477b;
import p166i1.C6161p;
import p253m1.C7461h;
import p298oe.C8038a;
import p483xe.C10181d;
import se.InterfaceC8996f;

/* JADX INFO: renamed from: qe.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8596a {

    /* JADX INFO: renamed from: d */
    public static final Charset f46067d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: e */
    public static final int f46068e = 15;

    /* JADX INFO: renamed from: f */
    public static final C8038a f46069f = new C8038a();

    /* JADX INFO: renamed from: g */
    public static final C6161p f46070g = new C6161p(5);

    /* JADX INFO: renamed from: h */
    public static final C5476a f46071h = new C5476a(1);

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f46072a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b */
    public final C8597b f46073b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC8996f f46074c;

    public C8596a(C8597b c8597b, C3215a c3215a) {
        this.f46073b = c8597b;
        this.f46074c = c3215a;
    }

    /* JADX INFO: renamed from: a */
    public static void m16810a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public static String m16811d(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i10 = fileInputStream.read(bArr);
                if (i10 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f46067d);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m16812e(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f46067d);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList m16813b() {
        ArrayList arrayList = new ArrayList();
        C8597b c8597b = this.f46073b;
        arrayList.addAll(C8597b.m16818e(c8597b.f46079e.listFiles()));
        arrayList.addAll(C8597b.m16818e(c8597b.f46080f.listFiles()));
        C6161p c6161p = f46070g;
        Collections.sort(arrayList, c6161p);
        List listM16818e = C8597b.m16818e(c8597b.f46078d.listFiles());
        Collections.sort(listM16818e, c6161p);
        arrayList.addAll(listM16818e);
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final void m16814c(C7755l c7755l, String str, boolean z10) {
        C8597b c8597b = this.f46073b;
        int i10 = ((C3215a) this.f46074c).m9171b().f47175a.f47184a;
        f46069f.getClass();
        C10181d c10181d = C8038a.f43690a;
        c10181d.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            c10181d.m19192a(c7755l, stringWriter);
        } catch (IOException unused) {
        }
        try {
            m16812e(c8597b.m16819b(str, C0141b.m611g("event", String.format(Locale.US, "%010d", Integer.valueOf(this.f46072a.getAndIncrement())), z10 ? "_" : "")), stringWriter.toString());
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e10);
        }
        C5477b c5477b = new C5477b(1);
        c8597b.getClass();
        File file = new File(c8597b.f46077c, str);
        file.mkdirs();
        List<File> listM16818e = C8597b.m16818e(file.listFiles(c5477b));
        Collections.sort(listM16818e, new C7461h(7));
        int size = listM16818e.size();
        for (File file2 : listM16818e) {
            if (size <= i10) {
                return;
            }
            C8597b.m16817d(file2);
            size--;
        }
    }
}
