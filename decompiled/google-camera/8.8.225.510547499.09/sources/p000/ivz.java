package p000;

import android.support.wearable.complications.rendering.p002EM.voNZjxiJou;
import android.util.SparseArray;
import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ivz {

    /* JADX INFO: renamed from: a */
    public static final int[] f32455a;

    /* JADX INFO: renamed from: b */
    private static final SparseArray f32456b;

    static {
        SparseArray sparseArray = new SparseArray();
        f32456b = sparseArray;
        sparseArray.append(0, "com.google.android.camera.experimental2015.ExperimentalKeys");
        sparseArray.append(1, "com.google.android.camera.experimental2016.ExperimentalKeys");
        sparseArray.append(2, "com.google.android.camera.experimental2017.ExperimentalKeys");
        sparseArray.append(3, "com.google.android.camera.experimental2018.ExperimentalKeys");
        sparseArray.append(4, pIeXJQLZLfgIN.xImjMZnbmbZP);
        sparseArray.append(5, voNZjxiJou.NzxqWYPFocD);
        sparseArray.append(6, "com.google.android.camera.experimental2020.ExperimentalKeys");
        sparseArray.append(7, "com.google.android.camera.experimental2021.ExperimentalKeys");
        sparseArray.append(8, "com.google.android.camera.experimental2022.ExperimentalKeys");
        sparseArray.append(9, "com.google.android.camera.experimental2022_system.ExperimentalKeys");
        sparseArray.append(10, "com.google.android.camera.experimental2023.ExperimentalKeys");
        f32455a = m11821c();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m11819a(int[] iArr, int i) {
        return Arrays.binarySearch(iArr, i) >= 0;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m11820b(int i) {
        return m11819a(f32455a, i);
    }

    /* JADX INFO: renamed from: c */
    private static int[] m11821c() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = f32456b;
            if (i2 >= sparseArray.size()) {
                break;
            }
            try {
                Class.forName((String) sparseArray.valueAt(i2));
                arrayList.add(Integer.valueOf(sparseArray.keyAt(i2)));
            } catch (ClassNotFoundException e) {
            } catch (NoClassDefFoundError e2) {
            }
            i2++;
        }
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i3 = 0;
        while (i < size) {
            iArr[i3] = ((Integer) arrayList.get(i)).intValue();
            i++;
            i3++;
        }
        Arrays.sort(iArr);
        return iArr;
    }
}
