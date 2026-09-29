package kotlin.jvm.internal;

import com.lingq.shared.p054di.SharedModule;

/* JADX INFO: loaded from: classes2.dex */
public class FunctionReferenceImpl extends FunctionReference {
    public FunctionReferenceImpl(int i10, Class cls, String str, String str2, int i11) {
        super(i10, CallableReference.f38110g, cls, str, str2, i11);
    }

    public FunctionReferenceImpl(SharedModule sharedModule) {
        super(1, sharedModule, SharedModule.class, "sharedPreferencesMigration", "sharedPreferencesMigration(Landroid/content/Context;)Ljava/util/List;", 0);
    }
}
