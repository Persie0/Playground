package p000;

import android.content.Context;
import android.graphics.RectF;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: kr */
/* JADX INFO: loaded from: classes.dex */
public final class C3271kr {

    /* JADX INFO: renamed from: a */
    public int f48346a = 0;

    /* JADX INFO: renamed from: b */
    public float f48347b = -1.0f;

    /* JADX INFO: renamed from: c */
    public float f48348c = -1.0f;

    /* JADX INFO: renamed from: d */
    public float f48349d = -1.0f;

    /* JADX INFO: renamed from: e */
    public int[] f48350e = new int[0];

    /* JADX INFO: renamed from: f */
    public boolean f48351f = false;

    /* JADX INFO: renamed from: g */
    public final TextView f48352g;

    /* JADX INFO: renamed from: h */
    public final Context f48353h;

    static {
        new RectF();
        new ConcurrentHashMap();
    }

    public C3271kr(TextView textView) {
        this.f48352g = textView;
        this.f48353h = textView.getContext();
        new C3121ir();
    }

    /* JADX INFO: renamed from: a */
    public static int[] m15649a(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i2 = 0; i2 < size; i2++) {
                    iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m15650b() {
        return !(this.f48352g instanceof AppCompatEditText);
    }
}
