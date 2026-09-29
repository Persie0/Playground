package androidx.compose.p017ui.focus;

import androidx.compose.p017ui.InterfaceC0500b;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p166i1.C6139d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m13365d2 = {"<anonymous>", "", "destination", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "invoke", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Ljava/lang/Boolean;"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public final class FocusOwnerImpl$moveFocus$foundNextItem$1 extends Lambda implements InterfaceC2052l<FocusTargetModifierNode, Boolean> {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FocusTargetModifierNode f3371b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusOwnerImpl$moveFocus$foundNextItem$1(FocusTargetModifierNode focusTargetModifierNode) {
        super(1);
        this.f3371b = focusTargetModifierNode;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Boolean mo528n(FocusTargetModifierNode focusTargetModifierNode) {
        FocusTargetModifierNode focusTargetModifierNode2 = focusTargetModifierNode;
        C5207g.m11111f(focusTargetModifierNode2, "destination");
        if (C5207g.m11106a(focusTargetModifierNode2, this.f3371b)) {
            return Boolean.FALSE;
        }
        InterfaceC0500b.c cVarM12650c = C6139d.m12650c(focusTargetModifierNode2, 1024);
        if (!(cVarM12650c instanceof FocusTargetModifierNode)) {
            cVarM12650c = null;
        }
        if (((FocusTargetModifierNode) cVarM12650c) != null) {
            return Boolean.valueOf(FocusTransactionsKt.m1978c(focusTargetModifierNode2));
        }
        throw new IllegalStateException("Focus search landed at the root.".toString());
    }
}
