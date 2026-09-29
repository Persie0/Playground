package p000;

import com.lingq.feature.library.preview.TranscriptionGateState;

/* JADX INFO: loaded from: classes3.dex */
public final class f9a {

    /* JADX INFO: renamed from: a */
    public final TranscriptionGateState f38690a;

    /* JADX INFO: renamed from: b */
    public final int f38691b;

    /* JADX INFO: renamed from: c */
    public final int f38692c;

    /* JADX INFO: renamed from: d */
    public final int f38693d;

    /* JADX INFO: renamed from: e */
    public final boolean f38694e;

    public f9a(TranscriptionGateState transcriptionGateState, int i, int i2, int i3) {
        transcriptionGateState.getClass();
        this.f38690a = transcriptionGateState;
        this.f38691b = i;
        this.f38692c = i2;
        this.f38693d = i3;
        this.f38694e = transcriptionGateState != TranscriptionGateState.AVAILABLE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9a)) {
            return false;
        }
        f9a f9aVar = (f9a) obj;
        return this.f38690a == f9aVar.f38690a && this.f38691b == f9aVar.f38691b && this.f38692c == f9aVar.f38692c && this.f38693d == f9aVar.f38693d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f38693d) + wq1.m24106b(this.f38692c, wq1.m24106b(this.f38691b, this.f38690a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "TranscriptionGate(state=" + this.f38690a + ", requiredMinutes=" + this.f38691b + ", balanceMinutes=" + this.f38692c + ", limitMinutes=" + this.f38693d + ")";
    }
}
