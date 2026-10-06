package p000;

import android.os.Trace;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kbw implements kbz {

    /* JADX INFO: renamed from: a */
    private static final AtomicInteger f35546a = new AtomicInteger();

    /* JADX INFO: renamed from: b */
    private final String f35547b = "";

    /* JADX INFO: renamed from: j */
    private static boolean m13956j() {
        return Trace.isEnabled();
    }

    @Override // p000.kbz
    /* JADX INFO: renamed from: a */
    public final kcc mo13957a(String str) {
        return new kbu(f35546a.incrementAndGet(), str);
    }

    @Override // p000.kbz
    /* JADX INFO: renamed from: b */
    public final kce mo13958b(String str) {
        return new kbv(str);
    }

    @Override // p000.kbz
    /* JADX INFO: renamed from: c */
    public final Runnable mo13959c(String str, Runnable runnable) {
        return !m13956j() ? runnable : new kha(this, str, runnable, 1);
    }

    @Override // p000.kbz
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void mo13960d(String str, Runnable runnable) {
        kfv.m14166C(this, str, runnable);
    }

    @Override // p000.kbz
    /* JADX INFO: renamed from: e */
    public final void mo13961e(String str) {
        lku.m15614I(!str.isEmpty(), "Empty sectionName.");
        Trace.beginSection(this.f35547b.concat(String.valueOf(str)));
    }

    @Override // p000.kbz
    /* JADX INFO: renamed from: f */
    public final void mo13962f() {
        Trace.endSection();
    }

    @Override // p000.kbz
    /* JADX INFO: renamed from: g */
    public final void mo13963g(String str) {
        Trace.endSection();
        mo13961e(str);
    }

    @Override // p000.kbz
    /* JADX INFO: renamed from: h */
    public final void mo13964h() {
    }

    @Override // p000.kbz
    /* JADX INFO: renamed from: i */
    public final Callable mo13965i(Callable callable) {
        return !m13956j() ? callable : new cpb(this, callable, 10);
    }
}
