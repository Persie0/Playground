package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import dm.C5212l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p255m3.C7476b;
import p326q.C8448d;

/* JADX INFO: renamed from: androidx.emoji2.text.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0892f {

    /* JADX INFO: renamed from: j */
    public static final Object f5983j = new Object();

    /* JADX INFO: renamed from: k */
    public static volatile C0892f f5984k;

    /* JADX INFO: renamed from: a */
    public final ReentrantReadWriteLock f5985a;

    /* JADX INFO: renamed from: b */
    public final C8448d f5986b;

    /* JADX INFO: renamed from: c */
    public volatile int f5987c;

    /* JADX INFO: renamed from: d */
    public final Handler f5988d;

    /* JADX INFO: renamed from: e */
    public final a f5989e;

    /* JADX INFO: renamed from: f */
    public final h f5990f;

    /* JADX INFO: renamed from: g */
    public final d f5991g;

    /* JADX INFO: renamed from: h */
    public final int f5992h;

    /* JADX INFO: renamed from: i */
    public final C0890d f5993i;

    /* JADX INFO: renamed from: androidx.emoji2.text.f$a */
    public static final class a extends b {

        /* JADX INFO: renamed from: b */
        public volatile C0897k f5994b;

        /* JADX INFO: renamed from: c */
        public volatile C0901o f5995c;

        public a(C0892f c0892f) {
            super(c0892f);
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.f$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final C0892f f5996a;

        public b(C0892f c0892f) {
            this.f5996a = c0892f;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.f$c */
    public static abstract class c {

        /* JADX INFO: renamed from: a */
        public final h f5997a;

        /* JADX INFO: renamed from: b */
        public int f5998b = 0;

        /* JADX INFO: renamed from: c */
        public final C0890d f5999c = new C0890d();

        public c(h hVar) {
            this.f5997a = hVar;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.f$d */
    public static class d implements j {
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.f$e */
    public interface e {
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.f$f */
    public static abstract class f {
        /* JADX INFO: renamed from: a */
        public void mo1047a() {
        }

        /* JADX INFO: renamed from: b */
        public void mo1048b() {
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.f$g */
    public static class g implements Runnable {

        /* JADX INFO: renamed from: a */
        public final ArrayList f6000a;

        /* JADX INFO: renamed from: b */
        public final int f6001b;

        public g(List list, int i10, Throwable th2) {
            if (list == null) {
                throw new NullPointerException("initCallbacks cannot be null");
            }
            this.f6000a = new ArrayList(list);
            this.f6001b = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f6000a;
            int size = arrayList.size();
            int i10 = 0;
            if (this.f6001b != 1) {
                while (i10 < size) {
                    ((f) arrayList.get(i10)).mo1047a();
                    i10++;
                }
            } else {
                while (i10 < size) {
                    ((f) arrayList.get(i10)).mo1048b();
                    i10++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.f$h */
    public interface h {
        /* JADX INFO: renamed from: a */
        void mo3513a(i iVar);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.f$i */
    public static abstract class i {
        /* JADX INFO: renamed from: a */
        public abstract void mo3517a(Throwable th2);

        /* JADX INFO: renamed from: b */
        public abstract void mo3518b(C0901o c0901o);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.f$j */
    public interface j {
    }

    public C0892f(EmojiCompatInitializer.C0884a c0884a) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f5985a = reentrantReadWriteLock;
        this.f5987c = 3;
        h hVar = c0884a.f5997a;
        this.f5990f = hVar;
        int i10 = c0884a.f5998b;
        this.f5992h = i10;
        this.f5993i = c0884a.f5999c;
        this.f5988d = new Handler(Looper.getMainLooper());
        this.f5986b = new C8448d();
        this.f5991g = new d();
        a aVar = new a(this);
        this.f5989e = aVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i10 == 0) {
            try {
                this.f5987c = 0;
            } catch (Throwable th2) {
                this.f5985a.writeLock().unlock();
                throw th2;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (m3521b() == 0) {
            try {
                hVar.mo3513a(new C0891e(aVar));
            } catch (Throwable th3) {
                m3523e(th3);
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: a */
    public static C0892f m3519a() {
        C0892f c0892f;
        synchronized (f5983j) {
            c0892f = f5984k;
            if (!(c0892f != null)) {
                throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
            }
        }
        return c0892f;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m3520c() {
        return f5984k != null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final int m3521b() {
        this.f5985a.readLock().lock();
        try {
            int i10 = this.f5987c;
            this.f5985a.readLock().unlock();
            return i10;
        } catch (Throwable th2) {
            this.f5985a.readLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: d */
    public final void m3522d() {
        if (!(this.f5992h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (m3521b() == 1) {
            return;
        }
        this.f5985a.writeLock().lock();
        try {
            if (this.f5987c == 0) {
                this.f5985a.writeLock().unlock();
                return;
            }
            this.f5987c = 0;
            this.f5985a.writeLock().unlock();
            a aVar = this.f5989e;
            C0892f c0892f = aVar.f5996a;
            try {
                c0892f.f5990f.mo3513a(new C0891e(aVar));
            } catch (Throwable th2) {
                c0892f.m3523e(th2);
            }
        } catch (Throwable th3) {
            this.f5985a.writeLock().unlock();
            throw th3;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public final void m3523e(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f5985a.writeLock().lock();
        try {
            this.f5987c = 2;
            arrayList.addAll(this.f5986b);
            this.f5986b.clear();
            this.f5985a.writeLock().unlock();
            this.f5988d.post(new g(arrayList, this.f5987c, th2));
        } catch (Throwable th3) {
            this.f5985a.writeLock().unlock();
            throw th3;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public final void m3524f() {
        ArrayList arrayList = new ArrayList();
        this.f5985a.writeLock().lock();
        try {
            this.f5987c = 1;
            arrayList.addAll(this.f5986b);
            this.f5986b.clear();
            this.f5985a.writeLock().unlock();
            this.f5988d.post(new g(arrayList, this.f5987c, null));
        } catch (Throwable th2) {
            this.f5985a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: g */
    public final CharSequence m3525g(int i10, int i11, CharSequence charSequence) {
        AbstractC0898l[] abstractC0898lArr;
        boolean z10 = true;
        if (!(m3521b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        C5212l.m11130A("start should be <= than end", i10 <= i11);
        C0905s c0905s = null;
        if (charSequence == null) {
            return null;
        }
        C5212l.m11130A("start should be < than charSequence length", i10 <= charSequence.length());
        if (i11 > charSequence.length()) {
            z10 = false;
        }
        C5212l.m11130A("end should be < than charSequence length", z10);
        if (charSequence.length() != 0 && i10 != i11) {
            C0897k c0897k = this.f5989e.f5994b;
            c0897k.getClass();
            boolean z11 = charSequence instanceof C0902p;
            if (z11) {
                ((C0902p) charSequence).m3545a();
            }
            if (z11) {
                c0905s = new C0905s((Spannable) charSequence);
            } else {
                try {
                    if (charSequence instanceof Spannable) {
                        c0905s = new C0905s((Spannable) charSequence);
                    } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i10 - 1, i11 + 1, AbstractC0898l.class) <= i11) {
                        c0905s = new C0905s(charSequence);
                    }
                } catch (Throwable th2) {
                    if (z11) {
                        ((C0902p) charSequence).m3546b();
                    }
                    throw th2;
                }
            }
            if (c0905s != null && (abstractC0898lArr = (AbstractC0898l[]) c0905s.getSpans(i10, i11, AbstractC0898l.class)) != null && abstractC0898lArr.length > 0) {
                for (AbstractC0898l abstractC0898l : abstractC0898lArr) {
                    int spanStart = c0905s.getSpanStart(abstractC0898l);
                    int spanEnd = c0905s.getSpanEnd(abstractC0898l);
                    if (spanStart != i11) {
                        c0905s.removeSpan(abstractC0898l);
                    }
                    i10 = Math.min(spanStart, i10);
                    i11 = Math.max(spanEnd, i11);
                }
            }
            int i12 = i10;
            int i13 = i11;
            if (i12 != i13 && i12 < charSequence.length()) {
                C0905s c0905s2 = (C0905s) c0897k.m3533c(charSequence, i12, i13, Integer.MAX_VALUE, false, new C0897k.a(c0905s, c0897k.f6008a));
                if (c0905s2 != null) {
                    Spannable spannable = c0905s2.f6052b;
                    if (z11) {
                        ((C0902p) charSequence).m3546b();
                    }
                    return spannable;
                }
                if (z11) {
                    ((C0902p) charSequence).m3546b();
                }
            } else if (z11) {
                ((C0902p) charSequence).m3546b();
            }
            return charSequence;
        }
        return charSequence;
    }

    /* JADX INFO: renamed from: h */
    public final CharSequence m3526h(CharSequence charSequence) {
        return m3525g(0, charSequence == null ? 0 : charSequence.length(), charSequence);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: i */
    public final void m3527i(f fVar) {
        if (fVar == null) {
            throw new NullPointerException("initCallback cannot be null");
        }
        this.f5985a.writeLock().lock();
        try {
            if (this.f5987c == 1 || this.f5987c == 2) {
                this.f5988d.post(new g(Arrays.asList(fVar), this.f5987c, null));
            } else {
                this.f5986b.add(fVar);
            }
            ReentrantReadWriteLock reentrantReadWriteLock = this.f5985a;
        } finally {
            this.f5985a.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m3528j(EditorInfo editorInfo) {
        boolean z10 = true;
        if (m3521b() != 1) {
            z10 = false;
        }
        if (z10) {
            if (editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            a aVar = this.f5989e;
            aVar.getClass();
            Bundle bundle = editorInfo.extras;
            C7476b c7476b = aVar.f5995c.f6036a;
            int iM14859a = c7476b.m14859a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iM14859a != 0 ? c7476b.f41325b.getInt(iM14859a + c7476b.f41324a) : 0);
            Bundle bundle2 = editorInfo.extras;
            aVar.f5996a.getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }
}
