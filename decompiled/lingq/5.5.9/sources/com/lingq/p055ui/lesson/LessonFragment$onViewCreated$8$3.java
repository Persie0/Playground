package com.lingq.p055ui.lesson;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import no.C7828f;
import no.InterfaceC7882z;
import p225kk.C6704a;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonFragment$onViewCreated$8$3", m19206f = "LessonFragment.kt", m19207l = {438}, m19208m = "invokeSuspend")
public final class LessonFragment$onViewCreated$8$3 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27172e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonFragment f27173f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$3$2 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "progress", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonFragment$onViewCreated$8$3$2", m19206f = "LessonFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C41922 extends SuspendLambda implements InterfaceC2056p<Integer, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ int f27174e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonFragment f27175f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41922(LessonFragment lessonFragment, InterfaceC9968c<? super C41922> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f27175f = lessonFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C41922 c41922 = new C41922(this.f27175f, interfaceC9968c);
            c41922.f27174e = ((Number) obj).intValue();
            return c41922;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Integer num, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C41922) mo1336a(Integer.valueOf(num.intValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x00c8  */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            int i10 = this.f27174e;
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
            LessonFragment lessonFragment = this.f27175f;
            lessonFragment.m10107o0().f44700k.setCurrentPage(i10);
            lessonFragment.m10109q0().mo10025A1();
            if (i10 != lessonFragment.m10107o0().f44701l.getCurrentItem()) {
                lessonFragment.m10107o0().f44701l.m4683b(i10, false);
            }
            if (((Boolean) lessonFragment.m10109q0().f27487j0.getValue()).booleanValue() && ((Number) lessonFragment.m10109q0().f27484i0.getValue()).intValue() > -1 && ((Number) lessonFragment.m10109q0().f27484i0.getValue()).intValue() == i10 - 1) {
                C6704a c6704a = lessonFragment.f27064K0;
                if (c6704a == null) {
                    C5207g.m11117l("appSettings");
                    throw null;
                }
                if (c6704a.f37891b.getBoolean("pagingDealWithWords", true)) {
                    LessonViewModel lessonViewModelM10109q0 = lessonFragment.m10109q0();
                    C7828f.m15570d(C8573r0.m16767w0(lessonViewModelM10109q0), null, null, new LessonViewModel$shouldShowDealWithWords$1(lessonViewModelM10109q0, null), 3);
                } else if (lessonFragment.m10109q0().m10150w2()) {
                    lessonFragment.m10109q0().m10153z2(i10);
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonFragment$onViewCreated$8$3(LessonFragment lessonFragment, InterfaceC9968c<? super LessonFragment$onViewCreated$8$3> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27173f = lessonFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonFragment$onViewCreated$8$3(this.f27173f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonFragment$onViewCreated$8$3) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27172e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
            LessonFragment lessonFragment = this.f27173f;
            final C7135p c7135p = lessonFragment.m10109q0().f27481h0;
            InterfaceC7116c<Integer> interfaceC7116c = new InterfaceC7116c<Integer>() { // from class: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$3$invokeSuspend$$inlined$filterNot$1

                /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$3$invokeSuspend$$inlined$filterNot$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements InterfaceC7117d {

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ InterfaceC7117d f27177a;

                    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$3$invokeSuspend$$inlined$filterNot$1$2$1, reason: invalid class name */
                    @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonFragment$onViewCreated$8$3$invokeSuspend$$inlined$filterNot$1$2", m19206f = "LessonFragment.kt", m19207l = {223}, m19208m = "emit")
                    public static final class AnonymousClass1 extends ContinuationImpl {

                        /* JADX INFO: renamed from: d */
                        public /* synthetic */ Object f27178d;

                        /* JADX INFO: renamed from: e */
                        public int f27179e;

                        public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                            super(interfaceC9968c);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /* JADX INFO: renamed from: x */
                        public final Object mo1338x(Object obj) {
                            this.f27178d = obj;
                            this.f27179e |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.mo1339r(null, this);
                        }
                    }

                    public AnonymousClass2(InterfaceC7117d interfaceC7117d) {
                        this.f27177a = interfaceC7117d;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                    @Override // kotlinx.coroutines.flow.InterfaceC7117d
                    /* JADX INFO: renamed from: r */
                    public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                        AnonymousClass1 anonymousClass1;
                        if (interfaceC9968c instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                            int i10 = anonymousClass1.f27179e;
                            if ((i10 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.f27179e = i10 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                        Object obj2 = anonymousClass1.f27178d;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i11 = anonymousClass1.f27179e;
                        if (i11 == 0) {
                            C7499b.m14977z0(obj2);
                            if (!(((Number) obj).intValue() == -1)) {
                                anonymousClass1.f27179e = 1;
                                if (this.f27177a.mo1339r(obj, anonymousClass1) == coroutineSingletons) {
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
                public final Object mo9539a(InterfaceC7117d<? super Integer> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                    Object objMo9539a = c7135p.mo9539a(new AnonymousClass2(interfaceC7117d), interfaceC9968c);
                    return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
                }
            };
            C41922 c41922 = new C41922(lessonFragment, null);
            this.f27172e = 1;
            if (C0062b.m369m0(interfaceC7116c, c41922, this) == coroutineSingletons) {
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
