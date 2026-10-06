package p000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mcj {

    /* JADX INFO: renamed from: a */
    public static final ncg f39952a = ncg.m17327h("F250UploadClient");

    /* JADX INFO: renamed from: a */
    public static final String m16310a(lqq lqqVar) throws IOException {
        Object obj = lqqVar.f39002b;
        obj.getClass();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((InputStream) obj, oph.f46377a), 8192);
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[8192];
            for (int i = bufferedReader.read(cArr); i >= 0; i = bufferedReader.read(cArr)) {
                stringWriter.write(cArr, 0, i);
            }
            String string = stringWriter.toString();
            string.getClass();
            omn.m18709n(bufferedReader, null);
            return string;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                omn.m18709n(bufferedReader, th);
                throw th2;
            }
        }
    }
}
