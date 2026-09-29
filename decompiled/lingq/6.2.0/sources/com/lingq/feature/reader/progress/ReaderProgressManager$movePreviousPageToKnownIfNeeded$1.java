package com.lingq.feature.reader.progress;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.feature.reader.progress.domain.C2472b;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.ox7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.progress.ReaderProgressManager$movePreviousPageToKnownIfNeeded$1", m4291f = "ReaderProgressManager.kt", m4292l = {DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderProgressManager$movePreviousPageToKnownIfNeeded$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29852a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2470a f29853b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f29854c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f29855d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ List f29856e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f29857f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderProgressManager$movePreviousPageToKnownIfNeeded$1(C2470a c2470a, String str, int i, List list, int i2, Continuation continuation) {
        super(2, continuation);
        this.f29853b = c2470a;
        this.f29854c = str;
        this.f29855d = i;
        this.f29856e = list;
        this.f29857f = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderProgressManager$movePreviousPageToKnownIfNeeded$1(this.f29853b, this.f29854c, this.f29855d, this.f29856e, this.f29857f, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderProgressManager$movePreviousPageToKnownIfNeeded$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29852a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2472b c2472b = this.f29853b.f29863a;
            ox7 ox7Var = (ox7) this.f29856e.get(this.f29857f);
            this.f29852a = 1;
            if (c2472b.m9377a(this.f29854c, this.f29855d, ox7Var, "auto", this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
