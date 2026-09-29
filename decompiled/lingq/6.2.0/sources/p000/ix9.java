package p000;

import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class ix9 implements jx9 {

    /* JADX INFO: renamed from: c */
    public static final ix9 f44745c = new ix9();

    /* JADX INFO: renamed from: a */
    public final AtomicReference f44746a = new AtomicReference();

    /* JADX INFO: renamed from: b */
    public final String f44747b = "taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile";

    @Override // p000.jx9
    /* JADX INFO: renamed from: a */
    public final String mo14180a() {
        return "en";
    }

    @Override // p000.jx9
    /* JADX INFO: renamed from: b */
    public final String mo14181b() {
        return true != mo14186g() ? "play-services-mlkit-text-recognition" : "text-recognition";
    }

    @Override // p000.jx9
    /* JADX INFO: renamed from: c */
    public final Executor mo14182c() {
        return null;
    }

    @Override // p000.jx9
    /* JADX INFO: renamed from: d */
    public final int mo14183d() {
        return 1;
    }

    @Override // p000.jx9
    /* JADX INFO: renamed from: e */
    public final String mo14184e() {
        return this.f44747b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ix9) {
            return x74.m24360q(null, null);
        }
        return false;
    }

    @Override // p000.jx9
    /* JADX INFO: renamed from: f */
    public final String mo14185f() {
        return "optional-module-text-latin";
    }

    @Override // p000.jx9
    /* JADX INFO: renamed from: g */
    public final boolean mo14186g() {
        return b7d.m3414e(this.f44746a, "com.google.mlkit.dynamite.text.latin");
    }

    @Override // p000.jx9
    /* JADX INFO: renamed from: h */
    public final int mo14187h() {
        return mo14186g() ? 24317 : 24306;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null});
    }

    @Override // p000.jx9
    /* JADX INFO: renamed from: i */
    public final String mo14188i() {
        return true != mo14186g() ? "com.google.android.gms.vision.ocr" : "com.google.mlkit.dynamite.text.latin";
    }
}
