package androidx.compose.p002ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.C3211a;
import p000.C3386nv;
import p000.a7b;
import p000.c32;
import p000.e83;
import p000.ej0;
import p000.n66;
import p000.xfa;
import p000.z6b;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", m4291f = "WindowRecomposer.android.kt", m4292l = {119, 121}, m4293m = "invokeSuspend", m4294v = 1)
final class WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public ej0 f4607a;

    /* JADX INFO: renamed from: b */
    public int f4608b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f4609c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ContentResolver f4610d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Uri f4611e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ z6b f4612f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C3211a f4613g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Context f4614h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(ContentResolver contentResolver, Uri uri, z6b z6bVar, C3211a c3211a, Context context, Continuation continuation) {
        super(2, continuation);
        this.f4610d = contentResolver;
        this.f4611e = uri;
        this.f4612f = z6bVar;
        this.f4613g = c3211a;
        this.f4614h = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 = new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(this.f4610d, this.f4611e, this.f4612f, this.f4613g, this.f4614h, continuation);
        windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.f4609c = obj;
        return windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1) create((e83) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX WARN: Code duplicated, block: B:24:0x005c A[Catch: all -> 0x001c, TRY_LEAVE, TryCatch #0 {all -> 0x001c, blocks: (B:7:0x0016, B:18:0x0043, B:22:0x0054, B:24:0x005c, B:14:0x002b, B:17:0x003c), top: B:31:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0081  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
    
        if (r6.emit(r7, r10) == r0) goto L26;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007e -> B:8:0x0019). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var;
        ej0 ej0Var;
        e83 e83Var2;
        ej0 ej0Var2;
        Object objM11164b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f4608b;
        z6b z6bVar = this.f4612f;
        ContentResolver contentResolver = this.f4610d;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                e83Var = (e83) this.f4609c;
                contentResolver.registerContentObserver(this.f4611e, false, z6bVar);
                ej0Var = new ej0(this.f4613g);
                this.f4609c = e83Var;
                this.f4607a = ej0Var;
                this.f4608b = 1;
                objM11164b = ej0Var.m11164b(this);
                if (objM11164b == coroutineSingletons) {
                    ej0 ej0Var3 = ej0Var;
                    e83Var2 = e83Var;
                    obj = objM11164b;
                    ej0Var2 = ej0Var3;
                    if (!((Boolean) obj).booleanValue()) {
                        contentResolver.unregisterContentObserver(z6bVar);
                        return xfa.f68157a;
                    }
                    ej0Var2.m11165c();
                    Context context = this.f4614h;
                    n66 n66Var = a7b.f332a;
                    Float f = new Float(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                    this.f4609c = e83Var2;
                    this.f4607a = ej0Var2;
                    this.f4608b = 2;
                }
                return coroutineSingletons;
            }
            if (i == 1) {
                ej0Var2 = this.f4607a;
                e83Var2 = (e83) this.f4609c;
                AbstractC3193b.m15359b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    contentResolver.unregisterContentObserver(z6bVar);
                    return xfa.f68157a;
                }
                ej0Var2.m11165c();
                Context context2 = this.f4614h;
                n66 n66Var2 = a7b.f332a;
                Float f2 = new Float(Settings.Global.getFloat(context2.getContentResolver(), "animator_duration_scale", 1.0f));
                this.f4609c = e83Var2;
                this.f4607a = ej0Var2;
                this.f4608b = 2;
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ej0Var2 = this.f4607a;
                e83Var2 = (e83) this.f4609c;
                AbstractC3193b.m15359b(obj);
            }
            e83Var = e83Var2;
            ej0Var = ej0Var2;
            this.f4609c = e83Var;
            this.f4607a = ej0Var;
            this.f4608b = 1;
            objM11164b = ej0Var.m11164b(this);
            if (objM11164b == coroutineSingletons) {
                ej0 ej0Var4 = ej0Var;
                e83Var2 = e83Var;
                obj = objM11164b;
                ej0Var2 = ej0Var4;
                if (!((Boolean) obj).booleanValue()) {
                    contentResolver.unregisterContentObserver(z6bVar);
                    return xfa.f68157a;
                }
                ej0Var2.m11165c();
                Context context3 = this.f4614h;
                n66 n66Var3 = a7b.f332a;
                Float f3 = new Float(Settings.Global.getFloat(context3.getContentResolver(), "animator_duration_scale", 1.0f));
                this.f4609c = e83Var2;
                this.f4607a = ej0Var2;
                this.f4608b = 2;
            }
            return coroutineSingletons;
        } catch (Throwable th) {
            contentResolver.unregisterContentObserver(z6bVar);
            throw th;
        }
    }
}
