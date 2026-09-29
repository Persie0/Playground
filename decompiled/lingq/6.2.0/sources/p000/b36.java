package p000;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b36 {

    /* JADX INFO: renamed from: a */
    public long f7866a;

    /* JADX INFO: renamed from: b */
    public final SparseLongArray f7867b = new SparseLongArray();

    /* JADX INFO: renamed from: c */
    public final SparseBooleanArray f7868c = new SparseBooleanArray();

    /* JADX INFO: renamed from: d */
    public final ArrayList f7869d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final tk5 f7870e = new tk5((Object) null);

    /* JADX INFO: renamed from: f */
    public int f7871f = -1;

    /* JADX INFO: renamed from: g */
    public int f7872g = -1;

    /* JADX INFO: renamed from: h */
    public boolean f7873h;

    /* JADX INFO: renamed from: i */
    public boolean f7874i;

    /* JADX INFO: renamed from: j */
    public gq6 f7875j;

    /* JADX INFO: renamed from: a */
    public final void m3264a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.f7867b;
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j = this.f7866a;
                this.f7866a = 1 + j;
                sparseLongArray.put(pointerId, j);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (sparseLongArray.indexOfKey(pointerId2) < 0) {
            long j2 = this.f7866a;
            this.f7866a = 1 + j2;
            sparseLongArray.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.f7868c.put(pointerId2, true);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3265b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.f7871f && source == this.f7872g) {
            return;
        }
        this.f7871f = toolType;
        this.f7872g = source;
        this.f7868c.clear();
        this.f7867b.clear();
    }

    /* JADX INFO: renamed from: c */
    public final fs6 m3266c(MotionEvent motionEvent, ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c) {
        int actionIndex;
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.f7868c;
        if (actionMasked == 3 || actionMasked == 4) {
            this.f7867b.clear();
            sparseBooleanArray.clear();
            this.f7873h = false;
            this.f7874i = false;
            this.f7875j = null;
            return null;
        }
        m3265b(motionEvent);
        m3264a(motionEvent);
        boolean z = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z2 = actionMasked == 8;
        if (z) {
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            actionIndex = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            actionIndex = 0;
        }
        ArrayList arrayList = this.f7869d;
        arrayList.clear();
        if (motionEvent.getActionMasked() == 0) {
            boolean z3 = Build.VERSION.SDK_INT >= 34 && (motionEvent.getClassification() == 3 || motionEvent.getClassification() == 5);
            boolean z4 = motionEvent.getButtonState() == 0 && (motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584));
            if (z3 || z4) {
                this.f7873h = true;
            }
        }
        if (Build.VERSION.SDK_INT < 34 || motionEvent.getClassification() != 3) {
            this.f7874i = false;
            int pointerCount = motionEvent.getPointerCount();
            int i = 0;
            while (i < pointerCount) {
                arrayList.add(m3267d(viewTreeObserverOnGlobalLayoutListenerC0391c, motionEvent, null, i, (z || i == actionIndex || (z2 && motionEvent.getButtonState() == 0)) ? false : true));
                i++;
            }
        } else {
            this.f7874i = true;
            if (motionEvent.getActionMasked() == 0) {
                this.f7875j = new gq6((((long) Float.floatToRawIntBits(motionEvent.getRawX(0))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getRawY(0))) & 4294967295L));
            }
            arrayList.add(m3267d(viewTreeObserverOnGlobalLayoutListenerC0391c, motionEvent, this.f7875j, 0, false));
        }
        if (motionEvent.getActionMasked() == 1) {
            this.f7873h = false;
            this.f7874i = false;
            this.f7875j = null;
        }
        m3268e(motionEvent);
        motionEvent.getEventTime();
        return new fs6(8, arrayList, motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0090  */
    /* JADX INFO: renamed from: d */
    public final mg7 m3267d(ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c, MotionEvent motionEvent, gq6 gq6Var, int i, boolean z) {
        long jValueAt;
        long jM13435a;
        long jM1738N;
        int i2;
        char c;
        long jFloatToRawIntBits;
        float fFloatValue;
        long jFloatToRawIntBits2;
        int pointerId = motionEvent.getPointerId(i);
        SparseLongArray sparseLongArray = this.f7867b;
        int iIndexOfKey = sparseLongArray.indexOfKey(pointerId);
        if (iIndexOfKey >= 0) {
            jValueAt = sparseLongArray.valueAt(iIndexOfKey);
        } else {
            long j = this.f7866a;
            this.f7866a = 1 + j;
            sparseLongArray.put(pointerId, j);
            jValueAt = j;
        }
        float pressure = motionEvent.getPressure(i);
        char c2 = ' ';
        long j2 = 4294967295L;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(motionEvent.getX(i))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY(i))) & 4294967295L);
        if (i == 0) {
            if (gq6Var != null) {
                jM13435a = gq6Var.f41189a;
            } else {
                jM13435a = (((long) Float.floatToRawIntBits(motionEvent.getRawX())) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getRawY())) & 4294967295L);
            }
            jM1738N = viewTreeObserverOnGlobalLayoutListenerC0391c.m1738N(jM13435a);
        } else {
            jM13435a = gq6Var != null ? gq6Var.f41189a : hqb.m13435a(motionEvent, i);
            jM1738N = viewTreeObserverOnGlobalLayoutListenerC0391c.m1738N(jM13435a);
        }
        long j3 = jM13435a;
        long j4 = jM1738N;
        int toolType = motionEvent.getToolType(i);
        if (toolType != 0) {
            int i3 = 2;
            if (toolType == 1) {
                i2 = ((motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584)) && (!this.f7873h || this.f7874i)) ? i3 : 1;
            } else if (toolType != 2) {
                if (toolType != 3) {
                    i3 = 4;
                    if (toolType != 4) {
                        i2 = 0;
                    }
                }
            } else {
                i2 = 3;
            }
        } else {
            i2 = 0;
        }
        ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
        int historySize = motionEvent.getHistorySize();
        int i4 = 0;
        while (true) {
            c = c2;
            jFloatToRawIntBits = 0;
            fFloatValue = 1.0f;
            if (i4 >= historySize) {
                break;
            }
            float historicalX = motionEvent.getHistoricalX(i, i4);
            float historicalY = motionEvent.getHistoricalY(i, i4);
            long j5 = j2;
            if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) < 2139095040) {
                long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(historicalX)) << c) | (((long) Float.floatToRawIntBits(historicalY)) & j5);
                long historicalEventTime = motionEvent.getHistoricalEventTime(i4);
                float historicalAxisValue = motionEvent.getHistoricalAxisValue(52, i, i4);
                Float fValueOf = historicalAxisValue > 0.0f ? Float.valueOf(historicalAxisValue) : null;
                float fFloatValue2 = fValueOf != null ? fValueOf.floatValue() : 1.0f;
                if (motionEvent.getClassification() == 3) {
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(50, i, i4))) << c) | (((long) Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(51, i, i4))) & j5);
                }
                arrayList.add(new zt3(historicalEventTime, jFloatToRawIntBits4, fFloatValue2, jFloatToRawIntBits, jFloatToRawIntBits4));
            }
            i4++;
            c2 = c;
            j2 = j5;
        }
        long j6 = j2;
        if (motionEvent.getActionMasked() == 8) {
            jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f)) & j6) | (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c);
        } else {
            jFloatToRawIntBits2 = 0;
        }
        if (motionEvent.getClassification() == 5) {
            float axisValue = motionEvent.getAxisValue(52, i);
            Float fValueOf2 = axisValue > 0.0f ? Float.valueOf(axisValue) : null;
            if (fValueOf2 != null) {
                fFloatValue = fValueOf2.floatValue();
            }
        }
        float f = fFloatValue;
        if (motionEvent.getClassification() == 3) {
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(50, i))) << c) | (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(51, i))) & j6);
        }
        return new mg7(jValueAt, motionEvent.getEventTime(), j3, j4, z, pressure, i2, this.f7868c.get(motionEvent.getPointerId(i), false), arrayList, jFloatToRawIntBits2, f, jFloatToRawIntBits, jFloatToRawIntBits3);
    }

    /* JADX INFO: renamed from: e */
    public final void m3268e(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.f7868c;
        SparseLongArray sparseLongArray = this.f7867b;
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!sparseBooleanArray.get(pointerId, false)) {
                sparseLongArray.delete(pointerId);
                sparseBooleanArray.delete(pointerId);
            }
        }
        if (sparseLongArray.size() > motionEvent.getPointerCount()) {
            for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                int iKeyAt = sparseLongArray.keyAt(size);
                int pointerCount = motionEvent.getPointerCount();
                int i = 0;
                while (true) {
                    if (i >= pointerCount) {
                        sparseLongArray.removeAt(size);
                        sparseBooleanArray.delete(iKeyAt);
                        break;
                    } else if (motionEvent.getPointerId(i) == iKeyAt) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
    }
}
