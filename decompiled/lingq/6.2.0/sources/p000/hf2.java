package p000;

import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.domain.model.lesson.LessonCard;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hf2 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42295a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ f5a f42296b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f42297c;

    public /* synthetic */ hf2(f5a f5aVar, vi3 vi3Var, int i) {
        this.f42295a = i;
        this.f42296b = f5aVar;
        this.f42297c = vi3Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f42295a;
        xfa xfaVar = xfa.f68157a;
        vi3 vi3Var = this.f42297c;
        f5a f5aVar = this.f42296b;
        vu4 vu4Var = (vu4) obj;
        switch (i) {
            case 0:
                vu4Var.getClass();
                List list = f5aVar.f38489u;
                vu4Var.m23547h(list.size(), new ue0(6, new ae1(17), list), new C3520r2(10, list), new C0282a(802480018, true, new ve0(3, vi3Var, list, f5aVar)));
                break;
            default:
                vu4Var.getClass();
                if (f5aVar.f38474f instanceof LessonCard) {
                    vu4.m23545g(vu4Var, null, new C0282a(-833549425, true, new xw8(vi3Var, 2)), 3);
                }
                List list2 = f5aVar.f38483o;
                ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    vu4.m23545g(vu4Var, null, new C0282a(1966581606, true, new iz4(25, (br9) it.next(), vi3Var)), 3);
                    arrayList.add(xfaVar);
                }
                break;
        }
        return xfaVar;
    }
}
