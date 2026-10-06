package p000;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.app.Activity;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.rectiface.jni.cxx.hsSUWRJfoeC;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import com.google.android.clockwork.common.wearable.wearmaterial.button.WearChipButton;
import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.android.libraries.vision.opengl.MUg.WIxTIdUIdfb;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jfs {

    /* JADX INFO: renamed from: a */
    public final Object f33914a;

    public jfs() {
    }

    public jfs(Activity activity) {
        this.f33914a = activity;
    }

    public jfs(DevicePolicyManager devicePolicyManager) {
        this.f33914a = devicePolicyManager;
    }

    public jfs(Context context) {
        this.f33914a = (AccessibilityManager) context.getSystemService("accessibility");
    }

    public jfs(Context context, byte[] bArr) {
        this.f33914a = context;
    }

    public jfs(Context context, char[] cArr) {
        this.f33914a = context;
    }

    public jfs(SharedPreferences sharedPreferences) {
        this.f33914a = sharedPreferences;
    }

    public jfs(AccessibilityManager accessibilityManager) {
        this.f33914a = accessibilityManager;
    }

    public jfs(Preference preference) {
        this.f33914a = preference;
    }

    public jfs(CameraActivityTiming cameraActivityTiming) {
        cameraActivityTiming.getClass();
        this.f33914a = cameraActivityTiming;
    }

    public jfs(dhv dhvVar) {
        this.f33914a = dhvVar;
    }

    public jfs(gyu gyuVar) {
        this.f33914a = gyuVar;
    }

    public jfs(hjg hjgVar) {
        this.f33914a = hjgVar;
    }

    public jfs(hlp hlpVar) {
        this.f33914a = hlpVar;
    }

    public jfs(hlw hlwVar) {
        hlwVar.getClass();
        this.f33914a = Collections.synchronizedSet(new HashSet());
    }

    public jfs(hrl hrlVar) {
        this.f33914a = hrlVar;
    }

    public jfs(hst hstVar) {
        this.f33914a = hstVar;
    }

    public jfs(ife ifeVar) {
        this.f33914a = ifeVar;
    }

    public jfs(ihk ihkVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f33914a = ihkVar;
    }

    private jfs(inx inxVar) {
        inxVar.getClass();
        this.f33914a = inxVar;
    }

    public jfs(Optional optional) {
        this.f33914a = optional;
    }

    public jfs(kcj kcjVar) {
        this.f33914a = kcjVar;
    }

    public jfs(mpk mpkVar) {
        this.f33914a = mpkVar;
    }

    public jfs(oju ojuVar) {
        ojuVar.getClass();
        this.f33914a = ojuVar;
    }

    public jfs(oju ojuVar, byte[] bArr) {
        ojuVar.getClass();
        this.f33914a = ojuVar;
    }

    public jfs(byte[] bArr) {
        this.f33914a = new double[9];
    }

    public jfs(byte[] bArr, byte[] bArr2) {
        this.f33914a = new HashMap();
    }

    public jfs(short[] sArr) {
        this.f33914a = new jwf(false);
    }

    /* JADX INFO: renamed from: E */
    public static mrm m13056E(Context context) {
        oes oesVar = new oes(context.getPackageManager());
        return mrm.m16828h(oesVar.m18439a(oesVar.m18440b(), hsSUWRJfoeC.Bexx));
    }

    /* JADX INFO: renamed from: F */
    public static mrm m13057F(Context context) {
        return mrm.m16828h(new oes(context.getPackageManager()).m18439a("com.google.vr.apps.ornament", "app_name"));
    }

    /* JADX INFO: renamed from: H */
    public static final boolean m13058H(oes oesVar) {
        String strM18439a = oesVar.m18439a("com.google.vr.apps.ornament", "ar_service_desc");
        if (strM18439a == null) {
            return false;
        }
        String[] strArrSplit = strM18439a.split("/");
        if (strArrSplit.length != 2) {
            Log.e(oes.f45809a, "Ornament's AR service descriptor not valid");
        } else {
            Intent intent = new Intent();
            intent.setClassName(strArrSplit[0], strArrSplit[1]);
            if (oesVar.f45810b.resolveService(intent, 0) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: I */
    public static final boolean m13059I(Context context) {
        return new oes(context.getPackageManager()).m18441c("com.google.vr.apps.ornament", "com.google.vr.apps.ornament.funshot.activity.FunshotActivity");
    }

    /* JADX INFO: renamed from: R */
    public static final DialogInterfaceC0155eg m13060R(C0154ef c0154ef) {
        DialogInterfaceC0155eg dialogInterfaceC0155egMo7256b = c0154ef.mo7256b();
        dialogInterfaceC0155egMo7256b.setCancelable(false);
        dialogInterfaceC0155egMo7256b.setCanceledOnTouchOutside(false);
        return dialogInterfaceC0155egMo7256b;
    }

    /* JADX INFO: renamed from: a */
    public static final int m13061a(MotionEvent motionEvent) {
        return (-motionEvent.getAxisValue(26)) > 0.0f ? 1 : -1;
    }

    /* JADX INFO: renamed from: af */
    private final int m13062af() {
        AbstractC0812ly abstractC0812ly;
        Object obj = this.f33914a;
        if (!(obj instanceof RecyclerView) || (abstractC0812ly = ((RecyclerView) obj).f1124n) == null) {
            return 1;
        }
        if (abstractC0812ly.mo1163W()) {
            return 3;
        }
        return abstractC0812ly.mo1162V() ? 2 : 1;
    }

    /* JADX INFO: renamed from: ag */
    private final C0154ef m13063ag(String str, String str2, DialogInterface.OnClickListener onClickListener) {
        mhs mhsVar = new mhs((Context) this.f33914a, C0100R.style.Theme_Camera_MaterialAlertDialog);
        mhsVar.m16392t(str);
        mhsVar.m16385m(str2);
        byte[] bArr = null;
        mhsVar.m16390r(((Context) this.f33914a).getResources().getString(C0100R.string.video_storage_full_error_free_up_space), new cdo(this, 14, bArr, bArr));
        mhsVar.m16387o(((Context) this.f33914a).getResources().getString(C0100R.string.dialog_dismiss), onClickListener);
        return mhsVar;
    }

    /* JADX INFO: renamed from: ah */
    private static String m13064ah(String str) {
        return "tooltip_impression_count_for_".concat(String.valueOf(str));
    }

    /* JADX INFO: renamed from: ai */
    private static String m13065ai(String str) {
        return "tooltip_impression_trigger_count_for_".concat(str);
    }

    /* JADX INFO: renamed from: o */
    public static jfs m13066o(View view) {
        return m13067p(new iny(view, 0));
    }

    /* JADX INFO: renamed from: p */
    public static jfs m13067p(inx inxVar) {
        return new jfs(inxVar);
    }

    /* JADX INFO: renamed from: q */
    public static void m13068q(jfs jfsVar, jfs jfsVar2, jfs jfsVar3) {
        double[] dArr = (double[]) jfsVar.f33914a;
        double d = dArr[0];
        double[] dArr2 = (double[]) jfsVar2.f33914a;
        double d2 = dArr2[0];
        double d3 = dArr[1];
        double d4 = dArr2[3];
        double d5 = dArr[2];
        double d6 = dArr2[6];
        double d7 = d5 * d6;
        double d8 = dArr2[1];
        double d9 = dArr2[4];
        double d10 = dArr2[7];
        double d11 = d5 * d10;
        double d12 = dArr2[2];
        double d13 = dArr2[5];
        double d14 = dArr2[8];
        double d15 = dArr[3];
        double d16 = dArr[4];
        double d17 = dArr[5];
        double d18 = d17 * d6;
        double d19 = d17 * d10;
        double d20 = dArr[6];
        double d21 = dArr[7];
        double d22 = dArr[8];
        double d23 = d6 * d22;
        double d24 = d8 * d20;
        double d25 = d9 * d21;
        double d26 = d20 * d12;
        double d27 = d21 * d13;
        double d28 = (d * d12) + (d3 * d13);
        double d29 = (d15 * d12) + (d16 * d13);
        jfsVar3.m13103i((d * d2) + (d3 * d4) + d7, (d * d8) + (d3 * d9) + d11, d28 + (d5 * d14), (d15 * d2) + (d16 * d4) + d18, (d15 * d8) + (d16 * d9) + d19, d29 + (d17 * d14), (d20 * d2) + (d4 * d21) + d23, d24 + d25 + (d10 * d22), d26 + d27 + (d22 * d14));
    }

    /* JADX INFO: renamed from: r */
    public static void m13069r(jfs jfsVar, ini iniVar, ini iniVar2) {
        double[] dArr = (double[]) jfsVar.f33914a;
        double d = dArr[0];
        double d2 = iniVar.f31594a;
        double d3 = dArr[1];
        double d4 = iniVar.f31595b;
        double d5 = dArr[2];
        double d6 = iniVar.f31596c;
        double d7 = dArr[3] * d2;
        double d8 = dArr[4] * d4;
        double d9 = dArr[5] * d6;
        double d10 = dArr[6] * d2;
        double d11 = dArr[7] * d4;
        double d12 = dArr[8] * d6;
        iniVar2.f31594a = (d * d2) + (d3 * d4) + (d5 * d6);
        iniVar2.f31595b = d7 + d8 + d9;
        iniVar2.f31596c = d10 + d11 + d12;
    }

    /* JADX INFO: renamed from: A */
    public final void m13070A() {
        ((Optional) this.f33914a).ifPresent(fax.f21162o);
    }

    /* JADX INFO: renamed from: B */
    public final void m13071B() {
        ((ife) this.f33914a).m11170b(true);
    }

    /* JADX INFO: renamed from: C */
    public final void m13072C() {
        ((ife) this.f33914a).m11170b(false);
    }

    /* JADX INFO: renamed from: D */
    public final void m13073D(String str, String str2) {
        ((ife) this.f33914a).f30616b.setText(str);
        ((ife) this.f33914a).f30616b.setContentDescription(str2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dhv, java.lang.Object] */
    /* JADX INFO: renamed from: G */
    public final boolean m13074G(Context context) {
        if (!this.f33914a.mo6184l(dig.f11502p)) {
            return false;
        }
        oes oesVar = new oes(context.getPackageManager());
        if (!oesVar.m18441c("com.google.vr.apps.ornament", "com.google.vr.apps.ornament.app.MainActivity")) {
            return false;
        }
        kpb kpbVarM14660a = kpb.m14660a();
        if (kpbVarM14660a.m14663c() || kpbVarM14660a.m14664d() || kpbVarM14660a.m14665e() || kpbVarM14660a.m14666f() || kpbVarM14660a.m14667g()) {
            return m13058H(oesVar);
        }
        return false;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m13075J() {
        return Settings.Secure.getInt(((Context) this.f33914a).getContentResolver(), "camera_double_twist_to_flip_enabled", 1) == 1;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m13076K() {
        if (!m13078M()) {
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList = ((AccessibilityManager) this.f33914a).getEnabledAccessibilityServiceList(-1);
            if (enabledAccessibilityServiceList == null) {
                return false;
            }
            Iterator<AccessibilityServiceInfo> it = enabledAccessibilityServiceList.iterator();
            while (it.hasNext()) {
                String id = it.next().getId();
                if (enabledAccessibilityServiceList.size() == 1 && id.endsWith("com.google.android.accessibility.accessibilitymenu.AccessibilityMenuService")) {
                    return false;
                }
                if (id == null || id.startsWith("com.google.android.apps.userpanel") || !id.startsWith("com.google")) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m13077L() {
        if (m13078M()) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = ((AccessibilityManager) this.f33914a).getEnabledAccessibilityServiceList(-1);
        if (enabledAccessibilityServiceList == null) {
            return false;
        }
        Iterator<AccessibilityServiceInfo> it = enabledAccessibilityServiceList.iterator();
        while (it.hasNext()) {
            String id = it.next().getId();
            if (id.endsWith("com.google.android.apps.accessibility.voiceaccess/.JustSpeakService") || id.endsWith("com.google.android.marvin.talkback/com.android.switchaccess.SwitchAccessService")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m13078M() {
        return ((AccessibilityManager) this.f33914a).isTouchExplorationEnabled();
    }

    /* JADX INFO: renamed from: N */
    public final C0154ef m13079N(String str, String str2, DialogInterface.OnClickListener onClickListener) {
        mhs mhsVar = new mhs((Context) this.f33914a, C0100R.style.Theme_Camera_MaterialAlertDialog);
        mhsVar.m16392t(str);
        mhsVar.m16385m(str2);
        mhsVar.m16390r(((Context) this.f33914a).getResources().getString(C0100R.string.dialog_ok), onClickListener);
        return mhsVar;
    }

    /* JADX INFO: renamed from: O */
    public final DialogInterfaceC0155eg m13080O(DialogInterface.OnClickListener onClickListener) {
        return m13060R(m13063ag(((Context) this.f33914a).getResources().getString(C0100R.string.device_out_of_storage_title), ((Context) this.f33914a).getResources().getString(C0100R.string.device_out_of_storage_body), onClickListener));
    }

    /* JADX INFO: renamed from: P */
    public final DialogInterfaceC0155eg m13081P(DialogInterface.OnClickListener onClickListener) {
        return m13060R(m13063ag(((Context) this.f33914a).getResources().getString(C0100R.string.device_out_of_storage_title), ((Context) this.f33914a).getResources().getString(C0100R.string.device_out_of_storage_body), onClickListener));
    }

    /* JADX INFO: renamed from: Q */
    public final DialogInterfaceC0155eg m13082Q(DialogInterface.OnClickListener onClickListener) {
        return m13060R(m13063ag(((Context) this.f33914a).getResources().getString(C0100R.string.video_storage_full_error_recording_dialog_title), ((Context) this.f33914a).getResources().getString(C0100R.string.device_out_of_storage_body), onClickListener));
    }

    /* JADX INFO: renamed from: S */
    public final String m13083S(long j) {
        return m13085U(j, new SimpleDateFormat("'IMG'_yyyyMMdd_HHmmss", Locale.US));
    }

    /* JADX INFO: renamed from: T */
    public final String m13084T(long j) {
        return m13085U(j, new SimpleDateFormat("'PANO'_yyyyMMdd_HHmmss", Locale.US));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.Set] */
    /* JADX INFO: renamed from: U */
    public final String m13085U(long j, DateFormat dateFormat) {
        String string;
        String str = dateFormat.format(new Date(j));
        synchronized (this.f33914a) {
            String str2 = str + "";
            if (!this.f33914a.contains(str2)) {
                this.f33914a.add(str2);
                return str2;
            }
            int i = 0;
            do {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("_");
                i++;
                sb.append(i);
                sb.append("");
                string = sb.toString();
            } while (this.f33914a.contains(string));
            this.f33914a.add(string);
            return string;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [hjg, java.lang.Object] */
    /* JADX INFO: renamed from: V */
    public final boolean m13086V() {
        return this.f33914a.mo10371k() == 2;
    }

    /* JADX INFO: renamed from: W */
    public final void m13087W(hhd hhdVar) {
        jvd.m13538a();
        ((ArrayList) this.f33914a).add(hhdVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX INFO: renamed from: X */
    public final synchronized int m13088X(String str) {
        return this.f33914a.getInt(m13064ah(str), 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX INFO: renamed from: Y */
    public final synchronized int m13089Y(String str) {
        return this.f33914a.getInt(m13065ai(str), 0);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX INFO: renamed from: Z */
    public final synchronized int m13090Z(String str) {
        int i;
        String strM13064ah = m13064ah(str);
        i = this.f33914a.getInt(strM13064ah, 0) + 1;
        this.f33914a.edit().putInt(strM13064ah, i).putLong("tooltip_latest_impression_timestamp_for_".concat(String.valueOf(str)), System.currentTimeMillis()).apply();
        return i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX INFO: renamed from: aa */
    public final synchronized void m13091aa(String str, int i) {
        this.f33914a.edit().putInt(m13064ah(str), i).apply();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX INFO: renamed from: ab */
    public final synchronized void m13092ab(String str, int i) {
        this.f33914a.edit().putInt(m13065ai(str), i).apply();
    }

    /* JADX INFO: renamed from: ac */
    public final synchronized boolean m13093ac(String str) {
        int iM13089Y;
        iM13089Y = m13089Y(str);
        m13092ab(str, (iM13089Y + 1) % 3);
        return iM13089Y % 3 == 0;
    }

    /* JADX INFO: renamed from: ad */
    public final void m13094ad(jfs jfsVar) {
        if (jfsVar != null) {
            Object obj = this.f33914a;
            ((hlp) obj).f28273b.remove(jfsVar.f33914a);
        }
    }

    /* JADX INFO: renamed from: ae */
    public final void m13095ae(jfs jfsVar, Bitmap bitmap, int i) {
        Object obj = this.f33914a;
        Object obj2 = jfsVar.f33914a;
        hlp hlpVar = (hlp) obj;
        hlpVar.f28273b.size();
        if (bitmap.getAllocationByteCount() > 20971520) {
            bitmap.getAllocationByteCount();
        } else {
            hlpVar.f28273b.put(obj2, new lqq(bitmap, i, kbc.m13903h(bitmap.getWidth(), bitmap.getHeight())));
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m13096b(int i, int i2, boolean z) {
        if (m13062af() == 3) {
            boolean z2 = !((View) this.f33914a).canScrollVertically(1);
            if (z) {
                return z2 && i2 > 0;
            }
            return z2;
        }
        if (m13062af() != 2) {
            return false;
        }
        boolean z3 = !((View) this.f33914a).canScrollHorizontally(1);
        if (z) {
            return z3 && i > 0;
        }
        return z3;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m13097c(int i, int i2, boolean z) {
        if (m13062af() == 3) {
            boolean z2 = !((View) this.f33914a).canScrollVertically(-1);
            if (z) {
                return z2 && i2 < 0;
            }
            return z2;
        }
        if (m13062af() == 2) {
            boolean z3 = !((View) this.f33914a).canScrollHorizontally(-1);
            if (!z) {
                return z3;
            }
            if (z3 && i < 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m13098d(aor aorVar) {
        View view = aorVar.f41155a;
        if (view instanceof WearChipButton) {
            WearChipButton wearChipButton = (WearChipButton) view;
            wearChipButton.m4595i(((Preference) this.f33914a).f1589q);
            wearChipButton.m4596j(((Preference) this.f33914a).mo1478m());
            Drawable drawableM1519s = ((Preference) this.f33914a).m1519s();
            wearChipButton.m4597k();
            if (drawableM1519s == null) {
                wearChipButton.f32475f.setVisibility(8);
            } else {
                wearChipButton.f32475f.setImageDrawable(drawableM1519s);
                wearChipButton.f32475f.setVisibility(0);
                wearChipButton.f32475f.setDuplicateParentStateEnabled(true);
            }
            wearChipButton.m4594h();
            Object obj = this.f33914a;
            if (obj instanceof TwoStatePreference) {
                wearChipButton.setChecked(((TwoStatePreference) obj).f1626a);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m13099e() {
        Object obj = this.f33914a;
        return obj != null && ((AccessibilityManager) obj).isEnabled() && ((AccessibilityManager) this.f33914a).isTouchExplorationEnabled();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [inx, java.lang.Object] */
    /* JADX INFO: renamed from: f */
    public final Object m13100f(int i) {
        View viewMo11550a = this.f33914a.mo11550a(i);
        viewMo11550a.getClass();
        return viewMo11550a;
    }

    /* JADX INFO: renamed from: g */
    public final double m13101g(int i, int i2) {
        return ((double[]) this.f33914a)[(i * 3) + i2];
    }

    /* JADX INFO: renamed from: h */
    public final void m13102h(int i, int i2, double d) {
        ((double[]) this.f33914a)[(i * 3) + i2] = d;
    }

    /* JADX INFO: renamed from: i */
    public final void m13103i(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        double[] dArr = (double[]) this.f33914a;
        dArr[0] = d;
        dArr[1] = d2;
        dArr[2] = d3;
        dArr[3] = d4;
        dArr[4] = d5;
        dArr[5] = d6;
        dArr[6] = d7;
        dArr[7] = d8;
        dArr[8] = d9;
    }

    /* JADX INFO: renamed from: j */
    public final void m13104j(int i, ini iniVar) {
        double[] dArr = (double[]) this.f33914a;
        dArr[i] = iniVar.f31594a;
        dArr[i + 3] = iniVar.f31595b;
        dArr[i + 6] = iniVar.f31596c;
    }

    /* JADX INFO: renamed from: k */
    public final void m13105k() {
        double[] dArr = (double[]) this.f33914a;
        dArr[7] = 0.0d;
        dArr[6] = 0.0d;
        dArr[5] = 0.0d;
        dArr[3] = 0.0d;
        dArr[2] = 0.0d;
        dArr[1] = 0.0d;
        dArr[8] = 1.0d;
        dArr[4] = 1.0d;
        dArr[0] = 1.0d;
    }

    /* JADX INFO: renamed from: l */
    public final void m13106l(double d) {
        double[] dArr = (double[]) this.f33914a;
        dArr[8] = d;
        dArr[4] = d;
        dArr[0] = d;
    }

    /* JADX INFO: renamed from: m */
    public final void m13107m() {
        double[] dArr = (double[]) this.f33914a;
        dArr[8] = 0.0d;
        dArr[7] = 0.0d;
        dArr[6] = 0.0d;
        dArr[5] = 0.0d;
        dArr[4] = 0.0d;
        dArr[3] = 0.0d;
        dArr[2] = 0.0d;
        dArr[1] = 0.0d;
        dArr[0] = 0.0d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [dhv, java.lang.Object] */
    /* JADX INFO: renamed from: n */
    public final void m13108n(ExifInterface exifInterface) {
        ?? r0 = this.f33914a;
        dhx dhxVar = dib.f11240a;
        r0.mo6177e();
        exifInterface.m4689p(ExifInterface.f7897f);
        if (this.f33914a.mo6184l(dib.f11292az)) {
            exifInterface.m4695y(exifInterface.m4684i(ExifInterface.f7899h, "QCAM-AA"));
            exifInterface.m4695y(exifInterface.m4684i(ExifInterface.f7898g, "QCAM-AA"));
            exifInterface.m4695y(exifInterface.m4684i(ExifInterface.f7824aK, "QCAM-AA"));
            exifInterface.m4695y(exifInterface.m4684i(ExifInterface.f7825aL, "QCAM-AA"));
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m13109s(jfs jfsVar) {
        Object obj = this.f33914a;
        double[] dArr = (double[]) jfsVar.f33914a;
        double[] dArr2 = (double[]) obj;
        dArr2[0] = dArr[0];
        dArr2[1] = dArr[1];
        dArr2[2] = dArr[2];
        dArr2[3] = dArr[3];
        dArr2[4] = dArr[4];
        dArr2[5] = dArr[5];
        dArr2[6] = dArr[6];
        dArr2[7] = dArr[7];
        dArr2[8] = dArr[8];
    }

    /* JADX INFO: renamed from: t */
    public final void m13110t(jfs jfsVar) {
        double[] dArr = (double[]) this.f33914a;
        double d = dArr[1];
        double d2 = dArr[2];
        double d3 = dArr[5];
        double[] dArr2 = (double[]) jfsVar.f33914a;
        dArr2[0] = dArr[0];
        dArr2[1] = dArr[3];
        dArr2[2] = dArr[6];
        dArr2[3] = d;
        dArr2[4] = dArr[4];
        dArr2[5] = dArr[7];
        dArr2[6] = d2;
        dArr2[7] = d3;
        dArr2[8] = dArr[8];
    }

    /* JADX INFO: renamed from: u */
    public final void m13111u(jfs jfsVar) {
        double dM13101g = ((m13101g(0, 0) * ((m13101g(1, 1) * m13101g(2, 2)) - (m13101g(2, 1) * m13101g(1, 2)))) - (m13101g(0, 1) * ((m13101g(1, 0) * m13101g(2, 2)) - (m13101g(1, 2) * m13101g(2, 0))))) + (m13101g(0, 2) * ((m13101g(1, 0) * m13101g(2, 1)) - (m13101g(1, 1) * m13101g(2, 0))));
        if (dM13101g == 0.0d) {
            return;
        }
        double d = 1.0d / dM13101g;
        double[] dArr = (double[]) this.f33914a;
        double d2 = dArr[4];
        double d3 = dArr[8];
        double d4 = dArr[7];
        double d5 = dArr[5];
        double d6 = dArr[1];
        double d7 = dArr[2];
        double d8 = dArr[3];
        double d9 = dArr[6];
        double d10 = dArr[0];
        jfsVar.m13103i(((d2 * d3) - (d4 * d5)) * d, (-((d6 * d3) - (d7 * d4))) * d, ((d6 * d5) - (d7 * d2)) * d, (-((d8 * d3) - (d5 * d9))) * d, ((d3 * d10) - (d7 * d9)) * d, (-((d5 * d10) - (d7 * d8))) * d, ((d8 * d4) - (d9 * d2)) * d, (-((d4 * d10) - (d9 * d6))) * d, ((d10 * d2) - (d8 * d6)) * d);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m13112v() {
        List<ComponentName> activeAdmins = ((DevicePolicyManager) this.f33914a).getActiveAdmins();
        if (activeAdmins == null) {
            return false;
        }
        Iterator<ComponentName> it = activeAdmins.iterator();
        while (it.hasNext()) {
            if (((DevicePolicyManager) this.f33914a).isProfileOwnerApp(it.next().getPackageName())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public final int m13113w() {
        return ((AtomicInteger) this.f33914a).get();
    }

    /* JADX INFO: renamed from: x */
    public final hcu m13114x() {
        return new hcu(this, 16, null, null);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: y */
    public final synchronized float m13115y(imv imvVar, float f) {
        float f2;
        float f3;
        boolean z = true;
        lku.m15669w(f >= 0.0f);
        this.f33914a.put(imvVar, Float.valueOf(f));
        f2 = 0.0f;
        f3 = 0.0f;
        for (Map.Entry entry : this.f33914a.entrySet()) {
            imv imvVar2 = (imv) entry.getKey();
            float fFloatValue = ((Float) entry.getValue()).floatValue();
            float f4 = imvVar2.f31555a;
            f3 += fFloatValue * f4;
            f2 += f4;
        }
        if (f2 <= 0.0f) {
            z = false;
        }
        lku.m15614I(z, WIxTIdUIdfb.PTl);
        return f3 / f2;
    }

    /* JADX INFO: renamed from: z */
    public final void m13116z() {
        ((Optional) this.f33914a).ifPresent(fax.f21163p);
    }

    public jfs(View view) {
        if (!(view instanceof RecyclerView)) {
            throw new UnsupportedOperationException("RotaryInputHapticsHelper only supports RecyclerView, ScrollView, HorizontalScrollView & NestedScrollView");
        }
        this.f33914a = view;
    }

    public jfs(char[] cArr) {
        this.f33914a = new AtomicInteger(0);
    }

    public jfs(char[] cArr, byte[] bArr) {
        this.f33914a = new ArrayList();
    }
}
