package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import p372rm.AbstractC8848l;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8862t;

/* JADX INFO: loaded from: classes2.dex */
public interface CallableMemberDescriptor extends InterfaceC6816a, InterfaceC8862t {

    public enum Kind {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        public boolean isReal() {
            return this != FAKE_OVERRIDE;
        }
    }

    /* JADX INFO: renamed from: B */
    CallableMemberDescriptor mo11846B(InterfaceC8838g interfaceC8838g, Modality modality, AbstractC8848l abstractC8848l, Kind kind);

    /* JADX INFO: renamed from: G0 */
    void mo11847G0(Collection<? extends CallableMemberDescriptor> collection);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a, p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: b */
    CallableMemberDescriptor mo11875b();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: p */
    Collection<? extends CallableMemberDescriptor> mo11893p();

    /* JADX INFO: renamed from: u */
    Kind mo11897u();
}
