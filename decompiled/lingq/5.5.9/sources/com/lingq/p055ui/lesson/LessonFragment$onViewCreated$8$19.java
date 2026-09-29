package com.lingq.p055ui.lesson;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.lesson.player.LessonPlayerView;
import com.lingq.player.AbstractC3298c;
import com.lingq.player.C3296a;
import com.lingq.shared.uimodel.language.AppUsageType;
import com.linguist.R;
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
import ph.C8296h4;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonFragment$onViewCreated$8$19", m19206f = "LessonFragment.kt", m19207l = {817}, m19208m = "invokeSuspend")
public final class LessonFragment$onViewCreated$8$19 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27121e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonFragment f27122f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$19$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/player/a;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonFragment$onViewCreated$8$19$1", m19206f = "LessonFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C41801 extends SuspendLambda implements InterfaceC2056p<C3296a, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f27123e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonFragment f27124f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41801(LessonFragment lessonFragment, InterfaceC9968c<? super C41801> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f27124f = lessonFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C41801 c41801 = new C41801(this.f27124f, interfaceC9968c);
            c41801.f27123e = obj;
            return c41801;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(C3296a c3296a, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C41801) mo1336a(c3296a, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            C3296a c3296a = (C3296a) this.f27123e;
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
            LessonFragment lessonFragment = this.f27124f;
            LessonPlayerView lessonPlayerView = lessonFragment.m10107o0().f44712w;
            lessonPlayerView.getClass();
            C5207g.m11111f(c3296a, "statePlayer");
            AbstractC3298c abstractC3298c = c3296a.f17739a.f17758b;
            AbstractC3298c.b bVar = AbstractC3298c.b.f17753a;
            boolean zM11106a = C5207g.m11106a(abstractC3298c, bVar);
            C8296h4 c8296h4 = lessonPlayerView.binding;
            if (zM11106a) {
                c8296h4.f44869d.setImageResource(R.drawable.ic_player_pause);
            } else {
                c8296h4.f44869d.setImageResource(R.drawable.ic_player_play);
            }
            if (C5207g.m11106a(c3296a.f17739a.f17758b, bVar)) {
                lessonFragment.m10109q0().mo9421x(AppUsageType.Reading);
            } else {
                lessonFragment.m10109q0().mo9402N(AppUsageType.Reading);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonFragment$onViewCreated$8$19(LessonFragment lessonFragment, InterfaceC9968c<? super LessonFragment$onViewCreated$8$19> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27122f = lessonFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonFragment$onViewCreated$8$19(this.f27122f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonFragment$onViewCreated$8$19) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27121e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
            LessonFragment lessonFragment = this.f27122f;
            InterfaceC7133n<C3296a> interfaceC7133nMo9399J0 = lessonFragment.m10109q0().mo9399J0();
            C41801 c41801 = new C41801(lessonFragment, null);
            this.f27121e = 1;
            if (C0062b.m369m0(interfaceC7133nMo9399J0, c41801, this) == coroutineSingletons) {
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
