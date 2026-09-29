package androidx.compose.p017ui.platform;

import ae.C0062b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.activity.RunnableC0190i;
import androidx.appcompat.widget.C0322j;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.focus.FocusOwnerImpl;
import androidx.compose.p017ui.input.key.OnKeyEventElement;
import androidx.compose.p017ui.input.rotary.OnRotaryScrollEventElement;
import androidx.compose.p017ui.layout.RootMeasurePolicy;
import androidx.compose.p017ui.modifier.ModifierLocalManager;
import androidx.compose.p017ui.node.BackwardsCompatNode;
import androidx.compose.p017ui.node.C0547f;
import androidx.compose.p017ui.node.InterfaceC0549h;
import androidx.compose.p017ui.node.LayoutNode;
import androidx.compose.p017ui.node.NodeCoordinator;
import androidx.compose.p017ui.node.OwnerSnapshotObserver;
import androidx.compose.p017ui.semantics.SemanticsNode;
import androidx.compose.p017ui.semantics.SemanticsProperties;
import androidx.compose.p017ui.text.font.AbstractC0696b;
import androidx.compose.p017ui.text.font.C0698d;
import androidx.compose.p017ui.text.input.C0705b;
import androidx.compose.p017ui.unit.LayoutDirection;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.snapshots.AbstractC0497b;
import androidx.compose.runtime.snapshots.C0496a;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.p544savedstate.ViewTreeSavedStateRegistryOwner;
import androidx.view.C1052r;
import androidx.view.InterfaceC1029e;
import androidx.view.InterfaceC1051q;
import androidx.view.ViewTreeLifecycleOwner;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import dm.C5212l;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.collections.C6752c;
import p002a1.C0006a;
import p002a1.C0008c;
import p002a1.InterfaceC0007b;
import p022b1.C1288a;
import p022b1.C1289b;
import p060d1.C5020g;
import p060d1.C5023j;
import p060d1.C5030q;
import p060d1.C5031r;
import p060d1.C5032s;
import p060d1.C5036w;
import p060d1.InterfaceC5025l;
import p060d1.InterfaceC5026m;
import p060d1.InterfaceC5037x;
import p081e0.C5334r0;
import p105f0.C5454b;
import p105f0.C5458f;
import p106f1.C5461c;
import p166i1.C6138c0;
import p166i1.C6139d;
import p166i1.C6151j;
import p166i1.C6163r;
import p166i1.C6166u;
import p166i1.InterfaceC6140d0;
import p166i1.InterfaceC6152j0;
import p166i1.InterfaceC6154k0;
import p210k1.C6574l;
import p210k1.C6575m;
import p210k1.InterfaceC6577o;
import p260m8.C7499b;
import p270n4.InterfaceC7706c;
import p310p0.C8160a;
import p310p0.C8162c;
import p310p0.C8163d;
import p310p0.C8164e;
import p310p0.C8165f;
import p310p0.C8166g;
import p310p0.InterfaceC8161b;
import p328q1.InterfaceC8468e;
import p338qd.C8573r0;
import p351r0.C8684c;
import p351r0.InterfaceC8690i;
import p352r1.C8700a;
import p352r1.C8721v;
import p352r1.InterfaceC8711l;
import p352r1.InterfaceC8712m;
import p352r1.InterfaceC8713n;
import p352r1.InterfaceC8715p;
import p352r1.InterfaceC8720u;
import p375s0.C8941c;
import p375s0.C8942d;
import p385sf.C9000b;
import p387t0.C9139d;
import p387t0.C9166r;
import p470x1.C10013a;
import p470x1.C10014b;
import p470x1.C10016d;
import p470x1.C10020h;
import p470x1.InterfaceC10015c;
import p471x2.C10029b0;
import p471x2.C10033d0;
import p520z0.InterfaceC10426a;
import sl.C9072e;
import tl.C9322j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0004È\u0001É\u0001J\u001a\u0010\n\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010!\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010'\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010-\u001a\u00020(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u00103\u001a\u00020.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u00109\u001a\u0002048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R.\u0010A\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\b0\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001a\u0010G\u001a\u00020B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010M\u001a\u00020H8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010S\u001a\u00020N8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR(\u0010]\u001a\u00020T8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\bU\u0010V\u0012\u0004\b[\u0010\\\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u001a\u0010c\u001a\u00020^8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR(\u0010l\u001a\u00020d8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\be\u0010f\u0012\u0004\bk\u0010\\\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR/\u0010s\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00078F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\u001a\u0010y\u001a\u00020t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR\u001a\u0010\u007f\u001a\u00020z8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R'\u0010\u0086\u0001\u001a\u00030\u0080\u00018\u0016X\u0097\u0004¢\u0006\u0017\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u0012\u0005\b\u0085\u0001\u0010\\\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R3\u0010\u008d\u0001\u001a\u00030\u0087\u00012\u0007\u0010\u0016\u001a\u00030\u0087\u00018V@RX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\b\u0088\u0001\u0010n\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R3\u0010\u0094\u0001\u001a\u00030\u008e\u00012\u0007\u0010\u0016\u001a\u00030\u008e\u00018V@RX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\b\u008f\u0001\u0010n\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R \u0010\u009a\u0001\u001a\u00030\u0095\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R \u0010 \u0001\u001a\u00030\u009b\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R \u0010¦\u0001\u001a\u00030¡\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001R \u0010¬\u0001\u001a\u00030§\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001R\u0017\u0010¯\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u00ad\u0001\u0010®\u0001R\u0018\u0010³\u0001\u001a\u00030°\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b±\u0001\u0010²\u0001R\u001a\u0010·\u0001\u001a\u0005\u0018\u00010´\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bµ\u0001\u0010¶\u0001R\u0018\u0010»\u0001\u001a\u00030¸\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b¹\u0001\u0010º\u0001R\u0016\u0010½\u0001\u001a\u00020d8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¼\u0001\u0010hR\u0016\u0010¿\u0001\u001a\u00020T8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¾\u0001\u0010XR\u001a\u0010Ã\u0001\u001a\u0005\u0018\u00010À\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÁ\u0001\u0010Â\u0001R\u0018\u0010Ç\u0001\u001a\u00030Ä\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÅ\u0001\u0010Æ\u0001¨\u0006Ê\u0001"}, m13365d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "Landroidx/compose/ui/node/h;", "", "Ld1/x;", "Landroidx/lifecycle/e;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/AndroidComposeView$b;", "Lsl/e;", "callback", "setOnViewTreeOwnersAvailable", "", "accessibilityId", "Landroid/view/View;", "findViewByAccessibilityIdTraversal", "Li1/r;", "c", "Li1/r;", "getSharedDrawScope", "()Li1/r;", "sharedDrawScope", "Lx1/c;", "<set-?>", "d", "Lx1/c;", "getDensity", "()Lx1/c;", "density", "Lr0/i;", "e", "Lr0/i;", "getFocusOwner", "()Lr0/i;", "focusOwner", "Landroidx/compose/ui/node/LayoutNode;", "i", "Landroidx/compose/ui/node/LayoutNode;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "root", "Li1/j0;", "j", "Li1/j0;", "getRootForTest", "()Li1/j0;", "rootForTest", "Lk1/m;", "k", "Lk1/m;", "getSemanticsOwner", "()Lk1/m;", "semanticsOwner", "Lp0/g;", "H", "Lp0/g;", "getAutofillTree", "()Lp0/g;", "autofillTree", "Landroid/content/res/Configuration;", "N", "Lcm/l;", "getConfigurationChangeObserver", "()Lcm/l;", "setConfigurationChangeObserver", "(Lcm/l;)V", "configurationChangeObserver", "Landroidx/compose/ui/platform/k;", "Q", "Landroidx/compose/ui/platform/k;", "getClipboardManager", "()Landroidx/compose/ui/platform/k;", "clipboardManager", "Landroidx/compose/ui/platform/j;", "R", "Landroidx/compose/ui/platform/j;", "getAccessibilityManager", "()Landroidx/compose/ui/platform/j;", "accessibilityManager", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "S", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "", "T", "Z", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "(Z)V", "getShowLayoutBounds$annotations", "()V", "showLayoutBounds", "Landroidx/compose/ui/platform/n1;", "c0", "Landroidx/compose/ui/platform/n1;", "getViewConfiguration", "()Landroidx/compose/ui/platform/n1;", "viewConfiguration", "", "h0", "J", "getLastMatrixRecalculationAnimationTime$ui_release", "()J", "setLastMatrixRecalculationAnimationTime$ui_release", "(J)V", "getLastMatrixRecalculationAnimationTime$ui_release$annotations", "lastMatrixRecalculationAnimationTime", "l0", "Le0/g0;", "getViewTreeOwners", "()Landroidx/compose/ui/platform/AndroidComposeView$b;", "setViewTreeOwners", "(Landroidx/compose/ui/platform/AndroidComposeView$b;)V", "viewTreeOwners", "Landroidx/compose/ui/text/input/b;", "q0", "Landroidx/compose/ui/text/input/b;", "getPlatformTextInputPluginRegistry", "()Landroidx/compose/ui/text/input/b;", "platformTextInputPluginRegistry", "Lr1/v;", "r0", "Lr1/v;", "getTextInputService", "()Lr1/v;", "textInputService", "Lq1/e$a;", "s0", "Lq1/e$a;", "getFontLoader", "()Lq1/e$a;", "getFontLoader$annotations", "fontLoader", "Landroidx/compose/ui/text/font/b$a;", "t0", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/b$a;", "setFontFamilyResolver", "(Landroidx/compose/ui/text/font/b$a;)V", "fontFamilyResolver", "Landroidx/compose/ui/unit/LayoutDirection;", "v0", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection", "Lz0/a;", "w0", "Lz0/a;", "getHapticFeedBack", "()Lz0/a;", "hapticFeedBack", "Landroidx/compose/ui/modifier/ModifierLocalManager;", "y0", "Landroidx/compose/ui/modifier/ModifierLocalManager;", "getModifierLocalManager", "()Landroidx/compose/ui/modifier/ModifierLocalManager;", "modifierLocalManager", "Landroidx/compose/ui/platform/g1;", "z0", "Landroidx/compose/ui/platform/g1;", "getTextToolbar", "()Landroidx/compose/ui/platform/g1;", "textToolbar", "Ld1/m;", "L0", "Ld1/m;", "getPointerIconService", "()Ld1/m;", "pointerIconService", "getView", "()Landroid/view/View;", "view", "Landroidx/compose/ui/platform/t1;", "getWindowInfo", "()Landroidx/compose/ui/platform/t1;", "windowInfo", "Lp0/b;", "getAutofill", "()Lp0/b;", "autofill", "Landroidx/compose/ui/platform/f0;", "getAndroidViewsHandler$ui_release", "()Landroidx/compose/ui/platform/f0;", "androidViewsHandler", "getMeasureIteration", "measureIteration", "getHasPendingMeasureOrLayout", "hasPendingMeasureOrLayout", "Lr1/u;", "getTextInputForTests", "()Lr1/u;", "textInputForTests", "La1/b;", "getInputModeManager", "()La1/b;", "inputModeManager", "a", "b", "ui_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@SuppressLint({"ViewConstructor", "VisibleForTests"})
public final class AndroidComposeView extends ViewGroup implements InterfaceC0549h, InterfaceC6152j0, InterfaceC5037x, InterfaceC1029e {

