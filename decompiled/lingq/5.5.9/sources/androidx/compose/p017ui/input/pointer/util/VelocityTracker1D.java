package androidx.compose.p017ui.input.pointer.util;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import p082e1.C5351a;
import p338qd.C8573r0;

/* JADX INFO: loaded from: classes.dex */
public final class VelocityTracker1D {

    /* JADX INFO: renamed from: a */
    public final boolean f3650a;

    /* JADX INFO: renamed from: b */
    public final Strategy f3651b;

    /* JADX INFO: renamed from: c */
    public final int f3652c;

    /* JADX INFO: renamed from: d */
    public final C5351a[] f3653d;

    /* JADX INFO: renamed from: e */
    public int f3654e;

    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m13365d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;", "", "(Ljava/lang/String;I)V", "Lsq2", "Impulse", "ui_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public enum Strategy {
        Lsq2,
        Impulse
    }

    /* JADX INFO: renamed from: androidx.compose.ui.input.pointer.util.VelocityTracker1D$a */
    public /* synthetic */ class C0518a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f3655a;

        static {
            int[] iArr = new int[Strategy.values().length];
            try {
                iArr[Strategy.Impulse.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Strategy.Lsq2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f3655a = iArr;
        }
    }

    public VelocityTracker1D() {
        Strategy strategy = Strategy.Lsq2;
        C5207g.m11111f(strategy, "strategy");
        this.f3650a = false;
        this.f3651b = strategy;
        int i10 = C0518a.f3655a[strategy.ordinal()];
        int i11 = 2;
        if (i10 != 1) {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i11 = 3;
        }
        this.f3652c = i11;
        C5351a[] c5351aArr = new C5351a[20];
        for (int i12 = 0; i12 < 20; i12++) {
            c5351aArr[i12] = null;
        }
        this.f3653d = c5351aArr;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ad  */
    /* JADX INFO: renamed from: a */
    public final float m2035a() {
        float fSignum;
        int i10;
        float fFloatValue;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = this.f3654e;
        C5351a[] c5351aArr = this.f3653d;
        C5351a c5351a = c5351aArr[i11];
        if (c5351a == null) {
            return 0.0f;
        }
        C5351a c5351a2 = c5351a;
        int i12 = 0;
        while (true) {
            C5351a c5351a3 = c5351aArr[i11];
            if (c5351a3 == null) {
                break;
            }
            long j10 = c5351a.f33654a;
            long j11 = c5351a3.f33654a;
            float f3 = j10 - j11;
            float fAbs = Math.abs(j11 - c5351a2.f33654a);
            if (f3 > 100.0f || fAbs > 40.0f) {
                break;
            }
            arrayList.add(Float.valueOf(c5351a3.f33655b));
            arrayList2.add(Float.valueOf(-f3));
            if (i11 == 0) {
                i11 = 20;
            }
            i11--;
            i12++;
            if (i12 >= 20) {
                break;
            }
            c5351a2 = c5351a3;
        }
        if (i12 < this.f3652c) {
            return 0.0f;
        }
        int i13 = C0518a.f3655a[this.f3651b.ordinal()];
        if (i13 == 1) {
            int size = arrayList.size();
            if (size < 2) {
                fSignum = 0.0f;
            } else {
                boolean z10 = this.f3650a;
                if (size == 2) {
                    if (((Number) arrayList2.get(0)).floatValue() == ((Number) arrayList2.get(1)).floatValue()) {
                        fSignum = 0.0f;
                    } else {
                        if (z10) {
                            i10 = 0;
                            fFloatValue = ((Number) arrayList.get(0)).floatValue();
                        } else {
                            i10 = 0;
                            fFloatValue = ((Number) arrayList.get(0)).floatValue() - ((Number) arrayList.get(1)).floatValue();
                        }
                        fSignum = fFloatValue / (((Number) arrayList2.get(i10)).floatValue() - ((Number) arrayList2.get(1)).floatValue());
                    }
                } else {
                    int i14 = size - 1;
                    int i15 = i14;
                    float f10 = 0.0f;
                    while (i15 > 0) {
                        int i16 = i15 - 1;
                        if (!(((Number) arrayList2.get(i15)).floatValue() == ((Number) arrayList2.get(i16)).floatValue())) {
                            float fSignum2 = Math.signum(f10) * ((float) Math.sqrt(Math.abs(f10) * 2));
                            float fFloatValue2 = (z10 ? -((Number) arrayList.get(i16)).floatValue() : ((Number) arrayList.get(i15)).floatValue() - ((Number) arrayList.get(i16)).floatValue()) / (((Number) arrayList2.get(i15)).floatValue() - ((Number) arrayList2.get(i16)).floatValue());
                            float fAbs2 = (Math.abs(fFloatValue2) * (fFloatValue2 - fSignum2)) + f10;
                            if (i15 == i14) {
                                fAbs2 *= 0.5f;
                            }
                            f10 = fAbs2;
                        }
                        i15 = i16;
                    }
                    fSignum = Math.signum(f10) * ((float) Math.sqrt(Math.abs(f10) * 2));
                }
            }
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            try {
                fSignum = ((Number) C8573r0.m16694Q0(arrayList2, arrayList).get(1)).floatValue();
            } catch (IllegalArgumentException unused) {
                fSignum = 0.0f;
            }
        }
        return fSignum * 1000;
    }
}
