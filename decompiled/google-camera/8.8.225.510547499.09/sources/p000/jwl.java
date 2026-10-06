package p000;

import android.content.IntentFilter;
import android.support.v7.widget.RecyclerView;
import android.widget.VideoView;
import androidx.wear.ambient.AmbientMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jwl {

    /* JADX INFO: renamed from: a */
    public boolean f34954a;

    /* JADX INFO: renamed from: b */
    public final Object f34955b;

    /* JADX INFO: renamed from: c */
    public final Object f34956c;

    /* JADX INFO: renamed from: d */
    public final Object f34957d;

    public jwl() {
        this(new kbx());
    }

    public jwl(int i) {
        this.f34956c = new long[i];
        this.f34955b = new boolean[i];
        this.f34957d = new int[i];
    }

    public jwl(RecyclerView recyclerView) {
        this.f34957d = new ith(this, 8, null);
        this.f34956c = recyclerView;
        this.f34955b = new C0789lb();
    }

    public jwl(AmbientMode.AmbientController ambientController, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f34957d = ambientController;
        IntentFilter intentFilter = new IntentFilter();
        this.f34955b = intentFilter;
        intentFilter.addAction("android.intent.action.TIME_TICK");
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        this.f34956c = new iyy(this, null);
    }

    public jwl(cbc cbcVar, byw bywVar) {
        this.f34957d = new bzl(this, null, null);
        this.f34955b = cbcVar;
        this.f34956c = bywVar;
    }

    public jwl(hmr hmrVar, dhv dhvVar, Executor executor) {
        this.f34954a = true;
        this.f34955b = hmrVar;
        this.f34957d = dhvVar;
        this.f34956c = executor;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX INFO: renamed from: a */
    public final List m13625a() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList((Collection) this.f34956c);
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: b */
    public final void m13626b(gyq gyqVar) {
        boolean zM13628d;
        synchronized (this) {
            this.f34956c.add(gyqVar);
            zM13628d = m13628d();
        }
        if (zM13628d) {
            m13627c();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: c */
    public final void m13627c() {
        ArrayList arrayList;
        this.f34957d.mo13961e("#notifyPipelineFinished");
        synchronized (this) {
            arrayList = new ArrayList((Collection) this.f34956c);
            this.f34956c.clear();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((gyq) arrayList.get(i)).mo9546a();
        }
        this.f34957d.mo13962f();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m13628d() {
        return this.f34954a && ((HashSet) this.f34955b).isEmpty();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX INFO: renamed from: e */
    public final void m13629e() {
        byte[] bArr = null;
        jvh.m13562j(((hmr) this.f34955b).m10468a(), new cis(this, 16, bArr, bArr), this.f34956c);
    }

    /* JADX INFO: renamed from: f */
    public final synchronized boolean m13630f() {
        return this.f34954a;
    }

    public jwl(kbz kbzVar) {
        this.f34955b = new HashSet();
        this.f34954a = false;
        this.f34956c = new ArrayList();
        this.f34957d = kbzVar;
    }

    public jwl(ioz iozVar) {
        iozVar.getClass();
        this.f34956c = iozVar;
        VideoView videoView = ((ipb) iozVar).f31677f;
        videoView.getClass();
        this.f34955b = videoView;
        this.f34954a = false;
        this.f34957d = new idd(this, 16, null, null);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    public jwl(jwm jwmVar, kbg kbgVar, Executor executor) {
        this.f34956c = kbgVar;
        this.f34957d = executor;
        this.f34955b = new ArrayList();
        for (int i = 0; i < jwmVar.f34958a.size(); i++) {
            this.f34955b.add(null);
        }
        this.f34954a = false;
    }
}
