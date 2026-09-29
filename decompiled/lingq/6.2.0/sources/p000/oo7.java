package p000;

import java.io.IOException;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes.dex */
public final class oo7 {
    /* JADX INFO: renamed from: a */
    public static Protocol m18189a(String str) throws IOException {
        str.getClass();
        Protocol protocol = Protocol.HTTP_1_0;
        if (str.equals(protocol.protocol)) {
            return protocol;
        }
        Protocol protocol2 = Protocol.HTTP_1_1;
        if (str.equals(protocol2.protocol)) {
            return protocol2;
        }
        Protocol protocol3 = Protocol.H2_PRIOR_KNOWLEDGE;
        if (str.equals(protocol3.protocol)) {
            return protocol3;
        }
        Protocol protocol4 = Protocol.HTTP_2;
        if (str.equals(protocol4.protocol)) {
            return protocol4;
        }
        Protocol protocol5 = Protocol.SPDY_3;
        if (str.equals(protocol5.protocol)) {
            return protocol5;
        }
        Protocol protocol6 = Protocol.QUIC;
        if (str.equals(protocol6.protocol)) {
            return protocol6;
        }
        Protocol protocol7 = Protocol.HTTP_3;
        if (cl9.m4842Y(str, protocol7.protocol, false)) {
            return protocol7;
        }
        v63.m23133k("Unexpected protocol: ".concat(str));
        return null;
    }
}
