package p000;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class y40 {

    /* JADX INFO: renamed from: a */
    public final long f69267a;

    public y40(long j) {
        this.f69267a = j;
    }

    /* JADX INFO: renamed from: a */
    public static y40 m24935a(BufferedReader bufferedReader) throws IOException {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        y40 y40Var = new y40(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return y40Var;
                    }
                    y40 y40Var2 = new y40(jsonReader.nextLong());
                    jsonReader.close();
                    return y40Var2;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th) {
            jsonReader.close();
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof y40) && this.f69267a == ((y40) obj).f69267a;
    }

    public final int hashCode() {
        long j = this.f69267a;
        return ((int) ((j >>> 32) ^ j)) ^ 1000003;
    }

    public final String toString() {
        return wq1.m24113i(this.f69267a, "}", new StringBuilder("LogResponse{nextRequestWaitMillis="));
    }
}
