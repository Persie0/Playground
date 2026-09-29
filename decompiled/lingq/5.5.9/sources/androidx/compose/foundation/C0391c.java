package androidx.compose.foundation;

import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.focus.C0510b;
import androidx.compose.p017ui.focus.FocusTargetModifierNode;
import androidx.compose.p017ui.platform.C0658r0;
import androidx.compose.p017ui.platform.InspectableValueKt;
import cm.InterfaceC2052l;
import dm.C5207g;
import p351r0.InterfaceC8691j;
import sl.C9072e;

/* JADX INFO: renamed from: androidx.compose.foundation.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0391c {

    /* JADX INFO: renamed from: a */
    public static final C0658r0 f1945a = new C0658r0(InspectableValueKt.f4184a);

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0500b m1429a() {
        C0658r0 c0658r0 = f1945a;
        C5207g.m11111f(c0658r0, "other");
        InterfaceC0500b interfaceC0500bM1998a = C0510b.m1998a(c0658r0, new InterfaceC2052l<InterfaceC8691j, C9072e>() { // from class: androidx.compose.foundation.FocusableKt$focusGroup$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(InterfaceC8691j interfaceC8691j) {
                InterfaceC8691j interfaceC8691j2 = interfaceC8691j;
                C5207g.m11111f(interfaceC8691j2, "$this$focusProperties");
                interfaceC8691j2.mo1968b(false);
                return C9072e.f47360a;
            }
        });
        C5207g.m11111f(interfaceC0500bM1998a, "<this>");
        return interfaceC0500bM1998a.mo1929K(FocusTargetModifierNode.FocusTargetModifierElement.f3393a);
    }
}
