package kotlinx.serialization.json;

import p000.vk9;

/* JADX INFO: loaded from: classes3.dex */
public final class JsonEncodingException extends JsonException {
    public JsonEncodingException(String str, String str2) {
        super(str.concat((str2 == null || vk9.m23391n0(str2)) ? "" : "\n".concat(str2)));
    }

    public /* synthetic */ JsonEncodingException(String str, int i, String str2) {
        this(str, (i & 4) != 0 ? null : "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
    }
}
