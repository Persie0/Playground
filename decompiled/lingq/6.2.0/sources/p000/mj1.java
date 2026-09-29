package p000;

import android.util.Log;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class mj1 {

    /* JADX INFO: renamed from: a */
    public int[] f51380a = new int[10];

    /* JADX INFO: renamed from: b */
    public int[] f51381b = new int[10];

    /* JADX INFO: renamed from: c */
    public int f51382c = 0;

    /* JADX INFO: renamed from: d */
    public int[] f51383d = new int[10];

    /* JADX INFO: renamed from: e */
    public float[] f51384e = new float[10];

    /* JADX INFO: renamed from: f */
    public int f51385f = 0;

    /* JADX INFO: renamed from: g */
    public int[] f51386g = new int[5];

    /* JADX INFO: renamed from: h */
    public String[] f51387h = new String[5];

    /* JADX INFO: renamed from: i */
    public int f51388i = 0;

    /* JADX INFO: renamed from: j */
    public int[] f51389j = new int[4];

    /* JADX INFO: renamed from: k */
    public boolean[] f51390k = new boolean[4];

    /* JADX INFO: renamed from: l */
    public int f51391l = 0;

    /* JADX INFO: renamed from: a */
    public final void m16850a(int i, float f) {
        int i2 = this.f51385f;
        int[] iArr = this.f51383d;
        if (i2 >= iArr.length) {
            this.f51383d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f51384e;
            this.f51384e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f51383d;
        int i3 = this.f51385f;
        iArr2[i3] = i;
        float[] fArr2 = this.f51384e;
        this.f51385f = i3 + 1;
        fArr2[i3] = f;
    }

    /* JADX INFO: renamed from: b */
    public final void m16851b(int i, int i2) {
        int i3 = this.f51382c;
        int[] iArr = this.f51380a;
        if (i3 >= iArr.length) {
            this.f51380a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f51381b;
            this.f51381b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f51380a;
        int i4 = this.f51382c;
        iArr3[i4] = i;
        int[] iArr4 = this.f51381b;
        this.f51382c = i4 + 1;
        iArr4[i4] = i2;
    }

    /* JADX INFO: renamed from: c */
    public final void m16852c(int i, String str) {
        int i2 = this.f51388i;
        int[] iArr = this.f51386g;
        if (i2 >= iArr.length) {
            this.f51386g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f51387h;
            this.f51387h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f51386g;
        int i3 = this.f51388i;
        iArr2[i3] = i;
        String[] strArr2 = this.f51387h;
        this.f51388i = i3 + 1;
        strArr2[i3] = str;
    }

    /* JADX INFO: renamed from: d */
    public final void m16853d(int i, boolean z) {
        int i2 = this.f51391l;
        int[] iArr = this.f51389j;
        if (i2 >= iArr.length) {
            this.f51389j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f51390k;
            this.f51390k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f51389j;
        int i3 = this.f51391l;
        iArr2[i3] = i;
        boolean[] zArr2 = this.f51390k;
        this.f51391l = i3 + 1;
        zArr2[i3] = z;
    }

    /* JADX INFO: renamed from: e */
    public final void m16854e(nj1 nj1Var) {
        for (int i = 0; i < this.f51382c; i++) {
            int i2 = this.f51380a[i];
            int i3 = this.f51381b[i];
            if (i2 == 6) {
                nj1Var.f52823e.f54393D = i3;
            } else if (i2 == 7) {
                nj1Var.f52823e.f54394E = i3;
            } else if (i2 == 8) {
                nj1Var.f52823e.f54400K = i3;
            } else if (i2 == 27) {
                nj1Var.f52823e.f54395F = i3;
            } else if (i2 == 28) {
                nj1Var.f52823e.f54397H = i3;
            } else if (i2 == 41) {
                nj1Var.f52823e.f54412W = i3;
            } else if (i2 == 42) {
                nj1Var.f52823e.f54413X = i3;
            } else if (i2 == 61) {
                nj1Var.f52823e.f54390A = i3;
            } else if (i2 == 62) {
                nj1Var.f52823e.f54391B = i3;
            } else if (i2 == 72) {
                nj1Var.f52823e.f54429g0 = i3;
            } else if (i2 == 73) {
                nj1Var.f52823e.f54431h0 = i3;
            } else if (i2 == 2) {
                nj1Var.f52823e.f54399J = i3;
            } else if (i2 == 31) {
                nj1Var.f52823e.f54401L = i3;
            } else if (i2 == 34) {
                nj1Var.f52823e.f54398I = i3;
            } else if (i2 == 38) {
                nj1Var.f52819a = i3;
            } else if (i2 == 64) {
                nj1Var.f52822d.f56298b = i3;
            } else if (i2 == 66) {
                nj1Var.f52822d.f56302f = i3;
            } else if (i2 == 76) {
                nj1Var.f52822d.f56301e = i3;
            } else if (i2 == 78) {
                nj1Var.f52821c.f57845c = i3;
            } else if (i2 == 97) {
                nj1Var.f52823e.f54447p0 = i3;
            } else if (i2 == 93) {
                nj1Var.f52823e.f54402M = i3;
            } else if (i2 != 94) {
                switch (i2) {
                    case 11:
                        nj1Var.f52823e.f54406Q = i3;
                        break;
                    case 12:
                        nj1Var.f52823e.f54407R = i3;
                        break;
                    case 13:
                        nj1Var.f52823e.f54403N = i3;
                        break;
                    case 14:
                        nj1Var.f52823e.f54405P = i3;
                        break;
                    case 15:
                        nj1Var.f52823e.f54408S = i3;
                        break;
                    case 16:
                        nj1Var.f52823e.f54404O = i3;
                        break;
                    case 17:
                        nj1Var.f52823e.f54424e = i3;
                        break;
                    case 18:
                        nj1Var.f52823e.f54426f = i3;
                        break;
                    default:
                        switch (i2) {
                            case 21:
                                nj1Var.f52823e.f54422d = i3;
                                break;
                            case 22:
                                nj1Var.f52821c.f57844b = i3;
                                break;
                            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                                nj1Var.f52823e.f54420c = i3;
                                break;
                            case 24:
                                nj1Var.f52823e.f54396G = i3;
                                break;
                            default:
                                switch (i2) {
                                    case 54:
                                        nj1Var.f52823e.f54414Y = i3;
                                        break;
                                    case 55:
                                        nj1Var.f52823e.f54415Z = i3;
                                        break;
                                    case 56:
                                        nj1Var.f52823e.f54417a0 = i3;
                                        break;
                                    case 57:
                                        nj1Var.f52823e.f54419b0 = i3;
                                        break;
                                    case 58:
                                        nj1Var.f52823e.f54421c0 = i3;
                                        break;
                                    case 59:
                                        nj1Var.f52823e.f54423d0 = i3;
                                        break;
                                    default:
                                        switch (i2) {
                                            case 82:
                                                nj1Var.f52822d.f56299c = i3;
                                                break;
                                            case 83:
                                                nj1Var.f52824f.f59395i = i3;
                                                break;
                                            case 84:
                                                nj1Var.f52822d.f56306j = i3;
                                                break;
                                            default:
                                                switch (i2) {
                                                    case 87:
                                                        break;
                                                    case 88:
                                                        nj1Var.f52822d.f56308l = i3;
                                                        break;
                                                    case 89:
                                                        nj1Var.f52822d.f56309m = i3;
                                                        break;
                                                    default:
                                                        Log.w("ConstraintSet", "Unknown attribute 0x");
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                nj1Var.f52823e.f54409T = i3;
            }
        }
        for (int i4 = 0; i4 < this.f51385f; i4++) {
            int i5 = this.f51383d[i4];
            float f = this.f51384e[i4];
            if (i5 == 19) {
                nj1Var.f52823e.f54428g = f;
            } else if (i5 == 20) {
                nj1Var.f52823e.f54455x = f;
            } else if (i5 == 37) {
                nj1Var.f52823e.f54456y = f;
            } else if (i5 == 60) {
                nj1Var.f52824f.f59388b = f;
            } else if (i5 == 63) {
                nj1Var.f52823e.f54392C = f;
            } else if (i5 == 79) {
                nj1Var.f52822d.f56303g = f;
            } else if (i5 == 85) {
                nj1Var.f52822d.f56305i = f;
            } else if (i5 != 87) {
                if (i5 == 39) {
                    nj1Var.f52823e.f54411V = f;
                } else if (i5 != 40) {
                    switch (i5) {
                        case 43:
                            nj1Var.f52821c.f57846d = f;
                            break;
                        case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                            rj1 rj1Var = nj1Var.f52824f;
                            rj1Var.f59400n = f;
                            rj1Var.f59399m = true;
                            break;
                        case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                            nj1Var.f52824f.f59389c = f;
                            break;
                        case 46:
                            nj1Var.f52824f.f59390d = f;
                            break;
                        case 47:
                            nj1Var.f52824f.f59391e = f;
                            break;
                        case eda.f37086g /* 48 */:
                            nj1Var.f52824f.f59392f = f;
                            break;
                        case 49:
                            nj1Var.f52824f.f59393g = f;
                            break;
                        case 50:
                            nj1Var.f52824f.f59394h = f;
                            break;
                        case 51:
                            nj1Var.f52824f.f59396j = f;
                            break;
                        case 52:
                            nj1Var.f52824f.f59397k = f;
                            break;
                        case 53:
                            nj1Var.f52824f.f59398l = f;
                            break;
                        default:
                            switch (i5) {
                                case 67:
                                    nj1Var.f52822d.f56304h = f;
                                    break;
                                case 68:
                                    nj1Var.f52821c.f57847e = f;
                                    break;
                                case 69:
                                    nj1Var.f52823e.f54425e0 = f;
                                    break;
                                case 70:
                                    nj1Var.f52823e.f54427f0 = f;
                                    break;
                                default:
                                    Log.w("ConstraintSet", "Unknown attribute 0x");
                                    break;
                            }
                            break;
                    }
                } else {
                    nj1Var.f52823e.f54410U = f;
                }
            }
        }
        for (int i6 = 0; i6 < this.f51388i; i6++) {
            int i7 = this.f51386g[i6];
            String str = this.f51387h[i6];
            if (i7 == 5) {
                nj1Var.f52823e.f54457z = str;
            } else if (i7 == 65) {
                nj1Var.f52822d.f56300d = str;
            } else if (i7 == 74) {
                oj1 oj1Var = nj1Var.f52823e;
                oj1Var.f54437k0 = str;
                oj1Var.f54435j0 = null;
            } else if (i7 == 77) {
                nj1Var.f52823e.f54439l0 = str;
            } else if (i7 != 87) {
                if (i7 != 90) {
                    Log.w("ConstraintSet", "Unknown attribute 0x");
                } else {
                    nj1Var.f52822d.f56307k = str;
                }
            }
        }
        for (int i8 = 0; i8 < this.f51391l; i8++) {
            int i9 = this.f51389j[i8];
            boolean z = this.f51390k[i8];
            if (i9 == 44) {
                nj1Var.f52824f.f59399m = z;
            } else if (i9 == 75) {
                nj1Var.f52823e.f54445o0 = z;
            } else if (i9 != 87) {
                if (i9 == 80) {
                    nj1Var.f52823e.f54441m0 = z;
                } else if (i9 != 81) {
                    Log.w("ConstraintSet", "Unknown attribute 0x");
                } else {
                    nj1Var.f52823e.f54443n0 = z;
                }
            }
        }
    }
}
