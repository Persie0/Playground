package p000;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final class n04 {

    /* JADX INFO: renamed from: a */
    public final String f52109a;

    /* JADX INFO: renamed from: b */
    public final float f52110b;

    /* JADX INFO: renamed from: c */
    public final float f52111c;

    /* JADX INFO: renamed from: d */
    public final float f52112d;

    /* JADX INFO: renamed from: e */
    public final float f52113e;

    /* JADX INFO: renamed from: f */
    public final float f52114f;

    /* JADX INFO: renamed from: g */
    public final float f52115g;

    /* JADX INFO: renamed from: h */
    public final float f52116h;

    /* JADX INFO: renamed from: i */
    public final List f52117i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f52118j;

    public n04(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, int i) {
        str = (i & 1) != 0 ? "" : str;
        f = (i & 2) != 0 ? 0.0f : f;
        f2 = (i & 4) != 0 ? 0.0f : f2;
        f3 = (i & 8) != 0 ? 0.0f : f3;
        f4 = (i & 16) != 0 ? 1.0f : f4;
        f5 = (i & 32) != 0 ? 1.0f : f5;
        f6 = (i & 64) != 0 ? 0.0f : f6;
        f7 = (i & 128) != 0 ? 0.0f : f7;
        if ((i & 256) != 0) {
            int i2 = soa.f61116a;
            list = EmptyList.f47638a;
        }
        ArrayList arrayList = new ArrayList();
        this.f52109a = str;
        this.f52110b = f;
        this.f52111c = f2;
        this.f52112d = f3;
        this.f52113e = f4;
        this.f52114f = f5;
        this.f52115g = f6;
        this.f52116h = f7;
        this.f52117i = list;
        this.f52118j = arrayList;
    }
}
