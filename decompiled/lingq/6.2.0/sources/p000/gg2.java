package p000;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class gg2 {

    /* JADX INFO: renamed from: a */
    public final Context f40761a;

    /* JADX INFO: renamed from: b */
    public final hg2 f40762b;

    /* JADX INFO: renamed from: c */
    public VelocityTracker f40763c;

    /* JADX INFO: renamed from: d */
    public float f40764d;

    /* JADX INFO: renamed from: e */
    public int f40765e = -1;

    /* JADX INFO: renamed from: f */
    public int f40766f = -1;

    /* JADX INFO: renamed from: g */
    public int f40767g = -1;

    /* JADX INFO: renamed from: h */
    public final int[] f40768h = {Integer.MAX_VALUE, 0};

    public gg2(Context context, hg2 hg2Var) {
        this.f40761a = context;
        this.f40762b = hg2Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0079  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:81:0x0164  */
    /* JADX INFO: renamed from: a */
    public final void m12580a(MotionEvent motionEvent, int i) {
        int i2;
        int i3;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        boolean z;
        float f;
        float yVelocity;
        long j;
        int i4;
        float fSqrt;
        float f2;
        float[] fArr;
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i5 = this.f40766f;
        int[] iArr = this.f40768h;
        if (i5 == source && this.f40767g == deviceId && this.f40765e == i) {
            z = false;
            i2 = 1;
            i3 = 0;
        } else {
            Context context = this.f40761a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            i2 = 1;
            int i6 = Build.VERSION.SDK_INT;
            i3 = 0;
            if (i6 >= 34) {
                scaledMinimumFlingVelocity = AbstractC3170k3.m14779c(viewConfiguration, deviceId2, i, source2);
            } else {
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device == null || device.getMotionRange(i, source2) == null) {
                    scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                } else {
                    Resources resources = context.getResources();
                    int identifier = (source2 == 4194304 && i == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier == -1) {
                        scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier == 0 || (scaledMinimumFlingVelocity = resources.getDimensionPixelSize(identifier)) < 0) {
                        scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                    }
                }
            }
            iArr[0] = scaledMinimumFlingVelocity;
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            if (i6 >= 34) {
                scaledMaximumFlingVelocity = AbstractC3170k3.m14778b(viewConfiguration, deviceId3, i, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if (device2 == null || device2.getMotionRange(i, source3) == null) {
                    scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                } else {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source3 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                    } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
                        scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                    }
                }
            }
            iArr[1] = scaledMaximumFlingVelocity;
            this.f40766f = source;
            this.f40767g = deviceId;
            this.f40765e = i;
            z = true;
        }
        int i7 = iArr[i3];
        VelocityTracker velocityTracker = this.f40763c;
        if (i7 == Integer.MAX_VALUE) {
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f40763c = null;
                return;
            }
            return;
        }
        if (velocityTracker == null) {
            this.f40763c = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker2 = this.f40763c;
        Map map = gpa.f41166a;
        velocityTracker2.addMovement(motionEvent);
        float f3 = 0.0f;
        int i8 = 20;
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map2 = gpa.f41166a;
            if (!map2.containsKey(velocityTracker2)) {
                map2.put(velocityTracker2, new hpa());
            }
            hpa hpaVar = (hpa) map2.get(velocityTracker2);
            long[] jArr = hpaVar.f42748b;
            long eventTime = motionEvent.getEventTime();
            if (hpaVar.f42750d != 0 && eventTime - jArr[hpaVar.f42751e] > 40) {
                hpaVar.f42750d = i3;
                hpaVar.f42749c = 0.0f;
            }
            int i9 = (hpaVar.f42751e + 1) % 20;
            hpaVar.f42751e = i9;
            int i10 = hpaVar.f42750d;
            if (i10 != 20) {
                hpaVar.f42750d = i10 + 1;
            }
            hpaVar.f42747a[i9] = motionEvent.getAxisValue(26);
            jArr[hpaVar.f42751e] = eventTime;
        }
        velocityTracker2.computeCurrentVelocity(DescriptorProtos.Edition.EDITION_2023_VALUE, Float.MAX_VALUE);
        hpa hpaVar2 = (hpa) gpa.f41166a.get(velocityTracker2);
        if (hpaVar2 != null) {
            float[] fArr2 = hpaVar2.f42747a;
            long[] jArr2 = hpaVar2.f42748b;
            int i11 = hpaVar2.f42750d;
            if (i11 < 2) {
                fSqrt = 0.0f;
                f = 0.0f;
            } else {
                int i12 = hpaVar2.f42751e;
                int i13 = ((i12 + 20) - (i11 - 1)) % 20;
                long j2 = jArr2[i12];
                while (true) {
                    j = jArr2[i13];
                    long j3 = j2 - j;
                    i4 = hpaVar2.f42750d;
                    if (j3 <= 100) {
                        break;
                    }
                    hpaVar2.f42750d = i4 - 1;
                    i13 = (i13 + 1) % 20;
                }
                if (i4 < 2) {
                    fSqrt = 0.0f;
                    f = 0.0f;
                } else if (i4 == 2) {
                    int i14 = (i13 + 1) % 20;
                    long j4 = jArr2[i14];
                    if (j == j4) {
                        fSqrt = 0.0f;
                        f = 0.0f;
                    } else {
                        fSqrt = fArr2[i14] / (j4 - j);
                        f = 0.0f;
                    }
                } else {
                    float fAbs = 0.0f;
                    int i15 = 0;
                    int i16 = 0;
                    while (true) {
                        if (i15 >= hpaVar2.f42750d - 1) {
                            break;
                        }
                        int i17 = i15 + i13;
                        long j5 = jArr2[i17 % 20];
                        int i18 = (i17 + 1) % i8;
                        if (jArr2[i18] == j5) {
                            f2 = f3;
                            fArr = fArr2;
                        } else {
                            i16++;
                            f2 = f3;
                            fArr = fArr2;
                            float fSqrt2 = (fAbs < f3 ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(fAbs) * 2.0f));
                            float f4 = fArr[i18] / (jArr2[i18] - j5);
                            fAbs += Math.abs(f4) * (f4 - fSqrt2);
                            if (i16 == i2) {
                                fAbs *= 0.5f;
                            }
                        }
                        i15++;
                        f3 = f2;
                        fArr2 = fArr;
                        i8 = 20;
                        i2 = 1;
                    }
                    f = f3;
                    fSqrt = (fAbs < f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(fAbs) * 2.0f));
                }
            }
            float f5 = fSqrt * 1000.0f;
            hpaVar2.f42749c = f5;
            if (f5 < (-Math.abs((float) r4))) {
                hpaVar2.f42749c = -Math.abs(Float.MAX_VALUE);
            } else if (hpaVar2.f42749c > Math.abs((float) r4)) {
                hpaVar2.f42749c = Math.abs((float) r4);
            }
        } else {
            f = 0.0f;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            yVelocity = AbstractC3170k3.m14777a(velocityTracker2, i);
        } else if (i == 0) {
            yVelocity = velocityTracker2.getXVelocity();
        } else if (i == 1) {
            yVelocity = velocityTracker2.getYVelocity();
        } else {
            hpa hpaVar3 = (hpa) gpa.f41166a.get(velocityTracker2);
            yVelocity = (hpaVar3 == null || i != 26) ? f : hpaVar3.f42749c;
        }
        hg2 hg2Var = this.f40762b;
        float fMo13227m = hg2Var.mo13227m() * yVelocity;
        float fSignum = Math.signum(fMo13227m);
        if (z || (fSignum != Math.signum(this.f40764d) && fSignum != f)) {
            hg2Var.mo13228n();
        }
        if (Math.abs(fMo13227m) < iArr[0]) {
            return;
        }
        int i19 = iArr[1];
        float fMax = Math.max(-i19, Math.min(fMo13227m, i19));
        this.f40764d = hg2Var.mo13226e(fMax) ? fMax : f;
    }
}
