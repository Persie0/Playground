package com.lingq.p055ui.home.library;

import ae.C0062b;
import android.os.Bundle;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.upgrade.UpgradeReason;
import com.linguist.R;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p278nh.C7777d;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LessonPreviewFragment$onViewCreated$5$4", m19206f = "LessonPreviewFragment.kt", m19207l = {107}, m19208m = "invokeSuspend")
public final class LessonPreviewFragment$onViewCreated$5$4 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24554e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonPreviewFragment f24555f;

    /* JADX INFO: renamed from: com.lingq.ui.home.library.LessonPreviewFragment$onViewCreated$5$4$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/ui/upgrade/UpgradeReason;", "reason", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LessonPreviewFragment$onViewCreated$5$4$1", m19206f = "LessonPreviewFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C37491 extends SuspendLambda implements InterfaceC2056p<UpgradeReason, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f24556e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonPreviewFragment f24557f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37491(LessonPreviewFragment lessonPreviewFragment, InterfaceC9968c<? super C37491> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24557f = lessonPreviewFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C37491 c37491 = new C37491(this.f24557f, interfaceC9968c);
            c37491.f24556e = obj;
            return c37491;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(UpgradeReason upgradeReason, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C37491) mo1336a(upgradeReason, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            UpgradeReason upgradeReason = (UpgradeReason) this.f24556e;
            Bundle bundle = new Bundle();
            bundle.putSerializable("reason", upgradeReason);
            C7777d.m15486g(this.f24557f.m3594l(), R.id.fragment_top, bundle);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPreviewFragment$onViewCreated$5$4(LessonPreviewFragment lessonPreviewFragment, InterfaceC9968c<? super LessonPreviewFragment$onViewCreated$5$4> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f24555f = lessonPreviewFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonPreviewFragment$onViewCreated$5$4(this.f24555f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonPreviewFragment$onViewCreated$5$4) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24554e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonPreviewFragment.f24530D0;
            LessonPreviewFragment lessonPreviewFragment = this.f24555f;
            InterfaceC7116c<UpgradeReason> interfaceC7116cMo9773S0 = lessonPreviewFragment.m9931p0().mo9773S0();
            C37491 c37491 = new C37491(lessonPreviewFragment, null);
            this.f24554e = 1;
            if (C0062b.m369m0(interfaceC7116cMo9773S0, c37491, this) == coroutineSingletons) {
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
