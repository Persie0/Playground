package p000;

import android.support.v7.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* JADX INFO: renamed from: my */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class C0839my {

    /* JADX INFO: renamed from: a */
    public int f41787a;

    /* JADX INFO: renamed from: b */
    public int f41788b;

    /* JADX INFO: renamed from: c */
    public boolean f41789c;

    /* JADX INFO: renamed from: d */
    public boolean f41790d;

    /* JADX INFO: renamed from: e */
    public boolean f41791e;

    /* JADX INFO: renamed from: f */
    public int[] f41792f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ StaggeredGridLayoutManager f41793g;

    public C0839my(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f41793g = staggeredGridLayoutManager;
        m17157a();
    }

    /* JADX INFO: renamed from: a */
    public final void m17157a() {
        this.f41787a = -1;
        this.f41788b = Integer.MIN_VALUE;
        this.f41789c = false;
        this.f41790d = false;
        this.f41791e = false;
        int[] iArr = this.f41792f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
