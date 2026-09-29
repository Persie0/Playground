package androidx.compose.p017ui.platform;

import android.view.View;
import androidx.compose.runtime.C0477b;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC0476a;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.view.C1052r;
import androidx.view.InterfaceC1049o;
import androidx.view.InterfaceC1051q;
import androidx.view.Lifecycle;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
import dm.C5207g;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p081e0.C5328o0;
import p081e0.C5333r;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5308f;
import p081e0.InterfaceC5336s0;
import p100em.InterfaceC5429a;
import p100em.InterfaceC5433e;
import p230l0.C7204a;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m13365d2 = {"Landroidx/compose/ui/platform/WrappedComposition;", "Le0/f;", "Landroidx/lifecycle/o;", "ui_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
final class WrappedComposition implements InterfaceC5308f, InterfaceC1049o {

    /* JADX INFO: renamed from: a */
    public final AndroidComposeView f4262a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5308f f4263b;

    /* JADX INFO: renamed from: c */
    public boolean f4264c;

    /* JADX INFO: renamed from: d */
    public Lifecycle f4265d;

    /* JADX INFO: renamed from: e */
    public InterfaceC2056p<? super InterfaceC0476a, ? super Integer, C9072e> f4266e = ComposableSingletons$Wrapper_androidKt.f4127a;

    public WrappedComposition(AndroidComposeView androidComposeView, C0477b c0477b) {
        this.f4262a = androidComposeView;
        this.f4263b = c0477b;
    }

    @Override // p081e0.InterfaceC5308f
    /* JADX INFO: renamed from: a */
    public final void mo1722a() {
        if (!this.f4264c) {
            this.f4264c = true;
            this.f4262a.getView().setTag(R.id.wrapped_composition_tag, null);
            Lifecycle lifecycle = this.f4265d;
            if (lifecycle != null) {
                lifecycle.mo3885c(this);
            }
        }
        this.f4263b.mo1722a();
    }

    @Override // androidx.view.InterfaceC1049o
    /* JADX INFO: renamed from: e */
    public final void mo800e(InterfaceC1051q interfaceC1051q, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            mo1722a();
            return;
        }
        if (event == Lifecycle.Event.ON_CREATE && !this.f4264c) {
            mo1726f(this.f4266e);
        }
    }

    @Override // p081e0.InterfaceC5308f
    /* JADX INFO: renamed from: f */
    public final void mo1726f(final InterfaceC2056p<? super InterfaceC0476a, ? super Integer, C9072e> interfaceC2056p) {
        C5207g.m11111f(interfaceC2056p, "content");
        this.f4262a.setOnViewTreeOwnersAvailable(new InterfaceC2052l<AndroidComposeView.C0551b, C9072e>() { // from class: androidx.compose.ui.platform.WrappedComposition$setContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r8v7, types: [androidx.compose.ui.platform.WrappedComposition$setContent$1$1, kotlin.jvm.internal.Lambda] */
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(AndroidComposeView.C0551b c0551b) {
                AndroidComposeView.C0551b c0551b2 = c0551b;
                C5207g.m11111f(c0551b2, "it");
                final WrappedComposition wrappedComposition = this.f4267b;
                if (!wrappedComposition.f4264c) {
                    C1052r c1052rMo786G = c0551b2.f4005a.mo786G();
                    final InterfaceC2056p<InterfaceC0476a, Integer, C9072e> interfaceC2056p2 = interfaceC2056p;
                    wrappedComposition.f4266e = interfaceC2056p2;
                    if (wrappedComposition.f4265d == null) {
                        wrappedComposition.f4265d = c1052rMo786G;
                        c1052rMo786G.mo3883a(wrappedComposition);
                    } else if (c1052rMo786G.f6681d.isAtLeast(Lifecycle.State.CREATED)) {
                        wrappedComposition.f4263b.mo1726f(C7204a.m14523c(-2000640158, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.platform.WrappedComposition$setContent$1.1

                            /* JADX INFO: renamed from: androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1, reason: invalid class name */
                            @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                            @InterfaceC10224c(m19205c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1", m19206f = "Wrapper.android.kt", m19207l = {153}, m19208m = "invokeSuspend")
                            final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

                                /* JADX INFO: renamed from: e */
                                public int f4271e;

                                /* JADX INFO: renamed from: f */
                                public final /* synthetic */ WrappedComposition f4272f;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(WrappedComposition wrappedComposition, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                                    super(2, interfaceC9968c);
                                    this.f4272f = wrappedComposition;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                /* JADX INFO: renamed from: a */
                                public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                                    return new AnonymousClass1(this.f4272f, interfaceC9968c);
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
                                    int i10 = this.f4271e;
                                    if (i10 == 0) {
                                        C7499b.m14977z0(obj);
                                        AndroidComposeView androidComposeView = this.f4272f.f4262a;
                                        this.f4271e = 1;
                                        Object objM2289k = androidComposeView.f3988l.m2289k(this);
                                        if (objM2289k != coroutineSingletons) {
                                            objM2289k = C9072e.f47360a;
                                        }
                                        if (objM2289k == coroutineSingletons) {
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
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.compose.ui.platform.WrappedComposition$setContent$1$1$2, kotlin.jvm.internal.Lambda] */
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a, Integer num) {
                                InterfaceC0476a interfaceC0476a2 = interfaceC0476a;
                                if ((num.intValue() & 11) == 2 && interfaceC0476a2.mo1642m()) {
                                    interfaceC0476a2.mo1650q();
                                } else {
                                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                                    final WrappedComposition wrappedComposition2 = wrappedComposition;
                                    Object tag = wrappedComposition2.f4262a.getTag(R.id.inspection_slot_table_set);
                                    Set set = (tag instanceof Set) && (!(tag instanceof InterfaceC5429a) || (tag instanceof InterfaceC5433e)) ? (Set) tag : null;
                                    AndroidComposeView androidComposeView = wrappedComposition2.f4262a;
                                    if (set == null) {
                                        Object parent = androidComposeView.getParent();
                                        View view = parent instanceof View ? (View) parent : null;
                                        Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                                        if ((tag2 instanceof Set) && (!(tag2 instanceof InterfaceC5429a) || (tag2 instanceof InterfaceC5433e))) {
                                            set = (Set) tag2;
                                        } else {
                                            set = null;
                                        }
                                    }
                                    if (set != null) {
                                        set.add(interfaceC0476a2.mo1628f());
                                        interfaceC0476a2.mo1618a();
                                    }
                                    C5333r.m11460b(androidComposeView, new AnonymousClass1(wrappedComposition2, null), interfaceC0476a2);
                                    C5328o0[] c5328o0Arr = {InspectionTablesKt.f3316a.m11458b(set)};
                                    final InterfaceC2056p<InterfaceC0476a, Integer, C9072e> interfaceC2056p3 = interfaceC2056p2;
                                    CompositionLocalKt.m1691a(c5328o0Arr, C7204a.m14522b(interfaceC0476a2, -1193460702, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.platform.WrappedComposition.setContent.1.1.2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // cm.InterfaceC2056p
                                        /* JADX INFO: renamed from: m0 */
                                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a3, Integer num2) {
                                            InterfaceC0476a interfaceC0476a4 = interfaceC0476a3;
                                            if ((num2.intValue() & 11) == 2 && interfaceC0476a4.mo1642m()) {
                                                interfaceC0476a4.mo1650q();
                                            } else {
                                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
                                                AndroidCompositionLocals_androidKt.m2304a(wrappedComposition2.f4262a, interfaceC2056p3, interfaceC0476a4, 8);
                                            }
                                            return C9072e.f47360a;
                                        }
                                    }), interfaceC0476a2, 56);
                                }
                                return C9072e.f47360a;
                            }
                        }, true));
                    }
                }
                return C9072e.f47360a;
            }
        });
    }

    @Override // p081e0.InterfaceC5308f
    /* JADX INFO: renamed from: l */
    public final boolean mo1732l() {
        return this.f4263b.mo1732l();
    }
}
