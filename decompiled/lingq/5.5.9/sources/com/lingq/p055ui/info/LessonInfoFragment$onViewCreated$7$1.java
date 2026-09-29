package com.lingq.p055ui.info;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.info.LessonInfoFragment$onViewCreated$7$1", m19206f = "LessonInfoFragment.kt", m19207l = {156}, m19208m = "invokeSuspend")
public final class LessonInfoFragment$onViewCreated$7$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26855e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonInfoFragment f26856f;

    /* JADX INFO: renamed from: com.lingq.ui.info.LessonInfoFragment$onViewCreated$7$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.info.LessonInfoFragment$onViewCreated$7$1$1", m19206f = "LessonInfoFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C41351 extends SuspendLambda implements InterfaceC2056p<Integer, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ int f26857e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonInfoFragment f26858f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41351(LessonInfoFragment lessonInfoFragment, InterfaceC9968c<? super C41351> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26858f = lessonInfoFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C41351 c41351 = new C41351(this.f26858f, interfaceC9968c);
            c41351.f26857e = ((Number) obj).intValue();
            return c41351;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Integer num, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C41351) mo1336a(Integer.valueOf(num.intValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            int i10 = this.f26857e;
            LessonInfoFragment lessonInfoFragment = this.f26858f;
            if (i10 > 0) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = LessonInfoFragment.f26838X0;
                lessonInfoFragment.m10098w0().f45058b.setText(lessonInfoFragment.m3600t(R.string.lesson_remove_from_playlist));
            } else {
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = LessonInfoFragment.f26838X0;
                lessonInfoFragment.m10098w0().f45058b.setText(lessonInfoFragment.m3600t(R.string.lesson_add_to_playlist));
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonInfoFragment$onViewCreated$7$1(LessonInfoFragment lessonInfoFragment, InterfaceC9968c<? super LessonInfoFragment$onViewCreated$7$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f26856f = lessonInfoFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonInfoFragment$onViewCreated$7$1(this.f26856f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonInfoFragment$onViewCreated$7$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26855e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonInfoFragment.f26838X0;
            LessonInfoFragment lessonInfoFragment = this.f26856f;
            LessonInfoViewModel lessonInfoViewModelM10099x0 = lessonInfoFragment.m10099x0();
            C41351 c41351 = new C41351(lessonInfoFragment, null);
            this.f26855e = 1;
            if (C0062b.m369m0(lessonInfoViewModelM10099x0.f26927O, c41351, this) == coroutineSingletons) {
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
