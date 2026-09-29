package p000;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.session.C0027a;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.glance.appwidget.protobuf.AbstractC0667a;
import androidx.glance.appwidget.protobuf.AbstractC0673g;
import androidx.glance.appwidget.protobuf.ByteString;
import com.airbnb.lottie.network.FileExtension;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.firebase.crashlytics.internal.common.C1148a;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.analytics.data.LqAnalyticsValues$UpgradeTier;
import com.lingq.core.data.repository.C1302r;
import com.lingq.core.database.dao.C1322j;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.player.service.PlayerService;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.AbstractC3224d;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class vj6 implements gr6, wm9, xl0, fn9, ks2, jx2, hg2 {

    /* JADX INFO: renamed from: c */
    public static final sk3 f65504c = new sk3(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f65505a;

    /* JADX INFO: renamed from: b */
    public Object f65506b;

    public vj6() {
        rx5 rx5Var;
        this.f65505a = 1;
        ho7 ho7Var = ho7.f42713c;
        try {
            rx5Var = (rx5) Class.forName("androidx.glance.appwidget.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            rx5Var = f65504c;
        }
        rx5[] rx5VarArr = {sk3.f60949b, rx5Var};
        np5 np5Var = new np5();
        np5Var.f53096a = rx5VarArr;
        Charset charset = q94.f57449a;
        this.f65506b = np5Var;
    }

    /* JADX INFO: renamed from: t */
    public static String m23338t(String str, FileExtension fileExtension, boolean z) {
        String strTempExtension = z ? fileExtension.tempExtension() : fileExtension.extension;
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - strTempExtension.length();
        if (strReplaceAll.length() > length) {
            try {
                byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(strReplaceAll.getBytes());
                StringBuilder sb = new StringBuilder();
                for (byte b : bArrDigest) {
                    sb.append(String.format("%02x", Byte.valueOf(b)));
                }
                strReplaceAll = sb.toString();
            } catch (NoSuchAlgorithmException unused) {
                strReplaceAll = strReplaceAll.substring(0, length);
            }
        }
        return wq1.m24118n("lottie_cache_", strReplaceAll, strTempExtension);
    }

    /* JADX INFO: renamed from: A */
    public void m23339A(LqAnalyticsValues$UpgradeTier lqAnalyticsValues$UpgradeTier, String str) {
        lqAnalyticsValues$UpgradeTier.getClass();
        hm5 hm5Var = (hm5) this.f65506b;
        Bundle bundle = new Bundle();
        bundle.putString("Plan selected", lqAnalyticsValues$UpgradeTier.getValue());
        bundle.putString("Attempted prior action", str);
        ((C1240a) hm5Var).m7025f("Upgrade plan selected", bundle);
    }

    /* JADX INFO: renamed from: B */
    public void m23340B(int i, ByteString byteString) {
        ((AbstractC0673g) this.f65506b).mo2346k(i, byteString);
    }

    /* JADX INFO: renamed from: C */
    public void m23341C(int i, Object obj, ym8 ym8Var) {
        AbstractC0673g abstractC0673g = (AbstractC0673g) this.f65506b;
        abstractC0673g.mo2356u(i, 3);
        ym8Var.mo2418d((AbstractC0667a) obj, abstractC0673g.f6075a);
        abstractC0673g.mo2356u(i, 4);
    }

    /* JADX INFO: renamed from: D */
    public File m23342D(String str, InputStream inputStream, FileExtension fileExtension) throws IOException {
        File file = new File(m23349y(), m23338t(str, fileExtension, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        inputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            inputStream.close();
            throw th2;
        }
    }

    @Override // p000.jx2
    /* JADX INFO: renamed from: a */
    public int mo12897a() {
        return ((ExtendedFloatingActionButton) this.f65506b).getMeasuredHeight();
    }

    @Override // p000.wm9
    /* JADX INFO: renamed from: b */
    public int mo4446b(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // p000.wm9
    /* JADX INFO: renamed from: c */
    public long mo4447c(int i) {
        bna.m3969q(i == 0);
        return 0L;
    }

    @Override // p000.jx2
    /* JADX INFO: renamed from: d */
    public int mo12900d() {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.f65506b;
        return ((extendedFloatingActionButton.getMeasuredWidth() - extendedFloatingActionButton.getPaddingStart()) - extendedFloatingActionButton.getPaddingEnd()) + extendedFloatingActionButton.f12971x0 + extendedFloatingActionButton.f12972y0;
    }

    @Override // p000.hg2
    /* JADX INFO: renamed from: e */
    public boolean mo13226e(float f) {
        if (f == 0.0f) {
            return false;
        }
        mo13228n();
        ((NestedScrollView) this.f65506b).m2009k((int) f);
        return true;
    }

    @Override // p000.jx2
    /* JADX INFO: renamed from: f */
    public int mo12902f() {
        return ((ExtendedFloatingActionButton) this.f65506b).f12972y0;
    }

    @Override // p000.xl0
    /* JADX INFO: renamed from: g */
    public Type mo3354g() {
        return (Type) this.f65506b;
    }

    @Override // p000.xl0
    /* JADX INFO: renamed from: h */
    public Object mo3355h(br6 br6Var) {
        yb1 yb1Var = new yb1(br6Var);
        br6Var.mo4152r(new hi8(yb1Var, 8));
        return yb1Var;
    }

    @Override // p000.wm9
    /* JADX INFO: renamed from: i */
    public List mo4453i(long j) {
        return j >= 0 ? (List) this.f65506b : Collections.EMPTY_LIST;
    }

    @Override // p000.jx2
    /* JADX INFO: renamed from: j */
    public ViewGroup.LayoutParams mo12903j() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    @Override // p000.fn9
    /* JADX INFO: renamed from: k */
    public Task mo91k(Object obj) {
        i09 i09Var = (i09) obj;
        C1148a c1148a = ((op1) this.f65506b).f54671e;
        if (i09Var != null) {
            return Tasks.m5976d(Arrays.asList(C1148a.m6671a(c1148a), c1148a.f13662m.m11060w(null, c1148a.f13654e.f13668a)));
        }
        Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
        return Tasks.m5975c(null);
    }

    @Override // p000.wm9
    /* JADX INFO: renamed from: l */
    public int mo4454l() {
        return 1;
    }

    @Override // p000.hg2
    /* JADX INFO: renamed from: m */
    public float mo13227m() {
        return -((NestedScrollView) this.f65506b).getVerticalScrollFactorCompat();
    }

    @Override // p000.hg2
    /* JADX INFO: renamed from: n */
    public void mo13228n() {
        ((NestedScrollView) this.f65506b).f5545d.abortAnimation();
    }

    /* JADX INFO: renamed from: o */
    public boolean m23343o(int i, int i2) {
        RunnableC3626tw runnableC3626tw = (RunnableC3626tw) this.f65506b;
        Object obj = ((List) runnableC3626tw.f62973c).get(i);
        Object obj2 = ((List) runnableC3626tw.f62974d).get(i2);
        if (obj != null && obj2 != null) {
            return ((ve2) ((C3663uw) runnableC3626tw.f62975e).f64450b.f8007b).m23243b(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        uk9.m22780o();
        return false;
    }

    /* JADX INFO: renamed from: p */
    public boolean m23344p(int i, int i2) {
        RunnableC3626tw runnableC3626tw = (RunnableC3626tw) this.f65506b;
        Object obj = ((List) runnableC3626tw.f62973c).get(i);
        Object obj2 = ((List) runnableC3626tw.f62974d).get(i2);
        if (obj == null || obj2 == null) {
            return obj == null && obj2 == null;
        }
        return ((ve2) ((C3663uw) runnableC3626tw.f62975e).f64450b.f8007b).m23244c(obj, obj2);
    }

    @Override // p000.jx2
    /* JADX INFO: renamed from: q */
    public int mo12909q() {
        return ((ExtendedFloatingActionButton) this.f65506b).f12971x0;
    }

    @Override // p000.ks2
    /* JADX INFO: renamed from: r */
    public Object mo13283r(String str) throws GeneralSecurityException {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            Provider provider = Security.getProvider(strArr[i]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return ((ns2) this.f65506b).mo10838d(str, (Provider) it.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }

    @Override // p000.gr6
    /* JADX INFO: renamed from: s */
    public f6b mo1889s(View view, f6b f6bVar) {
        rg0 rg0Var = (rg0) this.f65506b;
        qg0 qg0Var = rg0Var.f59218I;
        if (qg0Var != null) {
            rg0Var.f59222g.f12709Z.remove(qg0Var);
        }
        qg0 qg0Var2 = new qg0(rg0Var.f59225j, f6bVar);
        rg0Var.f59218I = qg0Var2;
        qg0Var2.m19938e(rg0Var.getWindow());
        BottomSheetBehavior bottomSheetBehavior = rg0Var.f59222g;
        qg0 qg0Var3 = rg0Var.f59218I;
        ArrayList arrayList = bottomSheetBehavior.f12709Z;
        if (!arrayList.contains(qg0Var3)) {
            arrayList.add(qg0Var3);
        }
        return f6bVar;
    }

    public String toString() {
        switch (this.f65505a) {
            case 20:
                String string = ((JSONObject) this.f65506b).toString();
                string.getClass();
                return string;
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public File m23345u(String str) {
        File file = new File(m23349y(), m23338t(str, FileExtension.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(m23349y(), m23338t(str, FileExtension.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(m23349y(), m23338t(str, FileExtension.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public void m23346v(int i, int i2) {
        RunnableC3626tw runnableC3626tw = (RunnableC3626tw) this.f65506b;
        Object obj = ((List) runnableC3626tw.f62973c).get(i);
        Object obj2 = ((List) runnableC3626tw.f62974d).get(i2);
        if (obj == null || obj2 == null) {
            uk9.m22780o();
        } else {
            Object obj3 = ((C3663uw) runnableC3626tw.f62975e).f64450b.f8007b;
        }
    }

    /* JADX INFO: renamed from: w */
    public c83 m23347w(int i, String str) {
        str.getClass();
        C1302r c1302r = (C1302r) ((xd7) this.f65506b);
        c1302r.getClass();
        C1322j c1322j = c1302r.f16534c;
        c1322j.getClass();
        return AbstractC3224d.m15536o(AbstractC3224d.m15536o(AbstractC3584sr.m21590A(c1322j.f17045K, false, new String[]{"LessonsWithPlaylistJoin"}, new ld0(str, i, 22))));
    }

    /* JADX INFO: renamed from: x */
    public String m23348x(String str, w65 w65Var) {
        n58 n58Var = (n58) this.f65506b;
        if (w65Var instanceof LessonCard) {
            LessonCard lessonCard = (LessonCard) w65Var;
            return n58.m17233j(n58Var, str, lessonCard.f19178a, lessonCard.m8041i(), null, null, 24);
        }
        if (!(w65Var instanceof LessonWord)) {
            return w65Var.mo8037d();
        }
        LessonWord lessonWord = (LessonWord) w65Var;
        return n58.m17233j(n58Var, str, lessonWord.f19314a, null, null, lessonWord.m8074h(), 12);
    }

    /* JADX INFO: renamed from: y */
    public File m23349y() {
        File file = new File(((Context) ((C3440oy) this.f65506b).f55160b).getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: z */
    public void m23350z(String str, String str2) {
        hm5 hm5Var = (hm5) this.f65506b;
        Bundle bundle = new Bundle();
        bundle.putString("Attempted prior action", str);
        bundle.putString("upgrade page variant", str2);
        ((C1240a) hm5Var).m7025f("Upgrade page visited", bundle);
    }

    public /* synthetic */ vj6(Object obj, int i) {
        this.f65505a = i;
        this.f65506b = obj;
    }

    public vj6(xf2 xf2Var) {
        this.f65505a = 2;
        xf2Var.getClass();
        this.f65506b = xf2Var;
    }

    public vj6(lm4 lm4Var) {
        this.f65505a = 29;
        lm4Var.getClass();
        this.f65506b = lm4Var;
    }

    public vj6(or0 or0Var) {
        this.f65505a = 22;
        or0Var.getClass();
        this.f65506b = or0Var;
    }

    public vj6(xd7 xd7Var) {
        this.f65505a = 17;
        xd7Var.getClass();
        this.f65506b = xd7Var;
    }

    public vj6(cr8 cr8Var) {
        this.f65505a = 15;
        cr8Var.getClass();
        this.f65506b = cr8Var;
    }

    public vj6(w3a w3aVar) {
        this.f65505a = 18;
        w3aVar.getClass();
        this.f65506b = w3aVar;
    }

    public vj6(y15 y15Var) {
        this.f65505a = 28;
        y15Var.getClass();
        this.f65506b = y15Var;
    }

    public vj6(hm5 hm5Var) {
        this.f65505a = 26;
        hm5Var.getClass();
        this.f65506b = hm5Var;
    }

    public vj6(AbstractC0673g abstractC0673g) {
        this.f65505a = 8;
        Charset charset = q94.f57449a;
        this.f65506b = abstractC0673g;
        abstractC0673g.f6075a = this;
    }

    public vj6(lj2 lj2Var) {
        this.f65505a = 16;
        lj2Var.getClass();
        this.f65506b = lj2Var;
    }

    public /* synthetic */ vj6(int i) {
        this.f65505a = i;
    }

    public vj6(op1 op1Var, String str) {
        this.f65505a = 10;
        this.f65506b = op1Var;
    }

    public vj6(PlayerService playerService, gv5 gv5Var) {
        this.f65505a = 24;
        MediaSessionCompat$Token mediaSessionCompat$Token = ((fv5) gv5Var.f41392b).f39750b;
        if (mediaSessionCompat$Token != null) {
            Collections.synchronizedSet(new HashSet());
            this.f65506b = new C0027a(playerService, mediaSessionCompat$Token);
        } else {
            C3386nv.m17626m("sessionToken must not be null");
            throw null;
        }
    }
}
