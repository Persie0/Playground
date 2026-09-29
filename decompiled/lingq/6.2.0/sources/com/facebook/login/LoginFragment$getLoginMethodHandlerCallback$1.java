package com.facebook.login;

import androidx.activity.result.ActivityResult;
import com.facebook.internal.CallbackManagerImpl$RequestCodeOffset;
import kotlin.jvm.internal.Lambda;
import p000.id3;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
final class LoginFragment$getLoginMethodHandlerCallback$1 extends Lambda implements vi3 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0935i f11484b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ id3 f11485c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginFragment$getLoginMethodHandlerCallback$1(C0935i c0935i, id3 id3Var) {
        super(1);
        this.f11484b = c0935i;
        this.f11485c = id3Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        ActivityResult activityResult = (ActivityResult) obj;
        activityResult.getClass();
        int i = activityResult.f1007a;
        if (i == -1) {
            this.f11484b.m5249c0().m5225i(CallbackManagerImpl$RequestCodeOffset.Login.toRequestCode(), i, activityResult.f1008b);
        } else {
            this.f11485c.finish();
        }
        return xfa.f68157a;
    }
}
