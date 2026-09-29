package p102eo;

import android.support.v4.media.AbstractC0140a;
import dm.C5207g;
import java.util.Collection;
import mn.C7645b;
import p139go.InterfaceC5852f;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8863u;
import p543do.AbstractC5257t;

/* JADX INFO: renamed from: eo.d */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5439d extends AbstractC0140a {

    /* JADX INFO: renamed from: eo.d$a */
    public static final class a extends AbstractC5439d {

        /* JADX INFO: renamed from: a */
        public static final a f33983a = new a();

        @Override // android.support.v4.media.AbstractC0140a
        /* JADX INFO: renamed from: f0 */
        public final AbstractC5257t mo596f0(InterfaceC5852f interfaceC5852f) {
            C5207g.m11111f(interfaceC5852f, "type");
            return (AbstractC5257t) interfaceC5852f;
        }

        @Override // p102eo.AbstractC5439d
        /* JADX INFO: renamed from: k0 */
        public final void mo11659k0(C7645b c7645b) {
        }

        @Override // p102eo.AbstractC5439d
        /* JADX INFO: renamed from: l0 */
        public final void mo11660l0(InterfaceC8863u interfaceC8863u) {
        }

        @Override // p102eo.AbstractC5439d
        /* JADX INFO: renamed from: m0 */
        public final void mo11661m0(InterfaceC8834e interfaceC8834e) {
            C5207g.m11111f(interfaceC8834e, "descriptor");
        }

        @Override // p102eo.AbstractC5439d
        /* JADX INFO: renamed from: n0 */
        public final Collection<AbstractC5257t> mo11662n0(InterfaceC8830c interfaceC8830c) {
            C5207g.m11111f(interfaceC8830c, "classDescriptor");
            Collection<AbstractC5257t> collectionMo11278p = interfaceC8830c.mo13600k().mo11278p();
            C5207g.m11110e(collectionMo11278p, "classDescriptor.typeConstructor.supertypes");
            return collectionMo11278p;
        }

        @Override // p102eo.AbstractC5439d
        /* JADX INFO: renamed from: o0 */
        public final AbstractC5257t mo11663o0(InterfaceC5852f interfaceC5852f) {
            C5207g.m11111f(interfaceC5852f, "type");
            return (AbstractC5257t) interfaceC5852f;
        }
    }

    /* JADX INFO: renamed from: k0 */
    public abstract void mo11659k0(C7645b c7645b);

    /* JADX INFO: renamed from: l0 */
    public abstract void mo11660l0(InterfaceC8863u interfaceC8863u);

    /* JADX INFO: renamed from: m0 */
    public abstract void mo11661m0(InterfaceC8834e interfaceC8834e);

    /* JADX INFO: renamed from: n0 */
    public abstract Collection<AbstractC5257t> mo11662n0(InterfaceC8830c interfaceC8830c);

    /* JADX INFO: renamed from: o0 */
    public abstract AbstractC5257t mo11663o0(InterfaceC5852f interfaceC5852f);
}
