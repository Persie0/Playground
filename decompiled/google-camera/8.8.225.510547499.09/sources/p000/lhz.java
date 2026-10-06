package p000;

import android.app.Application;
import android.content.ContentValues;
import android.content.Context;
import android.util.ArrayMap;
import com.google.android.apps.camera.legacy.app.activity.main.kuX.PMZiHihxLGEy;
import com.google.p020vr.vrcore.controller.api.DJK.rmwTRjObXLGH;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p021j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lhz {

    /* JADX INFO: renamed from: a */
    public final Object f38277a;

    public lhz(ContentValues contentValues) {
        this.f38277a = contentValues;
    }

    public lhz(Context context) {
        this.f38277a = context.getPackageName();
    }

    public lhz(ArrayMap arrayMap) {
        this.f38277a = arrayMap;
    }

    public lhz(Iterable iterable) {
        this.f38277a = iterable;
    }

    public lhz(kqv kqvVar) {
        this.f38277a = kqvVar;
    }

    public lhz(lia liaVar) {
        this.f38277a = liaVar;
    }

    public lhz(ltn ltnVar) {
        this.f38277a = ltnVar;
    }

    public lhz(mrm mrmVar) {
        this.f38277a = (kso) mrmVar.mo16812f();
    }

    private lhz(nps npsVar) {
        this.f38277a = npsVar;
    }

    public lhz(byte[] bArr) {
        this.f38277a = lpw.m15847b();
    }

    /* JADX INFO: renamed from: l */
    public static lhz m15359l(nps npsVar) {
        return new lhz(npsVar);
    }

    /* JADX INFO: renamed from: a */
    public final void m15360a(lhy lhyVar) {
        Object obj = this.f38277a;
        lhyVar.getClass();
        Object obj2 = ((lhz) obj).f38277a;
        int i = lia.f38278c;
        ((lia) obj2).f38279a.add(lhyVar);
    }

    /* JADX INFO: renamed from: b */
    public final void m15361b(lhy lhyVar) {
        Object obj = this.f38277a;
        lhyVar.getClass();
        Object obj2 = ((lhz) obj).f38277a;
        int i = lia.f38278c;
        ((lia) obj2).f38279a.remove(lhyVar);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m15362c() {
        if (mxk.m17141M("com.android.vending", "com.google.android.GoogleCamera", "com.google.android.GoogleCameraEng", "com.google.android.apps.docs", "com.google.android.apps.docs.editors.docs", "com.google.android.apps.docs.editors.sheets", "com.google.android.apps.docs.editors.slides", "com.google.android.apps.geo.food.omniapp.nomni", "com.google.android.apps.gmail.testing.unit", "com.google.android.apps.gmm", "com.google.android.apps.gmm.ads.label.testing.app", "com.google.android.apps.gmm.search.map.testing.app", "com.google.android.apps.googlecamera.fishfood", "com.google.android.apps.jamkiosk", rmwTRjObXLGH.CirMGD, "com.google.android.apps.streetview.collector", "com.google.android.apps.tasks", "com.google.android.apps.tasks.ui.scuba", "com.google.android.apps.work.clouddpc", "com.google.android.apps.work.clouddpc.arc", "com.google.android.apps.youtube.creator", "com.google.android.apps.youtube.kids", "com.google.android.apps.youtube.mango", "com.google.android.apps.youtube.music", "com.google.android.apps.youtube.unplugged", "com.google.android.apps.youtube.vr", "com.google.android.apps.youtube.vr.oculus", "com.google.android.gms", PMZiHihxLGEy.msF, "com.google.android.inputmethod.latin", "com.google.android.inputmethod.latin.canary", "com.google.android.inputmethod.latin.dev", "com.google.android.play.games", "com.google.android.youtube", "com.google.android.youtube.test", "com.google.android.youtube.tv", "com.google.android.youtube.tvkids", "com.google.android.youtube.tvunplugged", "com.google.intelligence.sense.ambientmusic.functional.emulator", "com.google.intelligence.sense.ambientmusic.history.functional").contains(this.f38277a)) {
            return true;
        }
        return mxk.m17141M("com.google.android.apps.accessibility.reveal", "com.google.android.apps.adwords", "com.google.android.apps.adwords.devel", "com.google.android.apps.adwords.dogfood", "com.google.android.apps.adwords.fishfood", "com.google.android.apps.adwords.nightly", "com.google.android.apps.diagnosticstool", "com.google.android.apps.dragonfly", "com.google.android.apps.dynamite", "com.google.android.apps.gmm.home.cards.yourexplore", "com.google.android.apps.internal.admobsdk.mediumtest.stability", "com.google.android.apps.nbu.paisa.user.integration.home", "com.google.android.apps.nbu.paisa.user.integration.homescreen", "com.google.android.apps.nbu.paisa.user.integration.microapp", "com.google.android.apps.nbu.paisa.user.integration.qrcode", "com.google.android.apps.searchlite.homescreen", "com.google.android.flutter.testing.integrationtest.skeleton", "com.google.android.libraries.performance.primes.sample.profiling.application", "com.google.android.marvin.talkback", "com.google.android.street").contains(this.f38277a);
    }

    /* JADX INFO: renamed from: d */
    public final lsc m15363d() {
        return new lsc(this, null, null);
    }

    /* JADX INFO: renamed from: e */
    public final int m15364e() {
        return ((AtomicInteger) this.f38277a).get();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX INFO: renamed from: f */
    public final laa m15365f() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f38277a.iterator();
        while (it.hasNext()) {
            arrayList.add(((kyx) it.next()).mo15079a());
        }
        return laa.m15115k(lqi.m15865j(arrayList));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: g */
    public final synchronized List m15366g() {
        return Collections.unmodifiableList(this.f38277a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: h */
    public final synchronized void m15367h(kyv kyvVar) {
        this.f38277a.add(kyvVar);
    }

    /* JADX INFO: renamed from: i */
    public final krp m15368i() {
        return new krp(new ContentValues((ContentValues) this.f38277a));
    }

    /* JADX INFO: renamed from: j */
    public final void m15369j(String str, int i) {
        ((ContentValues) this.f38277a).put(str, (Integer) 0);
    }

    /* JADX INFO: renamed from: k */
    public final void m15370k(String str, String str2) {
        ((ContentValues) this.f38277a).put(str, str2);
    }

    public lhz() {
        this.f38277a = new AtomicInteger();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.content.ComponentCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.app.Application$ActivityLifecycleCallbacks, java.lang.Object] */
    public lhz(Context context, lhz lhzVar, byte[] bArr) {
        this.f38277a = lhzVar;
        Application application = (Application) context;
        application.registerActivityLifecycleCallbacks(lhzVar.f38277a);
        application.registerComponentCallbacks(lhzVar.f38277a);
    }

    public lhz(Context context, char[] cArr) {
        this.f38277a = context.getApplicationContext();
    }

    public lhz(Context context, byte[] bArr) {
        new ConcurrentHashMap();
        lij.m15448r(context != null, "Context cannot be null", new Object[0]);
        this.f38277a = context.getApplicationContext();
    }

    public lhz(char[] cArr) {
        this.f38277a = new ArrayList();
    }
}
