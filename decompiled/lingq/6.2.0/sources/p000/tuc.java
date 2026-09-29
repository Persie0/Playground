package p000;

import com.lingq.core.database.entity.TranslationSentenceEntity;
import com.lingq.core.domain.model.lesson.Translation;
import com.lingq.core.network.api.result.ResultTranslationSentenceV3;
import com.lingq.core.network.api.result.ResultTranslationV3;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tuc {

    /* JADX INFO: renamed from: a */
    public static final String[] f62918a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: b */
    public static final int[] f62919b = {44100, 48000, 32000};

    /* JADX INFO: renamed from: c */
    public static final int[] f62920c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: d */
    public static final int[] f62921d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: e */
    public static final int[] f62922e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: f */
    public static final int[] f62923f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: g */
    public static final int[] f62924g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* JADX INFO: renamed from: a */
    public static int m22309a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = f62919b[i5];
        if (i2 == 2) {
            i7 /= 2;
        } else if (i2 == 0) {
            i7 /= 4;
        }
        int i8 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? f62920c[i4 - 1] : f62921d[i4 - 1]) * 12) / i7) + i8) * 4;
        }
        if (i2 == 3) {
            i6 = i3 == 2 ? f62922e[i4 - 1] : f62923f[i4 - 1];
        } else {
            i6 = f62924g[i4 - 1];
        }
        if (i2 == 3) {
            return hn1.m13352a(i6, 144, i7, i8);
        }
        return hn1.m13352a(i3 == 1 ? 72 : 144, i6, i7, i8);
    }

    /* JADX INFO: renamed from: b */
    public static int m22310b(int i) {
        int i2;
        int i3;
        if ((i & (-2097152)) == -2097152 && (i2 = (i >>> 19) & 3) != 1 && (i3 = (i >>> 17) & 3) != 0) {
            int i4 = (i >>> 12) & 15;
            int i5 = (i >>> 10) & 3;
            if (i4 != 0 && i4 != 15 && i5 != 3) {
                if (i3 == 1) {
                    return i2 == 3 ? 1152 : 576;
                }
                if (i3 == 2) {
                    return 1152;
                }
                if (i3 == 3) {
                    return 384;
                }
                ij6.m13959q();
                return 0;
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List] */
    /* JADX INFO: renamed from: c */
    public static final ArrayList m22311c(int i, List list) {
        ?? arrayList;
        String str;
        String str2;
        Double d;
        Double d2;
        list.getClass();
        List<ResultTranslationSentenceV3> list2 = list;
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(list2, 10));
        for (ResultTranslationSentenceV3 resultTranslationSentenceV3 : list2) {
            resultTranslationSentenceV3.getClass();
            int i2 = resultTranslationSentenceV3.f21617a;
            List list3 = resultTranslationSentenceV3.f21620d;
            double dDoubleValue = 0.0d;
            Double dValueOf = Double.valueOf((list3 == null || (d2 = (Double) u91.m22591I0(list3)) == null) ? 0.0d : d2.doubleValue());
            if (list3 != null && (d = (Double) u91.m22598P0(list3)) != null) {
                dDoubleValue = d.doubleValue();
            }
            Double dValueOf2 = Double.valueOf(dDoubleValue);
            String str3 = resultTranslationSentenceV3.f21619c;
            String str4 = str3 == null ? "" : str3;
            List list4 = resultTranslationSentenceV3.f21621e;
            if (list4 != null) {
                List<ResultTranslationV3> list5 = list4;
                arrayList = new ArrayList(v91.m23189q0(list5, 10));
                for (ResultTranslationV3 resultTranslationV3 : list5) {
                    if (resultTranslationV3 == null || (str = resultTranslationV3.f21624b) == null) {
                        str = "";
                    }
                    if (resultTranslationV3 == null || (str2 = resultTranslationV3.f21623a) == null) {
                        str2 = "";
                    }
                    arrayList.add(new Translation(str, str2, false));
                }
            } else {
                arrayList = EmptyList.f47638a;
            }
            arrayList2.add(new TranslationSentenceEntity(i2, i, dValueOf, dValueOf2, str4, arrayList));
        }
        return arrayList2;
    }
}
