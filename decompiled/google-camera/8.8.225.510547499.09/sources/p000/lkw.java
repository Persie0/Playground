package p000;

import android.util.ArrayMap;
import android.view.FrameMetrics;
import android.view.Window;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class lkw implements Window.OnFrameMetricsAvailableListener {

    /* JADX INFO: renamed from: a */
    private final msi f38517a = lku.m15663q(new ffw(6));

    /* JADX INFO: renamed from: b */
    private boolean f38518b;

    /* JADX INFO: renamed from: c */
    private long f38519c;

    /* JADX INFO: renamed from: d */
    private final ArrayMap f38520d;

    public lkw(ArrayMap arrayMap) {
        this.f38520d = arrayMap;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        int i2;
        int i3;
        int i4;
        if (!this.f38518b) {
            this.f38518b = true;
            this.f38519c = ((Long) this.f38517a.mo6051a()).longValue();
        }
        if (frameMetrics.getMetric(9) == 1) {
            return;
        }
        long metric = frameMetrics.getMetric(8);
        long j = this.f38519c;
        long metric2 = frameMetrics.getMetric(13);
        ArrayMap arrayMap = this.f38520d;
        synchronized (arrayMap) {
            int size = arrayMap.size();
            int i5 = 0;
            while (i5 < size) {
                llb llbVar = (llb) arrayMap.valueAt(i5);
                int i6 = i5;
                int i7 = (int) (metric / 1000000);
                if (i7 < 0) {
                    llbVar.f38552j++;
                } else {
                    llbVar.f38551i++;
                    if (metric2 > 0) {
                        i2 = i7;
                        int i8 = (int) ((metric - metric2) / 1000000);
                        if (llbVar.f38557o < i8) {
                            llbVar.f38557o = i8;
                        }
                        int[] iArr = llbVar.f38548f;
                        if (i8 < 20) {
                            if (i8 >= -20) {
                                i4 = ((i8 + 20) >> 1) + 12;
                            } else if (i8 >= -30) {
                                i4 = ((i8 + 30) / 5) + 10;
                            } else if (i8 >= -100) {
                                i4 = ((i8 + 100) / 10) + 3;
                            } else {
                                i4 = i8 >= -200 ? ((i8 + 200) / 50) + 1 : 0;
                            }
                        } else if (i8 < 30) {
                            i4 = ((i8 - 20) / 5) + 32;
                        } else if (i8 < 100) {
                            i4 = ((i8 - 30) / 10) + 34;
                        } else if (i8 < 200) {
                            i4 = ((i8 - 50) / 100) + 41;
                        } else {
                            i4 = i8 < 1000 ? ((i8 - 200) / 100) + 43 : 51;
                        }
                        iArr[i4] = iArr[i4] + 1;
                        if (metric > metric2) {
                            llbVar.f38549g++;
                            llbVar.f38554l += i2;
                        }
                        if (metric > j) {
                            llbVar.f38550h++;
                            llbVar.f38555m += i2;
                        }
                    } else {
                        i2 = i7;
                        if (metric > j) {
                            llbVar.f38549g++;
                            llbVar.f38554l += i2;
                        }
                    }
                    int[] iArr2 = llbVar.f38547e;
                    int i9 = i2;
                    if (i9 <= 20) {
                        i3 = i9 >= 8 ? (i9 >> 1) - 2 : i9 / 4;
                    } else if (i9 <= 30) {
                        i3 = (i9 / 5) + 4;
                    } else if (i9 <= 100) {
                        i3 = (i9 / 10) + 7;
                    } else if (i9 <= 200) {
                        i3 = (i9 / 50) + 15;
                    } else {
                        i3 = i9 <= 1000 ? (i9 / 100) + 17 : 27;
                    }
                    iArr2[i3] = iArr2[i3] + 1;
                    llbVar.f38552j += i;
                    if (llbVar.f38553k < i9) {
                        llbVar.f38553k = i9;
                    }
                    llbVar.f38556n += i9;
                }
                i5 = i6 + 1;
            }
        }
    }
}
