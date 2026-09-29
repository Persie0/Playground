package p432v8;

import android.util.JsonReader;
import android.util.JsonToken;
import com.google.auto.value.AutoValue;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: renamed from: v8.j */
/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class AbstractC9677j {
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static C9673f m18184a(BufferedReader bufferedReader) throws IOException {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        C9673f c9673f = new C9673f(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return c9673f;
                    }
                    C9673f c9673f2 = new C9673f(jsonReader.nextLong());
                    jsonReader.close();
                    return c9673f2;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th2) {
            jsonReader.close();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract long mo18183b();
}
