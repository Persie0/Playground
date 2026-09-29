package com.lingq.p055ui.review;

import ae.C0062b;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AlertController;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.view.Lifecycle;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.p053ui.ViewKeys;
import com.linguist.R;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tc.C9249b;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewFragment$onViewCreated$11$16", m19206f = "ReviewFragment.kt", m19207l = {431}, m19208m = "invokeSuspend")
public final class ReviewFragment$onViewCreated$11$16 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29469e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ReviewFragment f29470f;

    /* JADX INFO: renamed from: com.lingq.ui.review.ReviewFragment$onViewCreated$11$16$1 */
    @Metadata(m13364d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "it", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewFragment$onViewCreated$11$16$1", m19206f = "ReviewFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C45181 extends SuspendLambda implements InterfaceC2056p<C9072e, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ ReviewFragment f29471e;

        /* JADX INFO: renamed from: com.lingq.ui.review.ReviewFragment$onViewCreated$11$16$1$a */
        public static final class a implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ReviewFragment f29472a;

            public a(ReviewFragment reviewFragment) {
                this.f29472a = reviewFragment;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                dialogInterface.dismiss();
                InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewFragment.f29431E0;
                ReviewFragment reviewFragment = this.f29472a;
                reviewFragment.m10240o0().f29617L0.setValue(Boolean.TRUE);
                if (reviewFragment.f6112l0.f6681d.isAtLeast(Lifecycle.State.STARTED)) {
                    NavController navControllerM16725g0 = C8573r0.m16725g0(reviewFragment);
                    int iOrdinal = ViewKeys.ActivitiesSettings.ordinal();
                    NavDestination navDestinationM3986g = navControllerM16725g0.m3986g();
                    if (navDestinationM3986g == null || navDestinationM3986g.m4016i(R.id.actionToReviewSettings) == null) {
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("viewKey", iOrdinal);
                    navControllerM16725g0.m3992m(R.id.actionToReviewSettings, bundle, null);
                }
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.review.ReviewFragment$onViewCreated$11$16$1$b */
        public static final class b implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ReviewFragment f29473a;

            public b(ReviewFragment reviewFragment) {
                this.f29473a = reviewFragment;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                dialogInterface.dismiss();
                C8573r0.m16725g0(this.f29473a).m3995p();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45181(ReviewFragment reviewFragment, InterfaceC9968c<? super C45181> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f29471e = reviewFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C45181(this.f29471e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(C9072e c9072e, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C45181) mo1336a(c9072e, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            ReviewFragment reviewFragment = this.f29471e;
            String strM3600t = reviewFragment.m3600t(R.string.activities_select_one_activity);
            C5207g.m11110e(strM3600t, "getString(R.string.activities_select_one_activity)");
            C9249b c9249b = new C9249b(reviewFragment.m3578a0());
            AlertController.C0211b c0211b = c9249b.f599a;
            c0211b.f586m = false;
            c0211b.f579f = strM3600t;
            c9249b.m17612e(reviewFragment.m3600t(R.string.settings_text_settings), new a(reviewFragment));
            c9249b.m17610c(reviewFragment.m3600t(R.string.ui_cancel), new b(reviewFragment));
            c9249b.m876a();
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewFragment$onViewCreated$11$16(ReviewFragment reviewFragment, InterfaceC9968c<? super ReviewFragment$onViewCreated$11$16> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29470f = reviewFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ReviewFragment$onViewCreated$11$16(this.f29470f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ReviewFragment$onViewCreated$11$16) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29469e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewFragment.f29431E0;
            ReviewFragment reviewFragment = this.f29470f;
            ReviewViewModel reviewViewModelM10240o0 = reviewFragment.m10240o0();
            C45181 c45181 = new C45181(reviewFragment, null);
            this.f29469e = 1;
            if (C0062b.m369m0(reviewViewModelM10240o0.f29676z0, c45181, this) == coroutineSingletons) {
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
