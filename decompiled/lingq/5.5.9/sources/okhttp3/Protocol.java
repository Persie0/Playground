package okhttp3;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m13365d2 = {"Lokhttp3/Protocol;", "", "", "toString", "protocol", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "HTTP_1_0", "HTTP_1_1", "SPDY_3", "HTTP_2", "H2_PRIOR_KNOWLEDGE", "QUIC", "okhttp"}, m13366k = 1, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final String protocol;

    /* JADX INFO: renamed from: okhttp3.Protocol$a, reason: from kotlin metadata */
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static Protocol m15939a(String str) throws IOException {
            C5207g.m11111f(str, "protocol");
            Protocol protocol = Protocol.HTTP_1_0;
            if (!C5207g.m11106a(str, protocol.protocol)) {
                protocol = Protocol.HTTP_1_1;
                if (!C5207g.m11106a(str, protocol.protocol)) {
                    protocol = Protocol.H2_PRIOR_KNOWLEDGE;
                    if (!C5207g.m11106a(str, protocol.protocol)) {
                        protocol = Protocol.HTTP_2;
                        if (!C5207g.m11106a(str, protocol.protocol)) {
                            protocol = Protocol.SPDY_3;
                            if (!C5207g.m11106a(str, protocol.protocol)) {
                                protocol = Protocol.QUIC;
                                if (!C5207g.m11106a(str, protocol.protocol)) {
                                    throw new IOException(C5207g.m11116k(str, "Unexpected protocol: "));
                                }
                            }
                        }
                    }
                }
            }
            return protocol;
        }
    }

    Protocol(String str) {
        this.protocol = str;
    }

    public static final Protocol get(String str) throws IOException {
        INSTANCE.getClass();
        return Companion.m15939a(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }
}
