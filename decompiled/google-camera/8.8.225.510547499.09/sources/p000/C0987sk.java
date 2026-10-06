package p000;

import android.hardware.camera2.CameraCaptureSession;
import java.util.ArrayList;

/* JADX INFO: renamed from: sk */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0987sk {
    /* JADX INFO: renamed from: a */
    public static final void m19399a(CameraCaptureSession cameraCaptureSession, CameraCaptureSession.StateCallback stateCallback) {
        cameraCaptureSession.getClass();
        if (stateCallback != null) {
            stateCallback.onCaptureQueueEmpty(cameraCaptureSession);
        }
    }

    /* JADX WARN: Code duplicated, block: B:170:0x029a  */
    /* JADX WARN: Code duplicated, block: B:33:0x00be  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:62:0x0119  */
    /* JADX INFO: renamed from: b */
    public static void m19400b(C1153yo c1153yo, C1141yc c1141yc, ArrayList arrayList, int i) {
        int i2;
        C1149yk[] c1149ykArr;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4;
        int i5;
        C1149yk[] c1149ykArr2;
        C1149yk c1149yk;
        int i6;
        C1151ym c1151ym;
        C1146yh c1146yh;
        C1146yh c1146yh2;
        C1152yn c1152yn;
        C1151ym c1151ym2;
        C1146yh c1146yh3;
        int i7;
        C1152yn c1152yn2;
        int size;
        C1152yn c1152yn3;
        C1152yn c1152yn4;
        float f;
        C1152yn c1152yn5;
        C1153yo c1153yo2 = c1153yo;
        int i8 = 2;
        if (i == 0) {
            i2 = c1153yo2.f48267av;
            c1149ykArr = c1153yo2.f48270ay;
            i3 = 0;
        } else {
            i2 = c1153yo2.f48268aw;
            c1149ykArr = c1153yo2.f48269ax;
            i3 = 2;
        }
        int i9 = 0;
        while (i9 < i2) {
            C1149yk c1149yk2 = c1149ykArr[i9];
            C1146yh c1146yh4 = null;
            if (!c1149yk2.f48165t) {
                int i10 = c1149yk2.f48160o;
                int i11 = i10 + i10;
                C1152yn c1152yn6 = c1149yk2.f48146a;
                C1152yn c1152yn7 = c1152yn6;
                boolean z5 = false;
                while (!z5) {
                    c1149yk2.f48154i++;
                    C1152yn[] c1152ynArr = c1152yn6.f48226ao;
                    int i12 = c1149yk2.f48160o;
                    c1152ynArr[i12] = null;
                    c1152yn6.f48225an[i12] = null;
                    if (c1152yn6.f48220ai != 8) {
                        c1149yk2.f48157l++;
                        if (c1152yn6.m19679N(i12) != 3) {
                            c1149yk2.f48158m += c1149yk2.f48160o == 0 ? c1152yn6.m19689j() : c1152yn6.m19687h();
                        }
                        int iM19651b = c1149yk2.f48158m + c1152yn6.f48203S[i11].m19651b();
                        c1149yk2.f48158m = iM19651b;
                        int i13 = i11 + 1;
                        c1149yk2.f48158m = iM19651b + c1152yn6.f48203S[i13].m19651b();
                        int iM19651b2 = c1149yk2.f48159n + c1152yn6.f48203S[i11].m19651b();
                        c1149yk2.f48159n = iM19651b2;
                        c1149yk2.f48159n = iM19651b2 + c1152yn6.f48203S[i13].m19651b();
                        if (c1149yk2.f48147b == null) {
                            c1149yk2.f48147b = c1152yn6;
                        }
                        c1149yk2.f48149d = c1152yn6;
                        int[] iArr = c1152yn6.f48229ar;
                        int i14 = c1149yk2.f48160o;
                        if (iArr[i14] == 3) {
                            int i15 = c1152yn6.f48248v[i14];
                            if (i15 == 0 || i15 == 3) {
                                c1149yk2.f48155j++;
                                f = c1152yn6.f48224am[i14];
                                if (f > 0.0f) {
                                    c1149yk2.f48156k += f;
                                }
                                if (c1152yn6.f48220ai != 8 && (i15 == 0 || i15 == 3)) {
                                    if (f < 0.0f) {
                                        c1149yk2.f48162q = true;
                                    } else {
                                        c1149yk2.f48163r = true;
                                    }
                                    if (c1149yk2.f48153h == null) {
                                        c1149yk2.f48153h = new ArrayList();
                                    }
                                    c1149yk2.f48153h.add(c1152yn6);
                                }
                                if (c1149yk2.f48151f == null) {
                                    c1149yk2.f48151f = c1152yn6;
                                }
                                c1152yn5 = c1149yk2.f48152g;
                                if (c1152yn5 != null) {
                                    c1152yn5.f48225an[c1149yk2.f48160o] = c1152yn6;
                                }
                                c1149yk2.f48152g = c1152yn6;
                            } else if (i15 == i8) {
                                i15 = 2;
                                c1149yk2.f48155j++;
                                f = c1152yn6.f48224am[i14];
                                if (f > 0.0f) {
                                    c1149yk2.f48156k += f;
                                }
                                if (c1152yn6.f48220ai != 8) {
                                    if (f < 0.0f) {
                                        c1149yk2.f48162q = true;
                                    } else {
                                        c1149yk2.f48163r = true;
                                    }
                                    if (c1149yk2.f48153h == null) {
                                        c1149yk2.f48153h = new ArrayList();
                                    }
                                    c1149yk2.f48153h.add(c1152yn6);
                                }
                                if (c1149yk2.f48151f == null) {
                                    c1149yk2.f48151f = c1152yn6;
                                }
                                c1152yn5 = c1149yk2.f48152g;
                                if (c1152yn5 != null) {
                                    c1152yn5.f48225an[c1149yk2.f48160o] = c1152yn6;
                                }
                                c1149yk2.f48152g = c1152yn6;
                            }
                            int i16 = c1149yk2.f48160o;
                        }
                    }
                    if (c1152yn7 != c1152yn6) {
                        c1152yn7.f48226ao[c1149yk2.f48160o] = c1152yn6;
                    }
                    C1151ym c1151ym3 = c1152yn6.f48203S[i11 + 1].f48181f;
                    if (c1151ym3 != null) {
                        c1152yn4 = c1151ym3.f48179d;
                        C1151ym c1151ym4 = c1152yn4.f48203S[i11].f48181f;
                        if (c1151ym4 == null || c1151ym4.f48179d != c1152yn6) {
                            c1152yn4 = null;
                        }
                    } else {
                        c1152yn4 = null;
                    }
                    boolean z6 = c1152yn4 == null;
                    if (c1152yn4 == null) {
                        c1152yn4 = c1152yn6;
                    }
                    z5 = z6;
                    i8 = 2;
                    c1152yn7 = c1152yn6;
                    c1152yn6 = c1152yn4;
                }
                C1152yn c1152yn8 = c1149yk2.f48147b;
                if (c1152yn8 != null) {
                    c1149yk2.f48158m -= c1152yn8.f48203S[i11].m19651b();
                }
                C1152yn c1152yn9 = c1149yk2.f48149d;
                if (c1152yn9 != null) {
                    c1149yk2.f48158m -= c1152yn9.f48203S[i11 + 1].m19651b();
                }
                c1149yk2.f48148c = c1152yn6;
                if (c1149yk2.f48160o == 0 && c1149yk2.f48161p) {
                    c1149yk2.f48150e = c1149yk2.f48148c;
                } else {
                    c1149yk2.f48150e = c1149yk2.f48146a;
                }
                c1149yk2.f48164s = c1149yk2.f48163r && c1149yk2.f48162q;
            }
            c1149yk2.f48165t = true;
            if (arrayList == 0 || arrayList.contains(c1149yk2.f48146a)) {
                C1152yn c1152yn10 = c1149yk2.f48146a;
                C1152yn c1152yn11 = c1149yk2.f48148c;
                C1152yn c1152yn12 = c1149yk2.f48147b;
                C1152yn c1152yn13 = c1149yk2.f48149d;
                C1152yn c1152yn14 = c1149yk2.f48150e;
                float f2 = c1149yk2.f48156k;
                C1152yn c1152yn15 = c1149yk2.f48151f;
                C1152yn c1152yn16 = c1149yk2.f48152g;
                int i17 = c1153yo2.f48229ar[i];
                if (i == 0) {
                    int i18 = c1152yn14.f48222ak;
                    boolean z7 = i18 == 0;
                    boolean z8 = i18 == 1;
                    z = i18 == 2;
                    z2 = z8;
                    z4 = z7;
                    z3 = false;
                } else {
                    int i19 = c1152yn14.f48223al;
                    boolean z9 = i19 == 0;
                    boolean z10 = i19 == 1;
                    z = i19 == 2;
                    z2 = z10;
                    z3 = false;
                    z4 = z9;
                }
                while (true) {
                    i4 = i9;
                    if (z3) {
                        break;
                    }
                    C1151ym c1151ym5 = c1152yn10.f48203S[i3];
                    int i20 = true != z ? 4 : 1;
                    int iM19651b3 = c1151ym5.m19651b();
                    int i21 = i2;
                    boolean z11 = c1152yn10.f48229ar[i] == 3 && c1152yn10.f48248v[i] == 0;
                    C1151ym c1151ym6 = c1151ym5.f48181f;
                    if (c1151ym6 != null && c1152yn10 != c1152yn10) {
                        iM19651b3 += c1151ym6.m19651b();
                    }
                    if (z && c1152yn10 != c1152yn10 && c1152yn10 != c1152yn12) {
                        i20 = 8;
                    }
                    if (c1151ym6 != null) {
                        if (c1152yn10 == c1152yn12) {
                            c1141yc.m19628g(c1151ym5.f48184i, c1151ym6.f48184i, iM19651b3, 6);
                        } else {
                            c1141yc.m19628g(c1151ym5.f48184i, c1151ym6.f48184i, iM19651b3, 8);
                        }
                        if (z11 && !z) {
                            i20 = 5;
                        }
                        c1141yc.m19634m(c1151ym5.f48184i, c1151ym5.f48181f.f48184i, iM19651b3, (c1152yn10 == c1152yn12 && z && c1152yn10.f48205U[i]) ? 5 : i20);
                    } else {
                        c1152yn14 = c1152yn14;
                        c1149ykArr = c1149ykArr;
                    }
                    if (i17 == 2) {
                        if (c1152yn10.f48220ai != 8 && c1152yn10.f48229ar[i] == 3) {
                            C1151ym[] c1151ymArr = c1152yn10.f48203S;
                            c1141yc.m19628g(c1151ymArr[i3 + 1].f48184i, c1151ymArr[i3].f48184i, 0, 5);
                        }
                        c1141yc.m19628g(c1152yn10.f48203S[i3].f48184i, c1153yo2.f48203S[i3].f48184i, 0, 8);
                    }
                    C1151ym c1151ym7 = c1152yn10.f48203S[i3 + 1].f48181f;
                    if (c1151ym7 != null) {
                        c1152yn3 = c1151ym7.f48179d;
                        C1151ym c1151ym8 = c1152yn3.f48203S[i3].f48181f;
                        if (c1151ym8 == null || c1151ym8.f48179d != c1152yn10) {
                            c1152yn3 = null;
                        }
                    } else {
                        c1152yn3 = null;
                    }
                    z3 = c1152yn3 == null;
                    if (c1152yn3 != null) {
                        c1152yn10 = c1152yn3;
                    }
                    i9 = i4;
                    i2 = i21;
                    c1149ykArr = c1149ykArr;
                    c1152yn14 = c1152yn14;
                }
                C1152yn c1152yn17 = c1152yn14;
                i5 = i2;
                c1149ykArr2 = c1149ykArr;
                if (c1152yn13 != null) {
                    int i22 = i3 + 1;
                    if (c1152yn11.f48203S[i22].f48181f != null) {
                        C1151ym c1151ym9 = c1152yn13.f48203S[i22];
                        if (c1152yn13.f48229ar[i] == 3 && c1152yn13.f48248v[i] == 0 && !z) {
                            C1151ym c1151ym10 = c1151ym9.f48181f;
                            if (c1151ym10.f48179d == c1153yo2) {
                                c1141yc.m19634m(c1151ym9.f48184i, c1151ym10.f48184i, -c1151ym9.m19651b(), 5);
                            }
                            c1141yc.m19629h(c1151ym9.f48184i, c1152yn11.f48203S[i22].f48181f.f48184i, -c1151ym9.m19651b(), 6);
                        }
                        if (z) {
                            C1151ym c1151ym11 = c1151ym9.f48181f;
                            if (c1151ym11.f48179d == c1153yo2) {
                                c1141yc.m19634m(c1151ym9.f48184i, c1151ym11.f48184i, -c1151ym9.m19651b(), 4);
                            }
                        }
                        c1141yc.m19629h(c1151ym9.f48184i, c1152yn11.f48203S[i22].f48181f.f48184i, -c1151ym9.m19651b(), 6);
                    }
                }
                if (i17 == 2) {
                    int i23 = i3 + 1;
                    C1146yh c1146yh5 = c1153yo2.f48203S[i23].f48184i;
                    C1151ym c1151ym12 = c1152yn11.f48203S[i23];
                    c1141yc.m19628g(c1146yh5, c1151ym12.f48184i, c1151ym12.m19651b(), 8);
                }
                ArrayList arrayList2 = c1149yk2.f48153h;
                if (arrayList2 == null || (size = arrayList2.size()) <= 1) {
                    c1149yk = c1149yk2;
                } else {
                    if (c1149yk2.f48162q && !c1149yk2.f48164s) {
                        f2 = c1149yk2.f48155j;
                    }
                    C1152yn c1152yn18 = null;
                    int i24 = 0;
                    float f3 = 0.0f;
                    while (i24 < size) {
                        C1152yn c1152yn19 = (C1152yn) arrayList2.get(i24);
                        float f4 = c1152yn19.f48224am[i];
                        if (f4 < 0.0f) {
                            if (c1149yk2.f48164s) {
                                C1151ym[] c1151ymArr2 = c1152yn19.f48203S;
                                c1141yc.m19634m(c1151ymArr2[i3 + 1].f48184i, c1151ymArr2[i3].f48184i, 0, 4);
                            } else {
                                f4 = 1.0f;
                            }
                            c1149yk2 = c1149yk2;
                            arrayList2 = arrayList2;
                            size = size;
                            i24++;
                            c1149yk2 = c1149yk2;
                            size = size;
                            arrayList2 = arrayList2;
                        }
                        if (f4 == 0.0f) {
                            C1151ym[] c1151ymArr3 = c1152yn19.f48203S;
                            c1141yc.m19634m(c1151ymArr3[i3 + 1].f48184i, c1151ymArr3[i3].f48184i, 0, 8);
                            c1149yk2 = c1149yk2;
                            arrayList2 = arrayList2;
                            size = size;
                        } else {
                            if (c1152yn18 != null) {
                                C1151ym[] c1151ymArr4 = c1152yn18.f48203S;
                                C1146yh c1146yh6 = c1151ymArr4[i3].f48184i;
                                int i25 = i3 + 1;
                                C1146yh c1146yh7 = c1151ymArr4[i25].f48184i;
                                C1151ym[] c1151ymArr5 = c1152yn19.f48203S;
                                C1146yh c1146yh8 = c1151ymArr5[i3].f48184i;
                                C1146yh c1146yh9 = c1151ymArr5[i25].f48184i;
                                C1140yb c1140ybM19622a = c1141yc.m19622a();
                                c1140ybM19622a.f48057b = 0.0f;
                                if (f2 == 0.0f || f3 == f4) {
                                    c1140ybM19622a.f48060e.m19602g(c1146yh6, 1.0f);
                                    c1140ybM19622a.f48060e.m19602g(c1146yh7, -1.0f);
                                    c1140ybM19622a.f48060e.m19602g(c1146yh9, 1.0f);
                                    c1140ybM19622a.f48060e.m19602g(c1146yh8, -1.0f);
                                } else if (f3 == 0.0f) {
                                    c1140ybM19622a.f48060e.m19602g(c1146yh6, 1.0f);
                                    c1140ybM19622a.f48060e.m19602g(c1146yh7, -1.0f);
                                } else if (f4 == 0.0f) {
                                    c1140ybM19622a.f48060e.m19602g(c1146yh8, 1.0f);
                                    c1140ybM19622a.f48060e.m19602g(c1146yh9, -1.0f);
                                } else {
                                    c1140ybM19622a.f48060e.m19602g(c1146yh6, 1.0f);
                                    c1140ybM19622a.f48060e.m19602g(c1146yh7, -1.0f);
                                    float f5 = (f3 / f2) / (f4 / f2);
                                    c1140ybM19622a.f48060e.m19602g(c1146yh9, f5);
                                    c1140ybM19622a.f48060e.m19602g(c1146yh8, -f5);
                                }
                                c1141yc.m19626e(c1140ybM19622a);
                            }
                            f3 = f4;
                            c1152yn18 = c1152yn19;
                        }
                        i24++;
                        c1149yk2 = c1149yk2;
                        size = size;
                        arrayList2 = arrayList2;
                    }
                    c1149yk = c1149yk2;
                }
                if (c1152yn12 != null && (c1152yn12 == c1152yn13 || z)) {
                    C1151ym c1151ym13 = c1152yn10.f48203S[i3];
                    int i26 = i3 + 1;
                    C1151ym c1151ym14 = c1152yn11.f48203S[i26];
                    C1151ym c1151ym15 = c1151ym13.f48181f;
                    C1146yh c1146yh10 = c1151ym15 != null ? c1151ym15.f48184i : null;
                    C1151ym c1151ym16 = c1151ym14.f48181f;
                    C1146yh c1146yh11 = c1151ym16 != null ? c1151ym16.f48184i : null;
                    C1151ym c1151ym17 = c1152yn12.f48203S[i3];
                    if (c1152yn13 != null) {
                        c1151ym14 = c1152yn13.f48203S[i26];
                    }
                    if (c1146yh10 == null || c1146yh11 == null) {
                        c1152yn13 = c1152yn13;
                        c1152yn12 = c1152yn12;
                    } else {
                        c1152yn13 = c1152yn13;
                        c1152yn12 = c1152yn12;
                        c1141yc.m19625d(c1151ym17.f48184i, c1146yh10, c1151ym17.m19651b(), i == 0 ? c1152yn17.f48217af : c1152yn17.f48218ag, c1146yh11, c1151ym14.f48184i, c1151ym14.m19651b(), 7);
                    }
                } else if (!z4 || c1152yn12 == 0) {
                    i4 = i4;
                    C1149yk c1149yk3 = c1149yk;
                    int i27 = 8;
                    if (z2 && c1152yn12 != 0) {
                        int i28 = c1149yk3.f48155j;
                        boolean z12 = i28 > 0 && c1149yk3.f48154i == i28;
                        C1152yn c1152yn20 = c1152yn12;
                        C1152yn c1152yn21 = c1152yn20;
                        while (c1152yn21 != null) {
                            C1152yn c1152yn22 = c1152yn21.f48226ao[i];
                            while (c1152yn22 != null && c1152yn22.f48220ai == i27) {
                                c1152yn22 = c1152yn22.f48226ao[i];
                            }
                            if (c1152yn21 == c1152yn12 || c1152yn21 == c1152yn13 || c1152yn22 == null) {
                                z12 = z12;
                                c1152yn20 = c1152yn20;
                                c1152yn21 = c1152yn21;
                                i6 = 8;
                                c1152yn21 = c1152yn22;
                            } else {
                                C1152yn c1152yn23 = c1152yn22 == c1152yn13 ? null : c1152yn22;
                                C1151ym c1151ym18 = c1152yn21.f48203S[i3];
                                C1146yh c1146yh12 = c1151ym18.f48184i;
                                C1151ym c1151ym19 = c1151ym18.f48181f;
                                int i29 = i3 + 1;
                                C1146yh c1146yh13 = c1152yn20.f48203S[i29].f48184i;
                                int iM19651b4 = c1151ym18.m19651b();
                                int iM19651b5 = c1152yn21.f48203S[i29].m19651b();
                                if (c1152yn23 != null) {
                                    c1151ym = c1152yn23.f48203S[i3];
                                    C1146yh c1146yh14 = c1151ym.f48184i;
                                    C1151ym c1151ym20 = c1151ym.f48181f;
                                    c1146yh2 = c1151ym20 != null ? c1151ym20.f48184i : null;
                                    c1146yh = c1146yh14;
                                } else {
                                    c1151ym = c1152yn13.f48203S[i3];
                                    c1146yh = c1151ym != null ? c1151ym.f48184i : null;
                                    c1146yh2 = c1152yn21.f48203S[i29].f48184i;
                                }
                                int iM19651b6 = c1151ym != null ? iM19651b5 + c1151ym.m19651b() : iM19651b5;
                                int iM19651b7 = c1152yn20.f48203S[i29].m19651b() + iM19651b4;
                                int i30 = true != z12 ? 4 : 8;
                                if (c1146yh12 == null || c1146yh13 == null || c1146yh == null || c1146yh2 == null) {
                                    i6 = 8;
                                } else {
                                    i6 = 8;
                                    c1141yc.m19625d(c1146yh12, c1146yh13, iM19651b7, 0.5f, c1146yh, c1146yh2, iM19651b6, i30);
                                }
                                c1152yn21 = c1152yn23;
                            }
                            c1152yn20 = c1152yn21.f48220ai != i6 ? c1152yn21 : c1152yn20;
                            z12 = z12;
                            i27 = 8;
                        }
                        C1151ym c1151ym21 = c1152yn12.f48203S[i3];
                        C1151ym c1151ym22 = c1152yn10.f48203S[i3].f48181f;
                        int i31 = i3 + 1;
                        C1151ym c1151ym23 = c1152yn13.f48203S[i31];
                        C1151ym c1151ym24 = c1152yn11.f48203S[i31].f48181f;
                        if (c1151ym22 != null) {
                            if (c1152yn12 != c1152yn13) {
                                c1141yc.m19634m(c1151ym21.f48184i, c1151ym22.f48184i, c1151ym21.m19651b(), 5);
                            } else if (c1151ym24 != null) {
                                c1141yc.m19625d(c1151ym21.f48184i, c1151ym22.f48184i, c1151ym21.m19651b(), 0.5f, c1151ym23.f48184i, c1151ym24.f48184i, c1151ym23.m19651b(), 5);
                            }
                        }
                        if (c1151ym24 != null && c1152yn12 != c1152yn13) {
                            c1141yc.m19634m(c1151ym23.f48184i, c1151ym24.f48184i, -c1151ym23.m19651b(), 5);
                        }
                    }
                } else {
                    C1149yk c1149yk4 = c1149yk;
                    int i32 = c1149yk4.f48155j;
                    boolean z13 = i32 > 0 && c1149yk4.f48154i == i32;
                    C1152yn c1152yn24 = c1152yn12;
                    C1152yn c1152yn25 = c1152yn24;
                    while (c1152yn25 != null) {
                        C1152yn c1152yn26 = c1152yn25.f48226ao[i];
                        while (c1152yn26 != null && c1152yn26.f48220ai == 8) {
                            c1152yn26 = c1152yn26.f48226ao[i];
                        }
                        if (c1152yn26 != null || c1152yn25 == c1152yn13) {
                            C1151ym c1151ym25 = c1152yn25.f48203S[i3];
                            C1146yh c1146yh15 = c1151ym25.f48184i;
                            C1151ym c1151ym26 = c1151ym25.f48181f;
                            C1146yh c1146yh16 = c1151ym26 != null ? c1151ym26.f48184i : null;
                            if (c1152yn24 != c1152yn25) {
                                c1146yh16 = c1152yn24.f48203S[i3 + 1].f48184i;
                            } else if (c1152yn25 == c1152yn12) {
                                C1151ym c1151ym27 = c1152yn10.f48203S[i3].f48181f;
                                c1146yh16 = c1151ym27 != null ? c1151ym27.f48184i : null;
                            }
                            int iM19651b8 = c1151ym25.m19651b();
                            int i33 = i3 + 1;
                            int iM19651b9 = c1152yn25.f48203S[i33].m19651b();
                            if (c1152yn26 != null) {
                                c1151ym2 = c1152yn26.f48203S[i3];
                                c1152yn = c1152yn26;
                                c1146yh3 = c1151ym2.f48184i;
                            } else {
                                c1152yn = c1152yn26;
                                c1151ym2 = c1152yn11.f48203S[i33].f48181f;
                                c1146yh3 = c1151ym2 != null ? c1151ym2.f48184i : null;
                            }
                            i7 = i4;
                            C1146yh c1146yh17 = c1152yn25.f48203S[i33].f48184i;
                            if (c1151ym2 != null) {
                                iM19651b9 += c1151ym2.m19651b();
                            }
                            int iM19651b10 = iM19651b8 + c1152yn24.f48203S[i33].m19651b();
                            if (c1146yh15 == null || c1146yh16 == null || c1146yh3 == null || c1146yh17 == null) {
                                c1152yn2 = c1152yn24;
                            } else {
                                c1152yn2 = c1152yn24;
                                c1141yc.m19625d(c1146yh15, c1146yh16, c1152yn25 == c1152yn12 ? c1152yn12.f48203S[i3].m19651b() : iM19651b10, 0.5f, c1146yh3, c1146yh17, c1152yn25 == c1152yn13 ? c1152yn13.f48203S[i33].m19651b() : iM19651b9, true != z13 ? 5 : 8);
                            }
                        } else {
                            i7 = i4;
                            c1152yn = c1152yn26;
                            c1152yn2 = c1152yn24;
                        }
                        c1152yn24 = c1152yn25.f48220ai != 8 ? c1152yn25 : c1152yn2;
                        c1152yn25 = c1152yn;
                        z13 = z13;
                        i4 = i7;
                    }
                    i4 = i4;
                }
                if ((z4 || z2) && c1152yn12 != null && c1152yn12 != c1152yn13) {
                    C1151ym[] c1151ymArr6 = c1152yn12.f48203S;
                    C1151ym c1151ym28 = c1151ymArr6[i3];
                    C1152yn c1152yn27 = c1152yn13 == null ? c1152yn12 : c1152yn13;
                    int i34 = i3 + 1;
                    C1151ym c1151ym29 = c1152yn27.f48203S[i34];
                    C1151ym c1151ym30 = c1151ym28.f48181f;
                    C1146yh c1146yh18 = c1151ym30 != null ? c1151ym30.f48184i : null;
                    C1151ym c1151ym31 = c1151ym29.f48181f;
                    C1146yh c1146yh19 = c1151ym31 != null ? c1151ym31.f48184i : null;
                    if (c1152yn11 != c1152yn27) {
                        C1151ym c1151ym32 = c1152yn11.f48203S[i34].f48181f;
                        if (c1151ym32 != null) {
                            c1146yh4 = c1151ym32.f48184i;
                        }
                    } else {
                        c1146yh4 = c1146yh19;
                    }
                    if (c1152yn12 == c1152yn27) {
                        c1151ym29 = c1151ymArr6[i34];
                    }
                    if (c1146yh18 != null && c1146yh4 != null) {
                        c1141yc.m19625d(c1151ym28.f48184i, c1146yh18, c1151ym28.m19651b(), 0.5f, c1146yh4, c1151ym29.f48184i, c1152yn27.f48203S[i34].m19651b(), 5);
                    }
                }
            } else {
                i4 = i9;
                i5 = i2;
                c1149ykArr2 = c1149ykArr;
            }
            i9 = i4 + 1;
            i8 = 2;
            c1153yo2 = c1153yo;
            i2 = i5;
            c1149ykArr = c1149ykArr2;
        }
    }
}
