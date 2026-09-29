package okhttp3;

import cm.InterfaceC2041a;
import dm.C5207g;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import mo.C7661i;
import p103ep.AbstractC5449c;
import tl.C9325m;

/* JADX INFO: renamed from: okhttp3.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C8073b {

    /* JADX INFO: renamed from: c */
    public static final C8073b f43808c = new C8073b(C6752c.m13457y0(new ArrayList()), null);

    /* JADX INFO: renamed from: a */
    public final Set<a> f43809a;

    /* JADX INFO: renamed from: b */
    public final AbstractC5449c f43810b;

    /* JADX INFO: renamed from: okhttp3.b$a */
    public static final class a {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            aVar.getClass();
            if (!C5207g.m11106a(null, null)) {
                return false;
            }
            aVar.getClass();
            if (!C5207g.m11106a(null, null)) {
                return false;
            }
            aVar.getClass();
            return C5207g.m11106a(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public final String toString() {
            throw null;
        }
    }

    public C8073b(Set<a> set, AbstractC5449c abstractC5449c) {
        C5207g.m11111f(set, "pins");
        this.f43809a = set;
        this.f43810b = abstractC5449c;
    }

    /* JADX INFO: renamed from: a */
    public final void m15949a(final List list, final String str) throws SSLPeerUnverifiedException {
        C5207g.m11111f(str, "hostname");
        C5207g.m11111f(list, "peerCertificates");
        m15950b(str, new InterfaceC2041a<List<? extends X509Certificate>>() { // from class: okhttp3.CertificatePinner$check$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final List<? extends X509Certificate> mo807E() {
                AbstractC5449c abstractC5449c = this.f43772b.f43810b;
                List<Certificate> list2 = list;
                List<Certificate> listMo10693a = abstractC5449c == null ? null : abstractC5449c.mo10693a(list2, str);
                if (listMo10693a != null) {
                    list2 = listMo10693a;
                }
                ArrayList arrayList = new ArrayList(C9325m.m17681z(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add((X509Certificate) ((Certificate) it.next()));
                }
                return arrayList;
            }
        });
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final void m15950b(String str, InterfaceC2041a<? extends List<? extends X509Certificate>> interfaceC2041a) {
        C5207g.m11111f(str, "hostname");
        EmptyList emptyList = EmptyList.f38032a;
        Iterator<T> it = this.f43809a.iterator();
        if (!it.hasNext()) {
            emptyList.getClass();
        } else {
            ((a) it.next()).getClass();
            C7661i.m15256V2(null, "**.", false);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8073b) {
            C8073b c8073b = (C8073b) obj;
            if (C5207g.m11106a(c8073b.f43809a, this.f43809a) && C5207g.m11106a(c8073b.f43810b, this.f43810b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f43809a.hashCode() + 1517) * 41;
        AbstractC5449c abstractC5449c = this.f43810b;
        return iHashCode + (abstractC5449c != null ? abstractC5449c.hashCode() : 0);
    }
}
