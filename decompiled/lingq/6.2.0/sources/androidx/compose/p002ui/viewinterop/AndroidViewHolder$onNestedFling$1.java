package androidx.compose.p002ui.viewinterop;

import androidx.compose.p002ui.input.nestedscroll.C0317a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.dpa;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", m4291f = "AndroidViewHolder.android.kt", m4292l = {634, 636}, m4293m = "invokeSuspend", m4294v = 1)
final class AndroidViewHolder$onNestedFling$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f5121a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f5122b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0442b f5123c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f5124d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$onNestedFling$1(boolean z, AbstractC0442b abstractC0442b, long j, Continuation continuation) {
        super(2, continuation);
        this.f5122b = z;
        this.f5123c = abstractC0442b;
        this.f5124d = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AndroidViewHolder$onNestedFling$1(this.f5122b, this.f5123c, this.f5124d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((AndroidViewHolder$onNestedFling$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r11 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        if (r11 == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f5121a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0317a c0317a = this.f5123c.f5191a;
            if (this.f5122b) {
                this.f5121a = 2;
                obj = c0317a.m1447a(this.f5124d, 0L, this);
            } else {
                this.f5121a = 1;
                obj = c0317a.m1447a(0L, this.f5124d, this);
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
            ((dpa) obj).getClass();
        } else {
            if (i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            ((dpa) obj).getClass();
        }
        return xfa.f68157a;
    }
}
