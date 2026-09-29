package p000;

import com.google.android.gms.tasks.Task;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tg1 implements bm1, w92, gp9 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f62249a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f62250b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f62251c;

    public /* synthetic */ tg1(n16 n16Var, q50 q50Var, long j) {
        this.f62250b = n16Var;
        this.f62251c = q50Var;
        this.f62249a = j;
    }

    @Override // p000.bm1
    /* JADX INFO: renamed from: e */
    public Object mo393e(Task task) {
        return ((xg1) this.f62250b).m24490b(task, this.f62249a, (HashMap) this.f62251c);
    }

    @Override // p000.w92
    /* JADX INFO: renamed from: h */
    public void mo13969h(uo7 uo7Var) {
        ((up1) uo7Var.get()).m22851d((String) this.f62250b, this.f62249a, (l50) this.f62251c);
    }

    @Override // p000.gp9
    /* JADX INFO: renamed from: n */
    public Object mo395n() {
        n16 n16Var = (n16) this.f62250b;
        q50 q50Var = (q50) this.f62251c;
        hk8 hk8Var = (hk8) n16Var.f52175c;
        long jMo100g = ((a41) n16Var.f52179g).mo100g() + this.f62249a;
        hk8Var.getClass();
        hk8Var.m13314c(new dk8(jMo100g, q50Var));
        return null;
    }

    public /* synthetic */ tg1(Object obj, long j, Object obj2) {
        this.f62250b = obj;
        this.f62249a = j;
        this.f62251c = obj2;
    }
}
