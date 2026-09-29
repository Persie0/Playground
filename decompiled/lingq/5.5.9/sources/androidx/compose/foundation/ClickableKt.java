package androidx.compose.foundation;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.result.C0204c;
import androidx.compose.p017ui.ComposedModifierKt;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.focus.C0510b;
import androidx.compose.p017ui.input.key.OnKeyEventElement;
import androidx.compose.p017ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p017ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p017ui.platform.C0658r0;
import androidx.compose.p017ui.platform.C0661s0;
import androidx.compose.p017ui.platform.CompositionLocalsKt;
import androidx.compose.p017ui.platform.InspectableValueKt;
import androidx.compose.p017ui.semantics.SemanticsProperties;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import dm.C5212l;
import java.util.LinkedHashMap;
import java.util.Map;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.C7828f;
import no.InterfaceC7882z;
import p002a1.InterfaceC0007b;
import p021b0.C1277b;
import p022b1.C1288a;
import p022b1.C1289b;
import p081e0.C5304d1;
import p081e0.C5319k;
import p081e0.C5329p;
import p081e0.C5332q0;
import p081e0.C5333r;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5312g0;
import p081e0.InterfaceC5327o;
import p081e0.InterfaceC5336s0;
import p210k1.C6563a;
import p210k1.C6569g;
import p210k1.C6571i;
import p210k1.C6576n;
import p210k1.InterfaceC6577o;
import p260m8.C7499b;
import p338qd.C8573r0;
import p351r0.InterfaceC8691j;
import p375s0.C8941c;
import p386t.C9113e;
import p386t.C9114f;
import p386t.C9128t;
import p386t.C9129u;
import p386t.InterfaceC9126r;
import p386t.InterfaceC9127s;
import p423v.C9613k;
import p423v.C9615m;
import p423v.InterfaceC9612j;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class ClickableKt {
    /* JADX INFO: renamed from: a */
    public static final void m1407a(final InterfaceC9612j interfaceC9612j, final InterfaceC5312g0<C9615m> interfaceC5312g0, final Map<C1288a, C9615m> map, InterfaceC0476a interfaceC0476a, final int i10) {
        C5207g.m11111f(interfaceC9612j, "interactionSource");
        C5207g.m11111f(interfaceC5312g0, "pressedInteraction");
        C5207g.m11111f(map, "currentKeyPressInteractions");
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(1297229208);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        C5333r.m11459a(interfaceC9612j, new InterfaceC2052l<C5329p, InterfaceC5327o>() { // from class: androidx.compose.foundation.ClickableKt$PressedInteractionSourceDisposableEffect$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final InterfaceC5327o mo528n(C5329p c5329p) {
                C5207g.m11111f(c5329p, "$this$DisposableEffect");
                return new C9113e(interfaceC5312g0, map, interfaceC9612j);
            }
        }, composerImplMo1636j);
        C5332q0 c5332q0M1612T = composerImplMo1636j.m1612T();
        if (c5332q0M1612T == null) {
            return;
        }
        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.ClickableKt$PressedInteractionSourceDisposableEffect$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                num.intValue();
                int iM16737l1 = C8573r0.m16737l1(i10 | 1);
                InterfaceC5312g0<C9615m> interfaceC5312g1 = interfaceC5312g0;
                Map<C1288a, C9615m> map2 = map;
                ClickableKt.m1407a(interfaceC9612j, interfaceC5312g1, map2, interfaceC0476a2, iM16737l1);
                return C9072e.f47360a;
            }
        };
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC0500b m1408b(InterfaceC0500b interfaceC0500b, final InterfaceC9612j interfaceC9612j, final InterfaceC9126r interfaceC9126r, final boolean z10, final String str, final C6569g c6569g, final InterfaceC2041a<C9072e> interfaceC2041a) {
        C5207g.m11111f(interfaceC0500b, "$this$clickable");
        C5207g.m11111f(interfaceC9612j, "interactionSource");
        C5207g.m11111f(interfaceC2041a, "onClick");
        return ComposedModifierKt.m1927a(interfaceC0500b, InspectableValueKt.f4184a, new InterfaceC2057q<InterfaceC0500b, InterfaceC0476a, Integer, InterfaceC0500b>() { // from class: androidx.compose.foundation.ClickableKt$clickable$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // cm.InterfaceC2057q
            /* JADX INFO: renamed from: M */
            public final InterfaceC0500b mo1343M(InterfaceC0500b interfaceC0500b2, InterfaceC0476a interfaceC0476a, Integer num) {
                InterfaceC0476a interfaceC0476a2 = interfaceC0476a;
                C0204c.m861u(num, interfaceC0500b2, "$this$composed", interfaceC0476a2, 92076020);
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                final InterfaceC2041a<C9072e> interfaceC2041a2 = interfaceC2041a;
                InterfaceC5312g0 interfaceC5312g0M16704V0 = C8573r0.m16704V0(interfaceC2041a2, interfaceC0476a2);
                interfaceC0476a2.mo1622c(-492369756);
                Object objMo1624d = interfaceC0476a2.mo1624d();
                InterfaceC0476a.a.C10586a c10586a = InterfaceC0476a.a.f3122a;
                if (objMo1624d == c10586a) {
                    objMo1624d = C8573r0.m16684L0(null);
                    interfaceC0476a2.mo1655t(objMo1624d);
                }
                interfaceC0476a2.mo1661w();
                InterfaceC5312g0 interfaceC5312g0 = (InterfaceC5312g0) objMo1624d;
                interfaceC0476a2.mo1622c(-492369756);
                Object objMo1624d2 = interfaceC0476a2.mo1624d();
                if (objMo1624d2 == c10586a) {
                    objMo1624d2 = new LinkedHashMap();
                    interfaceC0476a2.mo1655t(objMo1624d2);
                }
                interfaceC0476a2.mo1661w();
                final Map map = (Map) objMo1624d2;
                interfaceC0476a2.mo1622c(1841981561);
                final InterfaceC9612j interfaceC9612j2 = interfaceC9612j;
                boolean z11 = z10;
                if (z11) {
                    ClickableKt.m1407a(interfaceC9612j2, interfaceC5312g0, map, interfaceC0476a2, 560);
                }
                interfaceC0476a2.mo1661w();
                int i10 = C9114f.f47614b;
                interfaceC0476a2.mo1622c(-1990508712);
                final View view = (View) interfaceC0476a2.mo1648p(AndroidCompositionLocals_androidKt.f4088f);
                final InterfaceC2041a<Boolean> interfaceC2041a3 = new InterfaceC2041a<Boolean>() { // from class: androidx.compose.foundation.Clickable_androidKt$isComposeRootInScrollableContainer$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final Boolean mo807E() {
                        boolean z12;
                        ViewParent parent = view.getParent();
                        while (parent != null && (parent instanceof ViewGroup)) {
                            ViewGroup viewGroup = (ViewGroup) parent;
                            if (viewGroup.shouldDelayChildPressedState()) {
                                z12 = true;
                                return Boolean.valueOf(z12);
                            }
                            parent = viewGroup.getParent();
                        }
                        z12 = false;
                        return Boolean.valueOf(z12);
                    }
                };
                interfaceC0476a2.mo1661w();
                interfaceC0476a2.mo1622c(-492369756);
                Object objMo1624d3 = interfaceC0476a2.mo1624d();
                if (objMo1624d3 == c10586a) {
                    objMo1624d3 = C8573r0.m16684L0(Boolean.TRUE);
                    interfaceC0476a2.mo1655t(objMo1624d3);
                }
                interfaceC0476a2.mo1661w();
                final InterfaceC5312g0 interfaceC5312g1 = (InterfaceC5312g0) objMo1624d3;
                interfaceC0476a2.mo1622c(511388516);
                boolean zMo1665y = interfaceC0476a2.mo1665y(interfaceC5312g1) | interfaceC0476a2.mo1665y(interfaceC2041a3);
                Object objMo1624d4 = interfaceC0476a2.mo1624d();
                if (zMo1665y || objMo1624d4 == c10586a) {
                    objMo1624d4 = new InterfaceC2041a<Boolean>() { // from class: androidx.compose.foundation.ClickableKt$clickable$4$delayPressInteraction$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final Boolean mo807E() {
                            return Boolean.valueOf(interfaceC5312g1.getValue().booleanValue() || interfaceC2041a3.mo807E().booleanValue());
                        }
                    };
                    interfaceC0476a2.mo1655t(objMo1624d4);
                }
                interfaceC0476a2.mo1661w();
                InterfaceC5312g0 interfaceC5312g0M16704V1 = C8573r0.m16704V0(objMo1624d4, interfaceC0476a2);
                interfaceC0476a2.mo1622c(-492369756);
                Object objMo1624d5 = interfaceC0476a2.mo1624d();
                if (objMo1624d5 == c10586a) {
                    objMo1624d5 = C8573r0.m16684L0(new C8941c(C8941c.f46888b));
                    interfaceC0476a2.mo1655t(objMo1624d5);
                }
                interfaceC0476a2.mo1661w();
                final InterfaceC5312g0 interfaceC5312g2 = (InterfaceC5312g0) objMo1624d5;
                InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                Boolean boolValueOf = Boolean.valueOf(z11);
                InterfaceC9612j interfaceC9612j3 = interfaceC9612j;
                Object[] objArr = {interfaceC5312g2, Boolean.valueOf(z11), interfaceC9612j3, interfaceC5312g0, interfaceC5312g0M16704V1, interfaceC5312g0M16704V0};
                boolean z12 = z10;
                interfaceC0476a2.mo1622c(-568225417);
                boolean zMo1665y2 = false;
                for (int i11 = 0; i11 < 6; i11++) {
                    zMo1665y2 |= interfaceC0476a2.mo1665y(objArr[i11]);
                }
                Object objMo1624d6 = interfaceC0476a2.mo1624d();
                if (zMo1665y2 || objMo1624d6 == c10586a) {
                    ClickableKt$clickable$4$gesture$1$1 clickableKt$clickable$4$gesture$1$1 = new ClickableKt$clickable$4$gesture$1$1(interfaceC5312g2, z12, interfaceC9612j3, interfaceC5312g0, interfaceC5312g0M16704V1, interfaceC5312g0M16704V0, null);
                    interfaceC0476a2.mo1655t(clickableKt$clickable$4$gesture$1$1);
                    objMo1624d6 = clickableKt$clickable$4$gesture$1$1;
                }
                interfaceC0476a2.mo1661w();
                InterfaceC0500b interfaceC0500bM2033b = SuspendingPointerInputFilterKt.m2033b(aVar, interfaceC9612j2, boolValueOf, (InterfaceC2056p) objMo1624d6);
                interfaceC0476a2.mo1622c(-492369756);
                Object objMo1624d7 = interfaceC0476a2.mo1624d();
                if (objMo1624d7 == c10586a) {
                    objMo1624d7 = new C0390b(interfaceC5312g1);
                    interfaceC0476a2.mo1655t(objMo1624d7);
                }
                interfaceC0476a2.mo1661w();
                InterfaceC0500b interfaceC0500b3 = (InterfaceC0500b) objMo1624d7;
                C5207g.m11111f(interfaceC0500b3, "other");
                interfaceC0476a2.mo1622c(773894976);
                interfaceC0476a2.mo1622c(-492369756);
                Object objMo1624d8 = interfaceC0476a2.mo1624d();
                if (objMo1624d8 == c10586a) {
                    objMo1624d8 = new C5319k(C5333r.m11463e(EmptyCoroutineContext.f38093a, interfaceC0476a2));
                    interfaceC0476a2.mo1655t(objMo1624d8);
                }
                interfaceC0476a2.mo1661w();
                final InterfaceC7882z interfaceC7882z = ((C5319k) objMo1624d8).f33592a;
                interfaceC0476a2.mo1661w();
                final boolean z13 = z10;
                C5207g.m11111f(interfaceC0500bM2033b, "gestureModifiers");
                C5207g.m11111f(interfaceC9612j2, "interactionSource");
                C5207g.m11111f(interfaceC7882z, "indicationScope");
                C5207g.m11111f(map, "currentKeyPressInteractions");
                C5207g.m11111f(interfaceC5312g2, "keyClickOffset");
                C5207g.m11111f(interfaceC2041a2, "onClick");
                final C6569g c6569g2 = c6569g;
                final String str2 = str;
                InterfaceC0500b interfaceC0500bM11163j0 = C5212l.m11163j0(interfaceC0500b3, true, new InterfaceC2052l<InterfaceC6577o, C9072e>() { // from class: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$clickSemantics$1

                    /* JADX INFO: renamed from: d */
                    public final /* synthetic */ InterfaceC2041a<C9072e> f1768d = null;

                    /* JADX INFO: renamed from: e */
                    public final /* synthetic */ String f1769e = null;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(InterfaceC6577o interfaceC6577o) {
                        InterfaceC6577o interfaceC6577o2 = interfaceC6577o;
                        C5207g.m11111f(interfaceC6577o2, "$this$semantics");
                        C6569g c6569g3 = c6569g2;
                        if (c6569g3 != null) {
                            C6576n.m13167a(interfaceC6577o2, c6569g3.f37368a);
                        }
                        final InterfaceC2041a<C9072e> interfaceC2041a4 = interfaceC2041a2;
                        InterfaceC2041a<Boolean> interfaceC2041a5 = new InterfaceC2041a<Boolean>() { // from class: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$clickSemantics$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final Boolean mo807E() {
                                interfaceC2041a4.mo807E();
                                return Boolean.TRUE;
                            }
                        };
                        InterfaceC6727j<Object>[] interfaceC6727jArr = C6576n.f37397a;
                        interfaceC6577o2.mo13162a(C6571i.f37373b, new C6563a(str2, interfaceC2041a5));
                        final InterfaceC2041a<C9072e> interfaceC2041a6 = this.f1768d;
                        if (interfaceC2041a6 != null) {
                            interfaceC6577o2.mo13162a(C6571i.f37374c, new C6563a(this.f1769e, new InterfaceC2041a<Boolean>() { // from class: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$clickSemantics$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final Boolean mo807E() {
                                    interfaceC2041a6.mo807E();
                                    return Boolean.TRUE;
                                }
                            }));
                        }
                        if (!z13) {
                            interfaceC6577o2.mo13162a(SemanticsProperties.f4416i, C9072e.f47360a);
                        }
                        return C9072e.f47360a;
                    }
                });
                InterfaceC2052l<C1289b, Boolean> interfaceC2052l = new InterfaceC2052l<C1289b, Boolean>() { // from class: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1

                    /* JADX INFO: renamed from: androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$1, reason: invalid class name */
                    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
                    @InterfaceC10224c(m19205c = "androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$1", m19206f = "Clickable.kt", m19207l = {540}, m19208m = "invokeSuspend")
                    final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

                        /* JADX INFO: renamed from: e */
                        public int f1780e;

                        /* JADX INFO: renamed from: f */
                        public final /* synthetic */ InterfaceC9612j f1781f;

                        /* JADX INFO: renamed from: g */
                        public final /* synthetic */ C9615m f1782g;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(InterfaceC9612j interfaceC9612j, C9615m c9615m, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                            super(2, interfaceC9968c);
                            this.f1781f = interfaceC9612j;
                            this.f1782g = c9615m;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /* JADX INFO: renamed from: a */
                        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                            return new AnonymousClass1(this.f1781f, this.f1782g, interfaceC9968c);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                            return ((AnonymousClass1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
                        }

                        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /* JADX INFO: renamed from: x */
                        public final Object mo1338x(Object obj) throws Throwable {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i10 = this.f1780e;
                            if (i10 == 0) {
                                C7499b.m14977z0(obj);
                                this.f1780e = 1;
                                if (this.f1781f.mo18074c(this.f1782g, this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                C7499b.m14977z0(obj);
                            }
                            return C9072e.f47360a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
                    /* JADX WARN: Code duplicated, block: B:22:0x0089 A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:23:0x008b  */
                    /* JADX WARN: Code duplicated, block: B:25:0x0093  */
                    /* JADX WARN: Code duplicated, block: B:26:0x0095  */
                    /* JADX WARN: Code duplicated, block: B:28:0x0098  */
                    /* JADX WARN: Code duplicated, block: B:33:0x00aa  */
                    /* JADX WARN: Code duplicated, block: B:35:0x00ad  */
                    /* JADX WARN: Code duplicated, block: B:36:0x00af  */
                    /* JADX WARN: Code duplicated, block: B:38:0x00b2  */
                    /* JADX WARN: Code duplicated, block: B:40:0x00c7  */
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final Boolean mo528n(C1289b c1289b) {
                        boolean z14;
                        boolean z15;
                        C9615m c9615mRemove;
                        int iM16755s;
                        boolean z16;
                        boolean z17;
                        KeyEvent keyEvent = c1289b.f8000a;
                        C5207g.m11111f(keyEvent, "keyEvent");
                        InterfaceC7882z interfaceC7882z2 = interfaceC7882z;
                        InterfaceC9612j interfaceC9612j4 = interfaceC9612j2;
                        Map<C1288a, C9615m> map2 = map;
                        boolean z18 = false;
                        boolean z19 = z13;
                        if (z19) {
                            int i12 = C9114f.f47614b;
                            if (C5212l.m11147T(keyEvent) == 2) {
                                int iM16755s2 = (int) (C8573r0.m16755s(keyEvent.getKeyCode()) >> 32);
                                if (iM16755s2 == 23 || iM16755s2 == 66 || iM16755s2 == 160) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                            } else {
                                z17 = false;
                            }
                            if (z17) {
                                if (!map2.containsKey(new C1288a(C8573r0.m16755s(keyEvent.getKeyCode())))) {
                                    C9615m c9615m = new C9615m(interfaceC5312g2.getValue().f46892a);
                                    map2.put(new C1288a(C8573r0.m16755s(keyEvent.getKeyCode())), c9615m);
                                    C7828f.m15570d(interfaceC7882z2, null, null, new AnonymousClass1(interfaceC9612j4, c9615m, null), 3);
                                    z18 = true;
                                }
                            } else if (z19) {
                                int i13 = C9114f.f47614b;
                                if (C5212l.m11147T(keyEvent) == 1) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (z14) {
                                    iM16755s = (int) (C8573r0.m16755s(keyEvent.getKeyCode()) >> 32);
                                    if (iM16755s != 23 || iM16755s == 66 || iM16755s == 160) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    if (z16) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                } else {
                                    z15 = false;
                                }
                                if (z15) {
                                    c9615mRemove = map2.remove(new C1288a(C8573r0.m16755s(keyEvent.getKeyCode())));
                                    if (c9615mRemove != null) {
                                        C7828f.m15570d(interfaceC7882z2, null, null, new C0382x8f00ca0b(interfaceC9612j4, c9615mRemove, null), 3);
                                    }
                                    interfaceC2041a2.mo807E();
                                    z18 = true;
                                }
                            }
                        } else if (z19) {
                            int i14 = C9114f.f47614b;
                            if (C5212l.m11147T(keyEvent) == 1) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (z14) {
                                z15 = false;
                            } else {
                                iM16755s = (int) (C8573r0.m16755s(keyEvent.getKeyCode()) >> 32);
                                if (iM16755s != 23) {
                                    z16 = true;
                                } else {
                                    z16 = true;
                                }
                                if (z16) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                            }
                            if (z15) {
                                c9615mRemove = map2.remove(new C1288a(C8573r0.m16755s(keyEvent.getKeyCode())));
                                if (c9615mRemove != null) {
                                    C7828f.m15570d(interfaceC7882z2, null, null, new C0382x8f00ca0b(interfaceC9612j4, c9615mRemove, null), 3);
                                }
                                interfaceC2041a2.mo807E();
                                z18 = true;
                            }
                        }
                        return Boolean.valueOf(z18);
                    }
                };
                C5207g.m11111f(interfaceC0500bM11163j0, "<this>");
                InterfaceC0500b interfaceC0500bMo1929K = interfaceC0500bM11163j0.mo1929K(new OnKeyEventElement(interfaceC2052l));
                C5304d1 c5304d1 = IndicationKt.f1887a;
                C5207g.m11111f(interfaceC0500bMo1929K, "<this>");
                InterfaceC2052l<C0661s0, C9072e> interfaceC2052l2 = InspectableValueKt.f4184a;
                final InterfaceC9126r interfaceC9126r2 = interfaceC9126r;
                InterfaceC0500b interfaceC0500bM1927a = ComposedModifierKt.m1927a(interfaceC0500bMo1929K, interfaceC2052l2, new InterfaceC2057q<InterfaceC0500b, InterfaceC0476a, Integer, InterfaceC0500b>() { // from class: androidx.compose.foundation.IndicationKt$indication$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // cm.InterfaceC2057q
                    /* JADX INFO: renamed from: M */
                    public final InterfaceC0500b mo1343M(InterfaceC0500b interfaceC0500b4, InterfaceC0476a interfaceC0476a3, Integer num2) {
                        InterfaceC0476a interfaceC0476a4 = interfaceC0476a3;
                        C0204c.m861u(num2, interfaceC0500b4, "$this$composed", interfaceC0476a4, -353972293);
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
                        InterfaceC9126r interfaceC9126r3 = interfaceC9126r2;
                        if (interfaceC9126r3 == null) {
                            interfaceC9126r3 = C9129u.f47636a;
                        }
                        InterfaceC9127s interfaceC9127sMo1552a = interfaceC9126r3.mo1552a(interfaceC9612j2, interfaceC0476a4);
                        interfaceC0476a4.mo1622c(1157296644);
                        boolean zMo1665y3 = interfaceC0476a4.mo1665y(interfaceC9127sMo1552a);
                        Object objMo1624d9 = interfaceC0476a4.mo1624d();
                        if (zMo1665y3 || objMo1624d9 == InterfaceC0476a.a.f3122a) {
                            objMo1624d9 = new C9128t(interfaceC9127sMo1552a);
                            interfaceC0476a4.mo1655t(objMo1624d9);
                        }
                        interfaceC0476a4.mo1661w();
                        C9128t c9128t = (C9128t) objMo1624d9;
                        interfaceC0476a4.mo1661w();
                        return c9128t;
                    }
                });
                C5207g.m11111f(interfaceC0500bM1927a, "<this>");
                InterfaceC0500b interfaceC0500bM1927a2 = ComposedModifierKt.m1927a(interfaceC0500bM1927a, interfaceC2052l2, new HoverableKt$hoverable$2(interfaceC9612j2, z13));
                C0658r0 c0658r0 = C0391c.f1945a;
                C5207g.m11111f(interfaceC0500bM1927a2, "<this>");
                InterfaceC0500b interfaceC0500bMo1929K2 = ComposedModifierKt.m1927a(interfaceC0500bM1927a2, interfaceC2052l2, new InterfaceC2057q<InterfaceC0500b, InterfaceC0476a, Integer, InterfaceC0500b>() { // from class: androidx.compose.foundation.FocusableKt$focusableInNonTouchMode$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // cm.InterfaceC2057q
                    /* JADX INFO: renamed from: M */
                    public final InterfaceC0500b mo1343M(InterfaceC0500b interfaceC0500b4, InterfaceC0476a interfaceC0476a3, Integer num2) {
                        InterfaceC0476a interfaceC0476a4 = interfaceC0476a3;
                        C0204c.m861u(num2, interfaceC0500b4, "$this$composed", interfaceC0476a4, -618949501);
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
                        final InterfaceC0007b interfaceC0007b = (InterfaceC0007b) interfaceC0476a4.mo1648p(CompositionLocalsKt.f4142j);
                        InterfaceC0500b interfaceC0500bM1998a = C0510b.m1998a(InterfaceC0500b.a.f3325a, new InterfaceC2052l<InterfaceC8691j, C9072e>() { // from class: androidx.compose.foundation.FocusableKt$focusableInNonTouchMode$2.1
                            {
                                super(1);
                            }

                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(InterfaceC8691j interfaceC8691j) {
                                InterfaceC8691j interfaceC8691j2 = interfaceC8691j;
                                C5207g.m11111f(interfaceC8691j2, "$this$focusProperties");
                                interfaceC8691j2.mo1968b(!(interfaceC0007b.mo15a() == 1));
                                return C9072e.f47360a;
                            }
                        });
                        C5207g.m11111f(interfaceC0500bM1998a, "<this>");
                        InterfaceC0500b interfaceC0500bM1927a3 = ComposedModifierKt.m1927a(interfaceC0500bM1998a, InspectableValueKt.f4184a, new FocusableKt$focusable$2(interfaceC9612j2, z13));
                        interfaceC0476a4.mo1661w();
                        return interfaceC0500bM1927a3;
                    }
                }).mo1929K(interfaceC0500bM2033b);
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
                interfaceC0476a2.mo1661w();
                return interfaceC0500bMo1929K2;
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceC0500b m1409c(InterfaceC0500b interfaceC0500b, InterfaceC9612j interfaceC9612j, C1277b c1277b, boolean z10, C6569g c6569g, InterfaceC2041a interfaceC2041a, int i10) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i10 & 16) != 0) {
            c6569g = null;
        }
        return m1408b(interfaceC0500b, interfaceC9612j, c1277b, z11, null, c6569g, interfaceC2041a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static InterfaceC0500b m1410d(InterfaceC0500b interfaceC0500b, final InterfaceC2041a interfaceC2041a) {
        C5207g.m11111f(interfaceC0500b, "$this$clickable");
        C5207g.m11111f(interfaceC2041a, "onClick");
        InterfaceC2052l<C0661s0, C9072e> interfaceC2052l = InspectableValueKt.f4184a;
        final boolean z10 = true;
        final String str = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        return ComposedModifierKt.m1927a(interfaceC0500b, interfaceC2052l, new InterfaceC2057q<InterfaceC0500b, InterfaceC0476a, Integer, InterfaceC0500b>() { // from class: androidx.compose.foundation.ClickableKt$clickable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // cm.InterfaceC2057q
            /* JADX INFO: renamed from: M */
            public final InterfaceC0500b mo1343M(InterfaceC0500b interfaceC0500b2, InterfaceC0476a interfaceC0476a, Integer num) {
                InterfaceC0476a interfaceC0476a2 = interfaceC0476a;
                C0204c.m861u(num, interfaceC0500b2, "$this$composed", interfaceC0476a2, -756081143);
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                InterfaceC0500b.a aVar = InterfaceC0500b.a.f3325a;
                InterfaceC9126r interfaceC9126r = (InterfaceC9126r) interfaceC0476a2.mo1648p(IndicationKt.f1887a);
                interfaceC0476a2.mo1622c(-492369756);
                Object objMo1624d = interfaceC0476a2.mo1624d();
                if (objMo1624d == InterfaceC0476a.a.f3122a) {
                    objMo1624d = new C9613k();
                    interfaceC0476a2.mo1655t(objMo1624d);
                }
                interfaceC0476a2.mo1661w();
                InterfaceC0500b interfaceC0500bM1408b = ClickableKt.m1408b(aVar, (InterfaceC9612j) objMo1624d, interfaceC9126r, z10, str, objArr, interfaceC2041a);
                interfaceC0476a2.mo1661w();
                return interfaceC0500bM1408b;
            }
        });
    }
}
