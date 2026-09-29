package com.lingq.p055ui.lesson.page;

import ae.C0062b;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import ci.InterfaceC2008a;
import ci.InterfaceC2026s;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.controllers.InterfaceC3275c;
import com.lingq.p055ui.lesson.page.data.TextTokenType;
import com.lingq.p055ui.tooltips.InterfaceC4912b;
import com.lingq.p055ui.tooltips.TooltipStep;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.repository.InterfaceC3324a;
import com.lingq.shared.storage.LessonHighlightStyle;
import com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$28;
import com.lingq.shared.uimodel.LocalTextToSpeechVoice;
import com.lingq.shared.uimodel.WordStatus;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.shared.uimodel.token.TokenType;
import com.lingq.util.C4924a;
import com.lingq.util.CoroutineJobManager;
import com.lingq.util.ViewsUtilsKt;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.sequences.C7073a;
import kotlin.text.C7076b;
import kotlin.text.Regex;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.flow.C7114a;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7131l;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.C7136q;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.scheduling.C7178b;
import mo.C7661i;
import mo.InterfaceC7656d;
import ni.C7793a;
import no.C7828f;
import no.C7848l1;
import no.InterfaceC7882z;
import p015ak.InterfaceC0113j;
import p076di.InterfaceC5179a;
import p096ei.C5408a;
import p159hi.C6052c;
import p159hi.C6054e;
import p183ik.C6343f;
import p225kk.C6715l;
import p260m8.C7499b;
import p265mj.C7567a;
import p265mj.C7568b;
import p265mj.C7569c;
import p265mj.C7570d;
import p338qd.C8573r0;
import p385sf.C9000b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0005\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/ui/lesson/page/LessonPageViewModel;", "Landroidx/lifecycle/h0;", "Lak/j;", "Lcom/lingq/ui/tooltips/b;", "Lcom/lingq/commons/controllers/c;", "a", "b", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LessonPageViewModel extends AbstractC1036h0 implements InterfaceC0113j, InterfaceC4912b, InterfaceC3275c {

    /* JADX INFO: renamed from: A0 */
    public final InterfaceC7116c<LessonHighlightStyle> f28525A0;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC4912b f28526H;

    /* JADX INFO: renamed from: I */
    public final int f28527I;

    /* JADX INFO: renamed from: J */
    public C7570d f28528J;

    /* JADX INFO: renamed from: K */
    public C7568b f28529K;

    /* JADX INFO: renamed from: L */
    public final Locale f28530L;

    /* JADX INFO: renamed from: M */
    public final StateFlowImpl f28531M;

    /* JADX INFO: renamed from: N */
    public final C7135p f28532N;

    /* JADX INFO: renamed from: O */
    public C7848l1 f28533O;

    /* JADX INFO: renamed from: P */
    public final InterfaceC7116c<String> f28534P;

    /* JADX INFO: renamed from: Q */
    public final C7135p f28535Q;

    /* JADX INFO: renamed from: R */
    public final StateFlowImpl f28536R;

    /* JADX INFO: renamed from: S */
    public final StateFlowImpl f28537S;

    /* JADX INFO: renamed from: T */
    public final StateFlowImpl f28538T;

    /* JADX INFO: renamed from: U */
    public final C7135p f28539U;

    /* JADX INFO: renamed from: V */
    public final C7135p f28540V;

    /* JADX INFO: renamed from: W */
    public final C7135p f28541W;

    /* JADX INFO: renamed from: X */
    public final C7135p f28542X;

    /* JADX INFO: renamed from: Y */
    public final C7135p f28543Y;

    /* JADX INFO: renamed from: Z */
    public final StateFlowImpl f28544Z;

    /* JADX INFO: renamed from: a0 */
    public final StateFlowImpl f28545a0;

    /* JADX INFO: renamed from: b0 */
    public final StateFlowImpl f28546b0;

    /* JADX INFO: renamed from: c0 */
    public final StateFlowImpl f28547c0;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2008a f28548d;

    /* JADX INFO: renamed from: d0 */
    public final C7135p f28549d0;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2026s f28550e;

    /* JADX INFO: renamed from: e0 */
    public final C7135p f28551e0;

    /* JADX INFO: renamed from: f */
    public final InterfaceC3324a f28552f;

    /* JADX INFO: renamed from: f0 */
    public final C7135p f28553f0;

    /* JADX INFO: renamed from: g */
    public final CoroutineJobManager f28554g;

    /* JADX INFO: renamed from: g0 */
    public final StateFlowImpl f28555g0;

    /* JADX INFO: renamed from: h */
    public final InterfaceC3275c f28556h;

    /* JADX INFO: renamed from: h0 */
    public final C7135p f28557h0;

    /* JADX INFO: renamed from: i */
    public final InterfaceC5179a f28558i;

    /* JADX INFO: renamed from: i0 */
    public final StateFlowImpl f28559i0;

    /* JADX INFO: renamed from: j */
    public final InterfaceC7882z f28560j;

    /* JADX INFO: renamed from: j0 */
    public final C7135p f28561j0;

    /* JADX INFO: renamed from: k */
    public final CoroutineDispatcher f28562k;

    /* JADX INFO: renamed from: k0 */
    public final AbstractChannel f28563k0;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC0113j f28564l;

    /* JADX INFO: renamed from: l0 */
    public final C7114a f28565l0;

    /* JADX INFO: renamed from: m0 */
    public final StateFlowImpl f28566m0;

    /* JADX INFO: renamed from: n0 */
    public final C7135p f28567n0;

    /* JADX INFO: renamed from: o0 */
    public final StateFlowImpl f28568o0;

    /* JADX INFO: renamed from: p0 */
    public final C7135p f28569p0;

    /* JADX INFO: renamed from: q0 */
    public final AbstractChannel f28570q0;

    /* JADX INFO: renamed from: r0 */
    public final C7114a f28571r0;

    /* JADX INFO: renamed from: s0 */
    public C7848l1 f28572s0;

    /* JADX INFO: renamed from: t0 */
    public final StateFlowImpl f28573t0;

    /* JADX INFO: renamed from: u0 */
    public final StateFlowImpl f28574u0;

    /* JADX INFO: renamed from: v0 */
    public final C7138s f28575v0;

    /* JADX INFO: renamed from: w0 */
    public final C7134o f28576w0;

    /* JADX INFO: renamed from: x0 */
    public final C7138s f28577x0;

    /* JADX INFO: renamed from: y0 */
    public final C7134o f28578y0;

    /* JADX INFO: renamed from: z0 */
    public final InterfaceC7116c<LessonHighlightStyle> f28579z0;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageViewModel$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageViewModel$1", m19206f = "LessonPageViewModel.kt", m19207l = {262}, m19208m = "invokeSuspend")
    final class C43711 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f28580e;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageViewModel$1$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@"}, m13365d2 = {"", "", "Lhi/e;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageViewModel$1$1", m19206f = "LessonPageViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Map<String, ? extends C6054e>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ LessonPageViewModel f28582e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LessonPageViewModel lessonPageViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f28582e = lessonPageViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f28582e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Map<String, ? extends C6054e> map, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(map, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                LessonPageViewModel lessonPageViewModel = this.f28582e;
                lessonPageViewModel.getClass();
                C7828f.m15570d(C8573r0.m16767w0(lessonPageViewModel), null, null, new LessonPageViewModel$showWordTooltips$1(lessonPageViewModel, null), 3);
                return C9072e.f47360a;
            }
        }

        public C43711(InterfaceC9968c<? super C43711> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return LessonPageViewModel.this.new C43711(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C43711) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f28580e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                LessonPageViewModel lessonPageViewModel = LessonPageViewModel.this;
                StateFlowImpl stateFlowImpl = lessonPageViewModel.f28537S;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(lessonPageViewModel, null);
                this.f28580e = 1;
                if (C0062b.m369m0(stateFlowImpl, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageViewModel$2 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageViewModel$2", m19206f = "LessonPageViewModel.kt", m19207l = {268}, m19208m = "invokeSuspend")
    final class C43722 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f28583e;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageViewModel$2$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@"}, m13365d2 = {"", "", "Lhi/c;", "cards", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageViewModel$2$1", m19206f = "LessonPageViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Map<String, ? extends C6052c>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f28585e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ LessonPageViewModel f28586f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LessonPageViewModel lessonPageViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f28586f = lessonPageViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f28586f, interfaceC9968c);
                anonymousClass1.f28585e = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Map<String, ? extends C6052c> map, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(map, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                List<C7570d> list;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                Map map = (Map) this.f28585e;
                LessonPageViewModel lessonPageViewModel = this.f28586f;
                C7567a c7567a = (C7567a) lessonPageViewModel.f28531M.getValue();
                if (c7567a == null || (list = c7567a.f41703c) == null) {
                    list = EmptyList.f38032a;
                }
                C7570d c7570d = lessonPageViewModel.f28528J;
                if (c7570d != null) {
                    Locale locale = lessonPageViewModel.f28530L;
                    C5207g.m11110e(locale, "locale");
                    C6052c c6052c = (C6052c) map.get(C7793a.m15502f(c7570d.f41725e, locale));
                    C7138s c7138s = lessonPageViewModel.f28575v0;
                    if (c6052c == null) {
                        for (C7570d c7570d2 : list) {
                            String str = c7570d2.f41725e;
                            C5207g.m11110e(locale, "locale");
                            if (((C6052c) map.get(C7793a.m15502f(str, locale))) != null) {
                                c7138s.mo14371k(new Pair(c7570d2, TooltipStep.FirstLingQ));
                                break;
                            }
                        }
                    } else {
                        c7138s.mo14371k(new Pair(c7570d, TooltipStep.FirstLingQ));
                    }
                }
                return C9072e.f47360a;
            }
        }

        public C43722(InterfaceC9968c<? super C43722> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return LessonPageViewModel.this.new C43722(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C43722) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f28583e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                LessonPageViewModel lessonPageViewModel = LessonPageViewModel.this;
                StateFlowImpl stateFlowImpl = lessonPageViewModel.f28536R;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(lessonPageViewModel, null);
                this.f28583e = 1;
                if (C0062b.m369m0(stateFlowImpl, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageViewModel$a */
    public static final class C4373a {

        /* JADX INFO: renamed from: a */
        public final C7570d f28590a;

        /* JADX INFO: renamed from: b */
        public final TokenType f28591b;

        /* JADX INFO: renamed from: c */
        public final List<C7570d> f28592c;

        /* JADX INFO: renamed from: d */
        public final C7568b f28593d;

        /* JADX INFO: renamed from: e */
        public final boolean f28594e;

        public C4373a(C7570d c7570d, TokenType tokenType, List<C7570d> list, C7568b c7568b, boolean z10) {
            C5207g.m11111f(c7570d, "selectedToken");
            C5207g.m11111f(tokenType, "type");
            C5207g.m11111f(list, "selectionTokens");
            this.f28590a = c7570d;
            this.f28591b = tokenType;
            this.f28592c = list;
            this.f28593d = c7568b;
            this.f28594e = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4373a)) {
                return false;
            }
            C4373a c4373a = (C4373a) obj;
            return C5207g.m11106a(this.f28590a, c4373a.f28590a) && this.f28591b == c4373a.f28591b && C5207g.m11106a(this.f28592c, c4373a.f28592c) && C5207g.m11106a(this.f28593d, c4373a.f28593d) && this.f28594e == c4373a.f28594e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v7, types: [int] */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v8, types: [int] */
        /* JADX WARN: Type inference failed for: r1v9 */
        public final int hashCode() {
            int iM848g = C0204c.m848g(this.f28592c, (this.f28591b.hashCode() + (this.f28590a.hashCode() * 31)) * 31, 31);
            C7568b c7568b = this.f28593d;
            int iHashCode = (iM848g + (c7568b == null ? 0 : c7568b.hashCode())) * 31;
            boolean z10 = this.f28594e;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return iHashCode + r10;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ClickedTokenData(selectedToken=");
            sb2.append(this.f28590a);
            sb2.append(", type=");
            sb2.append(this.f28591b);
            sb2.append(", selectionTokens=");
            sb2.append(this.f28592c);
            sb2.append(", phrase=");
            sb2.append(this.f28593d);
            sb2.append(", isPhraseSelected=");
            return C0166e.m769p(sb2, this.f28594e, ")");
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageViewModel$b */
    public static final class C4374b {

        /* JADX INFO: renamed from: a */
        public final List<C7569c> f28595a;

        /* JADX INFO: renamed from: b */
        public final List<C7569c> f28596b;

        /* JADX INFO: renamed from: c */
        public final C7570d f28597c;

        /* JADX INFO: renamed from: d */
        public final C7570d f28598d;

        /* JADX INFO: renamed from: e */
        public final LessonHighlightStyle f28599e;

        public C4374b(ArrayList arrayList, ArrayList arrayList2, C7570d c7570d, C7570d c7570d2, LessonHighlightStyle lessonHighlightStyle) {
            this.f28595a = arrayList;
            this.f28596b = arrayList2;
            this.f28597c = c7570d;
            this.f28598d = c7570d2;
            this.f28599e = lessonHighlightStyle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4374b)) {
                return false;
            }
            C4374b c4374b = (C4374b) obj;
            if (C5207g.m11106a(this.f28595a, c4374b.f28595a) && C5207g.m11106a(this.f28596b, c4374b.f28596b) && C5207g.m11106a(this.f28597c, c4374b.f28597c) && C5207g.m11106a(this.f28598d, c4374b.f28598d) && this.f28599e == c4374b.f28599e) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int iM848g = C0204c.m848g(this.f28596b, this.f28595a.hashCode() * 31, 31);
            int iHashCode = 0;
            C7570d c7570d = this.f28597c;
            int iHashCode2 = (iM848g + (c7570d == null ? 0 : c7570d.hashCode())) * 31;
            C7570d c7570d2 = this.f28598d;
            if (c7570d2 != null) {
                iHashCode = c7570d2.hashCode();
            }
            return this.f28599e.hashCode() + ((iHashCode2 + iHashCode) * 31);
        }

        public final String toString() {
            return "TokensCompatData(wordsSpans=" + this.f28595a + ", cardsSpans=" + this.f28596b + ", tokenClicked=" + this.f28597c + ", phraseClicked=" + this.f28598d + ", style=" + this.f28599e + ")";
        }
    }

    public LessonPageViewModel(InterfaceC2008a interfaceC2008a, InterfaceC2026s interfaceC2026s, InterfaceC3324a interfaceC3324a, CoroutineJobManager coroutineJobManager, InterfaceC3275c interfaceC3275c, InterfaceC5179a interfaceC5179a, InterfaceC7882z interfaceC7882z, C7178b c7178b, InterfaceC0113j interfaceC0113j, InterfaceC4912b interfaceC4912b, C1024c0 c1024c0) {
        C5207g.m11111f(interfaceC2008a, "cardRepository");
        C5207g.m11111f(interfaceC2026s, "wordRepository");
        C5207g.m11111f(interfaceC3324a, "lessonRepository");
        C5207g.m11111f(interfaceC3275c, "ttsController");
        C5207g.m11111f(interfaceC5179a, "preferenceStore");
        C5207g.m11111f(interfaceC7882z, "applicationScope");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(interfaceC4912b, "tooltipsController");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f28548d = interfaceC2008a;
        this.f28550e = interfaceC2026s;
        this.f28552f = interfaceC3324a;
        this.f28554g = coroutineJobManager;
        this.f28556h = interfaceC3275c;
        this.f28558i = interfaceC5179a;
        this.f28560j = interfaceC7882z;
        this.f28562k = c7178b;
        this.f28564l = interfaceC0113j;
        this.f28526H = interfaceC4912b;
        Integer num = (Integer) c1024c0.m3929b("lessonId");
        if (num != null) {
            num.intValue();
        }
        Integer num2 = (Integer) c1024c0.m3929b("pagePosition");
        this.f28527I = num2 != null ? num2.intValue() : 0;
        this.f28530L = Locale.forLanguageTag(mo498E1());
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(null);
        this.f28531M = stateFlowImplM14379a;
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        this.f28532N = C0062b.m353h2(stateFlowImplM14379a, interfaceC7882zM16767w0, startedWhileSubscribed, null);
        final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(stateFlowImplM14379a);
        InterfaceC7116c<String> interfaceC7116cM273H0 = C0062b.m273H0(new InterfaceC7116c<String>() { // from class: com.lingq.ui.lesson.page.LessonPageViewModel$special$$inlined$map$1

            /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageViewModel$special$$inlined$map$1$2 */
            public static final class C43812<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f28683a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ LessonPageViewModel f28684b;

                /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageViewModel$special$$inlined$map$1$2", m19206f = "LessonPageViewModel.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f28685d;

                    /* JADX INFO: renamed from: e */
                    public int f28686e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f28685d = obj;
                        this.f28686e |= Integer.MIN_VALUE;
                        return C43812.this.mo1339r(null, this);
                    }
                }

                public C43812(InterfaceC7117d interfaceC7117d, LessonPageViewModel lessonPageViewModel) {
                    this.f28683a = interfaceC7117d;
                    this.f28684b = lessonPageViewModel;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0019  */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f28686e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f28686e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f28685d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f28686e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        String strM613i = C0141b.m613i(new Object[]{((C7567a) obj).f41702b}, 1, this.f28684b.f28530L, "%s", "format(locale, format, *args)");
                        anonymousClass1.f28686e = 1;
                        if (this.f28683a.mo1339r(strM613i, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
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
            public final Object mo9539a(InterfaceC7117d<? super String> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1.mo9539a(new C43812(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        });
        this.f28534P = interfaceC7116cM273H0;
        this.f28535Q = C0062b.m353h2(interfaceC7116cM273H0, C8573r0.m16767w0(this), startedWhileSubscribed, "");
        StateFlowImpl stateFlowImplM14379a2 = C7120g.m14379a(C6753d.m13459L0());
        this.f28536R = stateFlowImplM14379a2;
        StateFlowImpl stateFlowImplM14379a3 = C7120g.m14379a(C6753d.m13459L0());
        this.f28537S = stateFlowImplM14379a3;
        StateFlowImpl stateFlowImplM14379a4 = C7120g.m14379a(C6753d.m13459L0());
        this.f28538T = stateFlowImplM14379a4;
        C7131l c7131l = new C7131l(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(stateFlowImplM14379a), stateFlowImplM14379a4, new LessonPageViewModel$_phrasesTokens$1(this, null));
        InterfaceC7882z interfaceC7882zM16767w1 = C8573r0.m16767w0(this);
        EmptyList emptyList = EmptyList.f38032a;
        C7135p c7135pM353h2 = C0062b.m353h2(c7131l, interfaceC7882zM16767w1, startedWhileSubscribed, emptyList);
        this.f28539U = c7135pM353h2;
        final C7135p c7135pM353h3 = C0062b.m353h2(C0062b.m389r0(stateFlowImplM14379a2, stateFlowImplM14379a4, new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(stateFlowImplM14379a), new LessonPageViewModel$sentenceTokens$1(this, null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        this.f28540V = c7135pM353h3;
        this.f28541W = C0062b.m353h2(new InterfaceC7116c<List<? extends C6052c>>() { // from class: com.lingq.ui.lesson.page.LessonPageViewModel$special$$inlined$map$2

            /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageViewModel$special$$inlined$map$2$2 */
            public static final class C43822<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f28689a;

                /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageViewModel$special$$inlined$map$2$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageViewModel$special$$inlined$map$2$2", m19206f = "LessonPageViewModel.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f28690d;

                    /* JADX INFO: renamed from: e */
                    public int f28691e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f28690d = obj;
                        this.f28691e |= Integer.MIN_VALUE;
                        return C43822.this.mo1339r(null, this);
                    }
                }

                public C43822(InterfaceC7117d interfaceC7117d) {
                    this.f28689a = interfaceC7117d;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x001b  */
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f28691e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f28691e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f28690d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f28691e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        anonymousClass1.f28691e = 1;
                        if (this.f28689a.mo1339r((List) obj, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
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
            public final Object mo9539a(InterfaceC7117d<? super List<? extends C6052c>> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = c7135pM353h3.mo9539a(new C43822(interfaceC7117d), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        }, C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        C7135p c7135pM353h4 = C0062b.m353h2(C0062b.m393s0(stateFlowImplM14379a2, stateFlowImplM14379a4, new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(stateFlowImplM14379a), c7135pM353h2, new LessonPageViewModel$spansForCards$1(this, null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        this.f28542X = c7135pM353h4;
        C7135p c7135pM353h5 = C0062b.m353h2(C0062b.m389r0(stateFlowImplM14379a3, new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(stateFlowImplM14379a), c7135pM353h2, new LessonPageViewModel$spansForWords$1(this, null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        this.f28543Y = c7135pM353h5;
        StateFlowImpl stateFlowImplM14379a5 = C7120g.m14379a(null);
        this.f28544Z = stateFlowImplM14379a5;
        StateFlowImpl stateFlowImplM14379a6 = C7120g.m14379a(null);
        this.f28545a0 = stateFlowImplM14379a6;
        this.f28546b0 = C7120g.m14379a(null);
        StateFlowImpl stateFlowImplM14379a7 = C7120g.m14379a(LessonHighlightStyle.Default);
        this.f28547c0 = stateFlowImplM14379a7;
        final PreferenceStoreImpl$special$$inlined$map$28 preferenceStoreImpl$special$$inlined$map$28Mo9574U = interfaceC5179a.mo9574U();
        InterfaceC7116c<Boolean> interfaceC7116c = new InterfaceC7116c<Boolean>() { // from class: com.lingq.ui.lesson.page.LessonPageViewModel$special$$inlined$map$3

            /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageViewModel$special$$inlined$map$3$2 */
            public static final class C43832<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f28694a;

                /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageViewModel$special$$inlined$map$3$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageViewModel$special$$inlined$map$3$2", m19206f = "LessonPageViewModel.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f28695d;

                    /* JADX INFO: renamed from: e */
                    public int f28696e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f28695d = obj;
                        this.f28696e |= Integer.MIN_VALUE;
                        return C43832.this.mo1339r(null, this);
                    }
                }

                public C43832(InterfaceC7117d interfaceC7117d) {
                    this.f28694a = interfaceC7117d;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0018  */
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f28696e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f28696e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f28695d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f28696e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        Boolean boolValueOf = Boolean.valueOf(((Boolean) obj).booleanValue());
                        anonymousClass1.f28696e = 1;
                        if (this.f28694a.mo1339r(boolValueOf, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
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
            public final Object mo9539a(InterfaceC7117d<? super Boolean> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = preferenceStoreImpl$special$$inlined$map$28Mo9574U.mo9539a(new C43832(interfaceC7117d), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        };
        InterfaceC7882z interfaceC7882zM16767w2 = C8573r0.m16767w0(this);
        Boolean bool = Boolean.FALSE;
        this.f28549d0 = C0062b.m353h2(interfaceC7116c, interfaceC7882zM16767w2, startedWhileSubscribed, bool);
        this.f28551e0 = C0062b.m353h2(interfaceC5179a.mo9593h(), C8573r0.m16767w0(this), startedWhileSubscribed, Float.valueOf(1.0f));
        this.f28553f0 = C0062b.m353h2(new C7131l(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(stateFlowImplM14379a), stateFlowImplM14379a2, new LessonPageViewModel$bottomButtonState$1(null)), C8573r0.m16767w0(this), startedWhileSubscribed, AbstractC4385a.a.f28708a);
        StateFlowImpl stateFlowImplM14379a8 = C7120g.m14379a(emptyList);
        this.f28555g0 = stateFlowImplM14379a8;
        this.f28557h0 = C0062b.m353h2(new C7136q(new LessonPageViewModel$special$$inlined$combineTransform$1(new InterfaceC7116c[]{c7135pM353h5, c7135pM353h4, stateFlowImplM14379a5, stateFlowImplM14379a6, stateFlowImplM14379a8, stateFlowImplM14379a7}, null, this)), C8573r0.m16767w0(this), startedWhileSubscribed, null);
        StateFlowImpl stateFlowImplM14379a9 = C7120g.m14379a(null);
        this.f28559i0 = stateFlowImplM14379a9;
        this.f28561j0 = C0062b.m353h2(stateFlowImplM14379a9, C8573r0.m16767w0(this), startedWhileSubscribed, null);
        AbstractChannel abstractChannelM16738m = C8573r0.m16738m(-1, null, 6);
        this.f28563k0 = abstractChannelM16738m;
        this.f28565l0 = C0062b.m287L1(abstractChannelM16738m);
        StateFlowImpl stateFlowImplM14379a10 = C7120g.m14379a("");
        this.f28566m0 = stateFlowImplM14379a10;
        this.f28567n0 = C0062b.m353h2(stateFlowImplM14379a10, C8573r0.m16767w0(this), startedWhileSubscribed, "");
        StateFlowImpl stateFlowImplM14379a11 = C7120g.m14379a("");
        this.f28568o0 = stateFlowImplM14379a11;
        this.f28569p0 = C0062b.m353h2(stateFlowImplM14379a11, C8573r0.m16767w0(this), startedWhileSubscribed, "");
        AbstractChannel abstractChannelM16738m2 = C8573r0.m16738m(-1, null, 6);
        this.f28570q0 = abstractChannelM16738m2;
        this.f28571r0 = C0062b.m287L1(abstractChannelM16738m2);
        this.f28573t0 = C7120g.m14379a(0);
        this.f28574u0 = C7120g.m14379a(bool);
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f28575v0 = c7138sM10448a;
        this.f28576w0 = C0062b.m341d2(c7138sM10448a, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a2 = C4924a.m10448a();
        this.f28577x0 = c7138sM10448a2;
        this.f28578y0 = C0062b.m341d2(c7138sM10448a2, C8573r0.m16767w0(this), startedWhileSubscribed);
        this.f28579z0 = interfaceC5179a.mo9596k();
        this.f28525A0 = interfaceC5179a.mo9554A();
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C43711(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C43722(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new LessonPageViewModel$showSentenceAudioTooltip$1(this, null), 3);
    }

    /* JADX INFO: renamed from: l2 */
    public static final void m10196l2(LessonPageViewModel lessonPageViewModel, int i10, int i11) {
        lessonPageViewModel.getClass();
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(lessonPageViewModel);
        LessonPageViewModel$fetchGoogleTranslation$1 lessonPageViewModel$fetchGoogleTranslation$1 = new LessonPageViewModel$fetchGoogleTranslation$1(lessonPageViewModel, i10, null);
        CoroutineJobManager coroutineJobManager = lessonPageViewModel.f28554g;
        CoroutineDispatcher coroutineDispatcher = lessonPageViewModel.f28562k;
        C7499b.m14933c0(interfaceC7882zM16767w0, coroutineJobManager, coroutineDispatcher, "sentenceTranslationGoogle", lessonPageViewModel$fetchGoogleTranslation$1);
        C7499b.m14933c0(C8573r0.m16767w0(lessonPageViewModel), coroutineJobManager, coroutineDispatcher, "networkGoogleSentence", new LessonPageViewModel$fetchGoogleTranslation$2(lessonPageViewModel, i10, i11, null));
    }

    /* JADX INFO: renamed from: r2 */
    public static C7569c m10197r2(C7570d c7570d) {
        C7569c c7569c = new C7569c(0, 0, 0, c7570d, false, 0, 503);
        c7569c.f41714a = R.attr.relatedPhraseHighlightColor;
        c7569c.f41716c = R.attr.knownIgnoredPhraseBorderColor;
        return c7569c;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f28564l.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f28564l.mo497B0(interfaceC9968c);
    }

    @Override // com.lingq.commons.controllers.InterfaceC3275c
    /* JADX INFO: renamed from: E0 */
    public final void mo9335E0(String str, Set<String> set) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(set, "text");
        this.f28556h.mo9335E0(str, set);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f28564l.mo498E1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: H1 */
    public final void mo9722H1(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "tooltipStep");
        this.f28526H.mo9722H1(tooltipStep);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: I */
    public final void mo9723I(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        this.f28526H.mo9723I(tooltipStep);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f28564l.mo499J(profile, interfaceC9968c);
    }

    @Override // com.lingq.commons.controllers.InterfaceC3275c
    /* JADX INFO: renamed from: K */
    public final void mo9336K() {
        this.f28556h.mo9336K();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: L */
    public final void mo9724L() {
        this.f28526H.mo9724L();
    }

    @Override // com.lingq.commons.controllers.InterfaceC3275c
    /* JADX INFO: renamed from: M1 */
    public final void mo9337M1(int i10, double d10, Double d11, float f3) {
        this.f28556h.mo9337M1(i10, d10, d11, f3);
    }

    @Override // com.lingq.commons.controllers.InterfaceC3275c
    /* JADX INFO: renamed from: O1 */
    public final void mo9338O1(String str) {
        C5207g.m11111f(str, "language");
        this.f28556h.mo9338O1(str);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f28564l.mo500P();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: T0 */
    public final void mo9727T0() {
        this.f28526H.mo9727T0();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: Y1 */
    public final void mo9729Y1() {
        this.f28526H.mo9729Y1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: a1 */
    public final void mo9730a1() {
        this.f28526H.mo9730a1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: b0 */
    public final void mo9731b0(boolean z10) {
        this.f28526H.mo9731b0(z10);
    }

    @Override // com.lingq.commons.controllers.InterfaceC3275c
    /* JADX INFO: renamed from: c */
    public final InterfaceC7116c<Long> mo9339c() {
        return this.f28556h.mo9339c();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f28564l.mo501d(str, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f28564l;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f28564l.mo503f1(interfaceC9968c);
    }

    /* JADX INFO: renamed from: g */
    public final void m10198g() {
        m10206u2(this.f28529K);
        StateFlowImpl stateFlowImpl = this.f28546b0;
        stateFlowImpl.setValue(null);
        C7568b c7568b = this.f28529K;
        stateFlowImpl.setValue(c7568b != null ? c7568b.f41710a : null);
        this.f28529K = null;
        this.f28545a0.setValue(null);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: g0 */
    public final InterfaceC7116c<List<TooltipStep>> mo9733g0() {
        return this.f28526H.mo9733g0();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: g2 */
    public final void mo9734g2(TooltipStep tooltipStep, Rect rect, Rect rect2, boolean z10, boolean z11, boolean z12, InterfaceC2041a<C9072e> interfaceC2041a) {
        C5207g.m11111f(tooltipStep, "step");
        C5207g.m11111f(rect, "viewRect");
        C5207g.m11111f(rect2, "tooltipRect");
        C5207g.m11111f(interfaceC2041a, "action");
        this.f28526H.mo9734g2(tooltipStep, rect, rect2, z10, z11, z12, interfaceC2041a);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: h */
    public final InterfaceC7142w<Boolean> mo9735h() {
        return this.f28526H.mo9735h();
    }

    @Override // com.lingq.commons.controllers.InterfaceC3275c
    /* JADX INFO: renamed from: h0 */
    public final Object mo9342h0(String str, InterfaceC9968c<? super List<LocalTextToSpeechVoice>> interfaceC9968c) {
        return this.f28556h.mo9342h0(str, interfaceC9968c);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: j0 */
    public final void mo9736j0() {
        this.f28526H.mo9736j0();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f28564l.mo504j1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: k0 */
    public final InterfaceC7116c<TooltipStep> mo9737k0() {
        return this.f28526H.mo9737k0();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: k1 */
    public final InterfaceC7116c<C9072e> mo9738k1() {
        return this.f28526H.mo9738k1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f28564l.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f28564l.mo506l1();
    }

    /* JADX INFO: renamed from: m2 */
    public final void m10199m2(C7568b c7568b) {
        if (!C5207g.m11106a(this.f28529K, c7568b)) {
            m10198g();
        }
        this.f28529K = c7568b;
        StateFlowImpl stateFlowImpl = this.f28544Z;
        this.f28546b0.setValue(stateFlowImpl.getValue());
        this.f28528J = null;
        stateFlowImpl.setValue(null);
        StateFlowImpl stateFlowImpl2 = this.f28545a0;
        stateFlowImpl2.setValue(null);
        stateFlowImpl2.setValue(c7568b.f41710a);
        this.f28563k0.mo16479j(new C4373a(c7568b.f41710a, TokenType.CardType, c7568b.f41713d, c7568b, true));
        m10206u2(c7568b);
    }

    /* JADX INFO: renamed from: n2 */
    public final void m10200n2(C7570d c7570d, TokenType tokenType) {
        StateFlowImpl stateFlowImpl = this.f28544Z;
        this.f28546b0.setValue(stateFlowImpl.getValue());
        this.f28528J = c7570d;
        stateFlowImpl.setValue(null);
        stateFlowImpl.setValue(c7570d);
        this.f28563k0.mo16479j(new C4373a(c7570d, tokenType, EmptyList.f38032a, null, false));
    }

    @Override // com.lingq.commons.controllers.InterfaceC3275c
    /* JADX INFO: renamed from: o */
    public final void mo9343o(String str, String str2, boolean z10, float f3) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "text");
        this.f28556h.mo9343o(str, str2, z10, f3);
    }

    /* JADX INFO: renamed from: o2 */
    public final boolean m10201o2(C7570d c7570d, C7570d c7570d2) {
        String str = c7570d.f41725e;
        Locale locale = this.f28530L;
        C5207g.m11110e(locale, "locale");
        String strM15502f = C7793a.m15502f(str, locale);
        String str2 = c7570d2.f41725e;
        C5207g.m11110e(locale, "locale");
        boolean z10 = false;
        if (C7076b.m14278X2(strM15502f, C7793a.m15502f(str2, locale), false) && c7570d2.f41721a >= c7570d.f41721a && c7570d2.f41722b <= c7570d.f41722b) {
            z10 = true;
        }
        return z10;
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: p0 */
    public final boolean mo9741p0(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        return this.f28526H.mo9741p0(tooltipStep);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f28564l.mo507p1();
    }

    /* JADX INFO: renamed from: p2 */
    public final void m10202p2(int i10, int i11, boolean z10) {
        String strSubstring;
        String str;
        List<C7570d> list;
        ArrayList arrayList = new ArrayList();
        StateFlowImpl stateFlowImpl = this.f28531M;
        C7567a c7567a = (C7567a) stateFlowImpl.getValue();
        if (c7567a != null && (list = c7567a.f41703c) != null) {
            for (C7570d c7570d : list) {
                if (c7570d.f41721a >= i10 && c7570d.f41722b <= i11) {
                    arrayList.add(c7570d);
                }
            }
        }
        if ((!arrayList.isEmpty()) && arrayList.size() < 9) {
            C7567a c7567a2 = (C7567a) stateFlowImpl.getValue();
            if (c7567a2 == null || (str = c7567a2.f41702b) == null) {
                strSubstring = "";
            } else {
                strSubstring = str.substring(((C7570d) C6752c.m13423Q(arrayList)).f41721a, ((C7570d) C6752c.m13432Z(arrayList)).f41722b);
                C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            Regex regex = new Regex("\\w+-\\w+");
            ArrayList arrayList2 = new ArrayList();
            if (regex.f39972a.matcher(strSubstring).find()) {
                arrayList2.addAll(C9000b.m17255u(C7073a.m14267b3(C7073a.m14261V2(Regex.m14270a(regex, strSubstring), new InterfaceC2052l<InterfaceC7656d, String>() { // from class: com.lingq.ui.lesson.page.LessonPageViewModel$setSelectionAndShowPhrase$2
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final String mo528n(InterfaceC7656d interfaceC7656d) {
                        InterfaceC7656d interfaceC7656d2 = interfaceC7656d;
                        C5207g.m11111f(interfaceC7656d2, "it");
                        return interfaceC7656d2.getValue();
                    }
                }))));
            }
            int i12 = ((C7570d) C6752c.m13423Q(arrayList)).f41727g;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((C7570d) it.next()).f41727g != i12) {
                    return;
                }
            }
            if (arrayList.size() == 1) {
                this.f28546b0.setValue(this.f28528J);
                this.f28559i0.setValue(m10197r2((C7570d) arrayList.get(0)));
            } else {
                C7570d c7570dM10204s2 = m10204s2(arrayList2, arrayList);
                C7848l1 c7848l1 = this.f28533O;
                if (c7848l1 != null) {
                    C4924a.m10450b(c7848l1);
                }
                this.f28533O = C7828f.m15570d(C8573r0.m16767w0(this), null, null, new LessonPageViewModel$setSelectionAndShowPhrase$4(z10, this, c7570dM10204s2, arrayList, null), 3);
            }
        }
    }

    @SuppressLint({"ResourceType"})
    /* JADX INFO: renamed from: q2 */
    public final C7569c m10203q2(C7570d c7570d, C6052c c6052c, boolean z10) {
        int i10;
        int i11;
        int length;
        String str;
        String str2;
        int i12 = c6052c.f35740f;
        Integer num = c6052c.f35741g;
        int iM10416b = ViewsUtilsKt.m10416b(i12, num);
        if (!z10) {
            Iterator it = ((List) this.f28539U.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    i10 = iM10416b;
                    break;
                }
                C7568b c7568b = (C7568b) it.next();
                if (c7568b.f41712c.get(c7570d.f41725e) != null && m10201o2(c7568b.f41710a, c7570d)) {
                    i10 = R.color.transparent;
                    break;
                }
            }
        } else {
            i10 = iM10416b;
            break;
        }
        int iM10417c = ViewsUtilsKt.m10417c(i12, num);
        if (i10 == R.color.transparent) {
            i11 = i10;
        } else {
            i11 = i10 == R.attr.yellowWordStatus4Color ? R.attr.knownIgnoredPhraseBorderColor : R.attr.yellowWordBorderColor;
        }
        C7569c c7569c = new C7569c(i10, iM10417c, i11, c7570d, false, C5408a.m11568a(i12, num), 208);
        int i13 = c7570d.f41722b;
        StateFlowImpl stateFlowImpl = this.f28531M;
        C7567a c7567a = (C7567a) stateFlowImpl.getValue();
        if (i13 >= ((c7567a == null || (str2 = c7567a.f41702b) == null) ? 0 : str2.length())) {
            C7567a c7567a2 = (C7567a) stateFlowImpl.getValue();
            length = (c7567a2 == null || (str = c7567a2.f41702b) == null) ? 0 : str.length();
        } else {
            length = c7570d.f41722b;
        }
        int i14 = c7570d.f41721a;
        if (i14 > length) {
            i14 = length;
        }
        C7570d c7570d2 = c7569c.f41717d;
        c7570d2.f41721a = i14;
        c7570d2.f41722b = length;
        c7569c.f41719f = false;
        return c7569c;
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: r0 */
    public final InterfaceC7116c<TooltipStep> mo9743r0() {
        return this.f28526H.mo9743r0();
    }

    /* JADX INFO: renamed from: s2 */
    public final C7570d m10204s2(List list, ArrayList arrayList) {
        String strM15254T2 = C7661i.m15254T2(C6752c.m13430X(arrayList, null, null, null, new InterfaceC2052l<C7570d, CharSequence>() { // from class: com.lingq.ui.lesson.page.LessonPageViewModel$setupSelectedPhraseHighlight$phraseTerms$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final CharSequence mo528n(C7570d c7570d) {
                C7570d c7570d2 = c7570d;
                C5207g.m11111f(c7570d2, "it");
                return c7570d2.f41725e;
            }
        }, 31), ",", "");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            strM15254T2 = C7661i.m15254T2(strM15254T2, C7661i.m15254T2(str, "-", " "), str);
        }
        C7570d c7570d = new C7570d(((C7570d) arrayList.get(0)).f41721a, ((C7570d) arrayList.get(arrayList.size() - 1)).f41722b, 0, 0, C7076b.m14277B3(strM15254T2).toString(), ((C7570d) arrayList.get(0)).f41726f, 0, 0, null, null, TextTokenType.POTENTIAL_PHRASE, 0, 15308);
        m10198g();
        this.f28546b0.setValue(this.f28528J);
        this.f28559i0.setValue(m10197r2(c7570d));
        return c7570d;
    }

    @Override // com.lingq.commons.controllers.InterfaceC3275c
    /* JADX INFO: renamed from: t */
    public final InterfaceC7116c<Boolean> mo9344t() {
        return this.f28556h.mo9344t();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f28564l.mo508t1();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ae  */
    @SuppressLint({"ResourceType"})
    /* JADX INFO: renamed from: t2 */
    public final C7569c m10205t2(C7570d c7570d, C6054e c6054e, boolean z10) {
        int i10;
        int i11;
        int i12;
        String str;
        String str2;
        String value = WordStatus.Card.getValue();
        String str3 = c6054e.f35748f;
        if (C5207g.m11106a(str3, value)) {
            return null;
        }
        int iM10418d = ViewsUtilsKt.m10418d(str3);
        if (!z10) {
            Iterator it = ((List) this.f28539U.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    i10 = iM10418d;
                    break;
                }
                C7568b c7568b = (C7568b) it.next();
                if (c7568b.f41712c.get(c7570d.f41725e) != null && m10201o2(c7568b.f41710a, c7570d)) {
                    i10 = R.color.transparent;
                    break;
                }
            }
        } else {
            i10 = iM10418d;
            break;
        }
        int iM10419e = ViewsUtilsKt.m10419e(str3);
        if (i10 == R.color.transparent) {
            i11 = i10;
        } else {
            i11 = i10 == R.attr.yellowWordStatus4Color ? R.attr.knownIgnoredPhraseBorderColor : R.attr.blueWordBorderColor;
        }
        C7569c c7569c = new C7569c(i10, iM10419e, i11, c7570d, false, 0, 464);
        int i13 = c7570d.f41722b;
        StateFlowImpl stateFlowImpl = this.f28531M;
        C7567a c7567a = (C7567a) stateFlowImpl.getValue();
        int length = 0;
        if (i13 >= ((c7567a == null || (str2 = c7567a.f41702b) == null) ? 0 : str2.length())) {
            C7567a c7567a2 = (C7567a) stateFlowImpl.getValue();
            if (c7567a2 != null && (str = c7567a2.f41702b) != null) {
                length = str.length();
            }
            i12 = c7570d.f41721a;
            if (i12 > length) {
                i12 = length;
            }
            C7570d c7570d2 = c7569c.f41717d;
            c7570d2.f41721a = i12;
            c7570d2.f41722b = length;
            c7569c.f41719f = true;
            return c7569c;
        }
        length = c7570d.f41722b;
        i12 = c7570d.f41721a;
        if (i12 > length) {
            i12 = length;
        }
        C7570d c7570d3 = c7569c.f41717d;
        c7570d3.f41721a = i12;
        c7570d3.f41722b = length;
        c7569c.f41719f = true;
        return c7569c;
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: u */
    public final InterfaceC7116c<C6343f> mo9744u() {
        return this.f28526H.mo9744u();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: u0 */
    public final void mo9745u0(boolean z10) {
        this.f28526H.mo9745u0(z10);
    }

    /* JADX INFO: renamed from: u2 */
    public final void m10206u2(C7568b c7568b) {
        List<C7570d> list;
        Locale locale;
        ArrayList arrayList = new ArrayList();
        if (c7568b != null && (list = c7568b.f41713d) != null) {
            for (C7570d c7570d : list) {
                Iterator it = ((Iterable) this.f28542X.getValue()).iterator();
                while (true) {
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        locale = this.f28530L;
                        if (!zHasNext) {
                            break;
                        }
                        if (C5207g.m11106a(c7570d, ((C7569c) it.next()).f41717d)) {
                            Map map = (Map) this.f28536R.getValue();
                            String str = c7570d.f41725e;
                            C5207g.m11110e(locale, "locale");
                            C6052c c6052c = (C6052c) map.get(C7793a.m15502f(str, locale));
                            if (c6052c != null) {
                                arrayList.add(m10203q2(c7570d, c6052c, true));
                            }
                        }
                    }
                }
                Iterator it2 = ((Iterable) this.f28543Y.getValue()).iterator();
                while (true) {
                    while (true) {
                        if (it2.hasNext()) {
                            if (C5207g.m11106a(c7570d, ((C7569c) it2.next()).f41717d)) {
                                Map map2 = (Map) this.f28537S.getValue();
                                String str2 = c7570d.f41725e;
                                C5207g.m11110e(locale, "locale");
                                C6054e c6054e = (C6054e) map2.get(C7793a.m15502f(str2, locale));
                                if (c6054e != null) {
                                    arrayList.add(m10205t2(c7570d, c6054e, true));
                                }
                            }
                        }
                    }
                }
            }
        }
        this.f28555g0.setValue(C6752c.m13421O(C6752c.m13453u0(arrayList)));
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: v1 */
    public final boolean mo9746v1(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        return this.f28526H.mo9746v1(tooltipStep);
    }

    /* JADX INFO: renamed from: v2 */
    public final void m10207v2(C7570d c7570d) {
        C5207g.m11111f(c7570d, "token");
        for (C7568b c7568b : (List) this.f28539U.getValue()) {
            if (c7568b.f41712c.get(c7570d.f41725e) != null && m10201o2(c7568b.f41710a, c7570d)) {
                if (!C5207g.m11106a(c7568b, this.f28529K)) {
                    m10199m2(c7568b);
                    return;
                } else if (C5207g.m11106a(c7570d, this.f28528J)) {
                    m10199m2(c7568b);
                    return;
                } else {
                    m10200n2(c7570d, TokenType.WordType);
                    return;
                }
            }
        }
        m10198g();
        m10200n2(c7570d, TokenType.WordType);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f28564l.mo509w0();
    }
}
