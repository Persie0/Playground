package p000;

import androidx.compose.animation.core.C0059a;
import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a87 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f351a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f352b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f353c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f354d;

    public /* synthetic */ a87(long j, long j2, C0059a c0059a) {
        this.f352b = j;
        this.f353c = j2;
        this.f354d = c0059a;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        Float fValueOf;
        Float fValueOf2;
        long j;
        float f;
        int i = this.f351a;
        xfa xfaVar = xfa.f68157a;
        float f2 = 2.0f;
        Object obj2 = this.f354d;
        switch (i) {
            case 0:
                InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                interfaceC0310a.getClass();
                float fMo912g0 = interfaceC0310a.mo912g0(12.0f);
                InterfaceC0310a.m1417c0(interfaceC0310a, this.f352b, (x89.m24406c(interfaceC0310a.mo1422h()) - fMo912g0) / 2.0f, 0L, 0.0f, new el9(fMo912g0, 0.0f, 1, 0, 26), 108);
                InterfaceC0310a.m1419t0(interfaceC0310a, this.f353c, -90.0f, ((Number) ((C0059a) obj2).m745d()).floatValue() * 360.0f, 0L, 0L, 0.0f, new el9(fMo912g0, 0.0f, 1, 0, 26), 880);
                return xfaVar;
            default:
                ArrayList arrayList = (ArrayList) obj2;
                InterfaceC0310a interfaceC0310a2 = (InterfaceC0310a) obj;
                interfaceC0310a2.getClass();
                if (!arrayList.isEmpty()) {
                    float fMo912g1 = interfaceC0310a2.mo912g0(4.0f);
                    float fMo912g2 = interfaceC0310a2.mo912g0(5.0f);
                    float f3 = fMo912g2 * 2.0f;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC0310a2.mo1422h() >> 32)) - f3;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC0310a2.mo1422h() & 4294967295L)) - f3;
                    int size = arrayList.size();
                    long j2 = this.f352b;
                    int i2 = 1;
                    if (size == 1) {
                        InterfaceC0310a.m1417c0(interfaceC0310a2, j2, fMo912g2, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC0310a2.mo1422h() & 4294967295L)) / 2.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC0310a2.mo1422h() >> 32)) / 2.0f)) << 32), 0.0f, null, 120);
                    } else {
                        ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(Float.valueOf(((lc5) it.next()).f49474c));
                        }
                        Iterator it2 = arrayList2.iterator();
                        if (it2.hasNext()) {
                            float fFloatValue = ((Number) it2.next()).floatValue();
                            while (it2.hasNext()) {
                                fFloatValue = Math.min(fFloatValue, ((Number) it2.next()).floatValue());
                            }
                            fValueOf = Float.valueOf(fFloatValue);
                        } else {
                            fValueOf = null;
                        }
                        Iterator it3 = arrayList2.iterator();
                        if (it3.hasNext()) {
                            float fFloatValue2 = ((Number) it3.next()).floatValue();
                            while (it3.hasNext()) {
                                fFloatValue2 = Math.max(fFloatValue2, ((Number) it3.next()).floatValue());
                            }
                            fValueOf2 = Float.valueOf(fFloatValue2);
                        } else {
                            fValueOf2 = null;
                        }
                        if (fValueOf != null && fValueOf2 != null) {
                            boolean z = fValueOf.floatValue() == fValueOf2.floatValue();
                            C3500qj c3500qjM22757a = AbstractC3650uj.m22757a();
                            int i3 = 0;
                            for (Object obj3 : arrayList) {
                                int i4 = i3 + 1;
                                if (i3 < 0) {
                                    vz1.m23628e0();
                                    throw null;
                                }
                                lc5 lc5Var = (lc5) obj3;
                                float size2 = ((fIntBitsToFloat / (arrayList.size() - 1)) * i3) + fMo912g2;
                                float fFloatValue3 = z ? (fIntBitsToFloat2 / 2.0f) + fMo912g2 : (fMo912g2 + fIntBitsToFloat2) - (((lc5Var.f49474c - fValueOf.floatValue()) / (fValueOf2.floatValue() - fValueOf.floatValue())) * fIntBitsToFloat2);
                                if (i3 == 0) {
                                    c3500qjM22757a.m19989f(size2, fFloatValue3);
                                } else {
                                    c3500qjM22757a.m19988e(size2, fFloatValue3);
                                }
                                i3 = i4;
                            }
                            el9 el9Var = new el9(interfaceC0310a2.mo912g0(2.0f), 0.0f, 1, 0, 26);
                            long j3 = this.f353c;
                            InterfaceC0310a.m1408A0(interfaceC0310a2, c3500qjM22757a, j3, 0.0f, el9Var, 52);
                            int i5 = 0;
                            for (Object obj4 : arrayList) {
                                int i6 = i5 + 1;
                                if (i5 < 0) {
                                    vz1.m23628e0();
                                    throw null;
                                }
                                lc5 lc5Var2 = (lc5) obj4;
                                float size3 = ((fIntBitsToFloat / (arrayList.size() - i2)) * i5) + fMo912g2;
                                float fFloatValue4 = z ? (fIntBitsToFloat2 / f2) + fMo912g2 : (fMo912g2 + fIntBitsToFloat2) - (((lc5Var2.f49474c - fValueOf.floatValue()) / (fValueOf2.floatValue() - fValueOf.floatValue())) * fIntBitsToFloat2);
                                int i7 = i5 == arrayList.size() - i2 ? i2 : 0;
                                if (i7 == 0) {
                                    j = j3;
                                }
                                if (i7 != 0) {
                                    j = j2;
                                    f = fMo912g2;
                                } else {
                                    j = j2;
                                    f = fMo912g1;
                                }
                                InterfaceC0310a.m1417c0(interfaceC0310a2, j, f, (((long) Float.floatToRawIntBits(size3)) << 32) | (((long) Float.floatToRawIntBits(fFloatValue4)) & 4294967295L), 0.0f, null, 120);
                                i2 = i2;
                                i5 = i6;
                                arrayList = arrayList;
                                f2 = f2;
                            }
                        }
                    }
                }
                return xfaVar;
        }
    }

    public /* synthetic */ a87(ArrayList arrayList, long j, long j2) {
        this.f354d = arrayList;
        this.f352b = j;
        this.f353c = j2;
    }
}
