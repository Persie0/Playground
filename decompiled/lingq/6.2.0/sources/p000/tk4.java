package p000;

import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class tk4 implements jx9 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f62441a = new AtomicReference();

    @Override // p000.jx9
    /* JADX INFO: renamed from: a */
    public final String mo14180a() {
        return "ko";
    }

    @Override // p000.jx9
    /* JADX INFO: renamed from: b */
    public final String mo14181b() {
        return true != mo14186g() ? "play-services-mlkit-text-recognition-korean" : "text-recognition-korean";
    }

    @Override // p000.jx9
    /* JADX INFO: renamed from: c */
    public final Executor mo14182c() {
        return null;
    }

    @Override // p000.jx9
    /* JADX INFO: renamed from: d */
    public final int mo14183d() {
        return 5;
    }

    @Override // p000.jx9
    /* JADX INFO: renamed from: e */
    public final String mo14184e() {
        return "taser_tflite_gocrkorean_and_latin_mbv2_aksara_layout_gcn_mobile";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tk4) {
            return x74.m24360q(null, null);
        }
        return false;
    }

    @Override // p000.jx9
    /* JADX INFO: renamed from: f */
    public final String mo14185f() {
        return "optional-module-text-korean";
    }

    @Override // p000.jx9
    /* JADX INFO: renamed from: g */
    public final boolean mo14186g() {
        return b7d.m3414e(this.f62441a, "com.google.mlkit.dynamite.text.korean");
    }

    @Override // p000.jx9
    /* JADX INFO: renamed from: h */
    public final int mo14187h() {
        return mo14186g() ? 24319 : 24333;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null});
    }

    @Override // p000.jx9
    /* JADX INFO: renamed from: i */
    public final String mo14188i() {
        return true != mo14186g() ? "com.google.android.gms.mlkit_ocr_korean" : "com.google.mlkit.dynamite.text.korean";
    }
}
