package com.google.android.material.carousel;

import android.view.animation.LinearInterpolator;
import androidx.activity.result.C0204c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p177ic.C6308a;

/* JADX INFO: renamed from: com.google.android.material.carousel.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2980b {

    /* JADX INFO: renamed from: a */
    public final C2979a f14977a;

    /* JADX INFO: renamed from: b */
    public final List<C2979a> f14978b;

    /* JADX INFO: renamed from: c */
    public final List<C2979a> f14979c;

    /* JADX INFO: renamed from: d */
    public final float[] f14980d;

    /* JADX INFO: renamed from: e */
    public final float[] f14981e;

    /* JADX INFO: renamed from: f */
    public final float f14982f;

    /* JADX INFO: renamed from: g */
    public final float f14983g;

    public C2980b(C2979a c2979a, ArrayList arrayList, ArrayList arrayList2) {
        this.f14977a = c2979a;
        this.f14978b = Collections.unmodifiableList(arrayList);
        this.f14979c = Collections.unmodifiableList(arrayList2);
        float f3 = ((C2979a) arrayList.get(arrayList.size() - 1)).m8659b().f14973a - c2979a.m8659b().f14973a;
        this.f14982f = f3;
        float f10 = c2979a.m8661d().f14973a - ((C2979a) arrayList2.get(arrayList2.size() - 1)).m8661d().f14973a;
        this.f14983g = f10;
        this.f14980d = m8664a(f3, arrayList, true);
        this.f14981e = m8664a(f10, arrayList2, false);
    }

    /* JADX INFO: renamed from: a */
    public static float[] m8664a(float f3, ArrayList arrayList, boolean z10) {
        int size = arrayList.size();
        float[] fArr = new float[size];
        int i10 = 1;
        while (i10 < size) {
            int i11 = i10 - 1;
            C2979a c2979a = (C2979a) arrayList.get(i11);
            C2979a c2979a2 = (C2979a) arrayList.get(i10);
            fArr[i10] = i10 == size + (-1) ? 1.0f : fArr[i11] + ((z10 ? c2979a2.m8659b().f14973a - c2979a.m8659b().f14973a : c2979a.m8661d().f14973a - c2979a2.m8661d().f14973a) / f3);
            i10++;
        }
        return fArr;
    }

    /* JADX INFO: renamed from: b */
    public static C2979a m8665b(List<C2979a> list, float f3, float[] fArr) {
        int size = list.size();
        float f10 = fArr[0];
        int i10 = 1;
        while (i10 < size) {
            float f11 = fArr[i10];
            if (f3 <= f11) {
                float fM12936a = C6308a.m12936a(0.0f, 1.0f, f10, f11, f3);
                C2979a c2979a = list.get(i10 - 1);
                C2979a c2979a2 = list.get(i10);
                if (c2979a.f14962a != c2979a2.f14962a) {
                    throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
                }
                List<C2979a.b> list2 = c2979a.f14963b;
                int size2 = list2.size();
                List<C2979a.b> list3 = c2979a2.f14963b;
                if (size2 != list3.size()) {
                    throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
                }
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < list2.size(); i11++) {
                    C2979a.b bVar = list2.get(i11);
                    C2979a.b bVar2 = list3.get(i11);
                    float f12 = bVar.f14973a;
                    float f13 = bVar2.f14973a;
                    LinearInterpolator linearInterpolator = C6308a.f36523a;
                    float fM845d = C0204c.m845d(f13, f12, fM12936a, f12);
                    float f14 = bVar2.f14974b;
                    float f15 = bVar.f14974b;
                    float fM845d2 = C0204c.m845d(f14, f15, fM12936a, f15);
                    float f16 = bVar2.f14975c;
                    float f17 = bVar.f14975c;
                    float fM845d3 = C0204c.m845d(f16, f17, fM12936a, f17);
                    float f18 = bVar2.f14976d;
                    float f19 = bVar.f14976d;
                    arrayList.add(new C2979a.b(fM845d, fM845d2, fM845d3, C0204c.m845d(f18, f19, fM12936a, f19)));
                }
                return new C2979a(c2979a.f14962a, arrayList, C6308a.m12937b(fM12936a, c2979a.f14964c, c2979a2.f14964c), C6308a.m12937b(fM12936a, c2979a.f14965d, c2979a2.f14965d));
            }
            i10++;
            f10 = f11;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: c */
    public static C2979a m8666c(C2979a c2979a, int i10, int i11, float f3, int i12, int i13) {
        ArrayList arrayList = new ArrayList(c2979a.f14963b);
        arrayList.add(i11, (C2979a.b) arrayList.remove(i10));
        C2979a.a aVar = new C2979a.a(c2979a.f14962a);
        int i14 = 0;
        while (i14 < arrayList.size()) {
            C2979a.b bVar = (C2979a.b) arrayList.get(i14);
            float f10 = bVar.f14976d;
            aVar.m8662a((f10 / 2.0f) + f3, bVar.f14975c, f10, i14 >= i12 && i14 <= i13);
            f3 += bVar.f14976d;
            i14++;
        }
        return aVar.m8663b();
    }
}
