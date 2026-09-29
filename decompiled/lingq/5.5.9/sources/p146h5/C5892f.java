package p146h5;

import androidx.work.NetworkType;
import dm.C5207g;
import p026b5.AbstractC1314g;
import p131g5.C5698b;
import p170i5.AbstractC6189h;
import p214k5.C6617s;

/* JADX INFO: renamed from: h5.f */
/* JADX INFO: loaded from: classes.dex */
public final class C5892f extends AbstractC5889c<C5698b> {
    static {
        C5207g.m11110e(AbstractC1314g.m4868f("NetworkNotRoamingCtrlr"), "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5892f(AbstractC6189h<C5698b> abstractC6189h) {
        super(abstractC6189h);
        C5207g.m11111f(abstractC6189h, "tracker");
    }

    @Override // p146h5.AbstractC5889c
    /* JADX INFO: renamed from: b */
    public final boolean mo12313b(C6617s c6617s) {
        C5207g.m11111f(c6617s, "workSpec");
        return c6617s.f37533j.f8046a == NetworkType.NOT_ROAMING;
    }

    @Override // p146h5.AbstractC5889c
    /* JADX INFO: renamed from: c */
    public final boolean mo12314c(C5698b c5698b) {
        C5698b c5698b2 = c5698b;
        C5207g.m11111f(c5698b2, "value");
        if (c5698b2.f34708a && c5698b2.f34711d) {
            return false;
        }
        return true;
    }
}
