package p000;

import android.content.Context;
import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.AbstractC0875a;
import com.airbnb.lottie.parser.moshi.JsonReader$Token;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class cp3 implements coa, xo6, xn2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34341a;

    /* JADX INFO: renamed from: b */
    public int f34342b;

    public /* synthetic */ cp3(int i, int i2) {
        this.f34341a = i2;
        this.f34342b = i;
    }

    @Override // p000.xo6
    /* JADX INFO: renamed from: b */
    public String mo9832b() {
        switch (this.f34341a) {
            case 3:
                return wq1.m24123s(new StringBuilder("expected at least "), this.f34342b, " digits");
            default:
                return wq1.m24123s(new StringBuilder("expected at most "), this.f34342b, " digits");
        }
    }

    @Override // p000.xn2
    /* JADX INFO: renamed from: c */
    public int mo9833c(Context context, String str, boolean z) {
        return 0;
    }

    @Override // p000.xn2
    /* JADX INFO: renamed from: e */
    public int mo9834e(Context context, String str) {
        return this.f34342b;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d5  */
    @Override // p000.coa
    /* JADX INFO: renamed from: g */
    public Object mo87g(AbstractC0875a abstractC0875a, float f) {
        int i;
        int iArgb;
        float f2;
        int iArgb2;
        float f3;
        float fM11425f;
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        int i3 = 0;
        boolean z = abstractC0875a.mo5047z() == JsonReader$Token.BEGIN_ARRAY;
        if (z) {
            abstractC0875a.mo5037a();
        }
        while (abstractC0875a.mo5042p()) {
            arrayList.add(Float.valueOf((float) abstractC0875a.mo5044r()));
        }
        int i4 = 2;
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.f34342b = 2;
        }
        if (z) {
            abstractC0875a.mo5039c();
        }
        if (this.f34342b == -1) {
            this.f34342b = arrayList.size() / 4;
        }
        int i5 = this.f34342b;
        float[] fArr = new float[i5];
        int[] iArr = new int[i5];
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i = this.f34342b * 4;
            if (i6 >= i) {
                break;
            }
            int i9 = i6 / 4;
            double dFloatValue = ((Float) arrayList.get(i6)).floatValue();
            int i10 = i3;
            int i11 = i6 % 4;
            if (i11 != 0) {
                if (i11 == i2) {
                    i7 = (int) (dFloatValue * 255.0d);
                } else if (i11 == 2) {
                    i8 = (int) (dFloatValue * 255.0d);
                } else if (i11 == 3) {
                    iArr[i9] = Color.argb(255, i7, i8, (int) (dFloatValue * 255.0d));
                }
            } else if (i9 > 0) {
                float f4 = (float) dFloatValue;
                if (fArr[i9 - 1] >= f4) {
                    fArr[i9] = f4 + 0.01f;
                } else {
                    fArr[i9] = (float) dFloatValue;
                }
            } else {
                fArr[i9] = (float) dFloatValue;
            }
            i6++;
            i3 = i10;
            i2 = 1;
        }
        int i12 = i3;
        ap3 ap3Var = new ap3(fArr, iArr);
        if (arrayList.size() <= i) {
            return ap3Var;
        }
        int size = (arrayList.size() - i) / 2;
        float[] fArr2 = new float[size];
        float[] fArr3 = new float[size];
        int i13 = i12;
        while (i < arrayList.size()) {
            if (i % 2 == 0) {
                fArr2[i13] = ((Float) arrayList.get(i)).floatValue();
            } else {
                fArr3[i13] = ((Float) arrayList.get(i)).floatValue();
                i13++;
            }
            i++;
        }
        float[] fArrCopyOf = ap3Var.f7321a;
        if (fArrCopyOf.length == 0) {
            fArrCopyOf = fArr2;
        } else if (size != 0) {
            int length = fArrCopyOf.length + size;
            float[] fArr4 = new float[length];
            int i14 = i12;
            int i15 = i14;
            int i16 = i15;
            int i17 = i16;
            while (i14 < length) {
                float f5 = i16 < fArrCopyOf.length ? fArrCopyOf[i16] : Float.NaN;
                float f6 = i17 < size ? fArr2[i17] : Float.NaN;
                if (Float.isNaN(f6) || f5 < f6) {
                    fArr4[i14] = f5;
                    i16++;
                } else if (Float.isNaN(f5) || f6 < f5) {
                    fArr4[i14] = f6;
                    i17++;
                } else {
                    fArr4[i14] = f5;
                    i16++;
                    i17++;
                    i15++;
                }
                i14++;
            }
            fArrCopyOf = i15 == 0 ? fArr4 : Arrays.copyOf(fArr4, length - i15);
        }
        int length2 = fArrCopyOf.length;
        int[] iArr2 = new int[length2];
        int i18 = i12;
        while (i18 < length2) {
            float f7 = fArrCopyOf[i18];
            int iBinarySearch = Arrays.binarySearch(fArr, f7);
            int iBinarySearch2 = Arrays.binarySearch(fArr2, f7);
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                float f8 = fArr3[iBinarySearch2];
                if (i5 < i4 || f7 == fArr[i12]) {
                    iArgb = iArr[i12];
                } else {
                    int i19 = 1;
                    while (true) {
                        if (i19 >= i5) {
                            C3386nv.m17626m("Unreachable code.");
                            return null;
                        }
                        f2 = fArr[i19];
                        if (f2 >= f7 || i19 == i5 - 1) {
                            break;
                        }
                        i19++;
                    }
                    if (i19 != i5 - 1 || f7 < f2) {
                        int i20 = i19 - 1;
                        float f9 = fArr[i20];
                        int iM15165c = ked.m15165c(iArr[i20], (f7 - f9) / (f2 - f9), iArr[i19]);
                        iArgb = Color.argb((int) (f8 * 255.0f), Color.red(iM15165c), Color.green(iM15165c), Color.blue(iM15165c));
                    } else {
                        iArgb = Color.argb((int) (f8 * 255.0f), Color.red(iArr[i19]), Color.green(iArr[i19]), Color.blue(iArr[i19]));
                    }
                }
                iArr2[i18] = iArgb;
            } else {
                int i21 = iArr[iBinarySearch];
                if (size < i4 || f7 <= fArr2[i12]) {
                    iArgb2 = Color.argb((int) (fArr3[i12] * 255.0f), Color.red(i21), Color.green(i21), Color.blue(i21));
                } else {
                    int i22 = 1;
                    while (true) {
                        if (i22 >= size) {
                            C3386nv.m17626m("Unreachable code.");
                            return null;
                        }
                        f3 = fArr2[i22];
                        if (f3 >= f7 || i22 == size - 1) {
                            break;
                        }
                        i22++;
                    }
                    if (f3 <= f7) {
                        fM11425f = fArr3[i22];
                    } else {
                        int i23 = i22 - 1;
                        float f10 = fArr2[i23];
                        fM11425f = f06.m11425f(fArr3[i23], fArr3[i22], (f7 - f10) / (f3 - f10));
                    }
                    iArgb2 = Color.argb((int) (fM11425f * 255.0f), Color.red(i21), Color.green(i21), Color.blue(i21));
                }
                iArr2[i18] = iArgb2;
            }
            i18++;
            i4 = 2;
        }
        return new ap3(fArrCopyOf, iArr2);
    }
}
