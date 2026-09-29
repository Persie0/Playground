package p000;

import com.lingq.feature.search.search.C2779e;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes3.dex */
public final class kt8 implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48416a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2779e f48417b;

    public /* synthetic */ kt8(C2779e c2779e, int i) {
        this.f48416a = i;
        this.f48417b = c2779e;
    }

    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) {
        Object value;
        Object value2;
        int i = this.f48416a;
        xfa xfaVar = xfa.f68157a;
        C2779e c2779e = this.f48417b;
        switch (i) {
            case 0:
                List list = (List) obj;
                C3244l c3244l = c2779e.f33114v;
                do {
                    value = c3244l.getValue();
                } while (!c3244l.m15570h(value, ar8.m3015a((ar8) value, null, null, null, list, null, null, null, false, false, false, false, 0, null, null, null, null, 65527)));
                break;
            default:
                List list2 = (List) obj;
                C3244l c3244l2 = c2779e.f33114v;
                do {
                    value2 = c3244l2.getValue();
                } while (!c3244l2.m15570h(value2, ar8.m3015a((ar8) value2, null, null, list2, null, null, null, null, false, false, false, false, 0, null, null, null, null, 65531)));
                break;
        }
        return xfaVar;
    }
}
