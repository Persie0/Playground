package p060d1;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import dm.C5207g;
import java.util.ArrayList;
import p260m8.C7499b;
import p375s0.C8941c;

/* JADX INFO: renamed from: d1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C5020g {

    /* JADX INFO: renamed from: a */
    public long f32816a;

    /* JADX INFO: renamed from: b */
    public final SparseLongArray f32817b = new SparseLongArray();

    /* JADX INFO: renamed from: c */
    public final SparseBooleanArray f32818c = new SparseBooleanArray();

    /* JADX INFO: renamed from: d */
    public final ArrayList f32819d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public int f32820e = -1;

    /* JADX INFO: renamed from: f */
    public int f32821f = -1;

    /* JADX WARN: Code duplicated, block: B:101:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:102:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:106:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:107:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:72:0x015b  */
    /* JADX WARN: Code duplicated, block: B:74:0x015e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0162 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0164  */
    /* JADX WARN: Code duplicated, block: B:80:0x0169  */
    /* JADX WARN: Code duplicated, block: B:82:0x016d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0171  */
    /* JADX WARN: Code duplicated, block: B:87:0x0180  */
    /* JADX WARN: Code duplicated, block: B:89:0x018e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0199  */
    /* JADX WARN: Code duplicated, block: B:94:0x019f  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ae  */
    /* JADX INFO: renamed from: a */
    public final C5030q m10703a(MotionEvent motionEvent, InterfaceC5037x interfaceC5037x) {
        int i10;
        int i11;
        int i12;
        long jValueAt;
        long j10;
        long jMo2262k;
        long jM10704a;
        long jMo2263o;
        int toolType;
        int i13;
        ArrayList arrayList;
        int historySize;
        int i14;
        char c10;
        char c11;
        long jM14932c;
        float historicalX;
        float historicalY;
        boolean z10;
        boolean z11;
        int i15;
        InterfaceC5037x interfaceC5037x2 = interfaceC5037x;
        C5207g.m11111f(motionEvent, "motionEvent");
        C5207g.m11111f(interfaceC5037x2, "positionCalculator");
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.f32817b;
        SparseBooleanArray sparseBooleanArray = this.f32818c;
        if (actionMasked == 3) {
            sparseLongArray.clear();
            sparseBooleanArray.clear();
            return null;
        }
        if (motionEvent.getPointerCount() == 1) {
            int toolType2 = motionEvent.getToolType(0);
            int source = motionEvent.getSource();
            if (toolType2 != this.f32820e || source != this.f32821f) {
                this.f32820e = toolType2;
                this.f32821f = source;
                sparseBooleanArray.clear();
                sparseLongArray.clear();
            }
        }
        int actionMasked2 = motionEvent.getActionMasked();
        long j11 = 1;
        if (actionMasked2 == 0 || actionMasked2 == 5) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j12 = this.f32816a;
                this.f32816a = 1 + j12;
                sparseLongArray.put(pointerId, j12);
                if (motionEvent.getToolType(actionIndex) == 3) {
                    sparseBooleanArray.put(pointerId, true);
                }
            }
        } else if (actionMasked2 == 9) {
            int pointerId2 = motionEvent.getPointerId(0);
            if (sparseLongArray.indexOfKey(pointerId2) < 0) {
                long j13 = this.f32816a;
                this.f32816a = j13 + 1;
                sparseLongArray.put(pointerId2, j13);
            }
        }
        boolean z12 = actionMasked == 10 || actionMasked == 7 || actionMasked == 9;
        boolean z13 = actionMasked == 8;
        if (z12) {
            i10 = 1;
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        } else {
            i10 = 1;
        }
        int actionIndex2 = actionMasked != i10 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        ArrayList arrayList2 = this.f32819d;
        arrayList2.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i16 = 0;
        while (i16 < pointerCount) {
            boolean z14 = (z12 || i16 == actionIndex2 || (z13 && motionEvent.getButtonState() == 0)) ? false : true;
            int pointerId3 = motionEvent.getPointerId(i16);
            int iIndexOfKey = sparseLongArray.indexOfKey(pointerId3);
            if (iIndexOfKey >= 0) {
                jValueAt = sparseLongArray.valueAt(iIndexOfKey);
            } else {
                long j14 = this.f32816a;
                this.f32816a = j14 + j11;
                sparseLongArray.put(pointerId3, j14);
                jValueAt = j14;
            }
            float pressure = motionEvent.getPressure(i16);
            long jM14932c2 = C7499b.m14932c(motionEvent.getX(i16), motionEvent.getY(i16));
            if (i16 == 0) {
                jM10704a = C7499b.m14932c(motionEvent.getRawX(), motionEvent.getRawY());
                jMo2263o = interfaceC5037x2.mo2263o(jM10704a);
            } else {
                if (Build.VERSION.SDK_INT >= 29) {
                    jM10704a = C5021h.f32822a.m10704a(motionEvent, i16);
                    jMo2263o = interfaceC5037x2.mo2263o(jM10704a);
                } else {
                    j10 = jM14932c2;
                    jMo2262k = interfaceC5037x2.mo2262k(jM14932c2);
                }
                toolType = motionEvent.getToolType(i16);
                if (toolType == 0) {
                    if (toolType != 1) {
                        i15 = 2;
                        if (toolType != 2) {
                            i15 = 3;
                        } else if (toolType != 3) {
                            i15 = 4;
                            if (toolType != 4) {
                            }
                        }
                        i13 = i15;
                    } else {
                        i13 = 1;
                    }
                    arrayList = new ArrayList();
                    i14 = 0;
                    for (historySize = motionEvent.getHistorySize(); i14 < historySize; historySize = historySize) {
                        historicalX = motionEvent.getHistoricalX(i16, i14);
                        historicalY = motionEvent.getHistoricalY(i16, i14);
                        if (!Float.isInfinite(historicalX) || Float.isNaN(historicalX)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (!z10) {
                            if (!Float.isInfinite(historicalY) || Float.isNaN(historicalY)) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            if (z11) {
                                arrayList.add(new C5018e(motionEvent.getHistoricalEventTime(i14), C7499b.m14932c(historicalX, historicalY)));
                            }
                        }
                        i14++;
                        actionIndex2 = actionIndex2;
                    }
                    int i17 = actionIndex2;
                    if (motionEvent.getActionMasked() == 8) {
                        c10 = '\n';
                        c11 = '\t';
                        jM14932c = C7499b.m14932c(motionEvent.getAxisValue(10), (-motionEvent.getAxisValue(9)) + 0.0f);
                    } else {
                        c10 = '\n';
                        c11 = '\t';
                        jM14932c = C8941c.f46888b;
                    }
                    C5031r c5031r = new C5031r(jValueAt, motionEvent.getEventTime(), jMo2262k, j10, z14, pressure, i13, sparseBooleanArray.get(motionEvent.getPointerId(i16), false), arrayList, jM14932c);
                    ArrayList arrayList3 = arrayList2;
                    arrayList3.add(c5031r);
                    i16++;
                    arrayList2 = arrayList3;
                    z12 = z12;
                    actionIndex2 = i17;
                    j11 = 1;
                    interfaceC5037x2 = interfaceC5037x;
                }
                i13 = 0;
                arrayList = new ArrayList();
                i14 = 0;
                while (i14 < historySize) {
                    historicalX = motionEvent.getHistoricalX(i16, i14);
                    historicalY = motionEvent.getHistoricalY(i16, i14);
                    if (Float.isInfinite(historicalX)) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        if (Float.isInfinite(historicalY)) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            arrayList.add(new C5018e(motionEvent.getHistoricalEventTime(i14), C7499b.m14932c(historicalX, historicalY)));
                        }
                    }
                    i14++;
                    actionIndex2 = actionIndex2;
                }
                int i18 = actionIndex2;
                if (motionEvent.getActionMasked() == 8) {
                    c10 = '\n';
                    c11 = '\t';
                    jM14932c = C7499b.m14932c(motionEvent.getAxisValue(10), (-motionEvent.getAxisValue(9)) + 0.0f);
                } else {
                    c10 = '\n';
                    c11 = '\t';
                    jM14932c = C8941c.f46888b;
                }
                C5031r c5031r2 = new C5031r(jValueAt, motionEvent.getEventTime(), jMo2262k, j10, z14, pressure, i13, sparseBooleanArray.get(motionEvent.getPointerId(i16), false), arrayList, jM14932c);
                ArrayList arrayList4 = arrayList2;
                arrayList4.add(c5031r2);
                i16++;
                arrayList2 = arrayList4;
                z12 = z12;
                actionIndex2 = i18;
                j11 = 1;
                interfaceC5037x2 = interfaceC5037x;
            }
            jMo2262k = jM10704a;
            j10 = jMo2263o;
            toolType = motionEvent.getToolType(i16);
            if (toolType == 0) {
                if (toolType != 1) {
                    i15 = 2;
                    if (toolType != 2) {
                        i15 = 3;
                    } else if (toolType != 3) {
                        i15 = 4;
                        if (toolType != 4) {
                        }
                    }
                    i13 = i15;
                } else {
                    i13 = 1;
                }
                arrayList = new ArrayList();
                i14 = 0;
                while (i14 < historySize) {
                    historicalX = motionEvent.getHistoricalX(i16, i14);
                    historicalY = motionEvent.getHistoricalY(i16, i14);
                    if (Float.isInfinite(historicalX)) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        if (Float.isInfinite(historicalY)) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            arrayList.add(new C5018e(motionEvent.getHistoricalEventTime(i14), C7499b.m14932c(historicalX, historicalY)));
                        }
                    }
                    i14++;
                    actionIndex2 = actionIndex2;
                }
                int i19 = actionIndex2;
                if (motionEvent.getActionMasked() == 8) {
                    c10 = '\n';
                    c11 = '\t';
                    jM14932c = C7499b.m14932c(motionEvent.getAxisValue(10), (-motionEvent.getAxisValue(9)) + 0.0f);
                } else {
                    c10 = '\n';
                    c11 = '\t';
                    jM14932c = C8941c.f46888b;
                }
                C5031r c5031r3 = new C5031r(jValueAt, motionEvent.getEventTime(), jMo2262k, j10, z14, pressure, i13, sparseBooleanArray.get(motionEvent.getPointerId(i16), false), arrayList, jM14932c);
                ArrayList arrayList5 = arrayList2;
                arrayList5.add(c5031r3);
                i16++;
                arrayList2 = arrayList5;
                z12 = z12;
                actionIndex2 = i19;
                j11 = 1;
                interfaceC5037x2 = interfaceC5037x;
            }
            i13 = 0;
            arrayList = new ArrayList();
            i14 = 0;
            while (i14 < historySize) {
                historicalX = motionEvent.getHistoricalX(i16, i14);
                historicalY = motionEvent.getHistoricalY(i16, i14);
                if (Float.isInfinite(historicalX)) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    if (Float.isInfinite(historicalY)) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        arrayList.add(new C5018e(motionEvent.getHistoricalEventTime(i14), C7499b.m14932c(historicalX, historicalY)));
                    }
                }
                i14++;
                actionIndex2 = actionIndex2;
            }
            int i110 = actionIndex2;
            if (motionEvent.getActionMasked() == 8) {
                c10 = '\n';
                c11 = '\t';
                jM14932c = C7499b.m14932c(motionEvent.getAxisValue(10), (-motionEvent.getAxisValue(9)) + 0.0f);
            } else {
                c10 = '\n';
                c11 = '\t';
                jM14932c = C8941c.f46888b;
            }
            C5031r c5031r4 = new C5031r(jValueAt, motionEvent.getEventTime(), jMo2262k, j10, z14, pressure, i13, sparseBooleanArray.get(motionEvent.getPointerId(i16), false), arrayList, jM14932c);
            ArrayList arrayList6 = arrayList2;
            arrayList6.add(c5031r4);
            i16++;
            arrayList2 = arrayList6;
            z12 = z12;
            actionIndex2 = i110;
            j11 = 1;
            interfaceC5037x2 = interfaceC5037x;
        }
        ArrayList arrayList7 = arrayList2;
        int actionMasked3 = motionEvent.getActionMasked();
        if (actionMasked3 == 1 || actionMasked3 == 6) {
            int pointerId4 = motionEvent.getPointerId(motionEvent.getActionIndex());
            i11 = 0;
            if (!sparseBooleanArray.get(pointerId4, false)) {
                sparseLongArray.delete(pointerId4);
                sparseBooleanArray.delete(pointerId4);
            }
        } else {
            i11 = 0;
        }
        if (sparseLongArray.size() > motionEvent.getPointerCount()) {
            for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                int iKeyAt = sparseLongArray.keyAt(size);
                int pointerCount2 = motionEvent.getPointerCount();
                int i20 = i11;
                while (true) {
                    if (i20 >= pointerCount2) {
                        i12 = i11;
                        break;
                    }
                    if (motionEvent.getPointerId(i20) == iKeyAt) {
                        i12 = 1;
                        break;
                    }
                    i20++;
                }
                if (i12 == 0) {
                    sparseLongArray.removeAt(size);
                    sparseBooleanArray.delete(iKeyAt);
                }
            }
        }
        motionEvent.getEventTime();
        return new C5030q(arrayList7, motionEvent);
    }
}
