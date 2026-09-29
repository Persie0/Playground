package com.lingq.p055ui.lesson;

import ae.C0062b;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.lesson.vocabulary.LessonVocabularyFragment;
import com.linguist.R;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7137r;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p278nh.C7777d;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonFragment$onViewCreated$8$13", m19206f = "LessonFragment.kt", m19207l = {706}, m19208m = "invokeSuspend")
public final class LessonFragment$onViewCreated$8$13 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27097e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonFragment f27098f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$13$1 */
    @Metadata(m13364d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "it", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonFragment$onViewCreated$8$13$1", m19206f = "LessonFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C41741 extends SuspendLambda implements InterfaceC2056p<C9072e, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ LessonFragment f27099e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41741(LessonFragment lessonFragment, InterfaceC9968c<? super C41741> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f27099e = lessonFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C41741(this.f27099e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(C9072e c9072e, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C41741) mo1336a(c9072e, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            LessonFragment lessonFragment = this.f27099e;
            if (C7777d.m15481b(lessonFragment)) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
                lessonFragment.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("lessonId", lessonFragment.m10109q0().m10152y2());
                bundle.putBoolean("isDocked", true);
                FragmentManager fragmentManagerM3594l = lessonFragment.m3594l();
                C5207g.m11110e(fragmentManagerM3594l, "childFragmentManager");
                if (((LessonVocabularyFragment) fragmentManagerM3594l.m3616D(LessonVocabularyFragment.class.getName())) == null) {
                    LessonVocabularyFragment lessonVocabularyFragment = new LessonVocabularyFragment();
                    lessonVocabularyFragment.m3583e0(bundle);
                    C7777d.m15487h(fragmentManagerM3594l, lessonVocabularyFragment, R.id.fragment_container_token, LessonVocabularyFragment.class.getName(), false);
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonFragment$onViewCreated$8$13(LessonFragment lessonFragment, InterfaceC9968c<? super LessonFragment$onViewCreated$8$13> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27098f = lessonFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonFragment$onViewCreated$8$13(this.f27098f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonFragment$onViewCreated$8$13) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27097e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
            LessonFragment lessonFragment = this.f27098f;
            InterfaceC7137r<C9072e> interfaceC7137rMo10053l = lessonFragment.m10109q0().mo10053l();
            C41741 c41741 = new C41741(lessonFragment, null);
            this.f27097e = 1;
            if (C0062b.m369m0(interfaceC7137rMo10053l, c41741, this) == coroutineSingletons) {
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
