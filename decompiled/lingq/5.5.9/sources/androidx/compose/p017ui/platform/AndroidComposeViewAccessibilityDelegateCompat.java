package androidx.compose.p017ui.platform;

import ae.C0062b;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import android.text.SpannableString;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.activity.RunnableC0190i;
import androidx.compose.p017ui.node.LayoutNode;
import androidx.compose.p017ui.node.NodeCoordinator;
import androidx.compose.p017ui.platform.accessibility.C0605a;
import androidx.compose.p017ui.semantics.C0685a;
import androidx.compose.p017ui.semantics.SemanticsConfigurationKt;
import androidx.compose.p017ui.semantics.SemanticsNode;
import androidx.compose.p017ui.semantics.SemanticsProperties;
import androidx.compose.p017ui.semantics.SemanticsPropertiesAndroid;
import androidx.compose.p017ui.state.ToggleableState;
import androidx.compose.p017ui.text.C0689a;
import androidx.compose.p017ui.text.C0692c;
import androidx.compose.p017ui.text.MultiParagraphIntrinsics;
import androidx.compose.p017ui.text.font.AbstractC0696b;
import androidx.view.C1052r;
import androidx.view.InterfaceC1051q;
import androidx.view.Lifecycle;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2057q;
import com.kochava.tracker.BuildConfig;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import jm.InterfaceC6522e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C6744b;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.channels.AbstractChannel;
import p166i1.C6139d;
import p166i1.C6156l0;
import p166i1.InterfaceC6154k0;
import p210k1.C6563a;
import p210k1.C6566d;
import p210k1.C6567e;
import p210k1.C6568f;
import p210k1.C6569g;
import p210k1.C6570h;
import p210k1.C6571i;
import p210k1.C6572j;
import p210k1.C6575m;
import p231l1.C7208b;
import p231l1.C7216j;
import p231l1.C7217k;
import p231l1.InterfaceC7207a;
import p260m8.C7499b;
import p326q.C8448d;
import p326q.C8453i;
import p338qd.C8573r0;
import p375s0.C8941c;
import p375s0.C8942d;
import p385sf.C9000b;
import p388t1.C9175a;
import p471x2.C10026a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p496y1.C10278a;
import p497y2.C10284f;
import p497y2.C10285g;
import p504y9.C10317j;
import sl.C9072e;
import tl.C9326n;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat extends C10026a {

    /* JADX INFO: renamed from: G */
    public static final int[] f4016G = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* JADX INFO: renamed from: A */
    public final LinkedHashMap f4017A;

    /* JADX INFO: renamed from: B */
    public C0561g f4018B;

    /* JADX INFO: renamed from: C */
    public boolean f4019C;

    /* JADX INFO: renamed from: D */
    public final RunnableC0190i f4020D;

    /* JADX INFO: renamed from: E */
    public final ArrayList f4021E;

    /* JADX INFO: renamed from: F */
    public final InterfaceC2052l<C0616d1, C9072e> f4022F;

    /* JADX INFO: renamed from: d */
    public final AndroidComposeView f4023d;

    /* JADX INFO: renamed from: e */
    public int f4024e;

    /* JADX INFO: renamed from: f */
    public final AccessibilityManager f4025f;

    /* JADX INFO: renamed from: g */
    public final AccessibilityManagerAccessibilityStateChangeListenerC0654q f4026g;

    /* JADX INFO: renamed from: h */
    public final AccessibilityManagerTouchExplorationStateChangeListenerC0657r f4027h;

    /* JADX INFO: renamed from: i */
    public List<AccessibilityServiceInfo> f4028i;

    /* JADX INFO: renamed from: j */
    public final Handler f4029j;

    /* JADX INFO: renamed from: k */
    public final C10285g f4030k;

    /* JADX INFO: renamed from: l */
    public int f4031l;

    /* JADX INFO: renamed from: m */
    public final C8453i<C8453i<CharSequence>> f4032m;

    /* JADX INFO: renamed from: n */
    public final C8453i<Map<CharSequence, Integer>> f4033n;

    /* JADX INFO: renamed from: o */
    public int f4034o;

    /* JADX INFO: renamed from: p */
    public Integer f4035p;

    /* JADX INFO: renamed from: q */
    public final C8448d<LayoutNode> f4036q;

    /* JADX INFO: renamed from: r */
    public final AbstractChannel f4037r;

    /* JADX INFO: renamed from: s */
    public boolean f4038s;

    /* JADX INFO: renamed from: t */
    public C0560f f4039t;

    /* JADX INFO: renamed from: u */
    public Map<Integer, C0620e1> f4040u;

    /* JADX INFO: renamed from: v */
    public final C8448d<Integer> f4041v;

    /* JADX INFO: renamed from: w */
    public final HashMap<Integer, Integer> f4042w;

    /* JADX INFO: renamed from: x */
    public final HashMap<Integer, Integer> f4043x;

    /* JADX INFO: renamed from: y */
    public final String f4044y;

    /* JADX INFO: renamed from: z */
    public final String f4045z;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$a */
    public static final class ViewOnAttachStateChangeListenerC0554a implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC0554a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            C5207g.m11111f(view, "view");
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
            androidComposeViewAccessibilityDelegateCompat.f4025f.addAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.f4026g);
            androidComposeViewAccessibilityDelegateCompat.f4025f.addTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.f4027h);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            C5207g.m11111f(view, "view");
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
            androidComposeViewAccessibilityDelegateCompat.f4029j.removeCallbacks(androidComposeViewAccessibilityDelegateCompat.f4020D);
            AccessibilityManagerAccessibilityStateChangeListenerC0654q accessibilityManagerAccessibilityStateChangeListenerC0654q = androidComposeViewAccessibilityDelegateCompat.f4026g;
            AccessibilityManager accessibilityManager = androidComposeViewAccessibilityDelegateCompat.f4025f;
            accessibilityManager.removeAccessibilityStateChangeListener(accessibilityManagerAccessibilityStateChangeListenerC0654q);
            accessibilityManager.removeTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.f4027h);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$b */
    public static final class C0555b {
        /* JADX INFO: renamed from: a */
        public static final void m2299a(C10284f c10284f, SemanticsNode semanticsNode) {
            C5207g.m11111f(c10284f, "info");
            C5207g.m11111f(semanticsNode, "semanticsNode");
            if (C0666u.m2483a(semanticsNode)) {
                C6563a c6563a = (C6563a) SemanticsConfigurationKt.m2529a(semanticsNode.f4401f, C6571i.f37376e);
                if (c6563a != null) {
                    c10284f.m19257b(new C10284f.a(android.R.id.accessibilityActionSetProgress, c6563a.f37362a));
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$c */
    public static final class C0557c {
        /* JADX INFO: renamed from: a */
        public static final void m2300a(AccessibilityEvent accessibilityEvent, int i10, int i11) {
            C5207g.m11111f(accessibilityEvent, "event");
            accessibilityEvent.setScrollDeltaX(i10);
            accessibilityEvent.setScrollDeltaY(i11);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$d */
    public static final class C0558d {
        /* JADX INFO: renamed from: a */
        public static final void m2301a(C10284f c10284f, SemanticsNode semanticsNode) {
            C5207g.m11111f(c10284f, "info");
            C5207g.m11111f(semanticsNode, "semanticsNode");
            if (C0666u.m2483a(semanticsNode)) {
                C0685a<C6563a<InterfaceC2041a<Boolean>>> c0685a = C6571i.f37387p;
                C6572j c6572j = semanticsNode.f4401f;
                C6563a c6563a = (C6563a) SemanticsConfigurationKt.m2529a(c6572j, c0685a);
                if (c6563a != null) {
                    c10284f.m19257b(new C10284f.a(android.R.id.accessibilityActionPageUp, c6563a.f37362a));
                }
                C6563a c6563a2 = (C6563a) SemanticsConfigurationKt.m2529a(c6572j, C6571i.f37389r);
                if (c6563a2 != null) {
                    c10284f.m19257b(new C10284f.a(android.R.id.accessibilityActionPageDown, c6563a2.f37362a));
                }
                C6563a c6563a3 = (C6563a) SemanticsConfigurationKt.m2529a(c6572j, C6571i.f37388q);
                if (c6563a3 != null) {
                    c10284f.m19257b(new C10284f.a(android.R.id.accessibilityActionPageLeft, c6563a3.f37362a));
                }
                C6563a c6563a4 = (C6563a) SemanticsConfigurationKt.m2529a(c6572j, C6571i.f37390s);
                if (c6563a4 != null) {
                    c10284f.m19257b(new C10284f.a(android.R.id.accessibilityActionPageRight, c6563a4.f37362a));
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$e */
    public final class C0559e extends AccessibilityNodeProvider {
        public C0559e() {
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            C5207g.m11111f(accessibilityNodeInfo, "info");
            C5207g.m11111f(str, "extraDataKey");
            AndroidComposeViewAccessibilityDelegateCompat.this.m2288j(i10, accessibilityNodeInfo, str, bundle);
        }

        /* JADX WARN: Code duplicated, block: B:37:0x00f0  */
        /* JADX WARN: Code duplicated, block: B:439:0x096a  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            boolean z10;
            AccessibilityNodeInfo accessibilityNodeInfo;
            AccessibilityNodeInfo accessibilityNodeInfo2;
            String str;
            String str2;
            String str3;
            AndroidComposeView androidComposeView;
            int iM361k0;
            int i11;
            boolean zBooleanValue;
            C0689a c0689a;
            String str4;
            InterfaceC1051q interfaceC1051q;
            C1052r c1052rMo786G;
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
            AndroidComposeView androidComposeView2 = androidComposeViewAccessibilityDelegateCompat.f4023d;
            AndroidComposeView.C0551b viewTreeOwners = androidComposeView2.getViewTreeOwners();
            if (((viewTreeOwners == null || (interfaceC1051q = viewTreeOwners.f4005a) == null || (c1052rMo786G = interfaceC1051q.mo786G()) == null) ? null : c1052rMo786G.f6681d) != Lifecycle.State.DESTROYED) {
                AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                C10284f c10284f = new C10284f(accessibilityNodeInfoObtain);
                C0620e1 c0620e1 = androidComposeViewAccessibilityDelegateCompat.m2295q().get(Integer.valueOf(i10));
                if (c0620e1 != null) {
                    SemanticsNode semanticsNode = c0620e1.f4307a;
                    if (i10 == -1) {
                        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                        Object objM18669f = C10029b0.d.m18669f(androidComposeView2);
                        View view = objM18669f instanceof View ? (View) objM18669f : null;
                        c10284f.f51740b = -1;
                        accessibilityNodeInfoObtain.setParent(view);
                    } else {
                        if (semanticsNode.m2537h() == null) {
                            throw new IllegalStateException(C0166e.m762h("semanticsNode ", i10, " has null parent"));
                        }
                        SemanticsNode semanticsNodeM2537h = semanticsNode.m2537h();
                        C5207g.m11108c(semanticsNodeM2537h);
                        int i12 = androidComposeView2.getSemanticsOwner().m13166a().f4402g;
                        int i13 = semanticsNodeM2537h.f4402g;
                        int i14 = i13 != i12 ? i13 : -1;
                        c10284f.f51740b = i14;
                        accessibilityNodeInfoObtain.setParent(androidComposeView2, i14);
                    }
                    c10284f.f51741c = i10;
                    accessibilityNodeInfoObtain.setSource(androidComposeView2, i10);
                    Rect rect = c0620e1.f4308b;
                    long jMo2262k = androidComposeView2.mo2262k(C7499b.m14932c(rect.left, rect.top));
                    long jMo2262k2 = androidComposeView2.mo2262k(C7499b.m14932c(rect.right, rect.bottom));
                    accessibilityNodeInfoObtain.setBoundsInScreen(new Rect((int) Math.floor(C8941c.m17164c(jMo2262k)), (int) Math.floor(C8941c.m17165d(jMo2262k)), (int) Math.ceil(C8941c.m17164c(jMo2262k2)), (int) Math.ceil(C8941c.m17165d(jMo2262k2))));
                    C5207g.m11111f(semanticsNode, "semanticsNode");
                    if (semanticsNode.f4399d || !semanticsNode.m2538i().isEmpty()) {
                        z10 = false;
                    } else if (C0666u.m2488f(semanticsNode.f4398c, new InterfaceC2052l<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$populateAccessibilityNodeInfoProperties$isUnmergedLeafNode$1
                        /* JADX WARN: Code duplicated, block: B:9:0x0022  */
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final Boolean mo528n(LayoutNode layoutNode) {
                            boolean z11;
                            C6572j c6572jM12666a;
                            LayoutNode layoutNode2 = layoutNode;
                            C5207g.m11111f(layoutNode2, "it");
                            InterfaceC6154k0 interfaceC6154k0M16750q0 = C8573r0.m16750q0(layoutNode2);
                            if (interfaceC6154k0M16750q0 == null || (c6572jM12666a = C6156l0.m12666a(interfaceC6154k0M16750q0)) == null) {
                                z11 = false;
                            } else {
                                z11 = true;
                                if (!c6572jM12666a.f37392b) {
                                    z11 = false;
                                }
                            }
                            return Boolean.valueOf(z11);
                        }
                    }) == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    c10284f.m19264i("android.view.View");
                    C0685a<C6569g> c0685a = SemanticsProperties.f4424q;
                    C6572j c6572j = semanticsNode.f4401f;
                    C6569g c6569g = (C6569g) SemanticsConfigurationKt.m2529a(c6572j, c0685a);
                    if (c6569g != null) {
                        if (semanticsNode.f4399d || semanticsNode.m2538i().isEmpty()) {
                            int i15 = c6569g.f37368a;
                            if (i15 == 4) {
                                accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", androidComposeView2.getContext().getResources().getString(R.string.tab));
                            } else if (i15 == 2) {
                                accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", androidComposeView2.getContext().getResources().getString(R.string.switch_role));
                            } else {
                                if (i15 == 0) {
                                    str4 = "android.widget.Button";
                                } else if (i15 == 1) {
                                    str4 = "android.widget.CheckBox";
                                } else if (i15 == 3) {
                                    str4 = "android.widget.RadioButton";
                                } else {
                                    str4 = i15 == 5 ? "android.widget.ImageView" : i15 == 6 ? "android.widget.Spinner" : null;
                                }
                                if (!(i15 == 5) || z10 || c6572j.f37392b) {
                                    c10284f.m19264i(str4);
                                }
                            }
                        }
                        C9072e c9072e = C9072e.f47360a;
                    }
                    if (C0666u.m2490h(semanticsNode)) {
                        c10284f.m19264i("android.widget.EditText");
                    }
                    if (semanticsNode.m2536g().m13163f(SemanticsProperties.f4426s)) {
                        c10284f.m19264i("android.widget.TextView");
                    }
                    accessibilityNodeInfoObtain.setPackageName(androidComposeView2.getContext().getPackageName());
                    accessibilityNodeInfoObtain.setImportantForAccessibility(true);
                    List<SemanticsNode> listM2538i = semanticsNode.m2538i();
                    int size = listM2538i.size();
                    int i16 = 0;
                    while (true) {
                        accessibilityNodeInfo = c10284f.f51739a;
                        if (i16 >= size) {
                            break;
                        }
                        SemanticsNode semanticsNode2 = listM2538i.get(i16);
                        if (androidComposeViewAccessibilityDelegateCompat.m2295q().containsKey(Integer.valueOf(semanticsNode2.f4402g))) {
                            C10278a c10278a = androidComposeView2.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(semanticsNode2.f4398c);
                            if (c10278a != null) {
                                accessibilityNodeInfoObtain.addChild(c10278a);
                            } else {
                                accessibilityNodeInfo.addChild(androidComposeView2, semanticsNode2.f4402g);
                            }
                        }
                        i16++;
                    }
                    if (androidComposeViewAccessibilityDelegateCompat.f4031l == i10) {
                        accessibilityNodeInfo.setAccessibilityFocused(true);
                        c10284f.m19257b(C10284f.a.f51744g);
                    } else {
                        accessibilityNodeInfo.setAccessibilityFocused(false);
                        c10284f.m19257b(C10284f.a.f51743f);
                    }
                    AbstractC0696b.a fontFamilyResolver = androidComposeView2.getFontFamilyResolver();
                    C0689a c0689aM2272s = AndroidComposeViewAccessibilityDelegateCompat.m2272s(c6572j);
                    SpannableString spannableString = (SpannableString) AndroidComposeViewAccessibilityDelegateCompat.m2270L(c0689aM2272s != null ? C9175a.m17506a(c0689aM2272s, androidComposeView2.getDensity(), fontFamilyResolver) : null);
                    List list = (List) SemanticsConfigurationKt.m2529a(c6572j, SemanticsProperties.f4426s);
                    SpannableString spannableString2 = (SpannableString) AndroidComposeViewAccessibilityDelegateCompat.m2270L((list == null || (c0689a = (C0689a) C6752c.m13425S(list)) == null) ? null : C9175a.m17506a(c0689a, androidComposeView2.getDensity(), fontFamilyResolver));
                    if (spannableString == null) {
                        spannableString = spannableString2;
                    }
                    c10284f.m19270o(spannableString);
                    C0685a<String> c0685a2 = SemanticsProperties.f4432y;
                    if (c6572j.m13163f(c0685a2)) {
                        accessibilityNodeInfoObtain.setContentInvalid(true);
                        accessibilityNodeInfo.setError((CharSequence) SemanticsConfigurationKt.m2529a(c6572j, c0685a2));
                    }
                    c10284f.m19269n((CharSequence) SemanticsConfigurationKt.m2529a(c6572j, SemanticsProperties.f4409b));
                    ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.m2529a(c6572j, SemanticsProperties.f4430w);
                    if (toggleableState != null) {
                        accessibilityNodeInfo.setCheckable(true);
                        int i17 = C0562h.f4063a[toggleableState.ordinal()];
                        if (i17 == 1) {
                            accessibilityNodeInfo.setChecked(true);
                            if ((c6569g != null && c6569g.f37368a == 2) && c10284f.m19262g() == null) {
                                c10284f.m19269n(androidComposeView2.getContext().getResources().getString(R.string.f32132on));
                            }
                        } else if (i17 == 2) {
                            accessibilityNodeInfo.setChecked(false);
                            if ((c6569g != null && c6569g.f37368a == 2) && c10284f.m19262g() == null) {
                                c10284f.m19269n(androidComposeView2.getContext().getResources().getString(R.string.off));
                            }
                        } else if (i17 == 3 && c10284f.m19262g() == null) {
                            c10284f.m19269n(androidComposeView2.getContext().getResources().getString(R.string.indeterminate));
                        }
                        C9072e c9072e2 = C9072e.f47360a;
                    }
                    Boolean bool = (Boolean) SemanticsConfigurationKt.m2529a(c6572j, SemanticsProperties.f4429v);
                    if (bool != null) {
                        boolean zBooleanValue2 = bool.booleanValue();
                        if (c6569g != null && c6569g.f37368a == 4) {
                            accessibilityNodeInfoObtain.setSelected(zBooleanValue2);
                        } else {
                            accessibilityNodeInfo.setCheckable(true);
                            accessibilityNodeInfo.setChecked(zBooleanValue2);
                            if (c10284f.m19262g() == null) {
                                c10284f.m19269n(zBooleanValue2 ? androidComposeView2.getContext().getResources().getString(R.string.selected) : androidComposeView2.getContext().getResources().getString(R.string.not_selected));
                            }
                        }
                        C9072e c9072e3 = C9072e.f47360a;
                    }
                    if (!c6572j.f37392b || semanticsNode.m2538i().isEmpty()) {
                        List list2 = (List) SemanticsConfigurationKt.m2529a(c6572j, SemanticsProperties.f4408a);
                        c10284f.m19267l(list2 != null ? (String) C6752c.m13425S(list2) : null);
                    }
                    String str5 = (String) SemanticsConfigurationKt.m2529a(c6572j, SemanticsProperties.f4425r);
                    if (str5 != null) {
                        SemanticsNode semanticsNodeM2537h2 = semanticsNode;
                        while (true) {
                            if (semanticsNodeM2537h2 == null) {
                                zBooleanValue = false;
                                break;
                            }
                            C0685a<Boolean> c0685a3 = SemanticsPropertiesAndroid.f4441a;
                            C6572j c6572j2 = semanticsNodeM2537h2.f4401f;
                            if (c6572j2.m13163f(c0685a3)) {
                                zBooleanValue = ((Boolean) c6572j2.m13164g(c0685a3)).booleanValue();
                                break;
                            }
                            semanticsNodeM2537h2 = semanticsNodeM2537h2.m2537h();
                        }
                        if (zBooleanValue) {
                            accessibilityNodeInfoObtain.setViewIdResourceName(str5);
                        }
                    }
                    String str6 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";
                    if (((C9072e) SemanticsConfigurationKt.m2529a(c6572j, SemanticsProperties.f4415h)) != null) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            accessibilityNodeInfo.setHeading(true);
                        } else {
                            Bundle extras = accessibilityNodeInfo.getExtras();
                            if (extras != null) {
                                extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-3)) | 2);
                            }
                        }
                        C9072e c9072e4 = C9072e.f47360a;
                    }
                    accessibilityNodeInfoObtain.setPassword(C0666u.m2485c(semanticsNode));
                    accessibilityNodeInfoObtain.setEditable(C0666u.m2490h(semanticsNode));
                    accessibilityNodeInfo.setEnabled(C0666u.m2483a(semanticsNode));
                    C0685a<Boolean> c0685a4 = SemanticsProperties.f4418k;
                    accessibilityNodeInfo.setFocusable(c6572j.m13163f(c0685a4));
                    if (accessibilityNodeInfo.isFocusable()) {
                        accessibilityNodeInfo.setFocused(((Boolean) c6572j.m13164g(c0685a4)).booleanValue());
                        if (accessibilityNodeInfo.isFocused()) {
                            c10284f.m19256a(2);
                        } else {
                            c10284f.m19256a(1);
                        }
                    }
                    NodeCoordinator nodeCoordinatorM2531b = semanticsNode.m2531b();
                    accessibilityNodeInfo.setVisibleToUser(((nodeCoordinatorM2531b != null ? nodeCoordinatorM2531b.m2185l1() : false) || c6572j.m13163f(SemanticsProperties.f4420m)) ? false : true);
                    if (((C6567e) SemanticsConfigurationKt.m2529a(c6572j, SemanticsProperties.f4417j)) != null) {
                        accessibilityNodeInfoObtain.setLiveRegion(1);
                        C9072e c9072e5 = C9072e.f47360a;
                    }
                    accessibilityNodeInfo.setClickable(false);
                    C6563a c6563a = (C6563a) SemanticsConfigurationKt.m2529a(c6572j, C6571i.f37373b);
                    if (c6563a != null) {
                        boolean zM11106a = C5207g.m11106a(SemanticsConfigurationKt.m2529a(c6572j, SemanticsProperties.f4429v), Boolean.TRUE);
                        accessibilityNodeInfo.setClickable(!zM11106a);
                        if (C0666u.m2483a(semanticsNode) && !zM11106a) {
                            c10284f.m19257b(new C10284f.a(16, c6563a.f37362a));
                        }
                        C9072e c9072e6 = C9072e.f47360a;
                    }
                    accessibilityNodeInfo.setLongClickable(false);
                    C6563a c6563a2 = (C6563a) SemanticsConfigurationKt.m2529a(c6572j, C6571i.f37374c);
                    if (c6563a2 != null) {
                        accessibilityNodeInfo.setLongClickable(true);
                        if (C0666u.m2483a(semanticsNode)) {
                            c10284f.m19257b(new C10284f.a(32, c6563a2.f37362a));
                        }
                        C9072e c9072e7 = C9072e.f47360a;
                    }
                    C6563a c6563a3 = (C6563a) SemanticsConfigurationKt.m2529a(c6572j, C6571i.f37379h);
                    if (c6563a3 != null) {
                        c10284f.m19257b(new C10284f.a(16384, c6563a3.f37362a));
                        C9072e c9072e8 = C9072e.f47360a;
                    }
                    if (C0666u.m2483a(semanticsNode)) {
                        C6563a c6563a4 = (C6563a) SemanticsConfigurationKt.m2529a(c6572j, C6571i.f37378g);
                        if (c6563a4 != null) {
                            c10284f.m19257b(new C10284f.a(2097152, c6563a4.f37362a));
                            C9072e c9072e9 = C9072e.f47360a;
                        }
                        C6563a c6563a5 = (C6563a) SemanticsConfigurationKt.m2529a(c6572j, C6571i.f37380i);
                        if (c6563a5 != null) {
                            c10284f.m19257b(new C10284f.a(65536, c6563a5.f37362a));
                            C9072e c9072e10 = C9072e.f47360a;
                        }
                        C6563a c6563a6 = (C6563a) SemanticsConfigurationKt.m2529a(c6572j, C6571i.f37381j);
                        if (c6563a6 != null) {
                            if (accessibilityNodeInfo.isFocused() && androidComposeView2.getClipboardManager().m2360a()) {
                                c10284f.m19257b(new C10284f.a(32768, c6563a6.f37362a));
                            }
                            C9072e c9072e11 = C9072e.f47360a;
                        }
                    }
                    String strM2271r = AndroidComposeViewAccessibilityDelegateCompat.m2271r(semanticsNode);
                    if (!(strM2271r == null || strM2271r.length() == 0)) {
                        accessibilityNodeInfoObtain.setTextSelection(androidComposeViewAccessibilityDelegateCompat.m2294p(semanticsNode), androidComposeViewAccessibilityDelegateCompat.m2293o(semanticsNode));
                        C6563a c6563a7 = (C6563a) SemanticsConfigurationKt.m2529a(c6572j, C6571i.f37377f);
                        c10284f.m19257b(new C10284f.a(131072, c6563a7 != null ? c6563a7.f37362a : null));
                        c10284f.m19256a(256);
                        c10284f.m19256a(512);
                        accessibilityNodeInfo.setMovementGranularities(11);
                        List list3 = (List) SemanticsConfigurationKt.m2529a(c6572j, SemanticsProperties.f4408a);
                        if ((list3 == null || list3.isEmpty()) && c6572j.m13163f(C6571i.f37372a) && !C0666u.m2484b(semanticsNode)) {
                            accessibilityNodeInfo.setMovementGranularities(c10284f.m19261f() | 4 | 16);
                        }
                    }
                    int i18 = Build.VERSION.SDK_INT;
                    ArrayList arrayList = new ArrayList();
                    CharSequence charSequenceM19263h = c10284f.m19263h();
                    if (!(charSequenceM19263h == null || charSequenceM19263h.length() == 0) && c6572j.m13163f(C6571i.f37372a)) {
                        arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                    }
                    if (c6572j.m13163f(SemanticsProperties.f4425r)) {
                        arrayList.add("androidx.compose.ui.semantics.testTag");
                    }
                    if (!arrayList.isEmpty()) {
                        C0630i c0630i = C0630i.f4315a;
                        C5207g.m11110e(accessibilityNodeInfo, "info.unwrap()");
                        c0630i.m2358a(accessibilityNodeInfo, arrayList);
                    }
                    C6568f c6568f = (C6568f) SemanticsConfigurationKt.m2529a(c6572j, SemanticsProperties.f4410c);
                    if (c6568f != null) {
                        C0685a<C6563a<InterfaceC2052l<Float, Boolean>>> c0685a5 = C6571i.f37376e;
                        if (c6572j.m13163f(c0685a5)) {
                            c10284f.m19264i("android.widget.SeekBar");
                        } else {
                            c10284f.m19264i("android.widget.ProgressBar");
                        }
                        C6568f c6568f2 = C6568f.f37364d;
                        float f3 = c6568f.f37365a;
                        accessibilityNodeInfo2 = accessibilityNodeInfoObtain;
                        InterfaceC6522e<Float> interfaceC6522e = c6568f.f37366b;
                        if (c6568f != c6568f2) {
                            str = "info.unwrap()";
                            accessibilityNodeInfo.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, interfaceC6522e.mo13103f().floatValue(), interfaceC6522e.mo13102a().floatValue(), f3));
                            if (c10284f.m19262g() == null) {
                                float fM357j0 = C0062b.m357j0(((interfaceC6522e.mo13102a().floatValue() - interfaceC6522e.mo13103f().floatValue()) > 0.0f ? 1 : ((interfaceC6522e.mo13102a().floatValue() - interfaceC6522e.mo13103f().floatValue()) == 0.0f ? 0 : -1)) == 0 ? 0.0f : (f3 - interfaceC6522e.mo13103f().floatValue()) / (interfaceC6522e.mo13102a().floatValue() - interfaceC6522e.mo13103f().floatValue()), 0.0f, 1.0f);
                                if (fM357j0 == 0.0f) {
                                    iM361k0 = 0;
                                } else {
                                    if (fM357j0 == 1.0f) {
                                        iM361k0 = 100;
                                    } else {
                                        iM361k0 = C0062b.m361k0(C8573r0.m16710Y0(fM357j0 * 100), 1, 99);
                                        i11 = 1;
                                    }
                                    Resources resources = androidComposeView2.getContext().getResources();
                                    Object[] objArr = new Object[i11];
                                    objArr[0] = Integer.valueOf(iM361k0);
                                    c10284f.m19269n(resources.getString(R.string.template_percent, objArr));
                                }
                                i11 = 1;
                                Resources resources2 = androidComposeView2.getContext().getResources();
                                Object[] objArr2 = new Object[i11];
                                objArr2[0] = Integer.valueOf(iM361k0);
                                c10284f.m19269n(resources2.getString(R.string.template_percent, objArr2));
                            }
                        } else {
                            str = "info.unwrap()";
                            if (c10284f.m19262g() == null) {
                                c10284f.m19269n(androidComposeView2.getContext().getResources().getString(R.string.in_progress));
                            }
                        }
                        if (c6572j.m13163f(c0685a5) && C0666u.m2483a(semanticsNode)) {
                            float fFloatValue = interfaceC6522e.mo13102a().floatValue();
                            float fFloatValue2 = interfaceC6522e.mo13103f().floatValue();
                            if (fFloatValue < fFloatValue2) {
                                fFloatValue = fFloatValue2;
                            }
                            if (f3 < fFloatValue) {
                                c10284f.m19257b(C10284f.a.f51745h);
                            }
                            float fFloatValue3 = interfaceC6522e.mo13103f().floatValue();
                            float fFloatValue4 = interfaceC6522e.mo13102a().floatValue();
                            if (fFloatValue3 > fFloatValue4) {
                                fFloatValue3 = fFloatValue4;
                            }
                            if (f3 > fFloatValue3) {
                                c10284f.m19257b(C10284f.a.f51746i);
                            }
                        }
                    } else {
                        accessibilityNodeInfo2 = accessibilityNodeInfoObtain;
                        str = "info.unwrap()";
                    }
                    C0555b.m2299a(c10284f, semanticsNode);
                    C0605a.m2333c(c10284f, semanticsNode);
                    C0605a.m2334d(c10284f, semanticsNode);
                    C6570h c6570h = (C6570h) SemanticsConfigurationKt.m2529a(c6572j, SemanticsProperties.f4421n);
                    C6563a c6563a8 = (C6563a) SemanticsConfigurationKt.m2529a(c6572j, C6571i.f37375d);
                    if (c6570h != null && c6563a8 != null) {
                        if (!C0605a.m2332b(semanticsNode)) {
                            c10284f.m19264i("android.widget.HorizontalScrollView");
                        }
                        if (c6570h.f37370b.mo807E().floatValue() > 0.0f) {
                            c10284f.m19268m(true);
                        }
                        if (C0666u.m2483a(semanticsNode)) {
                            if (AndroidComposeViewAccessibilityDelegateCompat.m2276y(c6570h)) {
                                c10284f.m19257b(C10284f.a.f51745h);
                                c10284f.m19257b(!C0666u.m2486d(semanticsNode) ? C10284f.a.f51753p : C10284f.a.f51751n);
                            }
                            if (AndroidComposeViewAccessibilityDelegateCompat.m2275x(c6570h)) {
                                c10284f.m19257b(C10284f.a.f51746i);
                                c10284f.m19257b(!C0666u.m2486d(semanticsNode) ? C10284f.a.f51751n : C10284f.a.f51753p);
                            }
                        }
                    }
                    C6570h c6570h2 = (C6570h) SemanticsConfigurationKt.m2529a(c6572j, SemanticsProperties.f4422o);
                    if (c6570h2 != null && c6563a8 != null) {
                        if (!C0605a.m2332b(semanticsNode)) {
                            c10284f.m19264i("android.widget.ScrollView");
                        }
                        if (c6570h2.f37370b.mo807E().floatValue() > 0.0f) {
                            c10284f.m19268m(true);
                        }
                        if (C0666u.m2483a(semanticsNode)) {
                            if (AndroidComposeViewAccessibilityDelegateCompat.m2276y(c6570h2)) {
                                c10284f.m19257b(C10284f.a.f51745h);
                                c10284f.m19257b(C10284f.a.f51752o);
                            }
                            if (AndroidComposeViewAccessibilityDelegateCompat.m2275x(c6570h2)) {
                                c10284f.m19257b(C10284f.a.f51746i);
                                c10284f.m19257b(C10284f.a.f51750m);
                            }
                        }
                    }
                    if (i18 >= 29) {
                        C0558d.m2301a(c10284f, semanticsNode);
                    }
                    CharSequence charSequence = (CharSequence) SemanticsConfigurationKt.m2529a(c6572j, SemanticsProperties.f4411d);
                    if (i18 >= 28) {
                        accessibilityNodeInfo.setPaneTitle(charSequence);
                    } else {
                        accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                    }
                    if (C0666u.m2483a(semanticsNode)) {
                        C6563a c6563a9 = (C6563a) SemanticsConfigurationKt.m2529a(c6572j, C6571i.f37382k);
                        if (c6563a9 != null) {
                            c10284f.m19257b(new C10284f.a(262144, c6563a9.f37362a));
                            C9072e c9072e12 = C9072e.f47360a;
                        }
                        C6563a c6563a10 = (C6563a) SemanticsConfigurationKt.m2529a(c6572j, C6571i.f37383l);
                        if (c6563a10 != null) {
                            c10284f.m19257b(new C10284f.a(524288, c6563a10.f37362a));
                            C9072e c9072e13 = C9072e.f47360a;
                        }
                        C6563a c6563a11 = (C6563a) SemanticsConfigurationKt.m2529a(c6572j, C6571i.f37384m);
                        if (c6563a11 != null) {
                            c10284f.m19257b(new C10284f.a(1048576, c6563a11.f37362a));
                            C9072e c9072e14 = C9072e.f47360a;
                        }
                        C0685a<List<C6566d>> c0685a6 = C6571i.f37386o;
                        if (c6572j.m13163f(c0685a6)) {
                            List list4 = (List) c6572j.m13164g(c0685a6);
                            if (list4.size() >= 32) {
                                throw new IllegalStateException("Can't have more than 32 custom actions for one widget");
                            }
                            C8453i<CharSequence> c8453i = new C8453i<>();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            C8453i<Map<CharSequence, Integer>> c8453i2 = androidComposeViewAccessibilityDelegateCompat.f4033n;
                            boolean zM16533d = c8453i2.m16533d(i10);
                            int[] iArr = AndroidComposeViewAccessibilityDelegateCompat.f4016G;
                            if (zM16533d) {
                                Map map = (Map) c8453i2.m16535f(i10, null);
                                ArrayList arrayListM13392x0 = C6744b.m13392x0(iArr);
                                ArrayList arrayList2 = new ArrayList();
                                int size2 = list4.size();
                                int i19 = 0;
                                while (i19 < size2) {
                                    int i20 = size2;
                                    C6566d c6566d = (C6566d) list4.get(i19);
                                    C5207g.m11108c(map);
                                    c6566d.getClass();
                                    String str7 = str6;
                                    if (map.containsKey(null)) {
                                        Integer num = (Integer) map.get(null);
                                        C5207g.m11108c(num);
                                        c8453i.m16536g(num.intValue(), null);
                                        linkedHashMap.put(null, num);
                                        arrayListM13392x0.remove(num);
                                        c10284f.m19257b(new C10284f.a(num.intValue(), (String) null));
                                    } else {
                                        arrayList2.add(c6566d);
                                    }
                                    i19++;
                                    str6 = str7;
                                    size2 = i20;
                                    map = map;
                                }
                                str2 = str6;
                                int size3 = arrayList2.size();
                                for (int i21 = 0; i21 < size3; i21++) {
                                    C6566d c6566d2 = (C6566d) arrayList2.get(i21);
                                    int iIntValue = ((Number) arrayListM13392x0.get(i21)).intValue();
                                    c6566d2.getClass();
                                    c8453i.m16536g(iIntValue, null);
                                    linkedHashMap.put(null, Integer.valueOf(iIntValue));
                                    c10284f.m19257b(new C10284f.a(iIntValue, (String) null));
                                }
                            } else {
                                str2 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";
                                int size4 = list4.size();
                                for (int i22 = 0; i22 < size4; i22++) {
                                    C6566d c6566d3 = (C6566d) list4.get(i22);
                                    int i23 = iArr[i22];
                                    c6566d3.getClass();
                                    c8453i.m16536g(i23, null);
                                    linkedHashMap.put(null, Integer.valueOf(i23));
                                    c10284f.m19257b(new C10284f.a(i23, (String) null));
                                }
                            }
                            androidComposeViewAccessibilityDelegateCompat.f4032m.m16536g(i10, c8453i);
                            c8453i2.m16536g(i10, linkedHashMap);
                        } else {
                            androidComposeView2 = androidComposeView2;
                            str2 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";
                        }
                    } else {
                        androidComposeView2 = androidComposeView2;
                        str2 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";
                    }
                    boolean z11 = (c6572j.f37392b || (z10 && (accessibilityNodeInfo.getContentDescription() != null || c10284f.m19263h() != null || c10284f.m19260e() != null || c10284f.m19262g() != null || accessibilityNodeInfo.isCheckable()))) ? 1 : 0;
                    if (Build.VERSION.SDK_INT >= 28) {
                        accessibilityNodeInfo.setScreenReaderFocusable(z11);
                    } else {
                        Bundle extras2 = accessibilityNodeInfo.getExtras();
                        if (extras2 != null) {
                            String str8 = str2;
                            extras2.putInt(str8, z11 | (extras2.getInt(str8, 0) & (-2)));
                        }
                    }
                    HashMap<Integer, Integer> map2 = androidComposeViewAccessibilityDelegateCompat.f4042w;
                    if (map2.get(Integer.valueOf(i10)) != null) {
                        Integer num2 = map2.get(Integer.valueOf(i10));
                        if (num2 != null) {
                            androidComposeView = androidComposeView2;
                            c10284f.m19272q(androidComposeView, num2.intValue());
                            C9072e c9072e15 = C9072e.f47360a;
                        } else {
                            androidComposeView = androidComposeView2;
                        }
                        str3 = str;
                        C5207g.m11110e(accessibilityNodeInfo, str3);
                        androidComposeViewAccessibilityDelegateCompat.m2288j(i10, accessibilityNodeInfo, androidComposeViewAccessibilityDelegateCompat.f4044y, null);
                    } else {
                        str3 = str;
                        androidComposeView = androidComposeView2;
                    }
                    HashMap<Integer, Integer> map3 = androidComposeViewAccessibilityDelegateCompat.f4043x;
                    if (map3.get(Integer.valueOf(i10)) != null) {
                        Integer num3 = map3.get(Integer.valueOf(i10));
                        if (num3 != null) {
                            c10284f.m19271p(androidComposeView, num3.intValue());
                            C9072e c9072e16 = C9072e.f47360a;
                        }
                        C5207g.m11110e(accessibilityNodeInfo, str3);
                        androidComposeViewAccessibilityDelegateCompat.m2288j(i10, accessibilityNodeInfo, androidComposeViewAccessibilityDelegateCompat.f4045z, null);
                    }
                    return accessibilityNodeInfo2;
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:336:0x056d  */
        /* JADX WARN: Code duplicated, block: B:339:0x0576  */
        /* JADX WARN: Code duplicated, block: B:341:0x0587  */
        /* JADX WARN: Code duplicated, block: B:342:0x058e  */
        /* JADX WARN: Code duplicated, block: B:345:0x0597  */
        /* JADX WARN: Code duplicated, block: B:347:0x05a1  */
        /* JADX WARN: Code duplicated, block: B:349:0x05a5  */
        /* JADX WARN: Code duplicated, block: B:351:0x05be  */
        /* JADX WARN: Code duplicated, block: B:353:0x05c2  */
        /* JADX WARN: Code duplicated, block: B:356:0x05de  */
        /* JADX WARN: Code duplicated, block: B:393:0x067c A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:394:0x067e  */
        /* JADX WARN: Code duplicated, block: B:395:0x0680  */
        /* JADX WARN: Code duplicated, block: B:67:0x0110  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00ba -> B:46:0x00bb). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:46:0x00bb
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:127)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:75)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
            */
        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final boolean performAction(int r20, int r21, android.os.Bundle r22) {
            /*
                Method dump skipped, instruction units count: 1836
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p017ui.platform.AndroidComposeViewAccessibilityDelegateCompat.C0559e.performAction(int, int, android.os.Bundle):boolean");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$f */
    public static final class C0560f {

        /* JADX INFO: renamed from: a */
        public final SemanticsNode f4054a;

        /* JADX INFO: renamed from: b */
        public final int f4055b;

        /* JADX INFO: renamed from: c */
        public final int f4056c;

        /* JADX INFO: renamed from: d */
        public final int f4057d;

        /* JADX INFO: renamed from: e */
        public final int f4058e;

        /* JADX INFO: renamed from: f */
        public final long f4059f;

        public C0560f(SemanticsNode semanticsNode, int i10, int i11, int i12, int i13, long j10) {
            this.f4054a = semanticsNode;
            this.f4055b = i10;
            this.f4056c = i11;
            this.f4057d = i12;
            this.f4058e = i13;
            this.f4059f = j10;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$g */
    public static final class C0561g {

        /* JADX INFO: renamed from: a */
        public final SemanticsNode f4060a;

        /* JADX INFO: renamed from: b */
        public final C6572j f4061b;

        /* JADX INFO: renamed from: c */
        public final LinkedHashSet f4062c;

        public C0561g(SemanticsNode semanticsNode, Map<Integer, C0620e1> map) {
            C5207g.m11111f(semanticsNode, "semanticsNode");
            C5207g.m11111f(map, "currentSemanticsNodes");
            this.f4060a = semanticsNode;
            this.f4061b = semanticsNode.f4401f;
            this.f4062c = new LinkedHashSet();
            List<SemanticsNode> listM2538i = semanticsNode.m2538i();
            int size = listM2538i.size();
            for (int i10 = 0; i10 < size; i10++) {
                SemanticsNode semanticsNode2 = listM2538i.get(i10);
                if (map.containsKey(Integer.valueOf(semanticsNode2.f4402g))) {
                    this.f4062c.add(Integer.valueOf(semanticsNode2.f4402g));
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$h */
    public /* synthetic */ class C0562h {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f4063a;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f4063a = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.platform.q] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.platform.r] */
    public AndroidComposeViewAccessibilityDelegateCompat(AndroidComposeView androidComposeView) {
        C5207g.m11111f(androidComposeView, "view");
        this.f4023d = androidComposeView;
        this.f4024e = Integer.MIN_VALUE;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        C5207g.m11109d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f4025f = accessibilityManager;
        this.f4026g = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: androidx.compose.ui.platform.q
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z10) {
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.f4334a;
                C5207g.m11111f(androidComposeViewAccessibilityDelegateCompat, "this$0");
                androidComposeViewAccessibilityDelegateCompat.f4028i = z10 ? androidComposeViewAccessibilityDelegateCompat.f4025f.getEnabledAccessibilityServiceList(-1) : EmptyList.f38032a;
            }
        };
        this.f4027h = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: androidx.compose.ui.platform.r
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z10) {
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.f4337a;
                C5207g.m11111f(androidComposeViewAccessibilityDelegateCompat, "this$0");
                androidComposeViewAccessibilityDelegateCompat.f4028i = androidComposeViewAccessibilityDelegateCompat.f4025f.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.f4028i = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f4029j = new Handler(Looper.getMainLooper());
        this.f4030k = new C10285g(new C0559e());
        this.f4031l = Integer.MIN_VALUE;
        this.f4032m = new C8453i<>();
        this.f4033n = new C8453i<>();
        this.f4034o = -1;
        this.f4036q = new C8448d<>();
        this.f4037r = C8573r0.m16738m(-1, null, 6);
        this.f4038s = true;
        this.f4040u = C6753d.m13459L0();
        this.f4041v = new C8448d<>();
        this.f4042w = new HashMap<>();
        this.f4043x = new HashMap<>();
        this.f4044y = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f4045z = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f4017A = new LinkedHashMap();
        this.f4018B = new C0561g(androidComposeView.getSemanticsOwner().m13166a(), C6753d.m13459L0());
        androidComposeView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0554a());
        this.f4020D = new RunnableC0190i(4, this);
        this.f4021E = new ArrayList();
        this.f4022F = new InterfaceC2052l<C0616d1, C9072e>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendScrollEventIfNeededLambda$1
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(C0616d1 c0616d1) {
                C0616d1 c0616d2 = c0616d1;
                C5207g.m11111f(c0616d2, "it");
                this.f4075b.m2281F(c0616d2);
                return C9072e.f47360a;
            }
        };
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m2268C(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i10, int i11, Integer num, int i12) {
        if ((i12 & 4) != 0) {
            num = null;
        }
        androidComposeViewAccessibilityDelegateCompat.m2278B(i10, i11, num, null);
    }

    /* JADX INFO: renamed from: K */
    public static final void m2269K(ArrayList arrayList, LinkedHashMap linkedHashMap, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z10, SemanticsNode semanticsNode) {
        arrayList.add(semanticsNode);
        C6572j c6572jM2536g = semanticsNode.m2536g();
        C0685a<Boolean> c0685a = SemanticsProperties.f4419l;
        boolean z11 = !C5207g.m11106a((Boolean) SemanticsConfigurationKt.m2529a(c6572jM2536g, c0685a), Boolean.FALSE) && (C5207g.m11106a((Boolean) SemanticsConfigurationKt.m2529a(semanticsNode.m2536g(), c0685a), Boolean.TRUE) || semanticsNode.m2536g().m13163f(SemanticsProperties.f4413f) || semanticsNode.m2536g().m13163f(C6571i.f37375d));
        boolean z12 = semanticsNode.f4397b;
        if (z11) {
            linkedHashMap.put(Integer.valueOf(semanticsNode.f4402g), androidComposeViewAccessibilityDelegateCompat.m2285J(C6752c.m13454v0(semanticsNode.m2535f(!z12, false)), z10));
            return;
        }
        List<SemanticsNode> listM2535f = semanticsNode.m2535f(!z12, false);
        int size = listM2535f.size();
        for (int i10 = 0; i10 < size; i10++) {
            m2269K(arrayList, linkedHashMap, androidComposeViewAccessibilityDelegateCompat, z10, listM2535f.get(i10));
        }
    }

    /* JADX INFO: renamed from: L */
    public static CharSequence m2270L(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        int i10 = 100000;
        if (charSequence.length() <= 100000) {
            return charSequence;
        }
        if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
            i10 = 99999;
        }
        CharSequence charSequenceSubSequence = charSequence.subSequence(0, i10);
        C5207g.m11109d(charSequenceSubSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        return charSequenceSubSequence;
    }

    /* JADX INFO: renamed from: r */
    public static String m2271r(SemanticsNode semanticsNode) {
        C0689a c0689a;
        if (semanticsNode == null) {
            return null;
        }
        C0685a<List<String>> c0685a = SemanticsProperties.f4408a;
        C6572j c6572j = semanticsNode.f4401f;
        if (c6572j.m13163f(c0685a)) {
            return C8573r0.m16721e0((List) c6572j.m13164g(c0685a));
        }
        if (C0666u.m2490h(semanticsNode)) {
            C0689a c0689aM2272s = m2272s(c6572j);
            return c0689aM2272s != null ? c0689aM2272s.f4523a : null;
        }
        List list = (List) SemanticsConfigurationKt.m2529a(c6572j, SemanticsProperties.f4426s);
        if (list == null || (c0689a = (C0689a) C6752c.m13425S(list)) == null) {
            return null;
        }
        return c0689a.f4523a;
    }

    /* JADX INFO: renamed from: s */
    public static C0689a m2272s(C6572j c6572j) {
        return (C0689a) SemanticsConfigurationKt.m2529a(c6572j, SemanticsProperties.f4427t);
    }

    /* JADX INFO: renamed from: v */
    public static final boolean m2273v(C6570h c6570h, float f3) {
        InterfaceC2041a<Float> interfaceC2041a = c6570h.f37369a;
        if (f3 >= 0.0f || interfaceC2041a.mo807E().floatValue() <= 0.0f) {
            if (f3 <= 0.0f || interfaceC2041a.mo807E().floatValue() >= c6570h.f37370b.mo807E().floatValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: w */
    public static final float m2274w(float f3, float f10) {
        if (Math.signum(f3) == Math.signum(f10)) {
            return Math.abs(f3) < Math.abs(f10) ? f3 : f10;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: x */
    public static final boolean m2275x(C6570h c6570h) {
        InterfaceC2041a<Float> interfaceC2041a = c6570h.f37369a;
        float fFloatValue = interfaceC2041a.mo807E().floatValue();
        boolean z10 = c6570h.f37371c;
        return (fFloatValue > 0.0f && !z10) || (interfaceC2041a.mo807E().floatValue() < c6570h.f37370b.mo807E().floatValue() && z10);
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m2276y(C6570h c6570h) {
        InterfaceC2041a<Float> interfaceC2041a = c6570h.f37369a;
        float fFloatValue = interfaceC2041a.mo807E().floatValue();
        float fFloatValue2 = c6570h.f37370b.mo807E().floatValue();
        boolean z10 = c6570h.f37371c;
        return (fFloatValue < fFloatValue2 && !z10) || (interfaceC2041a.mo807E().floatValue() > 0.0f && z10);
    }

    /* JADX INFO: renamed from: A */
    public final boolean m2277A(AccessibilityEvent accessibilityEvent) {
        if (!m2296t()) {
            return false;
        }
        View view = this.f4023d;
        return view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: B */
    public final boolean m2278B(int i10, int i11, Integer num, List<String> list) {
        if (i10 != Integer.MIN_VALUE && m2296t()) {
            AccessibilityEvent accessibilityEventM2291m = m2291m(i10, i11);
            if (num != null) {
                accessibilityEventM2291m.setContentChangeTypes(num.intValue());
            }
            if (list != null) {
                accessibilityEventM2291m.setContentDescription(C8573r0.m16721e0(list));
            }
            return m2277A(accessibilityEventM2291m);
        }
        return false;
    }

    /* JADX INFO: renamed from: D */
    public final void m2279D(String str, int i10, int i11) {
        AccessibilityEvent accessibilityEventM2291m = m2291m(m2298z(i10), 32);
        accessibilityEventM2291m.setContentChangeTypes(i11);
        if (str != null) {
            accessibilityEventM2291m.getText().add(str);
        }
        m2277A(accessibilityEventM2291m);
    }

    /* JADX INFO: renamed from: E */
    public final void m2280E(int i10) {
        C0560f c0560f = this.f4039t;
        if (c0560f != null) {
            SemanticsNode semanticsNode = c0560f.f4054a;
            if (i10 != semanticsNode.f4402g) {
                return;
            }
            if (SystemClock.uptimeMillis() - c0560f.f4059f <= 1000) {
                AccessibilityEvent accessibilityEventM2291m = m2291m(m2298z(semanticsNode.f4402g), 131072);
                accessibilityEventM2291m.setFromIndex(c0560f.f4057d);
                accessibilityEventM2291m.setToIndex(c0560f.f4058e);
                accessibilityEventM2291m.setAction(c0560f.f4055b);
                accessibilityEventM2291m.setMovementGranularity(c0560f.f4056c);
                accessibilityEventM2291m.getText().add(m2271r(semanticsNode));
                m2277A(accessibilityEventM2291m);
            }
        }
        this.f4039t = null;
    }

    /* JADX INFO: renamed from: F */
    public final void m2281F(final C0616d1 c0616d1) {
        if (c0616d1.mo2089o()) {
            this.f4023d.getSnapshotObserver().m2205b(c0616d1, this.f4022F, new InterfaceC2041a<C9072e>(this) { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendScrollEventIfNeeded$1

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat f4074c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.f4074c = this;
                }

                /* JADX WARN: Code duplicated, block: B:20:0x0058  */
                /* JADX WARN: Code duplicated, block: B:22:0x007a  */
                /* JADX WARN: Code duplicated, block: B:24:0x00a4  */
                /* JADX WARN: Code duplicated, block: B:27:0x00d4  */
                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final C9072e mo807E() {
                    AccessibilityEvent accessibilityEventM2291m;
                    C0616d1 c0616d2 = c0616d1;
                    C6570h c6570h = c0616d2.f4302e;
                    C6570h c6570h2 = c0616d2.f4303f;
                    Float f3 = c0616d2.f4300c;
                    Float f10 = c0616d2.f4301d;
                    float fFloatValue = (c6570h == null || f3 == null) ? 0.0f : c6570h.f37369a.mo807E().floatValue() - f3.floatValue();
                    float fFloatValue2 = (c6570h2 == null || f10 == null) ? 0.0f : c6570h2.f37369a.mo807E().floatValue() - f10.floatValue();
                    if (fFloatValue == 0.0f) {
                        if (!(fFloatValue2 == 0.0f)) {
                            int i10 = c0616d2.f4298a;
                            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.f4074c;
                            int iM2298z = androidComposeViewAccessibilityDelegateCompat.m2298z(i10);
                            AndroidComposeViewAccessibilityDelegateCompat.m2268C(androidComposeViewAccessibilityDelegateCompat, iM2298z, 2048, 1, 8);
                            accessibilityEventM2291m = androidComposeViewAccessibilityDelegateCompat.m2291m(iM2298z, 4096);
                            if (c6570h != null) {
                                accessibilityEventM2291m.setScrollX((int) c6570h.f37369a.mo807E().floatValue());
                                accessibilityEventM2291m.setMaxScrollX((int) c6570h.f37370b.mo807E().floatValue());
                            }
                            if (c6570h2 != null) {
                                accessibilityEventM2291m.setScrollY((int) c6570h2.f37369a.mo807E().floatValue());
                                accessibilityEventM2291m.setMaxScrollY((int) c6570h2.f37370b.mo807E().floatValue());
                            }
                            if (Build.VERSION.SDK_INT >= 28) {
                                AndroidComposeViewAccessibilityDelegateCompat.C0557c.m2300a(accessibilityEventM2291m, (int) fFloatValue, (int) fFloatValue2);
                            }
                            androidComposeViewAccessibilityDelegateCompat.m2277A(accessibilityEventM2291m);
                        }
                    } else {
                        int i11 = c0616d2.f4298a;
                        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2 = this.f4074c;
                        int iM2298z2 = androidComposeViewAccessibilityDelegateCompat2.m2298z(i11);
                        AndroidComposeViewAccessibilityDelegateCompat.m2268C(androidComposeViewAccessibilityDelegateCompat2, iM2298z2, 2048, 1, 8);
                        accessibilityEventM2291m = androidComposeViewAccessibilityDelegateCompat2.m2291m(iM2298z2, 4096);
                        if (c6570h != null) {
                            accessibilityEventM2291m.setScrollX((int) c6570h.f37369a.mo807E().floatValue());
                            accessibilityEventM2291m.setMaxScrollX((int) c6570h.f37370b.mo807E().floatValue());
                        }
                        if (c6570h2 != null) {
                            accessibilityEventM2291m.setScrollY((int) c6570h2.f37369a.mo807E().floatValue());
                            accessibilityEventM2291m.setMaxScrollY((int) c6570h2.f37370b.mo807E().floatValue());
                        }
                        if (Build.VERSION.SDK_INT >= 28) {
                            AndroidComposeViewAccessibilityDelegateCompat.C0557c.m2300a(accessibilityEventM2291m, (int) fFloatValue, (int) fFloatValue2);
                        }
                        androidComposeViewAccessibilityDelegateCompat2.m2277A(accessibilityEventM2291m);
                    }
                    if (c6570h != null) {
                        c0616d2.f4300c = c6570h.f37369a.mo807E();
                    }
                    if (c6570h2 != null) {
                        c0616d2.f4301d = c6570h2.f37369a.mo807E();
                    }
                    return C9072e.f47360a;
                }
            });
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m2282G(SemanticsNode semanticsNode, C0561g c0561g) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<SemanticsNode> listM2538i = semanticsNode.m2538i();
        int size = listM2538i.size();
        int i10 = 0;
        while (true) {
            LayoutNode layoutNode = semanticsNode.f4398c;
            if (i10 >= size) {
                Iterator it = c0561g.f4062c.iterator();
                while (it.hasNext()) {
                    if (!linkedHashSet.contains(Integer.valueOf(((Number) it.next()).intValue()))) {
                        m2297u(layoutNode);
                        return;
                    }
                }
                List<SemanticsNode> listM2538i2 = semanticsNode.m2538i();
                int size2 = listM2538i2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    SemanticsNode semanticsNode2 = listM2538i2.get(i11);
                    if (m2295q().containsKey(Integer.valueOf(semanticsNode2.f4402g))) {
                        Object obj = this.f4017A.get(Integer.valueOf(semanticsNode2.f4402g));
                        C5207g.m11108c(obj);
                        m2282G(semanticsNode2, (C0561g) obj);
                    }
                }
                return;
            }
            SemanticsNode semanticsNode3 = listM2538i.get(i10);
            if (m2295q().containsKey(Integer.valueOf(semanticsNode3.f4402g))) {
                LinkedHashSet linkedHashSet2 = c0561g.f4062c;
                int i12 = semanticsNode3.f4402g;
                if (!linkedHashSet2.contains(Integer.valueOf(i12))) {
                    m2297u(layoutNode);
                    return;
                }
                linkedHashSet.add(Integer.valueOf(i12));
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m2283H(LayoutNode layoutNode, C8448d<Integer> c8448d) {
        LayoutNode layoutNodeM2488f;
        InterfaceC6154k0 interfaceC6154k0M16750q0;
        if (layoutNode.m2136z() && !this.f4023d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            InterfaceC6154k0 interfaceC6154k0M16750q1 = C8573r0.m16750q0(layoutNode);
            if (interfaceC6154k0M16750q1 == null) {
                LayoutNode layoutNodeM2488f2 = C0666u.m2488f(layoutNode, new InterfaceC2052l<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsWrapper$1
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final Boolean mo528n(LayoutNode layoutNode2) {
                        LayoutNode layoutNode3 = layoutNode2;
                        C5207g.m11111f(layoutNode3, "it");
                        return Boolean.valueOf(C8573r0.m16750q0(layoutNode3) != null);
                    }
                });
                interfaceC6154k0M16750q1 = layoutNodeM2488f2 != null ? C8573r0.m16750q0(layoutNodeM2488f2) : null;
                if (interfaceC6154k0M16750q1 == null) {
                    return;
                }
            }
            if (!C6156l0.m12666a(interfaceC6154k0M16750q1).f37392b && (layoutNodeM2488f = C0666u.m2488f(layoutNode, new InterfaceC2052l<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1
                /* JADX WARN: Code duplicated, block: B:9:0x0020  */
                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final Boolean mo528n(LayoutNode layoutNode2) {
                    boolean z10;
                    C6572j c6572jM12666a;
                    LayoutNode layoutNode3 = layoutNode2;
                    C5207g.m11111f(layoutNode3, "it");
                    InterfaceC6154k0 interfaceC6154k0M16750q2 = C8573r0.m16750q0(layoutNode3);
                    if (interfaceC6154k0M16750q2 == null || (c6572jM12666a = C6156l0.m12666a(interfaceC6154k0M16750q2)) == null) {
                        z10 = false;
                    } else {
                        z10 = true;
                        if (!c6572jM12666a.f37392b) {
                            z10 = false;
                        }
                    }
                    return Boolean.valueOf(z10);
                }
            })) != null && (interfaceC6154k0M16750q0 = C8573r0.m16750q0(layoutNodeM2488f)) != null) {
                interfaceC6154k0M16750q1 = interfaceC6154k0M16750q0;
            }
            int i10 = C6139d.m12652e(interfaceC6154k0M16750q1).f3766b;
            if (c8448d.add(Integer.valueOf(i10))) {
                m2268C(this, m2298z(i10), 2048, 1, 8);
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final boolean m2284I(SemanticsNode semanticsNode, int i10, int i11, boolean z10) {
        String strM2271r;
        C0685a<C6563a<InterfaceC2057q<Integer, Integer, Boolean, Boolean>>> c0685a = C6571i.f37377f;
        C6572j c6572j = semanticsNode.f4401f;
        if (c6572j.m13163f(c0685a) && C0666u.m2483a(semanticsNode)) {
            InterfaceC2057q interfaceC2057q = (InterfaceC2057q) ((C6563a) c6572j.m13164g(c0685a)).f37363b;
            return interfaceC2057q != null ? ((Boolean) interfaceC2057q.mo1343M(Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue() : false;
        }
        if ((i10 != i11 || i11 != this.f4034o) && (strM2271r = m2271r(semanticsNode)) != null) {
            if (i10 < 0 || i10 != i11 || i11 > strM2271r.length()) {
                i10 = -1;
            }
            this.f4034o = i10;
            boolean z11 = strM2271r.length() > 0;
            int i12 = semanticsNode.f4402g;
            m2277A(m2292n(m2298z(i12), z11 ? Integer.valueOf(this.f4034o) : null, z11 ? Integer.valueOf(this.f4034o) : null, z11 ? Integer.valueOf(strM2271r.length()) : null, strM2271r));
            m2280E(i12);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:40:0x0118 A[LOOP:1: B:8:0x0032->B:40:0x0118, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x0120 A[EDGE_INSN: B:56:0x0120->B:41:0x0120 BREAK  A[LOOP:1: B:8:0x0032->B:40:0x0118], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J */
    public final ArrayList m2285J(ArrayList arrayList, boolean z10) {
        ArrayList arrayList2;
        boolean z11;
        C8942d c8942d;
        boolean z12;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            m2269K(arrayList3, linkedHashMap, this, z10, (SemanticsNode) arrayList.get(i10));
        }
        ArrayList arrayList4 = new ArrayList();
        int iM17249o = C9000b.m17249o(arrayList3);
        if (iM17249o >= 0) {
            int i11 = 0;
            while (true) {
                SemanticsNode semanticsNode = (SemanticsNode) arrayList3.get(i11);
                if (i11 != 0) {
                    C8942d c8942dM2534e = semanticsNode.m2534e();
                    C8942d c8942dM2534e2 = semanticsNode.m2534e();
                    int iM17249o2 = C9000b.m17249o(arrayList4);
                    if (iM17249o2 >= 0) {
                        int i12 = 0;
                        while (true) {
                            C8942d c8942d2 = (C8942d) ((Pair) arrayList4.get(i12)).f38012a;
                            float f3 = c8942d2.f46895b;
                            float f10 = c8942d2.f46897d;
                            boolean z13 = f3 >= f10;
                            float f11 = c8942dM2534e.f46895b;
                            arrayList2 = arrayList3;
                            float f12 = c8942dM2534e2.f46897d;
                            if (z13) {
                                c8942d = c8942dM2534e;
                            } else if (f11 >= f12) {
                                c8942d = c8942dM2534e;
                            } else {
                                c8942d = c8942dM2534e;
                                z12 = Math.max(Float.valueOf(f3).floatValue(), Float.valueOf(f11).floatValue()) < Math.min(Float.valueOf(f10).floatValue(), Float.valueOf(f12).floatValue());
                            }
                            if (z12) {
                                arrayList4.set(i12, new Pair(new C8942d(Math.max(c8942d2.f46894a, 0.0f), Math.max(c8942d2.f46895b, f11), Math.min(c8942d2.f46896c, Float.POSITIVE_INFINITY), Math.min(f10, f12)), ((Pair) arrayList4.get(i12)).f38013b));
                                ((List) ((Pair) arrayList4.get(i12)).f38013b).add(semanticsNode);
                                z11 = true;
                                break;
                            }
                            if (i12 != iM17249o2) {
                                i12++;
                                arrayList3 = arrayList2;
                                c8942dM2534e = c8942d;
                            }
                        }
                        if (!z11) {
                        }
                        if (i11 == iM17249o) {
                            break;
                        }
                        i11++;
                        arrayList3 = arrayList2;
                    } else {
                        arrayList2 = arrayList3;
                    }
                    z11 = false;
                    if (!z11) {
                    }
                    if (i11 == iM17249o) {
                        break;
                        break;
                    }
                    i11++;
                    arrayList3 = arrayList2;
                } else {
                    arrayList2 = arrayList3;
                }
                arrayList4.add(new Pair(semanticsNode.m2534e(), C9000b.m17254t(semanticsNode)));
                if (i11 == iM17249o) {
                    break;
                    break;
                }
                i11++;
                arrayList3 = arrayList2;
            }
        }
        C9326n.m17682B(arrayList4, C7499b.m14949l(new InterfaceC2052l<Pair<? extends C8942d, ? extends List<SemanticsNode>>, Comparable<?>>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Comparable<?> mo528n(Pair<? extends C8942d, ? extends List<SemanticsNode>> pair) {
                Pair<? extends C8942d, ? extends List<SemanticsNode>> pair2 = pair;
                C5207g.m11111f(pair2, "it");
                return Float.valueOf(((C8942d) pair2.f38012a).f46895b);
            }
        }, new InterfaceC2052l<Pair<? extends C8942d, ? extends List<SemanticsNode>>, Comparable<?>>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Comparable<?> mo528n(Pair<? extends C8942d, ? extends List<SemanticsNode>> pair) {
                Pair<? extends C8942d, ? extends List<SemanticsNode>> pair2 = pair;
                C5207g.m11111f(pair2, "it");
                return Float.valueOf(((C8942d) pair2.f38012a).f46897d);
            }
        }));
        ArrayList arrayList5 = new ArrayList();
        int size2 = arrayList4.size();
        for (int i13 = 0; i13 < size2; i13++) {
            Pair pair = (Pair) arrayList4.get(i13);
            List list = (List) pair.f38013b;
            C10317j c10317jM14949l = C7499b.m14949l(new InterfaceC2052l<SemanticsNode, Comparable<?>>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$comparator$1
                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final Comparable<?> mo528n(SemanticsNode semanticsNode2) {
                    SemanticsNode semanticsNode3 = semanticsNode2;
                    C5207g.m11111f(semanticsNode3, "it");
                    return Float.valueOf(semanticsNode3.m2534e().f46894a);
                }
            }, new InterfaceC2052l<SemanticsNode, Comparable<?>>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$comparator$2
                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final Comparable<?> mo528n(SemanticsNode semanticsNode2) {
                    SemanticsNode semanticsNode3 = semanticsNode2;
                    C5207g.m11111f(semanticsNode3, "it");
                    return Float.valueOf(semanticsNode3.m2534e().f46895b);
                }
            }, new InterfaceC2052l<SemanticsNode, Comparable<?>>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$comparator$3
                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final Comparable<?> mo528n(SemanticsNode semanticsNode2) {
                    SemanticsNode semanticsNode3 = semanticsNode2;
                    C5207g.m11111f(semanticsNode3, "it");
                    return Float.valueOf(semanticsNode3.m2534e().f46897d);
                }
            }, new InterfaceC2052l<SemanticsNode, Comparable<?>>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$comparator$4
                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final Comparable<?> mo528n(SemanticsNode semanticsNode2) {
                    SemanticsNode semanticsNode3 = semanticsNode2;
                    C5207g.m11111f(semanticsNode3, "it");
                    return Float.valueOf(semanticsNode3.m2534e().f46896c);
                }
            });
            if (z10) {
                c10317jM14949l = C7499b.m14949l(new InterfaceC2052l<SemanticsNode, Comparable<?>>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$1
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final Comparable<?> mo528n(SemanticsNode semanticsNode2) {
                        SemanticsNode semanticsNode3 = semanticsNode2;
                        C5207g.m11111f(semanticsNode3, "it");
                        return Float.valueOf(semanticsNode3.m2534e().f46896c);
                    }
                }, new InterfaceC2052l<SemanticsNode, Comparable<?>>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$2
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final Comparable<?> mo528n(SemanticsNode semanticsNode2) {
                        SemanticsNode semanticsNode3 = semanticsNode2;
                        C5207g.m11111f(semanticsNode3, "it");
                        return Float.valueOf(semanticsNode3.m2534e().f46895b);
                    }
                }, new InterfaceC2052l<SemanticsNode, Comparable<?>>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$3
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final Comparable<?> mo528n(SemanticsNode semanticsNode2) {
                        SemanticsNode semanticsNode3 = semanticsNode2;
                        C5207g.m11111f(semanticsNode3, "it");
                        return Float.valueOf(semanticsNode3.m2534e().f46897d);
                    }
                }, new InterfaceC2052l<SemanticsNode, Comparable<?>>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$4
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final Comparable<?> mo528n(SemanticsNode semanticsNode2) {
                        SemanticsNode semanticsNode3 = semanticsNode2;
                        C5207g.m11111f(semanticsNode3, "it");
                        return Float.valueOf(semanticsNode3.m2534e().f46894a);
                    }
                });
            }
            C9326n.m17682B(list, new C0663t(new C0660s(c10317jM14949l, LayoutNode.f3744g0)));
            List list2 = (List) pair.f38013b;
            int size3 = list2.size();
            for (int i14 = 0; i14 < size3; i14++) {
                SemanticsNode semanticsNode2 = (SemanticsNode) list2.get(i14);
                List list3 = (List) linkedHashMap.get(Integer.valueOf(semanticsNode2.f4402g));
                arrayList5.addAll(list3 != null ? list3 : C9000b.m17254t(semanticsNode2));
            }
        }
        return arrayList5;
    }

    /* JADX INFO: renamed from: M */
    public final void m2286M(int i10) {
        int i11 = this.f4024e;
        if (i11 == i10) {
            return;
        }
        this.f4024e = i10;
        m2268C(this, i10, BuildConfig.SDK_TRUNCATE_LENGTH, null, 12);
        m2268C(this, i11, 256, null, 12);
    }

    @Override // p471x2.C10026a
    /* JADX INFO: renamed from: b */
    public final C10285g mo2287b(View view) {
        C5207g.m11111f(view, "host");
        return this.f4030k;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0135  */
    /* JADX INFO: renamed from: j */
    public final void m2288j(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        SemanticsNode semanticsNode;
        String str2;
        long jMo2159N;
        RectF rectF;
        C0620e1 c0620e1 = m2295q().get(Integer.valueOf(i10));
        if (c0620e1 == null || (semanticsNode = c0620e1.f4307a) == null) {
            return;
        }
        String strM2271r = m2271r(semanticsNode);
        if (C5207g.m11106a(str, this.f4044y)) {
            Integer num = this.f4042w.get(Integer.valueOf(i10));
            if (num != null) {
                accessibilityNodeInfo.getExtras().putInt(str, num.intValue());
                return;
            }
            return;
        }
        if (C5207g.m11106a(str, this.f4045z)) {
            Integer num2 = this.f4043x.get(Integer.valueOf(i10));
            if (num2 != null) {
                accessibilityNodeInfo.getExtras().putInt(str, num2.intValue());
                return;
            }
            return;
        }
        C0685a<C6563a<InterfaceC2052l<List<C7216j>, Boolean>>> c0685a = C6571i.f37372a;
        C6572j c6572j = semanticsNode.f4401f;
        if (!c6572j.m13163f(c0685a) || bundle == null || !C5207g.m11106a(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            C0685a<String> c0685a2 = SemanticsProperties.f4425r;
            if (!c6572j.m13163f(c0685a2) || bundle == null || !C5207g.m11106a(str, "androidx.compose.ui.semantics.testTag") || (str2 = (String) SemanticsConfigurationKt.m2529a(c6572j, c0685a2)) == null) {
                return;
            }
            accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
            return;
        }
        int i11 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i12 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i12 > 0 && i11 >= 0) {
            if (i11 < (strM2271r != null ? strM2271r.length() : Integer.MAX_VALUE)) {
                ArrayList arrayList = new ArrayList();
                InterfaceC2052l interfaceC2052l = (InterfaceC2052l) ((C6563a) c6572j.m13164g(c0685a)).f37363b;
                if (C5207g.m11106a(interfaceC2052l != null ? (Boolean) interfaceC2052l.mo528n(arrayList) : null, Boolean.TRUE)) {
                    C7216j c7216j = (C7216j) arrayList.get(0);
                    ArrayList arrayList2 = new ArrayList();
                    for (int i13 = 0; i13 < i12; i13++) {
                        int i14 = i11 + i13;
                        if (i14 >= c7216j.f40590a.f4564a.length()) {
                            arrayList2.add(null);
                        } else {
                            C0692c c0692c = c7216j.f40591b;
                            MultiParagraphIntrinsics multiParagraphIntrinsics = c0692c.f4556a;
                            if (!(i14 >= 0 && i14 < multiParagraphIntrinsics.f4456a.f4523a.length())) {
                                StringBuilder sbM614j = C0141b.m614j("offset(", i14, ") is out of bounds [0, ");
                                sbM614j.append(multiParagraphIntrinsics.f4456a.length());
                                sbM614j.append(')');
                                throw new IllegalArgumentException(sbM614j.toString().toString());
                            }
                            ArrayList arrayList3 = c0692c.f4563h;
                            C7208b c7208b = (C7208b) arrayList3.get(C8573r0.m16729i0(i14, arrayList3));
                            InterfaceC7207a interfaceC7207a = c7208b.f40548a;
                            int i15 = c7208b.f40549b;
                            C8942d c8942dMo2553j = interfaceC7207a.mo2553j(C0062b.m361k0(i14, i15, c7208b.f40550c) - i15);
                            C5207g.m11111f(c8942dMo2553j, "<this>");
                            C8942d c8942dM17173d = c8942dMo2553j.m17173d(C7499b.m14932c(0.0f, c7208b.f40553f));
                            NodeCoordinator nodeCoordinatorM2531b = semanticsNode.m2531b();
                            if (nodeCoordinatorM2531b == null) {
                                jMo2159N = C8941c.f46888b;
                            } else {
                                if (!nodeCoordinatorM2531b.mo2190q()) {
                                    nodeCoordinatorM2531b = null;
                                }
                                if (nodeCoordinatorM2531b != null) {
                                    jMo2159N = nodeCoordinatorM2531b.mo2159N(C8941c.f46888b);
                                } else {
                                    jMo2159N = C8941c.f46888b;
                                }
                            }
                            C8942d c8942dM17173d2 = c8942dM17173d.m17173d(jMo2159N);
                            C8942d c8942dM2533d = semanticsNode.m2533d();
                            C8942d c8942dM17171b = c8942dM17173d2.f46896c > c8942dM2533d.f46894a && c8942dM2533d.f46896c > c8942dM17173d2.f46894a && c8942dM17173d2.f46897d > c8942dM2533d.f46895b && c8942dM2533d.f46897d > c8942dM17173d2.f46895b ? c8942dM17173d2.m17171b(c8942dM2533d) : null;
                            if (c8942dM17171b != null) {
                                long jM14932c = C7499b.m14932c(c8942dM17171b.f46894a, c8942dM17171b.f46895b);
                                AndroidComposeView androidComposeView = this.f4023d;
                                long jMo2262k = androidComposeView.mo2262k(jM14932c);
                                long jMo2262k2 = androidComposeView.mo2262k(C7499b.m14932c(c8942dM17171b.f46896c, c8942dM17171b.f46897d));
                                rectF = new RectF(C8941c.m17164c(jMo2262k), C8941c.m17165d(jMo2262k), C8941c.m17164c(jMo2262k2), C8941c.m17165d(jMo2262k2));
                            } else {
                                rectF = null;
                            }
                            arrayList2.add(rectF);
                        }
                    }
                    accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new RectF[0]));
                    return;
                }
                return;
            }
        }
        Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0080  */
    /* JADX WARN: Code duplicated, block: B:31:0x008d A[Catch: all -> 0x00da, TRY_LEAVE, TryCatch #1 {all -> 0x00da, blocks: (B:14:0x0039, B:25:0x006d, B:29:0x0084, B:31:0x008d, B:35:0x009a, B:37:0x00a1, B:38:0x00b2, B:40:0x00ba, B:41:0x00c5, B:20:0x0054), top: B:54:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0099  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1 A[Catch: all -> 0x00da, LOOP:0: B:36:0x009f->B:37:0x00a1, LOOP_END, TryCatch #1 {all -> 0x00da, blocks: (B:14:0x0039, B:25:0x006d, B:29:0x0084, B:31:0x008d, B:35:0x009a, B:37:0x00a1, B:38:0x00b2, B:40:0x00ba, B:41:0x00c5, B:20:0x0054), top: B:54:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ba A[Catch: all -> 0x00da, TryCatch #1 {all -> 0x00da, blocks: (B:14:0x0039, B:25:0x006d, B:29:0x0084, B:31:0x008d, B:35:0x009a, B:37:0x00a1, B:38:0x00b2, B:40:0x00ba, B:41:0x00c5, B:20:0x0054), top: B:54:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00d7 -> B:15:0x003c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: k */
    public final java.lang.Object m2289k(p464wl.InterfaceC9968c<? super sl.C9072e> r15) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p017ui.platform.AndroidComposeViewAccessibilityDelegateCompat.m2289k(wl.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:64:0x010f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:? A[LOOP:0: B:21:0x0056->B:67:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: l */
    public final boolean m2290l(int i10, long j10, boolean z10) {
        C0685a<C6570h> c0685a;
        C6570h c6570h;
        boolean z11;
        Collection<C0620e1> collectionValues = m2295q().values();
        C5207g.m11111f(collectionValues, "currentSemanticsNodes");
        if (C8941c.m17162a(j10, C8941c.f46890d)) {
            return false;
        }
        if (!((Float.isNaN(C8941c.m17164c(j10)) || Float.isNaN(C8941c.m17165d(j10))) ? false : true)) {
            throw new IllegalStateException("Offset argument contained a NaN value.".toString());
        }
        if (z10) {
            c0685a = SemanticsProperties.f4422o;
        } else {
            if (z10) {
                throw new NoWhenBranchMatchedException();
            }
            c0685a = SemanticsProperties.f4421n;
        }
        if (collectionValues.isEmpty()) {
            return false;
        }
        for (C0620e1 c0620e1 : collectionValues) {
            Rect rect = c0620e1.f4308b;
            C5207g.m11111f(rect, "<this>");
            if ((C8941c.m17164c(j10) >= ((float) rect.left) && C8941c.m17164c(j10) < ((float) rect.right) && C8941c.m17165d(j10) >= ((float) rect.top) && C8941c.m17165d(j10) < ((float) rect.bottom)) && (c6570h = (C6570h) SemanticsConfigurationKt.m2529a(c0620e1.f4307a.m2536g(), c0685a)) != null) {
                boolean z12 = c6570h.f37371c;
                int i11 = z12 ? -i10 : i10;
                if (i10 == 0 && z12) {
                    i11 = -1;
                }
                InterfaceC2041a<Float> interfaceC2041a = c6570h.f37369a;
                if (i11 < 0) {
                    z11 = interfaceC2041a.mo807E().floatValue() > 0.0f;
                } else if (interfaceC2041a.mo807E().floatValue() < c6570h.f37370b.mo807E().floatValue()) {
                }
                if (z11) {
                    return true;
                }
            }
            if (z11) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final AccessibilityEvent m2291m(int i10, int i11) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i11);
        C5207g.m11110e(accessibilityEventObtain, "obtain(eventType)");
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        AndroidComposeView androidComposeView = this.f4023d;
        accessibilityEventObtain.setPackageName(androidComposeView.getContext().getPackageName());
        accessibilityEventObtain.setSource(androidComposeView, i10);
        C0620e1 c0620e1 = m2295q().get(Integer.valueOf(i10));
        if (c0620e1 != null) {
            accessibilityEventObtain.setPassword(C0666u.m2485c(c0620e1.f4307a));
        }
        return accessibilityEventObtain;
    }

    /* JADX INFO: renamed from: n */
    public final AccessibilityEvent m2292n(int i10, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventM2291m = m2291m(i10, 8192);
        if (num != null) {
            accessibilityEventM2291m.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventM2291m.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventM2291m.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventM2291m.getText().add(charSequence);
        }
        return accessibilityEventM2291m;
    }

    /* JADX INFO: renamed from: o */
    public final int m2293o(SemanticsNode semanticsNode) {
        C0685a<List<String>> c0685a = SemanticsProperties.f4408a;
        C6572j c6572j = semanticsNode.f4401f;
        if (!c6572j.m13163f(c0685a)) {
            C0685a<C7217k> c0685a2 = SemanticsProperties.f4428u;
            if (c6572j.m13163f(c0685a2)) {
                return C7217k.m14539a(((C7217k) c6572j.m13164g(c0685a2)).f40598a);
            }
        }
        return this.f4034o;
    }

    /* JADX INFO: renamed from: p */
    public final int m2294p(SemanticsNode semanticsNode) {
        C0685a<List<String>> c0685a = SemanticsProperties.f4408a;
        C6572j c6572j = semanticsNode.f4401f;
        if (!c6572j.m13163f(c0685a)) {
            C0685a<C7217k> c0685a2 = SemanticsProperties.f4428u;
            if (c6572j.m13163f(c0685a2)) {
                return (int) (((C7217k) c6572j.m13164g(c0685a2)).f40598a >> 32);
            }
        }
        return this.f4034o;
    }

    /* JADX INFO: renamed from: q */
    public final Map<Integer, C0620e1> m2295q() {
        if (this.f4038s) {
            this.f4038s = false;
            C6575m semanticsOwner = this.f4023d.getSemanticsOwner();
            C5207g.m11111f(semanticsOwner, "<this>");
            SemanticsNode semanticsNodeM13166a = semanticsOwner.m13166a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LayoutNode layoutNode = semanticsNodeM13166a.f4398c;
            if (layoutNode.f3749L) {
                if (layoutNode.m2136z()) {
                    Region region = new Region();
                    C8942d c8942dM2533d = semanticsNodeM13166a.m2533d();
                    region.set(new Rect(C8573r0.m16710Y0(c8942dM2533d.f46894a), C8573r0.m16710Y0(c8942dM2533d.f46895b), C8573r0.m16710Y0(c8942dM2533d.f46896c), C8573r0.m16710Y0(c8942dM2533d.f46897d)));
                    C0666u.m2489g(region, semanticsNodeM13166a, linkedHashMap, semanticsNodeM13166a);
                }
            }
            this.f4040u = linkedHashMap;
            HashMap<Integer, Integer> map = this.f4042w;
            map.clear();
            HashMap<Integer, Integer> map2 = this.f4043x;
            map2.clear();
            C0620e1 c0620e1 = m2295q().get(-1);
            SemanticsNode semanticsNode = c0620e1 != null ? c0620e1.f4307a : null;
            C5207g.m11108c(semanticsNode);
            int i10 = 1;
            ArrayList arrayListM2285J = m2285J(C6752c.m13454v0(semanticsNode.m2535f(!semanticsNode.f4397b, false)), C0666u.m2486d(semanticsNode));
            int iM17249o = C9000b.m17249o(arrayListM2285J);
            if (1 <= iM17249o) {
                while (true) {
                    int i11 = ((SemanticsNode) arrayListM2285J.get(i10 - 1)).f4402g;
                    int i12 = ((SemanticsNode) arrayListM2285J.get(i10)).f4402g;
                    map.put(Integer.valueOf(i11), Integer.valueOf(i12));
                    map2.put(Integer.valueOf(i12), Integer.valueOf(i11));
                    if (i10 == iM17249o) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return this.f4040u;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m2296t() {
        if (this.f4025f.isEnabled()) {
            List<AccessibilityServiceInfo> list = this.f4028i;
            C5207g.m11110e(list, "enabledServices");
            if (!list.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public final void m2297u(LayoutNode layoutNode) {
        if (this.f4036q.add(layoutNode)) {
            this.f4037r.mo16479j(C9072e.f47360a);
        }
    }

    /* JADX INFO: renamed from: z */
    public final int m2298z(int i10) {
        if (i10 == this.f4023d.getSemanticsOwner().m13166a().f4402g) {
            i10 = -1;
        }
        return i10;
    }
}
