package p122fl;

import com.tonyodev.fetch2core.Downloader;
import com.tonyodev.fetch2core.server.FileRequest;
import dm.C5207g;
import gl.C5818a;
import java.net.InetSocketAddress;
import kotlin.TypeCastException;

/* JADX INFO: renamed from: fl.e */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5582e extends Downloader<C5818a, a> {

    /* JADX INFO: renamed from: fl.e$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public InetSocketAddress f34390a = new InetSocketAddress(0);

        /* JADX INFO: renamed from: b */
        public FileRequest f34391b = new FileRequest(0);

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!C5207g.m11106a(a.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            if (obj == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tonyodev.fetch2core.FileServerDownloader.TransporterRequest");
            }
            a aVar = (a) obj;
            return ((C5207g.m11106a(this.f34390a, aVar.f34390a) ^ true) || (C5207g.m11106a(this.f34391b, aVar.f34391b) ^ true)) ? false : true;
        }

        public final int hashCode() {
            return this.f34391b.hashCode() + (this.f34390a.hashCode() * 31);
        }

        public final String toString() {
            return "TransporterRequest(inetSocketAddress=" + this.f34390a + ", fileRequest=" + this.f34391b + ')';
        }
    }
}
