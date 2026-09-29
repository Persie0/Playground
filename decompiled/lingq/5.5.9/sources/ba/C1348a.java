package ba;

import android.support.v4.media.AbstractC0140a;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p479xa.C10151t;
import p529z9.C10463c;

/* JADX INFO: renamed from: ba.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1348a extends AbstractC0140a {
    /* JADX INFO: renamed from: k0 */
    public static EventMessage m4927k0(C10151t c10151t) {
        String strM19139n = c10151t.m19139n();
        strM19139n.getClass();
        String strM19139n2 = c10151t.m19139n();
        strM19139n2.getClass();
        return new EventMessage(strM19139n, strM19139n2, c10151t.m19138m(), c10151t.m19138m(), Arrays.copyOfRange(c10151t.f51438a, c10151t.f51439b, c10151t.f51440c));
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: p */
    public final Metadata mo211p(C10463c c10463c, ByteBuffer byteBuffer) {
        return new Metadata(m4927k0(new C10151t(byteBuffer.array(), byteBuffer.limit())));
    }
}
