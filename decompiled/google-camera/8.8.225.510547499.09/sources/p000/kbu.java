package p000;

import android.os.Trace;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class kbu implements kcc {

    /* JADX INFO: renamed from: a */
    private final int f35542a;

    /* JADX INFO: renamed from: c */
    private final String f35543c;

    public kbu(int i, String str) {
        lku.m15614I(!str.isEmpty(), "Empty msg.");
        this.f35542a = i;
        this.f35543c = str;
        Trace.beginAsyncSection(str, i);
    }

    @Override // p000.kcc
    /* JADX INFO: renamed from: a */
    public final void mo13952a() {
        Trace.endAsyncSection(this.f35543c, this.f35542a);
    }
}
