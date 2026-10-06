package p000;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: wk */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1095wk {

    /* JADX INFO: renamed from: a */
    public final Size f47927a;

    /* JADX INFO: renamed from: b */
    public final int f47928b;

    /* JADX INFO: renamed from: c */
    public final String f47929c;

    /* JADX INFO: renamed from: d */
    public final Integer f47930d;

    /* JADX INFO: renamed from: e */
    public final List f47931e;

    /* JADX INFO: renamed from: f */
    public final boolean f47932f;

    /* JADX INFO: renamed from: g */
    private final int f47933g;

    public C1095wk(int i, Size size, int i2, String str, Integer num) {
        this.f47933g = i;
        this.f47927a = size;
        this.f47928b = i2;
        this.f47929c = str;
        this.f47930d = num;
        ArrayList arrayList = new ArrayList();
        this.f47931e = arrayList;
        this.f47932f = arrayList.size() > 1;
    }

    public final String toString() {
        return "OutputConfig-" + this.f47933g;
    }
}
