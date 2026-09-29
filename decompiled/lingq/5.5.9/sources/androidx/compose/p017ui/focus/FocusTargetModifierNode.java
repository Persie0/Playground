package androidx.compose.p017ui.focus;

import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.node.LayoutNode;
import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;
import p142h1.InterfaceC5874e;
import p166i1.AbstractC6165t;
import p166i1.C6134a0;
import p166i1.C6139d;
import p166i1.C6166u;
import p166i1.InterfaceC6171z;
import p351r0.C8687f;
import p351r0.InterfaceC8686e;
import p351r0.InterfaceC8691j;
import p351r0.InterfaceC8692k;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class FocusTargetModifierNode extends InterfaceC0500b.c implements InterfaceC6171z, InterfaceC5874e {

    /* JADX INFO: renamed from: k */
    public FocusStateImpl f3392k = FocusStateImpl.Inactive;

    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m13365d2 = {"Landroidx/compose/ui/focus/FocusTargetModifierNode$FocusTargetModifierElement;", "Li1/t;", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "<init>", "()V", "ui_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    public static final class FocusTargetModifierElement extends AbstractC6165t<FocusTargetModifierNode> {

        /* JADX INFO: renamed from: a */
        public static final FocusTargetModifierElement f3393a = new FocusTargetModifierElement();

        private FocusTargetModifierElement() {
        }

        @Override // p166i1.AbstractC6165t
        /* JADX INFO: renamed from: c */
        public final InterfaceC0500b.c mo1935c() {
            return new FocusTargetModifierNode();
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        @Override // p166i1.AbstractC6165t
        /* JADX INFO: renamed from: h */
        public final InterfaceC0500b.c mo1936h(InterfaceC0500b.c cVar) {
            FocusTargetModifierNode focusTargetModifierNode = (FocusTargetModifierNode) cVar;
            C5207g.m11111f(focusTargetModifierNode, "node");
            return focusTargetModifierNode;
        }

        public final int hashCode() {
            return 1739042953;
        }
    }

    @Override // androidx.compose.p017ui.InterfaceC0500b.c
    /* JADX INFO: renamed from: H */
    public final void mo1933H() {
        FocusStateImpl focusStateImpl = this.f3392k;
        if (focusStateImpl == FocusStateImpl.Active || focusStateImpl == FocusStateImpl.Captured) {
            C6139d.m12653f(this).getFocusOwner().mo1965l(true);
            return;
        }
        if (focusStateImpl == FocusStateImpl.ActiveParent) {
            m1973K();
            this.f3392k = FocusStateImpl.Inactive;
        } else if (focusStateImpl == FocusStateImpl.Inactive) {
            m1973K();
        }
    }

    /* JADX INFO: renamed from: I */
    public final FocusPropertiesImpl m1971I() {
        C6166u c6166u;
        FocusPropertiesImpl focusPropertiesImpl = new FocusPropertiesImpl();
        InterfaceC0500b.c cVar = this.f3326a;
        if (!cVar.f3335j) {
            throw new IllegalStateException("Check failed.".toString());
        }
        InterfaceC0500b.c cVar2 = cVar.f3329d;
        LayoutNode layoutNodeM12652e = C6139d.m12652e(this);
        while (layoutNodeM12652e != null) {
            if ((layoutNodeM12652e.f3758U.f35999e.f3328c & 3072) != 0) {
                while (cVar2 != null) {
                    int i10 = cVar2.f3327b;
                    if ((i10 & 3072) != 0) {
                        if ((i10 & 1024) != 0) {
                            return focusPropertiesImpl;
                        }
                        if (!(cVar2 instanceof InterfaceC8692k)) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        ((InterfaceC8692k) cVar2).mo2087m(focusPropertiesImpl);
                    }
                    cVar2 = cVar2.f3329d;
                }
            }
            layoutNodeM12652e = layoutNodeM12652e.m2128r();
            cVar2 = (layoutNodeM12652e == null || (c6166u = layoutNodeM12652e.f3758U) == null) ? null : c6166u.f35998d;
        }
        return focusPropertiesImpl;
    }

    /* JADX INFO: renamed from: J */
    public final void m1972J() {
        FocusStateImpl focusStateImpl = this.f3392k;
        if (focusStateImpl == FocusStateImpl.Active || focusStateImpl == FocusStateImpl.Captured) {
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            C6134a0.m12646a(this, new InterfaceC2041a<C9072e>() { // from class: androidx.compose.ui.focus.FocusTargetModifierNode$invalidateFocus$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [T, androidx.compose.ui.focus.FocusPropertiesImpl] */
                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final C9072e mo807E() {
                    ref$ObjectRef.f38127a = this.m1971I();
                    return C9072e.f47360a;
                }
            });
            T t10 = ref$ObjectRef.f38127a;
            if (t10 == 0) {
                C5207g.m11117l("focusProperties");
                throw null;
            }
            if (!((InterfaceC8691j) t10).mo1967a()) {
                C6139d.m12653f(this).getFocusOwner().mo1965l(true);
            }
        } else if (focusStateImpl == FocusStateImpl.ActiveParent) {
        } else {
            FocusStateImpl focusStateImpl2 = FocusStateImpl.Active;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: K */
    public final void m1973K() {
        C6166u c6166u;
        InterfaceC0500b.c cVar = this.f3326a;
        if (!cVar.f3335j) {
            throw new IllegalStateException("Check failed.".toString());
        }
        InterfaceC0500b.c cVar2 = cVar.f3329d;
        LayoutNode layoutNodeM12652e = C6139d.m12652e(this);
        while (layoutNodeM12652e != null) {
            if ((layoutNodeM12652e.f3758U.f35999e.f3328c & 5120) != 0) {
                while (cVar2 != null) {
                    int i10 = cVar2.f3327b;
                    if ((i10 & 5120) != 0) {
                        if ((i10 & 1024) != 0) {
                            continue;
                        } else {
                            if (!(cVar2 instanceof InterfaceC8686e)) {
                                throw new IllegalStateException("Check failed.".toString());
                            }
                            C6139d.m12653f(this).getFocusOwner().mo1958e((InterfaceC8686e) cVar2);
                        }
                    }
                    cVar2 = cVar2.f3329d;
                }
            }
            layoutNodeM12652e = layoutNodeM12652e.m2128r();
            cVar2 = (layoutNodeM12652e == null || (c6166u = layoutNodeM12652e.f3758U) == null) ? null : c6166u.f35998d;
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m1974L(FocusStateImpl focusStateImpl) {
        C5207g.m11111f(focusStateImpl, "<set-?>");
        this.f3392k = focusStateImpl;
    }

    @Override // p166i1.InterfaceC6171z
    /* JADX INFO: renamed from: x */
    public final void mo1975x() {
        FocusStateImpl focusStateImpl = this.f3392k;
        m1972J();
        if (C5207g.m11106a(focusStateImpl, this.f3392k)) {
            return;
        }
        C8687f.m16940b(this);
    }
}
