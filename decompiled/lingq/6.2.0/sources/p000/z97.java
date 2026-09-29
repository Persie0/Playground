package p000;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.C0713b;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes2.dex */
public final class z97 {

    /* JADX INFO: renamed from: a */
    public final Context f71227a;

    /* JADX INFO: renamed from: b */
    public final x97 f71228b;

    /* JADX INFO: renamed from: c */
    public final SparseArray f71229c;

    /* JADX INFO: renamed from: d */
    public final boolean f71230d;

    /* JADX INFO: renamed from: e */
    public final r92 f71231e;

    /* JADX INFO: renamed from: f */
    public final mp9 f71232f;

    /* JADX INFO: renamed from: g */
    public final CopyOnWriteArraySet f71233g;

    /* JADX INFO: renamed from: h */
    public final long f71234h;

    /* JADX INFO: renamed from: i */
    public final zpa f71235i;

    /* JADX INFO: renamed from: j */
    public gh1 f71236j = new gh1(3);

    /* JADX INFO: renamed from: k */
    public qp9 f71237k;

    /* JADX INFO: renamed from: l */
    public Pair f71238l;

    /* JADX INFO: renamed from: m */
    public int f71239m;

    /* JADX INFO: renamed from: n */
    public int f71240n;

    /* JADX INFO: renamed from: o */
    public long f71241o;

    /* JADX INFO: renamed from: p */
    public int f71242p;

    public z97(t97 t97Var) {
        this.f71227a = t97Var.f62015a;
        x97 x97Var = t97Var.f62017c;
        x97Var.getClass();
        this.f71228b = x97Var;
        this.f71229c = new SparseArray();
        ImmutableList.m6289v();
        this.f71230d = t97Var.f62018d;
        mp9 mp9Var = t97Var.f62019e;
        this.f71232f = mp9Var;
        long j = t97Var.f62021g;
        this.f71234h = j != -9223372036854775807L ? -j : -9223372036854775807L;
        zpa zpaVar = t97Var.f62022h;
        this.f71235i = zpaVar;
        this.f71231e = new r92(t97Var.f62016b, zpaVar, mp9Var);
        this.f71233g = new CopyOnWriteArraySet();
        new C0713b(new lc3());
        this.f71241o = -9223372036854775807L;
        this.f71242p = -1;
        this.f71240n = 0;
    }

    /* JADX INFO: renamed from: a */
    public final ksa m25514a() {
        SparseArray sparseArray = this.f71229c;
        if (uma.m22814i(sparseArray, 0)) {
            return (ksa) sparseArray.get(0);
        }
        u97 u97Var = new u97(this, this.f71227a);
        this.f71233g.add(u97Var);
        sparseArray.put(0, u97Var);
        return u97Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m25515b() {
        if (1 < this.f71242p) {
            return;
        }
        this.f71242p = 1;
    }
}
