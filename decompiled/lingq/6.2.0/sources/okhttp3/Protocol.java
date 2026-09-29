package okhttp3;

import java.io.IOException;
import kotlin.enums.AbstractC3201a;
import p000.oo7;
import p000.ys2;

/* JADX INFO: loaded from: classes.dex */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic"),
    HTTP_3("h3");

    private final String protocol;
    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    public static final oo7 Companion = new oo7();

    Protocol(String str) {
        this.protocol = str;
    }

    public static final Protocol get(String str) throws IOException {
        Companion.getClass();
        return oo7.m18189a(str);
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }
}
