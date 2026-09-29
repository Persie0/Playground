package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Parcel;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.R$styleable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.play_billing.AbstractC0985a;
import com.google.android.gms.internal.play_billing.C0994e0;
import com.google.android.gms.internal.play_billing.zzjd;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.common.primitives.AbstractC1110a;
import com.google.common.primitives.ImmutableIntArray;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ztb implements InterfaceC3396o4, fd9, InterfaceC3016fw {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f72160a;

    /* JADX INFO: renamed from: b */
    public int f72161b;

    /* JADX INFO: renamed from: c */
    public Object f72162c;

    public ztb(Context context, XmlResourceParser xmlResourceParser) {
        this.f72160a = 9;
        this.f72161b = -1;
        this.f72162c = new SparseArray();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.StateSet);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == R$styleable.StateSet_defaultState) {
                this.f72161b = typedArrayObtainStyledAttributes.getResourceId(index, this.f72161b);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        try {
            int eventType = xmlResourceParser.getEventType();
            sh9 sh9Var = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                sh9Var = new sh9(context, xmlResourceParser);
                                ((SparseArray) this.f72162c).put(sh9Var.f60868a, sh9Var);
                            }
                            break;
                        case 1301459538:
                            name.equals("LayoutDescription");
                            break;
                        case 1382829617:
                            name.equals("StateSet");
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                th9 th9Var = new th9(context, xmlResourceParser);
                                if (sh9Var != null) {
                                    sh9Var.f60869b.add(th9Var);
                                }
                            }
                            break;
                    }
                } else if (eventType == 3 && "StateSet".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e2);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m25780a(long j) {
        int i = this.f72161b;
        long[] jArr = (long[]) this.f72162c;
        if (i == jArr.length) {
            this.f72162c = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = (long[]) this.f72162c;
        int i2 = this.f72161b;
        this.f72161b = i2 + 1;
        jArr2[i2] = j;
    }

    @Override // p000.InterfaceC3396o4
    /* JADX INFO: renamed from: b */
    public boolean mo4797b(View view) {
        ((BottomSheetBehavior) this.f72162c).m6032M(this.f72161b);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m25781c(long[] jArr) {
        int length = this.f72161b + jArr.length;
        long[] jArr2 = (long[]) this.f72162c;
        if (length > jArr2.length) {
            this.f72162c = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, (long[]) this.f72162c, this.f72161b, jArr.length);
        this.f72161b = length;
    }

    @Override // p000.InterfaceC3016fw
    public /* synthetic */ ListenableFuture call() {
        return ((a34) this.f72162c).m63f(this.f72161b);
    }

    /* JADX INFO: renamed from: d */
    public long m25782d(int i) {
        if (i >= 0 && i < this.f72161b) {
            return ((long[]) this.f72162c)[i];
        }
        ij6.m13949f(this.f72161b, ux5.m22998u("Invalid index ", i, ", size is "));
        return 0L;
    }

    /* JADX INFO: renamed from: e */
    public boolean m25783e() {
        return ((qm2) this.f72162c) != null;
    }

    /* JADX INFO: renamed from: f */
    public long m25784f(h62 h62Var) {
        k47 k47Var = (k47) this.f72162c;
        int i = 0;
        h62Var.mo13076d(k47Var.f46700a, 0, 1, false);
        int i2 = k47Var.f46700a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        h62Var.mo13076d(k47Var.f46700a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (k47Var.f46700a[i] & 255) + (i5 << 8);
        }
        this.f72161b = i4 + 1 + this.f72161b;
        return i5;
    }

    /* JADX INFO: renamed from: g */
    public int m25785g() {
        return this.f72161b;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX INFO: renamed from: h */
    public int m25786h(int i) {
        SparseArray sparseArray = (SparseArray) this.f72162c;
        int i2 = 0;
        if (-1 == i) {
            sh9 sh9Var = i == -1 ? (sh9) sparseArray.valueAt(0) : (sh9) sparseArray.get(-1);
            if (sh9Var != null) {
                ArrayList arrayList = sh9Var.f60869b;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        i2 = -1;
                        break;
                    }
                    th9 th9Var = (th9) arrayList.get(i2);
                    float f = th9Var.f62298d;
                    float f2 = th9Var.f62297c;
                    float f3 = th9Var.f62296b;
                    float f4 = th9Var.f62295a;
                    if ((Float.isNaN(f4) || -1.0f >= f4) && ((Float.isNaN(f3) || -1.0f >= f3) && ((Float.isNaN(f2) || -1.0f <= f2) && (Float.isNaN(f) || -1.0f <= f)))) {
                        break;
                    }
                    i2++;
                }
                if (-1 != i2) {
                    return i2 == -1 ? sh9Var.f60870c : ((th9) arrayList.get(i2)).f62299e;
                }
            }
        } else {
            sh9 sh9Var2 = (sh9) sparseArray.get(i);
            if (sh9Var2 != null) {
                ArrayList arrayList2 = sh9Var2.f60869b;
                while (i2 < arrayList2.size()) {
                    th9 th9Var2 = (th9) arrayList2.get(i2);
                    float f5 = th9Var2.f62298d;
                    float f6 = th9Var2.f62297c;
                    float f7 = th9Var2.f62296b;
                    float f8 = th9Var2.f62295a;
                    if ((Float.isNaN(f8) || -1.0f >= f8) && ((Float.isNaN(f7) || -1.0f >= f7) && ((Float.isNaN(f6) || -1.0f <= f6) && (Float.isNaN(f5) || -1.0f <= f5)))) {
                        return i2 == -1 ? sh9Var2.f60870c : ((th9) arrayList2.get(i2)).f62299e;
                    }
                    i2++;
                }
                i2 = -1;
                if (i2 == -1) {
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: i */
    public String m25787i(C0994e0 c0994e0) {
        String str;
        hvb hvbVar = (hvb) this.f72162c;
        int i = this.f72161b;
        try {
            if (hvbVar.f43016E == null) {
                throw null;
            }
            unb unbVar = hvbVar.f43016E;
            String packageName = hvbVar.f43014C.getPackageName();
            if (i == 2) {
                str = "LAUNCH_BILLING_FLOW";
            } else if (i == 3) {
                str = "ACKNOWLEDGE_PURCHASE";
            } else if (i == 4) {
                str = "CONSUME_ASYNC";
            } else if (i != 5) {
                str = i != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION";
            } else {
                str = "IS_FEATURE_SUPPORTED";
            }
            vub vubVar = new vub(c0994e0);
            mnb mnbVar = (mnb) unbVar;
            Parcel parcelM16778O = mnbVar.m16778O();
            parcelM16778O.writeString(packageName);
            parcelM16778O.writeString(str);
            int i2 = fnb.f39353a;
            parcelM16778O.writeStrongBinder(vubVar);
            try {
                mnbVar.f51089g.transact(1, parcelM16778O, null, 1);
                return "billingOverrideService.getBillingOverride";
            } finally {
                parcelM16778O.recycle();
            }
        } catch (Exception e) {
            hvbVar.m13510H(zzjd.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION, 28, wwb.f67453r);
            AbstractC0985a.m5509j("BillingClientTesting", "An error occurred while retrieving billing override.", e);
            c0994e0.m5526a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    public String toString() {
        switch (this.f72160a) {
            case 10:
                ImmutableIntArray immutableIntArray = (ImmutableIntArray) this.f72162c;
                ArrayList arrayList = new ArrayList(immutableIntArray.f13496b);
                int i = 0;
                while (true) {
                    int i2 = immutableIntArray.f13496b;
                    if (i >= i2) {
                        StringBuilder sb = new StringBuilder("UnsupportedBrands{major=");
                        int i3 = this.f72161b;
                        String str = uma.f64080a;
                        sb.append(new String(AbstractC1110a.m6366f(i3), StandardCharsets.US_ASCII));
                        sb.append(", compatible=");
                        sb.append(arrayList);
                        sb.append("}");
                        return sb.toString();
                    }
                    bna.m3973s(i, i2);
                    int i4 = immutableIntArray.f13495a[i];
                    String str2 = uma.f64080a;
                    arrayList.add(new String(AbstractC1110a.m6366f(i4), StandardCharsets.US_ASCII));
                    i++;
                }
                break;
            default:
                return super.toString();
        }
    }

    public ztb(ConnectionResult connectionResult, int i) {
        this.f72160a = 12;
        lda.m16130p(connectionResult);
        this.f72162c = connectionResult;
        this.f72161b = i;
    }

    public ztb(int i, int i2) {
        this.f72160a = i2;
        switch (i2) {
            case 5:
                this.f72162c = new long[i];
                break;
            default:
                this.f72162c = new byte[i];
                this.f72161b = 0;
                break;
        }
    }

    public ztb(int i, byte b) {
        this.f72160a = i;
        switch (i) {
            case 4:
                this.f72161b = 1;
                this.f72162c = Collections.singletonList(null);
                break;
            case 7:
                this.f72161b = 255;
                this.f72162c = null;
                break;
            case 8:
                this.f72162c = new k47(8);
                break;
        }
    }

    public ztb(int[] iArr, int i) {
        ImmutableIntArray immutableIntArray;
        this.f72160a = 10;
        this.f72161b = i;
        if (iArr != null) {
            ImmutableIntArray immutableIntArray2 = ImmutableIntArray.f13494c;
            immutableIntArray = iArr.length == 0 ? ImmutableIntArray.f13494c : new ImmutableIntArray(Arrays.copyOf(iArr, iArr.length));
        } else {
            immutableIntArray = ImmutableIntArray.f13494c;
        }
        this.f72162c = immutableIntArray;
    }

    public /* synthetic */ ztb(Object obj, int i, int i2) {
        this.f72160a = i2;
        this.f72162c = obj;
        this.f72161b = i;
    }

    public ztb(int i, qg3[] qg3VarArr) {
        this.f72160a = 11;
        this.f72161b = i;
        this.f72162c = qg3VarArr;
    }

    public ztb(ArrayList arrayList) {
        this.f72160a = 4;
        this.f72161b = 0;
        this.f72162c = arrayList;
    }

    public ztb(boolean z, boolean z2, boolean z3) {
        this.f72160a = 6;
        this.f72161b = (z || z2 || z3) ? 1 : 0;
    }
}
