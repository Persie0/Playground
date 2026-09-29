package com.lingq.p055ui.lesson;

import ae.C0062b;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.animation.Animation;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.uimodel.lesson.LessonStudy;
import com.lingq.shared.uimodel.lesson.LessonStudyBookmark;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import p265mj.C7570d;
import p338qd.C8573r0;
import p378s3.C8953b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import ph.C8274e0;
import sl.C9072e;
import tl.C9327o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonFragment$onViewCreated$8$7", m19206f = "LessonFragment.kt", m19207l = {631}, m19208m = "invokeSuspend")
public final class LessonFragment$onViewCreated$8$7 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27315e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonFragment f27316f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$7$2 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/ui/lesson/d$a;", "textPages", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonFragment$onViewCreated$8$7$2", m19206f = "LessonFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C42182 extends SuspendLambda implements InterfaceC2056p<List<? extends C4270d.a>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f27317e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonFragment f27318f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42182(LessonFragment lessonFragment, InterfaceC9968c<? super C42182> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f27318f = lessonFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C42182 c42182 = new C42182(this.f27318f, interfaceC9968c);
            c42182.f27317e = obj;
            return c42182;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends C4270d.a> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C42182) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Code duplicated, block: B:46:0x0112  */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            boolean z10;
            Object next;
            boolean z11;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List<C4270d.a> list = (List) this.f27317e;
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
            LessonFragment lessonFragment = this.f27318f;
            ArrayList arrayList = lessonFragment.m10107o0().f44701l.f7742c.f7767a;
            LessonFragment.C4167f c4167f = lessonFragment.f27061H0;
            arrayList.remove(c4167f);
            C4270d c4270d = lessonFragment.f27054A0;
            if (c4270d == null) {
                C5207g.m11117l("lessonPagerAdapter");
                throw null;
            }
            C5207g.m11111f(list, "data");
            if (!C5207g.m11106a(list, c4270d.f27857m)) {
                c4270d.f27857m = list;
                c4270d.f7040a.m4259b();
            }
            C8274e0 c8274e0M10107o0 = lessonFragment.m10107o0();
            c8274e0M10107o0.f44700k.setTotalPages(list.size());
            if (!lessonFragment.m10109q0().m10150w2()) {
                C6704a c6704a = lessonFragment.f27064K0;
                if (c6704a == null) {
                    C5207g.m11117l("appSettings");
                    throw null;
                }
                z10 = c6704a.f37891b.getBoolean("pagingDealWithWords", true);
            }
            LessonProgressBar lessonProgressBar = c8274e0M10107o0.f44700k;
            lessonProgressBar.f27353U = z10;
            lessonProgressBar.m10127m();
            if (list.size() - 1 == 0) {
                LessonStudy lessonStudy = (LessonStudy) lessonFragment.m10109q0().f27515w0.getValue();
                lessonProgressBar.setupOnePageLessonView(lessonStudy != null && (lessonStudy.f21827m || lessonStudy.f21833s == 0));
            } else {
                lessonProgressBar.setIsTouchingEnabled(true);
            }
            LessonStudyBookmark lessonStudyBookmark = (LessonStudyBookmark) lessonFragment.m10109q0().f27421O0.getValue();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                C9327o.m17684D(((C4270d.a) it.next()).f27858a.f41703c, arrayList2);
            }
            Iterator it2 = arrayList2.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                C7570d c7570d = (C7570d) next;
                if (lessonStudyBookmark != null) {
                    int i10 = c7570d.f41726f;
                    Integer num = lessonStudyBookmark.f21841a;
                    if (num != null && num.intValue() == i10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else {
                    z11 = false;
                }
            } while (!z11);
            C7570d c7570d2 = (C7570d) next;
            if (c7570d2 != null) {
                int i11 = c7570d2.f41733m;
                lessonFragment.m10107o0().f44701l.m4683b(i11, false);
                lessonFragment.m10109q0().m10139F2(i11, false);
                lessonFragment.m10107o0().f44700k.setCurrentPage(i11);
            }
            LessonViewModel lessonViewModelM10109q0 = lessonFragment.m10109q0();
            C7828f.m15570d(C8573r0.m16767w0(lessonViewModelM10109q0), null, null, new LessonViewModel$checkCompletedPagesAndForcePage$1(lessonViewModelM10109q0, null), 3);
            boolean z12 = !lessonFragment.m10109q0().m10151x2();
            Animation animation = lessonFragment.m10107o0().f44700k.getAnimation();
            if (animation != null) {
                animation.cancel();
            }
            Animation animation2 = lessonFragment.m10107o0().f44701l.getAnimation();
            if (animation2 != null) {
                animation2.cancel();
            }
            lessonFragment.m10107o0().f44701l.setVisibility(0);
            if (z12) {
                lessonFragment.m10107o0().f44701l.setAlpha(0.0f);
                ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(lessonFragment.m10107o0().f44701l, PropertyValuesHolder.ofFloat("alpha", 0.7f, 1.0f));
                objectAnimatorOfPropertyValuesHolder.setDuration(200L);
                objectAnimatorOfPropertyValuesHolder.setInterpolator(new C8953b());
                objectAnimatorOfPropertyValuesHolder.start();
            }
            lessonFragment.m10107o0().f44701l.f7742c.f7767a.add(c4167f);
            lessonFragment.m10107o0().f44710u.setEnabled(true);
            LessonViewModel lessonViewModelM10109q1 = lessonFragment.m10109q0();
            Resource.Status status = Resource.Status.SUCCESS;
            C5207g.m11111f(status, "value");
            lessonViewModelM10109q1.f27448X0.setValue(status);
            LessonViewModel lessonViewModelM10109q2 = lessonFragment.m10109q0();
            lessonViewModelM10109q2.m10145r2(((Number) lessonViewModelM10109q2.f27478g0.getValue()).intValue());
            LessonViewModel lessonViewModelM10109q3 = lessonFragment.m10109q0();
            C7828f.m15570d(C8573r0.m16767w0(lessonViewModelM10109q3), null, null, new LessonViewModel$showTooltipsIndicators$1(lessonViewModelM10109q3, null), 3);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonFragment$onViewCreated$8$7(LessonFragment lessonFragment, InterfaceC9968c<? super LessonFragment$onViewCreated$8$7> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27316f = lessonFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonFragment$onViewCreated$8$7(this.f27316f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonFragment$onViewCreated$8$7) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27315e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
            LessonFragment lessonFragment = this.f27316f;
            final C7135p c7135p = lessonFragment.m10109q0().f27430R0;
            InterfaceC7116c<List<? extends C4270d.a>> interfaceC7116c = new InterfaceC7116c<List<? extends C4270d.a>>() { // from class: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$7$invokeSuspend$$inlined$filter$1

                /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$7$invokeSuspend$$inlined$filter$1$2 */
                public static final class C42192<T> implements InterfaceC7117d {

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ InterfaceC7117d f27320a;

                    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$7$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonFragment$onViewCreated$8$7$invokeSuspend$$inlined$filter$1$2", m19206f = "LessonFragment.kt", m19207l = {223}, m19208m = "emit")
                    public static final class AnonymousClass1 extends ContinuationImpl {

                        /* JADX INFO: renamed from: d */
                        public /* synthetic */ Object f27321d;

                        /* JADX INFO: renamed from: e */
                        public int f27322e;

                        public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                            super(interfaceC9968c);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /* JADX INFO: renamed from: x */
                        public final Object mo1338x(Object obj) {
                            this.f27321d = obj;
                            this.f27322e |= Integer.MIN_VALUE;
                            return C42192.this.mo1339r(null, this);
                        }
                    }

                    public C42192(InterfaceC7117d interfaceC7117d) {
                        this.f27320a = interfaceC7117d;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
                    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                    @Override // kotlinx.coroutines.flow.InterfaceC7117d
                    /* JADX INFO: renamed from: r */
                    public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                        AnonymousClass1 anonymousClass1;
                        if (interfaceC9968c instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                            int i10 = anonymousClass1.f27322e;
                            if ((i10 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.f27322e = i10 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                        Object obj2 = anonymousClass1.f27321d;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i11 = anonymousClass1.f27322e;
                        if (i11 == 0) {
                            C7499b.m14977z0(obj2);
                            if (!((List) obj).isEmpty()) {
                                anonymousClass1.f27322e = 1;
                                if (this.f27320a.mo1339r(obj, anonymousClass1) == coroutineSingletons) {
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
                public final Object mo9539a(InterfaceC7117d<? super List<? extends C4270d.a>> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                    Object objMo9539a = c7135p.mo9539a(new C42192(interfaceC7117d), interfaceC9968c);
                    return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
                }
            };
            C42182 c42182 = new C42182(lessonFragment, null);
            this.f27315e = 1;
            if (C0062b.m369m0(interfaceC7116c, c42182, this) == coroutineSingletons) {
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
