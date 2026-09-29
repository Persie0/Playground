package p134g8;

import ae.C0062b;
import com.facebook.internal.instrument.InstrumentData;
import dm.C5206f;
import dm.C5207g;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import jm.C6525h;
import kotlin.collections.C6752c;
import org.json.JSONArray;
import p067d8.C5085y;
import p067d8.C5086z;
import p173i8.C6205a;
import p291o7.C8005o;

/* JADX INFO: renamed from: g8.c */
/* JADX INFO: loaded from: classes.dex */
public final class C5716c {

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f34732a;

    static {
        new C5716c();
        f34732a = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: a */
    public static final void m12074a() {
        File[] fileArrListFiles;
        if (C6205a.m12742b(C5716c.class)) {
            return;
        }
        try {
            if (C5086z.m10840y()) {
                return;
            }
            File fileM10997S0 = C5206f.m10997S0();
            int i10 = 1;
            if (fileM10997S0 == null) {
                fileArrListFiles = new File[0];
            } else {
                fileArrListFiles = fileM10997S0.listFiles(new C5085y(1));
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
            List listM13447o0 = C6752c.m13447o0(arrayList2, new C5715b(0));
            JSONArray jSONArray = new JSONArray();
            C6525h it = C0062b.m411w2(0, Math.min(listM13447o0.size(), 5)).iterator();
            while (it.f37168c) {
                jSONArray.put(listM13447o0.get(it.mo13105a()));
            }
            C5206f.m11019q1("anr_reports", jSONArray, new C8005o(i10, listM13447o0));
        } catch (Throwable th2) {
            C6205a.m12741a(C5716c.class, th2);
        }
    }
}
