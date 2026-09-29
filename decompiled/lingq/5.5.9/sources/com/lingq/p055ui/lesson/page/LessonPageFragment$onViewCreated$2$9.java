package com.lingq.p055ui.lesson.page;

import ae.C0062b;
import android.graphics.Rect;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.lesson.LessonViewModel;
import com.lingq.p055ui.lesson.data.TokenFragmentData;
import com.lingq.p055ui.token.TokenData;
import com.lingq.p055ui.upgrade.UpgradeReason;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.uimodel.token.TokenType;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7116c;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p265mj.C7570d;
import p385sf.C9000b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$9", m19206f = "LessonPageFragment.kt", m19207l = {497}, m19208m = "invokeSuspend")
public final class LessonPageFragment$onViewCreated$2$9 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28496e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonPageFragment f28497f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$9$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/ui/lesson/page/LessonPageViewModel$a;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$9$1", m19206f = "LessonPageFragment.kt", m19207l = {514}, m19208m = "invokeSuspend")
    public static final class C43691 extends SuspendLambda implements InterfaceC2056p<LessonPageViewModel.C4373a, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f28498e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f28499f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ LessonPageFragment f28500g;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$9$1$a */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f28501a;

            static {
                int[] iArr = new int[TokenType.values().length];
                try {
                    iArr[TokenType.CardType.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TokenType.WordType.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TokenType.NewWordOrPhraseType.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f28501a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43691(LessonPageFragment lessonPageFragment, InterfaceC9968c<? super C43691> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f28500g = lessonPageFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C43691 c43691 = new C43691(this.f28500g, interfaceC9968c);
            c43691.f28499f = obj;
            return c43691;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(LessonPageViewModel.C4373a c4373a, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C43691) mo1336a(c4373a, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0084  */
        /* JADX WARN: Code duplicated, block: B:30:0x009c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            Object objM14360a;
            LessonPageViewModel.C4373a c4373a;
            List<C7570d> listM17251q;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f28498e;
            LessonPageFragment lessonPageFragment = this.f28500g;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                LessonPageViewModel.C4373a c4373a2 = (LessonPageViewModel.C4373a) this.f28499f;
                int i11 = a.f28501a[c4373a2.f28591b.ordinal()];
                if (i11 == 1) {
                    LessonPageFragment.C4337a c4337a = LessonPageFragment.f28335M0;
                    LessonViewModel lessonViewModelM10192s0 = lessonPageFragment.m10192s0();
                    int iM10147t2 = lessonPageFragment.m10192s0().m10147t2();
                    List<C7570d> listM17251q2 = c4373a2.f28592c;
                    boolean zIsEmpty = listM17251q2.isEmpty();
                    C7570d c7570d = c4373a2.f28590a;
                    if (zIsEmpty) {
                        listM17251q2 = C9000b.m17251q(c7570d);
                    }
                    TokenFragmentData tokenFragmentDataM10148u2 = lessonViewModelM10192s0.m10148u2(iM10147t2, listM17251q2);
                    lessonPageFragment.m10192s0().f27500o1.setValue(Boolean.TRUE);
                    Rect rectM10189p0 = lessonPageFragment.m10189p0(c7570d, false);
                    lessonPageFragment.m10192s0().f27435T.mo10048f2(new TokenData(c7570d.f41725e, TokenType.CardType, rectM10189p0.top, rectM10189p0.bottom, tokenFragmentDataM10148u2, null, null, null, c7570d.f41726f, c7570d.f41730j, 224));
                } else if (i11 == 2 || i11 == 3) {
                    LessonPageFragment.C4337a c4337a2 = LessonPageFragment.f28335M0;
                    InterfaceC7116c<ProfileAccount> interfaceC7116cMo508t1 = lessonPageFragment.m10192s0().mo508t1();
                    this.f28499f = c4373a2;
                    this.f28498e = 1;
                    objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo508t1, this);
                    if (objM14360a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    c4373a = c4373a2;
                }
                return C9072e.f47360a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c4373a = (LessonPageViewModel.C4373a) this.f28499f;
            C7499b.m14977z0(obj);
            objM14360a = obj;
            ProfileAccount profileAccount = (ProfileAccount) objM14360a;
            int i12 = profileAccount.f17809i;
            Integer num = profileAccount.f17808h;
            if (i12 >= (num != null ? num.intValue() : 0)) {
                LessonPageFragment.C4337a c4337a3 = LessonPageFragment.f28335M0;
                if (lessonPageFragment.m10192s0().mo502f0()) {
                    C7570d c7570d2 = c4373a.f28590a;
                    LessonPageFragment.C4337a c4337a4 = LessonPageFragment.f28335M0;
                    LessonViewModel lessonViewModelM10192s1 = lessonPageFragment.m10192s0();
                    int iM10147t3 = lessonPageFragment.m10192s0().m10147t2();
                    listM17251q = c4373a.f28592c;
                    if (listM17251q.isEmpty()) {
                        listM17251q = C9000b.m17251q(c4373a.f28590a);
                    }
                    TokenFragmentData tokenFragmentDataM10148u3 = lessonViewModelM10192s1.m10148u2(iM10147t3, listM17251q);
                    TokenType tokenType = c4373a.f28591b;
                    lessonPageFragment.m10192s0().f27500o1.setValue(Boolean.TRUE);
                    String str = c7570d2.f41725e;
                    Rect rectM10189p1 = lessonPageFragment.m10189p0(c7570d2, false);
                    lessonPageFragment.m10192s0().f27435T.mo10048f2(new TokenData(str, tokenType, rectM10189p1.top, rectM10189p1.bottom, tokenFragmentDataM10148u3, null, null, null, c7570d2.f41726f, c7570d2.f41730j, 224));
                } else {
                    lessonPageFragment.m10190q0();
                    lessonPageFragment.m10193t0().m10198g();
                    lessonPageFragment.m10192s0().mo9771A(UpgradeReason.LIMIT_WORDS);
                }
            } else {
                C7570d c7570d3 = c4373a.f28590a;
                LessonPageFragment.C4337a c4337a5 = LessonPageFragment.f28335M0;
                LessonViewModel lessonViewModelM10192s2 = lessonPageFragment.m10192s0();
                int iM10147t4 = lessonPageFragment.m10192s0().m10147t2();
                listM17251q = c4373a.f28592c;
                if (listM17251q.isEmpty()) {
                    listM17251q = C9000b.m17251q(c4373a.f28590a);
                }
                TokenFragmentData tokenFragmentDataM10148u4 = lessonViewModelM10192s2.m10148u2(iM10147t4, listM17251q);
                TokenType tokenType2 = c4373a.f28591b;
                lessonPageFragment.m10192s0().f27500o1.setValue(Boolean.TRUE);
                String str2 = c7570d3.f41725e;
                Rect rectM10189p2 = lessonPageFragment.m10189p0(c7570d3, false);
                lessonPageFragment.m10192s0().f27435T.mo10048f2(new TokenData(str2, tokenType2, rectM10189p2.top, rectM10189p2.bottom, tokenFragmentDataM10148u4, null, null, null, c7570d3.f41726f, c7570d3.f41730j, 224));
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPageFragment$onViewCreated$2$9(LessonPageFragment lessonPageFragment, InterfaceC9968c<? super LessonPageFragment$onViewCreated$2$9> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28497f = lessonPageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonPageFragment$onViewCreated$2$9(this.f28497f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonPageFragment$onViewCreated$2$9) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28496e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonPageFragment.C4337a c4337a = LessonPageFragment.f28335M0;
            LessonPageFragment lessonPageFragment = this.f28497f;
            LessonPageViewModel lessonPageViewModelM10193t0 = lessonPageFragment.m10193t0();
            C43691 c43691 = new C43691(lessonPageFragment, null);
            this.f28496e = 1;
            if (C0062b.m369m0(lessonPageViewModelM10193t0.f28565l0, c43691, this) == coroutineSingletons) {
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
