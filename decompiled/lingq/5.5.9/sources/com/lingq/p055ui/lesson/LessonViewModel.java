package com.lingq.p055ui.lesson;

import ae.C0062b;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import ci.InterfaceC2008a;
import ci.InterfaceC2013f;
import ci.InterfaceC2014g;
import ci.InterfaceC2016i;
import ci.InterfaceC2019l;
import ci.InterfaceC2024q;
import ci.InterfaceC2026s;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import cm.InterfaceC2058r;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.controllers.InterfaceC3275c;
import com.lingq.p055ui.lesson.data.TokenFragmentData;
import com.lingq.p055ui.lesson.page.data.TextTokenType;
import com.lingq.p055ui.token.InterfaceC4865b;
import com.lingq.p055ui.token.TokenData;
import com.lingq.p055ui.token.TokenEditData;
import com.lingq.p055ui.token.TokenTransliteration;
import com.lingq.p055ui.tooltips.InterfaceC4912b;
import com.lingq.p055ui.tooltips.TooltipStep;
import com.lingq.p055ui.upgrade.UpgradeReason;
import com.lingq.player.C3296a;
import com.lingq.player.C3297b;
import com.lingq.player.C3300e;
import com.lingq.player.InterfaceC3301f;
import com.lingq.player.PlayerContentController;
import com.lingq.player.PlayerController;
import com.lingq.player.PlayingFrom;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.download.AbstractC3312a;
import com.lingq.shared.download.DownloadItem;
import com.lingq.shared.repository.InterfaceC3324a;
import com.lingq.shared.storage.LessonFont;
import com.lingq.shared.storage.LessonHighlightStyle;
import com.lingq.shared.uimodel.CardStatus;
import com.lingq.shared.uimodel.WordStatus;
import com.lingq.shared.uimodel.language.AppUsageType;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.shared.uimodel.lesson.LessonStudy;
import com.lingq.shared.uimodel.lesson.LessonStudyBookmark;
import com.lingq.shared.uimodel.lesson.LessonStudySentence;
import com.lingq.shared.uimodel.lesson.LessonStudyTextToken;
import com.lingq.shared.uimodel.lesson.LessonStudyTransliteration;
import com.lingq.shared.uimodel.library.LibraryItemCounter;
import com.lingq.shared.uimodel.token.TokenMeaning;
import com.lingq.shared.uimodel.token.TokenRelatedPhrase;
import com.lingq.shared.uimodel.token.TokenType;
import com.lingq.shared.util.LessonPath;
import com.lingq.util.C4924a;
import com.lingq.util.CoroutineJobManager;
import com.squareup.moshi.C4955q;
import dm.C5207g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import ki.C6698d;
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
import kotlinx.coroutines.flow.C7122i;
import kotlinx.coroutines.flow.C7131l;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.C7136q;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.flow.InterfaceC7133n;
import kotlinx.coroutines.flow.InterfaceC7137r;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.C7127c;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import mo.C7661i;
import ni.C7793a;
import ni.C7794b;
import ni.C7796d;
import no.C7828f;
import no.C7848l1;
import no.InterfaceC7882z;
import org.joda.time.DateTime;
import p015ak.InterfaceC0113j;
import p076di.InterfaceC5179a;
import p076di.InterfaceC5180b;
import p076di.InterfaceC5182d;
import p096ei.C5408a;
import p155he.C6041e;
import p159hi.C6052c;
import p159hi.C6054e;
import p160hj.C6061g;
import p160hj.C6069o;
import p183ik.C6343f;
import p205jk.InterfaceC6515k;
import p225kk.C6704a;
import p225kk.C6715l;
import p225kk.C6716m;
import p244lh.InterfaceC7364a;
import p244lh.InterfaceC7366c;
import p244lh.InterfaceC7367d;
import p260m8.C7499b;
import p265mj.C7567a;
import p265mj.C7570d;
import p338qd.C8573r0;
import p416uh.InterfaceC9527a;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sh.AbstractC9006b;
import sh.C9015k;
import sh.InterfaceC9010f;
import sh.InterfaceC9013i;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f¨\u0006\r"}, m13365d2 = {"Lcom/lingq/ui/lesson/LessonViewModel;", "Landroidx/lifecycle/h0;", "Lak/j;", "Lcom/lingq/ui/token/b;", "Lcom/lingq/player/f;", "Lsh/i;", "Lsh/f;", "Luh/a;", "Llh/d;", "Llh/c;", "Ljk/k;", "Lcom/lingq/ui/tooltips/b;", "Llh/a;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LessonViewModel extends AbstractC1036h0 implements InterfaceC0113j, InterfaceC4865b, InterfaceC3301f, InterfaceC9013i, InterfaceC9010f, InterfaceC9527a, InterfaceC7367d, InterfaceC7366c, InterfaceC6515k, InterfaceC4912b, InterfaceC7364a {

    /* JADX INFO: renamed from: A0 */
    public final C7134o f27385A0;

    /* JADX INFO: renamed from: A1 */
    public final C7135p f27386A1;

    /* JADX INFO: renamed from: B0 */
    public final C7138s f27387B0;

    /* JADX INFO: renamed from: B1 */
    public final StateFlowImpl f27388B1;

    /* JADX INFO: renamed from: C0 */
    public final C7134o f27389C0;

    /* JADX INFO: renamed from: C1 */
    public final C7138s f27390C1;

    /* JADX INFO: renamed from: D0 */
    public final C7138s f27391D0;

    /* JADX INFO: renamed from: D1 */
    public final C7134o f27392D1;

    /* JADX INFO: renamed from: E0 */
    public final C7134o f27393E0;

    /* JADX INFO: renamed from: E1 */
    public final C7138s f27394E1;

    /* JADX INFO: renamed from: F0 */
    public final C7138s f27395F0;

    /* JADX INFO: renamed from: F1 */
    public final C7134o f27396F1;

    /* JADX INFO: renamed from: G0 */
    public final C7134o f27397G0;

    /* JADX INFO: renamed from: G1 */
    public final C7138s f27398G1;

    /* JADX INFO: renamed from: H */
    public final InterfaceC5180b f27399H;

    /* JADX INFO: renamed from: H0 */
    public final C7138s f27400H0;

    /* JADX INFO: renamed from: H1 */
    public final C7134o f27401H1;

    /* JADX INFO: renamed from: I */
    public final InterfaceC5182d f27402I;

    /* JADX INFO: renamed from: I0 */
    public final C7134o f27403I0;

    /* JADX INFO: renamed from: I1 */
    public final C7138s f27404I1;

    /* JADX INFO: renamed from: J */
    public final C6704a f27405J;

    /* JADX INFO: renamed from: J0 */
    public final C7138s f27406J0;

    /* JADX INFO: renamed from: J1 */
    public final C7134o f27407J1;

    /* JADX INFO: renamed from: K */
    public final InterfaceC3275c f27408K;

    /* JADX INFO: renamed from: K0 */
    public final C7134o f27409K0;

    /* JADX INFO: renamed from: K1 */
    public final C7138s f27410K1;

    /* JADX INFO: renamed from: L */
    public final PlayerController f27411L;

    /* JADX INFO: renamed from: L0 */
    public final StateFlowImpl f27412L0;

    /* JADX INFO: renamed from: L1 */
    public final C7134o f27413L1;

    /* JADX INFO: renamed from: M */
    public final C7796d f27414M;

    /* JADX INFO: renamed from: M0 */
    public final StateFlowImpl f27415M0;

    /* JADX INFO: renamed from: M1 */
    public final StateFlowImpl f27416M1;

    /* JADX INFO: renamed from: N */
    public final C4955q f27417N;

    /* JADX INFO: renamed from: N0 */
    public final StateFlowImpl f27418N0;

    /* JADX INFO: renamed from: N1 */
    public final StateFlowImpl f27419N1;

    /* JADX INFO: renamed from: O */
    public final CoroutineDispatcher f27420O;

    /* JADX INFO: renamed from: O0 */
    public final StateFlowImpl f27421O0;

    /* JADX INFO: renamed from: O1 */
    public final C7138s f27422O1;

    /* JADX INFO: renamed from: P */
    public final CoroutineDispatcher f27423P;

    /* JADX INFO: renamed from: P0 */
    public final StateFlowImpl f27424P0;

    /* JADX INFO: renamed from: P1 */
    public final C7134o f27425P1;

    /* JADX INFO: renamed from: Q */
    public final CoroutineJobManager f27426Q;

    /* JADX INFO: renamed from: Q0 */
    public final C7135p f27427Q0;

    /* JADX INFO: renamed from: Q1 */
    public final C7138s f27428Q1;

    /* JADX INFO: renamed from: R */
    public final InterfaceC7882z f27429R;

    /* JADX INFO: renamed from: R0 */
    public final C7135p f27430R0;

    /* JADX INFO: renamed from: R1 */
    public final C7134o f27431R1;

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ InterfaceC0113j f27432S;

    /* JADX INFO: renamed from: S0 */
    public final C7135p f27433S0;

    /* JADX INFO: renamed from: S1 */
    public final C7138s f27434S1;

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ InterfaceC4865b f27435T;

    /* JADX INFO: renamed from: T0 */
    public final C7135p f27436T0;

    /* JADX INFO: renamed from: T1 */
    public final C7134o f27437T1;

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ InterfaceC3301f f27438U;

    /* JADX INFO: renamed from: U0 */
    public final C7135p f27439U0;

    /* JADX INFO: renamed from: U1 */
    public C7848l1 f27440U1;

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ InterfaceC9013i f27441V;

    /* JADX INFO: renamed from: V0 */
    public final C7134o f27442V0;

    /* JADX INFO: renamed from: V1 */
    public C7848l1 f27443V1;

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ InterfaceC9010f f27444W;

    /* JADX INFO: renamed from: W0 */
    public final StateFlowImpl f27445W0;

    /* JADX INFO: renamed from: W1 */
    public boolean f27446W1;

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ InterfaceC9527a f27447X;

    /* JADX INFO: renamed from: X0 */
    public final StateFlowImpl f27448X0;

    /* JADX INFO: renamed from: X1 */
    public final StateFlowImpl f27449X1;

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC7367d f27450Y;

    /* JADX INFO: renamed from: Y0 */
    public final C7135p f27451Y0;

    /* JADX INFO: renamed from: Y1 */
    public final StateFlowImpl f27452Y1;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC7366c f27453Z;

    /* JADX INFO: renamed from: Z0 */
    public final StateFlowImpl f27454Z0;

    /* JADX INFO: renamed from: Z1 */
    public final C7135p f27455Z1;

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ InterfaceC6515k f27456a0;

    /* JADX INFO: renamed from: a1 */
    public final C7135p f27457a1;

    /* JADX INFO: renamed from: a2 */
    public final C7135p f27458a2;

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ InterfaceC4912b f27459b0;

    /* JADX INFO: renamed from: b1 */
    public final C7134o f27460b1;

    /* JADX INFO: renamed from: b2 */
    public final StateFlowImpl f27461b2;

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ InterfaceC7364a f27462c0;

    /* JADX INFO: renamed from: c1 */
    public final C7138s f27463c1;

    /* JADX INFO: renamed from: c2 */
    public final C7135p f27464c2;

    /* JADX INFO: renamed from: d */
    public final InterfaceC3324a f27465d;

    /* JADX INFO: renamed from: d0 */
    public final C6061g f27466d0;

    /* JADX INFO: renamed from: d1 */
    public final C7134o f27467d1;

    /* JADX INFO: renamed from: d2 */
    public final StateFlowImpl f27468d2;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2019l f27469e;

    /* JADX INFO: renamed from: e0 */
    public final StateFlowImpl f27470e0;

    /* JADX INFO: renamed from: e1 */
    public final StateFlowImpl f27471e1;

    /* JADX INFO: renamed from: e2 */
    public final C7138s f27472e2;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2008a f27473f;

    /* JADX INFO: renamed from: f0 */
    public final StateFlowImpl f27474f0;

    /* JADX INFO: renamed from: f1 */
    public final C7135p f27475f1;

    /* JADX INFO: renamed from: f2 */
    public final C7134o f27476f2;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2026s f27477g;

    /* JADX INFO: renamed from: g0 */
    public final StateFlowImpl f27478g0;

    /* JADX INFO: renamed from: g1 */
    public final StateFlowImpl f27479g1;

    /* JADX INFO: renamed from: h */
    public final InterfaceC2013f f27480h;

    /* JADX INFO: renamed from: h0 */
    public final C7135p f27481h0;

    /* JADX INFO: renamed from: h1 */
    public final C7135p f27482h1;

    /* JADX INFO: renamed from: i */
    public final InterfaceC2024q f27483i;

    /* JADX INFO: renamed from: i0 */
    public final StateFlowImpl f27484i0;

    /* JADX INFO: renamed from: i1 */
    public final C7135p f27485i1;

    /* JADX INFO: renamed from: j */
    public final InterfaceC2014g f27486j;

    /* JADX INFO: renamed from: j0 */
    public final StateFlowImpl f27487j0;

    /* JADX INFO: renamed from: j1 */
    public final StateFlowImpl f27488j1;

    /* JADX INFO: renamed from: k */
    public final InterfaceC2016i f27489k;

    /* JADX INFO: renamed from: k0 */
    public final C7138s f27490k0;

    /* JADX INFO: renamed from: k1 */
    public final C7135p f27491k1;

    /* JADX INFO: renamed from: l */
    public final InterfaceC5179a f27492l;

    /* JADX INFO: renamed from: l0 */
    public final C7134o f27493l0;

    /* JADX INFO: renamed from: l1 */
    public final C7135p f27494l1;

    /* JADX INFO: renamed from: m0 */
    public final Locale f27495m0;

    /* JADX INFO: renamed from: m1 */
    public final StateFlowImpl f27496m1;

    /* JADX INFO: renamed from: n0 */
    public final String f27497n0;

    /* JADX INFO: renamed from: n1 */
    public final C7135p f27498n1;

    /* JADX INFO: renamed from: o0 */
    public final StateFlowImpl f27499o0;

    /* JADX INFO: renamed from: o1 */
    public final StateFlowImpl f27500o1;

    /* JADX INFO: renamed from: p0 */
    public final C7135p f27501p0;

    /* JADX INFO: renamed from: p1 */
    public final C7138s f27502p1;

    /* JADX INFO: renamed from: q0 */
    public final C7135p f27503q0;

    /* JADX INFO: renamed from: q1 */
    public final C7135p f27504q1;

    /* JADX INFO: renamed from: r0 */
    public final StateFlowImpl f27505r0;

    /* JADX INFO: renamed from: r1 */
    public final C7135p f27506r1;

    /* JADX INFO: renamed from: s0 */
    public final C7135p f27507s0;

    /* JADX INFO: renamed from: s1 */
    public final C7135p f27508s1;

    /* JADX INFO: renamed from: t0 */
    public final C7135p f27509t0;

    /* JADX INFO: renamed from: t1 */
    public final C7135p f27510t1;

    /* JADX INFO: renamed from: u0 */
    public final C7135p f27511u0;

    /* JADX INFO: renamed from: u1 */
    public final C7135p f27512u1;

    /* JADX INFO: renamed from: v0 */
    public final C7135p f27513v0;

    /* JADX INFO: renamed from: v1 */
    public final C7138s f27514v1;

    /* JADX INFO: renamed from: w0 */
    public final StateFlowImpl f27515w0;

    /* JADX INFO: renamed from: w1 */
    public final C7134o f27516w1;

    /* JADX INFO: renamed from: x0 */
    public final C7135p f27517x0;

    /* JADX INFO: renamed from: x1 */
    public final C7138s f27518x1;

    /* JADX INFO: renamed from: y0 */
    public final StateFlowImpl f27519y0;

    /* JADX INFO: renamed from: y1 */
    public final C7134o f27520y1;

    /* JADX INFO: renamed from: z0 */
    public final C7138s f27521z0;

    /* JADX INFO: renamed from: z1 */
    public final StateFlowImpl f27522z1;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$1", m19206f = "LessonViewModel.kt", m19207l = {548}, m19208m = "invokeSuspend")
    final class C42271 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f27523e;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$1$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$1$1", m19206f = "LessonViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ boolean f27525e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ LessonViewModel f27526f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LessonViewModel lessonViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f27526f = lessonViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f27526f, interfaceC9968c);
                anonymousClass1.f27525e = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(Boolean.valueOf(bool.booleanValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                this.f27526f.f27505r0.setValue(Boolean.valueOf(this.f27525e));
                return C9072e.f47360a;
            }
        }

        public C42271(InterfaceC9968c<? super C42271> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return LessonViewModel.this.new C42271(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C42271) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f27523e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                LessonViewModel lessonViewModel = LessonViewModel.this;
                InterfaceC7116c interfaceC7116cM273H0 = C0062b.m273H0(lessonViewModel.f27492l.mo9606u());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(lessonViewModel, null);
                this.f27523e = 1;
                if (C0062b.m369m0(interfaceC7116cM273H0, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$10 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$10", m19206f = "LessonViewModel.kt", m19207l = {655}, m19208m = "invokeSuspend")
    final class C422810 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f27527e;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$10$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/storage/LessonHighlightStyle;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$10$1", m19206f = "LessonViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<LessonHighlightStyle, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f27529e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ LessonViewModel f27530f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LessonViewModel lessonViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f27530f = lessonViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f27530f, interfaceC9968c);
                anonymousClass1.f27529e = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(LessonHighlightStyle lessonHighlightStyle, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(lessonHighlightStyle, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                this.f27530f.f27416M1.setValue((LessonHighlightStyle) this.f27529e);
                return C9072e.f47360a;
            }
        }

        public C422810(InterfaceC9968c<? super C422810> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return LessonViewModel.this.new C422810(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C422810) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f27527e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                LessonViewModel lessonViewModel = LessonViewModel.this;
                InterfaceC7116c interfaceC7116cM273H0 = C0062b.m273H0(lessonViewModel.f27492l.mo9596k());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(lessonViewModel, null);
                this.f27527e = 1;
                if (C0062b.m369m0(interfaceC7116cM273H0, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$11 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$11", m19206f = "LessonViewModel.kt", m19207l = {661}, m19208m = "invokeSuspend")
    final class C422911 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f27531e;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$11$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/storage/LessonHighlightStyle;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$11$1", m19206f = "LessonViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<LessonHighlightStyle, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f27533e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ LessonViewModel f27534f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LessonViewModel lessonViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f27534f = lessonViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f27534f, interfaceC9968c);
                anonymousClass1.f27533e = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(LessonHighlightStyle lessonHighlightStyle, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(lessonHighlightStyle, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                this.f27534f.f27419N1.setValue((LessonHighlightStyle) this.f27533e);
                return C9072e.f47360a;
            }
        }

        public C422911(InterfaceC9968c<? super C422911> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return LessonViewModel.this.new C422911(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C422911) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f27531e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                LessonViewModel lessonViewModel = LessonViewModel.this;
                InterfaceC7116c interfaceC7116cM273H0 = C0062b.m273H0(lessonViewModel.f27492l.mo9554A());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(lessonViewModel, null);
                this.f27531e = 1;
                if (C0062b.m369m0(interfaceC7116cM273H0, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$12 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$12", m19206f = "LessonViewModel.kt", m19207l = {671}, m19208m = "invokeSuspend")
    final class C423012 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f27535e;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$12$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lni/b;", "goal", "", "action", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$12$1", m19206f = "LessonViewModel.kt", m19207l = {669}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2058r<InterfaceC7117d<? super C7794b>, C7794b, Boolean, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public int f27537e;

            /* JADX INFO: renamed from: f */
            public /* synthetic */ InterfaceC7117d f27538f;

            /* JADX INFO: renamed from: g */
            public /* synthetic */ C7794b f27539g;

            /* JADX INFO: renamed from: h */
            public /* synthetic */ boolean f27540h;

            public AnonymousClass1(InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(4, interfaceC9968c);
            }

            @Override // cm.InterfaceC2058r
            /* JADX INFO: renamed from: T */
            public final Object mo1851T(InterfaceC7117d<? super C7794b> interfaceC7117d, C7794b c7794b, Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                boolean zBooleanValue = bool.booleanValue();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                anonymousClass1.f27538f = interfaceC7117d;
                anonymousClass1.f27539g = c7794b;
                anonymousClass1.f27540h = zBooleanValue;
                return anonymousClass1.mo1338x(C9072e.f47360a);
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f27537e;
                if (i10 == 0) {
                    C7499b.m14977z0(obj);
                    InterfaceC7117d interfaceC7117d = this.f27538f;
                    C7794b c7794b = this.f27539g;
                    if (this.f27540h) {
                        this.f27538f = null;
                        this.f27537e = 1;
                        if (interfaceC7117d.mo1339r(c7794b, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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

        /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$12$2, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lni/b;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$12$2", m19206f = "LessonViewModel.kt", m19207l = {672}, m19208m = "invokeSuspend")
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC2056p<C7794b, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public int f27541e;

            /* JADX INFO: renamed from: f */
            public /* synthetic */ Object f27542f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ LessonViewModel f27543g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(LessonViewModel lessonViewModel, InterfaceC9968c<? super AnonymousClass2> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f27543g = lessonViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f27543g, interfaceC9968c);
                anonymousClass2.f27542f = obj;
                return anonymousClass2;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(C7794b c7794b, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass2) mo1336a(c7794b, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f27541e;
                if (i10 == 0) {
                    C7499b.m14977z0(obj);
                    C7794b c7794b = (C7794b) this.f27542f;
                    C7138s c7138s = this.f27543g.f27502p1;
                    this.f27541e = 1;
                    if (c7138s.mo1339r(c7794b, this) == coroutineSingletons) {
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

        public C423012(InterfaceC9968c<? super C423012> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return LessonViewModel.this.new C423012(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C423012) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f27535e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                LessonViewModel lessonViewModel = LessonViewModel.this;
                FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(C0062b.m385q0(lessonViewModel.mo9325w1(), lessonViewModel.f27500o1, new AnonymousClass1(null)));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(lessonViewModel, null);
                this.f27535e = 1;
                if (C0062b.m369m0(flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1, anonymousClass2, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$13 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$13", m19206f = "LessonViewModel.kt", m19207l = {681}, m19208m = "invokeSuspend")
    final class C423113 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f27544e;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$13$2, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$13$2", m19206f = "LessonViewModel.kt", m19207l = {684}, m19208m = "invokeSuspend")
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC2056p<List<? extends String>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public int f27546e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ LessonViewModel f27547f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(LessonViewModel lessonViewModel, InterfaceC9968c<? super AnonymousClass2> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f27547f = lessonViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass2(this.f27547f, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(List<? extends String> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass2) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f27546e;
                if (i10 == 0) {
                    C7499b.m14977z0(obj);
                    this.f27546e = 1;
                    if (C7828f.m15567a(1000L, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(obj);
                }
                LessonViewModel lessonViewModel = this.f27547f;
                lessonViewModel.getClass();
                lessonViewModel.f27454Z0.setValue(Resource.Status.LOADING);
                C4924a.m10450b(lessonViewModel.f27440U1);
                lessonViewModel.f27440U1 = C7828f.m15570d(C8573r0.m16767w0(lessonViewModel), lessonViewModel.f27423P, null, new LessonViewModel$fetchLesson$1(lessonViewModel, null, true), 2);
                return C9072e.f47360a;
            }
        }

        public C423113(InterfaceC9968c<? super C423113> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return LessonViewModel.this.new C423113(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C423113) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f27544e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                LessonViewModel lessonViewModel = LessonViewModel.this;
                final InterfaceC7142w<List<String>> interfaceC7142wMo500P = lessonViewModel.mo500P();
                InterfaceC7116c interfaceC7116cM273H0 = C0062b.m273H0(new C7122i(new InterfaceC7116c<List<? extends String>>() { // from class: com.lingq.ui.lesson.LessonViewModel$13$invokeSuspend$$inlined$filterNot$1

                    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$13$invokeSuspend$$inlined$filterNot$1$2 */
                    public static final class C42322<T> implements InterfaceC7117d {

                        /* JADX INFO: renamed from: a */
                        public final /* synthetic */ InterfaceC7117d f27549a;

                        /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$13$invokeSuspend$$inlined$filterNot$1$2$1, reason: invalid class name */
                        @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$13$invokeSuspend$$inlined$filterNot$1$2", m19206f = "LessonViewModel.kt", m19207l = {223}, m19208m = "emit")
                        public static final class AnonymousClass1 extends ContinuationImpl {

                            /* JADX INFO: renamed from: d */
                            public /* synthetic */ Object f27550d;

                            /* JADX INFO: renamed from: e */
                            public int f27551e;

                            public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                                super(interfaceC9968c);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            /* JADX INFO: renamed from: x */
                            public final Object mo1338x(Object obj) {
                                this.f27550d = obj;
                                this.f27551e |= Integer.MIN_VALUE;
                                return C42322.this.mo1339r(null, this);
                            }
                        }

                        public C42322(InterfaceC7117d interfaceC7117d) {
                            this.f27549a = interfaceC7117d;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0016  */
                        @Override // kotlinx.coroutines.flow.InterfaceC7117d
                        /* JADX INFO: renamed from: r */
                        public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                            AnonymousClass1 anonymousClass1;
                            if (interfaceC9968c instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                                int i10 = anonymousClass1.f27551e;
                                if ((i10 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.f27551e = i10 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                            }
                            Object obj2 = anonymousClass1.f27550d;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i11 = anonymousClass1.f27551e;
                            if (i11 == 0) {
                                C7499b.m14977z0(obj2);
                                if (!((List) obj).isEmpty()) {
                                    anonymousClass1.f27551e = 1;
                                    if (this.f27549a.mo1339r(obj, anonymousClass1) == coroutineSingletons) {
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
                        Object objMo9539a = interfaceC7142wMo500P.mo9539a(new C42322(interfaceC7117d), interfaceC9968c);
                        return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
                    }
                }));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(lessonViewModel, null);
                this.f27544e = 1;
                if (C0062b.m369m0(interfaceC7116cM273H0, anonymousClass2, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$14 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$14", m19206f = "LessonViewModel.kt", m19207l = {690, 692}, m19208m = "invokeSuspend")
    final class C423314 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f27553e;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$14$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "", "hasTTS", "Lcom/lingq/shared/uimodel/lesson/LessonStudy;", "lesson", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$14$1", m19206f = "LessonViewModel.kt", m19207l = {691}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2058r<InterfaceC7117d<? super Boolean>, Integer, LessonStudy, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public int f27555e;

            /* JADX INFO: renamed from: f */
            public /* synthetic */ InterfaceC7117d f27556f;

            /* JADX INFO: renamed from: g */
            public /* synthetic */ int f27557g;

            /* JADX INFO: renamed from: h */
            public /* synthetic */ LessonStudy f27558h;

            public AnonymousClass1(InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(4, interfaceC9968c);
            }

            @Override // cm.InterfaceC2058r
            /* JADX INFO: renamed from: T */
            public final Object mo1851T(InterfaceC7117d<? super Boolean> interfaceC7117d, Integer num, LessonStudy lessonStudy, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                int iIntValue = num.intValue();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                anonymousClass1.f27556f = interfaceC7117d;
                anonymousClass1.f27557g = iIntValue;
                anonymousClass1.f27558h = lessonStudy;
                return anonymousClass1.mo1338x(C9072e.f47360a);
            }

            /* JADX WARN: Code duplicated, block: B:18:0x0039  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                boolean z10;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f27555e;
                if (i10 == 0) {
                    C7499b.m14977z0(obj);
                    InterfaceC7117d interfaceC7117d = this.f27556f;
                    int i11 = this.f27557g;
                    LessonStudy lessonStudy = this.f27558h;
                    if (i11 > 0) {
                        z10 = true;
                    } else {
                        if ((lessonStudy != null ? lessonStudy.f21820f : null) != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    }
                    Boolean boolValueOf = Boolean.valueOf(z10);
                    this.f27556f = null;
                    this.f27555e = 1;
                    if (interfaceC7117d.mo1339r(boolValueOf, this) == coroutineSingletons) {
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

        /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$14$2, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$14$2", m19206f = "LessonViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ boolean f27559e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ LessonViewModel f27560f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(LessonViewModel lessonViewModel, InterfaceC9968c<? super AnonymousClass2> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f27560f = lessonViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f27560f, interfaceC9968c);
                anonymousClass2.f27559e = ((Boolean) obj).booleanValue();
                return anonymousClass2;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass2) mo1336a(Boolean.valueOf(bool.booleanValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                this.f27560f.f27449X1.setValue(Boolean.valueOf(this.f27559e));
                return C9072e.f47360a;
            }
        }

        public C423314(InterfaceC9968c<? super C423314> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return LessonViewModel.this.new C423314(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C423314) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f27553e;
            LessonViewModel lessonViewModel = LessonViewModel.this;
            if (i10 != 0) {
                if (i10 == 1) {
                    C7499b.m14977z0(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(obj);
                }
            }
            C7499b.m14977z0(obj);
            InterfaceC2024q interfaceC2024q = lessonViewModel.f27483i;
            String strMo498E1 = lessonViewModel.mo498E1();
            this.f27553e = 1;
            obj = interfaceC2024q.mo6170a(strMo498E1);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            C7136q c7136qM385q0 = C0062b.m385q0((InterfaceC7116c) obj, lessonViewModel.f27515w0, new AnonymousClass1(null));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(lessonViewModel, null);
            this.f27553e = 2;
            return C0062b.m369m0(c7136qM385q0, anonymousClass2, this) == coroutineSingletons ? coroutineSingletons : C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$15 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$15", m19206f = "LessonViewModel.kt", m19207l = {698, 698}, m19208m = "invokeSuspend")
    final class C423415 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f27561e;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$15$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "hasTTS", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$15$1", m19206f = "LessonViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Integer, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ int f27563e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ LessonViewModel f27564f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LessonViewModel lessonViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f27564f = lessonViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f27564f, interfaceC9968c);
                anonymousClass1.f27563e = ((Number) obj).intValue();
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
                this.f27564f.f27452Y1.setValue(Boolean.valueOf(this.f27563e > 0));
                return C9072e.f47360a;
            }
        }

        public C423415(InterfaceC9968c<? super C423415> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return LessonViewModel.this.new C423415(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C423415) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f27561e;
            LessonViewModel lessonViewModel = LessonViewModel.this;
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
            InterfaceC2024q interfaceC2024q = lessonViewModel.f27483i;
            String strMo498E1 = lessonViewModel.mo498E1();
            this.f27561e = 1;
            obj = interfaceC2024q.mo6170a(strMo498E1);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(lessonViewModel, null);
            this.f27561e = 2;
            if (C0062b.m369m0((InterfaceC7116c) obj, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$16 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$16", m19206f = "LessonViewModel.kt", m19207l = {704}, m19208m = "invokeSuspend")
    final class C423516 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f27565e;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$16$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$16$1", m19206f = "LessonViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ boolean f27567e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ LessonViewModel f27568f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LessonViewModel lessonViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f27568f = lessonViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f27568f, interfaceC9968c);
                anonymousClass1.f27567e = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(Boolean.valueOf(bool.booleanValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                this.f27568f.f27468d2.setValue(Boolean.valueOf(this.f27567e));
                return C9072e.f47360a;
            }
        }

        public C423516(InterfaceC9968c<? super C423516> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return LessonViewModel.this.new C423516(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C423516) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f27565e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                LessonViewModel lessonViewModel = LessonViewModel.this;
                InterfaceC7116c interfaceC7116cM273H0 = C0062b.m273H0(lessonViewModel.f27492l.mo9563J());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(lessonViewModel, null);
                this.f27565e = 1;
                if (C0062b.m369m0(interfaceC7116cM273H0, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$2 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$2", m19206f = "LessonViewModel.kt", m19207l = {554}, m19208m = "invokeSuspend")
    final class C42362 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f27569e;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$2$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@"}, m13365d2 = {"", "", "Lcom/lingq/shared/uimodel/lesson/LessonStudyBookmark;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$2$1", m19206f = "LessonViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Map<Integer, ? extends LessonStudyBookmark>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f27571e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ LessonViewModel f27572f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LessonViewModel lessonViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f27572f = lessonViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f27572f, interfaceC9968c);
                anonymousClass1.f27571e = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Map<Integer, ? extends LessonStudyBookmark> map, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(map, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                Map map = (Map) this.f27571e;
                LessonViewModel lessonViewModel = this.f27572f;
                lessonViewModel.f27421O0.setValue(map.get(new Integer(lessonViewModel.m10152y2())));
                return C9072e.f47360a;
            }
        }

        public C42362(InterfaceC9968c<? super C42362> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return LessonViewModel.this.new C42362(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C42362) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f27569e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                LessonViewModel lessonViewModel = LessonViewModel.this;
                InterfaceC7116c interfaceC7116cM273H0 = C0062b.m273H0(lessonViewModel.f27402I.mo9689m());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(lessonViewModel, null);
                this.f27569e = 1;
                if (C0062b.m369m0(interfaceC7116cM273H0, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$3 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$3", m19206f = "LessonViewModel.kt", m19207l = {560}, m19208m = "invokeSuspend")
    final class C42373 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f27573e;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$3$2, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@"}, m13365d2 = {"", "", "Lhi/e;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$3$2", m19206f = "LessonViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC2056p<Map<String, ? extends C6054e>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f27575e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ LessonViewModel f27576f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(LessonViewModel lessonViewModel, InterfaceC9968c<? super AnonymousClass2> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f27576f = lessonViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f27576f, interfaceC9968c);
                anonymousClass2.f27575e = obj;
                return anonymousClass2;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Map<String, ? extends C6054e> map, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass2) mo1336a(map, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                Map map = (Map) this.f27575e;
                LessonViewModel lessonViewModel = this.f27576f;
                lessonViewModel.getClass();
                C7828f.m15570d(C8573r0.m16767w0(lessonViewModel), null, null, new LessonViewModel$checkCompletedPages$1(lessonViewModel, map, null), 3);
                return C9072e.f47360a;
            }
        }

        public C42373(InterfaceC9968c<? super C42373> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return LessonViewModel.this.new C42373(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C42373) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f27573e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                LessonViewModel lessonViewModel = LessonViewModel.this;
                final C7135p c7135p = lessonViewModel.f27436T0;
                InterfaceC7116c<Map<String, ? extends C6054e>> interfaceC7116c = new InterfaceC7116c<Map<String, ? extends C6054e>>() { // from class: com.lingq.ui.lesson.LessonViewModel$3$invokeSuspend$$inlined$filterNot$1

                    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$3$invokeSuspend$$inlined$filterNot$1$2 */
                    public static final class C42382<T> implements InterfaceC7117d {

                        /* JADX INFO: renamed from: a */
                        public final /* synthetic */ InterfaceC7117d f27578a;

                        /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$3$invokeSuspend$$inlined$filterNot$1$2$1, reason: invalid class name */
                        @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$3$invokeSuspend$$inlined$filterNot$1$2", m19206f = "LessonViewModel.kt", m19207l = {223}, m19208m = "emit")
                        public static final class AnonymousClass1 extends ContinuationImpl {

                            /* JADX INFO: renamed from: d */
                            public /* synthetic */ Object f27579d;

                            /* JADX INFO: renamed from: e */
                            public int f27580e;

                            public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                                super(interfaceC9968c);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            /* JADX INFO: renamed from: x */
                            public final Object mo1338x(Object obj) {
                                this.f27579d = obj;
                                this.f27580e |= Integer.MIN_VALUE;
                                return C42382.this.mo1339r(null, this);
                            }
                        }

                        public C42382(InterfaceC7117d interfaceC7117d) {
                            this.f27578a = interfaceC7117d;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0018  */
                        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                        @Override // kotlinx.coroutines.flow.InterfaceC7117d
                        /* JADX INFO: renamed from: r */
                        public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                            AnonymousClass1 anonymousClass1;
                            if (interfaceC9968c instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                                int i10 = anonymousClass1.f27580e;
                                if ((i10 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.f27580e = i10 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                            }
                            Object obj2 = anonymousClass1.f27579d;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i11 = anonymousClass1.f27580e;
                            if (i11 == 0) {
                                C7499b.m14977z0(obj2);
                                if (!((Map) obj).isEmpty()) {
                                    anonymousClass1.f27580e = 1;
                                    if (this.f27578a.mo1339r(obj, anonymousClass1) == coroutineSingletons) {
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
                    public final Object mo9539a(InterfaceC7117d<? super Map<String, ? extends C6054e>> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                        Object objMo9539a = c7135p.mo9539a(new C42382(interfaceC7117d), interfaceC9968c);
                        return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
                    }
                };
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(lessonViewModel, null);
                this.f27573e = 1;
                if (C0062b.m369m0(interfaceC7116c, anonymousClass2, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$4 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$4", m19206f = "LessonViewModel.kt", m19207l = {566}, m19208m = "invokeSuspend")
    final class C42394 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f27582e;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$4$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/UserLanguage;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$4$1", m19206f = "LessonViewModel.kt", m19207l = {569}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<UserLanguage, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public int f27584e;

            /* JADX INFO: renamed from: f */
            public /* synthetic */ Object f27585f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ LessonViewModel f27586g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LessonViewModel lessonViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f27586g = lessonViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f27586g, interfaceC9968c);
                anonymousClass1.f27585f = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(UserLanguage userLanguage, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(userLanguage, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            /* JADX WARN: Code duplicated, block: B:19:0x004f  */
            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f27584e;
                if (i10 == 0) {
                    C7499b.m14977z0(obj);
                    UserLanguage userLanguage = (UserLanguage) this.f27585f;
                    if (userLanguage != null) {
                        LessonViewModel lessonViewModel = this.f27586g;
                        if (!C7661i.m15250P2(lessonViewModel.f27466d0.f35771e)) {
                            C6061g c6061g = lessonViewModel.f27466d0;
                            if (C5207g.m11106a(userLanguage.f21726a, c6061g.f35771e)) {
                                boolean z10 = !lessonViewModel.m10151x2();
                                C4924a.m10450b(lessonViewModel.f27440U1);
                                InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(lessonViewModel);
                                LessonViewModel$fetchLesson$1 lessonViewModel$fetchLesson$1 = new LessonViewModel$fetchLesson$1(lessonViewModel, null, z10);
                                CoroutineDispatcher coroutineDispatcher = lessonViewModel.f27423P;
                                lessonViewModel.f27440U1 = C7828f.m15570d(interfaceC7882zM16767w0, coroutineDispatcher, null, lessonViewModel$fetchLesson$1, 2);
                                InterfaceC7882z interfaceC7882zM16767w1 = C8573r0.m16767w0(lessonViewModel);
                                LessonViewModel$getStreak$1 lessonViewModel$getStreak$1 = new LessonViewModel$getStreak$1(lessonViewModel, null);
                                CoroutineJobManager coroutineJobManager = lessonViewModel.f27426Q;
                                C7499b.m14933c0(interfaceC7882zM16767w1, coroutineJobManager, coroutineDispatcher, "streak", lessonViewModel$getStreak$1);
                                C7499b.m14933c0(C8573r0.m16767w0(lessonViewModel), coroutineJobManager, coroutineDispatcher, "update streak", new LessonViewModel$updateStreak$1(lessonViewModel, null));
                            } else {
                                this.f27584e = 1;
                                if (lessonViewModel.mo501d(c6061g.f35771e, this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                        } else {
                            boolean z11 = !lessonViewModel.m10151x2();
                            C4924a.m10450b(lessonViewModel.f27440U1);
                            InterfaceC7882z interfaceC7882zM16767w2 = C8573r0.m16767w0(lessonViewModel);
                            LessonViewModel$fetchLesson$1 lessonViewModel$fetchLesson$2 = new LessonViewModel$fetchLesson$1(lessonViewModel, null, z11);
                            CoroutineDispatcher coroutineDispatcher2 = lessonViewModel.f27423P;
                            lessonViewModel.f27440U1 = C7828f.m15570d(interfaceC7882zM16767w2, coroutineDispatcher2, null, lessonViewModel$fetchLesson$2, 2);
                            InterfaceC7882z interfaceC7882zM16767w3 = C8573r0.m16767w0(lessonViewModel);
                            LessonViewModel$getStreak$1 lessonViewModel$getStreak$2 = new LessonViewModel$getStreak$1(lessonViewModel, null);
                            CoroutineJobManager coroutineJobManager2 = lessonViewModel.f27426Q;
                            C7499b.m14933c0(interfaceC7882zM16767w3, coroutineJobManager2, coroutineDispatcher2, "streak", lessonViewModel$getStreak$2);
                            C7499b.m14933c0(C8573r0.m16767w0(lessonViewModel), coroutineJobManager2, coroutineDispatcher2, "update streak", new LessonViewModel$updateStreak$1(lessonViewModel, null));
                        }
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

        public C42394(InterfaceC9968c<? super C42394> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return LessonViewModel.this.new C42394(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C42394) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f27582e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                LessonViewModel lessonViewModel = LessonViewModel.this;
                InterfaceC7142w<UserLanguage> interfaceC7142wMo509w0 = lessonViewModel.mo509w0();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(lessonViewModel, null);
                this.f27582e = 1;
                if (C0062b.m369m0(interfaceC7142wMo509w0, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$5 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$5", m19206f = "LessonViewModel.kt", m19207l = {580}, m19208m = "invokeSuspend")
    final class C42405 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f27587e;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$5$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/lesson/LessonStudy;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$5$1", m19206f = "LessonViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<LessonStudy, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f27589e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ LessonViewModel f27590f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LessonViewModel lessonViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f27590f = lessonViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f27590f, interfaceC9968c);
                anonymousClass1.f27589e = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(LessonStudy lessonStudy, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(lessonStudy, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                String str;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                LessonStudy lessonStudy = (LessonStudy) this.f27589e;
                if (lessonStudy != null) {
                    LessonViewModel lessonViewModel = this.f27590f;
                    if (lessonViewModel.f27446W1 && !lessonViewModel.m10151x2()) {
                        C6704a c6704a = lessonViewModel.f27405J;
                        c6704a.f37891b.edit().putInt("lessonsOpened", c6704a.f37891b.getInt("lessonsOpened", 0) + 1).apply();
                        Bundle bundle = new Bundle();
                        bundle.putString("Lesson ID", String.valueOf(lessonStudy.f21815a));
                        bundle.putString("Lesson language", lessonViewModel.mo498E1());
                        bundle.putString("Lesson name", lessonStudy.f21816b);
                        bundle.putString("Lesson level", lessonStudy.f21832r);
                        bundle.putString("Shared By", lessonStudy.f21837w);
                        bundle.putString("Collection", lessonStudy.f21823i);
                        C6061g c6061g = lessonViewModel.f27466d0;
                        LessonPath lessonPath = c6061g.f35772f;
                        String str2 = "";
                        if (lessonPath instanceof LessonPath.URL) {
                            str = ((LessonPath.URL) lessonPath).f22165a;
                        } else if (lessonPath instanceof LessonPath.Feed) {
                            str = "Library Feed";
                        } else if ((lessonPath instanceof LessonPath.SearchShelf) || (lessonPath instanceof LessonPath.Search)) {
                            str = "Library Search";
                        } else if (lessonPath instanceof LessonPath.Playlist) {
                            str = "Playlist";
                        } else if (lessonPath instanceof LessonPath.LessonComplete) {
                            str = "Lesson Complete";
                        } else if (lessonPath instanceof LessonPath.LessonInfo) {
                            str = "Lesson Info";
                        } else {
                            str = lessonPath instanceof LessonPath.Deeplink ? "Deeplink" : "";
                        }
                        bundle.putString("Path 1", str);
                        LessonPath lessonPath2 = c6061g.f35772f;
                        if (lessonPath2 instanceof LessonPath.URL) {
                            str2 = ((LessonPath.URL) lessonPath2).f22166b;
                        } else if (lessonPath2 instanceof LessonPath.Feed) {
                            str2 = ((LessonPath.Feed) lessonPath2).f22159a;
                        } else if (lessonPath2 instanceof LessonPath.SearchShelf) {
                            str2 = ((LessonPath.SearchShelf) lessonPath2).f22164a;
                        } else if (lessonPath2 instanceof LessonPath.LessonComplete) {
                            str2 = "Next Lesson";
                        } else if (lessonPath2 instanceof LessonPath.Search) {
                            str2 = "Library";
                        }
                        bundle.putString("Path 2", str2);
                        lessonViewModel.f27414M.m15505b(bundle, "open_lesson");
                        lessonViewModel.f27446W1 = false;
                    }
                    lessonViewModel.f27388B1.setValue(Boolean.TRUE);
                    C7828f.m15570d(C8573r0.m16767w0(lessonViewModel), lessonViewModel.f27423P, null, new LessonViewModel$fetchLessonSentences$1(lessonViewModel, null), 2);
                }
                return C9072e.f47360a;
            }
        }

        public C42405(InterfaceC9968c<? super C42405> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return LessonViewModel.this.new C42405(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C42405) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f27587e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                LessonViewModel lessonViewModel = LessonViewModel.this;
                StateFlowImpl stateFlowImpl = lessonViewModel.f27515w0;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(lessonViewModel, null);
                this.f27587e = 1;
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

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$6 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$6", m19206f = "LessonViewModel.kt", m19207l = {612}, m19208m = "invokeSuspend")
    final class C42416 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f27591e;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$6$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$6$1", m19206f = "LessonViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ LessonViewModel f27593e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LessonViewModel lessonViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f27593e = lessonViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f27593e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(Boolean.valueOf(bool.booleanValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                LessonViewModel lessonViewModel = this.f27593e;
                LessonStudy lessonStudy = (LessonStudy) lessonViewModel.f27515w0.getValue();
                if (lessonStudy != null) {
                    String str = lessonStudy.f21820f;
                    boolean z10 = false;
                    if (str != null) {
                        if (str.length() > 0) {
                            z10 = true;
                        }
                    }
                    String str2 = "";
                    if (!z10) {
                        str = str2;
                    }
                    if (str != null) {
                        str2 = str;
                    }
                    InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(lessonViewModel);
                    StringBuilder sb2 = new StringBuilder("observe download ");
                    int i10 = lessonStudy.f21815a;
                    sb2.append(i10);
                    C7499b.m14933c0(interfaceC7882zM16767w0, lessonViewModel.f27426Q, lessonViewModel.f27423P, sb2.toString(), new LessonViewModel$observeLessonDownload$1(lessonViewModel, i10, null));
                    C7828f.m15570d(C8573r0.m16767w0(lessonViewModel), null, null, new LessonViewModel$setupPlayerForLesson$1(lessonViewModel, lessonStudy, str2, null), 3);
                }
                return C9072e.f47360a;
            }
        }

        public C42416(InterfaceC9968c<? super C42416> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return LessonViewModel.this.new C42416(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C42416) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f27591e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                LessonViewModel lessonViewModel = LessonViewModel.this;
                StateFlowImpl stateFlowImpl = lessonViewModel.f27388B1;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(lessonViewModel, null);
                this.f27591e = 1;
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

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$7 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$7", m19206f = "LessonViewModel.kt", m19207l = {618}, m19208m = "invokeSuspend")
    final class C42427 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f27594e;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$7$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lkotlin/Pair;", "", "", "sentencesData", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$7$1", m19206f = "LessonViewModel.kt", m19207l = {620}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<List<? extends Pair<? extends String, ? extends Integer>>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public int f27596e;

            /* JADX INFO: renamed from: f */
            public /* synthetic */ Object f27597f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ LessonViewModel f27598g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LessonViewModel lessonViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f27598g = lessonViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f27598g, interfaceC9968c);
                anonymousClass1.f27597f = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(List<? extends Pair<? extends String, ? extends Integer>> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f27596e;
                if (i10 == 0) {
                    C7499b.m14977z0(obj);
                    List<Pair<String, Integer>> list = (List) this.f27597f;
                    if (!list.isEmpty()) {
                        LessonViewModel lessonViewModel = this.f27598g;
                        String strMo498E1 = lessonViewModel.mo498E1();
                        int iM10152y2 = this.f27598g.m10152y2();
                        this.f27596e = 1;
                        if (lessonViewModel.mo9407X1(strMo498E1, list, iM10152y2, false, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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

        public C42427(InterfaceC9968c<? super C42427> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return LessonViewModel.this.new C42427(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C42427) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f27594e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                LessonViewModel lessonViewModel = LessonViewModel.this;
                C7135p c7135p = lessonViewModel.f27386A1;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(lessonViewModel, null);
                this.f27594e = 1;
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

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$8 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$8", m19206f = "LessonViewModel.kt", m19207l = {631}, m19208m = "invokeSuspend")
    final class C42438 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f27599e;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$8$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/ui/token/TokenData;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$8$1", m19206f = "LessonViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<TokenData, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f27601e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ LessonViewModel f27602f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LessonViewModel lessonViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f27602f = lessonViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f27602f, interfaceC9968c);
                anonymousClass1.f27601e = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(TokenData tokenData, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(tokenData, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                if (((TokenData) this.f27601e).f31176b == TokenType.WordType) {
                    LessonViewModel lessonViewModel = this.f27602f;
                    LessonStudy lessonStudy = (LessonStudy) lessonViewModel.f27515w0.getValue();
                    if (lessonStudy != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("Lesson ID", String.valueOf(lessonStudy.f21815a));
                        bundle.putString("Lesson name", lessonStudy.f21816b);
                        bundle.putString("Lesson language", lessonViewModel.mo498E1());
                        bundle.putString("Lesson level", lessonStudy.f21832r);
                        lessonViewModel.f27414M.m15505b(bundle, "open_blue_popup");
                    }
                }
                return C9072e.f47360a;
            }
        }

        public C42438(InterfaceC9968c<? super C42438> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return LessonViewModel.this.new C42438(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C42438) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f27599e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                LessonViewModel lessonViewModel = LessonViewModel.this;
                InterfaceC7137r<TokenData> interfaceC7137rMo10039Y = lessonViewModel.mo10039Y();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(lessonViewModel, null);
                this.f27599e = 1;
                if (C0062b.m369m0(interfaceC7137rMo10039Y, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$9 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$9", m19206f = "LessonViewModel.kt", m19207l = {647}, m19208m = "invokeSuspend")
    final class C42449 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f27603e;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$9$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$9$1", m19206f = "LessonViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ boolean f27605e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ LessonViewModel f27606f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LessonViewModel lessonViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f27606f = lessonViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f27606f, interfaceC9968c);
                anonymousClass1.f27605e = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(Boolean.valueOf(bool.booleanValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                if (this.f27605e) {
                    this.f27606f.f27414M.m15505b(null, "sentence_mode_on");
                }
                return C9072e.f47360a;
            }
        }

        public C42449(InterfaceC9968c<? super C42449> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return LessonViewModel.this.new C42449(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C42449) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f27603e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                LessonViewModel lessonViewModel = LessonViewModel.this;
                StateFlowImpl stateFlowImpl = lessonViewModel.f27474f0;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(lessonViewModel, null);
                this.f27603e = 1;
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

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$a */
    public /* synthetic */ class C4245a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f27609a;

        static {
            int[] iArr = new int[ReviewType.values().length];
            try {
                iArr[ReviewType.Page.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReviewType.SrsDue.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReviewType.All.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReviewType.Integrated.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f27609a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0768  */
    public LessonViewModel(InterfaceC3324a interfaceC3324a, InterfaceC2019l interfaceC2019l, InterfaceC2008a interfaceC2008a, InterfaceC2026s interfaceC2026s, InterfaceC2013f interfaceC2013f, InterfaceC2024q interfaceC2024q, InterfaceC2014g interfaceC2014g, InterfaceC2016i interfaceC2016i, InterfaceC5179a interfaceC5179a, InterfaceC5180b interfaceC5180b, InterfaceC5182d interfaceC5182d, C6704a c6704a, InterfaceC3275c interfaceC3275c, PlayerController playerController, C7796d c7796d, C4955q c4955q, CoroutineDispatcher coroutineDispatcher, ExecutorC7177a executorC7177a, CoroutineJobManager coroutineJobManager, InterfaceC7882z interfaceC7882z, InterfaceC0113j interfaceC0113j, InterfaceC4865b interfaceC4865b, InterfaceC3301f interfaceC3301f, InterfaceC9013i interfaceC9013i, InterfaceC9010f interfaceC9010f, InterfaceC9527a interfaceC9527a, InterfaceC7367d interfaceC7367d, InterfaceC7366c interfaceC7366c, InterfaceC6515k interfaceC6515k, InterfaceC4912b interfaceC4912b, InterfaceC7364a interfaceC7364a, C1024c0 c1024c0) {
        Integer num;
        String str;
        Boolean bool;
        LessonPath lessonPath;
        C5207g.m11111f(interfaceC3324a, "lessonRepository");
        C5207g.m11111f(interfaceC2019l, "playlistRepository");
        C5207g.m11111f(interfaceC2008a, "cardRepository");
        C5207g.m11111f(interfaceC2026s, "wordRepository");
        C5207g.m11111f(interfaceC2013f, "languageStatsRepository");
        C5207g.m11111f(interfaceC2024q, "ttsRepository");
        C5207g.m11111f(interfaceC2014g, "libraryRepository");
        C5207g.m11111f(interfaceC2016i, "milestoneRepository");
        C5207g.m11111f(interfaceC5179a, "preferenceStore");
        C5207g.m11111f(interfaceC5180b, "profileStore");
        C5207g.m11111f(interfaceC5182d, "utilStore");
        C5207g.m11111f(c6704a, "appSettings");
        C5207g.m11111f(interfaceC3275c, "ttsController");
        C5207g.m11111f(playerController, "playerController");
        C5207g.m11111f(c7796d, "analytics");
        C5207g.m11111f(c4955q, "moshi");
        C5207g.m11111f(interfaceC7882z, "applicationScope");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(interfaceC4865b, "tokenControllerDelegate");
        C5207g.m11111f(interfaceC3301f, "playerViewModelDelegate");
        C5207g.m11111f(interfaceC9013i, "stopPlayerServiceController");
        C5207g.m11111f(interfaceC9010f, "playerSentenceModeViewModelDelegate");
        C5207g.m11111f(interfaceC9527a, "downloadManagerDelegate");
        C5207g.m11111f(interfaceC7367d, "milestonesControllerDelegate");
        C5207g.m11111f(interfaceC7366c, "milestonesController");
        C5207g.m11111f(interfaceC6515k, "upgradePopupDelegate");
        C5207g.m11111f(interfaceC4912b, "tooltipsController");
        C5207g.m11111f(interfaceC7364a, "appUsageController");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f27465d = interfaceC3324a;
        this.f27469e = interfaceC2019l;
        this.f27473f = interfaceC2008a;
        this.f27477g = interfaceC2026s;
        this.f27480h = interfaceC2013f;
        this.f27483i = interfaceC2024q;
        this.f27486j = interfaceC2014g;
        this.f27489k = interfaceC2016i;
        this.f27492l = interfaceC5179a;
        this.f27399H = interfaceC5180b;
        this.f27402I = interfaceC5182d;
        this.f27405J = c6704a;
        this.f27408K = interfaceC3275c;
        this.f27411L = playerController;
        this.f27414M = c7796d;
        this.f27417N = c4955q;
        this.f27420O = coroutineDispatcher;
        this.f27423P = executorC7177a;
        this.f27426Q = coroutineJobManager;
        this.f27429R = interfaceC7882z;
        this.f27432S = interfaceC0113j;
        this.f27435T = interfaceC4865b;
        this.f27438U = interfaceC3301f;
        this.f27441V = interfaceC9013i;
        this.f27444W = interfaceC9010f;
        this.f27447X = interfaceC9527a;
        this.f27450Y = interfaceC7367d;
        this.f27453Z = interfaceC7366c;
        this.f27456a0 = interfaceC6515k;
        this.f27459b0 = interfaceC4912b;
        this.f27462c0 = interfaceC7364a;
        LinkedHashMap linkedHashMap = c1024c0.f6616a;
        if (!linkedHashMap.containsKey("lessonId")) {
            throw new IllegalArgumentException("Required argument \"lessonId\" is missing and does not have an android:defaultValue");
        }
        Integer num2 = (Integer) c1024c0.m3929b("lessonId");
        if (num2 == null) {
            throw new IllegalArgumentException("Argument \"lessonId\" of type integer does not support null values");
        }
        if (linkedHashMap.containsKey("courseId")) {
            num = (Integer) c1024c0.m3929b("courseId");
            if (num == null) {
                throw new IllegalArgumentException("Argument \"courseId\" of type integer does not support null values");
            }
        } else {
            num = -1;
        }
        String str2 = "";
        if (linkedHashMap.containsKey("courseTitle")) {
            str = (String) c1024c0.m3929b("courseTitle");
            if (str == null) {
                throw new IllegalArgumentException("Argument \"courseTitle\" is marked as non-null but was passed a null value");
            }
        } else {
            str = "";
        }
        if (linkedHashMap.containsKey("isSentenceMode")) {
            bool = (Boolean) c1024c0.m3929b("isSentenceMode");
            if (bool == null) {
                throw new IllegalArgumentException("Argument \"isSentenceMode\" of type boolean does not support null values");
            }
        } else {
            bool = Boolean.FALSE;
        }
        if (linkedHashMap.containsKey("lessonLanguageFromDeeplink") && (str2 = (String) c1024c0.m3929b("lessonLanguageFromDeeplink")) == null) {
            throw new IllegalArgumentException("Argument \"lessonLanguageFromDeeplink\" is marked as non-null but was passed a null value");
        }
        if (!linkedHashMap.containsKey("lessonPath")) {
            lessonPath = null;
        } else {
            if (!Parcelable.class.isAssignableFrom(LessonPath.class) && !Serializable.class.isAssignableFrom(LessonPath.class)) {
                throw new UnsupportedOperationException(LessonPath.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            lessonPath = (LessonPath) c1024c0.m3929b("lessonPath");
        }
        int iIntValue = num2.intValue();
        int iIntValue2 = num.intValue();
        boolean zBooleanValue = bool.booleanValue();
        this.f27466d0 = new C6061g(iIntValue, iIntValue2, str, zBooleanValue, str2, lessonPath);
        this.f27470e0 = C7120g.m14379a(Integer.valueOf(iIntValue));
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(Boolean.valueOf(zBooleanValue));
        this.f27474f0 = stateFlowImplM14379a;
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        Boolean bool2 = Boolean.FALSE;
        C0062b.m353h2(stateFlowImplM14379a, interfaceC7882zM16767w0, startedWhileSubscribed, bool2);
        StateFlowImpl stateFlowImplM14379a2 = C7120g.m14379a(-1);
        this.f27478g0 = stateFlowImplM14379a2;
        this.f27481h0 = C0062b.m353h2(stateFlowImplM14379a2, C8573r0.m16767w0(this), startedWhileSubscribed, -1);
        this.f27484i0 = C7120g.m14379a(-1);
        this.f27487j0 = C7120g.m14379a(bool2);
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f27490k0 = c7138sM10448a;
        this.f27493l0 = C0062b.m341d2(c7138sM10448a, C8573r0.m16767w0(this), startedWhileSubscribed);
        this.f27495m0 = Locale.forLanguageTag(mo498E1());
        String string = new DateTime().toString();
        C5207g.m11110e(string, "now().toString()");
        this.f27497n0 = string;
        StateFlowImpl stateFlowImplM14379a3 = C7120g.m14379a(null);
        this.f27499o0 = stateFlowImplM14379a3;
        this.f27501p0 = C0062b.m353h2(stateFlowImplM14379a3, C8573r0.m16767w0(this), startedWhileSubscribed, null);
        this.f27503q0 = C0062b.m353h2(C0062b.m399t2(C0062b.m273H0(interfaceC5179a.mo9580a()), new LessonViewModel$moveToKnown$1(null)), C8573r0.m16767w0(this), startedWhileSubscribed, bool2);
        this.f27505r0 = C7120g.m14379a(bool2);
        C7135p c7135pM353h2 = C0062b.m353h2(C0062b.m273H0(interfaceC5179a.mo9565L()), C8573r0.m16767w0(this), startedWhileSubscribed, "Off");
        this.f27507s0 = c7135pM353h2;
        C7135p c7135pM353h3 = C0062b.m353h2(C0062b.m273H0(interfaceC5179a.mo9586d()), C8573r0.m16767w0(this), startedWhileSubscribed, "Off");
        this.f27509t0 = c7135pM353h3;
        C7135p c7135pM353h4 = C0062b.m353h2(C0062b.m273H0(interfaceC5179a.mo9591f0()), C8573r0.m16767w0(this), startedWhileSubscribed, "Off");
        this.f27511u0 = c7135pM353h4;
        C7135p c7135pM353h5 = C0062b.m353h2(C0062b.m273H0(interfaceC5179a.mo9555B()), C8573r0.m16767w0(this), startedWhileSubscribed, "Off");
        this.f27513v0 = c7135pM353h5;
        StateFlowImpl stateFlowImplM14379a4 = C7120g.m14379a(null);
        this.f27515w0 = stateFlowImplM14379a4;
        this.f27517x0 = C0062b.m353h2(stateFlowImplM14379a4, C8573r0.m16767w0(this), startedWhileSubscribed, null);
        EmptyList emptyList = EmptyList.f38032a;
        this.f27519y0 = C7120g.m14379a(emptyList);
        C7138s c7138sM10448a2 = C4924a.m10448a();
        this.f27521z0 = c7138sM10448a2;
        this.f27385A0 = C0062b.m341d2(c7138sM10448a2, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a3 = C4924a.m10448a();
        this.f27387B0 = c7138sM10448a3;
        this.f27389C0 = C0062b.m341d2(c7138sM10448a3, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a4 = C4924a.m10448a();
        this.f27391D0 = c7138sM10448a4;
        this.f27393E0 = C0062b.m341d2(c7138sM10448a4, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a5 = C4924a.m10448a();
        this.f27395F0 = c7138sM10448a5;
        this.f27397G0 = C0062b.m341d2(c7138sM10448a5, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a6 = C4924a.m10448a();
        this.f27400H0 = c7138sM10448a6;
        this.f27403I0 = C0062b.m341d2(c7138sM10448a6, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a7 = C4924a.m10448a();
        this.f27406J0 = c7138sM10448a7;
        this.f27409K0 = C0062b.m341d2(c7138sM10448a7, C8573r0.m16767w0(this), startedWhileSubscribed);
        this.f27412L0 = C7120g.m14379a(null);
        final StateFlowImpl stateFlowImplM14379a5 = C7120g.m14379a(emptyList);
        this.f27415M0 = stateFlowImplM14379a5;
        this.f27418N0 = C7120g.m14379a(null);
        this.f27421O0 = C7120g.m14379a(null);
        final StateFlowImpl stateFlowImplM14379a6 = C7120g.m14379a(emptyList);
        this.f27424P0 = stateFlowImplM14379a6;
        this.f27427Q0 = C0062b.m353h2(stateFlowImplM14379a6, C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        this.f27430R0 = C0062b.m353h2(new C7131l(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(stateFlowImplM14379a4), new InterfaceC7116c<List<? extends C7567a>>() { // from class: com.lingq.ui.lesson.LessonViewModel$special$$inlined$filter$1

            /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$special$$inlined$filter$1$2 */
            public static final class C42592<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f27778a;

                /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$special$$inlined$filter$1$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$special$$inlined$filter$1$2", m19206f = "LessonViewModel.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f27779d;

                    /* JADX INFO: renamed from: e */
                    public int f27780e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f27779d = obj;
                        this.f27780e |= Integer.MIN_VALUE;
                        return C42592.this.mo1339r(null, this);
                    }
                }

                public C42592(InterfaceC7117d interfaceC7117d) {
                    this.f27778a = interfaceC7117d;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f27780e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f27780e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f27779d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f27780e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        if (!((List) obj).isEmpty()) {
                            anonymousClass1.f27780e = 1;
                            if (this.f27778a.mo1339r(obj, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super List<? extends C7567a>> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = stateFlowImplM14379a6.mo9539a(new C42592(interfaceC7117d), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        }, new LessonViewModel$lessonPages$2(this, null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        final C7135p c7135pM353h6 = C0062b.m353h2(C0062b.m399t2(new InterfaceC7116c<List<? extends C7567a>>() { // from class: com.lingq.ui.lesson.LessonViewModel$special$$inlined$filterNot$1

            /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$special$$inlined$filterNot$1$2 */
            public static final class C42612<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f27788a;

                /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$special$$inlined$filterNot$1$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$special$$inlined$filterNot$1$2", m19206f = "LessonViewModel.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f27789d;

                    /* JADX INFO: renamed from: e */
                    public int f27790e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f27789d = obj;
                        this.f27790e |= Integer.MIN_VALUE;
                        return C42612.this.mo1339r(null, this);
                    }
                }

                public C42612(InterfaceC7117d interfaceC7117d) {
                    this.f27788a = interfaceC7117d;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0016  */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f27790e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f27790e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f27789d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f27790e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        if (!((List) obj).isEmpty()) {
                            anonymousClass1.f27790e = 1;
                            if (this.f27788a.mo1339r(obj, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super List<? extends C7567a>> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = stateFlowImplM14379a6.mo9539a(new C42612(interfaceC7117d), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        }, new LessonViewModel$cards$2(this, null)), C8573r0.m16767w0(this), startedWhileSubscribed, C6753d.m13459L0());
        this.f27433S0 = c7135pM353h6;
        final C7135p c7135pM353h7 = C0062b.m353h2(C0062b.m399t2(new InterfaceC7116c<List<? extends C7567a>>() { // from class: com.lingq.ui.lesson.LessonViewModel$special$$inlined$filterNot$2

            /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$special$$inlined$filterNot$2$2 */
            public static final class C42622<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f27793a;

                /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$special$$inlined$filterNot$2$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$special$$inlined$filterNot$2$2", m19206f = "LessonViewModel.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f27794d;

                    /* JADX INFO: renamed from: e */
                    public int f27795e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f27794d = obj;
                        this.f27795e |= Integer.MIN_VALUE;
                        return C42622.this.mo1339r(null, this);
                    }
                }

                public C42622(InterfaceC7117d interfaceC7117d) {
                    this.f27793a = interfaceC7117d;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0019  */
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f27795e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f27795e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f27794d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f27795e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        if (!((List) obj).isEmpty()) {
                            anonymousClass1.f27795e = 1;
                            if (this.f27793a.mo1339r(obj, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super List<? extends C7567a>> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = stateFlowImplM14379a6.mo9539a(new C42622(interfaceC7117d), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        }, new LessonViewModel$words$2(this, null)), C8573r0.m16767w0(this), startedWhileSubscribed, C6753d.m13459L0());
        this.f27436T0 = c7135pM353h7;
        C7135p c7135pM353h8 = C0062b.m353h2(C0062b.m399t2(new InterfaceC7116c<List<? extends C7567a>>() { // from class: com.lingq.ui.lesson.LessonViewModel$special$$inlined$filterNot$3

            /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$special$$inlined$filterNot$3$2 */
            public static final class C42632<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f27798a;

                /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$special$$inlined$filterNot$3$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$special$$inlined$filterNot$3$2", m19206f = "LessonViewModel.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f27799d;

                    /* JADX INFO: renamed from: e */
                    public int f27800e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f27799d = obj;
                        this.f27800e |= Integer.MIN_VALUE;
                        return C42632.this.mo1339r(null, this);
                    }
                }

                public C42632(InterfaceC7117d interfaceC7117d) {
                    this.f27798a = interfaceC7117d;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x001b  */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f27800e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f27800e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f27799d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f27800e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        if (!((List) obj).isEmpty()) {
                            anonymousClass1.f27800e = 1;
                            if (this.f27798a.mo1339r(obj, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super List<? extends C7567a>> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = stateFlowImplM14379a6.mo9539a(new C42632(interfaceC7117d), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        }, new LessonViewModel$phrases$2(this, null)), C8573r0.m16767w0(this), startedWhileSubscribed, C6753d.m13459L0());
        this.f27439U0 = c7135pM353h8;
        final InterfaceC7116c[] interfaceC7116cArr = {new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(stateFlowImplM14379a4), new InterfaceC7116c<List<? extends LessonStudySentence>>() { // from class: com.lingq.ui.lesson.LessonViewModel$special$$inlined$filter$2

            /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$special$$inlined$filter$2$2 */
            public static final class C42602<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f27783a;

                /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$special$$inlined$filter$2$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$special$$inlined$filter$2$2", m19206f = "LessonViewModel.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f27784d;

                    /* JADX INFO: renamed from: e */
                    public int f27785e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f27784d = obj;
                        this.f27785e |= Integer.MIN_VALUE;
                        return C42602.this.mo1339r(null, this);
                    }
                }

                public C42602(InterfaceC7117d interfaceC7117d) {
                    this.f27783a = interfaceC7117d;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0019  */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f27785e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f27785e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f27784d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f27785e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        if (!((List) obj).isEmpty()) {
                            anonymousClass1.f27785e = 1;
                            if (this.f27783a.mo1339r(obj, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super List<? extends LessonStudySentence>> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = stateFlowImplM14379a5.mo9539a(new C42602(interfaceC7117d), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        }, C0062b.m273H0(interfaceC5179a.mo9598m()), C0062b.m273H0(interfaceC5179a.mo9602q()), C0062b.m273H0(interfaceC5179a.mo9581a0()), C0062b.m273H0(interfaceC5179a.mo9588e()), stateFlowImplM14379a, c7135pM353h2, c7135pM353h3, c7135pM353h4, c7135pM353h5};
        this.f27442V0 = C0062b.m341d2(new InterfaceC7116c<C6069o>() { // from class: com.lingq.ui.lesson.LessonViewModel$special$$inlined$combine$1

            /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$special$$inlined$combine$1$3 */
            @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, m13365d2 = {"T", "R", "Lkotlinx/coroutines/flow/d;", "", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
            @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$special$$inlined$combine$1$3", m19206f = "LessonViewModel.kt", m19207l = {238}, m19208m = "invokeSuspend")
            public static final class C42583 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super C6069o>, Object[], InterfaceC9968c<? super C9072e>, Object> {

                /* JADX INFO: renamed from: e */
                public int f27773e;

                /* JADX INFO: renamed from: f */
                public /* synthetic */ InterfaceC7117d f27774f;

                /* JADX INFO: renamed from: g */
                public /* synthetic */ Object[] f27775g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ LessonViewModel f27776h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C42583(LessonViewModel lessonViewModel, InterfaceC9968c interfaceC9968c) {
                    super(3, interfaceC9968c);
                    this.f27776h = lessonViewModel;
                }

                @Override // cm.InterfaceC2057q
                /* JADX INFO: renamed from: M */
                public final Object mo1343M(InterfaceC7117d<? super C6069o> interfaceC7117d, Object[] objArr, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                    C42583 c42583 = new C42583(this.f27776h, interfaceC9968c);
                    c42583.f27774f = interfaceC7117d;
                    c42583.f27775g = objArr;
                    return c42583.mo1338x(C9072e.f47360a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: x */
                public final Object mo1338x(Object obj) throws Throwable {
                    String string;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.f27773e;
                    boolean z10 = true;
                    if (i10 == 0) {
                        C7499b.m14977z0(obj);
                        InterfaceC7117d interfaceC7117d = this.f27774f;
                        Object[] objArr = this.f27775g;
                        boolean z11 = false;
                        Object obj2 = objArr[0];
                        C5207g.m11109d(obj2, "null cannot be cast to non-null type com.lingq.shared.uimodel.lesson.LessonStudy");
                        LessonStudy lessonStudy = (LessonStudy) obj2;
                        Object obj3 = objArr[1];
                        C5207g.m11109d(obj3, "null cannot be cast to non-null type kotlin.collections.List<com.lingq.shared.uimodel.lesson.LessonStudySentence>");
                        List list = (List) obj3;
                        Object obj4 = objArr[2];
                        C5207g.m11109d(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, com.lingq.shared.storage.LessonFont>");
                        Object obj5 = objArr[3];
                        C5207g.m11109d(obj5, "null cannot be cast to non-null type kotlin.Int");
                        int iIntValue = ((Integer) obj5).intValue();
                        Object obj6 = objArr[4];
                        C5207g.m11109d(obj6, "null cannot be cast to non-null type kotlin.Double");
                        double dDoubleValue = ((Double) obj6).doubleValue();
                        Object obj7 = objArr[5];
                        C5207g.m11109d(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                        Object obj8 = objArr[6];
                        C5207g.m11109d(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean zBooleanValue2 = ((Boolean) obj8).booleanValue();
                        Object obj9 = objArr[7];
                        C5207g.m11109d(obj9, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj9;
                        Object obj10 = objArr[8];
                        C5207g.m11109d(obj10, "null cannot be cast to non-null type kotlin.String");
                        String str2 = (String) obj10;
                        Object obj11 = objArr[9];
                        C5207g.m11109d(obj11, "null cannot be cast to non-null type kotlin.String");
                        String str3 = (String) obj11;
                        Object obj12 = objArr[10];
                        C5207g.m11109d(obj12, "null cannot be cast to non-null type kotlin.String");
                        String str4 = (String) obj12;
                        LessonViewModel lessonViewModel = this.f27776h;
                        LessonFont lessonFont = (LessonFont) ((Map) obj4).get(lessonViewModel.mo498E1());
                        if (lessonFont == null) {
                            lessonFont = LessonFont.Rubik.INSTANCE;
                        }
                        LessonFont lessonFont2 = lessonFont;
                        boolean z12 = C5408a.m11571d(lessonViewModel.mo498E1()) ? zBooleanValue : true;
                        StringBuilder sb2 = new StringBuilder();
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = list.iterator();
                        int length = 0;
                        while (it.hasNext()) {
                            LessonStudySentence lessonStudySentence = (LessonStudySentence) it.next();
                            if ((sb2.length() > 0 ? z10 : z11) && !zBooleanValue2 && lessonStudySentence.f21863f) {
                                sb2.append("\n\n");
                                length += 2;
                            }
                            StringBuilder sb3 = new StringBuilder();
                            int size = lessonStudySentence.f21858a.size();
                            CoroutineSingletons coroutineSingletons2 = coroutineSingletons;
                            Iterator it2 = it;
                            int i11 = 0;
                            int length2 = 0;
                            while (i11 < size) {
                                int i12 = size;
                                LessonStudyTextToken lessonStudyTextToken = lessonStudySentence.f21858a.get(i11);
                                InterfaceC7117d interfaceC7117d2 = interfaceC7117d;
                                String str5 = lessonStudyTextToken.f21871a;
                                if (str5 != null) {
                                    if (lessonStudyTextToken.f21873c) {
                                        arrayList.add(new C7570d(length, str5.length() + length, length2, str5.length() + length2, str5, lessonStudyTextToken.f21877g, lessonStudySentence.f21861d, lessonStudyTextToken.f21878h, null, null, TextTokenType.PUNCT, 0, 15104));
                                    }
                                    String str6 = lessonStudyTextToken.f21871a;
                                    length += str6 != null ? str6.length() : 0;
                                    length2 += str6 != null ? str6.length() : 0;
                                    sb3.append(str6);
                                } else if (lessonStudyTextToken.f21872b == null) {
                                    String str7 = lessonStudyTextToken.f21880j;
                                    if (str7 != null) {
                                        int length3 = str7.length() + length;
                                        int length4 = str7.length() + length2;
                                        int i13 = lessonStudyTextToken.f21877g;
                                        int i14 = lessonStudySentence.f21861d;
                                        int i15 = lessonStudyTextToken.f21878h;
                                        LessonStudyTransliteration lessonStudyTransliteration = lessonStudyTextToken.f21876f;
                                        arrayList.add(new C7570d(length, length3, length2, length4, str7, i13, i14, i15, "", new TokenTransliteration(lessonStudyTransliteration != null ? lessonStudyTransliteration.f21907a : null, lessonStudyTransliteration != null ? lessonStudyTransliteration.f21908b : null, lessonStudyTransliteration != null ? lessonStudyTransliteration.f21909c : null, lessonStudyTransliteration != null ? lessonStudyTransliteration.f21910d : null, lessonStudyTransliteration != null ? lessonStudyTransliteration.f21911e : null, lessonStudyTransliteration != null ? lessonStudyTransliteration.f21912f : null), TextTokenType.WORD, lessonStudyTextToken.f21883m, 12288));
                                        int length5 = str7.length() + length;
                                        int length6 = str7.length() + length2;
                                        sb3.append(str7);
                                        length = length5;
                                        length2 = length6;
                                    }
                                } else if (z12) {
                                    length++;
                                    length2++;
                                    sb3.append(" ");
                                }
                                i11++;
                                size = i12;
                                interfaceC7117d = interfaceC7117d2;
                                dDoubleValue = dDoubleValue;
                                iIntValue = iIntValue;
                                lessonFont2 = lessonFont2;
                            }
                            InterfaceC7117d interfaceC7117d3 = interfaceC7117d;
                            LessonFont lessonFont3 = lessonFont2;
                            int i16 = iIntValue;
                            double d10 = dDoubleValue;
                            if (zBooleanValue2) {
                                String string2 = sb3.toString();
                                C5207g.m11110e(string2, "sentenceString.toString()");
                                arrayList2.add(string2);
                            } else {
                                length++;
                                sb2.append((CharSequence) sb3);
                                sb2.append(" ");
                            }
                            it = it2;
                            coroutineSingletons = coroutineSingletons2;
                            interfaceC7117d = interfaceC7117d3;
                            dDoubleValue = d10;
                            iIntValue = i16;
                            lessonFont2 = lessonFont3;
                            z10 = true;
                            z11 = false;
                        }
                        CoroutineSingletons coroutineSingletons3 = coroutineSingletons;
                        InterfaceC7117d interfaceC7117d4 = interfaceC7117d;
                        LessonFont lessonFont4 = lessonFont2;
                        int i17 = iIntValue;
                        double d11 = dDoubleValue;
                        if (zBooleanValue2) {
                            string = C6752c.m13430X(arrayList2, "***--ENDOFSENTENCE--***", null, null, null, 62);
                        } else {
                            string = sb2.toString();
                            C5207g.m11110e(string, "{\n            fullText.toString()\n        }");
                        }
                        C6069o c6069o = new C6069o(lessonStudy, string, arrayList, lessonFont4, i17, d11, z12, zBooleanValue2, str, str2, str3, str4);
                        this.f27773e = 1;
                        if (interfaceC7117d4.mo1339r(c6069o, this) == coroutineSingletons3) {
                            return coroutineSingletons3;
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

            @Override // kotlinx.coroutines.flow.InterfaceC7116c
            /* JADX INFO: renamed from: a */
            public final Object mo9539a(InterfaceC7117d<? super C6069o> interfaceC7117d, InterfaceC9968c interfaceC9968c) throws Throwable {
                final InterfaceC7116c[] interfaceC7116cArr2 = interfaceC7116cArr;
                Object objM14386a = C7127c.m14386a(interfaceC9968c, new InterfaceC2041a<Object[]>() { // from class: com.lingq.ui.lesson.LessonViewModel$special$$inlined$combine$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final Object[] mo807E() {
                        return new Object[interfaceC7116cArr2.length];
                    }
                }, new C42583(this, null), interfaceC7117d, interfaceC7116cArr2);
                return objM14386a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM14386a : C9072e.f47360a;
            }
        }, C8573r0.m16767w0(this), startedWhileSubscribed);
        StateFlowImpl stateFlowImplM14379a7 = C7120g.m14379a(emptyList);
        this.f27445W0 = stateFlowImplM14379a7;
        StateFlowImpl stateFlowImplM14379a8 = C7120g.m14379a(zBooleanValue ? Resource.Status.SUCCESS : Resource.Status.LOADING);
        this.f27448X0 = stateFlowImplM14379a8;
        this.f27451Y0 = C0062b.m353h2(stateFlowImplM14379a8, C8573r0.m16767w0(this), startedWhileSubscribed, zBooleanValue ? Resource.Status.SUCCESS : Resource.Status.LOADING);
        Resource.Status status = Resource.Status.EMPTY;
        StateFlowImpl stateFlowImplM14379a9 = C7120g.m14379a(status);
        this.f27454Z0 = stateFlowImplM14379a9;
        this.f27457a1 = C0062b.m353h2(stateFlowImplM14379a9, C8573r0.m16767w0(this), startedWhileSubscribed, status);
        this.f27460b1 = C0062b.m341d2(C0062b.m372n(0, 3, BufferOverflow.DROP_OLDEST, 1), C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a8 = C4924a.m10448a();
        this.f27463c1 = c7138sM10448a8;
        this.f27467d1 = C0062b.m341d2(c7138sM10448a8, C8573r0.m16767w0(this), startedWhileSubscribed);
        StateFlowImpl stateFlowImplM14379a10 = C7120g.m14379a(-1);
        this.f27471e1 = stateFlowImplM14379a10;
        this.f27475f1 = C0062b.m353h2(stateFlowImplM14379a10, C8573r0.m16767w0(this), startedWhileSubscribed, -1);
        StateFlowImpl stateFlowImplM14379a11 = C7120g.m14379a(0);
        this.f27479g1 = stateFlowImplM14379a11;
        this.f27482h1 = C0062b.m353h2(stateFlowImplM14379a11, C8573r0.m16767w0(this), startedWhileSubscribed, 0);
        StateFlowImpl stateFlowImplM14379a12 = C7120g.m14379a(bool2);
        this.f27485i1 = C0062b.m353h2(stateFlowImplM14379a12, C8573r0.m16767w0(this), startedWhileSubscribed, bool2);
        StateFlowImpl stateFlowImplM14379a13 = C7120g.m14379a(null);
        this.f27488j1 = stateFlowImplM14379a13;
        this.f27491k1 = C0062b.m353h2(stateFlowImplM14379a13, C8573r0.m16767w0(this), startedWhileSubscribed, null);
        this.f27494l1 = C0062b.m353h2(new C7131l(stateFlowImplM14379a2, stateFlowImplM14379a6, new LessonViewModel$pagesInfo$1(null)), C8573r0.m16767w0(this), startedWhileSubscribed, new Pair(0, 0));
        StateFlowImpl stateFlowImplM14379a14 = C7120g.m14379a(null);
        this.f27496m1 = stateFlowImplM14379a14;
        this.f27498n1 = C0062b.m353h2(stateFlowImplM14379a14, C8573r0.m16767w0(this), startedWhileSubscribed, null);
        this.f27500o1 = C7120g.m14379a(bool2);
        this.f27502p1 = C4924a.m10448a();
        this.f27504q1 = C0062b.m353h2(new C7131l(mo508t1(), stateFlowImplM14379a4, new LessonViewModel$showEditSentence$1(null)), C8573r0.m16767w0(this), startedWhileSubscribed, bool2);
        this.f27506r1 = C0062b.m353h2(new C7131l(c7135pM353h6, c7135pM353h8, new LessonViewModel$cardsCount$1(null)), C8573r0.m16767w0(this), startedWhileSubscribed, 0);
        this.f27508s1 = C0062b.m353h2(new InterfaceC7116c<Integer>() { // from class: com.lingq.ui.lesson.LessonViewModel$special$$inlined$map$1

            /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$special$$inlined$map$1$2 */
            public static final class C42642<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f27803a;

                /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$special$$inlined$map$1$2", m19206f = "LessonViewModel.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f27804d;

                    /* JADX INFO: renamed from: e */
                    public int f27805e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f27804d = obj;
                        this.f27805e |= Integer.MIN_VALUE;
                        return C42642.this.mo1339r(null, this);
                    }
                }

                public C42642(InterfaceC7117d interfaceC7117d) {
                    this.f27803a = interfaceC7117d;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x001a  */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f27805e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f27805e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f27804d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f27805e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        Map map = (Map) obj;
                        ArrayList arrayList = new ArrayList(map.size());
                        Iterator it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            arrayList.add((C6054e) ((Map.Entry) it.next()).getValue());
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<T> it2 = arrayList.iterator();
                        loop1: while (true) {
                            while (true) {
                                if (!it2.hasNext()) {
                                    break loop1;
                                }
                                T next = it2.next();
                                if (C5207g.m11106a(((C6054e) next).f35748f, WordStatus.New.getValue())) {
                                    arrayList2.add(next);
                                }
                            }
                        }
                        Integer num = new Integer(arrayList2.size());
                        anonymousClass1.f27805e = 1;
                        if (this.f27803a.mo1339r(num, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super Integer> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = c7135pM353h7.mo9539a(new C42642(interfaceC7117d), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        }, C8573r0.m16767w0(this), startedWhileSubscribed, -1);
        this.f27510t1 = C0062b.m353h2(new InterfaceC7116c<Integer>() { // from class: com.lingq.ui.lesson.LessonViewModel$special$$inlined$map$2

            /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$special$$inlined$map$2$2 */
            public static final class C42652<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f27809a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ LessonViewModel f27810b;

                /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$special$$inlined$map$2$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$special$$inlined$map$2$2", m19206f = "LessonViewModel.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f27811d;

                    /* JADX INFO: renamed from: e */
                    public int f27812e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f27811d = obj;
                        this.f27812e |= Integer.MIN_VALUE;
                        return C42652.this.mo1339r(null, this);
                    }
                }

                public C42652(InterfaceC7117d interfaceC7117d, LessonViewModel lessonViewModel) {
                    this.f27809a = interfaceC7117d;
                    this.f27810b = lessonViewModel;
                }

                /* JADX WARN: Code duplicated, block: B:28:0x00ab  */
                /* JADX WARN: Code duplicated, block: B:7:0x0018  */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    boolean z10;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f27812e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f27812e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f27811d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f27812e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        Map map = (Map) obj;
                        ArrayList arrayList = new ArrayList(map.size());
                        Iterator it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            arrayList.add((C6052c) ((Map.Entry) it.next()).getValue());
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (T t10 : arrayList) {
                            C6052c c6052c = (C6052c) t10;
                            String str = c6052c.f35742h;
                            if (str == null || str.compareTo(this.f27810b.f27497n0) >= 0) {
                                z10 = false;
                            } else {
                                if (c6052c.f35740f < CardStatus.Known.getValue()) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                            }
                            if (z10) {
                                arrayList2.add(t10);
                            }
                        }
                        Integer num = new Integer(arrayList2.size());
                        anonymousClass1.f27812e = 1;
                        if (this.f27809a.mo1339r(num, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super Integer> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = c7135pM353h6.mo9539a(new C42652(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        }, C8573r0.m16767w0(this), startedWhileSubscribed, 0);
        this.f27512u1 = C0062b.m353h2(new InterfaceC7116c<List<? extends String>>() { // from class: com.lingq.ui.lesson.LessonViewModel$special$$inlined$map$3

            /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$special$$inlined$map$3$2 */
            public static final class C42662<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f27815a;

                /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$special$$inlined$map$3$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$special$$inlined$map$3$2", m19206f = "LessonViewModel.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f27816d;

                    /* JADX INFO: renamed from: e */
                    public int f27817e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f27816d = obj;
                        this.f27817e |= Integer.MIN_VALUE;
                        return C42662.this.mo1339r(null, this);
                    }
                }

                public C42662(InterfaceC7117d interfaceC7117d) {
                    this.f27815a = interfaceC7117d;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0019  */
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f27817e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f27817e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f27816d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f27817e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        Map map = (Map) obj;
                        ArrayList arrayList = new ArrayList(map.size());
                        Iterator it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            arrayList.add((C6054e) ((Map.Entry) it.next()).getValue());
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<T> it2 = arrayList.iterator();
                        loop1: while (true) {
                            while (true) {
                                if (!it2.hasNext()) {
                                    break loop1;
                                }
                                T next = it2.next();
                                if (C5207g.m11106a(((C6054e) next).f35748f, WordStatus.New.getValue())) {
                                    arrayList2.add(next);
                                }
                            }
                        }
                        ArrayList arrayList3 = new ArrayList(C9325m.m17681z(arrayList2, 10));
                        Iterator<T> it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(((C6054e) it3.next()).f35743a);
                        }
                        anonymousClass1.f27817e = 1;
                        if (this.f27815a.mo1339r(arrayList3, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super List<? extends String>> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = c7135pM353h7.mo9539a(new C42662(interfaceC7117d), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        }, C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        C7138s c7138sM10448a9 = C4924a.m10448a();
        this.f27514v1 = c7138sM10448a9;
        this.f27516w1 = C0062b.m341d2(c7138sM10448a9, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a10 = C4924a.m10448a();
        this.f27518x1 = c7138sM10448a10;
        this.f27520y1 = C0062b.m341d2(c7138sM10448a10, C8573r0.m16767w0(this), startedWhileSubscribed);
        StateFlowImpl stateFlowImplM14379a15 = C7120g.m14379a(bool2);
        this.f27522z1 = stateFlowImplM14379a15;
        this.f27386A1 = C0062b.m353h2(new C7131l(stateFlowImplM14379a15, stateFlowImplM14379a7, new LessonViewModel$generateLessonAudio$1(null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        this.f27388B1 = C7120g.m14379a(bool2);
        C7138s c7138sM10448a11 = C4924a.m10448a();
        this.f27390C1 = c7138sM10448a11;
        this.f27392D1 = C0062b.m341d2(c7138sM10448a11, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a12 = C4924a.m10448a();
        this.f27394E1 = c7138sM10448a12;
        this.f27396F1 = C0062b.m341d2(c7138sM10448a12, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a13 = C4924a.m10448a();
        this.f27398G1 = c7138sM10448a13;
        this.f27401H1 = C0062b.m341d2(c7138sM10448a13, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a14 = C4924a.m10448a();
        this.f27404I1 = c7138sM10448a14;
        this.f27407J1 = C0062b.m341d2(c7138sM10448a14, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a15 = C4924a.m10448a();
        this.f27410K1 = c7138sM10448a15;
        this.f27413L1 = C0062b.m341d2(c7138sM10448a15, C8573r0.m16767w0(this), startedWhileSubscribed);
        LessonHighlightStyle lessonHighlightStyle = LessonHighlightStyle.Default;
        this.f27416M1 = C7120g.m14379a(lessonHighlightStyle);
        this.f27419N1 = C7120g.m14379a(lessonHighlightStyle);
        C7138s c7138sM10448a16 = C4924a.m10448a();
        this.f27422O1 = c7138sM10448a16;
        this.f27425P1 = C0062b.m341d2(c7138sM10448a16, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a17 = C4924a.m10448a();
        this.f27428Q1 = c7138sM10448a17;
        this.f27431R1 = C0062b.m341d2(c7138sM10448a17, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a18 = C4924a.m10448a();
        this.f27434S1 = c7138sM10448a18;
        this.f27437T1 = C0062b.m341d2(c7138sM10448a18, C8573r0.m16767w0(this), startedWhileSubscribed);
        this.f27446W1 = true;
        StateFlowImpl stateFlowImplM14379a16 = C7120g.m14379a(null);
        this.f27449X1 = stateFlowImplM14379a16;
        C0062b.m353h2(stateFlowImplM14379a16, C8573r0.m16767w0(this), startedWhileSubscribed, null);
        this.f27452Y1 = C7120g.m14379a(null);
        this.f27455Z1 = C0062b.m353h2(C0062b.m377o0(this.f27474f0, new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(stateFlowImplM14379a4), stateFlowImplM14379a16, new LessonViewModel$hideAudio$1(null)), C8573r0.m16767w0(this), startedWhileSubscribed, null);
        this.f27458a2 = C0062b.m353h2(new C7131l(this.f27474f0, new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(stateFlowImplM14379a4), new LessonViewModel$hidePlaybackSpeed$1(null)), C8573r0.m16767w0(this), startedWhileSubscribed, null);
        StateFlowImpl stateFlowImplM14379a17 = C7120g.m14379a(C6753d.m13459L0());
        this.f27461b2 = stateFlowImplM14379a17;
        this.f27464c2 = C0062b.m353h2(new C7131l(stateFlowImplM14379a17, this.f27478g0, new LessonViewModel$_canReviewSentence$1(null)), C8573r0.m16767w0(this), startedWhileSubscribed, bool2);
        this.f27468d2 = C7120g.m14379a(bool2);
        C7138s c7138sM10448a19 = C4924a.m10448a();
        this.f27472e2 = c7138sM10448a19;
        this.f27476f2 = C0062b.m341d2(c7138sM10448a19, C8573r0.m16767w0(this), startedWhileSubscribed);
        List<Integer> list = C6716m.f37937a;
        stateFlowImplM14379a12.setValue(Boolean.valueOf(C6716m.m13327l(mo498E1())));
        if (this.f27411L.isPlaying()) {
            PlayerContentController.PlayerContentItem playerContentItemM9400L = this.f27411L.m9400L();
            if (playerContentItemM9400L != null && playerContentItemM9400L.f17600a == m10152y2()) {
                m10141G2(AbstractC4267a.b.f27841a);
            } else {
                this.f27411L.pause();
                this.f27411L.m9415p0(false);
                m10141G2(AbstractC4267a.a.f27840a);
            }
        } else {
            this.f27411L.pause();
            this.f27411L.m9415p0(false);
            m10141G2(AbstractC4267a.a.f27840a);
        }
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C42271(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C42362(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C42373(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C42394(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C42405(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), this.f27420O, null, new C42416(null), 2);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C42427(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C42438(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C42449(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C422810(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C422911(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C423012(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C423113(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C423314(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C423415(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C423516(null), 3);
    }

    /* JADX INFO: renamed from: l2 */
    public static final int m10130l2(LessonViewModel lessonViewModel, Map map, ArrayList arrayList) {
        Object next;
        lessonViewModel.getClass();
        int size = arrayList.size() - 1;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            List list = (List) arrayList.get(i10);
            ArrayList arrayList2 = new ArrayList(C9325m.m17681z(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = ((C7570d) it.next()).f41725e;
                Locale locale = lessonViewModel.f27495m0;
                C5207g.m11110e(locale, "locale");
                arrayList2.add((C6054e) map.get(C7793a.m15502f(str, locale)));
            }
            Iterator it2 = C6752c.m13421O(arrayList2).iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!C5207g.m11106a(((C6054e) next).f35748f, WordStatus.New.getValue()));
            if (((C6054e) next) != null) {
                return i10;
            }
        }
        return size;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX INFO: renamed from: m2 */
    public static final Object m10131m2(LessonViewModel lessonViewModel, int i10, InterfaceC9968c interfaceC9968c) throws Throwable {
        LessonViewModel$isLessonDownloaded$1 lessonViewModel$isLessonDownloaded$1;
        lessonViewModel.getClass();
        if (interfaceC9968c instanceof LessonViewModel$isLessonDownloaded$1) {
            lessonViewModel$isLessonDownloaded$1 = (LessonViewModel$isLessonDownloaded$1) interfaceC9968c;
            int i11 = lessonViewModel$isLessonDownloaded$1.f27692f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                lessonViewModel$isLessonDownloaded$1.f27692f = i11 - Integer.MIN_VALUE;
            } else {
                lessonViewModel$isLessonDownloaded$1 = new LessonViewModel$isLessonDownloaded$1(lessonViewModel, interfaceC9968c);
            }
        } else {
            lessonViewModel$isLessonDownloaded$1 = new LessonViewModel$isLessonDownloaded$1(lessonViewModel, interfaceC9968c);
        }
        Object objMo6112g = lessonViewModel$isLessonDownloaded$1.f27690d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = lessonViewModel$isLessonDownloaded$1.f27692f;
        boolean z10 = true;
        if (i12 == 0) {
            C7499b.m14977z0(objMo6112g);
            String strMo498E1 = lessonViewModel.mo498E1();
            lessonViewModel$isLessonDownloaded$1.f27692f = 1;
            objMo6112g = lessonViewModel.f27469e.mo6112g(i10, strMo498E1, lessonViewModel$isLessonDownloaded$1);
            if (objMo6112g == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(objMo6112g);
        }
        C6698d c6698d = (C6698d) objMo6112g;
        if (c6698d == null) {
            return Boolean.FALSE;
        }
        if (!c6698d.f37876b || c6698d.f37877c != 100) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:39:0x0110  */
    /* JADX WARN: Code duplicated, block: B:40:0x0112  */
    /* JADX WARN: Code duplicated, block: B:44:0x013e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0157  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: n2 */
    public static final Object m10132n2(LessonViewModel lessonViewModel, LessonStudyBookmark lessonStudyBookmark, InterfaceC9968c interfaceC9968c) throws Throwable {
        LessonViewModel$setupBookmark$1 lessonViewModel$setupBookmark$1;
        String str;
        Object objM14360a;
        LessonStudyBookmark lessonStudyBookmark2;
        InterfaceC5182d interfaceC5182d;
        LessonViewModel lessonViewModel2;
        LessonStudyBookmark lessonStudyBookmark3;
        String str2;
        LessonViewModel lessonViewModel3;
        LessonStudyBookmark lessonStudyBookmark4;
        LessonViewModel lessonViewModel4;
        LessonStudyBookmark lessonStudyBookmark5;
        LinkedHashMap linkedHashMapM13467T0;
        LinkedHashMap linkedHashMapM13467T1;
        LinkedHashMap linkedHashMapM13467T2;
        LessonViewModel lessonViewModel5 = lessonViewModel;
        lessonViewModel5.getClass();
        if (interfaceC9968c instanceof LessonViewModel$setupBookmark$1) {
            lessonViewModel$setupBookmark$1 = (LessonViewModel$setupBookmark$1) interfaceC9968c;
            int i10 = lessonViewModel$setupBookmark$1.f27749i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lessonViewModel$setupBookmark$1.f27749i = i10 - Integer.MIN_VALUE;
            } else {
                lessonViewModel$setupBookmark$1 = new LessonViewModel$setupBookmark$1(lessonViewModel5, interfaceC9968c);
            }
        } else {
            lessonViewModel$setupBookmark$1 = new LessonViewModel$setupBookmark$1(lessonViewModel5, interfaceC9968c);
        }
        Object objM14360a2 = lessonViewModel$setupBookmark$1.f27747g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (lessonViewModel$setupBookmark$1.f27749i) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C7499b.m14977z0(objM14360a2);
                str = lessonStudyBookmark.f21843c;
                if (str != null) {
                    InterfaceC7116c<Map<Integer, LessonStudyBookmark>> interfaceC7116cMo9689m = lessonViewModel5.f27402I.mo9689m();
                    lessonViewModel$setupBookmark$1.f27744d = lessonViewModel5;
                    lessonViewModel$setupBookmark$1.f27745e = lessonStudyBookmark;
                    lessonViewModel$setupBookmark$1.f27746f = str;
                    lessonViewModel$setupBookmark$1.f27749i = 1;
                    objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9689m, lessonViewModel$setupBookmark$1);
                    if (objM14360a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lessonStudyBookmark2 = (LessonStudyBookmark) ((Map) objM14360a).get(new Integer(lessonViewModel5.m10152y2()));
                    interfaceC5182d = lessonViewModel5.f27402I;
                    if (lessonStudyBookmark2 != null) {
                        str2 = lessonStudyBookmark2.f21843c;
                        if (str2 != null) {
                            if (str.compareTo(str2) > 0) {
                                InterfaceC7116c<Map<Integer, LessonStudyBookmark>> interfaceC7116cMo9689m2 = interfaceC5182d.mo9689m();
                                lessonViewModel$setupBookmark$1.f27744d = lessonViewModel5;
                                lessonViewModel$setupBookmark$1.f27745e = lessonStudyBookmark;
                                lessonViewModel$setupBookmark$1.f27746f = null;
                                lessonViewModel$setupBookmark$1.f27749i = 2;
                                objM14360a2 = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9689m2, lessonViewModel$setupBookmark$1);
                                if (objM14360a2 == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                LessonStudyBookmark lessonStudyBookmark6 = lessonStudyBookmark;
                                lessonViewModel4 = lessonViewModel5;
                                lessonStudyBookmark5 = lessonStudyBookmark6;
                                linkedHashMapM13467T0 = C6753d.m13467T0((Map) objM14360a2);
                                linkedHashMapM13467T0.put(new Integer(lessonViewModel4.m10152y2()), lessonStudyBookmark5);
                                lessonViewModel$setupBookmark$1.f27744d = null;
                                lessonViewModel$setupBookmark$1.f27745e = null;
                                lessonViewModel$setupBookmark$1.f27749i = 3;
                                if (lessonViewModel4.f27402I.mo9695s(linkedHashMapM13467T0, lessonViewModel$setupBookmark$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                InterfaceC7116c<Map<Integer, LessonStudyBookmark>> interfaceC7116cMo9689m3 = interfaceC5182d.mo9689m();
                                lessonViewModel$setupBookmark$1.f27744d = lessonViewModel5;
                                lessonViewModel$setupBookmark$1.f27745e = lessonStudyBookmark2;
                                lessonViewModel$setupBookmark$1.f27746f = null;
                                lessonViewModel$setupBookmark$1.f27749i = 4;
                                objM14360a2 = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9689m3, lessonViewModel$setupBookmark$1);
                                if (objM14360a2 == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                lessonViewModel3 = lessonViewModel5;
                                lessonStudyBookmark4 = lessonStudyBookmark2;
                                linkedHashMapM13467T1 = C6753d.m13467T0((Map) objM14360a2);
                                linkedHashMapM13467T1.put(new Integer(lessonViewModel3.m10152y2()), lessonStudyBookmark4);
                                lessonViewModel$setupBookmark$1.f27744d = null;
                                lessonViewModel$setupBookmark$1.f27745e = null;
                                lessonViewModel$setupBookmark$1.f27749i = 5;
                                if (lessonViewModel3.f27402I.mo9695s(linkedHashMapM13467T1, lessonViewModel$setupBookmark$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                        }
                    } else {
                        InterfaceC7116c<Map<Integer, LessonStudyBookmark>> interfaceC7116cMo9689m4 = interfaceC5182d.mo9689m();
                        lessonViewModel$setupBookmark$1.f27744d = lessonViewModel5;
                        lessonViewModel$setupBookmark$1.f27745e = lessonStudyBookmark;
                        lessonViewModel$setupBookmark$1.f27746f = null;
                        lessonViewModel$setupBookmark$1.f27749i = 6;
                        objM14360a2 = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9689m4, lessonViewModel$setupBookmark$1);
                        if (objM14360a2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        LessonStudyBookmark lessonStudyBookmark7 = lessonStudyBookmark;
                        lessonViewModel2 = lessonViewModel5;
                        lessonStudyBookmark3 = lessonStudyBookmark7;
                        linkedHashMapM13467T2 = C6753d.m13467T0((Map) objM14360a2);
                        linkedHashMapM13467T2.put(new Integer(lessonViewModel2.m10152y2()), lessonStudyBookmark3);
                        lessonViewModel$setupBookmark$1.f27744d = null;
                        lessonViewModel$setupBookmark$1.f27745e = null;
                        lessonViewModel$setupBookmark$1.f27749i = 7;
                        if (lessonViewModel2.f27402I.mo9695s(linkedHashMapM13467T2, lessonViewModel$setupBookmark$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
                return C9072e.f47360a;
            case 1:
                String str3 = lessonViewModel$setupBookmark$1.f27746f;
                lessonStudyBookmark = lessonViewModel$setupBookmark$1.f27745e;
                LessonViewModel lessonViewModel6 = lessonViewModel$setupBookmark$1.f27744d;
                C7499b.m14977z0(objM14360a2);
                str = str3;
                lessonViewModel5 = lessonViewModel6;
                objM14360a = objM14360a2;
                lessonStudyBookmark2 = (LessonStudyBookmark) ((Map) objM14360a).get(new Integer(lessonViewModel5.m10152y2()));
                interfaceC5182d = lessonViewModel5.f27402I;
                if (lessonStudyBookmark2 != null) {
                    str2 = lessonStudyBookmark2.f21843c;
                    if (str2 != null) {
                        if (str.compareTo(str2) > 0) {
                            InterfaceC7116c<Map<Integer, LessonStudyBookmark>> interfaceC7116cMo9689m5 = interfaceC5182d.mo9689m();
                            lessonViewModel$setupBookmark$1.f27744d = lessonViewModel5;
                            lessonViewModel$setupBookmark$1.f27745e = lessonStudyBookmark;
                            lessonViewModel$setupBookmark$1.f27746f = null;
                            lessonViewModel$setupBookmark$1.f27749i = 2;
                            objM14360a2 = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9689m5, lessonViewModel$setupBookmark$1);
                            if (objM14360a2 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            LessonStudyBookmark lessonStudyBookmark8 = lessonStudyBookmark;
                            lessonViewModel4 = lessonViewModel5;
                            lessonStudyBookmark5 = lessonStudyBookmark8;
                            linkedHashMapM13467T0 = C6753d.m13467T0((Map) objM14360a2);
                            linkedHashMapM13467T0.put(new Integer(lessonViewModel4.m10152y2()), lessonStudyBookmark5);
                            lessonViewModel$setupBookmark$1.f27744d = null;
                            lessonViewModel$setupBookmark$1.f27745e = null;
                            lessonViewModel$setupBookmark$1.f27749i = 3;
                            if (lessonViewModel4.f27402I.mo9695s(linkedHashMapM13467T0, lessonViewModel$setupBookmark$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            InterfaceC7116c<Map<Integer, LessonStudyBookmark>> interfaceC7116cMo9689m6 = interfaceC5182d.mo9689m();
                            lessonViewModel$setupBookmark$1.f27744d = lessonViewModel5;
                            lessonViewModel$setupBookmark$1.f27745e = lessonStudyBookmark2;
                            lessonViewModel$setupBookmark$1.f27746f = null;
                            lessonViewModel$setupBookmark$1.f27749i = 4;
                            objM14360a2 = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9689m6, lessonViewModel$setupBookmark$1);
                            if (objM14360a2 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            lessonViewModel3 = lessonViewModel5;
                            lessonStudyBookmark4 = lessonStudyBookmark2;
                            linkedHashMapM13467T1 = C6753d.m13467T0((Map) objM14360a2);
                            linkedHashMapM13467T1.put(new Integer(lessonViewModel3.m10152y2()), lessonStudyBookmark4);
                            lessonViewModel$setupBookmark$1.f27744d = null;
                            lessonViewModel$setupBookmark$1.f27745e = null;
                            lessonViewModel$setupBookmark$1.f27749i = 5;
                            if (lessonViewModel3.f27402I.mo9695s(linkedHashMapM13467T1, lessonViewModel$setupBookmark$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                } else {
                    InterfaceC7116c<Map<Integer, LessonStudyBookmark>> interfaceC7116cMo9689m7 = interfaceC5182d.mo9689m();
                    lessonViewModel$setupBookmark$1.f27744d = lessonViewModel5;
                    lessonViewModel$setupBookmark$1.f27745e = lessonStudyBookmark;
                    lessonViewModel$setupBookmark$1.f27746f = null;
                    lessonViewModel$setupBookmark$1.f27749i = 6;
                    objM14360a2 = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9689m7, lessonViewModel$setupBookmark$1);
                    if (objM14360a2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    LessonStudyBookmark lessonStudyBookmark9 = lessonStudyBookmark;
                    lessonViewModel2 = lessonViewModel5;
                    lessonStudyBookmark3 = lessonStudyBookmark9;
                    linkedHashMapM13467T2 = C6753d.m13467T0((Map) objM14360a2);
                    linkedHashMapM13467T2.put(new Integer(lessonViewModel2.m10152y2()), lessonStudyBookmark3);
                    lessonViewModel$setupBookmark$1.f27744d = null;
                    lessonViewModel$setupBookmark$1.f27745e = null;
                    lessonViewModel$setupBookmark$1.f27749i = 7;
                    if (lessonViewModel2.f27402I.mo9695s(linkedHashMapM13467T2, lessonViewModel$setupBookmark$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return C9072e.f47360a;
            case 2:
                lessonStudyBookmark5 = lessonViewModel$setupBookmark$1.f27745e;
                lessonViewModel4 = lessonViewModel$setupBookmark$1.f27744d;
                C7499b.m14977z0(objM14360a2);
                linkedHashMapM13467T0 = C6753d.m13467T0((Map) objM14360a2);
                linkedHashMapM13467T0.put(new Integer(lessonViewModel4.m10152y2()), lessonStudyBookmark5);
                lessonViewModel$setupBookmark$1.f27744d = null;
                lessonViewModel$setupBookmark$1.f27745e = null;
                lessonViewModel$setupBookmark$1.f27749i = 3;
                if (lessonViewModel4.f27402I.mo9695s(linkedHashMapM13467T0, lessonViewModel$setupBookmark$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return C9072e.f47360a;
            case 3:
            case 5:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                C7499b.m14977z0(objM14360a2);
                return C9072e.f47360a;
            case 4:
                lessonStudyBookmark4 = lessonViewModel$setupBookmark$1.f27745e;
                lessonViewModel3 = lessonViewModel$setupBookmark$1.f27744d;
                C7499b.m14977z0(objM14360a2);
                linkedHashMapM13467T1 = C6753d.m13467T0((Map) objM14360a2);
                linkedHashMapM13467T1.put(new Integer(lessonViewModel3.m10152y2()), lessonStudyBookmark4);
                lessonViewModel$setupBookmark$1.f27744d = null;
                lessonViewModel$setupBookmark$1.f27745e = null;
                lessonViewModel$setupBookmark$1.f27749i = 5;
                if (lessonViewModel3.f27402I.mo9695s(linkedHashMapM13467T1, lessonViewModel$setupBookmark$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return C9072e.f47360a;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                lessonStudyBookmark3 = lessonViewModel$setupBookmark$1.f27745e;
                lessonViewModel2 = lessonViewModel$setupBookmark$1.f27744d;
                C7499b.m14977z0(objM14360a2);
                linkedHashMapM13467T2 = C6753d.m13467T0((Map) objM14360a2);
                linkedHashMapM13467T2.put(new Integer(lessonViewModel2.m10152y2()), lessonStudyBookmark3);
                lessonViewModel$setupBookmark$1.f27744d = null;
                lessonViewModel$setupBookmark$1.f27745e = null;
                lessonViewModel$setupBookmark$1.f27749i = 7;
                if (lessonViewModel2.f27402I.mo9695s(linkedHashMapM13467T2, lessonViewModel$setupBookmark$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return C9072e.f47360a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: o2 */
    public static final void m10133o2(LessonViewModel lessonViewModel, float f3) {
        List<C7570d> list = ((C7567a) ((List) lessonViewModel.f27424P0.getValue()).get(((Number) lessonViewModel.f27478g0.getValue()).intValue())).f41703c;
        lessonViewModel.f27408K.mo9343o(lessonViewModel.mo498E1(), C6752c.m13430X(list, " ", null, null, new InterfaceC2052l<C7570d, CharSequence>() { // from class: com.lingq.ui.lesson.LessonViewModel$speakCurrentPage$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final CharSequence mo528n(C7570d c7570d) {
                C7570d c7570d2 = c7570d;
                C5207g.m11111f(c7570d2, "it");
                return c7570d2.f41725e;
            }
        }, 30), true, f3);
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: A */
    public final void mo9771A(UpgradeReason upgradeReason) {
        C5207g.m11111f(upgradeReason, "reason");
        this.f27456a0.mo9771A(upgradeReason);
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: A0 */
    public final void mo9391A0(int i10) {
        this.f27447X.mo9391A0(i10);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: A1 */
    public final void mo10025A1() {
        this.f27435T.mo10025A1();
    }

    /* JADX INFO: renamed from: A2 */
    public final void m10134A2(AbstractC4269c abstractC4269c) {
        C5207g.m11111f(abstractC4269c, "navigation");
        this.f27514v1.mo14371k(abstractC4269c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f27432S.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f27432S.mo497B0(interfaceC9968c);
    }

    /* JADX INFO: renamed from: B2 */
    public final void m10135B2(AbstractC9006b abstractC9006b) {
        C5207g.m11111f(abstractC9006b, "action");
        this.f27472e2.mo14371k(abstractC9006b);
    }

    /* JADX INFO: renamed from: C2 */
    public final void m10136C2(int i10, float f3) {
        this.f27414M.m15505b(null, "sentence_audio_play");
        C4924a.m10450b(this.f27443V1);
        this.f27443V1 = C7828f.m15570d(C8573r0.m16767w0(this), this.f27423P, null, new LessonViewModel$prepareSentenceToSpeak$1(this, i10, f3, null), 2);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: D */
    public final InterfaceC7137r<TokenEditData> mo10026D() {
        return this.f27435T.mo10026D();
    }

    @Override // p244lh.InterfaceC7367d
    /* JADX INFO: renamed from: D1 */
    public final void mo9321D1(List<C7794b> list) {
        this.f27450Y.mo9321D1(list);
    }

    /* JADX INFO: renamed from: D2 */
    public final void m10137D2() {
        this.f27454Z0.setValue(Resource.Status.LOADING);
        C4924a.m10450b(this.f27440U1);
        this.f27440U1 = C7828f.m15570d(C8573r0.m16767w0(this), this.f27423P, null, new LessonViewModel$fetchLesson$1(this, null, true), 2);
    }

    @Override // sh.InterfaceC9013i
    /* JADX INFO: renamed from: E */
    public final void mo9720E(PlayingFrom playingFrom) {
        C5207g.m11111f(playingFrom, "playingFrom");
        this.f27441V.mo9720E(playingFrom);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f27432S.mo498E1();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x008a  */
    /* JADX WARN: Code duplicated, block: B:29:0x00aa  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: E2 */
    public final void m10138E2(ReviewType reviewType) {
        int size;
        CardStatus cardStatus;
        Iterable iterable;
        C5207g.m11111f(reviewType, "type");
        int[] iArr = C4245a.f27609a;
        int i10 = iArr[reviewType.ordinal()];
        StateFlowImpl stateFlowImpl = this.f27461b2;
        if (i10 == 1) {
            List list = (List) ((Map) stateFlowImpl.getValue()).get(Integer.valueOf(m10147t2()));
            if (list != null) {
                size = list.size();
            } else {
                size = 0;
            }
        } else if (i10 == 2) {
            size = ((Number) this.f27510t1.getValue()).intValue();
        } else if (i10 == 3) {
            size = ((Number) this.f27506r1.getValue()).intValue();
        } else {
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            List list2 = (List) ((Map) stateFlowImpl.getValue()).get(Integer.valueOf(m10147t2()));
            if (list2 != null) {
                size = list2.size();
            } else {
                size = 0;
            }
        }
        int i11 = iArr[reviewType.ordinal()];
        if (i11 == 1) {
            cardStatus = CardStatus.Familiar;
        } else {
            if (i11 != 2) {
                if (i11 == 3) {
                    cardStatus = CardStatus.Familiar;
                } else if (i11 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            cardStatus = CardStatus.Learned;
        }
        if (size > 0) {
            int i12 = iArr[reviewType.ordinal()];
            if (i12 == 1 || i12 == 4) {
                iterable = (List) ((Map) stateFlowImpl.getValue()).get(Integer.valueOf(m10147t2()));
                if (iterable == null) {
                    iterable = EmptyList.f38032a;
                }
            } else {
                iterable = EmptyList.f38032a;
            }
            this.f27405J.m13311m(C6752c.m13457y0(iterable));
            m10134A2(new AbstractC4269c.d(reviewType, m10152y2(), cardStatus, m10147t2() + 1));
        }
    }

    @Override // sh.InterfaceC9013i
    /* JADX INFO: renamed from: F0 */
    public final InterfaceC7142w<C9015k> mo9721F0() {
        return this.f27441V.mo9721F0();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x010c  */
    /* JADX INFO: renamed from: F2 */
    public final void m10139F2(int i10, boolean z10) {
        List<C7570d> list;
        int i11;
        StateFlowImpl stateFlowImpl = this.f27478g0;
        if (((Number) stateFlowImpl.getValue()).intValue() != i10) {
            StateFlowImpl stateFlowImpl2 = this.f27487j0;
            boolean zBooleanValue = ((Boolean) stateFlowImpl2.getValue()).booleanValue();
            StateFlowImpl stateFlowImpl3 = this.f27484i0;
            if (zBooleanValue) {
                stateFlowImpl3.setValue(stateFlowImpl.getValue());
            }
            int iIntValue = ((Number) stateFlowImpl3.getValue()).intValue();
            int i12 = i10 - 1;
            C7570d c7570d = null;
            if (iIntValue == i12 && ((Boolean) stateFlowImpl2.getValue()).booleanValue()) {
                this.f27414M.m15505b(null, "Did Page");
                mo9722H1(TooltipStep.SentenceMode);
                mo9722H1(TooltipStep.SwipePageHighlight);
            }
            stateFlowImpl.setValue(Integer.valueOf(i10));
            mo9724L();
            StateFlowImpl stateFlowImpl4 = this.f27424P0;
            boolean z11 = false;
            if (i10 >= 0 && i10 < ((List) stateFlowImpl4.getValue()).size()) {
                if (z10) {
                    C7567a c7567a = (C7567a) ((List) stateFlowImpl4.getValue()).get(i10);
                    List<C7570d> list2 = c7567a.f41703c;
                    C7570d c7570d2 = (C7570d) C6752c.m13425S(list2);
                    if (((List) stateFlowImpl4.getValue()).size() > 1 && i12 >= 0) {
                        c7570d = (C7570d) C6752c.m13433a0(((C7567a) ((List) stateFlowImpl4.getValue()).get(i12)).f41703c);
                    }
                    if (c7570d2 != null) {
                        int i13 = 1;
                        while (true) {
                            list = c7567a.f41703c;
                            int size = list.size() - 1;
                            i11 = c7570d2.f41727g;
                            if (i13 >= size || list2.get(i13).f41727g > i11) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                        if (i13 >= list.size()) {
                            m10143p2(list2.get(i13 - 1).f41726f);
                        } else {
                            if (c7570d != null && i11 == c7570d.f41727g) {
                                z11 = true;
                            }
                            if (z11) {
                                m10143p2(list2.get(i13).f41726f);
                            } else {
                                m10143p2(list2.get(i13 - 1).f41726f);
                            }
                        }
                    }
                }
                m10145r2(i10);
            }
            mo10065z();
        }
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: G */
    public final InterfaceC7142w<List<PlayerContentController.PlayerContentItem>> mo9396G() {
        return this.f27438U.mo9396G();
    }

    @Override // sh.InterfaceC9010f
    /* JADX INFO: renamed from: G0 */
    public final InterfaceC7116c<Integer> mo10140G0() {
        return this.f27444W.mo10140G0();
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: G1 */
    public final void mo9772G1(String str) {
        this.f27456a0.mo9772G1(str);
    }

    /* JADX INFO: renamed from: G2 */
    public final void m10141G2(AbstractC4267a abstractC4267a) {
        C5207g.m11111f(abstractC4267a, "state");
        InterfaceC7133n<AbstractC4267a> interfaceC7133nMo9398I1 = mo9398I1();
        while (!interfaceC7133nMo9398I1.mo14366c(interfaceC7133nMo9398I1.getValue(), abstractC4267a)) {
        }
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: H0 */
    public final InterfaceC7137r<String> mo10027H0() {
        return this.f27435T.mo10027H0();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: H1 */
    public final void mo9722H1(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "tooltipStep");
        this.f27459b0.mo9722H1(tooltipStep);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: I */
    public final void mo9723I(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        this.f27459b0.mo9723I(tooltipStep);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: I0 */
    public final void mo10028I0(TokenRelatedPhrase tokenRelatedPhrase, int i10, int i11, int i12) {
        this.f27435T.mo10028I0(tokenRelatedPhrase, i10, i11, i12);
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: I1 */
    public final InterfaceC7133n<AbstractC4267a> mo9398I1() {
        return this.f27438U.mo9398I1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f27432S.mo499J(profile, interfaceC9968c);
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: J0 */
    public final InterfaceC7133n<C3296a> mo9399J0() {
        return this.f27438U.mo9399J0();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: L */
    public final void mo9724L() {
        this.f27459b0.mo9724L();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: L0 */
    public final InterfaceC7137r<String> mo10029L0() {
        return this.f27435T.mo10029L0();
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: L1 */
    public final void mo9401L1(List<PlayerContentController.PlayerContentItem> list) {
        C5207g.m11111f(list, "tracks");
        this.f27438U.mo9401L1(list);
    }

    @Override // p244lh.InterfaceC7364a
    /* JADX INFO: renamed from: N */
    public final void mo9402N(AppUsageType appUsageType) {
        C5207g.m11111f(appUsageType, "appUsageType");
        this.f27462c0.mo9402N(appUsageType);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: N0 */
    public final void mo10030N0(String str) {
        this.f27435T.mo10030N0(str);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: N1 */
    public final InterfaceC7137r<TokenData> mo10031N1() {
        return this.f27435T.mo10031N1();
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: O0 */
    public final void mo9403O0(String str, int i10, double d10) {
        C5207g.m11111f(str, "language");
        this.f27438U.mo9403O0(str, i10, d10);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f27432S.mo500P();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: P1 */
    public final void mo10032P1(int i10) {
        this.f27435T.mo10032P1(i10);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: Q1 */
    public final void mo10033Q1(boolean z10, boolean z11) {
        this.f27435T.mo10033Q1(z10, z11);
    }

    @Override // sh.InterfaceC9013i
    /* JADX INFO: renamed from: R1 */
    public final InterfaceC7142w<PlayingFrom> mo9726R1() {
        return this.f27441V.mo9726R1();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: S */
    public final InterfaceC7137r<Integer> mo10034S() {
        return this.f27435T.mo10034S();
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: S0 */
    public final InterfaceC7116c<UpgradeReason> mo9773S0() {
        return this.f27456a0.mo9773S0();
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: S1 */
    public final Object mo9405S1(DownloadItem downloadItem, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f27447X.mo9405S1(downloadItem, interfaceC9968c);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: T0 */
    public final void mo9727T0() {
        this.f27459b0.mo9727T0();
    }

    @Override // sh.InterfaceC9010f
    /* JADX INFO: renamed from: U0 */
    public final Object mo10142U0(int i10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f27444W.mo10142U0(i10, interfaceC9968c);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: U1 */
    public final InterfaceC7137r<TokenData> mo10035U1() {
        return this.f27435T.mo10035U1();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: V */
    public final InterfaceC7137r<TokenRelatedPhrase> mo10036V() {
        return this.f27435T.mo10036V();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: V0 */
    public final void mo10037V0(TokenMeaning tokenMeaning) {
        this.f27435T.mo10037V0(tokenMeaning);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: W1 */
    public final InterfaceC7137r<C9072e> mo10038W1() {
        return this.f27435T.mo10038W1();
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: X */
    public final InterfaceC7116c<String> mo9774X() {
        return this.f27456a0.mo9774X();
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: X0 */
    public final void mo9406X0(DownloadItem downloadItem, boolean z10) {
        this.f27447X.mo9406X0(downloadItem, z10);
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: X1 */
    public final Object mo9407X1(String str, List<Pair<String, Integer>> list, int i10, boolean z10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f27447X.mo9407X1(str, list, i10, false, interfaceC9968c);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: Y */
    public final InterfaceC7137r<TokenData> mo10039Y() {
        return this.f27435T.mo10039Y();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: Y1 */
    public final void mo9729Y1() {
        this.f27459b0.mo9729Y1();
    }

    @Override // p244lh.InterfaceC7367d
    /* JADX INFO: renamed from: a */
    public final InterfaceC7133n<Boolean> mo9322a() {
        return this.f27450Y.mo9322a();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: a1 */
    public final void mo9730a1() {
        this.f27459b0.mo9730a1();
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: a2 */
    public final InterfaceC7137r<AbstractC3312a<DownloadItem>> mo9409a2() {
        return this.f27447X.mo9409a2();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: b */
    public final void mo10041b() {
        this.f27435T.mo10041b();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: b0 */
    public final void mo9731b0(boolean z10) {
        this.f27459b0.mo9731b0(z10);
    }

    @Override // sh.InterfaceC9013i
    /* JADX INFO: renamed from: b1 */
    public final void mo9732b1() {
        this.f27441V.mo9732b1();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: b2 */
    public final InterfaceC7137r<C9072e> mo10042b2() {
        return this.f27435T.mo10042b2();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: c1 */
    public final InterfaceC7137r<Boolean> mo10043c1() {
        return this.f27435T.mo10043c1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f27432S.mo501d(str, interfaceC9968c);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: d2 */
    public final InterfaceC7137r<C9072e> mo10044d2() {
        return this.f27435T.mo10044d2();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: e0 */
    public final void mo10045e0() {
        this.f27435T.mo10045e0();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f27432S;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f27432S.mo503f1(interfaceC9968c);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: f2 */
    public final void mo10048f2(TokenData tokenData) {
        this.f27435T.mo10048f2(tokenData);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: g */
    public final void mo10049g() {
        this.f27435T.mo10049g();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: g0 */
    public final InterfaceC7116c<List<TooltipStep>> mo9733g0() {
        return this.f27459b0.mo9733g0();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: g2 */
    public final void mo9734g2(TooltipStep tooltipStep, Rect rect, Rect rect2, boolean z10, boolean z11, boolean z12, InterfaceC2041a<C9072e> interfaceC2041a) {
        C5207g.m11111f(tooltipStep, "step");
        C5207g.m11111f(rect, "viewRect");
        C5207g.m11111f(rect2, "tooltipRect");
        C5207g.m11111f(interfaceC2041a, "action");
        this.f27459b0.mo9734g2(tooltipStep, rect, rect2, z10, z11, z12, interfaceC2041a);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: h */
    public final InterfaceC7142w<Boolean> mo9735h() {
        return this.f27459b0.mo9735h();
    }

    @Override // p244lh.InterfaceC7367d
    /* JADX INFO: renamed from: h2 */
    public final void mo9324h2(C7794b c7794b) {
        this.f27450Y.mo9324h2(c7794b);
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: i0 */
    public final InterfaceC7116c<C9072e> mo9775i0() {
        return this.f27456a0.mo9775i0();
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: i1 */
    public final void mo9412i1(ArrayList arrayList, String str) {
        C5207g.m11111f(str, "language");
        this.f27447X.mo9412i1(arrayList, str);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: j */
    public final InterfaceC7137r<C9072e> mo10051j() {
        return this.f27435T.mo10051j();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: j0 */
    public final void mo9736j0() {
        this.f27459b0.mo9736j0();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f27432S.mo504j1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: k0 */
    public final InterfaceC7116c<TooltipStep> mo9737k0() {
        return this.f27459b0.mo9737k0();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: k1 */
    public final InterfaceC7116c<C9072e> mo9738k1() {
        return this.f27459b0.mo9738k1();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: l */
    public final InterfaceC7137r<C9072e> mo10053l() {
        return this.f27435T.mo10053l();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f27432S.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f27432S.mo506l1();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: m */
    public final InterfaceC7137r<TokenMeaning> mo10054m() {
        return this.f27435T.mo10054m();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: o0 */
    public final void mo10057o0(TokenMeaning tokenMeaning, String str) {
        this.f27435T.mo10057o0(tokenMeaning, str);
    }

    @Override // sh.InterfaceC9013i
    /* JADX INFO: renamed from: p */
    public final InterfaceC7116c<C9072e> mo9740p() {
        return this.f27441V.mo9740p();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: p0 */
    public final boolean mo9741p0(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        return this.f27459b0.mo9741p0(tooltipStep);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f27432S.mo507p1();
    }

    /* JADX INFO: renamed from: p2 */
    public final void m10143p2(int i10) {
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new LessonViewModel$bookmarkLesson$1(this, i10, null), 3);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: q1 */
    public final InterfaceC7137r<Pair<TokenMeaning, String>> mo10060q1() {
        return this.f27435T.mo10060q1();
    }

    /* JADX INFO: renamed from: q2 */
    public final void m10144q2(int i10, List<C6052c> list) {
        Object value;
        C5207g.m11111f(list, "cards");
        StateFlowImpl stateFlowImpl = this.f27461b2;
        LinkedHashMap linkedHashMapM13467T0 = C6753d.m13467T0((Map) stateFlowImpl.getValue());
        Integer numValueOf = Integer.valueOf(i10);
        ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String str = ((C6052c) it.next()).f35735a;
            Locale locale = this.f27495m0;
            C5207g.m11110e(locale, "locale");
            arrayList.add(C7793a.m15502f(str, locale));
        }
        linkedHashMapM13467T0.put(numValueOf, arrayList);
        do {
            value = stateFlowImpl.getValue();
        } while (!stateFlowImpl.mo14366c(value, linkedHashMapM13467T0));
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: r */
    public final void mo10062r(String str) {
        this.f27435T.mo10062r(str);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: r0 */
    public final InterfaceC7116c<TooltipStep> mo9743r0() {
        return this.f27459b0.mo9743r0();
    }

    /* JADX INFO: renamed from: r2 */
    public final void m10145r2(int i10) {
        C7499b.m14933c0(C8573r0.m16767w0(this), this.f27426Q, this.f27423P, C0166e.m761g("cards ", i10), new LessonViewModel$cardsForPage$1(this, i10, null));
    }

    @Override // p244lh.InterfaceC7366c
    /* JADX INFO: renamed from: s */
    public final Object mo9326s(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f27453Z.mo9326s(interfaceC9968c);
    }

    /* JADX INFO: renamed from: s2 */
    public final void m10146s2() {
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new LessonViewModel$completeLesson$1(this, null), 3);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: t0 */
    public final void mo10064t0(TokenData tokenData) {
        C5207g.m11111f(tokenData, "updateTokenData");
        this.f27435T.mo10064t0(tokenData);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f27432S.mo508t1();
    }

    /* JADX INFO: renamed from: t2 */
    public final int m10147t2() {
        return ((Number) this.f27478g0.getValue()).intValue();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: u */
    public final InterfaceC7116c<C6343f> mo9744u() {
        return this.f27459b0.mo9744u();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: u0 */
    public final void mo9745u0(boolean z10) {
        this.f27459b0.mo9745u0(z10);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0223 A[Catch: Exception -> 0x0285, TryCatch #0 {Exception -> 0x0285, blocks: (B:3:0x0009, B:5:0x001f, B:6:0x002c, B:8:0x0046, B:9:0x0053, B:11:0x0068, B:12:0x0081, B:14:0x0089, B:21:0x009f, B:24:0x00a6, B:28:0x00af, B:30:0x00bb, B:32:0x00c8, B:34:0x00ce, B:36:0x00dd, B:37:0x00e1, B:39:0x00e8, B:41:0x00f5, B:44:0x00fc, B:52:0x010d, B:65:0x0136, B:67:0x013d, B:71:0x014c, B:73:0x0160, B:75:0x0178, B:77:0x0188, B:78:0x01a4, B:82:0x01b7, B:84:0x01bf, B:94:0x020d, B:107:0x026c, B:85:0x01c4, B:87:0x01cc, B:89:0x01de, B:91:0x01f1, B:96:0x0213, B:97:0x0216, B:99:0x021e, B:100:0x0223, B:102:0x022b, B:104:0x023d, B:106:0x0252, B:55:0x011c, B:47:0x0103), top: B:113:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x022b A[Catch: Exception -> 0x0285, TryCatch #0 {Exception -> 0x0285, blocks: (B:3:0x0009, B:5:0x001f, B:6:0x002c, B:8:0x0046, B:9:0x0053, B:11:0x0068, B:12:0x0081, B:14:0x0089, B:21:0x009f, B:24:0x00a6, B:28:0x00af, B:30:0x00bb, B:32:0x00c8, B:34:0x00ce, B:36:0x00dd, B:37:0x00e1, B:39:0x00e8, B:41:0x00f5, B:44:0x00fc, B:52:0x010d, B:65:0x0136, B:67:0x013d, B:71:0x014c, B:73:0x0160, B:75:0x0178, B:77:0x0188, B:78:0x01a4, B:82:0x01b7, B:84:0x01bf, B:94:0x020d, B:107:0x026c, B:85:0x01c4, B:87:0x01cc, B:89:0x01de, B:91:0x01f1, B:96:0x0213, B:97:0x0216, B:99:0x021e, B:100:0x0223, B:102:0x022b, B:104:0x023d, B:106:0x0252, B:55:0x011c, B:47:0x0103), top: B:113:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x010a  */
    /* JADX WARN: Code duplicated, block: B:61:0x012d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:63:0x0132  */
    /* JADX WARN: Code duplicated, block: B:65:0x0136 A[Catch: Exception -> 0x0285, TryCatch #0 {Exception -> 0x0285, blocks: (B:3:0x0009, B:5:0x001f, B:6:0x002c, B:8:0x0046, B:9:0x0053, B:11:0x0068, B:12:0x0081, B:14:0x0089, B:21:0x009f, B:24:0x00a6, B:28:0x00af, B:30:0x00bb, B:32:0x00c8, B:34:0x00ce, B:36:0x00dd, B:37:0x00e1, B:39:0x00e8, B:41:0x00f5, B:44:0x00fc, B:52:0x010d, B:65:0x0136, B:67:0x013d, B:71:0x014c, B:73:0x0160, B:75:0x0178, B:77:0x0188, B:78:0x01a4, B:82:0x01b7, B:84:0x01bf, B:94:0x020d, B:107:0x026c, B:85:0x01c4, B:87:0x01cc, B:89:0x01de, B:91:0x01f1, B:96:0x0213, B:97:0x0216, B:99:0x021e, B:100:0x0223, B:102:0x022b, B:104:0x023d, B:106:0x0252, B:55:0x011c, B:47:0x0103), top: B:113:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x014b  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:84:0x01bf A[Catch: Exception -> 0x0285, TryCatch #0 {Exception -> 0x0285, blocks: (B:3:0x0009, B:5:0x001f, B:6:0x002c, B:8:0x0046, B:9:0x0053, B:11:0x0068, B:12:0x0081, B:14:0x0089, B:21:0x009f, B:24:0x00a6, B:28:0x00af, B:30:0x00bb, B:32:0x00c8, B:34:0x00ce, B:36:0x00dd, B:37:0x00e1, B:39:0x00e8, B:41:0x00f5, B:44:0x00fc, B:52:0x010d, B:65:0x0136, B:67:0x013d, B:71:0x014c, B:73:0x0160, B:75:0x0178, B:77:0x0188, B:78:0x01a4, B:82:0x01b7, B:84:0x01bf, B:94:0x020d, B:107:0x026c, B:85:0x01c4, B:87:0x01cc, B:89:0x01de, B:91:0x01f1, B:96:0x0213, B:97:0x0216, B:99:0x021e, B:100:0x0223, B:102:0x022b, B:104:0x023d, B:106:0x0252, B:55:0x011c, B:47:0x0103), top: B:113:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01c4 A[Catch: Exception -> 0x0285, TryCatch #0 {Exception -> 0x0285, blocks: (B:3:0x0009, B:5:0x001f, B:6:0x002c, B:8:0x0046, B:9:0x0053, B:11:0x0068, B:12:0x0081, B:14:0x0089, B:21:0x009f, B:24:0x00a6, B:28:0x00af, B:30:0x00bb, B:32:0x00c8, B:34:0x00ce, B:36:0x00dd, B:37:0x00e1, B:39:0x00e8, B:41:0x00f5, B:44:0x00fc, B:52:0x010d, B:65:0x0136, B:67:0x013d, B:71:0x014c, B:73:0x0160, B:75:0x0178, B:77:0x0188, B:78:0x01a4, B:82:0x01b7, B:84:0x01bf, B:94:0x020d, B:107:0x026c, B:85:0x01c4, B:87:0x01cc, B:89:0x01de, B:91:0x01f1, B:96:0x0213, B:97:0x0216, B:99:0x021e, B:100:0x0223, B:102:0x022b, B:104:0x023d, B:106:0x0252, B:55:0x011c, B:47:0x0103), top: B:113:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01cc A[Catch: Exception -> 0x0285, TryCatch #0 {Exception -> 0x0285, blocks: (B:3:0x0009, B:5:0x001f, B:6:0x002c, B:8:0x0046, B:9:0x0053, B:11:0x0068, B:12:0x0081, B:14:0x0089, B:21:0x009f, B:24:0x00a6, B:28:0x00af, B:30:0x00bb, B:32:0x00c8, B:34:0x00ce, B:36:0x00dd, B:37:0x00e1, B:39:0x00e8, B:41:0x00f5, B:44:0x00fc, B:52:0x010d, B:65:0x0136, B:67:0x013d, B:71:0x014c, B:73:0x0160, B:75:0x0178, B:77:0x0188, B:78:0x01a4, B:82:0x01b7, B:84:0x01bf, B:94:0x020d, B:107:0x026c, B:85:0x01c4, B:87:0x01cc, B:89:0x01de, B:91:0x01f1, B:96:0x0213, B:97:0x0216, B:99:0x021e, B:100:0x0223, B:102:0x022b, B:104:0x023d, B:106:0x0252, B:55:0x011c, B:47:0x0103), top: B:113:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x020d A[Catch: Exception -> 0x0285, TryCatch #0 {Exception -> 0x0285, blocks: (B:3:0x0009, B:5:0x001f, B:6:0x002c, B:8:0x0046, B:9:0x0053, B:11:0x0068, B:12:0x0081, B:14:0x0089, B:21:0x009f, B:24:0x00a6, B:28:0x00af, B:30:0x00bb, B:32:0x00c8, B:34:0x00ce, B:36:0x00dd, B:37:0x00e1, B:39:0x00e8, B:41:0x00f5, B:44:0x00fc, B:52:0x010d, B:65:0x0136, B:67:0x013d, B:71:0x014c, B:73:0x0160, B:75:0x0178, B:77:0x0188, B:78:0x01a4, B:82:0x01b7, B:84:0x01bf, B:94:0x020d, B:107:0x026c, B:85:0x01c4, B:87:0x01cc, B:89:0x01de, B:91:0x01f1, B:96:0x0213, B:97:0x0216, B:99:0x021e, B:100:0x0223, B:102:0x022b, B:104:0x023d, B:106:0x0252, B:55:0x011c, B:47:0x0103), top: B:113:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0211 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0213 A[Catch: Exception -> 0x0285, TryCatch #0 {Exception -> 0x0285, blocks: (B:3:0x0009, B:5:0x001f, B:6:0x002c, B:8:0x0046, B:9:0x0053, B:11:0x0068, B:12:0x0081, B:14:0x0089, B:21:0x009f, B:24:0x00a6, B:28:0x00af, B:30:0x00bb, B:32:0x00c8, B:34:0x00ce, B:36:0x00dd, B:37:0x00e1, B:39:0x00e8, B:41:0x00f5, B:44:0x00fc, B:52:0x010d, B:65:0x0136, B:67:0x013d, B:71:0x014c, B:73:0x0160, B:75:0x0178, B:77:0x0188, B:78:0x01a4, B:82:0x01b7, B:84:0x01bf, B:94:0x020d, B:107:0x026c, B:85:0x01c4, B:87:0x01cc, B:89:0x01de, B:91:0x01f1, B:96:0x0213, B:97:0x0216, B:99:0x021e, B:100:0x0223, B:102:0x022b, B:104:0x023d, B:106:0x0252, B:55:0x011c, B:47:0x0103), top: B:113:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x021e A[Catch: Exception -> 0x0285, TryCatch #0 {Exception -> 0x0285, blocks: (B:3:0x0009, B:5:0x001f, B:6:0x002c, B:8:0x0046, B:9:0x0053, B:11:0x0068, B:12:0x0081, B:14:0x0089, B:21:0x009f, B:24:0x00a6, B:28:0x00af, B:30:0x00bb, B:32:0x00c8, B:34:0x00ce, B:36:0x00dd, B:37:0x00e1, B:39:0x00e8, B:41:0x00f5, B:44:0x00fc, B:52:0x010d, B:65:0x0136, B:67:0x013d, B:71:0x014c, B:73:0x0160, B:75:0x0178, B:77:0x0188, B:78:0x01a4, B:82:0x01b7, B:84:0x01bf, B:94:0x020d, B:107:0x026c, B:85:0x01c4, B:87:0x01cc, B:89:0x01de, B:91:0x01f1, B:96:0x0213, B:97:0x0216, B:99:0x021e, B:100:0x0223, B:102:0x022b, B:104:0x023d, B:106:0x0252, B:55:0x011c, B:47:0x0103), top: B:113:0x0009 }] */
    /* JADX INFO: renamed from: u2 */
    public final TokenFragmentData m10148u2(int i10, List<C7570d> list) {
        Object next;
        String str;
        int i11;
        int size;
        int size2;
        boolean z10;
        C5207g.m11111f(list, "tokens");
        try {
            List list2 = (List) this.f27424P0.getValue();
            ArrayList<C7570d> arrayList = new ArrayList();
            int i12 = i10 - 1;
            if (i12 >= 0) {
                arrayList.addAll(((C7567a) list2.get(i12)).f41703c);
            }
            arrayList.addAll(((C7567a) list2.get(i10)).f41703c);
            int i13 = i10 + 1;
            if (i13 < list2.size() - 1) {
                arrayList.addAll(((C7567a) list2.get(i13)).f41703c);
            }
            ArrayList arrayList2 = new ArrayList();
            StringBuilder sb2 = new StringBuilder();
            if (!list.isEmpty()) {
                C7570d c7570d = (C7570d) C6752c.m13423Q(list);
                int i14 = c7570d.f41727g;
                Iterator it = ((Iterable) this.f27415M0.getValue()).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((LessonStudySentence) next).f21861d == i14));
                LessonStudySentence lessonStudySentence = (LessonStudySentence) next;
                String strSubstring = "";
                if (lessonStudySentence == null || (str = lessonStudySentence.f21859b) == null) {
                    str = strSubstring;
                }
                int i15 = c7570d.f41728h;
                int i16 = list.size() > 1 ? ((C7570d) C6752c.m13423Q(list)).f41728h : -1;
                int i17 = list.size() > 1 ? ((C7570d) C6752c.m13432Z(list)).f41728h : -1;
                for (C7570d c7570d2 : arrayList) {
                    if (c7570d2.f41727g == i14) {
                        arrayList2.add(c7570d2);
                    }
                }
                if (i16 == -1) {
                    i11 = (i15 - 1) - 4;
                    if (i11 <= 0) {
                        i11 = 0;
                    }
                } else {
                    i11 = (i16 - 1) - 4;
                    if (i11 <= 0) {
                        i11 = 0;
                    }
                }
                if (i17 == -1) {
                    size2 = arrayList2.size() - 1;
                    size = (i15 - 1) + 4;
                    if (size2 > size) {
                    }
                    if (i11 >= 0 || i11 >= size2) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10 && size2 < arrayList2.size()) {
                        if (((C7570d) arrayList2.get(i11)).f41723c >= 0 && ((C7570d) arrayList2.get(i11)).f41723c < ((C7570d) arrayList2.get(size2)).f41724d && ((C7570d) arrayList2.get(size2)).f41724d > ((C7570d) arrayList2.get(i11)).f41723c && ((C7570d) arrayList2.get(size2)).f41724d <= str.length()) {
                            strSubstring = str.substring(((C7570d) arrayList2.get(i11)).f41723c, ((C7570d) arrayList2.get(size2)).f41724d);
                            C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        }
                        sb2.append(strSubstring);
                        if (C5408a.m11572e(mo498E1())) {
                            if (size2 < arrayList2.size() - 1) {
                                sb2.insert(0, "...");
                            } else if (size2 == arrayList2.size() - 1 && ((C7570d) arrayList2.get(size2)).f41724d < str.length() && ((C7570d) arrayList2.get(size2)).f41724d - 1 != str.length() - 1) {
                                String strSubstring2 = str.substring(((C7570d) arrayList2.get(size2)).f41724d, str.length());
                                C5207g.m11110e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                sb2.append(strSubstring2);
                            }
                            if (i11 > 0) {
                                sb2.append("...");
                            }
                        } else {
                            if (i11 > 0) {
                                sb2.insert(0, "...");
                            }
                            if (size2 < arrayList2.size() - 1) {
                                sb2.append("...");
                            } else if (size2 == arrayList2.size() - 1 && ((C7570d) arrayList2.get(size2)).f41724d < str.length() && ((C7570d) arrayList2.get(size2)).f41724d - 1 != str.length() - 1) {
                                String strSubstring3 = str.substring(((C7570d) arrayList2.get(size2)).f41724d, str.length());
                                C5207g.m11110e(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                                sb2.append(strSubstring3);
                            }
                        }
                        String string = sb2.toString();
                        C5207g.m11110e(string, "fragmentBuilt.toString()");
                        return new TokenFragmentData(C7076b.m14277B3(string).toString(), i15);
                    }
                } else {
                    size = arrayList2.size() - 1;
                    size2 = (i17 - 1) + 4;
                    if (size > size2) {
                    }
                    if (i11 >= 0) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        if (((C7570d) arrayList2.get(i11)).f41723c >= 0) {
                            strSubstring = str.substring(((C7570d) arrayList2.get(i11)).f41723c, ((C7570d) arrayList2.get(size2)).f41724d);
                            C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        }
                        sb2.append(strSubstring);
                        if (C5408a.m11572e(mo498E1())) {
                            if (size2 < arrayList2.size() - 1) {
                                sb2.insert(0, "...");
                            } else if (size2 == arrayList2.size() - 1) {
                                String strSubstring4 = str.substring(((C7570d) arrayList2.get(size2)).f41724d, str.length());
                                C5207g.m11110e(strSubstring4, "this as java.lang.String…ing(startIndex, endIndex)");
                                sb2.append(strSubstring4);
                            }
                            if (i11 > 0) {
                                sb2.append("...");
                            }
                        } else {
                            if (i11 > 0) {
                                sb2.insert(0, "...");
                            }
                            if (size2 < arrayList2.size() - 1) {
                                sb2.append("...");
                            } else if (size2 == arrayList2.size() - 1) {
                                String strSubstring5 = str.substring(((C7570d) arrayList2.get(size2)).f41724d, str.length());
                                C5207g.m11110e(strSubstring5, "this as java.lang.String…ing(startIndex, endIndex)");
                                sb2.append(strSubstring5);
                            }
                        }
                        String string2 = sb2.toString();
                        C5207g.m11110e(string2, "fragmentBuilt.toString()");
                        return new TokenFragmentData(C7076b.m14277B3(string2).toString(), i15);
                    }
                }
                size2 = size;
                if (i11 >= 0) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (((C7570d) arrayList2.get(i11)).f41723c >= 0) {
                        strSubstring = str.substring(((C7570d) arrayList2.get(i11)).f41723c, ((C7570d) arrayList2.get(size2)).f41724d);
                        C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    sb2.append(strSubstring);
                    if (C5408a.m11572e(mo498E1())) {
                        if (size2 < arrayList2.size() - 1) {
                            sb2.insert(0, "...");
                        } else if (size2 == arrayList2.size() - 1) {
                            String strSubstring6 = str.substring(((C7570d) arrayList2.get(size2)).f41724d, str.length());
                            C5207g.m11110e(strSubstring6, "this as java.lang.String…ing(startIndex, endIndex)");
                            sb2.append(strSubstring6);
                        }
                        if (i11 > 0) {
                            sb2.append("...");
                        }
                    } else {
                        if (i11 > 0) {
                            sb2.insert(0, "...");
                        }
                        if (size2 < arrayList2.size() - 1) {
                            sb2.append("...");
                        } else if (size2 == arrayList2.size() - 1) {
                            String strSubstring7 = str.substring(((C7570d) arrayList2.get(size2)).f41724d, str.length());
                            C5207g.m11110e(strSubstring7, "this as java.lang.String…ing(startIndex, endIndex)");
                            sb2.append(strSubstring7);
                        }
                    }
                    String string3 = sb2.toString();
                    C5207g.m11110e(string3, "fragmentBuilt.toString()");
                    return new TokenFragmentData(C7076b.m14277B3(string3).toString(), i15);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            C6041e.m12476a().m12477b(e10);
        }
        return new TokenFragmentData(0);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: v1 */
    public final boolean mo9746v1(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        return this.f27459b0.mo9746v1(tooltipStep);
    }

    /* JADX INFO: renamed from: v2 */
    public final boolean m10149v2(int i10) {
        Object next;
        Iterator it = ((Iterable) this.f27519y0.getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((LibraryItemCounter) next).f22004a == i10));
        LibraryItemCounter libraryItemCounter = (LibraryItemCounter) next;
        if ((libraryItemCounter == null || libraryItemCounter.f22009f) ? false : true) {
            LessonStudy lessonStudy = (LessonStudy) this.f27517x0.getValue();
            if ((lessonStudy != null ? lessonStudy.f21840z : 0) > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f27432S.mo509w0();
    }

    @Override // p244lh.InterfaceC7367d
    /* JADX INFO: renamed from: w1 */
    public final InterfaceC7116c<C7794b> mo9325w1() {
        return this.f27450Y.mo9325w1();
    }

    /* JADX INFO: renamed from: w2 */
    public final boolean m10150w2() {
        return ((Boolean) this.f27503q0.getValue()).booleanValue();
    }

    @Override // p244lh.InterfaceC7364a
    /* JADX INFO: renamed from: x */
    public final void mo9421x(AppUsageType appUsageType) {
        C5207g.m11111f(appUsageType, "appUsageType");
        this.f27462c0.mo9421x(appUsageType);
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: x0 */
    public final Object mo9422x0(DownloadItem downloadItem, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f27447X.mo9422x0(downloadItem, interfaceC9968c);
    }

    /* JADX INFO: renamed from: x2 */
    public final boolean m10151x2() {
        return ((Boolean) this.f27474f0.getValue()).booleanValue();
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: y */
    public final InterfaceC7133n<C3297b> mo9423y() {
        return this.f27438U.mo9423y();
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: y0 */
    public final InterfaceC7133n<C3300e> mo9424y0() {
        return this.f27438U.mo9424y0();
    }

    /* JADX INFO: renamed from: y2 */
    public final int m10152y2() {
        return ((Number) this.f27470e0.getValue()).intValue();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: z */
    public final void mo10065z() {
        this.f27435T.mo10065z();
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: z0 */
    public final InterfaceC7133n<Triple<PlayerContentController.PlayerContentItem, Boolean, Integer>> mo9425z0() {
        return this.f27438U.mo9425z0();
    }

    @Override // sh.InterfaceC9013i
    /* JADX INFO: renamed from: z1 */
    public final void mo9747z1(int i10, long j10, boolean z10) {
        this.f27441V.mo9747z1(i10, j10, z10);
    }

    /* JADX INFO: renamed from: z2 */
    public final void m10153z2(int i10) {
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new LessonViewModel$movePageToKnown$1(this, i10, null), 3);
    }
}
