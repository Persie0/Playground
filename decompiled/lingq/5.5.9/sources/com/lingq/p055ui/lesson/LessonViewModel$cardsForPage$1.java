package com.lingq.p055ui.lesson;

import ae.C0062b;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.flow.internal.C7127c;
import p260m8.C7499b;
import p265mj.C7567a;
import p265mj.C7570d;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$cardsForPage$1", m19206f = "LessonViewModel.kt", m19207l = {1379}, m19208m = "invokeSuspend")
public final class LessonViewModel$cardsForPage$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27629e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonViewModel f27630f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f27631g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonViewModel$cardsForPage$1(LessonViewModel lessonViewModel, int i10, InterfaceC9968c<? super LessonViewModel$cardsForPage$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f27630f = lessonViewModel;
        this.f27631g = i10;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonViewModel$cardsForPage$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new LessonViewModel$cardsForPage$1(this.f27630f, this.f27631g, interfaceC9968c);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27629e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonViewModel lessonViewModel = this.f27630f;
            int size = ((List) lessonViewModel.f27424P0.getValue()).size();
            int i11 = this.f27631g;
            if (i11 >= 0 && i11 < size) {
                List<C7570d> list = ((C7567a) ((List) lessonViewModel.f27424P0.getValue()).get(i11)).f41703c;
                ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C7570d) it.next()).f41725e);
                }
                ArrayList arrayListM13414H = C6752c.m13414H(arrayList, 100);
                ArrayList arrayList2 = new ArrayList(C9325m.m17681z(arrayListM13414H, 10));
                Iterator it2 = arrayListM13414H.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(lessonViewModel.f27473f.mo5951c((List) it2.next(), lessonViewModel.mo498E1()));
                }
                Object[] array = C6752c.m13453u0(arrayList2).toArray(new InterfaceC7116c[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                final InterfaceC7116c[] interfaceC7116cArr = (InterfaceC7116c[]) array;
                InterfaceC7116c<Integer> interfaceC7116c = new InterfaceC7116c<Integer>() { // from class: com.lingq.ui.lesson.LessonViewModel$cardsForPage$1$invokeSuspend$lambda$4$$inlined$combine$1

                    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$cardsForPage$1$invokeSuspend$lambda$4$$inlined$combine$1$3, reason: invalid class name */
                    @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, m13365d2 = {"T", "R", "Lkotlinx/coroutines/flow/d;", "", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
                    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$cardsForPage$1$invokeSuspend$lambda$4$$inlined$combine$1$3", m19206f = "LessonViewModel.kt", m19207l = {292}, m19208m = "invokeSuspend")
                    public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super Integer>, Integer[], InterfaceC9968c<? super C9072e>, Object> {

                        /* JADX INFO: renamed from: e */
                        public int f27636e;

                        /* JADX INFO: renamed from: f */
                        public /* synthetic */ InterfaceC7117d f27637f;

                        /* JADX INFO: renamed from: g */
                        public /* synthetic */ Object[] f27638g;

                        public AnonymousClass3(InterfaceC9968c interfaceC9968c) {
                            super(3, interfaceC9968c);
                        }

                        @Override // cm.InterfaceC2057q
                        /* JADX INFO: renamed from: M */
                        public final Object mo1343M(InterfaceC7117d<? super Integer> interfaceC7117d, Integer[] numArr, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                            AnonymousClass3 anonymousClass3 = new AnonymousClass3(interfaceC9968c);
                            anonymousClass3.f27637f = interfaceC7117d;
                            anonymousClass3.f27638g = numArr;
                            return anonymousClass3.mo1338x(C9072e.f47360a);
                        }

                        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /* JADX INFO: renamed from: x */
                        public final Object mo1338x(Object obj) throws Throwable {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i10 = this.f27636e;
                            if (i10 == 0) {
                                C7499b.m14977z0(obj);
                                InterfaceC7117d interfaceC7117d = this.f27637f;
                                Integer[] numArr = (Integer[]) this.f27638g;
                                Integer num = new Integer(0);
                                int length = numArr.length;
                                int i11 = 0;
                                while (i11 < length) {
                                    Integer num2 = numArr[i11];
                                    i11++;
                                    num = new Integer(num.intValue() + (num2 != null ? num2.intValue() : 0));
                                }
                                this.f27636e = 1;
                                if (interfaceC7117d.mo1339r(num, this) == coroutineSingletons) {
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

                    @Override // kotlinx.coroutines.flow.InterfaceC7116c
                    /* JADX INFO: renamed from: a */
                    public final Object mo9539a(InterfaceC7117d<? super Integer> interfaceC7117d, InterfaceC9968c interfaceC9968c) throws Throwable {
                        final InterfaceC7116c[] interfaceC7116cArr2 = interfaceC7116cArr;
                        Object objM14386a = C7127c.m14386a(interfaceC9968c, new InterfaceC2041a<Integer[]>() { // from class: com.lingq.ui.lesson.LessonViewModel$cardsForPage$1$invokeSuspend$lambda$4$$inlined$combine$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final Integer[] mo807E() {
                                return new Integer[interfaceC7116cArr2.length];
                            }
                        }, new AnonymousClass3(null), interfaceC7117d, interfaceC7116cArr2);
                        return objM14386a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM14386a : C9072e.f47360a;
                    }
                };
                LessonViewModel$cardsForPage$1$1$3 lessonViewModel$cardsForPage$1$1$3 = new LessonViewModel$cardsForPage$1$1$3(lessonViewModel, null);
                this.f27629e = 1;
                if (C0062b.m369m0(interfaceC7116c, lessonViewModel$cardsForPage$1$1$3, this) == coroutineSingletons) {
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
