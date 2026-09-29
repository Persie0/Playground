package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dj7 {

    /* JADX INFO: renamed from: a */
    public final List f35723a;

    /* JADX INFO: renamed from: b */
    public final List[] f35724b;

    /* JADX INFO: renamed from: c */
    public int f35725c;

    /* JADX INFO: renamed from: d */
    public int f35726d;

    /* JADX INFO: renamed from: e */
    public boolean f35727e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ej7 f35728f;

    public dj7(ej7 ej7Var, List list) {
        this.f35728f = ej7Var;
        this.f35723a = list;
        this.f35724b = new List[list.size()];
        if (list.isEmpty()) {
            l54.m15814a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
