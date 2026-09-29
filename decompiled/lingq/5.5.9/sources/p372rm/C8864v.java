package p372rm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C6753d;
import mn.C7648e;
import p139go.InterfaceC5853g;

/* JADX INFO: renamed from: rm.v */
/* JADX INFO: loaded from: classes2.dex */
public final class C8864v<Type extends InterfaceC5853g> extends AbstractC8849l0<Type> {

    /* JADX INFO: renamed from: a */
    public final List<Pair<C7648e, Type>> f46767a;

    /* JADX INFO: renamed from: b */
    public final Map<C7648e, Type> f46768b;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C8864v(ArrayList arrayList) {
        this.f46767a = arrayList;
        Map<C7648e, Type> mapM13464Q0 = C6753d.m13464Q0(arrayList);
        if (!(mapM13464Q0.size() == arrayList.size())) {
            throw new IllegalArgumentException("Some properties have the same names".toString());
        }
        this.f46768b = mapM13464Q0;
    }

    @Override // p372rm.AbstractC8849l0
    /* JADX INFO: renamed from: a */
    public final List<Pair<C7648e, Type>> mo17097a() {
        return this.f46767a;
    }
}
