package p000;

import com.lingq.feature.edit.C2077c;
import com.lingq.feature.edit.LessonEditViewModel$buildPageStateFlow$$inlined$combine$1$3;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.AbstractC3238h;

/* JADX INFO: loaded from: classes2.dex */
public final class x15 implements c83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ c83[] f67629a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f67630b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2077c f67631c;

    public x15(c83[] c83VarArr, int i, C2077c c2077c) {
        this.f67629a = c83VarArr;
        this.f67630b = i;
        this.f67631c = c2077c;
    }

    @Override // p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) {
        c83[] c83VarArr = this.f67629a;
        Object objM15568a = AbstractC3238h.m15568a(e83Var, new b91(c83VarArr, 6), new LessonEditViewModel$buildPageStateFlow$$inlined$combine$1$3(this.f67630b, this.f67631c, null), continuation, c83VarArr);
        return objM15568a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM15568a : xfa.f68157a;
    }
}
