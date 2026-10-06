package p000;

import android.content.Context;
import android.graphics.RectF;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import p021j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: jt */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0753jt {

    /* JADX INFO: renamed from: a */
    public int f34752a = 0;

    /* JADX INFO: renamed from: b */
    public float f34753b = -1.0f;

    /* JADX INFO: renamed from: c */
    public float f34754c = -1.0f;

    /* JADX INFO: renamed from: d */
    public float f34755d = -1.0f;

    /* JADX INFO: renamed from: e */
    public int[] f34756e = new int[0];

    /* JADX INFO: renamed from: f */
    public boolean f34757f = false;

    /* JADX INFO: renamed from: g */
    public final TextView f34758g;

    /* JADX INFO: renamed from: h */
    public final Context f34759h;

    static {
        new RectF();
        new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public C0753jt(TextView textView) {
        this.f34758g = textView;
        this.f34759h = textView.getContext();
    }

    /* JADX INFO: renamed from: b */
    public static final int[] m13499b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0) {
                Integer numValueOf = Integer.valueOf(i);
                if (Collections.binarySearch(arrayList, numValueOf) < 0) {
                    arrayList.add(numValueOf);
                }
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m13500a() {
        return !(this.f34758g instanceof C0272ip);
    }
}
