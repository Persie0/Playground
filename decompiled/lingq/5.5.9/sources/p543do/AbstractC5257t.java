package p543do;

import dm.C5206f;
import dm.C5207g;
import dm.C5212l;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p102eo.AbstractC5439d;
import p139go.InterfaceC5852f;
import p260m8.C7499b;
import sm.InterfaceC9073a;
import sm.InterfaceC9077e;

/* JADX INFO: renamed from: do.t */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5257t implements InterfaceC9073a, InterfaceC5852f {

    /* JADX INFO: renamed from: a */
    public int f33351a;

    /* JADX INFO: renamed from: V0 */
    public abstract List<InterfaceC5246n0> mo11240V0();

    /* JADX INFO: renamed from: W0 */
    public abstract C5238j0 mo11241W0();

    /* JADX INFO: renamed from: X0 */
    public abstract InterfaceC5240k0 mo11250X0();

    /* JADX INFO: renamed from: Y0 */
    public abstract boolean mo11242Y0();

    /* JADX INFO: renamed from: Z0 */
    public abstract AbstractC5257t mo11216Z0(AbstractC5439d abstractC5439d);

    /* JADX INFO: renamed from: a1 */
    public abstract AbstractC5262v0 mo11288a1();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC5257t)) {
            return false;
        }
        AbstractC5257t abstractC5257t = (AbstractC5257t) obj;
        if (mo11242Y0() == abstractC5257t.mo11242Y0()) {
            AbstractC5262v0 abstractC5262v0Mo11288a1 = mo11288a1();
            AbstractC5262v0 abstractC5262v0Mo11288a2 = abstractC5257t.mo11288a1();
            C5207g.m11111f(abstractC5262v0Mo11288a1, "a");
            C5207g.m11111f(abstractC5262v0Mo11288a2, "b");
            if (C5212l.m11168m0(C5206f.f33268c, abstractC5262v0Mo11288a1, abstractC5262v0Mo11288a2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int i10 = this.f33351a;
        if (i10 != 0) {
            return i10;
        }
        if (C7499b.m14926X(this)) {
            iHashCode = super.hashCode();
        } else {
            iHashCode = (mo11242Y0() ? 1 : 0) + ((mo11240V0().hashCode() + (mo11250X0().hashCode() * 31)) * 31);
        }
        this.f33351a = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: q */
    public abstract MemberScope mo11245q();

    @Override // sm.InterfaceC9073a
    /* JADX INFO: renamed from: w */
    public final InterfaceC9077e mo11289w() {
        return C5227e.m11251a(mo11241W0());
    }
}
