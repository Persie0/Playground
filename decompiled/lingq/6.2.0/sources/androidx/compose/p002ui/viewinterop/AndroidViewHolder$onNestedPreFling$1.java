package androidx.compose.p002ui.viewinterop;

import androidx.compose.p002ui.input.nestedscroll.C0317a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", m4291f = "AndroidViewHolder.android.kt", m4292l = {645}, m4293m = "invokeSuspend", m4294v = 1)
final class AndroidViewHolder$onNestedPreFling$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f5125a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0442b f5126b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f5127c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$onNestedPreFling$1(AbstractC0442b abstractC0442b, long j, Continuation continuation) {
        super(2, continuation);
        this.f5126b = abstractC0442b;
        this.f5127c = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AndroidViewHolder$onNestedPreFling$1(this.f5126b, this.f5127c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((AndroidViewHolder$onNestedPreFling$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f5125a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0317a c0317a = this.f5126b.f5191a;
            this.f5125a = 1;
            if (c0317a.m1448b(this.f5127c, this) == coroutineSingletons) {
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
