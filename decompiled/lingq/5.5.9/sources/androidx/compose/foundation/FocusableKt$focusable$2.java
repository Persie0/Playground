package androidx.compose.foundation;

import androidx.activity.result.C0204c;
import androidx.compose.foundation.relocation.BringIntoViewRequesterImpl;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.focus.C0509a;
import androidx.compose.p017ui.focus.C0511c;
import androidx.compose.p017ui.focus.FocusRequester;
import androidx.compose.p017ui.focus.FocusTargetModifierNode;
import androidx.compose.p017ui.layout.PinnableContainerKt;
import androidx.compose.p017ui.semantics.SemanticsProperties;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import dm.C5212l;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import no.C7828f;
import no.InterfaceC7882z;
import p081e0.C5319k;
import p081e0.C5329p;
import p081e0.C5333r;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5312g0;
import p081e0.InterfaceC5327o;
import p081e0.InterfaceC5336s0;
import p127g1.InterfaceC5661y;
import p210k1.C6563a;
import p210k1.C6571i;
import p210k1.C6576n;
import p210k1.InterfaceC6577o;
import p260m8.C7499b;
import p338qd.C8573r0;
import p351r0.InterfaceC8697p;
import p386t.C9119k;
import p386t.C9120l;
import p386t.C9121m;
import p386t.C9122n;
import p423v.C9606d;
import p423v.C9607e;
import p423v.InterfaceC9612j;
import p464wl.InterfaceC9968c;
import p468x.InterfaceC9996d;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m13365d2 = {"Landroidx/compose/ui/b;", "invoke", "(Landroidx/compose/ui/b;Landroidx/compose/runtime/a;I)Landroidx/compose/ui/b;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
final class FocusableKt$focusable$2 extends Lambda implements InterfaceC2057q<InterfaceC0500b, InterfaceC0476a, Integer, InterfaceC0500b> {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC9612j f1802b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f1803c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusableKt$focusable$2(InterfaceC9612j interfaceC9612j, boolean z10) {
        super(3);
        this.f1802b = interfaceC9612j;
        this.f1803c = z10;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m1411a(InterfaceC5312g0<Boolean> interfaceC5312g0) {
        return interfaceC5312g0.getValue().booleanValue();
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final InterfaceC0500b mo1343M(InterfaceC0500b interfaceC0500b, InterfaceC0476a interfaceC0476a, Integer num) {
        InterfaceC0500b interfaceC0500b2;
        InterfaceC0476a interfaceC0476a2 = interfaceC0476a;
        C0204c.m861u(num, interfaceC0500b, "$this$composed", interfaceC0476a2, 1871352361);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        interfaceC0476a2.mo1622c(773894976);
        interfaceC0476a2.mo1622c(-492369756);
        Object objMo1624d = interfaceC0476a2.mo1624d();
        InterfaceC0476a.a.C10586a c10586a = InterfaceC0476a.a.f3122a;
        if (objMo1624d == c10586a) {
            C5319k c5319k = new C5319k(C5333r.m11463e(EmptyCoroutineContext.f38093a, interfaceC0476a2));
            interfaceC0476a2.mo1655t(c5319k);
            objMo1624d = c5319k;
        }
        interfaceC0476a2.mo1661w();
        final InterfaceC7882z interfaceC7882z = ((C5319k) objMo1624d).f33592a;
        interfaceC0476a2.mo1661w();
        interfaceC0476a2.mo1622c(-492369756);
        Object objMo1624d2 = interfaceC0476a2.mo1624d();
        if (objMo1624d2 == c10586a) {
            objMo1624d2 = C8573r0.m16684L0(null);
            interfaceC0476a2.mo1655t(objMo1624d2);
        }
        interfaceC0476a2.mo1661w();
        final InterfaceC5312g0 interfaceC5312g0 = (InterfaceC5312g0) objMo1624d2;
        interfaceC0476a2.mo1622c(-492369756);
        Object objMo1624d3 = interfaceC0476a2.mo1624d();
        if (objMo1624d3 == c10586a) {
            objMo1624d3 = C8573r0.m16684L0(Boolean.FALSE);
            interfaceC0476a2.mo1655t(objMo1624d3);
        }
        interfaceC0476a2.mo1661w();
        final InterfaceC5312g0 interfaceC5312g1 = (InterfaceC5312g0) objMo1624d3;
        interfaceC0476a2.mo1622c(-492369756);
        Object objMo1624d4 = interfaceC0476a2.mo1624d();
        if (objMo1624d4 == c10586a) {
            objMo1624d4 = new FocusRequester();
            interfaceC0476a2.mo1655t(objMo1624d4);
        }
        interfaceC0476a2.mo1661w();
        final FocusRequester focusRequester = (FocusRequester) objMo1624d4;
        interfaceC0476a2.mo1622c(-492369756);
        Object objMo1624d5 = interfaceC0476a2.mo1624d();
        if (objMo1624d5 == c10586a) {
            objMo1624d5 = new BringIntoViewRequesterImpl();
            interfaceC0476a2.mo1655t(objMo1624d5);
        }
        interfaceC0476a2.mo1661w();
        final InterfaceC9996d interfaceC9996d = (InterfaceC9996d) objMo1624d5;
        interfaceC0476a2.mo1622c(511388516);
        boolean zMo1665y = interfaceC0476a2.mo1665y(interfaceC5312g0);
        final InterfaceC9612j interfaceC9612j = this.f1802b;
        boolean zMo1665y2 = zMo1665y | interfaceC0476a2.mo1665y(interfaceC9612j);
        Object objMo1624d6 = interfaceC0476a2.mo1624d();
        if (zMo1665y2 || objMo1624d6 == c10586a) {
            objMo1624d6 = new InterfaceC2052l<C5329p, InterfaceC5327o>() { // from class: androidx.compose.foundation.FocusableKt$focusable$2$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final InterfaceC5327o mo528n(C5329p c5329p) {
                    C5207g.m11111f(c5329p, "$this$DisposableEffect");
                    return new C9119k(interfaceC5312g0, interfaceC9612j);
                }
            };
            interfaceC0476a2.mo1655t(objMo1624d6);
        }
        interfaceC0476a2.mo1661w();
        C5333r.m11459a(interfaceC9612j, (InterfaceC2052l) objMo1624d6, interfaceC0476a2);
        final boolean z10 = this.f1803c;
        C5333r.m11459a(Boolean.valueOf(z10), new InterfaceC2052l<C5329p, InterfaceC5327o>() { // from class: androidx.compose.foundation.FocusableKt$focusable$2.2

            /* JADX INFO: renamed from: androidx.compose.foundation.FocusableKt$focusable$2$2$1, reason: invalid class name */
            @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
            @InterfaceC10224c(m19205c = "androidx.compose.foundation.FocusableKt$focusable$2$2$1", m19206f = "Focusable.kt", m19207l = {99}, m19208m = "invokeSuspend")
            final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

                /* JADX INFO: renamed from: e */
                public InterfaceC5312g0 f1810e;

                /* JADX INFO: renamed from: f */
                public int f1811f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ InterfaceC5312g0<C9606d> f1812g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ InterfaceC9612j f1813h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(InterfaceC9612j interfaceC9612j, InterfaceC5312g0 interfaceC5312g0, InterfaceC9968c interfaceC9968c) {
                    super(2, interfaceC9968c);
                    this.f1812g = interfaceC5312g0;
                    this.f1813h = interfaceC9612j;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: a */
                public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                    return new AnonymousClass1(this.f1813h, this.f1812g, interfaceC9968c);
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
                    InterfaceC5312g0<C9606d> interfaceC5312g0;
                    InterfaceC5312g0<C9606d> interfaceC5312g1;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.f1811f;
                    if (i10 == 0) {
                        C7499b.m14977z0(obj);
                        interfaceC5312g0 = this.f1812g;
                        C9606d value = interfaceC5312g0.getValue();
                        if (value != null) {
                            C9607e c9607e = new C9607e(value);
                            InterfaceC9612j interfaceC9612j = this.f1813h;
                            if (interfaceC9612j != null) {
                                this.f1810e = interfaceC5312g0;
                                this.f1811f = 1;
                                if (interfaceC9612j.mo18074c(c9607e, this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                interfaceC5312g1 = interfaceC5312g0;
                            }
                            interfaceC5312g0.setValue(null);
                        }
                        return C9072e.f47360a;
                    }
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC5312g1 = this.f1810e;
                    C7499b.m14977z0(obj);
                    interfaceC5312g0 = interfaceC5312g1;
                    interfaceC5312g0.setValue(null);
                    return C9072e.f47360a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final InterfaceC5327o mo528n(C5329p c5329p) {
                C5207g.m11111f(c5329p, "$this$DisposableEffect");
                if (!z10) {
                    C7828f.m15570d(interfaceC7882z, null, null, new AnonymousClass1(interfaceC9612j, interfaceC5312g0, null), 3);
                }
                return new C9120l();
            }
        }, interfaceC0476a2);
        InterfaceC0500b interfaceC0500bMo1929K = InterfaceC0500b.a.f3325a;
        if (z10) {
            interfaceC0476a2.mo1622c(1407540673);
            if (m1411a(interfaceC5312g1)) {
                interfaceC0476a2.mo1622c(-492369756);
                Object objMo1624d7 = interfaceC0476a2.mo1624d();
                if (objMo1624d7 == c10586a) {
                    objMo1624d7 = new C9122n();
                    interfaceC0476a2.mo1655t(objMo1624d7);
                }
                interfaceC0476a2.mo1661w();
                interfaceC0500b2 = (InterfaceC0500b) objMo1624d7;
            } else {
                interfaceC0500b2 = interfaceC0500bMo1929K;
            }
            interfaceC0476a2.mo1661w();
            final InterfaceC5661y interfaceC5661y = (InterfaceC5661y) interfaceC0476a2.mo1648p(PinnableContainerKt.f3668a);
            interfaceC0476a2.mo1622c(-492369756);
            Object objMo1624d8 = interfaceC0476a2.mo1624d();
            if (objMo1624d8 == c10586a) {
                objMo1624d8 = C8573r0.m16684L0(null);
                interfaceC0476a2.mo1655t(objMo1624d8);
            }
            interfaceC0476a2.mo1661w();
            final InterfaceC5312g0 interfaceC5312g2 = (InterfaceC5312g0) objMo1624d8;
            interfaceC0476a2.mo1622c(1618982084);
            boolean zMo1665y3 = interfaceC0476a2.mo1665y(interfaceC5312g1) | interfaceC0476a2.mo1665y(interfaceC5312g2) | interfaceC0476a2.mo1665y(interfaceC5661y);
            Object objMo1624d9 = interfaceC0476a2.mo1624d();
            if (zMo1665y3 || objMo1624d9 == c10586a) {
                objMo1624d9 = new InterfaceC2052l<C5329p, InterfaceC5327o>() { // from class: androidx.compose.foundation.FocusableKt$focusable$2$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final InterfaceC5327o mo528n(C5329p c5329p) {
                        C5207g.m11111f(c5329p, "$this$DisposableEffect");
                        boolean zM1411a = FocusableKt$focusable$2.m1411a(interfaceC5312g1);
                        InterfaceC5312g0<InterfaceC5661y.a> interfaceC5312g3 = interfaceC5312g2;
                        if (zM1411a) {
                            InterfaceC5661y interfaceC5661y2 = interfaceC5661y;
                            interfaceC5312g3.setValue(interfaceC5661y2 != null ? interfaceC5661y2.m12016a() : null);
                        }
                        return new C9121m(interfaceC5312g3);
                    }
                };
                interfaceC0476a2.mo1655t(objMo1624d9);
            }
            interfaceC0476a2.mo1661w();
            C5333r.m11459a(interfaceC5661y, (InterfaceC2052l) objMo1624d9, interfaceC0476a2);
            interfaceC0476a2.mo1622c(511388516);
            boolean zMo1665y4 = interfaceC0476a2.mo1665y(interfaceC5312g1) | interfaceC0476a2.mo1665y(focusRequester);
            Object objMo1624d10 = interfaceC0476a2.mo1624d();
            if (zMo1665y4 || objMo1624d10 == c10586a) {
                objMo1624d10 = new InterfaceC2052l<InterfaceC6577o, C9072e>() { // from class: androidx.compose.foundation.FocusableKt$focusable$2$4$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(InterfaceC6577o interfaceC6577o) {
                        InterfaceC6577o interfaceC6577o2 = interfaceC6577o;
                        C5207g.m11111f(interfaceC6577o2, "$this$semantics");
                        final InterfaceC5312g0<Boolean> interfaceC5312g3 = interfaceC5312g1;
                        boolean zM1411a = FocusableKt$focusable$2.m1411a(interfaceC5312g3);
                        InterfaceC6727j<Object>[] interfaceC6727jArr = C6576n.f37397a;
                        SemanticsProperties.f4418k.m2543a(interfaceC6577o2, C6576n.f37397a[4], Boolean.valueOf(zM1411a));
                        final FocusRequester focusRequester2 = focusRequester;
                        interfaceC6577o2.mo13162a(C6571i.f37385n, new C6563a(null, new InterfaceC2041a<Boolean>() { // from class: androidx.compose.foundation.FocusableKt$focusable$2$4$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final Boolean mo807E() {
                                focusRequester2.m1970b();
                                return Boolean.valueOf(FocusableKt$focusable$2.m1411a(interfaceC5312g3));
                            }
                        }));
                        return C9072e.f47360a;
                    }
                };
                interfaceC0476a2.mo1655t(objMo1624d10);
            }
            interfaceC0476a2.mo1661w();
            InterfaceC0500b interfaceC0500bMo1929K2 = C0511c.m1999a(BringIntoViewRequesterKt.m1526a(C5212l.m11163j0(interfaceC0500bMo1929K, false, (InterfaceC2052l) objMo1624d10), interfaceC9996d), focusRequester).mo1929K(interfaceC0500b2);
            final InterfaceC9612j interfaceC9612j2 = this.f1802b;
            InterfaceC0500b interfaceC0500bM1997a = C0509a.m1997a(interfaceC0500bMo1929K2, new InterfaceC2052l<InterfaceC8697p, C9072e>() { // from class: androidx.compose.foundation.FocusableKt$focusable$2.5

                /* JADX INFO: renamed from: androidx.compose.foundation.FocusableKt$focusable$2$5$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "androidx.compose.foundation.FocusableKt$focusable$2$5$1", m19206f = "Focusable.kt", m19207l = {147, 151, 154}, m19208m = "invokeSuspend")
                final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

                    /* JADX INFO: renamed from: e */
                    public Object f1828e;

                    /* JADX INFO: renamed from: f */
                    public int f1829f;

                    /* JADX INFO: renamed from: g */
                    public final /* synthetic */ InterfaceC5312g0<C9606d> f1830g;

                    /* JADX INFO: renamed from: h */
                    public final /* synthetic */ InterfaceC9612j f1831h;

                    /* JADX INFO: renamed from: i */
                    public final /* synthetic */ InterfaceC9996d f1832i;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(InterfaceC5312g0<C9606d> interfaceC5312g0, InterfaceC9612j interfaceC9612j, InterfaceC9996d interfaceC9996d, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                        super(2, interfaceC9968c);
                        this.f1830g = interfaceC5312g0;
                        this.f1831h = interfaceC9612j;
                        this.f1832i = interfaceC9996d;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: a */
                    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                        return new AnonymousClass1(this.f1830g, this.f1831h, this.f1832i, interfaceC9968c);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                        return ((AnonymousClass1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
                    }

                    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
                    /* JADX WARN: Code duplicated, block: B:29:0x0079  */
                    /* JADX WARN: Code duplicated, block: B:33:0x008c A[RETURN] */
                    /* JADX WARN: Code duplicated, block: B:34:0x008d  */
                    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) throws Throwable {
                        InterfaceC5312g0<C9606d> interfaceC5312g0;
                        C9606d c9606d;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i10 = this.f1829f;
                        InterfaceC9612j interfaceC9612j = this.f1831h;
                        InterfaceC5312g0<C9606d> interfaceC5312g1 = this.f1830g;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                interfaceC5312g0 = (InterfaceC5312g0) this.f1828e;
                                C7499b.m14977z0(obj);
                            } else if (i10 == 2) {
                                c9606d = (C9606d) this.f1828e;
                                C7499b.m14977z0(obj);
                                interfaceC5312g1.setValue(c9606d);
                                this.f1828e = null;
                                this.f1829f = 3;
                                if (this.f1832i.mo1525a(null, this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                if (i10 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                C7499b.m14977z0(obj);
                            }
                            return C9072e.f47360a;
                        }
                        C7499b.m14977z0(obj);
                        C9606d value = interfaceC5312g1.getValue();
                        if (value != null) {
                            C9607e c9607e = new C9607e(value);
                            if (interfaceC9612j != null) {
                                this.f1828e = interfaceC5312g1;
                                this.f1829f = 1;
                                if (interfaceC9612j.mo18074c(c9607e, this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            interfaceC5312g0 = interfaceC5312g1;
                        } else {
                            c9606d = new C9606d();
                            if (interfaceC9612j != null) {
                                this.f1828e = c9606d;
                                this.f1829f = 2;
                                if (interfaceC9612j.mo18074c(c9606d, this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                        }
                        interfaceC5312g1.setValue(c9606d);
                        this.f1828e = null;
                        this.f1829f = 3;
                        if (this.f1832i.mo1525a(null, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return C9072e.f47360a;
                        interfaceC5312g0.setValue(null);
                        c9606d = new C9606d();
                        if (interfaceC9612j != null) {
                            this.f1828e = c9606d;
                            this.f1829f = 2;
                            if (interfaceC9612j.mo18074c(c9606d, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        interfaceC5312g1.setValue(c9606d);
                        this.f1828e = null;
                        this.f1829f = 3;
                        if (this.f1832i.mo1525a(null, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return C9072e.f47360a;
                    }
                }

                /* JADX INFO: renamed from: androidx.compose.foundation.FocusableKt$focusable$2$5$2, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "androidx.compose.foundation.FocusableKt$focusable$2$5$2", m19206f = "Focusable.kt", m19207l = {162}, m19208m = "invokeSuspend")
                final class AnonymousClass2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

                    /* JADX INFO: renamed from: e */
                    public InterfaceC5312g0 f1833e;

                    /* JADX INFO: renamed from: f */
                    public int f1834f;

                    /* JADX INFO: renamed from: g */
                    public final /* synthetic */ InterfaceC5312g0<C9606d> f1835g;

                    /* JADX INFO: renamed from: h */
                    public final /* synthetic */ InterfaceC9612j f1836h;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(InterfaceC9612j interfaceC9612j, InterfaceC5312g0 interfaceC5312g0, InterfaceC9968c interfaceC9968c) {
                        super(2, interfaceC9968c);
                        this.f1835g = interfaceC5312g0;
                        this.f1836h = interfaceC9612j;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: a */
                    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                        return new AnonymousClass2(this.f1836h, this.f1835g, interfaceC9968c);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                        return ((AnonymousClass2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
                    }

                    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) throws Throwable {
                        InterfaceC5312g0<C9606d> interfaceC5312g0;
                        InterfaceC5312g0<C9606d> interfaceC5312g1;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i10 = this.f1834f;
                        if (i10 == 0) {
                            C7499b.m14977z0(obj);
                            interfaceC5312g0 = this.f1835g;
                            C9606d value = interfaceC5312g0.getValue();
                            if (value != null) {
                                C9607e c9607e = new C9607e(value);
                                InterfaceC9612j interfaceC9612j = this.f1836h;
                                if (interfaceC9612j != null) {
                                    this.f1833e = interfaceC5312g0;
                                    this.f1834f = 1;
                                    if (interfaceC9612j.mo18074c(c9607e, this) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    interfaceC5312g1 = interfaceC5312g0;
                                }
                                interfaceC5312g0.setValue(null);
                            }
                            return C9072e.f47360a;
                        }
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC5312g1 = this.f1833e;
                        C7499b.m14977z0(obj);
                        interfaceC5312g0 = interfaceC5312g1;
                        interfaceC5312g0.setValue(null);
                        return C9072e.f47360a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final C9072e mo528n(InterfaceC8697p interfaceC8697p) {
                    InterfaceC8697p interfaceC8697p2 = interfaceC8697p;
                    C5207g.m11111f(interfaceC8697p2, "it");
                    Boolean boolValueOf = Boolean.valueOf(interfaceC8697p2.isFocused());
                    InterfaceC5312g0<Boolean> interfaceC5312g3 = interfaceC5312g1;
                    interfaceC5312g3.setValue(boolValueOf);
                    boolean zM1411a = FocusableKt$focusable$2.m1411a(interfaceC5312g3);
                    InterfaceC7882z interfaceC7882z2 = interfaceC7882z;
                    InterfaceC9612j interfaceC9612j3 = interfaceC9612j2;
                    InterfaceC5312g0<C9606d> interfaceC5312g4 = interfaceC5312g0;
                    InterfaceC5312g0<InterfaceC5661y.a> interfaceC5312g5 = interfaceC5312g2;
                    if (zM1411a) {
                        InterfaceC5661y interfaceC5661y2 = interfaceC5661y;
                        interfaceC5312g5.setValue(interfaceC5661y2 != null ? interfaceC5661y2.m12016a() : null);
                        C7828f.m15570d(interfaceC7882z2, null, null, new AnonymousClass1(interfaceC5312g4, interfaceC9612j3, interfaceC9996d, null), 3);
                    } else {
                        InterfaceC5661y.a value = interfaceC5312g5.getValue();
                        if (value != null) {
                            value.release();
                        }
                        interfaceC5312g5.setValue(null);
                        C7828f.m15570d(interfaceC7882z2, null, null, new AnonymousClass2(interfaceC9612j3, interfaceC5312g4, null), 3);
                    }
                    return C9072e.f47360a;
                }
            });
            C5207g.m11111f(interfaceC0500bM1997a, "<this>");
            interfaceC0500bMo1929K = interfaceC0500bM1997a.mo1929K(FocusTargetModifierNode.FocusTargetModifierElement.f3393a);
        }
        interfaceC0476a2.mo1661w();
        return interfaceC0500bMo1929K;
    }
}
