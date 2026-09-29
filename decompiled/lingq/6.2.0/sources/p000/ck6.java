package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Path;
import android.media.MediaCodec;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.media3.common.C0713b;
import androidx.media3.p004ui.R$string;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.network.FileExtension;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.firebase.crashlytics.internal.common.C1148a;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ck6 implements gr6, e90, fn9, l8a, qr5, fm1, InterfaceC3396o4, ut5 {

    /* JADX INFO: renamed from: c */
    public static final ck6 f10192c = new ck6(1, false);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10193a;

    /* JADX INFO: renamed from: b */
    public Object f10194b;

    public ck6(EditText editText) {
        this.f10193a = 10;
        C3156jq c3156jq = new C3156jq();
        c3156jq.f45990a = editText;
        hr2 hr2Var = new hr2(editText);
        c3156jq.f45991b = hr2Var;
        editText.addTextChangedListener(hr2Var);
        if (uq2.f64208b == null) {
            synchronized (uq2.f64207a) {
                try {
                    if (uq2.f64208b == null) {
                        uq2 uq2Var = new uq2();
                        try {
                            uq2.f64209c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, uq2.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        uq2.f64208b = uq2Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        editText.setEditableFactory(uq2.f64208b);
        this.f10194b = c3156jq;
    }

    /* JADX INFO: renamed from: g */
    public static ck6 m4787g(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", str);
            return new ck6(jSONObject);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m4788l(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw wq1.m24110f(it);
        }
    }

    /* JADX INFO: renamed from: o */
    public static ck6 m4789o(JSONObject jSONObject) {
        if (jSONObject != null) {
            return new ck6(jSONObject);
        }
        return null;
    }

    /* JADX INFO: renamed from: A */
    public void m4790A(C3451p8 c3451p8) {
        m4805m(c3451p8);
    }

    /* JADX INFO: renamed from: B */
    public void m4791B() {
        ((MaterialButtonToggleGroup) this.f10194b).invalidate();
    }

    /* JADX INFO: renamed from: C */
    public URLConnection m4792C() {
        return ((URL) this.f10194b).openConnection();
    }

    /* JADX INFO: renamed from: D */
    public ey5 m4793D(iy2 iy2Var, fg2 fg2Var, int i) {
        int i2;
        k47 k47Var = (k47) this.f10194b;
        int i3 = 0;
        ey5 ey5VarM25876n = null;
        while (true) {
            int i4 = 0;
            while (true) {
                int i5 = i4 % 10;
                int i6 = i5 + 10;
                if (i5 == 0 && i4 != 0) {
                    byte[] bArr = k47Var.f46700a;
                    System.arraycopy(bArr, 10, bArr, 0, 9);
                }
                int i7 = i4 == 0 ? 10 : 1;
                try {
                    iy2Var.mo13085o(k47Var.f46700a, i6 - i7, i7);
                    k47Var.m14818M(i5);
                    k47Var.m14817L(i6);
                    if (k47Var.m14820a() < 3) {
                        fg2.m11818g(k47Var.f46701b, k47Var.f46702c);
                        return null;
                    }
                    int iM14808C = k47Var.m14808C();
                    i2 = k47Var.f46701b - 3;
                    k47Var.f46701b = i2;
                    if (iM14808C == 4801587) {
                        break;
                    }
                    if (tuc.m22309a(k47Var.m14825i()) == -1) {
                        if (i4 == 0) {
                            k47Var.m14821c(20);
                        }
                        i4++;
                        if (i4 > i) {
                        }
                    }
                    iy2Var.mo13080i();
                    iy2Var.mo13078f(i3);
                    return ey5VarM25876n;
                } catch (EOFException unused) {
                }
            }
            k47Var.m14819N(6);
            int iM14841y = k47Var.m14841y();
            int i8 = iM14841y + 10;
            if (ey5VarM25876n == null) {
                byte[] bArr2 = new byte[i8];
                System.arraycopy(k47Var.f46700a, i2, bArr2, 0, 10);
                iy2Var.mo13085o(bArr2, 10, iM14841y);
                ey5VarM25876n = new zy3(fg2Var).m25876n(i8, bArr2);
            } else {
                iy2Var.mo13078f(iM14841y);
            }
            i3 += i8;
        }
    }

    /* JADX INFO: renamed from: E */
    public void m4794E(String str, String str2) {
        C3275kv c3275kv = MediaMetadataCompat.f949c;
        if (!c3275kv.containsKey(str) || ((Integer) c3275kv.get(str)).intValue() == 1) {
            ((Bundle) this.f10194b).putCharSequence(str, str2);
        } else {
            C3386nv.m17626m(wq1.m24118n("The ", str, " key cannot be used to put a String"));
        }
    }

    /* JADX INFO: renamed from: F */
    public void m4795F(boolean z) {
        hr2 hr2Var = (hr2) ((C3156jq) this.f10194b).f45991b;
        if (hr2Var.f42823c != z) {
            if (hr2Var.f42822b != null) {
                pq2 pq2VarM19448a = pq2.m19448a();
                gr2 gr2Var = hr2Var.f42822b;
                pq2VarM19448a.getClass();
                xwc.m24776n(gr2Var, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = pq2VarM19448a.f56648a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    pq2VarM19448a.f56649b.remove(gr2Var);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            hr2Var.f42823c = z;
            if (z) {
                hr2.m13436a(hr2Var.f42821a, pq2.m19448a().m19451c());
            }
        }
    }

    @Override // p000.e90
    /* JADX INFO: renamed from: a */
    public void mo4796a(ConnectionResult connectionResult) {
        boolean z = connectionResult.f11637b == 0;
        f90 f90Var = (f90) this.f10194b;
        if (z) {
            f90Var.m11610j(null, f90Var.mo4918k());
            return;
        }
        d90 d90Var = f90Var.f38655p;
        if (d90Var != null) {
            d90Var.onConnectionFailed(connectionResult);
        }
    }

    @Override // p000.InterfaceC3396o4
    /* JADX INFO: renamed from: b */
    public boolean mo4797b(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f10194b;
        if (!swipeDismissBehavior.mo6019w(view)) {
            return false;
        }
        boolean z = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.f12679d;
        int width = (!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth();
        WeakHashMap weakHashMap = dta.f36217a;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        return true;
    }

    @Override // p000.ut5
    /* JADX INFO: renamed from: c */
    public void mo4798c() {
    }

    @Override // p000.fm1
    public Object convert(Object obj) {
        return Optional.ofNullable(((fm1) this.f10194b).convert((m88) obj));
    }

    @Override // p000.ut5
    /* JADX INFO: renamed from: d */
    public void mo4799d(Bundle bundle) {
        ((MediaCodec) this.f10194b).setParameters(bundle);
    }

    @Override // p000.ut5
    /* JADX INFO: renamed from: e */
    public void mo4800e(int i, xr1 xr1Var, long j, int i2) {
        ((MediaCodec) this.f10194b).queueSecureInputBuffer(i, 0, xr1Var.f68568i, j, i2);
    }

    @Override // p000.ut5
    /* JADX INFO: renamed from: f */
    public void mo4801f(int i, int i2, int i3, long j) {
        ((MediaCodec) this.f10194b).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // p000.ut5
    public void flush() {
    }

    /* JADX INFO: renamed from: h */
    public void m4802h(Path path) {
        ArrayList arrayList = (ArrayList) this.f10194b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            eca ecaVar = (eca) arrayList.get(size);
            Matrix matrix = fna.f39347a;
            if (ecaVar != null && !ecaVar.f37014a) {
                fna.m11955a(path, ecaVar.f37017d.m14316m() / 100.0f, ecaVar.f37018e.m14316m() / 100.0f, ecaVar.f37019f.m14316m() / 360.0f);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    /* JADX INFO: renamed from: i */
    public String m4803i(C0713b c0713b) {
        String displayName;
        String str = c0713b.f6395d;
        String str2 = c0713b.f6393b;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            displayName = "";
        } else {
            Locale localeForLanguageTag = Locale.forLanguageTag(str);
            String str3 = uma.f64080a;
            Locale locale = Locale.getDefault(Locale.Category.DISPLAY);
            displayName = localeForLanguageTag.getDisplayName(locale);
            if (TextUtils.isEmpty(displayName)) {
                displayName = "";
            } else {
                try {
                    int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
                    displayName = displayName.substring(0, iOffsetByCodePoints).toUpperCase(locale) + displayName.substring(iOffsetByCodePoints);
                } catch (IndexOutOfBoundsException unused) {
                }
            }
        }
        String strM4809r = m4809r(displayName, m4804j(c0713b));
        if (!TextUtils.isEmpty(strM4809r)) {
            return strM4809r;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        return str2;
    }

    /* JADX INFO: renamed from: j */
    public String m4804j(C0713b c0713b) {
        Resources resources = (Resources) this.f10194b;
        int i = c0713b.f6397f;
        String string = (i & 2) != 0 ? resources.getString(R$string.exo_track_role_alternate) : "";
        if ((i & 4) != 0) {
            string = m4809r(string, resources.getString(R$string.exo_track_role_supplementary));
        }
        if ((i & 8) != 0) {
            string = m4809r(string, resources.getString(R$string.exo_track_role_commentary));
        }
        return (i & 1088) != 0 ? m4809r(string, resources.getString(R$string.exo_track_role_closed_captions)) : string;
    }

    @Override // p000.fn9
    /* JADX INFO: renamed from: k */
    public Task mo91k(Object obj) {
        i09 i09Var = (i09) obj;
        C3156jq c3156jq = (C3156jq) this.f10194b;
        if (i09Var == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.m5975c(null);
        }
        C1148a c1148a = (C1148a) c3156jq.f45991b;
        C1148a.m6671a(c1148a);
        c1148a.f13662m.m11060w(null, c1148a.f13654e.f13668a);
        c1148a.f13666q.m24140d(null);
        return Tasks.m5975c(null);
    }

    /* JADX INFO: renamed from: m */
    public void m4805m(C3451p8 c3451p8) {
        RecyclerView recyclerView = (RecyclerView) this.f10194b;
        int i = c3451p8.f55717a;
        if (i == 1) {
            recyclerView.f6613I.mo2620c0(c3451p8.f55718b, c3451p8.f55719c);
            return;
        }
        if (i == 2) {
            recyclerView.f6613I.mo2626f0(c3451p8.f55718b, c3451p8.f55719c);
        } else if (i == 4) {
            recyclerView.f6613I.mo2627g0(c3451p8.f55718b, c3451p8.f55719c);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.f6613I.mo2623e0(c3451p8.f55718b, c3451p8.f55719c);
        }
    }

    /* JADX INFO: renamed from: n */
    public o38 m4806n(int i) {
        RecyclerView recyclerView = (RecyclerView) this.f10194b;
        int iM22549j = recyclerView.f6653f.m22549j();
        o38 o38Var = null;
        for (int i2 = 0; i2 < iM22549j; i2++) {
            o38 o38VarM2699N = RecyclerView.m2699N(recyclerView.f6653f.m22548i(i2));
            if (o38VarM2699N != null && !o38VarM2699N.m17790j() && o38VarM2699N.f53783c == i) {
                if (!((ArrayList) recyclerView.f6653f.f63596e).contains(o38VarM2699N.f53781a)) {
                    o38Var = o38VarM2699N;
                    break;
                }
                o38Var = o38VarM2699N;
            }
        }
        if (o38Var != null) {
            if (!((ArrayList) recyclerView.f6653f.f63596e).contains(o38Var.f53781a)) {
                return o38Var;
            }
            if (RecyclerView.f6596Y0) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public zl5 m4807p(Context context, String str, InputStream inputStream, String str2, String str3) {
        zl5 zl5VarM16356i;
        FileExtension fileExtension;
        vj6 vj6Var = (vj6) this.f10194b;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            tj5.m22149a();
            FileExtension fileExtension2 = FileExtension.ZIP;
            zl5VarM16356i = str3 != null ? ll5.m16356i(context, new ZipInputStream(new FileInputStream(vj6Var.m23342D(str, inputStream, fileExtension2))), str) : ll5.m16356i(context, new ZipInputStream(inputStream), null);
            fileExtension = fileExtension2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            tj5.m22149a();
            fileExtension = FileExtension.GZIP;
            if (str3 != null) {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(new FileInputStream(vj6Var.m23342D(str, inputStream, fileExtension)));
                HashMap map = ll5.f49797a;
                zl5VarM16356i = ll5.m16352e(r46.m20369L(gZIPInputStream), str);
            } else {
                GZIPInputStream gZIPInputStream2 = new GZIPInputStream(inputStream);
                HashMap map2 = ll5.f49797a;
                zl5VarM16356i = ll5.m16352e(r46.m20369L(gZIPInputStream2), null);
            }
        } else {
            tj5.m22149a();
            fileExtension = FileExtension.JSON;
            if (str3 != null) {
                FileInputStream fileInputStream = new FileInputStream(vj6Var.m23342D(str, inputStream, fileExtension).getAbsolutePath());
                HashMap map3 = ll5.f49797a;
                zl5VarM16356i = ll5.m16352e(r46.m20369L(fileInputStream), str);
            } else {
                HashMap map4 = ll5.f49797a;
                zl5VarM16356i = ll5.m16352e(r46.m20369L(inputStream), null);
            }
        }
        if (str3 != null && zl5VarM16356i.f71701a != null) {
            File file = new File(vj6Var.m23349y(), vj6.m23338t(str, fileExtension, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean zRenameTo = file.renameTo(file2);
            file2.toString();
            tj5.m22149a();
            if (!zRenameTo) {
                tj5.m22151c("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
            }
        }
        return zl5VarM16356i;
    }

    /* JADX INFO: renamed from: q */
    public KeyListener m4808q(KeyListener keyListener) {
        ((C3156jq) this.f10194b).getClass();
        if (keyListener instanceof zq2) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new zq2(keyListener);
    }

    /* JADX INFO: renamed from: r */
    public String m4809r(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (!str.isEmpty()) {
                string = TextUtils.isEmpty(string) ? str : ((Resources) this.f10194b).getString(R$string.exo_item_list, string, str);
            }
        }
        return string;
    }

    @Override // p000.gr6
    /* JADX INFO: renamed from: s */
    public f6b mo1889s(View view, f6b f6bVar) {
        AppBarLayout appBarLayout = (AppBarLayout) this.f10194b;
        f6b f6bVar2 = appBarLayout.getFitsSystemWindows() ? f6bVar : null;
        if (!Objects.equals(appBarLayout.f12584g, f6bVar2)) {
            appBarLayout.f12584g = f6bVar2;
            appBarLayout.setWillNotDraw(!(appBarLayout.f12574S != null && appBarLayout.getTopInset() > 0));
            appBarLayout.requestLayout();
        }
        return f6bVar;
    }

    @Override // p000.ut5
    public void shutdown() {
    }

    @Override // p000.ut5
    public void start() {
    }

    /* JADX INFO: renamed from: t */
    public void m4810t(int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = (RecyclerView) this.f10194b;
        int iM22549j = recyclerView.f6653f.m22549j();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iM22549j; i6++) {
            View viewM22548i = recyclerView.f6653f.m22548i(i6);
            o38 o38VarM2699N = RecyclerView.m2699N(viewM22548i);
            if (o38VarM2699N != null && !o38VarM2699N.m17797q() && (i4 = o38VarM2699N.f53783c) >= i && i4 < i5) {
                o38VarM2699N.m17781a(2);
                o38VarM2699N.m17781a(1024);
                ((z28) viewM22548i.getLayoutParams()).f70801c = true;
            }
        }
        g38 g38Var = recyclerView.f6647c;
        ArrayList arrayList = g38Var.f40125c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            o38 o38Var = (o38) arrayList.get(size);
            if (o38Var != null && (i3 = o38Var.f53783c) >= i && i3 < i5) {
                o38Var.m17781a(2);
                g38Var.m12336h(size);
            }
        }
        recyclerView.f6610G0 = true;
    }

    public String toString() {
        switch (this.f10193a) {
            case 29:
                return ((URL) this.f10194b).toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m4811u(int i, int i2) {
        RecyclerView recyclerView = (RecyclerView) this.f10194b;
        int iM22549j = recyclerView.f6653f.m22549j();
        for (int i3 = 0; i3 < iM22549j; i3++) {
            o38 o38VarM2699N = RecyclerView.m2699N(recyclerView.f6653f.m22548i(i3));
            if (o38VarM2699N != null && !o38VarM2699N.m17797q() && o38VarM2699N.f53783c >= i) {
                if (RecyclerView.f6596Y0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i3 + " holder " + o38VarM2699N + " now at position " + (o38VarM2699N.f53783c + i2));
                }
                o38VarM2699N.m17794n(i2, false);
                recyclerView.f6606C0.f46632f = true;
            }
        }
        ArrayList arrayList = recyclerView.f6647c.f40125c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            o38 o38Var = (o38) arrayList.get(i4);
            if (o38Var != null && o38Var.f53783c >= i) {
                if (RecyclerView.f6596Y0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i4 + " holder " + o38Var + " now at position " + (o38Var.f53783c + i2));
                }
                o38Var.m17794n(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f6609F0 = true;
    }

    /* JADX INFO: renamed from: v */
    public void m4812v(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = (RecyclerView) this.f10194b;
        int iM22549j = recyclerView.f6653f.m22549j();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < iM22549j; i11++) {
            o38 o38VarM2699N = RecyclerView.m2699N(recyclerView.f6653f.m22548i(i11));
            if (o38VarM2699N != null && (i9 = o38VarM2699N.f53783c) >= i4 && i9 <= i3) {
                if (RecyclerView.f6596Y0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i11 + " holder " + o38VarM2699N);
                }
                if (o38VarM2699N.f53783c == i) {
                    o38VarM2699N.m17794n(i2 - i, false);
                } else {
                    o38VarM2699N.m17794n(i5, false);
                }
                recyclerView.f6606C0.f46632f = true;
            }
        }
        ArrayList arrayList = recyclerView.f6647c.f40125c;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            o38 o38Var = (o38) arrayList.get(i12);
            if (o38Var != null && (i8 = o38Var.f53783c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    o38Var.m17794n(i2 - i, false);
                } else {
                    o38Var.m17794n(i10, false);
                }
                if (RecyclerView.f6596Y0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i12 + " holder " + o38Var);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f6609F0 = true;
    }

    /* JADX INFO: renamed from: w */
    public void m4813w(int i, int i2) {
        RecyclerView recyclerView = (RecyclerView) this.f10194b;
        recyclerView.m2725T(i, i2, true);
        recyclerView.f6609F0 = true;
        recyclerView.f6606C0.f46629c += i2;
    }

    /* JADX INFO: renamed from: x */
    public void m4814x(int i, int i2) {
        RecyclerView recyclerView = (RecyclerView) this.f10194b;
        recyclerView.m2725T(i, i2, false);
        recyclerView.f6609F0 = true;
    }

    /* JADX INFO: renamed from: y */
    public wq2 m4815y(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        C3156jq c3156jq = (C3156jq) this.f10194b;
        c3156jq.getClass();
        if (!(inputConnection instanceof wq2)) {
            inputConnection = new wq2(editorInfo, inputConnection, (EditText) c3156jq.f45990a);
        }
        return (wq2) inputConnection;
    }

    /* JADX INFO: renamed from: z */
    public void m4816z(C3451p8 c3451p8) {
        m4805m(c3451p8);
    }

    public /* synthetic */ ck6(Object obj, int i) {
        this.f10193a = i;
        this.f10194b = obj;
    }

    public ck6(f90 f90Var) {
        this.f10193a = 4;
        Objects.requireNonNull(f90Var);
        this.f10194b = f90Var;
    }

    public ck6(w3a w3aVar) {
        this.f10193a = 13;
        w3aVar.getClass();
        this.f10194b = w3aVar;
    }

    public ck6(ao0 ao0Var) {
        this.f10193a = 21;
        ao0Var.getClass();
        this.f10194b = ao0Var;
    }

    public ck6(y15 y15Var, to2 to2Var) {
        this.f10193a = 26;
        y15Var.getClass();
        this.f10194b = y15Var;
    }

    public ck6(cr8 cr8Var) {
        this.f10193a = 15;
        cr8Var.getClass();
        this.f10194b = cr8Var;
    }

    public ck6(int i) {
        this.f10193a = i;
        switch (i) {
            case 16:
                this.f10194b = new k47(10);
                break;
            case 20:
                this.f10194b = new Bundle();
                break;
            default:
                this.f10194b = new ArrayList();
                break;
        }
    }

    public ck6(cma cmaVar) {
        this.f10193a = 22;
        cmaVar.getClass();
        this.f10194b = cmaVar;
    }

    public ck6(JSONObject jSONObject) {
        this.f10193a = 17;
        if (jSONObject != null) {
            this.f10194b = jSONObject;
        } else {
            this.f10194b = new JSONObject();
        }
    }

    public ck6(vj6 vj6Var, n58 n58Var) {
        this.f10193a = 0;
        this.f10194b = vj6Var;
    }

    public ck6(Resources resources) {
        this.f10193a = 9;
        resources.getClass();
        this.f10194b = resources;
    }

    public /* synthetic */ ck6(int i, boolean z) {
        this.f10193a = i;
    }

    public ck6(UUID uuid, int i, byte[] bArr, UUID[] uuidArr) {
        this.f10193a = 24;
        this.f10194b = uuid;
    }
}
