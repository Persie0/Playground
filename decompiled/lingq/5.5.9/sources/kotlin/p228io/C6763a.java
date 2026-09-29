package kotlin.p228io;

import bm.C1616b;
import cm.InterfaceC2052l;
import dm.C5206f;
import dm.C5207g;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.sequences.SequencesKt__SequencesKt;
import sl.C9072e;

/* JADX INFO: renamed from: kotlin.io.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C6763a {
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static final ArrayList m13476a(BufferedReader bufferedReader) throws IOException {
        final ArrayList arrayList = new ArrayList();
        InterfaceC2052l<String, C9072e> interfaceC2052l = new InterfaceC2052l<String, C9072e>() { // from class: kotlin.io.TextStreamsKt$readLines$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(String str) {
                String str2 = str;
                C5207g.m11111f(str2, "it");
                arrayList.add(str2);
                return C9072e.f47360a;
            }
        };
        try {
            Iterator it = SequencesKt__SequencesKt.m14249J2(new C1616b(bufferedReader)).iterator();
            while (it.hasNext()) {
                interfaceC2052l.mo528n(it.next());
            }
            C9072e c9072e = C9072e.f47360a;
            C5206f.m11032z0(bufferedReader, null);
            return arrayList;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C5206f.m11032z0(bufferedReader, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m13477b(Reader reader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i10 = reader.read(cArr);
        while (i10 >= 0) {
            stringWriter.write(cArr, 0, i10);
            i10 = reader.read(cArr);
        }
        String string = stringWriter.toString();
        C5207g.m11110e(string, "buffer.toString()");
        return string;
    }
}
