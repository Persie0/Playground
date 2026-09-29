package com.lingq.p055ui.review.activities;

import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.repository.InterfaceC3324a;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import retrofit2.HttpException;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivityUnscrambleViewModel$fetchGoogleTranslation$1", m19206f = "ReviewActivityUnscrambleViewModel.kt", m19207l = {127}, m19208m = "invokeSuspend")
final class ReviewActivityUnscrambleViewModel$fetchGoogleTranslation$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f30135e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ReviewActivityUnscrambleViewModel f30136f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f30137g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f30138h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityUnscrambleViewModel$fetchGoogleTranslation$1(ReviewActivityUnscrambleViewModel reviewActivityUnscrambleViewModel, int i10, int i11, InterfaceC9968c<? super ReviewActivityUnscrambleViewModel$fetchGoogleTranslation$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f30136f = reviewActivityUnscrambleViewModel;
        this.f30137g = i10;
        this.f30138h = i11;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ReviewActivityUnscrambleViewModel$fetchGoogleTranslation$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new ReviewActivityUnscrambleViewModel$fetchGoogleTranslation$1(this.f30136f, this.f30137g, this.f30138h, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30135e;
        ReviewActivityUnscrambleViewModel reviewActivityUnscrambleViewModel = this.f30136f;
        try {
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                InterfaceC3324a interfaceC3324a = reviewActivityUnscrambleViewModel.f30122d;
                String strMo498E1 = reviewActivityUnscrambleViewModel.mo498E1();
                String strMo507p1 = reviewActivityUnscrambleViewModel.mo507p1();
                int i11 = this.f30137g;
                int i12 = this.f30138h + 1;
                this.f30135e = 1;
                if (interfaceC3324a.mo9536x(i11, i12, strMo498E1, strMo507p1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
        } catch (Exception e10) {
            if (e10 instanceof HttpException) {
                reviewActivityUnscrambleViewModel.f30118I.setValue("Unable to translate sentence. Please try again later.");
            }
        }
        return C9072e.f47360a;
    }
}
