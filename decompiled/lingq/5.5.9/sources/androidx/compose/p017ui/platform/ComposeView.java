package androidx.compose.p017ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import p081e0.C5332q0;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import p338qd.C8573r0;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001b\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR*\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0014@RX\u0094\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m13365d2 = {"Landroidx/compose/ui/platform/ComposeView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "", "getAccessibilityClassName", "Lkotlin/Function0;", "Lsl/e;", "content", "setContent", "(Lcm/p;)V", "", "<set-?>", "j", "Z", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "getShouldCreateCompositionOnAttachedToWindow$annotations", "()V", "shouldCreateCompositionOnAttachedToWindow", "ui_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ComposeView extends AbstractComposeView {

    /* JADX INFO: renamed from: i */
    public final ParcelableSnapshotMutableState f4129i;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean shouldCreateCompositionOnAttachedToWindow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C5207g.m11111f(context, "context");
        this.f4129i = C8573r0.m16684L0(null);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // androidx.compose.p017ui.platform.AbstractComposeView
    /* JADX INFO: renamed from: a */
    public final void mo2240a(InterfaceC0476a interfaceC0476a, final int i10) {
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(420213850);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        InterfaceC2056p interfaceC2056p = (InterfaceC2056p) this.f4129i.getValue();
        if (interfaceC2056p != null) {
            interfaceC2056p.mo1337m0(composerImplMo1636j, 0);
        }
        C5332q0 c5332q0M1612T = composerImplMo1636j.m1612T();
        if (c5332q0M1612T == null) {
            return;
        }
        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.platform.ComposeView$Content$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                num.intValue();
                int iM16737l1 = C8573r0.m16737l1(i10 | 1);
                this.f4131b.mo2240a(interfaceC0476a2, iM16737l1);
                return C9072e.f47360a;
            }
        };
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    @Override // androidx.compose.p017ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public final void setContent(InterfaceC2056p<? super InterfaceC0476a, ? super Integer, C9072e> content) {
        C5207g.m11111f(content, "content");
        boolean z10 = true;
        this.shouldCreateCompositionOnAttachedToWindow = true;
        this.f4129i.setValue(content);
        if (isAttachedToWindow()) {
            if (this.f3930d == null && !isAttachedToWindow()) {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString());
            }
            m2243d();
        }
    }
}
