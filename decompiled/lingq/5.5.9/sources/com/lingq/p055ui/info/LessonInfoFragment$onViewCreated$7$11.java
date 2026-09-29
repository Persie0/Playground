package com.lingq.p055ui.info;

import ae.C0062b;
import android.support.v4.media.session.C0166e;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.library.LessonInfo;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.flow.StateFlowImpl;
import no.C7828f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.info.LessonInfoFragment$onViewCreated$7$11", m19206f = "LessonInfoFragment.kt", m19207l = {353}, m19208m = "invokeSuspend")
public final class LessonInfoFragment$onViewCreated$7$11 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26863e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonInfoFragment f26864f;

    /* JADX INFO: renamed from: com.lingq.ui.info.LessonInfoFragment$onViewCreated$7$11$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/ui/info/a;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.info.LessonInfoFragment$onViewCreated$7$11$1", m19206f = "LessonInfoFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C41371 extends SuspendLambda implements InterfaceC2056p<InterfaceC4158a, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f26865e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonInfoFragment f26866f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41371(LessonInfoFragment lessonInfoFragment, InterfaceC9968c<? super C41371> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26866f = lessonInfoFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C41371 c41371 = new C41371(this.f26866f, interfaceC9968c);
            c41371.f26865e = obj;
            return c41371;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC4158a interfaceC4158a, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C41371) mo1336a(interfaceC4158a, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            String str;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            InterfaceC4158a interfaceC4158a = (InterfaceC4158a) this.f26865e;
            boolean z10 = interfaceC4158a instanceof InterfaceC4158a.b;
            LessonInfoFragment lessonInfoFragment = this.f26866f;
            if (z10) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = LessonInfoFragment.f26838X0;
                LessonInfoViewModel lessonInfoViewModelM10099x0 = lessonInfoFragment.m10099x0();
                LessonInfo lessonInfo = ((InterfaceC4158a.b) interfaceC4158a).f27042a;
                C5207g.m11111f(lessonInfo, "lesson");
                C7828f.m15570d(C8573r0.m16767w0(lessonInfoViewModelM10099x0), lessonInfoViewModelM10099x0.f26954j, null, new LessonInfoViewModel$downloadLesson$1(lessonInfoViewModelM10099x0, lessonInfo, null), 2);
            } else if (C5207g.m11106a(interfaceC4158a, InterfaceC4158a.a.f27041a)) {
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = LessonInfoFragment.f26838X0;
                LessonInfoViewModel lessonInfoViewModelM10099x1 = lessonInfoFragment.m10099x0();
                int iIntValue = ((Number) lessonInfoViewModelM10099x1.f26926N.getValue()).intValue();
                StateFlowImpl stateFlowImpl = lessonInfoViewModelM10099x1.f26922J;
                if (iIntValue <= 0 || iIntValue != 1) {
                    AbstractChannel abstractChannel = lessonInfoViewModelM10099x1.f26934V;
                    if (iIntValue <= 0 || iIntValue <= 1) {
                        LessonInfo lessonInfo2 = (LessonInfo) stateFlowImpl.getValue();
                        if (lessonInfo2 != null) {
                            abstractChannel.mo16479j(new AbstractC4161d.c(lessonInfo2, false));
                        }
                    } else {
                        LessonInfo lessonInfo3 = (LessonInfo) stateFlowImpl.getValue();
                        if (lessonInfo3 != null) {
                            abstractChannel.mo16479j(new AbstractC4161d.c(lessonInfo3, true));
                        }
                    }
                } else {
                    LessonInfo lessonInfo4 = (LessonInfo) stateFlowImpl.getValue();
                    if (lessonInfo4 == null || (str = lessonInfo4.f21958I) == null) {
                        str = "";
                    }
                    C7828f.m15570d(C8573r0.m16767w0(lessonInfoViewModelM10099x1), lessonInfoViewModelM10099x1.f26954j, null, new LessonInfoViewModel$removeLessonFromPlaylist$1(lessonInfoViewModelM10099x1, str, null), 2);
                }
            } else if (C5207g.m11106a(interfaceC4158a, InterfaceC4158a.c.f27043a)) {
                InterfaceC6727j<Object>[] interfaceC6727jArr3 = LessonInfoFragment.f26838X0;
                LessonInfoViewModel lessonInfoViewModelM10099x2 = lessonInfoFragment.m10099x0();
                C7499b.m14933c0(C8573r0.m16767w0(lessonInfoViewModelM10099x2), lessonInfoViewModelM10099x2.f26955k, lessonInfoViewModelM10099x2.f26954j, C0166e.m761g("updateSave ", lessonInfoViewModelM10099x2.f26921I.f35086a), new LessonInfoViewModel$updateSave$1(lessonInfoViewModelM10099x2, null));
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonInfoFragment$onViewCreated$7$11(LessonInfoFragment lessonInfoFragment, InterfaceC9968c<? super LessonInfoFragment$onViewCreated$7$11> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f26864f = lessonInfoFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonInfoFragment$onViewCreated$7$11(this.f26864f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonInfoFragment$onViewCreated$7$11) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26863e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonInfoFragment.f26838X0;
            LessonInfoFragment lessonInfoFragment = this.f26864f;
            LessonInfoViewModel lessonInfoViewModelM10099x0 = lessonInfoFragment.m10099x0();
            C41371 c41371 = new C41371(lessonInfoFragment, null);
            this.f26863e = 1;
            if (C0062b.m369m0(lessonInfoViewModelM10099x0.f26937Y, c41371, this) == coroutineSingletons) {
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
