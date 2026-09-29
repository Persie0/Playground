package kotlinx.serialization.json;

import kotlinx.serialization.KSerializer;
import p000.cg4;
import p000.ey8;

/* JADX INFO: loaded from: classes.dex */
@ey8(with = cg4.class)
public final class JsonNull extends AbstractC3264d {
    public static final JsonNull INSTANCE = new JsonNull();

    @Override // kotlinx.serialization.json.AbstractC3264d
    /* JADX INFO: renamed from: d */
    public final String mo15621d() {
        return "null";
    }

    public final KSerializer serializer() {
        return cg4.f10013a;
    }
}
