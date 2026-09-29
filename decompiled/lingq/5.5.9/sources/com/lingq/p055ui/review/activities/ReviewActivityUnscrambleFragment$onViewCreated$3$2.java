package com.lingq.p055ui.review.activities;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivityUnscrambleFragment$onViewCreated$3$2", m19206f = "ReviewActivityUnscrambleFragment.kt", m19207l = {99}, m19208m = "invokeSuspend")
public final class ReviewActivityUnscrambleFragment$onViewCreated$3$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f30086e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ReviewActivityUnscrambleFragment f30087f;

    /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivityUnscrambleFragment$onViewCreated$3$2$2 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "translation", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivityUnscrambleFragment$onViewCreated$3$2$2", m19206f = "ReviewActivityUnscrambleFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C46412 extends SuspendLambda implements InterfaceC2056p<String, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f30088e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ReviewActivityUnscrambleFragment f30089f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46412(ReviewActivityUnscrambleFragment reviewActivityUnscrambleFragment, InterfaceC9968c<? super C46412> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30089f = reviewActivityUnscrambleFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C46412 c46412 = new C46412(this.f30089f, interfaceC9968c);
            c46412.f30088e = obj;
            return c46412;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C46412) mo1336a(str, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            String str = (String) this.f30088e;
            InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewActivityUnscrambleFragment.f30068D0;
            this.f30089f.m10288o0().f45083a.setText(str);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityUnscrambleFragment$onViewCreated$3$2(ReviewActivityUnscrambleFragment reviewActivityUnscrambleFragment, InterfaceC9968c<? super ReviewActivityUnscrambleFragment$onViewCreated$3$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f30087f = reviewActivityUnscrambleFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ReviewActivityUnscrambleFragment$onViewCreated$3$2(this.f30087f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ReviewActivityUnscrambleFragment$onViewCreated$3$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30086e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewActivityUnscrambleFragment.f30068D0;
            ReviewActivityUnscrambleFragment reviewActivityUnscrambleFragment = this.f30087f;
            final C7135p c7135p = reviewActivityUnscrambleFragment.m10290q0().f30119J;
            InterfaceC7116c<String> interfaceC7116c = new InterfaceC7116c<String>() { // from class: com.lingq.ui.review.activities.ReviewActivityUnscrambleFragment$onViewCreated$3$2$invokeSuspend$$inlined$filterNot$1

                /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivityUnscrambleFragment$onViewCreated$3$2$invokeSuspend$$inlined$filterNot$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements InterfaceC7117d {

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ InterfaceC7117d f30091a;

                    /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivityUnscrambleFragment$onViewCreated$3$2$invokeSuspend$$inlined$filterNot$1$2$1, reason: invalid class name */
                    @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                    @InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivityUnscrambleFragment$onViewCreated$3$2$invokeSuspend$$inlined$filterNot$1$2", m19206f = "ReviewActivityUnscrambleFragment.kt", m19207l = {223}, m19208m = "emit")
                    public static final class AnonymousClass1 extends ContinuationImpl {

                        /* JADX INFO: renamed from: d */
                        public /* synthetic */ Object f30092d;

                        /* JADX INFO: renamed from: e */
                        public int f30093e;

                        public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                            super(interfaceC9968c);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /* JADX INFO: renamed from: x */
                        public final Object mo1338x(Object obj) {
                            this.f30092d = obj;
                            this.f30093e |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.mo1339r(null, this);
                        }
                    }

                    public AnonymousClass2(InterfaceC7117d interfaceC7117d) {
                        this.f30091a = interfaceC7117d;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
                    @Override // kotlinx.coroutines.flow.InterfaceC7117d
                    /* JADX INFO: renamed from: r */
                    public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                        AnonymousClass1 anonymousClass1;
                        if (interfaceC9968c instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                            int i10 = anonymousClass1.f30093e;
                            if ((i10 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.f30093e = i10 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                        Object obj2 = anonymousClass1.f30092d;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i11 = anonymousClass1.f30093e;
                        if (i11 == 0) {
                            C7499b.m14977z0(obj2);
                            if (!(((String) obj).length() == 0)) {
                                anonymousClass1.f30093e = 1;
                                if (this.f30091a.mo1339r(obj, anonymousClass1) == coroutineSingletons) {
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
                public final Object mo9539a(InterfaceC7117d<? super String> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                    Object objMo9539a = c7135p.mo9539a(new AnonymousClass2(interfaceC7117d), interfaceC9968c);
                    return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
                }
            };
            C46412 c46412 = new C46412(reviewActivityUnscrambleFragment, null);
            this.f30086e = 1;
            if (C0062b.m369m0(interfaceC7116c, c46412, this) == coroutineSingletons) {
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
