package com.lingq.p055ui.lesson;

import ae.C0062b;
import android.os.Bundle;
import androidx.view.Lifecycle;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.upgrade.UpgradeReason;
import com.lingq.util.C4924a;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonFragment$onViewCreated$8$28", m19206f = "LessonFragment.kt", m19207l = {959}, m19208m = "invokeSuspend")
public final class LessonFragment$onViewCreated$8$28 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27163e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonFragment f27164f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$28$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/ui/upgrade/UpgradeReason;", "reason", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonFragment$onViewCreated$8$28$1", m19206f = "LessonFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C41901 extends SuspendLambda implements InterfaceC2056p<UpgradeReason, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f27165e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonFragment f27166f;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$28$1$a */
        public static final class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ LessonFragment f27167a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ UpgradeReason f27168b;

            public a(LessonFragment lessonFragment, UpgradeReason upgradeReason) {
                this.f27167a = lessonFragment;
                this.f27168b = upgradeReason;
            }

            @Override // java.lang.Runnable
            public final void run() {
                LessonFragment lessonFragment = this.f27167a;
                if (lessonFragment.f6112l0.f6681d == Lifecycle.State.RESUMED) {
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("reason", this.f27168b);
                    C7777d.m15486g(C4924a.m10446Y(lessonFragment), R.id.fragment_upgrade, bundle);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41901(LessonFragment lessonFragment, InterfaceC9968c<? super C41901> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f27166f = lessonFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C41901 c41901 = new C41901(this.f27166f, interfaceC9968c);
            c41901.f27165e = obj;
            return c41901;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(UpgradeReason upgradeReason, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C41901) mo1336a(upgradeReason, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            UpgradeReason upgradeReason = (UpgradeReason) this.f27165e;
            LessonFragment lessonFragment = this.f27166f;
            lessonFragment.m3580c0().postDelayed(new a(lessonFragment, upgradeReason), 100L);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonFragment$onViewCreated$8$28(LessonFragment lessonFragment, InterfaceC9968c<? super LessonFragment$onViewCreated$8$28> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27164f = lessonFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonFragment$onViewCreated$8$28(this.f27164f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonFragment$onViewCreated$8$28) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27163e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
            LessonFragment lessonFragment = this.f27164f;
            InterfaceC7116c<UpgradeReason> interfaceC7116cMo9773S0 = lessonFragment.m10109q0().mo9773S0();
            C41901 c41901 = new C41901(lessonFragment, null);
            this.f27163e = 1;
            if (C0062b.m369m0(interfaceC7116cMo9773S0, c41901, this) == coroutineSingletons) {
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
