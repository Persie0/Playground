package p000;

import p021j$.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class kyk {
    static {
        ncg.m17327h("Mp4BoxSlices");
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m15061a(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.US_ASCII);
        if (bytes.length == 4) {
            return bytes;
        }
        throw new IllegalArgumentException("Type \"" + str + "\" is not 4 characters");
    }
}
