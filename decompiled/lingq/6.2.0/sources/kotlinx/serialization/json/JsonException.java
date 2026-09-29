package kotlinx.serialization.json;

import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class JsonException extends SerializationException {

    /* JADX INFO: renamed from: a */
    public final String f48240a;

    public JsonException(String str) {
        super(str);
        this.f48240a = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f48240a;
    }
}
