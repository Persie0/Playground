package com.google.android.apps.camera.debug.metrics;

import android.content.Context;
import android.util.PrintWriterPrinter;
import com.google.android.apps.camera.zoomui.view.WdNM.xPAWq;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p000.dlh;
import p000.emv;
import p000.kbt;
import p000.khb;
import p000.koc;
import p000.kod;
import p000.koo;
import p000.kor;
import p000.kot;
import p000.ktz;
import p000.lku;
import p000.lpe;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class MetricsProvider extends kbt {

    /* JADX INFO: renamed from: a */
    public khb f6603a;

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.Object, java.util.Map] */
    @Override // p000.kbt
    /* JADX INFO: renamed from: a */
    public final void mo4091a(PrintWriter printWriter) {
        khb khbVar;
        kor korVar;
        int i;
        String string;
        kor korVar2;
        int i2;
        if (this.f6603a == null) {
            Context context = getContext();
            context.getClass();
            ((dlh) ((emv) context.getApplicationContext()).mo4193e(dlh.class)).mo6335bJ(this);
        }
        long jNanoTime = System.nanoTime();
        PrintWriterPrinter printWriterPrinter = new PrintWriterPrinter(printWriter);
        khb khbVar2 = this.f6603a;
        lku.m15662p(khbVar2);
        Object obj = khbVar2.f36008a;
        synchronized (((koo) obj).f36703a) {
            Object obj2 = ((koo) obj).f36704b.f36701a;
            korVar = null;
            khbVar = new khb((byte[]) null, (char[]) null);
            for (Map.Entry entry : ((khb) obj2).f36008a.entrySet()) {
                ?? r9 = khbVar.f36008a;
                String str = (String) entry.getKey();
                lpe lpeVar = (lpe) entry.getValue();
                lpe lpeVar2 = new lpe((ktz) lpeVar.f38884c, (byte[]) null);
                for (Map.Entry entry2 : ((TreeMap) lpeVar.f38883b).entrySet()) {
                    ((TreeMap) lpeVar2.f38883b).put((kod) entry2.getKey(), ((kor) entry2.getValue()).mo14635a());
                }
                r9.put(str, lpeVar2);
            }
        }
        Iterator it = khbVar.f36008a.values().iterator();
        while (true) {
            int i3 = 1;
            if (!it.hasNext()) {
                double dNanoTime = System.nanoTime() - jNanoTime;
                Locale locale = Locale.ROOT;
                Double.isNaN(dNanoTime);
                printWriterPrinter.println(String.format(locale, "\n\nMetrics dumped in %.6f ms", Double.valueOf(dNanoTime / 1000000.0d)));
                return;
            }
            lpe lpeVar3 = (lpe) it.next();
            if (lpeVar3 == null) {
                string = "";
            } else if (lpeVar3.m15814m().length == 0) {
                String strM15813l = lpeVar3.m15813l();
                Object[] objArr = kod.f36676a.f36677b;
                Iterator it2 = ((TreeMap) lpeVar3.f38883b).entrySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        korVar2 = korVar;
                        break;
                    }
                    Map.Entry entry3 = (Map.Entry) it2.next();
                    while (true) {
                        if (i2 >= objArr.length) {
                            korVar2 = (kor) entry3.getValue();
                            break;
                        }
                        i2 = (objArr[i2] == null || ((kod) entry3.getKey()).f36677b[i2] == objArr[i2]) ? i2 + 1 : 0;
                    }
                }
                string = strM15813l + xPAWq.ayhFdWUOC + kot.m14637b(korVar2);
            } else {
                koc[] kocVarArrM15814m = lpeVar3.m15814m();
                Set<Map.Entry> setEntrySet = lpeVar3.f38883b.entrySet();
                int length = kocVarArrM15814m.length;
                int i4 = length + 1;
                int[] iArr = new int[i4];
                String[][] strArr = (String[][]) Array.newInstance((Class<?>) String.class, setEntrySet.size() + 1, i4);
                for (int i5 = 0; i5 < length; i5++) {
                    strArr[0][i5] = kocVarArrM15814m[i5].f36674a;
                    iArr[i5] = kocVarArrM15814m[i5].f36674a.length();
                }
                strArr[0][length] = "";
                iArr[length] = 1;
                int i6 = 1;
                for (Map.Entry entry4 : setEntrySet) {
                    int i7 = 0;
                    while (i7 < length) {
                        Locale locale2 = Locale.ROOT;
                        Object[] objArr2 = new Object[i3];
                        objArr2[0] = ((kod) entry4.getKey()).f36677b[i7];
                        String str2 = String.format(locale2, "%s", objArr2);
                        iArr[i7] = Math.max(iArr[i7], str2.length());
                        strArr[i6][i7] = str2;
                        i7++;
                        i3 = 1;
                    }
                    String strM14637b = kot.m14637b((kor) entry4.getValue());
                    iArr[length] = Math.max(iArr[length], strM14637b.length());
                    strArr[i6][length] = strM14637b;
                    i6++;
                    i3 = 1;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("  ");
                int i8 = 0;
                while (true) {
                    i = length - 1;
                    if (i8 >= i) {
                        break;
                    }
                    sb.append("%-");
                    sb.append(iArr[i8] + 1);
                    sb.append("s");
                    i8++;
                }
                String strConcat = sb.toString().concat("%s");
                sb.append("%-");
                sb.append(iArr[i]);
                sb.append("s:%");
                sb.append(iArr[length] + 1);
                sb.append("s");
                String string2 = sb.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(lpeVar3.m15813l());
                sb2.append("\n");
                sb2.append(String.format(Locale.ROOT, strConcat, strArr[0]));
                for (int i9 = 1; i9 < strArr.length; i9++) {
                    sb2.append("\n");
                    sb2.append(String.format(Locale.ROOT, string2, strArr[i9]));
                }
                string = sb2.toString();
            }
            printWriterPrinter.println(string);
            korVar = null;
        }
    }
}
