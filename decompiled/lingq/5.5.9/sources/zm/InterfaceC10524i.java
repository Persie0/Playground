package zm;

import dm.C5207g;
import gn.InterfaceC5827g;
import java.util.Arrays;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C6831a;
import mn.C7645b;
import mn.C7646c;
import p491xm.C10245t;

/* JADX INFO: renamed from: zm.i */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC10524i {

    /* JADX INFO: renamed from: zm.i$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final C7645b f52513a;

        /* JADX INFO: renamed from: b */
        public final byte[] f52514b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC5827g f52515c;

        public a(C7645b c7645b, InterfaceC5827g interfaceC5827g, int i10) {
            interfaceC5827g = (i10 & 4) != 0 ? null : interfaceC5827g;
            this.f52513a = c7645b;
            this.f52514b = null;
            this.f52515c = interfaceC5827g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C5207g.m11106a(this.f52513a, aVar.f52513a) && C5207g.m11106a(this.f52514b, aVar.f52514b) && C5207g.m11106a(this.f52515c, aVar.f52515c);
        }

        public final int hashCode() {
            int iHashCode = this.f52513a.hashCode() * 31;
            int iHashCode2 = 0;
            byte[] bArr = this.f52514b;
            int iHashCode3 = (iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            InterfaceC5827g interfaceC5827g = this.f52515c;
            if (interfaceC5827g != null) {
                iHashCode2 = interfaceC5827g.hashCode();
            }
            return iHashCode3 + iHashCode2;
        }

        public final String toString() {
            return "Request(classId=" + this.f52513a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f52514b) + ", outerClass=" + this.f52515c + ')';
        }
    }

    /* JADX INFO: renamed from: a */
    void mo18549a(C7646c c7646c);

    /* JADX INFO: renamed from: b */
    C10245t mo18550b(C7646c c7646c);

    /* JADX INFO: renamed from: c */
    C6831a mo18551c(a aVar);
}
