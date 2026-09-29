package com.lingq.p055ui.lesson.stats;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p278nh.AbstractC7791r;
import p464wl.InterfaceC9968c;
import p487xi.C10201i;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.stats.LessonCompleteFragment$onViewCreated$6$2", m19206f = "LessonCompleteFragment.kt", m19207l = {282}, m19208m = "invokeSuspend")
public final class LessonCompleteFragment$onViewCreated$6$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28925e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonCompleteFragment f28926f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C10201i f28927g;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.stats.LessonCompleteFragment$onViewCreated$6$2$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lnh/r;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.stats.LessonCompleteFragment$onViewCreated$6$2$1", m19206f = "LessonCompleteFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C44181 extends SuspendLambda implements InterfaceC2056p<List<? extends AbstractC7791r>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f28928e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ C10201i f28929f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44181(C10201i c10201i, InterfaceC9968c<? super C44181> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f28929f = c10201i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C44181 c44181 = new C44181(this.f28929f, interfaceC9968c);
            c44181.f28928e = obj;
            return c44181;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends AbstractC7791r> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C44181) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f28929f.m4529q((List) this.f28928e);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteFragment$onViewCreated$6$2(C10201i c10201i, LessonCompleteFragment lessonCompleteFragment, InterfaceC9968c interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28926f = lessonCompleteFragment;
        this.f28927g = c10201i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonCompleteFragment$onViewCreated$6$2(this.f28927g, this.f28926f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonCompleteFragment$onViewCreated$6$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28925e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonCompleteFragment.f28894G0;
            LessonCompleteViewModel lessonCompleteViewModelM10217q0 = this.f28926f.m10217q0();
            C44181 c44181 = new C44181(this.f28927g, null);
            this.f28925e = 1;
            if (C0062b.m369m0(lessonCompleteViewModelM10217q0.f29010k0, c44181, this) == coroutineSingletons) {
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