    /* JADX INFO: renamed from: M0 */
    public static Class<?> f3936M0;

    /* JADX INFO: renamed from: N0 */
    public static Method f3937N0;

    /* JADX INFO: renamed from: A0 */
    public MotionEvent f3938A0;

    /* JADX INFO: renamed from: B0 */
    public long f3939B0;

    /* JADX INFO: renamed from: C0 */
    public final C0322j f3940C0;

    /* JADX INFO: renamed from: D0 */
    public final C5458f<InterfaceC2041a<C9072e>> f3941D0;

    /* JADX INFO: renamed from: E0 */
    public final RunnableC0553d f3942E0;

    /* JADX INFO: renamed from: F0 */
    public final RunnableC0190i f3943F0;

    /* JADX INFO: renamed from: G0 */
    public boolean f3944G0;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public final C8166g autofillTree;

    /* JADX INFO: renamed from: H0 */
    public final InterfaceC2041a<C9072e> f3946H0;

    /* JADX INFO: renamed from: I */
    public final ArrayList f3947I;

    /* JADX INFO: renamed from: I0 */
    public final InterfaceC0625g0 f3948I0;

    /* JADX INFO: renamed from: J */
    public ArrayList f3949J;

    /* JADX INFO: renamed from: J0 */
    public boolean f3950J0;

    /* JADX INFO: renamed from: K */
    public boolean f3951K;

    /* JADX INFO: renamed from: K0 */
    public InterfaceC5025l f3952K0;

    /* JADX INFO: renamed from: L */
    public final C5020g f3953L;

    /* JADX INFO: renamed from: L0 */
    public final C0552c f3954L0;

    /* JADX INFO: renamed from: M */
    public final C5032s f3955M;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public InterfaceC2052l<? super Configuration, C9072e> configurationChangeObserver;

    /* JADX INFO: renamed from: O */
    public final C8160a f3957O;

    /* JADX INFO: renamed from: P */
    public boolean f3958P;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public final C0636k clipboardManager;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public final C0633j accessibilityManager;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public final OwnerSnapshotObserver snapshotObserver;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public boolean showLayoutBounds;

    /* JADX INFO: renamed from: U */
    public C0622f0 f3963U;

    /* JADX INFO: renamed from: V */
    public C0649o0 f3964V;

    /* JADX INFO: renamed from: W */
    public C10013a f3965W;

    /* JADX INFO: renamed from: a */
    public long f3966a;

    /* JADX INFO: renamed from: a0 */
    public boolean f3967a0;

    /* JADX INFO: renamed from: b */
    public final boolean f3968b;

    /* JADX INFO: renamed from: b0 */
    public final C0547f f3969b0;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final C6163r sharedDrawScope;

    /* JADX INFO: renamed from: c0 */
    public final C0619e0 f3971c0;

    /* JADX INFO: renamed from: d */
    public C10016d f3972d;

    /* JADX INFO: renamed from: d0 */
    public long f3973d0;

    /* JADX INFO: renamed from: e */
    public final FocusOwnerImpl f3974e;

    /* JADX INFO: renamed from: e0 */
    public final int[] f3975e0;

    /* JADX INFO: renamed from: f */
    public final C0668u1 f3976f;

    /* JADX INFO: renamed from: f0 */
    public final float[] f3977f0;

    /* JADX INFO: renamed from: g */
    public final InterfaceC0500b f3978g;

    /* JADX INFO: renamed from: g0 */
    public final float[] f3979g0;

    /* JADX INFO: renamed from: h */
    public final C9166r f3980h;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public long lastMatrixRecalculationAnimationTime;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final LayoutNode root;

    /* JADX INFO: renamed from: i0 */
    public boolean f3983i0;

    /* JADX INFO: renamed from: j */
    public final AndroidComposeView f3984j;

    /* JADX INFO: renamed from: j0 */
    public long f3985j0;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final C6575m semanticsOwner;

    /* JADX INFO: renamed from: k0 */
    public boolean f3987k0;

    /* JADX INFO: renamed from: l */
    public final AndroidComposeViewAccessibilityDelegateCompat f3988l;

    /* JADX INFO: renamed from: l0 */
    public final ParcelableSnapshotMutableState f3989l0;

    /* JADX INFO: renamed from: m0 */
    public InterfaceC2052l<? super C0551b, C9072e> f3990m0;

    /* JADX INFO: renamed from: n0 */
    public final ViewTreeObserverOnGlobalLayoutListenerC0642m f3991n0;

    /* JADX INFO: renamed from: o0 */
    public final ViewTreeObserverOnScrollChangedListenerC0645n f3992o0;

    /* JADX INFO: renamed from: p0 */
    public final ViewTreeObserverOnTouchModeChangeListenerC0648o f3993p0;

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    public final C0705b platformTextInputPluginRegistry;

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    public final C8721v textInputService;

    /* JADX INFO: renamed from: s0 */
    public final C0607b0 f3996s0;

    /* JADX INFO: renamed from: t0 */
    public final ParcelableSnapshotMutableState f3997t0;

    /* JADX INFO: renamed from: u0 */
    public int f3998u0;

    /* JADX INFO: renamed from: v0 */
    public final ParcelableSnapshotMutableState f3999v0;

    /* JADX INFO: renamed from: w0 */
    public final C9000b f4000w0;

    /* JADX INFO: renamed from: x0 */
    public final C0008c f4001x0;

    /* JADX INFO: renamed from: y0, reason: from kotlin metadata */
    public final ModifierLocalManager modifierLocalManager;

