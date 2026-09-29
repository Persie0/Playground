package androidx.compose.material3;

import androidx.compose.foundation.gestures.AbstractC0095c;
import androidx.compose.foundation.gestures.C0097e;
import androidx.compose.runtime.AbstractC0278f;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p000.C3386nv;
import p000.a62;
import p000.gc2;
import p000.l43;
import p000.n59;
import p000.ss5;
import p000.ui3;
import p000.vi3;
import p000.x63;
import p000.xc9;
import p000.xfa;
import p000.y47;

/* JADX INFO: renamed from: androidx.compose.material3.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0269z {

    /* JADX INFO: renamed from: a */
    public final boolean f3647a;

    /* JADX INFO: renamed from: b */
    public final ui3 f3648b;

    /* JADX INFO: renamed from: c */
    public final vi3 f3649c;

    /* JADX INFO: renamed from: d */
    public final gc2 f3650d;

    /* JADX INFO: renamed from: e */
    public final C0097e f3651e;

    /* JADX INFO: renamed from: f */
    public l43 f3652f;

    /* JADX INFO: renamed from: g */
    public l43 f3653g;

    public C0269z(boolean z, ui3 ui3Var, SheetValue sheetValue, vi3 vi3Var) {
        this.f3647a = z;
        this.f3648b = ui3Var;
        this.f3649c = vi3Var;
        if (z && sheetValue == SheetValue.PartiallyExpanded) {
            C3386nv.m17626m("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
            throw null;
        }
        this.f3650d = AbstractC0278f.m1254d(new y47(this, 12));
        float f = n59.f52380a;
        this.f3651e = new C0097e(sheetValue, vi3Var);
        this.f3652f = ss5.m21697X();
        this.f3653g = ss5.m21697X();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m1213a(x63 x63Var, float f, ContinuationImpl continuationImpl) throws Throwable {
        SheetState$anchoredDrag$1 sheetState$anchoredDrag$1;
        Ref$FloatRef ref$FloatRef;
        if (continuationImpl instanceof SheetState$anchoredDrag$1) {
            sheetState$anchoredDrag$1 = (SheetState$anchoredDrag$1) continuationImpl;
            int i = sheetState$anchoredDrag$1.f3253d;
            if ((i & Integer.MIN_VALUE) != 0) {
                sheetState$anchoredDrag$1.f3253d = i - Integer.MIN_VALUE;
            } else {
                sheetState$anchoredDrag$1 = new SheetState$anchoredDrag$1(this, continuationImpl);
            }
        } else {
            sheetState$anchoredDrag$1 = new SheetState$anchoredDrag$1(this, continuationImpl);
        }
        Object obj = sheetState$anchoredDrag$1.f3251b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = sheetState$anchoredDrag$1.f3253d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
            SheetState$anchoredDrag$2 sheetState$anchoredDrag$2 = new SheetState$anchoredDrag$2(ref$FloatRef2, x63Var, this, f, null);
            sheetState$anchoredDrag$1.f3250a = ref$FloatRef2;
            sheetState$anchoredDrag$1.f3253d = 1;
            if (C0097e.m847b(this.f3651e, sheetState$anchoredDrag$2, sheetState$anchoredDrag$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            ref$FloatRef = ref$FloatRef2;
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$FloatRef = sheetState$anchoredDrag$1.f3250a;
            AbstractC3193b.m15359b(obj);
        }
        return new Float(ref$FloatRef.f47715a);
    }

    /* JADX INFO: renamed from: b */
    public final Object m1214b(SheetValue sheetValue, l43 l43Var, SuspendLambda suspendLambda) {
        Object objM832g = AbstractC0095c.m832g(this.f3651e, sheetValue, l43Var, suspendLambda);
        return objM832g == CoroutineSingletons.COROUTINE_SUSPENDED ? objM832g : xfa.f68157a;
    }

    /* JADX INFO: renamed from: c */
    public final SheetValue m1215c() {
        return (SheetValue) ((xc9) this.f3651e.f2239h).getValue();
    }

    /* JADX INFO: renamed from: d */
    public final Object m1216d(SuspendLambda suspendLambda) {
        Object objM1214b;
        SheetValue sheetValue = SheetValue.Hidden;
        return (((Boolean) this.f3649c.invoke(sheetValue)).booleanValue() && (objM1214b = m1214b(sheetValue, this.f3653g, suspendLambda)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? objM1214b : xfa.f68157a;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1217e() {
        return ((xc9) this.f3651e.f2238g).getValue() != SheetValue.Hidden;
    }

    /* JADX INFO: renamed from: f */
    public final Object m1218f(SuspendLambda suspendLambda) {
        Object objM1214b;
        if (this.f3647a) {
            C3386nv.m17633t("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
            return null;
        }
        SheetValue sheetValue = SheetValue.PartiallyExpanded;
        return (((Boolean) this.f3649c.invoke(sheetValue)).booleanValue() && (objM1214b = m1214b(sheetValue, this.f3653g, suspendLambda)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? objM1214b : xfa.f68157a;
    }

    /* JADX INFO: renamed from: g */
    public final Object m1219g(SuspendLambda suspendLambda) {
        Object objM1214b;
        a62 a62VarM849c = this.f3651e.m849c();
        SheetValue sheetValue = SheetValue.PartiallyExpanded;
        if (!a62VarM849c.m130c(sheetValue)) {
            sheetValue = SheetValue.Expanded;
        }
        return (((Boolean) this.f3649c.invoke(sheetValue)).booleanValue() && (objM1214b = m1214b(sheetValue, this.f3652f, suspendLambda)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? objM1214b : xfa.f68157a;
    }
}
