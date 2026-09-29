package androidx.compose.material3;

import androidx.compose.foundation.gestures.C0097e;
import androidx.compose.foundation.gestures.Orientation;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.dpa;
import p000.pj6;
import p000.uea;
import p000.x63;

/* JADX INFO: renamed from: androidx.compose.material3.y */
/* JADX INFO: loaded from: classes2.dex */
public final class C0268y implements pj6 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0269z f3644a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ x63 f3645b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Orientation f3646c;

    public C0268y(C0269z c0269z, C0227e c0227e, Orientation orientation) {
        this.f3644a = c0269z;
        this.f3645b = c0227e;
        this.f3646c = orientation;
    }

    @Override // p000.pj6
    /* JADX INFO: renamed from: P */
    public final long mo1183P(int i, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f3646c == Orientation.Horizontal ? j >> 32 : j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f || i != 1) {
            return 0L;
        }
        C0097e c0097e = this.f3644a.f3651e;
        float fM851e = c0097e.m851e(fIntBitsToFloat);
        float fM852f = fM851e - c0097e.m852f();
        c0097e.f2245n.m3692a(fM851e, 0.0f);
        return m1212a(fM852f);
    }

    /* JADX INFO: renamed from: a */
    public final long m1212a(float f) {
        Orientation orientation = Orientation.Horizontal;
        Orientation orientation2 = this.f3646c;
        float f2 = orientation2 == orientation ? f : 0.0f;
        if (orientation2 != Orientation.Vertical) {
            f = 0.0f;
        }
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (((long) Float.floatToRawIntBits(f2)) << 32);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.pj6
    /* JADX INFO: renamed from: p0 */
    public final Object mo1198p0(long j, Continuation continuation) throws Throwable {
        C0214x7b851124 c0214x7b851124;
        C0269z c0269z = this.f3644a;
        C0097e c0097e = c0269z.f3651e;
        if (continuation instanceof C0214x7b851124) {
            c0214x7b851124 = (C0214x7b851124) continuation;
            int i = c0214x7b851124.f3249d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0214x7b851124.f3249d = i - Integer.MIN_VALUE;
            } else {
                c0214x7b851124 = new C0214x7b851124(this, (ContinuationImpl) continuation);
            }
        } else {
            c0214x7b851124 = new C0214x7b851124(this, (ContinuationImpl) continuation);
        }
        Object obj = c0214x7b851124.f3247b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c0214x7b851124.f3249d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            float fM10571b = this.f3646c == Orientation.Horizontal ? dpa.m10571b(j) : dpa.m10572c(j);
            float fM852f = c0097e.m852f();
            float fM132e = c0097e.m849c().m132e();
            if (fM10571b >= 0.0f || fM852f <= fM132e) {
                j = 0;
            } else {
                c0214x7b851124.f3246a = j;
                c0214x7b851124.f3249d = 1;
                if (c0269z.m1213a(this.f3645b, fM10571b, c0214x7b851124) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = c0214x7b851124.f3246a;
            AbstractC3193b.m15359b(obj);
        }
        return new dpa(j);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.pj6
    /* JADX INFO: renamed from: t */
    public final Object mo919t(long j, long j2, Continuation continuation) throws Throwable {
        C0213x924538b c0213x924538b;
        if (continuation instanceof C0213x924538b) {
            c0213x924538b = (C0213x924538b) continuation;
            int i = c0213x924538b.f3245d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0213x924538b.f3245d = i - Integer.MIN_VALUE;
            } else {
                c0213x924538b = new C0213x924538b(this, (ContinuationImpl) continuation);
            }
        } else {
            c0213x924538b = new C0213x924538b(this, (ContinuationImpl) continuation);
        }
        Object objM1213a = c0213x924538b.f3243b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c0213x924538b.f3245d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM1213a);
            float fM10571b = this.f3646c == Orientation.Horizontal ? dpa.m10571b(j2) : dpa.m10572c(j2);
            c0213x924538b.f3242a = j;
            c0213x924538b.f3245d = 1;
            objM1213a = this.f3644a.m1213a(this.f3645b, fM10571b, c0213x924538b);
            if (objM1213a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = c0213x924538b.f3242a;
            AbstractC3193b.m15359b(objM1213a);
        }
        return new dpa(uea.m22716a(dpa.m10571b(j), ((Number) objM1213a).floatValue()));
    }

    @Override // p000.pj6
    /* JADX INFO: renamed from: u0 */
    public final long mo920u0(int i, long j, long j2) {
        if (i != 1) {
            return 0L;
        }
        C0097e c0097e = this.f3644a.f3651e;
        float fM851e = c0097e.m851e(Float.intBitsToFloat((int) (this.f3646c == Orientation.Horizontal ? j2 >> 32 : 4294967295L & j2)));
        float fM852f = fM851e - c0097e.m852f();
        c0097e.f2245n.m3692a(fM851e, 0.0f);
        return m1212a(fM852f);
    }
}
