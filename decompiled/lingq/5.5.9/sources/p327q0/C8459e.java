package p327q0;

import androidx.compose.p017ui.node.BackwardsCompatNode;
import cm.InterfaceC2052l;
import dm.C5207g;
import p424v0.InterfaceC9619c;

/* JADX INFO: renamed from: q0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C8459e implements InterfaceC8458d {

    /* JADX INFO: renamed from: a */
    public final C8456b f45630a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2052l<C8456b, C8461g> f45631b;

    /* JADX WARN: Multi-variable type inference failed */
    public C8459e(C8456b c8456b, InterfaceC2052l<? super C8456b, C8461g> interfaceC2052l) {
        C5207g.m11111f(c8456b, "cacheDrawScope");
        C5207g.m11111f(interfaceC2052l, "onBuildDrawCache");
        this.f45630a = c8456b;
        this.f45631b = interfaceC2052l;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p327q0.InterfaceC8458d
    /* JADX INFO: renamed from: Q */
    public final void mo16541Q(BackwardsCompatNode backwardsCompatNode) {
        C5207g.m11111f(backwardsCompatNode, "params");
        C8456b c8456b = this.f45630a;
        c8456b.getClass();
        c8456b.f45627a = backwardsCompatNode;
        c8456b.f45628b = null;
        this.f45631b.mo528n(c8456b);
        if (c8456b.f45628b == null) {
            throw new IllegalStateException("DrawResult not defined, did you forget to call onDraw?".toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8459e)) {
            return false;
        }
        C8459e c8459e = (C8459e) obj;
        return C5207g.m11106a(this.f45630a, c8459e.f45630a) && C5207g.m11106a(this.f45631b, c8459e.f45631b);
    }

    public final int hashCode() {
        return this.f45631b.hashCode() + (this.f45630a.hashCode() * 31);
    }

    @Override // p327q0.InterfaceC8460f
    /* JADX INFO: renamed from: s */
    public final void mo16542s(InterfaceC9619c interfaceC9619c) {
        C5207g.m11111f(interfaceC9619c, "<this>");
        C8461g c8461g = this.f45630a.f45628b;
        C5207g.m11108c(c8461g);
        c8461g.f45632a.mo528n(interfaceC9619c);
    }

    public final String toString() {
        return "DrawContentCacheModifier(cacheDrawScope=" + this.f45630a + ", onBuildDrawCache=" + this.f45631b + ')';
    }
}
