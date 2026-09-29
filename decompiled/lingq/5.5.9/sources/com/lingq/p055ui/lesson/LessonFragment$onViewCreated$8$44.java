package com.lingq.p055ui.lesson;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.player.AbstractC3299d;
import com.lingq.player.C3300e;
import com.lingq.shared.uimodel.language.AppUsageType;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7133n;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sh.AbstractC9006b;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonFragment$onViewCreated$8$44", m19206f = "LessonFragment.kt", m19207l = {1352}, m19208m = "invokeSuspend")
public final class LessonFragment$onViewCreated$8$44 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27250e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonFragment f27251f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$44$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsh/b;", "action", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonFragment$onViewCreated$8$44$1", m19206f = "LessonFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C42091 extends SuspendLambda implements InterfaceC2056p<AbstractC9006b, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f27252e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonFragment f27253f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42091(LessonFragment lessonFragment, InterfaceC9968c<? super C42091> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f27253f = lessonFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C42091 c42091 = new C42091(this.f27253f, interfaceC9968c);
            c42091.f27252e = obj;
            return c42091;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(AbstractC9006b abstractC9006b, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C42091) mo1336a(abstractC9006b, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            C3300e value;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            AbstractC9006b abstractC9006b = (AbstractC9006b) this.f27252e;
            boolean zM11106a = C5207g.m11106a(abstractC9006b, AbstractC9006b.e.f47220a);
            LessonFragment lessonFragment = this.f27253f;
            if (zM11106a) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
                InterfaceC7133n<C3300e> interfaceC7133nMo9424y0 = lessonFragment.m10109q0().mo9424y0();
                do {
                    value = interfaceC7133nMo9424y0.getValue();
                } while (!interfaceC7133nMo9424y0.mo14366c(value, C3300e.m9433b(value, AbstractC3299d.a.f17754a, null, 2)));
                lessonFragment.m10109q0().m10141G2(AbstractC4267a.b.f27841a);
                lessonFragment.m10109q0().m10135B2(AbstractC9006b.g.f47222a);
                lessonFragment.m10109q0().mo9421x(AppUsageType.Reading);
            } else if (C5207g.m11106a(abstractC9006b, AbstractC9006b.b.f47217a)) {
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = LessonFragment.f27053M0;
                lessonFragment.m10109q0().m10141G2(AbstractC4267a.a.f27840a);
                lessonFragment.m10109q0().m10135B2(AbstractC9006b.f.f47221a);
                lessonFragment.m10109q0().mo9402N(AppUsageType.Reading);
            } else if (C5207g.m11106a(abstractC9006b, AbstractC9006b.h.f47223a)) {
                lessonFragment.m10108p0().m9408a0();
            } else if (C5207g.m11106a(abstractC9006b, AbstractC9006b.a.f47216a)) {
                lessonFragment.m10108p0().m9410d0(-5000);
            } else if (C5207g.m11106a(abstractC9006b, AbstractC9006b.f.f47221a)) {
                lessonFragment.m10108p0().pause();
            } else if (C5207g.m11106a(abstractC9006b, AbstractC9006b.g.f47222a)) {
                lessonFragment.m10108p0().start();
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonFragment$onViewCreated$8$44(LessonFragment lessonFragment, InterfaceC9968c<? super LessonFragment$onViewCreated$8$44> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27251f = lessonFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonFragment$onViewCreated$8$44(this.f27251f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonFragment$onViewCreated$8$44) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27250e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
            LessonFragment lessonFragment = this.f27251f;
            LessonViewModel lessonViewModelM10109q0 = lessonFragment.m10109q0();
            C42091 c42091 = new C42091(lessonFragment, null);
            this.f27250e = 1;
            if (C0062b.m369m0(lessonViewModelM10109q0.f27476f2, c42091, this) == coroutineSingletons) {
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
