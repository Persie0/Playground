package androidx.glance.appwidget;

import java.util.concurrent.CancellationException;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.C3229i;
import p000.C3386nv;
import p000.eh0;
import p000.gl1;
import p000.in1;
import p000.jn1;
import p000.kn1;
import p000.zi3;

/* JADX INFO: renamed from: androidx.glance.appwidget.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0650a implements gl1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3229i f5980a;

    public C0650a(C3229i c3229i) {
        this.f5980a = c3229i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.gl1
    /* JADX INFO: renamed from: J */
    public final CoroutineSingletons mo2215J(zi3 zi3Var, ContinuationImpl continuationImpl) throws Throwable {
        C0643xf6f12246 c0643xf6f12246;
        if (continuationImpl instanceof C0643xf6f12246) {
            c0643xf6f12246 = (C0643xf6f12246) continuationImpl;
            int i = c0643xf6f12246.f5796c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0643xf6f12246.f5796c = i - Integer.MIN_VALUE;
            } else {
                c0643xf6f12246 = new C0643xf6f12246(this, continuationImpl);
            }
        } else {
            c0643xf6f12246 = new C0643xf6f12246(this, continuationImpl);
        }
        Object obj = c0643xf6f12246.f5794a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c0643xf6f12246.f5796c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            c0643xf6f12246.f5796c = 1;
            if (this.f5980a.emit(zi3Var, c0643xf6f12246) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        throw new CancellationException();
    }

    @Override // p000.kn1
    public final Object fold(Object obj, zi3 zi3Var) {
        return zi3Var.invoke(obj, this);
    }

    @Override // p000.kn1
    public final in1 get(jn1 jn1Var) {
        return eh0.m11141v(this, jn1Var);
    }

    @Override // p000.kn1
    public final kn1 minusKey(jn1 jn1Var) {
        return eh0.m11107D(this, jn1Var);
    }

    @Override // p000.kn1
    public final kn1 plus(kn1 kn1Var) {
        return eh0.m11113J(this, kn1Var);
    }
}
