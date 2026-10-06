package p000;

import android.os.Trace;
import com.google.android.apps.camera.async.p005tt.CpuSets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eon implements kba {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f14887a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f14888b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f14889c;

    public /* synthetic */ eon(int i, jay jayVar, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f14889c = i2;
        this.f14887a = i;
        this.f14888b = jayVar;
    }

    public /* synthetic */ eon(eoq eoqVar, int i, int i2) {
        this.f14889c = i2;
        this.f14888b = eoqVar;
        this.f14887a = i;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        switch (this.f14889c) {
            case 0:
                ((eoq) this.f14888b).m7600g(this.f14887a);
                break;
            default:
                int i = this.f14887a;
                jay jayVar = (jay) this.f14888b;
                lku.m15657k(jayVar.f33635a != 0);
                long j = jayVar.f33635a;
                jayVar.f33635a = 0L;
                CpuSets.nativeRestoreCpuSet(i, j);
                Trace.endSection();
                break;
        }
    }
}
