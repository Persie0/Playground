package p000;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.AbstractC0875a;
import com.airbnb.lottie.parser.moshi.JsonReader$Token;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class v39 implements coa {

    /* JADX INFO: renamed from: a */
    public static final v39 f64794a = new v39();

    /* JADX INFO: renamed from: b */
    public static final p33 f64795b = p33.m18864S("c", "v", "i", "o");

    @Override // p000.coa
    /* JADX INFO: renamed from: g */
    public final Object mo87g(AbstractC0875a abstractC0875a, float f) {
        if (abstractC0875a.mo5047z() == JsonReader$Token.BEGIN_ARRAY) {
            abstractC0875a.mo5037a();
        }
        abstractC0875a.mo5038b();
        ArrayList arrayListM17979c = null;
        ArrayList arrayListM17979c2 = null;
        ArrayList arrayListM17979c3 = null;
        boolean zMo5043q = false;
        while (abstractC0875a.mo5042p()) {
            int iMo5033J = abstractC0875a.mo5033J(f64795b);
            if (iMo5033J == 0) {
                zMo5043q = abstractC0875a.mo5043q();
            } else if (iMo5033J == 1) {
                arrayListM17979c = og4.m17979c(abstractC0875a, f);
            } else if (iMo5033J == 2) {
                arrayListM17979c2 = og4.m17979c(abstractC0875a, f);
            } else if (iMo5033J != 3) {
                abstractC0875a.mo5034N();
                abstractC0875a.mo5035R();
            } else {
                arrayListM17979c3 = og4.m17979c(abstractC0875a, f);
            }
        }
        abstractC0875a.mo5040e();
        if (abstractC0875a.mo5047z() == JsonReader$Token.END_ARRAY) {
            abstractC0875a.mo5039c();
        }
        if (arrayListM17979c == null || arrayListM17979c2 == null || arrayListM17979c3 == null) {
            C3386nv.m17626m("Shape data was missing information.");
            return null;
        }
        if (arrayListM17979c.isEmpty()) {
            return new u39(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = arrayListM17979c.size();
        PointF pointF = (PointF) arrayListM17979c.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) arrayListM17979c.get(i);
            int i2 = i - 1;
            arrayList.add(new as1(f06.m11420a((PointF) arrayListM17979c.get(i2), (PointF) arrayListM17979c3.get(i2)), f06.m11420a(pointF2, (PointF) arrayListM17979c2.get(i)), pointF2));
        }
        if (zMo5043q) {
            PointF pointF3 = (PointF) arrayListM17979c.get(0);
            int i3 = size - 1;
            arrayList.add(new as1(f06.m11420a((PointF) arrayListM17979c.get(i3), (PointF) arrayListM17979c3.get(i3)), f06.m11420a(pointF3, (PointF) arrayListM17979c2.get(0)), pointF3));
        }
        return new u39(pointF, zMo5043q, arrayList);
    }
}
