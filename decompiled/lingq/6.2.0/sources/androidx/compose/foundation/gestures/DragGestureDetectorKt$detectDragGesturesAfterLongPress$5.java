package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.input.pointer.C0332f;
import com.lingq.core.p012ui.dragdrop.C1918a;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p000.C0011a9;
import p000.C3386nv;
import p000.c32;
import p000.ci8;
import p000.ek2;
import p000.fk2;
import p000.gq6;
import p000.kg7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", m4291f = "DragGestureDetector.kt", m4292l = {382, 383, 388}, m4293m = "invokeSuspend", m4294v = 1)
final class DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 extends RestrictedSuspendLambda implements zi3 {

    /* JADX INFO: renamed from: b */
    public int f1904b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f1905c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ek2 f1906d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ fk2 f1907e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ fk2 f1908f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1918a f1909g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(ek2 ek2Var, fk2 fk2Var, fk2 fk2Var2, C1918a c1918a, Continuation continuation) {
        super(2, continuation);
        this.f1906d = ek2Var;
        this.f1907e = fk2Var;
        this.f1908f = fk2Var2;
        this.f1909g = c1918a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 dragGestureDetectorKt$detectDragGesturesAfterLongPress$5 = new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(this.f1906d, this.f1907e, this.f1908f, this.f1909g, continuation);
        dragGestureDetectorKt$detectDragGesturesAfterLongPress$5.f1905c = obj;
        return dragGestureDetectorKt$detectDragGesturesAfterLongPress$5;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((DragGestureDetectorKt$detectDragGesturesAfterLongPress$5) create((C0332f) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005a A[Catch: CancellationException -> 0x001b, TryCatch #0 {CancellationException -> 0x001b, blocks: (B:8:0x0017, B:33:0x007d, B:35:0x0085, B:37:0x0094, B:39:0x00a0, B:40:0x00a3, B:41:0x00a6, B:42:0x00ac, B:15:0x0028, B:27:0x0056, B:29:0x005a, B:18:0x0030, B:24:0x0047, B:21:0x003c), top: B:47:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:32:0x007c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0085 A[Catch: CancellationException -> 0x001b, TryCatch #0 {CancellationException -> 0x001b, blocks: (B:8:0x0017, B:33:0x007d, B:35:0x0085, B:37:0x0094, B:39:0x00a0, B:40:0x00a3, B:41:0x00a6, B:42:0x00ac, B:15:0x0028, B:27:0x0056, B:29:0x005a, B:18:0x0030, B:24:0x0047, B:21:0x003c), top: B:47:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0094 A[Catch: CancellationException -> 0x001b, TryCatch #0 {CancellationException -> 0x001b, blocks: (B:8:0x0017, B:33:0x007d, B:35:0x0085, B:37:0x0094, B:39:0x00a0, B:40:0x00a3, B:41:0x00a6, B:42:0x00ac, B:15:0x0028, B:27:0x0056, B:29:0x005a, B:18:0x0030, B:24:0x0047, B:21:0x003c), top: B:47:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a0 A[Catch: CancellationException -> 0x001b, TryCatch #0 {CancellationException -> 0x001b, blocks: (B:8:0x0017, B:33:0x007d, B:35:0x0085, B:37:0x0094, B:39:0x00a0, B:40:0x00a3, B:41:0x00a6, B:42:0x00ac, B:15:0x0028, B:27:0x0056, B:29:0x005a, B:18:0x0030, B:24:0x0047, B:21:0x003c), top: B:47:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ac A[Catch: CancellationException -> 0x001b, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x001b, blocks: (B:8:0x0017, B:33:0x007d, B:35:0x0085, B:37:0x0094, B:39:0x00a0, B:40:0x00a3, B:41:0x00a6, B:42:0x00ac, B:15:0x0028, B:27:0x0056, B:29:0x005a, B:18:0x0030, B:24:0x0047, B:21:0x003c), top: B:47:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a3 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        C0332f c0332f;
        kg7 kg7Var;
        C0332f c0332f2;
        List list;
        int size;
        kg7 kg7Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f1904b;
        fk2 fk2Var = this.f1908f;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                c0332f = (C0332f) this.f1905c;
                this.f1905c = c0332f;
                this.f1904b = 1;
                obj = AbstractC0117w.m939b(c0332f, false, null, this, 2);
                if (obj == coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i == 1) {
                c0332f = (C0332f) this.f1905c;
                AbstractC3193b.m15359b(obj);
            } else {
                if (i == 2) {
                    c0332f = (C0332f) this.f1905c;
                    AbstractC3193b.m15359b(obj);
                    kg7Var = (kg7) obj;
                    if (kg7Var != null) {
                        this.f1906d.invoke(new gq6(kg7Var.f47237c));
                        long j = kg7Var.f47235a;
                        C0011a9 c0011a9 = new C0011a9(this.f1909g, 13);
                        this.f1905c = c0332f;
                        this.f1904b = 3;
                        obj = AbstractC0102j.m871f(c0332f, j, c0011a9, this);
                        if (obj != coroutineSingletons) {
                            c0332f2 = c0332f;
                        }
                        return coroutineSingletons;
                    }
                    return xfa.f68157a;
                }
                if (i != 3) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c0332f2 = (C0332f) this.f1905c;
                AbstractC3193b.m15359b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                list = c0332f2.f4136f.f4142O.f39071a;
                size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    kg7Var2 = (kg7) list.get(i2);
                    if (ci8.m4724i(kg7Var2)) {
                        kg7Var2.m15189a();
                    }
                }
                this.f1907e.mo0a();
            } else {
                fk2Var.mo0a();
            }
            return xfa.f68157a;
            long j2 = ((kg7) obj).f47235a;
            this.f1905c = c0332f;
            this.f1904b = 2;
            obj = AbstractC0102j.m867b(c0332f, j2, this);
            if (obj != coroutineSingletons) {
                kg7Var = (kg7) obj;
                if (kg7Var != null) {
                    this.f1906d.invoke(new gq6(kg7Var.f47237c));
                    long j3 = kg7Var.f47235a;
                    C0011a9 c0011a10 = new C0011a9(this.f1909g, 13);
                    this.f1905c = c0332f;
                    this.f1904b = 3;
                    obj = AbstractC0102j.m871f(c0332f, j3, c0011a10, this);
                    if (obj != coroutineSingletons) {
                        c0332f2 = c0332f;
                        if (((Boolean) obj).booleanValue()) {
                            list = c0332f2.f4136f.f4142O.f39071a;
                            size = list.size();
                            while (i2 < size) {
                                kg7Var2 = (kg7) list.get(i2);
                                if (ci8.m4724i(kg7Var2)) {
                                    kg7Var2.m15189a();
                                }
                            }
                            this.f1907e.mo0a();
                        } else {
                            fk2Var.mo0a();
                        }
                    }
                }
                return xfa.f68157a;
            }
            return coroutineSingletons;
        } catch (CancellationException e) {
            fk2Var.mo0a();
            throw e;
        }
    }
}
