package p021b0;

import android.content.Context;
import android.view.ViewGroup;
import com.linguist.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: b0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1280e extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public final int f7962a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f7963b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f7964c;

    /* JADX INFO: renamed from: d */
    public final C1281f f7965d;

    /* JADX INFO: renamed from: e */
    public int f7966e;

    public C1280e(Context context) {
        super(context);
        this.f7962a = 5;
        ArrayList arrayList = new ArrayList();
        this.f7963b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f7964c = arrayList2;
        this.f7965d = new C1281f(0);
        setClipChildren(false);
        C1282g c1282g = new C1282g(context);
        addView(c1282g);
        arrayList.add(c1282g);
        arrayList2.add(c1282g);
        this.f7966e = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }
}
