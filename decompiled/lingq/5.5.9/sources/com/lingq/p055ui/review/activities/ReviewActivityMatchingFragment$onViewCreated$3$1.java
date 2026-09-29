package com.lingq.p055ui.review.activities;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.review.views.speaking.MatchPairView;
import com.lingq.shared.uimodel.token.TokenMeaning;
import com.lingq.util.C4924a;
import java.util.ArrayList;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import li.C7374a;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import p513yj.C10399a;
import ph.C8305j1;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivityMatchingFragment$onViewCreated$3$1", m19206f = "ReviewActivityMatchingFragment.kt", m19207l = {69}, m19208m = "invokeSuspend")
public final class ReviewActivityMatchingFragment$onViewCreated$3$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29831e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ReviewActivityMatchingFragment f29832f;

    /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivityMatchingFragment$onViewCreated$3$1$2 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lli/a;", "cards", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivityMatchingFragment$onViewCreated$3$1$2", m19206f = "ReviewActivityMatchingFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C45812 extends SuspendLambda implements InterfaceC2056p<List<? extends C7374a>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f29833e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ReviewActivityMatchingFragment f29834f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45812(ReviewActivityMatchingFragment reviewActivityMatchingFragment, InterfaceC9968c<? super C45812> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f29834f = reviewActivityMatchingFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C45812 c45812 = new C45812(this.f29834f, interfaceC9968c);
            c45812.f29833e = obj;
            return c45812;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends C7374a> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C45812) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            String str;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            ArrayList<C7374a> arrayListM13454v0 = C6752c.m13454v0((List) this.f29833e);
            while (arrayListM13454v0.size() < 3) {
                arrayListM13454v0.add(C6752c.m13423Q(arrayListM13454v0));
            }
            InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewActivityMatchingFragment.f29817D0;
            ReviewActivityMatchingFragment reviewActivityMatchingFragment = this.f29834f;
            reviewActivityMatchingFragment.getClass();
            MatchPairView matchPairView = ((C8305j1) reviewActivityMatchingFragment.f29818A0.m10489a(reviewActivityMatchingFragment, ReviewActivityMatchingFragment.f29817D0[0])).f44909a;
            ArrayList arrayList = new ArrayList(C9325m.m17681z(arrayListM13454v0, 10));
            for (C7374a c7374a : arrayListM13454v0) {
                String str2 = c7374a.f41142a;
                List<String> list = c7374a.f41144c;
                if (list.isEmpty()) {
                    list = c7374a.f41143b;
                }
                String strM10452c = C4924a.m10452c(list, str2);
                TokenMeaning tokenMeaning = (TokenMeaning) C6752c.m13425S(c7374a.f41146e);
                if (tokenMeaning == null || (str = tokenMeaning.f22090c) == null) {
                    str = "";
                }
                arrayList.add(new C10399a(strM10452c, str));
            }
            matchPairView.setup(arrayList);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityMatchingFragment$onViewCreated$3$1(ReviewActivityMatchingFragment reviewActivityMatchingFragment, InterfaceC9968c<? super ReviewActivityMatchingFragment$onViewCreated$3$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29832f = reviewActivityMatchingFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ReviewActivityMatchingFragment$onViewCreated$3$1(this.f29832f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ReviewActivityMatchingFragment$onViewCreated$3$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29831e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            ReviewActivityMatchingFragment reviewActivityMatchingFragment = this.f29832f;
            final C7135p c7135p = ((ReviewActivityMatchingViewModel) reviewActivityMatchingFragment.f29819B0.getValue()).f29861j;
            InterfaceC7116c<List<? extends C7374a>> interfaceC7116c = new InterfaceC7116c<List<? extends C7374a>>() { // from class: com.lingq.ui.review.activities.ReviewActivityMatchingFragment$onViewCreated$3$1$invokeSuspend$$inlined$filterNot$1

                /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivityMatchingFragment$onViewCreated$3$1$invokeSuspend$$inlined$filterNot$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements InterfaceC7117d {

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ InterfaceC7117d f29836a;

                    /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivityMatchingFragment$onViewCreated$3$1$invokeSuspend$$inlined$filterNot$1$2$1, reason: invalid class name */
                    @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                    @InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivityMatchingFragment$onViewCreated$3$1$invokeSuspend$$inlined$filterNot$1$2", m19206f = "ReviewActivityMatchingFragment.kt", m19207l = {223}, m19208m = "emit")
                    public static final class AnonymousClass1 extends ContinuationImpl {

                        /* JADX INFO: renamed from: d */
                        public /* synthetic */ Object f29837d;

                        /* JADX INFO: renamed from: e */
                        public int f29838e;

                        public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                            super(interfaceC9968c);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /* JADX INFO: renamed from: x */
                        public final Object mo1338x(Object obj) {
                            this.f29837d = obj;
                            this.f29838e |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.mo1339r(null, this);
                        }
                    }

                    public AnonymousClass2(InterfaceC7117d interfaceC7117d) {
                        this.f29836a = interfaceC7117d;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
                    @Override // kotlinx.coroutines.flow.InterfaceC7117d
                    /* JADX INFO: renamed from: r */
                    public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                        AnonymousClass1 anonymousClass1;
                        if (interfaceC9968c instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                            int i10 = anonymousClass1.f29838e;
                            if ((i10 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.f29838e = i10 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                        Object obj2 = anonymousClass1.f29837d;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i11 = anonymousClass1.f29838e;
                        if (i11 == 0) {
                            C7499b.m14977z0(obj2);
                            if (!((List) obj).isEmpty()) {
                                anonymousClass1.f29838e = 1;
                                if (this.f29836a.mo1339r(obj, anonymousClass1) == coroutineSingletons) {
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
                public final Object mo9539a(InterfaceC7117d<? super List<? extends C7374a>> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                    Object objMo9539a = c7135p.mo9539a(new AnonymousClass2(interfaceC7117d), interfaceC9968c);
                    return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
                }
            };
            C45812 c45812 = new C45812(reviewActivityMatchingFragment, null);
            this.f29831e = 1;
            if (C0062b.m369m0(interfaceC7116c, c45812, this) == coroutineSingletons) {
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
