package com.lingq.feature.challenges.bookchallenge;

import android.net.Uri;
import java.io.InputStream;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3584sr;
import p000.c32;
import p000.pb1;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.feature.challenges.bookchallenge.BookChallengeChooserParentFragment$filePickerLauncher$1$1$1$bytes$1 */
/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.bookchallenge.BookChallengeChooserParentFragment$filePickerLauncher$1$1$1$bytes$1", m4291f = "BookChallengeChooserParentFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class C1963x39d53f6e extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BookChallengeChooserParentFragment f24517a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Uri f24518b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1963x39d53f6e(BookChallengeChooserParentFragment bookChallengeChooserParentFragment, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.f24517a = bookChallengeChooserParentFragment;
        this.f24518b = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1963x39d53f6e(this.f24517a, this.f24518b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C1963x39d53f6e) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        InputStream inputStreamOpenInputStream = this.f24517a.m2090R().getContentResolver().openInputStream(this.f24518b);
        if (inputStreamOpenInputStream == null) {
            return null;
        }
        try {
            byte[] bArrM19026N = pb1.m19026N(inputStreamOpenInputStream);
            inputStreamOpenInputStream.close();
            return bArrM19026N;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3584sr.m21646y(inputStreamOpenInputStream, th);
                throw th2;
            }
        }
    }
}
