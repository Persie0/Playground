package p000;

import android.R;
import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$color;
import androidx.appcompat.R$drawable;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.common.collect.C1097m;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.crypto.tink.proto.KeyData$KeyMaterialType;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.firebase.heartbeatinfo.HeartBeatInfo$HeartBeat;
import com.google.firebase.installations.C1154a;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class co7 implements vc1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10358a;

    /* JADX INFO: renamed from: b */
    public Object f10359b;

    /* JADX INFO: renamed from: c */
    public Object f10360c;

    /* JADX INFO: renamed from: d */
    public Object f10361d;

    /* JADX INFO: renamed from: e */
    public Object f10362e;

    /* JADX INFO: renamed from: f */
    public Object f10363f;

    /* JADX INFO: renamed from: g */
    public Object f10364g;

    public co7(hc1 hc1Var, vc1 vc1Var) {
        this.f10358a = 6;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<lb2> set = hc1Var.f42155c;
        Set set2 = hc1Var.f42159g;
        for (lb2 lb2Var : set) {
            int i = lb2Var.f49392c;
            int i2 = lb2Var.f49391b;
            boolean z = i == 0;
            rp7 rp7Var = lb2Var.f49390a;
            if (z) {
                if (i2 == 2) {
                    hashSet4.add(rp7Var);
                } else {
                    hashSet.add(rp7Var);
                }
            } else if (i == 2) {
                hashSet3.add(rp7Var);
            } else if (i2 == 2) {
                hashSet5.add(rp7Var);
            } else {
                hashSet2.add(rp7Var);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(rp7.m20740a(ap7.class));
        }
        this.f10359b = Collections.unmodifiableSet(hashSet);
        this.f10360c = Collections.unmodifiableSet(hashSet2);
        this.f10361d = Collections.unmodifiableSet(hashSet3);
        this.f10362e = Collections.unmodifiableSet(hashSet4);
        this.f10363f = Collections.unmodifiableSet(hashSet5);
        this.f10364g = vc1Var;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m4919i(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static co7 m4920k(String str, ByteString byteString, KeyData$KeyMaterialType keyData$KeyMaterialType, OutputPrefixType outputPrefixType, Integer num) throws GeneralSecurityException {
        if (outputPrefixType == OutputPrefixType.RAW) {
            if (num != null) {
                v63.m23147y("Keys with output prefix type raw should not have an id requirement.");
                return null;
            }
        } else if (num == null) {
            v63.m23147y("Keys with output prefix type different from raw should have an id requirement.");
            return null;
        }
        return new co7(str, byteString, keyData$KeyMaterialType, outputPrefixType, num);
    }

    /* JADX INFO: renamed from: l */
    public static ColorStateList m4921l(Context context, int i) {
        int iM18844c = oz9.m18844c(context, R$attr.colorControlHighlight);
        int iM18843b = oz9.m18843b(context, R$attr.colorButtonNormal);
        int[] iArr = oz9.f55333b;
        int[] iArr2 = oz9.f55335d;
        int iM25014g = ya1.m25014g(iM18844c, i);
        return new ColorStateList(new int[][]{iArr, iArr2, oz9.f55334c, oz9.f55337f}, new int[]{iM18843b, iM25014g, ya1.m25014g(iM18844c, i), i});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static jv5 m4922n(da7 da7Var, ImmutableList immutableList, jv5 jv5Var, x0a x0aVar) {
        jw2 jw2Var = (jw2) da7Var;
        z0a z0aVarM14716l = jw2Var.m14716l();
        int iM14713i = jw2Var.m14713i();
        Object objMo17287l = z0aVarM14716l.m25398p() ? null : z0aVarM14716l.mo17287l(iM14713i);
        int iM24224b = (jw2Var.m14723t() || z0aVarM14716l.m25398p()) ? -1 : z0aVarM14716l.mo16393f(iM14713i, x0aVar, false).m24224b(uma.m22797B(jw2Var.m14714j()) - x0aVar.f67603e);
        for (int i = 0; i < immutableList.size(); i++) {
            jv5 jv5Var2 = (jv5) immutableList.get(i);
            if (m4924r(jv5Var2, objMo17287l, jw2Var.m14723t(), jw2Var.m14710f(), jw2Var.m14711g(), iM24224b)) {
                return jv5Var2;
            }
        }
        if (immutableList.isEmpty() && jv5Var != null && m4924r(jv5Var, objMo17287l, jw2Var.m14723t(), jw2Var.m14710f(), jw2Var.m14711g(), iM24224b)) {
            return jv5Var;
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static LayerDrawable m4923p(a88 a88Var, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableM176d = a88Var.m176d(context, R$drawable.abc_star_black_48dp);
        Drawable drawableM176d2 = a88Var.m176d(context, R$drawable.abc_star_half_black_48dp);
        if ((drawableM176d instanceof BitmapDrawable) && drawableM176d.getIntrinsicWidth() == dimensionPixelSize && drawableM176d.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableM176d;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableM176d.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM176d.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableM176d2 instanceof BitmapDrawable) && drawableM176d2.getIntrinsicWidth() == dimensionPixelSize && drawableM176d2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableM176d2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableM176d2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM176d2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.secondaryProgress);
        layerDrawable.setId(2, R.id.progress);
        return layerDrawable;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m4924r(jv5 jv5Var, Object obj, boolean z, int i, int i2, int i3) {
        Object obj2 = jv5Var.f46226a;
        int i4 = jv5Var.f46227b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z && i4 == i && jv5Var.f46228c == i2) {
            return true;
        }
        return !z && i4 == -1 && jv5Var.f46230e == i3;
    }

    /* JADX INFO: renamed from: u */
    public static void m4925u(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = C2893cq.f34364b;
        }
        drawableMutate.setColorFilter(C2893cq.m9844c(i, mode));
    }

    @Override // p000.vc1
    /* JADX INFO: renamed from: a */
    public Object mo4926a(Class cls) {
        if (!((Set) this.f10359b).contains(rp7.m20740a(cls))) {
            ij6.m13962t("Attempting to request an undeclared dependency ", cls, ".");
            return null;
        }
        Object objMo4926a = ((vc1) this.f10364g).mo4926a(cls);
        if (!cls.equals(ap7.class)) {
            return objMo4926a;
        }
        return new n88();
    }

    @Override // p000.vc1
    /* JADX INFO: renamed from: b */
    public Set mo4927b(rp7 rp7Var) {
        if (((Set) this.f10362e).contains(rp7Var)) {
            return ((vc1) this.f10364g).mo4927b(rp7Var);
        }
        ij6.m13962t("Attempting to request an undeclared dependency Set<", rp7Var, ">.");
        return null;
    }

    @Override // p000.vc1
    /* JADX INFO: renamed from: c */
    public uo7 mo4928c(Class cls) {
        return mo4931f(rp7.m20740a(cls));
    }

    @Override // p000.vc1
    /* JADX INFO: renamed from: d */
    public uo7 mo4929d(rp7 rp7Var) {
        if (((Set) this.f10363f).contains(rp7Var)) {
            return ((vc1) this.f10364g).mo4929d(rp7Var);
        }
        ij6.m13962t("Attempting to request an undeclared dependency Provider<Set<", rp7Var, ">>.");
        return null;
    }

    @Override // p000.vc1
    /* JADX INFO: renamed from: e */
    public qz6 mo4930e(rp7 rp7Var) {
        if (((Set) this.f10361d).contains(rp7Var)) {
            return ((vc1) this.f10364g).mo4930e(rp7Var);
        }
        ij6.m13962t("Attempting to request an undeclared dependency Deferred<", rp7Var, ">.");
        return null;
    }

    @Override // p000.vc1
    /* JADX INFO: renamed from: f */
    public uo7 mo4931f(rp7 rp7Var) {
        if (((Set) this.f10360c).contains(rp7Var)) {
            return ((vc1) this.f10364g).mo4931f(rp7Var);
        }
        ij6.m13962t("Attempting to request an undeclared dependency Provider<", rp7Var, ">.");
        return null;
    }

    @Override // p000.vc1
    /* JADX INFO: renamed from: g */
    public Object mo4932g(rp7 rp7Var) {
        if (((Set) this.f10359b).contains(rp7Var)) {
            return ((vc1) this.f10364g).mo4932g(rp7Var);
        }
        ij6.m13962t("Attempting to request an undeclared dependency ", rp7Var, ".");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public void m4933h(C1097m c1097m, jv5 jv5Var, z0a z0aVar) {
        if (jv5Var == null) {
            return;
        }
        if (z0aVar.mo17285b(jv5Var.f46226a) != -1) {
            c1097m.m6340b(jv5Var, z0aVar);
            return;
        }
        z0a z0aVar2 = (z0a) ((ImmutableMap) this.f10361d).get(jv5Var);
        if (z0aVar2 != null) {
            c1097m.m6340b(jv5Var, z0aVar2);
        }
    }

    /* JADX INFO: renamed from: j */
    public gl0 m4934j() {
        gl0 gl0Var = (gl0) this.f10364g;
        if (gl0Var != null) {
            return gl0Var;
        }
        gl0 gl0Var2 = gl0.f40924n;
        gl0 gl0VarM21612Y = AbstractC3584sr.m21612Y((qr3) this.f10361d);
        this.f10364g = gl0VarM21612Y;
        return gl0VarM21612Y;
    }

    /* JADX INFO: renamed from: m */
    public Task m4935m(Task task) {
        return task.mo5964f(new ExecutorC3014fu(1), new v63(this));
    }

    /* JADX INFO: renamed from: o */
    public qz6 m4936o(Class cls) {
        return mo4930e(rp7.m20740a(cls));
    }

    /* JADX INFO: renamed from: q */
    public ColorStateList m4937q(Context context, int i) {
        if (i == R$drawable.abc_edit_text_material) {
            return do7.m10540p(context, R$color.abc_tint_edittext);
        }
        if (i == R$drawable.abc_switch_track_mtrl_alpha) {
            return do7.m10540p(context, R$color.abc_tint_switch_track);
        }
        if (i != R$drawable.abc_switch_thumb_material) {
            if (i == R$drawable.abc_btn_default_mtrl_shape) {
                return m4921l(context, oz9.m18844c(context, R$attr.colorButtonNormal));
            }
            if (i == R$drawable.abc_btn_borderless_material) {
                return m4921l(context, 0);
            }
            if (i == R$drawable.abc_btn_colored_material) {
                return m4921l(context, oz9.m18844c(context, R$attr.colorAccent));
            }
            if (i == R$drawable.abc_spinner_mtrl_am_alpha || i == R$drawable.abc_spinner_textfield_background_material) {
                return do7.m10540p(context, R$color.abc_tint_spinner);
            }
            if (m4919i((int[]) this.f10360c, i)) {
                return oz9.m18845d(context, R$attr.colorControlNormal);
            }
            if (m4919i((int[]) this.f10363f, i)) {
                return do7.m10540p(context, R$color.abc_tint_default);
            }
            if (m4919i((int[]) this.f10364g, i)) {
                return do7.m10540p(context, R$color.abc_tint_btn_checkable);
            }
            if (i == R$drawable.abc_seekbar_thumb_material) {
                return do7.m10540p(context, R$color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListM18845d = oz9.m18845d(context, R$attr.colorSwitchThumbNormal);
        if (colorStateListM18845d == null || !colorStateListM18845d.isStateful()) {
            iArr[0] = oz9.f55333b;
            iArr2[0] = oz9.m18843b(context, R$attr.colorSwitchThumbNormal);
            iArr[1] = oz9.f55336e;
            iArr2[1] = oz9.m18844c(context, R$attr.colorControlActivated);
            iArr[2] = oz9.f55337f;
            iArr2[2] = oz9.m18844c(context, R$attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = oz9.f55333b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListM18845d.getColorForState(iArr3, 0);
            iArr[1] = oz9.f55336e;
            iArr2[1] = oz9.m18844c(context, R$attr.colorControlActivated);
            iArr[2] = oz9.f55337f;
            iArr2[2] = colorStateListM18845d.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* JADX INFO: renamed from: s */
    public w41 m4938s() {
        w41 w41Var = new w41();
        w41Var.f66365a = (ex3) this.f10360c;
        w41Var.f66366b = (String) this.f10359b;
        w41Var.f66368d = (z68) this.f10362e;
        w41Var.f66369e = (pk9) this.f10363f;
        w41Var.f66367c = ((qr3) this.f10361d).m20123g();
        return w41Var;
    }

    /* JADX INFO: renamed from: t */
    public void m4939t(String str, String str2, Bundle bundle) {
        int i;
        String str3;
        String strEncodeToString;
        boolean zM24136e;
        HeartBeatInfo$HeartBeat heartBeatInfo$HeartBeat;
        PackageInfo packageInfoM16248d;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        q43 q43Var = (q43) this.f10359b;
        q43Var.m19644a();
        bundle.putString("gmp_app_id", q43Var.f57254c.f261b);
        lj1 lj1Var = (lj1) this.f10360c;
        synchronized (lj1Var) {
            try {
                if (lj1Var.f49731a == 0 && (packageInfoM16248d = lj1Var.m16248d("com.google.android.gms")) != null) {
                    lj1Var.f49731a = packageInfoM16248d.versionCode;
                }
                i = lj1Var.f49731a;
            } catch (Throwable th) {
                throw th;
            }
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((lj1) this.f10360c).m16247b());
        lj1 lj1Var2 = (lj1) this.f10360c;
        synchronized (lj1Var2) {
            try {
                if (((String) lj1Var2.f49735e) == null) {
                    lj1Var2.m16251g();
                }
                str3 = (String) lj1Var2.f49735e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        bundle.putString("app_ver_name", str3);
        q43 q43Var2 = (q43) this.f10359b;
        q43Var2.m19644a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(q43Var2.f57253b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String str4 = ((t40) Tasks.await(((C1154a) ((x43) this.f10364g)).m6698d())).f61836a;
            if (TextUtils.isEmpty(str4)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (String) Tasks.await(((C1154a) ((x43) this.f10364g)).m6697c()));
        bundle.putString("cliv", "fcm-25.0.2");
        vr3 vr3Var = (vr3) ((uo7) this.f10363f).get();
        n92 n92Var = (n92) ((uo7) this.f10362e).get();
        if (vr3Var == null || n92Var == null) {
            return;
        }
        n62 n62Var = (n62) vr3Var;
        synchronized (n62Var) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                wr3 wr3Var = (wr3) n62Var.f52389a.get();
                synchronized (wr3Var) {
                    zM24136e = wr3Var.m24136e(wr3.f67200b, jCurrentTimeMillis);
                }
                if (zM24136e) {
                    synchronized (wr3Var) {
                        wr3Var.f67203a.m6686a(new ke2(6, wr3Var, wr3Var.m24133b(System.currentTimeMillis())));
                    }
                    heartBeatInfo$HeartBeat = HeartBeatInfo$HeartBeat.GLOBAL;
                } else {
                    heartBeatInfo$HeartBeat = HeartBeatInfo$HeartBeat.NONE;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (heartBeatInfo$HeartBeat != HeartBeatInfo$HeartBeat.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(heartBeatInfo$HeartBeat.getCode()));
            bundle.putString("Firebase-Client", n92Var.m17290a());
        }
    }

    public String toString() {
        switch (this.f10358a) {
            case 5:
                pk9 pk9Var = (pk9) this.f10363f;
                StringBuilder sb = new StringBuilder(32);
                sb.append("Request{method=");
                sb.append((String) this.f10359b);
                sb.append(", url=");
                sb.append((ex3) this.f10360c);
                qr3 qr3Var = (qr3) this.f10361d;
                if (qr3Var.size() != 0) {
                    sb.append(", headers=[");
                    int i = 0;
                    for (Object obj : qr3Var) {
                        int i2 = i + 1;
                        if (i < 0) {
                            vz1.m23628e0();
                            throw null;
                        }
                        Pair pair = (Pair) obj;
                        String str = (String) pair.f47623a;
                        String str2 = (String) pair.f47624b;
                        if (i > 0) {
                            sb.append(", ");
                        }
                        sb.append(str);
                        sb.append(':');
                        if (icb.m13776l(str)) {
                            str2 = "██";
                        }
                        sb.append(str2);
                        i = i2;
                    }
                    sb.append(']');
                }
                if (!fa4.m11650l(pk9Var, tr2.f62750A)) {
                    sb.append(", tags=");
                    sb.append(pk9Var);
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: v */
    public Task m4940v(String str, String str2, Bundle bundle) {
        try {
            m4939t(str, str2, bundle);
            wj8 wj8Var = (wj8) this.f10361d;
            qg2 qg2Var = qg2.f57747c;
            sq6 sq6Var = wj8Var.f66939c;
            if (sq6Var.m21586w() >= 12000000) {
                return gld.m12739h(wj8Var.f66938b).m12745j(1, bundle).mo5964f(qg2Var, bw8.f9102d);
            }
            if (sq6Var.m21587x() == 0) {
                return Tasks.m5974b(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            return wj8Var.m24020a(bundle).mo5965g(qg2Var, new cdb(wj8Var, bundle, false, 26));
        } catch (InterruptedException | ExecutionException e) {
            return Tasks.m5974b(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    public void m4941w(z0a z0aVar) {
        ImmutableList immutableList;
        C1097m c1097mM6295a = ImmutableMap.m6295a();
        if (((ImmutableList) this.f10360c).isEmpty()) {
            m4933h(c1097mM6295a, (jv5) this.f10363f, z0aVar);
            if (!Objects.equals((jv5) this.f10364g, (jv5) this.f10363f)) {
                m4933h(c1097mM6295a, (jv5) this.f10364g, z0aVar);
            }
            if (!Objects.equals((jv5) this.f10362e, (jv5) this.f10363f) && !Objects.equals((jv5) this.f10362e, (jv5) this.f10364g)) {
                m4933h(c1097mM6295a, (jv5) this.f10362e, z0aVar);
            }
        } else {
            int i = 0;
            while (true) {
                int size = ((ImmutableList) this.f10360c).size();
                immutableList = (ImmutableList) this.f10360c;
                if (i >= size) {
                    break;
                }
                m4933h(c1097mM6295a, (jv5) immutableList.get(i), z0aVar);
                i++;
            }
            if (!immutableList.contains((jv5) this.f10362e)) {
                m4933h(c1097mM6295a, (jv5) this.f10362e, z0aVar);
            }
        }
        this.f10361d = c1097mM6295a.m6339a(true);
    }

    /* JADX INFO: renamed from: x */
    public void m4942x(String str) {
        bca.m3614j(rgd.f59246a.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        bca.m3614j(!rgd.f59248c.contains(str), "Module name is reserved and cannot be used: %s", str);
        this.f10361d = str;
    }

    /* JADX INFO: renamed from: y */
    public void m4943y(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Pattern pattern = rgd.f59246a;
        this.f10363f = str;
    }

    /* JADX INFO: renamed from: z */
    public Uri m4944z() {
        String strM17739n;
        String str = (String) this.f10360c;
        String str2 = (String) this.f10361d;
        Account account = fgd.f39096a;
        Account account2 = (Account) this.f10362e;
        bca.m3614j(account2.type.indexOf(58) == -1, "Account type contains ':'.", new Object[0]);
        bca.m3614j(account2.type.indexOf(47) == -1, "Account type contains '/'.", new Object[0]);
        bca.m3614j(account2.name.indexOf(47) == -1, "Account name contains '/'.", new Object[0]);
        if (fgd.f39096a.equals(account2)) {
            strM17739n = "shared";
        } else {
            String str3 = account2.type;
            String str4 = account2.name;
            strM17739n = AbstractC3393o1.m17739n(new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length()), str3, ":", str4);
        }
        String str5 = (String) this.f10363f;
        StringBuilder sb = new StringBuilder(strM17739n.length() + str2.length() + str.length() + 2 + 1 + 1 + String.valueOf(str5).length());
        AbstractC3393o1.m17725C(sb, "/", str, "/", str2);
        String strM24125u = wq1.m24125u(sb, "/", strM17739n, "/", str5);
        ImmutableList immutableListM4280g = ((c14) this.f10364g).m4280g();
        Pattern pattern = aid.f721a;
        return new Uri.Builder().scheme("android").authority((String) this.f10359b).path(strM24125u).encodedFragment(immutableListM4280g.isEmpty() ? null : "transform=".concat(new si4("+", 1).m21395b(immutableListM4280g))).build();
    }

    public co7(Set set, String str, String str2) {
        this.f10358a = 2;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f10360c = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.f10359b = str;
        this.f10362e = str2;
        this.f10363f = c79.f9663a;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.f10361d = Collections.unmodifiableSet(hashSet);
            return;
        }
        throw wq1.m24110f(it);
    }

    public co7(w41 w41Var) {
        this.f10358a = 5;
        w41Var.getClass();
        ex3 ex3Var = (ex3) w41Var.f66365a;
        if (ex3Var != null) {
            this.f10360c = ex3Var;
            this.f10359b = (String) w41Var.f66366b;
            this.f10361d = ((or3) w41Var.f66367c).m18309w();
            this.f10362e = (z68) w41Var.f66368d;
            this.f10363f = (pk9) w41Var.f66369e;
            return;
        }
        C3386nv.m17633t("url == null");
        throw null;
    }

    public /* synthetic */ co7(Context context) {
        this.f10358a = 8;
        this.f10360c = "files";
        this.f10361d = "common";
        this.f10362e = rgd.f59247b;
        this.f10363f = "";
        this.f10364g = ImmutableList.m6284m();
        bca.m3614j(context != null, "Context cannot be null", new Object[0]);
        this.f10359b = context.getPackageName();
    }

    public co7(String str, ByteString byteString, KeyData$KeyMaterialType keyData$KeyMaterialType, OutputPrefixType outputPrefixType, Integer num) {
        this.f10358a = 0;
        this.f10359b = str;
        this.f10360c = tma.m22237b(str);
        this.f10361d = byteString;
        this.f10362e = keyData$KeyMaterialType;
        this.f10363f = outputPrefixType;
        this.f10364g = num;
    }

    public co7(int i) {
        this.f10358a = i;
        switch (i) {
            case 7:
                break;
            default:
                this.f10359b = new int[]{R$drawable.abc_textfield_search_default_mtrl_alpha, R$drawable.abc_textfield_default_mtrl_alpha, R$drawable.abc_ab_share_pack_mtrl_alpha};
                this.f10360c = new int[]{R$drawable.abc_ic_commit_search_api_mtrl_alpha, R$drawable.abc_seekbar_tick_mark_material, R$drawable.abc_ic_menu_share_mtrl_alpha, R$drawable.abc_ic_menu_copy_mtrl_am_alpha, R$drawable.abc_ic_menu_cut_mtrl_alpha, R$drawable.abc_ic_menu_selectall_mtrl_alpha, R$drawable.abc_ic_menu_paste_mtrl_am_alpha};
                this.f10361d = new int[]{R$drawable.abc_textfield_activated_mtrl_alpha, R$drawable.abc_textfield_search_activated_mtrl_alpha, R$drawable.abc_cab_background_top_mtrl_alpha, R$drawable.abc_text_cursor_material, R$drawable.abc_text_select_handle_left_mtrl, R$drawable.abc_text_select_handle_middle_mtrl, R$drawable.abc_text_select_handle_right_mtrl};
                this.f10362e = new int[]{R$drawable.abc_popup_background_mtrl_mult, R$drawable.abc_cab_background_internal_bg, R$drawable.abc_menu_hardkey_panel_mtrl_mult};
                this.f10363f = new int[]{R$drawable.abc_tab_indicator_material, R$drawable.abc_textfield_search_material};
                this.f10364g = new int[]{R$drawable.abc_btn_check_material, R$drawable.abc_btn_radio_material, R$drawable.abc_btn_check_material_anim, R$drawable.abc_btn_radio_material_anim};
                break;
        }
    }

    public co7(q43 q43Var, lj1 lj1Var, uo7 uo7Var, uo7 uo7Var2, x43 x43Var) {
        this.f10358a = 4;
        q43Var.m19644a();
        wj8 wj8Var = new wj8(q43Var.f57252a);
        this.f10359b = q43Var;
        this.f10360c = lj1Var;
        this.f10361d = wj8Var;
        this.f10362e = uo7Var;
        this.f10363f = uo7Var2;
        this.f10364g = x43Var;
    }

    public co7(x0a x0aVar) {
        this.f10358a = 3;
        this.f10359b = x0aVar;
        this.f10360c = ImmutableList.m6289v();
        this.f10361d = ImmutableMap.m6298f();
    }
}
