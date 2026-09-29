package p000;

import com.lingq.feature.collections.domain.C2036b;
import java.util.function.BiFunction;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gj2 implements BiFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40870a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zi3 f40871b;

    public /* synthetic */ gj2(int i, zi3 zi3Var) {
        this.f40870a = i;
        this.f40871b = zi3Var;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i = this.f40870a;
        zi3 zi3Var = this.f40871b;
        switch (i) {
            case 0:
                return (cd4) ((C3368nd) zi3Var).invoke(obj, obj2);
            case 1:
                return (cd4) ((C3368nd) zi3Var).invoke(obj, obj2);
            default:
                return (cd4) ((C2036b) zi3Var).invoke(obj, obj2);
        }
    }
}
