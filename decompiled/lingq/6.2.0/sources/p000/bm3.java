package p000;

import java.time.LocalDate;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public final class bm3 implements c83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ yo1 f8679a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cm3 f8680b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f8681c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ LocalDate f8682d;

    public bm3(yo1 yo1Var, cm3 cm3Var, String str, LocalDate localDate) {
        this.f8679a = yo1Var;
        this.f8680b = cm3Var;
        this.f8681c = str;
        this.f8682d = localDate;
    }

    @Override // p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) {
        Object objCollect = this.f8679a.collect(new C3503qm(e83Var, this.f8680b, this.f8681c, this.f8682d), continuation);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : xfa.f68157a;
    }
}
