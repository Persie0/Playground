package p000;

import androidx.room.util.AbstractC0758a;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class la2 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49359a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f49360b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f49361c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f49362d;

    public /* synthetic */ la2(Object obj, Object obj2, Object obj3, int i) {
        this.f49359a = i;
        this.f49360b = obj;
        this.f49361c = obj2;
        this.f49362d = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f49359a;
        Object obj = this.f49362d;
        Object obj2 = this.f49361c;
        Object obj3 = this.f49360b;
        switch (i) {
            case 0:
                return ((ma2) obj3).f50827a.submit(new RunnableC0806bd(20, (Callable) obj2, (vqb) obj));
            default:
                String str = (String) obj;
                WorkDatabase workDatabase = ((il7) obj3).f44271e;
                w8b w8bVarMo2903A = workDatabase.mo2903A();
                w8bVarMo2903A.getClass();
                str.getClass();
                ((ArrayList) obj2).addAll((List) AbstractC0758a.m2859b(w8bVarMo2903A.f66537a, true, false, new xca(str, 18)));
                return workDatabase.mo2909z().m22569e(str);
        }
    }
}
