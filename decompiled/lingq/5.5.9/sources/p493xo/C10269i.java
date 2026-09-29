package p493xo;

import dm.C5207g;
import java.io.IOException;
import java.net.ProtocolException;
import mo.C7661i;
import okhttp3.Protocol;

/* JADX INFO: renamed from: xo.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C10269i {

    /* JADX INFO: renamed from: a */
    public final Protocol f51710a;

    /* JADX INFO: renamed from: b */
    public final int f51711b;

    /* JADX INFO: renamed from: c */
    public final String f51712c;

    /* JADX INFO: renamed from: xo.i$a */
    public static final class a {
        /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
        /* JADX INFO: renamed from: a */
        public static C10269i m19239a(String str) throws IOException {
            Protocol protocol;
            int i10;
            String strSubstring;
            C5207g.m11111f(str, "statusLine");
            if (C7661i.m15256V2(str, "HTTP/1.", false)) {
                i10 = 9;
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException(C5207g.m11116k(str, "Unexpected status line: "));
                }
                int iCharAt = str.charAt(7) - '0';
                if (iCharAt == 0) {
                    protocol = Protocol.HTTP_1_0;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException(C5207g.m11116k(str, "Unexpected status line: "));
                    }
                    protocol = Protocol.HTTP_1_1;
                }
            } else {
                if (!C7661i.m15256V2(str, "ICY ", false)) {
                    throw new ProtocolException(C5207g.m11116k(str, "Unexpected status line: "));
                }
                protocol = Protocol.HTTP_1_0;
                i10 = 4;
            }
            int i11 = i10 + 3;
            if (str.length() < i11) {
                throw new ProtocolException(C5207g.m11116k(str, "Unexpected status line: "));
            }
            try {
                String strSubstring2 = str.substring(i10, i11);
                C5207g.m11110e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                int i12 = Integer.parseInt(strSubstring2);
                if (str.length() <= i11) {
                    strSubstring = "";
                } else {
                    if (str.charAt(i11) != ' ') {
                        throw new ProtocolException(C5207g.m11116k(str, "Unexpected status line: "));
                    }
                    strSubstring = str.substring(i10 + 4);
                    C5207g.m11110e(strSubstring, "this as java.lang.String).substring(startIndex)");
                }
                return new C10269i(protocol, i12, strSubstring);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(C5207g.m11116k(str, "Unexpected status line: "));
            }
        }
    }

    public C10269i(Protocol protocol, int i10, String str) {
        C5207g.m11111f(protocol, "protocol");
        this.f51710a = protocol;
        this.f51711b = i10;
        this.f51712c = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f51710a == Protocol.HTTP_1_0) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.f51711b);
        sb2.append(' ');
        sb2.append(this.f51712c);
        String string = sb2.toString();
        C5207g.m11110e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
