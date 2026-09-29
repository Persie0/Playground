package p000;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class lg9 {

    /* JADX INFO: renamed from: a */
    public int f49640a;

    /* JADX INFO: renamed from: b */
    public int f49641b;

    /* JADX INFO: renamed from: c */
    public boolean f49642c;

    /* JADX INFO: renamed from: d */
    public boolean f49643d;

    /* JADX INFO: renamed from: e */
    public boolean f49644e;

    /* JADX INFO: renamed from: f */
    public int[] f49645f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ StaggeredGridLayoutManager f49646g;

    public lg9(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f49646g = staggeredGridLayoutManager;
        m16180a();
    }

    /* JADX INFO: renamed from: a */
    public final void m16180a() {
        this.f49640a = -1;
        this.f49641b = Integer.MIN_VALUE;
        this.f49642c = false;
        this.f49643d = false;
        this.f49644e = false;
        int[] iArr = this.f49645f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
