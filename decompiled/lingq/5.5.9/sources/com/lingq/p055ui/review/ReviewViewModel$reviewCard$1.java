package com.lingq.p055ui.review;

import ci.InterfaceC2008a;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p462wj.InterfaceC9957e;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewViewModel$reviewCard$1", m19206f = "ReviewViewModel.kt", m19207l = {504}, m19208m = "invokeSuspend")
public final class ReviewViewModel$reviewCard$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29761e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ReviewViewModel f29762f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewViewModel$reviewCard$1(ReviewViewModel reviewViewModel, InterfaceC9968c<? super ReviewViewModel$reviewCard$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29762f = reviewViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ReviewViewModel$reviewCard$1(this.f29762f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ReviewViewModel$reviewCard$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29761e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            ReviewViewModel reviewViewModel = this.f29762f;
            Object objM10261t2 = reviewViewModel.m10261t2();
            if (objM10261t2 != null && (objM10261t2 instanceof InterfaceC9957e)) {
                InterfaceC2008a interfaceC2008a = reviewViewModel.f29647e;
                String strMo498E1 = reviewViewModel.mo498E1();
                InterfaceC9957e interfaceC9957e = (InterfaceC9957e) objM10261t2;
                String str = interfaceC9957e.mo18533a().f41692b;
                int i11 = interfaceC9957e.mo18533a().f41691a;
                this.f29761e = 1;
                if (interfaceC2008a.mo5958j(i11, strMo498E1, str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
