package p000;

import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class y26 {

    /* JADX INFO: renamed from: A */
    public bj4[] f69133A;

    /* JADX INFO: renamed from: b */
    public final View f69142b;

    /* JADX INFO: renamed from: c */
    public final int f69143c;

    /* JADX INFO: renamed from: j */
    public z9d[] f69150j;

    /* JADX INFO: renamed from: k */
    public C2897cu f69151k;

    /* JADX INFO: renamed from: o */
    public int[] f69155o;

    /* JADX INFO: renamed from: p */
    public double[] f69156p;

    /* JADX INFO: renamed from: q */
    public double[] f69157q;

    /* JADX INFO: renamed from: r */
    public String[] f69158r;

    /* JADX INFO: renamed from: s */
    public int[] f69159s;

    /* JADX INFO: renamed from: x */
    public HashMap f69164x;

    /* JADX INFO: renamed from: y */
    public HashMap f69165y;

    /* JADX INFO: renamed from: z */
    public HashMap f69166z;

    /* JADX INFO: renamed from: a */
    public final Rect f69141a = new Rect();

    /* JADX INFO: renamed from: d */
    public boolean f69144d = false;

    /* JADX INFO: renamed from: e */
    public int f69145e = -1;

    /* JADX INFO: renamed from: f */
    public final i36 f69146f = new i36();

    /* JADX INFO: renamed from: g */
    public final i36 f69147g = new i36();

    /* JADX INFO: renamed from: h */
    public final w26 f69148h = new w26();

    /* JADX INFO: renamed from: i */
    public final w26 f69149i = new w26();

    /* JADX INFO: renamed from: l */
    public float f69152l = Float.NaN;

    /* JADX INFO: renamed from: m */
    public float f69153m = 0.0f;

    /* JADX INFO: renamed from: n */
    public float f69154n = 1.0f;

    /* JADX INFO: renamed from: t */
    public final float[] f69160t = new float[4];

    /* JADX INFO: renamed from: u */
    public final ArrayList f69161u = new ArrayList();

    /* JADX INFO: renamed from: v */
    public final float[] f69162v = new float[1];

    /* JADX INFO: renamed from: w */
    public final ArrayList f69163w = new ArrayList();

    /* JADX INFO: renamed from: B */
    public int f69134B = -1;

    /* JADX INFO: renamed from: C */
    public int f69135C = -1;

    /* JADX INFO: renamed from: D */
    public View f69136D = null;

    /* JADX INFO: renamed from: E */
    public int f69137E = -1;

    /* JADX INFO: renamed from: F */
    public float f69138F = Float.NaN;

    /* JADX INFO: renamed from: G */
    public Interpolator f69139G = null;

    /* JADX INFO: renamed from: H */
    public boolean f69140H = false;

    public y26(View view) {
        this.f69142b = view;
        this.f69143c = view.getId();
        view.getLayoutParams();
    }

    /* JADX INFO: renamed from: f */
    public static void m24864f(Rect rect, Rect rect2, int i, int i2, int i3) {
        if (i == 1) {
            int i4 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i3 - ((rect.height() + i4) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i == 2) {
            int i5 = rect.left + rect.right;
            rect2.left = i2 - ((rect.width() + (rect.top + rect.bottom)) / 2);
            rect2.top = (i5 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i == 3) {
            int i6 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i6 / 2);
            rect2.top = i3 - ((rect.height() + i6) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i != 4) {
            return;
        }
        int i7 = rect.left + rect.right;
        rect2.left = i2 - ((rect.width() + (rect.bottom + rect.top)) / 2);
        rect2.top = (i7 - rect.height()) / 2;
        rect2.right = rect.width() + rect2.left;
        rect2.bottom = rect.height() + rect2.top;
    }

    /* JADX INFO: renamed from: a */
    public final float m24865a(float f, float[] fArr) {
        float f2 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f3 = this.f69154n;
            if (f3 != 1.0d) {
                float f4 = this.f69153m;
                if (f < f4) {
                    f = 0.0f;
                }
                if (f > f4 && f < 1.0d) {
                    f = Math.min((f - f4) * f3, 1.0f);
                }
            }
        }
        fo2 fo2Var = this.f69146f.f43413a;
        float f5 = Float.NaN;
        for (i36 i36Var : this.f69161u) {
            fo2 fo2Var2 = i36Var.f43413a;
            if (fo2Var2 != null) {
                float f6 = i36Var.f43415c;
                if (f6 < f) {
                    fo2Var = fo2Var2;
                    f2 = f6;
                } else if (Float.isNaN(f5)) {
                    f5 = i36Var.f43415c;
                }
            }
        }
        if (fo2Var == null) {
            return f;
        }
        float f7 = (Float.isNaN(f5) ? 1.0f : f5) - f2;
        double d = (f - f2) / f7;
        float fMo3907b = (((float) fo2Var.mo3907b(d)) * f7) + f2;
        if (fArr != null) {
            fArr[0] = (float) fo2Var.mo3908c(d);
        }
        return fMo3907b;
    }

    /* JADX WARN: Failed to calculate best type for var: r0v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v6 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v3 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v3 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v6 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v3 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v6 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v3 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r26v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r26v0 ??, new type: float[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r26v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r26v0 ??, new type: float[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v0 ??, new type: float
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    /* JADX INFO: renamed from: b */
    public final void m24866b(double r24, float[] r26, float[] r27) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.y26.m24866b(double, float[], float[]):void");
    }

    /* JADX INFO: renamed from: c */
    public final float m24867c() {
        float[] fArr = new float[2];
        double d = 0.0d;
        double d2 = 0.0d;
        float fHypot = 0.0f;
        for (int i = 0; i < 100; i++) {
            float f = i * 0.01010101f;
            double dMo3907b = f;
            fo2 fo2Var = this.f69146f.f43413a;
            float f2 = Float.NaN;
            float f3 = 0.0f;
            for (i36 i36Var : this.f69161u) {
                fo2 fo2Var2 = i36Var.f43413a;
                float f4 = f;
                if (fo2Var2 != null) {
                    float f5 = i36Var.f43415c;
                    if (f5 < f4) {
                        f3 = f5;
                        fo2Var = fo2Var2;
                    } else if (Float.isNaN(f2)) {
                        f2 = i36Var.f43415c;
                    }
                }
                f = f4;
            }
            float f6 = f;
            if (fo2Var != null) {
                if (Float.isNaN(f2)) {
                    f2 = 1.0f;
                }
                float f7 = f2 - f3;
                dMo3907b = (((float) fo2Var.mo3907b((f6 - f3) / f7)) * f7) + f3;
            }
            this.f69150j[0].mo9885c(dMo3907b, this.f69156p);
            this.f69146f.m13640c(dMo3907b, this.f69155o, this.f69156p, fArr, 0);
            if (i > 0) {
                fHypot += (float) Math.hypot(d2 - ((double) fArr[1]), d - ((double) fArr[0]));
            }
            d = fArr[0];
            d2 = fArr[1];
        }
        return fHypot;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m24868d(float f, long j, View view, web webVar) {
        boolean zMo17649d;
        boolean z;
        float f2;
        boolean z2;
        double d;
        float f3;
        float f4;
        float f5;
        float fSin;
        float f6;
        pva pvaVar = null;
        float fM24865a = m24865a(f, null);
        int i = this.f69137E;
        if (i != -1) {
            float f7 = 1.0f / i;
            float fFloor = ((float) Math.floor(fM24865a / f7)) * f7;
            float f8 = (fM24865a % f7) / f7;
            if (!Float.isNaN(this.f69138F)) {
                f8 = (f8 + this.f69138F) % 1.0f;
            }
            Interpolator interpolator = this.f69139G;
            fM24865a = ((interpolator != null ? interpolator.getInterpolation(f8) : ((double) f8) > 0.5d ? 1.0f : 0.0f) * f7) + fFloor;
        }
        HashMap map = this.f69165y;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((gva) it.next()).mo9912c(view, fM24865a);
            }
        }
        HashMap map2 = this.f69164x;
        if (map2 != null) {
            pva pvaVar2 = null;
            zMo17649d = false;
            for (rva rvaVar : map2.values()) {
                if (rvaVar instanceof pva) {
                    pvaVar2 = (pva) rvaVar;
                } else {
                    zMo17649d |= rvaVar.mo17649d(fM24865a, j, view, webVar);
                }
            }
            pvaVar = pvaVar2;
        } else {
            zMo17649d = false;
        }
        z9d[] z9dVarArr = this.f69150j;
        i36 i36Var = this.f69146f;
        if (z9dVarArr != null) {
            double d2 = fM24865a;
            z9dVarArr[0].mo9885c(d2, this.f69156p);
            this.f69150j[0].mo9887e(d2, this.f69157q);
            C2897cu c2897cu = this.f69151k;
            if (c2897cu != null) {
                double[] dArr = this.f69156p;
                f2 = 0.0f;
                if (dArr.length > 0) {
                    c2897cu.mo9885c(d2, dArr);
                    this.f69151k.mo9887e(d2, this.f69157q);
                }
            } else {
                f2 = 0.0f;
            }
            if (this.f69140H) {
                z2 = zMo17649d;
                d = d2;
                f3 = 2.0f;
            } else {
                int[] iArr = this.f69155o;
                double[] dArr2 = this.f69156p;
                f3 = 2.0f;
                double[] dArr3 = this.f69157q;
                boolean z3 = this.f69144d;
                float f9 = i36Var.f43417e;
                float fCos = i36Var.f43418f;
                float f10 = i36Var.f43419g;
                int i2 = 1;
                float f11 = i36Var.f43420h;
                if (iArr.length != 0) {
                    f4 = f10;
                    if (i36Var.f43411K.length <= iArr[iArr.length - 1]) {
                        int i3 = iArr[iArr.length - 1] + 1;
                        i36Var.f43411K = new double[i3];
                        i36Var.f43412L = new double[i3];
                    }
                } else {
                    f4 = f10;
                }
                Arrays.fill(i36Var.f43411K, Double.NaN);
                for (int i4 = 0; i4 < iArr.length; i4++) {
                    double[] dArr4 = i36Var.f43411K;
                    int i5 = iArr[i4];
                    dArr4[i5] = dArr2[i4];
                    i36Var.f43412L[i5] = dArr3[i4];
                }
                float f12 = Float.NaN;
                float f13 = f2;
                float f14 = f13;
                float f15 = f14;
                float f16 = f15;
                int i6 = 0;
                while (true) {
                    double[] dArr5 = i36Var.f43411K;
                    f5 = f11;
                    if (i6 >= dArr5.length) {
                        break;
                    }
                    if (Double.isNaN(dArr5[i6])) {
                        f6 = f9;
                    } else {
                        f6 = f9;
                        float f17 = (float) (Double.isNaN(i36Var.f43411K[i6]) ? 0.0d : i36Var.f43411K[i6] + 0.0d);
                        float f18 = (float) i36Var.f43412L[i6];
                        if (i6 == i2) {
                            f14 = f18;
                            f11 = f5;
                            f9 = f17;
                        } else if (i6 == 2) {
                            f13 = f18;
                            f9 = f6;
                            f11 = f5;
                            fCos = f17;
                        } else if (i6 == 3) {
                            f15 = f18;
                            f9 = f6;
                            f11 = f5;
                            f4 = f17;
                        } else if (i6 == 4) {
                            f16 = f18;
                            f9 = f6;
                            f11 = f17;
                        } else if (i6 == 5) {
                            f9 = f6;
                            f11 = f5;
                            f12 = f17;
                        }
                        i6++;
                        i2 = 1;
                    }
                    f9 = f6;
                    f11 = f5;
                    i6++;
                    i2 = 1;
                }
                float f19 = f9;
                y26 y26Var = i36Var.f43408H;
                if (y26Var != null) {
                    float[] fArr = new float[2];
                    float[] fArr2 = new float[2];
                    y26Var.m24866b(d2, fArr, fArr2);
                    float f20 = fArr[0];
                    float f21 = fArr[1];
                    float f22 = fArr2[0];
                    float f23 = fArr2[1];
                    z2 = zMo17649d;
                    d = d2;
                    double d3 = f19;
                    double d4 = fCos;
                    fSin = (float) (((Math.sin(d4) * d3) + ((double) f20)) - ((double) (f4 / 2.0f)));
                    fCos = (float) ((((double) f21) - (Math.cos(d4) * d3)) - ((double) (f5 / 2.0f)));
                    double d5 = f14;
                    double d6 = f13;
                    float fCos2 = (float) ((Math.cos(d4) * d3 * d6) + (Math.sin(d4) * d5) + ((double) f22));
                    float fSin2 = (float) ((Math.sin(d4) * d3 * d6) + (((double) f23) - (Math.cos(d4) * d5)));
                    if (dArr3.length >= 2) {
                        dArr3[0] = fCos2;
                        dArr3[1] = fSin2;
                    }
                    if (!Float.isNaN(f12)) {
                        view.setRotation((float) (Math.toDegrees(Math.atan2(fSin2, fCos2)) + ((double) f12)));
                    }
                } else {
                    fSin = f19;
                    z2 = zMo17649d;
                    d = d2;
                    if (!Float.isNaN(f12)) {
                        view.setRotation(f12 + ((float) Math.toDegrees(Math.atan2((f16 / 2.0f) + f13, (f15 / 2.0f) + f14))) + f2);
                    }
                }
                float f24 = fSin + 0.5f;
                int i7 = (int) f24;
                float f25 = fCos + 0.5f;
                int i8 = (int) f25;
                int i9 = (int) (f24 + f4);
                int i10 = (int) (f25 + f5);
                int i11 = i9 - i7;
                int i12 = i10 - i8;
                if (i11 != view.getMeasuredWidth() || i12 != view.getMeasuredHeight() || z3) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                }
                view.layout(i7, i8, i9, i10);
                this.f69144d = false;
            }
            if (this.f69135C != -1) {
                if (this.f69136D == null) {
                    this.f69136D = ((View) view.getParent()).findViewById(this.f69135C);
                }
                View view2 = this.f69136D;
                if (view2 != null) {
                    float bottom = (this.f69136D.getBottom() + view2.getTop()) / f3;
                    float right = (this.f69136D.getRight() + this.f69136D.getLeft()) / f3;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        float left = right - view.getLeft();
                        float top = bottom - view.getTop();
                        view.setPivotX(left);
                        view.setPivotY(top);
                    }
                }
            }
            HashMap map3 = this.f69165y;
            if (map3 != null) {
                for (gva gvaVar : map3.values()) {
                    if (gvaVar instanceof eva) {
                        double[] dArr6 = this.f69157q;
                        if (dArr6.length > 1) {
                            view.setRotation(((eva) gvaVar).m12918a(fM24865a) + ((float) Math.toDegrees(Math.atan2(dArr6[1], dArr6[0]))));
                        }
                    }
                }
            }
            if (pvaVar != 0) {
                double[] dArr7 = this.f69157q;
                double d7 = dArr7[0];
                double d8 = dArr7[1];
                pva pvaVar3 = pvaVar;
                view.setRotation(pvaVar3.m20868b(fM24865a, j, view, webVar) + ((float) Math.toDegrees(Math.atan2(d8, d7))));
                z = z2 | pvaVar3.f59891h;
            } else {
                z = z2;
            }
            int i13 = 1;
            while (true) {
                z9d[] z9dVarArr2 = this.f69150j;
                if (i13 >= z9dVarArr2.length) {
                    break;
                }
                z9d z9dVar = z9dVarArr2[i13];
                float[] fArr3 = this.f69160t;
                z9dVar.mo9886d(d, fArr3);
                bad.m3548c((cj1) i36Var.f43409I.get(this.f69158r[i13 - 1]), view, fArr3);
                i13++;
            }
            w26 w26Var = this.f69148h;
            if (w26Var.f66295b == 0) {
                if (fM24865a <= f2) {
                    view.setVisibility(w26Var.f66296c);
                } else {
                    w26 w26Var2 = this.f69149i;
                    if (fM24865a >= 1065353216) {
                        view.setVisibility(w26Var2.f66296c);
                    } else if (w26Var2.f66296c != w26Var.f66296c) {
                        view.setVisibility(0);
                    }
                }
            }
            if (this.f69133A != null) {
                int i14 = 0;
                while (true) {
                    bj4[] bj4VarArr = this.f69133A;
                    if (i14 >= bj4VarArr.length) {
                        break;
                    }
                    bj4VarArr[i14].m3774g(view, fM24865a);
                    i14++;
                }
            }
        } else {
            boolean z4 = zMo17649d;
            float f26 = i36Var.f43417e;
            i36 i36Var2 = this.f69147g;
            float fM17726a = AbstractC3393o1.m17726a(i36Var2.f43417e, f26, fM24865a, f26);
            float f27 = i36Var.f43418f;
            float fM17726a2 = AbstractC3393o1.m17726a(i36Var2.f43418f, f27, fM24865a, f27);
            float f28 = i36Var.f43419g;
            float f29 = i36Var2.f43419g;
            float fM17726a3 = AbstractC3393o1.m17726a(f29, f28, fM24865a, f28);
            float f30 = i36Var.f43420h;
            float f31 = i36Var2.f43420h;
            float f32 = fM17726a + 0.5f;
            int i15 = (int) f32;
            float f33 = fM17726a2 + 0.5f;
            int i16 = (int) f33;
            int i17 = (int) (f32 + fM17726a3);
            int iM17726a = (int) (f33 + AbstractC3393o1.m17726a(f31, f30, fM24865a, f30));
            int i18 = i17 - i15;
            int i19 = iM17726a - i16;
            if (f29 != f28 || f31 != f30 || this.f69144d) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
                this.f69144d = false;
            }
            view.layout(i15, i16, i17, iM17726a);
            z = z4;
        }
        HashMap map4 = this.f69166z;
        if (map4 != null) {
            for (lua luaVar : map4.values()) {
                if (luaVar instanceof jua) {
                    double[] dArr8 = this.f69157q;
                    view.setRotation(((jua) luaVar).m16547a(fM24865a) + ((float) Math.toDegrees(Math.atan2(dArr8[1], dArr8[0]))));
                } else {
                    luaVar.mo13481d(view, fM24865a);
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: e */
    public final void m24869e(i36 i36Var) {
        i36Var.m13641d((int) this.f69142b.getX(), (int) this.f69142b.getY(), this.f69142b.getWidth(), this.f69142b.getHeight());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:203:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:206:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:286:0x0844 A[PHI: r1 r11 r12
      0x0844: PHI (r1v67 java.lang.String) = (r1v64 java.lang.String), (r1v65 java.lang.String), (r1v66 java.lang.String), (r1v69 java.lang.String) binds: [B:285:0x0842, B:281:0x0815, B:276:0x07e3, B:272:0x07d0] A[DONT_GENERATE, DONT_INLINE]
      0x0844: PHI (r11v38 java.lang.String) = (r11v35 java.lang.String), (r11v36 java.lang.String), (r11v37 java.lang.String), (r11v40 java.lang.String) binds: [B:285:0x0842, B:281:0x0815, B:276:0x07e3, B:272:0x07d0] A[DONT_GENERATE, DONT_INLINE]
      0x0844: PHI (r12v25 java.lang.String) = (r12v22 java.lang.String), (r12v23 java.lang.String), (r12v24 java.lang.String), (r12v27 java.lang.String) binds: [B:285:0x0842, B:281:0x0815, B:276:0x07e3, B:272:0x07d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:391:0x0bfd  */
    /* JADX WARN: Code duplicated, block: B:460:0x0d28  */
    /* JADX WARN: Code duplicated, block: B:608:0x063a A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:442:0x0cab. Please report as an issue. */
    /* JADX WARN: Instruction removed from duplicated block: B:203:0x05d8, please report this as an issue */
    /* JADX INFO: renamed from: g */
    public final void m24870g(long j, int i, int i2) {
        String str;
        ArrayList arrayList;
        HashSet hashSet;
        Object obj;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        HashSet hashSet2;
        HashSet<String> hashSet3;
        i36 i36Var;
        Object obj2;
        String str7;
        ArrayList arrayList2;
        i36 i36Var2;
        Object obj3;
        String str8;
        int i3;
        String str9;
        int i4;
        cj1 cj1Var;
        HashSet hashSet4;
        String str10;
        HashMap map;
        Iterator it;
        String str11;
        Object obj4;
        Object obj5;
        byte b;
        byte b2;
        rva nvaVar;
        ova ovaVar;
        rva rvaVar;
        cj1 cj1Var2;
        Integer num;
        HashSet hashSet5;
        String str12;
        String str13;
        String str14;
        String str15;
        HashSet hashSet6;
        String str16;
        ArrayList arrayList3;
        Object obj6;
        Iterator it2;
        String str17;
        HashSet hashSet7;
        Object obj7;
        i36 i36Var3;
        Object obj8;
        i36 i36Var4;
        byte b3;
        byte b4;
        byte b5;
        cva cvaVar;
        gva cvaVar2;
        cj1 cj1Var3;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        int iBinarySearch;
        int i5;
        float fMin;
        float fM17726a;
        new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        HashSet hashSet10 = new HashSet();
        HashMap map2 = new HashMap();
        int i6 = this.f69134B;
        i36 i36Var5 = this.f69146f;
        if (i6 != -1) {
            i36Var5.f43422j = i6;
        }
        w26 w26Var = this.f69148h;
        float f = w26Var.f66298e;
        w26 w26Var2 = this.f69149i;
        if (w26.m23688b(f, w26Var2.f66298e)) {
            hashSet9.add("alpha");
        }
        String str23 = "elevation";
        if (w26.m23688b(w26Var.f66299f, w26Var2.f66299f)) {
            hashSet9.add("elevation");
        }
        int i7 = w26Var.f66296c;
        int i8 = w26Var2.f66296c;
        if (i7 != i8 && w26Var.f66295b == 0 && (i7 == 0 || i8 == 0)) {
            hashSet9.add("alpha");
        }
        String str24 = "rotation";
        if (w26.m23688b(w26Var.f66300g, w26Var2.f66300g)) {
            hashSet9.add("rotation");
        }
        String str25 = "transitionPathRotate";
        if (!Float.isNaN(w26Var.f66292K) || !Float.isNaN(w26Var2.f66292K)) {
            hashSet9.add("transitionPathRotate");
        }
        if (!Float.isNaN(w26Var.f66293L) || !Float.isNaN(w26Var2.f66293L)) {
            hashSet9.add("progress");
        }
        if (w26.m23688b(w26Var.f66301h, w26Var2.f66301h)) {
            hashSet9.add("rotationX");
        }
        if (w26.m23688b(w26Var.f66294a, w26Var2.f66294a)) {
            hashSet9.add("rotationY");
        }
        Object obj9 = "rotationX";
        if (w26.m23688b(w26Var.f66304k, w26Var2.f66304k)) {
            hashSet9.add("transformPivotX");
        }
        if (w26.m23688b(w26Var.f66305l, w26Var2.f66305l)) {
            hashSet9.add("transformPivotY");
        }
        String str26 = "scaleX";
        if (w26.m23688b(w26Var.f66302i, w26Var2.f66302i)) {
            hashSet9.add("scaleX");
        }
        Object obj10 = "rotationY";
        String str27 = "scaleY";
        if (w26.m23688b(w26Var.f66303j, w26Var2.f66303j)) {
            hashSet9.add("scaleY");
        }
        Object obj11 = "progress";
        if (w26.m23688b(w26Var.f66289H, w26Var2.f66289H)) {
            hashSet9.add("translationX");
        }
        Object obj12 = "translationX";
        String str28 = "translationY";
        if (w26.m23688b(w26Var.f66290I, w26Var2.f66290I)) {
            hashSet9.add("translationY");
        }
        if (w26.m23688b(w26Var.f66291J, w26Var2.f66291J)) {
            hashSet9.add("translationZ");
        }
        i36 i36Var6 = this.f69147g;
        ArrayList arrayList4 = this.f69161u;
        ArrayList<qh4> arrayList5 = this.f69163w;
        if (arrayList5 != null) {
            ArrayList arrayList6 = null;
            for (qh4 qh4Var : arrayList5) {
                String str29 = str28;
                if (qh4Var instanceof qi4) {
                    qi4 qi4Var = (qi4) qh4Var;
                    i36 i36Var7 = new i36();
                    str22 = str26;
                    i36Var7.f43414b = 0;
                    i36Var7.f43421i = Float.NaN;
                    i36Var7.f43422j = -1;
                    i36Var7.f43423k = -1;
                    i36Var7.f43424l = Float.NaN;
                    i36Var7.f43408H = null;
                    i36Var7.f43409I = new LinkedHashMap();
                    i36Var7.f43410J = 0;
                    str18 = str27;
                    i36Var7.f43411K = new double[18];
                    i36Var7.f43412L = new double[18];
                    if (i36Var5.f43423k != -1) {
                        float f2 = qi4Var.f57779a / 100.0f;
                        i36Var7.f43415c = f2;
                        i36Var7.f43414b = qi4Var.f57812h;
                        i36Var7.f43410J = qi4Var.f57817m;
                        float f3 = Float.isNaN(qi4Var.f57813i) ? f2 : qi4Var.f57813i;
                        str20 = str24;
                        float f4 = Float.isNaN(qi4Var.f57814j) ? f2 : qi4Var.f57814j;
                        str19 = str23;
                        float f5 = i36Var6.f43419g;
                        float f6 = i36Var5.f43419g;
                        float f7 = f5 - f6;
                        float f8 = i36Var6.f43420h;
                        float f9 = i36Var5.f43420h;
                        i36Var7.f43416d = i36Var7.f43415c;
                        i36Var7.f43419g = (int) ((f7 * f3) + f6);
                        i36Var7.f43420h = (int) (((f8 - f9) * f4) + f9);
                        int i9 = qi4Var.f57817m;
                        str21 = str25;
                        float f10 = qi4Var.f57815k;
                        if (i9 != 2) {
                            float f11 = Float.isNaN(f10) ? f2 : qi4Var.f57815k;
                            float f12 = i36Var6.f43417e;
                            float f13 = i36Var5.f43417e;
                            i36Var7.f43417e = AbstractC3393o1.m17726a(f12, f13, f11, f13);
                            if (!Float.isNaN(qi4Var.f57816l)) {
                                f2 = qi4Var.f57816l;
                            }
                            float f14 = i36Var6.f43418f;
                            float f15 = i36Var5.f43418f;
                            i36Var7.f43418f = AbstractC3393o1.m17726a(f14, f15, f2, f15);
                        } else {
                            if (Float.isNaN(f10)) {
                                float f16 = i36Var6.f43417e;
                                float f17 = i36Var5.f43417e;
                                fMin = AbstractC3393o1.m17726a(f16, f17, f2, f17);
                            } else {
                                fMin = qi4Var.f57815k * Math.min(f4, f3);
                            }
                            i36Var7.f43417e = fMin;
                            if (Float.isNaN(qi4Var.f57816l)) {
                                float f18 = i36Var6.f43418f;
                                float f19 = i36Var5.f43418f;
                                fM17726a = AbstractC3393o1.m17726a(f18, f19, f2, f19);
                            } else {
                                fM17726a = qi4Var.f57816l;
                            }
                            i36Var7.f43418f = fM17726a;
                        }
                        i36Var7.f43423k = i36Var5.f43423k;
                        i36Var7.f43413a = fo2.m11964d(qi4Var.f57810f);
                        i36Var7.f43422j = qi4Var.f57811g;
                    } else {
                        str19 = str23;
                        str20 = str24;
                        str21 = str25;
                        int i10 = qi4Var.f57817m;
                        int i11 = qi4Var.f57779a;
                        if (i10 == 1) {
                            float f20 = i11 / 100.0f;
                            i36Var7.f43415c = f20;
                            i36Var7.f43414b = qi4Var.f57812h;
                            float f21 = Float.isNaN(qi4Var.f57813i) ? f20 : qi4Var.f57813i;
                            float f22 = Float.isNaN(qi4Var.f57814j) ? f20 : qi4Var.f57814j;
                            float f23 = i36Var6.f43419g - i36Var5.f43419g;
                            float f24 = f20;
                            float f25 = i36Var6.f43420h - i36Var5.f43420h;
                            i36Var7.f43416d = i36Var7.f43415c;
                            if (!Float.isNaN(qi4Var.f57815k)) {
                                f24 = qi4Var.f57815k;
                            }
                            float f26 = i36Var5.f43417e;
                            float f27 = i36Var5.f43419g;
                            float f28 = (f27 / 2.0f) + f26;
                            float f29 = i36Var5.f43418f;
                            float f30 = i36Var5.f43420h;
                            float f31 = ((i36Var6.f43419g / 2.0f) + i36Var6.f43417e) - f28;
                            float f32 = ((i36Var6.f43420h / 2.0f) + i36Var6.f43418f) - ((f30 / 2.0f) + f29);
                            float f33 = f31 * f24;
                            float f34 = f23 * f21;
                            float f35 = f34 / 2.0f;
                            i36Var7.f43417e = (int) ((f26 + f33) - f35);
                            float f36 = f24 * f32;
                            float f37 = f25 * f22;
                            float f38 = f37 / 2.0f;
                            i36Var7.f43418f = (int) ((f29 + f36) - f38);
                            i36Var7.f43419g = (int) (f27 + f34);
                            i36Var7.f43420h = (int) (f30 + f37);
                            float f39 = Float.isNaN(qi4Var.f57816l) ? 0.0f : qi4Var.f57816l;
                            i36Var7.f43410J = 1;
                            float f40 = (int) ((i36Var5.f43417e + f33) - f35);
                            float f41 = (int) ((i36Var5.f43418f + f36) - f38);
                            i36Var7.f43417e = f40 + ((-f32) * f39);
                            i36Var7.f43418f = f41 + (f31 * f39);
                            i36Var7.f43423k = i36Var7.f43423k;
                            i36Var7.f43413a = fo2.m11964d(qi4Var.f57810f);
                            i36Var7.f43422j = qi4Var.f57811g;
                        } else if (i10 == 2) {
                            float f42 = i11 / 100.0f;
                            i36Var7.f43415c = f42;
                            i36Var7.f43414b = qi4Var.f57812h;
                            float f43 = Float.isNaN(qi4Var.f57813i) ? f42 : qi4Var.f57813i;
                            float f44 = Float.isNaN(qi4Var.f57814j) ? f42 : qi4Var.f57814j;
                            float f45 = i36Var6.f43419g;
                            float f46 = i36Var5.f43419g;
                            float f47 = f45 - f46;
                            float f48 = i36Var6.f43420h;
                            float f49 = i36Var5.f43420h;
                            float f50 = f48 - f49;
                            i36Var7.f43416d = i36Var7.f43415c;
                            float f51 = i36Var5.f43417e;
                            float f52 = (f46 / 2.0f) + f51;
                            float f53 = i36Var5.f43418f;
                            float f54 = (f45 / 2.0f) + i36Var6.f43417e;
                            float f55 = ((f48 / 2.0f) + i36Var6.f43418f) - ((f49 / 2.0f) + f53);
                            float f56 = f47 * f43;
                            i36Var7.f43417e = (int) ((((f54 - f52) * f42) + f51) - (f56 / 2.0f));
                            float f57 = f50 * f44;
                            i36Var7.f43418f = (int) (((f55 * f42) + f53) - (f57 / 2.0f));
                            i36Var7.f43419g = (int) (f46 + f56);
                            i36Var7.f43420h = (int) (f49 + f57);
                            i36Var7.f43410J = 2;
                            if (!Float.isNaN(qi4Var.f57815k)) {
                                i36Var7.f43417e = (int) (qi4Var.f57815k * (i - ((int) i36Var7.f43419g)));
                            }
                            if (!Float.isNaN(qi4Var.f57816l)) {
                                i36Var7.f43418f = (int) (qi4Var.f57816l * (i2 - ((int) i36Var7.f43420h)));
                            }
                            i36Var7.f43423k = i36Var7.f43423k;
                            i36Var7.f43413a = fo2.m11964d(qi4Var.f57810f);
                            i36Var7.f43422j = qi4Var.f57811g;
                        } else if (i10 != 3) {
                            float f58 = i11 / 100.0f;
                            i36Var7.f43415c = f58;
                            i36Var7.f43414b = qi4Var.f57812h;
                            float f59 = Float.isNaN(qi4Var.f57813i) ? f58 : qi4Var.f57813i;
                            float f60 = Float.isNaN(qi4Var.f57814j) ? f58 : qi4Var.f57814j;
                            float f61 = i36Var6.f43419g;
                            float f62 = i36Var5.f43419g;
                            float f63 = f61 - f62;
                            float f64 = i36Var6.f43420h;
                            float f65 = i36Var5.f43420h;
                            float f66 = f64 - f65;
                            i36Var7.f43416d = i36Var7.f43415c;
                            float f67 = i36Var5.f43417e;
                            float f68 = (f62 / 2.0f) + f67;
                            float f69 = i36Var5.f43418f;
                            float f70 = ((f61 / 2.0f) + i36Var6.f43417e) - f68;
                            float f71 = ((f64 / 2.0f) + i36Var6.f43418f) - ((f65 / 2.0f) + f69);
                            float f72 = f63 * f59;
                            float f73 = f72 / 2.0f;
                            i36Var7.f43417e = (int) (((f70 * f58) + f67) - f73);
                            float f74 = f66 * f60;
                            float f75 = f74 / 2.0f;
                            i36Var7.f43418f = (int) (((f71 * f58) + f69) - f75);
                            i36Var7.f43419g = (int) (f62 + f72);
                            i36Var7.f43420h = (int) (f65 + f74);
                            float f76 = Float.isNaN(qi4Var.f57815k) ? f58 : qi4Var.f57815k;
                            float f77 = Float.isNaN(Float.NaN) ? 0.0f : Float.NaN;
                            float f78 = f76;
                            float f79 = Float.isNaN(qi4Var.f57816l) ? f58 : qi4Var.f57816l;
                            float f80 = Float.isNaN(Float.NaN) ? 0.0f : Float.NaN;
                            float f81 = f79;
                            i36Var7.f43410J = 0;
                            i36Var7.f43417e = (int) (((f80 * f71) + ((f78 * f70) + i36Var5.f43417e)) - f73);
                            i36Var7.f43418f = (int) (((f71 * f81) + ((f70 * f77) + i36Var5.f43418f)) - f75);
                            i36Var7.f43413a = fo2.m11964d(qi4Var.f57810f);
                            i36Var7.f43422j = qi4Var.f57811g;
                        } else {
                            float f82 = i11 / 100.0f;
                            i36Var7.f43415c = f82;
                            i36Var7.f43414b = qi4Var.f57812h;
                            float f83 = Float.isNaN(qi4Var.f57813i) ? f82 : qi4Var.f57813i;
                            float f84 = Float.isNaN(qi4Var.f57814j) ? f82 : qi4Var.f57814j;
                            float f85 = i36Var6.f43419g;
                            float f86 = i36Var5.f43419g;
                            float f87 = f85 - f86;
                            float f88 = i36Var6.f43420h;
                            float f89 = i36Var5.f43420h;
                            float f90 = f88 - f89;
                            i36Var7.f43416d = i36Var7.f43415c;
                            float f91 = i36Var5.f43417e;
                            float f92 = (f86 / 2.0f) + f91;
                            float f93 = i36Var5.f43418f;
                            float f94 = (f89 / 2.0f) + f93;
                            float f95 = (f85 / 2.0f) + i36Var6.f43417e;
                            float f96 = (f88 / 2.0f) + i36Var6.f43418f;
                            if (f92 > f95) {
                                f92 = f95;
                                f95 = f92;
                            }
                            if (f94 <= f96) {
                                f94 = f96;
                                f96 = f94;
                            }
                            float f97 = f95 - f92;
                            float f98 = f94 - f96;
                            float f99 = f87 * f83;
                            float f100 = f99 / 2.0f;
                            i36Var7.f43417e = (int) (((f97 * f82) + f91) - f100);
                            float f101 = f90 * f84;
                            float f102 = f101 / 2.0f;
                            i36Var7.f43418f = (int) (((f98 * f82) + f93) - f102);
                            i36Var7.f43419g = (int) (f86 + f99);
                            i36Var7.f43420h = (int) (f89 + f101);
                            float f103 = Float.isNaN(qi4Var.f57815k) ? f82 : qi4Var.f57815k;
                            float f104 = Float.isNaN(Float.NaN) ? 0.0f : Float.NaN;
                            float f105 = f103;
                            float f106 = Float.isNaN(qi4Var.f57816l) ? f82 : qi4Var.f57816l;
                            float f107 = Float.isNaN(Float.NaN) ? 0.0f : Float.NaN;
                            float f108 = f106;
                            i36Var7.f43410J = 0;
                            i36Var7.f43417e = (int) (((f107 * f98) + ((f105 * f97) + i36Var5.f43417e)) - f100);
                            i36Var7.f43418f = (int) (((f98 * f108) + ((f97 * f104) + i36Var5.f43418f)) - f102);
                            i36Var7.f43413a = fo2.m11964d(qi4Var.f57810f);
                            i36Var7.f43422j = qi4Var.f57811g;
                        }
                        iBinarySearch = Collections.binarySearch(arrayList4, i36Var7);
                        if (iBinarySearch == 0) {
                            Log.e("MotionController", " KeyPath position \"" + i36Var7.f43416d + "\" outside of range");
                        }
                        arrayList4.add((-iBinarySearch) - 1, i36Var7);
                        i5 = qi4Var.f57809e;
                        if (i5 != -1) {
                            this.f69145e = i5;
                        }
                    }
                    iBinarySearch = Collections.binarySearch(arrayList4, i36Var7);
                    if (iBinarySearch == 0) {
                        Log.e("MotionController", " KeyPath position \"" + i36Var7.f43416d + "\" outside of range");
                    }
                    arrayList4.add((-iBinarySearch) - 1, i36Var7);
                    i5 = qi4Var.f57809e;
                    if (i5 != -1) {
                        this.f69145e = i5;
                    }
                } else {
                    str18 = str27;
                    str19 = str23;
                    str20 = str24;
                    str21 = str25;
                    str22 = str26;
                    if (qh4Var instanceof vh4) {
                        qh4Var.mo3772d(hashSet10);
                    } else if (qh4Var instanceof zi4) {
                        qh4Var.mo3772d(hashSet8);
                    } else if (qh4Var instanceof bj4) {
                        ArrayList arrayList7 = arrayList6 == null ? new ArrayList() : arrayList6;
                        arrayList7.add((bj4) qh4Var);
                        arrayList6 = arrayList7;
                    } else {
                        qh4Var.mo19972f(map2);
                        qh4Var.mo3772d(hashSet9);
                    }
                }
                str28 = str29;
                str26 = str22;
                str27 = str18;
                str24 = str20;
                str23 = str19;
                str25 = str21;
            }
            str = str27;
            arrayList = arrayList6;
        } else {
            str = "scaleY";
            arrayList = null;
        }
        String str30 = str23;
        String str31 = str24;
        String str32 = str25;
        String str33 = str28;
        String str34 = str26;
        if (arrayList != null) {
            this.f69133A = (bj4[]) arrayList.toArray(new bj4[0]);
        }
        String str35 = "CUSTOM,";
        if (hashSet9.isEmpty()) {
            hashSet = hashSet8;
            obj = obj10;
            str2 = str33;
            str3 = str;
            str4 = str31;
            str5 = str30;
            str6 = str32;
            hashSet2 = hashSet9;
            hashSet3 = hashSet10;
            i36Var = i36Var6;
            obj2 = obj12;
            str7 = str34;
            arrayList2 = arrayList4;
            i36Var2 = i36Var5;
            obj3 = obj11;
        } else {
            this.f69165y = new HashMap();
            Iterator it3 = hashSet9.iterator();
            while (it3.hasNext()) {
                String str36 = (String) it3.next();
                if (!str36.startsWith("CUSTOM,")) {
                    hashSet5 = hashSet8;
                    switch (str36.hashCode()) {
                        case -1249320806:
                            str12 = str;
                            str13 = str31;
                            str14 = str30;
                            str15 = str32;
                            hashSet6 = hashSet10;
                            str16 = str34;
                            arrayList3 = arrayList4;
                            obj6 = obj11;
                            it2 = it3;
                            str17 = str33;
                            hashSet7 = hashSet9;
                            obj7 = obj12;
                            i36Var3 = i36Var5;
                            obj8 = obj10;
                            i36Var4 = i36Var6;
                            obj9 = obj9;
                            b3 = str36.equals(obj9) ? (byte) 0 : (byte) -1;
                            break;
                        case -1249320805:
                            str12 = str;
                            str13 = str31;
                            str14 = str30;
                            str15 = str32;
                            hashSet6 = hashSet10;
                            str16 = str34;
                            arrayList3 = arrayList4;
                            obj6 = obj11;
                            it2 = it3;
                            str17 = str33;
                            hashSet7 = hashSet9;
                            obj7 = obj12;
                            i36Var3 = i36Var5;
                            obj8 = obj10;
                            if (str36.equals(obj8)) {
                                i36Var4 = i36Var6;
                                obj9 = obj9;
                                b3 = 1;
                            } else {
                                i36Var4 = i36Var6;
                                obj9 = obj9;
                            }
                            break;
                        case -1225497657:
                            str12 = str;
                            str13 = str31;
                            str14 = str30;
                            str15 = str32;
                            hashSet6 = hashSet10;
                            str16 = str34;
                            arrayList3 = arrayList4;
                            obj6 = obj11;
                            it2 = it3;
                            str17 = str33;
                            hashSet7 = hashSet9;
                            obj7 = obj12;
                            if (str36.equals(obj7)) {
                                i36Var3 = i36Var5;
                                obj8 = obj10;
                                i36Var4 = i36Var6;
                                obj9 = obj9;
                                b3 = 2;
                            } else {
                                i36Var3 = i36Var5;
                                obj8 = obj10;
                                i36Var4 = i36Var6;
                                obj9 = obj9;
                            }
                            break;
                        case -1225497656:
                            str12 = str;
                            str13 = str31;
                            str14 = str30;
                            str15 = str32;
                            hashSet6 = hashSet10;
                            str16 = str34;
                            arrayList3 = arrayList4;
                            obj6 = obj11;
                            it2 = it3;
                            str17 = str33;
                            if (str36.equals(str17)) {
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                i36Var3 = i36Var5;
                                obj8 = obj10;
                                i36Var4 = i36Var6;
                                obj9 = obj9;
                                b3 = 3;
                            } else {
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                i36Var3 = i36Var5;
                                obj8 = obj10;
                                i36Var4 = i36Var6;
                                obj9 = obj9;
                            }
                            break;
                        case -1225497655:
                            str12 = str;
                            str13 = str31;
                            str14 = str30;
                            str15 = str32;
                            hashSet6 = hashSet10;
                            str16 = str34;
                            arrayList3 = arrayList4;
                            obj6 = obj11;
                            it2 = it3;
                            if (str36.equals("translationZ")) {
                                str17 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                i36Var3 = i36Var5;
                                obj8 = obj10;
                                i36Var4 = i36Var6;
                                obj9 = obj9;
                                b3 = 4;
                            } else {
                                str17 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                i36Var3 = i36Var5;
                                obj8 = obj10;
                                i36Var4 = i36Var6;
                                obj9 = obj9;
                            }
                            break;
                        case -1001078227:
                            str12 = str;
                            str13 = str31;
                            str14 = str30;
                            str15 = str32;
                            hashSet6 = hashSet10;
                            str16 = str34;
                            arrayList3 = arrayList4;
                            obj6 = obj11;
                            if (str36.equals(obj6)) {
                                it2 = it3;
                                str17 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                i36Var3 = i36Var5;
                                obj8 = obj10;
                                i36Var4 = i36Var6;
                                obj9 = obj9;
                                b3 = 5;
                            } else {
                                it2 = it3;
                                str17 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                i36Var3 = i36Var5;
                                obj8 = obj10;
                                i36Var4 = i36Var6;
                                obj9 = obj9;
                            }
                            break;
                        case -908189618:
                            str12 = str;
                            str13 = str31;
                            str14 = str30;
                            str15 = str32;
                            hashSet6 = hashSet10;
                            str16 = str34;
                            if (str36.equals(str16)) {
                                arrayList3 = arrayList4;
                                obj6 = obj11;
                                it2 = it3;
                                str17 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                i36Var3 = i36Var5;
                                obj8 = obj10;
                                i36Var4 = i36Var6;
                                obj9 = obj9;
                                b3 = 6;
                            } else {
                                arrayList3 = arrayList4;
                                obj6 = obj11;
                                it2 = it3;
                                str17 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                i36Var3 = i36Var5;
                                obj8 = obj10;
                                i36Var4 = i36Var6;
                                obj9 = obj9;
                            }
                            break;
                        case -908189617:
                            str12 = str;
                            str13 = str31;
                            str14 = str30;
                            str15 = str32;
                            if (str36.equals(str12)) {
                                hashSet6 = hashSet10;
                                str16 = str34;
                                arrayList3 = arrayList4;
                                obj6 = obj11;
                                it2 = it3;
                                str17 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                i36Var3 = i36Var5;
                                obj8 = obj10;
                                i36Var4 = i36Var6;
                                obj9 = obj9;
                                b3 = 7;
                            } else {
                                hashSet6 = hashSet10;
                                str16 = str34;
                                arrayList3 = arrayList4;
                                obj6 = obj11;
                                it2 = it3;
                                str17 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                i36Var3 = i36Var5;
                                obj8 = obj10;
                                i36Var4 = i36Var6;
                                obj9 = obj9;
                            }
                            break;
                        case -797520672:
                            str13 = str31;
                            str14 = str30;
                            str15 = str32;
                            if (str36.equals("waveVariesBy")) {
                                str12 = str;
                                hashSet6 = hashSet10;
                                str16 = str34;
                                arrayList3 = arrayList4;
                                obj6 = obj11;
                                it2 = it3;
                                str17 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                i36Var3 = i36Var5;
                                obj8 = obj10;
                                i36Var4 = i36Var6;
                                obj9 = obj9;
                                b3 = 8;
                            } else {
                                str12 = str;
                                hashSet6 = hashSet10;
                                str16 = str34;
                                arrayList3 = arrayList4;
                                obj6 = obj11;
                                it2 = it3;
                                str17 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                i36Var3 = i36Var5;
                                obj8 = obj10;
                                i36Var4 = i36Var6;
                                obj9 = obj9;
                            }
                            break;
                        case -760884510:
                            str13 = str31;
                            str14 = str30;
                            str15 = str32;
                            if (str36.equals("transformPivotX")) {
                                str12 = str;
                                hashSet6 = hashSet10;
                                str16 = str34;
                                arrayList3 = arrayList4;
                                obj6 = obj11;
                                it2 = it3;
                                str17 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                i36Var3 = i36Var5;
                                obj8 = obj10;
                                i36Var4 = i36Var6;
                                obj9 = obj9;
                                b3 = 9;
                            } else {
                                str12 = str;
                                hashSet6 = hashSet10;
                                str16 = str34;
                                arrayList3 = arrayList4;
                                obj6 = obj11;
                                it2 = it3;
                                str17 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                i36Var3 = i36Var5;
                                obj8 = obj10;
                                i36Var4 = i36Var6;
                                obj9 = obj9;
                            }
                            break;
                        case -760884509:
                            str13 = str31;
                            str14 = str30;
                            str15 = str32;
                            if (str36.equals("transformPivotY")) {
                                b4 = 10;
                                String str37 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                i36Var3 = i36Var5;
                                obj8 = obj10;
                                i36Var4 = i36Var6;
                                obj9 = obj9;
                                b3 = b4;
                                str12 = str;
                                hashSet6 = hashSet10;
                                str16 = str34;
                                arrayList3 = arrayList4;
                                obj6 = obj11;
                                it2 = it3;
                                str17 = str37;
                            }
                            str12 = str;
                            hashSet6 = hashSet10;
                            str16 = str34;
                            arrayList3 = arrayList4;
                            obj6 = obj11;
                            it2 = it3;
                            str17 = str33;
                            hashSet7 = hashSet9;
                            obj7 = obj12;
                            i36Var3 = i36Var5;
                            obj8 = obj10;
                            i36Var4 = i36Var6;
                            obj9 = obj9;
                            break;
                        case -40300674:
                            str13 = str31;
                            str14 = str30;
                            str15 = str32;
                            if (str36.equals(str13)) {
                                b4 = 11;
                                String str38 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                i36Var3 = i36Var5;
                                obj8 = obj10;
                                i36Var4 = i36Var6;
                                obj9 = obj9;
                                b3 = b4;
                                str12 = str;
                                hashSet6 = hashSet10;
                                str16 = str34;
                                arrayList3 = arrayList4;
                                obj6 = obj11;
                                it2 = it3;
                                str17 = str38;
                            }
                            str12 = str;
                            hashSet6 = hashSet10;
                            str16 = str34;
                            arrayList3 = arrayList4;
                            obj6 = obj11;
                            it2 = it3;
                            str17 = str33;
                            hashSet7 = hashSet9;
                            obj7 = obj12;
                            i36Var3 = i36Var5;
                            obj8 = obj10;
                            i36Var4 = i36Var6;
                            obj9 = obj9;
                            break;
                        case -4379043:
                            str14 = str30;
                            str15 = str32;
                            if (str36.equals(str14)) {
                                str12 = str;
                                hashSet6 = hashSet10;
                                str16 = str34;
                                arrayList3 = arrayList4;
                                obj6 = obj11;
                                it2 = it3;
                                str17 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                i36Var3 = i36Var5;
                                obj8 = obj10;
                                i36Var4 = i36Var6;
                                obj9 = obj9;
                                b3 = 12;
                                str13 = str31;
                            } else {
                                str12 = str;
                                str13 = str31;
                                hashSet6 = hashSet10;
                                str16 = str34;
                                arrayList3 = arrayList4;
                                obj6 = obj11;
                                it2 = it3;
                                str17 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                i36Var3 = i36Var5;
                                obj8 = obj10;
                                i36Var4 = i36Var6;
                                obj9 = obj9;
                            }
                            break;
                        case 37232917:
                            str15 = str32;
                            if (str36.equals(str15)) {
                                str12 = str;
                                str13 = str31;
                                hashSet6 = hashSet10;
                                str16 = str34;
                                arrayList3 = arrayList4;
                                obj6 = obj11;
                                it2 = it3;
                                str17 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                i36Var3 = i36Var5;
                                obj8 = obj10;
                                i36Var4 = i36Var6;
                                obj9 = obj9;
                                b3 = 13;
                                str14 = str30;
                            } else {
                                str12 = str;
                                str13 = str31;
                                str14 = str30;
                                hashSet6 = hashSet10;
                                str16 = str34;
                                arrayList3 = arrayList4;
                                obj6 = obj11;
                                it2 = it3;
                                str17 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                i36Var3 = i36Var5;
                                obj8 = obj10;
                                i36Var4 = i36Var6;
                                obj9 = obj9;
                            }
                            break;
                        case 92909918:
                            if (str36.equals("alpha")) {
                                b5 = 14;
                                str12 = str;
                                str13 = str31;
                                str14 = str30;
                                hashSet6 = hashSet10;
                                str16 = str34;
                                arrayList3 = arrayList4;
                                obj6 = obj11;
                                it2 = it3;
                                str17 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                i36Var3 = i36Var5;
                                obj8 = obj10;
                                i36Var4 = i36Var6;
                                obj9 = obj9;
                                b3 = b5;
                                str15 = str32;
                            }
                            str12 = str;
                            str13 = str31;
                            str14 = str30;
                            str15 = str32;
                            hashSet6 = hashSet10;
                            str16 = str34;
                            arrayList3 = arrayList4;
                            obj6 = obj11;
                            it2 = it3;
                            str17 = str33;
                            hashSet7 = hashSet9;
                            obj7 = obj12;
                            i36Var3 = i36Var5;
                            obj8 = obj10;
                            i36Var4 = i36Var6;
                            obj9 = obj9;
                            break;
                        case 156108012:
                            if (str36.equals("waveOffset")) {
                                b5 = 15;
                                str12 = str;
                                str13 = str31;
                                str14 = str30;
                                hashSet6 = hashSet10;
                                str16 = str34;
                                arrayList3 = arrayList4;
                                obj6 = obj11;
                                it2 = it3;
                                str17 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                i36Var3 = i36Var5;
                                obj8 = obj10;
                                i36Var4 = i36Var6;
                                obj9 = obj9;
                                b3 = b5;
                                str15 = str32;
                            }
                            str12 = str;
                            str13 = str31;
                            str14 = str30;
                            str15 = str32;
                            hashSet6 = hashSet10;
                            str16 = str34;
                            arrayList3 = arrayList4;
                            obj6 = obj11;
                            it2 = it3;
                            str17 = str33;
                            hashSet7 = hashSet9;
                            obj7 = obj12;
                            i36Var3 = i36Var5;
                            obj8 = obj10;
                            i36Var4 = i36Var6;
                            obj9 = obj9;
                            break;
                        default:
                            str12 = str;
                            str13 = str31;
                            str14 = str30;
                            str15 = str32;
                            hashSet6 = hashSet10;
                            str16 = str34;
                            arrayList3 = arrayList4;
                            obj6 = obj11;
                            it2 = it3;
                            str17 = str33;
                            hashSet7 = hashSet9;
                            obj7 = obj12;
                            i36Var3 = i36Var5;
                            obj8 = obj10;
                            i36Var4 = i36Var6;
                            obj9 = obj9;
                            break;
                    }
                    switch (b3) {
                        case 0:
                            obj8 = obj8;
                            obj9 = obj9;
                            cvaVar2 = new cva(5);
                            break;
                        case 1:
                            obj8 = obj8;
                            obj9 = obj9;
                            cvaVar2 = new cva(6);
                            break;
                        case 2:
                            obj8 = obj8;
                            obj9 = obj9;
                            cvaVar2 = new cva(9);
                            break;
                        case 3:
                            obj8 = obj8;
                            obj9 = obj9;
                            cvaVar2 = new cva(10);
                            break;
                        case 4:
                            obj8 = obj8;
                            obj9 = obj9;
                            cvaVar2 = new cva(11);
                            break;
                        case 5:
                            obj8 = obj8;
                            obj9 = obj9;
                            fva fvaVar = new fva();
                            fvaVar.f39769f = false;
                            cvaVar2 = fvaVar;
                            break;
                        case 6:
                            obj8 = obj8;
                            obj9 = obj9;
                            cvaVar2 = new cva(7);
                            break;
                        case 7:
                            obj8 = obj8;
                            obj9 = obj9;
                            cvaVar2 = new cva(8);
                            break;
                        case 8:
                            obj8 = obj8;
                            obj9 = obj9;
                            cvaVar2 = new cva(0);
                            break;
                        case 9:
                            obj8 = obj8;
                            obj9 = obj9;
                            cvaVar2 = new cva(2);
                            break;
                        case 10:
                            obj8 = obj8;
                            obj9 = obj9;
                            cvaVar2 = new cva(3);
                            break;
                        case 11:
                            obj8 = obj8;
                            obj9 = obj9;
                            cvaVar2 = new cva(4);
                            break;
                        case 12:
                            obj8 = obj8;
                            obj9 = obj9;
                            cvaVar2 = new cva(1);
                            break;
                        case 13:
                            obj8 = obj8;
                            obj9 = obj9;
                            cvaVar2 = new eva();
                            break;
                        case 14:
                            cvaVar = new cva(0);
                            cvaVar2 = cvaVar;
                            break;
                        case 15:
                            cvaVar = new cva(0);
                            cvaVar2 = cvaVar;
                            break;
                        default:
                            obj8 = obj8;
                            obj9 = obj9;
                            cvaVar2 = null;
                            break;
                    }
                } else {
                    SparseArray sparseArray = new SparseArray();
                    String str39 = str36.split(",")[1];
                    for (qh4 qh4Var2 : arrayList5) {
                        HashSet hashSet11 = hashSet8;
                        HashMap map3 = qh4Var2.f57782d;
                        if (map3 != null && (cj1Var3 = (cj1) map3.get(str39)) != null) {
                            sparseArray.append(qh4Var2.f57779a, cj1Var3);
                        }
                        hashSet8 = hashSet11;
                    }
                    hashSet5 = hashSet8;
                    dva dvaVar = new dva();
                    String str40 = str36.split(",")[1];
                    dvaVar.f36276f = sparseArray;
                    obj8 = obj10;
                    str12 = str;
                    str13 = str31;
                    str14 = str30;
                    hashSet6 = hashSet10;
                    i36Var4 = i36Var6;
                    str16 = str34;
                    arrayList3 = arrayList4;
                    obj6 = obj11;
                    it2 = it3;
                    str17 = str33;
                    hashSet7 = hashSet9;
                    obj7 = obj12;
                    i36Var3 = i36Var5;
                    cvaVar2 = dvaVar;
                    str15 = str32;
                }
                if (cvaVar2 != null) {
                    cvaVar2.f41406e = str36;
                    this.f69165y.put(str36, cvaVar2);
                }
                str32 = str15;
                str30 = str14;
                str31 = str13;
                i36Var6 = i36Var4;
                i36Var5 = i36Var3;
                obj10 = obj8;
                hashSet8 = hashSet5;
                obj12 = obj7;
                hashSet9 = hashSet7;
                str33 = str17;
                it3 = it2;
                obj11 = obj6;
                arrayList4 = arrayList3;
                str34 = str16;
                hashSet10 = hashSet6;
                str = str12;
            }
            hashSet = hashSet8;
            obj = obj10;
            str2 = str33;
            str3 = str;
            str4 = str31;
            str5 = str30;
            str6 = str32;
            hashSet2 = hashSet9;
            hashSet3 = hashSet10;
            i36Var = i36Var6;
            obj2 = obj12;
            str7 = str34;
            arrayList2 = arrayList4;
            i36Var2 = i36Var5;
            obj3 = obj11;
            if (arrayList5 != null) {
                for (qh4 qh4Var3 : arrayList5) {
                    if (qh4Var3 instanceof th4) {
                        qh4Var3.mo3770a(this.f69165y);
                    }
                }
            }
            w26Var.m23689a(this.f69165y, 0);
            w26Var2.m23689a(this.f69165y, 100);
            Iterator it4 = this.f69165y.keySet().iterator();
            while (it4.hasNext()) {
                String str41 = (String) it4.next();
                int iIntValue = (!map2.containsKey(str41) || (num = (Integer) map2.get(str41)) == null) ? 0 : num.intValue();
                Iterator it5 = it4;
                gva gvaVar = (gva) this.f69165y.get(str41);
                if (gvaVar != null) {
                    gvaVar.mo10688d(iIntValue);
                }
                it4 = it5;
            }
        }
        if (hashSet.isEmpty()) {
            str8 = "CUSTOM,";
        } else {
            if (this.f69164x == null) {
                this.f69164x = new HashMap();
            }
            Iterator it6 = hashSet.iterator();
            while (it6.hasNext()) {
                String str42 = (String) it6.next();
                if (!this.f69164x.containsKey(str42)) {
                    if (str42.startsWith(str35)) {
                        SparseArray sparseArray2 = new SparseArray();
                        it = it6;
                        String str43 = str42.split(",")[1];
                        for (qh4 qh4Var4 : arrayList5) {
                            String str44 = str35;
                            HashMap map4 = map2;
                            HashMap map5 = qh4Var4.f57782d;
                            if (map5 != null && (cj1Var2 = (cj1) map5.get(str43)) != null) {
                                sparseArray2.append(qh4Var4.f57779a, cj1Var2);
                            }
                            map2 = map4;
                            str35 = str44;
                        }
                        map = map2;
                        str11 = str35;
                        ova ovaVar2 = new ova();
                        ovaVar2.f55043m = new SparseArray();
                        ovaVar2.f55041k = str42.split(",")[1];
                        ovaVar2.f55042l = sparseArray2;
                        ovaVar = ovaVar2;
                        obj4 = obj9;
                        obj5 = obj;
                    } else {
                        map = map2;
                        it = it6;
                        str11 = str35;
                        switch (str42.hashCode()) {
                            case -1249320806:
                                obj4 = obj9;
                                obj5 = obj;
                                b = str42.equals(obj4) ? (byte) 0 : (byte) -1;
                                break;
                            case -1249320805:
                                obj5 = obj;
                                if (str42.equals(obj5)) {
                                    obj4 = obj9;
                                    b = 1;
                                } else {
                                    obj4 = obj9;
                                }
                                break;
                            case -1225497657:
                                if (str42.equals(obj2)) {
                                    obj4 = obj9;
                                    obj5 = obj;
                                    b = 2;
                                } else {
                                    obj4 = obj9;
                                    obj5 = obj;
                                }
                                break;
                            case -1225497656:
                                if (str42.equals(str2)) {
                                    obj4 = obj9;
                                    obj5 = obj;
                                    b = 3;
                                } else {
                                    obj4 = obj9;
                                    obj5 = obj;
                                }
                                break;
                            case -1225497655:
                                if (str42.equals("translationZ")) {
                                    obj4 = obj9;
                                    obj5 = obj;
                                    b = 4;
                                } else {
                                    obj4 = obj9;
                                    obj5 = obj;
                                }
                                break;
                            case -1001078227:
                                if (str42.equals(obj3)) {
                                    obj4 = obj9;
                                    obj5 = obj;
                                    b = 5;
                                } else {
                                    obj4 = obj9;
                                    obj5 = obj;
                                }
                                break;
                            case -908189618:
                                if (str42.equals(str7)) {
                                    obj4 = obj9;
                                    obj5 = obj;
                                    b = 6;
                                } else {
                                    obj4 = obj9;
                                    obj5 = obj;
                                }
                                break;
                            case -908189617:
                                if (str42.equals(str3)) {
                                    obj4 = obj9;
                                    obj5 = obj;
                                    b = 7;
                                } else {
                                    obj4 = obj9;
                                    obj5 = obj;
                                }
                                break;
                            case -40300674:
                                if (str42.equals(str4)) {
                                    obj4 = obj9;
                                    obj5 = obj;
                                    b = 8;
                                } else {
                                    obj4 = obj9;
                                    obj5 = obj;
                                }
                                break;
                            case -4379043:
                                if (str42.equals(str5)) {
                                    obj4 = obj9;
                                    obj5 = obj;
                                    b = 9;
                                } else {
                                    obj4 = obj9;
                                    obj5 = obj;
                                }
                                break;
                            case 37232917:
                                if (str42.equals(str6)) {
                                    b2 = 10;
                                    b = b2;
                                    obj4 = obj9;
                                    obj5 = obj;
                                }
                                obj4 = obj9;
                                obj5 = obj;
                                break;
                            case 92909918:
                                if (str42.equals("alpha")) {
                                    b2 = 11;
                                    b = b2;
                                    obj4 = obj9;
                                    obj5 = obj;
                                }
                                obj4 = obj9;
                                obj5 = obj;
                                break;
                            default:
                                obj4 = obj9;
                                obj5 = obj;
                                break;
                        }
                        switch (b) {
                            case 0:
                                nvaVar = new nva(3);
                                str6 = str6;
                                obj2 = obj2;
                                nvaVar.f59892i = j;
                                rvaVar = nvaVar;
                                break;
                            case 1:
                                nvaVar = new nva(4);
                                str6 = str6;
                                obj2 = obj2;
                                nvaVar.f59892i = j;
                                rvaVar = nvaVar;
                                break;
                            case 2:
                                nvaVar = new nva(7);
                                str6 = str6;
                                obj2 = obj2;
                                nvaVar.f59892i = j;
                                rvaVar = nvaVar;
                                break;
                            case 3:
                                nvaVar = new nva(8);
                                str6 = str6;
                                obj2 = obj2;
                                nvaVar.f59892i = j;
                                rvaVar = nvaVar;
                                break;
                            case 4:
                                nvaVar = new nva(9);
                                str6 = str6;
                                obj2 = obj2;
                                nvaVar.f59892i = j;
                                rvaVar = nvaVar;
                                break;
                            case 5:
                                qva qvaVar = new qva();
                                qvaVar.f58257k = false;
                                nvaVar = qvaVar;
                                str6 = str6;
                                obj2 = obj2;
                                nvaVar.f59892i = j;
                                rvaVar = nvaVar;
                                break;
                            case 6:
                                nvaVar = new nva(5);
                                str6 = str6;
                                obj2 = obj2;
                                nvaVar.f59892i = j;
                                rvaVar = nvaVar;
                                break;
                            case 7:
                                nvaVar = new nva(6);
                                str6 = str6;
                                obj2 = obj2;
                                nvaVar.f59892i = j;
                                rvaVar = nvaVar;
                                break;
                            case 8:
                                nvaVar = new nva(2);
                                str6 = str6;
                                obj2 = obj2;
                                nvaVar.f59892i = j;
                                rvaVar = nvaVar;
                                break;
                            case 9:
                                nvaVar = new nva(1);
                                str6 = str6;
                                obj2 = obj2;
                                nvaVar.f59892i = j;
                                rvaVar = nvaVar;
                                break;
                            case 10:
                                nvaVar = new pva();
                                str6 = str6;
                                obj2 = obj2;
                                nvaVar.f59892i = j;
                                rvaVar = nvaVar;
                                break;
                            case 11:
                                nvaVar = new nva(0);
                                str6 = str6;
                                obj2 = obj2;
                                nvaVar.f59892i = j;
                                rvaVar = nvaVar;
                                break;
                            default:
                                ovaVar = null;
                                break;
                        }
                        if (rvaVar != null) {
                            rvaVar.f59889f = str42;
                            this.f69164x.put(str42, rvaVar);
                        }
                        obj9 = obj4;
                        obj = obj5;
                        obj2 = obj2;
                        it6 = it;
                        map2 = map;
                        str35 = str11;
                        str6 = str6;
                    }
                    rvaVar = ovaVar;
                    if (rvaVar != null) {
                        rvaVar.f59889f = str42;
                        this.f69164x.put(str42, rvaVar);
                    }
                    obj9 = obj4;
                    obj = obj5;
                    obj2 = obj2;
                    it6 = it;
                    map2 = map;
                    str35 = str11;
                    str6 = str6;
                }
            }
            HashMap map6 = map2;
            str8 = str35;
            if (arrayList5 != null) {
                for (qh4 qh4Var5 : arrayList5) {
                    if (qh4Var5 instanceof zi4) {
                        ((zi4) qh4Var5).m25668g(this.f69164x);
                    }
                }
            }
            for (String str45 : this.f69164x.keySet()) {
                HashMap map7 = map6;
                ((rva) this.f69164x.get(str45)).mo18525e(map7.containsKey(str45) ? ((Integer) map7.get(str45)).intValue() : 0);
                map6 = map7;
            }
        }
        int size = arrayList2.size();
        int i12 = size + 2;
        i36[] i36VarArr = new i36[i12];
        i36VarArr[0] = i36Var2;
        i36VarArr[size + 1] = i36Var;
        if (arrayList2.size() > 0 && this.f69145e == -1) {
            this.f69145e = 0;
        }
        Iterator it7 = arrayList2.iterator();
        int i13 = 1;
        while (it7.hasNext()) {
            i36VarArr[i13] = (i36) it7.next();
            i13++;
        }
        HashSet hashSet12 = new HashSet();
        for (String str46 : i36Var.f43409I.keySet()) {
            i36 i36Var8 = i36Var2;
            if (i36Var8.f43409I.containsKey(str46)) {
                str10 = str8;
                hashSet4 = hashSet2;
                if (!hashSet4.contains(str10 + str46)) {
                    hashSet12.add(str46);
                }
            } else {
                hashSet4 = hashSet2;
                str10 = str8;
            }
            i36Var2 = i36Var8;
            str8 = str10;
            hashSet2 = hashSet4;
        }
        String[] strArr = (String[]) hashSet12.toArray(new String[0]);
        this.f69158r = strArr;
        this.f69159s = new int[strArr.length];
        int i14 = 0;
        while (true) {
            String[] strArr2 = this.f69158r;
            if (i14 < strArr2.length) {
                String str47 = strArr2[i14];
                this.f69159s[i14] = 0;
                for (int i15 = 0; i15 < i12; i15++) {
                    if (i36VarArr[i15].f43409I.containsKey(str47) && (cj1Var = (cj1) i36VarArr[i15].f43409I.get(str47)) != null) {
                        int[] iArr = this.f69159s;
                        iArr[i14] = cj1Var.m4767d() + iArr[i14];
                        break;
                    }
                }
                i14++;
            } else {
                boolean z = i36VarArr[0].f43422j != -1;
                int length = 18 + strArr2.length;
                boolean[] zArr = new boolean[length];
                for (int i16 = 1; i16 < i12; i16++) {
                    i36 i36Var9 = i36VarArr[i16];
                    i36 i36Var10 = i36VarArr[i16 - 1];
                    boolean zM13637b = i36.m13637b(i36Var9.f43417e, i36Var10.f43417e);
                    boolean zM13637b2 = i36.m13637b(i36Var9.f43418f, i36Var10.f43418f);
                    zArr[0] = zArr[0] | i36.m13637b(i36Var9.f43416d, i36Var10.f43416d);
                    boolean z2 = zM13637b | zM13637b2 | z;
                    zArr[1] = zArr[1] | z2;
                    zArr[2] = z2 | zArr[2];
                    zArr[3] = zArr[3] | i36.m13637b(i36Var9.f43419g, i36Var10.f43419g);
                    zArr[4] = i36.m13637b(i36Var9.f43420h, i36Var10.f43420h) | zArr[4];
                }
                int i17 = 0;
                for (int i18 = 1; i18 < length; i18++) {
                    if (zArr[i18]) {
                        i17++;
                    }
                }
                this.f69155o = new int[i17];
                int iMax = Math.max(2, i17);
                this.f69156p = new double[iMax];
                this.f69157q = new double[iMax];
                int i19 = 0;
                for (int i20 = 1; i20 < length; i20++) {
                    if (zArr[i20]) {
                        this.f69155o[i19] = i20;
                        i19++;
                    }
                }
                int[] iArr2 = {i12, this.f69155o.length};
                Class cls = Double.TYPE;
                double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
                double[] dArr2 = new double[i12];
                int i21 = 0;
                while (i21 < i12) {
                    i36 i36Var11 = i36VarArr[i21];
                    double[] dArr3 = dArr[i21];
                    int[] iArr3 = this.f69155o;
                    i36[] i36VarArr2 = i36VarArr;
                    int i22 = 6;
                    float[] fArr = {i36Var11.f43416d, i36Var11.f43417e, i36Var11.f43418f, i36Var11.f43419g, i36Var11.f43420h, i36Var11.f43421i};
                    int i23 = 0;
                    int i24 = 0;
                    while (i23 < iArr3.length) {
                        int i25 = iArr3[i23];
                        if (i25 < i22) {
                            dArr3[i24] = fArr[i25];
                            i24++;
                        }
                        i23++;
                        i22 = 6;
                    }
                    dArr2[i21] = i36VarArr2[i21].f43415c;
                    i21++;
                    i36VarArr = i36VarArr2;
                }
                i36[] i36VarArr3 = i36VarArr;
                int i26 = 0;
                while (true) {
                    int[] iArr4 = this.f69155o;
                    if (i26 < iArr4.length) {
                        if (iArr4[i26] < 6) {
                            String strM17738m = AbstractC3393o1.m17738m(new StringBuilder(), i36.f43407M[this.f69155o[i26]], " [");
                            for (int i27 = 0; i27 < i12; i27++) {
                                StringBuilder sbM22997t = ux5.m22997t(strM17738m);
                                sbM22997t.append(dArr[i27][i26]);
                                strM17738m = sbM22997t.toString();
                            }
                        }
                        i26++;
                    } else {
                        this.f69150j = new z9d[this.f69158r.length + 1];
                        int i28 = 0;
                        while (true) {
                            String[] strArr3 = this.f69158r;
                            if (i28 >= strArr3.length) {
                                this.f69150j[0] = z9d.m25517a(this.f69145e, dArr2, dArr);
                                if (i36VarArr3[0].f43422j != -1) {
                                    int[] iArr5 = new int[i12];
                                    double[] dArr4 = new double[i12];
                                    double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) cls, i12, 2);
                                    for (int i29 = 0; i29 < i12; i29++) {
                                        i36 i36Var12 = i36VarArr3[i29];
                                        iArr5[i29] = i36Var12.f43422j;
                                        dArr4[i29] = i36Var12.f43415c;
                                        double[] dArr6 = dArr5[i29];
                                        dArr6[0] = i36Var12.f43417e;
                                        dArr6[1] = i36Var12.f43418f;
                                    }
                                    this.f69151k = new C2897cu(iArr5, dArr4, dArr5);
                                }
                                this.f69166z = new HashMap();
                                if (arrayList5 != null) {
                                    float fM24867c = Float.NaN;
                                    for (String str48 : hashSet3) {
                                        lua luaVarM16546b = lua.m16546b(str48);
                                        if (luaVarM16546b != null) {
                                            if (luaVarM16546b.f50163e == 1 && Float.isNaN(fM24867c)) {
                                                fM24867c = m24867c();
                                            }
                                            luaVarM16546b.f50160b = str48;
                                            this.f69166z.put(str48, luaVarM16546b);
                                        }
                                    }
                                    for (qh4 qh4Var6 : arrayList5) {
                                        if (qh4Var6 instanceof vh4) {
                                            ((vh4) qh4Var6).m23286g(this.f69166z);
                                        }
                                    }
                                    Iterator it8 = this.f69166z.values().iterator();
                                    while (it8.hasNext()) {
                                        ((lua) it8.next()).m16548e();
                                    }
                                    return;
                                }
                                return;
                            }
                            String str49 = strArr3[i28];
                            int i30 = 0;
                            int i31 = 0;
                            double[] dArr7 = null;
                            double[][] dArr8 = null;
                            while (i30 < i12) {
                                if (i36VarArr3[i30].f43409I.containsKey(str49)) {
                                    if (dArr8 == null) {
                                        dArr7 = new double[i12];
                                        cj1 cj1Var4 = (cj1) i36VarArr3[i30].f43409I.get(str49);
                                        dArr8 = (double[][]) Array.newInstance((Class<?>) cls, i12, cj1Var4 == null ? 0 : cj1Var4.m4767d());
                                    }
                                    i36 i36Var13 = i36VarArr3[i30];
                                    dArr7[i31] = i36Var13.f43415c;
                                    double[] dArr9 = dArr8[i31];
                                    cj1 cj1Var5 = (cj1) i36Var13.f43409I.get(str49);
                                    if (cj1Var5 != null) {
                                        if (cj1Var5.m4767d() == 1) {
                                            dArr9[0] = cj1Var5.m4765b();
                                        } else {
                                            int iM4767d = cj1Var5.m4767d();
                                            float[] fArr2 = new float[iM4767d];
                                            cj1Var5.m4766c(fArr2);
                                            int i32 = 0;
                                            int i33 = 0;
                                            while (i32 < iM4767d) {
                                                dArr9[i33] = fArr2[i32];
                                                i32++;
                                                str49 = str49;
                                                i33++;
                                                i28 = i28;
                                                i30 = i30;
                                            }
                                        }
                                    }
                                    i3 = i28;
                                    str9 = str49;
                                    i4 = i30;
                                    i31++;
                                } else {
                                    i3 = i28;
                                    str9 = str49;
                                    i4 = i30;
                                }
                                i30 = i4 + 1;
                                str49 = str9;
                                i28 = i3;
                            }
                            int i34 = i28;
                            double[] dArrCopyOf = Arrays.copyOf(dArr7, i31);
                            double[][] dArr10 = (double[][]) Arrays.copyOf(dArr8, i31);
                            int i35 = i34 + 1;
                            this.f69150j[i35] = z9d.m25517a(this.f69145e, dArrCopyOf, dArr10);
                            i28 = i35;
                        }
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" start: x: ");
        i36 i36Var = this.f69146f;
        sb.append(i36Var.f43417e);
        sb.append(" y: ");
        sb.append(i36Var.f43418f);
        sb.append(" end: x: ");
        i36 i36Var2 = this.f69147g;
        sb.append(i36Var2.f43417e);
        sb.append(" y: ");
        sb.append(i36Var2.f43418f);
        return sb.toString();
    }
}
