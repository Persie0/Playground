package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.input.pointer.C0332f;
import androidx.compose.p002ui.input.pointer.PointerEventPass;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.c32;
import p000.kn1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", m4291f = "ForEachGesture.kt", m4292l = {102, 105, 110}, m4293m = "invokeSuspend", m4294v = 1)
final class ForEachGestureKt$awaitEachGesture$2 extends RestrictedSuspendLambda implements zi3 {

    /* JADX INFO: renamed from: b */
    public int f1977b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f1978c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ kn1 f1979d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zi3 f1980e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForEachGestureKt$awaitEachGesture$2(zi3 zi3Var, kn1 kn1Var, Continuation continuation) {
        super(2, continuation);
        this.f1979d = kn1Var;
        this.f1980e = zi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ForEachGestureKt$awaitEachGesture$2 forEachGestureKt$awaitEachGesture$2 = new ForEachGestureKt$awaitEachGesture$2(this.f1980e, this.f1979d, continuation);
        forEachGestureKt$awaitEachGesture$2.f1978c = obj;
        return forEachGestureKt$awaitEachGesture$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ForEachGestureKt$awaitEachGesture$2) create((C0332f) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:38|21|(2:24|25)|34) */
    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Code duplicated, block: B:35:0x0072  */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:38:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        if (r9 == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
    
        r1 = r9;
        r9 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006f, code lost:
    
        if (androidx.compose.foundation.gestures.AbstractC0095c.m835j(r1, androidx.compose.p002ui.input.pointer.PointerEventPass.Final, r8) == r0) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.ui.input.pointer.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.ui.input.pointer.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [zi3] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0058 -> B:12:0x0027). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x006f -> B:12:0x0027). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r9;
        ?? r1;
        ?? r2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r3 = this.f1977b;
        kn1 kn1Var = this.f1979d;
        try {
            if (r3 == 0) {
                AbstractC3193b.m15359b(obj);
                r9 = (C0332f) this.f1978c;
                if (AbstractC3208a.m15443j(kn1Var)) {
                    return xfa.f68157a;
                }
                r1 = this.f1980e;
                this.f1978c = r9;
                this.f1977b = 1;
                if (r1.invoke(r9, this) != coroutineSingletons) {
                    r3 = r9;
                    this.f1978c = r3;
                    this.f1977b = 2;
                    Object objM835j = AbstractC0095c.m835j(r3, PointerEventPass.Final, this);
                    r2 = r3;
                }
                r2 = r3;
                return coroutineSingletons;
            }
            if (r3 == 1) {
                C0332f c0332f = (C0332f) this.f1978c;
                AbstractC3193b.m15359b(obj);
                r3 = c0332f;
                this.f1978c = r3;
                this.f1977b = 2;
                Object objM835j2 = AbstractC0095c.m835j(r3, PointerEventPass.Final, this);
                r2 = r3;
            } else if (r3 == 2) {
                C0332f c0332f2 = (C0332f) this.f1978c;
                AbstractC3193b.m15359b(obj);
                r2 = c0332f2;
            } else {
                if (r3 != 3) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                C0332f c0332f3 = (C0332f) this.f1978c;
                AbstractC3193b.m15359b(obj);
                r2 = c0332f3;
            }
        } catch (CancellationException e) {
            e = e;
            if (!AbstractC3208a.m15443j(kn1Var)) {
                throw e;
            }
            this.f1978c = r3;
            this.f1977b = 3;
        }
        r2 = r3;
        r9 = r2;
        if (AbstractC3208a.m15443j(kn1Var)) {
            return xfa.f68157a;
        }
        r1 = this.f1980e;
        this.f1978c = r9;
        this.f1977b = 1;
        if (r1.invoke(r9, this) != coroutineSingletons) {
            r3 = r9;
            this.f1978c = r3;
            this.f1977b = 2;
            Object objM835j3 = AbstractC0095c.m835j(r3, PointerEventPass.Final, this);
            r2 = r3;
        }
        r2 = r3;
        return coroutineSingletons;
    }
}
