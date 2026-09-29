package p000;

import android.content.res.TypedArray;
import com.facebook.shimmer.R$styleable;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q80 implements InterfaceC2969em {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57374a;

    /* JADX INFO: renamed from: b */
    public final Object f57375b;

    public q80(int i) {
        this.f57374a = i;
        switch (i) {
            case 3:
                this.f57375b = new ConcurrentHashMap();
                break;
            default:
                this.f57375b = new e69();
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public e69 m19758b() {
        e69 e69Var = (e69) this.f57375b;
        int i = e69Var.f36770f;
        int[] iArr = e69Var.f36766b;
        if (i != 1) {
            int i2 = e69Var.f36769e;
            iArr[0] = i2;
            int i3 = e69Var.f36768d;
            iArr[1] = i3;
            iArr[2] = i3;
            iArr[3] = i2;
        } else {
            int i4 = e69Var.f36768d;
            iArr[0] = i4;
            iArr[1] = i4;
            int i5 = e69Var.f36769e;
            iArr[2] = i5;
            iArr[3] = i5;
        }
        float[] fArr = e69Var.f36765a;
        if (i != 1) {
            fArr[0] = Math.max(((1.0f - e69Var.f36775k) - e69Var.f36776l) / 2.0f, 0.0f);
            fArr[1] = Math.max(((1.0f - e69Var.f36775k) - 0.001f) / 2.0f, 0.0f);
            fArr[2] = Math.min(((e69Var.f36775k + 1.0f) + 0.001f) / 2.0f, 1.0f);
            fArr[3] = Math.min(((e69Var.f36775k + 1.0f) + e69Var.f36776l) / 2.0f, 1.0f);
            return e69Var;
        }
        fArr[0] = 0.0f;
        fArr[1] = Math.min(e69Var.f36775k, 1.0f);
        fArr[2] = Math.min(e69Var.f36775k + e69Var.f36776l, 1.0f);
        fArr[3] = 1.0f;
        return e69Var;
    }

    @Override // p000.InterfaceC2969em
    /* JADX INFO: renamed from: c */
    public List mo551c() {
        return (List) this.f57375b;
    }

    @Override // p000.InterfaceC2969em
    /* JADX INFO: renamed from: d */
    public boolean mo552d() {
        List list = (List) this.f57375b;
        return list.isEmpty() || (list.size() == 1 && ((kj4) list.get(0)).m15271c());
    }

    /* JADX INFO: renamed from: e */
    public q80 mo10129e(TypedArray typedArray) {
        e69 e69Var = (e69) this.f57375b;
        if (typedArray.hasValue(R$styleable.ShimmerFrameLayout_shimmer_clip_to_children)) {
            e69Var.f36778n = typedArray.getBoolean(R$styleable.ShimmerFrameLayout_shimmer_clip_to_children, e69Var.f36778n);
        }
        if (typedArray.hasValue(R$styleable.ShimmerFrameLayout_shimmer_auto_start)) {
            e69Var.f36779o = typedArray.getBoolean(R$styleable.ShimmerFrameLayout_shimmer_auto_start, e69Var.f36779o);
        }
        if (typedArray.hasValue(R$styleable.ShimmerFrameLayout_shimmer_base_alpha)) {
            e69Var.f36769e = (((int) (Math.min(1.0f, Math.max(0.0f, typedArray.getFloat(R$styleable.ShimmerFrameLayout_shimmer_base_alpha, 0.3f))) * 255.0f)) << 24) | (e69Var.f36769e & 16777215);
        }
        if (typedArray.hasValue(R$styleable.ShimmerFrameLayout_shimmer_highlight_alpha)) {
            e69Var.f36768d = (((int) (Math.min(1.0f, Math.max(0.0f, typedArray.getFloat(R$styleable.ShimmerFrameLayout_shimmer_highlight_alpha, 1.0f))) * 255.0f)) << 24) | (16777215 & e69Var.f36768d);
        }
        if (typedArray.hasValue(R$styleable.ShimmerFrameLayout_shimmer_duration)) {
            long j = typedArray.getInt(R$styleable.ShimmerFrameLayout_shimmer_duration, (int) e69Var.f36783s);
            if (j < 0) {
                C3386nv.m17626m(wq1.m24116l("Given a negative duration: ", j));
                return null;
            }
            e69Var.f36783s = j;
        }
        if (typedArray.hasValue(R$styleable.ShimmerFrameLayout_shimmer_repeat_count)) {
            e69Var.f36781q = typedArray.getInt(R$styleable.ShimmerFrameLayout_shimmer_repeat_count, e69Var.f36781q);
        }
        if (typedArray.hasValue(R$styleable.ShimmerFrameLayout_shimmer_repeat_delay)) {
            long j2 = typedArray.getInt(R$styleable.ShimmerFrameLayout_shimmer_repeat_delay, (int) e69Var.f36784t);
            if (j2 < 0) {
                C3386nv.m17626m(wq1.m24116l("Given a negative repeat delay: ", j2));
                return null;
            }
            e69Var.f36784t = j2;
        }
        if (typedArray.hasValue(R$styleable.ShimmerFrameLayout_shimmer_repeat_mode)) {
            e69Var.f36782r = typedArray.getInt(R$styleable.ShimmerFrameLayout_shimmer_repeat_mode, e69Var.f36782r);
        }
        if (typedArray.hasValue(R$styleable.ShimmerFrameLayout_shimmer_direction)) {
            int i = typedArray.getInt(R$styleable.ShimmerFrameLayout_shimmer_direction, e69Var.f36767c);
            if (i == 1) {
                e69Var.f36767c = 1;
            } else if (i == 2) {
                e69Var.f36767c = 2;
            } else if (i != 3) {
                e69Var.f36767c = 0;
            } else {
                e69Var.f36767c = 3;
            }
        }
        if (typedArray.hasValue(R$styleable.ShimmerFrameLayout_shimmer_shape)) {
            if (typedArray.getInt(R$styleable.ShimmerFrameLayout_shimmer_shape, e69Var.f36770f) != 1) {
                e69Var.f36770f = 0;
            } else {
                e69Var.f36770f = 1;
            }
        }
        if (typedArray.hasValue(R$styleable.ShimmerFrameLayout_shimmer_dropoff)) {
            float f = typedArray.getFloat(R$styleable.ShimmerFrameLayout_shimmer_dropoff, e69Var.f36776l);
            if (f < 0.0f) {
                ij6.m13952j("Given invalid dropoff value: ", f);
                return null;
            }
            e69Var.f36776l = f;
        }
        if (typedArray.hasValue(R$styleable.ShimmerFrameLayout_shimmer_fixed_width)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(R$styleable.ShimmerFrameLayout_shimmer_fixed_width, e69Var.f36771g);
            if (dimensionPixelSize < 0) {
                C3386nv.m17626m(ux5.m22988k(dimensionPixelSize, "Given invalid width: "));
                return null;
            }
            e69Var.f36771g = dimensionPixelSize;
        }
        if (typedArray.hasValue(R$styleable.ShimmerFrameLayout_shimmer_fixed_height)) {
            int dimensionPixelSize2 = typedArray.getDimensionPixelSize(R$styleable.ShimmerFrameLayout_shimmer_fixed_height, e69Var.f36772h);
            if (dimensionPixelSize2 < 0) {
                C3386nv.m17626m(ux5.m22988k(dimensionPixelSize2, "Given invalid height: "));
                return null;
            }
            e69Var.f36772h = dimensionPixelSize2;
        }
        if (typedArray.hasValue(R$styleable.ShimmerFrameLayout_shimmer_intensity)) {
            float f2 = typedArray.getFloat(R$styleable.ShimmerFrameLayout_shimmer_intensity, e69Var.f36775k);
            if (f2 < 0.0f) {
                ij6.m13952j("Given invalid intensity value: ", f2);
                return null;
            }
            e69Var.f36775k = f2;
        }
        if (typedArray.hasValue(R$styleable.ShimmerFrameLayout_shimmer_width_ratio)) {
            float f3 = typedArray.getFloat(R$styleable.ShimmerFrameLayout_shimmer_width_ratio, e69Var.f36773i);
            if (f3 < 0.0f) {
                ij6.m13952j("Given invalid width ratio: ", f3);
                return null;
            }
            e69Var.f36773i = f3;
        }
        if (typedArray.hasValue(R$styleable.ShimmerFrameLayout_shimmer_height_ratio)) {
            float f4 = typedArray.getFloat(R$styleable.ShimmerFrameLayout_shimmer_height_ratio, e69Var.f36774j);
            if (f4 < 0.0f) {
                ij6.m13952j("Given invalid height ratio: ", f4);
                return null;
            }
            e69Var.f36774j = f4;
        }
        if (typedArray.hasValue(R$styleable.ShimmerFrameLayout_shimmer_tilt)) {
            e69Var.f36777m = typedArray.getFloat(R$styleable.ShimmerFrameLayout_shimmer_tilt, e69Var.f36777m);
        }
        return mo10130f();
    }

    /* JADX INFO: renamed from: f */
    public abstract q80 mo10130f();

    /* JADX INFO: renamed from: g */
    public abstract Object mo16925g();

    /* JADX INFO: renamed from: h */
    public Object m19759h(cnd cndVar, afa afaVar) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f57375b;
        Object obj = concurrentHashMap.get(cndVar);
        if (obj != null) {
            return obj;
        }
        Object objMo16925g = mo16925g();
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(cndVar, objMo16925g);
        if (objPutIfAbsent != null) {
            return objPutIfAbsent;
        }
        int iMo357g = afaVar.mo357g();
        for (int i = 0; i < iMo357g; i++) {
            if (umd.f64097f.equals(afaVar.mo358h(i))) {
                afaVar.mo359i(i);
            }
        }
        return objMo16925g;
    }

    public String toString() {
        switch (this.f57374a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                List list = (List) this.f57375b;
                if (!list.isEmpty()) {
                    sb.append("values=");
                    sb.append(Arrays.toString(list.toArray()));
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ q80(Object obj, int i) {
        this.f57374a = i;
        this.f57375b = obj;
    }
}
