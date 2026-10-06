package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ar */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0045ar {

    /* JADX INFO: renamed from: a */
    public int f2163a;

    /* JADX INFO: renamed from: b */
    public int f2164b;

    /* JADX INFO: renamed from: c */
    public int f2165c;

    /* JADX INFO: renamed from: d */
    public int f2166d;

    /* JADX INFO: renamed from: e */
    public ArrayList f2167e = new ArrayList();

    public C0045ar(C0014an c0014an) {
        this.f2163a = c0014an.f833w;
        this.f2164b = c0014an.f834x;
        this.f2165c = c0014an.m994h();
        this.f2166d = c0014an.m990d();
        ArrayList arrayList = c0014an.f827q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f2167e.add(new C0044aq((C0013am) arrayList.get(i)));
        }
    }
}