    /* JADX INFO: renamed from: z0 */
    public final C0611c0 f4003z0;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeView$a */
    public static final class C0550a {
        /* JADX INFO: renamed from: a */
        public static final boolean m2267a() {
            Class<?> cls = AndroidComposeView.f3936M0;
            try {
                if (AndroidComposeView.f3936M0 == null) {
                    Class<?> cls2 = Class.forName("android.os.SystemProperties");
                    AndroidComposeView.f3936M0 = cls2;
                    AndroidComposeView.f3937N0 = cls2.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
                }
                Method method = AndroidComposeView.f3937N0;
                Boolean bool = null;
                Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
                if (objInvoke instanceof Boolean) {
                    bool = (Boolean) objInvoke;
                }
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeView$b */
    public static final class C0551b {

        /* JADX INFO: renamed from: a */
        public final InterfaceC1051q f4005a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC7706c f4006b;

        public C0551b(InterfaceC1051q interfaceC1051q, InterfaceC7706c interfaceC7706c) {
            this.f4005a = interfaceC1051q;
            this.f4006b = interfaceC7706c;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeView$c */
    public static final class C0552c implements InterfaceC5026m {
        public C0552c(AndroidComposeView androidComposeView) {
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeView$d */
    public static final class RunnableC0553d implements Runnable {
        public RunnableC0553d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            androidComposeView.removeCallbacks(this);
            MotionEvent motionEvent = androidComposeView.f3938A0;
            if (motionEvent != null) {
                boolean z10 = false;
                boolean z11 = motionEvent.getToolType(0) == 3;
                int actionMasked = motionEvent.getActionMasked();
                if (z11) {
                    if (actionMasked != 10 && actionMasked != 1) {
                        z10 = true;
                    }
                } else if (actionMasked != 1) {
                    z10 = true;
                }
                if (z10) {
                    int i10 = 7;
                    if (actionMasked != 7 && actionMasked != 9) {
                        i10 = 2;
                    }
                    AndroidComposeView androidComposeView2 = AndroidComposeView.this;
                    androidComposeView2.m2259H(motionEvent, i10, androidComposeView2.f3939B0, false);
                }
            }
        }
    }

    static {
        new C0550a();
    }

    /* JADX WARN: Type inference failed for: r3v17, types: [androidx.compose.ui.platform.m] */
    /* JADX WARN: Type inference failed for: r3v18, types: [androidx.compose.ui.platform.n] */
    /* JADX WARN: Type inference failed for: r3v19, types: [androidx.compose.ui.platform.o] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public AndroidComposeView(Context context) {
        super(context);
        this.f3966a = C8941c.f46890d;
        this.f3968b = true;
        this.sharedDrawScope = new C6163r();
        this.f3972d = C8573r0.m16746p(context);
        C6574l c6574l = new C6574l(false, new InterfaceC2052l<InterfaceC6577o, C9072e>() { // from class: androidx.compose.ui.platform.AndroidComposeView$semanticsModifier$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(InterfaceC6577o interfaceC6577o) {
                C5207g.m11111f(interfaceC6577o, "$this$$receiver");
                return C9072e.f47360a;
            }
        }, InspectableValueKt.f4184a);
        this.f3974e = new FocusOwnerImpl(new InterfaceC2052l<InterfaceC2041a<? extends C9072e>, C9072e>() { // from class: androidx.compose.ui.platform.AndroidComposeView$focusOwner$1
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(InterfaceC2041a<? extends C9072e> interfaceC2041a) {
                InterfaceC2041a<? extends C9072e> interfaceC2041a2 = interfaceC2041a;
                C5207g.m11111f(interfaceC2041a2, "it");
                this.f4009b.mo2237q(interfaceC2041a2);
                return C9072e.f47360a;
            }
        });
        this.f3976f = new C0668u1();
        InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
        OnKeyEventElement onKeyEventElement = new OnKeyEventElement(new InterfaceC2052l<C1289b, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$keyInputModifier$1
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Boolean mo528n(C1289b c1289b) {
                C8684c c8684c;
                KeyEvent keyEvent = c1289b.f8000a;
                C5207g.m11111f(keyEvent, "it");
                AndroidComposeView androidComposeView = this.f4010b;
                androidComposeView.getClass();
                long jM11146S = C5212l.m11146S(keyEvent);
                if (C1288a.m4791a(jM11146S, C1288a.f7994h)) {
                    c8684c = new C8684c(keyEvent.isShiftPressed() ? 2 : 1);
                } else if (C1288a.m4791a(jM11146S, C1288a.f7992f)) {
                    c8684c = new C8684c(4);
                } else if (C1288a.m4791a(jM11146S, C1288a.f7991e)) {
                    c8684c = new C8684c(3);
                } else if (C1288a.m4791a(jM11146S, C1288a.f7989c)) {
                    c8684c = new C8684c(5);
                } else if (C1288a.m4791a(jM11146S, C1288a.f7990d)) {
                    c8684c = new C8684c(6);
                } else {
                    if (C1288a.m4791a(jM11146S, C1288a.f7993g) ? true : C1288a.m4791a(jM11146S, C1288a.f7995i) ? true : C1288a.m4791a(jM11146S, C1288a.f7997k)) {
                        c8684c = new C8684c(7);
                    } else {
                        c8684c = C1288a.m4791a(jM11146S, C1288a.f7988b) ? true : C1288a.m4791a(jM11146S, C1288a.f7996j) ? new C8684c(8) : null;
                    }
                }
                if (c8684c != null) {
                    if (C5212l.m11147T(keyEvent) == 2) {
                        return Boolean.valueOf(androidComposeView.getFocusOwner().mo1962i(c8684c.f46277a));
                    }
                }
                return Boolean.FALSE;
            }
        });
        aVar.mo1929K(onKeyEventElement);
        this.f3978g = onKeyEventElement;
        AndroidComposeView$rotaryInputModifier$1 androidComposeView$rotaryInputModifier$1 = new InterfaceC2052l<C5461c, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$rotaryInputModifier$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Boolean mo528n(C5461c c5461c) {
                C5207g.m11111f(c5461c, "it");
                return Boolean.FALSE;
            }
        };
        C5207g.m11111f(androidComposeView$rotaryInputModifier$1, "onRotaryScrollEvent");
        OnRotaryScrollEventElement onRotaryScrollEventElement = new OnRotaryScrollEventElement(androidComposeView$rotaryInputModifier$1);
        this.f3980h = new C9166r(0);
        int i10 = 3;
        LayoutNode layoutNode = new LayoutNode(3, false, 0);
        layoutNode.mo2102f(RootMeasurePolicy.f3673b);
        layoutNode.mo2101e(getDensity());
        layoutNode.mo2100d(c6574l.mo1929K(onRotaryScrollEventElement).mo1929K(getFocusOwner().mo1956c()).mo1929K(onKeyEventElement));
        this.root = layoutNode;
        this.f3984j = this;
        this.semanticsOwner = new C6575m(getRoot());
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.f3988l = androidComposeViewAccessibilityDelegateCompat;
        this.autofillTree = new C8166g();
        this.f3947I = new ArrayList();
        this.f3953L = new C5020g();
        this.f3955M = new C5032s(getRoot());
        this.configurationChangeObserver = new InterfaceC2052l<Configuration, C9072e>() { // from class: androidx.compose.ui.platform.AndroidComposeView$configurationChangeObserver$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(Configuration configuration) {
                C5207g.m11111f(configuration, "it");
                return C9072e.f47360a;
            }
        };
        this.f3957O = new C8160a(this, getAutofillTree());
        this.clipboardManager = new C0636k(context);
        this.accessibilityManager = new C0633j(context);
        this.snapshotObserver = new OwnerSnapshotObserver(new InterfaceC2052l<InterfaceC2041a<? extends C9072e>, C9072e>() { // from class: androidx.compose.ui.platform.AndroidComposeView$snapshotObserver$1
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(InterfaceC2041a<? extends C9072e> interfaceC2041a) {
                final InterfaceC2041a<? extends C9072e> interfaceC2041a2 = interfaceC2041a;
                C5207g.m11111f(interfaceC2041a2, "command");
                AndroidComposeView androidComposeView = this.f4015b;
                Handler handler = androidComposeView.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    interfaceC2041a2.mo807E();
                } else {
                    Handler handler2 = androidComposeView.getHandler();
                    if (handler2 != null) {
                        handler2.post(new Runnable() { // from class: androidx.compose.ui.platform.p
                            @Override // java.lang.Runnable
                            public final void run() {
                                InterfaceC2041a interfaceC2041a3 = interfaceC2041a2;
                                C5207g.m11111f(interfaceC2041a3, "$tmp0");
                                interfaceC2041a3.mo807E();
                            }
                        });
                    }
                }
                return C9072e.f47360a;
            }
        });
        this.f3969b0 = new C0547f(getRoot());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        C5207g.m11110e(viewConfiguration, "get(context)");
        this.f3971c0 = new C0619e0(viewConfiguration);
        this.f3973d0 = C8573r0.m16752r(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.f3975e0 = new int[]{0, 0};
        this.f3977f0 = C7499b.m14961r();
        this.f3979g0 = C7499b.m14961r();
        this.lastMatrixRecalculationAnimationTime = -1L;
        this.f3985j0 = C8941c.f46889c;
        this.f3987k0 = true;
        this.f3989l0 = C8573r0.m16684L0(null);
        this.f3991n0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.compose.ui.platform.m
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                Class<?> cls = AndroidComposeView.f3936M0;
                AndroidComposeView androidComposeView = this.f4326a;
                C5207g.m11111f(androidComposeView, "this$0");
                androidComposeView.m2260I();
            }
        };
        this.f3992o0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.compose.ui.platform.n
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                Class<?> cls = AndroidComposeView.f3936M0;
                AndroidComposeView androidComposeView = this.f4328a;
                C5207g.m11111f(androidComposeView, "this$0");
                androidComposeView.m2260I();
            }
        };
        this.f3993p0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: androidx.compose.ui.platform.o
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z10) {
                Class<?> cls = AndroidComposeView.f3936M0;
                AndroidComposeView androidComposeView = this.f4330a;
                C5207g.m11111f(androidComposeView, "this$0");
                int i11 = z10 ? 1 : 2;
                C0008c c0008c = androidComposeView.f4001x0;
                c0008c.getClass();
                c0008c.f6b.setValue(new C0006a(i11));
            }
        };
        this.platformTextInputPluginRegistry = new C0705b(new InterfaceC2056p<InterfaceC8713n<?>, InterfaceC8711l, InterfaceC8712m>() { // from class: androidx.compose.ui.platform.AndroidComposeView$platformTextInputPluginRegistry$1
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final InterfaceC8712m mo1337m0(InterfaceC8713n<?> interfaceC8713n, InterfaceC8711l interfaceC8711l) {
                InterfaceC8713n<?> interfaceC8713n2 = interfaceC8713n;
                InterfaceC8711l interfaceC8711l2 = interfaceC8711l;
                C5207g.m11111f(interfaceC8713n2, "factory");
                C5207g.m11111f(interfaceC8711l2, "platformTextInput");
                return interfaceC8713n2.mo16947a(this.f4011b, interfaceC8711l2);
            }
        });
        this.textInputService = ((C8700a.a) getPlatformTextInputPluginRegistry().m2602a().f4658a).f46285a;
        this.f3996s0 = new C0607b0(context);
        this.f3997t0 = C8573r0.m16682K0(C0698d.m2597a(context), C5334r0.f33610a);
        Configuration configuration = context.getResources().getConfiguration();
        C5207g.m11110e(configuration, "context.resources.configuration");
        int i11 = Build.VERSION.SDK_INT;
        this.f3998u0 = i11 >= 31 ? configuration.fontWeightAdjustment : 0;
        Configuration configuration2 = context.getResources().getConfiguration();
        C5207g.m11110e(configuration2, "context.resources.configuration");
        InterfaceC2052l<? super InterfaceC8715p, ? extends C8721v> interfaceC2052l = AndroidComposeView_androidKt.f4081a;
        int layoutDirection = configuration2.getLayoutDirection();
        LayoutDirection layoutDirection2 = (layoutDirection == 0 || layoutDirection != 1) ? LayoutDirection.Ltr : LayoutDirection.Rtl;
        this.f3999v0 = C8573r0.m16684L0(layoutDirection2);
        this.f4000w0 = new C9000b(this);
        this.f4001x0 = new C0008c(isInTouchMode() ? 1 : 2, new InterfaceC2052l<C0006a, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$_inputModeManager$1
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Boolean mo528n(C0006a c0006a) {
                int i12 = c0006a.f4a;
                boolean zRequestFocusFromTouch = false;
                boolean z10 = i12 == 1;
                AndroidComposeView androidComposeView = this.f4004b;
                if (z10) {
                    zRequestFocusFromTouch = androidComposeView.isInTouchMode();
                } else {
                    if (i12 == 2) {
                        zRequestFocusFromTouch = androidComposeView.isInTouchMode() ? androidComposeView.requestFocusFromTouch() : true;
                    }
                }
                return Boolean.valueOf(zRequestFocusFromTouch);
            }
        });
        this.modifierLocalManager = new ModifierLocalManager(this);
        this.f4003z0 = new C0611c0(this);
        this.f3940C0 = new C0322j(2);
        this.f3941D0 = new C5458f<>(new InterfaceC2041a[16]);
        this.f3942E0 = new RunnableC0553d();
        this.f3943F0 = new RunnableC0190i(i10, this);
        this.f3946H0 = new InterfaceC2041a<C9072e>() { // from class: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventOnLayout$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C9072e mo807E() {
                int actionMasked;
                AndroidComposeView androidComposeView = this.f4012b;
                MotionEvent motionEvent = androidComposeView.f3938A0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    androidComposeView.f3939B0 = SystemClock.uptimeMillis();
                    androidComposeView.post(androidComposeView.f3942E0);
                }
                return C9072e.f47360a;
            }
        };
        this.f3948I0 = i11 >= 29 ? new C0631i0() : new C0628h0();
        setWillNotDraw(false);
        setFocusable(true);
        C0675x.f4379a.m2503a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        C10029b0.m18658n(this, androidComposeViewAccessibilityDelegateCompat);
        getRoot().m2120i(this);
        if (i11 >= 29) {
            C0669v.f4355a.m2494a(this);
        }
        this.f3954L0 = new C0552c(this);
    }

    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    /* JADX INFO: renamed from: s */
    public static void m2247s(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).mo2233l();
            } else if (childAt instanceof ViewGroup) {
                m2247s((ViewGroup) childAt);
            }
        }
    }

    private void setFontFamilyResolver(AbstractC0696b.a aVar) {
        this.f3997t0.setValue(aVar);
    }

    private void setLayoutDirection(LayoutDirection layoutDirection) {
        this.f3999v0.setValue(layoutDirection);
    }

    private final void setViewTreeOwners(C0551b c0551b) {
        this.f3989l0.setValue(c0551b);
    }

    /* JADX INFO: renamed from: t */
    public static Pair m2248t(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            return new Pair(0, Integer.valueOf(size));
        }
        if (mode == 0) {
            return new Pair(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return new Pair(Integer.valueOf(size), Integer.valueOf(size));
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: u */
    public static View m2249u(View view, int i10) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT >= 29) {
            return null;
        }
        Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", new Class[0]);
        declaredMethod.setAccessible(true);
        if (C5207g.m11106a(declaredMethod.invoke(view, new Object[0]), Integer.valueOf(i10))) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            C5207g.m11110e(childAt, "currentView.getChildAt(i)");
            View viewM2249u = m2249u(childAt, i10);
            if (viewM2249u != null) {
                return viewM2249u;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public static void m2250w(LayoutNode layoutNode) {
        layoutNode.m2133w();
        C5458f<LayoutNode> c5458fM2130t = layoutNode.m2130t();
        int i10 = c5458fM2130t.f34019c;
        if (i10 > 0) {
            LayoutNode[] layoutNodeArr = c5458fM2130t.f34017a;
            int i11 = 0;
            do {
                m2250w(layoutNodeArr[i11]);
                i11++;
            } while (i11 < i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0064 A[PHI: r2
      0x0064: PHI (r2v1 boolean) = (r2v0 boolean), (r2v0 boolean), (r2v0 boolean), (r2v3 boolean) binds: [B:8:0x001a, B:15:0x0031, B:22:0x0046, B:31:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: y */
    public static boolean m2251y(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        boolean z10 = true;
        if ((Float.isInfinite(x10) || Float.isNaN(x10)) ? false : true) {
            float y10 = motionEvent.getY();
            if ((Float.isInfinite(y10) || Float.isNaN(y10)) ? false : true) {
                float rawX = motionEvent.getRawX();
                if ((Float.isInfinite(rawX) || Float.isNaN(rawX)) ? false : true) {
                    float rawY = motionEvent.getRawY();
                    if ((Float.isInfinite(rawY) || Float.isNaN(rawY)) ? false : true) {
                        z10 = false;
                    }
                }
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m2252A(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        if (motionEvent.getPointerCount() != 1 || (motionEvent2 = this.f3938A0) == null) {
            return true;
        }
        if (motionEvent.getRawX() == motionEvent2.getRawX()) {
            return !((motionEvent.getRawY() > motionEvent2.getRawY() ? 1 : (motionEvent.getRawY() == motionEvent2.getRawY() ? 0 : -1)) == 0);
        }
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: B */
    public final void m2253B(boolean z10) {
        InterfaceC2041a<C9072e> interfaceC2041a;
        C0547f c0547f = this.f3969b0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        if (z10) {
            try {
                interfaceC2041a = this.f3946H0;
            } finally {
                Trace.endSection();
            }
        } else {
            interfaceC2041a = null;
        }
        if (c0547f.m2216f(interfaceC2041a)) {
            requestLayout();
        }
        c0547f.m2212a(false);
        C9072e c9072e = C9072e.f47360a;
    }

    /* JADX INFO: renamed from: C */
    public final void m2254C(InterfaceC6140d0 interfaceC6140d0, boolean z10) {
        C5207g.m11111f(interfaceC6140d0, "layer");
        ArrayList arrayList = this.f3947I;
        if (z10) {
            if (!this.f3951K) {
                arrayList.add(interfaceC6140d0);
                return;
            }
            ArrayList arrayList2 = this.f3949J;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                this.f3949J = arrayList2;
            }
            arrayList2.add(interfaceC6140d0);
        } else if (!this.f3951K) {
            arrayList.remove(interfaceC6140d0);
            ArrayList arrayList3 = this.f3949J;
            if (arrayList3 != null) {
                arrayList3.remove(interfaceC6140d0);
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m2255D() {
        if (this.f3983i0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
            this.lastMatrixRecalculationAnimationTime = jCurrentAnimationTimeMillis;
            InterfaceC0625g0 interfaceC0625g0 = this.f3948I0;
            float[] fArr = this.f3977f0;
            interfaceC0625g0.mo2355a(this, fArr);
            C0062b.m390r1(fArr, this.f3979g0);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.f3975e0;
            view.getLocationOnScreen(iArr);
            float f3 = iArr[0];
            float f10 = iArr[1];
            view.getLocationInWindow(iArr);
            this.f3985j0 = C7499b.m14932c(f3 - iArr[0], f10 - iArr[1]);
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m2256E(InterfaceC6140d0 interfaceC6140d0) {
        C5207g.m11111f(interfaceC6140d0, "layer");
        if (this.f3964V != null) {
            InterfaceC2056p<View, Matrix, C9072e> interfaceC2056p = ViewLayer.f4213J;
        }
        C0322j c0322j = this.f3940C0;
        c0322j.m1215c();
        ((C5458f) c0322j.f1238b).m11687b(new WeakReference(interfaceC6140d0, (ReferenceQueue) c0322j.f1239c));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004b  */
    /* JADX INFO: renamed from: F */
    public final void m2257F(LayoutNode layoutNode) {
        boolean z10;
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (layoutNode != null) {
            while (layoutNode != null && layoutNode.f3753P == LayoutNode.UsageByParent.InMeasureBlock) {
                boolean z11 = true;
                if (!this.f3967a0) {
                    LayoutNode layoutNodeM2128r = layoutNode.m2128r();
                    if (layoutNodeM2128r != null) {
                        long j10 = layoutNodeM2128r.f3758U.f35996b.f3689d;
                        if (C10013a.m18601f(j10) && C10013a.m18600e(j10)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                    z11 = z10;
                }
                if (!z11) {
                    break;
                } else {
                    layoutNode = layoutNode.m2128r();
                }
            }
            if (layoutNode == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: G */
    public final int m2258G(MotionEvent motionEvent) {
        C5031r c5031rPrevious;
        if (this.f3950J0) {
            this.f3950J0 = false;
            int metaState = motionEvent.getMetaState();
            this.f3976f.getClass();
            C0668u1.f4353b.setValue(new C5036w(metaState));
        }
        C5020g c5020g = this.f3953L;
        C5030q c5030qM10703a = c5020g.m10703a(motionEvent, this);
        C5032s c5032s = this.f3955M;
        if (c5030qM10703a == null) {
            if (c5032s.f32867e) {
                return 0;
            }
            c5032s.f32865c.f32847a.clear();
            C5023j c5023j = (C5023j) c5032s.f32864b.f33573b;
            c5023j.mo10707c();
            c5023j.f32831a.m11691h();
            return 0;
        }
        List<C5031r> list = c5030qM10703a.f32851a;
        ListIterator<C5031r> listIterator = list.listIterator(list.size());
        do {
            if (!listIterator.hasPrevious()) {
                c5031rPrevious = null;
                break;
            }
            c5031rPrevious = listIterator.previous();
        } while (!c5031rPrevious.f32857e);
        C5031r c5031r = c5031rPrevious;
        if (c5031r != null) {
            this.f3966a = c5031r.f32856d;
        }
        int iM10716a = c5032s.m10716a(c5030qM10703a, this, m2266z(motionEvent));
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 5) {
            if (!((iM10716a & 1) != 0)) {
                int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                c5020g.f32818c.delete(pointerId);
                c5020g.f32817b.delete(pointerId);
            }
        }
        return iM10716a;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX INFO: renamed from: H */
    public final void m2259H(MotionEvent motionEvent, int i10, long j10, boolean z10) {
        int actionIndex;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 6) {
                actionIndex = -1;
            } else {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i10 == 9 || i10 == 10) {
            actionIndex = -1;
        } else {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i11 = 0; i11 < pointerCount; i11++) {
            pointerPropertiesArr[i11] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i12 = 0; i12 < pointerCount; i12++) {
            pointerCoordsArr[i12] = new MotionEvent.PointerCoords();
        }
        int i13 = 0;
        while (i13 < pointerCount) {
            int i14 = ((actionIndex < 0 || i13 < actionIndex) ? 0 : 1) + i13;
            motionEvent.getPointerProperties(i14, pointerPropertiesArr[i13]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i13];
            motionEvent.getPointerCoords(i14, pointerCoords);
            long jMo2262k = mo2262k(C7499b.m14932c(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = C8941c.m17164c(jMo2262k);
            pointerCoords.y = C8941c.m17165d(jMo2262k);
            i13++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j10 : motionEvent.getDownTime(), j10, i10, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z10 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        C5207g.m11110e(motionEventObtain, "event");
        C5030q c5030qM10703a = this.f3953L.m10703a(motionEventObtain, this);
        C5207g.m11108c(c5030qM10703a);
        this.f3955M.m10716a(c5030qM10703a, this, true);
        motionEventObtain.recycle();
    }

    /* JADX INFO: renamed from: I */
    public final void m2260I() {
        int[] iArr = this.f3975e0;
        getLocationOnScreen(iArr);
        long j10 = this.f3973d0;
        int i10 = (int) (j10 >> 32);
        int iM18625a = C10020h.m18625a(j10);
        boolean z10 = false;
        int i11 = iArr[0];
        if (i10 != i11 || iM18625a != iArr[1]) {
            this.f3973d0 = C8573r0.m16752r(i11, iArr[1]);
            if (i10 != Integer.MAX_VALUE && iM18625a != Integer.MAX_VALUE) {
                getRoot().f3759V.f3791i.m2145J0();
                z10 = true;
            }
        }
        this.f3969b0.m2212a(z10);
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0549h
    /* JADX INFO: renamed from: a */
    public final void mo2226a(LayoutNode layoutNode, boolean z10, boolean z11) {
        C5207g.m11111f(layoutNode, "layoutNode");
        C0547f c0547f = this.f3969b0;
        if (z10) {
            if (c0547f.m2222l(layoutNode, z11)) {
                m2257F(layoutNode);
            }
        } else if (c0547f.m2224n(layoutNode, z11)) {
            m2257F(layoutNode);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.View
    public final void autofill(SparseArray<AutofillValue> sparseArray) {
        C5207g.m11111f(sparseArray, "values");
        C8160a c8160a = this.f3957O;
        if (c8160a != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int iKeyAt = sparseArray.keyAt(i10);
                AutofillValue autofillValue = sparseArray.get(iKeyAt);
                C8163d c8163d = C8163d.f44288a;
                C5207g.m11110e(autofillValue, "value");
                if (c8163d.m16193d(autofillValue)) {
                    String string = c8163d.m16198i(autofillValue).toString();
                    C8166g c8166g = c8160a.f44285b;
                    c8166g.getClass();
                    C5207g.m11111f(string, "value");
                } else {
                    if (c8163d.m16191b(autofillValue)) {
                        throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (c8163d.m16192c(autofillValue)) {
                        throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (c8163d.m16194e(autofillValue)) {
                        throw new NotImplementedError("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    @Override // androidx.view.InterfaceC1029e
    /* JADX INFO: renamed from: b */
    public final void mo2261b(InterfaceC1051q interfaceC1051q) {
        setShowLayoutBounds(C0550a.m2267a());
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        return this.f3988l.m2290l(i10, this.f3966a, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i10) {
        return this.f3988l.m2290l(i10, this.f3966a, true);
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0549h
    /* JADX INFO: renamed from: d */
    public final void mo2227d(LayoutNode layoutNode, boolean z10, boolean z11) {
        C5207g.m11111f(layoutNode, "layoutNode");
        C0547f c0547f = this.f3969b0;
        if (z10) {
            if (c0547f.m2221k(layoutNode, z11)) {
                m2257F(null);
            }
        } else if (c0547f.m2223m(layoutNode, z11)) {
            m2257F(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C5207g.m11111f(canvas, "canvas");
        if (!isAttachedToWindow()) {
            m2250w(getRoot());
        }
        m2253B(true);
        this.f3951K = true;
        C9166r c9166r = this.f3980h;
        C9139d c9139d = (C9139d) c9166r.f47694a;
        Canvas canvas2 = c9139d.f47644a;
        c9139d.getClass();
        c9139d.f47644a = canvas;
        getRoot().m2125n((C9139d) c9166r.f47694a);
        ((C9139d) c9166r.f47694a).m17433t(canvas2);
        ArrayList arrayList = this.f3947I;
        if (true ^ arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((InterfaceC6140d0) arrayList.get(i10)).mo2319i();
            }
        }
        if (ViewLayer.f4218O) {
            int iSave = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
        }
        arrayList.clear();
        this.f3951K = false;
        ArrayList arrayList2 = this.f3949J;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        C5207g.m11111f(motionEvent, "event");
        if (motionEvent.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (!motionEvent.isFromSource(4194304)) {
            if (!m2251y(motionEvent) && isAttachedToWindow()) {
                return (m2264v(motionEvent) & 1) != 0;
            }
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f3 = -motionEvent.getAxisValue(26);
        getContext();
        float fM18794b = C10033d0.m18794b(viewConfiguration) * f3;
        getContext();
        return getFocusOwner().mo1964k(new C5461c(fM18794b, C10033d0.m18793a(viewConfiguration) * f3, motionEvent.getEventTime()));
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00fe  */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x010a, code lost:
    
        if (r3 == Integer.MIN_VALUE) goto L32;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int iM2298z;
        boolean zDispatchGenericMotionEvent;
        LayoutNode layoutNodeM12652e;
        C5207g.m11111f(motionEvent, "event");
        boolean z10 = this.f3944G0;
        RunnableC0190i runnableC0190i = this.f3943F0;
        if (z10) {
            removeCallbacks(runnableC0190i);
            runnableC0190i.run();
        }
        boolean z11 = false;
        if (m2251y(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (!motionEvent.isFromSource(4098) || motionEvent.getToolType(0) != 1) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && m2266z(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3) {
                        MotionEvent motionEvent2 = this.f3938A0;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.f3938A0 = MotionEvent.obtainNoHistory(motionEvent);
                        this.f3944G0 = true;
                        post(runnableC0190i);
                        return false;
                    }
                    if (motionEvent.getButtonState() != 0) {
                        return false;
                    }
                }
            } else if (!m2252A(motionEvent)) {
                return false;
            }
            return (m2264v(motionEvent) & 1) != 0;
        }
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.f3988l;
        androidComposeViewAccessibilityDelegateCompat.getClass();
        AccessibilityManager accessibilityManager = androidComposeViewAccessibilityDelegateCompat.f4025f;
        if (!(accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled())) {
            return false;
        }
        int action = motionEvent.getAction();
        AndroidComposeView androidComposeView = androidComposeViewAccessibilityDelegateCompat.f4023d;
        if (action != 7 && action != 9) {
            if (action != 10) {
                return false;
            }
            if (androidComposeViewAccessibilityDelegateCompat.f4024e != Integer.MIN_VALUE) {
                androidComposeViewAccessibilityDelegateCompat.m2286M(Integer.MIN_VALUE);
                return true;
            }
            zDispatchGenericMotionEvent = androidComposeView.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
            return zDispatchGenericMotionEvent;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        androidComposeView.m2253B(true);
        C6151j c6151j = new C6151j();
        LayoutNode root = androidComposeView.getRoot();
        long jM14932c = C7499b.m14932c(x10, y10);
        LayoutNode.C0530b c0530b = LayoutNode.f3741d0;
        root.getClass();
        C6166u c6166u = root.f3758U;
        c6166u.f35997c.m2182i1(NodeCoordinator.f3830Z, c6166u.f35997c.m2176c1(jM14932c), c6151j, true, true);
        InterfaceC6154k0 interfaceC6154k0 = (InterfaceC6154k0) C6752c.m13433a0(c6151j);
        InterfaceC6154k0 interfaceC6154k0M16750q0 = (interfaceC6154k0 == null || (layoutNodeM12652e = C6139d.m12652e(interfaceC6154k0)) == null) ? null : C8573r0.m16750q0(layoutNodeM12652e);
        if (interfaceC6154k0M16750q0 == null) {
            iM2298z = Integer.MIN_VALUE;
        } else {
            SemanticsNode semanticsNode = new SemanticsNode(interfaceC6154k0M16750q0, false, C6139d.m12652e(interfaceC6154k0M16750q0));
            NodeCoordinator nodeCoordinatorM2531b = semanticsNode.m2531b();
            if (!(nodeCoordinatorM2531b != null ? nodeCoordinatorM2531b.m2185l1() : false)) {
                if (!semanticsNode.f4401f.m13163f(SemanticsProperties.f4420m)) {
                    z11 = true;
                }
            }
            if (z11) {
                LayoutNode layoutNodeM12652e2 = C6139d.m12652e(interfaceC6154k0M16750q0);
                if (androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(layoutNodeM12652e2) == null) {
                    iM2298z = androidComposeViewAccessibilityDelegateCompat.m2298z(layoutNodeM12652e2.f3766b);
                } else {
                    iM2298z = Integer.MIN_VALUE;
                }
            } else {
                iM2298z = Integer.MIN_VALUE;
            }
        }
        zDispatchGenericMotionEvent = androidComposeView.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
        androidComposeViewAccessibilityDelegateCompat.m2286M(iM2298z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C5207g.m11111f(keyEvent, "event");
        if (!isFocused()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int metaState = keyEvent.getMetaState();
        this.f3976f.getClass();
        C0668u1.f4353b.setValue(new C5036w(metaState));
        return getFocusOwner().mo1966m(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C5207g.m11111f(motionEvent, "motionEvent");
        if (this.f3944G0) {
            RunnableC0190i runnableC0190i = this.f3943F0;
            removeCallbacks(runnableC0190i);
            MotionEvent motionEvent2 = this.f3938A0;
            C5207g.m11108c(motionEvent2);
            if (motionEvent.getActionMasked() == 0) {
                if (!((motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true)) {
                    this.f3944G0 = false;
                }
            }
            runnableC0190i.run();
        }
        if (!m2251y(motionEvent) && isAttachedToWindow()) {
            if (motionEvent.getActionMasked() == 2 && !m2252A(motionEvent)) {
                return false;
            }
            int iM2264v = m2264v(motionEvent);
            if ((iM2264v & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            return (iM2264v & 1) != 0;
        }
        return false;
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0549h
    /* JADX INFO: renamed from: f */
    public final long mo2228f(long j10) {
        m2255D();
        return C7499b.m14937e0(j10, this.f3977f0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        r10 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View findViewByAccessibilityIdTraversal(int accessibilityId) throws IllegalAccessException, InvocationTargetException {
        View viewM2249u;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(accessibilityId));
                viewM2249u = objInvoke instanceof View ? (View) objInvoke : null;
            } else {
                viewM2249u = m2249u(this, accessibilityId);
            }
        } catch (NoSuchMethodException unused) {
        }
        return viewM2249u;
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0549h
    /* JADX INFO: renamed from: g */
    public final void mo2229g(LayoutNode layoutNode) {
        C0547f c0547f = this.f3969b0;
        c0547f.getClass();
        C6138c0 c6138c0 = c0547f.f3914d;
        c6138c0.getClass();
        c6138c0.f35963a.m11687b(layoutNode);
        layoutNode.f3765a0 = true;
        m2257F(null);
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0549h
    public C0633j getAccessibilityManager() {
        return this.accessibilityManager;
    }

    public final C0622f0 getAndroidViewsHandler$ui_release() {
        if (this.f3963U == null) {
            Context context = getContext();
            C5207g.m11110e(context, "context");
            C0622f0 c0622f0 = new C0622f0(context);
            this.f3963U = c0622f0;
            addView(c0622f0);
        }
        C0622f0 c0622f1 = this.f3963U;
        C5207g.m11108c(c0622f1);
        return c0622f1;
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0549h
    public InterfaceC8161b getAutofill() {
        return this.f3957O;
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0549h
    public C8166g getAutofillTree() {
        return this.autofillTree;
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0549h
    public C0636k getClipboardManager() {
        return this.clipboardManager;
    }

    public final InterfaceC2052l<Configuration, C9072e> getConfigurationChangeObserver() {
        return this.configurationChangeObserver;
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0549h
    public InterfaceC10015c getDensity() {
        return this.f3972d;
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0549h
    public InterfaceC8690i getFocusOwner() {
        return this.f3974e;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        C9072e c9072e;
        C5207g.m11111f(rect, "rect");
        C8942d c8942dMo1961h = getFocusOwner().mo1961h();
        if (c8942dMo1961h != null) {
            rect.left = C8573r0.m16710Y0(c8942dMo1961h.f46894a);
            rect.top = C8573r0.m16710Y0(c8942dMo1961h.f46895b);
            rect.right = C8573r0.m16710Y0(c8942dMo1961h.f46896c);
            rect.bottom = C8573r0.m16710Y0(c8942dMo1961h.f46897d);
            c9072e = C9072e.f47360a;
        } else {
            c9072e = null;
        }
        if (c9072e == null) {
            super.getFocusedRect(rect);
        }
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0549h
    public AbstractC0696b.a getFontFamilyResolver() {
        return (AbstractC0696b.a) this.f3997t0.getValue();
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0549h
    public InterfaceC8468e.a getFontLoader() {
        return this.f3996s0;
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0549h
    public InterfaceC10426a getHapticFeedBack() {
        return this.f4000w0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return !this.f3969b0.f3912b.f3893a.isEmpty();
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0549h
    public InterfaceC0007b getInputModeManager() {
        return this.f4001x0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View, android.view.ViewParent, androidx.compose.p017ui.node.InterfaceC0549h
    public LayoutDirection getLayoutDirection() {
        return (LayoutDirection) this.f3999v0.getValue();
    }

    public long getMeasureIteration() {
        C0547f c0547f = this.f3969b0;
        if (c0547f.f3913c) {
            return c0547f.f3916f;
        }
        throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass".toString());
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0549h
    public ModifierLocalManager getModifierLocalManager() {
        return this.modifierLocalManager;
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0549h
    public C0705b getPlatformTextInputPluginRegistry() {
        return this.platformTextInputPluginRegistry;
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0549h
    public InterfaceC5026m getPointerIconService() {
        return this.f3954L0;
    }

    public LayoutNode getRoot() {
        return this.root;
    }

    public InterfaceC6152j0 getRootForTest() {
        return this.f3984j;
    }

    public C6575m getSemanticsOwner() {
        return this.semanticsOwner;
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0549h
    public C6163r getSharedDrawScope() {
        return this.sharedDrawScope;
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0549h
    public boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0549h
    public OwnerSnapshotObserver getSnapshotObserver() {
        return this.snapshotObserver;
    }

    public InterfaceC8720u getTextInputForTests() {
        InterfaceC8720u interfaceC8720uMo16948a = null;
        C0705b.c<?> cVar = getPlatformTextInputPluginRegistry().f4657b.get(null);
        InterfaceC8712m interfaceC8712m = cVar != null ? cVar.f4661a : null;
        if (interfaceC8712m != null) {
            interfaceC8720uMo16948a = interfaceC8712m.mo16948a();
        }
        return interfaceC8720uMo16948a;
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0549h
    public C8721v getTextInputService() {
        return this.textInputService;
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0549h
    public InterfaceC0626g1 getTextToolbar() {
        return this.f4003z0;
    }

    public View getView() {
        return this;
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0549h
    public InterfaceC0647n1 getViewConfiguration() {
        return this.f3971c0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C0551b getViewTreeOwners() {
        return (C0551b) this.f3989l0.getValue();
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0549h
    public InterfaceC0665t1 getWindowInfo() {
        return this.f3976f;
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0549h
    /* JADX INFO: renamed from: h */
    public final void mo2230h(LayoutNode layoutNode) {
        C5207g.m11111f(layoutNode, "layoutNode");
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.f3988l;
        androidComposeViewAccessibilityDelegateCompat.getClass();
        androidComposeViewAccessibilityDelegateCompat.f4038s = true;
        if (androidComposeViewAccessibilityDelegateCompat.m2296t()) {
            androidComposeViewAccessibilityDelegateCompat.m2297u(layoutNode);
        }
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0549h
    /* JADX INFO: renamed from: i */
    public final void mo2231i(LayoutNode layoutNode) {
        C5207g.m11111f(layoutNode, "layoutNode");
        this.f3969b0.m2215d(layoutNode);
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0549h
    /* JADX INFO: renamed from: j */
    public final void mo2232j(LayoutNode layoutNode) {
        C5207g.m11111f(layoutNode, "node");
        C0547f c0547f = this.f3969b0;
        c0547f.getClass();
        c0547f.f3912b.m2207b(layoutNode);
        this.f3958P = true;
    }

    @Override // p060d1.InterfaceC5037x
    /* JADX INFO: renamed from: k */
    public final long mo2262k(long j10) {
        m2255D();
        long jM14937e0 = C7499b.m14937e0(j10, this.f3977f0);
        return C7499b.m14932c(C8941c.m17164c(this.f3985j0) + C8941c.m17164c(jM14937e0), C8941c.m17165d(this.f3985j0) + C8941c.m17165d(jM14937e0));
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0549h
    /* JADX INFO: renamed from: l */
    public final void mo2233l() {
        if (this.f3958P) {
            getSnapshotObserver().m2204a();
            this.f3958P = false;
        }
        C0622f0 c0622f0 = this.f3963U;
        if (c0622f0 != null) {
            m2247s(c0622f0);
        }
        while (true) {
            C5458f<InterfaceC2041a<C9072e>> c5458f = this.f3941D0;
            if (!c5458f.m11695l()) {
                return;
            }
            int i10 = c5458f.f34019c;
            for (int i11 = 0; i11 < i10; i11++) {
                InterfaceC2041a<C9072e>[] interfaceC2041aArr = c5458f.f34017a;
                InterfaceC2041a<C9072e> interfaceC2041a = interfaceC2041aArr[i11];
                interfaceC2041aArr[i11] = null;
                if (interfaceC2041a != null) {
                    interfaceC2041a.mo807E();
                }
            }
            c5458f.m11698o(0, i10);
        }
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0549h
    /* JADX INFO: renamed from: m */
    public final void mo2234m() {
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.f3988l;
        androidComposeViewAccessibilityDelegateCompat.f4038s = true;
        if (androidComposeViewAccessibilityDelegateCompat.m2296t() && !androidComposeViewAccessibilityDelegateCompat.f4019C) {
            androidComposeViewAccessibilityDelegateCompat.f4019C = true;
            androidComposeViewAccessibilityDelegateCompat.f4029j.post(androidComposeViewAccessibilityDelegateCompat.f4020D);
        }
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0549h
    /* JADX INFO: renamed from: n */
    public final InterfaceC6140d0 mo2235n(InterfaceC2041a interfaceC2041a, InterfaceC2052l interfaceC2052l) {
        Object obj;
        C0649o0 c0650o1;
        C5207g.m11111f(interfaceC2052l, "drawBlock");
        C5207g.m11111f(interfaceC2041a, "invalidateParentLayer");
        C0322j c0322j = this.f3940C0;
        c0322j.m1215c();
        do {
            C5458f c5458f = (C5458f) c0322j.f1238b;
            if (!c5458f.m11695l()) {
                obj = null;
                break;
            }
            obj = ((Reference) c5458f.m11697n(c5458f.f34019c - 1)).get();
        } while (obj == null);
        InterfaceC6140d0 interfaceC6140d0 = (InterfaceC6140d0) obj;
        if (interfaceC6140d0 != null) {
            interfaceC6140d0.mo2311a(interfaceC2041a, interfaceC2052l);
            return interfaceC6140d0;
        }
        if (isHardwareAccelerated() && this.f3987k0) {
            try {
                return new RenderNodeLayer(this, interfaceC2052l, interfaceC2041a);
            } catch (Throwable unused) {
                this.f3987k0 = false;
            }
        }
        if (this.f3964V == null) {
            if (!ViewLayer.f4217N) {
                ViewLayer.C0594b.m2324a(new View(getContext()));
            }
            if (ViewLayer.f4218O) {
                Context context = getContext();
                C5207g.m11110e(context, "context");
                c0650o1 = new C0649o0(context);
            } else {
                Context context2 = getContext();
                C5207g.m11110e(context2, "context");
                c0650o1 = new C0650o1(context2);
            }
            this.f3964V = c0650o1;
            addView(c0650o1);
        }
        C0649o0 c0649o0 = this.f3964V;
        C5207g.m11108c(c0649o0);
        return new ViewLayer(this, c0649o0, interfaceC2052l, interfaceC2041a);
    }

    @Override // p060d1.InterfaceC5037x
    /* JADX INFO: renamed from: o */
    public final long mo2263o(long j10) {
        m2255D();
        float fM17164c = C8941c.m17164c(j10) - C8941c.m17164c(this.f3985j0);
        float fM17165d = C8941c.m17165d(j10) - C8941c.m17165d(this.f3985j0);
        return C7499b.m14937e0(C7499b.m14932c(fM17164c, fM17165d), this.f3979g0);
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        InterfaceC1051q interfaceC1051q;
        C1052r c1052rMo786G;
        InterfaceC1051q interfaceC1051q2;
        super.onAttachedToWindow();
        m2265x(getRoot());
        m2250w(getRoot());
        SnapshotStateObserver snapshotStateObserver = getSnapshotObserver().f3879a;
        InterfaceC2056p<Set<? extends Object>, AbstractC0497b, C9072e> interfaceC2056p = snapshotStateObserver.f3286d;
        C5207g.m11111f(interfaceC2056p, "observer");
        SnapshotKt.m1887f(SnapshotKt.f3260a);
        synchronized (SnapshotKt.f3262c) {
            try {
                SnapshotKt.f3266g.add(interfaceC2056p);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        snapshotStateObserver.f3289g = new C0496a(interfaceC2056p);
        C8160a c8160a = this.f3957O;
        if (c8160a != null) {
            C8164e.f44289a.m16199a(c8160a);
        }
        InterfaceC1051q interfaceC1051qM3911a = ViewTreeLifecycleOwner.m3911a(this);
        InterfaceC7706c interfaceC7706cM4582a = ViewTreeSavedStateRegistryOwner.m4582a(this);
        C0551b viewTreeOwners = getViewTreeOwners();
        int i10 = 1;
        if (viewTreeOwners == null || !(interfaceC1051qM3911a == null || interfaceC7706cM4582a == null || (interfaceC1051qM3911a == (interfaceC1051q2 = viewTreeOwners.f4005a) && interfaceC7706cM4582a == interfaceC1051q2))) {
            if (interfaceC1051qM3911a == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (interfaceC7706cM4582a == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (interfaceC1051q = viewTreeOwners.f4005a) != null && (c1052rMo786G = interfaceC1051q.mo786G()) != null) {
                c1052rMo786G.mo3885c(this);
            }
            interfaceC1051qM3911a.mo786G().mo3883a(this);
            C0551b c0551b = new C0551b(interfaceC1051qM3911a, interfaceC7706cM4582a);
            setViewTreeOwners(c0551b);
            InterfaceC2052l<? super C0551b, C9072e> interfaceC2052l = this.f3990m0;
            if (interfaceC2052l != null) {
                interfaceC2052l.mo528n(c0551b);
            }
            this.f3990m0 = null;
        }
        if (!isInTouchMode()) {
            i10 = 2;
        }
        C0008c c0008c = this.f4001x0;
        c0008c.getClass();
        c0008c.f6b.setValue(new C0006a(i10));
        C0551b viewTreeOwners2 = getViewTreeOwners();
        C5207g.m11108c(viewTreeOwners2);
        viewTreeOwners2.f4005a.mo786G().mo3883a(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f3991n0);
        getViewTreeObserver().addOnScrollChangedListener(this.f3992o0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f3993p0);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        Object obj = null;
        C0705b.c<?> cVar = getPlatformTextInputPluginRegistry().f4657b.get(null);
        if (cVar != null) {
            obj = cVar.f4661a;
        }
        return obj != null;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        C5207g.m11111f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        C5207g.m11110e(context, "context");
        this.f3972d = C8573r0.m16746p(context);
        int i10 = Build.VERSION.SDK_INT;
        if ((i10 >= 31 ? configuration.fontWeightAdjustment : 0) != this.f3998u0) {
            this.f3998u0 = i10 >= 31 ? configuration.fontWeightAdjustment : 0;
            Context context2 = getContext();
            C5207g.m11110e(context2, "context");
            setFontFamilyResolver(C0698d.m2597a(context2));
        }
        this.configurationChangeObserver.mo528n(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        C5207g.m11111f(editorInfo, "outAttrs");
        C0705b.c<?> cVar = getPlatformTextInputPluginRegistry().f4657b.get(null);
        InterfaceC8712m interfaceC8712m = cVar != null ? cVar.f4661a : null;
        if (interfaceC8712m != null) {
            return interfaceC8712m.mo16949b(editorInfo);
        }
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        InterfaceC1051q interfaceC1051q;
        C1052r c1052rMo786G;
        super.onDetachedFromWindow();
        SnapshotStateObserver snapshotStateObserver = getSnapshotObserver().f3879a;
        C0496a c0496a = snapshotStateObserver.f3289g;
        if (c0496a != null) {
            c0496a.mo1914a();
        }
        synchronized (snapshotStateObserver.f3288f) {
            try {
                C5458f<SnapshotStateObserver.ObservedScopeMap> c5458f = snapshotStateObserver.f3288f;
                int i10 = c5458f.f34019c;
                if (i10 > 0) {
                    SnapshotStateObserver.ObservedScopeMap[] observedScopeMapArr = c5458f.f34017a;
                    int i11 = 0;
                    do {
                        SnapshotStateObserver.ObservedScopeMap observedScopeMap = observedScopeMapArr[i11];
                        observedScopeMap.f3296e.m11680b();
                        C5454b c5454b = observedScopeMap.f3297f;
                        c5454b.f34005a = 0;
                        C9322j.m17679g0(c5454b.f34006b, null);
                        C9322j.m17679g0((Object[]) c5454b.f34007c, null);
                        observedScopeMap.f3302k.m11680b();
                        observedScopeMap.f3303l.clear();
                        i11++;
                    } while (i11 < i10);
                }
                C9072e c9072e = C9072e.f47360a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C0551b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (interfaceC1051q = viewTreeOwners.f4005a) != null && (c1052rMo786G = interfaceC1051q.mo786G()) != null) {
            c1052rMo786G.mo3885c(this);
        }
        C8160a c8160a = this.f3957O;
        if (c8160a != null) {
            C8164e.f44289a.m16200b(c8160a);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f3991n0);
        getViewTreeObserver().removeOnScrollChangedListener(this.f3992o0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f3993p0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C5207g.m11111f(canvas, "canvas");
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        Log.d("Compose Focus", "Owner FocusChanged(" + z10 + ')');
        if (z10) {
            getFocusOwner().mo1957d();
        } else {
            getFocusOwner().mo1963j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f3969b0.m2216f(this.f3946H0);
        this.f3965W = null;
        m2260I();
        if (this.f3963U != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        C0547f c0547f = this.f3969b0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                m2265x(getRoot());
            }
            Pair pairM2248t = m2248t(i10);
            int iIntValue = ((Number) pairM2248t.f38012a).intValue();
            int iIntValue2 = ((Number) pairM2248t.f38013b).intValue();
            Pair pairM2248t2 = m2248t(i11);
            long jM18611a = C10014b.m18611a(iIntValue, iIntValue2, ((Number) pairM2248t2.f38012a).intValue(), ((Number) pairM2248t2.f38013b).intValue());
            C10013a c10013a = this.f3965W;
            if (c10013a == null) {
                this.f3965W = new C10013a(jM18611a);
                this.f3967a0 = false;
            } else if (!C10013a.m18597b(c10013a.f50963a, jM18611a)) {
                this.f3967a0 = true;
            }
            c0547f.m2225o(jM18611a);
            c0547f.m2217g();
            setMeasuredDimension(getRoot().f3759V.f3791i.f3686a, getRoot().f3759V.f3791i.f3687b);
            if (this.f3963U != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().f3759V.f3791i.f3686a, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().f3759V.f3791i.f3687b, 1073741824));
            }
            C9072e c9072e = C9072e.f47360a;
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i10) {
        C8160a c8160a;
        if (viewStructure == null || (c8160a = this.f3957O) == null) {
            return;
        }
        C8162c c8162c = C8162c.f44287a;
        C8166g c8166g = c8160a.f44285b;
        int iM16186a = c8162c.m16186a(viewStructure, c8166g.f44290a.size());
        for (Map.Entry entry : c8166g.f44290a.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            C8165f c8165f = (C8165f) entry.getValue();
            ViewStructure viewStructureM16187b = c8162c.m16187b(viewStructure, iM16186a);
            if (viewStructureM16187b != null) {
                C8163d c8163d = C8163d.f44288a;
                AutofillId autofillIdM16190a = c8163d.m16190a(viewStructure);
                C5207g.m11108c(autofillIdM16190a);
                c8163d.m16196g(viewStructureM16187b, autofillIdM16190a, iIntValue);
                c8162c.m16189d(viewStructureM16187b, iIntValue, c8160a.f44284a.getContext().getPackageName(), null, null);
                c8163d.m16197h(viewStructureM16187b, 1);
                c8165f.getClass();
                throw null;
            }
            iM16186a++;
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        if (this.f3968b) {
            InterfaceC2052l<? super InterfaceC8715p, ? extends C8721v> interfaceC2052l = AndroidComposeView_androidKt.f4081a;
            LayoutDirection layoutDirection = (i10 == 0 || i10 != 1) ? LayoutDirection.Ltr : LayoutDirection.Rtl;
            setLayoutDirection(layoutDirection);
            getFocusOwner().mo1955b(layoutDirection);
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        boolean zM2267a;
        this.f3976f.f4354a.setValue(Boolean.valueOf(z10));
        this.f3950J0 = true;
        super.onWindowFocusChanged(z10);
        if (z10 && getShowLayoutBounds() != (zM2267a = C0550a.m2267a())) {
            setShowLayoutBounds(zM2267a);
            m2250w(getRoot());
        }
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0549h
    /* JADX INFO: renamed from: p */
    public final void mo2236p(BackwardsCompatNode.C0527a c0527a) {
        C0547f c0547f = this.f3969b0;
        c0547f.getClass();
        c0547f.f3915e.m11687b(c0527a);
        m2257F(null);
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0549h
    /* JADX INFO: renamed from: q */
    public final void mo2237q(InterfaceC2041a<C9072e> interfaceC2041a) {
        C5207g.m11111f(interfaceC2041a, "listener");
        C5458f<InterfaceC2041a<C9072e>> c5458f = this.f3941D0;
        if (!c5458f.m11692i(interfaceC2041a)) {
            c5458f.m11687b(interfaceC2041a);
        }
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0549h
    /* JADX INFO: renamed from: r */
    public final void mo2238r(LayoutNode layoutNode) {
        C5207g.m11111f(layoutNode, "node");
    }

    public final void setConfigurationChangeObserver(InterfaceC2052l<? super Configuration, C9072e> interfaceC2052l) {
        C5207g.m11111f(interfaceC2052l, "<set-?>");
        this.configurationChangeObserver = interfaceC2052l;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j10) {
        this.lastMatrixRecalculationAnimationTime = j10;
    }

    public final void setOnViewTreeOwnersAvailable(InterfaceC2052l<? super C0551b, C9072e> interfaceC2052l) {
        C5207g.m11111f(interfaceC2052l, "callback");
        C0551b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            interfaceC2052l.mo528n(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f3990m0 = interfaceC2052l;
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0549h
    public void setShowLayoutBounds(boolean z10) {
        this.showLayoutBounds = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00e8  */
    /* JADX INFO: renamed from: v */
    public final int m2264v(MotionEvent motionEvent) {
        int actionMasked;
        float[] fArr = this.f3977f0;
        removeCallbacks(this.f3942E0);
        try {
            this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
            this.f3948I0.mo2355a(this, fArr);
            C0062b.m390r1(fArr, this.f3979g0);
            long jM14937e0 = C7499b.m14937e0(C7499b.m14932c(motionEvent.getX(), motionEvent.getY()), fArr);
            this.f3985j0 = C7499b.m14932c(motionEvent.getRawX() - C8941c.m17164c(jM14937e0), motionEvent.getRawY() - C8941c.m17165d(jM14937e0));
            boolean z10 = true;
            this.f3983i0 = true;
            m2253B(false);
            this.f3952K0 = null;
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.f3938A0;
                boolean z11 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
                if (motionEvent2 != null) {
                    if ((motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true) {
                        if (motionEvent2.getButtonState() != 0 || (actionMasked = motionEvent2.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                            C5032s c5032s = this.f3955M;
                            if (!c5032s.f32867e) {
                                c5032s.f32865c.f32847a.clear();
                                C5023j c5023j = (C5023j) c5032s.f32864b.f33573b;
                                c5023j.mo10707c();
                                c5023j.f32831a.m11691h();
                            }
                        } else if (motionEvent2.getActionMasked() != 10 && z11) {
                            m2259H(motionEvent2, 10, motionEvent2.getEventTime(), true);
                        }
                    }
                }
                if (motionEvent.getToolType(0) != 3) {
                    z10 = false;
                }
                if (!z11 && z10 && actionMasked2 != 3 && actionMasked2 != 9 && m2266z(motionEvent)) {
                    m2259H(motionEvent, 9, motionEvent.getEventTime(), true);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.f3938A0 = MotionEvent.obtainNoHistory(motionEvent);
                int iM2258G = m2258G(motionEvent);
                Trace.endSection();
                C0672w.f4360a.m2496a(this, this.f3952K0);
                this.f3983i0 = false;
                return iM2258G;
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } catch (Throwable th3) {
            this.f3983i0 = false;
            throw th3;
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m2265x(LayoutNode layoutNode) {
        int i10 = 0;
        this.f3969b0.m2224n(layoutNode, false);
        C5458f<LayoutNode> c5458fM2130t = layoutNode.m2130t();
        int i11 = c5458fM2130t.f34019c;
        if (i11 > 0) {
            LayoutNode[] layoutNodeArr = c5458fM2130t.f34017a;
            do {
                m2265x(layoutNodeArr[i10]);
                i10++;
            } while (i10 < i11);
        }
    }

    /* JADX INFO: renamed from: z */
    public final boolean m2266z(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (0.0f <= x10 && x10 <= ((float) getWidth())) {
            if (0.0f <= y10 && y10 <= ((float) getHeight())) {
                return true;
            }
        }
        return false;
    }
}
