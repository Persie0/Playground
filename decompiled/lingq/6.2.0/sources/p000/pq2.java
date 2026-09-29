package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.inputmethod.EditorInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class pq2 {

    /* JADX INFO: renamed from: j */
    public static final Object f56646j = new Object();

    /* JADX INFO: renamed from: k */
    public static volatile pq2 f56647k;

    /* JADX INFO: renamed from: a */
    public final ReentrantReadWriteLock f56648a;

    /* JADX INFO: renamed from: b */
    public final C3437ov f56649b;

    /* JADX INFO: renamed from: c */
    public volatile int f56650c;

    /* JADX INFO: renamed from: d */
    public final Handler f56651d;

    /* JADX INFO: renamed from: e */
    public final C3370nf f56652e;

    /* JADX INFO: renamed from: f */
    public final oq2 f56653f;

    /* JADX INFO: renamed from: g */
    public final p58 f56654g;

    /* JADX INFO: renamed from: h */
    public final int f56655h;

    /* JADX INFO: renamed from: i */
    public final k62 f56656i;

    public pq2(jb3 jb3Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f56648a = reentrantReadWriteLock;
        this.f56650c = 3;
        oq2 oq2Var = (oq2) jb3Var.f49998b;
        this.f56653f = oq2Var;
        int i = jb3Var.f49997a;
        this.f56655h = i;
        this.f56656i = (k62) jb3Var.f49999c;
        this.f56651d = new Handler(Looper.getMainLooper());
        this.f56649b = new C3437ov(0);
        this.f56654g = new p58(10);
        C3370nf c3370nf = new C3370nf(this);
        this.f56652e = c3370nf;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f56650c = 0;
            } catch (Throwable th) {
                this.f56648a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (m19451c() == 0) {
            try {
                oq2Var.mo11839a(new kq2(c3370nf));
            } catch (Throwable th2) {
                m19453f(th2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static pq2 m19448a() {
        pq2 pq2Var;
        synchronized (f56646j) {
            try {
                pq2Var = f56647k;
                if (!(pq2Var != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return pq2Var;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m19449d() {
        return f56647k != null;
    }

    /* JADX INFO: renamed from: b */
    public final int m19450b(CharSequence charSequence, int i) {
        if (m19451c() == 1) {
            xwc.m24776n(charSequence, "charSequence cannot be null");
            return ((gv5) this.f56652e.f52662a).m12873B(charSequence, i);
        }
        C3386nv.m17633t("Not initialized yet");
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m19451c() {
        this.f56648a.readLock().lock();
        try {
            return this.f56650c;
        } finally {
            this.f56648a.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m19452e() {
        if (!(this.f56655h == 1)) {
            C3386nv.m17633t("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
            return;
        }
        if (m19451c() == 1) {
            return;
        }
        this.f56648a.writeLock().lock();
        try {
            if (this.f56650c == 0) {
                this.f56648a.writeLock().unlock();
                return;
            }
            this.f56650c = 0;
            this.f56648a.writeLock().unlock();
            C3370nf c3370nf = this.f56652e;
            pq2 pq2Var = (pq2) c3370nf.f52663b;
            try {
                pq2Var.f56653f.mo11839a(new kq2(c3370nf));
            } catch (Throwable th) {
                pq2Var.m19453f(th);
            }
        } catch (Throwable th2) {
            this.f56648a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m19453f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f56648a.writeLock().lock();
        try {
            this.f56650c = 2;
            arrayList.addAll(this.f56649b);
            this.f56649b.clear();
            this.f56648a.writeLock().unlock();
            this.f56651d.post(new nq2(arrayList, this.f56650c, th));
        } catch (Throwable th2) {
            this.f56648a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: g */
    public final CharSequence m19454g(int i, int i2, int i3, CharSequence charSequence) {
        if (!(m19451c() == 1)) {
            C3386nv.m17633t("Not initialized yet");
            return null;
        }
        if (i < 0) {
            C3386nv.m17626m("start cannot be negative");
            return null;
        }
        if (i2 < 0) {
            C3386nv.m17626m("end cannot be negative");
            return null;
        }
        xwc.m24774l("start should be <= than end", i <= i2);
        if (charSequence == null) {
            return null;
        }
        xwc.m24774l("start should be < than charSequence length", i <= charSequence.length());
        xwc.m24774l("end should be < than charSequence length", i2 <= charSequence.length());
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        return ((gv5) this.f56652e.f52662a).m12879I(charSequence, i, i2, i3 == 1);
    }

    /* JADX INFO: renamed from: h */
    public final void m19455h(mq2 mq2Var) {
        xwc.m24776n(mq2Var, "initCallback cannot be null");
        this.f56648a.writeLock().lock();
        try {
            if (this.f56650c == 1 || this.f56650c == 2) {
                this.f56651d.post(new nq2(Arrays.asList(mq2Var), this.f56650c, null));
            } else {
                this.f56649b.add(mq2Var);
            }
        } finally {
            this.f56648a.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m19456i(EditorInfo editorInfo) {
        if (m19451c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        C3370nf c3370nf = this.f56652e;
        c3370nf.getClass();
        Bundle bundle = editorInfo.extras;
        ly5 ly5Var = (ly5) ((C3329mb) c3370nf.f52664c).f50860b;
        int iM22869a = ly5Var.m22869a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iM22869a != 0 ? ((ByteBuffer) ly5Var.f64232d).getInt(iM22869a + ly5Var.f64229a) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
