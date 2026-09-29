package com.lingq.p055ui.lesson;

import ae.C0062b;
import android.widget.ImageView;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.lesson.player.LessonPlayerView;
import com.lingq.util.C4924a;
import dm.C5207g;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonFragment$onViewCreated$8$42", m19206f = "LessonFragment.kt", m19207l = {1330}, m19208m = "invokeSuspend")
public final class LessonFragment$onViewCreated$8$42 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27242e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonFragment f27243f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$42$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"", "hideAudio", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonFragment$onViewCreated$8$42$1", m19206f = "LessonFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C42071 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f27244e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonFragment f27245f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42071(LessonFragment lessonFragment, InterfaceC9968c<? super C42071> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f27245f = lessonFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C42071 c42071 = new C42071(this.f27245f, interfaceC9968c);
            c42071.f27244e = obj;
            return c42071;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C42071) mo1336a(bool, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            boolean zM11106a = C5207g.m11106a((Boolean) this.f27244e, Boolean.TRUE);
            LessonFragment lessonFragment = this.f27245f;
            if (zM11106a) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
                ImageView imageView = lessonFragment.m10107o0().f44703n;
                C5207g.m11110e(imageView, "binding.tbPlay");
                C4924a.m10442U(imageView);
            } else {
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = LessonFragment.f27053M0;
                LessonPlayerView lessonPlayerView = lessonFragment.m10107o0().f44712w;
                C5207g.m11110e(lessonPlayerView, "binding.viewPlayer");
                if (!(lessonPlayerView.getVisibility() == 0)) {
                    ImageView imageView2 = lessonFragment.m10107o0().f44703n;
                    C5207g.m11110e(imageView2, "binding.tbPlay");
                    C4924a.m10457e0(imageView2);
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonFragment$onViewCreated$8$42(LessonFragment lessonFragment, InterfaceC9968c<? super LessonFragment$onViewCreated$8$42> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27243f = lessonFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonFragment$onViewCreated$8$42(this.f27243f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonFragment$onViewCreated$8$42) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27242e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
            LessonFragment lessonFragment = this.f27243f;
            LessonViewModel lessonViewModelM10109q0 = lessonFragment.m10109q0();
            C42071 c42071 = new C42071(lessonFragment, null);
            this.f27242e = 1;
            if (C0062b.m369m0(lessonViewModelM10109q0.f27455Z1, c42071, this) == coroutineSingletons) {
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
