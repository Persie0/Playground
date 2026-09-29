package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class qj4 implements dn2 {

    /* JADX INFO: renamed from: a */
    public final pj4 f57851a;

    public qj4(pj4 pj4Var) {
        this.f57851a = pj4Var;
    }

    @Override // p000.dn2, p000.InterfaceC0025an
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final bpa mo589a(jda jdaVar) {
        int[] iArr;
        Object[] objArr;
        pj4 pj4Var = this.f57851a;
        t56 t56Var = pj4Var.f56316b;
        s56 s56Var = new s56(t56Var.f35147e + 2);
        t56 t56Var2 = new t56(t56Var.f35147e);
        int[] iArr2 = t56Var.f35144b;
        Object[] objArr2 = t56Var.f35145c;
        long[] jArr = t56Var.f35143a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8;
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            int i6 = iArr2[i5];
                            oj4 oj4Var = (oj4) objArr2[i5];
                            s56Var.m21101a(i6);
                            t56Var2.m21850i(i6, new apa((AbstractC3081hn) jdaVar.f45442a.invoke(oj4Var.f54460a), oj4Var.f54461b));
                        }
                        j >>= i2;
                        i4++;
                        i2 = i2;
                        iArr2 = iArr2;
                        objArr2 = objArr2;
                    }
                    iArr = iArr2;
                    objArr = objArr2;
                    if (i3 != i2) {
                        break;
                    }
                } else {
                    iArr = iArr2;
                    objArr = objArr2;
                }
                if (i == length) {
                    break;
                }
                i++;
                iArr2 = iArr;
                objArr2 = objArr;
            }
        }
        if (!t56Var.m10151a(0)) {
            int i7 = s56Var.f60382b;
            if (i7 < 0) {
                v63.m23143u("Index must be between 0 and size");
                return null;
            }
            s56Var.m21102b(i7 + 1);
            int[] iArr3 = s56Var.f60381a;
            int i8 = s56Var.f60382b;
            if (i8 != 0) {
                AbstractC3550rv.m20825S(1, 0, i8, iArr3, iArr3);
            }
            iArr3[0] = 0;
            s56Var.f60382b++;
        }
        if (!t56Var.m10151a(pj4Var.f56315a)) {
            s56Var.m21101a(pj4Var.f56315a);
        }
        int i9 = s56Var.f60382b;
        if (i9 != 0) {
            int[] iArr4 = s56Var.f60381a;
            iArr4.getClass();
            Arrays.sort(iArr4, 0, i9);
        }
        return new bpa(s56Var, t56Var2, pj4Var.f56315a, io2.f44352d);
    }
}
