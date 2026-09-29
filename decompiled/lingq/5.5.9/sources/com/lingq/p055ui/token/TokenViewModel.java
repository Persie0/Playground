package com.lingq.p055ui.token;

import ae.C0062b;
import android.graphics.Rect;
import android.os.Parcelable;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import ci.InterfaceC2008a;
import ci.InterfaceC2011d;
import ci.InterfaceC2012e;
import ci.InterfaceC2015h;
import ci.InterfaceC2023p;
import ci.InterfaceC2024q;
import ci.InterfaceC2026s;
import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import cm.InterfaceC2058r;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.lesson.data.TokenFragmentData;
import com.lingq.p055ui.tooltips.InterfaceC4912b;
import com.lingq.p055ui.tooltips.TooltipStep;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$6;
import com.lingq.shared.uimodel.CardStatus;
import com.lingq.shared.uimodel.LanguageLearn;
import com.lingq.shared.uimodel.LanguageLearnBeta;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.shared.uimodel.lesson.LessonStudyTransliteration;
import com.lingq.shared.uimodel.token.TokenMeaning;
import com.lingq.shared.uimodel.token.TokenReadings;
import com.lingq.shared.uimodel.token.TokenRelatedPhrase;
import com.lingq.shared.uimodel.token.TokenTranslationSimple;
import com.lingq.shared.uimodel.token.TokenTranslations;
import com.lingq.shared.uimodel.token.TokenType;
import com.lingq.util.C4924a;
import dm.C5207g;
import fk.C5568j;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C7076b;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7131l;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.C7136q;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.flow.InterfaceC7133n;
import kotlinx.coroutines.flow.InterfaceC7137r;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import li.C7374a;
import li.C7376c;
import li.C7377d;
import li.C7378e;
import li.InterfaceC7379f;
import mo.C7661i;
import no.C7828f;
import no.C7848l1;
import no.InterfaceC7875v0;
import no.InterfaceC7882z;
import p015ak.InterfaceC0113j;
import p076di.InterfaceC5179a;
import p076di.InterfaceC5182d;
import p096ei.C5408a;
import p183ik.C6343f;
import p225kk.C6704a;
import p225kk.C6715l;
import p244lh.InterfaceC7366c;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, m13365d2 = {"Lcom/lingq/ui/token/TokenViewModel;", "Landroidx/lifecycle/h0;", "Lak/j;", "Lcom/lingq/ui/token/b;", "Llh/c;", "Lcom/lingq/ui/tooltips/b;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class TokenViewModel extends AbstractC1036h0 implements InterfaceC0113j, InterfaceC4865b, InterfaceC7366c, InterfaceC4912b {

    /* JADX INFO: renamed from: A0 */
    public final C7135p f31398A0;

    /* JADX INFO: renamed from: B0 */
    public final C7138s f31399B0;

    /* JADX INFO: renamed from: C0 */
    public final C7134o f31400C0;

    /* JADX INFO: renamed from: D0 */
    public final C7138s f31401D0;

    /* JADX INFO: renamed from: E0 */
    public final C7134o f31402E0;

    /* JADX INFO: renamed from: F0 */
    public final C7138s f31403F0;

    /* JADX INFO: renamed from: G0 */
    public final C7134o f31404G0;

    /* JADX INFO: renamed from: H */
    public final InterfaceC5182d f31405H;

    /* JADX INFO: renamed from: H0 */
    public final C7138s f31406H0;

    /* JADX INFO: renamed from: I */
    public final CoroutineDispatcher f31407I;

    /* JADX INFO: renamed from: I0 */
    public final C7138s f31408I0;

    /* JADX INFO: renamed from: J */
    public final InterfaceC7882z f31409J;

    /* JADX INFO: renamed from: J0 */
    public final C7138s f31410J0;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ InterfaceC0113j f31411K;

    /* JADX INFO: renamed from: K0 */
    public final C7134o f31412K0;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ InterfaceC4865b f31413L;

    /* JADX INFO: renamed from: L0 */
    public final C7138s f31414L0;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ InterfaceC7366c f31415M;

    /* JADX INFO: renamed from: M0 */
    public final C7134o f31416M0;

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ InterfaceC4912b f31417N;

    /* JADX INFO: renamed from: N0 */
    public final StateFlowImpl f31418N0;

    /* JADX INFO: renamed from: O */
    public C7848l1 f31419O;

    /* JADX INFO: renamed from: O0 */
    public final C7135p f31420O0;

    /* JADX INFO: renamed from: P */
    public C7848l1 f31421P;

    /* JADX INFO: renamed from: P0 */
    public final StateFlowImpl f31422P0;

    /* JADX INFO: renamed from: Q */
    public C7848l1 f31423Q;

    /* JADX INFO: renamed from: Q0 */
    public final StateFlowImpl f31424Q0;

    /* JADX INFO: renamed from: R */
    public InterfaceC7875v0 f31425R;

    /* JADX INFO: renamed from: R0 */
    public final C7138s f31426R0;

    /* JADX INFO: renamed from: S */
    public C7848l1 f31427S;

    /* JADX INFO: renamed from: S0 */
    public final C7134o f31428S0;

    /* JADX INFO: renamed from: T */
    public final C5568j f31429T;

    /* JADX INFO: renamed from: T0 */
    public final C7135p f31430T0;

    /* JADX INFO: renamed from: U */
    public final C5568j f31431U;

    /* JADX INFO: renamed from: U0 */
    public final StateFlowImpl f31432U0;

    /* JADX INFO: renamed from: V */
    public final StateFlowImpl f31433V;

    /* JADX INFO: renamed from: V0 */
    public final StateFlowImpl f31434V0;

    /* JADX INFO: renamed from: W */
    public final StateFlowImpl f31435W;

    /* JADX INFO: renamed from: W0 */
    public final C7135p f31436W0;

    /* JADX INFO: renamed from: X */
    public final C7135p f31437X;

    /* JADX INFO: renamed from: Y */
    public final StateFlowImpl f31438Y;

    /* JADX INFO: renamed from: Z */
    public final C7135p f31439Z;

    /* JADX INFO: renamed from: a0 */
    public final StateFlowImpl f31440a0;

    /* JADX INFO: renamed from: b0 */
    public final C7135p f31441b0;

    /* JADX INFO: renamed from: c0 */
    public final StateFlowImpl f31442c0;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2008a f31443d;

    /* JADX INFO: renamed from: d0 */
    public final StateFlowImpl f31444d0;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2026s f31445e;

    /* JADX INFO: renamed from: e0 */
    public final StateFlowImpl f31446e0;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2023p f31447f;

    /* JADX INFO: renamed from: f0 */
    public final C7135p f31448f0;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2011d f31449g;

    /* JADX INFO: renamed from: g0 */
    public final StateFlowImpl f31450g0;

    /* JADX INFO: renamed from: h */
    public final InterfaceC2015h f31451h;

    /* JADX INFO: renamed from: h0 */
    public final C7135p f31452h0;

    /* JADX INFO: renamed from: i */
    public final InterfaceC2012e f31453i;

    /* JADX INFO: renamed from: i0 */
    public final StateFlowImpl f31454i0;

    /* JADX INFO: renamed from: j */
    public final InterfaceC2024q f31455j;

    /* JADX INFO: renamed from: j0 */
    public final C7135p f31456j0;

    /* JADX INFO: renamed from: k */
    public final C6704a f31457k;

    /* JADX INFO: renamed from: k0 */
    public final StateFlowImpl f31458k0;

    /* JADX INFO: renamed from: l */
    public final InterfaceC5179a f31459l;

    /* JADX INFO: renamed from: l0 */
    public final C7135p f31460l0;

    /* JADX INFO: renamed from: m0 */
    public final StateFlowImpl f31461m0;

    /* JADX INFO: renamed from: n0 */
    public final C7135p f31462n0;

    /* JADX INFO: renamed from: o0 */
    public final StateFlowImpl f31463o0;

    /* JADX INFO: renamed from: p0 */
    public final C7135p f31464p0;

    /* JADX INFO: renamed from: q0 */
    public final StateFlowImpl f31465q0;

    /* JADX INFO: renamed from: r0 */
    public final C7135p f31466r0;

    /* JADX INFO: renamed from: s0 */
    public final StateFlowImpl f31467s0;

    /* JADX INFO: renamed from: t0 */
    public final C7135p f31468t0;

    /* JADX INFO: renamed from: u0 */
    public final StateFlowImpl f31469u0;

    /* JADX INFO: renamed from: v0 */
    public final StateFlowImpl f31470v0;

    /* JADX INFO: renamed from: w0 */
    public final C7138s f31471w0;

    /* JADX INFO: renamed from: x0 */
    public final StateFlowImpl f31472x0;

    /* JADX INFO: renamed from: y0 */
    public final C7135p f31473y0;

    /* JADX INFO: renamed from: z0 */
    public final StateFlowImpl f31474z0;

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenViewModel$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$1", m19206f = "TokenViewModel.kt", m19207l = {339}, m19208m = "invokeSuspend")
    final class C48331 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f31475e;

        /* JADX INFO: renamed from: com.lingq.ui.token.TokenViewModel$1$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lli/f;", "token", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$1$1", m19206f = "TokenViewModel.kt", m19207l = {346}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7379f, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public TokenViewModel f31477e;

            /* JADX INFO: renamed from: f */
            public int f31478f;

            /* JADX INFO: renamed from: g */
            public /* synthetic */ Object f31479g;

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ TokenViewModel f31480h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TokenViewModel tokenViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f31480h = tokenViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f31480h, interfaceC9968c);
                anonymousClass1.f31479g = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(InterfaceC7379f interfaceC7379f, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(interfaceC7379f, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                InterfaceC7379f interfaceC7379f;
                TokenViewModel tokenViewModel;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f31478f;
                if (i10 == 0) {
                    C7499b.m14977z0(obj);
                    interfaceC7379f = (InterfaceC7379f) this.f31479g;
                    if (interfaceC7379f != null) {
                        TokenViewModel tokenViewModel2 = this.f31480h;
                        C4924a.m10450b(tokenViewModel2.f31419O);
                        tokenViewModel2.f31419O = C7828f.m15570d(C8573r0.m16767w0(tokenViewModel2), null, null, new TokenViewModel$fetchActiveDictionaries$1(tokenViewModel2, null), 3);
                        AbstractC4864a.b bVar = AbstractC4864a.b.f31722a;
                        StateFlowImpl stateFlowImpl = tokenViewModel2.f31418N0;
                        stateFlowImpl.setValue(bVar);
                        tokenViewModel2.m10381v2(interfaceC7379f, (AbstractC4864a) stateFlowImpl.getValue());
                        PreferenceStoreImpl$special$$inlined$map$6 preferenceStoreImpl$special$$inlined$map$6Mo9604s = tokenViewModel2.f31459l.mo9604s();
                        this.f31479g = interfaceC7379f;
                        this.f31477e = tokenViewModel2;
                        this.f31478f = 1;
                        Object objM14360a = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$6Mo9604s, this);
                        if (objM14360a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        tokenViewModel = tokenViewModel2;
                        obj = objM14360a;
                    }
                    return C9072e.f47360a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tokenViewModel = this.f31477e;
                interfaceC7379f = (InterfaceC7379f) this.f31479g;
                C7499b.m14977z0(obj);
                if (((Boolean) obj).booleanValue() && !((Boolean) tokenViewModel.f31424Q0.getValue()).booleanValue() && tokenViewModel.f31429T.f34368c) {
                    tokenViewModel.m10380u2();
                }
                String strMo14774c = interfaceC7379f.mo14774c();
                tokenViewModel.getClass();
                C7828f.m15570d(C8573r0.m16767w0(tokenViewModel), tokenViewModel.f31407I, null, new TokenViewModel$getGrammarTags$1(tokenViewModel, strMo14774c, null), 2);
                return C9072e.f47360a;
            }
        }

        public C48331(InterfaceC9968c<? super C48331> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return TokenViewModel.this.new C48331(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C48331) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f31475e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                TokenViewModel tokenViewModel = TokenViewModel.this;
                C7135p c7135p = tokenViewModel.f31437X;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(tokenViewModel, null);
                this.f31475e = 1;
                if (C0062b.m369m0(c7135p, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenViewModel$2 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$2", m19206f = "TokenViewModel.kt", m19207l = {361}, m19208m = "invokeSuspend")
    final class C48342 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f31481e;

        /* JADX INFO: renamed from: com.lingq.ui.token.TokenViewModel$2$2, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\u00020\u0007*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0003H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lkotlin/Pair;", "", "Lcom/lingq/ui/token/TokenData;", "", "locales", "token", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$2$2", m19206f = "TokenViewModel.kt", m19207l = {360}, m19208m = "invokeSuspend")
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC2058r<InterfaceC7117d<? super Pair<? extends String, ? extends TokenData>>, Pair<? extends List<? extends String>, ? extends String>, TokenData, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public int f31483e;

            /* JADX INFO: renamed from: f */
            public /* synthetic */ InterfaceC7117d f31484f;

            /* JADX INFO: renamed from: g */
            public /* synthetic */ Pair f31485g;

            /* JADX INFO: renamed from: h */
            public /* synthetic */ TokenData f31486h;

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ TokenViewModel f31487i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(TokenViewModel tokenViewModel, InterfaceC9968c<? super AnonymousClass2> interfaceC9968c) {
                super(4, interfaceC9968c);
                this.f31487i = tokenViewModel;
            }

            @Override // cm.InterfaceC2058r
            /* JADX INFO: renamed from: T */
            public final Object mo1851T(InterfaceC7117d<? super Pair<? extends String, ? extends TokenData>> interfaceC7117d, Pair<? extends List<? extends String>, ? extends String> pair, TokenData tokenData, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f31487i, interfaceC9968c);
                anonymousClass2.f31484f = interfaceC7117d;
                anonymousClass2.f31485g = pair;
                anonymousClass2.f31486h = tokenData;
                return anonymousClass2.mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f31483e;
                if (i10 == 0) {
                    C7499b.m14977z0(obj);
                    InterfaceC7117d interfaceC7117d = this.f31484f;
                    Pair pair = this.f31485g;
                    TokenData tokenData = this.f31486h;
                    CharSequence charSequenceMo507p1 = (CharSequence) pair.f38013b;
                    if (charSequenceMo507p1.length() == 0) {
                        charSequenceMo507p1 = this.f31487i.mo507p1();
                    }
                    Pair pair2 = new Pair(charSequenceMo507p1, tokenData);
                    this.f31484f = null;
                    this.f31485g = null;
                    this.f31483e = 1;
                    if (interfaceC7117d.mo1339r(pair2, this) == coroutineSingletons) {
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

        /* JADX INFO: renamed from: com.lingq.ui.token.TokenViewModel$2$3, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Pair;", "", "Lcom/lingq/ui/token/TokenData;", "<name for destructuring parameter 0>", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$2$3", m19206f = "TokenViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC2056p<Pair<? extends String, ? extends TokenData>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f31488e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ TokenViewModel f31489f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(TokenViewModel tokenViewModel, InterfaceC9968c<? super AnonymousClass3> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f31489f = tokenViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.f31489f, interfaceC9968c);
                anonymousClass3.f31488e = obj;
                return anonymousClass3;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Pair<? extends String, ? extends TokenData> pair, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass3) mo1336a(pair, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                Pair pair = (Pair) this.f31488e;
                String str = (String) pair.f38012a;
                String str2 = ((TokenData) pair.f38013b).f31175a;
                TokenViewModel tokenViewModel = this.f31489f;
                tokenViewModel.getClass();
                C7828f.m15570d(C8573r0.m16767w0(tokenViewModel), null, null, new TokenViewModel$fetchPopularMeanings$1(tokenViewModel, str2, str, null), 3);
                C7828f.m15570d(C8573r0.m16767w0(tokenViewModel), null, null, new TokenViewModel$updatePopularMeanings$1(tokenViewModel, tokenViewModel.mo498E1(), str2, str, null), 3);
                return C9072e.f47360a;
            }
        }

        public C48342(InterfaceC9968c<? super C48342> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return TokenViewModel.this.new C48342(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C48342) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f31481e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                TokenViewModel tokenViewModel = TokenViewModel.this;
                final StateFlowImpl stateFlowImpl = tokenViewModel.f31465q0;
                C7136q c7136qM385q0 = C0062b.m385q0(new InterfaceC7116c<Pair<? extends List<? extends String>, ? extends String>>() { // from class: com.lingq.ui.token.TokenViewModel$2$invokeSuspend$$inlined$filterNot$1

                    /* JADX INFO: renamed from: com.lingq.ui.token.TokenViewModel$2$invokeSuspend$$inlined$filterNot$1$2 */
                    public static final class C48352<T> implements InterfaceC7117d {

                        /* JADX INFO: renamed from: a */
                        public final /* synthetic */ InterfaceC7117d f31491a;

                        /* JADX INFO: renamed from: com.lingq.ui.token.TokenViewModel$2$invokeSuspend$$inlined$filterNot$1$2$1, reason: invalid class name */
                        @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                        @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$2$invokeSuspend$$inlined$filterNot$1$2", m19206f = "TokenViewModel.kt", m19207l = {223}, m19208m = "emit")
                        public static final class AnonymousClass1 extends ContinuationImpl {

                            /* JADX INFO: renamed from: d */
                            public /* synthetic */ Object f31492d;

                            /* JADX INFO: renamed from: e */
                            public int f31493e;

                            public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                                super(interfaceC9968c);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            /* JADX INFO: renamed from: x */
                            public final Object mo1338x(Object obj) {
                                this.f31492d = obj;
                                this.f31493e |= Integer.MIN_VALUE;
                                return C48352.this.mo1339r(null, this);
                            }
                        }

                        public C48352(InterfaceC7117d interfaceC7117d) {
                            this.f31491a = interfaceC7117d;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0016  */
                        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                        @Override // kotlinx.coroutines.flow.InterfaceC7117d
                        /* JADX INFO: renamed from: r */
                        public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                            AnonymousClass1 anonymousClass1;
                            if (interfaceC9968c instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                                int i10 = anonymousClass1.f31493e;
                                if ((i10 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.f31493e = i10 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                            }
                            Object obj2 = anonymousClass1.f31492d;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i11 = anonymousClass1.f31493e;
                            if (i11 == 0) {
                                C7499b.m14977z0(obj2);
                                if (!((List) ((Pair) obj).f38012a).isEmpty()) {
                                    anonymousClass1.f31493e = 1;
                                    if (this.f31491a.mo1339r(obj, anonymousClass1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                C7499b.m14977z0(obj2);
                            }
                            return C9072e.f47360a;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC7116c
                    /* JADX INFO: renamed from: a */
                    public final Object mo9539a(InterfaceC7117d<? super Pair<? extends List<? extends String>, ? extends String>> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                        Object objMo9539a = stateFlowImpl.mo9539a(new C48352(interfaceC7117d), interfaceC9968c);
                        return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
                    }
                }, new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(tokenViewModel.f31433V), new AnonymousClass2(tokenViewModel, null));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(tokenViewModel, null);
                this.f31481e = 1;
                if (C0062b.m369m0(c7136qM385q0, anonymousClass3, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenViewModel$3 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$3", m19206f = "TokenViewModel.kt", m19207l = {372}, m19208m = "invokeSuspend")
    final class C48363 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f31495e;

        /* JADX INFO: renamed from: com.lingq.ui.token.TokenViewModel$3$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u00020\u0006*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lkotlin/Pair;", "Lli/f;", "Lli/c;", "token", "meanings", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$3$1", m19206f = "TokenViewModel.kt", m19207l = {371}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2058r<InterfaceC7117d<? super Pair<? extends InterfaceC7379f, ? extends C7376c>>, InterfaceC7379f, C7376c, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public int f31497e;

            /* JADX INFO: renamed from: f */
            public /* synthetic */ InterfaceC7117d f31498f;

            /* JADX INFO: renamed from: g */
            public /* synthetic */ InterfaceC7379f f31499g;

            /* JADX INFO: renamed from: h */
            public /* synthetic */ C7376c f31500h;

            public AnonymousClass1(InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(4, interfaceC9968c);
            }

            @Override // cm.InterfaceC2058r
            /* JADX INFO: renamed from: T */
            public final Object mo1851T(InterfaceC7117d<? super Pair<? extends InterfaceC7379f, ? extends C7376c>> interfaceC7117d, InterfaceC7379f interfaceC7379f, C7376c c7376c, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                anonymousClass1.f31498f = interfaceC7117d;
                anonymousClass1.f31499g = interfaceC7379f;
                anonymousClass1.f31500h = c7376c;
                return anonymousClass1.mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f31497e;
                if (i10 == 0) {
                    C7499b.m14977z0(obj);
                    InterfaceC7117d interfaceC7117d = this.f31498f;
                    Pair pair = new Pair(this.f31499g, this.f31500h);
                    this.f31498f = null;
                    this.f31499g = null;
                    this.f31497e = 1;
                    if (interfaceC7117d.mo1339r(pair, this) == coroutineSingletons) {
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

        /* JADX INFO: renamed from: com.lingq.ui.token.TokenViewModel$3$2, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Pair;", "Lli/f;", "Lli/c;", "<name for destructuring parameter 0>", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$3$2", m19206f = "TokenViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC2056p<Pair<? extends InterfaceC7379f, ? extends C7376c>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f31501e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ TokenViewModel f31502f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(TokenViewModel tokenViewModel, InterfaceC9968c<? super AnonymousClass2> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f31502f = tokenViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f31502f, interfaceC9968c);
                anonymousClass2.f31501e = obj;
                return anonymousClass2;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Pair<? extends InterfaceC7379f, ? extends C7376c> pair, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass2) mo1336a(pair, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                Pair pair = (Pair) this.f31501e;
                InterfaceC7379f interfaceC7379f = (InterfaceC7379f) pair.f38012a;
                C7376c c7376c = (C7376c) pair.f38013b;
                if (interfaceC7379f.mo14772a().isEmpty() && c7376c.f41165a.isEmpty()) {
                    String strMo14774c = interfaceC7379f.mo14774c();
                    TokenViewModel tokenViewModel = this.f31502f;
                    tokenViewModel.getClass();
                    C7828f.m15570d(C8573r0.m16767w0(tokenViewModel), null, null, new TokenViewModel$fetchTokenTranslation$1(tokenViewModel, strMo14774c, null), 3);
                }
                return C9072e.f47360a;
            }
        }

        public C48363(InterfaceC9968c<? super C48363> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return TokenViewModel.this.new C48363(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C48363) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f31495e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                TokenViewModel tokenViewModel = TokenViewModel.this;
                C7136q c7136qM385q0 = C0062b.m385q0(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(tokenViewModel.f31437X), new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(tokenViewModel.f31442c0), new AnonymousClass1(null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(tokenViewModel, null);
                this.f31495e = 1;
                if (C0062b.m369m0(c7136qM385q0, anonymousClass2, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenViewModel$4 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$4", m19206f = "TokenViewModel.kt", m19207l = {380}, m19208m = "invokeSuspend")
    final class C48374 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f31503e;

        /* JADX INFO: renamed from: com.lingq.ui.token.TokenViewModel$4$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/token/TokenTranslations;", "translations", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$4$1", m19206f = "TokenViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<TokenTranslations, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f31505e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ TokenViewModel f31506f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TokenViewModel tokenViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f31506f = tokenViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f31506f, interfaceC9968c);
                anonymousClass1.f31505e = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(TokenTranslations tokenTranslations, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(tokenTranslations, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                TokenViewModel tokenViewModel;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                TokenTranslations tokenTranslations = (TokenTranslations) this.f31505e;
                if (!tokenTranslations.f22122b.isEmpty()) {
                    List<TokenTranslationSimple> list = tokenTranslations.f22122b;
                    ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
                    Iterator<T> it = list.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        tokenViewModel = this.f31506f;
                        if (!zHasNext) {
                            break;
                        }
                        arrayList.add(new TokenMeaning(0, tokenViewModel.mo507p1(), ((TokenTranslationSimple) it.next()).f22117a, 0, false, tokenViewModel.mo507p1(), true, 0));
                    }
                    tokenViewModel.f31442c0.setValue(new C7376c(arrayList));
                }
                return C9072e.f47360a;
            }
        }

        public C48374(InterfaceC9968c<? super C48374> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return TokenViewModel.this.new C48374(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C48374) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f31503e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                TokenViewModel tokenViewModel = TokenViewModel.this;
                FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(tokenViewModel.f31422P0);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(tokenViewModel, null);
                this.f31503e = 1;
                if (C0062b.m369m0(flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenViewModel$5 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$5", m19206f = "TokenViewModel.kt", m19207l = {403, 405, 407, 410}, m19208m = "invokeSuspend")
    final class C48385 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public Map f31507e;

        /* JADX INFO: renamed from: f */
        public Object f31508f;

        /* JADX INFO: renamed from: g */
        public int f31509g;

        public C48385(InterfaceC9968c<? super C48385> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return TokenViewModel.this.new C48385(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C48385) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x009b  */
        /* JADX WARN: Code duplicated, block: B:28:0x009d  */
        /* JADX WARN: Code duplicated, block: B:31:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:33:0x00c4  */
        /* JADX WARN: Code duplicated, block: B:36:0x00df A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:37:0x00e0  */
        /* JADX WARN: Code duplicated, block: B:40:0x00f4  */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            String str;
            Map<String, String> map;
            Map<String, String> map2;
            Map<String, String> map3;
            StateFlowImpl stateFlowImpl;
            Object objM14360a;
            InterfaceC7133n interfaceC7133n;
            Map<String, String> map4;
            String str2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f31509g;
            TokenViewModel tokenViewModel = TokenViewModel.this;
            if (i10 != 0) {
                if (i10 == 1) {
                    C7499b.m14977z0(obj);
                } else if (i10 == 2) {
                    str = (String) this.f31508f;
                    Map<String, String> map5 = this.f31507e;
                    C7499b.m14977z0(obj);
                    map = map5;
                    if (((Profile) obj).f17798r.contains(str)) {
                        map3 = map;
                    } else {
                        map2 = map;
                        map2.put(tokenViewModel.mo498E1(), tokenViewModel.mo507p1());
                        this.f31507e = map2;
                        this.f31508f = null;
                        this.f31509g = 3;
                        if (tokenViewModel.f31405H.mo9680d(map2, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        map3 = map2;
                    }
                    stateFlowImpl = tokenViewModel.f31465q0;
                    InterfaceC7116c<Profile> interfaceC7116cMo504j1 = tokenViewModel.mo504j1();
                    this.f31507e = map3;
                    this.f31508f = stateFlowImpl;
                    this.f31509g = 4;
                    objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo504j1, this);
                    if (objM14360a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC7133n = stateFlowImpl;
                    obj = objM14360a;
                    map4 = map3;
                } else if (i10 == 3) {
                    Map<String, String> map6 = this.f31507e;
                    C7499b.m14977z0(obj);
                    map3 = map6;
                    stateFlowImpl = tokenViewModel.f31465q0;
                    InterfaceC7116c<Profile> interfaceC7116cMo504j2 = tokenViewModel.mo504j1();
                    this.f31507e = map3;
                    this.f31508f = stateFlowImpl;
                    this.f31509g = 4;
                    objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo504j2, this);
                    if (objM14360a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC7133n = stateFlowImpl;
                    obj = objM14360a;
                    map4 = map3;
                } else {
                    if (i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC7133n = (InterfaceC7133n) this.f31508f;
                    Map<String, String> map7 = this.f31507e;
                    C7499b.m14977z0(obj);
                    map4 = map7;
                }
                List<String> list = ((Profile) obj).f17798r;
                str2 = map4.get(tokenViewModel.mo498E1());
                if (str2 == null) {
                    str2 = "";
                }
                interfaceC7133n.setValue(new Pair(list, str2));
                return C9072e.f47360a;
            }
            C7499b.m14977z0(obj);
            InterfaceC7116c<Map<String, String>> interfaceC7116cMo9677a = tokenViewModel.f31405H.mo9677a();
            this.f31509g = 1;
            obj = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9677a, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            LinkedHashMap linkedHashMapM13467T0 = C6753d.m13467T0((Map) obj);
            str = (String) linkedHashMapM13467T0.get(tokenViewModel.mo498E1());
            map2 = linkedHashMapM13467T0;
            if (str != null) {
                InterfaceC7116c<Profile> interfaceC7116cMo504j3 = tokenViewModel.mo504j1();
                this.f31507e = linkedHashMapM13467T0;
                this.f31508f = str;
                this.f31509g = 2;
                Object objM14360a2 = FlowKt__ReduceKt.m14360a(interfaceC7116cMo504j3, this);
                if (objM14360a2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                map = linkedHashMapM13467T0;
                obj = objM14360a2;
                if (((Profile) obj).f17798r.contains(str)) {
                    map2 = map;
                    map2.put(tokenViewModel.mo498E1(), tokenViewModel.mo507p1());
                    this.f31507e = map2;
                    this.f31508f = null;
                    this.f31509g = 3;
                    if (tokenViewModel.f31405H.mo9680d(map2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    map3 = map2;
                } else {
                    map3 = map;
                }
            } else {
                map2.put(tokenViewModel.mo498E1(), tokenViewModel.mo507p1());
                this.f31507e = map2;
                this.f31508f = null;
                this.f31509g = 3;
                if (tokenViewModel.f31405H.mo9680d(map2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                map3 = map2;
            }
            stateFlowImpl = tokenViewModel.f31465q0;
            InterfaceC7116c<Profile> interfaceC7116cMo504j4 = tokenViewModel.mo504j1();
            this.f31507e = map3;
            this.f31508f = stateFlowImpl;
            this.f31509g = 4;
            objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo504j4, this);
            if (objM14360a == coroutineSingletons) {
                return coroutineSingletons;
            }
            interfaceC7133n = stateFlowImpl;
            obj = objM14360a;
            map4 = map3;
            List<String> list2 = ((Profile) obj).f17798r;
            str2 = map4.get(tokenViewModel.mo498E1());
            if (str2 == null) {
                str2 = "";
            }
            interfaceC7133n.setValue(new Pair(list2, str2));
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenViewModel$6 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$6", m19206f = "TokenViewModel.kt", m19207l = {416}, m19208m = "invokeSuspend")
    final class C48396 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f31511e;

        /* JADX INFO: renamed from: com.lingq.ui.token.TokenViewModel$6$a */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f31513a;

            static {
                int[] iArr = new int[TokenControllerType.values().length];
                try {
                    iArr[TokenControllerType.Lesson.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TokenControllerType.LessonExpanded.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TokenControllerType.Vocabulary.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[TokenControllerType.Review.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f31513a = iArr;
            }
        }

        public C48396(InterfaceC9968c<? super C48396> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return TokenViewModel.this.new C48396(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C48396) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            TokenViewState tokenViewState;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f31511e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                this.f31511e = 1;
                if (C7828f.m15567a(36L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            TokenViewModel tokenViewModel = TokenViewModel.this;
            int i11 = a.f31513a[tokenViewModel.f31429T.f34366a.f31181g.ordinal()];
            if (i11 == 1) {
                tokenViewState = tokenViewModel.f31429T.f34366a.f31180f;
            } else {
                if (i11 != 2 && i11 != 3 && i11 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                tokenViewState = TokenViewState.Expanded.f31717a;
            }
            tokenViewModel.m10384z2(tokenViewState);
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenViewModel$7 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$7", m19206f = "TokenViewModel.kt", m19207l = {428, 429}, m19208m = "invokeSuspend")
    final class C48407 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f31514e;

        /* JADX INFO: renamed from: com.lingq.ui.token.TokenViewModel$7$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$7$1", m19206f = "TokenViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Integer, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ int f31516e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ TokenViewModel f31517f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TokenViewModel tokenViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f31517f = tokenViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f31517f, interfaceC9968c);
                anonymousClass1.f31516e = ((Number) obj).intValue();
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Integer num, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(Integer.valueOf(num.intValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                this.f31517f.f31434V0.setValue(Boolean.valueOf(this.f31516e > 0));
                return C9072e.f47360a;
            }
        }

        public C48407(InterfaceC9968c<? super C48407> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return TokenViewModel.this.new C48407(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C48407) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f31514e;
            TokenViewModel tokenViewModel = TokenViewModel.this;
            if (i10 != 0) {
                if (i10 == 1) {
                    C7499b.m14977z0(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(obj);
                }
                return C9072e.f47360a;
            }
            C7499b.m14977z0(obj);
            InterfaceC2024q interfaceC2024q = tokenViewModel.f31455j;
            String strMo498E1 = tokenViewModel.mo498E1();
            this.f31514e = 1;
            obj = interfaceC2024q.mo6170a(strMo498E1);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(tokenViewModel, null);
            this.f31514e = 2;
            if (C0062b.m369m0((InterfaceC7116c) obj, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return C9072e.f47360a;
        }
    }

    public TokenViewModel(InterfaceC2008a interfaceC2008a, InterfaceC2026s interfaceC2026s, InterfaceC2023p interfaceC2023p, InterfaceC2011d interfaceC2011d, InterfaceC2015h interfaceC2015h, InterfaceC2012e interfaceC2012e, InterfaceC2024q interfaceC2024q, InterfaceC0113j interfaceC0113j, InterfaceC4865b interfaceC4865b, InterfaceC4912b interfaceC4912b, InterfaceC7366c interfaceC7366c, C6704a c6704a, InterfaceC5179a interfaceC5179a, InterfaceC5182d interfaceC5182d, ExecutorC7177a executorC7177a, InterfaceC7882z interfaceC7882z, C1024c0 c1024c0) {
        Integer num;
        Boolean bool;
        Boolean bool2;
        C5207g.m11111f(interfaceC2008a, "cardRepository");
        C5207g.m11111f(interfaceC2026s, "wordRepository");
        C5207g.m11111f(interfaceC2023p, "tokenDataRepository");
        C5207g.m11111f(interfaceC2011d, "dictionaryRepository");
        C5207g.m11111f(interfaceC2015h, "localeRepository");
        C5207g.m11111f(interfaceC2012e, "languageRepository");
        C5207g.m11111f(interfaceC2024q, "ttsRepository");
        C5207g.m11111f(interfaceC0113j, "sessionViewModelDelegate");
        C5207g.m11111f(interfaceC4865b, "tokenControllerDelegate");
        C5207g.m11111f(interfaceC4912b, "tooltipsController");
        C5207g.m11111f(interfaceC7366c, "milestonesController");
        C5207g.m11111f(c6704a, "appSettings");
        C5207g.m11111f(interfaceC5179a, "preferenceStore");
        C5207g.m11111f(interfaceC5182d, "utilStore");
        C5207g.m11111f(interfaceC7882z, "applicationScope");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f31443d = interfaceC2008a;
        this.f31445e = interfaceC2026s;
        this.f31447f = interfaceC2023p;
        this.f31449g = interfaceC2011d;
        this.f31451h = interfaceC2015h;
        this.f31453i = interfaceC2012e;
        this.f31455j = interfaceC2024q;
        this.f31457k = c6704a;
        this.f31459l = interfaceC5179a;
        this.f31405H = interfaceC5182d;
        this.f31407I = executorC7177a;
        this.f31409J = interfaceC7882z;
        this.f31411K = interfaceC0113j;
        this.f31413L = interfaceC4865b;
        this.f31415M = interfaceC7366c;
        this.f31417N = interfaceC4912b;
        LinkedHashMap linkedHashMap = c1024c0.f6616a;
        if (!linkedHashMap.containsKey("tokenData")) {
            throw new IllegalArgumentException("Required argument \"tokenData\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(TokenData.class) && !Serializable.class.isAssignableFrom(TokenData.class)) {
            throw new UnsupportedOperationException(TokenData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        TokenData tokenData = (TokenData) c1024c0.m3929b("tokenData");
        if (tokenData == null) {
            throw new IllegalArgumentException("Argument \"tokenData\" is marked as non-null but was passed a null value");
        }
        if (linkedHashMap.containsKey("lessonId")) {
            num = (Integer) c1024c0.m3929b("lessonId");
            if (num == null) {
                throw new IllegalArgumentException("Argument \"lessonId\" of type integer does not support null values");
            }
        } else {
            num = -1;
        }
        if (linkedHashMap.containsKey("shouldPlayTts")) {
            bool = (Boolean) c1024c0.m3929b("shouldPlayTts");
            if (bool == null) {
                throw new IllegalArgumentException("Argument \"shouldPlayTts\" of type boolean does not support null values");
            }
        } else {
            bool = Boolean.TRUE;
        }
        if (linkedHashMap.containsKey("fromVocabulary")) {
            bool2 = (Boolean) c1024c0.m3929b("fromVocabulary");
            if (bool2 == null) {
                throw new IllegalArgumentException("Argument \"fromVocabulary\" of type boolean does not support null values");
            }
        } else {
            bool2 = Boolean.FALSE;
        }
        C5568j c5568j = new C5568j(tokenData, num.intValue(), bool.booleanValue(), bool2.booleanValue());
        this.f31429T = c5568j;
        this.f31431U = c5568j;
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(null);
        this.f31433V = stateFlowImplM14379a;
        this.f31435W = C7120g.m14379a(Boolean.TRUE);
        ChannelFlowTransformLatest channelFlowTransformLatestM399t2 = C0062b.m399t2(stateFlowImplM14379a, new TokenViewModel$selectedToken$1(this, null));
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        C7135p c7135pM353h2 = C0062b.m353h2(channelFlowTransformLatestM399t2, interfaceC7882zM16767w0, startedWhileSubscribed, null);
        this.f31437X = c7135pM353h2;
        StateFlowImpl stateFlowImplM14379a2 = C7120g.m14379a("");
        this.f31438Y = stateFlowImplM14379a2;
        this.f31439Z = C0062b.m353h2(stateFlowImplM14379a2, C8573r0.m16767w0(this), startedWhileSubscribed, "");
        StateFlowImpl stateFlowImplM14379a3 = C7120g.m14379a(null);
        this.f31440a0 = stateFlowImplM14379a3;
        this.f31441b0 = C0062b.m353h2(stateFlowImplM14379a3, C8573r0.m16767w0(this), startedWhileSubscribed, null);
        StateFlowImpl stateFlowImplM14379a4 = C7120g.m14379a(null);
        this.f31442c0 = stateFlowImplM14379a4;
        EmptyList emptyList = EmptyList.f38032a;
        StateFlowImpl stateFlowImplM14379a5 = C7120g.m14379a(emptyList);
        this.f31444d0 = stateFlowImplM14379a5;
        StateFlowImpl stateFlowImplM14379a6 = C7120g.m14379a(emptyList);
        this.f31446e0 = stateFlowImplM14379a6;
        this.f31448f0 = C0062b.m353h2(C0062b.m377o0(stateFlowImplM14379a5, stateFlowImplM14379a6, new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(c7135pM353h2), new TokenViewModel$languageTags$1(null)), C8573r0.m16767w0(this), startedWhileSubscribed, new Triple(emptyList, emptyList, emptyList));
        Resource.Status status = Resource.Status.EMPTY;
        StateFlowImpl stateFlowImplM14379a7 = C7120g.m14379a(status);
        this.f31450g0 = stateFlowImplM14379a7;
        this.f31452h0 = C0062b.m353h2(stateFlowImplM14379a7, C8573r0.m16767w0(this), startedWhileSubscribed, status);
        StateFlowImpl stateFlowImplM14379a8 = C7120g.m14379a(status);
        this.f31454i0 = stateFlowImplM14379a8;
        this.f31456j0 = C0062b.m353h2(stateFlowImplM14379a8, C8573r0.m16767w0(this), startedWhileSubscribed, status);
        StateFlowImpl stateFlowImplM14379a9 = C7120g.m14379a(status);
        this.f31458k0 = stateFlowImplM14379a9;
        this.f31460l0 = C0062b.m353h2(stateFlowImplM14379a9, C8573r0.m16767w0(this), startedWhileSubscribed, status);
        StateFlowImpl stateFlowImplM14379a10 = C7120g.m14379a(status);
        this.f31461m0 = stateFlowImplM14379a10;
        this.f31462n0 = C0062b.m353h2(stateFlowImplM14379a10, C8573r0.m16767w0(this), startedWhileSubscribed, status);
        StateFlowImpl stateFlowImplM14379a11 = C7120g.m14379a(emptyList);
        this.f31463o0 = stateFlowImplM14379a11;
        this.f31464p0 = C0062b.m353h2(stateFlowImplM14379a11, C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        StateFlowImpl stateFlowImplM14379a12 = C7120g.m14379a(new Pair(emptyList, ""));
        this.f31465q0 = stateFlowImplM14379a12;
        this.f31466r0 = C0062b.m353h2(new C7131l(stateFlowImplM14379a11, stateFlowImplM14379a12, new TokenViewModel$localesSelected$1(null)), C8573r0.m16767w0(this), startedWhileSubscribed, new Triple(emptyList, emptyList, ""));
        TokenType tokenType = TokenType.WordType;
        StateFlowImpl stateFlowImplM14379a13 = C7120g.m14379a(new Pair(tokenType, emptyList));
        this.f31467s0 = stateFlowImplM14379a13;
        this.f31468t0 = C0062b.m353h2(stateFlowImplM14379a13, C8573r0.m16767w0(this), startedWhileSubscribed, new Pair(tokenType, emptyList));
        StateFlowImpl stateFlowImplM14379a14 = C7120g.m14379a(emptyList);
        this.f31469u0 = stateFlowImplM14379a14;
        C0062b.m353h2(stateFlowImplM14379a14, C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        StateFlowImpl stateFlowImplM14379a15 = C7120g.m14379a(status);
        this.f31470v0 = stateFlowImplM14379a15;
        C0062b.m353h2(stateFlowImplM14379a15, C8573r0.m16767w0(this), startedWhileSubscribed, status);
        C7138s c7138sM368m = C0062b.m368m(0, 3, BufferOverflow.DROP_OLDEST);
        this.f31471w0 = c7138sM368m;
        C0062b.m341d2(c7138sM368m, C8573r0.m16767w0(this), startedWhileSubscribed);
        StateFlowImpl stateFlowImplM14379a16 = C7120g.m14379a(null);
        this.f31472x0 = stateFlowImplM14379a16;
        this.f31473y0 = C0062b.m353h2(stateFlowImplM14379a16, C8573r0.m16767w0(this), startedWhileSubscribed, null);
        Boolean bool3 = Boolean.FALSE;
        StateFlowImpl stateFlowImplM14379a17 = C7120g.m14379a(bool3);
        this.f31474z0 = stateFlowImplM14379a17;
        this.f31398A0 = C0062b.m353h2(stateFlowImplM14379a17, C8573r0.m16767w0(this), startedWhileSubscribed, bool3);
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f31399B0 = c7138sM10448a;
        this.f31400C0 = C0062b.m341d2(c7138sM10448a, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a2 = C4924a.m10448a();
        this.f31401D0 = c7138sM10448a2;
        this.f31402E0 = C0062b.m341d2(c7138sM10448a2, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a3 = C4924a.m10448a();
        this.f31403F0 = c7138sM10448a3;
        this.f31404G0 = C0062b.m341d2(c7138sM10448a3, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a4 = C4924a.m10448a();
        this.f31406H0 = c7138sM10448a4;
        this.f31408I0 = c7138sM10448a4;
        C7138s c7138sM10448a5 = C4924a.m10448a();
        this.f31410J0 = c7138sM10448a5;
        this.f31412K0 = C0062b.m341d2(c7138sM10448a5, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a6 = C4924a.m10448a();
        this.f31414L0 = c7138sM10448a6;
        this.f31416M0 = C0062b.m341d2(c7138sM10448a6, C8573r0.m16767w0(this), startedWhileSubscribed);
        this.f31418N0 = C7120g.m14379a(AbstractC4864a.b.f31722a);
        FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(c7135pM353h2);
        final InterfaceC7142w<List<String>> interfaceC7142wMo500P = mo500P();
        this.f31420O0 = C0062b.m353h2(C0062b.m389r0(flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1, stateFlowImplM14379a4, new InterfaceC7116c<List<? extends String>>() { // from class: com.lingq.ui.token.TokenViewModel$special$$inlined$filterNot$1

            /* JADX INFO: renamed from: com.lingq.ui.token.TokenViewModel$special$$inlined$filterNot$1$2 */
            public static final class C48562<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f31654a;

                /* JADX INFO: renamed from: com.lingq.ui.token.TokenViewModel$special$$inlined$filterNot$1$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$special$$inlined$filterNot$1$2", m19206f = "TokenViewModel.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f31655d;

                    /* JADX INFO: renamed from: e */
                    public int f31656e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f31655d = obj;
                        this.f31656e |= Integer.MIN_VALUE;
                        return C48562.this.mo1339r(null, this);
                    }
                }

                public C48562(InterfaceC7117d interfaceC7117d) {
                    this.f31654a = interfaceC7117d;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x001a  */
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f31656e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f31656e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f31655d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f31656e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        if (!((List) obj).isEmpty()) {
                            anonymousClass1.f31656e = 1;
                            if (this.f31654a.mo1339r(obj, anonymousClass1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7499b.m14977z0(obj2);
                    }
                    return C9072e.f47360a;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC7116c
            /* JADX INFO: renamed from: a */
            public final Object mo9539a(InterfaceC7117d<? super List<? extends String>> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = interfaceC7142wMo500P.mo9539a(new C48562(interfaceC7117d), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        }, new TokenViewModel$tokenMeanings$2(null)), C8573r0.m16767w0(this), startedWhileSubscribed, null);
        this.f31422P0 = C7120g.m14379a(null);
        this.f31424Q0 = C7120g.m14379a(bool3);
        C7138s c7138sM10448a7 = C4924a.m10448a();
        this.f31426R0 = c7138sM10448a7;
        this.f31428S0 = C0062b.m341d2(c7138sM10448a7, C8573r0.m16767w0(this), startedWhileSubscribed);
        this.f31430T0 = C0062b.m353h2(C0062b.m377o0(stateFlowImplM14379a6, new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(c7135pM353h2), stateFlowImplM14379a16, new TokenViewModel$tags$1(this, null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        this.f31432U0 = C7120g.m14379a(emptyList);
        StateFlowImpl stateFlowImplM14379a18 = C7120g.m14379a(null);
        this.f31434V0 = stateFlowImplM14379a18;
        this.f31436W0 = C0062b.m353h2(stateFlowImplM14379a18, C8573r0.m16767w0(this), startedWhileSubscribed, null);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C48331(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C48342(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C48363(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C48374(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C48385(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C48396(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C48407(null), 3);
        m10376A2(tokenData);
        C4924a.m10450b(this.f31421P);
        this.f31421P = C7828f.m15570d(C8573r0.m16767w0(this), null, null, new TokenViewModel$fetchAvailableDictionaries$1(this, null), 3);
        C4924a.m10450b(this.f31423Q);
        this.f31423Q = C7828f.m15570d(C8573r0.m16767w0(this), null, null, new TokenViewModel$fetchAvailableLocales$1(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0072  */
    /* JADX WARN: Code duplicated, block: B:20:0x0094  */
    /* JADX WARN: Code duplicated, block: B:21:0x0097  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00db  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:46:0x0100  */
    /* JADX WARN: Code duplicated, block: B:48:0x0103  */
    /* JADX WARN: Code duplicated, block: B:55:0x0119  */
    /* JADX WARN: Code duplicated, block: B:57:0x0125 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x013c A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0097 -> B:22:0x009e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: l2 */
    public static final java.lang.Object m10368l2(com.lingq.p055ui.token.TokenViewModel r11, java.util.List r12, p464wl.InterfaceC9968c r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.p055ui.token.TokenViewModel.m10368l2(com.lingq.ui.token.TokenViewModel, java.util.List, wl.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0071  */
    /* JADX WARN: Code duplicated, block: B:21:0x0095  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00db  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:47:0x0101  */
    /* JADX WARN: Code duplicated, block: B:54:0x0117  */
    /* JADX WARN: Code duplicated, block: B:56:0x0125  */
    /* JADX WARN: Code duplicated, block: B:64:0x013b A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:66:0x013f A[PHI: r13
      0x013f: PHI (r13v20 java.lang.String) = 
      (r13v11 java.lang.String)
      (r13v15 java.lang.String)
      (r13v19 java.lang.String)
      (r13v22 java.lang.String)
      (r13v26 java.lang.String)
     binds: [B:63:0x0139, B:52:0x0113, B:41:0x00ee, B:65:0x013c, B:31:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0148  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0095 -> B:22:0x009c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: m2 */
    public static final java.lang.Object m10369m2(com.lingq.p055ui.token.TokenViewModel r11, java.util.List r12, p464wl.InterfaceC9968c r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.p055ui.token.TokenViewModel.m10369m2(com.lingq.ui.token.TokenViewModel, java.util.List, wl.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: n2 */
    public static final Serializable m10370n2(TokenViewModel tokenViewModel, String str, InterfaceC9968c interfaceC9968c) throws Throwable {
        TokenViewModel$scriptsForCard$1 tokenViewModel$scriptsForCard$1;
        Pair pair;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        TokenViewModel tokenViewModel2 = tokenViewModel;
        tokenViewModel2.getClass();
        if (interfaceC9968c instanceof TokenViewModel$scriptsForCard$1) {
            tokenViewModel$scriptsForCard$1 = (TokenViewModel$scriptsForCard$1) interfaceC9968c;
            int i10 = tokenViewModel$scriptsForCard$1.f31627g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                tokenViewModel$scriptsForCard$1.f31627g = i10 - Integer.MIN_VALUE;
            } else {
                tokenViewModel$scriptsForCard$1 = new TokenViewModel$scriptsForCard$1(tokenViewModel2, interfaceC9968c);
            }
        } else {
            tokenViewModel$scriptsForCard$1 = new TokenViewModel$scriptsForCard$1(tokenViewModel2, interfaceC9968c);
        }
        Object objMo5965q = tokenViewModel$scriptsForCard$1.f31625e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = tokenViewModel$scriptsForCard$1.f31627g;
        if (i11 == 0) {
            C7499b.m14977z0(objMo5965q);
            String strMo498E1 = tokenViewModel2.mo498E1();
            tokenViewModel$scriptsForCard$1.f31624d = tokenViewModel2;
            tokenViewModel$scriptsForCard$1.f31627g = 1;
            objMo5965q = tokenViewModel2.f31443d.mo5965q(strMo498E1, str, tokenViewModel$scriptsForCard$1);
            if (objMo5965q == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tokenViewModel2 = tokenViewModel$scriptsForCard$1.f31624d;
            C7499b.m14977z0(objMo5965q);
        }
        C7374a c7374a = (C7374a) objMo5965q;
        String str7 = "";
        if (c7374a == null) {
            return new Pair("", "");
        }
        String strMo498E2 = tokenViewModel2.mo498E1();
        boolean zM11106a = C5207g.m11106a(strMo498E2, C5408a.m11569b(LanguageLearn.Mandarin));
        LessonStudyTransliteration lessonStudyTransliteration = c7374a.f41155n;
        if (zM11106a) {
            if (lessonStudyTransliteration == null || (str6 = lessonStudyTransliteration.f21909c) == null) {
                str6 = "";
            }
            if (lessonStudyTransliteration != null) {
                String str8 = lessonStudyTransliteration.f21910d;
                str7 = str8 != null ? str8 : "";
            }
            pair = new Pair(str6, str7);
        } else if (C5207g.m11106a(strMo498E2, C5408a.m11570c(LanguageLearnBeta.ChineseTraditional))) {
            if (lessonStudyTransliteration == null || (str5 = lessonStudyTransliteration.f21909c) == null) {
                str5 = "";
            }
            if (lessonStudyTransliteration != null) {
                String str9 = lessonStudyTransliteration.f21911e;
                str7 = str9 != null ? str9 : "";
            }
            pair = new Pair(str5, str7);
        } else if (C5207g.m11106a(strMo498E2, C5408a.m11569b(LanguageLearn.Japanese))) {
            if (lessonStudyTransliteration == null || (str4 = lessonStudyTransliteration.f21908b) == null) {
                str4 = "";
            }
            if (lessonStudyTransliteration != null) {
                String str10 = lessonStudyTransliteration.f21907a;
                str7 = str10 != null ? str10 : "";
            }
            pair = new Pair(str4, str7);
        } else if (C5207g.m11106a(strMo498E2, C5408a.m11570c(LanguageLearnBeta.Cantonese))) {
            if (lessonStudyTransliteration == null || (str2 = lessonStudyTransliteration.f21912f) == null) {
                str2 = "";
            }
            if (lessonStudyTransliteration != null && (str3 = lessonStudyTransliteration.f21911e) != null) {
                str7 = str3;
            }
            pair = new Pair(str2, str7);
        } else {
            pair = new Pair("", "");
        }
        return pair;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX INFO: renamed from: o2 */
    public static final Serializable m10371o2(TokenViewModel tokenViewModel, String str, InterfaceC9968c interfaceC9968c) throws Throwable {
        TokenViewModel$scriptsForWord$1 tokenViewModel$scriptsForWord$1;
        String strM13430X;
        Pair pair;
        List<String> list;
        List<String> list2;
        String strM13430X2;
        List<String> list3;
        List<String> list4;
        String strM13430X3;
        List<String> list5;
        List<String> list6;
        String strM13430X4;
        List<String> list7;
        List<String> list8;
        tokenViewModel.getClass();
        if (interfaceC9968c instanceof TokenViewModel$scriptsForWord$1) {
            tokenViewModel$scriptsForWord$1 = (TokenViewModel$scriptsForWord$1) interfaceC9968c;
            int i10 = tokenViewModel$scriptsForWord$1.f31631g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                tokenViewModel$scriptsForWord$1.f31631g = i10 - Integer.MIN_VALUE;
            } else {
                tokenViewModel$scriptsForWord$1 = new TokenViewModel$scriptsForWord$1(tokenViewModel, interfaceC9968c);
            }
        } else {
            tokenViewModel$scriptsForWord$1 = new TokenViewModel$scriptsForWord$1(tokenViewModel, interfaceC9968c);
        }
        Object objMo6201k = tokenViewModel$scriptsForWord$1.f31629e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = tokenViewModel$scriptsForWord$1.f31631g;
        if (i11 == 0) {
            C7499b.m14977z0(objMo6201k);
            String strMo498E1 = tokenViewModel.mo498E1();
            tokenViewModel$scriptsForWord$1.f31628d = tokenViewModel;
            tokenViewModel$scriptsForWord$1.f31631g = 1;
            objMo6201k = tokenViewModel.f31445e.mo6201k(strMo498E1, str, tokenViewModel$scriptsForWord$1);
            if (objMo6201k == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tokenViewModel = tokenViewModel$scriptsForWord$1.f31628d;
            C7499b.m14977z0(objMo6201k);
        }
        C7378e c7378e = (C7378e) objMo6201k;
        String strM13430X5 = "";
        if (c7378e == null) {
            return new Pair(strM13430X5, strM13430X5);
        }
        String strMo498E2 = tokenViewModel.mo498E1();
        boolean zM11106a = C5207g.m11106a(strMo498E2, C5408a.m11569b(LanguageLearn.Mandarin));
        TokenReadings tokenReadings = c7378e.f41175i;
        if (zM11106a) {
            if (tokenReadings == null || (list8 = tokenReadings.f22103c) == null) {
                strM13430X4 = strM13430X5;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list8.iterator();
                loop0: while (true) {
                    while (true) {
                        if (!it.hasNext()) {
                            break loop0;
                        }
                        Object next = it.next();
                        if (!(((String) next).length() == 0)) {
                            arrayList.add(next);
                        }
                    }
                }
                strM13430X4 = C6752c.m13430X(arrayList, " &#8226; ", null, null, null, 62);
            }
            if (tokenReadings != null && (list7 = tokenReadings.f22104d) != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it2 = list7.iterator();
                loop2: while (true) {
                    while (true) {
                        if (!it2.hasNext()) {
                            break loop2;
                        }
                        Object next2 = it2.next();
                        if (!(((String) next2).length() == 0)) {
                            arrayList2.add(next2);
                        }
                    }
                }
                strM13430X5 = C6752c.m13430X(arrayList2, " &#8226; ", null, null, null, 62);
            }
            pair = new Pair(strM13430X4, strM13430X5);
        } else if (C5207g.m11106a(strMo498E2, C5408a.m11570c(LanguageLearnBeta.ChineseTraditional))) {
            if (tokenReadings == null || (list6 = tokenReadings.f22103c) == null) {
                strM13430X3 = strM13430X5;
            } else {
                ArrayList arrayList3 = new ArrayList();
                Iterator<T> it3 = list6.iterator();
                loop4: while (true) {
                    while (true) {
                        if (!it3.hasNext()) {
                            break loop4;
                        }
                        Object next3 = it3.next();
                        if (!(((String) next3).length() == 0)) {
                            arrayList3.add(next3);
                        }
                    }
                }
                strM13430X3 = C6752c.m13430X(arrayList3, " &#8226; ", null, null, null, 62);
            }
            if (tokenReadings != null && (list5 = tokenReadings.f22105e) != null) {
                ArrayList arrayList4 = new ArrayList();
                Iterator<T> it4 = list5.iterator();
                loop6: while (true) {
                    while (true) {
                        if (!it4.hasNext()) {
                            break loop6;
                        }
                        Object next4 = it4.next();
                        if (!(((String) next4).length() == 0)) {
                            arrayList4.add(next4);
                        }
                    }
                }
                strM13430X5 = C6752c.m13430X(arrayList4, " &#8226; ", null, null, null, 62);
            }
            pair = new Pair(strM13430X3, strM13430X5);
        } else if (C5207g.m11106a(strMo498E2, C5408a.m11569b(LanguageLearn.Japanese))) {
            if (tokenReadings == null || (list4 = tokenReadings.f22101a) == null) {
                strM13430X2 = strM13430X5;
            } else {
                ArrayList arrayList5 = new ArrayList();
                for (Object obj : list4) {
                    if (!(((String) obj).length() == 0)) {
                        arrayList5.add(obj);
                    }
                }
                strM13430X2 = C6752c.m13430X(arrayList5, " &#8226; ", null, null, null, 62);
            }
            if (tokenReadings != null && (list3 = tokenReadings.f22102b) != null) {
                ArrayList arrayList6 = new ArrayList();
                Iterator<T> it5 = list3.iterator();
                loop9: while (true) {
                    while (true) {
                        if (!it5.hasNext()) {
                            break loop9;
                        }
                        Object next5 = it5.next();
                        if (!(((String) next5).length() == 0)) {
                            arrayList6.add(next5);
                        }
                    }
                }
                strM13430X5 = C6752c.m13430X(arrayList6, " &#8226; ", null, null, null, 62);
            }
            pair = new Pair(strM13430X2, strM13430X5);
        } else {
            if (!C5207g.m11106a(strMo498E2, C5408a.m11570c(LanguageLearnBeta.Cantonese))) {
                return new Pair(strM13430X5, strM13430X5);
            }
            if (tokenReadings == null || (list2 = tokenReadings.f22106f) == null) {
                strM13430X = strM13430X5;
            } else {
                ArrayList arrayList7 = new ArrayList();
                Iterator<T> it6 = list2.iterator();
                loop11: while (true) {
                    while (true) {
                        if (!it6.hasNext()) {
                            break loop11;
                        }
                        Object next6 = it6.next();
                        if (!(((String) next6).length() == 0)) {
                            arrayList7.add(next6);
                        }
                    }
                }
                strM13430X = C6752c.m13430X(arrayList7, " &#8226; ", null, null, null, 62);
            }
            if (tokenReadings != null && (list = tokenReadings.f22105e) != null) {
                ArrayList arrayList8 = new ArrayList();
                for (Object obj2 : list) {
                    if (!(((String) obj2).length() == 0)) {
                        arrayList8.add(obj2);
                    }
                }
                strM13430X5 = C6752c.m13430X(arrayList8, " &#8226; ", null, null, null, 62);
            }
            pair = new Pair(strM13430X, strM13430X5);
        }
        return pair;
    }

    /* JADX INFO: renamed from: p2 */
    public static final void m10372p2(TokenViewModel tokenViewModel, InterfaceC7379f interfaceC7379f) {
        TokenData tokenData;
        TokenType tokenType;
        if (interfaceC7379f == null) {
            tokenViewModel.getClass();
            return;
        }
        StateFlowImpl stateFlowImpl = tokenViewModel.f31433V;
        TokenData tokenData2 = (TokenData) stateFlowImpl.getValue();
        if (tokenData2 != null) {
            TokenType tokenType2 = tokenData2.f31176b;
            int i10 = tokenData2.f31177c;
            int i11 = tokenData2.f31178d;
            int i12 = tokenData2.f31183i;
            TokenTransliteration tokenTransliteration = tokenData2.f31184j;
            String str = tokenData2.f31175a;
            C5207g.m11111f(str, "token");
            C5207g.m11111f(tokenType2, "type");
            TokenFragmentData tokenFragmentData = tokenData2.f31179e;
            C5207g.m11111f(tokenFragmentData, "textFragmentData");
            TokenViewState tokenViewState = tokenData2.f31180f;
            C5207g.m11111f(tokenViewState, "startSize");
            TokenControllerType tokenControllerType = tokenData2.f31181g;
            C5207g.m11111f(tokenControllerType, "from");
            List<TokenMeaning> list = tokenData2.f31182h;
            C5207g.m11111f(list, "phraseMeanings");
            tokenData = new TokenData(str, tokenType2, i10, i11, tokenFragmentData, tokenViewState, tokenControllerType, list, i12, tokenTransliteration);
        } else {
            tokenData = null;
        }
        if (tokenData != null) {
            if (interfaceC7379f instanceof C7378e) {
                tokenType = TokenType.CardType;
            } else {
                tokenType = interfaceC7379f.mo14776e() ? TokenType.NewWordOrPhraseType : TokenType.WordType;
            }
            C5207g.m11111f(tokenType, "<set-?>");
            tokenData.f31176b = tokenType;
        }
        stateFlowImpl.setValue(tokenData);
    }

    /* JADX INFO: renamed from: q2 */
    public static void m10373q2(TokenViewModel tokenViewModel, boolean z10) {
        C7828f.m15570d(tokenViewModel.f31409J, null, null, new TokenViewModel$autoLingQCreate$1(tokenViewModel, z10, false, null), 3);
    }

    /* JADX INFO: renamed from: s2 */
    public static void m10374s2(TokenViewModel tokenViewModel, TokenMeaning tokenMeaning, boolean z10) {
        int value = CardStatus.New.getValue();
        tokenViewModel.getClass();
        C7828f.m15570d(tokenViewModel.f31409J, null, null, new TokenViewModel$insertMeaning$1(tokenMeaning, tokenViewModel, value, z10, null), 3);
    }

    /* JADX INFO: renamed from: y2 */
    public static void m10375y2(TokenViewModel tokenViewModel, int i10) {
        tokenViewModel.getClass();
        C7828f.m15570d(tokenViewModel.f31409J, null, null, new TokenViewModel$updateCardStatus$1(tokenViewModel, i10, false, null), 3);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: A1 */
    public final void mo10025A1() {
        this.f31413L.mo10025A1();
    }

    /* JADX INFO: renamed from: A2 */
    public final void m10376A2(TokenData tokenData) {
        String str;
        String str2;
        C5207g.m11111f(tokenData, "tokenData");
        this.f31424Q0.setValue(Boolean.FALSE);
        StateFlowImpl stateFlowImpl = this.f31433V;
        stateFlowImpl.setValue(tokenData);
        if (tokenData.f31176b != TokenType.NewWordOrPhraseType) {
            mo10049g();
        }
        TokenControllerType tokenControllerType = this.f31429T.f34366a.f31181g;
        if (tokenControllerType != TokenControllerType.Lesson && tokenControllerType != TokenControllerType.LessonExpanded) {
            return;
        }
        final String strMo498E1 = mo498E1();
        TokenFragmentData tokenFragmentData = tokenData.f31179e;
        final String str3 = tokenFragmentData.f27865a;
        TokenData tokenData2 = (TokenData) stateFlowImpl.getValue();
        boolean z10 = true;
        if ((tokenData2 == null || (str2 = tokenData2.f31175a) == null || C7076b.m14278X2(str2, " ", false)) ? false : true) {
            TokenData tokenData3 = (TokenData) stateFlowImpl.getValue();
            if (tokenData3 == null || (str = tokenData3.f31175a) == null || C7076b.m14278X2(str, "-", false)) {
                z10 = false;
            }
            if (z10) {
                TokenData tokenData4 = (TokenData) stateFlowImpl.getValue();
                TokenType tokenType = tokenData4 != null ? tokenData4.f31176b : null;
                TokenData tokenData5 = (TokenData) stateFlowImpl.getValue();
                String str4 = tokenData5 != null ? tokenData5.f31175a : null;
                final int i10 = tokenFragmentData.f27866b;
                InterfaceC2056p<TokenType, String, InterfaceC7875v0> interfaceC2056p = new InterfaceC2056p<TokenType, String, InterfaceC7875v0>() { // from class: com.lingq.ui.token.TokenViewModel$fetchRelatedPhrases$1

                    /* JADX INFO: renamed from: com.lingq.ui.token.TokenViewModel$fetchRelatedPhrases$1$1 */
                    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
                    @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$fetchRelatedPhrases$1$1", m19206f = "TokenViewModel.kt", m19207l = {875}, m19208m = "invokeSuspend")
                    final class C48511 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

                        /* JADX INFO: renamed from: e */
                        public int f31572e;

                        /* JADX INFO: renamed from: f */
                        public final /* synthetic */ TokenViewModel f31573f;

                        /* JADX INFO: renamed from: g */
                        public final /* synthetic */ String f31574g;

                        /* JADX INFO: renamed from: h */
                        public final /* synthetic */ String f31575h;

                        /* JADX INFO: renamed from: i */
                        public final /* synthetic */ TokenType f31576i;

                        /* JADX INFO: renamed from: j */
                        public final /* synthetic */ String f31577j;

                        /* JADX INFO: renamed from: k */
                        public final /* synthetic */ int f31578k;

                        /* JADX INFO: renamed from: com.lingq.ui.token.TokenViewModel$fetchRelatedPhrases$1$1$1, reason: invalid class name */
                        @Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lli/d;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
                        @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$fetchRelatedPhrases$1$1$1", m19206f = "TokenViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
                        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super C7377d>, InterfaceC9968c<? super C9072e>, Object> {

                            /* JADX INFO: renamed from: e */
                            public final /* synthetic */ TokenViewModel f31579e;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(TokenViewModel tokenViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                                super(2, interfaceC9968c);
                                this.f31579e = tokenViewModel;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            /* JADX INFO: renamed from: a */
                            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                                return new AnonymousClass1(this.f31579e, interfaceC9968c);
                            }

                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final Object mo1337m0(InterfaceC7117d<? super C7377d> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                                return ((AnonymousClass1) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            /* JADX INFO: renamed from: x */
                            public final Object mo1338x(Object obj) throws Throwable {
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                C7499b.m14977z0(obj);
                                this.f31579e.f31454i0.setValue(Resource.Status.LOADING);
                                return C9072e.f47360a;
                            }
                        }

                        /* JADX INFO: renamed from: com.lingq.ui.token.TokenViewModel$fetchRelatedPhrases$1$1$2, reason: invalid class name */
                        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lli/d;", "resource", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
                        @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$fetchRelatedPhrases$1$1$2", m19206f = "TokenViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
                        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC2056p<C7377d, InterfaceC9968c<? super C9072e>, Object> {

                            /* JADX INFO: renamed from: e */
                            public /* synthetic */ Object f31580e;

                            /* JADX INFO: renamed from: f */
                            public final /* synthetic */ TokenViewModel f31581f;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass2(TokenViewModel tokenViewModel, InterfaceC9968c<? super AnonymousClass2> interfaceC9968c) {
                                super(2, interfaceC9968c);
                                this.f31581f = tokenViewModel;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            /* JADX INFO: renamed from: a */
                            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f31581f, interfaceC9968c);
                                anonymousClass2.f31580e = obj;
                                return anonymousClass2;
                            }

                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final Object mo1337m0(C7377d c7377d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                                return ((AnonymousClass2) mo1336a(c7377d, interfaceC9968c)).mo1338x(C9072e.f47360a);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            /* JADX INFO: renamed from: x */
                            public final Object mo1338x(Object obj) throws Throwable {
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                C7499b.m14977z0(obj);
                                C7377d c7377d = (C7377d) this.f31580e;
                                if (c7377d != null) {
                                    TokenViewModel tokenViewModel = this.f31581f;
                                    tokenViewModel.f31440a0.setValue(c7377d);
                                    boolean zIsEmpty = c7377d.f41166a.isEmpty();
                                    StateFlowImpl stateFlowImpl = tokenViewModel.f31454i0;
                                    if (zIsEmpty) {
                                        stateFlowImpl.setValue(Resource.Status.EMPTY);
                                    } else {
                                        stateFlowImpl.setValue(Resource.Status.SUCCESS);
                                    }
                                }
                                return C9072e.f47360a;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C48511(TokenViewModel tokenViewModel, String str, String str2, TokenType tokenType, String str3, int i10, InterfaceC9968c<? super C48511> interfaceC9968c) {
                            super(2, interfaceC9968c);
                            this.f31573f = tokenViewModel;
                            this.f31574g = str;
                            this.f31575h = str2;
                            this.f31576i = tokenType;
                            this.f31577j = str3;
                            this.f31578k = i10;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /* JADX INFO: renamed from: a */
                        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                            return new C48511(this.f31573f, this.f31574g, this.f31575h, this.f31576i, this.f31577j, this.f31578k, interfaceC9968c);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                            return ((C48511) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /* JADX INFO: renamed from: x */
                        public final Object mo1338x(Object obj) throws Throwable {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i10 = this.f31572e;
                            if (i10 == 0) {
                                C7499b.m14977z0(obj);
                                TokenViewModel tokenViewModel = this.f31573f;
                                FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new AnonymousClass1(tokenViewModel, null), tokenViewModel.f31447f.mo6167e(this.f31574g, this.f31575h, this.f31576i, this.f31577j));
                                AnonymousClass2 anonymousClass2 = new AnonymousClass2(tokenViewModel, null);
                                this.f31572e = 1;
                                if (C0062b.m369m0(flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1, anonymousClass2, this) == coroutineSingletons) {
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
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final InterfaceC7875v0 mo1337m0(TokenType tokenType2, String str5) {
                        TokenType tokenType3 = tokenType2;
                        String str6 = str5;
                        C5207g.m11111f(tokenType3, "type");
                        C5207g.m11111f(str6, "term");
                        String str7 = strMo498E1;
                        String str8 = str3;
                        int i11 = i10;
                        TokenViewModel tokenViewModel = this.f31568b;
                        tokenViewModel.getClass();
                        C7828f.m15570d(C8573r0.m16767w0(tokenViewModel), null, null, new TokenViewModel$updateRelatedPhrases$1(tokenViewModel, str7, str6, tokenType3, str8, i11, null), 3);
                        return C7828f.m15570d(C8573r0.m16767w0(tokenViewModel), null, null, new C48511(this.f31568b, strMo498E1, str6, tokenType3, str3, i10, null), 3);
                    }
                };
                if (tokenType == null || str4 == null) {
                    return;
                }
                interfaceC2056p.mo1337m0(tokenType, str4);
            }
        }
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f31411K.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f31411K.mo497B0(interfaceC9968c);
    }

    /* JADX INFO: renamed from: B2 */
    public final void m10377B2(String str, boolean z10) {
        C5207g.m11111f(str, "status");
        TokenData tokenData = (TokenData) this.f31433V.getValue();
        if ((tokenData != null ? tokenData.f31176b : null) == TokenType.NewWordOrPhraseType) {
            InterfaceC4865b.a.m10388a(this, false, 3);
        } else {
            C7828f.m15570d(this.f31409J, null, null, new TokenViewModel$updateWordStatus$1(this, str, z10, null), 3);
        }
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: D */
    public final InterfaceC7137r<TokenEditData> mo10026D() {
        return this.f31413L.mo10026D();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f31411K.mo498E1();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: H0 */
    public final InterfaceC7137r<String> mo10027H0() {
        return this.f31413L.mo10027H0();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: H1 */
    public final void mo9722H1(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "tooltipStep");
        this.f31417N.mo9722H1(tooltipStep);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: I */
    public final void mo9723I(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        this.f31417N.mo9723I(tooltipStep);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: I0 */
    public final void mo10028I0(TokenRelatedPhrase tokenRelatedPhrase, int i10, int i11, int i12) {
        this.f31413L.mo10028I0(tokenRelatedPhrase, i10, i11, i12);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f31411K.mo499J(profile, interfaceC9968c);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: L */
    public final void mo9724L() {
        this.f31417N.mo9724L();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: L0 */
    public final InterfaceC7137r<String> mo10029L0() {
        return this.f31413L.mo10029L0();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: N0 */
    public final void mo10030N0(String str) {
        this.f31413L.mo10030N0(str);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: N1 */
    public final InterfaceC7137r<TokenData> mo10031N1() {
        return this.f31413L.mo10031N1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f31411K.mo500P();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: P1 */
    public final void mo10032P1(int i10) {
        this.f31413L.mo10032P1(i10);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: Q1 */
    public final void mo10033Q1(boolean z10, boolean z11) {
        this.f31413L.mo10033Q1(z10, z11);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: S */
    public final InterfaceC7137r<Integer> mo10034S() {
        return this.f31413L.mo10034S();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: T0 */
    public final void mo9727T0() {
        this.f31417N.mo9727T0();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: U1 */
    public final InterfaceC7137r<TokenData> mo10035U1() {
        return this.f31413L.mo10035U1();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: V */
    public final InterfaceC7137r<TokenRelatedPhrase> mo10036V() {
        return this.f31413L.mo10036V();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: V0 */
    public final void mo10037V0(TokenMeaning tokenMeaning) {
        this.f31413L.mo10037V0(tokenMeaning);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: W1 */
    public final InterfaceC7137r<C9072e> mo10038W1() {
        return this.f31413L.mo10038W1();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: Y */
    public final InterfaceC7137r<TokenData> mo10039Y() {
        return this.f31413L.mo10039Y();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: Y1 */
    public final void mo9729Y1() {
        this.f31417N.mo9729Y1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: a1 */
    public final void mo9730a1() {
        this.f31417N.mo9730a1();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: b */
    public final void mo10041b() {
        this.f31413L.mo10041b();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: b0 */
    public final void mo9731b0(boolean z10) {
        this.f31417N.mo9731b0(z10);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: b2 */
    public final InterfaceC7137r<C9072e> mo10042b2() {
        return this.f31413L.mo10042b2();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: c1 */
    public final InterfaceC7137r<Boolean> mo10043c1() {
        return this.f31413L.mo10043c1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f31411K.mo501d(str, interfaceC9968c);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: d2 */
    public final InterfaceC7137r<C9072e> mo10044d2() {
        return this.f31413L.mo10044d2();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: e0 */
    public final void mo10045e0() {
        this.f31413L.mo10045e0();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f31411K;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f31411K.mo503f1(interfaceC9968c);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: f2 */
    public final void mo10048f2(TokenData tokenData) {
        this.f31413L.mo10048f2(tokenData);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: g */
    public final void mo10049g() {
        this.f31413L.mo10049g();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: g0 */
    public final InterfaceC7116c<List<TooltipStep>> mo9733g0() {
        return this.f31417N.mo9733g0();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: g2 */
    public final void mo9734g2(TooltipStep tooltipStep, Rect rect, Rect rect2, boolean z10, boolean z11, boolean z12, InterfaceC2041a<C9072e> interfaceC2041a) {
        C5207g.m11111f(tooltipStep, "step");
        C5207g.m11111f(rect, "viewRect");
        C5207g.m11111f(rect2, "tooltipRect");
        C5207g.m11111f(interfaceC2041a, "action");
        this.f31417N.mo9734g2(tooltipStep, rect, rect2, z10, z11, z12, interfaceC2041a);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: h */
    public final InterfaceC7142w<Boolean> mo9735h() {
        return this.f31417N.mo9735h();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: j */
    public final InterfaceC7137r<C9072e> mo10051j() {
        return this.f31413L.mo10051j();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: j0 */
    public final void mo9736j0() {
        this.f31417N.mo9736j0();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f31411K.mo504j1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: k0 */
    public final InterfaceC7116c<TooltipStep> mo9737k0() {
        return this.f31417N.mo9737k0();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: k1 */
    public final InterfaceC7116c<C9072e> mo9738k1() {
        return this.f31417N.mo9738k1();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: l */
    public final InterfaceC7137r<C9072e> mo10053l() {
        return this.f31413L.mo10053l();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f31411K.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f31411K.mo506l1();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: m */
    public final InterfaceC7137r<TokenMeaning> mo10054m() {
        return this.f31413L.mo10054m();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: o0 */
    public final void mo10057o0(TokenMeaning tokenMeaning, String str) {
        this.f31413L.mo10057o0(tokenMeaning, str);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: p0 */
    public final boolean mo9741p0(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        return this.f31417N.mo9741p0(tooltipStep);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f31411K.mo507p1();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: q1 */
    public final InterfaceC7137r<Pair<TokenMeaning, String>> mo10060q1() {
        return this.f31413L.mo10060q1();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: r */
    public final void mo10062r(String str) {
        this.f31413L.mo10062r(str);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: r0 */
    public final InterfaceC7116c<TooltipStep> mo9743r0() {
        return this.f31417N.mo9743r0();
    }

    /* JADX INFO: renamed from: r2 */
    public final void m10378r2(String str) {
        C5207g.m11111f(str, "filter");
        C4924a.m10450b(this.f31427S);
        this.f31427S = C7828f.m15570d(C8573r0.m16767w0(this), null, null, new TokenViewModel$fetchLanguageTags$1(this, str, null), 3);
    }

    @Override // p244lh.InterfaceC7366c
    /* JADX INFO: renamed from: s */
    public final Object mo9326s(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f31415M.mo9326s(interfaceC9968c);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: t0 */
    public final void mo10064t0(TokenData tokenData) {
        C5207g.m11111f(tokenData, "updateTokenData");
        this.f31413L.mo10064t0(tokenData);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f31411K.mo508t1();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d7  */
    /* JADX INFO: renamed from: t2 */
    public final boolean m10379t2(String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean zM11106a = C5207g.m11106a(mo498E1(), C5408a.m11569b(LanguageLearn.Japanese));
        StateFlowImpl stateFlowImpl = this.f31446e0;
        if (zM11106a) {
            Iterable iterable = (Iterable) stateFlowImpl.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    }
                    if (C7661i.m15249O2((String) it.next(), str)) {
                        z10 = true;
                        break;
                    }
                }
            } else {
                z10 = false;
                break;
            }
            if (z10) {
                HashSet hashSetM14921S = C7499b.m14921S("接尾辞", "接頭辞", "接続詞", "助詞", "助動詞", "連体詞", "んだ", "ていねいだ", "られる", "元気だ", "好きだ", "ビジュアルだ", "新ただ", "スリリングだ", "べきだ", "たつ", "ぬ", "のだ", "判定詞");
                if (C5207g.m11106a(mo498E1(), C5408a.m11569b(LanguageLearn.Japanese))) {
                    if (!hashSetM14921S.isEmpty()) {
                        Iterator it2 = hashSetM14921S.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z12 = false;
                                break;
                            }
                            if (C7661i.m15249O2((String) it2.next(), str)) {
                                z12 = true;
                                break;
                            }
                        }
                    } else {
                        z12 = false;
                        break;
                    }
                    if (z12) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else {
                    z11 = false;
                }
                if (!z11) {
                    return true;
                }
            }
        } else {
            Iterable iterable2 = (Iterable) stateFlowImpl.getValue();
            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                Iterator it3 = iterable2.iterator();
                while (it3.hasNext()) {
                    if (C7661i.m15249O2((String) it3.next(), str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: u */
    public final InterfaceC7116c<C6343f> mo9744u() {
        return this.f31417N.mo9744u();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: u0 */
    public final void mo9745u0(boolean z10) {
        this.f31417N.mo9745u0(z10);
    }

    /* JADX INFO: renamed from: u2 */
    public final void m10380u2() {
        String strMo14774c;
        this.f31424Q0.setValue(Boolean.TRUE);
        C7138s c7138s = this.f31410J0;
        InterfaceC7379f interfaceC7379f = (InterfaceC7379f) this.f31437X.getValue();
        if (interfaceC7379f == null || (strMo14774c = interfaceC7379f.mo14774c()) == null) {
            strMo14774c = "";
        }
        c7138s.mo14371k(strMo14774c);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: v1 */
    public final boolean mo9746v1(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        return this.f31417N.mo9746v1(tooltipStep);
    }

    /* JADX INFO: renamed from: v2 */
    public final void m10381v2(InterfaceC7379f interfaceC7379f, AbstractC4864a abstractC4864a) {
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new TokenViewModel$setupAsianScript$1(interfaceC7379f, this, abstractC4864a, null), 3);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f31411K.mo509w0();
    }

    /* JADX INFO: renamed from: w2 */
    public final void m10382w2() {
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new TokenViewModel$updateActiveDictionaries$1(this, null), 3);
    }

    /* JADX INFO: renamed from: x2 */
    public final void m10383x2() {
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new TokenViewModel$updateAvailableLocales$1(this, null), 3);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: z */
    public final void mo10065z() {
        this.f31413L.mo10065z();
    }

    /* JADX INFO: renamed from: z2 */
    public final void m10384z2(TokenViewState tokenViewState) {
        C5207g.m11111f(tokenViewState, "state");
        this.f31472x0.setValue(tokenViewState);
    }
}
