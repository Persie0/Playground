package androidx.compose.p017ui.node;

import androidx.compose.p017ui.modifier.ModifierLocalManager;
import androidx.compose.p017ui.platform.InterfaceC0626g1;
import androidx.compose.p017ui.platform.InterfaceC0627h;
import androidx.compose.p017ui.platform.InterfaceC0634j0;
import androidx.compose.p017ui.platform.InterfaceC0647n1;
import androidx.compose.p017ui.platform.InterfaceC0665t1;
import androidx.compose.p017ui.text.font.AbstractC0696b;
import androidx.compose.p017ui.unit.LayoutDirection;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import p002a1.InterfaceC0007b;
import p060d1.InterfaceC5026m;
import p166i1.C6163r;
import p166i1.InterfaceC6140d0;
import p310p0.C8166g;
import p310p0.InterfaceC8161b;
import p328q1.InterfaceC8468e;
import p351r0.InterfaceC8690i;
import p352r1.C8721v;
import p352r1.InterfaceC8714o;
import p470x1.InterfaceC10015c;
import p520z0.InterfaceC10426a;
import sl.C9072e;

/* JADX INFO: renamed from: androidx.compose.ui.node.h */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0549h {

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ int f3926o = 0;

    /* JADX INFO: renamed from: androidx.compose.ui.node.h$a */
    public interface a {
        /* JADX INFO: renamed from: c */
        void mo2098c();
    }

    /* JADX INFO: renamed from: a */
    void mo2226a(LayoutNode layoutNode, boolean z10, boolean z11);

    /* JADX INFO: renamed from: d */
    void mo2227d(LayoutNode layoutNode, boolean z10, boolean z11);

    /* JADX INFO: renamed from: f */
    long mo2228f(long j10);

    /* JADX INFO: renamed from: g */
    void mo2229g(LayoutNode layoutNode);

    InterfaceC0627h getAccessibilityManager();

    InterfaceC8161b getAutofill();

    C8166g getAutofillTree();

    InterfaceC0634j0 getClipboardManager();

    InterfaceC10015c getDensity();

    InterfaceC8690i getFocusOwner();

    AbstractC0696b.a getFontFamilyResolver();

    InterfaceC8468e.a getFontLoader();

    InterfaceC10426a getHapticFeedBack();

    InterfaceC0007b getInputModeManager();

    LayoutDirection getLayoutDirection();

    ModifierLocalManager getModifierLocalManager();

    InterfaceC8714o getPlatformTextInputPluginRegistry();

    InterfaceC5026m getPointerIconService();

    C6163r getSharedDrawScope();

    boolean getShowLayoutBounds();

    OwnerSnapshotObserver getSnapshotObserver();

    C8721v getTextInputService();

    InterfaceC0626g1 getTextToolbar();

    InterfaceC0647n1 getViewConfiguration();

    InterfaceC0665t1 getWindowInfo();

    /* JADX INFO: renamed from: h */
    void mo2230h(LayoutNode layoutNode);

    /* JADX INFO: renamed from: i */
    void mo2231i(LayoutNode layoutNode);

    /* JADX INFO: renamed from: j */
    void mo2232j(LayoutNode layoutNode);

    /* JADX INFO: renamed from: l */
    void mo2233l();

    /* JADX INFO: renamed from: m */
    void mo2234m();

    /* JADX INFO: renamed from: n */
    InterfaceC6140d0 mo2235n(InterfaceC2041a interfaceC2041a, InterfaceC2052l interfaceC2052l);

    /* JADX INFO: renamed from: p */
    void mo2236p(BackwardsCompatNode.C0527a c0527a);

    /* JADX INFO: renamed from: q */
    void mo2237q(InterfaceC2041a<C9072e> interfaceC2041a);

    /* JADX INFO: renamed from: r */
    void mo2238r(LayoutNode layoutNode);

    boolean requestFocus();

    void setShowLayoutBounds(boolean z10);
}
